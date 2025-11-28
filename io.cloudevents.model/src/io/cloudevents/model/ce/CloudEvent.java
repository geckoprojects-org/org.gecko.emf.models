/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package io.cloudevents.model.ce;

import java.util.Date;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Representation of an event according to CloudEvents Spec v1.0
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link io.cloudevents.model.ce.CloudEvent#getEventId <em>Event Id</em>}</li>
 *   <li>{@link io.cloudevents.model.ce.CloudEvent#getSource <em>Source</em>}</li>
 *   <li>{@link io.cloudevents.model.ce.CloudEvent#getSpecVersion <em>Spec Version</em>}</li>
 *   <li>{@link io.cloudevents.model.ce.CloudEvent#getType <em>Type</em>}</li>
 *   <li>{@link io.cloudevents.model.ce.CloudEvent#getDatacontenttype <em>Datacontenttype</em>}</li>
 *   <li>{@link io.cloudevents.model.ce.CloudEvent#getDataschema <em>Dataschema</em>}</li>
 *   <li>{@link io.cloudevents.model.ce.CloudEvent#getSubject <em>Subject</em>}</li>
 *   <li>{@link io.cloudevents.model.ce.CloudEvent#getTime <em>Time</em>}</li>
 *   <li>{@link io.cloudevents.model.ce.CloudEvent#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link io.cloudevents.model.ce.CloudEvent#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see io.cloudevents.model.ce.CloudEventsPackage#getCloudEvent()
 * @model
 * @generated
 */
@ProviderType
public interface CloudEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * REQUIRED. Identifies the event. Producers MUST ensure that source + id is unique for each distinct event.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event Id</em>' attribute.
	 * @see #setEventId(String)
	 * @see io.cloudevents.model.ce.CloudEventsPackage#getCloudEvent_EventId()
	 * @model required="true"
	 * @generated
	 */
	String getEventId();

	/**
	 * Sets the value of the '{@link io.cloudevents.model.ce.CloudEvent#getEventId <em>Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Id</em>' attribute.
	 * @see #getEventId()
	 * @generated
	 */
	void setEventId(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * REQUIRED. Identifies the context in which an event happened. URI-reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see io.cloudevents.model.ce.CloudEventsPackage#getCloudEvent_Source()
	 * @model required="true"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link io.cloudevents.model.ce.CloudEvent#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Spec Version</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * REQUIRED. The version of the CloudEvents specification which the event uses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spec Version</em>' attribute.
	 * @see #setSpecVersion(String)
	 * @see io.cloudevents.model.ce.CloudEventsPackage#getCloudEvent_SpecVersion()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	String getSpecVersion();

	/**
	 * Sets the value of the '{@link io.cloudevents.model.ce.CloudEvent#getSpecVersion <em>Spec Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Version</em>' attribute.
	 * @see #getSpecVersion()
	 * @generated
	 */
	void setSpecVersion(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * REQUIRED. This attribute contains a value describing the type of event related to the originating occurrence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see io.cloudevents.model.ce.CloudEventsPackage#getCloudEvent_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link io.cloudevents.model.ce.CloudEvent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Datacontenttype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OPTIONAL. Content type of the data value. Must adhere to RFC 2046 format.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datacontenttype</em>' attribute.
	 * @see #setDatacontenttype(String)
	 * @see io.cloudevents.model.ce.CloudEventsPackage#getCloudEvent_Datacontenttype()
	 * @model
	 * @generated
	 */
	String getDatacontenttype();

	/**
	 * Sets the value of the '{@link io.cloudevents.model.ce.CloudEvent#getDatacontenttype <em>Datacontenttype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datacontenttype</em>' attribute.
	 * @see #getDatacontenttype()
	 * @generated
	 */
	void setDatacontenttype(String value);

	/**
	 * Returns the value of the '<em><b>Dataschema</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OPTIONAL. Identifies the schema that data adheres to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dataschema</em>' attribute.
	 * @see #setDataschema(String)
	 * @see io.cloudevents.model.ce.CloudEventsPackage#getCloudEvent_Dataschema()
	 * @model
	 * @generated
	 */
	String getDataschema();

	/**
	 * Sets the value of the '{@link io.cloudevents.model.ce.CloudEvent#getDataschema <em>Dataschema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataschema</em>' attribute.
	 * @see #getDataschema()
	 * @generated
	 */
	void setDataschema(String value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OPTIONAL. Describes the subject of the event in the context of the event producer (identified by source).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(String)
	 * @see io.cloudevents.model.ce.CloudEventsPackage#getCloudEvent_Subject()
	 * @model
	 * @generated
	 */
	String getSubject();

	/**
	 * Sets the value of the '{@link io.cloudevents.model.ce.CloudEvent#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OPTIONAL. Timestamp of when the occurrence happened. Must adhere to RFC 3339.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(Date)
	 * @see io.cloudevents.model.ce.CloudEventsPackage#getCloudEvent_Time()
	 * @model
	 * @generated
	 */
	Date getTime();

	/**
	 * Sets the value of the '{@link io.cloudevents.model.ce.CloudEvent#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Date value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OPTIONAL. Extension attributes for custom fields not in the spec.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extensions</em>' map.
	 * @see io.cloudevents.model.ce.CloudEventsPackage#getCloudEvent_Extensions()
	 * @model mapType="io.cloudevents.model.ce.ExtensionAttribute&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getExtensions();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OPTIONAL. The event payload.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' containment reference.
	 * @see #setData(EObject)
	 * @see io.cloudevents.model.ce.CloudEventsPackage#getCloudEvent_Data()
	 * @model containment="true"
	 * @generated
	 */
	EObject getData();

	/**
	 * Sets the value of the '{@link io.cloudevents.model.ce.CloudEvent#getData <em>Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' containment reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(EObject value);

} // CloudEvent
