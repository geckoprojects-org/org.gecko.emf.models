/*
 */
package org.geojson;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Polygon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  A GeoJSON Polygone object as defined in
 * <a href="https://tools.ietf.org/html/rfc7946#section-3.1.6">the GeoJSON specification</a>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.geojson.MultiPolygon#getPolygons <em>Polygons</em>}</li>
 * </ul>
 *
 * @see org.geojson.GeoJsonPackage#getMultiPolygon()
 * @model features="data" 
 *        dataDataType="org.geojson.DoubleArray4D" dataVolatile="true" dataSuppressedGetVisibility="true" dataSuppressedSetVisibility="true" dataSuppressedUnsetVisibility="true"
 *        dataExtendedMetaData="name='coordinates'"
 *        dataAnnotation="http://www.eclipse.org/emf/2002/GenModel get='return org.geojson.util.GeoJsonHelper.getMultiPolygonData(this);'"
 * @generated
 */
@ProviderType
public interface MultiPolygon extends Geometry {
	/**
	 * Returns the value of the '<em><b>Polygons</b></em>' containment reference list.
	 * The list contents are of type {@link org.geojson.SimplePolygon}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygons</em>' containment reference list.
	 * @see org.geojson.GeoJsonPackage#getMultiPolygon_Polygons()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimplePolygon> getPolygons();

} // MultiPolygon
