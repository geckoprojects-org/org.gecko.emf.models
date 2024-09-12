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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice Line Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Invoice containing collected ChargeItems from an Account with calculated individual and total price for Billing purpose.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.InvoiceLineItem#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.hl7.fhir.InvoiceLineItem#getServicedDate <em>Serviced Date</em>}</li>
 *   <li>{@link org.hl7.fhir.InvoiceLineItem#getServicedPeriod <em>Serviced Period</em>}</li>
 *   <li>{@link org.hl7.fhir.InvoiceLineItem#getChargeItemReference <em>Charge Item Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.InvoiceLineItem#getChargeItemCodeableConcept <em>Charge Item Codeable Concept</em>}</li>
 *   <li>{@link org.hl7.fhir.InvoiceLineItem#getPriceComponent <em>Price Component</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getInvoiceLineItem()
 * @model extendedMetaData="name='Invoice.LineItem' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface InvoiceLineItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sequence in which the items appear on the invoice.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sequence</em>' containment reference.
	 * @see #setSequence(PositiveInt)
	 * @see org.hl7.fhir.FHIRPackage#getInvoiceLineItem_Sequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getSequence();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InvoiceLineItem#getSequence <em>Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence</em>' containment reference.
	 * @see #getSequence()
	 * @generated
	 */
	void setSequence(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Serviced Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviced Date</em>' containment reference.
	 * @see #setServicedDate(Date)
	 * @see org.hl7.fhir.FHIRPackage#getInvoiceLineItem_ServicedDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='servicedDate' namespace='##targetNamespace'"
	 * @generated
	 */
	Date getServicedDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InvoiceLineItem#getServicedDate <em>Serviced Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serviced Date</em>' containment reference.
	 * @see #getServicedDate()
	 * @generated
	 */
	void setServicedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Serviced Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serviced Period</em>' containment reference.
	 * @see #setServicedPeriod(Period)
	 * @see org.hl7.fhir.FHIRPackage#getInvoiceLineItem_ServicedPeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='servicedPeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getServicedPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InvoiceLineItem#getServicedPeriod <em>Serviced Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serviced Period</em>' containment reference.
	 * @see #getServicedPeriod()
	 * @generated
	 */
	void setServicedPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Charge Item Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Item Reference</em>' containment reference.
	 * @see #setChargeItemReference(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getInvoiceLineItem_ChargeItemReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='chargeItemReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getChargeItemReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InvoiceLineItem#getChargeItemReference <em>Charge Item Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Item Reference</em>' containment reference.
	 * @see #getChargeItemReference()
	 * @generated
	 */
	void setChargeItemReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Charge Item Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charge Item Codeable Concept</em>' containment reference.
	 * @see #setChargeItemCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getInvoiceLineItem_ChargeItemCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='chargeItemCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getChargeItemCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.InvoiceLineItem#getChargeItemCodeableConcept <em>Charge Item Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charge Item Codeable Concept</em>' containment reference.
	 * @see #getChargeItemCodeableConcept()
	 * @generated
	 */
	void setChargeItemCodeableConcept(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Price Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.MonetaryComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The price for a ChargeItem may be calculated as a base price with surcharges/deductions that apply in certain conditions. A ChargeItemDefinition resource that defines the prices, factors and conditions that apply to a billing code is currently under development. The priceComponent element can be used to offer transparency to the recipient of the Invoice as to how the prices have been calculated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Price Component</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getInvoiceLineItem_PriceComponent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priceComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MonetaryComponent> getPriceComponent();

} // InvoiceLineItem
