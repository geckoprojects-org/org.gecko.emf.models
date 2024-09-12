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

import org.eclipse.emf.common.util.EList;

import org.isotc211._2005.gco.AbstractObjectType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PT Free Text Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.PTFreeTextType#getTextGroup <em>Text Group</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getPTFreeTextType()
 * @model extendedMetaData="name='PT_FreeText_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PTFreeTextType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Text Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.LocalisedCharacterStringPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Group</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getPTFreeTextType_TextGroup()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='textGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocalisedCharacterStringPropertyType> getTextGroup();

} // PTFreeTextType
