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
package net.opengis.gml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounding Shape Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bounding shape.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.BoundingShapeType#getEnvelopeGroup <em>Envelope Group</em>}</li>
 *   <li>{@link net.opengis.gml.BoundingShapeType#getEnvelope <em>Envelope</em>}</li>
 *   <li>{@link net.opengis.gml.BoundingShapeType#getNull <em>Null</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getBoundingShapeType()
 * @model extendedMetaData="name='BoundingShapeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BoundingShapeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Envelope Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envelope Group</em>' attribute list.
	 * @see net.opengis.gml.GMLPackage#getBoundingShapeType_EnvelopeGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='Envelope:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getEnvelopeGroup();

	/**
	 * Returns the value of the '<em><b>Envelope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envelope</em>' containment reference.
	 * @see #setEnvelope(EnvelopeType)
	 * @see net.opengis.gml.GMLPackage#getBoundingShapeType_Envelope()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Envelope' namespace='##targetNamespace' group='Envelope:group'"
	 * @generated
	 */
	EnvelopeType getEnvelope();

	/**
	 * Sets the value of the '{@link net.opengis.gml.BoundingShapeType#getEnvelope <em>Envelope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Envelope</em>' containment reference.
	 * @see #getEnvelope()
	 * @generated
	 */
	void setEnvelope(EnvelopeType value);

	/**
	 * Returns the value of the '<em><b>Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null</em>' attribute.
	 * @see #setNull(Object)
	 * @see net.opengis.gml.GMLPackage#getBoundingShapeType_Null()
	 * @model dataType="net.opengis.gml.NullType"
	 *        extendedMetaData="kind='element' name='Null' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getNull();

	/**
	 * Sets the value of the '{@link net.opengis.gml.BoundingShapeType#getNull <em>Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null</em>' attribute.
	 * @see #getNull()
	 * @generated
	 */
	void setNull(Object value);

} // BoundingShapeType
