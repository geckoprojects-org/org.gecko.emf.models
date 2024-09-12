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
 * A representation of the model object '<em><b>Contract Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Legally enforceable, formally recorded unilateral or bilateral directive i.e., a policy or agreement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ContractAnswer#getValueBoolean <em>Value Boolean</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAnswer#getValueDecimal <em>Value Decimal</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAnswer#getValueInteger <em>Value Integer</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAnswer#getValueDate <em>Value Date</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAnswer#getValueDateTime <em>Value Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAnswer#getValueTime <em>Value Time</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAnswer#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAnswer#getValueUri <em>Value Uri</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAnswer#getValueAttachment <em>Value Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAnswer#getValueCoding <em>Value Coding</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAnswer#getValueQuantity <em>Value Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ContractAnswer#getValueReference <em>Value Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getContractAnswer()
 * @model extendedMetaData="name='Contract.Answer' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ContractAnswer extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Value Boolean</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Boolean</em>' containment reference.
	 * @see #setValueBoolean(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FHIRPackage#getContractAnswer_ValueBoolean()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueBoolean' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getValueBoolean();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAnswer#getValueBoolean <em>Value Boolean</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Boolean</em>' containment reference.
	 * @see #getValueBoolean()
	 * @generated
	 */
	void setValueBoolean(org.hl7.fhir.Boolean value);

	/**
	 * Returns the value of the '<em><b>Value Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Decimal</em>' containment reference.
	 * @see #setValueDecimal(Decimal)
	 * @see org.hl7.fhir.FHIRPackage#getContractAnswer_ValueDecimal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDecimal' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getValueDecimal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAnswer#getValueDecimal <em>Value Decimal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Decimal</em>' containment reference.
	 * @see #getValueDecimal()
	 * @generated
	 */
	void setValueDecimal(Decimal value);

	/**
	 * Returns the value of the '<em><b>Value Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Integer</em>' containment reference.
	 * @see #setValueInteger(org.hl7.fhir.Integer)
	 * @see org.hl7.fhir.FHIRPackage#getContractAnswer_ValueInteger()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueInteger' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Integer getValueInteger();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAnswer#getValueInteger <em>Value Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Integer</em>' containment reference.
	 * @see #getValueInteger()
	 * @generated
	 */
	void setValueInteger(org.hl7.fhir.Integer value);

	/**
	 * Returns the value of the '<em><b>Value Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Date</em>' containment reference.
	 * @see #setValueDate(Date)
	 * @see org.hl7.fhir.FHIRPackage#getContractAnswer_ValueDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getValueDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAnswer#getValueDate <em>Value Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Date</em>' containment reference.
	 * @see #getValueDate()
	 * @generated
	 */
	void setValueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Value Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Date Time</em>' containment reference.
	 * @see #setValueDateTime(DateTime)
	 * @see org.hl7.fhir.FHIRPackage#getContractAnswer_ValueDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getValueDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAnswer#getValueDateTime <em>Value Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Date Time</em>' containment reference.
	 * @see #getValueDateTime()
	 * @generated
	 */
	void setValueDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Value Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Time</em>' containment reference.
	 * @see #setValueTime(Time)
	 * @see org.hl7.fhir.FHIRPackage#getContractAnswer_ValueTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Time getValueTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAnswer#getValueTime <em>Value Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Time</em>' containment reference.
	 * @see #getValueTime()
	 * @generated
	 */
	void setValueTime(Time value);

	/**
	 * Returns the value of the '<em><b>Value String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value String</em>' containment reference.
	 * @see #setValueString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getContractAnswer_ValueString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getValueString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAnswer#getValueString <em>Value String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value String</em>' containment reference.
	 * @see #getValueString()
	 * @generated
	 */
	void setValueString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Value Uri</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Uri</em>' containment reference.
	 * @see #setValueUri(Uri)
	 * @see org.hl7.fhir.FHIRPackage#getContractAnswer_ValueUri()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueUri' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getValueUri();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAnswer#getValueUri <em>Value Uri</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Uri</em>' containment reference.
	 * @see #getValueUri()
	 * @generated
	 */
	void setValueUri(Uri value);

	/**
	 * Returns the value of the '<em><b>Value Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Attachment</em>' containment reference.
	 * @see #setValueAttachment(Attachment)
	 * @see org.hl7.fhir.FHIRPackage#getContractAnswer_ValueAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getValueAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAnswer#getValueAttachment <em>Value Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Attachment</em>' containment reference.
	 * @see #getValueAttachment()
	 * @generated
	 */
	void setValueAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Value Coding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Coding</em>' containment reference.
	 * @see #setValueCoding(Coding)
	 * @see org.hl7.fhir.FHIRPackage#getContractAnswer_ValueCoding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueCoding' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getValueCoding();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAnswer#getValueCoding <em>Value Coding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Coding</em>' containment reference.
	 * @see #getValueCoding()
	 * @generated
	 */
	void setValueCoding(Coding value);

	/**
	 * Returns the value of the '<em><b>Value Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Quantity</em>' containment reference.
	 * @see #setValueQuantity(Quantity)
	 * @see org.hl7.fhir.FHIRPackage#getContractAnswer_ValueQuantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueQuantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getValueQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAnswer#getValueQuantity <em>Value Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Quantity</em>' containment reference.
	 * @see #getValueQuantity()
	 * @generated
	 */
	void setValueQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Value Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Reference</em>' containment reference.
	 * @see #setValueReference(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getContractAnswer_ValueReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='valueReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getValueReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ContractAnswer#getValueReference <em>Value Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Reference</em>' containment reference.
	 * @see #getValueReference()
	 * @generated
	 */
	void setValueReference(Reference value);

} // ContractAnswer
