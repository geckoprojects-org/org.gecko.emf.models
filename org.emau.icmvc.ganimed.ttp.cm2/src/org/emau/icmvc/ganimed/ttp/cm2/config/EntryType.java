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
package org.emau.icmvc.ganimed.ttp.cm2.config;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.EntryType#getKey <em>Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.config.EntryType#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getEntryType()
 * @model extendedMetaData="name='entry_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EntryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * The literals are from the enumeration {@link org.emau.icmvc.ganimed.ttp.cm2.config.ConsentField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConsentField
	 * @see #isSetKey()
	 * @see #unsetKey()
	 * @see #setKey(ConsentField)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getEntryType_Key()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='key'"
	 * @generated
	 */
	ConsentField getKey();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.EntryType#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConsentField
	 * @see #isSetKey()
	 * @see #unsetKey()
	 * @see #getKey()
	 * @generated
	 */
	void setKey(ConsentField value);

	/**
	 * Unsets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.EntryType#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKey()
	 * @see #getKey()
	 * @see #setKey(ConsentField)
	 * @generated
	 */
	void unsetKey();

	/**
	 * Returns whether the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.EntryType#getKey <em>Key</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Key</em>' attribute is set.
	 * @see #unsetKey()
	 * @see #getKey()
	 * @see #setKey(ConsentField)
	 * @generated
	 */
	boolean isSetKey();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.config.ConfigPackage#getEntryType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.config.EntryType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // EntryType
