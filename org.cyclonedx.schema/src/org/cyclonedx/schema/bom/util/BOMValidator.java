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
package org.cyclonedx.schema.bom.util;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Map;

import org.cyclonedx.schema.bom.*;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage
 * @generated
 */
public class BOMValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BOMValidator INSTANCE = new BOMValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.cyclonedx.schema.bom";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOMValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return BOMPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case BOMPackage.ADVISORIES_TYPE:
				return validateAdvisoriesType((AdvisoriesType)value, diagnostics, context);
			case BOMPackage.ADVISORY_TYPE:
				return validateAdvisoryType((AdvisoryType)value, diagnostics, context);
			case BOMPackage.AFFECTS_TYPE:
				return validateAffectsType((AffectsType)value, diagnostics, context);
			case BOMPackage.AFFIRMATION_TYPE:
				return validateAffirmationType((AffirmationType)value, diagnostics, context);
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE:
				return validateAlgorithmPropertiesType((AlgorithmPropertiesType)value, diagnostics, context);
			case BOMPackage.ALGORITHMS_TYPE:
				return validateAlgorithmsType((AlgorithmsType)value, diagnostics, context);
			case BOMPackage.ALIASES_TYPE:
				return validateAliasesType((AliasesType)value, diagnostics, context);
			case BOMPackage.ALIASES_TYPE1:
				return validateAliasesType1((AliasesType1)value, diagnostics, context);
			case BOMPackage.ALT_IDS_TYPE:
				return validateAltIdsType((AltIdsType)value, diagnostics, context);
			case BOMPackage.ANALYSIS_TYPE:
				return validateAnalysisType((AnalysisType)value, diagnostics, context);
			case BOMPackage.ANNOTATIONS_TYPE:
				return validateAnnotationsType((AnnotationsType)value, diagnostics, context);
			case BOMPackage.ANNOTATION_TYPE:
				return validateAnnotationType((AnnotationType)value, diagnostics, context);
			case BOMPackage.ANNOTATOR_CHOICE_TYPE:
				return validateAnnotatorChoiceType((AnnotatorChoiceType)value, diagnostics, context);
			case BOMPackage.APPROACH_TYPE:
				return validateApproachType((ApproachType)value, diagnostics, context);
			case BOMPackage.ASSEMBLIES_TYPE:
				return validateAssembliesType((AssembliesType)value, diagnostics, context);
			case BOMPackage.ASSESSORS_TYPE:
				return validateAssessorsType((AssessorsType)value, diagnostics, context);
			case BOMPackage.ASSESSOR_TYPE:
				return validateAssessorType((AssessorType)value, diagnostics, context);
			case BOMPackage.ATTACHED_TEXT_TYPE:
				return validateAttachedTextType((AttachedTextType)value, diagnostics, context);
			case BOMPackage.ATTESTATIONS_TYPE:
				return validateAttestationsType((AttestationsType)value, diagnostics, context);
			case BOMPackage.ATTESTATION_TYPE:
				return validateAttestationType((AttestationType)value, diagnostics, context);
			case BOMPackage.AUTHORS_TYPE:
				return validateAuthorsType((AuthorsType)value, diagnostics, context);
			case BOMPackage.AUTHORS_TYPE1:
				return validateAuthorsType1((AuthorsType1)value, diagnostics, context);
			case BOMPackage.BOM_REFERENCE_TYPE:
				return validateBomReferenceType((BomReferenceType)value, diagnostics, context);
			case BOMPackage.BOM_TYPE:
				return validateBomType((BomType)value, diagnostics, context);
			case BOMPackage.CALLSTACK_TYPE:
				return validateCallstackType((CallstackType)value, diagnostics, context);
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE:
				return validateCertificatePropertiesType((CertificatePropertiesType)value, diagnostics, context);
			case BOMPackage.CIPHER_SUITES_TYPE:
				return validateCipherSuitesType((CipherSuitesType)value, diagnostics, context);
			case BOMPackage.CIPHER_SUITE_TYPE:
				return validateCipherSuiteType((CipherSuiteType)value, diagnostics, context);
			case BOMPackage.CLAIMS_TYPE:
				return validateClaimsType((ClaimsType)value, diagnostics, context);
			case BOMPackage.CLAIMS_TYPE1:
				return validateClaimsType1((ClaimsType1)value, diagnostics, context);
			case BOMPackage.CLAIM_TYPE:
				return validateClaimType((ClaimType)value, diagnostics, context);
			case BOMPackage.CO2_MEASURE_TYPE:
				return validateCo2MeasureType((Co2MeasureType)value, diagnostics, context);
			case BOMPackage.COLLECTION_TYPE:
				return validateCollectionType((CollectionType)value, diagnostics, context);
			case BOMPackage.COLLECTION_TYPE1:
				return validateCollectionType1((CollectionType1)value, diagnostics, context);
			case BOMPackage.COMMANDS_TYPE:
				return validateCommandsType((CommandsType)value, diagnostics, context);
			case BOMPackage.COMMAND_TYPE:
				return validateCommandType((CommandType)value, diagnostics, context);
			case BOMPackage.COMMITS_TYPE:
				return validateCommitsType((CommitsType)value, diagnostics, context);
			case BOMPackage.COMMIT_TYPE:
				return validateCommitType((CommitType)value, diagnostics, context);
			case BOMPackage.COMPONENT:
				return validateComponent((Component)value, diagnostics, context);
			case BOMPackage.COMPONENT_DATA_TYPE:
				return validateComponentDataType((ComponentDataType)value, diagnostics, context);
			case BOMPackage.COMPONENT_EVIDENCE_TYPE:
				return validateComponentEvidenceType((ComponentEvidenceType)value, diagnostics, context);
			case BOMPackage.COMPONENTS_TYPE:
				return validateComponentsType((ComponentsType)value, diagnostics, context);
			case BOMPackage.COMPONENTS_TYPE1:
				return validateComponentsType1((ComponentsType1)value, diagnostics, context);
			case BOMPackage.COMPONENTS_TYPE2:
				return validateComponentsType2((ComponentsType2)value, diagnostics, context);
			case BOMPackage.COMPOSITIONS_TYPE:
				return validateCompositionsType((CompositionsType)value, diagnostics, context);
			case BOMPackage.COMPOSITION_TYPE:
				return validateCompositionType((CompositionType)value, diagnostics, context);
			case BOMPackage.CONDITIONS_TYPE:
				return validateConditionsType((ConditionsType)value, diagnostics, context);
			case BOMPackage.CONDITION_TYPE:
				return validateConditionType((ConditionType)value, diagnostics, context);
			case BOMPackage.CONFIDENCE_INTERVAL_TYPE:
				return validateConfidenceIntervalType((ConfidenceIntervalType)value, diagnostics, context);
			case BOMPackage.CONFIDENCE_TYPE:
				return validateConfidenceType((ConfidenceType)value, diagnostics, context);
			case BOMPackage.CONFORMANCE_TYPE:
				return validateConformanceType((ConformanceType)value, diagnostics, context);
			case BOMPackage.CONSIDERATIONS_TYPE:
				return validateConsiderationsType((ConsiderationsType)value, diagnostics, context);
			case BOMPackage.CONTENTS_TYPE:
				return validateContentsType((ContentsType)value, diagnostics, context);
			case BOMPackage.CONTENTS_TYPE1:
				return validateContentsType1((ContentsType1)value, diagnostics, context);
			case BOMPackage.COPYRIGHTS_TYPE:
				return validateCopyrightsType((CopyrightsType)value, diagnostics, context);
			case BOMPackage.COUNTER_CLAIMS_TYPE:
				return validateCounterClaimsType((CounterClaimsType)value, diagnostics, context);
			case BOMPackage.CREDITS_TYPE:
				return validateCreditsType((CreditsType)value, diagnostics, context);
			case BOMPackage.CRYPTO_FUNCTIONS_TYPE:
				return validateCryptoFunctionsType((CryptoFunctionsType)value, diagnostics, context);
			case BOMPackage.CRYPTO_PROPERTIES_TYPE:
				return validateCryptoPropertiesType((CryptoPropertiesType)value, diagnostics, context);
			case BOMPackage.CUSTODIANS_TYPE:
				return validateCustodiansType((CustodiansType)value, diagnostics, context);
			case BOMPackage.CWES_TYPE:
				return validateCwesType((CwesType)value, diagnostics, context);
			case BOMPackage.DATA_CLASSIFICATION_TYPE:
				return validateDataClassificationType((DataClassificationType)value, diagnostics, context);
			case BOMPackage.DATAFLOW_TYPE:
				return validateDataflowType((DataflowType)value, diagnostics, context);
			case BOMPackage.DATA_GOVERNANCE:
				return validateDataGovernance((DataGovernance)value, diagnostics, context);
			case BOMPackage.DATASETS_TYPE:
				return validateDatasetsType((DatasetsType)value, diagnostics, context);
			case BOMPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case BOMPackage.DATA_TYPE1:
				return validateDataType1((DataType1)value, diagnostics, context);
			case BOMPackage.DECLARATIONS_TYPE:
				return validateDeclarationsType((DeclarationsType)value, diagnostics, context);
			case BOMPackage.DEFINITIONS_TYPE:
				return validateDefinitionsType((DefinitionsType)value, diagnostics, context);
			case BOMPackage.DEPENDENCIES_TYPE:
				return validateDependenciesType((DependenciesType)value, diagnostics, context);
			case BOMPackage.DEPENDENCIES_TYPE1:
				return validateDependenciesType1((DependenciesType1)value, diagnostics, context);
			case BOMPackage.DEPENDENCY_TYPE:
				return validateDependencyType((DependencyType)value, diagnostics, context);
			case BOMPackage.DESCRIPTIONS_TYPE:
				return validateDescriptionsType((DescriptionsType)value, diagnostics, context);
			case BOMPackage.DESTINATION_TYPE:
				return validateDestinationType((DestinationType)value, diagnostics, context);
			case BOMPackage.DIFF_TYPE:
				return validateDiffType((DiffType)value, diagnostics, context);
			case BOMPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case BOMPackage.ENDPOINTS_TYPE:
				return validateEndpointsType((EndpointsType)value, diagnostics, context);
			case BOMPackage.ENERGY_CONSUMPTIONS_TYPE:
				return validateEnergyConsumptionsType((EnergyConsumptionsType)value, diagnostics, context);
			case BOMPackage.ENERGY_CONSUMPTION_TYPE:
				return validateEnergyConsumptionType((EnergyConsumptionType)value, diagnostics, context);
			case BOMPackage.ENERGY_MEASURE_TYPE:
				return validateEnergyMeasureType((EnergyMeasureType)value, diagnostics, context);
			case BOMPackage.ENERGY_PROVIDER_TYPE:
				return validateEnergyProviderType((EnergyProviderType)value, diagnostics, context);
			case BOMPackage.ENVIRONMENTAL_CONSIDERATIONS_TYPE:
				return validateEnvironmentalConsiderationsType((EnvironmentalConsiderationsType)value, diagnostics, context);
			case BOMPackage.ENVIRONMENT_VARS_TYPE:
				return validateEnvironmentVarsType((EnvironmentVarsType)value, diagnostics, context);
			case BOMPackage.ENVIRONMENT_VARS_TYPE1:
				return validateEnvironmentVarsType1((EnvironmentVarsType1)value, diagnostics, context);
			case BOMPackage.ETHICAL_CONSIDERATIONS_TYPE:
				return validateEthicalConsiderationsType((EthicalConsiderationsType)value, diagnostics, context);
			case BOMPackage.ETHICAL_CONSIDERATION_TYPE:
				return validateEthicalConsiderationType((EthicalConsiderationType)value, diagnostics, context);
			case BOMPackage.EVENT_TYPE:
				return validateEventType((EventType)value, diagnostics, context);
			case BOMPackage.EVIDENCE_TYPE:
				return validateEvidenceType((EvidenceType)value, diagnostics, context);
			case BOMPackage.EVIDENCE_TYPE1:
				return validateEvidenceType1((EvidenceType1)value, diagnostics, context);
			case BOMPackage.EXPRESSION_TYPE:
				return validateExpressionType((ExpressionType)value, diagnostics, context);
			case BOMPackage.EXTERNAL_REFERENCE:
				return validateExternalReference((ExternalReference)value, diagnostics, context);
			case BOMPackage.EXTERNAL_REFERENCES:
				return validateExternalReferences((ExternalReferences)value, diagnostics, context);
			case BOMPackage.FAIRNESS_ASSESSMENTS_TYPE:
				return validateFairnessAssessmentsType((FairnessAssessmentsType)value, diagnostics, context);
			case BOMPackage.FAIRNESS_ASSESSMENT_TYPE:
				return validateFairnessAssessmentType((FairnessAssessmentType)value, diagnostics, context);
			case BOMPackage.FORMULATION_TYPE:
				return validateFormulationType((FormulationType)value, diagnostics, context);
			case BOMPackage.FORMULA_TYPE:
				return validateFormulaType((FormulaType)value, diagnostics, context);
			case BOMPackage.FRAMES_TYPE:
				return validateFramesType((FramesType)value, diagnostics, context);
			case BOMPackage.FRAME_TYPE:
				return validateFrameType((FrameType)value, diagnostics, context);
			case BOMPackage.GRAPHICS_COLLECTION_TYPE:
				return validateGraphicsCollectionType((GraphicsCollectionType)value, diagnostics, context);
			case BOMPackage.GRAPHICS_TYPE:
				return validateGraphicsType((GraphicsType)value, diagnostics, context);
			case BOMPackage.GRAPHIC_TYPE:
				return validateGraphicType((GraphicType)value, diagnostics, context);
			case BOMPackage.GRAPHIC_TYPE1:
				return validateGraphicType1((GraphicType1)value, diagnostics, context);
			case BOMPackage.HASHES_TYPE:
				return validateHashesType((HashesType)value, diagnostics, context);
			case BOMPackage.HASHES_TYPE1:
				return validateHashesType1((HashesType1)value, diagnostics, context);
			case BOMPackage.HASHES_TYPE2:
				return validateHashesType2((HashesType2)value, diagnostics, context);
			case BOMPackage.HASH_TYPE:
				return validateHashType((HashType)value, diagnostics, context);
			case BOMPackage.IDENTIFIABLE_ACTION_TYPE:
				return validateIdentifiableActionType((IdentifiableActionType)value, diagnostics, context);
			case BOMPackage.IDENTIFIERS_TYPE:
				return validateIdentifiersType((IdentifiersType)value, diagnostics, context);
			case BOMPackage.IDENTITY_TYPE:
				return validateIdentityType((IdentityType)value, diagnostics, context);
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE:
				return validateIkev2TransformTypesType((Ikev2TransformTypesType)value, diagnostics, context);
			case BOMPackage.INDIVIDUALS_TYPE:
				return validateIndividualsType((IndividualsType)value, diagnostics, context);
			case BOMPackage.INPUTS_TYPE:
				return validateInputsType((InputsType)value, diagnostics, context);
			case BOMPackage.INPUTS_TYPE1:
				return validateInputsType1((InputsType1)value, diagnostics, context);
			case BOMPackage.INPUTS_TYPE2:
				return validateInputsType2((InputsType2)value, diagnostics, context);
			case BOMPackage.INPUTS_TYPE3:
				return validateInputsType3((InputsType3)value, diagnostics, context);
			case BOMPackage.INPUT_TYPE:
				return validateInputType((InputType)value, diagnostics, context);
			case BOMPackage.INPUT_TYPE1:
				return validateInputType1((InputType1)value, diagnostics, context);
			case BOMPackage.ISSUE_TYPE:
				return validateIssueType((IssueType)value, diagnostics, context);
			case BOMPackage.LEVELS_TYPE:
				return validateLevelsType((LevelsType)value, diagnostics, context);
			case BOMPackage.LEVEL_TYPE:
				return validateLevelType((LevelType)value, diagnostics, context);
			case BOMPackage.LICENSE_CHOICE_TYPE:
				return validateLicenseChoiceType((LicenseChoiceType)value, diagnostics, context);
			case BOMPackage.LICENSEE_TYPE:
				return validateLicenseeType((LicenseeType)value, diagnostics, context);
			case BOMPackage.LICENSE_TYPE:
				return validateLicenseType((LicenseType)value, diagnostics, context);
			case BOMPackage.LICENSE_TYPES_TYPE:
				return validateLicenseTypesType((LicenseTypesType)value, diagnostics, context);
			case BOMPackage.LICENSING_TYPE:
				return validateLicensingType((LicensingType)value, diagnostics, context);
			case BOMPackage.LICENSOR_TYPE:
				return validateLicensorType((LicensorType)value, diagnostics, context);
			case BOMPackage.LIFECYCLES_TYPE:
				return validateLifecyclesType((LifecyclesType)value, diagnostics, context);
			case BOMPackage.LIFECYCLE_TYPE:
				return validateLifecycleType((LifecycleType)value, diagnostics, context);
			case BOMPackage.MAP_TYPE:
				return validateMapType((MapType)value, diagnostics, context);
			case BOMPackage.METADATA:
				return validateMetadata((Metadata)value, diagnostics, context);
			case BOMPackage.METHODS_TYPE:
				return validateMethodsType((MethodsType)value, diagnostics, context);
			case BOMPackage.METHOD_TYPE:
				return validateMethodType((MethodType)value, diagnostics, context);
			case BOMPackage.MITIGATION_STRATEGIES_TYPE:
				return validateMitigationStrategiesType((MitigationStrategiesType)value, diagnostics, context);
			case BOMPackage.MITIGATION_STRATEGIES_TYPE1:
				return validateMitigationStrategiesType1((MitigationStrategiesType1)value, diagnostics, context);
			case BOMPackage.MODEL_CARD_TYPE:
				return validateModelCardType((ModelCardType)value, diagnostics, context);
			case BOMPackage.MODEL_PARAMETERS_TYPE:
				return validateModelParametersType((ModelParametersType)value, diagnostics, context);
			case BOMPackage.NOTES_TYPE:
				return validateNotesType((NotesType)value, diagnostics, context);
			case BOMPackage.NOTE_TYPE:
				return validateNoteType((NoteType)value, diagnostics, context);
			case BOMPackage.OCCURRENCES_TYPE:
				return validateOccurrencesType((OccurrencesType)value, diagnostics, context);
			case BOMPackage.OCCURRENCE_TYPE:
				return validateOccurrenceType((OccurrenceType)value, diagnostics, context);
			case BOMPackage.ORGANIZATIONAL_CONTACT:
				return validateOrganizationalContact((OrganizationalContact)value, diagnostics, context);
			case BOMPackage.ORGANIZATIONAL_ENTITY:
				return validateOrganizationalEntity((OrganizationalEntity)value, diagnostics, context);
			case BOMPackage.ORGANIZATION_OR_INDIVIDUAL_TYPE:
				return validateOrganizationOrIndividualType((OrganizationOrIndividualType)value, diagnostics, context);
			case BOMPackage.ORGANIZATIONS_TYPE:
				return validateOrganizationsType((OrganizationsType)value, diagnostics, context);
			case BOMPackage.ORGANIZATIONS_TYPE1:
				return validateOrganizationsType1((OrganizationsType1)value, diagnostics, context);
			case BOMPackage.OUTPUTS_TYPE:
				return validateOutputsType((OutputsType)value, diagnostics, context);
			case BOMPackage.OUTPUTS_TYPE1:
				return validateOutputsType1((OutputsType1)value, diagnostics, context);
			case BOMPackage.OUTPUTS_TYPE2:
				return validateOutputsType2((OutputsType2)value, diagnostics, context);
			case BOMPackage.OUTPUTS_TYPE3:
				return validateOutputsType3((OutputsType3)value, diagnostics, context);
			case BOMPackage.OUTPUT_TYPE:
				return validateOutputType((OutputType)value, diagnostics, context);
			case BOMPackage.OUTPUT_TYPE1:
				return validateOutputType1((OutputType1)value, diagnostics, context);
			case BOMPackage.OWNERS_TYPE:
				return validateOwnersType((OwnersType)value, diagnostics, context);
			case BOMPackage.PARAMETERS_TYPE:
				return validateParametersType((ParametersType)value, diagnostics, context);
			case BOMPackage.PARAMETERS_TYPE1:
				return validateParametersType1((ParametersType1)value, diagnostics, context);
			case BOMPackage.PARAMETER_TYPE:
				return validateParameterType((ParameterType)value, diagnostics, context);
			case BOMPackage.PATCHES_TYPE:
				return validatePatchesType((PatchesType)value, diagnostics, context);
			case BOMPackage.PATCH_TYPE:
				return validatePatchType((PatchType)value, diagnostics, context);
			case BOMPackage.PEDIGREE_TYPE:
				return validatePedigreeType((PedigreeType)value, diagnostics, context);
			case BOMPackage.PERFORMANCE_METRICS_TYPE:
				return validatePerformanceMetricsType((PerformanceMetricsType)value, diagnostics, context);
			case BOMPackage.PERFORMANCE_METRIC_TYPE:
				return validatePerformanceMetricType((PerformanceMetricType)value, diagnostics, context);
			case BOMPackage.PERFORMANCE_TRADEOFFS_TYPE:
				return validatePerformanceTradeoffsType((PerformanceTradeoffsType)value, diagnostics, context);
			case BOMPackage.POSTAL_ADDRESS_TYPE:
				return validatePostalAddressType((PostalAddressType)value, diagnostics, context);
			case BOMPackage.PROOF_OF_CONCEPT_TYPE:
				return validateProofOfConceptType((ProofOfConceptType)value, diagnostics, context);
			case BOMPackage.PROPERTIES_TYPE:
				return validatePropertiesType((PropertiesType)value, diagnostics, context);
			case BOMPackage.PROPERTY_TYPE:
				return validatePropertyType((PropertyType)value, diagnostics, context);
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE:
				return validateProtocolPropertiesType((ProtocolPropertiesType)value, diagnostics, context);
			case BOMPackage.PROVIDES_TYPE:
				return validateProvidesType((ProvidesType)value, diagnostics, context);
			case BOMPackage.PURCHASER_TYPE:
				return validatePurchaserType((PurchaserType)value, diagnostics, context);
			case BOMPackage.QUANTITATIVE_ANALYSIS_TYPE:
				return validateQuantitativeAnalysisType((QuantitativeAnalysisType)value, diagnostics, context);
			case BOMPackage.RATINGS_TYPE:
				return validateRatingsType((RatingsType)value, diagnostics, context);
			case BOMPackage.RATING_TYPE:
				return validateRatingType((RatingType)value, diagnostics, context);
			case BOMPackage.REFERENCES_TYPE:
				return validateReferencesType((ReferencesType)value, diagnostics, context);
			case BOMPackage.REFERENCES_TYPE1:
				return validateReferencesType1((ReferencesType1)value, diagnostics, context);
			case BOMPackage.REFERENCE_TYPE:
				return validateReferenceType((ReferenceType)value, diagnostics, context);
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE:
				return validateRelatedCryptoMaterialPropertiesType((RelatedCryptoMaterialPropertiesType)value, diagnostics, context);
			case BOMPackage.RELEASE_NOTES_TYPE:
				return validateReleaseNotesType((ReleaseNotesType)value, diagnostics, context);
			case BOMPackage.REQUIREMENTS_TYPE:
				return validateRequirementsType((RequirementsType)value, diagnostics, context);
			case BOMPackage.REQUIREMENTS_TYPE1:
				return validateRequirementsType1((RequirementsType1)value, diagnostics, context);
			case BOMPackage.REQUIREMENT_TYPE:
				return validateRequirementType((RequirementType)value, diagnostics, context);
			case BOMPackage.RESOLVES_TYPE:
				return validateResolvesType((ResolvesType)value, diagnostics, context);
			case BOMPackage.RESOLVES_TYPE1:
				return validateResolvesType1((ResolvesType1)value, diagnostics, context);
			case BOMPackage.RESOURCE_REFERENCES_TYPE:
				return validateResourceReferencesType((ResourceReferencesType)value, diagnostics, context);
			case BOMPackage.RESOURCE_REFERENCE_TYPE:
				return validateResourceReferenceType((ResourceReferenceType)value, diagnostics, context);
			case BOMPackage.RESPONSES_TYPE:
				return validateResponsesType((ResponsesType)value, diagnostics, context);
			case BOMPackage.SECURED_BY_TYPE:
				return validateSecuredByType((SecuredByType)value, diagnostics, context);
			case BOMPackage.SERVICE:
				return validateService((Service)value, diagnostics, context);
			case BOMPackage.SERVICES_TYPE:
				return validateServicesType((ServicesType)value, diagnostics, context);
			case BOMPackage.SERVICES_TYPE1:
				return validateServicesType1((ServicesType1)value, diagnostics, context);
			case BOMPackage.SERVICES_TYPE2:
				return validateServicesType2((ServicesType2)value, diagnostics, context);
			case BOMPackage.SIGNATORIES_TYPE:
				return validateSignatoriesType((SignatoriesType)value, diagnostics, context);
			case BOMPackage.SIGNATORY_TYPE:
				return validateSignatoryType((SignatoryType)value, diagnostics, context);
			case BOMPackage.SOURCE_TYPE:
				return validateSourceType((SourceType)value, diagnostics, context);
			case BOMPackage.SOURCE_TYPE1:
				return validateSourceType1((SourceType1)value, diagnostics, context);
			case BOMPackage.STANDARD:
				return validateStandard((Standard)value, diagnostics, context);
			case BOMPackage.STANDARDS_TYPE:
				return validateStandardsType((StandardsType)value, diagnostics, context);
			case BOMPackage.STEPS_TYPE:
				return validateStepsType((StepsType)value, diagnostics, context);
			case BOMPackage.STEPS_TYPE1:
				return validateStepsType1((StepsType1)value, diagnostics, context);
			case BOMPackage.STEP_TYPE:
				return validateStepType((StepType)value, diagnostics, context);
			case BOMPackage.STEWARDS_TYPE:
				return validateStewardsType((StewardsType)value, diagnostics, context);
			case BOMPackage.SUBJECTS_TYPE:
				return validateSubjectsType((SubjectsType)value, diagnostics, context);
			case BOMPackage.SUPPORTING_MATERIAL_TYPE:
				return validateSupportingMaterialType((SupportingMaterialType)value, diagnostics, context);
			case BOMPackage.SWID_TYPE:
				return validateSwidType((SwidType)value, diagnostics, context);
			case BOMPackage.TAGS_TYPE:
				return validateTagsType((TagsType)value, diagnostics, context);
			case BOMPackage.TARGETS_TYPE:
				return validateTargetsType((TargetsType)value, diagnostics, context);
			case BOMPackage.TARGET_TYPE:
				return validateTargetType((TargetType)value, diagnostics, context);
			case BOMPackage.TASKS_TYPE:
				return validateTasksType((TasksType)value, diagnostics, context);
			case BOMPackage.TASK_TYPE:
				return validateTaskType((TaskType)value, diagnostics, context);
			case BOMPackage.TASK_TYPES_TYPE:
				return validateTaskTypesType((TaskTypesType)value, diagnostics, context);
			case BOMPackage.TASK_TYPES_TYPE1:
				return validateTaskTypesType1((TaskTypesType1)value, diagnostics, context);
			case BOMPackage.TECHNICAL_LIMITATIONS_TYPE:
				return validateTechnicalLimitationsType((TechnicalLimitationsType)value, diagnostics, context);
			case BOMPackage.TOOLS_TYPE:
				return validateToolsType((ToolsType)value, diagnostics, context);
			case BOMPackage.TOOLS_TYPE1:
				return validateToolsType1((ToolsType1)value, diagnostics, context);
			case BOMPackage.TOOLS_TYPE2:
				return validateToolsType2((ToolsType2)value, diagnostics, context);
			case BOMPackage.TOOLS_TYPE3:
				return validateToolsType3((ToolsType3)value, diagnostics, context);
			case BOMPackage.TOOL_TYPE:
				return validateToolType((ToolType)value, diagnostics, context);
			case BOMPackage.TRIGGER_TYPE:
				return validateTriggerType((TriggerType)value, diagnostics, context);
			case BOMPackage.USE_CASES_TYPE:
				return validateUseCasesType((UseCasesType)value, diagnostics, context);
			case BOMPackage.USERS_TYPE:
				return validateUsersType((UsersType)value, diagnostics, context);
			case BOMPackage.VERSIONS_TYPE:
				return validateVersionsType((VersionsType)value, diagnostics, context);
			case BOMPackage.VERSION_TYPE:
				return validateVersionType((VersionType)value, diagnostics, context);
			case BOMPackage.VOLUME_TYPE:
				return validateVolumeType((VolumeType)value, diagnostics, context);
			case BOMPackage.VULNERABILITIES_TYPE:
				return validateVulnerabilitiesType((VulnerabilitiesType)value, diagnostics, context);
			case BOMPackage.VULNERABILITIES_TYPE1:
				return validateVulnerabilitiesType1((VulnerabilitiesType1)value, diagnostics, context);
			case BOMPackage.VULNERABILITY_SOURCE_TYPE:
				return validateVulnerabilitySourceType((VulnerabilitySourceType)value, diagnostics, context);
			case BOMPackage.VULNERABILITY_TYPE:
				return validateVulnerabilityType((VulnerabilityType)value, diagnostics, context);
			case BOMPackage.WORKFLOWS_TYPE:
				return validateWorkflowsType((WorkflowsType)value, diagnostics, context);
			case BOMPackage.WORKFLOW_TYPE:
				return validateWorkflowType((WorkflowType)value, diagnostics, context);
			case BOMPackage.WORKSPACES_TYPE:
				return validateWorkspacesType((WorkspacesType)value, diagnostics, context);
			case BOMPackage.WORKSPACE_TYPE:
				return validateWorkspaceType((WorkspaceType)value, diagnostics, context);
			case BOMPackage.ACCESS_MODE_ENUM:
				return validateAccessModeEnum((AccessModeEnum)value, diagnostics, context);
			case BOMPackage.ACTIVITY_TYPE:
				return validateActivityType((ActivityType)value, diagnostics, context);
			case BOMPackage.AGGREGATE_TYPE:
				return validateAggregateType((AggregateType)value, diagnostics, context);
			case BOMPackage.ASSET_TYPE_TYPE:
				return validateAssetTypeType((AssetTypeType)value, diagnostics, context);
			case BOMPackage.CERTIFICATION_LEVEL_TYPE:
				return validateCertificationLevelType((CertificationLevelType)value, diagnostics, context);
			case BOMPackage.CLASSIFICATION:
				return validateClassification((Classification)value, diagnostics, context);
			case BOMPackage.COMPONENT_DATA_TYPE_ENUMERATION:
				return validateComponentDataTypeEnumeration((ComponentDataTypeEnumeration)value, diagnostics, context);
			case BOMPackage.CRYPTO_FUNCTION_TYPE:
				return validateCryptoFunctionType((CryptoFunctionType)value, diagnostics, context);
			case BOMPackage.DATA_FLOW_TYPE1:
				return validateDataFlowType1((DataFlowType1)value, diagnostics, context);
			case BOMPackage.ENCODING:
				return validateEncoding((Encoding)value, diagnostics, context);
			case BOMPackage.ENERGY_SOURCE_TYPE:
				return validateEnergySourceType((EnergySourceType)value, diagnostics, context);
			case BOMPackage.EVIDENCE_TECHNIQUE:
				return validateEvidenceTechnique((EvidenceTechnique)value, diagnostics, context);
			case BOMPackage.EXECUTION_ENVIRONMENT_TYPE:
				return validateExecutionEnvironmentType((ExecutionEnvironmentType)value, diagnostics, context);
			case BOMPackage.EXTERNAL_REFERENCE_TYPE:
				return validateExternalReferenceType((ExternalReferenceType)value, diagnostics, context);
			case BOMPackage.HASH_ALG:
				return validateHashAlg((HashAlg)value, diagnostics, context);
			case BOMPackage.IDENTITY_FIELD_TYPE:
				return validateIdentityFieldType((IdentityFieldType)value, diagnostics, context);
			case BOMPackage.IMPACT_ANALYSIS_AFFECTED_STATUS_TYPE:
				return validateImpactAnalysisAffectedStatusType((ImpactAnalysisAffectedStatusType)value, diagnostics, context);
			case BOMPackage.IMPACT_ANALYSIS_JUSTIFICATION_TYPE:
				return validateImpactAnalysisJustificationType((ImpactAnalysisJustificationType)value, diagnostics, context);
			case BOMPackage.IMPACT_ANALYSIS_RESPONSES_TYPE:
				return validateImpactAnalysisResponsesType((ImpactAnalysisResponsesType)value, diagnostics, context);
			case BOMPackage.IMPACT_ANALYSIS_STATE_TYPE:
				return validateImpactAnalysisStateType((ImpactAnalysisStateType)value, diagnostics, context);
			case BOMPackage.IMPLEMENTATION_PLATFORM_TYPE:
				return validateImplementationPlatformType((ImplementationPlatformType)value, diagnostics, context);
			case BOMPackage.ISSUE_CLASSIFICATION:
				return validateIssueClassification((IssueClassification)value, diagnostics, context);
			case BOMPackage.LICENSE_ACKNOWLEDGEMENT_ENUMERATION_TYPE:
				return validateLicenseAcknowledgementEnumerationType((LicenseAcknowledgementEnumerationType)value, diagnostics, context);
			case BOMPackage.LICENSE_TYPE_ENUM:
				return validateLicenseTypeEnum((LicenseTypeEnum)value, diagnostics, context);
			case BOMPackage.LIFECYCLE_PHASE_TYPE:
				return validateLifecyclePhaseType((LifecyclePhaseType)value, diagnostics, context);
			case BOMPackage.MACHINE_LEARNING_APPROACH_TYPE:
				return validateMachineLearningApproachType((MachineLearningApproachType)value, diagnostics, context);
			case BOMPackage.MODE_TYPE:
				return validateModeType((ModeType)value, diagnostics, context);
			case BOMPackage.OUTPUT_TYPE_ENUM:
				return validateOutputTypeEnum((OutputTypeEnum)value, diagnostics, context);
			case BOMPackage.PADDING_TYPE:
				return validatePaddingType((PaddingType)value, diagnostics, context);
			case BOMPackage.PATCH_CLASSIFICATION:
				return validatePatchClassification((PatchClassification)value, diagnostics, context);
			case BOMPackage.PRIMITIVE_TYPE:
				return validatePrimitiveType((PrimitiveType)value, diagnostics, context);
			case BOMPackage.SCOPE:
				return validateScope((Scope)value, diagnostics, context);
			case BOMPackage.SCORE_SOURCE_TYPE:
				return validateScoreSourceType((ScoreSourceType)value, diagnostics, context);
			case BOMPackage.SEVERITY_TYPE:
				return validateSeverityType((SeverityType)value, diagnostics, context);
			case BOMPackage.STATE_TYPE:
				return validateStateType((StateType)value, diagnostics, context);
			case BOMPackage.TASK_TYPE_ENUM:
				return validateTaskTypeEnum((TaskTypeEnum)value, diagnostics, context);
			case BOMPackage.TRIGGER_TYPE_TYPE:
				return validateTriggerTypeType((TriggerTypeType)value, diagnostics, context);
			case BOMPackage.TYPE_TYPE:
				return validateTypeType((TypeType)value, diagnostics, context);
			case BOMPackage.TYPE_TYPE1:
				return validateTypeType1((TypeType1)value, diagnostics, context);
			case BOMPackage.UNIT_TYPE:
				return validateUnitType((UnitType)value, diagnostics, context);
			case BOMPackage.UNIT_TYPE1:
				return validateUnitType1((UnitType1)value, diagnostics, context);
			case BOMPackage.VOLUME_MODE_ENUM:
				return validateVolumeModeEnum((VolumeModeEnum)value, diagnostics, context);
			case BOMPackage.ACCESS_MODE_ENUM_OBJECT:
				return validateAccessModeEnumObject((AccessModeEnum)value, diagnostics, context);
			case BOMPackage.ACTIVITY_TYPE_OBJECT:
				return validateActivityTypeObject((ActivityType)value, diagnostics, context);
			case BOMPackage.AGGREGATE_TYPE_OBJECT:
				return validateAggregateTypeObject((AggregateType)value, diagnostics, context);
			case BOMPackage.ASSET_TYPE_TYPE_OBJECT:
				return validateAssetTypeTypeObject((AssetTypeType)value, diagnostics, context);
			case BOMPackage.BOM_LINK_DOCUMENT_TYPE:
				return validateBomLinkDocumentType((String)value, diagnostics, context);
			case BOMPackage.BOM_LINK_ELEMENT_TYPE:
				return validateBomLinkElementType((String)value, diagnostics, context);
			case BOMPackage.BOM_LINK_TYPE:
				return validateBomLinkType((String)value, diagnostics, context);
			case BOMPackage.CERTIFICATION_LEVEL_TYPE_OBJECT:
				return validateCertificationLevelTypeObject((CertificationLevelType)value, diagnostics, context);
			case BOMPackage.CLASSICAL_SECURITY_LEVEL_TYPE:
				return validateClassicalSecurityLevelType((BigInteger)value, diagnostics, context);
			case BOMPackage.CLASSIFICATION_OBJECT:
				return validateClassificationObject((Classification)value, diagnostics, context);
			case BOMPackage.COMPONENT_DATA_TYPE_ENUMERATION_OBJECT:
				return validateComponentDataTypeEnumerationObject((ComponentDataTypeEnumeration)value, diagnostics, context);
			case BOMPackage.CPE:
				return validateCpe((String)value, diagnostics, context);
			case BOMPackage.CRYPTO_FUNCTION_TYPE_OBJECT:
				return validateCryptoFunctionTypeObject((CryptoFunctionType)value, diagnostics, context);
			case BOMPackage.DATA_FLOW_TYPE_OBJECT:
				return validateDataFlowTypeObject((DataFlowType1)value, diagnostics, context);
			case BOMPackage.DECIMAL_PERCENT_TYPE:
				return validateDecimalPercentType((BigDecimal)value, diagnostics, context);
			case BOMPackage.ENCODING_OBJECT:
				return validateEncodingObject((Encoding)value, diagnostics, context);
			case BOMPackage.ENERGY_SOURCE_TYPE_OBJECT:
				return validateEnergySourceTypeObject((EnergySourceType)value, diagnostics, context);
			case BOMPackage.EVIDENCE_TECHNIQUE_OBJECT:
				return validateEvidenceTechniqueObject((EvidenceTechnique)value, diagnostics, context);
			case BOMPackage.EXECUTION_ENVIRONMENT_TYPE_OBJECT:
				return validateExecutionEnvironmentTypeObject((ExecutionEnvironmentType)value, diagnostics, context);
			case BOMPackage.EXTERNAL_REFERENCE_TYPE_OBJECT:
				return validateExternalReferenceTypeObject((ExternalReferenceType)value, diagnostics, context);
			case BOMPackage.HASH_ALG_OBJECT:
				return validateHashAlgObject((HashAlg)value, diagnostics, context);
			case BOMPackage.HASH_VALUE:
				return validateHashValue((String)value, diagnostics, context);
			case BOMPackage.IDENTITY_FIELD_TYPE_OBJECT:
				return validateIdentityFieldTypeObject((IdentityFieldType)value, diagnostics, context);
			case BOMPackage.IMPACT_ANALYSIS_AFFECTED_STATUS_TYPE_OBJECT:
				return validateImpactAnalysisAffectedStatusTypeObject((ImpactAnalysisAffectedStatusType)value, diagnostics, context);
			case BOMPackage.IMPACT_ANALYSIS_JUSTIFICATION_TYPE_OBJECT:
				return validateImpactAnalysisJustificationTypeObject((ImpactAnalysisJustificationType)value, diagnostics, context);
			case BOMPackage.IMPACT_ANALYSIS_RESPONSES_TYPE_OBJECT:
				return validateImpactAnalysisResponsesTypeObject((ImpactAnalysisResponsesType)value, diagnostics, context);
			case BOMPackage.IMPACT_ANALYSIS_STATE_TYPE_OBJECT:
				return validateImpactAnalysisStateTypeObject((ImpactAnalysisStateType)value, diagnostics, context);
			case BOMPackage.IMPLEMENTATION_PLATFORM_TYPE_OBJECT:
				return validateImplementationPlatformTypeObject((ImplementationPlatformType)value, diagnostics, context);
			case BOMPackage.ISSUE_CLASSIFICATION_OBJECT:
				return validateIssueClassificationObject((IssueClassification)value, diagnostics, context);
			case BOMPackage.LICENSE_ACKNOWLEDGEMENT_ENUMERATION_TYPE_OBJECT:
				return validateLicenseAcknowledgementEnumerationTypeObject((LicenseAcknowledgementEnumerationType)value, diagnostics, context);
			case BOMPackage.LICENSE_TYPE_ENUM_OBJECT:
				return validateLicenseTypeEnumObject((LicenseTypeEnum)value, diagnostics, context);
			case BOMPackage.LIFECYCLE_PHASE_TYPE_OBJECT:
				return validateLifecyclePhaseTypeObject((LifecyclePhaseType)value, diagnostics, context);
			case BOMPackage.LOCALE_TYPE:
				return validateLocaleType((String)value, diagnostics, context);
			case BOMPackage.MACHINE_LEARNING_APPROACH_TYPE_OBJECT:
				return validateMachineLearningApproachTypeObject((MachineLearningApproachType)value, diagnostics, context);
			case BOMPackage.MIME_TYPE:
				return validateMimeType((String)value, diagnostics, context);
			case BOMPackage.MODE_TYPE_OBJECT:
				return validateModeTypeObject((ModeType)value, diagnostics, context);
			case BOMPackage.NIST_QUANTUM_SECURITY_LEVEL_TYPE:
				return validateNistQuantumSecurityLevelType((BigInteger)value, diagnostics, context);
			case BOMPackage.OPEN_CRE_TYPE:
				return validateOpenCreType((String)value, diagnostics, context);
			case BOMPackage.OUTPUT_TYPE_ENUM_OBJECT:
				return validateOutputTypeEnumObject((OutputTypeEnum)value, diagnostics, context);
			case BOMPackage.PADDING_TYPE_OBJECT:
				return validatePaddingTypeObject((PaddingType)value, diagnostics, context);
			case BOMPackage.PATCH_CLASSIFICATION_OBJECT:
				return validatePatchClassificationObject((PatchClassification)value, diagnostics, context);
			case BOMPackage.PRIMITIVE_TYPE_OBJECT:
				return validatePrimitiveTypeObject((PrimitiveType)value, diagnostics, context);
			case BOMPackage.REF_LINK_TYPE:
				return validateRefLinkType((String)value, diagnostics, context);
			case BOMPackage.REF_TYPE:
				return validateRefType((String)value, diagnostics, context);
			case BOMPackage.REF_TYPE1:
				return validateRefType1((String)value, diagnostics, context);
			case BOMPackage.REF_TYPE2:
				return validateRefType2((String)value, diagnostics, context);
			case BOMPackage.REF_TYPE3:
				return validateRefType3((String)value, diagnostics, context);
			case BOMPackage.REF_TYPE4:
				return validateRefType4((String)value, diagnostics, context);
			case BOMPackage.SCOPE_OBJECT:
				return validateScopeObject((Scope)value, diagnostics, context);
			case BOMPackage.SCORE_SOURCE_TYPE_OBJECT:
				return validateScoreSourceTypeObject((ScoreSourceType)value, diagnostics, context);
			case BOMPackage.SCORE_TYPE:
				return validateScoreType((BigDecimal)value, diagnostics, context);
			case BOMPackage.SCORE_TYPE1:
				return validateScoreType1((BigDecimal)value, diagnostics, context);
			case BOMPackage.SEVERITY_TYPE_OBJECT:
				return validateSeverityTypeObject((SeverityType)value, diagnostics, context);
			case BOMPackage.STATE_TYPE_OBJECT:
				return validateStateTypeObject((StateType)value, diagnostics, context);
			case BOMPackage.TASK_TYPE_ENUM_OBJECT:
				return validateTaskTypeEnumObject((TaskTypeEnum)value, diagnostics, context);
			case BOMPackage.TRIGGER_TYPE_TYPE_OBJECT:
				return validateTriggerTypeTypeObject((TriggerTypeType)value, diagnostics, context);
			case BOMPackage.TYPE_TYPE_OBJECT:
				return validateTypeTypeObject((TypeType)value, diagnostics, context);
			case BOMPackage.TYPE_TYPE_OBJECT1:
				return validateTypeTypeObject1((TypeType1)value, diagnostics, context);
			case BOMPackage.UNIT_TYPE_OBJECT:
				return validateUnitTypeObject((UnitType)value, diagnostics, context);
			case BOMPackage.UNIT_TYPE_OBJECT1:
				return validateUnitTypeObject1((UnitType1)value, diagnostics, context);
			case BOMPackage.URL_TYPE:
				return validateUrlType((String)value, diagnostics, context);
			case BOMPackage.URL_TYPE1:
				return validateUrlType1((String)value, diagnostics, context);
			case BOMPackage.URL_TYPE2:
				return validateUrlType2((String)value, diagnostics, context);
			case BOMPackage.URN_UUID:
				return validateUrnUuid((String)value, diagnostics, context);
			case BOMPackage.VERSION_RANGE_TYPE:
				return validateVersionRangeType((String)value, diagnostics, context);
			case BOMPackage.VERSION_TYPE1:
				return validateVersionType1((String)value, diagnostics, context);
			case BOMPackage.VOLUME_MODE_ENUM_OBJECT:
				return validateVolumeModeEnumObject((VolumeModeEnum)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvisoriesType(AdvisoriesType advisoriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(advisoriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvisoryType(AdvisoryType advisoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(advisoryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffectsType(AffectsType affectsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(affectsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAffirmationType(AffirmationType affirmationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(affirmationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlgorithmPropertiesType(AlgorithmPropertiesType algorithmPropertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(algorithmPropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlgorithmsType(AlgorithmsType algorithmsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(algorithmsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAliasesType(AliasesType aliasesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aliasesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAliasesType1(AliasesType1 aliasesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aliasesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAltIdsType(AltIdsType altIdsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(altIdsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnalysisType(AnalysisType analysisType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(analysisType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationsType(AnnotationsType annotationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotationType(AnnotationType annotationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnnotatorChoiceType(AnnotatorChoiceType annotatorChoiceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(annotatorChoiceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApproachType(ApproachType approachType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(approachType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssembliesType(AssembliesType assembliesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assembliesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessorsType(AssessorsType assessorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assessorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessorType(AssessorType assessorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assessorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttachedTextType(AttachedTextType attachedTextType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attachedTextType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttestationsType(AttestationsType attestationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attestationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttestationType(AttestationType attestationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attestationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorsType(AuthorsType authorsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authorsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorsType1(AuthorsType1 authorsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(authorsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBomReferenceType(BomReferenceType bomReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bomReferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBomType(BomType bomType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bomType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallstackType(CallstackType callstackType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(callstackType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificatePropertiesType(CertificatePropertiesType certificatePropertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(certificatePropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCipherSuitesType(CipherSuitesType cipherSuitesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cipherSuitesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCipherSuiteType(CipherSuiteType cipherSuiteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cipherSuiteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimsType(ClaimsType claimsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimsType1(ClaimsType1 claimsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimType(ClaimType claimType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCo2MeasureType(Co2MeasureType co2MeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(co2MeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionType(CollectionType collectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(collectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionType1(CollectionType1 collectionType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(collectionType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandsType(CommandsType commandsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commandsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandType(CommandType commandType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commandType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommitsType(CommitsType commitsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commitsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommitType(CommitType commitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commitType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponent(Component component, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(component, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentDataType(ComponentDataType componentDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentDataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentEvidenceType(ComponentEvidenceType componentEvidenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentEvidenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentsType(ComponentsType componentsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentsType1(ComponentsType1 componentsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentsType2(ComponentsType2 componentsType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentsType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionsType(CompositionsType compositionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositionType(CompositionType compositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionsType(ConditionsType conditionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionType(ConditionType conditionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conditionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfidenceIntervalType(ConfidenceIntervalType confidenceIntervalType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(confidenceIntervalType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfidenceType(ConfidenceType confidenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(confidenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConformanceType(ConformanceType conformanceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conformanceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsiderationsType(ConsiderationsType considerationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(considerationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentsType(ContentsType contentsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentsType1(ContentsType1 contentsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contentsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCopyrightsType(CopyrightsType copyrightsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(copyrightsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCounterClaimsType(CounterClaimsType counterClaimsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(counterClaimsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreditsType(CreditsType creditsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(creditsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCryptoFunctionsType(CryptoFunctionsType cryptoFunctionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cryptoFunctionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCryptoPropertiesType(CryptoPropertiesType cryptoPropertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cryptoPropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustodiansType(CustodiansType custodiansType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(custodiansType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCwesType(CwesType cwesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cwesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataClassificationType(DataClassificationType dataClassificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataClassificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataflowType(DataflowType dataflowType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataflowType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataGovernance(DataGovernance dataGovernance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataGovernance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatasetsType(DatasetsType datasetsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(datasetsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType1(DataType1 dataType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclarationsType(DeclarationsType declarationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(declarationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinitionsType(DefinitionsType definitionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(definitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependenciesType(DependenciesType dependenciesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dependenciesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependenciesType1(DependenciesType1 dependenciesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dependenciesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependencyType(DependencyType dependencyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dependencyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionsType(DescriptionsType descriptionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(descriptionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDestinationType(DestinationType destinationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(destinationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiffType(DiffType diffType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(diffType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpointsType(EndpointsType endpointsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endpointsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnergyConsumptionsType(EnergyConsumptionsType energyConsumptionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(energyConsumptionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnergyConsumptionType(EnergyConsumptionType energyConsumptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(energyConsumptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnergyMeasureType(EnergyMeasureType energyMeasureType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(energyMeasureType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnergyProviderType(EnergyProviderType energyProviderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(energyProviderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironmentalConsiderationsType(EnvironmentalConsiderationsType environmentalConsiderationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(environmentalConsiderationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironmentVarsType(EnvironmentVarsType environmentVarsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(environmentVarsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironmentVarsType1(EnvironmentVarsType1 environmentVarsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(environmentVarsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEthicalConsiderationsType(EthicalConsiderationsType ethicalConsiderationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ethicalConsiderationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEthicalConsiderationType(EthicalConsiderationType ethicalConsiderationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ethicalConsiderationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventType(EventType eventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidenceType(EvidenceType evidenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evidenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidenceType1(EvidenceType1 evidenceType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(evidenceType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpressionType(ExpressionType expressionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expressionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReference(ExternalReference externalReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferences(ExternalReferences externalReferences, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalReferences, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFairnessAssessmentsType(FairnessAssessmentsType fairnessAssessmentsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fairnessAssessmentsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFairnessAssessmentType(FairnessAssessmentType fairnessAssessmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fairnessAssessmentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormulationType(FormulationType formulationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formulationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormulaType(FormulaType formulaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formulaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFramesType(FramesType framesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(framesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrameType(FrameType frameType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(frameType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphicsCollectionType(GraphicsCollectionType graphicsCollectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphicsCollectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphicsType(GraphicsType graphicsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphicsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphicType(GraphicType graphicType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphicType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGraphicType1(GraphicType1 graphicType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(graphicType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHashesType(HashesType hashesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hashesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHashesType1(HashesType1 hashesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hashesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHashesType2(HashesType2 hashesType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hashesType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHashType(HashType hashType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hashType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifiableActionType(IdentifiableActionType identifiableActionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifiableActionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentifiersType(IdentifiersType identifiersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identifiersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentityType(IdentityType identityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(identityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIkev2TransformTypesType(Ikev2TransformTypesType ikev2TransformTypesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ikev2TransformTypesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIndividualsType(IndividualsType individualsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(individualsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputsType(InputsType inputsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputsType1(InputsType1 inputsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputsType2(InputsType2 inputsType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputsType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputsType3(InputsType3 inputsType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputsType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputType(InputType inputType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputType1(InputType1 inputType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueType(IssueType issueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(issueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelsType(LevelsType levelsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(levelsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelType(LevelType levelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(levelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLicenseChoiceType(LicenseChoiceType licenseChoiceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(licenseChoiceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLicenseeType(LicenseeType licenseeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(licenseeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLicenseType(LicenseType licenseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(licenseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLicenseTypesType(LicenseTypesType licenseTypesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(licenseTypesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLicensingType(LicensingType licensingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(licensingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLicensorType(LicensorType licensorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(licensorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifecyclesType(LifecyclesType lifecyclesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lifecyclesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifecycleType(LifecycleType lifecycleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lifecycleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapType(MapType mapType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetadata(Metadata metadata, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metadata, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodsType(MethodsType methodsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(methodsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodType(MethodType methodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(methodType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMitigationStrategiesType(MitigationStrategiesType mitigationStrategiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mitigationStrategiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMitigationStrategiesType1(MitigationStrategiesType1 mitigationStrategiesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mitigationStrategiesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelCardType(ModelCardType modelCardType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelCardType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelParametersType(ModelParametersType modelParametersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelParametersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotesType(NotesType notesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(notesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoteType(NoteType noteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(noteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOccurrencesType(OccurrencesType occurrencesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(occurrencesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOccurrenceType(OccurrenceType occurrenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(occurrenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationalContact(OrganizationalContact organizationalContact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organizationalContact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationalEntity(OrganizationalEntity organizationalEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organizationalEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationOrIndividualType(OrganizationOrIndividualType organizationOrIndividualType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organizationOrIndividualType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationsType(OrganizationsType organizationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organizationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrganizationsType1(OrganizationsType1 organizationsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(organizationsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputsType(OutputsType outputsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputsType1(OutputsType1 outputsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputsType2(OutputsType2 outputsType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputsType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputsType3(OutputsType3 outputsType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputsType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputType(OutputType outputType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputType1(OutputType1 outputType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOwnersType(OwnersType ownersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ownersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParametersType(ParametersType parametersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parametersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParametersType1(ParametersType1 parametersType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parametersType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterType(ParameterType parameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatchesType(PatchesType patchesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patchesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatchType(PatchType patchType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patchType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePedigreeType(PedigreeType pedigreeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pedigreeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerformanceMetricsType(PerformanceMetricsType performanceMetricsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(performanceMetricsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerformanceMetricType(PerformanceMetricType performanceMetricType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(performanceMetricType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerformanceTradeoffsType(PerformanceTradeoffsType performanceTradeoffsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(performanceTradeoffsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePostalAddressType(PostalAddressType postalAddressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(postalAddressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProofOfConceptType(ProofOfConceptType proofOfConceptType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(proofOfConceptType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertiesType(PropertiesType propertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyType(PropertyType propertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolPropertiesType(ProtocolPropertiesType protocolPropertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(protocolPropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProvidesType(ProvidesType providesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(providesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurchaserType(PurchaserType purchaserType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(purchaserType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuantitativeAnalysisType(QuantitativeAnalysisType quantitativeAnalysisType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quantitativeAnalysisType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRatingsType(RatingsType ratingsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ratingsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRatingType(RatingType ratingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ratingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferencesType(ReferencesType referencesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referencesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferencesType1(ReferencesType1 referencesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referencesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceType(ReferenceType referenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelatedCryptoMaterialPropertiesType(RelatedCryptoMaterialPropertiesType relatedCryptoMaterialPropertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relatedCryptoMaterialPropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReleaseNotesType(ReleaseNotesType releaseNotesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(releaseNotesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementsType(RequirementsType requirementsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requirementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementsType1(RequirementsType1 requirementsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requirementsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementType(RequirementType requirementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requirementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResolvesType(ResolvesType resolvesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resolvesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResolvesType1(ResolvesType1 resolvesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resolvesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceReferencesType(ResourceReferencesType resourceReferencesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceReferencesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceReferenceType(ResourceReferenceType resourceReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceReferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsesType(ResponsesType responsesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responsesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecuredByType(SecuredByType securedByType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securedByType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(service, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicesType(ServicesType servicesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(servicesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicesType1(ServicesType1 servicesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(servicesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServicesType2(ServicesType2 servicesType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(servicesType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignatoriesType(SignatoriesType signatoriesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signatoriesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignatoryType(SignatoryType signatoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signatoryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceType(SourceType sourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceType1(SourceType1 sourceType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sourceType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandard(Standard standard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(standard, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandardsType(StandardsType standardsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(standardsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStepsType(StepsType stepsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stepsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStepsType1(StepsType1 stepsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stepsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStepType(StepType stepType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stepType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStewardsType(StewardsType stewardsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stewardsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubjectsType(SubjectsType subjectsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subjectsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportingMaterialType(SupportingMaterialType supportingMaterialType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supportingMaterialType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSwidType(SwidType swidType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(swidType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTagsType(TagsType tagsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tagsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetsType(TargetsType targetsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targetsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetType(TargetType targetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTasksType(TasksType tasksType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tasksType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskType(TaskType taskType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskTypesType(TaskTypesType taskTypesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskTypesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskTypesType1(TaskTypesType1 taskTypesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(taskTypesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTechnicalLimitationsType(TechnicalLimitationsType technicalLimitationsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(technicalLimitationsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToolsType(ToolsType toolsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toolsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToolsType1(ToolsType1 toolsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toolsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToolsType2(ToolsType2 toolsType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toolsType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToolsType3(ToolsType3 toolsType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toolsType3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateToolType(ToolType toolType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(toolType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerType(TriggerType triggerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(triggerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUseCasesType(UseCasesType useCasesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(useCasesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUsersType(UsersType usersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(usersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionsType(VersionsType versionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(versionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionType(VersionType versionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(versionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolumeType(VolumeType volumeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(volumeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVulnerabilitiesType(VulnerabilitiesType vulnerabilitiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vulnerabilitiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVulnerabilitiesType1(VulnerabilitiesType1 vulnerabilitiesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vulnerabilitiesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVulnerabilitySourceType(VulnerabilitySourceType vulnerabilitySourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vulnerabilitySourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVulnerabilityType(VulnerabilityType vulnerabilityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vulnerabilityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflowsType(WorkflowsType workflowsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workflowsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflowType(WorkflowType workflowType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workflowType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkspacesType(WorkspacesType workspacesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workspacesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkspaceType(WorkspaceType workspaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workspaceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessModeEnum(AccessModeEnum accessModeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityType(ActivityType activityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregateType(AggregateType aggregateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssetTypeType(AssetTypeType assetTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificationLevelType(CertificationLevelType certificationLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassification(Classification classification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentDataTypeEnumeration(ComponentDataTypeEnumeration componentDataTypeEnumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCryptoFunctionType(CryptoFunctionType cryptoFunctionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataFlowType1(DataFlowType1 dataFlowType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncoding(Encoding encoding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnergySourceType(EnergySourceType energySourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidenceTechnique(EvidenceTechnique evidenceTechnique, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionEnvironmentType(ExecutionEnvironmentType executionEnvironmentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceType(ExternalReferenceType externalReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHashAlg(HashAlg hashAlg, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentityFieldType(IdentityFieldType identityFieldType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImpactAnalysisAffectedStatusType(ImpactAnalysisAffectedStatusType impactAnalysisAffectedStatusType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImpactAnalysisJustificationType(ImpactAnalysisJustificationType impactAnalysisJustificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImpactAnalysisResponsesType(ImpactAnalysisResponsesType impactAnalysisResponsesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImpactAnalysisStateType(ImpactAnalysisStateType impactAnalysisStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationPlatformType(ImplementationPlatformType implementationPlatformType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueClassification(IssueClassification issueClassification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLicenseAcknowledgementEnumerationType(LicenseAcknowledgementEnumerationType licenseAcknowledgementEnumerationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLicenseTypeEnum(LicenseTypeEnum licenseTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifecyclePhaseType(LifecyclePhaseType lifecyclePhaseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachineLearningApproachType(MachineLearningApproachType machineLearningApproachType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeType(ModeType modeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputTypeEnum(OutputTypeEnum outputTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaddingType(PaddingType paddingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatchClassification(PatchClassification patchClassification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveType(PrimitiveType primitiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScope(Scope scope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScoreSourceType(ScoreSourceType scoreSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityType(SeverityType severityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateType(StateType stateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskTypeEnum(TaskTypeEnum taskTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerTypeType(TriggerTypeType triggerTypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType(TypeType typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType1(TypeType1 typeType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitType(UnitType unitType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitType1(UnitType1 unitType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolumeModeEnum(VolumeModeEnum volumeModeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessModeEnumObject(AccessModeEnum accessModeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivityTypeObject(ActivityType activityTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAggregateTypeObject(AggregateType aggregateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssetTypeTypeObject(AssetTypeType assetTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBomLinkDocumentType(String bomLinkDocumentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBomLinkDocumentType_Pattern(bomLinkDocumentType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBomLinkDocumentType_Pattern
	 */
	public static final  PatternMatcher [][] BOM_LINK_DOCUMENT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("urn:cdx:[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}/[1-9][0-9]*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bom Link Document Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBomLinkDocumentType_Pattern(String bomLinkDocumentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BOMPackage.eINSTANCE.getBomLinkDocumentType(), bomLinkDocumentType, BOM_LINK_DOCUMENT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBomLinkElementType(String bomLinkElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBomLinkElementType_Pattern(bomLinkElementType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBomLinkElementType_Pattern
	 */
	public static final  PatternMatcher [][] BOM_LINK_ELEMENT_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("urn:cdx:[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}/[1-9][0-9]*#.+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Bom Link Element Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBomLinkElementType_Pattern(String bomLinkElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BOMPackage.eINSTANCE.getBomLinkElementType(), bomLinkElementType, BOM_LINK_ELEMENT_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBomLinkType(String bomLinkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBomLinkType_MemberTypes(bomLinkType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Bom Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBomLinkType_MemberTypes(String bomLinkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (BOMPackage.eINSTANCE.getBomLinkDocumentType().isInstance(bomLinkType)) {
				if (validateBomLinkDocumentType(bomLinkType, tempDiagnostics, context)) return true;
			}
			if (BOMPackage.eINSTANCE.getBomLinkElementType().isInstance(bomLinkType)) {
				if (validateBomLinkElementType(bomLinkType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (BOMPackage.eINSTANCE.getBomLinkDocumentType().isInstance(bomLinkType)) {
				if (validateBomLinkDocumentType(bomLinkType, null, context)) return true;
			}
			if (BOMPackage.eINSTANCE.getBomLinkElementType().isInstance(bomLinkType)) {
				if (validateBomLinkElementType(bomLinkType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCertificationLevelTypeObject(CertificationLevelType certificationLevelTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassicalSecurityLevelType(BigInteger classicalSecurityLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateClassicalSecurityLevelType_Min(classicalSecurityLevelType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateClassicalSecurityLevelType_Min
	 */
	public static final BigInteger CLASSICAL_SECURITY_LEVEL_TYPE__MIN__VALUE = new BigInteger("0");

	/**
	 * Validates the Min constraint of '<em>Classical Security Level Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassicalSecurityLevelType_Min(BigInteger classicalSecurityLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = classicalSecurityLevelType.compareTo(CLASSICAL_SECURITY_LEVEL_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(BOMPackage.eINSTANCE.getClassicalSecurityLevelType(), classicalSecurityLevelType, CLASSICAL_SECURITY_LEVEL_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassificationObject(Classification classificationObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentDataTypeEnumerationObject(ComponentDataTypeEnumeration componentDataTypeEnumerationObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCpe(String cpe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCpe_Pattern(cpe, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCpe_Pattern
	 */
	public static final  PatternMatcher [][] CPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([c][pP][eE]:/[AHOaho]?(:[A-Za-z0-9\\._\\-~%]*){0,6})|(cpe:2\\.3:[aho\\*\\-](:(((\\?*|\\*?)([a-zA-Z0-9\\-\\._]|(\\\\[\\\\\\*\\?!\"#$$%&\'\\(\\)\\+,/:;<=>@\\[\\]\\^`\\{\\|}~]))+(\\?*|\\*?))|[\\*\\-])){5}(:(([a-zA-Z]{2,3}(-([a-zA-Z]{2}|[0-9]{3}))?)|[\\*\\-]))(:(((\\?*|\\*?)([a-zA-Z0-9\\-\\._]|(\\\\[\\\\\\*\\?!\"#$$%&\'\\(\\)\\+,/:;<=>@\\[\\]\\^`\\{\\|}~]))+(\\?*|\\*?))|[\\*\\-])){4})")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Cpe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCpe_Pattern(String cpe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BOMPackage.eINSTANCE.getCpe(), cpe, CPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCryptoFunctionTypeObject(CryptoFunctionType cryptoFunctionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataFlowTypeObject(DataFlowType1 dataFlowTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalPercentType(BigDecimal decimalPercentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDecimalPercentType_Min(decimalPercentType, diagnostics, context);
		if (result || diagnostics != null) result &= validateDecimalPercentType_Max(decimalPercentType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDecimalPercentType_Min
	 */
	public static final BigDecimal DECIMAL_PERCENT_TYPE__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Decimal Percent Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalPercentType_Min(BigDecimal decimalPercentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = decimalPercentType.compareTo(DECIMAL_PERCENT_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(BOMPackage.eINSTANCE.getDecimalPercentType(), decimalPercentType, DECIMAL_PERCENT_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateDecimalPercentType_Max
	 */
	public static final BigDecimal DECIMAL_PERCENT_TYPE__MAX__VALUE = new BigDecimal("1");

	/**
	 * Validates the Max constraint of '<em>Decimal Percent Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalPercentType_Max(BigDecimal decimalPercentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = decimalPercentType.compareTo(DECIMAL_PERCENT_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(BOMPackage.eINSTANCE.getDecimalPercentType(), decimalPercentType, DECIMAL_PERCENT_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncodingObject(Encoding encodingObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnergySourceTypeObject(EnergySourceType energySourceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvidenceTechniqueObject(EvidenceTechnique evidenceTechniqueObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExecutionEnvironmentTypeObject(ExecutionEnvironmentType executionEnvironmentTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalReferenceTypeObject(ExternalReferenceType externalReferenceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHashAlgObject(HashAlg hashAlgObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHashValue(String hashValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateHashValue_Pattern(hashValue, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateHashValue_Pattern
	 */
	public static final  PatternMatcher [][] HASH_VALUE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([a-fA-F0-9]{32})|([a-fA-F0-9]{40})|([a-fA-F0-9]{64})|([a-fA-F0-9]{96})|([a-fA-F0-9]{128})")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Hash Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHashValue_Pattern(String hashValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BOMPackage.eINSTANCE.getHashValue(), hashValue, HASH_VALUE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdentityFieldTypeObject(IdentityFieldType identityFieldTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImpactAnalysisAffectedStatusTypeObject(ImpactAnalysisAffectedStatusType impactAnalysisAffectedStatusTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImpactAnalysisJustificationTypeObject(ImpactAnalysisJustificationType impactAnalysisJustificationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImpactAnalysisResponsesTypeObject(ImpactAnalysisResponsesType impactAnalysisResponsesTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImpactAnalysisStateTypeObject(ImpactAnalysisStateType impactAnalysisStateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationPlatformTypeObject(ImplementationPlatformType implementationPlatformTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIssueClassificationObject(IssueClassification issueClassificationObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLicenseAcknowledgementEnumerationTypeObject(LicenseAcknowledgementEnumerationType licenseAcknowledgementEnumerationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLicenseTypeEnumObject(LicenseTypeEnum licenseTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLifecyclePhaseTypeObject(LifecyclePhaseType lifecyclePhaseTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocaleType(String localeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLocaleType_Pattern(localeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLocaleType_Pattern
	 */
	public static final  PatternMatcher [][] LOCALE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([a-z]{2})(-[A-Z]{2})?")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Locale Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocaleType_Pattern(String localeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BOMPackage.eINSTANCE.getLocaleType(), localeType, LOCALE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachineLearningApproachTypeObject(MachineLearningApproachType machineLearningApproachTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMimeType(String mimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMimeType_Pattern(mimeType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMimeType_Pattern
	 */
	public static final  PatternMatcher [][] MIME_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[-+a-z0-9.]+/[-+a-z0-9.]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Mime Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMimeType_Pattern(String mimeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BOMPackage.eINSTANCE.getMimeType(), mimeType, MIME_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModeTypeObject(ModeType modeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNistQuantumSecurityLevelType(BigInteger nistQuantumSecurityLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNistQuantumSecurityLevelType_Min(nistQuantumSecurityLevelType, diagnostics, context);
		if (result || diagnostics != null) result &= validateNistQuantumSecurityLevelType_Max(nistQuantumSecurityLevelType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNistQuantumSecurityLevelType_Min
	 */
	public static final BigInteger NIST_QUANTUM_SECURITY_LEVEL_TYPE__MIN__VALUE = new BigInteger("0");

	/**
	 * Validates the Min constraint of '<em>Nist Quantum Security Level Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNistQuantumSecurityLevelType_Min(BigInteger nistQuantumSecurityLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = nistQuantumSecurityLevelType.compareTo(NIST_QUANTUM_SECURITY_LEVEL_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(BOMPackage.eINSTANCE.getNistQuantumSecurityLevelType(), nistQuantumSecurityLevelType, NIST_QUANTUM_SECURITY_LEVEL_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNistQuantumSecurityLevelType_Max
	 */
	public static final BigInteger NIST_QUANTUM_SECURITY_LEVEL_TYPE__MAX__VALUE = new BigInteger("6");

	/**
	 * Validates the Max constraint of '<em>Nist Quantum Security Level Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNistQuantumSecurityLevelType_Max(BigInteger nistQuantumSecurityLevelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = nistQuantumSecurityLevelType.compareTo(NIST_QUANTUM_SECURITY_LEVEL_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(BOMPackage.eINSTANCE.getNistQuantumSecurityLevelType(), nistQuantumSecurityLevelType, NIST_QUANTUM_SECURITY_LEVEL_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpenCreType(String openCreType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOpenCreType_Pattern(openCreType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOpenCreType_Pattern
	 */
	public static final  PatternMatcher [][] OPEN_CRE_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("CRE:[0-9]+-[0-9]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Open Cre Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOpenCreType_Pattern(String openCreType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BOMPackage.eINSTANCE.getOpenCreType(), openCreType, OPEN_CRE_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputTypeEnumObject(OutputTypeEnum outputTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePaddingTypeObject(PaddingType paddingTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatchClassificationObject(PatchClassification patchClassificationObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveTypeObject(PrimitiveType primitiveTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefLinkType(String refLinkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRefType4_MinLength(refLinkType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefType(String refType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRefType_MemberTypes(refType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefType_MemberTypes(String refType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (BOMPackage.eINSTANCE.getRefLinkType().isInstance(refType)) {
				if (validateRefLinkType(refType, tempDiagnostics, context)) return true;
			}
			if (BOMPackage.eINSTANCE.getBomLinkElementType().isInstance(refType)) {
				if (validateBomLinkElementType(refType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (BOMPackage.eINSTANCE.getRefLinkType().isInstance(refType)) {
				if (validateRefLinkType(refType, null, context)) return true;
			}
			if (BOMPackage.eINSTANCE.getBomLinkElementType().isInstance(refType)) {
				if (validateBomLinkElementType(refType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefType1(String refType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRefType1_MemberTypes(refType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Ref Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefType1_MemberTypes(String refType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (BOMPackage.eINSTANCE.getRefLinkType().isInstance(refType1)) {
				if (validateRefLinkType(refType1, tempDiagnostics, context)) return true;
			}
			if (BOMPackage.eINSTANCE.getBomLinkElementType().isInstance(refType1)) {
				if (validateBomLinkElementType(refType1, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (BOMPackage.eINSTANCE.getRefLinkType().isInstance(refType1)) {
				if (validateRefLinkType(refType1, null, context)) return true;
			}
			if (BOMPackage.eINSTANCE.getBomLinkElementType().isInstance(refType1)) {
				if (validateBomLinkElementType(refType1, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefType2(String refType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRefType2_MemberTypes(refType2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Ref Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefType2_MemberTypes(String refType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (BOMPackage.eINSTANCE.getRefLinkType().isInstance(refType2)) {
				if (validateRefLinkType(refType2, tempDiagnostics, context)) return true;
			}
			if (BOMPackage.eINSTANCE.getBomLinkElementType().isInstance(refType2)) {
				if (validateBomLinkElementType(refType2, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (BOMPackage.eINSTANCE.getRefLinkType().isInstance(refType2)) {
				if (validateRefLinkType(refType2, null, context)) return true;
			}
			if (BOMPackage.eINSTANCE.getBomLinkElementType().isInstance(refType2)) {
				if (validateBomLinkElementType(refType2, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefType3(String refType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRefType3_MemberTypes(refType3, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Ref Type3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefType3_MemberTypes(String refType3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (BOMPackage.eINSTANCE.getRefLinkType().isInstance(refType3)) {
				if (validateRefLinkType(refType3, tempDiagnostics, context)) return true;
			}
			if (BOMPackage.eINSTANCE.getBomLinkType().isInstance(refType3)) {
				if (validateBomLinkType(refType3, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (BOMPackage.eINSTANCE.getRefLinkType().isInstance(refType3)) {
				if (validateRefLinkType(refType3, null, context)) return true;
			}
			if (BOMPackage.eINSTANCE.getBomLinkType().isInstance(refType3)) {
				if (validateBomLinkType(refType3, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefType4(String refType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRefType4_MinLength(refType4, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Ref Type4</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefType4_MinLength(String refType4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = refType4.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(BOMPackage.eINSTANCE.getRefType4(), refType4, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScopeObject(Scope scopeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScoreSourceTypeObject(ScoreSourceType scoreSourceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScoreType(BigDecimal scoreType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateScoreType_Min(scoreType, diagnostics, context);
		if (result || diagnostics != null) result &= validateScoreType_Max(scoreType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateScoreType_Min
	 */
	public static final BigDecimal SCORE_TYPE__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Score Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScoreType_Min(BigDecimal scoreType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = scoreType.compareTo(SCORE_TYPE__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(BOMPackage.eINSTANCE.getScoreType(), scoreType, SCORE_TYPE__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateScoreType_Max
	 */
	public static final BigDecimal SCORE_TYPE__MAX__VALUE = new BigDecimal("1");

	/**
	 * Validates the Max constraint of '<em>Score Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScoreType_Max(BigDecimal scoreType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = scoreType.compareTo(SCORE_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(BOMPackage.eINSTANCE.getScoreType(), scoreType, SCORE_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScoreType1(BigDecimal scoreType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateScoreType1_Min(scoreType1, diagnostics, context);
		if (result || diagnostics != null) result &= validateScoreType1_Max(scoreType1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateScoreType1_Min
	 */
	public static final BigDecimal SCORE_TYPE1__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Score Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScoreType1_Min(BigDecimal scoreType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = scoreType1.compareTo(SCORE_TYPE1__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(BOMPackage.eINSTANCE.getScoreType1(), scoreType1, SCORE_TYPE1__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateScoreType1_Max
	 */
	public static final BigDecimal SCORE_TYPE1__MAX__VALUE = new BigDecimal("1");

	/**
	 * Validates the Max constraint of '<em>Score Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScoreType1_Max(BigDecimal scoreType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = scoreType1.compareTo(SCORE_TYPE1__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(BOMPackage.eINSTANCE.getScoreType1(), scoreType1, SCORE_TYPE1__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityTypeObject(SeverityType severityTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateTypeObject(StateType stateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTaskTypeEnumObject(TaskTypeEnum taskTypeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTriggerTypeTypeObject(TriggerTypeType triggerTypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject(TypeType typeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject1(TypeType1 typeTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitTypeObject(UnitType unitTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitTypeObject1(UnitType1 unitTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlType(String urlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUrlType_MemberTypes(urlType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Url Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlType_MemberTypes(String urlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.ANY_URI.isInstance(urlType)) {
				if (xmlTypeValidator.validateAnyURI(urlType, tempDiagnostics, context)) return true;
			}
			if (BOMPackage.eINSTANCE.getBomLinkElementType().isInstance(urlType)) {
				if (validateBomLinkElementType(urlType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.ANY_URI.isInstance(urlType)) {
				if (xmlTypeValidator.validateAnyURI(urlType, null, context)) return true;
			}
			if (BOMPackage.eINSTANCE.getBomLinkElementType().isInstance(urlType)) {
				if (validateBomLinkElementType(urlType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlType1(String urlType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUrlType1_MemberTypes(urlType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Url Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlType1_MemberTypes(String urlType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.ANY_URI.isInstance(urlType1)) {
				if (xmlTypeValidator.validateAnyURI(urlType1, tempDiagnostics, context)) return true;
			}
			if (BOMPackage.eINSTANCE.getBomLinkElementType().isInstance(urlType1)) {
				if (validateBomLinkElementType(urlType1, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.ANY_URI.isInstance(urlType1)) {
				if (xmlTypeValidator.validateAnyURI(urlType1, null, context)) return true;
			}
			if (BOMPackage.eINSTANCE.getBomLinkElementType().isInstance(urlType1)) {
				if (validateBomLinkElementType(urlType1, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlType2(String urlType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUrlType2_MemberTypes(urlType2, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Url Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlType2_MemberTypes(String urlType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.ANY_URI.isInstance(urlType2)) {
				if (xmlTypeValidator.validateAnyURI(urlType2, tempDiagnostics, context)) return true;
			}
			if (BOMPackage.eINSTANCE.getBomLinkType().isInstance(urlType2)) {
				if (validateBomLinkType(urlType2, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.ANY_URI.isInstance(urlType2)) {
				if (xmlTypeValidator.validateAnyURI(urlType2, null, context)) return true;
			}
			if (BOMPackage.eINSTANCE.getBomLinkType().isInstance(urlType2)) {
				if (validateBomLinkType(urlType2, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrnUuid(String urnUuid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUrnUuid_Pattern(urnUuid, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUrnUuid_Pattern
	 */
	public static final  PatternMatcher [][] URN_UUID__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("urn:uuid:([0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12})|(\\{[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}\\})")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Urn Uuid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrnUuid_Pattern(String urnUuid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BOMPackage.eINSTANCE.getUrnUuid(), urnUuid, URN_UUID__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionRangeType(String versionRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVersionRangeType_MinLength(versionRangeType, diagnostics, context);
		if (result || diagnostics != null) result &= validateVersionRangeType_MaxLength(versionRangeType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Version Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionRangeType_MinLength(String versionRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = versionRangeType.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(BOMPackage.eINSTANCE.getVersionRangeType(), versionRangeType, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Version Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionRangeType_MaxLength(String versionRangeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = versionRangeType.length();
		boolean result = length <= 4096;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(BOMPackage.eINSTANCE.getVersionRangeType(), versionRangeType, length, 4096, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionType1(String versionType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateVersionType1_MaxLength(versionType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Version Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionType1_MaxLength(String versionType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = versionType1.length();
		boolean result = length <= 1024;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(BOMPackage.eINSTANCE.getVersionType1(), versionType1, length, 1024, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVolumeModeEnumObject(VolumeModeEnum volumeModeEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //BOMValidator
