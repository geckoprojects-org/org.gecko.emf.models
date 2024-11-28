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
 * A representation of the model object '<em><b>Get Current Consent Template Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentTemplateResponse#getReturn <em>Return</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetCurrentConsentTemplateResponse()
 * @model extendedMetaData="name='getCurrentConsentTemplateResponse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface GetCurrentConsentTemplateResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' containment reference.
	 * @see #setReturn(ConsentTemplateDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getGetCurrentConsentTemplateResponse_Return()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='return'"
	 * @generated
	 */
	ConsentTemplateDTO getReturn();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.GetCurrentConsentTemplateResponse#getReturn <em>Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' containment reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(ConsentTemplateDTO value);

} // GetCurrentConsentTemplateResponse
