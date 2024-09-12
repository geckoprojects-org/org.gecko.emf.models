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
 * A representation of the model object '<em><b>MD Security Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Handling restrictions imposed on the dataset because of national security, privacy, or other concerns
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDSecurityConstraintsType#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDSecurityConstraintsType#getUserNote <em>User Note</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDSecurityConstraintsType#getClassificationSystem <em>Classification System</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDSecurityConstraintsType#getHandlingDescription <em>Handling Description</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDSecurityConstraintsType()
 * @model extendedMetaData="name='MD_SecurityConstraints_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDSecurityConstraintsType extends MDConstraintsType {
	/**
	 * Returns the value of the '<em><b>Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' containment reference.
	 * @see #setClassification(MDClassificationCodePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDSecurityConstraintsType_Classification()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='classification' namespace='##targetNamespace'"
	 * @generated
	 */
	MDClassificationCodePropertyType getClassification();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDSecurityConstraintsType#getClassification <em>Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' containment reference.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(MDClassificationCodePropertyType value);

	/**
	 * Returns the value of the '<em><b>User Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Note</em>' containment reference.
	 * @see #setUserNote(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDSecurityConstraintsType_UserNote()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='userNote' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getUserNote();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDSecurityConstraintsType#getUserNote <em>User Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Note</em>' containment reference.
	 * @see #getUserNote()
	 * @generated
	 */
	void setUserNote(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Classification System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification System</em>' containment reference.
	 * @see #setClassificationSystem(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDSecurityConstraintsType_ClassificationSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='classificationSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getClassificationSystem();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDSecurityConstraintsType#getClassificationSystem <em>Classification System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification System</em>' containment reference.
	 * @see #getClassificationSystem()
	 * @generated
	 */
	void setClassificationSystem(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Handling Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handling Description</em>' containment reference.
	 * @see #setHandlingDescription(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDSecurityConstraintsType_HandlingDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='handlingDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getHandlingDescription();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDSecurityConstraintsType#getHandlingDescription <em>Handling Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handling Description</em>' containment reference.
	 * @see #getHandlingDescription()
	 * @generated
	 */
	void setHandlingDescription(CharacterStringPropertyType value);

} // MDSecurityConstraintsType
