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
 * A representation of the model object '<em><b>Supply Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A record of a request to deliver a medication, substance or device used in the healthcare setting to a particular destination for a particular person or organization.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SupplyRequest#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.SupplyRequest#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.SupplyRequest#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.SupplyRequest#getCategory <em>Category</em>}</li>
 *   <li>{@link org.hl7.fhir.SupplyRequest#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.SupplyRequest#getDeliverFor <em>Deliver For</em>}</li>
 *   <li>{@link org.hl7.fhir.SupplyRequest#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.fhir.SupplyRequest#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.hl7.fhir.SupplyRequest#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.hl7.fhir.SupplyRequest#getOccurrenceDateTime <em>Occurrence Date Time</em>}</li>
 *   <li>{@link org.hl7.fhir.SupplyRequest#getOccurrencePeriod <em>Occurrence Period</em>}</li>
 *   <li>{@link org.hl7.fhir.SupplyRequest#getOccurrenceTiming <em>Occurrence Timing</em>}</li>
 *   <li>{@link org.hl7.fhir.SupplyRequest#getAuthoredOn <em>Authored On</em>}</li>
 *   <li>{@link org.hl7.fhir.SupplyRequest#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.hl7.fhir.SupplyRequest#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link org.hl7.fhir.SupplyRequest#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.SupplyRequest#getDeliverFrom <em>Deliver From</em>}</li>
 *   <li>{@link org.hl7.fhir.SupplyRequest#getDeliverTo <em>Deliver To</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getSupplyRequest()
 * @model extendedMetaData="name='SupplyRequest' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SupplyRequest extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifiers assigned to this SupplyRequest by the author and/or other systems. These identifiers remain constant as the resource is updated and propagates from server to server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getSupplyRequest_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Status of the supply request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(SupplyRequestStatus)
	 * @see org.hl7.fhir.FHIRPackage#getSupplyRequest_Status()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	SupplyRequestStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SupplyRequest#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(SupplyRequestStatus value);

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Plan/proposal/order fulfilled by this request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getSupplyRequest_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Category of supply, e.g.  central, non-stock, etc. This is used to support work flows associated with the supply process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' containment reference.
	 * @see #setCategory(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getSupplyRequest_Category()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='category' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getCategory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SupplyRequest#getCategory <em>Category</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' containment reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates how quickly this SupplyRequest should be addressed with respect to other requests.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(RequestPriority)
	 * @see org.hl7.fhir.FHIRPackage#getSupplyRequest_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestPriority getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SupplyRequest#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(RequestPriority value);

	/**
	 * Returns the value of the '<em><b>Deliver For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient to whom the supply will be given or for whom they will be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deliver For</em>' containment reference.
	 * @see #setDeliverFor(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getSupplyRequest_DeliverFor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deliverFor' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDeliverFor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SupplyRequest#getDeliverFor <em>Deliver For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deliver For</em>' containment reference.
	 * @see #getDeliverFor()
	 * @generated
	 */
	void setDeliverFor(Reference value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The item that is requested to be supplied. This is either a link to a resource representing the details of the item or a code that identifies the item from a known list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(CodeableReference)
	 * @see org.hl7.fhir.FHIRPackage#getSupplyRequest_Item()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableReference getItem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SupplyRequest#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(CodeableReference value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The amount that is being ordered of the indicated item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see org.hl7.fhir.FHIRPackage#getSupplyRequest_Quantity()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='quantity' namespace='##targetNamespace'"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SupplyRequest#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.SupplyRequestParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific parameters for the ordered item.  For example, the size of the indicated item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getSupplyRequest_Parameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SupplyRequestParameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Occurrence Date Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence Date Time</em>' containment reference.
	 * @see #setOccurrenceDateTime(DateTime)
	 * @see org.hl7.fhir.FHIRPackage#getSupplyRequest_OccurrenceDateTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceDateTime' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getOccurrenceDateTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SupplyRequest#getOccurrenceDateTime <em>Occurrence Date Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Date Time</em>' containment reference.
	 * @see #getOccurrenceDateTime()
	 * @generated
	 */
	void setOccurrenceDateTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Occurrence Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence Period</em>' containment reference.
	 * @see #setOccurrencePeriod(Period)
	 * @see org.hl7.fhir.FHIRPackage#getSupplyRequest_OccurrencePeriod()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrencePeriod' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getOccurrencePeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SupplyRequest#getOccurrencePeriod <em>Occurrence Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Period</em>' containment reference.
	 * @see #getOccurrencePeriod()
	 * @generated
	 */
	void setOccurrencePeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Occurrence Timing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence Timing</em>' containment reference.
	 * @see #setOccurrenceTiming(Timing)
	 * @see org.hl7.fhir.FHIRPackage#getSupplyRequest_OccurrenceTiming()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='occurrenceTiming' namespace='##targetNamespace'"
	 * @generated
	 */
	Timing getOccurrenceTiming();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SupplyRequest#getOccurrenceTiming <em>Occurrence Timing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Timing</em>' containment reference.
	 * @see #getOccurrenceTiming()
	 * @generated
	 */
	void setOccurrenceTiming(Timing value);

	/**
	 * Returns the value of the '<em><b>Authored On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the request was made.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authored On</em>' containment reference.
	 * @see #setAuthoredOn(DateTime)
	 * @see org.hl7.fhir.FHIRPackage#getSupplyRequest_AuthoredOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authoredOn' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getAuthoredOn();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SupplyRequest#getAuthoredOn <em>Authored On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authored On</em>' containment reference.
	 * @see #getAuthoredOn()
	 * @generated
	 */
	void setAuthoredOn(DateTime value);

	/**
	 * Returns the value of the '<em><b>Requester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device, practitioner, etc. who initiated the request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requester</em>' containment reference.
	 * @see #setRequester(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getSupplyRequest_Requester()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requester' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequester();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SupplyRequest#getRequester <em>Requester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requester</em>' containment reference.
	 * @see #getRequester()
	 * @generated
	 */
	void setRequester(Reference value);

	/**
	 * Returns the value of the '<em><b>Supplier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who is intended to fulfill the request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supplier</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getSupplyRequest_Supplier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supplier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSupplier();

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason why the supply item was requested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getSupplyRequest_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getReason();

	/**
	 * Returns the value of the '<em><b>Deliver From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the supply is expected to come from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deliver From</em>' containment reference.
	 * @see #setDeliverFrom(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getSupplyRequest_DeliverFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deliverFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDeliverFrom();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SupplyRequest#getDeliverFrom <em>Deliver From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deliver From</em>' containment reference.
	 * @see #getDeliverFrom()
	 * @generated
	 */
	void setDeliverFrom(Reference value);

	/**
	 * Returns the value of the '<em><b>Deliver To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the supply is destined to go.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deliver To</em>' containment reference.
	 * @see #setDeliverTo(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getSupplyRequest_DeliverTo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deliverTo' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getDeliverTo();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SupplyRequest#getDeliverTo <em>Deliver To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deliver To</em>' containment reference.
	 * @see #getDeliverTo()
	 * @generated
	 */
	void setDeliverTo(Reference value);

} // SupplyRequest
