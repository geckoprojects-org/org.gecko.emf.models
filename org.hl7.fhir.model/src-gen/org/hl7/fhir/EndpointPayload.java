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
 * A representation of the model object '<em><b>Endpoint Payload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b, a REST endpoint for another FHIR server, or a s/Mime email address. This may include any security context information.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.EndpointPayload#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.EndpointPayload#getMimeType <em>Mime Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getEndpointPayload()
 * @model extendedMetaData="name='Endpoint.Payload' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EndpointPayload extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The payload type describes the acceptable content that can be communicated on the endpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getEndpointPayload_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getType();

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Code}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mime type to send the payload in - e.g. application/fhir+xml, application/fhir+json. If the mime type is not specified, then the sender could send any content (including no content depending on the connectionType).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mime Type</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getEndpointPayload_MimeType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='mimeType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Code> getMimeType();

} // EndpointPayload
