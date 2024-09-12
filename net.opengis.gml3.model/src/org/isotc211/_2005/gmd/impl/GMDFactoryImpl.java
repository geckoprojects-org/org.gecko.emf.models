/**
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.isotc211._2005.gmd.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GMDFactoryImpl extends EFactoryImpl implements GMDFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GMDFactory init() {
		try {
			GMDFactory theGMDFactory = (GMDFactory)EPackage.Registry.INSTANCE.getEFactory(GMDPackage.eNS_URI);
			if (theGMDFactory != null) {
				return theGMDFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GMDFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMDFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GMDPackage.CI_ADDRESS_PROPERTY_TYPE: return createCIAddressPropertyType();
			case GMDPackage.CI_ADDRESS_TYPE: return createCIAddressType();
			case GMDPackage.CI_CITATION_PROPERTY_TYPE: return createCICitationPropertyType();
			case GMDPackage.CI_CITATION_TYPE: return createCICitationType();
			case GMDPackage.CI_CONTACT_PROPERTY_TYPE: return createCIContactPropertyType();
			case GMDPackage.CI_CONTACT_TYPE: return createCIContactType();
			case GMDPackage.CI_DATE_PROPERTY_TYPE: return createCIDatePropertyType();
			case GMDPackage.CI_DATE_TYPE: return createCIDateType();
			case GMDPackage.CI_DATE_TYPE_CODE_PROPERTY_TYPE: return createCIDateTypeCodePropertyType();
			case GMDPackage.CI_ON_LINE_FUNCTION_CODE_PROPERTY_TYPE: return createCIOnLineFunctionCodePropertyType();
			case GMDPackage.CI_ONLINE_RESOURCE_PROPERTY_TYPE: return createCIOnlineResourcePropertyType();
			case GMDPackage.CI_ONLINE_RESOURCE_TYPE: return createCIOnlineResourceType();
			case GMDPackage.CI_PRESENTATION_FORM_CODE_PROPERTY_TYPE: return createCIPresentationFormCodePropertyType();
			case GMDPackage.CI_RESPONSIBLE_PARTY_PROPERTY_TYPE: return createCIResponsiblePartyPropertyType();
			case GMDPackage.CI_RESPONSIBLE_PARTY_TYPE: return createCIResponsiblePartyType();
			case GMDPackage.CI_ROLE_CODE_PROPERTY_TYPE: return createCIRoleCodePropertyType();
			case GMDPackage.CI_SERIES_PROPERTY_TYPE: return createCISeriesPropertyType();
			case GMDPackage.CI_SERIES_TYPE: return createCISeriesType();
			case GMDPackage.CI_TELEPHONE_PROPERTY_TYPE: return createCITelephonePropertyType();
			case GMDPackage.CI_TELEPHONE_TYPE: return createCITelephoneType();
			case GMDPackage.COUNTRY_PROPERTY_TYPE: return createCountryPropertyType();
			case GMDPackage.DQ_ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY_PROPERTY_TYPE: return createDQAbsoluteExternalPositionalAccuracyPropertyType();
			case GMDPackage.DQ_ABSOLUTE_EXTERNAL_POSITIONAL_ACCURACY_TYPE: return createDQAbsoluteExternalPositionalAccuracyType();
			case GMDPackage.DQ_ACCURACY_OF_ATIME_MEASUREMENT_PROPERTY_TYPE: return createDQAccuracyOfATimeMeasurementPropertyType();
			case GMDPackage.DQ_ACCURACY_OF_ATIME_MEASUREMENT_TYPE: return createDQAccuracyOfATimeMeasurementType();
			case GMDPackage.DQ_COMPLETENESS_COMMISSION_PROPERTY_TYPE: return createDQCompletenessCommissionPropertyType();
			case GMDPackage.DQ_COMPLETENESS_COMMISSION_TYPE: return createDQCompletenessCommissionType();
			case GMDPackage.DQ_COMPLETENESS_OMISSION_PROPERTY_TYPE: return createDQCompletenessOmissionPropertyType();
			case GMDPackage.DQ_COMPLETENESS_OMISSION_TYPE: return createDQCompletenessOmissionType();
			case GMDPackage.DQ_COMPLETENESS_PROPERTY_TYPE: return createDQCompletenessPropertyType();
			case GMDPackage.DQ_CONCEPTUAL_CONSISTENCY_PROPERTY_TYPE: return createDQConceptualConsistencyPropertyType();
			case GMDPackage.DQ_CONCEPTUAL_CONSISTENCY_TYPE: return createDQConceptualConsistencyType();
			case GMDPackage.DQ_CONFORMANCE_RESULT_PROPERTY_TYPE: return createDQConformanceResultPropertyType();
			case GMDPackage.DQ_CONFORMANCE_RESULT_TYPE: return createDQConformanceResultType();
			case GMDPackage.DQ_DATA_QUALITY_PROPERTY_TYPE: return createDQDataQualityPropertyType();
			case GMDPackage.DQ_DATA_QUALITY_TYPE: return createDQDataQualityType();
			case GMDPackage.DQ_DOMAIN_CONSISTENCY_PROPERTY_TYPE: return createDQDomainConsistencyPropertyType();
			case GMDPackage.DQ_DOMAIN_CONSISTENCY_TYPE: return createDQDomainConsistencyType();
			case GMDPackage.DQ_ELEMENT_PROPERTY_TYPE: return createDQElementPropertyType();
			case GMDPackage.DQ_EVALUATION_METHOD_TYPE_CODE_PROPERTY_TYPE: return createDQEvaluationMethodTypeCodePropertyType();
			case GMDPackage.DQ_FORMAT_CONSISTENCY_PROPERTY_TYPE: return createDQFormatConsistencyPropertyType();
			case GMDPackage.DQ_FORMAT_CONSISTENCY_TYPE: return createDQFormatConsistencyType();
			case GMDPackage.DQ_GRIDDED_DATA_POSITIONAL_ACCURACY_PROPERTY_TYPE: return createDQGriddedDataPositionalAccuracyPropertyType();
			case GMDPackage.DQ_GRIDDED_DATA_POSITIONAL_ACCURACY_TYPE: return createDQGriddedDataPositionalAccuracyType();
			case GMDPackage.DQ_LOGICAL_CONSISTENCY_PROPERTY_TYPE: return createDQLogicalConsistencyPropertyType();
			case GMDPackage.DQ_NON_QUANTITATIVE_ATTRIBUTE_ACCURACY_PROPERTY_TYPE: return createDQNonQuantitativeAttributeAccuracyPropertyType();
			case GMDPackage.DQ_NON_QUANTITATIVE_ATTRIBUTE_ACCURACY_TYPE: return createDQNonQuantitativeAttributeAccuracyType();
			case GMDPackage.DQ_POSITIONAL_ACCURACY_PROPERTY_TYPE: return createDQPositionalAccuracyPropertyType();
			case GMDPackage.DQ_QUANTITATIVE_ATTRIBUTE_ACCURACY_PROPERTY_TYPE: return createDQQuantitativeAttributeAccuracyPropertyType();
			case GMDPackage.DQ_QUANTITATIVE_ATTRIBUTE_ACCURACY_TYPE: return createDQQuantitativeAttributeAccuracyType();
			case GMDPackage.DQ_QUANTITATIVE_RESULT_PROPERTY_TYPE: return createDQQuantitativeResultPropertyType();
			case GMDPackage.DQ_QUANTITATIVE_RESULT_TYPE: return createDQQuantitativeResultType();
			case GMDPackage.DQ_RELATIVE_INTERNAL_POSITIONAL_ACCURACY_PROPERTY_TYPE: return createDQRelativeInternalPositionalAccuracyPropertyType();
			case GMDPackage.DQ_RELATIVE_INTERNAL_POSITIONAL_ACCURACY_TYPE: return createDQRelativeInternalPositionalAccuracyType();
			case GMDPackage.DQ_RESULT_PROPERTY_TYPE: return createDQResultPropertyType();
			case GMDPackage.DQ_SCOPE_PROPERTY_TYPE: return createDQScopePropertyType();
			case GMDPackage.DQ_SCOPE_TYPE: return createDQScopeType();
			case GMDPackage.DQ_TEMPORAL_ACCURACY_PROPERTY_TYPE: return createDQTemporalAccuracyPropertyType();
			case GMDPackage.DQ_TEMPORAL_CONSISTENCY_PROPERTY_TYPE: return createDQTemporalConsistencyPropertyType();
			case GMDPackage.DQ_TEMPORAL_CONSISTENCY_TYPE: return createDQTemporalConsistencyType();
			case GMDPackage.DQ_TEMPORAL_VALIDITY_PROPERTY_TYPE: return createDQTemporalValidityPropertyType();
			case GMDPackage.DQ_THEMATIC_ACCURACY_PROPERTY_TYPE: return createDQThematicAccuracyPropertyType();
			case GMDPackage.DQ_THEMATIC_CLASSIFICATION_CORRECTNESS_PROPERTY_TYPE: return createDQThematicClassificationCorrectnessPropertyType();
			case GMDPackage.DQ_TOPOLOGICAL_CONSISTENCY_PROPERTY_TYPE: return createDQTopologicalConsistencyPropertyType();
			case GMDPackage.DS_AGGREGATE_PROPERTY_TYPE: return createDSAggregatePropertyType();
			case GMDPackage.DS_ASSOCIATION_PROPERTY_TYPE: return createDSAssociationPropertyType();
			case GMDPackage.DS_ASSOCIATION_TYPE_CODE_PROPERTY_TYPE: return createDSAssociationTypeCodePropertyType();
			case GMDPackage.DS_DATA_SET_PROPERTY_TYPE: return createDSDataSetPropertyType();
			case GMDPackage.DS_DATA_SET_TYPE: return createDSDataSetType();
			case GMDPackage.DS_INITIATIVE_TYPE_CODE_PROPERTY_TYPE: return createDSInitiativeTypeCodePropertyType();
			case GMDPackage.EX_EXTENT_PROPERTY_TYPE: return createEXExtentPropertyType();
			case GMDPackage.EX_EXTENT_TYPE: return createEXExtentType();
			case GMDPackage.EX_GEOGRAPHIC_EXTENT_PROPERTY_TYPE: return createEXGeographicExtentPropertyType();
			case GMDPackage.EX_TEMPORAL_EXTENT_PROPERTY_TYPE: return createEXTemporalExtentPropertyType();
			case GMDPackage.EX_TEMPORAL_EXTENT_TYPE: return createEXTemporalExtentType();
			case GMDPackage.EX_VERTICAL_EXTENT_PROPERTY_TYPE: return createEXVerticalExtentPropertyType();
			case GMDPackage.EX_VERTICAL_EXTENT_TYPE: return createEXVerticalExtentType();
			case GMDPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case GMDPackage.DQ_TEMPORAL_VALIDITY_TYPE: return createDQTemporalValidityType();
			case GMDPackage.DQ_THEMATIC_CLASSIFICATION_CORRECTNESS_TYPE: return createDQThematicClassificationCorrectnessType();
			case GMDPackage.DQ_TOPOLOGICAL_CONSISTENCY_TYPE: return createDQTopologicalConsistencyType();
			case GMDPackage.DS_ASSOCIATION_TYPE: return createDSAssociationType();
			case GMDPackage.DS_INITIATIVE_PROPERTY_TYPE: return createDSInitiativePropertyType();
			case GMDPackage.DS_INITIATIVE_TYPE: return createDSInitiativeType();
			case GMDPackage.DS_OTHER_AGGREGATE_PROPERTY_TYPE: return createDSOtherAggregatePropertyType();
			case GMDPackage.DS_OTHER_AGGREGATE_TYPE: return createDSOtherAggregateType();
			case GMDPackage.DS_PLATFORM_PROPERTY_TYPE: return createDSPlatformPropertyType();
			case GMDPackage.DS_PLATFORM_TYPE: return createDSPlatformType();
			case GMDPackage.DS_PRODUCTION_SERIES_PROPERTY_TYPE: return createDSProductionSeriesPropertyType();
			case GMDPackage.DS_PRODUCTION_SERIES_TYPE: return createDSProductionSeriesType();
			case GMDPackage.DS_SENSOR_PROPERTY_TYPE: return createDSSensorPropertyType();
			case GMDPackage.DS_SENSOR_TYPE: return createDSSensorType();
			case GMDPackage.DS_SERIES_PROPERTY_TYPE: return createDSSeriesPropertyType();
			case GMDPackage.DS_SERIES_TYPE: return createDSSeriesType();
			case GMDPackage.DS_STEREO_MATE_PROPERTY_TYPE: return createDSStereoMatePropertyType();
			case GMDPackage.DS_STEREO_MATE_TYPE: return createDSStereoMateType();
			case GMDPackage.EX_BOUNDING_POLYGON_PROPERTY_TYPE: return createEXBoundingPolygonPropertyType();
			case GMDPackage.EX_BOUNDING_POLYGON_TYPE: return createEXBoundingPolygonType();
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_PROPERTY_TYPE: return createEXGeographicBoundingBoxPropertyType();
			case GMDPackage.EX_GEOGRAPHIC_BOUNDING_BOX_TYPE: return createEXGeographicBoundingBoxType();
			case GMDPackage.EX_GEOGRAPHIC_DESCRIPTION_PROPERTY_TYPE: return createEXGeographicDescriptionPropertyType();
			case GMDPackage.EX_GEOGRAPHIC_DESCRIPTION_TYPE: return createEXGeographicDescriptionType();
			case GMDPackage.EX_SPATIAL_TEMPORAL_EXTENT_PROPERTY_TYPE: return createEXSpatialTemporalExtentPropertyType();
			case GMDPackage.EX_SPATIAL_TEMPORAL_EXTENT_TYPE: return createEXSpatialTemporalExtentType();
			case GMDPackage.LANGUAGE_CODE_PROPERTY_TYPE: return createLanguageCodePropertyType();
			case GMDPackage.LI_LINEAGE_PROPERTY_TYPE: return createLILineagePropertyType();
			case GMDPackage.LI_LINEAGE_TYPE: return createLILineageType();
			case GMDPackage.LI_PROCESS_STEP_PROPERTY_TYPE: return createLIProcessStepPropertyType();
			case GMDPackage.LI_PROCESS_STEP_TYPE: return createLIProcessStepType();
			case GMDPackage.LI_SOURCE_PROPERTY_TYPE: return createLISourcePropertyType();
			case GMDPackage.LI_SOURCE_TYPE: return createLISourceType();
			case GMDPackage.LOCALISED_CHARACTER_STRING_PROPERTY_TYPE: return createLocalisedCharacterStringPropertyType();
			case GMDPackage.LOCALISED_CHARACTER_STRING_TYPE: return createLocalisedCharacterStringType();
			case GMDPackage.MD_AGGREGATE_INFORMATION_PROPERTY_TYPE: return createMDAggregateInformationPropertyType();
			case GMDPackage.MD_AGGREGATE_INFORMATION_TYPE: return createMDAggregateInformationType();
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_PROPERTY_TYPE: return createMDApplicationSchemaInformationPropertyType();
			case GMDPackage.MD_APPLICATION_SCHEMA_INFORMATION_TYPE: return createMDApplicationSchemaInformationType();
			case GMDPackage.MD_BAND_PROPERTY_TYPE: return createMDBandPropertyType();
			case GMDPackage.MD_BAND_TYPE: return createMDBandType();
			case GMDPackage.MD_BROWSE_GRAPHIC_PROPERTY_TYPE: return createMDBrowseGraphicPropertyType();
			case GMDPackage.MD_BROWSE_GRAPHIC_TYPE: return createMDBrowseGraphicType();
			case GMDPackage.MD_CELL_GEOMETRY_CODE_PROPERTY_TYPE: return createMDCellGeometryCodePropertyType();
			case GMDPackage.MD_CHARACTER_SET_CODE_PROPERTY_TYPE: return createMDCharacterSetCodePropertyType();
			case GMDPackage.MD_CLASSIFICATION_CODE_PROPERTY_TYPE: return createMDClassificationCodePropertyType();
			case GMDPackage.MD_CONSTRAINTS_PROPERTY_TYPE: return createMDConstraintsPropertyType();
			case GMDPackage.MD_CONSTRAINTS_TYPE: return createMDConstraintsType();
			case GMDPackage.MD_CONTENT_INFORMATION_PROPERTY_TYPE: return createMDContentInformationPropertyType();
			case GMDPackage.MD_COVERAGE_CONTENT_TYPE_CODE_PROPERTY_TYPE: return createMDCoverageContentTypeCodePropertyType();
			case GMDPackage.MD_COVERAGE_DESCRIPTION_PROPERTY_TYPE: return createMDCoverageDescriptionPropertyType();
			case GMDPackage.MD_COVERAGE_DESCRIPTION_TYPE: return createMDCoverageDescriptionType();
			case GMDPackage.MD_DATA_IDENTIFICATION_PROPERTY_TYPE: return createMDDataIdentificationPropertyType();
			case GMDPackage.MD_DATA_IDENTIFICATION_TYPE: return createMDDataIdentificationType();
			case GMDPackage.MD_DATATYPE_CODE_PROPERTY_TYPE: return createMDDatatypeCodePropertyType();
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_PROPERTY_TYPE: return createMDDigitalTransferOptionsPropertyType();
			case GMDPackage.MD_DIGITAL_TRANSFER_OPTIONS_TYPE: return createMDDigitalTransferOptionsType();
			case GMDPackage.MD_DIMENSION_NAME_TYPE_CODE_PROPERTY_TYPE: return createMDDimensionNameTypeCodePropertyType();
			case GMDPackage.MD_DIMENSION_PROPERTY_TYPE: return createMDDimensionPropertyType();
			case GMDPackage.MD_DIMENSION_TYPE: return createMDDimensionType();
			case GMDPackage.MD_DISTRIBUTION_PROPERTY_TYPE: return createMDDistributionPropertyType();
			case GMDPackage.MD_DISTRIBUTION_TYPE: return createMDDistributionType();
			case GMDPackage.MD_DISTRIBUTION_UNITS_PROPERTY_TYPE: return createMDDistributionUnitsPropertyType();
			case GMDPackage.MD_DISTRIBUTOR_PROPERTY_TYPE: return createMDDistributorPropertyType();
			case GMDPackage.MD_DISTRIBUTOR_TYPE: return createMDDistributorType();
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_PROPERTY_TYPE: return createMDExtendedElementInformationPropertyType();
			case GMDPackage.MD_EXTENDED_ELEMENT_INFORMATION_TYPE: return createMDExtendedElementInformationType();
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_PROPERTY_TYPE: return createMDFeatureCatalogueDescriptionPropertyType();
			case GMDPackage.MD_FEATURE_CATALOGUE_DESCRIPTION_TYPE: return createMDFeatureCatalogueDescriptionType();
			case GMDPackage.MD_FORMAT_PROPERTY_TYPE: return createMDFormatPropertyType();
			case GMDPackage.MD_FORMAT_TYPE: return createMDFormatType();
			case GMDPackage.MD_GEOMETRIC_OBJECTS_PROPERTY_TYPE: return createMDGeometricObjectsPropertyType();
			case GMDPackage.MD_GEOMETRIC_OBJECTS_TYPE: return createMDGeometricObjectsType();
			case GMDPackage.MD_GEOMETRIC_OBJECT_TYPE_CODE_PROPERTY_TYPE: return createMDGeometricObjectTypeCodePropertyType();
			case GMDPackage.MD_GEORECTIFIED_PROPERTY_TYPE: return createMDGeorectifiedPropertyType();
			case GMDPackage.MD_GEORECTIFIED_TYPE: return createMDGeorectifiedType();
			case GMDPackage.MD_GEOREFERENCEABLE_PROPERTY_TYPE: return createMDGeoreferenceablePropertyType();
			case GMDPackage.MD_GEOREFERENCEABLE_TYPE: return createMDGeoreferenceableType();
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_PROPERTY_TYPE: return createMDGridSpatialRepresentationPropertyType();
			case GMDPackage.MD_GRID_SPATIAL_REPRESENTATION_TYPE: return createMDGridSpatialRepresentationType();
			case GMDPackage.MD_IDENTIFICATION_PROPERTY_TYPE: return createMDIdentificationPropertyType();
			case GMDPackage.MD_IDENTIFIER_PROPERTY_TYPE: return createMDIdentifierPropertyType();
			case GMDPackage.MD_IDENTIFIER_TYPE: return createMDIdentifierType();
			case GMDPackage.MD_IMAGE_DESCRIPTION_PROPERTY_TYPE: return createMDImageDescriptionPropertyType();
			case GMDPackage.MD_IMAGE_DESCRIPTION_TYPE: return createMDImageDescriptionType();
			case GMDPackage.MD_IMAGING_CONDITION_CODE_PROPERTY_TYPE: return createMDImagingConditionCodePropertyType();
			case GMDPackage.MD_KEYWORDS_PROPERTY_TYPE: return createMDKeywordsPropertyType();
			case GMDPackage.MD_KEYWORDS_TYPE: return createMDKeywordsType();
			case GMDPackage.MD_KEYWORD_TYPE_CODE_PROPERTY_TYPE: return createMDKeywordTypeCodePropertyType();
			case GMDPackage.MD_LEGAL_CONSTRAINTS_PROPERTY_TYPE: return createMDLegalConstraintsPropertyType();
			case GMDPackage.MD_LEGAL_CONSTRAINTS_TYPE: return createMDLegalConstraintsType();
			case GMDPackage.MD_MAINTENANCE_FREQUENCY_CODE_PROPERTY_TYPE: return createMDMaintenanceFrequencyCodePropertyType();
			case GMDPackage.MD_MAINTENANCE_INFORMATION_PROPERTY_TYPE: return createMDMaintenanceInformationPropertyType();
			case GMDPackage.MD_MAINTENANCE_INFORMATION_TYPE: return createMDMaintenanceInformationType();
			case GMDPackage.MD_MEDIUM_FORMAT_CODE_PROPERTY_TYPE: return createMDMediumFormatCodePropertyType();
			case GMDPackage.MD_MEDIUM_NAME_CODE_PROPERTY_TYPE: return createMDMediumNameCodePropertyType();
			case GMDPackage.MD_MEDIUM_PROPERTY_TYPE: return createMDMediumPropertyType();
			case GMDPackage.MD_MEDIUM_TYPE: return createMDMediumType();
			case GMDPackage.MD_METADATA_EXTENSION_INFORMATION_PROPERTY_TYPE: return createMDMetadataExtensionInformationPropertyType();
			case GMDPackage.MD_METADATA_EXTENSION_INFORMATION_TYPE: return createMDMetadataExtensionInformationType();
			case GMDPackage.MD_METADATA_PROPERTY_TYPE: return createMDMetadataPropertyType();
			case GMDPackage.MD_METADATA_TYPE: return createMDMetadataType();
			case GMDPackage.MD_OBLIGATION_CODE_PROPERTY_TYPE: return createMDObligationCodePropertyType();
			case GMDPackage.MD_PIXEL_ORIENTATION_CODE_PROPERTY_TYPE: return createMDPixelOrientationCodePropertyType();
			case GMDPackage.MD_PORTRAYAL_CATALOGUE_REFERENCE_PROPERTY_TYPE: return createMDPortrayalCatalogueReferencePropertyType();
			case GMDPackage.MD_PORTRAYAL_CATALOGUE_REFERENCE_TYPE: return createMDPortrayalCatalogueReferenceType();
			case GMDPackage.MD_PROGRESS_CODE_PROPERTY_TYPE: return createMDProgressCodePropertyType();
			case GMDPackage.MD_RANGE_DIMENSION_PROPERTY_TYPE: return createMDRangeDimensionPropertyType();
			case GMDPackage.MD_RANGE_DIMENSION_TYPE: return createMDRangeDimensionType();
			case GMDPackage.MD_REFERENCE_SYSTEM_PROPERTY_TYPE: return createMDReferenceSystemPropertyType();
			case GMDPackage.MD_REFERENCE_SYSTEM_TYPE: return createMDReferenceSystemType();
			case GMDPackage.MD_REPRESENTATIVE_FRACTION_PROPERTY_TYPE: return createMDRepresentativeFractionPropertyType();
			case GMDPackage.MD_REPRESENTATIVE_FRACTION_TYPE: return createMDRepresentativeFractionType();
			case GMDPackage.MD_RESOLUTION_PROPERTY_TYPE: return createMDResolutionPropertyType();
			case GMDPackage.MD_RESOLUTION_TYPE: return createMDResolutionType();
			case GMDPackage.MD_RESTRICTION_CODE_PROPERTY_TYPE: return createMDRestrictionCodePropertyType();
			case GMDPackage.MD_SCOPE_CODE_PROPERTY_TYPE: return createMDScopeCodePropertyType();
			case GMDPackage.MD_SCOPE_DESCRIPTION_PROPERTY_TYPE: return createMDScopeDescriptionPropertyType();
			case GMDPackage.MD_SCOPE_DESCRIPTION_TYPE: return createMDScopeDescriptionType();
			case GMDPackage.MD_SECURITY_CONSTRAINTS_PROPERTY_TYPE: return createMDSecurityConstraintsPropertyType();
			case GMDPackage.MD_SECURITY_CONSTRAINTS_TYPE: return createMDSecurityConstraintsType();
			case GMDPackage.MD_SERVICE_IDENTIFICATION_PROPERTY_TYPE: return createMDServiceIdentificationPropertyType();
			case GMDPackage.MD_SERVICE_IDENTIFICATION_TYPE: return createMDServiceIdentificationType();
			case GMDPackage.MD_SPATIAL_REPRESENTATION_PROPERTY_TYPE: return createMDSpatialRepresentationPropertyType();
			case GMDPackage.MD_SPATIAL_REPRESENTATION_TYPE_CODE_PROPERTY_TYPE: return createMDSpatialRepresentationTypeCodePropertyType();
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_PROPERTY_TYPE: return createMDStandardOrderProcessPropertyType();
			case GMDPackage.MD_STANDARD_ORDER_PROCESS_TYPE: return createMDStandardOrderProcessType();
			case GMDPackage.MD_TOPIC_CATEGORY_CODE_PROPERTY_TYPE: return createMDTopicCategoryCodePropertyType();
			case GMDPackage.MD_TOPOLOGY_LEVEL_CODE_PROPERTY_TYPE: return createMDTopologyLevelCodePropertyType();
			case GMDPackage.MD_USAGE_PROPERTY_TYPE: return createMDUsagePropertyType();
			case GMDPackage.MD_USAGE_TYPE: return createMDUsageType();
			case GMDPackage.MD_VECTOR_SPATIAL_REPRESENTATION_PROPERTY_TYPE: return createMDVectorSpatialRepresentationPropertyType();
			case GMDPackage.MD_VECTOR_SPATIAL_REPRESENTATION_TYPE: return createMDVectorSpatialRepresentationType();
			case GMDPackage.PT_FREE_TEXT_PROPERTY_TYPE: return createPTFreeTextPropertyType();
			case GMDPackage.PT_FREE_TEXT_TYPE: return createPTFreeTextType();
			case GMDPackage.PT_LOCALE_CONTAINER_PROPERTY_TYPE: return createPTLocaleContainerPropertyType();
			case GMDPackage.PT_LOCALE_CONTAINER_TYPE: return createPTLocaleContainerType();
			case GMDPackage.PT_LOCALE_PROPERTY_TYPE: return createPTLocalePropertyType();
			case GMDPackage.PT_LOCALE_TYPE: return createPTLocaleType();
			case GMDPackage.RS_IDENTIFIER_PROPERTY_TYPE: return createRSIdentifierPropertyType();
			case GMDPackage.RS_IDENTIFIER_TYPE: return createRSIdentifierType();
			case GMDPackage.RS_REFERENCE_SYSTEM_PROPERTY_TYPE: return createRSReferenceSystemPropertyType();
			case GMDPackage.URL_PROPERTY_TYPE: return createURLPropertyType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GMDPackage.MD_OBLIGATION_CODE_TYPE:
				return createMDObligationCodeTypeFromString(eDataType, initialValue);
			case GMDPackage.MD_PIXEL_ORIENTATION_CODE_TYPE:
				return createMDPixelOrientationCodeTypeFromString(eDataType, initialValue);
			case GMDPackage.MD_TOPIC_CATEGORY_CODE_TYPE:
				return createMDTopicCategoryCodeTypeFromString(eDataType, initialValue);
			case GMDPackage.MD_OBLIGATION_CODE_TYPE_OBJECT:
				return createMDObligationCodeTypeObjectFromString(eDataType, initialValue);
			case GMDPackage.MD_PIXEL_ORIENTATION_CODE_TYPE_OBJECT:
				return createMDPixelOrientationCodeTypeObjectFromString(eDataType, initialValue);
			case GMDPackage.MD_TOPIC_CATEGORY_CODE_TYPE_OBJECT:
				return createMDTopicCategoryCodeTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GMDPackage.MD_OBLIGATION_CODE_TYPE:
				return convertMDObligationCodeTypeToString(eDataType, instanceValue);
			case GMDPackage.MD_PIXEL_ORIENTATION_CODE_TYPE:
				return convertMDPixelOrientationCodeTypeToString(eDataType, instanceValue);
			case GMDPackage.MD_TOPIC_CATEGORY_CODE_TYPE:
				return convertMDTopicCategoryCodeTypeToString(eDataType, instanceValue);
			case GMDPackage.MD_OBLIGATION_CODE_TYPE_OBJECT:
				return convertMDObligationCodeTypeObjectToString(eDataType, instanceValue);
			case GMDPackage.MD_PIXEL_ORIENTATION_CODE_TYPE_OBJECT:
				return convertMDPixelOrientationCodeTypeObjectToString(eDataType, instanceValue);
			case GMDPackage.MD_TOPIC_CATEGORY_CODE_TYPE_OBJECT:
				return convertMDTopicCategoryCodeTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIAddressPropertyType createCIAddressPropertyType() {
		CIAddressPropertyTypeImpl ciAddressPropertyType = new CIAddressPropertyTypeImpl();
		return ciAddressPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIAddressType createCIAddressType() {
		CIAddressTypeImpl ciAddressType = new CIAddressTypeImpl();
		return ciAddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CICitationPropertyType createCICitationPropertyType() {
		CICitationPropertyTypeImpl ciCitationPropertyType = new CICitationPropertyTypeImpl();
		return ciCitationPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CICitationType createCICitationType() {
		CICitationTypeImpl ciCitationType = new CICitationTypeImpl();
		return ciCitationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIContactPropertyType createCIContactPropertyType() {
		CIContactPropertyTypeImpl ciContactPropertyType = new CIContactPropertyTypeImpl();
		return ciContactPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIContactType createCIContactType() {
		CIContactTypeImpl ciContactType = new CIContactTypeImpl();
		return ciContactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIDatePropertyType createCIDatePropertyType() {
		CIDatePropertyTypeImpl ciDatePropertyType = new CIDatePropertyTypeImpl();
		return ciDatePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIDateType createCIDateType() {
		CIDateTypeImpl ciDateType = new CIDateTypeImpl();
		return ciDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIDateTypeCodePropertyType createCIDateTypeCodePropertyType() {
		CIDateTypeCodePropertyTypeImpl ciDateTypeCodePropertyType = new CIDateTypeCodePropertyTypeImpl();
		return ciDateTypeCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIOnLineFunctionCodePropertyType createCIOnLineFunctionCodePropertyType() {
		CIOnLineFunctionCodePropertyTypeImpl ciOnLineFunctionCodePropertyType = new CIOnLineFunctionCodePropertyTypeImpl();
		return ciOnLineFunctionCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIOnlineResourcePropertyType createCIOnlineResourcePropertyType() {
		CIOnlineResourcePropertyTypeImpl ciOnlineResourcePropertyType = new CIOnlineResourcePropertyTypeImpl();
		return ciOnlineResourcePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIOnlineResourceType createCIOnlineResourceType() {
		CIOnlineResourceTypeImpl ciOnlineResourceType = new CIOnlineResourceTypeImpl();
		return ciOnlineResourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIPresentationFormCodePropertyType createCIPresentationFormCodePropertyType() {
		CIPresentationFormCodePropertyTypeImpl ciPresentationFormCodePropertyType = new CIPresentationFormCodePropertyTypeImpl();
		return ciPresentationFormCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIResponsiblePartyPropertyType createCIResponsiblePartyPropertyType() {
		CIResponsiblePartyPropertyTypeImpl ciResponsiblePartyPropertyType = new CIResponsiblePartyPropertyTypeImpl();
		return ciResponsiblePartyPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIResponsiblePartyType createCIResponsiblePartyType() {
		CIResponsiblePartyTypeImpl ciResponsiblePartyType = new CIResponsiblePartyTypeImpl();
		return ciResponsiblePartyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIRoleCodePropertyType createCIRoleCodePropertyType() {
		CIRoleCodePropertyTypeImpl ciRoleCodePropertyType = new CIRoleCodePropertyTypeImpl();
		return ciRoleCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CISeriesPropertyType createCISeriesPropertyType() {
		CISeriesPropertyTypeImpl ciSeriesPropertyType = new CISeriesPropertyTypeImpl();
		return ciSeriesPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CISeriesType createCISeriesType() {
		CISeriesTypeImpl ciSeriesType = new CISeriesTypeImpl();
		return ciSeriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CITelephonePropertyType createCITelephonePropertyType() {
		CITelephonePropertyTypeImpl ciTelephonePropertyType = new CITelephonePropertyTypeImpl();
		return ciTelephonePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CITelephoneType createCITelephoneType() {
		CITelephoneTypeImpl ciTelephoneType = new CITelephoneTypeImpl();
		return ciTelephoneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountryPropertyType createCountryPropertyType() {
		CountryPropertyTypeImpl countryPropertyType = new CountryPropertyTypeImpl();
		return countryPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQAbsoluteExternalPositionalAccuracyPropertyType createDQAbsoluteExternalPositionalAccuracyPropertyType() {
		DQAbsoluteExternalPositionalAccuracyPropertyTypeImpl dqAbsoluteExternalPositionalAccuracyPropertyType = new DQAbsoluteExternalPositionalAccuracyPropertyTypeImpl();
		return dqAbsoluteExternalPositionalAccuracyPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQAbsoluteExternalPositionalAccuracyType createDQAbsoluteExternalPositionalAccuracyType() {
		DQAbsoluteExternalPositionalAccuracyTypeImpl dqAbsoluteExternalPositionalAccuracyType = new DQAbsoluteExternalPositionalAccuracyTypeImpl();
		return dqAbsoluteExternalPositionalAccuracyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQAccuracyOfATimeMeasurementPropertyType createDQAccuracyOfATimeMeasurementPropertyType() {
		DQAccuracyOfATimeMeasurementPropertyTypeImpl dqAccuracyOfATimeMeasurementPropertyType = new DQAccuracyOfATimeMeasurementPropertyTypeImpl();
		return dqAccuracyOfATimeMeasurementPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQAccuracyOfATimeMeasurementType createDQAccuracyOfATimeMeasurementType() {
		DQAccuracyOfATimeMeasurementTypeImpl dqAccuracyOfATimeMeasurementType = new DQAccuracyOfATimeMeasurementTypeImpl();
		return dqAccuracyOfATimeMeasurementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQCompletenessCommissionPropertyType createDQCompletenessCommissionPropertyType() {
		DQCompletenessCommissionPropertyTypeImpl dqCompletenessCommissionPropertyType = new DQCompletenessCommissionPropertyTypeImpl();
		return dqCompletenessCommissionPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQCompletenessCommissionType createDQCompletenessCommissionType() {
		DQCompletenessCommissionTypeImpl dqCompletenessCommissionType = new DQCompletenessCommissionTypeImpl();
		return dqCompletenessCommissionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQCompletenessOmissionPropertyType createDQCompletenessOmissionPropertyType() {
		DQCompletenessOmissionPropertyTypeImpl dqCompletenessOmissionPropertyType = new DQCompletenessOmissionPropertyTypeImpl();
		return dqCompletenessOmissionPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQCompletenessOmissionType createDQCompletenessOmissionType() {
		DQCompletenessOmissionTypeImpl dqCompletenessOmissionType = new DQCompletenessOmissionTypeImpl();
		return dqCompletenessOmissionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQCompletenessPropertyType createDQCompletenessPropertyType() {
		DQCompletenessPropertyTypeImpl dqCompletenessPropertyType = new DQCompletenessPropertyTypeImpl();
		return dqCompletenessPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQConceptualConsistencyPropertyType createDQConceptualConsistencyPropertyType() {
		DQConceptualConsistencyPropertyTypeImpl dqConceptualConsistencyPropertyType = new DQConceptualConsistencyPropertyTypeImpl();
		return dqConceptualConsistencyPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQConceptualConsistencyType createDQConceptualConsistencyType() {
		DQConceptualConsistencyTypeImpl dqConceptualConsistencyType = new DQConceptualConsistencyTypeImpl();
		return dqConceptualConsistencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQConformanceResultPropertyType createDQConformanceResultPropertyType() {
		DQConformanceResultPropertyTypeImpl dqConformanceResultPropertyType = new DQConformanceResultPropertyTypeImpl();
		return dqConformanceResultPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQConformanceResultType createDQConformanceResultType() {
		DQConformanceResultTypeImpl dqConformanceResultType = new DQConformanceResultTypeImpl();
		return dqConformanceResultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQDataQualityPropertyType createDQDataQualityPropertyType() {
		DQDataQualityPropertyTypeImpl dqDataQualityPropertyType = new DQDataQualityPropertyTypeImpl();
		return dqDataQualityPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQDataQualityType createDQDataQualityType() {
		DQDataQualityTypeImpl dqDataQualityType = new DQDataQualityTypeImpl();
		return dqDataQualityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQDomainConsistencyPropertyType createDQDomainConsistencyPropertyType() {
		DQDomainConsistencyPropertyTypeImpl dqDomainConsistencyPropertyType = new DQDomainConsistencyPropertyTypeImpl();
		return dqDomainConsistencyPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQDomainConsistencyType createDQDomainConsistencyType() {
		DQDomainConsistencyTypeImpl dqDomainConsistencyType = new DQDomainConsistencyTypeImpl();
		return dqDomainConsistencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQElementPropertyType createDQElementPropertyType() {
		DQElementPropertyTypeImpl dqElementPropertyType = new DQElementPropertyTypeImpl();
		return dqElementPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQEvaluationMethodTypeCodePropertyType createDQEvaluationMethodTypeCodePropertyType() {
		DQEvaluationMethodTypeCodePropertyTypeImpl dqEvaluationMethodTypeCodePropertyType = new DQEvaluationMethodTypeCodePropertyTypeImpl();
		return dqEvaluationMethodTypeCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQFormatConsistencyPropertyType createDQFormatConsistencyPropertyType() {
		DQFormatConsistencyPropertyTypeImpl dqFormatConsistencyPropertyType = new DQFormatConsistencyPropertyTypeImpl();
		return dqFormatConsistencyPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQFormatConsistencyType createDQFormatConsistencyType() {
		DQFormatConsistencyTypeImpl dqFormatConsistencyType = new DQFormatConsistencyTypeImpl();
		return dqFormatConsistencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQGriddedDataPositionalAccuracyPropertyType createDQGriddedDataPositionalAccuracyPropertyType() {
		DQGriddedDataPositionalAccuracyPropertyTypeImpl dqGriddedDataPositionalAccuracyPropertyType = new DQGriddedDataPositionalAccuracyPropertyTypeImpl();
		return dqGriddedDataPositionalAccuracyPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQGriddedDataPositionalAccuracyType createDQGriddedDataPositionalAccuracyType() {
		DQGriddedDataPositionalAccuracyTypeImpl dqGriddedDataPositionalAccuracyType = new DQGriddedDataPositionalAccuracyTypeImpl();
		return dqGriddedDataPositionalAccuracyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQLogicalConsistencyPropertyType createDQLogicalConsistencyPropertyType() {
		DQLogicalConsistencyPropertyTypeImpl dqLogicalConsistencyPropertyType = new DQLogicalConsistencyPropertyTypeImpl();
		return dqLogicalConsistencyPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQNonQuantitativeAttributeAccuracyPropertyType createDQNonQuantitativeAttributeAccuracyPropertyType() {
		DQNonQuantitativeAttributeAccuracyPropertyTypeImpl dqNonQuantitativeAttributeAccuracyPropertyType = new DQNonQuantitativeAttributeAccuracyPropertyTypeImpl();
		return dqNonQuantitativeAttributeAccuracyPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQNonQuantitativeAttributeAccuracyType createDQNonQuantitativeAttributeAccuracyType() {
		DQNonQuantitativeAttributeAccuracyTypeImpl dqNonQuantitativeAttributeAccuracyType = new DQNonQuantitativeAttributeAccuracyTypeImpl();
		return dqNonQuantitativeAttributeAccuracyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQPositionalAccuracyPropertyType createDQPositionalAccuracyPropertyType() {
		DQPositionalAccuracyPropertyTypeImpl dqPositionalAccuracyPropertyType = new DQPositionalAccuracyPropertyTypeImpl();
		return dqPositionalAccuracyPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQQuantitativeAttributeAccuracyPropertyType createDQQuantitativeAttributeAccuracyPropertyType() {
		DQQuantitativeAttributeAccuracyPropertyTypeImpl dqQuantitativeAttributeAccuracyPropertyType = new DQQuantitativeAttributeAccuracyPropertyTypeImpl();
		return dqQuantitativeAttributeAccuracyPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQQuantitativeAttributeAccuracyType createDQQuantitativeAttributeAccuracyType() {
		DQQuantitativeAttributeAccuracyTypeImpl dqQuantitativeAttributeAccuracyType = new DQQuantitativeAttributeAccuracyTypeImpl();
		return dqQuantitativeAttributeAccuracyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQQuantitativeResultPropertyType createDQQuantitativeResultPropertyType() {
		DQQuantitativeResultPropertyTypeImpl dqQuantitativeResultPropertyType = new DQQuantitativeResultPropertyTypeImpl();
		return dqQuantitativeResultPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQQuantitativeResultType createDQQuantitativeResultType() {
		DQQuantitativeResultTypeImpl dqQuantitativeResultType = new DQQuantitativeResultTypeImpl();
		return dqQuantitativeResultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQRelativeInternalPositionalAccuracyPropertyType createDQRelativeInternalPositionalAccuracyPropertyType() {
		DQRelativeInternalPositionalAccuracyPropertyTypeImpl dqRelativeInternalPositionalAccuracyPropertyType = new DQRelativeInternalPositionalAccuracyPropertyTypeImpl();
		return dqRelativeInternalPositionalAccuracyPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQRelativeInternalPositionalAccuracyType createDQRelativeInternalPositionalAccuracyType() {
		DQRelativeInternalPositionalAccuracyTypeImpl dqRelativeInternalPositionalAccuracyType = new DQRelativeInternalPositionalAccuracyTypeImpl();
		return dqRelativeInternalPositionalAccuracyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQResultPropertyType createDQResultPropertyType() {
		DQResultPropertyTypeImpl dqResultPropertyType = new DQResultPropertyTypeImpl();
		return dqResultPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQScopePropertyType createDQScopePropertyType() {
		DQScopePropertyTypeImpl dqScopePropertyType = new DQScopePropertyTypeImpl();
		return dqScopePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQScopeType createDQScopeType() {
		DQScopeTypeImpl dqScopeType = new DQScopeTypeImpl();
		return dqScopeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQTemporalAccuracyPropertyType createDQTemporalAccuracyPropertyType() {
		DQTemporalAccuracyPropertyTypeImpl dqTemporalAccuracyPropertyType = new DQTemporalAccuracyPropertyTypeImpl();
		return dqTemporalAccuracyPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQTemporalConsistencyPropertyType createDQTemporalConsistencyPropertyType() {
		DQTemporalConsistencyPropertyTypeImpl dqTemporalConsistencyPropertyType = new DQTemporalConsistencyPropertyTypeImpl();
		return dqTemporalConsistencyPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQTemporalConsistencyType createDQTemporalConsistencyType() {
		DQTemporalConsistencyTypeImpl dqTemporalConsistencyType = new DQTemporalConsistencyTypeImpl();
		return dqTemporalConsistencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQTemporalValidityPropertyType createDQTemporalValidityPropertyType() {
		DQTemporalValidityPropertyTypeImpl dqTemporalValidityPropertyType = new DQTemporalValidityPropertyTypeImpl();
		return dqTemporalValidityPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQThematicAccuracyPropertyType createDQThematicAccuracyPropertyType() {
		DQThematicAccuracyPropertyTypeImpl dqThematicAccuracyPropertyType = new DQThematicAccuracyPropertyTypeImpl();
		return dqThematicAccuracyPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQThematicClassificationCorrectnessPropertyType createDQThematicClassificationCorrectnessPropertyType() {
		DQThematicClassificationCorrectnessPropertyTypeImpl dqThematicClassificationCorrectnessPropertyType = new DQThematicClassificationCorrectnessPropertyTypeImpl();
		return dqThematicClassificationCorrectnessPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQTopologicalConsistencyPropertyType createDQTopologicalConsistencyPropertyType() {
		DQTopologicalConsistencyPropertyTypeImpl dqTopologicalConsistencyPropertyType = new DQTopologicalConsistencyPropertyTypeImpl();
		return dqTopologicalConsistencyPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSAggregatePropertyType createDSAggregatePropertyType() {
		DSAggregatePropertyTypeImpl dsAggregatePropertyType = new DSAggregatePropertyTypeImpl();
		return dsAggregatePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSAssociationPropertyType createDSAssociationPropertyType() {
		DSAssociationPropertyTypeImpl dsAssociationPropertyType = new DSAssociationPropertyTypeImpl();
		return dsAssociationPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSAssociationTypeCodePropertyType createDSAssociationTypeCodePropertyType() {
		DSAssociationTypeCodePropertyTypeImpl dsAssociationTypeCodePropertyType = new DSAssociationTypeCodePropertyTypeImpl();
		return dsAssociationTypeCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSDataSetPropertyType createDSDataSetPropertyType() {
		DSDataSetPropertyTypeImpl dsDataSetPropertyType = new DSDataSetPropertyTypeImpl();
		return dsDataSetPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSDataSetType createDSDataSetType() {
		DSDataSetTypeImpl dsDataSetType = new DSDataSetTypeImpl();
		return dsDataSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSInitiativeTypeCodePropertyType createDSInitiativeTypeCodePropertyType() {
		DSInitiativeTypeCodePropertyTypeImpl dsInitiativeTypeCodePropertyType = new DSInitiativeTypeCodePropertyTypeImpl();
		return dsInitiativeTypeCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXExtentPropertyType createEXExtentPropertyType() {
		EXExtentPropertyTypeImpl exExtentPropertyType = new EXExtentPropertyTypeImpl();
		return exExtentPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXExtentType createEXExtentType() {
		EXExtentTypeImpl exExtentType = new EXExtentTypeImpl();
		return exExtentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXGeographicExtentPropertyType createEXGeographicExtentPropertyType() {
		EXGeographicExtentPropertyTypeImpl exGeographicExtentPropertyType = new EXGeographicExtentPropertyTypeImpl();
		return exGeographicExtentPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXTemporalExtentPropertyType createEXTemporalExtentPropertyType() {
		EXTemporalExtentPropertyTypeImpl exTemporalExtentPropertyType = new EXTemporalExtentPropertyTypeImpl();
		return exTemporalExtentPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXTemporalExtentType createEXTemporalExtentType() {
		EXTemporalExtentTypeImpl exTemporalExtentType = new EXTemporalExtentTypeImpl();
		return exTemporalExtentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXVerticalExtentPropertyType createEXVerticalExtentPropertyType() {
		EXVerticalExtentPropertyTypeImpl exVerticalExtentPropertyType = new EXVerticalExtentPropertyTypeImpl();
		return exVerticalExtentPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXVerticalExtentType createEXVerticalExtentType() {
		EXVerticalExtentTypeImpl exVerticalExtentType = new EXVerticalExtentTypeImpl();
		return exVerticalExtentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQTemporalValidityType createDQTemporalValidityType() {
		DQTemporalValidityTypeImpl dqTemporalValidityType = new DQTemporalValidityTypeImpl();
		return dqTemporalValidityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQThematicClassificationCorrectnessType createDQThematicClassificationCorrectnessType() {
		DQThematicClassificationCorrectnessTypeImpl dqThematicClassificationCorrectnessType = new DQThematicClassificationCorrectnessTypeImpl();
		return dqThematicClassificationCorrectnessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DQTopologicalConsistencyType createDQTopologicalConsistencyType() {
		DQTopologicalConsistencyTypeImpl dqTopologicalConsistencyType = new DQTopologicalConsistencyTypeImpl();
		return dqTopologicalConsistencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSAssociationType createDSAssociationType() {
		DSAssociationTypeImpl dsAssociationType = new DSAssociationTypeImpl();
		return dsAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSInitiativePropertyType createDSInitiativePropertyType() {
		DSInitiativePropertyTypeImpl dsInitiativePropertyType = new DSInitiativePropertyTypeImpl();
		return dsInitiativePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSInitiativeType createDSInitiativeType() {
		DSInitiativeTypeImpl dsInitiativeType = new DSInitiativeTypeImpl();
		return dsInitiativeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSOtherAggregatePropertyType createDSOtherAggregatePropertyType() {
		DSOtherAggregatePropertyTypeImpl dsOtherAggregatePropertyType = new DSOtherAggregatePropertyTypeImpl();
		return dsOtherAggregatePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSOtherAggregateType createDSOtherAggregateType() {
		DSOtherAggregateTypeImpl dsOtherAggregateType = new DSOtherAggregateTypeImpl();
		return dsOtherAggregateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSPlatformPropertyType createDSPlatformPropertyType() {
		DSPlatformPropertyTypeImpl dsPlatformPropertyType = new DSPlatformPropertyTypeImpl();
		return dsPlatformPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSPlatformType createDSPlatformType() {
		DSPlatformTypeImpl dsPlatformType = new DSPlatformTypeImpl();
		return dsPlatformType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSProductionSeriesPropertyType createDSProductionSeriesPropertyType() {
		DSProductionSeriesPropertyTypeImpl dsProductionSeriesPropertyType = new DSProductionSeriesPropertyTypeImpl();
		return dsProductionSeriesPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSProductionSeriesType createDSProductionSeriesType() {
		DSProductionSeriesTypeImpl dsProductionSeriesType = new DSProductionSeriesTypeImpl();
		return dsProductionSeriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSSensorPropertyType createDSSensorPropertyType() {
		DSSensorPropertyTypeImpl dsSensorPropertyType = new DSSensorPropertyTypeImpl();
		return dsSensorPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSSensorType createDSSensorType() {
		DSSensorTypeImpl dsSensorType = new DSSensorTypeImpl();
		return dsSensorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSSeriesPropertyType createDSSeriesPropertyType() {
		DSSeriesPropertyTypeImpl dsSeriesPropertyType = new DSSeriesPropertyTypeImpl();
		return dsSeriesPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSSeriesType createDSSeriesType() {
		DSSeriesTypeImpl dsSeriesType = new DSSeriesTypeImpl();
		return dsSeriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSStereoMatePropertyType createDSStereoMatePropertyType() {
		DSStereoMatePropertyTypeImpl dsStereoMatePropertyType = new DSStereoMatePropertyTypeImpl();
		return dsStereoMatePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DSStereoMateType createDSStereoMateType() {
		DSStereoMateTypeImpl dsStereoMateType = new DSStereoMateTypeImpl();
		return dsStereoMateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXBoundingPolygonPropertyType createEXBoundingPolygonPropertyType() {
		EXBoundingPolygonPropertyTypeImpl exBoundingPolygonPropertyType = new EXBoundingPolygonPropertyTypeImpl();
		return exBoundingPolygonPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXBoundingPolygonType createEXBoundingPolygonType() {
		EXBoundingPolygonTypeImpl exBoundingPolygonType = new EXBoundingPolygonTypeImpl();
		return exBoundingPolygonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXGeographicBoundingBoxPropertyType createEXGeographicBoundingBoxPropertyType() {
		EXGeographicBoundingBoxPropertyTypeImpl exGeographicBoundingBoxPropertyType = new EXGeographicBoundingBoxPropertyTypeImpl();
		return exGeographicBoundingBoxPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXGeographicBoundingBoxType createEXGeographicBoundingBoxType() {
		EXGeographicBoundingBoxTypeImpl exGeographicBoundingBoxType = new EXGeographicBoundingBoxTypeImpl();
		return exGeographicBoundingBoxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXGeographicDescriptionPropertyType createEXGeographicDescriptionPropertyType() {
		EXGeographicDescriptionPropertyTypeImpl exGeographicDescriptionPropertyType = new EXGeographicDescriptionPropertyTypeImpl();
		return exGeographicDescriptionPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXGeographicDescriptionType createEXGeographicDescriptionType() {
		EXGeographicDescriptionTypeImpl exGeographicDescriptionType = new EXGeographicDescriptionTypeImpl();
		return exGeographicDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXSpatialTemporalExtentPropertyType createEXSpatialTemporalExtentPropertyType() {
		EXSpatialTemporalExtentPropertyTypeImpl exSpatialTemporalExtentPropertyType = new EXSpatialTemporalExtentPropertyTypeImpl();
		return exSpatialTemporalExtentPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXSpatialTemporalExtentType createEXSpatialTemporalExtentType() {
		EXSpatialTemporalExtentTypeImpl exSpatialTemporalExtentType = new EXSpatialTemporalExtentTypeImpl();
		return exSpatialTemporalExtentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageCodePropertyType createLanguageCodePropertyType() {
		LanguageCodePropertyTypeImpl languageCodePropertyType = new LanguageCodePropertyTypeImpl();
		return languageCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LILineagePropertyType createLILineagePropertyType() {
		LILineagePropertyTypeImpl liLineagePropertyType = new LILineagePropertyTypeImpl();
		return liLineagePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LILineageType createLILineageType() {
		LILineageTypeImpl liLineageType = new LILineageTypeImpl();
		return liLineageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LIProcessStepPropertyType createLIProcessStepPropertyType() {
		LIProcessStepPropertyTypeImpl liProcessStepPropertyType = new LIProcessStepPropertyTypeImpl();
		return liProcessStepPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LIProcessStepType createLIProcessStepType() {
		LIProcessStepTypeImpl liProcessStepType = new LIProcessStepTypeImpl();
		return liProcessStepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LISourcePropertyType createLISourcePropertyType() {
		LISourcePropertyTypeImpl liSourcePropertyType = new LISourcePropertyTypeImpl();
		return liSourcePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LISourceType createLISourceType() {
		LISourceTypeImpl liSourceType = new LISourceTypeImpl();
		return liSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalisedCharacterStringPropertyType createLocalisedCharacterStringPropertyType() {
		LocalisedCharacterStringPropertyTypeImpl localisedCharacterStringPropertyType = new LocalisedCharacterStringPropertyTypeImpl();
		return localisedCharacterStringPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalisedCharacterStringType createLocalisedCharacterStringType() {
		LocalisedCharacterStringTypeImpl localisedCharacterStringType = new LocalisedCharacterStringTypeImpl();
		return localisedCharacterStringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDAggregateInformationPropertyType createMDAggregateInformationPropertyType() {
		MDAggregateInformationPropertyTypeImpl mdAggregateInformationPropertyType = new MDAggregateInformationPropertyTypeImpl();
		return mdAggregateInformationPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDAggregateInformationType createMDAggregateInformationType() {
		MDAggregateInformationTypeImpl mdAggregateInformationType = new MDAggregateInformationTypeImpl();
		return mdAggregateInformationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDApplicationSchemaInformationPropertyType createMDApplicationSchemaInformationPropertyType() {
		MDApplicationSchemaInformationPropertyTypeImpl mdApplicationSchemaInformationPropertyType = new MDApplicationSchemaInformationPropertyTypeImpl();
		return mdApplicationSchemaInformationPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDApplicationSchemaInformationType createMDApplicationSchemaInformationType() {
		MDApplicationSchemaInformationTypeImpl mdApplicationSchemaInformationType = new MDApplicationSchemaInformationTypeImpl();
		return mdApplicationSchemaInformationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDBandPropertyType createMDBandPropertyType() {
		MDBandPropertyTypeImpl mdBandPropertyType = new MDBandPropertyTypeImpl();
		return mdBandPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDBandType createMDBandType() {
		MDBandTypeImpl mdBandType = new MDBandTypeImpl();
		return mdBandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDBrowseGraphicPropertyType createMDBrowseGraphicPropertyType() {
		MDBrowseGraphicPropertyTypeImpl mdBrowseGraphicPropertyType = new MDBrowseGraphicPropertyTypeImpl();
		return mdBrowseGraphicPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDBrowseGraphicType createMDBrowseGraphicType() {
		MDBrowseGraphicTypeImpl mdBrowseGraphicType = new MDBrowseGraphicTypeImpl();
		return mdBrowseGraphicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDCellGeometryCodePropertyType createMDCellGeometryCodePropertyType() {
		MDCellGeometryCodePropertyTypeImpl mdCellGeometryCodePropertyType = new MDCellGeometryCodePropertyTypeImpl();
		return mdCellGeometryCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDCharacterSetCodePropertyType createMDCharacterSetCodePropertyType() {
		MDCharacterSetCodePropertyTypeImpl mdCharacterSetCodePropertyType = new MDCharacterSetCodePropertyTypeImpl();
		return mdCharacterSetCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDClassificationCodePropertyType createMDClassificationCodePropertyType() {
		MDClassificationCodePropertyTypeImpl mdClassificationCodePropertyType = new MDClassificationCodePropertyTypeImpl();
		return mdClassificationCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDConstraintsPropertyType createMDConstraintsPropertyType() {
		MDConstraintsPropertyTypeImpl mdConstraintsPropertyType = new MDConstraintsPropertyTypeImpl();
		return mdConstraintsPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDConstraintsType createMDConstraintsType() {
		MDConstraintsTypeImpl mdConstraintsType = new MDConstraintsTypeImpl();
		return mdConstraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDContentInformationPropertyType createMDContentInformationPropertyType() {
		MDContentInformationPropertyTypeImpl mdContentInformationPropertyType = new MDContentInformationPropertyTypeImpl();
		return mdContentInformationPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDCoverageContentTypeCodePropertyType createMDCoverageContentTypeCodePropertyType() {
		MDCoverageContentTypeCodePropertyTypeImpl mdCoverageContentTypeCodePropertyType = new MDCoverageContentTypeCodePropertyTypeImpl();
		return mdCoverageContentTypeCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDCoverageDescriptionPropertyType createMDCoverageDescriptionPropertyType() {
		MDCoverageDescriptionPropertyTypeImpl mdCoverageDescriptionPropertyType = new MDCoverageDescriptionPropertyTypeImpl();
		return mdCoverageDescriptionPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDCoverageDescriptionType createMDCoverageDescriptionType() {
		MDCoverageDescriptionTypeImpl mdCoverageDescriptionType = new MDCoverageDescriptionTypeImpl();
		return mdCoverageDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDDataIdentificationPropertyType createMDDataIdentificationPropertyType() {
		MDDataIdentificationPropertyTypeImpl mdDataIdentificationPropertyType = new MDDataIdentificationPropertyTypeImpl();
		return mdDataIdentificationPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDDataIdentificationType createMDDataIdentificationType() {
		MDDataIdentificationTypeImpl mdDataIdentificationType = new MDDataIdentificationTypeImpl();
		return mdDataIdentificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDDatatypeCodePropertyType createMDDatatypeCodePropertyType() {
		MDDatatypeCodePropertyTypeImpl mdDatatypeCodePropertyType = new MDDatatypeCodePropertyTypeImpl();
		return mdDatatypeCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDDigitalTransferOptionsPropertyType createMDDigitalTransferOptionsPropertyType() {
		MDDigitalTransferOptionsPropertyTypeImpl mdDigitalTransferOptionsPropertyType = new MDDigitalTransferOptionsPropertyTypeImpl();
		return mdDigitalTransferOptionsPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDDigitalTransferOptionsType createMDDigitalTransferOptionsType() {
		MDDigitalTransferOptionsTypeImpl mdDigitalTransferOptionsType = new MDDigitalTransferOptionsTypeImpl();
		return mdDigitalTransferOptionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDDimensionNameTypeCodePropertyType createMDDimensionNameTypeCodePropertyType() {
		MDDimensionNameTypeCodePropertyTypeImpl mdDimensionNameTypeCodePropertyType = new MDDimensionNameTypeCodePropertyTypeImpl();
		return mdDimensionNameTypeCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDDimensionPropertyType createMDDimensionPropertyType() {
		MDDimensionPropertyTypeImpl mdDimensionPropertyType = new MDDimensionPropertyTypeImpl();
		return mdDimensionPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDDimensionType createMDDimensionType() {
		MDDimensionTypeImpl mdDimensionType = new MDDimensionTypeImpl();
		return mdDimensionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDDistributionPropertyType createMDDistributionPropertyType() {
		MDDistributionPropertyTypeImpl mdDistributionPropertyType = new MDDistributionPropertyTypeImpl();
		return mdDistributionPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDDistributionType createMDDistributionType() {
		MDDistributionTypeImpl mdDistributionType = new MDDistributionTypeImpl();
		return mdDistributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDDistributionUnitsPropertyType createMDDistributionUnitsPropertyType() {
		MDDistributionUnitsPropertyTypeImpl mdDistributionUnitsPropertyType = new MDDistributionUnitsPropertyTypeImpl();
		return mdDistributionUnitsPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDDistributorPropertyType createMDDistributorPropertyType() {
		MDDistributorPropertyTypeImpl mdDistributorPropertyType = new MDDistributorPropertyTypeImpl();
		return mdDistributorPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDDistributorType createMDDistributorType() {
		MDDistributorTypeImpl mdDistributorType = new MDDistributorTypeImpl();
		return mdDistributorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDExtendedElementInformationPropertyType createMDExtendedElementInformationPropertyType() {
		MDExtendedElementInformationPropertyTypeImpl mdExtendedElementInformationPropertyType = new MDExtendedElementInformationPropertyTypeImpl();
		return mdExtendedElementInformationPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDExtendedElementInformationType createMDExtendedElementInformationType() {
		MDExtendedElementInformationTypeImpl mdExtendedElementInformationType = new MDExtendedElementInformationTypeImpl();
		return mdExtendedElementInformationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDFeatureCatalogueDescriptionPropertyType createMDFeatureCatalogueDescriptionPropertyType() {
		MDFeatureCatalogueDescriptionPropertyTypeImpl mdFeatureCatalogueDescriptionPropertyType = new MDFeatureCatalogueDescriptionPropertyTypeImpl();
		return mdFeatureCatalogueDescriptionPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDFeatureCatalogueDescriptionType createMDFeatureCatalogueDescriptionType() {
		MDFeatureCatalogueDescriptionTypeImpl mdFeatureCatalogueDescriptionType = new MDFeatureCatalogueDescriptionTypeImpl();
		return mdFeatureCatalogueDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDFormatPropertyType createMDFormatPropertyType() {
		MDFormatPropertyTypeImpl mdFormatPropertyType = new MDFormatPropertyTypeImpl();
		return mdFormatPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDFormatType createMDFormatType() {
		MDFormatTypeImpl mdFormatType = new MDFormatTypeImpl();
		return mdFormatType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDGeometricObjectsPropertyType createMDGeometricObjectsPropertyType() {
		MDGeometricObjectsPropertyTypeImpl mdGeometricObjectsPropertyType = new MDGeometricObjectsPropertyTypeImpl();
		return mdGeometricObjectsPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDGeometricObjectsType createMDGeometricObjectsType() {
		MDGeometricObjectsTypeImpl mdGeometricObjectsType = new MDGeometricObjectsTypeImpl();
		return mdGeometricObjectsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDGeometricObjectTypeCodePropertyType createMDGeometricObjectTypeCodePropertyType() {
		MDGeometricObjectTypeCodePropertyTypeImpl mdGeometricObjectTypeCodePropertyType = new MDGeometricObjectTypeCodePropertyTypeImpl();
		return mdGeometricObjectTypeCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDGeorectifiedPropertyType createMDGeorectifiedPropertyType() {
		MDGeorectifiedPropertyTypeImpl mdGeorectifiedPropertyType = new MDGeorectifiedPropertyTypeImpl();
		return mdGeorectifiedPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDGeorectifiedType createMDGeorectifiedType() {
		MDGeorectifiedTypeImpl mdGeorectifiedType = new MDGeorectifiedTypeImpl();
		return mdGeorectifiedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDGeoreferenceablePropertyType createMDGeoreferenceablePropertyType() {
		MDGeoreferenceablePropertyTypeImpl mdGeoreferenceablePropertyType = new MDGeoreferenceablePropertyTypeImpl();
		return mdGeoreferenceablePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDGeoreferenceableType createMDGeoreferenceableType() {
		MDGeoreferenceableTypeImpl mdGeoreferenceableType = new MDGeoreferenceableTypeImpl();
		return mdGeoreferenceableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDGridSpatialRepresentationPropertyType createMDGridSpatialRepresentationPropertyType() {
		MDGridSpatialRepresentationPropertyTypeImpl mdGridSpatialRepresentationPropertyType = new MDGridSpatialRepresentationPropertyTypeImpl();
		return mdGridSpatialRepresentationPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDGridSpatialRepresentationType createMDGridSpatialRepresentationType() {
		MDGridSpatialRepresentationTypeImpl mdGridSpatialRepresentationType = new MDGridSpatialRepresentationTypeImpl();
		return mdGridSpatialRepresentationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDIdentificationPropertyType createMDIdentificationPropertyType() {
		MDIdentificationPropertyTypeImpl mdIdentificationPropertyType = new MDIdentificationPropertyTypeImpl();
		return mdIdentificationPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDIdentifierPropertyType createMDIdentifierPropertyType() {
		MDIdentifierPropertyTypeImpl mdIdentifierPropertyType = new MDIdentifierPropertyTypeImpl();
		return mdIdentifierPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDIdentifierType createMDIdentifierType() {
		MDIdentifierTypeImpl mdIdentifierType = new MDIdentifierTypeImpl();
		return mdIdentifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDImageDescriptionPropertyType createMDImageDescriptionPropertyType() {
		MDImageDescriptionPropertyTypeImpl mdImageDescriptionPropertyType = new MDImageDescriptionPropertyTypeImpl();
		return mdImageDescriptionPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDImageDescriptionType createMDImageDescriptionType() {
		MDImageDescriptionTypeImpl mdImageDescriptionType = new MDImageDescriptionTypeImpl();
		return mdImageDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDImagingConditionCodePropertyType createMDImagingConditionCodePropertyType() {
		MDImagingConditionCodePropertyTypeImpl mdImagingConditionCodePropertyType = new MDImagingConditionCodePropertyTypeImpl();
		return mdImagingConditionCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDKeywordsPropertyType createMDKeywordsPropertyType() {
		MDKeywordsPropertyTypeImpl mdKeywordsPropertyType = new MDKeywordsPropertyTypeImpl();
		return mdKeywordsPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDKeywordsType createMDKeywordsType() {
		MDKeywordsTypeImpl mdKeywordsType = new MDKeywordsTypeImpl();
		return mdKeywordsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDKeywordTypeCodePropertyType createMDKeywordTypeCodePropertyType() {
		MDKeywordTypeCodePropertyTypeImpl mdKeywordTypeCodePropertyType = new MDKeywordTypeCodePropertyTypeImpl();
		return mdKeywordTypeCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDLegalConstraintsPropertyType createMDLegalConstraintsPropertyType() {
		MDLegalConstraintsPropertyTypeImpl mdLegalConstraintsPropertyType = new MDLegalConstraintsPropertyTypeImpl();
		return mdLegalConstraintsPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDLegalConstraintsType createMDLegalConstraintsType() {
		MDLegalConstraintsTypeImpl mdLegalConstraintsType = new MDLegalConstraintsTypeImpl();
		return mdLegalConstraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDMaintenanceFrequencyCodePropertyType createMDMaintenanceFrequencyCodePropertyType() {
		MDMaintenanceFrequencyCodePropertyTypeImpl mdMaintenanceFrequencyCodePropertyType = new MDMaintenanceFrequencyCodePropertyTypeImpl();
		return mdMaintenanceFrequencyCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDMaintenanceInformationPropertyType createMDMaintenanceInformationPropertyType() {
		MDMaintenanceInformationPropertyTypeImpl mdMaintenanceInformationPropertyType = new MDMaintenanceInformationPropertyTypeImpl();
		return mdMaintenanceInformationPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDMaintenanceInformationType createMDMaintenanceInformationType() {
		MDMaintenanceInformationTypeImpl mdMaintenanceInformationType = new MDMaintenanceInformationTypeImpl();
		return mdMaintenanceInformationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDMediumFormatCodePropertyType createMDMediumFormatCodePropertyType() {
		MDMediumFormatCodePropertyTypeImpl mdMediumFormatCodePropertyType = new MDMediumFormatCodePropertyTypeImpl();
		return mdMediumFormatCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDMediumNameCodePropertyType createMDMediumNameCodePropertyType() {
		MDMediumNameCodePropertyTypeImpl mdMediumNameCodePropertyType = new MDMediumNameCodePropertyTypeImpl();
		return mdMediumNameCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDMediumPropertyType createMDMediumPropertyType() {
		MDMediumPropertyTypeImpl mdMediumPropertyType = new MDMediumPropertyTypeImpl();
		return mdMediumPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDMediumType createMDMediumType() {
		MDMediumTypeImpl mdMediumType = new MDMediumTypeImpl();
		return mdMediumType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDMetadataExtensionInformationPropertyType createMDMetadataExtensionInformationPropertyType() {
		MDMetadataExtensionInformationPropertyTypeImpl mdMetadataExtensionInformationPropertyType = new MDMetadataExtensionInformationPropertyTypeImpl();
		return mdMetadataExtensionInformationPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDMetadataExtensionInformationType createMDMetadataExtensionInformationType() {
		MDMetadataExtensionInformationTypeImpl mdMetadataExtensionInformationType = new MDMetadataExtensionInformationTypeImpl();
		return mdMetadataExtensionInformationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDMetadataPropertyType createMDMetadataPropertyType() {
		MDMetadataPropertyTypeImpl mdMetadataPropertyType = new MDMetadataPropertyTypeImpl();
		return mdMetadataPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDMetadataType createMDMetadataType() {
		MDMetadataTypeImpl mdMetadataType = new MDMetadataTypeImpl();
		return mdMetadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDObligationCodePropertyType createMDObligationCodePropertyType() {
		MDObligationCodePropertyTypeImpl mdObligationCodePropertyType = new MDObligationCodePropertyTypeImpl();
		return mdObligationCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDPixelOrientationCodePropertyType createMDPixelOrientationCodePropertyType() {
		MDPixelOrientationCodePropertyTypeImpl mdPixelOrientationCodePropertyType = new MDPixelOrientationCodePropertyTypeImpl();
		return mdPixelOrientationCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDPortrayalCatalogueReferencePropertyType createMDPortrayalCatalogueReferencePropertyType() {
		MDPortrayalCatalogueReferencePropertyTypeImpl mdPortrayalCatalogueReferencePropertyType = new MDPortrayalCatalogueReferencePropertyTypeImpl();
		return mdPortrayalCatalogueReferencePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDPortrayalCatalogueReferenceType createMDPortrayalCatalogueReferenceType() {
		MDPortrayalCatalogueReferenceTypeImpl mdPortrayalCatalogueReferenceType = new MDPortrayalCatalogueReferenceTypeImpl();
		return mdPortrayalCatalogueReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDProgressCodePropertyType createMDProgressCodePropertyType() {
		MDProgressCodePropertyTypeImpl mdProgressCodePropertyType = new MDProgressCodePropertyTypeImpl();
		return mdProgressCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDRangeDimensionPropertyType createMDRangeDimensionPropertyType() {
		MDRangeDimensionPropertyTypeImpl mdRangeDimensionPropertyType = new MDRangeDimensionPropertyTypeImpl();
		return mdRangeDimensionPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDRangeDimensionType createMDRangeDimensionType() {
		MDRangeDimensionTypeImpl mdRangeDimensionType = new MDRangeDimensionTypeImpl();
		return mdRangeDimensionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDReferenceSystemPropertyType createMDReferenceSystemPropertyType() {
		MDReferenceSystemPropertyTypeImpl mdReferenceSystemPropertyType = new MDReferenceSystemPropertyTypeImpl();
		return mdReferenceSystemPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDReferenceSystemType createMDReferenceSystemType() {
		MDReferenceSystemTypeImpl mdReferenceSystemType = new MDReferenceSystemTypeImpl();
		return mdReferenceSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDRepresentativeFractionPropertyType createMDRepresentativeFractionPropertyType() {
		MDRepresentativeFractionPropertyTypeImpl mdRepresentativeFractionPropertyType = new MDRepresentativeFractionPropertyTypeImpl();
		return mdRepresentativeFractionPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDRepresentativeFractionType createMDRepresentativeFractionType() {
		MDRepresentativeFractionTypeImpl mdRepresentativeFractionType = new MDRepresentativeFractionTypeImpl();
		return mdRepresentativeFractionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDResolutionPropertyType createMDResolutionPropertyType() {
		MDResolutionPropertyTypeImpl mdResolutionPropertyType = new MDResolutionPropertyTypeImpl();
		return mdResolutionPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDResolutionType createMDResolutionType() {
		MDResolutionTypeImpl mdResolutionType = new MDResolutionTypeImpl();
		return mdResolutionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDRestrictionCodePropertyType createMDRestrictionCodePropertyType() {
		MDRestrictionCodePropertyTypeImpl mdRestrictionCodePropertyType = new MDRestrictionCodePropertyTypeImpl();
		return mdRestrictionCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDScopeCodePropertyType createMDScopeCodePropertyType() {
		MDScopeCodePropertyTypeImpl mdScopeCodePropertyType = new MDScopeCodePropertyTypeImpl();
		return mdScopeCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDScopeDescriptionPropertyType createMDScopeDescriptionPropertyType() {
		MDScopeDescriptionPropertyTypeImpl mdScopeDescriptionPropertyType = new MDScopeDescriptionPropertyTypeImpl();
		return mdScopeDescriptionPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDScopeDescriptionType createMDScopeDescriptionType() {
		MDScopeDescriptionTypeImpl mdScopeDescriptionType = new MDScopeDescriptionTypeImpl();
		return mdScopeDescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDSecurityConstraintsPropertyType createMDSecurityConstraintsPropertyType() {
		MDSecurityConstraintsPropertyTypeImpl mdSecurityConstraintsPropertyType = new MDSecurityConstraintsPropertyTypeImpl();
		return mdSecurityConstraintsPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDSecurityConstraintsType createMDSecurityConstraintsType() {
		MDSecurityConstraintsTypeImpl mdSecurityConstraintsType = new MDSecurityConstraintsTypeImpl();
		return mdSecurityConstraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDServiceIdentificationPropertyType createMDServiceIdentificationPropertyType() {
		MDServiceIdentificationPropertyTypeImpl mdServiceIdentificationPropertyType = new MDServiceIdentificationPropertyTypeImpl();
		return mdServiceIdentificationPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDServiceIdentificationType createMDServiceIdentificationType() {
		MDServiceIdentificationTypeImpl mdServiceIdentificationType = new MDServiceIdentificationTypeImpl();
		return mdServiceIdentificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDSpatialRepresentationPropertyType createMDSpatialRepresentationPropertyType() {
		MDSpatialRepresentationPropertyTypeImpl mdSpatialRepresentationPropertyType = new MDSpatialRepresentationPropertyTypeImpl();
		return mdSpatialRepresentationPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDSpatialRepresentationTypeCodePropertyType createMDSpatialRepresentationTypeCodePropertyType() {
		MDSpatialRepresentationTypeCodePropertyTypeImpl mdSpatialRepresentationTypeCodePropertyType = new MDSpatialRepresentationTypeCodePropertyTypeImpl();
		return mdSpatialRepresentationTypeCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDStandardOrderProcessPropertyType createMDStandardOrderProcessPropertyType() {
		MDStandardOrderProcessPropertyTypeImpl mdStandardOrderProcessPropertyType = new MDStandardOrderProcessPropertyTypeImpl();
		return mdStandardOrderProcessPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDStandardOrderProcessType createMDStandardOrderProcessType() {
		MDStandardOrderProcessTypeImpl mdStandardOrderProcessType = new MDStandardOrderProcessTypeImpl();
		return mdStandardOrderProcessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDTopicCategoryCodePropertyType createMDTopicCategoryCodePropertyType() {
		MDTopicCategoryCodePropertyTypeImpl mdTopicCategoryCodePropertyType = new MDTopicCategoryCodePropertyTypeImpl();
		return mdTopicCategoryCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDTopologyLevelCodePropertyType createMDTopologyLevelCodePropertyType() {
		MDTopologyLevelCodePropertyTypeImpl mdTopologyLevelCodePropertyType = new MDTopologyLevelCodePropertyTypeImpl();
		return mdTopologyLevelCodePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDUsagePropertyType createMDUsagePropertyType() {
		MDUsagePropertyTypeImpl mdUsagePropertyType = new MDUsagePropertyTypeImpl();
		return mdUsagePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDUsageType createMDUsageType() {
		MDUsageTypeImpl mdUsageType = new MDUsageTypeImpl();
		return mdUsageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDVectorSpatialRepresentationPropertyType createMDVectorSpatialRepresentationPropertyType() {
		MDVectorSpatialRepresentationPropertyTypeImpl mdVectorSpatialRepresentationPropertyType = new MDVectorSpatialRepresentationPropertyTypeImpl();
		return mdVectorSpatialRepresentationPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDVectorSpatialRepresentationType createMDVectorSpatialRepresentationType() {
		MDVectorSpatialRepresentationTypeImpl mdVectorSpatialRepresentationType = new MDVectorSpatialRepresentationTypeImpl();
		return mdVectorSpatialRepresentationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PTFreeTextPropertyType createPTFreeTextPropertyType() {
		PTFreeTextPropertyTypeImpl ptFreeTextPropertyType = new PTFreeTextPropertyTypeImpl();
		return ptFreeTextPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PTFreeTextType createPTFreeTextType() {
		PTFreeTextTypeImpl ptFreeTextType = new PTFreeTextTypeImpl();
		return ptFreeTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PTLocaleContainerPropertyType createPTLocaleContainerPropertyType() {
		PTLocaleContainerPropertyTypeImpl ptLocaleContainerPropertyType = new PTLocaleContainerPropertyTypeImpl();
		return ptLocaleContainerPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PTLocaleContainerType createPTLocaleContainerType() {
		PTLocaleContainerTypeImpl ptLocaleContainerType = new PTLocaleContainerTypeImpl();
		return ptLocaleContainerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PTLocalePropertyType createPTLocalePropertyType() {
		PTLocalePropertyTypeImpl ptLocalePropertyType = new PTLocalePropertyTypeImpl();
		return ptLocalePropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PTLocaleType createPTLocaleType() {
		PTLocaleTypeImpl ptLocaleType = new PTLocaleTypeImpl();
		return ptLocaleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RSIdentifierPropertyType createRSIdentifierPropertyType() {
		RSIdentifierPropertyTypeImpl rsIdentifierPropertyType = new RSIdentifierPropertyTypeImpl();
		return rsIdentifierPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RSIdentifierType createRSIdentifierType() {
		RSIdentifierTypeImpl rsIdentifierType = new RSIdentifierTypeImpl();
		return rsIdentifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RSReferenceSystemPropertyType createRSReferenceSystemPropertyType() {
		RSReferenceSystemPropertyTypeImpl rsReferenceSystemPropertyType = new RSReferenceSystemPropertyTypeImpl();
		return rsReferenceSystemPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public URLPropertyType createURLPropertyType() {
		URLPropertyTypeImpl urlPropertyType = new URLPropertyTypeImpl();
		return urlPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDObligationCodeType createMDObligationCodeTypeFromString(EDataType eDataType, String initialValue) {
		MDObligationCodeType result = MDObligationCodeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMDObligationCodeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDPixelOrientationCodeType createMDPixelOrientationCodeTypeFromString(EDataType eDataType, String initialValue) {
		MDPixelOrientationCodeType result = MDPixelOrientationCodeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMDPixelOrientationCodeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDTopicCategoryCodeType createMDTopicCategoryCodeTypeFromString(EDataType eDataType, String initialValue) {
		MDTopicCategoryCodeType result = MDTopicCategoryCodeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMDTopicCategoryCodeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDObligationCodeType createMDObligationCodeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMDObligationCodeTypeFromString(GMDPackage.eINSTANCE.getMDObligationCodeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMDObligationCodeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMDObligationCodeTypeToString(GMDPackage.eINSTANCE.getMDObligationCodeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDPixelOrientationCodeType createMDPixelOrientationCodeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMDPixelOrientationCodeTypeFromString(GMDPackage.eINSTANCE.getMDPixelOrientationCodeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMDPixelOrientationCodeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMDPixelOrientationCodeTypeToString(GMDPackage.eINSTANCE.getMDPixelOrientationCodeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MDTopicCategoryCodeType createMDTopicCategoryCodeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMDTopicCategoryCodeTypeFromString(GMDPackage.eINSTANCE.getMDTopicCategoryCodeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMDTopicCategoryCodeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMDTopicCategoryCodeTypeToString(GMDPackage.eINSTANCE.getMDTopicCategoryCodeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GMDPackage getGMDPackage() {
		return (GMDPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GMDPackage getPackage() {
		return GMDPackage.eINSTANCE;
	}

} //GMDFactoryImpl
