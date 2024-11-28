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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Type21</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.ReturnType21#getConsents <em>Consents</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getReturnType21()
 * @model extendedMetaData="name='return_._21_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ReturnType21 extends EObject {
	/**
	 * Returns the value of the '<em><b>Consents</b></em>' containment reference list.
	 * The list contents are of type {@link org.emau.icmvc.ganimed.ttp.cm2.ConsentLightDTO}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consents</em>' containment reference list.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getReturnType21_Consents()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='consents'"
	 * @generated
	 */
	EList<ConsentLightDTO> getConsents();

} // ReturnType21
