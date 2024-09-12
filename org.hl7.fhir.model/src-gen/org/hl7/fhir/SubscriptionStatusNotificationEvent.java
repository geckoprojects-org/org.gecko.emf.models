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
 * A representation of the model object '<em><b>Subscription Status Notification Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The SubscriptionStatus resource describes the state of a Subscription during notifications.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubscriptionStatusNotificationEvent#getEventNumber <em>Event Number</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionStatusNotificationEvent#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionStatusNotificationEvent#getFocus <em>Focus</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionStatusNotificationEvent#getAdditionalContext <em>Additional Context</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getSubscriptionStatusNotificationEvent()
 * @model extendedMetaData="name='SubscriptionStatus.NotificationEvent' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SubscriptionStatusNotificationEvent extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Event Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Either the sequential number of this event in this subscription context or a relative event number for this notification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Number</em>' containment reference.
	 * @see #setEventNumber(Integer64)
	 * @see org.hl7.fhir.FHIRPackage#getSubscriptionStatusNotificationEvent_EventNumber()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='eventNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer64 getEventNumber();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionStatusNotificationEvent#getEventNumber <em>Event Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Number</em>' containment reference.
	 * @see #getEventNumber()
	 * @generated
	 */
	void setEventNumber(Integer64 value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The actual time this event occurred on the server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timestamp</em>' containment reference.
	 * @see #setTimestamp(Instant)
	 * @see org.hl7.fhir.FHIRPackage#getSubscriptionStatusNotificationEvent_Timestamp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timestamp' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getTimestamp();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionStatusNotificationEvent#getTimestamp <em>Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' containment reference.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Instant value);

	/**
	 * Returns the value of the '<em><b>Focus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The focus of this event. While this will usually be a reference to the focus resource of the event, it MAY contain a reference to a non-FHIR object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Focus</em>' containment reference.
	 * @see #setFocus(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getSubscriptionStatusNotificationEvent_Focus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='focus' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getFocus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionStatusNotificationEvent#getFocus <em>Focus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Focus</em>' containment reference.
	 * @see #getFocus()
	 * @generated
	 */
	void setFocus(Reference value);

	/**
	 * Returns the value of the '<em><b>Additional Context</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional context information for this event. Generally, this will contain references to additional resources included with the event (e.g., the Patient relevant to an Encounter), however it MAY refer to non-FHIR objects.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Additional Context</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getSubscriptionStatusNotificationEvent_AdditionalContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='additionalContext' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAdditionalContext();

} // SubscriptionStatusNotificationEvent
