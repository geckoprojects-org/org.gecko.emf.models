/**
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.cyclonedx.schema.bom.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.cyclonedx.schema.bom.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BOMFactoryImpl extends EFactoryImpl implements BOMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BOMFactory init() {
		try {
			BOMFactory theBOMFactory = (BOMFactory)EPackage.Registry.INSTANCE.getEFactory(BOMPackage.eNS_URI);
			if (theBOMFactory != null) {
				return theBOMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BOMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOMFactoryImpl() {
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
			case BOMPackage.ADVISORIES_TYPE: return createAdvisoriesType();
			case BOMPackage.ADVISORY_TYPE: return createAdvisoryType();
			case BOMPackage.AFFECTS_TYPE: return createAffectsType();
			case BOMPackage.AFFIRMATION_TYPE: return createAffirmationType();
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE: return createAlgorithmPropertiesType();
			case BOMPackage.ALGORITHMS_TYPE: return createAlgorithmsType();
			case BOMPackage.ALIASES_TYPE: return createAliasesType();
			case BOMPackage.ALIASES_TYPE1: return createAliasesType1();
			case BOMPackage.ALT_IDS_TYPE: return createAltIdsType();
			case BOMPackage.ANALYSIS_TYPE: return createAnalysisType();
			case BOMPackage.ANNOTATIONS_TYPE: return createAnnotationsType();
			case BOMPackage.ANNOTATION_TYPE: return createAnnotationType();
			case BOMPackage.ANNOTATOR_CHOICE_TYPE: return createAnnotatorChoiceType();
			case BOMPackage.APPROACH_TYPE: return createApproachType();
			case BOMPackage.ASSEMBLIES_TYPE: return createAssembliesType();
			case BOMPackage.ASSESSORS_TYPE: return createAssessorsType();
			case BOMPackage.ASSESSOR_TYPE: return createAssessorType();
			case BOMPackage.ATTACHED_TEXT_TYPE: return createAttachedTextType();
			case BOMPackage.ATTESTATIONS_TYPE: return createAttestationsType();
			case BOMPackage.ATTESTATION_TYPE: return createAttestationType();
			case BOMPackage.AUTHORS_TYPE: return createAuthorsType();
			case BOMPackage.AUTHORS_TYPE1: return createAuthorsType1();
			case BOMPackage.BOM_REFERENCE_TYPE: return createBomReferenceType();
			case BOMPackage.BOM_TYPE: return createBomType();
			case BOMPackage.CALLSTACK_TYPE: return createCallstackType();
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE: return createCertificatePropertiesType();
			case BOMPackage.CIPHER_SUITES_TYPE: return createCipherSuitesType();
			case BOMPackage.CIPHER_SUITE_TYPE: return createCipherSuiteType();
			case BOMPackage.CLAIMS_TYPE: return createClaimsType();
			case BOMPackage.CLAIMS_TYPE1: return createClaimsType1();
			case BOMPackage.CLAIM_TYPE: return createClaimType();
			case BOMPackage.CO2_MEASURE_TYPE: return createCo2MeasureType();
			case BOMPackage.COLLECTION_TYPE: return createCollectionType();
			case BOMPackage.COLLECTION_TYPE1: return createCollectionType1();
			case BOMPackage.COMMANDS_TYPE: return createCommandsType();
			case BOMPackage.COMMAND_TYPE: return createCommandType();
			case BOMPackage.COMMITS_TYPE: return createCommitsType();
			case BOMPackage.COMMIT_TYPE: return createCommitType();
			case BOMPackage.COMPONENT: return createComponent();
			case BOMPackage.COMPONENT_DATA_TYPE: return createComponentDataType();
			case BOMPackage.COMPONENT_EVIDENCE_TYPE: return createComponentEvidenceType();
			case BOMPackage.COMPONENTS_TYPE: return createComponentsType();
			case BOMPackage.COMPONENTS_TYPE1: return createComponentsType1();
			case BOMPackage.COMPONENTS_TYPE2: return createComponentsType2();
			case BOMPackage.COMPOSITIONS_TYPE: return createCompositionsType();
			case BOMPackage.COMPOSITION_TYPE: return createCompositionType();
			case BOMPackage.CONDITIONS_TYPE: return createConditionsType();
			case BOMPackage.CONDITION_TYPE: return createConditionType();
			case BOMPackage.CONFIDENCE_INTERVAL_TYPE: return createConfidenceIntervalType();
			case BOMPackage.CONFIDENCE_TYPE: return createConfidenceType();
			case BOMPackage.CONFORMANCE_TYPE: return createConformanceType();
			case BOMPackage.CONSIDERATIONS_TYPE: return createConsiderationsType();
			case BOMPackage.CONTENTS_TYPE: return createContentsType();
			case BOMPackage.CONTENTS_TYPE1: return createContentsType1();
			case BOMPackage.COPYRIGHTS_TYPE: return createCopyrightsType();
			case BOMPackage.COUNTER_CLAIMS_TYPE: return createCounterClaimsType();
			case BOMPackage.CREDITS_TYPE: return createCreditsType();
			case BOMPackage.CRYPTO_FUNCTIONS_TYPE: return createCryptoFunctionsType();
			case BOMPackage.CRYPTO_PROPERTIES_TYPE: return createCryptoPropertiesType();
			case BOMPackage.CUSTODIANS_TYPE: return createCustodiansType();
			case BOMPackage.CWES_TYPE: return createCwesType();
			case BOMPackage.DATA_CLASSIFICATION_TYPE: return createDataClassificationType();
			case BOMPackage.DATAFLOW_TYPE: return createDataflowType();
			case BOMPackage.DATA_GOVERNANCE: return createDataGovernance();
			case BOMPackage.DATASETS_TYPE: return createDatasetsType();
			case BOMPackage.DATA_TYPE: return createDataType();
			case BOMPackage.DATA_TYPE1: return createDataType1();
			case BOMPackage.DECLARATIONS_TYPE: return createDeclarationsType();
			case BOMPackage.DEFINITIONS_TYPE: return createDefinitionsType();
			case BOMPackage.DEPENDENCIES_TYPE: return createDependenciesType();
			case BOMPackage.DEPENDENCIES_TYPE1: return createDependenciesType1();
			case BOMPackage.DEPENDENCY_TYPE: return createDependencyType();
			case BOMPackage.DESCRIPTIONS_TYPE: return createDescriptionsType();
			case BOMPackage.DESTINATION_TYPE: return createDestinationType();
			case BOMPackage.DIFF_TYPE: return createDiffType();
			case BOMPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case BOMPackage.ENDPOINTS_TYPE: return createEndpointsType();
			case BOMPackage.ENERGY_CONSUMPTIONS_TYPE: return createEnergyConsumptionsType();
			case BOMPackage.ENERGY_CONSUMPTION_TYPE: return createEnergyConsumptionType();
			case BOMPackage.ENERGY_MEASURE_TYPE: return createEnergyMeasureType();
			case BOMPackage.ENERGY_PROVIDER_TYPE: return createEnergyProviderType();
			case BOMPackage.ENVIRONMENTAL_CONSIDERATIONS_TYPE: return createEnvironmentalConsiderationsType();
			case BOMPackage.ENVIRONMENT_VARS_TYPE: return createEnvironmentVarsType();
			case BOMPackage.ENVIRONMENT_VARS_TYPE1: return createEnvironmentVarsType1();
			case BOMPackage.ETHICAL_CONSIDERATIONS_TYPE: return createEthicalConsiderationsType();
			case BOMPackage.ETHICAL_CONSIDERATION_TYPE: return createEthicalConsiderationType();
			case BOMPackage.EVENT_TYPE: return createEventType();
			case BOMPackage.EVIDENCE_TYPE: return createEvidenceType();
			case BOMPackage.EVIDENCE_TYPE1: return createEvidenceType1();
			case BOMPackage.EXPRESSION_TYPE: return createExpressionType();
			case BOMPackage.EXTERNAL_REFERENCE: return createExternalReference();
			case BOMPackage.EXTERNAL_REFERENCES: return createExternalReferences();
			case BOMPackage.FAIRNESS_ASSESSMENTS_TYPE: return createFairnessAssessmentsType();
			case BOMPackage.FAIRNESS_ASSESSMENT_TYPE: return createFairnessAssessmentType();
			case BOMPackage.FORMULATION_TYPE: return createFormulationType();
			case BOMPackage.FORMULA_TYPE: return createFormulaType();
			case BOMPackage.FRAMES_TYPE: return createFramesType();
			case BOMPackage.FRAME_TYPE: return createFrameType();
			case BOMPackage.GRAPHICS_COLLECTION_TYPE: return createGraphicsCollectionType();
			case BOMPackage.GRAPHICS_TYPE: return createGraphicsType();
			case BOMPackage.GRAPHIC_TYPE: return createGraphicType();
			case BOMPackage.GRAPHIC_TYPE1: return createGraphicType1();
			case BOMPackage.HASHES_TYPE: return createHashesType();
			case BOMPackage.HASHES_TYPE1: return createHashesType1();
			case BOMPackage.HASHES_TYPE2: return createHashesType2();
			case BOMPackage.HASH_TYPE: return createHashType();
			case BOMPackage.IDENTIFIABLE_ACTION_TYPE: return createIdentifiableActionType();
			case BOMPackage.IDENTIFIERS_TYPE: return createIdentifiersType();
			case BOMPackage.IDENTITY_TYPE: return createIdentityType();
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE: return createIkev2TransformTypesType();
			case BOMPackage.INDIVIDUALS_TYPE: return createIndividualsType();
			case BOMPackage.INPUTS_TYPE: return createInputsType();
			case BOMPackage.INPUTS_TYPE1: return createInputsType1();
			case BOMPackage.INPUTS_TYPE2: return createInputsType2();
			case BOMPackage.INPUTS_TYPE3: return createInputsType3();
			case BOMPackage.INPUT_TYPE: return createInputType();
			case BOMPackage.INPUT_TYPE1: return createInputType1();
			case BOMPackage.ISSUE_TYPE: return createIssueType();
			case BOMPackage.LEVELS_TYPE: return createLevelsType();
			case BOMPackage.LEVEL_TYPE: return createLevelType();
			case BOMPackage.LICENSE_CHOICE_TYPE: return createLicenseChoiceType();
			case BOMPackage.LICENSEE_TYPE: return createLicenseeType();
			case BOMPackage.LICENSE_TYPE: return createLicenseType();
			case BOMPackage.LICENSE_TYPES_TYPE: return createLicenseTypesType();
			case BOMPackage.LICENSING_TYPE: return createLicensingType();
			case BOMPackage.LICENSOR_TYPE: return createLicensorType();
			case BOMPackage.LIFECYCLES_TYPE: return createLifecyclesType();
			case BOMPackage.LIFECYCLE_TYPE: return createLifecycleType();
			case BOMPackage.MAP_TYPE: return createMapType();
			case BOMPackage.METADATA: return createMetadata();
			case BOMPackage.METHODS_TYPE: return createMethodsType();
			case BOMPackage.METHOD_TYPE: return createMethodType();
			case BOMPackage.MITIGATION_STRATEGIES_TYPE: return createMitigationStrategiesType();
			case BOMPackage.MITIGATION_STRATEGIES_TYPE1: return createMitigationStrategiesType1();
			case BOMPackage.MODEL_CARD_TYPE: return createModelCardType();
			case BOMPackage.MODEL_PARAMETERS_TYPE: return createModelParametersType();
			case BOMPackage.NOTES_TYPE: return createNotesType();
			case BOMPackage.NOTE_TYPE: return createNoteType();
			case BOMPackage.OCCURRENCES_TYPE: return createOccurrencesType();
			case BOMPackage.OCCURRENCE_TYPE: return createOccurrenceType();
			case BOMPackage.ORGANIZATIONAL_CONTACT: return createOrganizationalContact();
			case BOMPackage.ORGANIZATIONAL_ENTITY: return createOrganizationalEntity();
			case BOMPackage.ORGANIZATION_OR_INDIVIDUAL_TYPE: return createOrganizationOrIndividualType();
			case BOMPackage.ORGANIZATIONS_TYPE: return createOrganizationsType();
			case BOMPackage.ORGANIZATIONS_TYPE1: return createOrganizationsType1();
			case BOMPackage.OUTPUTS_TYPE: return createOutputsType();
			case BOMPackage.OUTPUTS_TYPE1: return createOutputsType1();
			case BOMPackage.OUTPUTS_TYPE2: return createOutputsType2();
			case BOMPackage.OUTPUTS_TYPE3: return createOutputsType3();
			case BOMPackage.OUTPUT_TYPE: return createOutputType();
			case BOMPackage.OUTPUT_TYPE1: return createOutputType1();
			case BOMPackage.OWNERS_TYPE: return createOwnersType();
			case BOMPackage.PARAMETERS_TYPE: return createParametersType();
			case BOMPackage.PARAMETERS_TYPE1: return createParametersType1();
			case BOMPackage.PARAMETER_TYPE: return createParameterType();
			case BOMPackage.PATCHES_TYPE: return createPatchesType();
			case BOMPackage.PATCH_TYPE: return createPatchType();
			case BOMPackage.PEDIGREE_TYPE: return createPedigreeType();
			case BOMPackage.PERFORMANCE_METRICS_TYPE: return createPerformanceMetricsType();
			case BOMPackage.PERFORMANCE_METRIC_TYPE: return createPerformanceMetricType();
			case BOMPackage.PERFORMANCE_TRADEOFFS_TYPE: return createPerformanceTradeoffsType();
			case BOMPackage.POSTAL_ADDRESS_TYPE: return createPostalAddressType();
			case BOMPackage.PROOF_OF_CONCEPT_TYPE: return createProofOfConceptType();
			case BOMPackage.PROPERTIES_TYPE: return createPropertiesType();
			case BOMPackage.PROPERTY_TYPE: return createPropertyType();
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE: return createProtocolPropertiesType();
			case BOMPackage.PROVIDES_TYPE: return createProvidesType();
			case BOMPackage.PURCHASER_TYPE: return createPurchaserType();
			case BOMPackage.QUANTITATIVE_ANALYSIS_TYPE: return createQuantitativeAnalysisType();
			case BOMPackage.RATINGS_TYPE: return createRatingsType();
			case BOMPackage.RATING_TYPE: return createRatingType();
			case BOMPackage.REFERENCES_TYPE: return createReferencesType();
			case BOMPackage.REFERENCES_TYPE1: return createReferencesType1();
			case BOMPackage.REFERENCE_TYPE: return createReferenceType();
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE: return createRelatedCryptoMaterialPropertiesType();
			case BOMPackage.RELEASE_NOTES_TYPE: return createReleaseNotesType();
			case BOMPackage.REQUIREMENTS_TYPE: return createRequirementsType();
			case BOMPackage.REQUIREMENTS_TYPE1: return createRequirementsType1();
			case BOMPackage.REQUIREMENT_TYPE: return createRequirementType();
			case BOMPackage.RESOLVES_TYPE: return createResolvesType();
			case BOMPackage.RESOLVES_TYPE1: return createResolvesType1();
			case BOMPackage.RESOURCE_REFERENCES_TYPE: return createResourceReferencesType();
			case BOMPackage.RESOURCE_REFERENCE_TYPE: return createResourceReferenceType();
			case BOMPackage.RESPONSES_TYPE: return createResponsesType();
			case BOMPackage.SECURED_BY_TYPE: return createSecuredByType();
			case BOMPackage.SERVICE: return createService();
			case BOMPackage.SERVICES_TYPE: return createServicesType();
			case BOMPackage.SERVICES_TYPE1: return createServicesType1();
			case BOMPackage.SERVICES_TYPE2: return createServicesType2();
			case BOMPackage.SIGNATORIES_TYPE: return createSignatoriesType();
			case BOMPackage.SIGNATORY_TYPE: return createSignatoryType();
			case BOMPackage.SOURCE_TYPE: return createSourceType();
			case BOMPackage.SOURCE_TYPE1: return createSourceType1();
			case BOMPackage.STANDARD: return createStandard();
			case BOMPackage.STANDARDS_TYPE: return createStandardsType();
			case BOMPackage.STEPS_TYPE: return createStepsType();
			case BOMPackage.STEPS_TYPE1: return createStepsType1();
			case BOMPackage.STEP_TYPE: return createStepType();
			case BOMPackage.STEWARDS_TYPE: return createStewardsType();
			case BOMPackage.SUBJECTS_TYPE: return createSubjectsType();
			case BOMPackage.SUPPORTING_MATERIAL_TYPE: return createSupportingMaterialType();
			case BOMPackage.SWID_TYPE: return createSwidType();
			case BOMPackage.TAGS_TYPE: return createTagsType();
			case BOMPackage.TARGETS_TYPE: return createTargetsType();
			case BOMPackage.TARGET_TYPE: return createTargetType();
			case BOMPackage.TASKS_TYPE: return createTasksType();
			case BOMPackage.TASK_TYPE: return createTaskType();
			case BOMPackage.TASK_TYPES_TYPE: return createTaskTypesType();
			case BOMPackage.TASK_TYPES_TYPE1: return createTaskTypesType1();
			case BOMPackage.TECHNICAL_LIMITATIONS_TYPE: return createTechnicalLimitationsType();
			case BOMPackage.TOOLS_TYPE: return createToolsType();
			case BOMPackage.TOOLS_TYPE1: return createToolsType1();
			case BOMPackage.TOOLS_TYPE2: return createToolsType2();
			case BOMPackage.TOOLS_TYPE3: return createToolsType3();
			case BOMPackage.TOOL_TYPE: return createToolType();
			case BOMPackage.TRIGGER_TYPE: return createTriggerType();
			case BOMPackage.USE_CASES_TYPE: return createUseCasesType();
			case BOMPackage.USERS_TYPE: return createUsersType();
			case BOMPackage.VERSIONS_TYPE: return createVersionsType();
			case BOMPackage.VERSION_TYPE: return createVersionType();
			case BOMPackage.VOLUME_TYPE: return createVolumeType();
			case BOMPackage.VULNERABILITIES_TYPE: return createVulnerabilitiesType();
			case BOMPackage.VULNERABILITIES_TYPE1: return createVulnerabilitiesType1();
			case BOMPackage.VULNERABILITY_SOURCE_TYPE: return createVulnerabilitySourceType();
			case BOMPackage.VULNERABILITY_TYPE: return createVulnerabilityType();
			case BOMPackage.WORKFLOWS_TYPE: return createWorkflowsType();
			case BOMPackage.WORKFLOW_TYPE: return createWorkflowType();
			case BOMPackage.WORKSPACES_TYPE: return createWorkspacesType();
			case BOMPackage.WORKSPACE_TYPE: return createWorkspaceType();
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
			case BOMPackage.ACCESS_MODE_ENUM:
				return createAccessModeEnumFromString(eDataType, initialValue);
			case BOMPackage.ACTIVITY_TYPE:
				return createActivityTypeFromString(eDataType, initialValue);
			case BOMPackage.AGGREGATE_TYPE:
				return createAggregateTypeFromString(eDataType, initialValue);
			case BOMPackage.ASSET_TYPE_TYPE:
				return createAssetTypeTypeFromString(eDataType, initialValue);
			case BOMPackage.CERTIFICATION_LEVEL_TYPE:
				return createCertificationLevelTypeFromString(eDataType, initialValue);
			case BOMPackage.CLASSIFICATION:
				return createClassificationFromString(eDataType, initialValue);
			case BOMPackage.COMPONENT_DATA_TYPE_ENUMERATION:
				return createComponentDataTypeEnumerationFromString(eDataType, initialValue);
			case BOMPackage.CRYPTO_FUNCTION_TYPE:
				return createCryptoFunctionTypeFromString(eDataType, initialValue);
			case BOMPackage.DATA_FLOW_TYPE1:
				return createDataFlowType1FromString(eDataType, initialValue);
			case BOMPackage.ENCODING:
				return createEncodingFromString(eDataType, initialValue);
			case BOMPackage.ENERGY_SOURCE_TYPE:
				return createEnergySourceTypeFromString(eDataType, initialValue);
			case BOMPackage.EVIDENCE_TECHNIQUE:
				return createEvidenceTechniqueFromString(eDataType, initialValue);
			case BOMPackage.EXECUTION_ENVIRONMENT_TYPE:
				return createExecutionEnvironmentTypeFromString(eDataType, initialValue);
			case BOMPackage.EXTERNAL_REFERENCE_TYPE:
				return createExternalReferenceTypeFromString(eDataType, initialValue);
			case BOMPackage.HASH_ALG:
				return createHashAlgFromString(eDataType, initialValue);
			case BOMPackage.IDENTITY_FIELD_TYPE:
				return createIdentityFieldTypeFromString(eDataType, initialValue);
			case BOMPackage.IMPACT_ANALYSIS_AFFECTED_STATUS_TYPE:
				return createImpactAnalysisAffectedStatusTypeFromString(eDataType, initialValue);
			case BOMPackage.IMPACT_ANALYSIS_JUSTIFICATION_TYPE:
				return createImpactAnalysisJustificationTypeFromString(eDataType, initialValue);
			case BOMPackage.IMPACT_ANALYSIS_RESPONSES_TYPE:
				return createImpactAnalysisResponsesTypeFromString(eDataType, initialValue);
			case BOMPackage.IMPACT_ANALYSIS_STATE_TYPE:
				return createImpactAnalysisStateTypeFromString(eDataType, initialValue);
			case BOMPackage.IMPLEMENTATION_PLATFORM_TYPE:
				return createImplementationPlatformTypeFromString(eDataType, initialValue);
			case BOMPackage.ISSUE_CLASSIFICATION:
				return createIssueClassificationFromString(eDataType, initialValue);
			case BOMPackage.LICENSE_ACKNOWLEDGEMENT_ENUMERATION_TYPE:
				return createLicenseAcknowledgementEnumerationTypeFromString(eDataType, initialValue);
			case BOMPackage.LICENSE_TYPE_ENUM:
				return createLicenseTypeEnumFromString(eDataType, initialValue);
			case BOMPackage.LIFECYCLE_PHASE_TYPE:
				return createLifecyclePhaseTypeFromString(eDataType, initialValue);
			case BOMPackage.MACHINE_LEARNING_APPROACH_TYPE:
				return createMachineLearningApproachTypeFromString(eDataType, initialValue);
			case BOMPackage.MODE_TYPE:
				return createModeTypeFromString(eDataType, initialValue);
			case BOMPackage.OUTPUT_TYPE_ENUM:
				return createOutputTypeEnumFromString(eDataType, initialValue);
			case BOMPackage.PADDING_TYPE:
				return createPaddingTypeFromString(eDataType, initialValue);
			case BOMPackage.PATCH_CLASSIFICATION:
				return createPatchClassificationFromString(eDataType, initialValue);
			case BOMPackage.PRIMITIVE_TYPE:
				return createPrimitiveTypeFromString(eDataType, initialValue);
			case BOMPackage.SCOPE:
				return createScopeFromString(eDataType, initialValue);
			case BOMPackage.SCORE_SOURCE_TYPE:
				return createScoreSourceTypeFromString(eDataType, initialValue);
			case BOMPackage.SEVERITY_TYPE:
				return createSeverityTypeFromString(eDataType, initialValue);
			case BOMPackage.STATE_TYPE:
				return createStateTypeFromString(eDataType, initialValue);
			case BOMPackage.TASK_TYPE_ENUM:
				return createTaskTypeEnumFromString(eDataType, initialValue);
			case BOMPackage.TRIGGER_TYPE_TYPE:
				return createTriggerTypeTypeFromString(eDataType, initialValue);
			case BOMPackage.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case BOMPackage.TYPE_TYPE1:
				return createTypeType1FromString(eDataType, initialValue);
			case BOMPackage.UNIT_TYPE:
				return createUnitTypeFromString(eDataType, initialValue);
			case BOMPackage.UNIT_TYPE1:
				return createUnitType1FromString(eDataType, initialValue);
			case BOMPackage.VOLUME_MODE_ENUM:
				return createVolumeModeEnumFromString(eDataType, initialValue);
			case BOMPackage.ACCESS_MODE_ENUM_OBJECT:
				return createAccessModeEnumObjectFromString(eDataType, initialValue);
			case BOMPackage.ACTIVITY_TYPE_OBJECT:
				return createActivityTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.AGGREGATE_TYPE_OBJECT:
				return createAggregateTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.ASSET_TYPE_TYPE_OBJECT:
				return createAssetTypeTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.BOM_LINK_DOCUMENT_TYPE:
				return createBomLinkDocumentTypeFromString(eDataType, initialValue);
			case BOMPackage.BOM_LINK_ELEMENT_TYPE:
				return createBomLinkElementTypeFromString(eDataType, initialValue);
			case BOMPackage.BOM_LINK_TYPE:
				return createBomLinkTypeFromString(eDataType, initialValue);
			case BOMPackage.CERTIFICATION_LEVEL_TYPE_OBJECT:
				return createCertificationLevelTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.CLASSICAL_SECURITY_LEVEL_TYPE:
				return createClassicalSecurityLevelTypeFromString(eDataType, initialValue);
			case BOMPackage.CLASSIFICATION_OBJECT:
				return createClassificationObjectFromString(eDataType, initialValue);
			case BOMPackage.COMPONENT_DATA_TYPE_ENUMERATION_OBJECT:
				return createComponentDataTypeEnumerationObjectFromString(eDataType, initialValue);
			case BOMPackage.CPE:
				return createCpeFromString(eDataType, initialValue);
			case BOMPackage.CRYPTO_FUNCTION_TYPE_OBJECT:
				return createCryptoFunctionTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.DATA_FLOW_TYPE_OBJECT:
				return createDataFlowTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.DECIMAL_PERCENT_TYPE:
				return createDecimalPercentTypeFromString(eDataType, initialValue);
			case BOMPackage.ENCODING_OBJECT:
				return createEncodingObjectFromString(eDataType, initialValue);
			case BOMPackage.ENERGY_SOURCE_TYPE_OBJECT:
				return createEnergySourceTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.EVIDENCE_TECHNIQUE_OBJECT:
				return createEvidenceTechniqueObjectFromString(eDataType, initialValue);
			case BOMPackage.EXECUTION_ENVIRONMENT_TYPE_OBJECT:
				return createExecutionEnvironmentTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.EXTERNAL_REFERENCE_TYPE_OBJECT:
				return createExternalReferenceTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.HASH_ALG_OBJECT:
				return createHashAlgObjectFromString(eDataType, initialValue);
			case BOMPackage.HASH_VALUE:
				return createHashValueFromString(eDataType, initialValue);
			case BOMPackage.IDENTITY_FIELD_TYPE_OBJECT:
				return createIdentityFieldTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.IMPACT_ANALYSIS_AFFECTED_STATUS_TYPE_OBJECT:
				return createImpactAnalysisAffectedStatusTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.IMPACT_ANALYSIS_JUSTIFICATION_TYPE_OBJECT:
				return createImpactAnalysisJustificationTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.IMPACT_ANALYSIS_RESPONSES_TYPE_OBJECT:
				return createImpactAnalysisResponsesTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.IMPACT_ANALYSIS_STATE_TYPE_OBJECT:
				return createImpactAnalysisStateTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.IMPLEMENTATION_PLATFORM_TYPE_OBJECT:
				return createImplementationPlatformTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.ISSUE_CLASSIFICATION_OBJECT:
				return createIssueClassificationObjectFromString(eDataType, initialValue);
			case BOMPackage.LICENSE_ACKNOWLEDGEMENT_ENUMERATION_TYPE_OBJECT:
				return createLicenseAcknowledgementEnumerationTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.LICENSE_TYPE_ENUM_OBJECT:
				return createLicenseTypeEnumObjectFromString(eDataType, initialValue);
			case BOMPackage.LIFECYCLE_PHASE_TYPE_OBJECT:
				return createLifecyclePhaseTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.LOCALE_TYPE:
				return createLocaleTypeFromString(eDataType, initialValue);
			case BOMPackage.MACHINE_LEARNING_APPROACH_TYPE_OBJECT:
				return createMachineLearningApproachTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.MIME_TYPE:
				return createMimeTypeFromString(eDataType, initialValue);
			case BOMPackage.MODE_TYPE_OBJECT:
				return createModeTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.NIST_QUANTUM_SECURITY_LEVEL_TYPE:
				return createNistQuantumSecurityLevelTypeFromString(eDataType, initialValue);
			case BOMPackage.OPEN_CRE_TYPE:
				return createOpenCreTypeFromString(eDataType, initialValue);
			case BOMPackage.OUTPUT_TYPE_ENUM_OBJECT:
				return createOutputTypeEnumObjectFromString(eDataType, initialValue);
			case BOMPackage.PADDING_TYPE_OBJECT:
				return createPaddingTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.PATCH_CLASSIFICATION_OBJECT:
				return createPatchClassificationObjectFromString(eDataType, initialValue);
			case BOMPackage.PRIMITIVE_TYPE_OBJECT:
				return createPrimitiveTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.REF_LINK_TYPE:
				return createRefLinkTypeFromString(eDataType, initialValue);
			case BOMPackage.REF_TYPE:
				return createRefTypeFromString(eDataType, initialValue);
			case BOMPackage.REF_TYPE1:
				return createRefType1FromString(eDataType, initialValue);
			case BOMPackage.REF_TYPE2:
				return createRefType2FromString(eDataType, initialValue);
			case BOMPackage.REF_TYPE3:
				return createRefType3FromString(eDataType, initialValue);
			case BOMPackage.REF_TYPE4:
				return createRefType4FromString(eDataType, initialValue);
			case BOMPackage.SCOPE_OBJECT:
				return createScopeObjectFromString(eDataType, initialValue);
			case BOMPackage.SCORE_SOURCE_TYPE_OBJECT:
				return createScoreSourceTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.SCORE_TYPE:
				return createScoreTypeFromString(eDataType, initialValue);
			case BOMPackage.SCORE_TYPE1:
				return createScoreType1FromString(eDataType, initialValue);
			case BOMPackage.SEVERITY_TYPE_OBJECT:
				return createSeverityTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.STATE_TYPE_OBJECT:
				return createStateTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.TASK_TYPE_ENUM_OBJECT:
				return createTaskTypeEnumObjectFromString(eDataType, initialValue);
			case BOMPackage.TRIGGER_TYPE_TYPE_OBJECT:
				return createTriggerTypeTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.TYPE_TYPE_OBJECT:
				return createTypeTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.TYPE_TYPE_OBJECT1:
				return createTypeTypeObject1FromString(eDataType, initialValue);
			case BOMPackage.UNIT_TYPE_OBJECT:
				return createUnitTypeObjectFromString(eDataType, initialValue);
			case BOMPackage.UNIT_TYPE_OBJECT1:
				return createUnitTypeObject1FromString(eDataType, initialValue);
			case BOMPackage.URL_TYPE:
				return createUrlTypeFromString(eDataType, initialValue);
			case BOMPackage.URL_TYPE1:
				return createUrlType1FromString(eDataType, initialValue);
			case BOMPackage.URL_TYPE2:
				return createUrlType2FromString(eDataType, initialValue);
			case BOMPackage.URN_UUID:
				return createUrnUuidFromString(eDataType, initialValue);
			case BOMPackage.VERSION_RANGE_TYPE:
				return createVersionRangeTypeFromString(eDataType, initialValue);
			case BOMPackage.VERSION_TYPE1:
				return createVersionType1FromString(eDataType, initialValue);
			case BOMPackage.VOLUME_MODE_ENUM_OBJECT:
				return createVolumeModeEnumObjectFromString(eDataType, initialValue);
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
			case BOMPackage.ACCESS_MODE_ENUM:
				return convertAccessModeEnumToString(eDataType, instanceValue);
			case BOMPackage.ACTIVITY_TYPE:
				return convertActivityTypeToString(eDataType, instanceValue);
			case BOMPackage.AGGREGATE_TYPE:
				return convertAggregateTypeToString(eDataType, instanceValue);
			case BOMPackage.ASSET_TYPE_TYPE:
				return convertAssetTypeTypeToString(eDataType, instanceValue);
			case BOMPackage.CERTIFICATION_LEVEL_TYPE:
				return convertCertificationLevelTypeToString(eDataType, instanceValue);
			case BOMPackage.CLASSIFICATION:
				return convertClassificationToString(eDataType, instanceValue);
			case BOMPackage.COMPONENT_DATA_TYPE_ENUMERATION:
				return convertComponentDataTypeEnumerationToString(eDataType, instanceValue);
			case BOMPackage.CRYPTO_FUNCTION_TYPE:
				return convertCryptoFunctionTypeToString(eDataType, instanceValue);
			case BOMPackage.DATA_FLOW_TYPE1:
				return convertDataFlowType1ToString(eDataType, instanceValue);
			case BOMPackage.ENCODING:
				return convertEncodingToString(eDataType, instanceValue);
			case BOMPackage.ENERGY_SOURCE_TYPE:
				return convertEnergySourceTypeToString(eDataType, instanceValue);
			case BOMPackage.EVIDENCE_TECHNIQUE:
				return convertEvidenceTechniqueToString(eDataType, instanceValue);
			case BOMPackage.EXECUTION_ENVIRONMENT_TYPE:
				return convertExecutionEnvironmentTypeToString(eDataType, instanceValue);
			case BOMPackage.EXTERNAL_REFERENCE_TYPE:
				return convertExternalReferenceTypeToString(eDataType, instanceValue);
			case BOMPackage.HASH_ALG:
				return convertHashAlgToString(eDataType, instanceValue);
			case BOMPackage.IDENTITY_FIELD_TYPE:
				return convertIdentityFieldTypeToString(eDataType, instanceValue);
			case BOMPackage.IMPACT_ANALYSIS_AFFECTED_STATUS_TYPE:
				return convertImpactAnalysisAffectedStatusTypeToString(eDataType, instanceValue);
			case BOMPackage.IMPACT_ANALYSIS_JUSTIFICATION_TYPE:
				return convertImpactAnalysisJustificationTypeToString(eDataType, instanceValue);
			case BOMPackage.IMPACT_ANALYSIS_RESPONSES_TYPE:
				return convertImpactAnalysisResponsesTypeToString(eDataType, instanceValue);
			case BOMPackage.IMPACT_ANALYSIS_STATE_TYPE:
				return convertImpactAnalysisStateTypeToString(eDataType, instanceValue);
			case BOMPackage.IMPLEMENTATION_PLATFORM_TYPE:
				return convertImplementationPlatformTypeToString(eDataType, instanceValue);
			case BOMPackage.ISSUE_CLASSIFICATION:
				return convertIssueClassificationToString(eDataType, instanceValue);
			case BOMPackage.LICENSE_ACKNOWLEDGEMENT_ENUMERATION_TYPE:
				return convertLicenseAcknowledgementEnumerationTypeToString(eDataType, instanceValue);
			case BOMPackage.LICENSE_TYPE_ENUM:
				return convertLicenseTypeEnumToString(eDataType, instanceValue);
			case BOMPackage.LIFECYCLE_PHASE_TYPE:
				return convertLifecyclePhaseTypeToString(eDataType, instanceValue);
			case BOMPackage.MACHINE_LEARNING_APPROACH_TYPE:
				return convertMachineLearningApproachTypeToString(eDataType, instanceValue);
			case BOMPackage.MODE_TYPE:
				return convertModeTypeToString(eDataType, instanceValue);
			case BOMPackage.OUTPUT_TYPE_ENUM:
				return convertOutputTypeEnumToString(eDataType, instanceValue);
			case BOMPackage.PADDING_TYPE:
				return convertPaddingTypeToString(eDataType, instanceValue);
			case BOMPackage.PATCH_CLASSIFICATION:
				return convertPatchClassificationToString(eDataType, instanceValue);
			case BOMPackage.PRIMITIVE_TYPE:
				return convertPrimitiveTypeToString(eDataType, instanceValue);
			case BOMPackage.SCOPE:
				return convertScopeToString(eDataType, instanceValue);
			case BOMPackage.SCORE_SOURCE_TYPE:
				return convertScoreSourceTypeToString(eDataType, instanceValue);
			case BOMPackage.SEVERITY_TYPE:
				return convertSeverityTypeToString(eDataType, instanceValue);
			case BOMPackage.STATE_TYPE:
				return convertStateTypeToString(eDataType, instanceValue);
			case BOMPackage.TASK_TYPE_ENUM:
				return convertTaskTypeEnumToString(eDataType, instanceValue);
			case BOMPackage.TRIGGER_TYPE_TYPE:
				return convertTriggerTypeTypeToString(eDataType, instanceValue);
			case BOMPackage.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case BOMPackage.TYPE_TYPE1:
				return convertTypeType1ToString(eDataType, instanceValue);
			case BOMPackage.UNIT_TYPE:
				return convertUnitTypeToString(eDataType, instanceValue);
			case BOMPackage.UNIT_TYPE1:
				return convertUnitType1ToString(eDataType, instanceValue);
			case BOMPackage.VOLUME_MODE_ENUM:
				return convertVolumeModeEnumToString(eDataType, instanceValue);
			case BOMPackage.ACCESS_MODE_ENUM_OBJECT:
				return convertAccessModeEnumObjectToString(eDataType, instanceValue);
			case BOMPackage.ACTIVITY_TYPE_OBJECT:
				return convertActivityTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.AGGREGATE_TYPE_OBJECT:
				return convertAggregateTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.ASSET_TYPE_TYPE_OBJECT:
				return convertAssetTypeTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.BOM_LINK_DOCUMENT_TYPE:
				return convertBomLinkDocumentTypeToString(eDataType, instanceValue);
			case BOMPackage.BOM_LINK_ELEMENT_TYPE:
				return convertBomLinkElementTypeToString(eDataType, instanceValue);
			case BOMPackage.BOM_LINK_TYPE:
				return convertBomLinkTypeToString(eDataType, instanceValue);
			case BOMPackage.CERTIFICATION_LEVEL_TYPE_OBJECT:
				return convertCertificationLevelTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.CLASSICAL_SECURITY_LEVEL_TYPE:
				return convertClassicalSecurityLevelTypeToString(eDataType, instanceValue);
			case BOMPackage.CLASSIFICATION_OBJECT:
				return convertClassificationObjectToString(eDataType, instanceValue);
			case BOMPackage.COMPONENT_DATA_TYPE_ENUMERATION_OBJECT:
				return convertComponentDataTypeEnumerationObjectToString(eDataType, instanceValue);
			case BOMPackage.CPE:
				return convertCpeToString(eDataType, instanceValue);
			case BOMPackage.CRYPTO_FUNCTION_TYPE_OBJECT:
				return convertCryptoFunctionTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.DATA_FLOW_TYPE_OBJECT:
				return convertDataFlowTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.DECIMAL_PERCENT_TYPE:
				return convertDecimalPercentTypeToString(eDataType, instanceValue);
			case BOMPackage.ENCODING_OBJECT:
				return convertEncodingObjectToString(eDataType, instanceValue);
			case BOMPackage.ENERGY_SOURCE_TYPE_OBJECT:
				return convertEnergySourceTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.EVIDENCE_TECHNIQUE_OBJECT:
				return convertEvidenceTechniqueObjectToString(eDataType, instanceValue);
			case BOMPackage.EXECUTION_ENVIRONMENT_TYPE_OBJECT:
				return convertExecutionEnvironmentTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.EXTERNAL_REFERENCE_TYPE_OBJECT:
				return convertExternalReferenceTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.HASH_ALG_OBJECT:
				return convertHashAlgObjectToString(eDataType, instanceValue);
			case BOMPackage.HASH_VALUE:
				return convertHashValueToString(eDataType, instanceValue);
			case BOMPackage.IDENTITY_FIELD_TYPE_OBJECT:
				return convertIdentityFieldTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.IMPACT_ANALYSIS_AFFECTED_STATUS_TYPE_OBJECT:
				return convertImpactAnalysisAffectedStatusTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.IMPACT_ANALYSIS_JUSTIFICATION_TYPE_OBJECT:
				return convertImpactAnalysisJustificationTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.IMPACT_ANALYSIS_RESPONSES_TYPE_OBJECT:
				return convertImpactAnalysisResponsesTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.IMPACT_ANALYSIS_STATE_TYPE_OBJECT:
				return convertImpactAnalysisStateTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.IMPLEMENTATION_PLATFORM_TYPE_OBJECT:
				return convertImplementationPlatformTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.ISSUE_CLASSIFICATION_OBJECT:
				return convertIssueClassificationObjectToString(eDataType, instanceValue);
			case BOMPackage.LICENSE_ACKNOWLEDGEMENT_ENUMERATION_TYPE_OBJECT:
				return convertLicenseAcknowledgementEnumerationTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.LICENSE_TYPE_ENUM_OBJECT:
				return convertLicenseTypeEnumObjectToString(eDataType, instanceValue);
			case BOMPackage.LIFECYCLE_PHASE_TYPE_OBJECT:
				return convertLifecyclePhaseTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.LOCALE_TYPE:
				return convertLocaleTypeToString(eDataType, instanceValue);
			case BOMPackage.MACHINE_LEARNING_APPROACH_TYPE_OBJECT:
				return convertMachineLearningApproachTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.MIME_TYPE:
				return convertMimeTypeToString(eDataType, instanceValue);
			case BOMPackage.MODE_TYPE_OBJECT:
				return convertModeTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.NIST_QUANTUM_SECURITY_LEVEL_TYPE:
				return convertNistQuantumSecurityLevelTypeToString(eDataType, instanceValue);
			case BOMPackage.OPEN_CRE_TYPE:
				return convertOpenCreTypeToString(eDataType, instanceValue);
			case BOMPackage.OUTPUT_TYPE_ENUM_OBJECT:
				return convertOutputTypeEnumObjectToString(eDataType, instanceValue);
			case BOMPackage.PADDING_TYPE_OBJECT:
				return convertPaddingTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.PATCH_CLASSIFICATION_OBJECT:
				return convertPatchClassificationObjectToString(eDataType, instanceValue);
			case BOMPackage.PRIMITIVE_TYPE_OBJECT:
				return convertPrimitiveTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.REF_LINK_TYPE:
				return convertRefLinkTypeToString(eDataType, instanceValue);
			case BOMPackage.REF_TYPE:
				return convertRefTypeToString(eDataType, instanceValue);
			case BOMPackage.REF_TYPE1:
				return convertRefType1ToString(eDataType, instanceValue);
			case BOMPackage.REF_TYPE2:
				return convertRefType2ToString(eDataType, instanceValue);
			case BOMPackage.REF_TYPE3:
				return convertRefType3ToString(eDataType, instanceValue);
			case BOMPackage.REF_TYPE4:
				return convertRefType4ToString(eDataType, instanceValue);
			case BOMPackage.SCOPE_OBJECT:
				return convertScopeObjectToString(eDataType, instanceValue);
			case BOMPackage.SCORE_SOURCE_TYPE_OBJECT:
				return convertScoreSourceTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.SCORE_TYPE:
				return convertScoreTypeToString(eDataType, instanceValue);
			case BOMPackage.SCORE_TYPE1:
				return convertScoreType1ToString(eDataType, instanceValue);
			case BOMPackage.SEVERITY_TYPE_OBJECT:
				return convertSeverityTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.STATE_TYPE_OBJECT:
				return convertStateTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.TASK_TYPE_ENUM_OBJECT:
				return convertTaskTypeEnumObjectToString(eDataType, instanceValue);
			case BOMPackage.TRIGGER_TYPE_TYPE_OBJECT:
				return convertTriggerTypeTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.TYPE_TYPE_OBJECT:
				return convertTypeTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.TYPE_TYPE_OBJECT1:
				return convertTypeTypeObject1ToString(eDataType, instanceValue);
			case BOMPackage.UNIT_TYPE_OBJECT:
				return convertUnitTypeObjectToString(eDataType, instanceValue);
			case BOMPackage.UNIT_TYPE_OBJECT1:
				return convertUnitTypeObject1ToString(eDataType, instanceValue);
			case BOMPackage.URL_TYPE:
				return convertUrlTypeToString(eDataType, instanceValue);
			case BOMPackage.URL_TYPE1:
				return convertUrlType1ToString(eDataType, instanceValue);
			case BOMPackage.URL_TYPE2:
				return convertUrlType2ToString(eDataType, instanceValue);
			case BOMPackage.URN_UUID:
				return convertUrnUuidToString(eDataType, instanceValue);
			case BOMPackage.VERSION_RANGE_TYPE:
				return convertVersionRangeTypeToString(eDataType, instanceValue);
			case BOMPackage.VERSION_TYPE1:
				return convertVersionType1ToString(eDataType, instanceValue);
			case BOMPackage.VOLUME_MODE_ENUM_OBJECT:
				return convertVolumeModeEnumObjectToString(eDataType, instanceValue);
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
	public AdvisoriesType createAdvisoriesType() {
		AdvisoriesTypeImpl advisoriesType = new AdvisoriesTypeImpl();
		return advisoriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdvisoryType createAdvisoryType() {
		AdvisoryTypeImpl advisoryType = new AdvisoryTypeImpl();
		return advisoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffectsType createAffectsType() {
		AffectsTypeImpl affectsType = new AffectsTypeImpl();
		return affectsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AffirmationType createAffirmationType() {
		AffirmationTypeImpl affirmationType = new AffirmationTypeImpl();
		return affirmationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlgorithmPropertiesType createAlgorithmPropertiesType() {
		AlgorithmPropertiesTypeImpl algorithmPropertiesType = new AlgorithmPropertiesTypeImpl();
		return algorithmPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AlgorithmsType createAlgorithmsType() {
		AlgorithmsTypeImpl algorithmsType = new AlgorithmsTypeImpl();
		return algorithmsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AliasesType createAliasesType() {
		AliasesTypeImpl aliasesType = new AliasesTypeImpl();
		return aliasesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AliasesType1 createAliasesType1() {
		AliasesType1Impl aliasesType1 = new AliasesType1Impl();
		return aliasesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AltIdsType createAltIdsType() {
		AltIdsTypeImpl altIdsType = new AltIdsTypeImpl();
		return altIdsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalysisType createAnalysisType() {
		AnalysisTypeImpl analysisType = new AnalysisTypeImpl();
		return analysisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationsType createAnnotationsType() {
		AnnotationsTypeImpl annotationsType = new AnnotationsTypeImpl();
		return annotationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotationType createAnnotationType() {
		AnnotationTypeImpl annotationType = new AnnotationTypeImpl();
		return annotationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotatorChoiceType createAnnotatorChoiceType() {
		AnnotatorChoiceTypeImpl annotatorChoiceType = new AnnotatorChoiceTypeImpl();
		return annotatorChoiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApproachType createApproachType() {
		ApproachTypeImpl approachType = new ApproachTypeImpl();
		return approachType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssembliesType createAssembliesType() {
		AssembliesTypeImpl assembliesType = new AssembliesTypeImpl();
		return assembliesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessorsType createAssessorsType() {
		AssessorsTypeImpl assessorsType = new AssessorsTypeImpl();
		return assessorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AssessorType createAssessorType() {
		AssessorTypeImpl assessorType = new AssessorTypeImpl();
		return assessorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttachedTextType createAttachedTextType() {
		AttachedTextTypeImpl attachedTextType = new AttachedTextTypeImpl();
		return attachedTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttestationsType createAttestationsType() {
		AttestationsTypeImpl attestationsType = new AttestationsTypeImpl();
		return attestationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttestationType createAttestationType() {
		AttestationTypeImpl attestationType = new AttestationTypeImpl();
		return attestationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorsType createAuthorsType() {
		AuthorsTypeImpl authorsType = new AuthorsTypeImpl();
		return authorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorsType1 createAuthorsType1() {
		AuthorsType1Impl authorsType1 = new AuthorsType1Impl();
		return authorsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BomReferenceType createBomReferenceType() {
		BomReferenceTypeImpl bomReferenceType = new BomReferenceTypeImpl();
		return bomReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BomType createBomType() {
		BomTypeImpl bomType = new BomTypeImpl();
		return bomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CallstackType createCallstackType() {
		CallstackTypeImpl callstackType = new CallstackTypeImpl();
		return callstackType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CertificatePropertiesType createCertificatePropertiesType() {
		CertificatePropertiesTypeImpl certificatePropertiesType = new CertificatePropertiesTypeImpl();
		return certificatePropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CipherSuitesType createCipherSuitesType() {
		CipherSuitesTypeImpl cipherSuitesType = new CipherSuitesTypeImpl();
		return cipherSuitesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CipherSuiteType createCipherSuiteType() {
		CipherSuiteTypeImpl cipherSuiteType = new CipherSuiteTypeImpl();
		return cipherSuiteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimsType createClaimsType() {
		ClaimsTypeImpl claimsType = new ClaimsTypeImpl();
		return claimsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimsType1 createClaimsType1() {
		ClaimsType1Impl claimsType1 = new ClaimsType1Impl();
		return claimsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ClaimType createClaimType() {
		ClaimTypeImpl claimType = new ClaimTypeImpl();
		return claimType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Co2MeasureType createCo2MeasureType() {
		Co2MeasureTypeImpl co2MeasureType = new Co2MeasureTypeImpl();
		return co2MeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionType createCollectionType() {
		CollectionTypeImpl collectionType = new CollectionTypeImpl();
		return collectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionType1 createCollectionType1() {
		CollectionType1Impl collectionType1 = new CollectionType1Impl();
		return collectionType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandsType createCommandsType() {
		CommandsTypeImpl commandsType = new CommandsTypeImpl();
		return commandsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommandType createCommandType() {
		CommandTypeImpl commandType = new CommandTypeImpl();
		return commandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommitsType createCommitsType() {
		CommitsTypeImpl commitsType = new CommitsTypeImpl();
		return commitsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommitType createCommitType() {
		CommitTypeImpl commitType = new CommitTypeImpl();
		return commitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentDataType createComponentDataType() {
		ComponentDataTypeImpl componentDataType = new ComponentDataTypeImpl();
		return componentDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentEvidenceType createComponentEvidenceType() {
		ComponentEvidenceTypeImpl componentEvidenceType = new ComponentEvidenceTypeImpl();
		return componentEvidenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentsType createComponentsType() {
		ComponentsTypeImpl componentsType = new ComponentsTypeImpl();
		return componentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentsType1 createComponentsType1() {
		ComponentsType1Impl componentsType1 = new ComponentsType1Impl();
		return componentsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentsType2 createComponentsType2() {
		ComponentsType2Impl componentsType2 = new ComponentsType2Impl();
		return componentsType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositionsType createCompositionsType() {
		CompositionsTypeImpl compositionsType = new CompositionsTypeImpl();
		return compositionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositionType createCompositionType() {
		CompositionTypeImpl compositionType = new CompositionTypeImpl();
		return compositionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionsType createConditionsType() {
		ConditionsTypeImpl conditionsType = new ConditionsTypeImpl();
		return conditionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionType createConditionType() {
		ConditionTypeImpl conditionType = new ConditionTypeImpl();
		return conditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfidenceIntervalType createConfidenceIntervalType() {
		ConfidenceIntervalTypeImpl confidenceIntervalType = new ConfidenceIntervalTypeImpl();
		return confidenceIntervalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfidenceType createConfidenceType() {
		ConfidenceTypeImpl confidenceType = new ConfidenceTypeImpl();
		return confidenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConformanceType createConformanceType() {
		ConformanceTypeImpl conformanceType = new ConformanceTypeImpl();
		return conformanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsiderationsType createConsiderationsType() {
		ConsiderationsTypeImpl considerationsType = new ConsiderationsTypeImpl();
		return considerationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentsType createContentsType() {
		ContentsTypeImpl contentsType = new ContentsTypeImpl();
		return contentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentsType1 createContentsType1() {
		ContentsType1Impl contentsType1 = new ContentsType1Impl();
		return contentsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CopyrightsType createCopyrightsType() {
		CopyrightsTypeImpl copyrightsType = new CopyrightsTypeImpl();
		return copyrightsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CounterClaimsType createCounterClaimsType() {
		CounterClaimsTypeImpl counterClaimsType = new CounterClaimsTypeImpl();
		return counterClaimsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CreditsType createCreditsType() {
		CreditsTypeImpl creditsType = new CreditsTypeImpl();
		return creditsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CryptoFunctionsType createCryptoFunctionsType() {
		CryptoFunctionsTypeImpl cryptoFunctionsType = new CryptoFunctionsTypeImpl();
		return cryptoFunctionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CryptoPropertiesType createCryptoPropertiesType() {
		CryptoPropertiesTypeImpl cryptoPropertiesType = new CryptoPropertiesTypeImpl();
		return cryptoPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustodiansType createCustodiansType() {
		CustodiansTypeImpl custodiansType = new CustodiansTypeImpl();
		return custodiansType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CwesType createCwesType() {
		CwesTypeImpl cwesType = new CwesTypeImpl();
		return cwesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataClassificationType createDataClassificationType() {
		DataClassificationTypeImpl dataClassificationType = new DataClassificationTypeImpl();
		return dataClassificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataflowType createDataflowType() {
		DataflowTypeImpl dataflowType = new DataflowTypeImpl();
		return dataflowType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataGovernance createDataGovernance() {
		DataGovernanceImpl dataGovernance = new DataGovernanceImpl();
		return dataGovernance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasetsType createDatasetsType() {
		DatasetsTypeImpl datasetsType = new DatasetsTypeImpl();
		return datasetsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType1 createDataType1() {
		DataType1Impl dataType1 = new DataType1Impl();
		return dataType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeclarationsType createDeclarationsType() {
		DeclarationsTypeImpl declarationsType = new DeclarationsTypeImpl();
		return declarationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinitionsType createDefinitionsType() {
		DefinitionsTypeImpl definitionsType = new DefinitionsTypeImpl();
		return definitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DependenciesType createDependenciesType() {
		DependenciesTypeImpl dependenciesType = new DependenciesTypeImpl();
		return dependenciesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DependenciesType1 createDependenciesType1() {
		DependenciesType1Impl dependenciesType1 = new DependenciesType1Impl();
		return dependenciesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DependencyType createDependencyType() {
		DependencyTypeImpl dependencyType = new DependencyTypeImpl();
		return dependencyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DescriptionsType createDescriptionsType() {
		DescriptionsTypeImpl descriptionsType = new DescriptionsTypeImpl();
		return descriptionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DestinationType createDestinationType() {
		DestinationTypeImpl destinationType = new DestinationTypeImpl();
		return destinationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffType createDiffType() {
		DiffTypeImpl diffType = new DiffTypeImpl();
		return diffType;
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
	public EndpointsType createEndpointsType() {
		EndpointsTypeImpl endpointsType = new EndpointsTypeImpl();
		return endpointsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnergyConsumptionsType createEnergyConsumptionsType() {
		EnergyConsumptionsTypeImpl energyConsumptionsType = new EnergyConsumptionsTypeImpl();
		return energyConsumptionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnergyConsumptionType createEnergyConsumptionType() {
		EnergyConsumptionTypeImpl energyConsumptionType = new EnergyConsumptionTypeImpl();
		return energyConsumptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnergyMeasureType createEnergyMeasureType() {
		EnergyMeasureTypeImpl energyMeasureType = new EnergyMeasureTypeImpl();
		return energyMeasureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnergyProviderType createEnergyProviderType() {
		EnergyProviderTypeImpl energyProviderType = new EnergyProviderTypeImpl();
		return energyProviderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentalConsiderationsType createEnvironmentalConsiderationsType() {
		EnvironmentalConsiderationsTypeImpl environmentalConsiderationsType = new EnvironmentalConsiderationsTypeImpl();
		return environmentalConsiderationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentVarsType createEnvironmentVarsType() {
		EnvironmentVarsTypeImpl environmentVarsType = new EnvironmentVarsTypeImpl();
		return environmentVarsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentVarsType1 createEnvironmentVarsType1() {
		EnvironmentVarsType1Impl environmentVarsType1 = new EnvironmentVarsType1Impl();
		return environmentVarsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EthicalConsiderationsType createEthicalConsiderationsType() {
		EthicalConsiderationsTypeImpl ethicalConsiderationsType = new EthicalConsiderationsTypeImpl();
		return ethicalConsiderationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EthicalConsiderationType createEthicalConsiderationType() {
		EthicalConsiderationTypeImpl ethicalConsiderationType = new EthicalConsiderationTypeImpl();
		return ethicalConsiderationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventType createEventType() {
		EventTypeImpl eventType = new EventTypeImpl();
		return eventType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EvidenceType createEvidenceType() {
		EvidenceTypeImpl evidenceType = new EvidenceTypeImpl();
		return evidenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EvidenceType1 createEvidenceType1() {
		EvidenceType1Impl evidenceType1 = new EvidenceType1Impl();
		return evidenceType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionType createExpressionType() {
		ExpressionTypeImpl expressionType = new ExpressionTypeImpl();
		return expressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalReference createExternalReference() {
		ExternalReferenceImpl externalReference = new ExternalReferenceImpl();
		return externalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalReferences createExternalReferences() {
		ExternalReferencesImpl externalReferences = new ExternalReferencesImpl();
		return externalReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FairnessAssessmentsType createFairnessAssessmentsType() {
		FairnessAssessmentsTypeImpl fairnessAssessmentsType = new FairnessAssessmentsTypeImpl();
		return fairnessAssessmentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FairnessAssessmentType createFairnessAssessmentType() {
		FairnessAssessmentTypeImpl fairnessAssessmentType = new FairnessAssessmentTypeImpl();
		return fairnessAssessmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormulationType createFormulationType() {
		FormulationTypeImpl formulationType = new FormulationTypeImpl();
		return formulationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FormulaType createFormulaType() {
		FormulaTypeImpl formulaType = new FormulaTypeImpl();
		return formulaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FramesType createFramesType() {
		FramesTypeImpl framesType = new FramesTypeImpl();
		return framesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrameType createFrameType() {
		FrameTypeImpl frameType = new FrameTypeImpl();
		return frameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicsCollectionType createGraphicsCollectionType() {
		GraphicsCollectionTypeImpl graphicsCollectionType = new GraphicsCollectionTypeImpl();
		return graphicsCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicsType createGraphicsType() {
		GraphicsTypeImpl graphicsType = new GraphicsTypeImpl();
		return graphicsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicType createGraphicType() {
		GraphicTypeImpl graphicType = new GraphicTypeImpl();
		return graphicType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphicType1 createGraphicType1() {
		GraphicType1Impl graphicType1 = new GraphicType1Impl();
		return graphicType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HashesType createHashesType() {
		HashesTypeImpl hashesType = new HashesTypeImpl();
		return hashesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HashesType1 createHashesType1() {
		HashesType1Impl hashesType1 = new HashesType1Impl();
		return hashesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HashesType2 createHashesType2() {
		HashesType2Impl hashesType2 = new HashesType2Impl();
		return hashesType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HashType createHashType() {
		HashTypeImpl hashType = new HashTypeImpl();
		return hashType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifiableActionType createIdentifiableActionType() {
		IdentifiableActionTypeImpl identifiableActionType = new IdentifiableActionTypeImpl();
		return identifiableActionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifiersType createIdentifiersType() {
		IdentifiersTypeImpl identifiersType = new IdentifiersTypeImpl();
		return identifiersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentityType createIdentityType() {
		IdentityTypeImpl identityType = new IdentityTypeImpl();
		return identityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ikev2TransformTypesType createIkev2TransformTypesType() {
		Ikev2TransformTypesTypeImpl ikev2TransformTypesType = new Ikev2TransformTypesTypeImpl();
		return ikev2TransformTypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndividualsType createIndividualsType() {
		IndividualsTypeImpl individualsType = new IndividualsTypeImpl();
		return individualsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputsType createInputsType() {
		InputsTypeImpl inputsType = new InputsTypeImpl();
		return inputsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputsType1 createInputsType1() {
		InputsType1Impl inputsType1 = new InputsType1Impl();
		return inputsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputsType2 createInputsType2() {
		InputsType2Impl inputsType2 = new InputsType2Impl();
		return inputsType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputsType3 createInputsType3() {
		InputsType3Impl inputsType3 = new InputsType3Impl();
		return inputsType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputType createInputType() {
		InputTypeImpl inputType = new InputTypeImpl();
		return inputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InputType1 createInputType1() {
		InputType1Impl inputType1 = new InputType1Impl();
		return inputType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueType createIssueType() {
		IssueTypeImpl issueType = new IssueTypeImpl();
		return issueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LevelsType createLevelsType() {
		LevelsTypeImpl levelsType = new LevelsTypeImpl();
		return levelsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LevelType createLevelType() {
		LevelTypeImpl levelType = new LevelTypeImpl();
		return levelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicenseChoiceType createLicenseChoiceType() {
		LicenseChoiceTypeImpl licenseChoiceType = new LicenseChoiceTypeImpl();
		return licenseChoiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicenseeType createLicenseeType() {
		LicenseeTypeImpl licenseeType = new LicenseeTypeImpl();
		return licenseeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicenseType createLicenseType() {
		LicenseTypeImpl licenseType = new LicenseTypeImpl();
		return licenseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicenseTypesType createLicenseTypesType() {
		LicenseTypesTypeImpl licenseTypesType = new LicenseTypesTypeImpl();
		return licenseTypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicensingType createLicensingType() {
		LicensingTypeImpl licensingType = new LicensingTypeImpl();
		return licensingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LicensorType createLicensorType() {
		LicensorTypeImpl licensorType = new LicensorTypeImpl();
		return licensorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LifecyclesType createLifecyclesType() {
		LifecyclesTypeImpl lifecyclesType = new LifecyclesTypeImpl();
		return lifecyclesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LifecycleType createLifecycleType() {
		LifecycleTypeImpl lifecycleType = new LifecycleTypeImpl();
		return lifecycleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MapType createMapType() {
		MapTypeImpl mapType = new MapTypeImpl();
		return mapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metadata createMetadata() {
		MetadataImpl metadata = new MetadataImpl();
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodsType createMethodsType() {
		MethodsTypeImpl methodsType = new MethodsTypeImpl();
		return methodsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodType createMethodType() {
		MethodTypeImpl methodType = new MethodTypeImpl();
		return methodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MitigationStrategiesType createMitigationStrategiesType() {
		MitigationStrategiesTypeImpl mitigationStrategiesType = new MitigationStrategiesTypeImpl();
		return mitigationStrategiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MitigationStrategiesType1 createMitigationStrategiesType1() {
		MitigationStrategiesType1Impl mitigationStrategiesType1 = new MitigationStrategiesType1Impl();
		return mitigationStrategiesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelCardType createModelCardType() {
		ModelCardTypeImpl modelCardType = new ModelCardTypeImpl();
		return modelCardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelParametersType createModelParametersType() {
		ModelParametersTypeImpl modelParametersType = new ModelParametersTypeImpl();
		return modelParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotesType createNotesType() {
		NotesTypeImpl notesType = new NotesTypeImpl();
		return notesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NoteType createNoteType() {
		NoteTypeImpl noteType = new NoteTypeImpl();
		return noteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OccurrencesType createOccurrencesType() {
		OccurrencesTypeImpl occurrencesType = new OccurrencesTypeImpl();
		return occurrencesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OccurrenceType createOccurrenceType() {
		OccurrenceTypeImpl occurrenceType = new OccurrenceTypeImpl();
		return occurrenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationalContact createOrganizationalContact() {
		OrganizationalContactImpl organizationalContact = new OrganizationalContactImpl();
		return organizationalContact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationalEntity createOrganizationalEntity() {
		OrganizationalEntityImpl organizationalEntity = new OrganizationalEntityImpl();
		return organizationalEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationOrIndividualType createOrganizationOrIndividualType() {
		OrganizationOrIndividualTypeImpl organizationOrIndividualType = new OrganizationOrIndividualTypeImpl();
		return organizationOrIndividualType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationsType createOrganizationsType() {
		OrganizationsTypeImpl organizationsType = new OrganizationsTypeImpl();
		return organizationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrganizationsType1 createOrganizationsType1() {
		OrganizationsType1Impl organizationsType1 = new OrganizationsType1Impl();
		return organizationsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputsType createOutputsType() {
		OutputsTypeImpl outputsType = new OutputsTypeImpl();
		return outputsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputsType1 createOutputsType1() {
		OutputsType1Impl outputsType1 = new OutputsType1Impl();
		return outputsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputsType2 createOutputsType2() {
		OutputsType2Impl outputsType2 = new OutputsType2Impl();
		return outputsType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputsType3 createOutputsType3() {
		OutputsType3Impl outputsType3 = new OutputsType3Impl();
		return outputsType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputType createOutputType() {
		OutputTypeImpl outputType = new OutputTypeImpl();
		return outputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputType1 createOutputType1() {
		OutputType1Impl outputType1 = new OutputType1Impl();
		return outputType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OwnersType createOwnersType() {
		OwnersTypeImpl ownersType = new OwnersTypeImpl();
		return ownersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParametersType createParametersType() {
		ParametersTypeImpl parametersType = new ParametersTypeImpl();
		return parametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParametersType1 createParametersType1() {
		ParametersType1Impl parametersType1 = new ParametersType1Impl();
		return parametersType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterType createParameterType() {
		ParameterTypeImpl parameterType = new ParameterTypeImpl();
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatchesType createPatchesType() {
		PatchesTypeImpl patchesType = new PatchesTypeImpl();
		return patchesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatchType createPatchType() {
		PatchTypeImpl patchType = new PatchTypeImpl();
		return patchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PedigreeType createPedigreeType() {
		PedigreeTypeImpl pedigreeType = new PedigreeTypeImpl();
		return pedigreeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformanceMetricsType createPerformanceMetricsType() {
		PerformanceMetricsTypeImpl performanceMetricsType = new PerformanceMetricsTypeImpl();
		return performanceMetricsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformanceMetricType createPerformanceMetricType() {
		PerformanceMetricTypeImpl performanceMetricType = new PerformanceMetricTypeImpl();
		return performanceMetricType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PerformanceTradeoffsType createPerformanceTradeoffsType() {
		PerformanceTradeoffsTypeImpl performanceTradeoffsType = new PerformanceTradeoffsTypeImpl();
		return performanceTradeoffsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalAddressType createPostalAddressType() {
		PostalAddressTypeImpl postalAddressType = new PostalAddressTypeImpl();
		return postalAddressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProofOfConceptType createProofOfConceptType() {
		ProofOfConceptTypeImpl proofOfConceptType = new ProofOfConceptTypeImpl();
		return proofOfConceptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertiesType createPropertiesType() {
		PropertiesTypeImpl propertiesType = new PropertiesTypeImpl();
		return propertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProtocolPropertiesType createProtocolPropertiesType() {
		ProtocolPropertiesTypeImpl protocolPropertiesType = new ProtocolPropertiesTypeImpl();
		return protocolPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProvidesType createProvidesType() {
		ProvidesTypeImpl providesType = new ProvidesTypeImpl();
		return providesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PurchaserType createPurchaserType() {
		PurchaserTypeImpl purchaserType = new PurchaserTypeImpl();
		return purchaserType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QuantitativeAnalysisType createQuantitativeAnalysisType() {
		QuantitativeAnalysisTypeImpl quantitativeAnalysisType = new QuantitativeAnalysisTypeImpl();
		return quantitativeAnalysisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RatingsType createRatingsType() {
		RatingsTypeImpl ratingsType = new RatingsTypeImpl();
		return ratingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RatingType createRatingType() {
		RatingTypeImpl ratingType = new RatingTypeImpl();
		return ratingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferencesType createReferencesType() {
		ReferencesTypeImpl referencesType = new ReferencesTypeImpl();
		return referencesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferencesType1 createReferencesType1() {
		ReferencesType1Impl referencesType1 = new ReferencesType1Impl();
		return referencesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType createReferenceType() {
		ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelatedCryptoMaterialPropertiesType createRelatedCryptoMaterialPropertiesType() {
		RelatedCryptoMaterialPropertiesTypeImpl relatedCryptoMaterialPropertiesType = new RelatedCryptoMaterialPropertiesTypeImpl();
		return relatedCryptoMaterialPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReleaseNotesType createReleaseNotesType() {
		ReleaseNotesTypeImpl releaseNotesType = new ReleaseNotesTypeImpl();
		return releaseNotesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementsType createRequirementsType() {
		RequirementsTypeImpl requirementsType = new RequirementsTypeImpl();
		return requirementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementsType1 createRequirementsType1() {
		RequirementsType1Impl requirementsType1 = new RequirementsType1Impl();
		return requirementsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementType createRequirementType() {
		RequirementTypeImpl requirementType = new RequirementTypeImpl();
		return requirementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResolvesType createResolvesType() {
		ResolvesTypeImpl resolvesType = new ResolvesTypeImpl();
		return resolvesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResolvesType1 createResolvesType1() {
		ResolvesType1Impl resolvesType1 = new ResolvesType1Impl();
		return resolvesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceReferencesType createResourceReferencesType() {
		ResourceReferencesTypeImpl resourceReferencesType = new ResourceReferencesTypeImpl();
		return resourceReferencesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceReferenceType createResourceReferenceType() {
		ResourceReferenceTypeImpl resourceReferenceType = new ResourceReferenceTypeImpl();
		return resourceReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponsesType createResponsesType() {
		ResponsesTypeImpl responsesType = new ResponsesTypeImpl();
		return responsesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecuredByType createSecuredByType() {
		SecuredByTypeImpl securedByType = new SecuredByTypeImpl();
		return securedByType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServicesType createServicesType() {
		ServicesTypeImpl servicesType = new ServicesTypeImpl();
		return servicesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServicesType1 createServicesType1() {
		ServicesType1Impl servicesType1 = new ServicesType1Impl();
		return servicesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServicesType2 createServicesType2() {
		ServicesType2Impl servicesType2 = new ServicesType2Impl();
		return servicesType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignatoriesType createSignatoriesType() {
		SignatoriesTypeImpl signatoriesType = new SignatoriesTypeImpl();
		return signatoriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignatoryType createSignatoryType() {
		SignatoryTypeImpl signatoryType = new SignatoryTypeImpl();
		return signatoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceType createSourceType() {
		SourceTypeImpl sourceType = new SourceTypeImpl();
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SourceType1 createSourceType1() {
		SourceType1Impl sourceType1 = new SourceType1Impl();
		return sourceType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Standard createStandard() {
		StandardImpl standard = new StandardImpl();
		return standard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StandardsType createStandardsType() {
		StandardsTypeImpl standardsType = new StandardsTypeImpl();
		return standardsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepsType createStepsType() {
		StepsTypeImpl stepsType = new StepsTypeImpl();
		return stepsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepsType1 createStepsType1() {
		StepsType1Impl stepsType1 = new StepsType1Impl();
		return stepsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StepType createStepType() {
		StepTypeImpl stepType = new StepTypeImpl();
		return stepType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StewardsType createStewardsType() {
		StewardsTypeImpl stewardsType = new StewardsTypeImpl();
		return stewardsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubjectsType createSubjectsType() {
		SubjectsTypeImpl subjectsType = new SubjectsTypeImpl();
		return subjectsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SupportingMaterialType createSupportingMaterialType() {
		SupportingMaterialTypeImpl supportingMaterialType = new SupportingMaterialTypeImpl();
		return supportingMaterialType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SwidType createSwidType() {
		SwidTypeImpl swidType = new SwidTypeImpl();
		return swidType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TagsType createTagsType() {
		TagsTypeImpl tagsType = new TagsTypeImpl();
		return tagsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetsType createTargetsType() {
		TargetsTypeImpl targetsType = new TargetsTypeImpl();
		return targetsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetType createTargetType() {
		TargetTypeImpl targetType = new TargetTypeImpl();
		return targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TasksType createTasksType() {
		TasksTypeImpl tasksType = new TasksTypeImpl();
		return tasksType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskType createTaskType() {
		TaskTypeImpl taskType = new TaskTypeImpl();
		return taskType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskTypesType createTaskTypesType() {
		TaskTypesTypeImpl taskTypesType = new TaskTypesTypeImpl();
		return taskTypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskTypesType1 createTaskTypesType1() {
		TaskTypesType1Impl taskTypesType1 = new TaskTypesType1Impl();
		return taskTypesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechnicalLimitationsType createTechnicalLimitationsType() {
		TechnicalLimitationsTypeImpl technicalLimitationsType = new TechnicalLimitationsTypeImpl();
		return technicalLimitationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToolsType createToolsType() {
		ToolsTypeImpl toolsType = new ToolsTypeImpl();
		return toolsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToolsType1 createToolsType1() {
		ToolsType1Impl toolsType1 = new ToolsType1Impl();
		return toolsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToolsType2 createToolsType2() {
		ToolsType2Impl toolsType2 = new ToolsType2Impl();
		return toolsType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToolsType3 createToolsType3() {
		ToolsType3Impl toolsType3 = new ToolsType3Impl();
		return toolsType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ToolType createToolType() {
		ToolTypeImpl toolType = new ToolTypeImpl();
		return toolType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TriggerType createTriggerType() {
		TriggerTypeImpl triggerType = new TriggerTypeImpl();
		return triggerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UseCasesType createUseCasesType() {
		UseCasesTypeImpl useCasesType = new UseCasesTypeImpl();
		return useCasesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsersType createUsersType() {
		UsersTypeImpl usersType = new UsersTypeImpl();
		return usersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionsType createVersionsType() {
		VersionsTypeImpl versionsType = new VersionsTypeImpl();
		return versionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersionType createVersionType() {
		VersionTypeImpl versionType = new VersionTypeImpl();
		return versionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumeType createVolumeType() {
		VolumeTypeImpl volumeType = new VolumeTypeImpl();
		return volumeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VulnerabilitiesType createVulnerabilitiesType() {
		VulnerabilitiesTypeImpl vulnerabilitiesType = new VulnerabilitiesTypeImpl();
		return vulnerabilitiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VulnerabilitiesType1 createVulnerabilitiesType1() {
		VulnerabilitiesType1Impl vulnerabilitiesType1 = new VulnerabilitiesType1Impl();
		return vulnerabilitiesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VulnerabilitySourceType createVulnerabilitySourceType() {
		VulnerabilitySourceTypeImpl vulnerabilitySourceType = new VulnerabilitySourceTypeImpl();
		return vulnerabilitySourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VulnerabilityType createVulnerabilityType() {
		VulnerabilityTypeImpl vulnerabilityType = new VulnerabilityTypeImpl();
		return vulnerabilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkflowsType createWorkflowsType() {
		WorkflowsTypeImpl workflowsType = new WorkflowsTypeImpl();
		return workflowsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkflowType createWorkflowType() {
		WorkflowTypeImpl workflowType = new WorkflowTypeImpl();
		return workflowType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkspacesType createWorkspacesType() {
		WorkspacesTypeImpl workspacesType = new WorkspacesTypeImpl();
		return workspacesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkspaceType createWorkspaceType() {
		WorkspaceTypeImpl workspaceType = new WorkspaceTypeImpl();
		return workspaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessModeEnum createAccessModeEnumFromString(EDataType eDataType, String initialValue) {
		AccessModeEnum result = AccessModeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessModeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityType createActivityTypeFromString(EDataType eDataType, String initialValue) {
		ActivityType result = ActivityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateType createAggregateTypeFromString(EDataType eDataType, String initialValue) {
		AggregateType result = AggregateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetTypeType createAssetTypeTypeFromString(EDataType eDataType, String initialValue) {
		AssetTypeType result = AssetTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssetTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificationLevelType createCertificationLevelTypeFromString(EDataType eDataType, String initialValue) {
		CertificationLevelType result = CertificationLevelType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCertificationLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classification createClassificationFromString(EDataType eDataType, String initialValue) {
		Classification result = Classification.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassificationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDataTypeEnumeration createComponentDataTypeEnumerationFromString(EDataType eDataType, String initialValue) {
		ComponentDataTypeEnumeration result = ComponentDataTypeEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentDataTypeEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoFunctionType createCryptoFunctionTypeFromString(EDataType eDataType, String initialValue) {
		CryptoFunctionType result = CryptoFunctionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCryptoFunctionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowType1 createDataFlowType1FromString(EDataType eDataType, String initialValue) {
		DataFlowType1 result = DataFlowType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataFlowType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encoding createEncodingFromString(EDataType eDataType, String initialValue) {
		Encoding result = Encoding.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncodingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergySourceType createEnergySourceTypeFromString(EDataType eDataType, String initialValue) {
		EnergySourceType result = EnergySourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnergySourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceTechnique createEvidenceTechniqueFromString(EDataType eDataType, String initialValue) {
		EvidenceTechnique result = EvidenceTechnique.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvidenceTechniqueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironmentType createExecutionEnvironmentTypeFromString(EDataType eDataType, String initialValue) {
		ExecutionEnvironmentType result = ExecutionEnvironmentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutionEnvironmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalReferenceType createExternalReferenceTypeFromString(EDataType eDataType, String initialValue) {
		ExternalReferenceType result = ExternalReferenceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExternalReferenceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashAlg createHashAlgFromString(EDataType eDataType, String initialValue) {
		HashAlg result = HashAlg.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHashAlgToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityFieldType createIdentityFieldTypeFromString(EDataType eDataType, String initialValue) {
		IdentityFieldType result = IdentityFieldType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentityFieldTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpactAnalysisAffectedStatusType createImpactAnalysisAffectedStatusTypeFromString(EDataType eDataType, String initialValue) {
		ImpactAnalysisAffectedStatusType result = ImpactAnalysisAffectedStatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImpactAnalysisAffectedStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpactAnalysisJustificationType createImpactAnalysisJustificationTypeFromString(EDataType eDataType, String initialValue) {
		ImpactAnalysisJustificationType result = ImpactAnalysisJustificationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImpactAnalysisJustificationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpactAnalysisResponsesType createImpactAnalysisResponsesTypeFromString(EDataType eDataType, String initialValue) {
		ImpactAnalysisResponsesType result = ImpactAnalysisResponsesType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImpactAnalysisResponsesTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpactAnalysisStateType createImpactAnalysisStateTypeFromString(EDataType eDataType, String initialValue) {
		ImpactAnalysisStateType result = ImpactAnalysisStateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImpactAnalysisStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationPlatformType createImplementationPlatformTypeFromString(EDataType eDataType, String initialValue) {
		ImplementationPlatformType result = ImplementationPlatformType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImplementationPlatformTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueClassification createIssueClassificationFromString(EDataType eDataType, String initialValue) {
		IssueClassification result = IssueClassification.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueClassificationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LicenseAcknowledgementEnumerationType createLicenseAcknowledgementEnumerationTypeFromString(EDataType eDataType, String initialValue) {
		LicenseAcknowledgementEnumerationType result = LicenseAcknowledgementEnumerationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLicenseAcknowledgementEnumerationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LicenseTypeEnum createLicenseTypeEnumFromString(EDataType eDataType, String initialValue) {
		LicenseTypeEnum result = LicenseTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLicenseTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifecyclePhaseType createLifecyclePhaseTypeFromString(EDataType eDataType, String initialValue) {
		LifecyclePhaseType result = LifecyclePhaseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLifecyclePhaseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MachineLearningApproachType createMachineLearningApproachTypeFromString(EDataType eDataType, String initialValue) {
		MachineLearningApproachType result = MachineLearningApproachType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMachineLearningApproachTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeType createModeTypeFromString(EDataType eDataType, String initialValue) {
		ModeType result = ModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputTypeEnum createOutputTypeEnumFromString(EDataType eDataType, String initialValue) {
		OutputTypeEnum result = OutputTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutputTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaddingType createPaddingTypeFromString(EDataType eDataType, String initialValue) {
		PaddingType result = PaddingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaddingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatchClassification createPatchClassificationFromString(EDataType eDataType, String initialValue) {
		PatchClassification result = PatchClassification.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatchClassificationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveTypeFromString(EDataType eDataType, String initialValue) {
		PrimitiveType result = PrimitiveType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScopeFromString(EDataType eDataType, String initialValue) {
		Scope result = Scope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScoreSourceType createScoreSourceTypeFromString(EDataType eDataType, String initialValue) {
		ScoreSourceType result = ScoreSourceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScoreSourceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityType createSeverityTypeFromString(EDataType eDataType, String initialValue) {
		SeverityType result = SeverityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeverityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType createStateTypeFromString(EDataType eDataType, String initialValue) {
		StateType result = StateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskTypeEnum createTaskTypeEnumFromString(EDataType eDataType, String initialValue) {
		TaskTypeEnum result = TaskTypeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskTypeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerTypeType createTriggerTypeTypeFromString(EDataType eDataType, String initialValue) {
		TriggerTypeType result = TriggerTypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
		TypeType result = TypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType1 createTypeType1FromString(EDataType eDataType, String initialValue) {
		TypeType1 result = TypeType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType createUnitTypeFromString(EDataType eDataType, String initialValue) {
		UnitType result = UnitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType1 createUnitType1FromString(EDataType eDataType, String initialValue) {
		UnitType1 result = UnitType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumeModeEnum createVolumeModeEnumFromString(EDataType eDataType, String initialValue) {
		VolumeModeEnum result = VolumeModeEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVolumeModeEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessModeEnum createAccessModeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createAccessModeEnumFromString(BOMPackage.eINSTANCE.getAccessModeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessModeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAccessModeEnumToString(BOMPackage.eINSTANCE.getAccessModeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityType createActivityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createActivityTypeFromString(BOMPackage.eINSTANCE.getActivityType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActivityTypeToString(BOMPackage.eINSTANCE.getActivityType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateType createAggregateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAggregateTypeFromString(BOMPackage.eINSTANCE.getAggregateType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAggregateTypeToString(BOMPackage.eINSTANCE.getAggregateType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssetTypeType createAssetTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAssetTypeTypeFromString(BOMPackage.eINSTANCE.getAssetTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssetTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAssetTypeTypeToString(BOMPackage.eINSTANCE.getAssetTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBomLinkDocumentTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBomLinkDocumentTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBomLinkElementTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBomLinkElementTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBomLinkTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createBomLinkDocumentTypeFromString(BOMPackage.eINSTANCE.getBomLinkDocumentType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createBomLinkElementTypeFromString(BOMPackage.eINSTANCE.getBomLinkElementType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBomLinkTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (BOMPackage.eINSTANCE.getBomLinkDocumentType().isInstance(instanceValue)) {
			try {
				String value = convertBomLinkDocumentTypeToString(BOMPackage.eINSTANCE.getBomLinkDocumentType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (BOMPackage.eINSTANCE.getBomLinkElementType().isInstance(instanceValue)) {
			try {
				String value = convertBomLinkElementTypeToString(BOMPackage.eINSTANCE.getBomLinkElementType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificationLevelType createCertificationLevelTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCertificationLevelTypeFromString(BOMPackage.eINSTANCE.getCertificationLevelType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCertificationLevelTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCertificationLevelTypeToString(BOMPackage.eINSTANCE.getCertificationLevelType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createClassicalSecurityLevelTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassicalSecurityLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classification createClassificationObjectFromString(EDataType eDataType, String initialValue) {
		return createClassificationFromString(BOMPackage.eINSTANCE.getClassification(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClassificationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertClassificationToString(BOMPackage.eINSTANCE.getClassification(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDataTypeEnumeration createComponentDataTypeEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createComponentDataTypeEnumerationFromString(BOMPackage.eINSTANCE.getComponentDataTypeEnumeration(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComponentDataTypeEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertComponentDataTypeEnumerationToString(BOMPackage.eINSTANCE.getComponentDataTypeEnumeration(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCpeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCpeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoFunctionType createCryptoFunctionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCryptoFunctionTypeFromString(BOMPackage.eINSTANCE.getCryptoFunctionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCryptoFunctionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCryptoFunctionTypeToString(BOMPackage.eINSTANCE.getCryptoFunctionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlowType1 createDataFlowTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDataFlowType1FromString(BOMPackage.eINSTANCE.getDataFlowType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataFlowTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDataFlowType1ToString(BOMPackage.eINSTANCE.getDataFlowType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createDecimalPercentTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalPercentTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encoding createEncodingObjectFromString(EDataType eDataType, String initialValue) {
		return createEncodingFromString(BOMPackage.eINSTANCE.getEncoding(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEncodingObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEncodingToString(BOMPackage.eINSTANCE.getEncoding(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergySourceType createEnergySourceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEnergySourceTypeFromString(BOMPackage.eINSTANCE.getEnergySourceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnergySourceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEnergySourceTypeToString(BOMPackage.eINSTANCE.getEnergySourceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceTechnique createEvidenceTechniqueObjectFromString(EDataType eDataType, String initialValue) {
		return createEvidenceTechniqueFromString(BOMPackage.eINSTANCE.getEvidenceTechnique(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEvidenceTechniqueObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEvidenceTechniqueToString(BOMPackage.eINSTANCE.getEvidenceTechnique(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEnvironmentType createExecutionEnvironmentTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createExecutionEnvironmentTypeFromString(BOMPackage.eINSTANCE.getExecutionEnvironmentType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExecutionEnvironmentTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExecutionEnvironmentTypeToString(BOMPackage.eINSTANCE.getExecutionEnvironmentType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalReferenceType createExternalReferenceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createExternalReferenceTypeFromString(BOMPackage.eINSTANCE.getExternalReferenceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExternalReferenceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExternalReferenceTypeToString(BOMPackage.eINSTANCE.getExternalReferenceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HashAlg createHashAlgObjectFromString(EDataType eDataType, String initialValue) {
		return createHashAlgFromString(BOMPackage.eINSTANCE.getHashAlg(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHashAlgObjectToString(EDataType eDataType, Object instanceValue) {
		return convertHashAlgToString(BOMPackage.eINSTANCE.getHashAlg(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createHashValueFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHashValueToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityFieldType createIdentityFieldTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createIdentityFieldTypeFromString(BOMPackage.eINSTANCE.getIdentityFieldType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdentityFieldTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIdentityFieldTypeToString(BOMPackage.eINSTANCE.getIdentityFieldType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpactAnalysisAffectedStatusType createImpactAnalysisAffectedStatusTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createImpactAnalysisAffectedStatusTypeFromString(BOMPackage.eINSTANCE.getImpactAnalysisAffectedStatusType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImpactAnalysisAffectedStatusTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertImpactAnalysisAffectedStatusTypeToString(BOMPackage.eINSTANCE.getImpactAnalysisAffectedStatusType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpactAnalysisJustificationType createImpactAnalysisJustificationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createImpactAnalysisJustificationTypeFromString(BOMPackage.eINSTANCE.getImpactAnalysisJustificationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImpactAnalysisJustificationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertImpactAnalysisJustificationTypeToString(BOMPackage.eINSTANCE.getImpactAnalysisJustificationType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpactAnalysisResponsesType createImpactAnalysisResponsesTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createImpactAnalysisResponsesTypeFromString(BOMPackage.eINSTANCE.getImpactAnalysisResponsesType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImpactAnalysisResponsesTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertImpactAnalysisResponsesTypeToString(BOMPackage.eINSTANCE.getImpactAnalysisResponsesType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpactAnalysisStateType createImpactAnalysisStateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createImpactAnalysisStateTypeFromString(BOMPackage.eINSTANCE.getImpactAnalysisStateType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImpactAnalysisStateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertImpactAnalysisStateTypeToString(BOMPackage.eINSTANCE.getImpactAnalysisStateType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationPlatformType createImplementationPlatformTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createImplementationPlatformTypeFromString(BOMPackage.eINSTANCE.getImplementationPlatformType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImplementationPlatformTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertImplementationPlatformTypeToString(BOMPackage.eINSTANCE.getImplementationPlatformType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IssueClassification createIssueClassificationObjectFromString(EDataType eDataType, String initialValue) {
		return createIssueClassificationFromString(BOMPackage.eINSTANCE.getIssueClassification(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIssueClassificationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIssueClassificationToString(BOMPackage.eINSTANCE.getIssueClassification(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LicenseAcknowledgementEnumerationType createLicenseAcknowledgementEnumerationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLicenseAcknowledgementEnumerationTypeFromString(BOMPackage.eINSTANCE.getLicenseAcknowledgementEnumerationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLicenseAcknowledgementEnumerationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLicenseAcknowledgementEnumerationTypeToString(BOMPackage.eINSTANCE.getLicenseAcknowledgementEnumerationType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LicenseTypeEnum createLicenseTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createLicenseTypeEnumFromString(BOMPackage.eINSTANCE.getLicenseTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLicenseTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLicenseTypeEnumToString(BOMPackage.eINSTANCE.getLicenseTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifecyclePhaseType createLifecyclePhaseTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLifecyclePhaseTypeFromString(BOMPackage.eINSTANCE.getLifecyclePhaseType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLifecyclePhaseTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLifecyclePhaseTypeToString(BOMPackage.eINSTANCE.getLifecyclePhaseType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLocaleTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLocaleTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MachineLearningApproachType createMachineLearningApproachTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMachineLearningApproachTypeFromString(BOMPackage.eINSTANCE.getMachineLearningApproachType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMachineLearningApproachTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMachineLearningApproachTypeToString(BOMPackage.eINSTANCE.getMachineLearningApproachType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMimeTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMimeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeType createModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createModeTypeFromString(BOMPackage.eINSTANCE.getModeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertModeTypeToString(BOMPackage.eINSTANCE.getModeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createNistQuantumSecurityLevelTypeFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNistQuantumSecurityLevelTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOpenCreTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOpenCreTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputTypeEnum createOutputTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createOutputTypeEnumFromString(BOMPackage.eINSTANCE.getOutputTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutputTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOutputTypeEnumToString(BOMPackage.eINSTANCE.getOutputTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaddingType createPaddingTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPaddingTypeFromString(BOMPackage.eINSTANCE.getPaddingType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPaddingTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPaddingTypeToString(BOMPackage.eINSTANCE.getPaddingType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatchClassification createPatchClassificationObjectFromString(EDataType eDataType, String initialValue) {
		return createPatchClassificationFromString(BOMPackage.eINSTANCE.getPatchClassification(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatchClassificationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPatchClassificationToString(BOMPackage.eINSTANCE.getPatchClassification(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPrimitiveTypeFromString(BOMPackage.eINSTANCE.getPrimitiveType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimitiveTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPrimitiveTypeToString(BOMPackage.eINSTANCE.getPrimitiveType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRefLinkTypeFromString(EDataType eDataType, String initialValue) {
		return createRefType4FromString(BOMPackage.eINSTANCE.getRefType4(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefLinkTypeToString(EDataType eDataType, Object instanceValue) {
		return convertRefType4ToString(BOMPackage.eINSTANCE.getRefType4(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRefTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createRefLinkTypeFromString(BOMPackage.eINSTANCE.getRefLinkType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createBomLinkElementTypeFromString(BOMPackage.eINSTANCE.getBomLinkElementType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (BOMPackage.eINSTANCE.getRefLinkType().isInstance(instanceValue)) {
			try {
				String value = convertRefLinkTypeToString(BOMPackage.eINSTANCE.getRefLinkType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (BOMPackage.eINSTANCE.getBomLinkElementType().isInstance(instanceValue)) {
			try {
				String value = convertBomLinkElementTypeToString(BOMPackage.eINSTANCE.getBomLinkElementType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRefType1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createRefLinkTypeFromString(BOMPackage.eINSTANCE.getRefLinkType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createBomLinkElementTypeFromString(BOMPackage.eINSTANCE.getBomLinkElementType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefType1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (BOMPackage.eINSTANCE.getRefLinkType().isInstance(instanceValue)) {
			try {
				String value = convertRefLinkTypeToString(BOMPackage.eINSTANCE.getRefLinkType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (BOMPackage.eINSTANCE.getBomLinkElementType().isInstance(instanceValue)) {
			try {
				String value = convertBomLinkElementTypeToString(BOMPackage.eINSTANCE.getBomLinkElementType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRefType2FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createRefLinkTypeFromString(BOMPackage.eINSTANCE.getRefLinkType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createBomLinkElementTypeFromString(BOMPackage.eINSTANCE.getBomLinkElementType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefType2ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (BOMPackage.eINSTANCE.getRefLinkType().isInstance(instanceValue)) {
			try {
				String value = convertRefLinkTypeToString(BOMPackage.eINSTANCE.getRefLinkType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (BOMPackage.eINSTANCE.getBomLinkElementType().isInstance(instanceValue)) {
			try {
				String value = convertBomLinkElementTypeToString(BOMPackage.eINSTANCE.getBomLinkElementType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRefType3FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createRefLinkTypeFromString(BOMPackage.eINSTANCE.getRefLinkType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createBomLinkTypeFromString(BOMPackage.eINSTANCE.getBomLinkType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefType3ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (BOMPackage.eINSTANCE.getRefLinkType().isInstance(instanceValue)) {
			try {
				String value = convertRefLinkTypeToString(BOMPackage.eINSTANCE.getRefLinkType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (BOMPackage.eINSTANCE.getBomLinkType().isInstance(instanceValue)) {
			try {
				String value = convertBomLinkTypeToString(BOMPackage.eINSTANCE.getBomLinkType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRefType4FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRefType4ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScopeObjectFromString(EDataType eDataType, String initialValue) {
		return createScopeFromString(BOMPackage.eINSTANCE.getScope(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertScopeToString(BOMPackage.eINSTANCE.getScope(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScoreSourceType createScoreSourceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createScoreSourceTypeFromString(BOMPackage.eINSTANCE.getScoreSourceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScoreSourceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertScoreSourceTypeToString(BOMPackage.eINSTANCE.getScoreSourceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createScoreTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScoreTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createScoreType1FromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScoreType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeverityType createSeverityTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSeverityTypeFromString(BOMPackage.eINSTANCE.getSeverityType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeverityTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSeverityTypeToString(BOMPackage.eINSTANCE.getSeverityType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateType createStateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStateTypeFromString(BOMPackage.eINSTANCE.getStateType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStateTypeToString(BOMPackage.eINSTANCE.getStateType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskTypeEnum createTaskTypeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createTaskTypeEnumFromString(BOMPackage.eINSTANCE.getTaskTypeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaskTypeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTaskTypeEnumToString(BOMPackage.eINSTANCE.getTaskTypeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerTypeType createTriggerTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTriggerTypeTypeFromString(BOMPackage.eINSTANCE.getTriggerTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTriggerTypeTypeToString(BOMPackage.eINSTANCE.getTriggerTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeTypeFromString(BOMPackage.eINSTANCE.getTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeToString(BOMPackage.eINSTANCE.getTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType1 createTypeTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createTypeType1FromString(BOMPackage.eINSTANCE.getTypeType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertTypeType1ToString(BOMPackage.eINSTANCE.getTypeType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType createUnitTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUnitTypeFromString(BOMPackage.eINSTANCE.getUnitType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUnitTypeToString(BOMPackage.eINSTANCE.getUnitType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitType1 createUnitTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createUnitType1FromString(BOMPackage.eINSTANCE.getUnitType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertUnitType1ToString(BOMPackage.eINSTANCE.getUnitType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUrlTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createBomLinkElementTypeFromString(BOMPackage.eINSTANCE.getBomLinkElementType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUrlTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (BOMPackage.eINSTANCE.getBomLinkElementType().isInstance(instanceValue)) {
			try {
				String value = convertBomLinkElementTypeToString(BOMPackage.eINSTANCE.getBomLinkElementType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUrlType1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createBomLinkElementTypeFromString(BOMPackage.eINSTANCE.getBomLinkElementType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUrlType1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (BOMPackage.eINSTANCE.getBomLinkElementType().isInstance(instanceValue)) {
			try {
				String value = convertBomLinkElementTypeToString(BOMPackage.eINSTANCE.getBomLinkElementType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUrlType2FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createBomLinkTypeFromString(BOMPackage.eINSTANCE.getBomLinkType(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUrlType2ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (BOMPackage.eINSTANCE.getBomLinkType().isInstance(instanceValue)) {
			try {
				String value = convertBomLinkTypeToString(BOMPackage.eINSTANCE.getBomLinkType(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUrnUuidFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUrnUuidToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVersionRangeTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NORMALIZED_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionRangeTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVersionType1FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NORMALIZED_STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionType1ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NORMALIZED_STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VolumeModeEnum createVolumeModeEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createVolumeModeEnumFromString(BOMPackage.eINSTANCE.getVolumeModeEnum(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVolumeModeEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVolumeModeEnumToString(BOMPackage.eINSTANCE.getVolumeModeEnum(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BOMPackage getBOMPackage() {
		return (BOMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BOMPackage getPackage() {
		return BOMPackage.eINSTANCE;
	}

} //BOMFactoryImpl
