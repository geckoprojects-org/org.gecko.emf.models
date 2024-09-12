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
package org.hl7.fhir;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Explanation Of Benefit Financial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitFinancial#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitFinancial#getAllowedUnsignedInt <em>Allowed Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitFinancial#getAllowedString <em>Allowed String</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitFinancial#getAllowedMoney <em>Allowed Money</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitFinancial#getUsedUnsignedInt <em>Used Unsigned Int</em>}</li>
 *   <li>{@link org.hl7.fhir.ExplanationOfBenefitFinancial#getUsedMoney <em>Used Money</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getExplanationOfBenefitFinancial()
 * @model extendedMetaData="name='ExplanationOfBenefit.Financial' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ExplanationOfBenefitFinancial extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classification of benefit being provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getExplanationOfBenefitFinancial_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitFinancial#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Allowed Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Unsigned Int</em>' containment reference.
	 * @see #setAllowedUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FHIRPackage#getExplanationOfBenefitFinancial_AllowedUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allowedUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getAllowedUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitFinancial#getAllowedUnsignedInt <em>Allowed Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Unsigned Int</em>' containment reference.
	 * @see #getAllowedUnsignedInt()
	 * @generated
	 */
	void setAllowedUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Allowed String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed String</em>' containment reference.
	 * @see #setAllowedString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getExplanationOfBenefitFinancial_AllowedString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allowedString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAllowedString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitFinancial#getAllowedString <em>Allowed String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed String</em>' containment reference.
	 * @see #getAllowedString()
	 * @generated
	 */
	void setAllowedString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Allowed Money</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Money</em>' containment reference.
	 * @see #setAllowedMoney(Money)
	 * @see org.hl7.fhir.FHIRPackage#getExplanationOfBenefitFinancial_AllowedMoney()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='allowedMoney' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getAllowedMoney();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitFinancial#getAllowedMoney <em>Allowed Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Money</em>' containment reference.
	 * @see #getAllowedMoney()
	 * @generated
	 */
	void setAllowedMoney(Money value);

	/**
	 * Returns the value of the '<em><b>Used Unsigned Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Unsigned Int</em>' containment reference.
	 * @see #setUsedUnsignedInt(UnsignedInt)
	 * @see org.hl7.fhir.FHIRPackage#getExplanationOfBenefitFinancial_UsedUnsignedInt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usedUnsignedInt' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsignedInt getUsedUnsignedInt();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitFinancial#getUsedUnsignedInt <em>Used Unsigned Int</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Unsigned Int</em>' containment reference.
	 * @see #getUsedUnsignedInt()
	 * @generated
	 */
	void setUsedUnsignedInt(UnsignedInt value);

	/**
	 * Returns the value of the '<em><b>Used Money</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Money</em>' containment reference.
	 * @see #setUsedMoney(Money)
	 * @see org.hl7.fhir.FHIRPackage#getExplanationOfBenefitFinancial_UsedMoney()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='usedMoney' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getUsedMoney();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ExplanationOfBenefitFinancial#getUsedMoney <em>Used Money</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Used Money</em>' containment reference.
	 * @see #getUsedMoney()
	 * @generated
	 */
	void setUsedMoney(Money value);

} // ExplanationOfBenefitFinancial
