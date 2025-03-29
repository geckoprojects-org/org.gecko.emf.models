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
 * A representation of the model object '<em><b>TGateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TGateway#getGatewayDirection <em>Gateway Direction</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTGateway()
 * @model extendedMetaData="name='tGateway' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TGateway extends TFlowNode {
	/**
	 * Returns the value of the '<em><b>Gateway Direction</b></em>' attribute.
	 * The default value is <code>"Unspecified"</code>.
	 * The literals are from the enumeration {@link org.omg.spec.bpmn.bpmn.TGatewayDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Direction</em>' attribute.
	 * @see org.omg.spec.bpmn.bpmn.TGatewayDirection
	 * @see #isSetGatewayDirection()
	 * @see #unsetGatewayDirection()
	 * @see #setGatewayDirection(TGatewayDirection)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTGateway_GatewayDirection()
	 * @model default="Unspecified" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='gatewayDirection'"
	 * @generated
	 */
	TGatewayDirection getGatewayDirection();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TGateway#getGatewayDirection <em>Gateway Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Direction</em>' attribute.
	 * @see org.omg.spec.bpmn.bpmn.TGatewayDirection
	 * @see #isSetGatewayDirection()
	 * @see #unsetGatewayDirection()
	 * @see #getGatewayDirection()
	 * @generated
	 */
	void setGatewayDirection(TGatewayDirection value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.bpmn.bpmn.TGateway#getGatewayDirection <em>Gateway Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGatewayDirection()
	 * @see #getGatewayDirection()
	 * @see #setGatewayDirection(TGatewayDirection)
	 * @generated
	 */
	void unsetGatewayDirection();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.bpmn.bpmn.TGateway#getGatewayDirection <em>Gateway Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Gateway Direction</em>' attribute is set.
	 * @see #unsetGatewayDirection()
	 * @see #getGatewayDirection()
	 * @see #setGatewayDirection(TGatewayDirection)
	 * @generated
	 */
	boolean isSetGatewayDirection();

} // TGateway
