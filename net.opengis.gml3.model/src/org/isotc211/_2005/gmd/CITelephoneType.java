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
import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CI Telephone Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Telephone numbers for contacting the responsible individual or organisation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.CITelephoneType#getVoice <em>Voice</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.CITelephoneType#getFacsimile <em>Facsimile</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getCITelephoneType()
 * @model extendedMetaData="name='CI_Telephone_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CITelephoneType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Voice</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.CharacterStringPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voice</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getCITelephoneType_Voice()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='voice' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CharacterStringPropertyType> getVoice();

	/**
	 * Returns the value of the '<em><b>Facsimile</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.CharacterStringPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facsimile</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getCITelephoneType_Facsimile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='facsimile' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CharacterStringPropertyType> getFacsimile();

} // CITelephoneType
