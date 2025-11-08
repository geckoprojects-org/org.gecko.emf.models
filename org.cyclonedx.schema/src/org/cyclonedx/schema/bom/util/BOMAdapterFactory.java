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

import org.cyclonedx.schema.bom.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage
 * @generated
 */
public class BOMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BOMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BOMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BOMSwitch<Adapter> modelSwitch =
		new BOMSwitch<Adapter>() {
			@Override
			public Adapter caseAdvisoriesType(AdvisoriesType object) {
				return createAdvisoriesTypeAdapter();
			}
			@Override
			public Adapter caseAdvisoryType(AdvisoryType object) {
				return createAdvisoryTypeAdapter();
			}
			@Override
			public Adapter caseAffectsType(AffectsType object) {
				return createAffectsTypeAdapter();
			}
			@Override
			public Adapter caseAffirmationType(AffirmationType object) {
				return createAffirmationTypeAdapter();
			}
			@Override
			public Adapter caseAlgorithmPropertiesType(AlgorithmPropertiesType object) {
				return createAlgorithmPropertiesTypeAdapter();
			}
			@Override
			public Adapter caseAlgorithmsType(AlgorithmsType object) {
				return createAlgorithmsTypeAdapter();
			}
			@Override
			public Adapter caseAliasesType(AliasesType object) {
				return createAliasesTypeAdapter();
			}
			@Override
			public Adapter caseAliasesType1(AliasesType1 object) {
				return createAliasesType1Adapter();
			}
			@Override
			public Adapter caseAltIdsType(AltIdsType object) {
				return createAltIdsTypeAdapter();
			}
			@Override
			public Adapter caseAnalysisType(AnalysisType object) {
				return createAnalysisTypeAdapter();
			}
			@Override
			public Adapter caseAnnotationsType(AnnotationsType object) {
				return createAnnotationsTypeAdapter();
			}
			@Override
			public Adapter caseAnnotationType(AnnotationType object) {
				return createAnnotationTypeAdapter();
			}
			@Override
			public Adapter caseAnnotatorChoiceType(AnnotatorChoiceType object) {
				return createAnnotatorChoiceTypeAdapter();
			}
			@Override
			public Adapter caseApproachType(ApproachType object) {
				return createApproachTypeAdapter();
			}
			@Override
			public Adapter caseAssembliesType(AssembliesType object) {
				return createAssembliesTypeAdapter();
			}
			@Override
			public Adapter caseAssessorsType(AssessorsType object) {
				return createAssessorsTypeAdapter();
			}
			@Override
			public Adapter caseAssessorType(AssessorType object) {
				return createAssessorTypeAdapter();
			}
			@Override
			public Adapter caseAttachedTextType(AttachedTextType object) {
				return createAttachedTextTypeAdapter();
			}
			@Override
			public Adapter caseAttestationsType(AttestationsType object) {
				return createAttestationsTypeAdapter();
			}
			@Override
			public Adapter caseAttestationType(AttestationType object) {
				return createAttestationTypeAdapter();
			}
			@Override
			public Adapter caseAuthorsType(AuthorsType object) {
				return createAuthorsTypeAdapter();
			}
			@Override
			public Adapter caseAuthorsType1(AuthorsType1 object) {
				return createAuthorsType1Adapter();
			}
			@Override
			public Adapter caseBomReferenceType(BomReferenceType object) {
				return createBomReferenceTypeAdapter();
			}
			@Override
			public Adapter caseBomType(BomType object) {
				return createBomTypeAdapter();
			}
			@Override
			public Adapter caseCallstackType(CallstackType object) {
				return createCallstackTypeAdapter();
			}
			@Override
			public Adapter caseCertificatePropertiesType(CertificatePropertiesType object) {
				return createCertificatePropertiesTypeAdapter();
			}
			@Override
			public Adapter caseCipherSuitesType(CipherSuitesType object) {
				return createCipherSuitesTypeAdapter();
			}
			@Override
			public Adapter caseCipherSuiteType(CipherSuiteType object) {
				return createCipherSuiteTypeAdapter();
			}
			@Override
			public Adapter caseClaimsType(ClaimsType object) {
				return createClaimsTypeAdapter();
			}
			@Override
			public Adapter caseClaimsType1(ClaimsType1 object) {
				return createClaimsType1Adapter();
			}
			@Override
			public Adapter caseClaimType(ClaimType object) {
				return createClaimTypeAdapter();
			}
			@Override
			public Adapter caseCo2MeasureType(Co2MeasureType object) {
				return createCo2MeasureTypeAdapter();
			}
			@Override
			public Adapter caseCollectionType(CollectionType object) {
				return createCollectionTypeAdapter();
			}
			@Override
			public Adapter caseCollectionType1(CollectionType1 object) {
				return createCollectionType1Adapter();
			}
			@Override
			public Adapter caseCommandsType(CommandsType object) {
				return createCommandsTypeAdapter();
			}
			@Override
			public Adapter caseCommandType(CommandType object) {
				return createCommandTypeAdapter();
			}
			@Override
			public Adapter caseCommitsType(CommitsType object) {
				return createCommitsTypeAdapter();
			}
			@Override
			public Adapter caseCommitType(CommitType object) {
				return createCommitTypeAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseComponentDataType(ComponentDataType object) {
				return createComponentDataTypeAdapter();
			}
			@Override
			public Adapter caseComponentEvidenceType(ComponentEvidenceType object) {
				return createComponentEvidenceTypeAdapter();
			}
			@Override
			public Adapter caseComponentsType(ComponentsType object) {
				return createComponentsTypeAdapter();
			}
			@Override
			public Adapter caseComponentsType1(ComponentsType1 object) {
				return createComponentsType1Adapter();
			}
			@Override
			public Adapter caseComponentsType2(ComponentsType2 object) {
				return createComponentsType2Adapter();
			}
			@Override
			public Adapter caseCompositionsType(CompositionsType object) {
				return createCompositionsTypeAdapter();
			}
			@Override
			public Adapter caseCompositionType(CompositionType object) {
				return createCompositionTypeAdapter();
			}
			@Override
			public Adapter caseConditionsType(ConditionsType object) {
				return createConditionsTypeAdapter();
			}
			@Override
			public Adapter caseConditionType(ConditionType object) {
				return createConditionTypeAdapter();
			}
			@Override
			public Adapter caseConfidenceIntervalType(ConfidenceIntervalType object) {
				return createConfidenceIntervalTypeAdapter();
			}
			@Override
			public Adapter caseConfidenceType(ConfidenceType object) {
				return createConfidenceTypeAdapter();
			}
			@Override
			public Adapter caseConformanceType(ConformanceType object) {
				return createConformanceTypeAdapter();
			}
			@Override
			public Adapter caseConsiderationsType(ConsiderationsType object) {
				return createConsiderationsTypeAdapter();
			}
			@Override
			public Adapter caseContentsType(ContentsType object) {
				return createContentsTypeAdapter();
			}
			@Override
			public Adapter caseContentsType1(ContentsType1 object) {
				return createContentsType1Adapter();
			}
			@Override
			public Adapter caseCopyrightsType(CopyrightsType object) {
				return createCopyrightsTypeAdapter();
			}
			@Override
			public Adapter caseCounterClaimsType(CounterClaimsType object) {
				return createCounterClaimsTypeAdapter();
			}
			@Override
			public Adapter caseCreditsType(CreditsType object) {
				return createCreditsTypeAdapter();
			}
			@Override
			public Adapter caseCryptoFunctionsType(CryptoFunctionsType object) {
				return createCryptoFunctionsTypeAdapter();
			}
			@Override
			public Adapter caseCryptoPropertiesType(CryptoPropertiesType object) {
				return createCryptoPropertiesTypeAdapter();
			}
			@Override
			public Adapter caseCustodiansType(CustodiansType object) {
				return createCustodiansTypeAdapter();
			}
			@Override
			public Adapter caseCwesType(CwesType object) {
				return createCwesTypeAdapter();
			}
			@Override
			public Adapter caseDataClassificationType(DataClassificationType object) {
				return createDataClassificationTypeAdapter();
			}
			@Override
			public Adapter caseDataflowType(DataflowType object) {
				return createDataflowTypeAdapter();
			}
			@Override
			public Adapter caseDataGovernance(DataGovernance object) {
				return createDataGovernanceAdapter();
			}
			@Override
			public Adapter caseDatasetsType(DatasetsType object) {
				return createDatasetsTypeAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseDataType1(DataType1 object) {
				return createDataType1Adapter();
			}
			@Override
			public Adapter caseDeclarationsType(DeclarationsType object) {
				return createDeclarationsTypeAdapter();
			}
			@Override
			public Adapter caseDefinitionsType(DefinitionsType object) {
				return createDefinitionsTypeAdapter();
			}
			@Override
			public Adapter caseDependenciesType(DependenciesType object) {
				return createDependenciesTypeAdapter();
			}
			@Override
			public Adapter caseDependenciesType1(DependenciesType1 object) {
				return createDependenciesType1Adapter();
			}
			@Override
			public Adapter caseDependencyType(DependencyType object) {
				return createDependencyTypeAdapter();
			}
			@Override
			public Adapter caseDescriptionsType(DescriptionsType object) {
				return createDescriptionsTypeAdapter();
			}
			@Override
			public Adapter caseDestinationType(DestinationType object) {
				return createDestinationTypeAdapter();
			}
			@Override
			public Adapter caseDiffType(DiffType object) {
				return createDiffTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEndpointsType(EndpointsType object) {
				return createEndpointsTypeAdapter();
			}
			@Override
			public Adapter caseEnergyConsumptionsType(EnergyConsumptionsType object) {
				return createEnergyConsumptionsTypeAdapter();
			}
			@Override
			public Adapter caseEnergyConsumptionType(EnergyConsumptionType object) {
				return createEnergyConsumptionTypeAdapter();
			}
			@Override
			public Adapter caseEnergyMeasureType(EnergyMeasureType object) {
				return createEnergyMeasureTypeAdapter();
			}
			@Override
			public Adapter caseEnergyProviderType(EnergyProviderType object) {
				return createEnergyProviderTypeAdapter();
			}
			@Override
			public Adapter caseEnvironmentalConsiderationsType(EnvironmentalConsiderationsType object) {
				return createEnvironmentalConsiderationsTypeAdapter();
			}
			@Override
			public Adapter caseEnvironmentVarsType(EnvironmentVarsType object) {
				return createEnvironmentVarsTypeAdapter();
			}
			@Override
			public Adapter caseEnvironmentVarsType1(EnvironmentVarsType1 object) {
				return createEnvironmentVarsType1Adapter();
			}
			@Override
			public Adapter caseEthicalConsiderationsType(EthicalConsiderationsType object) {
				return createEthicalConsiderationsTypeAdapter();
			}
			@Override
			public Adapter caseEthicalConsiderationType(EthicalConsiderationType object) {
				return createEthicalConsiderationTypeAdapter();
			}
			@Override
			public Adapter caseEventType(EventType object) {
				return createEventTypeAdapter();
			}
			@Override
			public Adapter caseEvidenceType(EvidenceType object) {
				return createEvidenceTypeAdapter();
			}
			@Override
			public Adapter caseEvidenceType1(EvidenceType1 object) {
				return createEvidenceType1Adapter();
			}
			@Override
			public Adapter caseExpressionType(ExpressionType object) {
				return createExpressionTypeAdapter();
			}
			@Override
			public Adapter caseExternalReference(ExternalReference object) {
				return createExternalReferenceAdapter();
			}
			@Override
			public Adapter caseExternalReferences(ExternalReferences object) {
				return createExternalReferencesAdapter();
			}
			@Override
			public Adapter caseFairnessAssessmentsType(FairnessAssessmentsType object) {
				return createFairnessAssessmentsTypeAdapter();
			}
			@Override
			public Adapter caseFairnessAssessmentType(FairnessAssessmentType object) {
				return createFairnessAssessmentTypeAdapter();
			}
			@Override
			public Adapter caseFormulationType(FormulationType object) {
				return createFormulationTypeAdapter();
			}
			@Override
			public Adapter caseFormulaType(FormulaType object) {
				return createFormulaTypeAdapter();
			}
			@Override
			public Adapter caseFramesType(FramesType object) {
				return createFramesTypeAdapter();
			}
			@Override
			public Adapter caseFrameType(FrameType object) {
				return createFrameTypeAdapter();
			}
			@Override
			public Adapter caseGraphicsCollectionType(GraphicsCollectionType object) {
				return createGraphicsCollectionTypeAdapter();
			}
			@Override
			public Adapter caseGraphicsType(GraphicsType object) {
				return createGraphicsTypeAdapter();
			}
			@Override
			public Adapter caseGraphicType(GraphicType object) {
				return createGraphicTypeAdapter();
			}
			@Override
			public Adapter caseGraphicType1(GraphicType1 object) {
				return createGraphicType1Adapter();
			}
			@Override
			public Adapter caseHashesType(HashesType object) {
				return createHashesTypeAdapter();
			}
			@Override
			public Adapter caseHashesType1(HashesType1 object) {
				return createHashesType1Adapter();
			}
			@Override
			public Adapter caseHashesType2(HashesType2 object) {
				return createHashesType2Adapter();
			}
			@Override
			public Adapter caseHashType(HashType object) {
				return createHashTypeAdapter();
			}
			@Override
			public Adapter caseIdentifiableActionType(IdentifiableActionType object) {
				return createIdentifiableActionTypeAdapter();
			}
			@Override
			public Adapter caseIdentifiersType(IdentifiersType object) {
				return createIdentifiersTypeAdapter();
			}
			@Override
			public Adapter caseIdentityType(IdentityType object) {
				return createIdentityTypeAdapter();
			}
			@Override
			public Adapter caseIkev2TransformTypesType(Ikev2TransformTypesType object) {
				return createIkev2TransformTypesTypeAdapter();
			}
			@Override
			public Adapter caseIndividualsType(IndividualsType object) {
				return createIndividualsTypeAdapter();
			}
			@Override
			public Adapter caseInputsType(InputsType object) {
				return createInputsTypeAdapter();
			}
			@Override
			public Adapter caseInputsType1(InputsType1 object) {
				return createInputsType1Adapter();
			}
			@Override
			public Adapter caseInputsType2(InputsType2 object) {
				return createInputsType2Adapter();
			}
			@Override
			public Adapter caseInputsType3(InputsType3 object) {
				return createInputsType3Adapter();
			}
			@Override
			public Adapter caseInputType(InputType object) {
				return createInputTypeAdapter();
			}
			@Override
			public Adapter caseInputType1(InputType1 object) {
				return createInputType1Adapter();
			}
			@Override
			public Adapter caseIssueType(IssueType object) {
				return createIssueTypeAdapter();
			}
			@Override
			public Adapter caseLevelsType(LevelsType object) {
				return createLevelsTypeAdapter();
			}
			@Override
			public Adapter caseLevelType(LevelType object) {
				return createLevelTypeAdapter();
			}
			@Override
			public Adapter caseLicenseChoiceType(LicenseChoiceType object) {
				return createLicenseChoiceTypeAdapter();
			}
			@Override
			public Adapter caseLicenseeType(LicenseeType object) {
				return createLicenseeTypeAdapter();
			}
			@Override
			public Adapter caseLicenseType(LicenseType object) {
				return createLicenseTypeAdapter();
			}
			@Override
			public Adapter caseLicenseTypesType(LicenseTypesType object) {
				return createLicenseTypesTypeAdapter();
			}
			@Override
			public Adapter caseLicensingType(LicensingType object) {
				return createLicensingTypeAdapter();
			}
			@Override
			public Adapter caseLicensorType(LicensorType object) {
				return createLicensorTypeAdapter();
			}
			@Override
			public Adapter caseLifecyclesType(LifecyclesType object) {
				return createLifecyclesTypeAdapter();
			}
			@Override
			public Adapter caseLifecycleType(LifecycleType object) {
				return createLifecycleTypeAdapter();
			}
			@Override
			public Adapter caseMapType(MapType object) {
				return createMapTypeAdapter();
			}
			@Override
			public Adapter caseMetadata(Metadata object) {
				return createMetadataAdapter();
			}
			@Override
			public Adapter caseMethodsType(MethodsType object) {
				return createMethodsTypeAdapter();
			}
			@Override
			public Adapter caseMethodType(MethodType object) {
				return createMethodTypeAdapter();
			}
			@Override
			public Adapter caseMitigationStrategiesType(MitigationStrategiesType object) {
				return createMitigationStrategiesTypeAdapter();
			}
			@Override
			public Adapter caseMitigationStrategiesType1(MitigationStrategiesType1 object) {
				return createMitigationStrategiesType1Adapter();
			}
			@Override
			public Adapter caseModelCardType(ModelCardType object) {
				return createModelCardTypeAdapter();
			}
			@Override
			public Adapter caseModelParametersType(ModelParametersType object) {
				return createModelParametersTypeAdapter();
			}
			@Override
			public Adapter caseNotesType(NotesType object) {
				return createNotesTypeAdapter();
			}
			@Override
			public Adapter caseNoteType(NoteType object) {
				return createNoteTypeAdapter();
			}
			@Override
			public Adapter caseOccurrencesType(OccurrencesType object) {
				return createOccurrencesTypeAdapter();
			}
			@Override
			public Adapter caseOccurrenceType(OccurrenceType object) {
				return createOccurrenceTypeAdapter();
			}
			@Override
			public Adapter caseOrganizationalContact(OrganizationalContact object) {
				return createOrganizationalContactAdapter();
			}
			@Override
			public Adapter caseOrganizationalEntity(OrganizationalEntity object) {
				return createOrganizationalEntityAdapter();
			}
			@Override
			public Adapter caseOrganizationOrIndividualType(OrganizationOrIndividualType object) {
				return createOrganizationOrIndividualTypeAdapter();
			}
			@Override
			public Adapter caseOrganizationsType(OrganizationsType object) {
				return createOrganizationsTypeAdapter();
			}
			@Override
			public Adapter caseOrganizationsType1(OrganizationsType1 object) {
				return createOrganizationsType1Adapter();
			}
			@Override
			public Adapter caseOutputsType(OutputsType object) {
				return createOutputsTypeAdapter();
			}
			@Override
			public Adapter caseOutputsType1(OutputsType1 object) {
				return createOutputsType1Adapter();
			}
			@Override
			public Adapter caseOutputsType2(OutputsType2 object) {
				return createOutputsType2Adapter();
			}
			@Override
			public Adapter caseOutputsType3(OutputsType3 object) {
				return createOutputsType3Adapter();
			}
			@Override
			public Adapter caseOutputType(OutputType object) {
				return createOutputTypeAdapter();
			}
			@Override
			public Adapter caseOutputType1(OutputType1 object) {
				return createOutputType1Adapter();
			}
			@Override
			public Adapter caseOwnersType(OwnersType object) {
				return createOwnersTypeAdapter();
			}
			@Override
			public Adapter caseParametersType(ParametersType object) {
				return createParametersTypeAdapter();
			}
			@Override
			public Adapter caseParametersType1(ParametersType1 object) {
				return createParametersType1Adapter();
			}
			@Override
			public Adapter caseParameterType(ParameterType object) {
				return createParameterTypeAdapter();
			}
			@Override
			public Adapter casePatchesType(PatchesType object) {
				return createPatchesTypeAdapter();
			}
			@Override
			public Adapter casePatchType(PatchType object) {
				return createPatchTypeAdapter();
			}
			@Override
			public Adapter casePedigreeType(PedigreeType object) {
				return createPedigreeTypeAdapter();
			}
			@Override
			public Adapter casePerformanceMetricsType(PerformanceMetricsType object) {
				return createPerformanceMetricsTypeAdapter();
			}
			@Override
			public Adapter casePerformanceMetricType(PerformanceMetricType object) {
				return createPerformanceMetricTypeAdapter();
			}
			@Override
			public Adapter casePerformanceTradeoffsType(PerformanceTradeoffsType object) {
				return createPerformanceTradeoffsTypeAdapter();
			}
			@Override
			public Adapter casePostalAddressType(PostalAddressType object) {
				return createPostalAddressTypeAdapter();
			}
			@Override
			public Adapter caseProofOfConceptType(ProofOfConceptType object) {
				return createProofOfConceptTypeAdapter();
			}
			@Override
			public Adapter casePropertiesType(PropertiesType object) {
				return createPropertiesTypeAdapter();
			}
			@Override
			public Adapter casePropertyType(PropertyType object) {
				return createPropertyTypeAdapter();
			}
			@Override
			public Adapter caseProtocolPropertiesType(ProtocolPropertiesType object) {
				return createProtocolPropertiesTypeAdapter();
			}
			@Override
			public Adapter caseProvidesType(ProvidesType object) {
				return createProvidesTypeAdapter();
			}
			@Override
			public Adapter casePurchaserType(PurchaserType object) {
				return createPurchaserTypeAdapter();
			}
			@Override
			public Adapter caseQuantitativeAnalysisType(QuantitativeAnalysisType object) {
				return createQuantitativeAnalysisTypeAdapter();
			}
			@Override
			public Adapter caseRatingsType(RatingsType object) {
				return createRatingsTypeAdapter();
			}
			@Override
			public Adapter caseRatingType(RatingType object) {
				return createRatingTypeAdapter();
			}
			@Override
			public Adapter caseReferencesType(ReferencesType object) {
				return createReferencesTypeAdapter();
			}
			@Override
			public Adapter caseReferencesType1(ReferencesType1 object) {
				return createReferencesType1Adapter();
			}
			@Override
			public Adapter caseReferenceType(ReferenceType object) {
				return createReferenceTypeAdapter();
			}
			@Override
			public Adapter caseRelatedCryptoMaterialPropertiesType(RelatedCryptoMaterialPropertiesType object) {
				return createRelatedCryptoMaterialPropertiesTypeAdapter();
			}
			@Override
			public Adapter caseReleaseNotesType(ReleaseNotesType object) {
				return createReleaseNotesTypeAdapter();
			}
			@Override
			public Adapter caseRequirementsType(RequirementsType object) {
				return createRequirementsTypeAdapter();
			}
			@Override
			public Adapter caseRequirementsType1(RequirementsType1 object) {
				return createRequirementsType1Adapter();
			}
			@Override
			public Adapter caseRequirementType(RequirementType object) {
				return createRequirementTypeAdapter();
			}
			@Override
			public Adapter caseResolvesType(ResolvesType object) {
				return createResolvesTypeAdapter();
			}
			@Override
			public Adapter caseResolvesType1(ResolvesType1 object) {
				return createResolvesType1Adapter();
			}
			@Override
			public Adapter caseResourceReferencesType(ResourceReferencesType object) {
				return createResourceReferencesTypeAdapter();
			}
			@Override
			public Adapter caseResourceReferenceType(ResourceReferenceType object) {
				return createResourceReferenceTypeAdapter();
			}
			@Override
			public Adapter caseResponsesType(ResponsesType object) {
				return createResponsesTypeAdapter();
			}
			@Override
			public Adapter caseSecuredByType(SecuredByType object) {
				return createSecuredByTypeAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseServicesType(ServicesType object) {
				return createServicesTypeAdapter();
			}
			@Override
			public Adapter caseServicesType1(ServicesType1 object) {
				return createServicesType1Adapter();
			}
			@Override
			public Adapter caseServicesType2(ServicesType2 object) {
				return createServicesType2Adapter();
			}
			@Override
			public Adapter caseSignatoriesType(SignatoriesType object) {
				return createSignatoriesTypeAdapter();
			}
			@Override
			public Adapter caseSignatoryType(SignatoryType object) {
				return createSignatoryTypeAdapter();
			}
			@Override
			public Adapter caseSourceType(SourceType object) {
				return createSourceTypeAdapter();
			}
			@Override
			public Adapter caseSourceType1(SourceType1 object) {
				return createSourceType1Adapter();
			}
			@Override
			public Adapter caseStandard(Standard object) {
				return createStandardAdapter();
			}
			@Override
			public Adapter caseStandardsType(StandardsType object) {
				return createStandardsTypeAdapter();
			}
			@Override
			public Adapter caseStepsType(StepsType object) {
				return createStepsTypeAdapter();
			}
			@Override
			public Adapter caseStepsType1(StepsType1 object) {
				return createStepsType1Adapter();
			}
			@Override
			public Adapter caseStepType(StepType object) {
				return createStepTypeAdapter();
			}
			@Override
			public Adapter caseStewardsType(StewardsType object) {
				return createStewardsTypeAdapter();
			}
			@Override
			public Adapter caseSubjectsType(SubjectsType object) {
				return createSubjectsTypeAdapter();
			}
			@Override
			public Adapter caseSupportingMaterialType(SupportingMaterialType object) {
				return createSupportingMaterialTypeAdapter();
			}
			@Override
			public Adapter caseSwidType(SwidType object) {
				return createSwidTypeAdapter();
			}
			@Override
			public Adapter caseTagsType(TagsType object) {
				return createTagsTypeAdapter();
			}
			@Override
			public Adapter caseTargetsType(TargetsType object) {
				return createTargetsTypeAdapter();
			}
			@Override
			public Adapter caseTargetType(TargetType object) {
				return createTargetTypeAdapter();
			}
			@Override
			public Adapter caseTasksType(TasksType object) {
				return createTasksTypeAdapter();
			}
			@Override
			public Adapter caseTaskType(TaskType object) {
				return createTaskTypeAdapter();
			}
			@Override
			public Adapter caseTaskTypesType(TaskTypesType object) {
				return createTaskTypesTypeAdapter();
			}
			@Override
			public Adapter caseTaskTypesType1(TaskTypesType1 object) {
				return createTaskTypesType1Adapter();
			}
			@Override
			public Adapter caseTechnicalLimitationsType(TechnicalLimitationsType object) {
				return createTechnicalLimitationsTypeAdapter();
			}
			@Override
			public Adapter caseToolsType(ToolsType object) {
				return createToolsTypeAdapter();
			}
			@Override
			public Adapter caseToolsType1(ToolsType1 object) {
				return createToolsType1Adapter();
			}
			@Override
			public Adapter caseToolsType2(ToolsType2 object) {
				return createToolsType2Adapter();
			}
			@Override
			public Adapter caseToolsType3(ToolsType3 object) {
				return createToolsType3Adapter();
			}
			@Override
			public Adapter caseToolType(ToolType object) {
				return createToolTypeAdapter();
			}
			@Override
			public Adapter caseTriggerType(TriggerType object) {
				return createTriggerTypeAdapter();
			}
			@Override
			public Adapter caseUseCasesType(UseCasesType object) {
				return createUseCasesTypeAdapter();
			}
			@Override
			public Adapter caseUsersType(UsersType object) {
				return createUsersTypeAdapter();
			}
			@Override
			public Adapter caseVersionsType(VersionsType object) {
				return createVersionsTypeAdapter();
			}
			@Override
			public Adapter caseVersionType(VersionType object) {
				return createVersionTypeAdapter();
			}
			@Override
			public Adapter caseVolumeType(VolumeType object) {
				return createVolumeTypeAdapter();
			}
			@Override
			public Adapter caseVulnerabilitiesType(VulnerabilitiesType object) {
				return createVulnerabilitiesTypeAdapter();
			}
			@Override
			public Adapter caseVulnerabilitiesType1(VulnerabilitiesType1 object) {
				return createVulnerabilitiesType1Adapter();
			}
			@Override
			public Adapter caseVulnerabilitySourceType(VulnerabilitySourceType object) {
				return createVulnerabilitySourceTypeAdapter();
			}
			@Override
			public Adapter caseVulnerabilityType(VulnerabilityType object) {
				return createVulnerabilityTypeAdapter();
			}
			@Override
			public Adapter caseWorkflowsType(WorkflowsType object) {
				return createWorkflowsTypeAdapter();
			}
			@Override
			public Adapter caseWorkflowType(WorkflowType object) {
				return createWorkflowTypeAdapter();
			}
			@Override
			public Adapter caseWorkspacesType(WorkspacesType object) {
				return createWorkspacesTypeAdapter();
			}
			@Override
			public Adapter caseWorkspaceType(WorkspaceType object) {
				return createWorkspaceTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.AdvisoriesType <em>Advisories Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.AdvisoriesType
	 * @generated
	 */
	public Adapter createAdvisoriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.AdvisoryType <em>Advisory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.AdvisoryType
	 * @generated
	 */
	public Adapter createAdvisoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.AffectsType <em>Affects Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.AffectsType
	 * @generated
	 */
	public Adapter createAffectsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.AffirmationType <em>Affirmation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.AffirmationType
	 * @generated
	 */
	public Adapter createAffirmationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.AlgorithmPropertiesType <em>Algorithm Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.AlgorithmPropertiesType
	 * @generated
	 */
	public Adapter createAlgorithmPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.AlgorithmsType <em>Algorithms Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.AlgorithmsType
	 * @generated
	 */
	public Adapter createAlgorithmsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.AliasesType <em>Aliases Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.AliasesType
	 * @generated
	 */
	public Adapter createAliasesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.AliasesType1 <em>Aliases Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.AliasesType1
	 * @generated
	 */
	public Adapter createAliasesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.AltIdsType <em>Alt Ids Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.AltIdsType
	 * @generated
	 */
	public Adapter createAltIdsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.AnalysisType <em>Analysis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.AnalysisType
	 * @generated
	 */
	public Adapter createAnalysisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.AnnotationsType <em>Annotations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.AnnotationsType
	 * @generated
	 */
	public Adapter createAnnotationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.AnnotationType <em>Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.AnnotationType
	 * @generated
	 */
	public Adapter createAnnotationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.AnnotatorChoiceType <em>Annotator Choice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.AnnotatorChoiceType
	 * @generated
	 */
	public Adapter createAnnotatorChoiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ApproachType <em>Approach Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ApproachType
	 * @generated
	 */
	public Adapter createApproachTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.AssembliesType <em>Assemblies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.AssembliesType
	 * @generated
	 */
	public Adapter createAssembliesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.AssessorsType <em>Assessors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.AssessorsType
	 * @generated
	 */
	public Adapter createAssessorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.AssessorType <em>Assessor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.AssessorType
	 * @generated
	 */
	public Adapter createAssessorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.AttachedTextType <em>Attached Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.AttachedTextType
	 * @generated
	 */
	public Adapter createAttachedTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.AttestationsType <em>Attestations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.AttestationsType
	 * @generated
	 */
	public Adapter createAttestationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.AttestationType <em>Attestation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.AttestationType
	 * @generated
	 */
	public Adapter createAttestationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.AuthorsType <em>Authors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.AuthorsType
	 * @generated
	 */
	public Adapter createAuthorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.AuthorsType1 <em>Authors Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.AuthorsType1
	 * @generated
	 */
	public Adapter createAuthorsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.BomReferenceType <em>Bom Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.BomReferenceType
	 * @generated
	 */
	public Adapter createBomReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.BomType <em>Bom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.BomType
	 * @generated
	 */
	public Adapter createBomTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.CallstackType <em>Callstack Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.CallstackType
	 * @generated
	 */
	public Adapter createCallstackTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.CertificatePropertiesType <em>Certificate Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.CertificatePropertiesType
	 * @generated
	 */
	public Adapter createCertificatePropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.CipherSuitesType <em>Cipher Suites Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.CipherSuitesType
	 * @generated
	 */
	public Adapter createCipherSuitesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.CipherSuiteType <em>Cipher Suite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.CipherSuiteType
	 * @generated
	 */
	public Adapter createCipherSuiteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ClaimsType <em>Claims Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ClaimsType
	 * @generated
	 */
	public Adapter createClaimsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ClaimsType1 <em>Claims Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ClaimsType1
	 * @generated
	 */
	public Adapter createClaimsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ClaimType <em>Claim Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ClaimType
	 * @generated
	 */
	public Adapter createClaimTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.Co2MeasureType <em>Co2 Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.Co2MeasureType
	 * @generated
	 */
	public Adapter createCo2MeasureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.CollectionType
	 * @generated
	 */
	public Adapter createCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.CollectionType1 <em>Collection Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.CollectionType1
	 * @generated
	 */
	public Adapter createCollectionType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.CommandsType <em>Commands Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.CommandsType
	 * @generated
	 */
	public Adapter createCommandsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.CommandType <em>Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.CommandType
	 * @generated
	 */
	public Adapter createCommandTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.CommitsType <em>Commits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.CommitsType
	 * @generated
	 */
	public Adapter createCommitsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.CommitType <em>Commit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.CommitType
	 * @generated
	 */
	public Adapter createCommitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ComponentDataType <em>Component Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ComponentDataType
	 * @generated
	 */
	public Adapter createComponentDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ComponentEvidenceType <em>Component Evidence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ComponentEvidenceType
	 * @generated
	 */
	public Adapter createComponentEvidenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ComponentsType <em>Components Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ComponentsType
	 * @generated
	 */
	public Adapter createComponentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ComponentsType1 <em>Components Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ComponentsType1
	 * @generated
	 */
	public Adapter createComponentsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ComponentsType2 <em>Components Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ComponentsType2
	 * @generated
	 */
	public Adapter createComponentsType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.CompositionsType <em>Compositions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.CompositionsType
	 * @generated
	 */
	public Adapter createCompositionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.CompositionType <em>Composition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.CompositionType
	 * @generated
	 */
	public Adapter createCompositionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ConditionsType <em>Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ConditionsType
	 * @generated
	 */
	public Adapter createConditionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ConditionType
	 * @generated
	 */
	public Adapter createConditionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ConfidenceIntervalType <em>Confidence Interval Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ConfidenceIntervalType
	 * @generated
	 */
	public Adapter createConfidenceIntervalTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ConfidenceType <em>Confidence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ConfidenceType
	 * @generated
	 */
	public Adapter createConfidenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ConformanceType <em>Conformance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ConformanceType
	 * @generated
	 */
	public Adapter createConformanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ConsiderationsType <em>Considerations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ConsiderationsType
	 * @generated
	 */
	public Adapter createConsiderationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ContentsType <em>Contents Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ContentsType
	 * @generated
	 */
	public Adapter createContentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ContentsType1 <em>Contents Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ContentsType1
	 * @generated
	 */
	public Adapter createContentsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.CopyrightsType <em>Copyrights Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.CopyrightsType
	 * @generated
	 */
	public Adapter createCopyrightsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.CounterClaimsType <em>Counter Claims Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.CounterClaimsType
	 * @generated
	 */
	public Adapter createCounterClaimsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.CreditsType <em>Credits Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.CreditsType
	 * @generated
	 */
	public Adapter createCreditsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.CryptoFunctionsType <em>Crypto Functions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.CryptoFunctionsType
	 * @generated
	 */
	public Adapter createCryptoFunctionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.CryptoPropertiesType <em>Crypto Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.CryptoPropertiesType
	 * @generated
	 */
	public Adapter createCryptoPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.CustodiansType <em>Custodians Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.CustodiansType
	 * @generated
	 */
	public Adapter createCustodiansTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.CwesType <em>Cwes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.CwesType
	 * @generated
	 */
	public Adapter createCwesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.DataClassificationType <em>Data Classification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.DataClassificationType
	 * @generated
	 */
	public Adapter createDataClassificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.DataflowType <em>Dataflow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.DataflowType
	 * @generated
	 */
	public Adapter createDataflowTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.DataGovernance <em>Data Governance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.DataGovernance
	 * @generated
	 */
	public Adapter createDataGovernanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.DatasetsType <em>Datasets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.DatasetsType
	 * @generated
	 */
	public Adapter createDatasetsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.DataType1 <em>Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.DataType1
	 * @generated
	 */
	public Adapter createDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.DeclarationsType <em>Declarations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.DeclarationsType
	 * @generated
	 */
	public Adapter createDeclarationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.DefinitionsType <em>Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.DefinitionsType
	 * @generated
	 */
	public Adapter createDefinitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.DependenciesType <em>Dependencies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.DependenciesType
	 * @generated
	 */
	public Adapter createDependenciesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.DependenciesType1 <em>Dependencies Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.DependenciesType1
	 * @generated
	 */
	public Adapter createDependenciesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.DependencyType <em>Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.DependencyType
	 * @generated
	 */
	public Adapter createDependencyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.DescriptionsType <em>Descriptions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.DescriptionsType
	 * @generated
	 */
	public Adapter createDescriptionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.DestinationType <em>Destination Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.DestinationType
	 * @generated
	 */
	public Adapter createDestinationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.DiffType <em>Diff Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.DiffType
	 * @generated
	 */
	public Adapter createDiffTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.EndpointsType <em>Endpoints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.EndpointsType
	 * @generated
	 */
	public Adapter createEndpointsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.EnergyConsumptionsType <em>Energy Consumptions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.EnergyConsumptionsType
	 * @generated
	 */
	public Adapter createEnergyConsumptionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.EnergyConsumptionType <em>Energy Consumption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.EnergyConsumptionType
	 * @generated
	 */
	public Adapter createEnergyConsumptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.EnergyMeasureType <em>Energy Measure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.EnergyMeasureType
	 * @generated
	 */
	public Adapter createEnergyMeasureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.EnergyProviderType <em>Energy Provider Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.EnergyProviderType
	 * @generated
	 */
	public Adapter createEnergyProviderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.EnvironmentalConsiderationsType <em>Environmental Considerations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.EnvironmentalConsiderationsType
	 * @generated
	 */
	public Adapter createEnvironmentalConsiderationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.EnvironmentVarsType <em>Environment Vars Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.EnvironmentVarsType
	 * @generated
	 */
	public Adapter createEnvironmentVarsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.EnvironmentVarsType1 <em>Environment Vars Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.EnvironmentVarsType1
	 * @generated
	 */
	public Adapter createEnvironmentVarsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.EthicalConsiderationsType <em>Ethical Considerations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.EthicalConsiderationsType
	 * @generated
	 */
	public Adapter createEthicalConsiderationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.EthicalConsiderationType <em>Ethical Consideration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.EthicalConsiderationType
	 * @generated
	 */
	public Adapter createEthicalConsiderationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.EventType
	 * @generated
	 */
	public Adapter createEventTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.EvidenceType <em>Evidence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.EvidenceType
	 * @generated
	 */
	public Adapter createEvidenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.EvidenceType1 <em>Evidence Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.EvidenceType1
	 * @generated
	 */
	public Adapter createEvidenceType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ExpressionType <em>Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ExpressionType
	 * @generated
	 */
	public Adapter createExpressionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ExternalReference
	 * @generated
	 */
	public Adapter createExternalReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ExternalReferences <em>External References</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ExternalReferences
	 * @generated
	 */
	public Adapter createExternalReferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.FairnessAssessmentsType <em>Fairness Assessments Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.FairnessAssessmentsType
	 * @generated
	 */
	public Adapter createFairnessAssessmentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.FairnessAssessmentType <em>Fairness Assessment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.FairnessAssessmentType
	 * @generated
	 */
	public Adapter createFairnessAssessmentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.FormulationType <em>Formulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.FormulationType
	 * @generated
	 */
	public Adapter createFormulationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.FormulaType <em>Formula Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.FormulaType
	 * @generated
	 */
	public Adapter createFormulaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.FramesType <em>Frames Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.FramesType
	 * @generated
	 */
	public Adapter createFramesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.FrameType <em>Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.FrameType
	 * @generated
	 */
	public Adapter createFrameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.GraphicsCollectionType <em>Graphics Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.GraphicsCollectionType
	 * @generated
	 */
	public Adapter createGraphicsCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.GraphicsType <em>Graphics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.GraphicsType
	 * @generated
	 */
	public Adapter createGraphicsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.GraphicType <em>Graphic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.GraphicType
	 * @generated
	 */
	public Adapter createGraphicTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.GraphicType1 <em>Graphic Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.GraphicType1
	 * @generated
	 */
	public Adapter createGraphicType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.HashesType <em>Hashes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.HashesType
	 * @generated
	 */
	public Adapter createHashesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.HashesType1 <em>Hashes Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.HashesType1
	 * @generated
	 */
	public Adapter createHashesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.HashesType2 <em>Hashes Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.HashesType2
	 * @generated
	 */
	public Adapter createHashesType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.HashType <em>Hash Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.HashType
	 * @generated
	 */
	public Adapter createHashTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.IdentifiableActionType <em>Identifiable Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.IdentifiableActionType
	 * @generated
	 */
	public Adapter createIdentifiableActionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.IdentifiersType <em>Identifiers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.IdentifiersType
	 * @generated
	 */
	public Adapter createIdentifiersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.IdentityType <em>Identity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.IdentityType
	 * @generated
	 */
	public Adapter createIdentityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.Ikev2TransformTypesType <em>Ikev2 Transform Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.Ikev2TransformTypesType
	 * @generated
	 */
	public Adapter createIkev2TransformTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.IndividualsType <em>Individuals Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.IndividualsType
	 * @generated
	 */
	public Adapter createIndividualsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.InputsType <em>Inputs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.InputsType
	 * @generated
	 */
	public Adapter createInputsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.InputsType1 <em>Inputs Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.InputsType1
	 * @generated
	 */
	public Adapter createInputsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.InputsType2 <em>Inputs Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.InputsType2
	 * @generated
	 */
	public Adapter createInputsType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.InputsType3 <em>Inputs Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.InputsType3
	 * @generated
	 */
	public Adapter createInputsType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.InputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.InputType
	 * @generated
	 */
	public Adapter createInputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.InputType1 <em>Input Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.InputType1
	 * @generated
	 */
	public Adapter createInputType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.IssueType <em>Issue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.IssueType
	 * @generated
	 */
	public Adapter createIssueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.LevelsType <em>Levels Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.LevelsType
	 * @generated
	 */
	public Adapter createLevelsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.LevelType <em>Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.LevelType
	 * @generated
	 */
	public Adapter createLevelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.LicenseChoiceType <em>License Choice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.LicenseChoiceType
	 * @generated
	 */
	public Adapter createLicenseChoiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.LicenseeType <em>Licensee Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.LicenseeType
	 * @generated
	 */
	public Adapter createLicenseeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.LicenseType <em>License Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.LicenseType
	 * @generated
	 */
	public Adapter createLicenseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.LicenseTypesType <em>License Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.LicenseTypesType
	 * @generated
	 */
	public Adapter createLicenseTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.LicensingType <em>Licensing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.LicensingType
	 * @generated
	 */
	public Adapter createLicensingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.LicensorType <em>Licensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.LicensorType
	 * @generated
	 */
	public Adapter createLicensorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.LifecyclesType <em>Lifecycles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.LifecyclesType
	 * @generated
	 */
	public Adapter createLifecyclesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.LifecycleType <em>Lifecycle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.LifecycleType
	 * @generated
	 */
	public Adapter createLifecycleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.MapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.MapType
	 * @generated
	 */
	public Adapter createMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.Metadata
	 * @generated
	 */
	public Adapter createMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.MethodsType <em>Methods Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.MethodsType
	 * @generated
	 */
	public Adapter createMethodsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.MethodType <em>Method Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.MethodType
	 * @generated
	 */
	public Adapter createMethodTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.MitigationStrategiesType <em>Mitigation Strategies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.MitigationStrategiesType
	 * @generated
	 */
	public Adapter createMitigationStrategiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.MitigationStrategiesType1 <em>Mitigation Strategies Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.MitigationStrategiesType1
	 * @generated
	 */
	public Adapter createMitigationStrategiesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ModelCardType <em>Model Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ModelCardType
	 * @generated
	 */
	public Adapter createModelCardTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ModelParametersType <em>Model Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ModelParametersType
	 * @generated
	 */
	public Adapter createModelParametersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.NotesType <em>Notes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.NotesType
	 * @generated
	 */
	public Adapter createNotesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.NoteType <em>Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.NoteType
	 * @generated
	 */
	public Adapter createNoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.OccurrencesType <em>Occurrences Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.OccurrencesType
	 * @generated
	 */
	public Adapter createOccurrencesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.OccurrenceType <em>Occurrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.OccurrenceType
	 * @generated
	 */
	public Adapter createOccurrenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.OrganizationalContact <em>Organizational Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.OrganizationalContact
	 * @generated
	 */
	public Adapter createOrganizationalContactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.OrganizationalEntity <em>Organizational Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.OrganizationalEntity
	 * @generated
	 */
	public Adapter createOrganizationalEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.OrganizationOrIndividualType <em>Organization Or Individual Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.OrganizationOrIndividualType
	 * @generated
	 */
	public Adapter createOrganizationOrIndividualTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.OrganizationsType <em>Organizations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.OrganizationsType
	 * @generated
	 */
	public Adapter createOrganizationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.OrganizationsType1 <em>Organizations Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.OrganizationsType1
	 * @generated
	 */
	public Adapter createOrganizationsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.OutputsType <em>Outputs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.OutputsType
	 * @generated
	 */
	public Adapter createOutputsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.OutputsType1 <em>Outputs Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.OutputsType1
	 * @generated
	 */
	public Adapter createOutputsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.OutputsType2 <em>Outputs Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.OutputsType2
	 * @generated
	 */
	public Adapter createOutputsType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.OutputsType3 <em>Outputs Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.OutputsType3
	 * @generated
	 */
	public Adapter createOutputsType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.OutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.OutputType
	 * @generated
	 */
	public Adapter createOutputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.OutputType1 <em>Output Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.OutputType1
	 * @generated
	 */
	public Adapter createOutputType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.OwnersType <em>Owners Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.OwnersType
	 * @generated
	 */
	public Adapter createOwnersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ParametersType <em>Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ParametersType
	 * @generated
	 */
	public Adapter createParametersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ParametersType1 <em>Parameters Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ParametersType1
	 * @generated
	 */
	public Adapter createParametersType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ParameterType
	 * @generated
	 */
	public Adapter createParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.PatchesType <em>Patches Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.PatchesType
	 * @generated
	 */
	public Adapter createPatchesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.PatchType <em>Patch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.PatchType
	 * @generated
	 */
	public Adapter createPatchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.PedigreeType <em>Pedigree Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.PedigreeType
	 * @generated
	 */
	public Adapter createPedigreeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.PerformanceMetricsType <em>Performance Metrics Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.PerformanceMetricsType
	 * @generated
	 */
	public Adapter createPerformanceMetricsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.PerformanceMetricType <em>Performance Metric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.PerformanceMetricType
	 * @generated
	 */
	public Adapter createPerformanceMetricTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.PerformanceTradeoffsType <em>Performance Tradeoffs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.PerformanceTradeoffsType
	 * @generated
	 */
	public Adapter createPerformanceTradeoffsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.PostalAddressType <em>Postal Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.PostalAddressType
	 * @generated
	 */
	public Adapter createPostalAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ProofOfConceptType <em>Proof Of Concept Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ProofOfConceptType
	 * @generated
	 */
	public Adapter createProofOfConceptTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.PropertiesType <em>Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.PropertiesType
	 * @generated
	 */
	public Adapter createPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.PropertyType
	 * @generated
	 */
	public Adapter createPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ProtocolPropertiesType <em>Protocol Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ProtocolPropertiesType
	 * @generated
	 */
	public Adapter createProtocolPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ProvidesType <em>Provides Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ProvidesType
	 * @generated
	 */
	public Adapter createProvidesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.PurchaserType <em>Purchaser Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.PurchaserType
	 * @generated
	 */
	public Adapter createPurchaserTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.QuantitativeAnalysisType <em>Quantitative Analysis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.QuantitativeAnalysisType
	 * @generated
	 */
	public Adapter createQuantitativeAnalysisTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.RatingsType <em>Ratings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.RatingsType
	 * @generated
	 */
	public Adapter createRatingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.RatingType <em>Rating Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.RatingType
	 * @generated
	 */
	public Adapter createRatingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ReferencesType <em>References Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ReferencesType
	 * @generated
	 */
	public Adapter createReferencesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ReferencesType1 <em>References Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ReferencesType1
	 * @generated
	 */
	public Adapter createReferencesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ReferenceType
	 * @generated
	 */
	public Adapter createReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType <em>Related Crypto Material Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.RelatedCryptoMaterialPropertiesType
	 * @generated
	 */
	public Adapter createRelatedCryptoMaterialPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ReleaseNotesType <em>Release Notes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ReleaseNotesType
	 * @generated
	 */
	public Adapter createReleaseNotesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.RequirementsType <em>Requirements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.RequirementsType
	 * @generated
	 */
	public Adapter createRequirementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.RequirementsType1 <em>Requirements Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.RequirementsType1
	 * @generated
	 */
	public Adapter createRequirementsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.RequirementType <em>Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.RequirementType
	 * @generated
	 */
	public Adapter createRequirementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ResolvesType <em>Resolves Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ResolvesType
	 * @generated
	 */
	public Adapter createResolvesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ResolvesType1 <em>Resolves Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ResolvesType1
	 * @generated
	 */
	public Adapter createResolvesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ResourceReferencesType <em>Resource References Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ResourceReferencesType
	 * @generated
	 */
	public Adapter createResourceReferencesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ResourceReferenceType <em>Resource Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ResourceReferenceType
	 * @generated
	 */
	public Adapter createResourceReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ResponsesType <em>Responses Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ResponsesType
	 * @generated
	 */
	public Adapter createResponsesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.SecuredByType <em>Secured By Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.SecuredByType
	 * @generated
	 */
	public Adapter createSecuredByTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ServicesType <em>Services Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ServicesType
	 * @generated
	 */
	public Adapter createServicesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ServicesType1 <em>Services Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ServicesType1
	 * @generated
	 */
	public Adapter createServicesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ServicesType2 <em>Services Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ServicesType2
	 * @generated
	 */
	public Adapter createServicesType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.SignatoriesType <em>Signatories Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.SignatoriesType
	 * @generated
	 */
	public Adapter createSignatoriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.SignatoryType <em>Signatory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.SignatoryType
	 * @generated
	 */
	public Adapter createSignatoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.SourceType
	 * @generated
	 */
	public Adapter createSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.SourceType1 <em>Source Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.SourceType1
	 * @generated
	 */
	public Adapter createSourceType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.Standard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.Standard
	 * @generated
	 */
	public Adapter createStandardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.StandardsType <em>Standards Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.StandardsType
	 * @generated
	 */
	public Adapter createStandardsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.StepsType <em>Steps Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.StepsType
	 * @generated
	 */
	public Adapter createStepsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.StepsType1 <em>Steps Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.StepsType1
	 * @generated
	 */
	public Adapter createStepsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.StepType <em>Step Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.StepType
	 * @generated
	 */
	public Adapter createStepTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.StewardsType <em>Stewards Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.StewardsType
	 * @generated
	 */
	public Adapter createStewardsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.SubjectsType <em>Subjects Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.SubjectsType
	 * @generated
	 */
	public Adapter createSubjectsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.SupportingMaterialType <em>Supporting Material Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.SupportingMaterialType
	 * @generated
	 */
	public Adapter createSupportingMaterialTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.SwidType <em>Swid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.SwidType
	 * @generated
	 */
	public Adapter createSwidTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.TagsType <em>Tags Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.TagsType
	 * @generated
	 */
	public Adapter createTagsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.TargetsType <em>Targets Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.TargetsType
	 * @generated
	 */
	public Adapter createTargetsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.TargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.TargetType
	 * @generated
	 */
	public Adapter createTargetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.TasksType <em>Tasks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.TasksType
	 * @generated
	 */
	public Adapter createTasksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.TaskType <em>Task Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.TaskType
	 * @generated
	 */
	public Adapter createTaskTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.TaskTypesType <em>Task Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.TaskTypesType
	 * @generated
	 */
	public Adapter createTaskTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.TaskTypesType1 <em>Task Types Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.TaskTypesType1
	 * @generated
	 */
	public Adapter createTaskTypesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.TechnicalLimitationsType <em>Technical Limitations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.TechnicalLimitationsType
	 * @generated
	 */
	public Adapter createTechnicalLimitationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ToolsType <em>Tools Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ToolsType
	 * @generated
	 */
	public Adapter createToolsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ToolsType1 <em>Tools Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ToolsType1
	 * @generated
	 */
	public Adapter createToolsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ToolsType2 <em>Tools Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ToolsType2
	 * @generated
	 */
	public Adapter createToolsType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ToolsType3 <em>Tools Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ToolsType3
	 * @generated
	 */
	public Adapter createToolsType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.ToolType <em>Tool Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.ToolType
	 * @generated
	 */
	public Adapter createToolTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.TriggerType <em>Trigger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.TriggerType
	 * @generated
	 */
	public Adapter createTriggerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.UseCasesType <em>Use Cases Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.UseCasesType
	 * @generated
	 */
	public Adapter createUseCasesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.UsersType <em>Users Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.UsersType
	 * @generated
	 */
	public Adapter createUsersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.VersionsType <em>Versions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.VersionsType
	 * @generated
	 */
	public Adapter createVersionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.VersionType <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.VersionType
	 * @generated
	 */
	public Adapter createVersionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.VolumeType <em>Volume Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.VolumeType
	 * @generated
	 */
	public Adapter createVolumeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.VulnerabilitiesType <em>Vulnerabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.VulnerabilitiesType
	 * @generated
	 */
	public Adapter createVulnerabilitiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.VulnerabilitiesType1 <em>Vulnerabilities Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.VulnerabilitiesType1
	 * @generated
	 */
	public Adapter createVulnerabilitiesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.VulnerabilitySourceType <em>Vulnerability Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.VulnerabilitySourceType
	 * @generated
	 */
	public Adapter createVulnerabilitySourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.VulnerabilityType <em>Vulnerability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.VulnerabilityType
	 * @generated
	 */
	public Adapter createVulnerabilityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.WorkflowsType <em>Workflows Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.WorkflowsType
	 * @generated
	 */
	public Adapter createWorkflowsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.WorkflowType <em>Workflow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.WorkflowType
	 * @generated
	 */
	public Adapter createWorkflowTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.WorkspacesType <em>Workspaces Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.WorkspacesType
	 * @generated
	 */
	public Adapter createWorkspacesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.cyclonedx.schema.bom.WorkspaceType <em>Workspace Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.cyclonedx.schema.bom.WorkspaceType
	 * @generated
	 */
	public Adapter createWorkspaceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BOMAdapterFactory
