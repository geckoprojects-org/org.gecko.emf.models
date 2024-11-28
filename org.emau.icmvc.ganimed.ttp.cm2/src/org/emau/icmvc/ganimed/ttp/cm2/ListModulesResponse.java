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
package org.emau.icmvc.ganimed.ttp.cm2;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Modules Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ListModulesResponse#getReturn <em>Return</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getListModulesResponse()
 * @model extendedMetaData="name='listModulesResponse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ListModulesResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference.
	 * @see #isSetReturn()
	 * @see #unsetReturn()
	 * @see #setReturn(ReturnType1)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getListModulesResponse_Return()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='return'"
	 * @generated
	 */
	ReturnType1 getReturn();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ListModulesResponse#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' containment reference.
	 * @see #isSetReturn()
	 * @see #unsetReturn()
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(ReturnType1 value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ListModulesResponse#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReturn()
	 * @see #getReturn()
	 * @see #setReturn(ReturnType1)
	 * @generated
	 */
	void unsetReturn();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.ListModulesResponse#getReturn <em>Return</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Return</em>' containment reference is set.
	 * @see #unsetReturn()
	 * @see #getReturn()
	 * @see #setReturn(ReturnType1)
	 * @generated
	 */
	boolean isSetReturn();

} // ListModulesResponse
