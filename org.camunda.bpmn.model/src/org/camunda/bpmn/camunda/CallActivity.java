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
package org.camunda.bpmn.camunda;

import org.omg.spec.bpmn.bpmn.TCallActivity;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.camunda.bpmn.camunda.CallActivity#getCalledElementBinding <em>Called Element Binding</em>}</li>
 *   <li>{@link org.camunda.bpmn.camunda.CallActivity#getCalledElementVersion <em>Called Element Version</em>}</li>
 * </ul>
 *
 * @see org.camunda.bpmn.camunda.CamundaPackage#getCallActivity()
 * @model extendedMetaData="name='tCallActivity' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CallActivity extends TCallActivity {
	/**
	 * Returns the value of the '<em><b>Called Element Binding</b></em>' attribute.
	 * The default value is <code>"latest"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Element Binding</em>' attribute.
	 * @see #setCalledElementBinding(String)
	 * @see org.camunda.bpmn.camunda.CamundaPackage#getCallActivity_CalledElementBinding()
	 * @model default="latest"
	 *        extendedMetaData="kind='attribute' name='calledElementBinding' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCalledElementBinding();

	/**
	 * Sets the value of the '{@link org.camunda.bpmn.camunda.CallActivity#getCalledElementBinding <em>Called Element Binding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Element Binding</em>' attribute.
	 * @see #getCalledElementBinding()
	 * @generated
	 */
	void setCalledElementBinding(String value);

	/**
	 * Returns the value of the '<em><b>Called Element Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Element Version</em>' attribute.
	 * @see #setCalledElementVersion(Integer)
	 * @see org.camunda.bpmn.camunda.CamundaPackage#getCallActivity_CalledElementVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IntObject"
	 *        extendedMetaData="kind='attribute' name='calledElementVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getCalledElementVersion();

	/**
	 * Sets the value of the '{@link org.camunda.bpmn.camunda.CallActivity#getCalledElementVersion <em>Called Element Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Element Version</em>' attribute.
	 * @see #getCalledElementVersion()
	 * @generated
	 */
	void setCalledElementVersion(Integer value);

} // CallActivity
