/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package org.geojson.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emfcloud.jackson.annotations.EcoreTypeInfo;
import org.gecko.emf.json.configuration.ConfigurableJsonResource;
import org.gecko.emf.json.constants.EMFJs;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.geojson.util.GeoJsonResourceFactoryImpl
 * @generated
 */
public class GeoJsonResourceImpl extends ConfigurableJsonResource {
	
	private static Map<String, Object> GEOJSON_DEFAULT_OPTIONS = new HashMap<>();
	static {
		GEOJSON_DEFAULT_OPTIONS.put(EMFJs.OPTION_SERIALIZE_DEFAULT_VALUE, true);
		GEOJSON_DEFAULT_OPTIONS.put(EMFJs.OPTION_TYPE_FIELD, "type");
		GEOJSON_DEFAULT_OPTIONS.put(EMFJs.OPTION_TYPE_USE, EcoreTypeInfo.USE.NAME);
	}
	
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public GeoJsonResourceImpl(URI uri) {
		super(uri, new ConfigurableJsonResource(uri).configureMapper(GEOJSON_DEFAULT_OPTIONS));
	}
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.json.configuration.ConfigurableJsonResource#doLoad(java.io.InputStream, java.util.Map)
	 */
	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		Map<Object,Object> map = new HashMap<>(GEOJSON_DEFAULT_OPTIONS);
		if(options != null) {
			options.forEach((k,v) -> map.put( k, v));
		}
		super.doLoad(inputStream, map);
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.gecko.emf.json.configuration.ConfigurableJsonResource#doSave(java.io.OutputStream, java.util.Map)
	 */
	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
		Map<Object,Object> map = new HashMap<>(GEOJSON_DEFAULT_OPTIONS);
		if(options != null) {
			options.forEach((k,v) -> map.put( k, v));
		}
		super.doSave(outputStream, map);
	}
} //GeoJsonResourceImpl
