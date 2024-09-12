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

import org.isotc211._2005.gco.CharacterStringPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Data Identification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDDataIdentificationType#getSpatialRepresentationType <em>Spatial Representation Type</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDDataIdentificationType#getSpatialResolution <em>Spatial Resolution</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDDataIdentificationType#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDDataIdentificationType#getCharacterSet <em>Character Set</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDDataIdentificationType#getTopicCategory <em>Topic Category</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDDataIdentificationType#getEnvironmentDescription <em>Environment Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDDataIdentificationType#getExtent <em>Extent</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDDataIdentificationType#getSupplementalInformation <em>Supplemental Information</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDDataIdentificationType()
 * @model extendedMetaData="name='MD_DataIdentification_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDDataIdentificationType extends AbstractMDIdentificationType {
	/**
	 * Returns the value of the '<em><b>Spatial Representation Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDSpatialRepresentationTypeCodePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial Representation Type</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDDataIdentificationType_SpatialRepresentationType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='spatialRepresentationType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDSpatialRepresentationTypeCodePropertyType> getSpatialRepresentationType();

	/**
	 * Returns the value of the '<em><b>Spatial Resolution</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDResolutionPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial Resolution</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDDataIdentificationType_SpatialResolution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='spatialResolution' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDResolutionPropertyType> getSpatialResolution();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.CharacterStringPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDDataIdentificationType_Language()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CharacterStringPropertyType> getLanguage();

	/**
	 * Returns the value of the '<em><b>Character Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDCharacterSetCodePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Set</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDDataIdentificationType_CharacterSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='characterSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDCharacterSetCodePropertyType> getCharacterSet();

	/**
	 * Returns the value of the '<em><b>Topic Category</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDTopicCategoryCodePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic Category</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDDataIdentificationType_TopicCategory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='topicCategory' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDTopicCategoryCodePropertyType> getTopicCategory();

	/**
	 * Returns the value of the '<em><b>Environment Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment Description</em>' containment reference.
	 * @see #setEnvironmentDescription(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDDataIdentificationType_EnvironmentDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='environmentDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getEnvironmentDescription();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDDataIdentificationType#getEnvironmentDescription <em>Environment Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment Description</em>' containment reference.
	 * @see #getEnvironmentDescription()
	 * @generated
	 */
	void setEnvironmentDescription(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Extent</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.EXExtentPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDDataIdentificationType_Extent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='extent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EXExtentPropertyType> getExtent();

	/**
	 * Returns the value of the '<em><b>Supplemental Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplemental Information</em>' containment reference.
	 * @see #setSupplementalInformation(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDDataIdentificationType_SupplementalInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supplementalInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getSupplementalInformation();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDDataIdentificationType#getSupplementalInformation <em>Supplemental Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplemental Information</em>' containment reference.
	 * @see #getSupplementalInformation()
	 * @generated
	 */
	void setSupplementalInformation(CharacterStringPropertyType value);

} // MDDataIdentificationType
