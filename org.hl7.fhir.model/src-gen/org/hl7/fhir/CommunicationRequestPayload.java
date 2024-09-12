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
 * A representation of the model object '<em><b>Communication Request Payload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CommunicationRequestPayload#getContentAttachment <em>Content Attachment</em>}</li>
 *   <li>{@link org.hl7.fhir.CommunicationRequestPayload#getContentReference <em>Content Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.CommunicationRequestPayload#getContentCodeableConcept <em>Content Codeable Concept</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getCommunicationRequestPayload()
 * @model extendedMetaData="name='CommunicationRequest.Payload' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CommunicationRequestPayload extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Content Attachment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Attachment</em>' containment reference.
	 * @see #setContentAttachment(Attachment)
	 * @see org.hl7.fhir.FHIRPackage#getCommunicationRequestPayload_ContentAttachment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentAttachment' namespace='##targetNamespace'"
	 * @generated
	 */
	Attachment getContentAttachment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CommunicationRequestPayload#getContentAttachment <em>Content Attachment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Attachment</em>' containment reference.
	 * @see #getContentAttachment()
	 * @generated
	 */
	void setContentAttachment(Attachment value);

	/**
	 * Returns the value of the '<em><b>Content Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Reference</em>' containment reference.
	 * @see #setContentReference(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getCommunicationRequestPayload_ContentReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getContentReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CommunicationRequestPayload#getContentReference <em>Content Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Reference</em>' containment reference.
	 * @see #getContentReference()
	 * @generated
	 */
	void setContentReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Content Codeable Concept</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Codeable Concept</em>' containment reference.
	 * @see #setContentCodeableConcept(CodeableConcept)
	 * @see org.hl7.fhir.FHIRPackage#getCommunicationRequestPayload_ContentCodeableConcept()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentCodeableConcept' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getContentCodeableConcept();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CommunicationRequestPayload#getContentCodeableConcept <em>Content Codeable Concept</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Codeable Concept</em>' containment reference.
	 * @see #getContentCodeableConcept()
	 * @generated
	 */
	void setContentCodeableConcept(CodeableConcept value);

} // CommunicationRequestPayload
