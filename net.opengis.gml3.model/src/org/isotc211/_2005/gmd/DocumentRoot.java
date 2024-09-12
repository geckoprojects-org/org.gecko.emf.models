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

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.isotc211._2005.gco.CodeListValueType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getAbstractDQCompleteness <em>Abstract DQ Completeness</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getAbstractDQElement <em>Abstract DQ Element</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getAbstractDQLogicalConsistency <em>Abstract DQ Logical Consistency</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getAbstractDQPositionalAccuracy <em>Abstract DQ Positional Accuracy</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getAbstractDQResult <em>Abstract DQ Result</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getAbstractDQTemporalAccuracy <em>Abstract DQ Temporal Accuracy</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getAbstractDQThematicAccuracy <em>Abstract DQ Thematic Accuracy</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getAbstractDSAggregate <em>Abstract DS Aggregate</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getAbstractEXGeographicExtent <em>Abstract EX Geographic Extent</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getAbstractMDContentInformation <em>Abstract MD Content Information</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getAbstractMDIdentification <em>Abstract MD Identification</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getAbstractMDSpatialRepresentation <em>Abstract MD Spatial Representation</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getAbstractRSReferenceSystem <em>Abstract RS Reference System</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getCIAddress <em>CI Address</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getCICitation <em>CI Citation</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getCIContact <em>CI Contact</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getCIDate <em>CI Date</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getCIDateTypeCode <em>CI Date Type Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getCIOnLineFunctionCode <em>CI On Line Function Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getCIOnlineResource <em>CI Online Resource</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getCIPresentationFormCode <em>CI Presentation Form Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getCIResponsibleParty <em>CI Responsible Party</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getCIRoleCode <em>CI Role Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getCISeries <em>CI Series</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getCITelephone <em>CI Telephone</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getCountry <em>Country</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDQAbsoluteExternalPositionalAccuracy <em>DQ Absolute External Positional Accuracy</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDQAccuracyOfATimeMeasurement <em>DQ Accuracy Of ATime Measurement</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDQCompletenessCommission <em>DQ Completeness Commission</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDQCompletenessOmission <em>DQ Completeness Omission</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDQConceptualConsistency <em>DQ Conceptual Consistency</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDQConformanceResult <em>DQ Conformance Result</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDQDataQuality <em>DQ Data Quality</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDQDomainConsistency <em>DQ Domain Consistency</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDQEvaluationMethodTypeCode <em>DQ Evaluation Method Type Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDQFormatConsistency <em>DQ Format Consistency</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDQGriddedDataPositionalAccuracy <em>DQ Gridded Data Positional Accuracy</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDQNonQuantitativeAttributeAccuracy <em>DQ Non Quantitative Attribute Accuracy</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDQQuantitativeAttributeAccuracy <em>DQ Quantitative Attribute Accuracy</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDQQuantitativeResult <em>DQ Quantitative Result</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDQRelativeInternalPositionalAccuracy <em>DQ Relative Internal Positional Accuracy</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDQScope <em>DQ Scope</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDQTemporalConsistency <em>DQ Temporal Consistency</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDQTemporalValidity <em>DQ Temporal Validity</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDQThematicClassificationCorrectness <em>DQ Thematic Classification Correctness</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDQTopologicalConsistency <em>DQ Topological Consistency</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDSAssociation <em>DS Association</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDSAssociationTypeCode <em>DS Association Type Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDSDataSet <em>DS Data Set</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDSInitiative <em>DS Initiative</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDSInitiativeTypeCode <em>DS Initiative Type Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDSOtherAggregate <em>DS Other Aggregate</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDSPlatform <em>DS Platform</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDSSeries <em>DS Series</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDSProductionSeries <em>DS Production Series</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDSSensor <em>DS Sensor</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getDSStereoMate <em>DS Stereo Mate</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getEXBoundingPolygon <em>EX Bounding Polygon</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getEXExtent <em>EX Extent</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getEXGeographicBoundingBox <em>EX Geographic Bounding Box</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getEXGeographicDescription <em>EX Geographic Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getEXSpatialTemporalExtent <em>EX Spatial Temporal Extent</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getEXTemporalExtent <em>EX Temporal Extent</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getEXVerticalExtent <em>EX Vertical Extent</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getLILineage <em>LI Lineage</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getLIProcessStep <em>LI Process Step</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getLISource <em>LI Source</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getLocalisedCharacterString <em>Localised Character String</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDAggregateInformation <em>MD Aggregate Information</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDApplicationSchemaInformation <em>MD Application Schema Information</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDBand <em>MD Band</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDRangeDimension <em>MD Range Dimension</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDBrowseGraphic <em>MD Browse Graphic</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDCellGeometryCode <em>MD Cell Geometry Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDCharacterSetCode <em>MD Character Set Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDClassificationCode <em>MD Classification Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDConstraints <em>MD Constraints</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDCoverageContentTypeCode <em>MD Coverage Content Type Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDCoverageDescription <em>MD Coverage Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDDataIdentification <em>MD Data Identification</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDDatatypeCode <em>MD Datatype Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDDigitalTransferOptions <em>MD Digital Transfer Options</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDDimension <em>MD Dimension</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDDimensionNameTypeCode <em>MD Dimension Name Type Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDDistribution <em>MD Distribution</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDDistributionUnits <em>MD Distribution Units</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDDistributor <em>MD Distributor</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDExtendedElementInformation <em>MD Extended Element Information</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDFeatureCatalogueDescription <em>MD Feature Catalogue Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDFormat <em>MD Format</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDGeometricObjects <em>MD Geometric Objects</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDGeometricObjectTypeCode <em>MD Geometric Object Type Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDGeorectified <em>MD Georectified</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDGridSpatialRepresentation <em>MD Grid Spatial Representation</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDGeoreferenceable <em>MD Georeferenceable</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDIdentifier <em>MD Identifier</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDImageDescription <em>MD Image Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDImagingConditionCode <em>MD Imaging Condition Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDKeywords <em>MD Keywords</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDKeywordTypeCode <em>MD Keyword Type Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDLegalConstraints <em>MD Legal Constraints</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDMaintenanceFrequencyCode <em>MD Maintenance Frequency Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDMaintenanceInformation <em>MD Maintenance Information</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDMedium <em>MD Medium</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDMediumFormatCode <em>MD Medium Format Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDMediumNameCode <em>MD Medium Name Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDMetadata <em>MD Metadata</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDMetadataExtensionInformation <em>MD Metadata Extension Information</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDObligationCode <em>MD Obligation Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDPixelOrientationCode <em>MD Pixel Orientation Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDPortrayalCatalogueReference <em>MD Portrayal Catalogue Reference</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDProgressCode <em>MD Progress Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDReferenceSystem <em>MD Reference System</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDRepresentativeFraction <em>MD Representative Fraction</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDResolution <em>MD Resolution</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDRestrictionCode <em>MD Restriction Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDScopeCode <em>MD Scope Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDScopeDescription <em>MD Scope Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDSecurityConstraints <em>MD Security Constraints</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDServiceIdentification <em>MD Service Identification</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDSpatialRepresentationTypeCode <em>MD Spatial Representation Type Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDStandardOrderProcess <em>MD Standard Order Process</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDTopicCategoryCode <em>MD Topic Category Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDTopologyLevelCode <em>MD Topology Level Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDUsage <em>MD Usage</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getMDVectorSpatialRepresentation <em>MD Vector Spatial Representation</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getPTFreeText <em>PT Free Text</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getPTLocale <em>PT Locale</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getPTLocaleContainer <em>PT Locale Container</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getRSIdentifier <em>RS Identifier</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.DocumentRoot#getURL <em>URL</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Abstract DQ Completeness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract DQ Completeness</em>' containment reference.
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_AbstractDQCompleteness()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractDQ_Completeness' namespace='##targetNamespace' affiliation='AbstractDQ_Element'"
	 * @generated
	 */
	AbstractDQCompletenessType getAbstractDQCompleteness();

	/**
	 * Returns the value of the '<em><b>Abstract DQ Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract DQ Element</em>' containment reference.
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_AbstractDQElement()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractDQ_Element' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractDQElementType getAbstractDQElement();

	/**
	 * Returns the value of the '<em><b>Abstract DQ Logical Consistency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract DQ Logical Consistency</em>' containment reference.
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_AbstractDQLogicalConsistency()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractDQ_LogicalConsistency' namespace='##targetNamespace' affiliation='AbstractDQ_Element'"
	 * @generated
	 */
	AbstractDQLogicalConsistencyType getAbstractDQLogicalConsistency();

	/**
	 * Returns the value of the '<em><b>Abstract DQ Positional Accuracy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract DQ Positional Accuracy</em>' containment reference.
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_AbstractDQPositionalAccuracy()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractDQ_PositionalAccuracy' namespace='##targetNamespace' affiliation='AbstractDQ_Element'"
	 * @generated
	 */
	AbstractDQPositionalAccuracyType getAbstractDQPositionalAccuracy();

	/**
	 * Returns the value of the '<em><b>Abstract DQ Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract DQ Result</em>' containment reference.
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_AbstractDQResult()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractDQ_Result' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractDQResultType getAbstractDQResult();

	/**
	 * Returns the value of the '<em><b>Abstract DQ Temporal Accuracy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract DQ Temporal Accuracy</em>' containment reference.
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_AbstractDQTemporalAccuracy()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractDQ_TemporalAccuracy' namespace='##targetNamespace' affiliation='AbstractDQ_Element'"
	 * @generated
	 */
	AbstractDQTemporalAccuracyType getAbstractDQTemporalAccuracy();

	/**
	 * Returns the value of the '<em><b>Abstract DQ Thematic Accuracy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract DQ Thematic Accuracy</em>' containment reference.
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_AbstractDQThematicAccuracy()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractDQ_ThematicAccuracy' namespace='##targetNamespace' affiliation='AbstractDQ_Element'"
	 * @generated
	 */
	AbstractDQThematicAccuracyType getAbstractDQThematicAccuracy();

	/**
	 * Returns the value of the '<em><b>Abstract DS Aggregate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract DS Aggregate</em>' containment reference.
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_AbstractDSAggregate()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractDS_Aggregate' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractDSAggregateType getAbstractDSAggregate();

	/**
	 * Returns the value of the '<em><b>Abstract EX Geographic Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract EX Geographic Extent</em>' containment reference.
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_AbstractEXGeographicExtent()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractEX_GeographicExtent' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractEXGeographicExtentType getAbstractEXGeographicExtent();

	/**
	 * Returns the value of the '<em><b>Abstract MD Content Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract MD Content Information</em>' containment reference.
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_AbstractMDContentInformation()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractMD_ContentInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractMDContentInformationType getAbstractMDContentInformation();

	/**
	 * Returns the value of the '<em><b>Abstract MD Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract MD Identification</em>' containment reference.
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_AbstractMDIdentification()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractMD_Identification' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractMDIdentificationType getAbstractMDIdentification();

	/**
	 * Returns the value of the '<em><b>Abstract MD Spatial Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract MD Spatial Representation</em>' containment reference.
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_AbstractMDSpatialRepresentation()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractMD_SpatialRepresentation' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractMDSpatialRepresentationType getAbstractMDSpatialRepresentation();

	/**
	 * Returns the value of the '<em><b>Abstract RS Reference System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract RS Reference System</em>' containment reference.
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_AbstractRSReferenceSystem()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractRS_ReferenceSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractRSReferenceSystemType getAbstractRSReferenceSystem();

	/**
	 * Returns the value of the '<em><b>CI Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CI Address</em>' containment reference.
	 * @see #setCIAddress(CIAddressType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_CIAddress()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CI_Address' namespace='##targetNamespace'"
	 * @generated
	 */
	CIAddressType getCIAddress();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getCIAddress <em>CI Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CI Address</em>' containment reference.
	 * @see #getCIAddress()
	 * @generated
	 */
	void setCIAddress(CIAddressType value);

	/**
	 * Returns the value of the '<em><b>CI Citation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CI Citation</em>' containment reference.
	 * @see #setCICitation(CICitationType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_CICitation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CI_Citation' namespace='##targetNamespace'"
	 * @generated
	 */
	CICitationType getCICitation();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getCICitation <em>CI Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CI Citation</em>' containment reference.
	 * @see #getCICitation()
	 * @generated
	 */
	void setCICitation(CICitationType value);

	/**
	 * Returns the value of the '<em><b>CI Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CI Contact</em>' containment reference.
	 * @see #setCIContact(CIContactType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_CIContact()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CI_Contact' namespace='##targetNamespace'"
	 * @generated
	 */
	CIContactType getCIContact();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getCIContact <em>CI Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CI Contact</em>' containment reference.
	 * @see #getCIContact()
	 * @generated
	 */
	void setCIContact(CIContactType value);

	/**
	 * Returns the value of the '<em><b>CI Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CI Date</em>' containment reference.
	 * @see #setCIDate(CIDateType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_CIDate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CI_Date' namespace='##targetNamespace'"
	 * @generated
	 */
	CIDateType getCIDate();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getCIDate <em>CI Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CI Date</em>' containment reference.
	 * @see #getCIDate()
	 * @generated
	 */
	void setCIDate(CIDateType value);

	/**
	 * Returns the value of the '<em><b>CI Date Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CI Date Type Code</em>' containment reference.
	 * @see #setCIDateTypeCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_CIDateTypeCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CI_DateTypeCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getCIDateTypeCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getCIDateTypeCode <em>CI Date Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CI Date Type Code</em>' containment reference.
	 * @see #getCIDateTypeCode()
	 * @generated
	 */
	void setCIDateTypeCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>CI On Line Function Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CI On Line Function Code</em>' containment reference.
	 * @see #setCIOnLineFunctionCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_CIOnLineFunctionCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CI_OnLineFunctionCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getCIOnLineFunctionCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getCIOnLineFunctionCode <em>CI On Line Function Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CI On Line Function Code</em>' containment reference.
	 * @see #getCIOnLineFunctionCode()
	 * @generated
	 */
	void setCIOnLineFunctionCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>CI Online Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CI Online Resource</em>' containment reference.
	 * @see #setCIOnlineResource(CIOnlineResourceType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_CIOnlineResource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CI_OnlineResource' namespace='##targetNamespace'"
	 * @generated
	 */
	CIOnlineResourceType getCIOnlineResource();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getCIOnlineResource <em>CI Online Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CI Online Resource</em>' containment reference.
	 * @see #getCIOnlineResource()
	 * @generated
	 */
	void setCIOnlineResource(CIOnlineResourceType value);

	/**
	 * Returns the value of the '<em><b>CI Presentation Form Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CI Presentation Form Code</em>' containment reference.
	 * @see #setCIPresentationFormCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_CIPresentationFormCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CI_PresentationFormCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getCIPresentationFormCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getCIPresentationFormCode <em>CI Presentation Form Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CI Presentation Form Code</em>' containment reference.
	 * @see #getCIPresentationFormCode()
	 * @generated
	 */
	void setCIPresentationFormCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>CI Responsible Party</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CI Responsible Party</em>' containment reference.
	 * @see #setCIResponsibleParty(CIResponsiblePartyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_CIResponsibleParty()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CI_ResponsibleParty' namespace='##targetNamespace'"
	 * @generated
	 */
	CIResponsiblePartyType getCIResponsibleParty();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getCIResponsibleParty <em>CI Responsible Party</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CI Responsible Party</em>' containment reference.
	 * @see #getCIResponsibleParty()
	 * @generated
	 */
	void setCIResponsibleParty(CIResponsiblePartyType value);

	/**
	 * Returns the value of the '<em><b>CI Role Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CI Role Code</em>' containment reference.
	 * @see #setCIRoleCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_CIRoleCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CI_RoleCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getCIRoleCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getCIRoleCode <em>CI Role Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CI Role Code</em>' containment reference.
	 * @see #getCIRoleCode()
	 * @generated
	 */
	void setCIRoleCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>CI Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CI Series</em>' containment reference.
	 * @see #setCISeries(CISeriesType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_CISeries()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CI_Series' namespace='##targetNamespace'"
	 * @generated
	 */
	CISeriesType getCISeries();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getCISeries <em>CI Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CI Series</em>' containment reference.
	 * @see #getCISeries()
	 * @generated
	 */
	void setCISeries(CISeriesType value);

	/**
	 * Returns the value of the '<em><b>CI Telephone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CI Telephone</em>' containment reference.
	 * @see #setCITelephone(CITelephoneType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_CITelephone()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CI_Telephone' namespace='##targetNamespace'"
	 * @generated
	 */
	CITelephoneType getCITelephone();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getCITelephone <em>CI Telephone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CI Telephone</em>' containment reference.
	 * @see #getCITelephone()
	 * @generated
	 */
	void setCITelephone(CITelephoneType value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' containment reference.
	 * @see #setCountry(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_Country()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Country' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getCountry();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getCountry <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' containment reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>DQ Absolute External Positional Accuracy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQ Absolute External Positional Accuracy</em>' containment reference.
	 * @see #setDQAbsoluteExternalPositionalAccuracy(DQAbsoluteExternalPositionalAccuracyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DQAbsoluteExternalPositionalAccuracy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DQ_AbsoluteExternalPositionalAccuracy' namespace='##targetNamespace' affiliation='AbstractDQ_PositionalAccuracy'"
	 * @generated
	 */
	DQAbsoluteExternalPositionalAccuracyType getDQAbsoluteExternalPositionalAccuracy();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDQAbsoluteExternalPositionalAccuracy <em>DQ Absolute External Positional Accuracy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQ Absolute External Positional Accuracy</em>' containment reference.
	 * @see #getDQAbsoluteExternalPositionalAccuracy()
	 * @generated
	 */
	void setDQAbsoluteExternalPositionalAccuracy(DQAbsoluteExternalPositionalAccuracyType value);

	/**
	 * Returns the value of the '<em><b>DQ Accuracy Of ATime Measurement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQ Accuracy Of ATime Measurement</em>' containment reference.
	 * @see #setDQAccuracyOfATimeMeasurement(DQAccuracyOfATimeMeasurementType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DQAccuracyOfATimeMeasurement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DQ_AccuracyOfATimeMeasurement' namespace='##targetNamespace' affiliation='AbstractDQ_TemporalAccuracy'"
	 * @generated
	 */
	DQAccuracyOfATimeMeasurementType getDQAccuracyOfATimeMeasurement();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDQAccuracyOfATimeMeasurement <em>DQ Accuracy Of ATime Measurement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQ Accuracy Of ATime Measurement</em>' containment reference.
	 * @see #getDQAccuracyOfATimeMeasurement()
	 * @generated
	 */
	void setDQAccuracyOfATimeMeasurement(DQAccuracyOfATimeMeasurementType value);

	/**
	 * Returns the value of the '<em><b>DQ Completeness Commission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQ Completeness Commission</em>' containment reference.
	 * @see #setDQCompletenessCommission(DQCompletenessCommissionType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DQCompletenessCommission()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DQ_CompletenessCommission' namespace='##targetNamespace' affiliation='AbstractDQ_Completeness'"
	 * @generated
	 */
	DQCompletenessCommissionType getDQCompletenessCommission();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDQCompletenessCommission <em>DQ Completeness Commission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQ Completeness Commission</em>' containment reference.
	 * @see #getDQCompletenessCommission()
	 * @generated
	 */
	void setDQCompletenessCommission(DQCompletenessCommissionType value);

	/**
	 * Returns the value of the '<em><b>DQ Completeness Omission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQ Completeness Omission</em>' containment reference.
	 * @see #setDQCompletenessOmission(DQCompletenessOmissionType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DQCompletenessOmission()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DQ_CompletenessOmission' namespace='##targetNamespace' affiliation='AbstractDQ_Completeness'"
	 * @generated
	 */
	DQCompletenessOmissionType getDQCompletenessOmission();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDQCompletenessOmission <em>DQ Completeness Omission</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQ Completeness Omission</em>' containment reference.
	 * @see #getDQCompletenessOmission()
	 * @generated
	 */
	void setDQCompletenessOmission(DQCompletenessOmissionType value);

	/**
	 * Returns the value of the '<em><b>DQ Conceptual Consistency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQ Conceptual Consistency</em>' containment reference.
	 * @see #setDQConceptualConsistency(DQConceptualConsistencyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DQConceptualConsistency()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DQ_ConceptualConsistency' namespace='##targetNamespace' affiliation='AbstractDQ_LogicalConsistency'"
	 * @generated
	 */
	DQConceptualConsistencyType getDQConceptualConsistency();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDQConceptualConsistency <em>DQ Conceptual Consistency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQ Conceptual Consistency</em>' containment reference.
	 * @see #getDQConceptualConsistency()
	 * @generated
	 */
	void setDQConceptualConsistency(DQConceptualConsistencyType value);

	/**
	 * Returns the value of the '<em><b>DQ Conformance Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQ Conformance Result</em>' containment reference.
	 * @see #setDQConformanceResult(DQConformanceResultType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DQConformanceResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DQ_ConformanceResult' namespace='##targetNamespace' affiliation='AbstractDQ_Result'"
	 * @generated
	 */
	DQConformanceResultType getDQConformanceResult();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDQConformanceResult <em>DQ Conformance Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQ Conformance Result</em>' containment reference.
	 * @see #getDQConformanceResult()
	 * @generated
	 */
	void setDQConformanceResult(DQConformanceResultType value);

	/**
	 * Returns the value of the '<em><b>DQ Data Quality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQ Data Quality</em>' containment reference.
	 * @see #setDQDataQuality(DQDataQualityType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DQDataQuality()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DQ_DataQuality' namespace='##targetNamespace'"
	 * @generated
	 */
	DQDataQualityType getDQDataQuality();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDQDataQuality <em>DQ Data Quality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQ Data Quality</em>' containment reference.
	 * @see #getDQDataQuality()
	 * @generated
	 */
	void setDQDataQuality(DQDataQualityType value);

	/**
	 * Returns the value of the '<em><b>DQ Domain Consistency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQ Domain Consistency</em>' containment reference.
	 * @see #setDQDomainConsistency(DQDomainConsistencyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DQDomainConsistency()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DQ_DomainConsistency' namespace='##targetNamespace' affiliation='AbstractDQ_LogicalConsistency'"
	 * @generated
	 */
	DQDomainConsistencyType getDQDomainConsistency();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDQDomainConsistency <em>DQ Domain Consistency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQ Domain Consistency</em>' containment reference.
	 * @see #getDQDomainConsistency()
	 * @generated
	 */
	void setDQDomainConsistency(DQDomainConsistencyType value);

	/**
	 * Returns the value of the '<em><b>DQ Evaluation Method Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQ Evaluation Method Type Code</em>' containment reference.
	 * @see #setDQEvaluationMethodTypeCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DQEvaluationMethodTypeCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DQ_EvaluationMethodTypeCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getDQEvaluationMethodTypeCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDQEvaluationMethodTypeCode <em>DQ Evaluation Method Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQ Evaluation Method Type Code</em>' containment reference.
	 * @see #getDQEvaluationMethodTypeCode()
	 * @generated
	 */
	void setDQEvaluationMethodTypeCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>DQ Format Consistency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQ Format Consistency</em>' containment reference.
	 * @see #setDQFormatConsistency(DQFormatConsistencyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DQFormatConsistency()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DQ_FormatConsistency' namespace='##targetNamespace' affiliation='AbstractDQ_LogicalConsistency'"
	 * @generated
	 */
	DQFormatConsistencyType getDQFormatConsistency();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDQFormatConsistency <em>DQ Format Consistency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQ Format Consistency</em>' containment reference.
	 * @see #getDQFormatConsistency()
	 * @generated
	 */
	void setDQFormatConsistency(DQFormatConsistencyType value);

	/**
	 * Returns the value of the '<em><b>DQ Gridded Data Positional Accuracy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQ Gridded Data Positional Accuracy</em>' containment reference.
	 * @see #setDQGriddedDataPositionalAccuracy(DQGriddedDataPositionalAccuracyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DQGriddedDataPositionalAccuracy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DQ_GriddedDataPositionalAccuracy' namespace='##targetNamespace' affiliation='AbstractDQ_PositionalAccuracy'"
	 * @generated
	 */
	DQGriddedDataPositionalAccuracyType getDQGriddedDataPositionalAccuracy();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDQGriddedDataPositionalAccuracy <em>DQ Gridded Data Positional Accuracy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQ Gridded Data Positional Accuracy</em>' containment reference.
	 * @see #getDQGriddedDataPositionalAccuracy()
	 * @generated
	 */
	void setDQGriddedDataPositionalAccuracy(DQGriddedDataPositionalAccuracyType value);

	/**
	 * Returns the value of the '<em><b>DQ Non Quantitative Attribute Accuracy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQ Non Quantitative Attribute Accuracy</em>' containment reference.
	 * @see #setDQNonQuantitativeAttributeAccuracy(DQNonQuantitativeAttributeAccuracyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DQNonQuantitativeAttributeAccuracy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DQ_NonQuantitativeAttributeAccuracy' namespace='##targetNamespace' affiliation='AbstractDQ_ThematicAccuracy'"
	 * @generated
	 */
	DQNonQuantitativeAttributeAccuracyType getDQNonQuantitativeAttributeAccuracy();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDQNonQuantitativeAttributeAccuracy <em>DQ Non Quantitative Attribute Accuracy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQ Non Quantitative Attribute Accuracy</em>' containment reference.
	 * @see #getDQNonQuantitativeAttributeAccuracy()
	 * @generated
	 */
	void setDQNonQuantitativeAttributeAccuracy(DQNonQuantitativeAttributeAccuracyType value);

	/**
	 * Returns the value of the '<em><b>DQ Quantitative Attribute Accuracy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQ Quantitative Attribute Accuracy</em>' containment reference.
	 * @see #setDQQuantitativeAttributeAccuracy(DQQuantitativeAttributeAccuracyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DQQuantitativeAttributeAccuracy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DQ_QuantitativeAttributeAccuracy' namespace='##targetNamespace' affiliation='AbstractDQ_ThematicAccuracy'"
	 * @generated
	 */
	DQQuantitativeAttributeAccuracyType getDQQuantitativeAttributeAccuracy();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDQQuantitativeAttributeAccuracy <em>DQ Quantitative Attribute Accuracy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQ Quantitative Attribute Accuracy</em>' containment reference.
	 * @see #getDQQuantitativeAttributeAccuracy()
	 * @generated
	 */
	void setDQQuantitativeAttributeAccuracy(DQQuantitativeAttributeAccuracyType value);

	/**
	 * Returns the value of the '<em><b>DQ Quantitative Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQ Quantitative Result</em>' containment reference.
	 * @see #setDQQuantitativeResult(DQQuantitativeResultType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DQQuantitativeResult()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DQ_QuantitativeResult' namespace='##targetNamespace' affiliation='AbstractDQ_Result'"
	 * @generated
	 */
	DQQuantitativeResultType getDQQuantitativeResult();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDQQuantitativeResult <em>DQ Quantitative Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQ Quantitative Result</em>' containment reference.
	 * @see #getDQQuantitativeResult()
	 * @generated
	 */
	void setDQQuantitativeResult(DQQuantitativeResultType value);

	/**
	 * Returns the value of the '<em><b>DQ Relative Internal Positional Accuracy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQ Relative Internal Positional Accuracy</em>' containment reference.
	 * @see #setDQRelativeInternalPositionalAccuracy(DQRelativeInternalPositionalAccuracyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DQRelativeInternalPositionalAccuracy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DQ_RelativeInternalPositionalAccuracy' namespace='##targetNamespace' affiliation='AbstractDQ_PositionalAccuracy'"
	 * @generated
	 */
	DQRelativeInternalPositionalAccuracyType getDQRelativeInternalPositionalAccuracy();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDQRelativeInternalPositionalAccuracy <em>DQ Relative Internal Positional Accuracy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQ Relative Internal Positional Accuracy</em>' containment reference.
	 * @see #getDQRelativeInternalPositionalAccuracy()
	 * @generated
	 */
	void setDQRelativeInternalPositionalAccuracy(DQRelativeInternalPositionalAccuracyType value);

	/**
	 * Returns the value of the '<em><b>DQ Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQ Scope</em>' containment reference.
	 * @see #setDQScope(DQScopeType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DQScope()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DQ_Scope' namespace='##targetNamespace'"
	 * @generated
	 */
	DQScopeType getDQScope();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDQScope <em>DQ Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQ Scope</em>' containment reference.
	 * @see #getDQScope()
	 * @generated
	 */
	void setDQScope(DQScopeType value);

	/**
	 * Returns the value of the '<em><b>DQ Temporal Consistency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQ Temporal Consistency</em>' containment reference.
	 * @see #setDQTemporalConsistency(DQTemporalConsistencyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DQTemporalConsistency()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DQ_TemporalConsistency' namespace='##targetNamespace' affiliation='AbstractDQ_TemporalAccuracy'"
	 * @generated
	 */
	DQTemporalConsistencyType getDQTemporalConsistency();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDQTemporalConsistency <em>DQ Temporal Consistency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQ Temporal Consistency</em>' containment reference.
	 * @see #getDQTemporalConsistency()
	 * @generated
	 */
	void setDQTemporalConsistency(DQTemporalConsistencyType value);

	/**
	 * Returns the value of the '<em><b>DQ Temporal Validity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQ Temporal Validity</em>' containment reference.
	 * @see #setDQTemporalValidity(DQTemporalValidityType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DQTemporalValidity()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DQ_TemporalValidity' namespace='##targetNamespace' affiliation='AbstractDQ_TemporalAccuracy'"
	 * @generated
	 */
	DQTemporalValidityType getDQTemporalValidity();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDQTemporalValidity <em>DQ Temporal Validity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQ Temporal Validity</em>' containment reference.
	 * @see #getDQTemporalValidity()
	 * @generated
	 */
	void setDQTemporalValidity(DQTemporalValidityType value);

	/**
	 * Returns the value of the '<em><b>DQ Thematic Classification Correctness</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQ Thematic Classification Correctness</em>' containment reference.
	 * @see #setDQThematicClassificationCorrectness(DQThematicClassificationCorrectnessType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DQThematicClassificationCorrectness()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DQ_ThematicClassificationCorrectness' namespace='##targetNamespace' affiliation='AbstractDQ_ThematicAccuracy'"
	 * @generated
	 */
	DQThematicClassificationCorrectnessType getDQThematicClassificationCorrectness();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDQThematicClassificationCorrectness <em>DQ Thematic Classification Correctness</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQ Thematic Classification Correctness</em>' containment reference.
	 * @see #getDQThematicClassificationCorrectness()
	 * @generated
	 */
	void setDQThematicClassificationCorrectness(DQThematicClassificationCorrectnessType value);

	/**
	 * Returns the value of the '<em><b>DQ Topological Consistency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DQ Topological Consistency</em>' containment reference.
	 * @see #setDQTopologicalConsistency(DQTopologicalConsistencyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DQTopologicalConsistency()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DQ_TopologicalConsistency' namespace='##targetNamespace' affiliation='AbstractDQ_LogicalConsistency'"
	 * @generated
	 */
	DQTopologicalConsistencyType getDQTopologicalConsistency();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDQTopologicalConsistency <em>DQ Topological Consistency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DQ Topological Consistency</em>' containment reference.
	 * @see #getDQTopologicalConsistency()
	 * @generated
	 */
	void setDQTopologicalConsistency(DQTopologicalConsistencyType value);

	/**
	 * Returns the value of the '<em><b>DS Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DS Association</em>' containment reference.
	 * @see #setDSAssociation(DSAssociationType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DSAssociation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DS_Association' namespace='##targetNamespace'"
	 * @generated
	 */
	DSAssociationType getDSAssociation();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDSAssociation <em>DS Association</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DS Association</em>' containment reference.
	 * @see #getDSAssociation()
	 * @generated
	 */
	void setDSAssociation(DSAssociationType value);

	/**
	 * Returns the value of the '<em><b>DS Association Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DS Association Type Code</em>' containment reference.
	 * @see #setDSAssociationTypeCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DSAssociationTypeCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DS_AssociationTypeCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getDSAssociationTypeCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDSAssociationTypeCode <em>DS Association Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DS Association Type Code</em>' containment reference.
	 * @see #getDSAssociationTypeCode()
	 * @generated
	 */
	void setDSAssociationTypeCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>DS Data Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DS Data Set</em>' containment reference.
	 * @see #setDSDataSet(DSDataSetType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DSDataSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DS_DataSet' namespace='##targetNamespace'"
	 * @generated
	 */
	DSDataSetType getDSDataSet();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDSDataSet <em>DS Data Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DS Data Set</em>' containment reference.
	 * @see #getDSDataSet()
	 * @generated
	 */
	void setDSDataSet(DSDataSetType value);

	/**
	 * Returns the value of the '<em><b>DS Initiative</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DS Initiative</em>' containment reference.
	 * @see #setDSInitiative(DSInitiativeType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DSInitiative()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DS_Initiative' namespace='##targetNamespace' affiliation='AbstractDS_Aggregate'"
	 * @generated
	 */
	DSInitiativeType getDSInitiative();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDSInitiative <em>DS Initiative</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DS Initiative</em>' containment reference.
	 * @see #getDSInitiative()
	 * @generated
	 */
	void setDSInitiative(DSInitiativeType value);

	/**
	 * Returns the value of the '<em><b>DS Initiative Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DS Initiative Type Code</em>' containment reference.
	 * @see #setDSInitiativeTypeCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DSInitiativeTypeCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DS_InitiativeTypeCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getDSInitiativeTypeCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDSInitiativeTypeCode <em>DS Initiative Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DS Initiative Type Code</em>' containment reference.
	 * @see #getDSInitiativeTypeCode()
	 * @generated
	 */
	void setDSInitiativeTypeCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>DS Other Aggregate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DS Other Aggregate</em>' containment reference.
	 * @see #setDSOtherAggregate(DSOtherAggregateType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DSOtherAggregate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DS_OtherAggregate' namespace='##targetNamespace' affiliation='AbstractDS_Aggregate'"
	 * @generated
	 */
	DSOtherAggregateType getDSOtherAggregate();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDSOtherAggregate <em>DS Other Aggregate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DS Other Aggregate</em>' containment reference.
	 * @see #getDSOtherAggregate()
	 * @generated
	 */
	void setDSOtherAggregate(DSOtherAggregateType value);

	/**
	 * Returns the value of the '<em><b>DS Platform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DS Platform</em>' containment reference.
	 * @see #setDSPlatform(DSPlatformType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DSPlatform()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DS_Platform' namespace='##targetNamespace' affiliation='DS_Series'"
	 * @generated
	 */
	DSPlatformType getDSPlatform();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDSPlatform <em>DS Platform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DS Platform</em>' containment reference.
	 * @see #getDSPlatform()
	 * @generated
	 */
	void setDSPlatform(DSPlatformType value);

	/**
	 * Returns the value of the '<em><b>DS Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DS Series</em>' containment reference.
	 * @see #setDSSeries(DSSeriesType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DSSeries()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DS_Series' namespace='##targetNamespace' affiliation='AbstractDS_Aggregate'"
	 * @generated
	 */
	DSSeriesType getDSSeries();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDSSeries <em>DS Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DS Series</em>' containment reference.
	 * @see #getDSSeries()
	 * @generated
	 */
	void setDSSeries(DSSeriesType value);

	/**
	 * Returns the value of the '<em><b>DS Production Series</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DS Production Series</em>' containment reference.
	 * @see #setDSProductionSeries(DSProductionSeriesType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DSProductionSeries()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DS_ProductionSeries' namespace='##targetNamespace' affiliation='DS_Series'"
	 * @generated
	 */
	DSProductionSeriesType getDSProductionSeries();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDSProductionSeries <em>DS Production Series</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DS Production Series</em>' containment reference.
	 * @see #getDSProductionSeries()
	 * @generated
	 */
	void setDSProductionSeries(DSProductionSeriesType value);

	/**
	 * Returns the value of the '<em><b>DS Sensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DS Sensor</em>' containment reference.
	 * @see #setDSSensor(DSSensorType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DSSensor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DS_Sensor' namespace='##targetNamespace' affiliation='DS_Series'"
	 * @generated
	 */
	DSSensorType getDSSensor();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDSSensor <em>DS Sensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DS Sensor</em>' containment reference.
	 * @see #getDSSensor()
	 * @generated
	 */
	void setDSSensor(DSSensorType value);

	/**
	 * Returns the value of the '<em><b>DS Stereo Mate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DS Stereo Mate</em>' containment reference.
	 * @see #setDSStereoMate(DSStereoMateType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_DSStereoMate()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DS_StereoMate' namespace='##targetNamespace' affiliation='DS_OtherAggregate'"
	 * @generated
	 */
	DSStereoMateType getDSStereoMate();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getDSStereoMate <em>DS Stereo Mate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DS Stereo Mate</em>' containment reference.
	 * @see #getDSStereoMate()
	 * @generated
	 */
	void setDSStereoMate(DSStereoMateType value);

	/**
	 * Returns the value of the '<em><b>EX Bounding Polygon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EX Bounding Polygon</em>' containment reference.
	 * @see #setEXBoundingPolygon(EXBoundingPolygonType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_EXBoundingPolygon()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EX_BoundingPolygon' namespace='##targetNamespace' affiliation='AbstractEX_GeographicExtent'"
	 * @generated
	 */
	EXBoundingPolygonType getEXBoundingPolygon();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getEXBoundingPolygon <em>EX Bounding Polygon</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EX Bounding Polygon</em>' containment reference.
	 * @see #getEXBoundingPolygon()
	 * @generated
	 */
	void setEXBoundingPolygon(EXBoundingPolygonType value);

	/**
	 * Returns the value of the '<em><b>EX Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EX Extent</em>' containment reference.
	 * @see #setEXExtent(EXExtentType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_EXExtent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EX_Extent' namespace='##targetNamespace'"
	 * @generated
	 */
	EXExtentType getEXExtent();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getEXExtent <em>EX Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EX Extent</em>' containment reference.
	 * @see #getEXExtent()
	 * @generated
	 */
	void setEXExtent(EXExtentType value);

	/**
	 * Returns the value of the '<em><b>EX Geographic Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EX Geographic Bounding Box</em>' containment reference.
	 * @see #setEXGeographicBoundingBox(EXGeographicBoundingBoxType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_EXGeographicBoundingBox()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EX_GeographicBoundingBox' namespace='##targetNamespace' affiliation='AbstractEX_GeographicExtent'"
	 * @generated
	 */
	EXGeographicBoundingBoxType getEXGeographicBoundingBox();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getEXGeographicBoundingBox <em>EX Geographic Bounding Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EX Geographic Bounding Box</em>' containment reference.
	 * @see #getEXGeographicBoundingBox()
	 * @generated
	 */
	void setEXGeographicBoundingBox(EXGeographicBoundingBoxType value);

	/**
	 * Returns the value of the '<em><b>EX Geographic Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EX Geographic Description</em>' containment reference.
	 * @see #setEXGeographicDescription(EXGeographicDescriptionType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_EXGeographicDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EX_GeographicDescription' namespace='##targetNamespace' affiliation='AbstractEX_GeographicExtent'"
	 * @generated
	 */
	EXGeographicDescriptionType getEXGeographicDescription();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getEXGeographicDescription <em>EX Geographic Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EX Geographic Description</em>' containment reference.
	 * @see #getEXGeographicDescription()
	 * @generated
	 */
	void setEXGeographicDescription(EXGeographicDescriptionType value);

	/**
	 * Returns the value of the '<em><b>EX Spatial Temporal Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EX Spatial Temporal Extent</em>' containment reference.
	 * @see #setEXSpatialTemporalExtent(EXSpatialTemporalExtentType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_EXSpatialTemporalExtent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EX_SpatialTemporalExtent' namespace='##targetNamespace' affiliation='EX_TemporalExtent'"
	 * @generated
	 */
	EXSpatialTemporalExtentType getEXSpatialTemporalExtent();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getEXSpatialTemporalExtent <em>EX Spatial Temporal Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EX Spatial Temporal Extent</em>' containment reference.
	 * @see #getEXSpatialTemporalExtent()
	 * @generated
	 */
	void setEXSpatialTemporalExtent(EXSpatialTemporalExtentType value);

	/**
	 * Returns the value of the '<em><b>EX Temporal Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EX Temporal Extent</em>' containment reference.
	 * @see #setEXTemporalExtent(EXTemporalExtentType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_EXTemporalExtent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EX_TemporalExtent' namespace='##targetNamespace'"
	 * @generated
	 */
	EXTemporalExtentType getEXTemporalExtent();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getEXTemporalExtent <em>EX Temporal Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EX Temporal Extent</em>' containment reference.
	 * @see #getEXTemporalExtent()
	 * @generated
	 */
	void setEXTemporalExtent(EXTemporalExtentType value);

	/**
	 * Returns the value of the '<em><b>EX Vertical Extent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EX Vertical Extent</em>' containment reference.
	 * @see #setEXVerticalExtent(EXVerticalExtentType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_EXVerticalExtent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EX_VerticalExtent' namespace='##targetNamespace'"
	 * @generated
	 */
	EXVerticalExtentType getEXVerticalExtent();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getEXVerticalExtent <em>EX Vertical Extent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EX Vertical Extent</em>' containment reference.
	 * @see #getEXVerticalExtent()
	 * @generated
	 */
	void setEXVerticalExtent(EXVerticalExtentType value);

	/**
	 * Returns the value of the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Code</em>' containment reference.
	 * @see #setLanguageCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_LanguageCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LanguageCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getLanguageCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getLanguageCode <em>Language Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Code</em>' containment reference.
	 * @see #getLanguageCode()
	 * @generated
	 */
	void setLanguageCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>LI Lineage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LI Lineage</em>' containment reference.
	 * @see #setLILineage(LILineageType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_LILineage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LI_Lineage' namespace='##targetNamespace'"
	 * @generated
	 */
	LILineageType getLILineage();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getLILineage <em>LI Lineage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LI Lineage</em>' containment reference.
	 * @see #getLILineage()
	 * @generated
	 */
	void setLILineage(LILineageType value);

	/**
	 * Returns the value of the '<em><b>LI Process Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LI Process Step</em>' containment reference.
	 * @see #setLIProcessStep(LIProcessStepType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_LIProcessStep()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LI_ProcessStep' namespace='##targetNamespace'"
	 * @generated
	 */
	LIProcessStepType getLIProcessStep();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getLIProcessStep <em>LI Process Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LI Process Step</em>' containment reference.
	 * @see #getLIProcessStep()
	 * @generated
	 */
	void setLIProcessStep(LIProcessStepType value);

	/**
	 * Returns the value of the '<em><b>LI Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LI Source</em>' containment reference.
	 * @see #setLISource(LISourceType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_LISource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LI_Source' namespace='##targetNamespace'"
	 * @generated
	 */
	LISourceType getLISource();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getLISource <em>LI Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LI Source</em>' containment reference.
	 * @see #getLISource()
	 * @generated
	 */
	void setLISource(LISourceType value);

	/**
	 * Returns the value of the '<em><b>Localised Character String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Localised Character String</em>' containment reference.
	 * @see #setLocalisedCharacterString(LocalisedCharacterStringType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_LocalisedCharacterString()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LocalisedCharacterString' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	LocalisedCharacterStringType getLocalisedCharacterString();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getLocalisedCharacterString <em>Localised Character String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Localised Character String</em>' containment reference.
	 * @see #getLocalisedCharacterString()
	 * @generated
	 */
	void setLocalisedCharacterString(LocalisedCharacterStringType value);

	/**
	 * Returns the value of the '<em><b>MD Aggregate Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Aggregate Information</em>' containment reference.
	 * @see #setMDAggregateInformation(MDAggregateInformationType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDAggregateInformation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_AggregateInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	MDAggregateInformationType getMDAggregateInformation();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDAggregateInformation <em>MD Aggregate Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Aggregate Information</em>' containment reference.
	 * @see #getMDAggregateInformation()
	 * @generated
	 */
	void setMDAggregateInformation(MDAggregateInformationType value);

	/**
	 * Returns the value of the '<em><b>MD Application Schema Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Application Schema Information</em>' containment reference.
	 * @see #setMDApplicationSchemaInformation(MDApplicationSchemaInformationType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDApplicationSchemaInformation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_ApplicationSchemaInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	MDApplicationSchemaInformationType getMDApplicationSchemaInformation();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDApplicationSchemaInformation <em>MD Application Schema Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Application Schema Information</em>' containment reference.
	 * @see #getMDApplicationSchemaInformation()
	 * @generated
	 */
	void setMDApplicationSchemaInformation(MDApplicationSchemaInformationType value);

	/**
	 * Returns the value of the '<em><b>MD Band</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Band</em>' containment reference.
	 * @see #setMDBand(MDBandType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDBand()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_Band' namespace='##targetNamespace' affiliation='MD_RangeDimension'"
	 * @generated
	 */
	MDBandType getMDBand();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDBand <em>MD Band</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Band</em>' containment reference.
	 * @see #getMDBand()
	 * @generated
	 */
	void setMDBand(MDBandType value);

	/**
	 * Returns the value of the '<em><b>MD Range Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Range Dimension</em>' containment reference.
	 * @see #setMDRangeDimension(MDRangeDimensionType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDRangeDimension()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_RangeDimension' namespace='##targetNamespace'"
	 * @generated
	 */
	MDRangeDimensionType getMDRangeDimension();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDRangeDimension <em>MD Range Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Range Dimension</em>' containment reference.
	 * @see #getMDRangeDimension()
	 * @generated
	 */
	void setMDRangeDimension(MDRangeDimensionType value);

	/**
	 * Returns the value of the '<em><b>MD Browse Graphic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Browse Graphic</em>' containment reference.
	 * @see #setMDBrowseGraphic(MDBrowseGraphicType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDBrowseGraphic()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_BrowseGraphic' namespace='##targetNamespace'"
	 * @generated
	 */
	MDBrowseGraphicType getMDBrowseGraphic();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDBrowseGraphic <em>MD Browse Graphic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Browse Graphic</em>' containment reference.
	 * @see #getMDBrowseGraphic()
	 * @generated
	 */
	void setMDBrowseGraphic(MDBrowseGraphicType value);

	/**
	 * Returns the value of the '<em><b>MD Cell Geometry Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Cell Geometry Code</em>' containment reference.
	 * @see #setMDCellGeometryCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDCellGeometryCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_CellGeometryCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getMDCellGeometryCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDCellGeometryCode <em>MD Cell Geometry Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Cell Geometry Code</em>' containment reference.
	 * @see #getMDCellGeometryCode()
	 * @generated
	 */
	void setMDCellGeometryCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>MD Character Set Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Character Set Code</em>' containment reference.
	 * @see #setMDCharacterSetCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDCharacterSetCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_CharacterSetCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getMDCharacterSetCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDCharacterSetCode <em>MD Character Set Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Character Set Code</em>' containment reference.
	 * @see #getMDCharacterSetCode()
	 * @generated
	 */
	void setMDCharacterSetCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>MD Classification Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Classification Code</em>' containment reference.
	 * @see #setMDClassificationCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDClassificationCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_ClassificationCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getMDClassificationCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDClassificationCode <em>MD Classification Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Classification Code</em>' containment reference.
	 * @see #getMDClassificationCode()
	 * @generated
	 */
	void setMDClassificationCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>MD Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Constraints</em>' containment reference.
	 * @see #setMDConstraints(MDConstraintsType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDConstraints()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_Constraints' namespace='##targetNamespace'"
	 * @generated
	 */
	MDConstraintsType getMDConstraints();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDConstraints <em>MD Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Constraints</em>' containment reference.
	 * @see #getMDConstraints()
	 * @generated
	 */
	void setMDConstraints(MDConstraintsType value);

	/**
	 * Returns the value of the '<em><b>MD Coverage Content Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Coverage Content Type Code</em>' containment reference.
	 * @see #setMDCoverageContentTypeCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDCoverageContentTypeCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_CoverageContentTypeCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getMDCoverageContentTypeCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDCoverageContentTypeCode <em>MD Coverage Content Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Coverage Content Type Code</em>' containment reference.
	 * @see #getMDCoverageContentTypeCode()
	 * @generated
	 */
	void setMDCoverageContentTypeCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>MD Coverage Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Coverage Description</em>' containment reference.
	 * @see #setMDCoverageDescription(MDCoverageDescriptionType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDCoverageDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_CoverageDescription' namespace='##targetNamespace' affiliation='AbstractMD_ContentInformation'"
	 * @generated
	 */
	MDCoverageDescriptionType getMDCoverageDescription();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDCoverageDescription <em>MD Coverage Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Coverage Description</em>' containment reference.
	 * @see #getMDCoverageDescription()
	 * @generated
	 */
	void setMDCoverageDescription(MDCoverageDescriptionType value);

	/**
	 * Returns the value of the '<em><b>MD Data Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Data Identification</em>' containment reference.
	 * @see #setMDDataIdentification(MDDataIdentificationType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDDataIdentification()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_DataIdentification' namespace='##targetNamespace' affiliation='AbstractMD_Identification'"
	 * @generated
	 */
	MDDataIdentificationType getMDDataIdentification();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDDataIdentification <em>MD Data Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Data Identification</em>' containment reference.
	 * @see #getMDDataIdentification()
	 * @generated
	 */
	void setMDDataIdentification(MDDataIdentificationType value);

	/**
	 * Returns the value of the '<em><b>MD Datatype Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Datatype Code</em>' containment reference.
	 * @see #setMDDatatypeCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDDatatypeCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_DatatypeCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getMDDatatypeCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDDatatypeCode <em>MD Datatype Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Datatype Code</em>' containment reference.
	 * @see #getMDDatatypeCode()
	 * @generated
	 */
	void setMDDatatypeCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>MD Digital Transfer Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Digital Transfer Options</em>' containment reference.
	 * @see #setMDDigitalTransferOptions(MDDigitalTransferOptionsType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDDigitalTransferOptions()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_DigitalTransferOptions' namespace='##targetNamespace'"
	 * @generated
	 */
	MDDigitalTransferOptionsType getMDDigitalTransferOptions();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDDigitalTransferOptions <em>MD Digital Transfer Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Digital Transfer Options</em>' containment reference.
	 * @see #getMDDigitalTransferOptions()
	 * @generated
	 */
	void setMDDigitalTransferOptions(MDDigitalTransferOptionsType value);

	/**
	 * Returns the value of the '<em><b>MD Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Dimension</em>' containment reference.
	 * @see #setMDDimension(MDDimensionType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDDimension()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_Dimension' namespace='##targetNamespace'"
	 * @generated
	 */
	MDDimensionType getMDDimension();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDDimension <em>MD Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Dimension</em>' containment reference.
	 * @see #getMDDimension()
	 * @generated
	 */
	void setMDDimension(MDDimensionType value);

	/**
	 * Returns the value of the '<em><b>MD Dimension Name Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Dimension Name Type Code</em>' containment reference.
	 * @see #setMDDimensionNameTypeCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDDimensionNameTypeCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_DimensionNameTypeCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getMDDimensionNameTypeCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDDimensionNameTypeCode <em>MD Dimension Name Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Dimension Name Type Code</em>' containment reference.
	 * @see #getMDDimensionNameTypeCode()
	 * @generated
	 */
	void setMDDimensionNameTypeCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>MD Distribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Distribution</em>' containment reference.
	 * @see #setMDDistribution(MDDistributionType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDDistribution()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_Distribution' namespace='##targetNamespace'"
	 * @generated
	 */
	MDDistributionType getMDDistribution();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDDistribution <em>MD Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Distribution</em>' containment reference.
	 * @see #getMDDistribution()
	 * @generated
	 */
	void setMDDistribution(MDDistributionType value);

	/**
	 * Returns the value of the '<em><b>MD Distribution Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Distribution Units</em>' containment reference.
	 * @see #setMDDistributionUnits(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDDistributionUnits()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_DistributionUnits' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getMDDistributionUnits();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDDistributionUnits <em>MD Distribution Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Distribution Units</em>' containment reference.
	 * @see #getMDDistributionUnits()
	 * @generated
	 */
	void setMDDistributionUnits(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>MD Distributor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Distributor</em>' containment reference.
	 * @see #setMDDistributor(MDDistributorType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDDistributor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_Distributor' namespace='##targetNamespace'"
	 * @generated
	 */
	MDDistributorType getMDDistributor();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDDistributor <em>MD Distributor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Distributor</em>' containment reference.
	 * @see #getMDDistributor()
	 * @generated
	 */
	void setMDDistributor(MDDistributorType value);

	/**
	 * Returns the value of the '<em><b>MD Extended Element Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Extended Element Information</em>' containment reference.
	 * @see #setMDExtendedElementInformation(MDExtendedElementInformationType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDExtendedElementInformation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_ExtendedElementInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	MDExtendedElementInformationType getMDExtendedElementInformation();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDExtendedElementInformation <em>MD Extended Element Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Extended Element Information</em>' containment reference.
	 * @see #getMDExtendedElementInformation()
	 * @generated
	 */
	void setMDExtendedElementInformation(MDExtendedElementInformationType value);

	/**
	 * Returns the value of the '<em><b>MD Feature Catalogue Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Feature Catalogue Description</em>' containment reference.
	 * @see #setMDFeatureCatalogueDescription(MDFeatureCatalogueDescriptionType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDFeatureCatalogueDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_FeatureCatalogueDescription' namespace='##targetNamespace' affiliation='AbstractMD_ContentInformation'"
	 * @generated
	 */
	MDFeatureCatalogueDescriptionType getMDFeatureCatalogueDescription();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDFeatureCatalogueDescription <em>MD Feature Catalogue Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Feature Catalogue Description</em>' containment reference.
	 * @see #getMDFeatureCatalogueDescription()
	 * @generated
	 */
	void setMDFeatureCatalogueDescription(MDFeatureCatalogueDescriptionType value);

	/**
	 * Returns the value of the '<em><b>MD Format</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Format</em>' containment reference.
	 * @see #setMDFormat(MDFormatType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDFormat()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_Format' namespace='##targetNamespace'"
	 * @generated
	 */
	MDFormatType getMDFormat();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDFormat <em>MD Format</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Format</em>' containment reference.
	 * @see #getMDFormat()
	 * @generated
	 */
	void setMDFormat(MDFormatType value);

	/**
	 * Returns the value of the '<em><b>MD Geometric Objects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Geometric Objects</em>' containment reference.
	 * @see #setMDGeometricObjects(MDGeometricObjectsType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDGeometricObjects()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_GeometricObjects' namespace='##targetNamespace'"
	 * @generated
	 */
	MDGeometricObjectsType getMDGeometricObjects();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDGeometricObjects <em>MD Geometric Objects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Geometric Objects</em>' containment reference.
	 * @see #getMDGeometricObjects()
	 * @generated
	 */
	void setMDGeometricObjects(MDGeometricObjectsType value);

	/**
	 * Returns the value of the '<em><b>MD Geometric Object Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Geometric Object Type Code</em>' containment reference.
	 * @see #setMDGeometricObjectTypeCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDGeometricObjectTypeCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_GeometricObjectTypeCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getMDGeometricObjectTypeCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDGeometricObjectTypeCode <em>MD Geometric Object Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Geometric Object Type Code</em>' containment reference.
	 * @see #getMDGeometricObjectTypeCode()
	 * @generated
	 */
	void setMDGeometricObjectTypeCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>MD Georectified</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Georectified</em>' containment reference.
	 * @see #setMDGeorectified(MDGeorectifiedType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDGeorectified()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_Georectified' namespace='##targetNamespace' affiliation='MD_GridSpatialRepresentation'"
	 * @generated
	 */
	MDGeorectifiedType getMDGeorectified();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDGeorectified <em>MD Georectified</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Georectified</em>' containment reference.
	 * @see #getMDGeorectified()
	 * @generated
	 */
	void setMDGeorectified(MDGeorectifiedType value);

	/**
	 * Returns the value of the '<em><b>MD Grid Spatial Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Grid Spatial Representation</em>' containment reference.
	 * @see #setMDGridSpatialRepresentation(MDGridSpatialRepresentationType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDGridSpatialRepresentation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_GridSpatialRepresentation' namespace='##targetNamespace' affiliation='AbstractMD_SpatialRepresentation'"
	 * @generated
	 */
	MDGridSpatialRepresentationType getMDGridSpatialRepresentation();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDGridSpatialRepresentation <em>MD Grid Spatial Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Grid Spatial Representation</em>' containment reference.
	 * @see #getMDGridSpatialRepresentation()
	 * @generated
	 */
	void setMDGridSpatialRepresentation(MDGridSpatialRepresentationType value);

	/**
	 * Returns the value of the '<em><b>MD Georeferenceable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Georeferenceable</em>' containment reference.
	 * @see #setMDGeoreferenceable(MDGeoreferenceableType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDGeoreferenceable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_Georeferenceable' namespace='##targetNamespace' affiliation='MD_GridSpatialRepresentation'"
	 * @generated
	 */
	MDGeoreferenceableType getMDGeoreferenceable();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDGeoreferenceable <em>MD Georeferenceable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Georeferenceable</em>' containment reference.
	 * @see #getMDGeoreferenceable()
	 * @generated
	 */
	void setMDGeoreferenceable(MDGeoreferenceableType value);

	/**
	 * Returns the value of the '<em><b>MD Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Identifier</em>' containment reference.
	 * @see #setMDIdentifier(MDIdentifierType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDIdentifier()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_Identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	MDIdentifierType getMDIdentifier();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDIdentifier <em>MD Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Identifier</em>' containment reference.
	 * @see #getMDIdentifier()
	 * @generated
	 */
	void setMDIdentifier(MDIdentifierType value);

	/**
	 * Returns the value of the '<em><b>MD Image Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Image Description</em>' containment reference.
	 * @see #setMDImageDescription(MDImageDescriptionType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDImageDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_ImageDescription' namespace='##targetNamespace' affiliation='MD_CoverageDescription'"
	 * @generated
	 */
	MDImageDescriptionType getMDImageDescription();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDImageDescription <em>MD Image Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Image Description</em>' containment reference.
	 * @see #getMDImageDescription()
	 * @generated
	 */
	void setMDImageDescription(MDImageDescriptionType value);

	/**
	 * Returns the value of the '<em><b>MD Imaging Condition Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Imaging Condition Code</em>' containment reference.
	 * @see #setMDImagingConditionCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDImagingConditionCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_ImagingConditionCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getMDImagingConditionCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDImagingConditionCode <em>MD Imaging Condition Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Imaging Condition Code</em>' containment reference.
	 * @see #getMDImagingConditionCode()
	 * @generated
	 */
	void setMDImagingConditionCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>MD Keywords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Keywords</em>' containment reference.
	 * @see #setMDKeywords(MDKeywordsType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDKeywords()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_Keywords' namespace='##targetNamespace'"
	 * @generated
	 */
	MDKeywordsType getMDKeywords();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDKeywords <em>MD Keywords</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Keywords</em>' containment reference.
	 * @see #getMDKeywords()
	 * @generated
	 */
	void setMDKeywords(MDKeywordsType value);

	/**
	 * Returns the value of the '<em><b>MD Keyword Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Keyword Type Code</em>' containment reference.
	 * @see #setMDKeywordTypeCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDKeywordTypeCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_KeywordTypeCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getMDKeywordTypeCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDKeywordTypeCode <em>MD Keyword Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Keyword Type Code</em>' containment reference.
	 * @see #getMDKeywordTypeCode()
	 * @generated
	 */
	void setMDKeywordTypeCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>MD Legal Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Legal Constraints</em>' containment reference.
	 * @see #setMDLegalConstraints(MDLegalConstraintsType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDLegalConstraints()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_LegalConstraints' namespace='##targetNamespace' affiliation='MD_Constraints'"
	 * @generated
	 */
	MDLegalConstraintsType getMDLegalConstraints();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDLegalConstraints <em>MD Legal Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Legal Constraints</em>' containment reference.
	 * @see #getMDLegalConstraints()
	 * @generated
	 */
	void setMDLegalConstraints(MDLegalConstraintsType value);

	/**
	 * Returns the value of the '<em><b>MD Maintenance Frequency Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Maintenance Frequency Code</em>' containment reference.
	 * @see #setMDMaintenanceFrequencyCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDMaintenanceFrequencyCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_MaintenanceFrequencyCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getMDMaintenanceFrequencyCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDMaintenanceFrequencyCode <em>MD Maintenance Frequency Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Maintenance Frequency Code</em>' containment reference.
	 * @see #getMDMaintenanceFrequencyCode()
	 * @generated
	 */
	void setMDMaintenanceFrequencyCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>MD Maintenance Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Maintenance Information</em>' containment reference.
	 * @see #setMDMaintenanceInformation(MDMaintenanceInformationType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDMaintenanceInformation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_MaintenanceInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	MDMaintenanceInformationType getMDMaintenanceInformation();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDMaintenanceInformation <em>MD Maintenance Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Maintenance Information</em>' containment reference.
	 * @see #getMDMaintenanceInformation()
	 * @generated
	 */
	void setMDMaintenanceInformation(MDMaintenanceInformationType value);

	/**
	 * Returns the value of the '<em><b>MD Medium</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Medium</em>' containment reference.
	 * @see #setMDMedium(MDMediumType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDMedium()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_Medium' namespace='##targetNamespace'"
	 * @generated
	 */
	MDMediumType getMDMedium();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDMedium <em>MD Medium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Medium</em>' containment reference.
	 * @see #getMDMedium()
	 * @generated
	 */
	void setMDMedium(MDMediumType value);

	/**
	 * Returns the value of the '<em><b>MD Medium Format Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Medium Format Code</em>' containment reference.
	 * @see #setMDMediumFormatCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDMediumFormatCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_MediumFormatCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getMDMediumFormatCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDMediumFormatCode <em>MD Medium Format Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Medium Format Code</em>' containment reference.
	 * @see #getMDMediumFormatCode()
	 * @generated
	 */
	void setMDMediumFormatCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>MD Medium Name Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Medium Name Code</em>' containment reference.
	 * @see #setMDMediumNameCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDMediumNameCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_MediumNameCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getMDMediumNameCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDMediumNameCode <em>MD Medium Name Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Medium Name Code</em>' containment reference.
	 * @see #getMDMediumNameCode()
	 * @generated
	 */
	void setMDMediumNameCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>MD Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Metadata</em>' containment reference.
	 * @see #setMDMetadata(MDMetadataType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDMetadata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_Metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	MDMetadataType getMDMetadata();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDMetadata <em>MD Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Metadata</em>' containment reference.
	 * @see #getMDMetadata()
	 * @generated
	 */
	void setMDMetadata(MDMetadataType value);

	/**
	 * Returns the value of the '<em><b>MD Metadata Extension Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Metadata Extension Information</em>' containment reference.
	 * @see #setMDMetadataExtensionInformation(MDMetadataExtensionInformationType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDMetadataExtensionInformation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_MetadataExtensionInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	MDMetadataExtensionInformationType getMDMetadataExtensionInformation();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDMetadataExtensionInformation <em>MD Metadata Extension Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Metadata Extension Information</em>' containment reference.
	 * @see #getMDMetadataExtensionInformation()
	 * @generated
	 */
	void setMDMetadataExtensionInformation(MDMetadataExtensionInformationType value);

	/**
	 * Returns the value of the '<em><b>MD Obligation Code</b></em>' attribute.
	 * The literals are from the enumeration {@link org.isotc211._2005.gmd.MDObligationCodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Obligation Code</em>' attribute.
	 * @see org.isotc211._2005.gmd.MDObligationCodeType
	 * @see #setMDObligationCode(MDObligationCodeType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDObligationCode()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_ObligationCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	MDObligationCodeType getMDObligationCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDObligationCode <em>MD Obligation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Obligation Code</em>' attribute.
	 * @see org.isotc211._2005.gmd.MDObligationCodeType
	 * @see #getMDObligationCode()
	 * @generated
	 */
	void setMDObligationCode(MDObligationCodeType value);

	/**
	 * Returns the value of the '<em><b>MD Pixel Orientation Code</b></em>' attribute.
	 * The literals are from the enumeration {@link org.isotc211._2005.gmd.MDPixelOrientationCodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Pixel Orientation Code</em>' attribute.
	 * @see org.isotc211._2005.gmd.MDPixelOrientationCodeType
	 * @see #setMDPixelOrientationCode(MDPixelOrientationCodeType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDPixelOrientationCode()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_PixelOrientationCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	MDPixelOrientationCodeType getMDPixelOrientationCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDPixelOrientationCode <em>MD Pixel Orientation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Pixel Orientation Code</em>' attribute.
	 * @see org.isotc211._2005.gmd.MDPixelOrientationCodeType
	 * @see #getMDPixelOrientationCode()
	 * @generated
	 */
	void setMDPixelOrientationCode(MDPixelOrientationCodeType value);

	/**
	 * Returns the value of the '<em><b>MD Portrayal Catalogue Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Portrayal Catalogue Reference</em>' containment reference.
	 * @see #setMDPortrayalCatalogueReference(MDPortrayalCatalogueReferenceType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDPortrayalCatalogueReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_PortrayalCatalogueReference' namespace='##targetNamespace'"
	 * @generated
	 */
	MDPortrayalCatalogueReferenceType getMDPortrayalCatalogueReference();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDPortrayalCatalogueReference <em>MD Portrayal Catalogue Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Portrayal Catalogue Reference</em>' containment reference.
	 * @see #getMDPortrayalCatalogueReference()
	 * @generated
	 */
	void setMDPortrayalCatalogueReference(MDPortrayalCatalogueReferenceType value);

	/**
	 * Returns the value of the '<em><b>MD Progress Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Progress Code</em>' containment reference.
	 * @see #setMDProgressCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDProgressCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_ProgressCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getMDProgressCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDProgressCode <em>MD Progress Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Progress Code</em>' containment reference.
	 * @see #getMDProgressCode()
	 * @generated
	 */
	void setMDProgressCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>MD Reference System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Reference System</em>' containment reference.
	 * @see #setMDReferenceSystem(MDReferenceSystemType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDReferenceSystem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_ReferenceSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	MDReferenceSystemType getMDReferenceSystem();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDReferenceSystem <em>MD Reference System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Reference System</em>' containment reference.
	 * @see #getMDReferenceSystem()
	 * @generated
	 */
	void setMDReferenceSystem(MDReferenceSystemType value);

	/**
	 * Returns the value of the '<em><b>MD Representative Fraction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Representative Fraction</em>' containment reference.
	 * @see #setMDRepresentativeFraction(MDRepresentativeFractionType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDRepresentativeFraction()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_RepresentativeFraction' namespace='##targetNamespace'"
	 * @generated
	 */
	MDRepresentativeFractionType getMDRepresentativeFraction();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDRepresentativeFraction <em>MD Representative Fraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Representative Fraction</em>' containment reference.
	 * @see #getMDRepresentativeFraction()
	 * @generated
	 */
	void setMDRepresentativeFraction(MDRepresentativeFractionType value);

	/**
	 * Returns the value of the '<em><b>MD Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Resolution</em>' containment reference.
	 * @see #setMDResolution(MDResolutionType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDResolution()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_Resolution' namespace='##targetNamespace'"
	 * @generated
	 */
	MDResolutionType getMDResolution();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDResolution <em>MD Resolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Resolution</em>' containment reference.
	 * @see #getMDResolution()
	 * @generated
	 */
	void setMDResolution(MDResolutionType value);

	/**
	 * Returns the value of the '<em><b>MD Restriction Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Restriction Code</em>' containment reference.
	 * @see #setMDRestrictionCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDRestrictionCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_RestrictionCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getMDRestrictionCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDRestrictionCode <em>MD Restriction Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Restriction Code</em>' containment reference.
	 * @see #getMDRestrictionCode()
	 * @generated
	 */
	void setMDRestrictionCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>MD Scope Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Scope Code</em>' containment reference.
	 * @see #setMDScopeCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDScopeCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_ScopeCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getMDScopeCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDScopeCode <em>MD Scope Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Scope Code</em>' containment reference.
	 * @see #getMDScopeCode()
	 * @generated
	 */
	void setMDScopeCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>MD Scope Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Scope Description</em>' containment reference.
	 * @see #setMDScopeDescription(MDScopeDescriptionType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDScopeDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_ScopeDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	MDScopeDescriptionType getMDScopeDescription();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDScopeDescription <em>MD Scope Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Scope Description</em>' containment reference.
	 * @see #getMDScopeDescription()
	 * @generated
	 */
	void setMDScopeDescription(MDScopeDescriptionType value);

	/**
	 * Returns the value of the '<em><b>MD Security Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Security Constraints</em>' containment reference.
	 * @see #setMDSecurityConstraints(MDSecurityConstraintsType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDSecurityConstraints()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_SecurityConstraints' namespace='##targetNamespace' affiliation='MD_Constraints'"
	 * @generated
	 */
	MDSecurityConstraintsType getMDSecurityConstraints();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDSecurityConstraints <em>MD Security Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Security Constraints</em>' containment reference.
	 * @see #getMDSecurityConstraints()
	 * @generated
	 */
	void setMDSecurityConstraints(MDSecurityConstraintsType value);

	/**
	 * Returns the value of the '<em><b>MD Service Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Service Identification</em>' containment reference.
	 * @see #setMDServiceIdentification(MDServiceIdentificationType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDServiceIdentification()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_ServiceIdentification' namespace='##targetNamespace' affiliation='AbstractMD_Identification'"
	 * @generated
	 */
	MDServiceIdentificationType getMDServiceIdentification();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDServiceIdentification <em>MD Service Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Service Identification</em>' containment reference.
	 * @see #getMDServiceIdentification()
	 * @generated
	 */
	void setMDServiceIdentification(MDServiceIdentificationType value);

	/**
	 * Returns the value of the '<em><b>MD Spatial Representation Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Spatial Representation Type Code</em>' containment reference.
	 * @see #setMDSpatialRepresentationTypeCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDSpatialRepresentationTypeCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_SpatialRepresentationTypeCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getMDSpatialRepresentationTypeCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDSpatialRepresentationTypeCode <em>MD Spatial Representation Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Spatial Representation Type Code</em>' containment reference.
	 * @see #getMDSpatialRepresentationTypeCode()
	 * @generated
	 */
	void setMDSpatialRepresentationTypeCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>MD Standard Order Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Standard Order Process</em>' containment reference.
	 * @see #setMDStandardOrderProcess(MDStandardOrderProcessType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDStandardOrderProcess()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_StandardOrderProcess' namespace='##targetNamespace'"
	 * @generated
	 */
	MDStandardOrderProcessType getMDStandardOrderProcess();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDStandardOrderProcess <em>MD Standard Order Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Standard Order Process</em>' containment reference.
	 * @see #getMDStandardOrderProcess()
	 * @generated
	 */
	void setMDStandardOrderProcess(MDStandardOrderProcessType value);

	/**
	 * Returns the value of the '<em><b>MD Topic Category Code</b></em>' attribute.
	 * The literals are from the enumeration {@link org.isotc211._2005.gmd.MDTopicCategoryCodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Topic Category Code</em>' attribute.
	 * @see org.isotc211._2005.gmd.MDTopicCategoryCodeType
	 * @see #setMDTopicCategoryCode(MDTopicCategoryCodeType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDTopicCategoryCode()
	 * @model unique="false" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_TopicCategoryCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	MDTopicCategoryCodeType getMDTopicCategoryCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDTopicCategoryCode <em>MD Topic Category Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Topic Category Code</em>' attribute.
	 * @see org.isotc211._2005.gmd.MDTopicCategoryCodeType
	 * @see #getMDTopicCategoryCode()
	 * @generated
	 */
	void setMDTopicCategoryCode(MDTopicCategoryCodeType value);

	/**
	 * Returns the value of the '<em><b>MD Topology Level Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Topology Level Code</em>' containment reference.
	 * @see #setMDTopologyLevelCode(CodeListValueType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDTopologyLevelCode()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_TopologyLevelCode' namespace='##targetNamespace' affiliation='http://www.isotc211.org/2005/gco#CharacterString'"
	 * @generated
	 */
	CodeListValueType getMDTopologyLevelCode();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDTopologyLevelCode <em>MD Topology Level Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Topology Level Code</em>' containment reference.
	 * @see #getMDTopologyLevelCode()
	 * @generated
	 */
	void setMDTopologyLevelCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>MD Usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Usage</em>' containment reference.
	 * @see #setMDUsage(MDUsageType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDUsage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_Usage' namespace='##targetNamespace'"
	 * @generated
	 */
	MDUsageType getMDUsage();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDUsage <em>MD Usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Usage</em>' containment reference.
	 * @see #getMDUsage()
	 * @generated
	 */
	void setMDUsage(MDUsageType value);

	/**
	 * Returns the value of the '<em><b>MD Vector Spatial Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Vector Spatial Representation</em>' containment reference.
	 * @see #setMDVectorSpatialRepresentation(MDVectorSpatialRepresentationType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_MDVectorSpatialRepresentation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MD_VectorSpatialRepresentation' namespace='##targetNamespace' affiliation='AbstractMD_SpatialRepresentation'"
	 * @generated
	 */
	MDVectorSpatialRepresentationType getMDVectorSpatialRepresentation();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getMDVectorSpatialRepresentation <em>MD Vector Spatial Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Vector Spatial Representation</em>' containment reference.
	 * @see #getMDVectorSpatialRepresentation()
	 * @generated
	 */
	void setMDVectorSpatialRepresentation(MDVectorSpatialRepresentationType value);

	/**
	 * Returns the value of the '<em><b>PT Free Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PT Free Text</em>' containment reference.
	 * @see #setPTFreeText(PTFreeTextType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_PTFreeText()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PT_FreeText' namespace='##targetNamespace'"
	 * @generated
	 */
	PTFreeTextType getPTFreeText();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getPTFreeText <em>PT Free Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PT Free Text</em>' containment reference.
	 * @see #getPTFreeText()
	 * @generated
	 */
	void setPTFreeText(PTFreeTextType value);

	/**
	 * Returns the value of the '<em><b>PT Locale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PT Locale</em>' containment reference.
	 * @see #setPTLocale(PTLocaleType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_PTLocale()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PT_Locale' namespace='##targetNamespace'"
	 * @generated
	 */
	PTLocaleType getPTLocale();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getPTLocale <em>PT Locale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PT Locale</em>' containment reference.
	 * @see #getPTLocale()
	 * @generated
	 */
	void setPTLocale(PTLocaleType value);

	/**
	 * Returns the value of the '<em><b>PT Locale Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PT Locale Container</em>' containment reference.
	 * @see #setPTLocaleContainer(PTLocaleContainerType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_PTLocaleContainer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PT_LocaleContainer' namespace='##targetNamespace'"
	 * @generated
	 */
	PTLocaleContainerType getPTLocaleContainer();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getPTLocaleContainer <em>PT Locale Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PT Locale Container</em>' containment reference.
	 * @see #getPTLocaleContainer()
	 * @generated
	 */
	void setPTLocaleContainer(PTLocaleContainerType value);

	/**
	 * Returns the value of the '<em><b>RS Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RS Identifier</em>' containment reference.
	 * @see #setRSIdentifier(RSIdentifierType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_RSIdentifier()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RS_Identifier' namespace='##targetNamespace' affiliation='MD_Identifier'"
	 * @generated
	 */
	RSIdentifierType getRSIdentifier();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getRSIdentifier <em>RS Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RS Identifier</em>' containment reference.
	 * @see #getRSIdentifier()
	 * @generated
	 */
	void setRSIdentifier(RSIdentifierType value);

	/**
	 * Returns the value of the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URL</em>' attribute.
	 * @see #setURL(String)
	 * @see org.isotc211._2005.gmd.GMDPackage#getDocumentRoot_URL()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='URL' namespace='##targetNamespace'"
	 * @generated
	 */
	String getURL();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.DocumentRoot#getURL <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URL</em>' attribute.
	 * @see #getURL()
	 * @generated
	 */
	void setURL(String value);

} // DocumentRoot
