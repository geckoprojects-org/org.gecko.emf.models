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
 * A representation of the model object '<em><b>Message Header Destination</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.MessageHeaderDestination#getEndpointUrl <em>Endpoint Url</em>}</li>
 *   <li>{@link org.hl7.fhir.MessageHeaderDestination#getEndpointReference <em>Endpoint Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.MessageHeaderDestination#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.MessageHeaderDestination#getTarget <em>Target</em>}</li>
 *   <li>{@link org.hl7.fhir.MessageHeaderDestination#getReceiver <em>Receiver</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getMessageHeaderDestination()
 * @model extendedMetaData="name='MessageHeader.Destination' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MessageHeaderDestination extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Endpoint Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Url</em>' containment reference.
	 * @see #setEndpointUrl(Url)
	 * @see org.hl7.fhir.FHIRPackage#getMessageHeaderDestination_EndpointUrl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endpointUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	Url getEndpointUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeaderDestination#getEndpointUrl <em>Endpoint Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Url</em>' containment reference.
	 * @see #getEndpointUrl()
	 * @generated
	 */
	void setEndpointUrl(Url value);

	/**
	 * Returns the value of the '<em><b>Endpoint Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Reference</em>' containment reference.
	 * @see #setEndpointReference(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getMessageHeaderDestination_EndpointReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endpointReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEndpointReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeaderDestination#getEndpointReference <em>Endpoint Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Reference</em>' containment reference.
	 * @see #getEndpointReference()
	 * @generated
	 */
	void setEndpointReference(Reference value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable name for the target system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getMessageHeaderDestination_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeaderDestination#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the target end system in situations where the initial message transmission is to an intermediary system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getMessageHeaderDestination_Target()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='target' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getTarget();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeaderDestination#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Reference value);

	/**
	 * Returns the value of the '<em><b>Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows data conveyed by a message to be addressed to a particular person or department when routing to a specific application isn't sufficient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Receiver</em>' containment reference.
	 * @see #setReceiver(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getMessageHeaderDestination_Receiver()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='receiver' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getReceiver();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeaderDestination#getReceiver <em>Receiver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiver</em>' containment reference.
	 * @see #getReceiver()
	 * @generated
	 */
	void setReceiver(Reference value);

} // MessageHeaderDestination
