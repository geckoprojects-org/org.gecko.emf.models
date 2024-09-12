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

import org.eclipse.emf.ecore.EObject;

import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PT Locale Container Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.PTLocaleContainerType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.PTLocaleContainerType#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.PTLocaleContainerType#getDate <em>Date</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.PTLocaleContainerType#getResponsibleParty <em>Responsible Party</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.PTLocaleContainerType#getLocalisedString <em>Localised String</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getPTLocaleContainerType()
 * @model extendedMetaData="name='PT_LocaleContainer_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PTLocaleContainerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getPTLocaleContainerType_Description()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getDescription();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.PTLocaleContainerType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Locale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale</em>' containment reference.
	 * @see #setLocale(PTLocalePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getPTLocaleContainerType_Locale()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='locale' namespace='##targetNamespace'"
	 * @generated
	 */
	PTLocalePropertyType getLocale();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.PTLocaleContainerType#getLocale <em>Locale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locale</em>' containment reference.
	 * @see #getLocale()
	 * @generated
	 */
	void setLocale(PTLocalePropertyType value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.CIDatePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getPTLocaleContainerType_Date()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CIDatePropertyType> getDate();

	/**
	 * Returns the value of the '<em><b>Responsible Party</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.CIResponsiblePartyPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Party</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getPTLocaleContainerType_ResponsibleParty()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='responsibleParty' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CIResponsiblePartyPropertyType> getResponsibleParty();

	/**
	 * Returns the value of the '<em><b>Localised String</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.LocalisedCharacterStringPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localised String</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getPTLocaleContainerType_LocalisedString()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='localisedString' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LocalisedCharacterStringPropertyType> getLocalisedString();

} // PTLocaleContainerType
