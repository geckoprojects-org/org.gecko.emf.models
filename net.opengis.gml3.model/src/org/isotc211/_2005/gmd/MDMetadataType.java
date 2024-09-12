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
import org.isotc211._2005.gco.DatePropertyType;
import org.isotc211._2005.gco.ObjectReferencePropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Information about the metadata
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getFileIdentifier <em>File Identifier</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getCharacterSet <em>Character Set</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getParentIdentifier <em>Parent Identifier</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getHierarchyLevel <em>Hierarchy Level</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getHierarchyLevelName <em>Hierarchy Level Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getContact <em>Contact</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getDateStamp <em>Date Stamp</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getMetadataStandardName <em>Metadata Standard Name</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getMetadataStandardVersion <em>Metadata Standard Version</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getDataSetURI <em>Data Set URI</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getLocale <em>Locale</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getSpatialRepresentationInfo <em>Spatial Representation Info</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getReferenceSystemInfo <em>Reference System Info</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getMetadataExtensionInfo <em>Metadata Extension Info</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getIdentificationInfo <em>Identification Info</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getContentInfo <em>Content Info</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getDistributionInfo <em>Distribution Info</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getDataQualityInfo <em>Data Quality Info</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getPortrayalCatalogueInfo <em>Portrayal Catalogue Info</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getMetadataConstraints <em>Metadata Constraints</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getApplicationSchemaInfo <em>Application Schema Info</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getMetadataMaintenance <em>Metadata Maintenance</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getSeries <em>Series</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getDescribes <em>Describes</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getPropertyType <em>Property Type</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getFeatureType <em>Feature Type</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDMetadataType#getFeatureAttribute <em>Feature Attribute</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType()
 * @model extendedMetaData="name='MD_Metadata_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDMetadataType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>File Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Identifier</em>' containment reference.
	 * @see #setFileIdentifier(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_FileIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fileIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getFileIdentifier();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDMetadataType#getFileIdentifier <em>File Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Identifier</em>' containment reference.
	 * @see #getFileIdentifier()
	 * @generated
	 */
	void setFileIdentifier(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_Language()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getLanguage();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDMetadataType#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Character Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Set</em>' containment reference.
	 * @see #setCharacterSet(MDCharacterSetCodePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_CharacterSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='characterSet' namespace='##targetNamespace'"
	 * @generated
	 */
	MDCharacterSetCodePropertyType getCharacterSet();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDMetadataType#getCharacterSet <em>Character Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Set</em>' containment reference.
	 * @see #getCharacterSet()
	 * @generated
	 */
	void setCharacterSet(MDCharacterSetCodePropertyType value);

	/**
	 * Returns the value of the '<em><b>Parent Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Identifier</em>' containment reference.
	 * @see #setParentIdentifier(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_ParentIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parentIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getParentIdentifier();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDMetadataType#getParentIdentifier <em>Parent Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Identifier</em>' containment reference.
	 * @see #getParentIdentifier()
	 * @generated
	 */
	void setParentIdentifier(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Hierarchy Level</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDScopeCodePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy Level</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_HierarchyLevel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hierarchyLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDScopeCodePropertyType> getHierarchyLevel();

	/**
	 * Returns the value of the '<em><b>Hierarchy Level Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.CharacterStringPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchy Level Name</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_HierarchyLevelName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hierarchyLevelName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CharacterStringPropertyType> getHierarchyLevelName();

	/**
	 * Returns the value of the '<em><b>Contact</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.CIResponsiblePartyPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_Contact()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='contact' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CIResponsiblePartyPropertyType> getContact();

	/**
	 * Returns the value of the '<em><b>Date Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Stamp</em>' containment reference.
	 * @see #setDateStamp(DatePropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_DateStamp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='dateStamp' namespace='##targetNamespace'"
	 * @generated
	 */
	DatePropertyType getDateStamp();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDMetadataType#getDateStamp <em>Date Stamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Stamp</em>' containment reference.
	 * @see #getDateStamp()
	 * @generated
	 */
	void setDateStamp(DatePropertyType value);

	/**
	 * Returns the value of the '<em><b>Metadata Standard Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata Standard Name</em>' containment reference.
	 * @see #setMetadataStandardName(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_MetadataStandardName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='metadataStandardName' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getMetadataStandardName();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDMetadataType#getMetadataStandardName <em>Metadata Standard Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Standard Name</em>' containment reference.
	 * @see #getMetadataStandardName()
	 * @generated
	 */
	void setMetadataStandardName(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Metadata Standard Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata Standard Version</em>' containment reference.
	 * @see #setMetadataStandardVersion(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_MetadataStandardVersion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='metadataStandardVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getMetadataStandardVersion();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDMetadataType#getMetadataStandardVersion <em>Metadata Standard Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Standard Version</em>' containment reference.
	 * @see #getMetadataStandardVersion()
	 * @generated
	 */
	void setMetadataStandardVersion(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Data Set URI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set URI</em>' containment reference.
	 * @see #setDataSetURI(CharacterStringPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_DataSetURI()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataSetURI' namespace='##targetNamespace'"
	 * @generated
	 */
	CharacterStringPropertyType getDataSetURI();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDMetadataType#getDataSetURI <em>Data Set URI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set URI</em>' containment reference.
	 * @see #getDataSetURI()
	 * @generated
	 */
	void setDataSetURI(CharacterStringPropertyType value);

	/**
	 * Returns the value of the '<em><b>Locale</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.PTLocalePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locale</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_Locale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='locale' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PTLocalePropertyType> getLocale();

	/**
	 * Returns the value of the '<em><b>Spatial Representation Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDSpatialRepresentationPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spatial Representation Info</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_SpatialRepresentationInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='spatialRepresentationInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDSpatialRepresentationPropertyType> getSpatialRepresentationInfo();

	/**
	 * Returns the value of the '<em><b>Reference System Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDReferenceSystemPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference System Info</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_ReferenceSystemInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='referenceSystemInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDReferenceSystemPropertyType> getReferenceSystemInfo();

	/**
	 * Returns the value of the '<em><b>Metadata Extension Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDMetadataExtensionInformationPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata Extension Info</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_MetadataExtensionInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='metadataExtensionInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDMetadataExtensionInformationPropertyType> getMetadataExtensionInfo();

	/**
	 * Returns the value of the '<em><b>Identification Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDIdentificationPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identification Info</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_IdentificationInfo()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='identificationInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDIdentificationPropertyType> getIdentificationInfo();

	/**
	 * Returns the value of the '<em><b>Content Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDContentInformationPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Info</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_ContentInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='contentInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDContentInformationPropertyType> getContentInfo();

	/**
	 * Returns the value of the '<em><b>Distribution Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution Info</em>' containment reference.
	 * @see #setDistributionInfo(MDDistributionPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_DistributionInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='distributionInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	MDDistributionPropertyType getDistributionInfo();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDMetadataType#getDistributionInfo <em>Distribution Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution Info</em>' containment reference.
	 * @see #getDistributionInfo()
	 * @generated
	 */
	void setDistributionInfo(MDDistributionPropertyType value);

	/**
	 * Returns the value of the '<em><b>Data Quality Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.DQDataQualityPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Quality Info</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_DataQualityInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataQualityInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DQDataQualityPropertyType> getDataQualityInfo();

	/**
	 * Returns the value of the '<em><b>Portrayal Catalogue Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDPortrayalCatalogueReferencePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portrayal Catalogue Info</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_PortrayalCatalogueInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='portrayalCatalogueInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDPortrayalCatalogueReferencePropertyType> getPortrayalCatalogueInfo();

	/**
	 * Returns the value of the '<em><b>Metadata Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDConstraintsPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata Constraints</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_MetadataConstraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='metadataConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDConstraintsPropertyType> getMetadataConstraints();

	/**
	 * Returns the value of the '<em><b>Application Schema Info</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.MDApplicationSchemaInformationPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Schema Info</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_ApplicationSchemaInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applicationSchemaInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MDApplicationSchemaInformationPropertyType> getApplicationSchemaInfo();

	/**
	 * Returns the value of the '<em><b>Metadata Maintenance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata Maintenance</em>' containment reference.
	 * @see #setMetadataMaintenance(MDMaintenanceInformationPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_MetadataMaintenance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='metadataMaintenance' namespace='##targetNamespace'"
	 * @generated
	 */
	MDMaintenanceInformationPropertyType getMetadataMaintenance();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDMetadataType#getMetadataMaintenance <em>Metadata Maintenance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata Maintenance</em>' containment reference.
	 * @see #getMetadataMaintenance()
	 * @generated
	 */
	void setMetadataMaintenance(MDMaintenanceInformationPropertyType value);

	/**
	 * Returns the value of the '<em><b>Series</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.DSAggregatePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Series</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_Series()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='series' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DSAggregatePropertyType> getSeries();

	/**
	 * Returns the value of the '<em><b>Describes</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gmd.DSDataSetPropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Describes</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_Describes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='describes' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DSDataSetPropertyType> getDescribes();

	/**
	 * Returns the value of the '<em><b>Property Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.ObjectReferencePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Type</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_PropertyType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='propertyType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ObjectReferencePropertyType> getPropertyType();

	/**
	 * Returns the value of the '<em><b>Feature Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.ObjectReferencePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Type</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_FeatureType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='featureType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ObjectReferencePropertyType> getFeatureType();

	/**
	 * Returns the value of the '<em><b>Feature Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.isotc211._2005.gco.ObjectReferencePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Attribute</em>' containment reference list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDMetadataType_FeatureAttribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='featureAttribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ObjectReferencePropertyType> getFeatureAttribute();

} // MDMetadataType
