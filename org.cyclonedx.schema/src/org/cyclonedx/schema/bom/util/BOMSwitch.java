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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage
 * @generated
 */
public class BOMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BOMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOMSwitch() {
		if (modelPackage == null) {
			modelPackage = BOMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BOMPackage.ADVISORIES_TYPE: {
				AdvisoriesType advisoriesType = (AdvisoriesType)theEObject;
				T result = caseAdvisoriesType(advisoriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ADVISORY_TYPE: {
				AdvisoryType advisoryType = (AdvisoryType)theEObject;
				T result = caseAdvisoryType(advisoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.AFFECTS_TYPE: {
				AffectsType affectsType = (AffectsType)theEObject;
				T result = caseAffectsType(affectsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.AFFIRMATION_TYPE: {
				AffirmationType affirmationType = (AffirmationType)theEObject;
				T result = caseAffirmationType(affirmationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ALGORITHM_PROPERTIES_TYPE: {
				AlgorithmPropertiesType algorithmPropertiesType = (AlgorithmPropertiesType)theEObject;
				T result = caseAlgorithmPropertiesType(algorithmPropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ALGORITHMS_TYPE: {
				AlgorithmsType algorithmsType = (AlgorithmsType)theEObject;
				T result = caseAlgorithmsType(algorithmsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ALIASES_TYPE: {
				AliasesType aliasesType = (AliasesType)theEObject;
				T result = caseAliasesType(aliasesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ALIASES_TYPE1: {
				AliasesType1 aliasesType1 = (AliasesType1)theEObject;
				T result = caseAliasesType1(aliasesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ALT_IDS_TYPE: {
				AltIdsType altIdsType = (AltIdsType)theEObject;
				T result = caseAltIdsType(altIdsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ANALYSIS_TYPE: {
				AnalysisType analysisType = (AnalysisType)theEObject;
				T result = caseAnalysisType(analysisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ANNOTATIONS_TYPE: {
				AnnotationsType annotationsType = (AnnotationsType)theEObject;
				T result = caseAnnotationsType(annotationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ANNOTATION_TYPE: {
				AnnotationType annotationType = (AnnotationType)theEObject;
				T result = caseAnnotationType(annotationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ANNOTATOR_CHOICE_TYPE: {
				AnnotatorChoiceType annotatorChoiceType = (AnnotatorChoiceType)theEObject;
				T result = caseAnnotatorChoiceType(annotatorChoiceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.APPROACH_TYPE: {
				ApproachType approachType = (ApproachType)theEObject;
				T result = caseApproachType(approachType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ASSEMBLIES_TYPE: {
				AssembliesType assembliesType = (AssembliesType)theEObject;
				T result = caseAssembliesType(assembliesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ASSESSORS_TYPE: {
				AssessorsType assessorsType = (AssessorsType)theEObject;
				T result = caseAssessorsType(assessorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ASSESSOR_TYPE: {
				AssessorType assessorType = (AssessorType)theEObject;
				T result = caseAssessorType(assessorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ATTACHED_TEXT_TYPE: {
				AttachedTextType attachedTextType = (AttachedTextType)theEObject;
				T result = caseAttachedTextType(attachedTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ATTESTATIONS_TYPE: {
				AttestationsType attestationsType = (AttestationsType)theEObject;
				T result = caseAttestationsType(attestationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ATTESTATION_TYPE: {
				AttestationType attestationType = (AttestationType)theEObject;
				T result = caseAttestationType(attestationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.AUTHORS_TYPE: {
				AuthorsType authorsType = (AuthorsType)theEObject;
				T result = caseAuthorsType(authorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.AUTHORS_TYPE1: {
				AuthorsType1 authorsType1 = (AuthorsType1)theEObject;
				T result = caseAuthorsType1(authorsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.BOM_REFERENCE_TYPE: {
				BomReferenceType bomReferenceType = (BomReferenceType)theEObject;
				T result = caseBomReferenceType(bomReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.BOM_TYPE: {
				BomType bomType = (BomType)theEObject;
				T result = caseBomType(bomType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.CALLSTACK_TYPE: {
				CallstackType callstackType = (CallstackType)theEObject;
				T result = caseCallstackType(callstackType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.CERTIFICATE_PROPERTIES_TYPE: {
				CertificatePropertiesType certificatePropertiesType = (CertificatePropertiesType)theEObject;
				T result = caseCertificatePropertiesType(certificatePropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.CIPHER_SUITES_TYPE: {
				CipherSuitesType cipherSuitesType = (CipherSuitesType)theEObject;
				T result = caseCipherSuitesType(cipherSuitesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.CIPHER_SUITE_TYPE: {
				CipherSuiteType cipherSuiteType = (CipherSuiteType)theEObject;
				T result = caseCipherSuiteType(cipherSuiteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.CLAIMS_TYPE: {
				ClaimsType claimsType = (ClaimsType)theEObject;
				T result = caseClaimsType(claimsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.CLAIMS_TYPE1: {
				ClaimsType1 claimsType1 = (ClaimsType1)theEObject;
				T result = caseClaimsType1(claimsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.CLAIM_TYPE: {
				ClaimType claimType = (ClaimType)theEObject;
				T result = caseClaimType(claimType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.CO2_MEASURE_TYPE: {
				Co2MeasureType co2MeasureType = (Co2MeasureType)theEObject;
				T result = caseCo2MeasureType(co2MeasureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.COLLECTION_TYPE: {
				CollectionType collectionType = (CollectionType)theEObject;
				T result = caseCollectionType(collectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.COLLECTION_TYPE1: {
				CollectionType1 collectionType1 = (CollectionType1)theEObject;
				T result = caseCollectionType1(collectionType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.COMMANDS_TYPE: {
				CommandsType commandsType = (CommandsType)theEObject;
				T result = caseCommandsType(commandsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.COMMAND_TYPE: {
				CommandType commandType = (CommandType)theEObject;
				T result = caseCommandType(commandType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.COMMITS_TYPE: {
				CommitsType commitsType = (CommitsType)theEObject;
				T result = caseCommitsType(commitsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.COMMIT_TYPE: {
				CommitType commitType = (CommitType)theEObject;
				T result = caseCommitType(commitType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.COMPONENT_DATA_TYPE: {
				ComponentDataType componentDataType = (ComponentDataType)theEObject;
				T result = caseComponentDataType(componentDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.COMPONENT_EVIDENCE_TYPE: {
				ComponentEvidenceType componentEvidenceType = (ComponentEvidenceType)theEObject;
				T result = caseComponentEvidenceType(componentEvidenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.COMPONENTS_TYPE: {
				ComponentsType componentsType = (ComponentsType)theEObject;
				T result = caseComponentsType(componentsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.COMPONENTS_TYPE1: {
				ComponentsType1 componentsType1 = (ComponentsType1)theEObject;
				T result = caseComponentsType1(componentsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.COMPONENTS_TYPE2: {
				ComponentsType2 componentsType2 = (ComponentsType2)theEObject;
				T result = caseComponentsType2(componentsType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.COMPOSITIONS_TYPE: {
				CompositionsType compositionsType = (CompositionsType)theEObject;
				T result = caseCompositionsType(compositionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.COMPOSITION_TYPE: {
				CompositionType compositionType = (CompositionType)theEObject;
				T result = caseCompositionType(compositionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.CONDITIONS_TYPE: {
				ConditionsType conditionsType = (ConditionsType)theEObject;
				T result = caseConditionsType(conditionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.CONDITION_TYPE: {
				ConditionType conditionType = (ConditionType)theEObject;
				T result = caseConditionType(conditionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.CONFIDENCE_INTERVAL_TYPE: {
				ConfidenceIntervalType confidenceIntervalType = (ConfidenceIntervalType)theEObject;
				T result = caseConfidenceIntervalType(confidenceIntervalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.CONFIDENCE_TYPE: {
				ConfidenceType confidenceType = (ConfidenceType)theEObject;
				T result = caseConfidenceType(confidenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.CONFORMANCE_TYPE: {
				ConformanceType conformanceType = (ConformanceType)theEObject;
				T result = caseConformanceType(conformanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.CONSIDERATIONS_TYPE: {
				ConsiderationsType considerationsType = (ConsiderationsType)theEObject;
				T result = caseConsiderationsType(considerationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.CONTENTS_TYPE: {
				ContentsType contentsType = (ContentsType)theEObject;
				T result = caseContentsType(contentsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.CONTENTS_TYPE1: {
				ContentsType1 contentsType1 = (ContentsType1)theEObject;
				T result = caseContentsType1(contentsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.COPYRIGHTS_TYPE: {
				CopyrightsType copyrightsType = (CopyrightsType)theEObject;
				T result = caseCopyrightsType(copyrightsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.COUNTER_CLAIMS_TYPE: {
				CounterClaimsType counterClaimsType = (CounterClaimsType)theEObject;
				T result = caseCounterClaimsType(counterClaimsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.CREDITS_TYPE: {
				CreditsType creditsType = (CreditsType)theEObject;
				T result = caseCreditsType(creditsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.CRYPTO_FUNCTIONS_TYPE: {
				CryptoFunctionsType cryptoFunctionsType = (CryptoFunctionsType)theEObject;
				T result = caseCryptoFunctionsType(cryptoFunctionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.CRYPTO_PROPERTIES_TYPE: {
				CryptoPropertiesType cryptoPropertiesType = (CryptoPropertiesType)theEObject;
				T result = caseCryptoPropertiesType(cryptoPropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.CUSTODIANS_TYPE: {
				CustodiansType custodiansType = (CustodiansType)theEObject;
				T result = caseCustodiansType(custodiansType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.CWES_TYPE: {
				CwesType cwesType = (CwesType)theEObject;
				T result = caseCwesType(cwesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.DATA_CLASSIFICATION_TYPE: {
				DataClassificationType dataClassificationType = (DataClassificationType)theEObject;
				T result = caseDataClassificationType(dataClassificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.DATAFLOW_TYPE: {
				DataflowType dataflowType = (DataflowType)theEObject;
				T result = caseDataflowType(dataflowType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.DATA_GOVERNANCE: {
				DataGovernance dataGovernance = (DataGovernance)theEObject;
				T result = caseDataGovernance(dataGovernance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.DATASETS_TYPE: {
				DatasetsType datasetsType = (DatasetsType)theEObject;
				T result = caseDatasetsType(datasetsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.DATA_TYPE1: {
				DataType1 dataType1 = (DataType1)theEObject;
				T result = caseDataType1(dataType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.DECLARATIONS_TYPE: {
				DeclarationsType declarationsType = (DeclarationsType)theEObject;
				T result = caseDeclarationsType(declarationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.DEFINITIONS_TYPE: {
				DefinitionsType definitionsType = (DefinitionsType)theEObject;
				T result = caseDefinitionsType(definitionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.DEPENDENCIES_TYPE: {
				DependenciesType dependenciesType = (DependenciesType)theEObject;
				T result = caseDependenciesType(dependenciesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.DEPENDENCIES_TYPE1: {
				DependenciesType1 dependenciesType1 = (DependenciesType1)theEObject;
				T result = caseDependenciesType1(dependenciesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.DEPENDENCY_TYPE: {
				DependencyType dependencyType = (DependencyType)theEObject;
				T result = caseDependencyType(dependencyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.DESCRIPTIONS_TYPE: {
				DescriptionsType descriptionsType = (DescriptionsType)theEObject;
				T result = caseDescriptionsType(descriptionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.DESTINATION_TYPE: {
				DestinationType destinationType = (DestinationType)theEObject;
				T result = caseDestinationType(destinationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.DIFF_TYPE: {
				DiffType diffType = (DiffType)theEObject;
				T result = caseDiffType(diffType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ENDPOINTS_TYPE: {
				EndpointsType endpointsType = (EndpointsType)theEObject;
				T result = caseEndpointsType(endpointsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ENERGY_CONSUMPTIONS_TYPE: {
				EnergyConsumptionsType energyConsumptionsType = (EnergyConsumptionsType)theEObject;
				T result = caseEnergyConsumptionsType(energyConsumptionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ENERGY_CONSUMPTION_TYPE: {
				EnergyConsumptionType energyConsumptionType = (EnergyConsumptionType)theEObject;
				T result = caseEnergyConsumptionType(energyConsumptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ENERGY_MEASURE_TYPE: {
				EnergyMeasureType energyMeasureType = (EnergyMeasureType)theEObject;
				T result = caseEnergyMeasureType(energyMeasureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ENERGY_PROVIDER_TYPE: {
				EnergyProviderType energyProviderType = (EnergyProviderType)theEObject;
				T result = caseEnergyProviderType(energyProviderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ENVIRONMENTAL_CONSIDERATIONS_TYPE: {
				EnvironmentalConsiderationsType environmentalConsiderationsType = (EnvironmentalConsiderationsType)theEObject;
				T result = caseEnvironmentalConsiderationsType(environmentalConsiderationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ENVIRONMENT_VARS_TYPE: {
				EnvironmentVarsType environmentVarsType = (EnvironmentVarsType)theEObject;
				T result = caseEnvironmentVarsType(environmentVarsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ENVIRONMENT_VARS_TYPE1: {
				EnvironmentVarsType1 environmentVarsType1 = (EnvironmentVarsType1)theEObject;
				T result = caseEnvironmentVarsType1(environmentVarsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ETHICAL_CONSIDERATIONS_TYPE: {
				EthicalConsiderationsType ethicalConsiderationsType = (EthicalConsiderationsType)theEObject;
				T result = caseEthicalConsiderationsType(ethicalConsiderationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ETHICAL_CONSIDERATION_TYPE: {
				EthicalConsiderationType ethicalConsiderationType = (EthicalConsiderationType)theEObject;
				T result = caseEthicalConsiderationType(ethicalConsiderationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.EVENT_TYPE: {
				EventType eventType = (EventType)theEObject;
				T result = caseEventType(eventType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.EVIDENCE_TYPE: {
				EvidenceType evidenceType = (EvidenceType)theEObject;
				T result = caseEvidenceType(evidenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.EVIDENCE_TYPE1: {
				EvidenceType1 evidenceType1 = (EvidenceType1)theEObject;
				T result = caseEvidenceType1(evidenceType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.EXPRESSION_TYPE: {
				ExpressionType expressionType = (ExpressionType)theEObject;
				T result = caseExpressionType(expressionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.EXTERNAL_REFERENCE: {
				ExternalReference externalReference = (ExternalReference)theEObject;
				T result = caseExternalReference(externalReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.EXTERNAL_REFERENCES: {
				ExternalReferences externalReferences = (ExternalReferences)theEObject;
				T result = caseExternalReferences(externalReferences);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.FAIRNESS_ASSESSMENTS_TYPE: {
				FairnessAssessmentsType fairnessAssessmentsType = (FairnessAssessmentsType)theEObject;
				T result = caseFairnessAssessmentsType(fairnessAssessmentsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.FAIRNESS_ASSESSMENT_TYPE: {
				FairnessAssessmentType fairnessAssessmentType = (FairnessAssessmentType)theEObject;
				T result = caseFairnessAssessmentType(fairnessAssessmentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.FORMULATION_TYPE: {
				FormulationType formulationType = (FormulationType)theEObject;
				T result = caseFormulationType(formulationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.FORMULA_TYPE: {
				FormulaType formulaType = (FormulaType)theEObject;
				T result = caseFormulaType(formulaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.FRAMES_TYPE: {
				FramesType framesType = (FramesType)theEObject;
				T result = caseFramesType(framesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.FRAME_TYPE: {
				FrameType frameType = (FrameType)theEObject;
				T result = caseFrameType(frameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.GRAPHICS_COLLECTION_TYPE: {
				GraphicsCollectionType graphicsCollectionType = (GraphicsCollectionType)theEObject;
				T result = caseGraphicsCollectionType(graphicsCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.GRAPHICS_TYPE: {
				GraphicsType graphicsType = (GraphicsType)theEObject;
				T result = caseGraphicsType(graphicsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.GRAPHIC_TYPE: {
				GraphicType graphicType = (GraphicType)theEObject;
				T result = caseGraphicType(graphicType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.GRAPHIC_TYPE1: {
				GraphicType1 graphicType1 = (GraphicType1)theEObject;
				T result = caseGraphicType1(graphicType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.HASHES_TYPE: {
				HashesType hashesType = (HashesType)theEObject;
				T result = caseHashesType(hashesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.HASHES_TYPE1: {
				HashesType1 hashesType1 = (HashesType1)theEObject;
				T result = caseHashesType1(hashesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.HASHES_TYPE2: {
				HashesType2 hashesType2 = (HashesType2)theEObject;
				T result = caseHashesType2(hashesType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.HASH_TYPE: {
				HashType hashType = (HashType)theEObject;
				T result = caseHashType(hashType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.IDENTIFIABLE_ACTION_TYPE: {
				IdentifiableActionType identifiableActionType = (IdentifiableActionType)theEObject;
				T result = caseIdentifiableActionType(identifiableActionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.IDENTIFIERS_TYPE: {
				IdentifiersType identifiersType = (IdentifiersType)theEObject;
				T result = caseIdentifiersType(identifiersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.IDENTITY_TYPE: {
				IdentityType identityType = (IdentityType)theEObject;
				T result = caseIdentityType(identityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.IKEV2_TRANSFORM_TYPES_TYPE: {
				Ikev2TransformTypesType ikev2TransformTypesType = (Ikev2TransformTypesType)theEObject;
				T result = caseIkev2TransformTypesType(ikev2TransformTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.INDIVIDUALS_TYPE: {
				IndividualsType individualsType = (IndividualsType)theEObject;
				T result = caseIndividualsType(individualsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.INPUTS_TYPE: {
				InputsType inputsType = (InputsType)theEObject;
				T result = caseInputsType(inputsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.INPUTS_TYPE1: {
				InputsType1 inputsType1 = (InputsType1)theEObject;
				T result = caseInputsType1(inputsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.INPUTS_TYPE2: {
				InputsType2 inputsType2 = (InputsType2)theEObject;
				T result = caseInputsType2(inputsType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.INPUTS_TYPE3: {
				InputsType3 inputsType3 = (InputsType3)theEObject;
				T result = caseInputsType3(inputsType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.INPUT_TYPE: {
				InputType inputType = (InputType)theEObject;
				T result = caseInputType(inputType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.INPUT_TYPE1: {
				InputType1 inputType1 = (InputType1)theEObject;
				T result = caseInputType1(inputType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ISSUE_TYPE: {
				IssueType issueType = (IssueType)theEObject;
				T result = caseIssueType(issueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.LEVELS_TYPE: {
				LevelsType levelsType = (LevelsType)theEObject;
				T result = caseLevelsType(levelsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.LEVEL_TYPE: {
				LevelType levelType = (LevelType)theEObject;
				T result = caseLevelType(levelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.LICENSE_CHOICE_TYPE: {
				LicenseChoiceType licenseChoiceType = (LicenseChoiceType)theEObject;
				T result = caseLicenseChoiceType(licenseChoiceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.LICENSEE_TYPE: {
				LicenseeType licenseeType = (LicenseeType)theEObject;
				T result = caseLicenseeType(licenseeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.LICENSE_TYPE: {
				LicenseType licenseType = (LicenseType)theEObject;
				T result = caseLicenseType(licenseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.LICENSE_TYPES_TYPE: {
				LicenseTypesType licenseTypesType = (LicenseTypesType)theEObject;
				T result = caseLicenseTypesType(licenseTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.LICENSING_TYPE: {
				LicensingType licensingType = (LicensingType)theEObject;
				T result = caseLicensingType(licensingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.LICENSOR_TYPE: {
				LicensorType licensorType = (LicensorType)theEObject;
				T result = caseLicensorType(licensorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.LIFECYCLES_TYPE: {
				LifecyclesType lifecyclesType = (LifecyclesType)theEObject;
				T result = caseLifecyclesType(lifecyclesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.LIFECYCLE_TYPE: {
				LifecycleType lifecycleType = (LifecycleType)theEObject;
				T result = caseLifecycleType(lifecycleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.MAP_TYPE: {
				MapType mapType = (MapType)theEObject;
				T result = caseMapType(mapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.METADATA: {
				Metadata metadata = (Metadata)theEObject;
				T result = caseMetadata(metadata);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.METHODS_TYPE: {
				MethodsType methodsType = (MethodsType)theEObject;
				T result = caseMethodsType(methodsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.METHOD_TYPE: {
				MethodType methodType = (MethodType)theEObject;
				T result = caseMethodType(methodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.MITIGATION_STRATEGIES_TYPE: {
				MitigationStrategiesType mitigationStrategiesType = (MitigationStrategiesType)theEObject;
				T result = caseMitigationStrategiesType(mitigationStrategiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.MITIGATION_STRATEGIES_TYPE1: {
				MitigationStrategiesType1 mitigationStrategiesType1 = (MitigationStrategiesType1)theEObject;
				T result = caseMitigationStrategiesType1(mitigationStrategiesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.MODEL_CARD_TYPE: {
				ModelCardType modelCardType = (ModelCardType)theEObject;
				T result = caseModelCardType(modelCardType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.MODEL_PARAMETERS_TYPE: {
				ModelParametersType modelParametersType = (ModelParametersType)theEObject;
				T result = caseModelParametersType(modelParametersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.NOTES_TYPE: {
				NotesType notesType = (NotesType)theEObject;
				T result = caseNotesType(notesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.NOTE_TYPE: {
				NoteType noteType = (NoteType)theEObject;
				T result = caseNoteType(noteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.OCCURRENCES_TYPE: {
				OccurrencesType occurrencesType = (OccurrencesType)theEObject;
				T result = caseOccurrencesType(occurrencesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.OCCURRENCE_TYPE: {
				OccurrenceType occurrenceType = (OccurrenceType)theEObject;
				T result = caseOccurrenceType(occurrenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ORGANIZATIONAL_CONTACT: {
				OrganizationalContact organizationalContact = (OrganizationalContact)theEObject;
				T result = caseOrganizationalContact(organizationalContact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ORGANIZATIONAL_ENTITY: {
				OrganizationalEntity organizationalEntity = (OrganizationalEntity)theEObject;
				T result = caseOrganizationalEntity(organizationalEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ORGANIZATION_OR_INDIVIDUAL_TYPE: {
				OrganizationOrIndividualType organizationOrIndividualType = (OrganizationOrIndividualType)theEObject;
				T result = caseOrganizationOrIndividualType(organizationOrIndividualType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ORGANIZATIONS_TYPE: {
				OrganizationsType organizationsType = (OrganizationsType)theEObject;
				T result = caseOrganizationsType(organizationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.ORGANIZATIONS_TYPE1: {
				OrganizationsType1 organizationsType1 = (OrganizationsType1)theEObject;
				T result = caseOrganizationsType1(organizationsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.OUTPUTS_TYPE: {
				OutputsType outputsType = (OutputsType)theEObject;
				T result = caseOutputsType(outputsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.OUTPUTS_TYPE1: {
				OutputsType1 outputsType1 = (OutputsType1)theEObject;
				T result = caseOutputsType1(outputsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.OUTPUTS_TYPE2: {
				OutputsType2 outputsType2 = (OutputsType2)theEObject;
				T result = caseOutputsType2(outputsType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.OUTPUTS_TYPE3: {
				OutputsType3 outputsType3 = (OutputsType3)theEObject;
				T result = caseOutputsType3(outputsType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.OUTPUT_TYPE: {
				OutputType outputType = (OutputType)theEObject;
				T result = caseOutputType(outputType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.OUTPUT_TYPE1: {
				OutputType1 outputType1 = (OutputType1)theEObject;
				T result = caseOutputType1(outputType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.OWNERS_TYPE: {
				OwnersType ownersType = (OwnersType)theEObject;
				T result = caseOwnersType(ownersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.PARAMETERS_TYPE: {
				ParametersType parametersType = (ParametersType)theEObject;
				T result = caseParametersType(parametersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.PARAMETERS_TYPE1: {
				ParametersType1 parametersType1 = (ParametersType1)theEObject;
				T result = caseParametersType1(parametersType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.PARAMETER_TYPE: {
				ParameterType parameterType = (ParameterType)theEObject;
				T result = caseParameterType(parameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.PATCHES_TYPE: {
				PatchesType patchesType = (PatchesType)theEObject;
				T result = casePatchesType(patchesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.PATCH_TYPE: {
				PatchType patchType = (PatchType)theEObject;
				T result = casePatchType(patchType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.PEDIGREE_TYPE: {
				PedigreeType pedigreeType = (PedigreeType)theEObject;
				T result = casePedigreeType(pedigreeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.PERFORMANCE_METRICS_TYPE: {
				PerformanceMetricsType performanceMetricsType = (PerformanceMetricsType)theEObject;
				T result = casePerformanceMetricsType(performanceMetricsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.PERFORMANCE_METRIC_TYPE: {
				PerformanceMetricType performanceMetricType = (PerformanceMetricType)theEObject;
				T result = casePerformanceMetricType(performanceMetricType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.PERFORMANCE_TRADEOFFS_TYPE: {
				PerformanceTradeoffsType performanceTradeoffsType = (PerformanceTradeoffsType)theEObject;
				T result = casePerformanceTradeoffsType(performanceTradeoffsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.POSTAL_ADDRESS_TYPE: {
				PostalAddressType postalAddressType = (PostalAddressType)theEObject;
				T result = casePostalAddressType(postalAddressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.PROOF_OF_CONCEPT_TYPE: {
				ProofOfConceptType proofOfConceptType = (ProofOfConceptType)theEObject;
				T result = caseProofOfConceptType(proofOfConceptType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.PROPERTIES_TYPE: {
				PropertiesType propertiesType = (PropertiesType)theEObject;
				T result = casePropertiesType(propertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.PROPERTY_TYPE: {
				PropertyType propertyType = (PropertyType)theEObject;
				T result = casePropertyType(propertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.PROTOCOL_PROPERTIES_TYPE: {
				ProtocolPropertiesType protocolPropertiesType = (ProtocolPropertiesType)theEObject;
				T result = caseProtocolPropertiesType(protocolPropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.PROVIDES_TYPE: {
				ProvidesType providesType = (ProvidesType)theEObject;
				T result = caseProvidesType(providesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.PURCHASER_TYPE: {
				PurchaserType purchaserType = (PurchaserType)theEObject;
				T result = casePurchaserType(purchaserType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.QUANTITATIVE_ANALYSIS_TYPE: {
				QuantitativeAnalysisType quantitativeAnalysisType = (QuantitativeAnalysisType)theEObject;
				T result = caseQuantitativeAnalysisType(quantitativeAnalysisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.RATINGS_TYPE: {
				RatingsType ratingsType = (RatingsType)theEObject;
				T result = caseRatingsType(ratingsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.RATING_TYPE: {
				RatingType ratingType = (RatingType)theEObject;
				T result = caseRatingType(ratingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.REFERENCES_TYPE: {
				ReferencesType referencesType = (ReferencesType)theEObject;
				T result = caseReferencesType(referencesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.REFERENCES_TYPE1: {
				ReferencesType1 referencesType1 = (ReferencesType1)theEObject;
				T result = caseReferencesType1(referencesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.REFERENCE_TYPE: {
				ReferenceType referenceType = (ReferenceType)theEObject;
				T result = caseReferenceType(referenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.RELATED_CRYPTO_MATERIAL_PROPERTIES_TYPE: {
				RelatedCryptoMaterialPropertiesType relatedCryptoMaterialPropertiesType = (RelatedCryptoMaterialPropertiesType)theEObject;
				T result = caseRelatedCryptoMaterialPropertiesType(relatedCryptoMaterialPropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.RELEASE_NOTES_TYPE: {
				ReleaseNotesType releaseNotesType = (ReleaseNotesType)theEObject;
				T result = caseReleaseNotesType(releaseNotesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.REQUIREMENTS_TYPE: {
				RequirementsType requirementsType = (RequirementsType)theEObject;
				T result = caseRequirementsType(requirementsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.REQUIREMENTS_TYPE1: {
				RequirementsType1 requirementsType1 = (RequirementsType1)theEObject;
				T result = caseRequirementsType1(requirementsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.REQUIREMENT_TYPE: {
				RequirementType requirementType = (RequirementType)theEObject;
				T result = caseRequirementType(requirementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.RESOLVES_TYPE: {
				ResolvesType resolvesType = (ResolvesType)theEObject;
				T result = caseResolvesType(resolvesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.RESOLVES_TYPE1: {
				ResolvesType1 resolvesType1 = (ResolvesType1)theEObject;
				T result = caseResolvesType1(resolvesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.RESOURCE_REFERENCES_TYPE: {
				ResourceReferencesType resourceReferencesType = (ResourceReferencesType)theEObject;
				T result = caseResourceReferencesType(resourceReferencesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.RESOURCE_REFERENCE_TYPE: {
				ResourceReferenceType resourceReferenceType = (ResourceReferenceType)theEObject;
				T result = caseResourceReferenceType(resourceReferenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.RESPONSES_TYPE: {
				ResponsesType responsesType = (ResponsesType)theEObject;
				T result = caseResponsesType(responsesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.SECURED_BY_TYPE: {
				SecuredByType securedByType = (SecuredByType)theEObject;
				T result = caseSecuredByType(securedByType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.SERVICES_TYPE: {
				ServicesType servicesType = (ServicesType)theEObject;
				T result = caseServicesType(servicesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.SERVICES_TYPE1: {
				ServicesType1 servicesType1 = (ServicesType1)theEObject;
				T result = caseServicesType1(servicesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.SERVICES_TYPE2: {
				ServicesType2 servicesType2 = (ServicesType2)theEObject;
				T result = caseServicesType2(servicesType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.SIGNATORIES_TYPE: {
				SignatoriesType signatoriesType = (SignatoriesType)theEObject;
				T result = caseSignatoriesType(signatoriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.SIGNATORY_TYPE: {
				SignatoryType signatoryType = (SignatoryType)theEObject;
				T result = caseSignatoryType(signatoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.SOURCE_TYPE: {
				SourceType sourceType = (SourceType)theEObject;
				T result = caseSourceType(sourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.SOURCE_TYPE1: {
				SourceType1 sourceType1 = (SourceType1)theEObject;
				T result = caseSourceType1(sourceType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.STANDARD: {
				Standard standard = (Standard)theEObject;
				T result = caseStandard(standard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.STANDARDS_TYPE: {
				StandardsType standardsType = (StandardsType)theEObject;
				T result = caseStandardsType(standardsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.STEPS_TYPE: {
				StepsType stepsType = (StepsType)theEObject;
				T result = caseStepsType(stepsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.STEPS_TYPE1: {
				StepsType1 stepsType1 = (StepsType1)theEObject;
				T result = caseStepsType1(stepsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.STEP_TYPE: {
				StepType stepType = (StepType)theEObject;
				T result = caseStepType(stepType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.STEWARDS_TYPE: {
				StewardsType stewardsType = (StewardsType)theEObject;
				T result = caseStewardsType(stewardsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.SUBJECTS_TYPE: {
				SubjectsType subjectsType = (SubjectsType)theEObject;
				T result = caseSubjectsType(subjectsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.SUPPORTING_MATERIAL_TYPE: {
				SupportingMaterialType supportingMaterialType = (SupportingMaterialType)theEObject;
				T result = caseSupportingMaterialType(supportingMaterialType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.SWID_TYPE: {
				SwidType swidType = (SwidType)theEObject;
				T result = caseSwidType(swidType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.TAGS_TYPE: {
				TagsType tagsType = (TagsType)theEObject;
				T result = caseTagsType(tagsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.TARGETS_TYPE: {
				TargetsType targetsType = (TargetsType)theEObject;
				T result = caseTargetsType(targetsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.TARGET_TYPE: {
				TargetType targetType = (TargetType)theEObject;
				T result = caseTargetType(targetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.TASKS_TYPE: {
				TasksType tasksType = (TasksType)theEObject;
				T result = caseTasksType(tasksType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.TASK_TYPE: {
				TaskType taskType = (TaskType)theEObject;
				T result = caseTaskType(taskType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.TASK_TYPES_TYPE: {
				TaskTypesType taskTypesType = (TaskTypesType)theEObject;
				T result = caseTaskTypesType(taskTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.TASK_TYPES_TYPE1: {
				TaskTypesType1 taskTypesType1 = (TaskTypesType1)theEObject;
				T result = caseTaskTypesType1(taskTypesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.TECHNICAL_LIMITATIONS_TYPE: {
				TechnicalLimitationsType technicalLimitationsType = (TechnicalLimitationsType)theEObject;
				T result = caseTechnicalLimitationsType(technicalLimitationsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.TOOLS_TYPE: {
				ToolsType toolsType = (ToolsType)theEObject;
				T result = caseToolsType(toolsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.TOOLS_TYPE1: {
				ToolsType1 toolsType1 = (ToolsType1)theEObject;
				T result = caseToolsType1(toolsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.TOOLS_TYPE2: {
				ToolsType2 toolsType2 = (ToolsType2)theEObject;
				T result = caseToolsType2(toolsType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.TOOLS_TYPE3: {
				ToolsType3 toolsType3 = (ToolsType3)theEObject;
				T result = caseToolsType3(toolsType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.TOOL_TYPE: {
				ToolType toolType = (ToolType)theEObject;
				T result = caseToolType(toolType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.TRIGGER_TYPE: {
				TriggerType triggerType = (TriggerType)theEObject;
				T result = caseTriggerType(triggerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.USE_CASES_TYPE: {
				UseCasesType useCasesType = (UseCasesType)theEObject;
				T result = caseUseCasesType(useCasesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.USERS_TYPE: {
				UsersType usersType = (UsersType)theEObject;
				T result = caseUsersType(usersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.VERSIONS_TYPE: {
				VersionsType versionsType = (VersionsType)theEObject;
				T result = caseVersionsType(versionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.VERSION_TYPE: {
				VersionType versionType = (VersionType)theEObject;
				T result = caseVersionType(versionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.VOLUME_TYPE: {
				VolumeType volumeType = (VolumeType)theEObject;
				T result = caseVolumeType(volumeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.VULNERABILITIES_TYPE: {
				VulnerabilitiesType vulnerabilitiesType = (VulnerabilitiesType)theEObject;
				T result = caseVulnerabilitiesType(vulnerabilitiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.VULNERABILITIES_TYPE1: {
				VulnerabilitiesType1 vulnerabilitiesType1 = (VulnerabilitiesType1)theEObject;
				T result = caseVulnerabilitiesType1(vulnerabilitiesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.VULNERABILITY_SOURCE_TYPE: {
				VulnerabilitySourceType vulnerabilitySourceType = (VulnerabilitySourceType)theEObject;
				T result = caseVulnerabilitySourceType(vulnerabilitySourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.VULNERABILITY_TYPE: {
				VulnerabilityType vulnerabilityType = (VulnerabilityType)theEObject;
				T result = caseVulnerabilityType(vulnerabilityType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.WORKFLOWS_TYPE: {
				WorkflowsType workflowsType = (WorkflowsType)theEObject;
				T result = caseWorkflowsType(workflowsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.WORKFLOW_TYPE: {
				WorkflowType workflowType = (WorkflowType)theEObject;
				T result = caseWorkflowType(workflowType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.WORKSPACES_TYPE: {
				WorkspacesType workspacesType = (WorkspacesType)theEObject;
				T result = caseWorkspacesType(workspacesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BOMPackage.WORKSPACE_TYPE: {
				WorkspaceType workspaceType = (WorkspaceType)theEObject;
				T result = caseWorkspaceType(workspaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advisories Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advisories Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvisoriesType(AdvisoriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advisory Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advisory Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvisoryType(AdvisoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Affects Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Affects Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAffectsType(AffectsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Affirmation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Affirmation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAffirmationType(AffirmationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Algorithm Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Algorithm Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlgorithmPropertiesType(AlgorithmPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Algorithms Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Algorithms Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlgorithmsType(AlgorithmsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aliases Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aliases Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasesType(AliasesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aliases Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aliases Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasesType1(AliasesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alt Ids Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alt Ids Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAltIdsType(AltIdsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analysis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysisType(AnalysisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationsType(AnnotationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationType(AnnotationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotator Choice Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotator Choice Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotatorChoiceType(AnnotatorChoiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Approach Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Approach Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApproachType(ApproachType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assemblies Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assemblies Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssembliesType(AssembliesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessors Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessors Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessorsType(AssessorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessorType(AssessorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attached Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attached Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttachedTextType(AttachedTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attestations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attestations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttestationsType(AttestationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attestation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attestation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttestationType(AttestationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authors Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authors Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorsType(AuthorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authors Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authors Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorsType1(AuthorsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bom Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bom Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBomReferenceType(BomReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bom Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bom Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBomType(BomType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Callstack Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Callstack Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallstackType(CallstackType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Certificate Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Certificate Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCertificatePropertiesType(CertificatePropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cipher Suites Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cipher Suites Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCipherSuitesType(CipherSuitesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cipher Suite Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cipher Suite Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCipherSuiteType(CipherSuiteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claims Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claims Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimsType(ClaimsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claims Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claims Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimsType1(ClaimsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimType(ClaimType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Co2 Measure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Co2 Measure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCo2MeasureType(Co2MeasureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionType(CollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionType1(CollectionType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commands Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commands Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandsType(CommandsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandType(CommandType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commits Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commits Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommitsType(CommitsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commit Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commit Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommitType(CommitType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentDataType(ComponentDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Evidence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Evidence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentEvidenceType(ComponentEvidenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Components Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Components Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentsType(ComponentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Components Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Components Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentsType1(ComponentsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Components Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Components Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentsType2(ComponentsType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compositions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compositions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionsType(CompositionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionType(CompositionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionsType(ConditionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionType(ConditionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confidence Interval Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confidence Interval Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfidenceIntervalType(ConfidenceIntervalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confidence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confidence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfidenceType(ConfidenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conformance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conformance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConformanceType(ConformanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Considerations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Considerations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsiderationsType(ConsiderationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contents Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contents Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentsType(ContentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contents Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contents Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentsType1(ContentsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copyrights Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copyrights Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyrightsType(CopyrightsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Counter Claims Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Counter Claims Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCounterClaimsType(CounterClaimsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Credits Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Credits Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreditsType(CreditsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crypto Functions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crypto Functions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCryptoFunctionsType(CryptoFunctionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crypto Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crypto Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCryptoPropertiesType(CryptoPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custodians Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custodians Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustodiansType(CustodiansType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cwes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cwes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCwesType(CwesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Classification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Classification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataClassificationType(DataClassificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataflow Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataflow Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataflowType(DataflowType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Governance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Governance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataGovernance(DataGovernance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Datasets Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Datasets Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatasetsType(DatasetsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType1(DataType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declarations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declarations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclarationsType(DeclarationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definitions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionsType(DefinitionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependencies Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependencies Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependenciesType(DependenciesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependencies Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependencies Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependenciesType1(DependenciesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependencyType(DependencyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Descriptions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Descriptions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionsType(DescriptionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destination Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destination Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestinationType(DestinationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diff Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diff Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiffType(DiffType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoints Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoints Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpointsType(EndpointsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energy Consumptions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energy Consumptions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergyConsumptionsType(EnergyConsumptionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energy Consumption Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energy Consumption Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergyConsumptionType(EnergyConsumptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energy Measure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energy Measure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergyMeasureType(EnergyMeasureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Energy Provider Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Energy Provider Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnergyProviderType(EnergyProviderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environmental Considerations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environmental Considerations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentalConsiderationsType(EnvironmentalConsiderationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Vars Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Vars Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentVarsType(EnvironmentVarsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Vars Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Vars Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentVarsType1(EnvironmentVarsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ethical Considerations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ethical Considerations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEthicalConsiderationsType(EthicalConsiderationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ethical Consideration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ethical Consideration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEthicalConsiderationType(EthicalConsiderationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventType(EventType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evidence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evidence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceType(EvidenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evidence Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evidence Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceType1(EvidenceType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionType(ExpressionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalReference(ExternalReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External References</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External References</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalReferences(ExternalReferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fairness Assessments Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fairness Assessments Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFairnessAssessmentsType(FairnessAssessmentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fairness Assessment Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fairness Assessment Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFairnessAssessmentType(FairnessAssessmentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formulation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formulation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormulationType(FormulationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formula Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formula Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormulaType(FormulaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frames Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frames Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFramesType(FramesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frame Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frame Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrameType(FrameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphics Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphics Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicsCollectionType(GraphicsCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphics Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphics Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicsType(GraphicsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphic Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphic Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicType(GraphicType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphic Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphic Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraphicType1(GraphicType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hashes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hashes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHashesType(HashesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hashes Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hashes Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHashesType1(HashesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hashes Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hashes Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHashesType2(HashesType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hash Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hash Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHashType(HashType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable Action Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable Action Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiableActionType(IdentifiableActionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiers Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiers Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiersType(IdentifiersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identity Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identity Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentityType(IdentityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ikev2 Transform Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ikev2 Transform Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIkev2TransformTypesType(Ikev2TransformTypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Individuals Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Individuals Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndividualsType(IndividualsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inputs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inputs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputsType(InputsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inputs Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inputs Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputsType1(InputsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inputs Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inputs Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputsType2(InputsType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inputs Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inputs Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputsType3(InputsType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputType(InputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputType1(InputType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issue Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issue Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssueType(IssueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Levels Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Levels Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLevelsType(LevelsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Level Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Level Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLevelType(LevelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>License Choice Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>License Choice Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLicenseChoiceType(LicenseChoiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Licensee Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Licensee Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLicenseeType(LicenseeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>License Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>License Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLicenseType(LicenseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>License Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>License Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLicenseTypesType(LicenseTypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Licensing Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Licensing Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLicensingType(LicensingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Licensor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Licensor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLicensorType(LicensorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lifecycles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lifecycles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifecyclesType(LifecyclesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lifecycle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lifecycle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLifecycleType(LifecycleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapType(MapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metadata</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetadata(Metadata object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Methods Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Methods Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodsType(MethodsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodType(MethodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mitigation Strategies Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mitigation Strategies Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMitigationStrategiesType(MitigationStrategiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mitigation Strategies Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mitigation Strategies Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMitigationStrategiesType1(MitigationStrategiesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Card Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Card Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelCardType(ModelCardType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Parameters Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelParametersType(ModelParametersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotesType(NotesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoteType(NoteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Occurrences Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Occurrences Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccurrencesType(OccurrencesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Occurrence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Occurrence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccurrenceType(OccurrenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organizational Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organizational Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationalContact(OrganizationalContact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organizational Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organizational Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationalEntity(OrganizationalEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organization Or Individual Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organization Or Individual Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationOrIndividualType(OrganizationOrIndividualType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organizations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organizations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationsType(OrganizationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organizations Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organizations Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizationsType1(OrganizationsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outputs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outputs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputsType(OutputsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outputs Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outputs Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputsType1(OutputsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outputs Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outputs Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputsType2(OutputsType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outputs Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outputs Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputsType3(OutputsType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputType(OutputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputType1(OutputType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Owners Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Owners Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwnersType(OwnersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameters Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametersType(ParametersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameters Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameters Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametersType1(ParametersType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterType(ParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patches Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patches Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatchesType(PatchesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patch Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patch Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatchType(PatchType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pedigree Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pedigree Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePedigreeType(PedigreeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Metrics Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Metrics Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformanceMetricsType(PerformanceMetricsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Metric Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Metric Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformanceMetricType(PerformanceMetricType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance Tradeoffs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance Tradeoffs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformanceTradeoffsType(PerformanceTradeoffsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postal Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postal Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostalAddressType(PostalAddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proof Of Concept Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proof Of Concept Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProofOfConceptType(ProofOfConceptType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertiesType(PropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyType(PropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolPropertiesType(ProtocolPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Provides Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provides Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProvidesType(ProvidesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Purchaser Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Purchaser Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePurchaserType(PurchaserType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantitative Analysis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantitative Analysis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantitativeAnalysisType(QuantitativeAnalysisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ratings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ratings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRatingsType(RatingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rating Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rating Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRatingType(RatingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>References Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>References Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferencesType(ReferencesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>References Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>References Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferencesType1(ReferencesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceType(ReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Related Crypto Material Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Related Crypto Material Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelatedCryptoMaterialPropertiesType(RelatedCryptoMaterialPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release Notes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release Notes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReleaseNotesType(ReleaseNotesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsType(RequirementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsType1(RequirementsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementType(RequirementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolves Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolves Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolvesType(ResolvesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolves Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolves Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolvesType1(ResolvesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource References Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource References Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceReferencesType(ResourceReferencesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceReferenceType(ResourceReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responses Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responses Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsesType(ResponsesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secured By Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secured By Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecuredByType(SecuredByType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Services Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Services Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServicesType(ServicesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Services Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Services Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServicesType1(ServicesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Services Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Services Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServicesType2(ServicesType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signatories Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signatories Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignatoriesType(SignatoriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signatory Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signatory Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignatoryType(SignatoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceType(SourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceType1(SourceType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandard(Standard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Standards Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Standards Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStandardsType(StandardsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Steps Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Steps Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepsType(StepsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Steps Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Steps Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepsType1(StepsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepType(StepType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stewards Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stewards Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStewardsType(StewardsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subjects Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subjects Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectsType(SubjectsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supporting Material Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supporting Material Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportingMaterialType(SupportingMaterialType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Swid Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Swid Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwidType(SwidType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tags Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tags Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagsType(TagsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Targets Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Targets Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetsType(TargetsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTargetType(TargetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tasks Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tasks Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTasksType(TasksType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskType(TaskType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskTypesType(TaskTypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Types Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Types Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskTypesType1(TaskTypesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technical Limitations Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technical Limitations Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnicalLimitationsType(TechnicalLimitationsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tools Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tools Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolsType(ToolsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tools Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tools Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolsType1(ToolsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tools Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tools Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolsType2(ToolsType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tools Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tools Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolsType3(ToolsType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToolType(ToolType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerType(TriggerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Cases Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Cases Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseCasesType(UseCasesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Users Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Users Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsersType(UsersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Versions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Versions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionsType(VersionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionType(VersionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolumeType(VolumeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vulnerabilities Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vulnerabilities Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVulnerabilitiesType(VulnerabilitiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vulnerabilities Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vulnerabilities Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVulnerabilitiesType1(VulnerabilitiesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vulnerability Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vulnerability Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVulnerabilitySourceType(VulnerabilitySourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vulnerability Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vulnerability Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVulnerabilityType(VulnerabilityType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflows Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflows Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowsType(WorkflowsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflowType(WorkflowType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workspaces Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workspaces Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkspacesType(WorkspacesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workspace Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workspace Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkspaceType(WorkspaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //BOMSwitch
