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
package org.omg.spec.bpmn.bpmn;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TEvent Based Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TEventBasedGateway#getEventGatewayType <em>Event Gateway Type</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TEventBasedGateway#isInstantiate <em>Instantiate</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTEventBasedGateway()
 * @model extendedMetaData="name='tEventBasedGateway' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TEventBasedGateway extends TGateway {
	/**
	 * Returns the value of the '<em><b>Event Gateway Type</b></em>' attribute.
	 * The default value is <code>"Exclusive"</code>.
	 * The literals are from the enumeration {@link org.omg.spec.bpmn.bpmn.TEventBasedGatewayType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Gateway Type</em>' attribute.
	 * @see org.omg.spec.bpmn.bpmn.TEventBasedGatewayType
	 * @see #isSetEventGatewayType()
	 * @see #unsetEventGatewayType()
	 * @see #setEventGatewayType(TEventBasedGatewayType)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTEventBasedGateway_EventGatewayType()
	 * @model default="Exclusive" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='eventGatewayType'"
	 * @generated
	 */
	TEventBasedGatewayType getEventGatewayType();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TEventBasedGateway#getEventGatewayType <em>Event Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Gateway Type</em>' attribute.
	 * @see org.omg.spec.bpmn.bpmn.TEventBasedGatewayType
	 * @see #isSetEventGatewayType()
	 * @see #unsetEventGatewayType()
	 * @see #getEventGatewayType()
	 * @generated
	 */
	void setEventGatewayType(TEventBasedGatewayType value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.bpmn.bpmn.TEventBasedGateway#getEventGatewayType <em>Event Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEventGatewayType()
	 * @see #getEventGatewayType()
	 * @see #setEventGatewayType(TEventBasedGatewayType)
	 * @generated
	 */
	void unsetEventGatewayType();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.bpmn.bpmn.TEventBasedGateway#getEventGatewayType <em>Event Gateway Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Event Gateway Type</em>' attribute is set.
	 * @see #unsetEventGatewayType()
	 * @see #getEventGatewayType()
	 * @see #setEventGatewayType(TEventBasedGatewayType)
	 * @generated
	 */
	boolean isSetEventGatewayType();

	/**
	 * Returns the value of the '<em><b>Instantiate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiate</em>' attribute.
	 * @see #isSetInstantiate()
	 * @see #unsetInstantiate()
	 * @see #setInstantiate(boolean)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTEventBasedGateway_Instantiate()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='instantiate'"
	 * @generated
	 */
	boolean isInstantiate();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TEventBasedGateway#isInstantiate <em>Instantiate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiate</em>' attribute.
	 * @see #isSetInstantiate()
	 * @see #unsetInstantiate()
	 * @see #isInstantiate()
	 * @generated
	 */
	void setInstantiate(boolean value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.bpmn.bpmn.TEventBasedGateway#isInstantiate <em>Instantiate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInstantiate()
	 * @see #isInstantiate()
	 * @see #setInstantiate(boolean)
	 * @generated
	 */
	void unsetInstantiate();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.bpmn.bpmn.TEventBasedGateway#isInstantiate <em>Instantiate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Instantiate</em>' attribute is set.
	 * @see #unsetInstantiate()
	 * @see #isInstantiate()
	 * @see #setInstantiate(boolean)
	 * @generated
	 */
	boolean isSetInstantiate();

} // TEventBasedGateway
