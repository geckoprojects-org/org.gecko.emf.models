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
package net.opengis.gml.gml;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angle Choice Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.AngleChoiceType#getAngle <em>Angle</em>}</li>
 *   <li>{@link net.opengis.gml.gml.AngleChoiceType#getDmsAngle <em>Dms Angle</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.gml.GMLPackage#getAngleChoiceType()
 * @model extendedMetaData="name='AngleChoiceType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AngleChoiceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:angle property element is used to record the value of an angle quantity as a single number, with its units.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angle</em>' containment reference.
	 * @see #setAngle(AngleType)
	 * @see net.opengis.gml.gml.GMLPackage#getAngleChoiceType_Angle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angle' namespace='##targetNamespace'"
	 * @generated
	 */
	AngleType getAngle();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AngleChoiceType#getAngle <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' containment reference.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(AngleType value);

	/**
	 * Returns the value of the '<em><b>Dms Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dms Angle</em>' containment reference.
	 * @see #setDmsAngle(DMSAngleType)
	 * @see net.opengis.gml.gml.GMLPackage#getAngleChoiceType_DmsAngle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dmsAngle' namespace='##targetNamespace'"
	 * @generated
	 */
	DMSAngleType getDmsAngle();

	/**
	 * Sets the value of the '{@link net.opengis.gml.gml.AngleChoiceType#getDmsAngle <em>Dms Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dms Angle</em>' containment reference.
	 * @see #getDmsAngle()
	 * @generated
	 */
	void setDmsAngle(DMSAngleType value);

} // AngleChoiceType
