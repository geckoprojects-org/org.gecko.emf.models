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
 * A representation of the model object '<em><b>Delete Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.DeleteModule#getModuleKey <em>Module Key</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDeleteModule()
 * @model extendedMetaData="name='deleteModule' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DeleteModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Module Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Key</em>' containment reference.
	 * @see #setModuleKey(ModuleKeyDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getDeleteModule_ModuleKey()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='moduleKey'"
	 * @generated
	 */
	ModuleKeyDTO getModuleKey();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.DeleteModule#getModuleKey <em>Module Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Key</em>' containment reference.
	 * @see #getModuleKey()
	 * @generated
	 */
	void setModuleKey(ModuleKeyDTO value);

} // DeleteModule
