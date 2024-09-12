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
package org.isotc211._2005.gmd;

import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PT Free Text Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.PTFreeTextPropertyType#getPTFreeText <em>PT Free Text</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getPTFreeTextPropertyType()
 * @model extendedMetaData="name='PT_FreeText_PropertyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PTFreeTextPropertyType extends CharacterStringPropertyType {
	/**
	 * Returns the value of the '<em><b>PT Free Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PT Free Text</em>' containment reference.
	 * @see #setPTFreeText(PTFreeTextType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getPTFreeTextPropertyType_PTFreeText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PT_FreeText' namespace='##targetNamespace'"
	 * @generated
	 */
	PTFreeTextType getPTFreeText();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.PTFreeTextPropertyType#getPTFreeText <em>PT Free Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PT Free Text</em>' containment reference.
	 * @see #getPTFreeText()
	 * @generated
	 */
	void setPTFreeText(PTFreeTextType value);

} // PTFreeTextPropertyType
