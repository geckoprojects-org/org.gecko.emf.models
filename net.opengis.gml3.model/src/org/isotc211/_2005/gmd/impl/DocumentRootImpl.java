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
package org.isotc211._2005.gmd.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.isotc211._2005.gco.CodeListValueType;

import org.isotc211._2005.gmd.AbstractDQCompletenessType;
import org.isotc211._2005.gmd.AbstractDQElementType;
import org.isotc211._2005.gmd.AbstractDQLogicalConsistencyType;
import org.isotc211._2005.gmd.AbstractDQPositionalAccuracyType;
import org.isotc211._2005.gmd.AbstractDQResultType;
import org.isotc211._2005.gmd.AbstractDQTemporalAccuracyType;
import org.isotc211._2005.gmd.AbstractDQThematicAccuracyType;
import org.isotc211._2005.gmd.AbstractDSAggregateType;
import org.isotc211._2005.gmd.AbstractEXGeographicExtentType;
import org.isotc211._2005.gmd.AbstractMDContentInformationType;
import org.isotc211._2005.gmd.AbstractMDIdentificationType;
import org.isotc211._2005.gmd.AbstractMDSpatialRepresentationType;
import org.isotc211._2005.gmd.AbstractRSReferenceSystemType;
import org.isotc211._2005.gmd.CIAddressType;
import org.isotc211._2005.gmd.CICitationType;
import org.isotc211._2005.gmd.CIContactType;
import org.isotc211._2005.gmd.CIDateType;
import org.isotc211._2005.gmd.CIOnlineResourceType;
import org.isotc211._2005.gmd.CIResponsiblePartyType;
import org.isotc211._2005.gmd.CISeriesType;
import org.isotc211._2005.gmd.CITelephoneType;
import org.isotc211._2005.gmd.DQAbsoluteExternalPositionalAccuracyType;
import org.isotc211._2005.gmd.DQAccuracyOfATimeMeasurementType;
import org.isotc211._2005.gmd.DQCompletenessCommissionType;
import org.isotc211._2005.gmd.DQCompletenessOmissionType;
import org.isotc211._2005.gmd.DQConceptualConsistencyType;
import org.isotc211._2005.gmd.DQConformanceResultType;
import org.isotc211._2005.gmd.DQDataQualityType;
import org.isotc211._2005.gmd.DQDomainConsistencyType;
import org.isotc211._2005.gmd.DQFormatConsistencyType;
import org.isotc211._2005.gmd.DQGriddedDataPositionalAccuracyType;
import org.isotc211._2005.gmd.DQNonQuantitativeAttributeAccuracyType;
import org.isotc211._2005.gmd.DQQuantitativeAttributeAccuracyType;
import org.isotc211._2005.gmd.DQQuantitativeResultType;
import org.isotc211._2005.gmd.DQRelativeInternalPositionalAccuracyType;
import org.isotc211._2005.gmd.DQScopeType;
import org.isotc211._2005.gmd.DQTemporalConsistencyType;
import org.isotc211._2005.gmd.DQTemporalValidityType;
import org.isotc211._2005.gmd.DQThematicClassificationCorrectnessType;
import org.isotc211._2005.gmd.DQTopologicalConsistencyType;
import org.isotc211._2005.gmd.DSAssociationType;
import org.isotc211._2005.gmd.DSDataSetType;
import org.isotc211._2005.gmd.DSInitiativeType;
import org.isotc211._2005.gmd.DSOtherAggregateType;
import org.isotc211._2005.gmd.DSPlatformType;
import org.isotc211._2005.gmd.DSProductionSeriesType;
import org.isotc211._2005.gmd.DSSensorType;
import org.isotc211._2005.gmd.DSSeriesType;
import org.isotc211._2005.gmd.DSStereoMateType;
import org.isotc211._2005.gmd.DocumentRoot;
import org.isotc211._2005.gmd.EXBoundingPolygonType;
import org.isotc211._2005.gmd.EXExtentType;
import org.isotc211._2005.gmd.EXGeographicBoundingBoxType;
import org.isotc211._2005.gmd.EXGeographicDescriptionType;
import org.isotc211._2005.gmd.EXSpatialTemporalExtentType;
import org.isotc211._2005.gmd.EXTemporalExtentType;
import org.isotc211._2005.gmd.EXVerticalExtentType;
import org.isotc211._2005.gmd.GMDPackage;
import org.isotc211._2005.gmd.LILineageType;
import org.isotc211._2005.gmd.LIProcessStepType;
import org.isotc211._2005.gmd.LISourceType;
import org.isotc211._2005.gmd.LocalisedCharacterStringType;
import org.isotc211._2005.gmd.MDAggregateInformationType;
import org.isotc211._2005.gmd.MDApplicationSchemaInformationType;
import org.isotc211._2005.gmd.MDBandType;
import org.isotc211._2005.gmd.MDBrowseGraphicType;
import org.isotc211._2005.gmd.MDConstraintsType;
import org.isotc211._2005.gmd.MDCoverageDescriptionType;
import org.isotc211._2005.gmd.MDDataIdentificationType;
import org.isotc211._2005.gmd.MDDigitalTransferOptionsType;
import org.isotc211._2005.gmd.MDDimensionType;
import org.isotc211._2005.gmd.MDDistributionType;
import org.isotc211._2005.gmd.MDDistributorType;
import org.isotc211._2005.gmd.MDExtendedElementInformationType;
import org.isotc211._2005.gmd.MDFeatureCatalogueDescriptionType;
import org.isotc211._2005.gmd.MDFormatType;
import org.isotc211._2005.gmd.MDGeometricObjectsType;
import org.isotc211._2005.gmd.MDGeorectifiedType;
import org.isotc211._2005.gmd.MDGeoreferenceableType;
import org.isotc211._2005.gmd.MDGridSpatialRepresentationType;
import org.isotc211._2005.gmd.MDIdentifierType;
import org.isotc211._2005.gmd.MDImageDescriptionType;
import org.isotc211._2005.gmd.MDKeywordsType;
import org.isotc211._2005.gmd.MDLegalConstraintsType;
import org.isotc211._2005.gmd.MDMaintenanceInformationType;
import org.isotc211._2005.gmd.MDMediumType;
import org.isotc211._2005.gmd.MDMetadataExtensionInformationType;
import org.isotc211._2005.gmd.MDMetadataType;
import org.isotc211._2005.gmd.MDObligationCodeType;
import org.isotc211._2005.gmd.MDPixelOrientationCodeType;
import org.isotc211._2005.gmd.MDPortrayalCatalogueReferenceType;
import org.isotc211._2005.gmd.MDRangeDimensionType;
import org.isotc211._2005.gmd.MDReferenceSystemType;
import org.isotc211._2005.gmd.MDRepresentativeFractionType;
import org.isotc211._2005.gmd.MDResolutionType;
import org.isotc211._2005.gmd.MDScopeDescriptionType;
import org.isotc211._2005.gmd.MDSecurityConstraintsType;
import org.isotc211._2005.gmd.MDServiceIdentificationType;
import org.isotc211._2005.gmd.MDStandardOrderProcessType;
import org.isotc211._2005.gmd.MDTopicCategoryCodeType;
import org.isotc211._2005.gmd.MDUsageType;
import org.isotc211._2005.gmd.MDVectorSpatialRepresentationType;
import org.isotc211._2005.gmd.PTFreeTextType;
import org.isotc211._2005.gmd.PTLocaleContainerType;
import org.isotc211._2005.gmd.PTLocaleType;
import org.isotc211._2005.gmd.RSIdentifierType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getAbstractDQCompleteness <em>Abstract DQ Completeness</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getAbstractDQElement <em>Abstract DQ Element</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getAbstractDQLogicalConsistency <em>Abstract DQ Logical Consistency</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getAbstractDQPositionalAccuracy <em>Abstract DQ Positional Accuracy</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getAbstractDQResult <em>Abstract DQ Result</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getAbstractDQTemporalAccuracy <em>Abstract DQ Temporal Accuracy</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getAbstractDQThematicAccuracy <em>Abstract DQ Thematic Accuracy</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getAbstractDSAggregate <em>Abstract DS Aggregate</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getAbstractEXGeographicExtent <em>Abstract EX Geographic Extent</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getAbstractMDContentInformation <em>Abstract MD Content Information</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getAbstractMDIdentification <em>Abstract MD Identification</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getAbstractMDSpatialRepresentation <em>Abstract MD Spatial Representation</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getAbstractRSReferenceSystem <em>Abstract RS Reference System</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getCIAddress <em>CI Address</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getCICitation <em>CI Citation</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getCIContact <em>CI Contact</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getCIDate <em>CI Date</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getCIDateTypeCode <em>CI Date Type Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getCIOnLineFunctionCode <em>CI On Line Function Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getCIOnlineResource <em>CI Online Resource</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getCIPresentationFormCode <em>CI Presentation Form Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getCIResponsibleParty <em>CI Responsible Party</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getCIRoleCode <em>CI Role Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getCISeries <em>CI Series</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getCITelephone <em>CI Telephone</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDQAbsoluteExternalPositionalAccuracy <em>DQ Absolute External Positional Accuracy</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDQAccuracyOfATimeMeasurement <em>DQ Accuracy Of ATime Measurement</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDQCompletenessCommission <em>DQ Completeness Commission</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDQCompletenessOmission <em>DQ Completeness Omission</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDQConceptualConsistency <em>DQ Conceptual Consistency</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDQConformanceResult <em>DQ Conformance Result</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDQDataQuality <em>DQ Data Quality</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDQDomainConsistency <em>DQ Domain Consistency</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDQEvaluationMethodTypeCode <em>DQ Evaluation Method Type Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDQFormatConsistency <em>DQ Format Consistency</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDQGriddedDataPositionalAccuracy <em>DQ Gridded Data Positional Accuracy</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDQNonQuantitativeAttributeAccuracy <em>DQ Non Quantitative Attribute Accuracy</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDQQuantitativeAttributeAccuracy <em>DQ Quantitative Attribute Accuracy</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDQQuantitativeResult <em>DQ Quantitative Result</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDQRelativeInternalPositionalAccuracy <em>DQ Relative Internal Positional Accuracy</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDQScope <em>DQ Scope</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDQTemporalConsistency <em>DQ Temporal Consistency</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDQTemporalValidity <em>DQ Temporal Validity</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDQThematicClassificationCorrectness <em>DQ Thematic Classification Correctness</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDQTopologicalConsistency <em>DQ Topological Consistency</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDSAssociation <em>DS Association</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDSAssociationTypeCode <em>DS Association Type Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDSDataSet <em>DS Data Set</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDSInitiative <em>DS Initiative</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDSInitiativeTypeCode <em>DS Initiative Type Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDSOtherAggregate <em>DS Other Aggregate</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDSPlatform <em>DS Platform</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDSSeries <em>DS Series</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDSProductionSeries <em>DS Production Series</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDSSensor <em>DS Sensor</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getDSStereoMate <em>DS Stereo Mate</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getEXBoundingPolygon <em>EX Bounding Polygon</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getEXExtent <em>EX Extent</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getEXGeographicBoundingBox <em>EX Geographic Bounding Box</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getEXGeographicDescription <em>EX Geographic Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getEXSpatialTemporalExtent <em>EX Spatial Temporal Extent</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getEXTemporalExtent <em>EX Temporal Extent</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getEXVerticalExtent <em>EX Vertical Extent</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getLILineage <em>LI Lineage</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getLIProcessStep <em>LI Process Step</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getLISource <em>LI Source</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getLocalisedCharacterString <em>Localised Character String</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDAggregateInformation <em>MD Aggregate Information</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDApplicationSchemaInformation <em>MD Application Schema Information</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDBand <em>MD Band</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDRangeDimension <em>MD Range Dimension</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDBrowseGraphic <em>MD Browse Graphic</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDCellGeometryCode <em>MD Cell Geometry Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDCharacterSetCode <em>MD Character Set Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDClassificationCode <em>MD Classification Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDConstraints <em>MD Constraints</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDCoverageContentTypeCode <em>MD Coverage Content Type Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDCoverageDescription <em>MD Coverage Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDDataIdentification <em>MD Data Identification</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDDatatypeCode <em>MD Datatype Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDDigitalTransferOptions <em>MD Digital Transfer Options</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDDimension <em>MD Dimension</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDDimensionNameTypeCode <em>MD Dimension Name Type Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDDistribution <em>MD Distribution</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDDistributionUnits <em>MD Distribution Units</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDDistributor <em>MD Distributor</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDExtendedElementInformation <em>MD Extended Element Information</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDFeatureCatalogueDescription <em>MD Feature Catalogue Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDFormat <em>MD Format</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDGeometricObjects <em>MD Geometric Objects</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDGeometricObjectTypeCode <em>MD Geometric Object Type Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDGeorectified <em>MD Georectified</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDGridSpatialRepresentation <em>MD Grid Spatial Representation</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDGeoreferenceable <em>MD Georeferenceable</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDIdentifier <em>MD Identifier</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDImageDescription <em>MD Image Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDImagingConditionCode <em>MD Imaging Condition Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDKeywords <em>MD Keywords</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDKeywordTypeCode <em>MD Keyword Type Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDLegalConstraints <em>MD Legal Constraints</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDMaintenanceFrequencyCode <em>MD Maintenance Frequency Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDMaintenanceInformation <em>MD Maintenance Information</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDMedium <em>MD Medium</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDMediumFormatCode <em>MD Medium Format Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDMediumNameCode <em>MD Medium Name Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDMetadata <em>MD Metadata</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDMetadataExtensionInformation <em>MD Metadata Extension Information</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDObligationCode <em>MD Obligation Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDPixelOrientationCode <em>MD Pixel Orientation Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDPortrayalCatalogueReference <em>MD Portrayal Catalogue Reference</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDProgressCode <em>MD Progress Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDReferenceSystem <em>MD Reference System</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDRepresentativeFraction <em>MD Representative Fraction</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDResolution <em>MD Resolution</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDRestrictionCode <em>MD Restriction Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDScopeCode <em>MD Scope Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDScopeDescription <em>MD Scope Description</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDSecurityConstraints <em>MD Security Constraints</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDServiceIdentification <em>MD Service Identification</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDSpatialRepresentationTypeCode <em>MD Spatial Representation Type Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDStandardOrderProcess <em>MD Standard Order Process</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDTopicCategoryCode <em>MD Topic Category Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDTopologyLevelCode <em>MD Topology Level Code</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDUsage <em>MD Usage</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getMDVectorSpatialRepresentation <em>MD Vector Spatial Representation</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getPTFreeText <em>PT Free Text</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getPTLocale <em>PT Locale</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getPTLocaleContainer <em>PT Locale Container</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getRSIdentifier <em>RS Identifier</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.impl.DocumentRootImpl#getURL <em>URL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getMDObligationCode() <em>MD Obligation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDObligationCode()
	 * @generated
	 * @ordered
	 */
	protected static final MDObligationCodeType MD_OBLIGATION_CODE_EDEFAULT = MDObligationCodeType.MANDATORY;

	/**
	 * The default value of the '{@link #getMDPixelOrientationCode() <em>MD Pixel Orientation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDPixelOrientationCode()
	 * @generated
	 * @ordered
	 */
	protected static final MDPixelOrientationCodeType MD_PIXEL_ORIENTATION_CODE_EDEFAULT = MDPixelOrientationCodeType.CENTER;

	/**
	 * The default value of the '{@link #getMDTopicCategoryCode() <em>MD Topic Category Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDTopicCategoryCode()
	 * @generated
	 * @ordered
	 */
	protected static final MDTopicCategoryCodeType MD_TOPIC_CATEGORY_CODE_EDEFAULT = MDTopicCategoryCodeType.FARMING;

	/**
	 * The default value of the '{@link #getURL() <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURL()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, GMDPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, GMDPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, GMDPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractDQCompletenessType getAbstractDQCompleteness() {
		return (AbstractDQCompletenessType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_AbstractDQCompleteness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractDQCompleteness(AbstractDQCompletenessType newAbstractDQCompleteness, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_AbstractDQCompleteness(), newAbstractDQCompleteness, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractDQElementType getAbstractDQElement() {
		return (AbstractDQElementType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_AbstractDQElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractDQElement(AbstractDQElementType newAbstractDQElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_AbstractDQElement(), newAbstractDQElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractDQLogicalConsistencyType getAbstractDQLogicalConsistency() {
		return (AbstractDQLogicalConsistencyType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_AbstractDQLogicalConsistency(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractDQLogicalConsistency(AbstractDQLogicalConsistencyType newAbstractDQLogicalConsistency, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_AbstractDQLogicalConsistency(), newAbstractDQLogicalConsistency, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractDQPositionalAccuracyType getAbstractDQPositionalAccuracy() {
		return (AbstractDQPositionalAccuracyType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_AbstractDQPositionalAccuracy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractDQPositionalAccuracy(AbstractDQPositionalAccuracyType newAbstractDQPositionalAccuracy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_AbstractDQPositionalAccuracy(), newAbstractDQPositionalAccuracy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractDQResultType getAbstractDQResult() {
		return (AbstractDQResultType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_AbstractDQResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractDQResult(AbstractDQResultType newAbstractDQResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_AbstractDQResult(), newAbstractDQResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractDQTemporalAccuracyType getAbstractDQTemporalAccuracy() {
		return (AbstractDQTemporalAccuracyType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_AbstractDQTemporalAccuracy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractDQTemporalAccuracy(AbstractDQTemporalAccuracyType newAbstractDQTemporalAccuracy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_AbstractDQTemporalAccuracy(), newAbstractDQTemporalAccuracy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractDQThematicAccuracyType getAbstractDQThematicAccuracy() {
		return (AbstractDQThematicAccuracyType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_AbstractDQThematicAccuracy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractDQThematicAccuracy(AbstractDQThematicAccuracyType newAbstractDQThematicAccuracy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_AbstractDQThematicAccuracy(), newAbstractDQThematicAccuracy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractDSAggregateType getAbstractDSAggregate() {
		return (AbstractDSAggregateType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_AbstractDSAggregate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractDSAggregate(AbstractDSAggregateType newAbstractDSAggregate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_AbstractDSAggregate(), newAbstractDSAggregate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractEXGeographicExtentType getAbstractEXGeographicExtent() {
		return (AbstractEXGeographicExtentType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_AbstractEXGeographicExtent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractEXGeographicExtent(AbstractEXGeographicExtentType newAbstractEXGeographicExtent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_AbstractEXGeographicExtent(), newAbstractEXGeographicExtent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractMDContentInformationType getAbstractMDContentInformation() {
		return (AbstractMDContentInformationType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_AbstractMDContentInformation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractMDContentInformation(AbstractMDContentInformationType newAbstractMDContentInformation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_AbstractMDContentInformation(), newAbstractMDContentInformation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractMDIdentificationType getAbstractMDIdentification() {
		return (AbstractMDIdentificationType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_AbstractMDIdentification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractMDIdentification(AbstractMDIdentificationType newAbstractMDIdentification, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_AbstractMDIdentification(), newAbstractMDIdentification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractMDSpatialRepresentationType getAbstractMDSpatialRepresentation() {
		return (AbstractMDSpatialRepresentationType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_AbstractMDSpatialRepresentation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractMDSpatialRepresentation(AbstractMDSpatialRepresentationType newAbstractMDSpatialRepresentation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_AbstractMDSpatialRepresentation(), newAbstractMDSpatialRepresentation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractRSReferenceSystemType getAbstractRSReferenceSystem() {
		return (AbstractRSReferenceSystemType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_AbstractRSReferenceSystem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractRSReferenceSystem(AbstractRSReferenceSystemType newAbstractRSReferenceSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_AbstractRSReferenceSystem(), newAbstractRSReferenceSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIAddressType getCIAddress() {
		return (CIAddressType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_CIAddress(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCIAddress(CIAddressType newCIAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_CIAddress(), newCIAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCIAddress(CIAddressType newCIAddress) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_CIAddress(), newCIAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CICitationType getCICitation() {
		return (CICitationType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_CICitation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCICitation(CICitationType newCICitation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_CICitation(), newCICitation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCICitation(CICitationType newCICitation) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_CICitation(), newCICitation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIContactType getCIContact() {
		return (CIContactType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_CIContact(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCIContact(CIContactType newCIContact, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_CIContact(), newCIContact, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCIContact(CIContactType newCIContact) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_CIContact(), newCIContact);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIDateType getCIDate() {
		return (CIDateType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_CIDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCIDate(CIDateType newCIDate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_CIDate(), newCIDate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCIDate(CIDateType newCIDate) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_CIDate(), newCIDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getCIDateTypeCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_CIDateTypeCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCIDateTypeCode(CodeListValueType newCIDateTypeCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_CIDateTypeCode(), newCIDateTypeCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCIDateTypeCode(CodeListValueType newCIDateTypeCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_CIDateTypeCode(), newCIDateTypeCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getCIOnLineFunctionCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_CIOnLineFunctionCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCIOnLineFunctionCode(CodeListValueType newCIOnLineFunctionCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_CIOnLineFunctionCode(), newCIOnLineFunctionCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCIOnLineFunctionCode(CodeListValueType newCIOnLineFunctionCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_CIOnLineFunctionCode(), newCIOnLineFunctionCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIOnlineResourceType getCIOnlineResource() {
		return (CIOnlineResourceType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_CIOnlineResource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCIOnlineResource(CIOnlineResourceType newCIOnlineResource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_CIOnlineResource(), newCIOnlineResource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCIOnlineResource(CIOnlineResourceType newCIOnlineResource) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_CIOnlineResource(), newCIOnlineResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getCIPresentationFormCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_CIPresentationFormCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCIPresentationFormCode(CodeListValueType newCIPresentationFormCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_CIPresentationFormCode(), newCIPresentationFormCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCIPresentationFormCode(CodeListValueType newCIPresentationFormCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_CIPresentationFormCode(), newCIPresentationFormCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIResponsiblePartyType getCIResponsibleParty() {
		return (CIResponsiblePartyType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_CIResponsibleParty(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCIResponsibleParty(CIResponsiblePartyType newCIResponsibleParty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_CIResponsibleParty(), newCIResponsibleParty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCIResponsibleParty(CIResponsiblePartyType newCIResponsibleParty) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_CIResponsibleParty(), newCIResponsibleParty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getCIRoleCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_CIRoleCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCIRoleCode(CodeListValueType newCIRoleCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_CIRoleCode(), newCIRoleCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCIRoleCode(CodeListValueType newCIRoleCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_CIRoleCode(), newCIRoleCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CISeriesType getCISeries() {
		return (CISeriesType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_CISeries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCISeries(CISeriesType newCISeries, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_CISeries(), newCISeries, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCISeries(CISeriesType newCISeries) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_CISeries(), newCISeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CITelephoneType getCITelephone() {
		return (CITelephoneType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_CITelephone(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCITelephone(CITelephoneType newCITelephone, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_CITelephone(), newCITelephone, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCITelephone(CITelephoneType newCITelephone) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_CITelephone(), newCITelephone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getCountry() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_Country(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountry(CodeListValueType newCountry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_Country(), newCountry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountry(CodeListValueType newCountry) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_Country(), newCountry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQAbsoluteExternalPositionalAccuracyType getDQAbsoluteExternalPositionalAccuracy() {
		return (DQAbsoluteExternalPositionalAccuracyType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DQAbsoluteExternalPositionalAccuracy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDQAbsoluteExternalPositionalAccuracy(DQAbsoluteExternalPositionalAccuracyType newDQAbsoluteExternalPositionalAccuracy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DQAbsoluteExternalPositionalAccuracy(), newDQAbsoluteExternalPositionalAccuracy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDQAbsoluteExternalPositionalAccuracy(DQAbsoluteExternalPositionalAccuracyType newDQAbsoluteExternalPositionalAccuracy) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DQAbsoluteExternalPositionalAccuracy(), newDQAbsoluteExternalPositionalAccuracy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQAccuracyOfATimeMeasurementType getDQAccuracyOfATimeMeasurement() {
		return (DQAccuracyOfATimeMeasurementType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DQAccuracyOfATimeMeasurement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDQAccuracyOfATimeMeasurement(DQAccuracyOfATimeMeasurementType newDQAccuracyOfATimeMeasurement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DQAccuracyOfATimeMeasurement(), newDQAccuracyOfATimeMeasurement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDQAccuracyOfATimeMeasurement(DQAccuracyOfATimeMeasurementType newDQAccuracyOfATimeMeasurement) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DQAccuracyOfATimeMeasurement(), newDQAccuracyOfATimeMeasurement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQCompletenessCommissionType getDQCompletenessCommission() {
		return (DQCompletenessCommissionType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DQCompletenessCommission(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDQCompletenessCommission(DQCompletenessCommissionType newDQCompletenessCommission, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DQCompletenessCommission(), newDQCompletenessCommission, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDQCompletenessCommission(DQCompletenessCommissionType newDQCompletenessCommission) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DQCompletenessCommission(), newDQCompletenessCommission);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQCompletenessOmissionType getDQCompletenessOmission() {
		return (DQCompletenessOmissionType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DQCompletenessOmission(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDQCompletenessOmission(DQCompletenessOmissionType newDQCompletenessOmission, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DQCompletenessOmission(), newDQCompletenessOmission, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDQCompletenessOmission(DQCompletenessOmissionType newDQCompletenessOmission) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DQCompletenessOmission(), newDQCompletenessOmission);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQConceptualConsistencyType getDQConceptualConsistency() {
		return (DQConceptualConsistencyType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DQConceptualConsistency(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDQConceptualConsistency(DQConceptualConsistencyType newDQConceptualConsistency, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DQConceptualConsistency(), newDQConceptualConsistency, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDQConceptualConsistency(DQConceptualConsistencyType newDQConceptualConsistency) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DQConceptualConsistency(), newDQConceptualConsistency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQConformanceResultType getDQConformanceResult() {
		return (DQConformanceResultType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DQConformanceResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDQConformanceResult(DQConformanceResultType newDQConformanceResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DQConformanceResult(), newDQConformanceResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDQConformanceResult(DQConformanceResultType newDQConformanceResult) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DQConformanceResult(), newDQConformanceResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQDataQualityType getDQDataQuality() {
		return (DQDataQualityType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DQDataQuality(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDQDataQuality(DQDataQualityType newDQDataQuality, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DQDataQuality(), newDQDataQuality, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDQDataQuality(DQDataQualityType newDQDataQuality) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DQDataQuality(), newDQDataQuality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQDomainConsistencyType getDQDomainConsistency() {
		return (DQDomainConsistencyType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DQDomainConsistency(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDQDomainConsistency(DQDomainConsistencyType newDQDomainConsistency, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DQDomainConsistency(), newDQDomainConsistency, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDQDomainConsistency(DQDomainConsistencyType newDQDomainConsistency) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DQDomainConsistency(), newDQDomainConsistency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getDQEvaluationMethodTypeCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DQEvaluationMethodTypeCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDQEvaluationMethodTypeCode(CodeListValueType newDQEvaluationMethodTypeCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DQEvaluationMethodTypeCode(), newDQEvaluationMethodTypeCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDQEvaluationMethodTypeCode(CodeListValueType newDQEvaluationMethodTypeCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DQEvaluationMethodTypeCode(), newDQEvaluationMethodTypeCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQFormatConsistencyType getDQFormatConsistency() {
		return (DQFormatConsistencyType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DQFormatConsistency(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDQFormatConsistency(DQFormatConsistencyType newDQFormatConsistency, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DQFormatConsistency(), newDQFormatConsistency, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDQFormatConsistency(DQFormatConsistencyType newDQFormatConsistency) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DQFormatConsistency(), newDQFormatConsistency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQGriddedDataPositionalAccuracyType getDQGriddedDataPositionalAccuracy() {
		return (DQGriddedDataPositionalAccuracyType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DQGriddedDataPositionalAccuracy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDQGriddedDataPositionalAccuracy(DQGriddedDataPositionalAccuracyType newDQGriddedDataPositionalAccuracy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DQGriddedDataPositionalAccuracy(), newDQGriddedDataPositionalAccuracy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDQGriddedDataPositionalAccuracy(DQGriddedDataPositionalAccuracyType newDQGriddedDataPositionalAccuracy) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DQGriddedDataPositionalAccuracy(), newDQGriddedDataPositionalAccuracy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQNonQuantitativeAttributeAccuracyType getDQNonQuantitativeAttributeAccuracy() {
		return (DQNonQuantitativeAttributeAccuracyType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DQNonQuantitativeAttributeAccuracy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDQNonQuantitativeAttributeAccuracy(DQNonQuantitativeAttributeAccuracyType newDQNonQuantitativeAttributeAccuracy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DQNonQuantitativeAttributeAccuracy(), newDQNonQuantitativeAttributeAccuracy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDQNonQuantitativeAttributeAccuracy(DQNonQuantitativeAttributeAccuracyType newDQNonQuantitativeAttributeAccuracy) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DQNonQuantitativeAttributeAccuracy(), newDQNonQuantitativeAttributeAccuracy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQQuantitativeAttributeAccuracyType getDQQuantitativeAttributeAccuracy() {
		return (DQQuantitativeAttributeAccuracyType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DQQuantitativeAttributeAccuracy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDQQuantitativeAttributeAccuracy(DQQuantitativeAttributeAccuracyType newDQQuantitativeAttributeAccuracy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DQQuantitativeAttributeAccuracy(), newDQQuantitativeAttributeAccuracy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDQQuantitativeAttributeAccuracy(DQQuantitativeAttributeAccuracyType newDQQuantitativeAttributeAccuracy) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DQQuantitativeAttributeAccuracy(), newDQQuantitativeAttributeAccuracy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQQuantitativeResultType getDQQuantitativeResult() {
		return (DQQuantitativeResultType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DQQuantitativeResult(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDQQuantitativeResult(DQQuantitativeResultType newDQQuantitativeResult, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DQQuantitativeResult(), newDQQuantitativeResult, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDQQuantitativeResult(DQQuantitativeResultType newDQQuantitativeResult) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DQQuantitativeResult(), newDQQuantitativeResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQRelativeInternalPositionalAccuracyType getDQRelativeInternalPositionalAccuracy() {
		return (DQRelativeInternalPositionalAccuracyType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DQRelativeInternalPositionalAccuracy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDQRelativeInternalPositionalAccuracy(DQRelativeInternalPositionalAccuracyType newDQRelativeInternalPositionalAccuracy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DQRelativeInternalPositionalAccuracy(), newDQRelativeInternalPositionalAccuracy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDQRelativeInternalPositionalAccuracy(DQRelativeInternalPositionalAccuracyType newDQRelativeInternalPositionalAccuracy) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DQRelativeInternalPositionalAccuracy(), newDQRelativeInternalPositionalAccuracy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQScopeType getDQScope() {
		return (DQScopeType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DQScope(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDQScope(DQScopeType newDQScope, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DQScope(), newDQScope, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDQScope(DQScopeType newDQScope) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DQScope(), newDQScope);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQTemporalConsistencyType getDQTemporalConsistency() {
		return (DQTemporalConsistencyType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DQTemporalConsistency(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDQTemporalConsistency(DQTemporalConsistencyType newDQTemporalConsistency, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DQTemporalConsistency(), newDQTemporalConsistency, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDQTemporalConsistency(DQTemporalConsistencyType newDQTemporalConsistency) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DQTemporalConsistency(), newDQTemporalConsistency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQTemporalValidityType getDQTemporalValidity() {
		return (DQTemporalValidityType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DQTemporalValidity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDQTemporalValidity(DQTemporalValidityType newDQTemporalValidity, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DQTemporalValidity(), newDQTemporalValidity, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDQTemporalValidity(DQTemporalValidityType newDQTemporalValidity) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DQTemporalValidity(), newDQTemporalValidity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQThematicClassificationCorrectnessType getDQThematicClassificationCorrectness() {
		return (DQThematicClassificationCorrectnessType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DQThematicClassificationCorrectness(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDQThematicClassificationCorrectness(DQThematicClassificationCorrectnessType newDQThematicClassificationCorrectness, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DQThematicClassificationCorrectness(), newDQThematicClassificationCorrectness, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDQThematicClassificationCorrectness(DQThematicClassificationCorrectnessType newDQThematicClassificationCorrectness) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DQThematicClassificationCorrectness(), newDQThematicClassificationCorrectness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQTopologicalConsistencyType getDQTopologicalConsistency() {
		return (DQTopologicalConsistencyType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DQTopologicalConsistency(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDQTopologicalConsistency(DQTopologicalConsistencyType newDQTopologicalConsistency, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DQTopologicalConsistency(), newDQTopologicalConsistency, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDQTopologicalConsistency(DQTopologicalConsistencyType newDQTopologicalConsistency) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DQTopologicalConsistency(), newDQTopologicalConsistency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSAssociationType getDSAssociation() {
		return (DSAssociationType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DSAssociation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSAssociation(DSAssociationType newDSAssociation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DSAssociation(), newDSAssociation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDSAssociation(DSAssociationType newDSAssociation) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DSAssociation(), newDSAssociation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getDSAssociationTypeCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DSAssociationTypeCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSAssociationTypeCode(CodeListValueType newDSAssociationTypeCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DSAssociationTypeCode(), newDSAssociationTypeCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDSAssociationTypeCode(CodeListValueType newDSAssociationTypeCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DSAssociationTypeCode(), newDSAssociationTypeCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSDataSetType getDSDataSet() {
		return (DSDataSetType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DSDataSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSDataSet(DSDataSetType newDSDataSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DSDataSet(), newDSDataSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDSDataSet(DSDataSetType newDSDataSet) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DSDataSet(), newDSDataSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSInitiativeType getDSInitiative() {
		return (DSInitiativeType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DSInitiative(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSInitiative(DSInitiativeType newDSInitiative, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DSInitiative(), newDSInitiative, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDSInitiative(DSInitiativeType newDSInitiative) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DSInitiative(), newDSInitiative);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getDSInitiativeTypeCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DSInitiativeTypeCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSInitiativeTypeCode(CodeListValueType newDSInitiativeTypeCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DSInitiativeTypeCode(), newDSInitiativeTypeCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDSInitiativeTypeCode(CodeListValueType newDSInitiativeTypeCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DSInitiativeTypeCode(), newDSInitiativeTypeCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSOtherAggregateType getDSOtherAggregate() {
		return (DSOtherAggregateType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DSOtherAggregate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSOtherAggregate(DSOtherAggregateType newDSOtherAggregate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DSOtherAggregate(), newDSOtherAggregate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDSOtherAggregate(DSOtherAggregateType newDSOtherAggregate) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DSOtherAggregate(), newDSOtherAggregate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSPlatformType getDSPlatform() {
		return (DSPlatformType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DSPlatform(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSPlatform(DSPlatformType newDSPlatform, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DSPlatform(), newDSPlatform, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDSPlatform(DSPlatformType newDSPlatform) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DSPlatform(), newDSPlatform);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSSeriesType getDSSeries() {
		return (DSSeriesType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DSSeries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSSeries(DSSeriesType newDSSeries, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DSSeries(), newDSSeries, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDSSeries(DSSeriesType newDSSeries) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DSSeries(), newDSSeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSProductionSeriesType getDSProductionSeries() {
		return (DSProductionSeriesType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DSProductionSeries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSProductionSeries(DSProductionSeriesType newDSProductionSeries, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DSProductionSeries(), newDSProductionSeries, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDSProductionSeries(DSProductionSeriesType newDSProductionSeries) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DSProductionSeries(), newDSProductionSeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSSensorType getDSSensor() {
		return (DSSensorType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DSSensor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSSensor(DSSensorType newDSSensor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DSSensor(), newDSSensor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDSSensor(DSSensorType newDSSensor) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DSSensor(), newDSSensor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSStereoMateType getDSStereoMate() {
		return (DSStereoMateType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_DSStereoMate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSStereoMate(DSStereoMateType newDSStereoMate, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_DSStereoMate(), newDSStereoMate, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDSStereoMate(DSStereoMateType newDSStereoMate) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_DSStereoMate(), newDSStereoMate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXBoundingPolygonType getEXBoundingPolygon() {
		return (EXBoundingPolygonType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_EXBoundingPolygon(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEXBoundingPolygon(EXBoundingPolygonType newEXBoundingPolygon, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_EXBoundingPolygon(), newEXBoundingPolygon, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEXBoundingPolygon(EXBoundingPolygonType newEXBoundingPolygon) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_EXBoundingPolygon(), newEXBoundingPolygon);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXExtentType getEXExtent() {
		return (EXExtentType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_EXExtent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEXExtent(EXExtentType newEXExtent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_EXExtent(), newEXExtent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEXExtent(EXExtentType newEXExtent) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_EXExtent(), newEXExtent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXGeographicBoundingBoxType getEXGeographicBoundingBox() {
		return (EXGeographicBoundingBoxType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_EXGeographicBoundingBox(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEXGeographicBoundingBox(EXGeographicBoundingBoxType newEXGeographicBoundingBox, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_EXGeographicBoundingBox(), newEXGeographicBoundingBox, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEXGeographicBoundingBox(EXGeographicBoundingBoxType newEXGeographicBoundingBox) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_EXGeographicBoundingBox(), newEXGeographicBoundingBox);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXGeographicDescriptionType getEXGeographicDescription() {
		return (EXGeographicDescriptionType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_EXGeographicDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEXGeographicDescription(EXGeographicDescriptionType newEXGeographicDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_EXGeographicDescription(), newEXGeographicDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEXGeographicDescription(EXGeographicDescriptionType newEXGeographicDescription) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_EXGeographicDescription(), newEXGeographicDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXSpatialTemporalExtentType getEXSpatialTemporalExtent() {
		return (EXSpatialTemporalExtentType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_EXSpatialTemporalExtent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEXSpatialTemporalExtent(EXSpatialTemporalExtentType newEXSpatialTemporalExtent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_EXSpatialTemporalExtent(), newEXSpatialTemporalExtent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEXSpatialTemporalExtent(EXSpatialTemporalExtentType newEXSpatialTemporalExtent) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_EXSpatialTemporalExtent(), newEXSpatialTemporalExtent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXTemporalExtentType getEXTemporalExtent() {
		return (EXTemporalExtentType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_EXTemporalExtent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEXTemporalExtent(EXTemporalExtentType newEXTemporalExtent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_EXTemporalExtent(), newEXTemporalExtent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEXTemporalExtent(EXTemporalExtentType newEXTemporalExtent) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_EXTemporalExtent(), newEXTemporalExtent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXVerticalExtentType getEXVerticalExtent() {
		return (EXVerticalExtentType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_EXVerticalExtent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEXVerticalExtent(EXVerticalExtentType newEXVerticalExtent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_EXVerticalExtent(), newEXVerticalExtent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEXVerticalExtent(EXVerticalExtentType newEXVerticalExtent) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_EXVerticalExtent(), newEXVerticalExtent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getLanguageCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_LanguageCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLanguageCode(CodeListValueType newLanguageCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_LanguageCode(), newLanguageCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguageCode(CodeListValueType newLanguageCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_LanguageCode(), newLanguageCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LILineageType getLILineage() {
		return (LILineageType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_LILineage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLILineage(LILineageType newLILineage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_LILineage(), newLILineage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLILineage(LILineageType newLILineage) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_LILineage(), newLILineage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LIProcessStepType getLIProcessStep() {
		return (LIProcessStepType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_LIProcessStep(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLIProcessStep(LIProcessStepType newLIProcessStep, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_LIProcessStep(), newLIProcessStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLIProcessStep(LIProcessStepType newLIProcessStep) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_LIProcessStep(), newLIProcessStep);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LISourceType getLISource() {
		return (LISourceType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_LISource(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLISource(LISourceType newLISource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_LISource(), newLISource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLISource(LISourceType newLISource) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_LISource(), newLISource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalisedCharacterStringType getLocalisedCharacterString() {
		return (LocalisedCharacterStringType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_LocalisedCharacterString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalisedCharacterString(LocalisedCharacterStringType newLocalisedCharacterString, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_LocalisedCharacterString(), newLocalisedCharacterString, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalisedCharacterString(LocalisedCharacterStringType newLocalisedCharacterString) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_LocalisedCharacterString(), newLocalisedCharacterString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDAggregateInformationType getMDAggregateInformation() {
		return (MDAggregateInformationType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDAggregateInformation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDAggregateInformation(MDAggregateInformationType newMDAggregateInformation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDAggregateInformation(), newMDAggregateInformation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDAggregateInformation(MDAggregateInformationType newMDAggregateInformation) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDAggregateInformation(), newMDAggregateInformation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDApplicationSchemaInformationType getMDApplicationSchemaInformation() {
		return (MDApplicationSchemaInformationType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDApplicationSchemaInformation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDApplicationSchemaInformation(MDApplicationSchemaInformationType newMDApplicationSchemaInformation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDApplicationSchemaInformation(), newMDApplicationSchemaInformation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDApplicationSchemaInformation(MDApplicationSchemaInformationType newMDApplicationSchemaInformation) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDApplicationSchemaInformation(), newMDApplicationSchemaInformation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDBandType getMDBand() {
		return (MDBandType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDBand(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDBand(MDBandType newMDBand, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDBand(), newMDBand, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDBand(MDBandType newMDBand) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDBand(), newMDBand);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDRangeDimensionType getMDRangeDimension() {
		return (MDRangeDimensionType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDRangeDimension(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDRangeDimension(MDRangeDimensionType newMDRangeDimension, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDRangeDimension(), newMDRangeDimension, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDRangeDimension(MDRangeDimensionType newMDRangeDimension) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDRangeDimension(), newMDRangeDimension);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDBrowseGraphicType getMDBrowseGraphic() {
		return (MDBrowseGraphicType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDBrowseGraphic(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDBrowseGraphic(MDBrowseGraphicType newMDBrowseGraphic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDBrowseGraphic(), newMDBrowseGraphic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDBrowseGraphic(MDBrowseGraphicType newMDBrowseGraphic) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDBrowseGraphic(), newMDBrowseGraphic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getMDCellGeometryCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDCellGeometryCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDCellGeometryCode(CodeListValueType newMDCellGeometryCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDCellGeometryCode(), newMDCellGeometryCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDCellGeometryCode(CodeListValueType newMDCellGeometryCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDCellGeometryCode(), newMDCellGeometryCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getMDCharacterSetCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDCharacterSetCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDCharacterSetCode(CodeListValueType newMDCharacterSetCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDCharacterSetCode(), newMDCharacterSetCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDCharacterSetCode(CodeListValueType newMDCharacterSetCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDCharacterSetCode(), newMDCharacterSetCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getMDClassificationCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDClassificationCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDClassificationCode(CodeListValueType newMDClassificationCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDClassificationCode(), newMDClassificationCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDClassificationCode(CodeListValueType newMDClassificationCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDClassificationCode(), newMDClassificationCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDConstraintsType getMDConstraints() {
		return (MDConstraintsType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDConstraints(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDConstraints(MDConstraintsType newMDConstraints, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDConstraints(), newMDConstraints, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDConstraints(MDConstraintsType newMDConstraints) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDConstraints(), newMDConstraints);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getMDCoverageContentTypeCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDCoverageContentTypeCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDCoverageContentTypeCode(CodeListValueType newMDCoverageContentTypeCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDCoverageContentTypeCode(), newMDCoverageContentTypeCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDCoverageContentTypeCode(CodeListValueType newMDCoverageContentTypeCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDCoverageContentTypeCode(), newMDCoverageContentTypeCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDCoverageDescriptionType getMDCoverageDescription() {
		return (MDCoverageDescriptionType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDCoverageDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDCoverageDescription(MDCoverageDescriptionType newMDCoverageDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDCoverageDescription(), newMDCoverageDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDCoverageDescription(MDCoverageDescriptionType newMDCoverageDescription) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDCoverageDescription(), newMDCoverageDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDDataIdentificationType getMDDataIdentification() {
		return (MDDataIdentificationType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDDataIdentification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDDataIdentification(MDDataIdentificationType newMDDataIdentification, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDDataIdentification(), newMDDataIdentification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDDataIdentification(MDDataIdentificationType newMDDataIdentification) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDDataIdentification(), newMDDataIdentification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getMDDatatypeCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDDatatypeCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDDatatypeCode(CodeListValueType newMDDatatypeCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDDatatypeCode(), newMDDatatypeCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDDatatypeCode(CodeListValueType newMDDatatypeCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDDatatypeCode(), newMDDatatypeCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDDigitalTransferOptionsType getMDDigitalTransferOptions() {
		return (MDDigitalTransferOptionsType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDDigitalTransferOptions(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDDigitalTransferOptions(MDDigitalTransferOptionsType newMDDigitalTransferOptions, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDDigitalTransferOptions(), newMDDigitalTransferOptions, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDDigitalTransferOptions(MDDigitalTransferOptionsType newMDDigitalTransferOptions) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDDigitalTransferOptions(), newMDDigitalTransferOptions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDDimensionType getMDDimension() {
		return (MDDimensionType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDDimension(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDDimension(MDDimensionType newMDDimension, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDDimension(), newMDDimension, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDDimension(MDDimensionType newMDDimension) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDDimension(), newMDDimension);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getMDDimensionNameTypeCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDDimensionNameTypeCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDDimensionNameTypeCode(CodeListValueType newMDDimensionNameTypeCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDDimensionNameTypeCode(), newMDDimensionNameTypeCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDDimensionNameTypeCode(CodeListValueType newMDDimensionNameTypeCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDDimensionNameTypeCode(), newMDDimensionNameTypeCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDDistributionType getMDDistribution() {
		return (MDDistributionType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDDistribution(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDDistribution(MDDistributionType newMDDistribution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDDistribution(), newMDDistribution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDDistribution(MDDistributionType newMDDistribution) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDDistribution(), newMDDistribution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getMDDistributionUnits() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDDistributionUnits(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDDistributionUnits(CodeListValueType newMDDistributionUnits, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDDistributionUnits(), newMDDistributionUnits, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDDistributionUnits(CodeListValueType newMDDistributionUnits) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDDistributionUnits(), newMDDistributionUnits);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDDistributorType getMDDistributor() {
		return (MDDistributorType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDDistributor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDDistributor(MDDistributorType newMDDistributor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDDistributor(), newMDDistributor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDDistributor(MDDistributorType newMDDistributor) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDDistributor(), newMDDistributor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDExtendedElementInformationType getMDExtendedElementInformation() {
		return (MDExtendedElementInformationType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDExtendedElementInformation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDExtendedElementInformation(MDExtendedElementInformationType newMDExtendedElementInformation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDExtendedElementInformation(), newMDExtendedElementInformation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDExtendedElementInformation(MDExtendedElementInformationType newMDExtendedElementInformation) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDExtendedElementInformation(), newMDExtendedElementInformation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDFeatureCatalogueDescriptionType getMDFeatureCatalogueDescription() {
		return (MDFeatureCatalogueDescriptionType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDFeatureCatalogueDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDFeatureCatalogueDescription(MDFeatureCatalogueDescriptionType newMDFeatureCatalogueDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDFeatureCatalogueDescription(), newMDFeatureCatalogueDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDFeatureCatalogueDescription(MDFeatureCatalogueDescriptionType newMDFeatureCatalogueDescription) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDFeatureCatalogueDescription(), newMDFeatureCatalogueDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDFormatType getMDFormat() {
		return (MDFormatType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDFormat(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDFormat(MDFormatType newMDFormat, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDFormat(), newMDFormat, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDFormat(MDFormatType newMDFormat) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDFormat(), newMDFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDGeometricObjectsType getMDGeometricObjects() {
		return (MDGeometricObjectsType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDGeometricObjects(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDGeometricObjects(MDGeometricObjectsType newMDGeometricObjects, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDGeometricObjects(), newMDGeometricObjects, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDGeometricObjects(MDGeometricObjectsType newMDGeometricObjects) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDGeometricObjects(), newMDGeometricObjects);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getMDGeometricObjectTypeCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDGeometricObjectTypeCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDGeometricObjectTypeCode(CodeListValueType newMDGeometricObjectTypeCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDGeometricObjectTypeCode(), newMDGeometricObjectTypeCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDGeometricObjectTypeCode(CodeListValueType newMDGeometricObjectTypeCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDGeometricObjectTypeCode(), newMDGeometricObjectTypeCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDGeorectifiedType getMDGeorectified() {
		return (MDGeorectifiedType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDGeorectified(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDGeorectified(MDGeorectifiedType newMDGeorectified, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDGeorectified(), newMDGeorectified, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDGeorectified(MDGeorectifiedType newMDGeorectified) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDGeorectified(), newMDGeorectified);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDGridSpatialRepresentationType getMDGridSpatialRepresentation() {
		return (MDGridSpatialRepresentationType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDGridSpatialRepresentation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDGridSpatialRepresentation(MDGridSpatialRepresentationType newMDGridSpatialRepresentation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDGridSpatialRepresentation(), newMDGridSpatialRepresentation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDGridSpatialRepresentation(MDGridSpatialRepresentationType newMDGridSpatialRepresentation) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDGridSpatialRepresentation(), newMDGridSpatialRepresentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDGeoreferenceableType getMDGeoreferenceable() {
		return (MDGeoreferenceableType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDGeoreferenceable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDGeoreferenceable(MDGeoreferenceableType newMDGeoreferenceable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDGeoreferenceable(), newMDGeoreferenceable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDGeoreferenceable(MDGeoreferenceableType newMDGeoreferenceable) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDGeoreferenceable(), newMDGeoreferenceable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDIdentifierType getMDIdentifier() {
		return (MDIdentifierType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDIdentifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDIdentifier(MDIdentifierType newMDIdentifier, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDIdentifier(), newMDIdentifier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDIdentifier(MDIdentifierType newMDIdentifier) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDIdentifier(), newMDIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDImageDescriptionType getMDImageDescription() {
		return (MDImageDescriptionType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDImageDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDImageDescription(MDImageDescriptionType newMDImageDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDImageDescription(), newMDImageDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDImageDescription(MDImageDescriptionType newMDImageDescription) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDImageDescription(), newMDImageDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getMDImagingConditionCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDImagingConditionCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDImagingConditionCode(CodeListValueType newMDImagingConditionCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDImagingConditionCode(), newMDImagingConditionCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDImagingConditionCode(CodeListValueType newMDImagingConditionCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDImagingConditionCode(), newMDImagingConditionCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDKeywordsType getMDKeywords() {
		return (MDKeywordsType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDKeywords(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDKeywords(MDKeywordsType newMDKeywords, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDKeywords(), newMDKeywords, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDKeywords(MDKeywordsType newMDKeywords) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDKeywords(), newMDKeywords);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getMDKeywordTypeCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDKeywordTypeCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDKeywordTypeCode(CodeListValueType newMDKeywordTypeCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDKeywordTypeCode(), newMDKeywordTypeCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDKeywordTypeCode(CodeListValueType newMDKeywordTypeCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDKeywordTypeCode(), newMDKeywordTypeCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDLegalConstraintsType getMDLegalConstraints() {
		return (MDLegalConstraintsType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDLegalConstraints(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDLegalConstraints(MDLegalConstraintsType newMDLegalConstraints, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDLegalConstraints(), newMDLegalConstraints, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDLegalConstraints(MDLegalConstraintsType newMDLegalConstraints) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDLegalConstraints(), newMDLegalConstraints);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getMDMaintenanceFrequencyCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDMaintenanceFrequencyCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDMaintenanceFrequencyCode(CodeListValueType newMDMaintenanceFrequencyCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDMaintenanceFrequencyCode(), newMDMaintenanceFrequencyCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDMaintenanceFrequencyCode(CodeListValueType newMDMaintenanceFrequencyCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDMaintenanceFrequencyCode(), newMDMaintenanceFrequencyCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDMaintenanceInformationType getMDMaintenanceInformation() {
		return (MDMaintenanceInformationType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDMaintenanceInformation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDMaintenanceInformation(MDMaintenanceInformationType newMDMaintenanceInformation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDMaintenanceInformation(), newMDMaintenanceInformation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDMaintenanceInformation(MDMaintenanceInformationType newMDMaintenanceInformation) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDMaintenanceInformation(), newMDMaintenanceInformation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDMediumType getMDMedium() {
		return (MDMediumType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDMedium(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDMedium(MDMediumType newMDMedium, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDMedium(), newMDMedium, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDMedium(MDMediumType newMDMedium) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDMedium(), newMDMedium);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getMDMediumFormatCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDMediumFormatCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDMediumFormatCode(CodeListValueType newMDMediumFormatCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDMediumFormatCode(), newMDMediumFormatCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDMediumFormatCode(CodeListValueType newMDMediumFormatCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDMediumFormatCode(), newMDMediumFormatCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getMDMediumNameCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDMediumNameCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDMediumNameCode(CodeListValueType newMDMediumNameCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDMediumNameCode(), newMDMediumNameCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDMediumNameCode(CodeListValueType newMDMediumNameCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDMediumNameCode(), newMDMediumNameCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDMetadataType getMDMetadata() {
		return (MDMetadataType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDMetadata(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDMetadata(MDMetadataType newMDMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDMetadata(), newMDMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDMetadata(MDMetadataType newMDMetadata) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDMetadata(), newMDMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDMetadataExtensionInformationType getMDMetadataExtensionInformation() {
		return (MDMetadataExtensionInformationType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDMetadataExtensionInformation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDMetadataExtensionInformation(MDMetadataExtensionInformationType newMDMetadataExtensionInformation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDMetadataExtensionInformation(), newMDMetadataExtensionInformation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDMetadataExtensionInformation(MDMetadataExtensionInformationType newMDMetadataExtensionInformation) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDMetadataExtensionInformation(), newMDMetadataExtensionInformation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDObligationCodeType getMDObligationCode() {
		return (MDObligationCodeType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDObligationCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDObligationCode(MDObligationCodeType newMDObligationCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDObligationCode(), newMDObligationCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDPixelOrientationCodeType getMDPixelOrientationCode() {
		return (MDPixelOrientationCodeType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDPixelOrientationCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDPixelOrientationCode(MDPixelOrientationCodeType newMDPixelOrientationCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDPixelOrientationCode(), newMDPixelOrientationCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDPortrayalCatalogueReferenceType getMDPortrayalCatalogueReference() {
		return (MDPortrayalCatalogueReferenceType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDPortrayalCatalogueReference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDPortrayalCatalogueReference(MDPortrayalCatalogueReferenceType newMDPortrayalCatalogueReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDPortrayalCatalogueReference(), newMDPortrayalCatalogueReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDPortrayalCatalogueReference(MDPortrayalCatalogueReferenceType newMDPortrayalCatalogueReference) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDPortrayalCatalogueReference(), newMDPortrayalCatalogueReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getMDProgressCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDProgressCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDProgressCode(CodeListValueType newMDProgressCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDProgressCode(), newMDProgressCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDProgressCode(CodeListValueType newMDProgressCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDProgressCode(), newMDProgressCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDReferenceSystemType getMDReferenceSystem() {
		return (MDReferenceSystemType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDReferenceSystem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDReferenceSystem(MDReferenceSystemType newMDReferenceSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDReferenceSystem(), newMDReferenceSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDReferenceSystem(MDReferenceSystemType newMDReferenceSystem) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDReferenceSystem(), newMDReferenceSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDRepresentativeFractionType getMDRepresentativeFraction() {
		return (MDRepresentativeFractionType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDRepresentativeFraction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDRepresentativeFraction(MDRepresentativeFractionType newMDRepresentativeFraction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDRepresentativeFraction(), newMDRepresentativeFraction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDRepresentativeFraction(MDRepresentativeFractionType newMDRepresentativeFraction) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDRepresentativeFraction(), newMDRepresentativeFraction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDResolutionType getMDResolution() {
		return (MDResolutionType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDResolution(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDResolution(MDResolutionType newMDResolution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDResolution(), newMDResolution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDResolution(MDResolutionType newMDResolution) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDResolution(), newMDResolution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getMDRestrictionCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDRestrictionCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDRestrictionCode(CodeListValueType newMDRestrictionCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDRestrictionCode(), newMDRestrictionCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDRestrictionCode(CodeListValueType newMDRestrictionCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDRestrictionCode(), newMDRestrictionCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getMDScopeCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDScopeCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDScopeCode(CodeListValueType newMDScopeCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDScopeCode(), newMDScopeCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDScopeCode(CodeListValueType newMDScopeCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDScopeCode(), newMDScopeCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDScopeDescriptionType getMDScopeDescription() {
		return (MDScopeDescriptionType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDScopeDescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDScopeDescription(MDScopeDescriptionType newMDScopeDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDScopeDescription(), newMDScopeDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDScopeDescription(MDScopeDescriptionType newMDScopeDescription) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDScopeDescription(), newMDScopeDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDSecurityConstraintsType getMDSecurityConstraints() {
		return (MDSecurityConstraintsType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDSecurityConstraints(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDSecurityConstraints(MDSecurityConstraintsType newMDSecurityConstraints, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDSecurityConstraints(), newMDSecurityConstraints, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDSecurityConstraints(MDSecurityConstraintsType newMDSecurityConstraints) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDSecurityConstraints(), newMDSecurityConstraints);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDServiceIdentificationType getMDServiceIdentification() {
		return (MDServiceIdentificationType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDServiceIdentification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDServiceIdentification(MDServiceIdentificationType newMDServiceIdentification, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDServiceIdentification(), newMDServiceIdentification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDServiceIdentification(MDServiceIdentificationType newMDServiceIdentification) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDServiceIdentification(), newMDServiceIdentification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getMDSpatialRepresentationTypeCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDSpatialRepresentationTypeCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDSpatialRepresentationTypeCode(CodeListValueType newMDSpatialRepresentationTypeCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDSpatialRepresentationTypeCode(), newMDSpatialRepresentationTypeCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDSpatialRepresentationTypeCode(CodeListValueType newMDSpatialRepresentationTypeCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDSpatialRepresentationTypeCode(), newMDSpatialRepresentationTypeCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDStandardOrderProcessType getMDStandardOrderProcess() {
		return (MDStandardOrderProcessType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDStandardOrderProcess(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDStandardOrderProcess(MDStandardOrderProcessType newMDStandardOrderProcess, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDStandardOrderProcess(), newMDStandardOrderProcess, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDStandardOrderProcess(MDStandardOrderProcessType newMDStandardOrderProcess) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDStandardOrderProcess(), newMDStandardOrderProcess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDTopicCategoryCodeType getMDTopicCategoryCode() {
		return (MDTopicCategoryCodeType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDTopicCategoryCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDTopicCategoryCode(MDTopicCategoryCodeType newMDTopicCategoryCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDTopicCategoryCode(), newMDTopicCategoryCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeListValueType getMDTopologyLevelCode() {
		return (CodeListValueType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDTopologyLevelCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDTopologyLevelCode(CodeListValueType newMDTopologyLevelCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDTopologyLevelCode(), newMDTopologyLevelCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDTopologyLevelCode(CodeListValueType newMDTopologyLevelCode) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDTopologyLevelCode(), newMDTopologyLevelCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDUsageType getMDUsage() {
		return (MDUsageType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDUsage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDUsage(MDUsageType newMDUsage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDUsage(), newMDUsage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDUsage(MDUsageType newMDUsage) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDUsage(), newMDUsage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDVectorSpatialRepresentationType getMDVectorSpatialRepresentation() {
		return (MDVectorSpatialRepresentationType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_MDVectorSpatialRepresentation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDVectorSpatialRepresentation(MDVectorSpatialRepresentationType newMDVectorSpatialRepresentation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_MDVectorSpatialRepresentation(), newMDVectorSpatialRepresentation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMDVectorSpatialRepresentation(MDVectorSpatialRepresentationType newMDVectorSpatialRepresentation) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_MDVectorSpatialRepresentation(), newMDVectorSpatialRepresentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PTFreeTextType getPTFreeText() {
		return (PTFreeTextType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_PTFreeText(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPTFreeText(PTFreeTextType newPTFreeText, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_PTFreeText(), newPTFreeText, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPTFreeText(PTFreeTextType newPTFreeText) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_PTFreeText(), newPTFreeText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PTLocaleType getPTLocale() {
		return (PTLocaleType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_PTLocale(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPTLocale(PTLocaleType newPTLocale, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_PTLocale(), newPTLocale, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPTLocale(PTLocaleType newPTLocale) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_PTLocale(), newPTLocale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PTLocaleContainerType getPTLocaleContainer() {
		return (PTLocaleContainerType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_PTLocaleContainer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPTLocaleContainer(PTLocaleContainerType newPTLocaleContainer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_PTLocaleContainer(), newPTLocaleContainer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPTLocaleContainer(PTLocaleContainerType newPTLocaleContainer) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_PTLocaleContainer(), newPTLocaleContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RSIdentifierType getRSIdentifier() {
		return (RSIdentifierType)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_RSIdentifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRSIdentifier(RSIdentifierType newRSIdentifier, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GMDPackage.eINSTANCE.getDocumentRoot_RSIdentifier(), newRSIdentifier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRSIdentifier(RSIdentifierType newRSIdentifier) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_RSIdentifier(), newRSIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getURL() {
		return (String)getMixed().get(GMDPackage.eINSTANCE.getDocumentRoot_URL(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setURL(String newURL) {
		((FeatureMap.Internal)getMixed()).set(GMDPackage.eINSTANCE.getDocumentRoot_URL(), newURL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case GMDPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case GMDPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DQ_COMPLETENESS:
				return basicSetAbstractDQCompleteness(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DQ_ELEMENT:
				return basicSetAbstractDQElement(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DQ_LOGICAL_CONSISTENCY:
				return basicSetAbstractDQLogicalConsistency(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DQ_POSITIONAL_ACCURACY:
				return basicSetAbstractDQPositionalAccuracy(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DQ_RESULT:
				return basicSetAbstractDQResult(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DQ_TEMPORAL_ACCURACY:
				return basicSetAbstractDQTemporalAccuracy(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DQ_THEMATIC_ACCURACY:
				return basicSetAbstractDQThematicAccuracy(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DS_AGGREGATE:
				return basicSetAbstractDSAggregate(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_EX_GEOGRAPHIC_EXTENT:
				return basicSetAbstractEXGeographicExtent(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_MD_CONTENT_INFORMATION:
				return basicSetAbstractMDContentInformation(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_MD_IDENTIFICATION:
				return basicSetAbstractMDIdentification(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_MD_SPATIAL_REPRESENTATION:
				return basicSetAbstractMDSpatialRepresentation(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_RS_REFERENCE_SYSTEM:
				return basicSetAbstractRSReferenceSystem(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__CI_ADDRESS:
				return basicSetCIAddress(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__CI_CITATION:
				return basicSetCICitation(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__CI_CONTACT:
				return basicSetCIContact(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__CI_DATE:
				return basicSetCIDate(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__CI_DATE_TYPE_CODE:
				return basicSetCIDateTypeCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__CI_ON_LINE_FUNCTION_CODE:
				return basicSetCIOnLineFunctionCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__CI_ONLINE_RESOURCE:
				return basicSetCIOnlineResource(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__CI_PRESENTATION_FORM_CODE:
				return basicSetCIPresentationFormCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__CI_RESPONSIBLE_PARTY:
				return basicSetCIResponsibleParty(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__CI_ROLE_CODE:
				return basicSetCIRoleCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__CI_SERIES:
				return basicSetCISeries(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__CI_TELEPHONE:
				return basicSetCITelephone(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__COUNTRY:
				return basicSetCountry(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DQ_ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY:
				return basicSetDQAbsoluteExternalPositionalAccuracy(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DQ_ACCURACY_OF_ATIME_MEASUREMENT:
				return basicSetDQAccuracyOfATimeMeasurement(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DQ_COMPLETENESS_COMMISSION:
				return basicSetDQCompletenessCommission(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DQ_COMPLETENESS_OMISSION:
				return basicSetDQCompletenessOmission(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DQ_CONCEPTUAL_CONSISTENCY:
				return basicSetDQConceptualConsistency(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DQ_CONFORMANCE_RESULT:
				return basicSetDQConformanceResult(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DQ_DATA_QUALITY:
				return basicSetDQDataQuality(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DQ_DOMAIN_CONSISTENCY:
				return basicSetDQDomainConsistency(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DQ_EVALUATION_METHOD_TYPE_CODE:
				return basicSetDQEvaluationMethodTypeCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DQ_FORMAT_CONSISTENCY:
				return basicSetDQFormatConsistency(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DQ_GRIDDED_DATA_POSITIONAL_ACCURACY:
				return basicSetDQGriddedDataPositionalAccuracy(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DQ_NON_QUANTITATIVE_ATTRIBUTE_ACCURACY:
				return basicSetDQNonQuantitativeAttributeAccuracy(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DQ_QUANTITATIVE_ATTRIBUTE_ACCURACY:
				return basicSetDQQuantitativeAttributeAccuracy(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DQ_QUANTITATIVE_RESULT:
				return basicSetDQQuantitativeResult(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DQ_RELATIVE_INTERNAL_POSITIONAL_ACCURACY:
				return basicSetDQRelativeInternalPositionalAccuracy(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DQ_SCOPE:
				return basicSetDQScope(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DQ_TEMPORAL_CONSISTENCY:
				return basicSetDQTemporalConsistency(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DQ_TEMPORAL_VALIDITY:
				return basicSetDQTemporalValidity(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DQ_THEMATIC_CLASSIFICATION_CORRECTNESS:
				return basicSetDQThematicClassificationCorrectness(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DQ_TOPOLOGICAL_CONSISTENCY:
				return basicSetDQTopologicalConsistency(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DS_ASSOCIATION:
				return basicSetDSAssociation(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DS_ASSOCIATION_TYPE_CODE:
				return basicSetDSAssociationTypeCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DS_DATA_SET:
				return basicSetDSDataSet(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DS_INITIATIVE:
				return basicSetDSInitiative(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DS_INITIATIVE_TYPE_CODE:
				return basicSetDSInitiativeTypeCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DS_OTHER_AGGREGATE:
				return basicSetDSOtherAggregate(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DS_PLATFORM:
				return basicSetDSPlatform(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DS_SERIES:
				return basicSetDSSeries(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DS_PRODUCTION_SERIES:
				return basicSetDSProductionSeries(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DS_SENSOR:
				return basicSetDSSensor(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__DS_STEREO_MATE:
				return basicSetDSStereoMate(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__EX_BOUNDING_POLYGON:
				return basicSetEXBoundingPolygon(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__EX_EXTENT:
				return basicSetEXExtent(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__EX_GEOGRAPHIC_BOUNDING_BOX:
				return basicSetEXGeographicBoundingBox(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__EX_GEOGRAPHIC_DESCRIPTION:
				return basicSetEXGeographicDescription(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__EX_SPATIAL_TEMPORAL_EXTENT:
				return basicSetEXSpatialTemporalExtent(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__EX_TEMPORAL_EXTENT:
				return basicSetEXTemporalExtent(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__EX_VERTICAL_EXTENT:
				return basicSetEXVerticalExtent(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__LANGUAGE_CODE:
				return basicSetLanguageCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__LI_LINEAGE:
				return basicSetLILineage(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__LI_PROCESS_STEP:
				return basicSetLIProcessStep(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__LI_SOURCE:
				return basicSetLISource(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__LOCALISED_CHARACTER_STRING:
				return basicSetLocalisedCharacterString(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_AGGREGATE_INFORMATION:
				return basicSetMDAggregateInformation(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_APPLICATION_SCHEMA_INFORMATION:
				return basicSetMDApplicationSchemaInformation(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_BAND:
				return basicSetMDBand(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_RANGE_DIMENSION:
				return basicSetMDRangeDimension(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_BROWSE_GRAPHIC:
				return basicSetMDBrowseGraphic(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_CELL_GEOMETRY_CODE:
				return basicSetMDCellGeometryCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_CHARACTER_SET_CODE:
				return basicSetMDCharacterSetCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_CLASSIFICATION_CODE:
				return basicSetMDClassificationCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_CONSTRAINTS:
				return basicSetMDConstraints(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_COVERAGE_CONTENT_TYPE_CODE:
				return basicSetMDCoverageContentTypeCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_COVERAGE_DESCRIPTION:
				return basicSetMDCoverageDescription(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_DATA_IDENTIFICATION:
				return basicSetMDDataIdentification(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_DATATYPE_CODE:
				return basicSetMDDatatypeCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_DIGITAL_TRANSFER_OPTIONS:
				return basicSetMDDigitalTransferOptions(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_DIMENSION:
				return basicSetMDDimension(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_DIMENSION_NAME_TYPE_CODE:
				return basicSetMDDimensionNameTypeCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_DISTRIBUTION:
				return basicSetMDDistribution(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_DISTRIBUTION_UNITS:
				return basicSetMDDistributionUnits(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_DISTRIBUTOR:
				return basicSetMDDistributor(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_EXTENDED_ELEMENT_INFORMATION:
				return basicSetMDExtendedElementInformation(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_FEATURE_CATALOGUE_DESCRIPTION:
				return basicSetMDFeatureCatalogueDescription(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_FORMAT:
				return basicSetMDFormat(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_GEOMETRIC_OBJECTS:
				return basicSetMDGeometricObjects(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_GEOMETRIC_OBJECT_TYPE_CODE:
				return basicSetMDGeometricObjectTypeCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_GEORECTIFIED:
				return basicSetMDGeorectified(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_GRID_SPATIAL_REPRESENTATION:
				return basicSetMDGridSpatialRepresentation(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_GEOREFERENCEABLE:
				return basicSetMDGeoreferenceable(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_IDENTIFIER:
				return basicSetMDIdentifier(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_IMAGE_DESCRIPTION:
				return basicSetMDImageDescription(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_IMAGING_CONDITION_CODE:
				return basicSetMDImagingConditionCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_KEYWORDS:
				return basicSetMDKeywords(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_KEYWORD_TYPE_CODE:
				return basicSetMDKeywordTypeCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_LEGAL_CONSTRAINTS:
				return basicSetMDLegalConstraints(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_MAINTENANCE_FREQUENCY_CODE:
				return basicSetMDMaintenanceFrequencyCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_MAINTENANCE_INFORMATION:
				return basicSetMDMaintenanceInformation(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_MEDIUM:
				return basicSetMDMedium(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_MEDIUM_FORMAT_CODE:
				return basicSetMDMediumFormatCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_MEDIUM_NAME_CODE:
				return basicSetMDMediumNameCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_METADATA:
				return basicSetMDMetadata(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_METADATA_EXTENSION_INFORMATION:
				return basicSetMDMetadataExtensionInformation(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_PORTRAYAL_CATALOGUE_REFERENCE:
				return basicSetMDPortrayalCatalogueReference(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_PROGRESS_CODE:
				return basicSetMDProgressCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_REFERENCE_SYSTEM:
				return basicSetMDReferenceSystem(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_REPRESENTATIVE_FRACTION:
				return basicSetMDRepresentativeFraction(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_RESOLUTION:
				return basicSetMDResolution(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_RESTRICTION_CODE:
				return basicSetMDRestrictionCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_SCOPE_CODE:
				return basicSetMDScopeCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_SCOPE_DESCRIPTION:
				return basicSetMDScopeDescription(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_SECURITY_CONSTRAINTS:
				return basicSetMDSecurityConstraints(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_SERVICE_IDENTIFICATION:
				return basicSetMDServiceIdentification(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_SPATIAL_REPRESENTATION_TYPE_CODE:
				return basicSetMDSpatialRepresentationTypeCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_STANDARD_ORDER_PROCESS:
				return basicSetMDStandardOrderProcess(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_TOPOLOGY_LEVEL_CODE:
				return basicSetMDTopologyLevelCode(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_USAGE:
				return basicSetMDUsage(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__MD_VECTOR_SPATIAL_REPRESENTATION:
				return basicSetMDVectorSpatialRepresentation(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__PT_FREE_TEXT:
				return basicSetPTFreeText(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__PT_LOCALE:
				return basicSetPTLocale(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__PT_LOCALE_CONTAINER:
				return basicSetPTLocaleContainer(null, msgs);
			case GMDPackage.DOCUMENT_ROOT__RS_IDENTIFIER:
				return basicSetRSIdentifier(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMDPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case GMDPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case GMDPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DQ_COMPLETENESS:
				return getAbstractDQCompleteness();
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DQ_ELEMENT:
				return getAbstractDQElement();
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DQ_LOGICAL_CONSISTENCY:
				return getAbstractDQLogicalConsistency();
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DQ_POSITIONAL_ACCURACY:
				return getAbstractDQPositionalAccuracy();
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DQ_RESULT:
				return getAbstractDQResult();
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DQ_TEMPORAL_ACCURACY:
				return getAbstractDQTemporalAccuracy();
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DQ_THEMATIC_ACCURACY:
				return getAbstractDQThematicAccuracy();
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DS_AGGREGATE:
				return getAbstractDSAggregate();
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_EX_GEOGRAPHIC_EXTENT:
				return getAbstractEXGeographicExtent();
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_MD_CONTENT_INFORMATION:
				return getAbstractMDContentInformation();
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_MD_IDENTIFICATION:
				return getAbstractMDIdentification();
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_MD_SPATIAL_REPRESENTATION:
				return getAbstractMDSpatialRepresentation();
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_RS_REFERENCE_SYSTEM:
				return getAbstractRSReferenceSystem();
			case GMDPackage.DOCUMENT_ROOT__CI_ADDRESS:
				return getCIAddress();
			case GMDPackage.DOCUMENT_ROOT__CI_CITATION:
				return getCICitation();
			case GMDPackage.DOCUMENT_ROOT__CI_CONTACT:
				return getCIContact();
			case GMDPackage.DOCUMENT_ROOT__CI_DATE:
				return getCIDate();
			case GMDPackage.DOCUMENT_ROOT__CI_DATE_TYPE_CODE:
				return getCIDateTypeCode();
			case GMDPackage.DOCUMENT_ROOT__CI_ON_LINE_FUNCTION_CODE:
				return getCIOnLineFunctionCode();
			case GMDPackage.DOCUMENT_ROOT__CI_ONLINE_RESOURCE:
				return getCIOnlineResource();
			case GMDPackage.DOCUMENT_ROOT__CI_PRESENTATION_FORM_CODE:
				return getCIPresentationFormCode();
			case GMDPackage.DOCUMENT_ROOT__CI_RESPONSIBLE_PARTY:
				return getCIResponsibleParty();
			case GMDPackage.DOCUMENT_ROOT__CI_ROLE_CODE:
				return getCIRoleCode();
			case GMDPackage.DOCUMENT_ROOT__CI_SERIES:
				return getCISeries();
			case GMDPackage.DOCUMENT_ROOT__CI_TELEPHONE:
				return getCITelephone();
			case GMDPackage.DOCUMENT_ROOT__COUNTRY:
				return getCountry();
			case GMDPackage.DOCUMENT_ROOT__DQ_ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY:
				return getDQAbsoluteExternalPositionalAccuracy();
			case GMDPackage.DOCUMENT_ROOT__DQ_ACCURACY_OF_ATIME_MEASUREMENT:
				return getDQAccuracyOfATimeMeasurement();
			case GMDPackage.DOCUMENT_ROOT__DQ_COMPLETENESS_COMMISSION:
				return getDQCompletenessCommission();
			case GMDPackage.DOCUMENT_ROOT__DQ_COMPLETENESS_OMISSION:
				return getDQCompletenessOmission();
			case GMDPackage.DOCUMENT_ROOT__DQ_CONCEPTUAL_CONSISTENCY:
				return getDQConceptualConsistency();
			case GMDPackage.DOCUMENT_ROOT__DQ_CONFORMANCE_RESULT:
				return getDQConformanceResult();
			case GMDPackage.DOCUMENT_ROOT__DQ_DATA_QUALITY:
				return getDQDataQuality();
			case GMDPackage.DOCUMENT_ROOT__DQ_DOMAIN_CONSISTENCY:
				return getDQDomainConsistency();
			case GMDPackage.DOCUMENT_ROOT__DQ_EVALUATION_METHOD_TYPE_CODE:
				return getDQEvaluationMethodTypeCode();
			case GMDPackage.DOCUMENT_ROOT__DQ_FORMAT_CONSISTENCY:
				return getDQFormatConsistency();
			case GMDPackage.DOCUMENT_ROOT__DQ_GRIDDED_DATA_POSITIONAL_ACCURACY:
				return getDQGriddedDataPositionalAccuracy();
			case GMDPackage.DOCUMENT_ROOT__DQ_NON_QUANTITATIVE_ATTRIBUTE_ACCURACY:
				return getDQNonQuantitativeAttributeAccuracy();
			case GMDPackage.DOCUMENT_ROOT__DQ_QUANTITATIVE_ATTRIBUTE_ACCURACY:
				return getDQQuantitativeAttributeAccuracy();
			case GMDPackage.DOCUMENT_ROOT__DQ_QUANTITATIVE_RESULT:
				return getDQQuantitativeResult();
			case GMDPackage.DOCUMENT_ROOT__DQ_RELATIVE_INTERNAL_POSITIONAL_ACCURACY:
				return getDQRelativeInternalPositionalAccuracy();
			case GMDPackage.DOCUMENT_ROOT__DQ_SCOPE:
				return getDQScope();
			case GMDPackage.DOCUMENT_ROOT__DQ_TEMPORAL_CONSISTENCY:
				return getDQTemporalConsistency();
			case GMDPackage.DOCUMENT_ROOT__DQ_TEMPORAL_VALIDITY:
				return getDQTemporalValidity();
			case GMDPackage.DOCUMENT_ROOT__DQ_THEMATIC_CLASSIFICATION_CORRECTNESS:
				return getDQThematicClassificationCorrectness();
			case GMDPackage.DOCUMENT_ROOT__DQ_TOPOLOGICAL_CONSISTENCY:
				return getDQTopologicalConsistency();
			case GMDPackage.DOCUMENT_ROOT__DS_ASSOCIATION:
				return getDSAssociation();
			case GMDPackage.DOCUMENT_ROOT__DS_ASSOCIATION_TYPE_CODE:
				return getDSAssociationTypeCode();
			case GMDPackage.DOCUMENT_ROOT__DS_DATA_SET:
				return getDSDataSet();
			case GMDPackage.DOCUMENT_ROOT__DS_INITIATIVE:
				return getDSInitiative();
			case GMDPackage.DOCUMENT_ROOT__DS_INITIATIVE_TYPE_CODE:
				return getDSInitiativeTypeCode();
			case GMDPackage.DOCUMENT_ROOT__DS_OTHER_AGGREGATE:
				return getDSOtherAggregate();
			case GMDPackage.DOCUMENT_ROOT__DS_PLATFORM:
				return getDSPlatform();
			case GMDPackage.DOCUMENT_ROOT__DS_SERIES:
				return getDSSeries();
			case GMDPackage.DOCUMENT_ROOT__DS_PRODUCTION_SERIES:
				return getDSProductionSeries();
			case GMDPackage.DOCUMENT_ROOT__DS_SENSOR:
				return getDSSensor();
			case GMDPackage.DOCUMENT_ROOT__DS_STEREO_MATE:
				return getDSStereoMate();
			case GMDPackage.DOCUMENT_ROOT__EX_BOUNDING_POLYGON:
				return getEXBoundingPolygon();
			case GMDPackage.DOCUMENT_ROOT__EX_EXTENT:
				return getEXExtent();
			case GMDPackage.DOCUMENT_ROOT__EX_GEOGRAPHIC_BOUNDING_BOX:
				return getEXGeographicBoundingBox();
			case GMDPackage.DOCUMENT_ROOT__EX_GEOGRAPHIC_DESCRIPTION:
				return getEXGeographicDescription();
			case GMDPackage.DOCUMENT_ROOT__EX_SPATIAL_TEMPORAL_EXTENT:
				return getEXSpatialTemporalExtent();
			case GMDPackage.DOCUMENT_ROOT__EX_TEMPORAL_EXTENT:
				return getEXTemporalExtent();
			case GMDPackage.DOCUMENT_ROOT__EX_VERTICAL_EXTENT:
				return getEXVerticalExtent();
			case GMDPackage.DOCUMENT_ROOT__LANGUAGE_CODE:
				return getLanguageCode();
			case GMDPackage.DOCUMENT_ROOT__LI_LINEAGE:
				return getLILineage();
			case GMDPackage.DOCUMENT_ROOT__LI_PROCESS_STEP:
				return getLIProcessStep();
			case GMDPackage.DOCUMENT_ROOT__LI_SOURCE:
				return getLISource();
			case GMDPackage.DOCUMENT_ROOT__LOCALISED_CHARACTER_STRING:
				return getLocalisedCharacterString();
			case GMDPackage.DOCUMENT_ROOT__MD_AGGREGATE_INFORMATION:
				return getMDAggregateInformation();
			case GMDPackage.DOCUMENT_ROOT__MD_APPLICATION_SCHEMA_INFORMATION:
				return getMDApplicationSchemaInformation();
			case GMDPackage.DOCUMENT_ROOT__MD_BAND:
				return getMDBand();
			case GMDPackage.DOCUMENT_ROOT__MD_RANGE_DIMENSION:
				return getMDRangeDimension();
			case GMDPackage.DOCUMENT_ROOT__MD_BROWSE_GRAPHIC:
				return getMDBrowseGraphic();
			case GMDPackage.DOCUMENT_ROOT__MD_CELL_GEOMETRY_CODE:
				return getMDCellGeometryCode();
			case GMDPackage.DOCUMENT_ROOT__MD_CHARACTER_SET_CODE:
				return getMDCharacterSetCode();
			case GMDPackage.DOCUMENT_ROOT__MD_CLASSIFICATION_CODE:
				return getMDClassificationCode();
			case GMDPackage.DOCUMENT_ROOT__MD_CONSTRAINTS:
				return getMDConstraints();
			case GMDPackage.DOCUMENT_ROOT__MD_COVERAGE_CONTENT_TYPE_CODE:
				return getMDCoverageContentTypeCode();
			case GMDPackage.DOCUMENT_ROOT__MD_COVERAGE_DESCRIPTION:
				return getMDCoverageDescription();
			case GMDPackage.DOCUMENT_ROOT__MD_DATA_IDENTIFICATION:
				return getMDDataIdentification();
			case GMDPackage.DOCUMENT_ROOT__MD_DATATYPE_CODE:
				return getMDDatatypeCode();
			case GMDPackage.DOCUMENT_ROOT__MD_DIGITAL_TRANSFER_OPTIONS:
				return getMDDigitalTransferOptions();
			case GMDPackage.DOCUMENT_ROOT__MD_DIMENSION:
				return getMDDimension();
			case GMDPackage.DOCUMENT_ROOT__MD_DIMENSION_NAME_TYPE_CODE:
				return getMDDimensionNameTypeCode();
			case GMDPackage.DOCUMENT_ROOT__MD_DISTRIBUTION:
				return getMDDistribution();
			case GMDPackage.DOCUMENT_ROOT__MD_DISTRIBUTION_UNITS:
				return getMDDistributionUnits();
			case GMDPackage.DOCUMENT_ROOT__MD_DISTRIBUTOR:
				return getMDDistributor();
			case GMDPackage.DOCUMENT_ROOT__MD_EXTENDED_ELEMENT_INFORMATION:
				return getMDExtendedElementInformation();
			case GMDPackage.DOCUMENT_ROOT__MD_FEATURE_CATALOGUE_DESCRIPTION:
				return getMDFeatureCatalogueDescription();
			case GMDPackage.DOCUMENT_ROOT__MD_FORMAT:
				return getMDFormat();
			case GMDPackage.DOCUMENT_ROOT__MD_GEOMETRIC_OBJECTS:
				return getMDGeometricObjects();
			case GMDPackage.DOCUMENT_ROOT__MD_GEOMETRIC_OBJECT_TYPE_CODE:
				return getMDGeometricObjectTypeCode();
			case GMDPackage.DOCUMENT_ROOT__MD_GEORECTIFIED:
				return getMDGeorectified();
			case GMDPackage.DOCUMENT_ROOT__MD_GRID_SPATIAL_REPRESENTATION:
				return getMDGridSpatialRepresentation();
			case GMDPackage.DOCUMENT_ROOT__MD_GEOREFERENCEABLE:
				return getMDGeoreferenceable();
			case GMDPackage.DOCUMENT_ROOT__MD_IDENTIFIER:
				return getMDIdentifier();
			case GMDPackage.DOCUMENT_ROOT__MD_IMAGE_DESCRIPTION:
				return getMDImageDescription();
			case GMDPackage.DOCUMENT_ROOT__MD_IMAGING_CONDITION_CODE:
				return getMDImagingConditionCode();
			case GMDPackage.DOCUMENT_ROOT__MD_KEYWORDS:
				return getMDKeywords();
			case GMDPackage.DOCUMENT_ROOT__MD_KEYWORD_TYPE_CODE:
				return getMDKeywordTypeCode();
			case GMDPackage.DOCUMENT_ROOT__MD_LEGAL_CONSTRAINTS:
				return getMDLegalConstraints();
			case GMDPackage.DOCUMENT_ROOT__MD_MAINTENANCE_FREQUENCY_CODE:
				return getMDMaintenanceFrequencyCode();
			case GMDPackage.DOCUMENT_ROOT__MD_MAINTENANCE_INFORMATION:
				return getMDMaintenanceInformation();
			case GMDPackage.DOCUMENT_ROOT__MD_MEDIUM:
				return getMDMedium();
			case GMDPackage.DOCUMENT_ROOT__MD_MEDIUM_FORMAT_CODE:
				return getMDMediumFormatCode();
			case GMDPackage.DOCUMENT_ROOT__MD_MEDIUM_NAME_CODE:
				return getMDMediumNameCode();
			case GMDPackage.DOCUMENT_ROOT__MD_METADATA:
				return getMDMetadata();
			case GMDPackage.DOCUMENT_ROOT__MD_METADATA_EXTENSION_INFORMATION:
				return getMDMetadataExtensionInformation();
			case GMDPackage.DOCUMENT_ROOT__MD_OBLIGATION_CODE:
				return getMDObligationCode();
			case GMDPackage.DOCUMENT_ROOT__MD_PIXEL_ORIENTATION_CODE:
				return getMDPixelOrientationCode();
			case GMDPackage.DOCUMENT_ROOT__MD_PORTRAYAL_CATALOGUE_REFERENCE:
				return getMDPortrayalCatalogueReference();
			case GMDPackage.DOCUMENT_ROOT__MD_PROGRESS_CODE:
				return getMDProgressCode();
			case GMDPackage.DOCUMENT_ROOT__MD_REFERENCE_SYSTEM:
				return getMDReferenceSystem();
			case GMDPackage.DOCUMENT_ROOT__MD_REPRESENTATIVE_FRACTION:
				return getMDRepresentativeFraction();
			case GMDPackage.DOCUMENT_ROOT__MD_RESOLUTION:
				return getMDResolution();
			case GMDPackage.DOCUMENT_ROOT__MD_RESTRICTION_CODE:
				return getMDRestrictionCode();
			case GMDPackage.DOCUMENT_ROOT__MD_SCOPE_CODE:
				return getMDScopeCode();
			case GMDPackage.DOCUMENT_ROOT__MD_SCOPE_DESCRIPTION:
				return getMDScopeDescription();
			case GMDPackage.DOCUMENT_ROOT__MD_SECURITY_CONSTRAINTS:
				return getMDSecurityConstraints();
			case GMDPackage.DOCUMENT_ROOT__MD_SERVICE_IDENTIFICATION:
				return getMDServiceIdentification();
			case GMDPackage.DOCUMENT_ROOT__MD_SPATIAL_REPRESENTATION_TYPE_CODE:
				return getMDSpatialRepresentationTypeCode();
			case GMDPackage.DOCUMENT_ROOT__MD_STANDARD_ORDER_PROCESS:
				return getMDStandardOrderProcess();
			case GMDPackage.DOCUMENT_ROOT__MD_TOPIC_CATEGORY_CODE:
				return getMDTopicCategoryCode();
			case GMDPackage.DOCUMENT_ROOT__MD_TOPOLOGY_LEVEL_CODE:
				return getMDTopologyLevelCode();
			case GMDPackage.DOCUMENT_ROOT__MD_USAGE:
				return getMDUsage();
			case GMDPackage.DOCUMENT_ROOT__MD_VECTOR_SPATIAL_REPRESENTATION:
				return getMDVectorSpatialRepresentation();
			case GMDPackage.DOCUMENT_ROOT__PT_FREE_TEXT:
				return getPTFreeText();
			case GMDPackage.DOCUMENT_ROOT__PT_LOCALE:
				return getPTLocale();
			case GMDPackage.DOCUMENT_ROOT__PT_LOCALE_CONTAINER:
				return getPTLocaleContainer();
			case GMDPackage.DOCUMENT_ROOT__RS_IDENTIFIER:
				return getRSIdentifier();
			case GMDPackage.DOCUMENT_ROOT__URL:
				return getURL();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMDPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_ADDRESS:
				setCIAddress((CIAddressType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_CITATION:
				setCICitation((CICitationType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_CONTACT:
				setCIContact((CIContactType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_DATE:
				setCIDate((CIDateType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_DATE_TYPE_CODE:
				setCIDateTypeCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_ON_LINE_FUNCTION_CODE:
				setCIOnLineFunctionCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_ONLINE_RESOURCE:
				setCIOnlineResource((CIOnlineResourceType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_PRESENTATION_FORM_CODE:
				setCIPresentationFormCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_RESPONSIBLE_PARTY:
				setCIResponsibleParty((CIResponsiblePartyType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_ROLE_CODE:
				setCIRoleCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_SERIES:
				setCISeries((CISeriesType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_TELEPHONE:
				setCITelephone((CITelephoneType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__COUNTRY:
				setCountry((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY:
				setDQAbsoluteExternalPositionalAccuracy((DQAbsoluteExternalPositionalAccuracyType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_ACCURACY_OF_ATIME_MEASUREMENT:
				setDQAccuracyOfATimeMeasurement((DQAccuracyOfATimeMeasurementType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_COMPLETENESS_COMMISSION:
				setDQCompletenessCommission((DQCompletenessCommissionType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_COMPLETENESS_OMISSION:
				setDQCompletenessOmission((DQCompletenessOmissionType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_CONCEPTUAL_CONSISTENCY:
				setDQConceptualConsistency((DQConceptualConsistencyType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_CONFORMANCE_RESULT:
				setDQConformanceResult((DQConformanceResultType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_DATA_QUALITY:
				setDQDataQuality((DQDataQualityType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_DOMAIN_CONSISTENCY:
				setDQDomainConsistency((DQDomainConsistencyType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_EVALUATION_METHOD_TYPE_CODE:
				setDQEvaluationMethodTypeCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_FORMAT_CONSISTENCY:
				setDQFormatConsistency((DQFormatConsistencyType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_GRIDDED_DATA_POSITIONAL_ACCURACY:
				setDQGriddedDataPositionalAccuracy((DQGriddedDataPositionalAccuracyType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_NON_QUANTITATIVE_ATTRIBUTE_ACCURACY:
				setDQNonQuantitativeAttributeAccuracy((DQNonQuantitativeAttributeAccuracyType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_QUANTITATIVE_ATTRIBUTE_ACCURACY:
				setDQQuantitativeAttributeAccuracy((DQQuantitativeAttributeAccuracyType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_QUANTITATIVE_RESULT:
				setDQQuantitativeResult((DQQuantitativeResultType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_RELATIVE_INTERNAL_POSITIONAL_ACCURACY:
				setDQRelativeInternalPositionalAccuracy((DQRelativeInternalPositionalAccuracyType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_SCOPE:
				setDQScope((DQScopeType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_TEMPORAL_CONSISTENCY:
				setDQTemporalConsistency((DQTemporalConsistencyType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_TEMPORAL_VALIDITY:
				setDQTemporalValidity((DQTemporalValidityType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_THEMATIC_CLASSIFICATION_CORRECTNESS:
				setDQThematicClassificationCorrectness((DQThematicClassificationCorrectnessType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_TOPOLOGICAL_CONSISTENCY:
				setDQTopologicalConsistency((DQTopologicalConsistencyType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DS_ASSOCIATION:
				setDSAssociation((DSAssociationType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DS_ASSOCIATION_TYPE_CODE:
				setDSAssociationTypeCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DS_DATA_SET:
				setDSDataSet((DSDataSetType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DS_INITIATIVE:
				setDSInitiative((DSInitiativeType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DS_INITIATIVE_TYPE_CODE:
				setDSInitiativeTypeCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DS_OTHER_AGGREGATE:
				setDSOtherAggregate((DSOtherAggregateType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DS_PLATFORM:
				setDSPlatform((DSPlatformType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DS_SERIES:
				setDSSeries((DSSeriesType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DS_PRODUCTION_SERIES:
				setDSProductionSeries((DSProductionSeriesType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DS_SENSOR:
				setDSSensor((DSSensorType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__DS_STEREO_MATE:
				setDSStereoMate((DSStereoMateType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__EX_BOUNDING_POLYGON:
				setEXBoundingPolygon((EXBoundingPolygonType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__EX_EXTENT:
				setEXExtent((EXExtentType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__EX_GEOGRAPHIC_BOUNDING_BOX:
				setEXGeographicBoundingBox((EXGeographicBoundingBoxType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__EX_GEOGRAPHIC_DESCRIPTION:
				setEXGeographicDescription((EXGeographicDescriptionType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__EX_SPATIAL_TEMPORAL_EXTENT:
				setEXSpatialTemporalExtent((EXSpatialTemporalExtentType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__EX_TEMPORAL_EXTENT:
				setEXTemporalExtent((EXTemporalExtentType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__EX_VERTICAL_EXTENT:
				setEXVerticalExtent((EXVerticalExtentType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__LANGUAGE_CODE:
				setLanguageCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__LI_LINEAGE:
				setLILineage((LILineageType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__LI_PROCESS_STEP:
				setLIProcessStep((LIProcessStepType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__LI_SOURCE:
				setLISource((LISourceType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__LOCALISED_CHARACTER_STRING:
				setLocalisedCharacterString((LocalisedCharacterStringType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_AGGREGATE_INFORMATION:
				setMDAggregateInformation((MDAggregateInformationType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_APPLICATION_SCHEMA_INFORMATION:
				setMDApplicationSchemaInformation((MDApplicationSchemaInformationType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_BAND:
				setMDBand((MDBandType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_RANGE_DIMENSION:
				setMDRangeDimension((MDRangeDimensionType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_BROWSE_GRAPHIC:
				setMDBrowseGraphic((MDBrowseGraphicType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_CELL_GEOMETRY_CODE:
				setMDCellGeometryCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_CHARACTER_SET_CODE:
				setMDCharacterSetCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_CLASSIFICATION_CODE:
				setMDClassificationCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_CONSTRAINTS:
				setMDConstraints((MDConstraintsType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_COVERAGE_CONTENT_TYPE_CODE:
				setMDCoverageContentTypeCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_COVERAGE_DESCRIPTION:
				setMDCoverageDescription((MDCoverageDescriptionType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_DATA_IDENTIFICATION:
				setMDDataIdentification((MDDataIdentificationType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_DATATYPE_CODE:
				setMDDatatypeCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_DIGITAL_TRANSFER_OPTIONS:
				setMDDigitalTransferOptions((MDDigitalTransferOptionsType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_DIMENSION:
				setMDDimension((MDDimensionType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_DIMENSION_NAME_TYPE_CODE:
				setMDDimensionNameTypeCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_DISTRIBUTION:
				setMDDistribution((MDDistributionType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_DISTRIBUTION_UNITS:
				setMDDistributionUnits((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_DISTRIBUTOR:
				setMDDistributor((MDDistributorType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_EXTENDED_ELEMENT_INFORMATION:
				setMDExtendedElementInformation((MDExtendedElementInformationType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_FEATURE_CATALOGUE_DESCRIPTION:
				setMDFeatureCatalogueDescription((MDFeatureCatalogueDescriptionType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_FORMAT:
				setMDFormat((MDFormatType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_GEOMETRIC_OBJECTS:
				setMDGeometricObjects((MDGeometricObjectsType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_GEOMETRIC_OBJECT_TYPE_CODE:
				setMDGeometricObjectTypeCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_GEORECTIFIED:
				setMDGeorectified((MDGeorectifiedType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_GRID_SPATIAL_REPRESENTATION:
				setMDGridSpatialRepresentation((MDGridSpatialRepresentationType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_GEOREFERENCEABLE:
				setMDGeoreferenceable((MDGeoreferenceableType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_IDENTIFIER:
				setMDIdentifier((MDIdentifierType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_IMAGE_DESCRIPTION:
				setMDImageDescription((MDImageDescriptionType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_IMAGING_CONDITION_CODE:
				setMDImagingConditionCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_KEYWORDS:
				setMDKeywords((MDKeywordsType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_KEYWORD_TYPE_CODE:
				setMDKeywordTypeCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_LEGAL_CONSTRAINTS:
				setMDLegalConstraints((MDLegalConstraintsType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_MAINTENANCE_FREQUENCY_CODE:
				setMDMaintenanceFrequencyCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_MAINTENANCE_INFORMATION:
				setMDMaintenanceInformation((MDMaintenanceInformationType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_MEDIUM:
				setMDMedium((MDMediumType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_MEDIUM_FORMAT_CODE:
				setMDMediumFormatCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_MEDIUM_NAME_CODE:
				setMDMediumNameCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_METADATA:
				setMDMetadata((MDMetadataType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_METADATA_EXTENSION_INFORMATION:
				setMDMetadataExtensionInformation((MDMetadataExtensionInformationType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_OBLIGATION_CODE:
				setMDObligationCode((MDObligationCodeType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_PIXEL_ORIENTATION_CODE:
				setMDPixelOrientationCode((MDPixelOrientationCodeType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_PORTRAYAL_CATALOGUE_REFERENCE:
				setMDPortrayalCatalogueReference((MDPortrayalCatalogueReferenceType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_PROGRESS_CODE:
				setMDProgressCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_REFERENCE_SYSTEM:
				setMDReferenceSystem((MDReferenceSystemType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_REPRESENTATIVE_FRACTION:
				setMDRepresentativeFraction((MDRepresentativeFractionType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_RESOLUTION:
				setMDResolution((MDResolutionType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_RESTRICTION_CODE:
				setMDRestrictionCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_SCOPE_CODE:
				setMDScopeCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_SCOPE_DESCRIPTION:
				setMDScopeDescription((MDScopeDescriptionType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_SECURITY_CONSTRAINTS:
				setMDSecurityConstraints((MDSecurityConstraintsType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_SERVICE_IDENTIFICATION:
				setMDServiceIdentification((MDServiceIdentificationType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_SPATIAL_REPRESENTATION_TYPE_CODE:
				setMDSpatialRepresentationTypeCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_STANDARD_ORDER_PROCESS:
				setMDStandardOrderProcess((MDStandardOrderProcessType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_TOPIC_CATEGORY_CODE:
				setMDTopicCategoryCode((MDTopicCategoryCodeType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_TOPOLOGY_LEVEL_CODE:
				setMDTopologyLevelCode((CodeListValueType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_USAGE:
				setMDUsage((MDUsageType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_VECTOR_SPATIAL_REPRESENTATION:
				setMDVectorSpatialRepresentation((MDVectorSpatialRepresentationType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__PT_FREE_TEXT:
				setPTFreeText((PTFreeTextType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__PT_LOCALE:
				setPTLocale((PTLocaleType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__PT_LOCALE_CONTAINER:
				setPTLocaleContainer((PTLocaleContainerType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__RS_IDENTIFIER:
				setRSIdentifier((RSIdentifierType)newValue);
				return;
			case GMDPackage.DOCUMENT_ROOT__URL:
				setURL((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GMDPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case GMDPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case GMDPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_ADDRESS:
				setCIAddress((CIAddressType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_CITATION:
				setCICitation((CICitationType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_CONTACT:
				setCIContact((CIContactType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_DATE:
				setCIDate((CIDateType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_DATE_TYPE_CODE:
				setCIDateTypeCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_ON_LINE_FUNCTION_CODE:
				setCIOnLineFunctionCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_ONLINE_RESOURCE:
				setCIOnlineResource((CIOnlineResourceType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_PRESENTATION_FORM_CODE:
				setCIPresentationFormCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_RESPONSIBLE_PARTY:
				setCIResponsibleParty((CIResponsiblePartyType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_ROLE_CODE:
				setCIRoleCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_SERIES:
				setCISeries((CISeriesType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__CI_TELEPHONE:
				setCITelephone((CITelephoneType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__COUNTRY:
				setCountry((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY:
				setDQAbsoluteExternalPositionalAccuracy((DQAbsoluteExternalPositionalAccuracyType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_ACCURACY_OF_ATIME_MEASUREMENT:
				setDQAccuracyOfATimeMeasurement((DQAccuracyOfATimeMeasurementType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_COMPLETENESS_COMMISSION:
				setDQCompletenessCommission((DQCompletenessCommissionType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_COMPLETENESS_OMISSION:
				setDQCompletenessOmission((DQCompletenessOmissionType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_CONCEPTUAL_CONSISTENCY:
				setDQConceptualConsistency((DQConceptualConsistencyType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_CONFORMANCE_RESULT:
				setDQConformanceResult((DQConformanceResultType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_DATA_QUALITY:
				setDQDataQuality((DQDataQualityType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_DOMAIN_CONSISTENCY:
				setDQDomainConsistency((DQDomainConsistencyType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_EVALUATION_METHOD_TYPE_CODE:
				setDQEvaluationMethodTypeCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_FORMAT_CONSISTENCY:
				setDQFormatConsistency((DQFormatConsistencyType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_GRIDDED_DATA_POSITIONAL_ACCURACY:
				setDQGriddedDataPositionalAccuracy((DQGriddedDataPositionalAccuracyType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_NON_QUANTITATIVE_ATTRIBUTE_ACCURACY:
				setDQNonQuantitativeAttributeAccuracy((DQNonQuantitativeAttributeAccuracyType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_QUANTITATIVE_ATTRIBUTE_ACCURACY:
				setDQQuantitativeAttributeAccuracy((DQQuantitativeAttributeAccuracyType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_QUANTITATIVE_RESULT:
				setDQQuantitativeResult((DQQuantitativeResultType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_RELATIVE_INTERNAL_POSITIONAL_ACCURACY:
				setDQRelativeInternalPositionalAccuracy((DQRelativeInternalPositionalAccuracyType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_SCOPE:
				setDQScope((DQScopeType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_TEMPORAL_CONSISTENCY:
				setDQTemporalConsistency((DQTemporalConsistencyType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_TEMPORAL_VALIDITY:
				setDQTemporalValidity((DQTemporalValidityType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_THEMATIC_CLASSIFICATION_CORRECTNESS:
				setDQThematicClassificationCorrectness((DQThematicClassificationCorrectnessType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DQ_TOPOLOGICAL_CONSISTENCY:
				setDQTopologicalConsistency((DQTopologicalConsistencyType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DS_ASSOCIATION:
				setDSAssociation((DSAssociationType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DS_ASSOCIATION_TYPE_CODE:
				setDSAssociationTypeCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DS_DATA_SET:
				setDSDataSet((DSDataSetType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DS_INITIATIVE:
				setDSInitiative((DSInitiativeType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DS_INITIATIVE_TYPE_CODE:
				setDSInitiativeTypeCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DS_OTHER_AGGREGATE:
				setDSOtherAggregate((DSOtherAggregateType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DS_PLATFORM:
				setDSPlatform((DSPlatformType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DS_SERIES:
				setDSSeries((DSSeriesType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DS_PRODUCTION_SERIES:
				setDSProductionSeries((DSProductionSeriesType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DS_SENSOR:
				setDSSensor((DSSensorType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__DS_STEREO_MATE:
				setDSStereoMate((DSStereoMateType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__EX_BOUNDING_POLYGON:
				setEXBoundingPolygon((EXBoundingPolygonType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__EX_EXTENT:
				setEXExtent((EXExtentType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__EX_GEOGRAPHIC_BOUNDING_BOX:
				setEXGeographicBoundingBox((EXGeographicBoundingBoxType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__EX_GEOGRAPHIC_DESCRIPTION:
				setEXGeographicDescription((EXGeographicDescriptionType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__EX_SPATIAL_TEMPORAL_EXTENT:
				setEXSpatialTemporalExtent((EXSpatialTemporalExtentType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__EX_TEMPORAL_EXTENT:
				setEXTemporalExtent((EXTemporalExtentType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__EX_VERTICAL_EXTENT:
				setEXVerticalExtent((EXVerticalExtentType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__LANGUAGE_CODE:
				setLanguageCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__LI_LINEAGE:
				setLILineage((LILineageType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__LI_PROCESS_STEP:
				setLIProcessStep((LIProcessStepType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__LI_SOURCE:
				setLISource((LISourceType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__LOCALISED_CHARACTER_STRING:
				setLocalisedCharacterString((LocalisedCharacterStringType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_AGGREGATE_INFORMATION:
				setMDAggregateInformation((MDAggregateInformationType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_APPLICATION_SCHEMA_INFORMATION:
				setMDApplicationSchemaInformation((MDApplicationSchemaInformationType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_BAND:
				setMDBand((MDBandType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_RANGE_DIMENSION:
				setMDRangeDimension((MDRangeDimensionType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_BROWSE_GRAPHIC:
				setMDBrowseGraphic((MDBrowseGraphicType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_CELL_GEOMETRY_CODE:
				setMDCellGeometryCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_CHARACTER_SET_CODE:
				setMDCharacterSetCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_CLASSIFICATION_CODE:
				setMDClassificationCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_CONSTRAINTS:
				setMDConstraints((MDConstraintsType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_COVERAGE_CONTENT_TYPE_CODE:
				setMDCoverageContentTypeCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_COVERAGE_DESCRIPTION:
				setMDCoverageDescription((MDCoverageDescriptionType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_DATA_IDENTIFICATION:
				setMDDataIdentification((MDDataIdentificationType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_DATATYPE_CODE:
				setMDDatatypeCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_DIGITAL_TRANSFER_OPTIONS:
				setMDDigitalTransferOptions((MDDigitalTransferOptionsType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_DIMENSION:
				setMDDimension((MDDimensionType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_DIMENSION_NAME_TYPE_CODE:
				setMDDimensionNameTypeCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_DISTRIBUTION:
				setMDDistribution((MDDistributionType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_DISTRIBUTION_UNITS:
				setMDDistributionUnits((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_DISTRIBUTOR:
				setMDDistributor((MDDistributorType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_EXTENDED_ELEMENT_INFORMATION:
				setMDExtendedElementInformation((MDExtendedElementInformationType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_FEATURE_CATALOGUE_DESCRIPTION:
				setMDFeatureCatalogueDescription((MDFeatureCatalogueDescriptionType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_FORMAT:
				setMDFormat((MDFormatType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_GEOMETRIC_OBJECTS:
				setMDGeometricObjects((MDGeometricObjectsType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_GEOMETRIC_OBJECT_TYPE_CODE:
				setMDGeometricObjectTypeCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_GEORECTIFIED:
				setMDGeorectified((MDGeorectifiedType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_GRID_SPATIAL_REPRESENTATION:
				setMDGridSpatialRepresentation((MDGridSpatialRepresentationType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_GEOREFERENCEABLE:
				setMDGeoreferenceable((MDGeoreferenceableType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_IDENTIFIER:
				setMDIdentifier((MDIdentifierType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_IMAGE_DESCRIPTION:
				setMDImageDescription((MDImageDescriptionType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_IMAGING_CONDITION_CODE:
				setMDImagingConditionCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_KEYWORDS:
				setMDKeywords((MDKeywordsType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_KEYWORD_TYPE_CODE:
				setMDKeywordTypeCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_LEGAL_CONSTRAINTS:
				setMDLegalConstraints((MDLegalConstraintsType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_MAINTENANCE_FREQUENCY_CODE:
				setMDMaintenanceFrequencyCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_MAINTENANCE_INFORMATION:
				setMDMaintenanceInformation((MDMaintenanceInformationType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_MEDIUM:
				setMDMedium((MDMediumType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_MEDIUM_FORMAT_CODE:
				setMDMediumFormatCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_MEDIUM_NAME_CODE:
				setMDMediumNameCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_METADATA:
				setMDMetadata((MDMetadataType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_METADATA_EXTENSION_INFORMATION:
				setMDMetadataExtensionInformation((MDMetadataExtensionInformationType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_OBLIGATION_CODE:
				setMDObligationCode(MD_OBLIGATION_CODE_EDEFAULT);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_PIXEL_ORIENTATION_CODE:
				setMDPixelOrientationCode(MD_PIXEL_ORIENTATION_CODE_EDEFAULT);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_PORTRAYAL_CATALOGUE_REFERENCE:
				setMDPortrayalCatalogueReference((MDPortrayalCatalogueReferenceType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_PROGRESS_CODE:
				setMDProgressCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_REFERENCE_SYSTEM:
				setMDReferenceSystem((MDReferenceSystemType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_REPRESENTATIVE_FRACTION:
				setMDRepresentativeFraction((MDRepresentativeFractionType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_RESOLUTION:
				setMDResolution((MDResolutionType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_RESTRICTION_CODE:
				setMDRestrictionCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_SCOPE_CODE:
				setMDScopeCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_SCOPE_DESCRIPTION:
				setMDScopeDescription((MDScopeDescriptionType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_SECURITY_CONSTRAINTS:
				setMDSecurityConstraints((MDSecurityConstraintsType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_SERVICE_IDENTIFICATION:
				setMDServiceIdentification((MDServiceIdentificationType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_SPATIAL_REPRESENTATION_TYPE_CODE:
				setMDSpatialRepresentationTypeCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_STANDARD_ORDER_PROCESS:
				setMDStandardOrderProcess((MDStandardOrderProcessType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_TOPIC_CATEGORY_CODE:
				setMDTopicCategoryCode(MD_TOPIC_CATEGORY_CODE_EDEFAULT);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_TOPOLOGY_LEVEL_CODE:
				setMDTopologyLevelCode((CodeListValueType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_USAGE:
				setMDUsage((MDUsageType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__MD_VECTOR_SPATIAL_REPRESENTATION:
				setMDVectorSpatialRepresentation((MDVectorSpatialRepresentationType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__PT_FREE_TEXT:
				setPTFreeText((PTFreeTextType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__PT_LOCALE:
				setPTLocale((PTLocaleType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__PT_LOCALE_CONTAINER:
				setPTLocaleContainer((PTLocaleContainerType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__RS_IDENTIFIER:
				setRSIdentifier((RSIdentifierType)null);
				return;
			case GMDPackage.DOCUMENT_ROOT__URL:
				setURL(URL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GMDPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case GMDPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case GMDPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DQ_COMPLETENESS:
				return getAbstractDQCompleteness() != null;
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DQ_ELEMENT:
				return getAbstractDQElement() != null;
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DQ_LOGICAL_CONSISTENCY:
				return getAbstractDQLogicalConsistency() != null;
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DQ_POSITIONAL_ACCURACY:
				return getAbstractDQPositionalAccuracy() != null;
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DQ_RESULT:
				return getAbstractDQResult() != null;
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DQ_TEMPORAL_ACCURACY:
				return getAbstractDQTemporalAccuracy() != null;
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DQ_THEMATIC_ACCURACY:
				return getAbstractDQThematicAccuracy() != null;
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_DS_AGGREGATE:
				return getAbstractDSAggregate() != null;
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_EX_GEOGRAPHIC_EXTENT:
				return getAbstractEXGeographicExtent() != null;
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_MD_CONTENT_INFORMATION:
				return getAbstractMDContentInformation() != null;
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_MD_IDENTIFICATION:
				return getAbstractMDIdentification() != null;
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_MD_SPATIAL_REPRESENTATION:
				return getAbstractMDSpatialRepresentation() != null;
			case GMDPackage.DOCUMENT_ROOT__ABSTRACT_RS_REFERENCE_SYSTEM:
				return getAbstractRSReferenceSystem() != null;
			case GMDPackage.DOCUMENT_ROOT__CI_ADDRESS:
				return getCIAddress() != null;
			case GMDPackage.DOCUMENT_ROOT__CI_CITATION:
				return getCICitation() != null;
			case GMDPackage.DOCUMENT_ROOT__CI_CONTACT:
				return getCIContact() != null;
			case GMDPackage.DOCUMENT_ROOT__CI_DATE:
				return getCIDate() != null;
			case GMDPackage.DOCUMENT_ROOT__CI_DATE_TYPE_CODE:
				return getCIDateTypeCode() != null;
			case GMDPackage.DOCUMENT_ROOT__CI_ON_LINE_FUNCTION_CODE:
				return getCIOnLineFunctionCode() != null;
			case GMDPackage.DOCUMENT_ROOT__CI_ONLINE_RESOURCE:
				return getCIOnlineResource() != null;
			case GMDPackage.DOCUMENT_ROOT__CI_PRESENTATION_FORM_CODE:
				return getCIPresentationFormCode() != null;
			case GMDPackage.DOCUMENT_ROOT__CI_RESPONSIBLE_PARTY:
				return getCIResponsibleParty() != null;
			case GMDPackage.DOCUMENT_ROOT__CI_ROLE_CODE:
				return getCIRoleCode() != null;
			case GMDPackage.DOCUMENT_ROOT__CI_SERIES:
				return getCISeries() != null;
			case GMDPackage.DOCUMENT_ROOT__CI_TELEPHONE:
				return getCITelephone() != null;
			case GMDPackage.DOCUMENT_ROOT__COUNTRY:
				return getCountry() != null;
			case GMDPackage.DOCUMENT_ROOT__DQ_ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY:
				return getDQAbsoluteExternalPositionalAccuracy() != null;
			case GMDPackage.DOCUMENT_ROOT__DQ_ACCURACY_OF_ATIME_MEASUREMENT:
				return getDQAccuracyOfATimeMeasurement() != null;
			case GMDPackage.DOCUMENT_ROOT__DQ_COMPLETENESS_COMMISSION:
				return getDQCompletenessCommission() != null;
			case GMDPackage.DOCUMENT_ROOT__DQ_COMPLETENESS_OMISSION:
				return getDQCompletenessOmission() != null;
			case GMDPackage.DOCUMENT_ROOT__DQ_CONCEPTUAL_CONSISTENCY:
				return getDQConceptualConsistency() != null;
			case GMDPackage.DOCUMENT_ROOT__DQ_CONFORMANCE_RESULT:
				return getDQConformanceResult() != null;
			case GMDPackage.DOCUMENT_ROOT__DQ_DATA_QUALITY:
				return getDQDataQuality() != null;
			case GMDPackage.DOCUMENT_ROOT__DQ_DOMAIN_CONSISTENCY:
				return getDQDomainConsistency() != null;
			case GMDPackage.DOCUMENT_ROOT__DQ_EVALUATION_METHOD_TYPE_CODE:
				return getDQEvaluationMethodTypeCode() != null;
			case GMDPackage.DOCUMENT_ROOT__DQ_FORMAT_CONSISTENCY:
				return getDQFormatConsistency() != null;
			case GMDPackage.DOCUMENT_ROOT__DQ_GRIDDED_DATA_POSITIONAL_ACCURACY:
				return getDQGriddedDataPositionalAccuracy() != null;
			case GMDPackage.DOCUMENT_ROOT__DQ_NON_QUANTITATIVE_ATTRIBUTE_ACCURACY:
				return getDQNonQuantitativeAttributeAccuracy() != null;
			case GMDPackage.DOCUMENT_ROOT__DQ_QUANTITATIVE_ATTRIBUTE_ACCURACY:
				return getDQQuantitativeAttributeAccuracy() != null;
			case GMDPackage.DOCUMENT_ROOT__DQ_QUANTITATIVE_RESULT:
				return getDQQuantitativeResult() != null;
			case GMDPackage.DOCUMENT_ROOT__DQ_RELATIVE_INTERNAL_POSITIONAL_ACCURACY:
				return getDQRelativeInternalPositionalAccuracy() != null;
			case GMDPackage.DOCUMENT_ROOT__DQ_SCOPE:
				return getDQScope() != null;
			case GMDPackage.DOCUMENT_ROOT__DQ_TEMPORAL_CONSISTENCY:
				return getDQTemporalConsistency() != null;
			case GMDPackage.DOCUMENT_ROOT__DQ_TEMPORAL_VALIDITY:
				return getDQTemporalValidity() != null;
			case GMDPackage.DOCUMENT_ROOT__DQ_THEMATIC_CLASSIFICATION_CORRECTNESS:
				return getDQThematicClassificationCorrectness() != null;
			case GMDPackage.DOCUMENT_ROOT__DQ_TOPOLOGICAL_CONSISTENCY:
				return getDQTopologicalConsistency() != null;
			case GMDPackage.DOCUMENT_ROOT__DS_ASSOCIATION:
				return getDSAssociation() != null;
			case GMDPackage.DOCUMENT_ROOT__DS_ASSOCIATION_TYPE_CODE:
				return getDSAssociationTypeCode() != null;
			case GMDPackage.DOCUMENT_ROOT__DS_DATA_SET:
				return getDSDataSet() != null;
			case GMDPackage.DOCUMENT_ROOT__DS_INITIATIVE:
				return getDSInitiative() != null;
			case GMDPackage.DOCUMENT_ROOT__DS_INITIATIVE_TYPE_CODE:
				return getDSInitiativeTypeCode() != null;
			case GMDPackage.DOCUMENT_ROOT__DS_OTHER_AGGREGATE:
				return getDSOtherAggregate() != null;
			case GMDPackage.DOCUMENT_ROOT__DS_PLATFORM:
				return getDSPlatform() != null;
			case GMDPackage.DOCUMENT_ROOT__DS_SERIES:
				return getDSSeries() != null;
			case GMDPackage.DOCUMENT_ROOT__DS_PRODUCTION_SERIES:
				return getDSProductionSeries() != null;
			case GMDPackage.DOCUMENT_ROOT__DS_SENSOR:
				return getDSSensor() != null;
			case GMDPackage.DOCUMENT_ROOT__DS_STEREO_MATE:
				return getDSStereoMate() != null;
			case GMDPackage.DOCUMENT_ROOT__EX_BOUNDING_POLYGON:
				return getEXBoundingPolygon() != null;
			case GMDPackage.DOCUMENT_ROOT__EX_EXTENT:
				return getEXExtent() != null;
			case GMDPackage.DOCUMENT_ROOT__EX_GEOGRAPHIC_BOUNDING_BOX:
				return getEXGeographicBoundingBox() != null;
			case GMDPackage.DOCUMENT_ROOT__EX_GEOGRAPHIC_DESCRIPTION:
				return getEXGeographicDescription() != null;
			case GMDPackage.DOCUMENT_ROOT__EX_SPATIAL_TEMPORAL_EXTENT:
				return getEXSpatialTemporalExtent() != null;
			case GMDPackage.DOCUMENT_ROOT__EX_TEMPORAL_EXTENT:
				return getEXTemporalExtent() != null;
			case GMDPackage.DOCUMENT_ROOT__EX_VERTICAL_EXTENT:
				return getEXVerticalExtent() != null;
			case GMDPackage.DOCUMENT_ROOT__LANGUAGE_CODE:
				return getLanguageCode() != null;
			case GMDPackage.DOCUMENT_ROOT__LI_LINEAGE:
				return getLILineage() != null;
			case GMDPackage.DOCUMENT_ROOT__LI_PROCESS_STEP:
				return getLIProcessStep() != null;
			case GMDPackage.DOCUMENT_ROOT__LI_SOURCE:
				return getLISource() != null;
			case GMDPackage.DOCUMENT_ROOT__LOCALISED_CHARACTER_STRING:
				return getLocalisedCharacterString() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_AGGREGATE_INFORMATION:
				return getMDAggregateInformation() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_APPLICATION_SCHEMA_INFORMATION:
				return getMDApplicationSchemaInformation() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_BAND:
				return getMDBand() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_RANGE_DIMENSION:
				return getMDRangeDimension() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_BROWSE_GRAPHIC:
				return getMDBrowseGraphic() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_CELL_GEOMETRY_CODE:
				return getMDCellGeometryCode() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_CHARACTER_SET_CODE:
				return getMDCharacterSetCode() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_CLASSIFICATION_CODE:
				return getMDClassificationCode() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_CONSTRAINTS:
				return getMDConstraints() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_COVERAGE_CONTENT_TYPE_CODE:
				return getMDCoverageContentTypeCode() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_COVERAGE_DESCRIPTION:
				return getMDCoverageDescription() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_DATA_IDENTIFICATION:
				return getMDDataIdentification() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_DATATYPE_CODE:
				return getMDDatatypeCode() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_DIGITAL_TRANSFER_OPTIONS:
				return getMDDigitalTransferOptions() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_DIMENSION:
				return getMDDimension() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_DIMENSION_NAME_TYPE_CODE:
				return getMDDimensionNameTypeCode() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_DISTRIBUTION:
				return getMDDistribution() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_DISTRIBUTION_UNITS:
				return getMDDistributionUnits() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_DISTRIBUTOR:
				return getMDDistributor() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_EXTENDED_ELEMENT_INFORMATION:
				return getMDExtendedElementInformation() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_FEATURE_CATALOGUE_DESCRIPTION:
				return getMDFeatureCatalogueDescription() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_FORMAT:
				return getMDFormat() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_GEOMETRIC_OBJECTS:
				return getMDGeometricObjects() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_GEOMETRIC_OBJECT_TYPE_CODE:
				return getMDGeometricObjectTypeCode() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_GEORECTIFIED:
				return getMDGeorectified() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_GRID_SPATIAL_REPRESENTATION:
				return getMDGridSpatialRepresentation() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_GEOREFERENCEABLE:
				return getMDGeoreferenceable() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_IDENTIFIER:
				return getMDIdentifier() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_IMAGE_DESCRIPTION:
				return getMDImageDescription() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_IMAGING_CONDITION_CODE:
				return getMDImagingConditionCode() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_KEYWORDS:
				return getMDKeywords() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_KEYWORD_TYPE_CODE:
				return getMDKeywordTypeCode() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_LEGAL_CONSTRAINTS:
				return getMDLegalConstraints() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_MAINTENANCE_FREQUENCY_CODE:
				return getMDMaintenanceFrequencyCode() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_MAINTENANCE_INFORMATION:
				return getMDMaintenanceInformation() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_MEDIUM:
				return getMDMedium() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_MEDIUM_FORMAT_CODE:
				return getMDMediumFormatCode() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_MEDIUM_NAME_CODE:
				return getMDMediumNameCode() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_METADATA:
				return getMDMetadata() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_METADATA_EXTENSION_INFORMATION:
				return getMDMetadataExtensionInformation() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_OBLIGATION_CODE:
				return getMDObligationCode() != MD_OBLIGATION_CODE_EDEFAULT;
			case GMDPackage.DOCUMENT_ROOT__MD_PIXEL_ORIENTATION_CODE:
				return getMDPixelOrientationCode() != MD_PIXEL_ORIENTATION_CODE_EDEFAULT;
			case GMDPackage.DOCUMENT_ROOT__MD_PORTRAYAL_CATALOGUE_REFERENCE:
				return getMDPortrayalCatalogueReference() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_PROGRESS_CODE:
				return getMDProgressCode() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_REFERENCE_SYSTEM:
				return getMDReferenceSystem() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_REPRESENTATIVE_FRACTION:
				return getMDRepresentativeFraction() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_RESOLUTION:
				return getMDResolution() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_RESTRICTION_CODE:
				return getMDRestrictionCode() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_SCOPE_CODE:
				return getMDScopeCode() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_SCOPE_DESCRIPTION:
				return getMDScopeDescription() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_SECURITY_CONSTRAINTS:
				return getMDSecurityConstraints() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_SERVICE_IDENTIFICATION:
				return getMDServiceIdentification() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_SPATIAL_REPRESENTATION_TYPE_CODE:
				return getMDSpatialRepresentationTypeCode() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_STANDARD_ORDER_PROCESS:
				return getMDStandardOrderProcess() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_TOPIC_CATEGORY_CODE:
				return getMDTopicCategoryCode() != MD_TOPIC_CATEGORY_CODE_EDEFAULT;
			case GMDPackage.DOCUMENT_ROOT__MD_TOPOLOGY_LEVEL_CODE:
				return getMDTopologyLevelCode() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_USAGE:
				return getMDUsage() != null;
			case GMDPackage.DOCUMENT_ROOT__MD_VECTOR_SPATIAL_REPRESENTATION:
				return getMDVectorSpatialRepresentation() != null;
			case GMDPackage.DOCUMENT_ROOT__PT_FREE_TEXT:
				return getPTFreeText() != null;
			case GMDPackage.DOCUMENT_ROOT__PT_LOCALE:
				return getPTLocale() != null;
			case GMDPackage.DOCUMENT_ROOT__PT_LOCALE_CONTAINER:
				return getPTLocaleContainer() != null;
			case GMDPackage.DOCUMENT_ROOT__RS_IDENTIFIER:
				return getRSIdentifier() != null;
			case GMDPackage.DOCUMENT_ROOT__URL:
				return URL_EDEFAULT == null ? getURL() != null : !URL_EDEFAULT.equals(getURL());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
