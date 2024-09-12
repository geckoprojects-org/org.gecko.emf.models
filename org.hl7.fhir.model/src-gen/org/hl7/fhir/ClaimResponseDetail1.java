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
 * A representation of the model object '<em><b>Claim Response Detail1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This resource provides the adjudication details from the processing of a Claim resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ClaimResponseDetail1#getTraceNumber <em>Trace Number</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseDetail1#getRevenue <em>Revenue</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseDetail1#getProductOrService <em>Product Or Service</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseDetail1#getProductOrServiceEnd <em>Product Or Service End</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseDetail1#getModifier <em>Modifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseDetail1#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseDetail1#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseDetail1#getFactor <em>Factor</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseDetail1#getTax <em>Tax</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseDetail1#getNet <em>Net</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseDetail1#getNoteNumber <em>Note Number</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseDetail1#getReviewOutcome <em>Review Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseDetail1#getAdjudication <em>Adjudication</em>}</li>
 *   <li>{@link org.hl7.fhir.ClaimResponseDetail1#getSubDetail <em>Sub Detail</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getClaimResponseDetail1()
 * @model extendedMetaData="name='ClaimResponse.Detail1' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ClaimResponseDetail1 extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Trace Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Trace number for tracking purposes. May be defined at the jurisdiction level or between trading partners.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trace Number</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getClaimResponseDetail1_TraceNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='traceNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getTraceNumber();

	/**
	 * Returns the value of the '<em><b>Revenue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of revenue or cost center providing the product and/or service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revenue</em>' containment reference.
	 * @see #setRevenue(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getClaimResponseDetail1_Revenue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='revenue' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getRevenue();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseDetail1#getRevenue <em>Revenue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revenue</em>' containment reference.
	 * @see #getRevenue()
	 * @generated
	 */
	void setRevenue(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Product Or Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the value is a group code then this item collects a set of related item details, otherwise this contains the product, service, drug or other billing code for the item. This element may be the start of a range of .productOrService codes used in conjunction with .productOrServiceEnd or it may be a solo element where .productOrServiceEnd is not used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Or Service</em>' containment reference.
	 * @see #setProductOrService(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getClaimResponseDetail1_ProductOrService()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productOrService' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getProductOrService();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseDetail1#getProductOrService <em>Product Or Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Or Service</em>' containment reference.
	 * @see #getProductOrService()
	 * @generated
	 */
	void setProductOrService(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Product Or Service End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This contains the end of a range of product, service, drug or other billing codes for the item. This element is not used when the .productOrService is a group code. This value may only be present when a .productOfService code has been provided to convey the start of the range. Typically this value may be used only with preauthorizations and not with claims.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product Or Service End</em>' containment reference.
	 * @see #setProductOrServiceEnd(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getClaimResponseDetail1_ProductOrServiceEnd()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='productOrServiceEnd' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getProductOrServiceEnd();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseDetail1#getProductOrServiceEnd <em>Product Or Service End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product Or Service End</em>' containment reference.
	 * @see #getProductOrServiceEnd()
	 * @generated
	 */
	void setProductOrServiceEnd(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Modifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Item typification or modifiers codes to convey additional context for the product or service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modifier</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getClaimResponseDetail1_Modifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getModifier();

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The number of repetitions of a service or product.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.fhir.FHIRPackage#getClaimResponseDetail1_Quantity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseDetail1#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Unit Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the item is not a group then this is the fee for the product or service, otherwise this is the total of the fees for the details of the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unit Price</em>' containment reference.
	 * @see #setUnitPrice(Money)
	 * @see org.hl7.fhir.FHIRPackage#getClaimResponseDetail1_UnitPrice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unitPrice' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getUnitPrice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseDetail1#getUnitPrice <em>Unit Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Price</em>' containment reference.
	 * @see #getUnitPrice()
	 * @generated
	 */
	void setUnitPrice(Money value);

	/**
	 * Returns the value of the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Factor</em>' containment reference.
	 * @see #setFactor(Decimal)
	 * @see org.hl7.fhir.FHIRPackage#getClaimResponseDetail1_Factor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='factor' namespace='##targetNamespace'"
	 * @generated
	 */
	Decimal getFactor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseDetail1#getFactor <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' containment reference.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(Decimal value);

	/**
	 * Returns the value of the '<em><b>Tax</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total of taxes applicable for this product or service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tax</em>' containment reference.
	 * @see #setTax(Money)
	 * @see org.hl7.fhir.FHIRPackage#getClaimResponseDetail1_Tax()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tax' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getTax();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseDetail1#getTax <em>Tax</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax</em>' containment reference.
	 * @see #getTax()
	 * @generated
	 */
	void setTax(Money value);

	/**
	 * Returns the value of the '<em><b>Net</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total amount claimed for the group (if a grouper) or the addItem.detail. Net = unit price * quantity * factor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Net</em>' containment reference.
	 * @see #setNet(Money)
	 * @see org.hl7.fhir.FHIRPackage#getClaimResponseDetail1_Net()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='net' namespace='##targetNamespace'"
	 * @generated
	 */
	Money getNet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseDetail1#getNet <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' containment reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Money value);

	/**
	 * Returns the value of the '<em><b>Note Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.PositiveInt}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The numbers associated with notes below which apply to the adjudication of this item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Note Number</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getClaimResponseDetail1_NoteNumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='noteNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PositiveInt> getNoteNumber();

	/**
	 * Returns the value of the '<em><b>Review Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The high-level results of the adjudication if adjudication has been performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Review Outcome</em>' containment reference.
	 * @see #setReviewOutcome(ClaimResponseReviewOutcome)
	 * @see org.hl7.fhir.FHIRPackage#getClaimResponseDetail1_ReviewOutcome()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reviewOutcome' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimResponseReviewOutcome getReviewOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ClaimResponseDetail1#getReviewOutcome <em>Review Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Review Outcome</em>' containment reference.
	 * @see #getReviewOutcome()
	 * @generated
	 */
	void setReviewOutcome(ClaimResponseReviewOutcome value);

	/**
	 * Returns the value of the '<em><b>Adjudication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseAdjudication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The adjudication results.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adjudication</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getClaimResponseDetail1_Adjudication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='adjudication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseAdjudication> getAdjudication();

	/**
	 * Returns the value of the '<em><b>Sub Detail</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.ClaimResponseSubDetail1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The third-tier service adjudications for payor added services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Detail</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getClaimResponseDetail1_SubDetail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subDetail' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ClaimResponseSubDetail1> getSubDetail();

} // ClaimResponseDetail1
