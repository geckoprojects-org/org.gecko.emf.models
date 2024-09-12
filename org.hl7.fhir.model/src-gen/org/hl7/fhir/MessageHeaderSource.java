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
 * A representation of the model object '<em><b>Message Header Source</b></em>'.
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
 *   <li>{@link org.hl7.fhir.MessageHeaderSource#getEndpointUrl <em>Endpoint Url</em>}</li>
 *   <li>{@link org.hl7.fhir.MessageHeaderSource#getEndpointReference <em>Endpoint Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.MessageHeaderSource#getName <em>Name</em>}</li>
 *   <li>{@link org.hl7.fhir.MessageHeaderSource#getSoftware <em>Software</em>}</li>
 *   <li>{@link org.hl7.fhir.MessageHeaderSource#getVersion <em>Version</em>}</li>
 *   <li>{@link org.hl7.fhir.MessageHeaderSource#getContact <em>Contact</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getMessageHeaderSource()
 * @model extendedMetaData="name='MessageHeader.Source' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MessageHeaderSource extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Endpoint Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Url</em>' containment reference.
	 * @see #setEndpointUrl(Url)
	 * @see org.hl7.fhir.FHIRPackage#getMessageHeaderSource_EndpointUrl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endpointUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	Url getEndpointUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeaderSource#getEndpointUrl <em>Endpoint Url</em>}' containment reference.
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
	 * @see org.hl7.fhir.FHIRPackage#getMessageHeaderSource_EndpointReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='endpointReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEndpointReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeaderSource#getEndpointReference <em>Endpoint Reference</em>}' containment reference.
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
	 * Human-readable name for the source system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getMessageHeaderSource_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getName();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeaderSource#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Software</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * May include configuration or other information useful in debugging.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Software</em>' containment reference.
	 * @see #setSoftware(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getMessageHeaderSource_Software()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='software' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSoftware();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeaderSource#getSoftware <em>Software</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software</em>' containment reference.
	 * @see #getSoftware()
	 * @generated
	 */
	void setSoftware(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Can convey versions of multiple systems in situations where a message passes through multiple hands.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getMessageHeaderSource_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getVersion();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeaderSource#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An e-mail, phone, website or other contact point to use to resolve issues with message communications.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference.
	 * @see #setContact(ContactPoint)
	 * @see org.hl7.fhir.FHIRPackage#getMessageHeaderSource_Contact()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactPoint getContact();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.MessageHeaderSource#getContact <em>Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' containment reference.
	 * @see #getContact()
	 * @generated
	 */
	void setContact(ContactPoint value);

} // MessageHeaderSource
