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
import net.opengis.gml.EnvelopeType;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Spatial Op Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ogc.BinarySpatialOpType#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link net.opengis.ogc.BinarySpatialOpType#getPropertyName1 <em>Property Name1</em>}</li>
 *   <li>{@link net.opengis.ogc.BinarySpatialOpType#getGeometryGroup <em>Geometry Group</em>}</li>
 *   <li>{@link net.opengis.ogc.BinarySpatialOpType#getGeometry <em>Geometry</em>}</li>
 *   <li>{@link net.opengis.ogc.BinarySpatialOpType#getEnvelopeGroup <em>Envelope Group</em>}</li>
 *   <li>{@link net.opengis.ogc.BinarySpatialOpType#getEnvelope <em>Envelope</em>}</li>
 * </ul>
 *
 * @see net.opengis.ogc.OGCPackage#getBinarySpatialOpType()
 * @model extendedMetaData="name='BinarySpatialOpType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BinarySpatialOpType extends SpatialOpsType {
	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' containment reference.
	 * @see #setPropertyName(PropertyNameType)
	 * @see net.opengis.ogc.OGCPackage#getBinarySpatialOpType_PropertyName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PropertyName' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyNameType getPropertyName();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.BinarySpatialOpType#getPropertyName <em>Property Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' containment reference.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(PropertyNameType value);

	/**
	 * Returns the value of the '<em><b>Property Name1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name1</em>' containment reference.
	 * @see #setPropertyName1(PropertyNameType)
	 * @see net.opengis.ogc.OGCPackage#getBinarySpatialOpType_PropertyName1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PropertyName' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertyNameType getPropertyName1();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.BinarySpatialOpType#getPropertyName1 <em>Property Name1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name1</em>' containment reference.
	 * @see #getPropertyName1()
	 * @generated
	 */
	void setPropertyName1(PropertyNameType value);

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
	 * @see net.opengis.ogc.OGCPackage#getBinarySpatialOpType_GeometryGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
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
	 * @see net.opengis.ogc.OGCPackage#getBinarySpatialOpType_Geometry()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_Geometry' namespace='http://www.opengis.net/gml' group='http://www.opengis.net/gml#_Geometry:group'"
	 * @generated
	 */
	AbstractGeometryType getGeometry();

	/**
	 * Returns the value of the '<em><b>Envelope Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envelope Group</em>' attribute list.
	 * @see net.opengis.ogc.OGCPackage#getBinarySpatialOpType_EnvelopeGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='Envelope:group' namespace='http://www.opengis.net/gml'"
	 * @generated
	 */
	FeatureMap getEnvelopeGroup();

	/**
	 * Returns the value of the '<em><b>Envelope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envelope</em>' containment reference.
	 * @see #setEnvelope(EnvelopeType)
	 * @see net.opengis.ogc.OGCPackage#getBinarySpatialOpType_Envelope()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Envelope' namespace='http://www.opengis.net/gml' group='http://www.opengis.net/gml#Envelope:group'"
	 * @generated
	 */
	EnvelopeType getEnvelope();

	/**
	 * Sets the value of the '{@link net.opengis.ogc.BinarySpatialOpType#getEnvelope <em>Envelope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Envelope</em>' containment reference.
	 * @see #getEnvelope()
	 * @generated
	 */
	void setEnvelope(EnvelopeType value);

} // BinarySpatialOpType
