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
package org.isotc211._2005.gmd;

import org.isotc211._2005.gco.AbstractObjectType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.DateTimePropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Standard Order Process Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Common ways in which the dataset may be obtained or received, and related instructions and fee information
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDStandardOrderProcessType#getFees <em>Fees</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDStandardOrderProcessType#getPlannedAvailableDateTime <em>Planned Available Date Time</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDStandardOrderProcessType#getOrderingInstructions <em>Ordering Instructions</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDStandardOrderProcessType#getTurnaround <em>Turnaround</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDStandardOrderProcessType()
 * @model extendedMetaData="name='MD_StandardOrderProcess_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDStandardOrderProcessType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Fees</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fees</em>' containment reference.
	 * @see #setFees(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDStandardOrderProcessType_Fees()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fees' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getFees();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDStandardOrderProcessType#getFees <em>Fees</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fees</em>' containment reference.
	 * @see #getFees()
	 * @generated
	 */
	void setFees(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Planned Available Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planned Available Date Time</em>' containment reference.
	 * @see #setPlannedAvailableDateTime(DateTimePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDStandardOrderProcessType_PlannedAvailableDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='plannedAvailableDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTimePropertyType getPlannedAvailableDateTime();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDStandardOrderProcessType#getPlannedAvailableDateTime <em>Planned Available Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned Available Date Time</em>' containment reference.
	 * @see #getPlannedAvailableDateTime()
	 * @generated
	 */
	void setPlannedAvailableDateTime(DateTimePropertyType value);

	/**
	 * Returns the value of the '<em><b>Ordering Instructions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordering Instructions</em>' containment reference.
	 * @see #setOrderingInstructions(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDStandardOrderProcessType_OrderingInstructions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='orderingInstructions' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getOrderingInstructions();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDStandardOrderProcessType#getOrderingInstructions <em>Ordering Instructions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering Instructions</em>' containment reference.
	 * @see #getOrderingInstructions()
	 * @generated
	 */
	void setOrderingInstructions(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Turnaround</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turnaround</em>' containment reference.
	 * @see #setTurnaround(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDStandardOrderProcessType_Turnaround()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='turnaround' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getTurnaround();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDStandardOrderProcessType#getTurnaround <em>Turnaround</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turnaround</em>' containment reference.
	 * @see #getTurnaround()
	 * @generated
	 */
	void setTurnaround(CharacterStringPropertyType value);

} // MDStandardOrderProcessType
