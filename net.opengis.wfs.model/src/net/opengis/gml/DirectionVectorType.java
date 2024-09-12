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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direction Vector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Direction expressed as a vector, either using components, or using angles.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.DirectionVectorType#getVector <em>Vector</em>}</li>
 *   <li>{@link net.opengis.gml.DirectionVectorType#getHorizontalAngle <em>Horizontal Angle</em>}</li>
 *   <li>{@link net.opengis.gml.DirectionVectorType#getVerticalAngle <em>Vertical Angle</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getDirectionVectorType()
 * @model extendedMetaData="name='DirectionVectorType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DirectionVectorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector</em>' containment reference.
	 * @see #setVector(VectorType)
	 * @see net.opengis.gml.GMLPackage#getDirectionVectorType_Vector()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vector' namespace='##targetNamespace'"
	 * @generated
	 */
	VectorType getVector();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DirectionVectorType#getVector <em>Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector</em>' containment reference.
	 * @see #getVector()
	 * @generated
	 */
	void setVector(VectorType value);

	/**
	 * Returns the value of the '<em><b>Horizontal Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Angle</em>' containment reference.
	 * @see #setHorizontalAngle(AngleType)
	 * @see net.opengis.gml.GMLPackage#getDirectionVectorType_HorizontalAngle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='horizontalAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	AngleType getHorizontalAngle();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DirectionVectorType#getHorizontalAngle <em>Horizontal Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Angle</em>' containment reference.
	 * @see #getHorizontalAngle()
	 * @generated
	 */
	void setHorizontalAngle(AngleType value);

	/**
	 * Returns the value of the '<em><b>Vertical Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Angle</em>' containment reference.
	 * @see #setVerticalAngle(AngleType)
	 * @see net.opengis.gml.GMLPackage#getDirectionVectorType_VerticalAngle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='verticalAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	AngleType getVerticalAngle();

	/**
	 * Sets the value of the '{@link net.opengis.gml.DirectionVectorType#getVerticalAngle <em>Vertical Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Angle</em>' containment reference.
	 * @see #getVerticalAngle()
	 * @generated
	 */
	void setVerticalAngle(AngleType value);

} // DirectionVectorType
