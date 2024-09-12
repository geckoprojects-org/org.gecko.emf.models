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

import org.isotc211._2005.gco.BooleanPropertyType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.GenericNamePropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Feature Catalogue Description Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information identifing the feature catalogue
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDFeatureCatalogueDescriptionType#getComplianceCode <em>Compliance Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDFeatureCatalogueDescriptionType#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDFeatureCatalogueDescriptionType#getIncludedWithDataset <em>Included With Dataset</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDFeatureCatalogueDescriptionType#getFeatureTypes <em>Feature Types</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDFeatureCatalogueDescriptionType#getFeatureCatalogueCitation <em>Feature Catalogue Citation</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDFeatureCatalogueDescriptionType()
 * @model extendedMetaData="name='MD_FeatureCatalogueDescription_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDFeatureCatalogueDescriptionType extends AbstractMDContentInformationType {
	/**
	 * Returns the value of the '<em><b>Compliance Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compliance Code</em>' containment reference.
	 * @see #setComplianceCode(BooleanPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDFeatureCatalogueDescriptionType_ComplianceCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='complianceCode' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanPropertyType getComplianceCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDFeatureCatalogueDescriptionType#getComplianceCode <em>Compliance Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compliance Code</em>' containment reference.
	 * @see #getComplianceCode()
	 * @generated
	 */
	void setComplianceCode(BooleanPropertyType value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.CharacterStringPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDFeatureCatalogueDescriptionType_Language()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CharacterStringPropertyType> getLanguage();

	/**
	 * Returns the value of the '<em><b>Included With Dataset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included With Dataset</em>' containment reference.
	 * @see #setIncludedWithDataset(BooleanPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDFeatureCatalogueDescriptionType_IncludedWithDataset()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='includedWithDataset' namespace='##targetNamespace'"
	 * @generated
	 */
	BooleanPropertyType getIncludedWithDataset();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDFeatureCatalogueDescriptionType#getIncludedWithDataset <em>Included With Dataset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Included With Dataset</em>' containment reference.
	 * @see #getIncludedWithDataset()
	 * @generated
	 */
	void setIncludedWithDataset(BooleanPropertyType value);

	/**
	 * Returns the value of the '<em><b>Feature Types</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.GenericNamePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Types</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDFeatureCatalogueDescriptionType_FeatureTypes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='featureTypes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GenericNamePropertyType> getFeatureTypes();

	/**
	 * Returns the value of the '<em><b>Feature Catalogue Citation</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.CICitationPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Catalogue Citation</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDFeatureCatalogueDescriptionType_FeatureCatalogueCitation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='featureCatalogueCitation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CICitationPropertyType> getFeatureCatalogueCitation();

} // MDFeatureCatalogueDescriptionType
