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
 * A representation of the model object '<em><b>Claim Supporting Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A provider issued list of professional services and products which have been provided, or are to be provided, to a patient which is sent to an insurer for reimbursement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClaimSupportingInfo#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimSupportingInfo#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimSupportingInfo#getCode <em>Code</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimSupportingInfo#getTimingDate <em>Timing Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimSupportingInfo#getTimingPeriod <em>Timing Period</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimSupportingInfo#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimSupportingInfo#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimSupportingInfo#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimSupportingInfo#getValueAttachment <em>Value Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimSupportingInfo#getValueReference <em>Value Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimSupportingInfo#getValueIdentifier <em>Value Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimSupportingInfo#getReason <em>Reason</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getClaimSupportingInfo()
 * @model extendedMetaData="name='Claim.SupportingInfo' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ClaimSupportingInfo extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A number to uniquely identify supporting information entries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.fhir.FHIRPackage#getClaimSupportingInfo_Sequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimSupportingInfo#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The general class of the information supplied: information; exception; accident, employment; onset, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getClaimSupportingInfo_Category()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimSupportingInfo#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * System and code pertaining to the specific information regarding special conditions relating to the setting, treatment or patient  for which care is sought.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference.
	 * @see #setCode(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getClaimSupportingInfo_Code()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCode();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimSupportingInfo#getCode <em>Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' containment reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Timing Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Date</em>' containment reference.
	 * @see #setTimingDate(Date)
	 * @see org.hl7.fhir.FHIRPackage#getClaimSupportingInfo_TimingDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getTimingDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimSupportingInfo#getTimingDate <em>Timing Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Date</em>' containment reference.
	 * @see #getTimingDate()
	 * @generated
	 */
	void setTimingDate(Date value);

	/**
	 * Returns the value of the '<em><b>Timing Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timing Period</em>' containment reference.
	 * @see #setTimingPeriod(Period)
	 * @see org.hl7.fhir.FHIRPackage#getClaimSupportingInfo_TimingPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timingPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getTimingPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimSupportingInfo#getTimingPeriod <em>Timing Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timing Period</em>' containment reference.
	 * @see #getTimingPeriod()
	 * @generated
	 */
	void setTimingPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Value Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Boolean</em>' containment reference.
	 * @see #setValueBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FHIRPackage#getClaimSupportingInfo_ValueBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getValueBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimSupportingInfo#getValueBoolean <em>Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Boolean</em>' containment reference.
	 * @see #getValueBoolean()
	 * @generated
	 */
	void setValueBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Value String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value String</em>' containment reference.
	 * @see #setValueString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getClaimSupportingInfo_ValueString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getValueString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimSupportingInfo#getValueString <em>Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value String</em>' containment reference.
	 * @see #getValueString()
	 * @generated
	 */
	void setValueString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Quantity</em>' containment reference.
	 * @see #setValueQuantity(Quantity)
	 * @see org.hl7.fhir.FHIRPackage#getClaimSupportingInfo_ValueQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getValueQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimSupportingInfo#getValueQuantity <em>Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Quantity</em>' containment reference.
	 * @see #getValueQuantity()
	 * @generated
	 */
	void setValueQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Value Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Attachment</em>' containment reference.
	 * @see #setValueAttachment(Attachment)
	 * @see org.hl7.fhir.FHIRPackage#getClaimSupportingInfo_ValueAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getValueAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimSupportingInfo#getValueAttachment <em>Value Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Attachment</em>' containment reference.
	 * @see #getValueAttachment()
	 * @generated
	 */
	void setValueAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Value Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Reference</em>' containment reference.
	 * @see #setValueReference(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getClaimSupportingInfo_ValueReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getValueReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimSupportingInfo#getValueReference <em>Value Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Reference</em>' containment reference.
	 * @see #getValueReference()
	 * @generated
	 */
	void setValueReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Value Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Identifier</em>' containment reference.
	 * @see #setValueIdentifier(Identifier)
	 * @see org.hl7.fhir.FHIRPackage#getClaimSupportingInfo_ValueIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getValueIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimSupportingInfo#getValueIdentifier <em>Value Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Identifier</em>' containment reference.
	 * @see #getValueIdentifier()
	 * @generated
	 */
	void setValueIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides the reason in the situation where a reason code is required in addition to the content.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference.
	 * @see #setReason(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getClaimSupportingInfo_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimSupportingInfo#getReason <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' containment reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(CodeableConcept value);

} // ClaimSupportingInfo
