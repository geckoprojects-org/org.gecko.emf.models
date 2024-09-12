/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package net.opengis.ogc;

import net.opengis.gml.AbstractGeometryType;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance Buffer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.DistanceBufferType#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link net.opengis.ogc.DistanceBufferType#getGeometryGroup <em>Geometry Group</em>}</li>
 *   <li>{@link net.opengis.ogc.DistanceBufferType#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link net.opengis.ogc.DistanceBufferType#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.OGCPackage#getDistanceBufferType()
 * @model extendedMetaData="name='DistanceBufferType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DistanceBufferType extends SpatialOpsType {
	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' containment reference.
	 * @see #setPropertyName(PropertyNameType)
	 * @see net.opengis.ogc.OGCPackage#getDistanceBufferType_PropertyName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PropertyName' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyNameType getPropertyName();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DistanceBufferType#getPropertyName <em>Property Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' containment reference.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(PropertyNameType value);

	/**
	 * Returns the value of the '<em><b>Geometry Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The "_Geometry" element is the abstract head of the substituition group for all geometry elements of GML 3. This 
	 * 			includes pre-defined and user-defined geometry elements. Any geometry element must be a direct or indirect extension/restriction 
	 * 			of AbstractGeometryType and must be directly or indirectly in the substitution group of "_Geometry".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geometry Group</em>' attribute list.
	 * @see net.opengis.ogc.OGCPackage#getDistanceBufferType_GeometryGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='_Geometry:group' namespace='http://www.opengis.net/gml'"
	 * @generated
	 */
	FeatureMap getGeometryGroup();

	/**
	 * Returns the value of the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The "_Geometry" element is the abstract head of the substituition group for all geometry elements of GML 3. This 
	 * 			includes pre-defined and user-defined geometry elements. Any geometry element must be a direct or indirect extension/restriction 
	 * 			of AbstractGeometryType and must be directly or indirectly in the substitution group of "_Geometry".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geometry</em>' containment reference.
	 * @see net.opengis.ogc.OGCPackage#getDistanceBufferType_Geometry()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_Geometry' namespace='http://www.opengis.net/gml' group='http://www.opengis.net/gml#_Geometry:group'"
	 * @generated
	 */
	AbstractGeometryType getGeometry();

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' containment reference.
	 * @see #setDistance(DistanceType)
	 * @see net.opengis.ogc.OGCPackage#getDistanceBufferType_Distance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Distance' namespace='##targetNamespace'"
	 * @generated
	 */
	DistanceType getDistance();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.DistanceBufferType#getDistance <em>Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' containment reference.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(DistanceType value);

} // DistanceBufferType
