/**
 * Copyright (c) 2012 - 2023 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.geojson.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emfcloud.jackson.annotations.EcoreTypeInfo;
import org.eclipse.emfcloud.jackson.resource.JsonResource;
import org.gecko.emf.json.annotation.RequireEMFJson;
import org.gecko.emf.json.constants.EMFJs;
import org.geojson.BoundingBox;
import org.geojson.Coordinates;
import org.geojson.Feature;
import org.geojson.Hole;
import org.geojson.LineString;
import org.geojson.MultiLineString;
import org.geojson.MultiPoint;
import org.geojson.Point;
import org.geojson.Polygon;
import org.geojson.Ring;
import org.geojson.impl.BoundingBoxImpl;
import org.geojson.impl.CoordinatesImpl;
import org.geojson.impl.FeatureImpl;
import org.geojson.impl.HoleImpl;
import org.geojson.impl.LineStringImpl;
import org.geojson.impl.MultiLineStringImpl;
import org.geojson.impl.MultiPointImpl;
import org.geojson.impl.PointImpl;
import org.geojson.impl.PolygonImpl;
import org.geojson.impl.RingImpl;
import org.geojson.util.GeoJsonHelper;
import org.geojson.util.GeoJsonResourceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;

/**
 * See documentation here: 
 * 	https://github.com/osgi/osgi-test
 * 	https://github.com/osgi/osgi-test/wiki
 * Examples: https://github.com/osgi/osgi-test/tree/main/examples
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@RequireEMFJson
public class GeoJsonTest {
	
	private Coordinates createCoordinate(double latitude, double longitude) {
		return createCoordinate(latitude, longitude, Double.NaN);
	}
	private Coordinates createCoordinate(double latitude, double longitude, double elevation) {
		Coordinates coords = new CoordinatesImpl();
		coords.setLatitude(latitude);
		coords.setLongitude(longitude);
		if(Double.isNaN(elevation)) {
			coords.setElevation(120);
		}
		return coords;
	}
	
	@Test
	public void testRing() throws IOException {
		System.err.println("Running Test Point");
		
		Coordinates coords = new CoordinatesImpl();
		coords.setLatitude(12);
		coords.setLongitude(52);
		coords.setElevation(120);
		
		Ring ring = new RingImpl();
		
		ring.getCoordinates().add(createCoordinate(1, 1));
		ring.getCoordinates().add(createCoordinate(2, 2));
		ring.getCoordinates().add(createCoordinate(3, 3));
		ring.getCoordinates().add(createCoordinate(4, 4));
		ring.getCoordinates().add(createCoordinate(5, 2));
		ring.getCoordinates().add(createCoordinate(6, 6));
		
		assertFalse(GeoJsonHelper.checkRingClosed(ring));
		
		ring.getCoordinates().add(createCoordinate(1, 1));
		
		assertTrue(GeoJsonHelper.checkRingClosed(ring));
	}

	@Test
	public void testRingAutoclose() throws IOException {
		System.err.println("Running Test Point");
		
		Coordinates coords = new CoordinatesImpl();
		coords.setLatitude(12);
		coords.setLongitude(52);
		coords.setElevation(120);
		
		Ring ring = new RingImpl();
		
		ring.getCoordinates().add(createCoordinate(1, 1));
		ring.getCoordinates().add(createCoordinate(2, 2));
		ring.getCoordinates().add(createCoordinate(3, 3));
		ring.getCoordinates().add(createCoordinate(4, 4));
		ring.getCoordinates().add(createCoordinate(5, 2));
		ring.getCoordinates().add(createCoordinate(6, 6));
		
		assertFalse(GeoJsonHelper.checkRingClosed(ring));
		
		ring.getCoordinates().add(createCoordinate(1, 1));
		
		assertTrue(GeoJsonHelper.checkRingClosed(ring));
	}

	@Test
	public void point(@InjectService ResourceSet set) throws IOException {
		System.err.println("Running Test Point");
		
		Point point = new PointImpl();
		Coordinates coords = new CoordinatesImpl();
		coords.setLatitude(12);
		coords.setLongitude(52);
		coords.setElevation(120);
		
		point.setCoordinates(coords);
		
		JsonResource resource = (JsonResource) set.createResource(URI.createURI("test.json"));
		resource.getContents().add(point);
		Map<String, Object> map = new HashMap<>();
		map.put(EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, true);
		map.put(EMFJs.OPTION_TYPE_FIELD, "type");
		map.put(EMFJs.OPTION_TYPE_USE, EcoreTypeInfo.USE.NAME);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		resource.save(baos, map);
		
		System.out.println(new String(baos.toByteArray()));
		
		
		String test = "\t\t{\n\"type\" : \"Point\",\n\"coordinates\" : [ 52.0, 12.0, 120.0 ]\n\t\t}\n";
		
		System.err.println("Trying to load Point");
		
		JsonResource loadResource = (JsonResource) set.createResource(URI.createURI("test2.json"));
		loadResource.load(new ByteArrayInputStream(test.getBytes()), map);
		
		System.err.println(loadResource.getContents().isEmpty());
		assertFalse(loadResource.getContents().isEmpty());
		Point result = (Point) loadResource.getContents().get(0);
		System.err.println(result.getCoordinates());
	}

	@Test
	public void pointWithBoundingBox(@InjectService ResourceSet set) throws IOException {
		System.err.println("Running Test Point with BoundingBox");
		
		Point point = new PointImpl();
		Coordinates coords = new CoordinatesImpl();
		coords.setLatitude(12);
		coords.setLongitude(52);
		coords.setElevation(120);
		
		point.setCoordinates(coords);
		point.setBoundingBox(new BoundingBoxImpl());
		point.getBoundingBox().setNortheast(coords);
		point.getBoundingBox().setSouthwest(EcoreUtil.copy(coords));
		
		JsonResource resource = (JsonResource) set.createResource(URI.createURI("test.json"));
		resource.getContents().add(point);
		Map<String, Object> map = new HashMap<>();
		map.put(EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, true);
		map.put(EMFJs.OPTION_TYPE_FIELD, "type");
		map.put(EMFJs.OPTION_TYPE_USE, EcoreTypeInfo.USE.NAME);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		resource.save(baos, map);
		
		System.out.println(new String(baos.toByteArray()));
		
		
		String test = "\t\t{\n\"type\" : \"Point\",\n\"bbox\" : [ 52.0, 12.0, 120.0, 52.0, 12.0, 120.0 ],\n\"coordinates\" : [ 52.0, 12.0, 120.0 ]\n\t\t}\n";
		
		System.err.println("Trying to load Point with BoundingBox");
		
		JsonResource loadResource = (JsonResource) set.createResource(URI.createURI("test2.json"));
		loadResource.load(new ByteArrayInputStream(test.getBytes()), map);
		
		System.err.println(loadResource.getContents().isEmpty());
		assertFalse(loadResource.getContents().isEmpty());
		assertFalse(loadResource.getContents().isEmpty());
		Point result = (Point) loadResource.getContents().get(0);
		System.err.println(result.getCoordinates());
		assertThat(result.getBoundingBox()).isNotNull();
		assertThat(result.getBoundingBox().getNortheast()).isNotNull();
		assertThat(result.getBoundingBox().getSouthwest()).isNotNull();
	}

	@Test
	public void lineString(@InjectService ResourceSet set) throws IOException {
		System.err.println("Running Test");
		
		LineString point = new LineStringImpl();
		Coordinates coords = new CoordinatesImpl();
		coords.setLatitude(12);
		coords.setLongitude(52);
		coords.setElevation(120);
		
		point.getCoordinates().add(coords);
		point.getCoordinates().add(EcoreUtil.copy(coords));
		
		JsonResource resource = (JsonResource) set.createResource(URI.createURI("test.json"));
		resource.getContents().add(point);
		Map<String, Object> map = new HashMap<>();
		map.put(EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, true);
		map.put(EMFJs.OPTION_TYPE_FIELD, "type");
		map.put(EMFJs.OPTION_TYPE_USE, EcoreTypeInfo.USE.NAME);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		resource.save(baos, map);

		System.out.println(new String(baos.toByteArray()));
		
		
		String test = "\t\t\t\t{\n  \"type\" : \"LineString\",\n  \"coordinates\" : [ [ 52.0, 12.0, 120.0 ], [ 52.0, 12.0, 120.0 ] ]\n}\n";
		
		System.err.println("Trying to load LineString");
		
		JsonResource loadResource = (JsonResource) set.createResource(URI.createURI("test2.json"));
		loadResource.load(new ByteArrayInputStream(test.getBytes()), map);
		
		System.err.println(loadResource.getContents().isEmpty());
		assertFalse(loadResource.getContents().isEmpty());
		LineString result = (LineString) loadResource.getContents().get(0);
		result.getCoordinates().forEach(System.err::println);;
	}

	@Test
	public void multiLineString(@InjectService ResourceSet set) throws IOException {
		System.err.println("Running Test MultiLineString");
		
		LineString line = new LineStringImpl();
		Coordinates coords = new CoordinatesImpl();
		coords.setLatitude(12);
		coords.setLongitude(52);
		coords.setElevation(120);
		
		line.getCoordinates().add(createCoordinate(12, 52, 120));
		line.getCoordinates().add(createCoordinate(11, 53, 123));
		
		MultiLineString multiLineString = new MultiLineStringImpl();
		
		multiLineString.getLinesStrings().add(line);
		multiLineString.getLinesStrings().add(EcoreUtil.copy(line));
		
		JsonResource resource = (JsonResource) set.createResource(URI.createURI("test.json"));
		resource.getContents().add(multiLineString);
		Map<String, Object> map = new HashMap<>();
		map.put(EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, true);
		map.put(EMFJs.OPTION_TYPE_FIELD, "type");
		map.put(EMFJs.OPTION_TYPE_USE, EcoreTypeInfo.USE.NAME);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		resource.save(baos, map);
		
		System.out.println(new String(baos.toByteArray()));
		
		
		
		System.err.println("Trying to load MultiLineString");
		
		JsonResource loadResource = (JsonResource) set.createResource(URI.createURI("test2.json"));
		loadResource.load(new ByteArrayInputStream(baos.toByteArray()), map);
		
		System.err.println(loadResource.getContents().isEmpty());
		assertFalse(loadResource.getContents().isEmpty());
		MultiLineString result = (MultiLineString) loadResource.getContents().get(0);
		
		assertThat(result.getLinesStrings()).hasSameSizeAs(multiLineString.getLinesStrings());
		
	}

	@Test
	public void multiPointString(@InjectService ResourceSet set) throws IOException {
		System.err.println("Running Test");
		
		MultiPoint point = new MultiPointImpl();
		Coordinates coords = new CoordinatesImpl();
		coords.setLatitude(12);
		coords.setLongitude(52);
		coords.setElevation(120);
		
		point.getCoordinates().add(coords);
		point.getCoordinates().add(EcoreUtil.copy(coords));
		
		JsonResource resource = (JsonResource) set.createResource(URI.createURI("test.json"));
		resource.getContents().add(point);
		Map<String, Object> map = new HashMap<>();
		map.put(EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, true);
		map.put(EMFJs.OPTION_TYPE_FIELD, "type");
		map.put(EMFJs.OPTION_TYPE_USE, EcoreTypeInfo.USE.NAME);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		resource.save(baos, map);
		
		System.out.println(new String(baos.toByteArray()));
		
		
		String test = "\t\t{\n\"type\" : \"MultiPoint\",\n\"coordinates\" : [ [ 52.0, 12.0, 120.0 ], [ 52.0, 12.0, 120.0 ] ]\n\t\t}\n";
		
		System.err.println("Trying to load MultiPoint");
		
		JsonResource loadResource = (JsonResource) set.createResource(URI.createURI("test2.json"));
		loadResource.load(new ByteArrayInputStream(test.getBytes()), map);
		
		System.err.println(loadResource.getContents().isEmpty());
		assertFalse(loadResource.getContents().isEmpty());
		MultiPoint result = (MultiPoint) loadResource.getContents().get(0);
		result.getCoordinates().forEach(System.err::println);;
	}

	@Test
	public void feature(@InjectService ResourceSet set) throws IOException {
		System.err.println("Running Feature Test");
		
		Feature feature = new FeatureImpl();
		Coordinates coords = new CoordinatesImpl();
		coords.setLatitude(12);
		coords.setLongitude(52);
		coords.setElevation(120);
		
		BoundingBox bbox = new BoundingBoxImpl();
		bbox.setSouthwest(EcoreUtil.copy(coords));
		bbox.setNortheast(EcoreUtil.copy(coords));
		feature.setBoundingBox(bbox);
		
		feature.setProperties(EcoreUtil.copy(coords));		
		
		JsonResource resource = (JsonResource) set.createResource(URI.createURI("test.json"));
		resource.getContents().add(feature);
		Map<String, Object> map = new HashMap<>();
		map.put(EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, true);
		map.put(EMFJs.OPTION_TYPE_FIELD, "type");
		map.put(EMFJs.OPTION_TYPE_USE, EcoreTypeInfo.USE.NAME);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		resource.save(baos, map);
		
		System.out.println(new String(baos.toByteArray()));
		
		
		String test = "\t\t{\n\"type\" : \"Feature\",\n\"bbox\" : [ 52.0, 12.0, 120.0 , 52.0, 12.0, 120.0 ]\n\t\t}\n";
		
		System.err.println("Trying to load Feature");
		
		JsonResource loadResource = (JsonResource) set.createResource(URI.createURI("test2.json"));
		loadResource.load(new ByteArrayInputStream(test.getBytes()), map);
		
		System.err.println(loadResource.getContents().isEmpty());
		assertFalse(loadResource.getContents().isEmpty());
		Feature result = (Feature) loadResource.getContents().get(0);
		assertThat(result.getBoundingBox()).isNotNull();
		assertThat(feature.getProperties()).isInstanceOf(Coordinates.class);
		
	}
	
	@Test
	public void testDBPolygone(@InjectService ResourceSet set) throws IOException {
		String test = "\t\t\t\t{\n\t\"type\": \"Polygon\",\n\t\"bbox\": [\n\t\t11.504092,\n\t\t50.895368,\n\t\t11.566935,\n\t\t50.913474\n\t],\n\t\"coordinates\": [\n\t\t[\n\t\t\t[\n\t\t\t\t11.554532,\n\t\t\t\t50.90168\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.554127,\n\t\t\t\t50.901214\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.554528,\n\t\t\t\t50.900991\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.554196,\n\t\t\t\t50.900806\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.553101,\n\t\t\t\t50.899564\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.552797,\n\t\t\t\t50.898849\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.552712,\n\t\t\t\t50.896565\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.552282,\n\t\t\t\t50.896421\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.551836,\n\t\t\t\t50.896126\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.551464,\n\t\t\t\t50.896398\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.550654,\n\t\t\t\t50.895844\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.550172,\n\t\t\t\t50.89619\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.550001,\n\t\t\t\t50.89586\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.549749,\n\t\t\t\t50.895793\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.548798,\n\t\t\t\t50.896242\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.548026,\n\t\t\t\t50.896414\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.547431,\n\t\t\t\t50.89628\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.544954,\n\t\t\t\t50.895368\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.542608,\n\t\t\t\t50.895993\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.541526,\n\t\t\t\t50.895805\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.540404,\n\t\t\t\t50.89597\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.540749,\n\t\t\t\t50.896473\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.540567,\n\t\t\t\t50.896535\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.54203,\n\t\t\t\t50.897826\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.54066,\n\t\t\t\t50.898225\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.540999,\n\t\t\t\t50.898748\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.541198,\n\t\t\t\t50.899531\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.54108,\n\t\t\t\t50.900253\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.541148,\n\t\t\t\t50.901313\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.540578,\n\t\t\t\t50.901684\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.53719,\n\t\t\t\t50.90164\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.535231,\n\t\t\t\t50.901289\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.530252,\n\t\t\t\t50.901846\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.529464,\n\t\t\t\t50.902023\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.526186,\n\t\t\t\t50.902341\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.522933,\n\t\t\t\t50.903903\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.523349,\n\t\t\t\t50.904504\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.522543,\n\t\t\t\t50.904434\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.522427,\n\t\t\t\t50.90488\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.521146,\n\t\t\t\t50.905783\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.51895,\n\t\t\t\t50.905191\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.517241,\n\t\t\t\t50.904858\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.513599,\n\t\t\t\t50.903797\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.51147,\n\t\t\t\t50.905539\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.511694,\n\t\t\t\t50.906269\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.510561,\n\t\t\t\t50.906379\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.510615,\n\t\t\t\t50.906564\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.50856,\n\t\t\t\t50.906702\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.507924,\n\t\t\t\t50.906704\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.507696,\n\t\t\t\t50.906601\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.506708,\n\t\t\t\t50.906938\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.505393,\n\t\t\t\t50.906239\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.504333,\n\t\t\t\t50.905819\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.504098,\n\t\t\t\t50.906495\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.504185,\n\t\t\t\t50.906948\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.504092,\n\t\t\t\t50.907269\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.504276,\n\t\t\t\t50.907497\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.505382,\n\t\t\t\t50.908132\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.505481,\n\t\t\t\t50.908525\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.50528,\n\t\t\t\t50.908865\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.507127,\n\t\t\t\t50.910712\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.507056,\n\t\t\t\t50.911474\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.507383,\n\t\t\t\t50.913114\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.508475,\n\t\t\t\t50.913437\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.50914,\n\t\t\t\t50.913474\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.509967,\n\t\t\t\t50.913332\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.511671,\n\t\t\t\t50.912817\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.513102,\n\t\t\t\t50.912643\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.513641,\n\t\t\t\t50.912461\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.516359,\n\t\t\t\t50.913023\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.518141,\n\t\t\t\t50.913258\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.519234,\n\t\t\t\t50.913261\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.523311,\n\t\t\t\t50.912463\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.526255,\n\t\t\t\t50.91212\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.526344,\n\t\t\t\t50.912095\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.525979,\n\t\t\t\t50.911704\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.52578,\n\t\t\t\t50.91163\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.525263,\n\t\t\t\t50.911087\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.524727,\n\t\t\t\t50.910095\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.52471,\n\t\t\t\t50.909722\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.526668,\n\t\t\t\t50.909192\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.528186,\n\t\t\t\t50.90914\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.528868,\n\t\t\t\t50.908662\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.530769,\n\t\t\t\t50.909893\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.532192,\n\t\t\t\t50.910479\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.536595,\n\t\t\t\t50.911412\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.538296,\n\t\t\t\t50.911976\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.539526,\n\t\t\t\t50.912041\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.542292,\n\t\t\t\t50.912972\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.549484,\n\t\t\t\t50.91145\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.556112,\n\t\t\t\t50.910784\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.557463,\n\t\t\t\t50.91089\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.560743,\n\t\t\t\t50.911368\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.56291,\n\t\t\t\t50.911518\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.564749,\n\t\t\t\t50.912197\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.56533,\n\t\t\t\t50.912274\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.565757,\n\t\t\t\t50.912226\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.566935,\n\t\t\t\t50.912521\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.566636,\n\t\t\t\t50.912208\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.565377,\n\t\t\t\t50.911506\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.564079,\n\t\t\t\t50.909826\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.562613,\n\t\t\t\t50.90921\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.563746,\n\t\t\t\t50.907839\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.563981,\n\t\t\t\t50.907932\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.564818,\n\t\t\t\t50.906646\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.563154,\n\t\t\t\t50.906306\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.564127,\n\t\t\t\t50.904987\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.563114,\n\t\t\t\t50.904886\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.563125,\n\t\t\t\t50.903904\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.563138,\n\t\t\t\t50.903743\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.563784,\n\t\t\t\t50.90367\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.56375,\n\t\t\t\t50.902355\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.564245,\n\t\t\t\t50.902265\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.564213,\n\t\t\t\t50.901758\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.56298,\n\t\t\t\t50.901862\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.561666,\n\t\t\t\t50.901597\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.559324,\n\t\t\t\t50.9015\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.558811,\n\t\t\t\t50.901636\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.557151,\n\t\t\t\t50.901813\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.556607,\n\t\t\t\t50.901962\n\t\t\t],\n\t\t\t[\n\t\t\t\t11.554532,\n\t\t\t\t50.90168\n\t\t\t]\n\t\t]\n\t]\n}\n";
//		Map<String, Object> map = new HashMap<>();
//		map.put(EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, true);
//		map.put(EMFJs.OPTION_TYPE_FIELD, "type");
//		map.put(EMFJs.OPTION_TYPE_USE, EcoreTypeInfo.USE.NAME);
		GeoJsonResourceImpl loadResource = (org.geojson.util.GeoJsonResourceImpl) set.createResource(URI.createURI("test2.geojson"));
		loadResource.load(new ByteArrayInputStream(test.getBytes()), null);
		
		System.err.println(loadResource.getContents().isEmpty());
		assertFalse(loadResource.getContents().isEmpty());
		Polygon result = (Polygon) loadResource.getContents().get(0);
		assertThat(result.getBoundingBox().getNortheast()).isNotNull();
		assertThat(result.getBoundingBox().getSouthwest()).isNotNull();
		
//		Resource resource = set.createResource(URI.createURI("test2.xmi"));
//		resource.getContents().add(result);
//		resource.save(System.err, null);#
	}
	
	@Test
	public void polygon(@InjectService ResourceSet set) throws IOException {
		System.err.println("Running Test Polygon");
		
		
		Polygon polygon = new PolygonImpl();
		Coordinates coords = new CoordinatesImpl();
		coords.setLatitude(12);
		coords.setLongitude(52);
		coords.setElevation(120);
		
		Ring ring = new RingImpl();
		
		ring.getCoordinates().add(createCoordinate(1, 1));
		ring.getCoordinates().add(createCoordinate(2, 2));
		ring.getCoordinates().add(createCoordinate(3, 3));
		ring.getCoordinates().add(createCoordinate(4, 4));
		ring.getCoordinates().add(createCoordinate(5, 2));
		ring.getCoordinates().add(createCoordinate(6, 6));

		Hole hole = new HoleImpl();
		
		hole.getCoordinates().add(createCoordinate(1, 1));
		hole.getCoordinates().add(createCoordinate(2, 2));
		hole.getCoordinates().add(createCoordinate(3, 3));
		hole.getCoordinates().add(createCoordinate(4, 4));
		hole.getCoordinates().add(createCoordinate(5, 2));
		hole.getCoordinates().add(createCoordinate(6, 6));
		
		polygon.setExteriorRing(ring);
		polygon.getInteriorHoles().add(hole);
		polygon.getInteriorHoles().add(EcoreUtil.copy(hole));
	
		BoundingBox bbox = new BoundingBoxImpl();
		bbox.setSouthwest(EcoreUtil.copy(coords));
		bbox.setNortheast(EcoreUtil.copy(coords));
		polygon.setBoundingBox(bbox);
		
		JsonResource resource = (JsonResource) set.createResource(URI.createURI("test.json"));
		resource.getContents().add(polygon);
		Map<String, Object> map = new HashMap<>();
		map.put(EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, true);
		map.put(EMFJs.OPTION_TYPE_FIELD, "type");
		map.put(EMFJs.OPTION_TYPE_USE, EcoreTypeInfo.USE.NAME);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		resource.save(baos, map);

		System.out.println(new String(baos.toByteArray()));
		
		System.err.println("Trying to load Polygon");
		
		JsonResource loadResource = (JsonResource) set.createResource(URI.createURI("test2.json"));
		loadResource.load(new ByteArrayInputStream(baos.toByteArray()), map);
		
		System.err.println(loadResource.getContents().isEmpty());
		assertFalse(loadResource.getContents().isEmpty());
		Polygon result = (Polygon) loadResource.getContents().get(0);
		baos = new ByteArrayOutputStream();
		loadResource.save(baos, map);
		System.out.println(new String(baos.toByteArray()));
		
		assertThat(result.getBoundingBox()).isNotNull();
		assertThat(result.getExteriorRing()).isNotNull();
		assertThat(result.getExteriorRing().getCoordinates()).hasSize(polygon.getExteriorRing().getCoordinates().size() + 1);
		assertThat(result.getInteriorHoles()).hasSize(2);
		
	}

}
