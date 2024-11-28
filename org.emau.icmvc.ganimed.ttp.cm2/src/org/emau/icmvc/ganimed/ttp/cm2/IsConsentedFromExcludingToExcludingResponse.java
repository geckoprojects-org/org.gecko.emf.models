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
 * A representation of the model object '<em><b>Is Consented From Excluding To Excluding Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcludingResponse#isReturn <em>Return</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getIsConsentedFromExcludingToExcludingResponse()
 * @model extendedMetaData="name='isConsentedFromExcludingToExcludingResponse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface IsConsentedFromExcludingToExcludingResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' attribute.
	 * @see #isSetReturn()
	 * @see #unsetReturn()
	 * @see #setReturn(boolean)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getIsConsentedFromExcludingToExcludingResponse_Return()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='return'"
	 * @generated
	 */
	boolean isReturn();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcludingResponse#isReturn <em>Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' attribute.
	 * @see #isSetReturn()
	 * @see #unsetReturn()
	 * @see #isReturn()
	 * @generated
	 */
	void setReturn(boolean value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcludingResponse#isReturn <em>Return</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReturn()
	 * @see #isReturn()
	 * @see #setReturn(boolean)
	 * @generated
	 */
	void unsetReturn();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.IsConsentedFromExcludingToExcludingResponse#isReturn <em>Return</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Return</em>' attribute is set.
	 * @see #unsetReturn()
	 * @see #isReturn()
	 * @see #setReturn(boolean)
	 * @generated
	 */
	boolean isSetReturn();

} // IsConsentedFromExcludingToExcludingResponse
