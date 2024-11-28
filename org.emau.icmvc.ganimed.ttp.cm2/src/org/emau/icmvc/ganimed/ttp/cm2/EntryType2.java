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
 * A representation of the model object '<em><b>Entry Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType2#getKey <em>Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType2#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getEntryType2()
 * @model extendedMetaData="name='entry_._2_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EntryType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' containment reference.
	 * @see #setKey(ModuleKeyDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getEntryType2_Key()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='key'"
	 * @generated
	 */
	ModuleKeyDTO getKey();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType2#getKey <em>Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' containment reference.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(ModuleKeyDTO value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(ModuleKeyDTOArray)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getEntryType2_Value()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='value'"
	 * @generated
	 */
	ModuleKeyDTOArray getValue();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.EntryType2#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ModuleKeyDTOArray value);

} // EntryType2
