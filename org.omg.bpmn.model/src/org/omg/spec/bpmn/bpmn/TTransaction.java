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
 * A representation of the model object '<em><b>TTransaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TTransaction#getMethod <em>Method</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTTransaction()
 * @model extendedMetaData="name='tTransaction' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TTransaction extends TSubProcess {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The default value is <code>"##Compensate"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #isSetMethod()
	 * @see #unsetMethod()
	 * @see #setMethod(Object)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTTransaction_Method()
	 * @model default="##Compensate" unsettable="true" dataType="org.omg.spec.bpmn.bpmn.TTransactionMethod"
	 *        extendedMetaData="kind='attribute' name='method'"
	 * @generated
	 */
	Object getMethod();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TTransaction#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #isSetMethod()
	 * @see #unsetMethod()
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Object value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.bpmn.bpmn.TTransaction#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMethod()
	 * @see #getMethod()
	 * @see #setMethod(Object)
	 * @generated
	 */
	void unsetMethod();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.bpmn.bpmn.TTransaction#getMethod <em>Method</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Method</em>' attribute is set.
	 * @see #unsetMethod()
	 * @see #getMethod()
	 * @see #setMethod(Object)
	 * @generated
	 */
	boolean isSetMethod();

} // TTransaction
