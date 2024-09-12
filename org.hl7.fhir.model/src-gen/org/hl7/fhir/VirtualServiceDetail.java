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
 * A representation of the model object '<em><b>Virtual Service Detail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Virtual Service Contact Details.
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.VirtualServiceDetail#getChannelType <em>Channel Type</em>}</li>
 *   <li>{@link org.hl7.fhir.VirtualServiceDetail#getAddressUrl <em>Address Url</em>}</li>
 *   <li>{@link org.hl7.fhir.VirtualServiceDetail#getAddressString <em>Address String</em>}</li>
 *   <li>{@link org.hl7.fhir.VirtualServiceDetail#getAddressContactPoint <em>Address Contact Point</em>}</li>
 *   <li>{@link org.hl7.fhir.VirtualServiceDetail#getAddressExtendedContactDetail <em>Address Extended Contact Detail</em>}</li>
 *   <li>{@link org.hl7.fhir.VirtualServiceDetail#getAdditionalInfo <em>Additional Info</em>}</li>
 *   <li>{@link org.hl7.fhir.VirtualServiceDetail#getMaxParticipants <em>Max Participants</em>}</li>
 *   <li>{@link org.hl7.fhir.VirtualServiceDetail#getSessionKey <em>Session Key</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getVirtualServiceDetail()
 * @model extendedMetaData="name='VirtualServiceDetail' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface VirtualServiceDetail extends DataType {
	/**
	 * Returns the value of the '<em><b>Channel Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of virtual service to connect to (i.e. Teams, Zoom, Specific VMR technology, WhatsApp).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channel Type</em>' containment reference.
	 * @see #setChannelType(Coding)
	 * @see org.hl7.fhir.FHIRPackage#getVirtualServiceDetail_ChannelType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='channelType' namespace='##targetNamespace'"
	 * @generated
	 */
	Coding getChannelType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VirtualServiceDetail#getChannelType <em>Channel Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Type</em>' containment reference.
	 * @see #getChannelType()
	 * @generated
	 */
	void setChannelType(Coding value);

	/**
	 * Returns the value of the '<em><b>Address Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Url</em>' containment reference.
	 * @see #setAddressUrl(Url)
	 * @see org.hl7.fhir.FHIRPackage#getVirtualServiceDetail_AddressUrl()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addressUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	Url getAddressUrl();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VirtualServiceDetail#getAddressUrl <em>Address Url</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Url</em>' containment reference.
	 * @see #getAddressUrl()
	 * @generated
	 */
	void setAddressUrl(Url value);

	/**
	 * Returns the value of the '<em><b>Address String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address String</em>' containment reference.
	 * @see #setAddressString(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getVirtualServiceDetail_AddressString()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addressString' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getAddressString();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VirtualServiceDetail#getAddressString <em>Address String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address String</em>' containment reference.
	 * @see #getAddressString()
	 * @generated
	 */
	void setAddressString(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Address Contact Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Contact Point</em>' containment reference.
	 * @see #setAddressContactPoint(ContactPoint)
	 * @see org.hl7.fhir.FHIRPackage#getVirtualServiceDetail_AddressContactPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addressContactPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactPoint getAddressContactPoint();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VirtualServiceDetail#getAddressContactPoint <em>Address Contact Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Contact Point</em>' containment reference.
	 * @see #getAddressContactPoint()
	 * @generated
	 */
	void setAddressContactPoint(ContactPoint value);

	/**
	 * Returns the value of the '<em><b>Address Extended Contact Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Extended Contact Detail</em>' containment reference.
	 * @see #setAddressExtendedContactDetail(ExtendedContactDetail)
	 * @see org.hl7.fhir.FHIRPackage#getVirtualServiceDetail_AddressExtendedContactDetail()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='addressExtendedContactDetail' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtendedContactDetail getAddressExtendedContactDetail();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VirtualServiceDetail#getAddressExtendedContactDetail <em>Address Extended Contact Detail</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Extended Contact Detail</em>' containment reference.
	 * @see #getAddressExtendedContactDetail()
	 * @generated
	 */
	void setAddressExtendedContactDetail(ExtendedContactDetail value);

	/**
	 * Returns the value of the '<em><b>Additional Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Url}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Address to see alternative connection details.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Info</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getVirtualServiceDetail_AdditionalInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Url> getAdditionalInfo();

	/**
	 * Returns the value of the '<em><b>Max Participants</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum number of participants supported by the virtual service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Participants</em>' containment reference.
	 * @see #setMaxParticipants(PositiveInt)
	 * @see org.hl7.fhir.FHIRPackage#getVirtualServiceDetail_MaxParticipants()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxParticipants' namespace='##targetNamespace'"
	 * @generated
	 */
	PositiveInt getMaxParticipants();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VirtualServiceDetail#getMaxParticipants <em>Max Participants</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Participants</em>' containment reference.
	 * @see #getMaxParticipants()
	 * @generated
	 */
	void setMaxParticipants(PositiveInt value);

	/**
	 * Returns the value of the '<em><b>Session Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Session Key required by the virtual service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Session Key</em>' containment reference.
	 * @see #setSessionKey(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getVirtualServiceDetail_SessionKey()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sessionKey' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getSessionKey();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.VirtualServiceDetail#getSessionKey <em>Session Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Key</em>' containment reference.
	 * @see #getSessionKey()
	 * @generated
	 */
	void setSessionKey(org.hl7.fhir.String value);

} // VirtualServiceDetail
