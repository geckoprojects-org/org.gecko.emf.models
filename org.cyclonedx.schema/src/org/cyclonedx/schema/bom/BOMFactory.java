/*
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
package org.cyclonedx.schema.bom;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.cyclonedx.schema.bom.BOMPackage
 * @generated
 */
@ProviderType
public interface BOMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BOMFactory eINSTANCE = org.cyclonedx.schema.bom.impl.BOMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Advisories Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advisories Type</em>'.
	 * @generated
	 */
	AdvisoriesType createAdvisoriesType();

	/**
	 * Returns a new object of class '<em>Advisory Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advisory Type</em>'.
	 * @generated
	 */
	AdvisoryType createAdvisoryType();

	/**
	 * Returns a new object of class '<em>Affects Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Affects Type</em>'.
	 * @generated
	 */
	AffectsType createAffectsType();

	/**
	 * Returns a new object of class '<em>Affirmation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Affirmation Type</em>'.
	 * @generated
	 */
	AffirmationType createAffirmationType();

	/**
	 * Returns a new object of class '<em>Algorithm Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Algorithm Properties Type</em>'.
	 * @generated
	 */
	AlgorithmPropertiesType createAlgorithmPropertiesType();

	/**
	 * Returns a new object of class '<em>Algorithms Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Algorithms Type</em>'.
	 * @generated
	 */
	AlgorithmsType createAlgorithmsType();

	/**
	 * Returns a new object of class '<em>Aliases Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aliases Type</em>'.
	 * @generated
	 */
	AliasesType createAliasesType();

	/**
	 * Returns a new object of class '<em>Aliases Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aliases Type1</em>'.
	 * @generated
	 */
	AliasesType1 createAliasesType1();

	/**
	 * Returns a new object of class '<em>Alt Ids Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alt Ids Type</em>'.
	 * @generated
	 */
	AltIdsType createAltIdsType();

	/**
	 * Returns a new object of class '<em>Analysis Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analysis Type</em>'.
	 * @generated
	 */
	AnalysisType createAnalysisType();

	/**
	 * Returns a new object of class '<em>Annotations Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotations Type</em>'.
	 * @generated
	 */
	AnnotationsType createAnnotationsType();

	/**
	 * Returns a new object of class '<em>Annotation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Type</em>'.
	 * @generated
	 */
	AnnotationType createAnnotationType();

	/**
	 * Returns a new object of class '<em>Annotator Choice Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotator Choice Type</em>'.
	 * @generated
	 */
	AnnotatorChoiceType createAnnotatorChoiceType();

	/**
	 * Returns a new object of class '<em>Approach Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Approach Type</em>'.
	 * @generated
	 */
	ApproachType createApproachType();

	/**
	 * Returns a new object of class '<em>Assemblies Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assemblies Type</em>'.
	 * @generated
	 */
	AssembliesType createAssembliesType();

	/**
	 * Returns a new object of class '<em>Assessors Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessors Type</em>'.
	 * @generated
	 */
	AssessorsType createAssessorsType();

	/**
	 * Returns a new object of class '<em>Assessor Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assessor Type</em>'.
	 * @generated
	 */
	AssessorType createAssessorType();

	/**
	 * Returns a new object of class '<em>Attached Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attached Text Type</em>'.
	 * @generated
	 */
	AttachedTextType createAttachedTextType();

	/**
	 * Returns a new object of class '<em>Attestations Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attestations Type</em>'.
	 * @generated
	 */
	AttestationsType createAttestationsType();

	/**
	 * Returns a new object of class '<em>Attestation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attestation Type</em>'.
	 * @generated
	 */
	AttestationType createAttestationType();

	/**
	 * Returns a new object of class '<em>Authors Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authors Type</em>'.
	 * @generated
	 */
	AuthorsType createAuthorsType();

	/**
	 * Returns a new object of class '<em>Authors Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authors Type1</em>'.
	 * @generated
	 */
	AuthorsType1 createAuthorsType1();

	/**
	 * Returns a new object of class '<em>Bom Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bom Reference Type</em>'.
	 * @generated
	 */
	BomReferenceType createBomReferenceType();

	/**
	 * Returns a new object of class '<em>Bom Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bom Type</em>'.
	 * @generated
	 */
	BomType createBomType();

	/**
	 * Returns a new object of class '<em>Callstack Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Callstack Type</em>'.
	 * @generated
	 */
	CallstackType createCallstackType();

	/**
	 * Returns a new object of class '<em>Certificate Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Certificate Properties Type</em>'.
	 * @generated
	 */
	CertificatePropertiesType createCertificatePropertiesType();

	/**
	 * Returns a new object of class '<em>Cipher Suites Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cipher Suites Type</em>'.
	 * @generated
	 */
	CipherSuitesType createCipherSuitesType();

	/**
	 * Returns a new object of class '<em>Cipher Suite Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cipher Suite Type</em>'.
	 * @generated
	 */
	CipherSuiteType createCipherSuiteType();

	/**
	 * Returns a new object of class '<em>Claims Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claims Type</em>'.
	 * @generated
	 */
	ClaimsType createClaimsType();

	/**
	 * Returns a new object of class '<em>Claims Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claims Type1</em>'.
	 * @generated
	 */
	ClaimsType1 createClaimsType1();

	/**
	 * Returns a new object of class '<em>Claim Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Type</em>'.
	 * @generated
	 */
	ClaimType createClaimType();

	/**
	 * Returns a new object of class '<em>Co2 Measure Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Co2 Measure Type</em>'.
	 * @generated
	 */
	Co2MeasureType createCo2MeasureType();

	/**
	 * Returns a new object of class '<em>Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Type</em>'.
	 * @generated
	 */
	CollectionType createCollectionType();

	/**
	 * Returns a new object of class '<em>Collection Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collection Type1</em>'.
	 * @generated
	 */
	CollectionType1 createCollectionType1();

	/**
	 * Returns a new object of class '<em>Commands Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commands Type</em>'.
	 * @generated
	 */
	CommandsType createCommandsType();

	/**
	 * Returns a new object of class '<em>Command Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Command Type</em>'.
	 * @generated
	 */
	CommandType createCommandType();

	/**
	 * Returns a new object of class '<em>Commits Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commits Type</em>'.
	 * @generated
	 */
	CommitsType createCommitsType();

	/**
	 * Returns a new object of class '<em>Commit Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commit Type</em>'.
	 * @generated
	 */
	CommitType createCommitType();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Component Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Data Type</em>'.
	 * @generated
	 */
	ComponentDataType createComponentDataType();

	/**
	 * Returns a new object of class '<em>Component Evidence Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Evidence Type</em>'.
	 * @generated
	 */
	ComponentEvidenceType createComponentEvidenceType();

	/**
	 * Returns a new object of class '<em>Components Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Components Type</em>'.
	 * @generated
	 */
	ComponentsType createComponentsType();

	/**
	 * Returns a new object of class '<em>Components Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Components Type1</em>'.
	 * @generated
	 */
	ComponentsType1 createComponentsType1();

	/**
	 * Returns a new object of class '<em>Components Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Components Type2</em>'.
	 * @generated
	 */
	ComponentsType2 createComponentsType2();

	/**
	 * Returns a new object of class '<em>Compositions Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compositions Type</em>'.
	 * @generated
	 */
	CompositionsType createCompositionsType();

	/**
	 * Returns a new object of class '<em>Composition Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition Type</em>'.
	 * @generated
	 */
	CompositionType createCompositionType();

	/**
	 * Returns a new object of class '<em>Conditions Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditions Type</em>'.
	 * @generated
	 */
	ConditionsType createConditionsType();

	/**
	 * Returns a new object of class '<em>Condition Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Type</em>'.
	 * @generated
	 */
	ConditionType createConditionType();

	/**
	 * Returns a new object of class '<em>Confidence Interval Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Confidence Interval Type</em>'.
	 * @generated
	 */
	ConfidenceIntervalType createConfidenceIntervalType();

	/**
	 * Returns a new object of class '<em>Confidence Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Confidence Type</em>'.
	 * @generated
	 */
	ConfidenceType createConfidenceType();

	/**
	 * Returns a new object of class '<em>Conformance Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conformance Type</em>'.
	 * @generated
	 */
	ConformanceType createConformanceType();

	/**
	 * Returns a new object of class '<em>Considerations Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Considerations Type</em>'.
	 * @generated
	 */
	ConsiderationsType createConsiderationsType();

	/**
	 * Returns a new object of class '<em>Contents Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contents Type</em>'.
	 * @generated
	 */
	ContentsType createContentsType();

	/**
	 * Returns a new object of class '<em>Contents Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contents Type1</em>'.
	 * @generated
	 */
	ContentsType1 createContentsType1();

	/**
	 * Returns a new object of class '<em>Copyrights Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copyrights Type</em>'.
	 * @generated
	 */
	CopyrightsType createCopyrightsType();

	/**
	 * Returns a new object of class '<em>Counter Claims Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Counter Claims Type</em>'.
	 * @generated
	 */
	CounterClaimsType createCounterClaimsType();

	/**
	 * Returns a new object of class '<em>Credits Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Credits Type</em>'.
	 * @generated
	 */
	CreditsType createCreditsType();

	/**
	 * Returns a new object of class '<em>Crypto Functions Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Crypto Functions Type</em>'.
	 * @generated
	 */
	CryptoFunctionsType createCryptoFunctionsType();

	/**
	 * Returns a new object of class '<em>Crypto Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Crypto Properties Type</em>'.
	 * @generated
	 */
	CryptoPropertiesType createCryptoPropertiesType();

	/**
	 * Returns a new object of class '<em>Custodians Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custodians Type</em>'.
	 * @generated
	 */
	CustodiansType createCustodiansType();

	/**
	 * Returns a new object of class '<em>Cwes Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cwes Type</em>'.
	 * @generated
	 */
	CwesType createCwesType();

	/**
	 * Returns a new object of class '<em>Data Classification Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Classification Type</em>'.
	 * @generated
	 */
	DataClassificationType createDataClassificationType();

	/**
	 * Returns a new object of class '<em>Dataflow Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dataflow Type</em>'.
	 * @generated
	 */
	DataflowType createDataflowType();

	/**
	 * Returns a new object of class '<em>Data Governance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Governance</em>'.
	 * @generated
	 */
	DataGovernance createDataGovernance();

	/**
	 * Returns a new object of class '<em>Datasets Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Datasets Type</em>'.
	 * @generated
	 */
	DatasetsType createDatasetsType();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	DataType createDataType();

	/**
	 * Returns a new object of class '<em>Data Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type1</em>'.
	 * @generated
	 */
	DataType1 createDataType1();

	/**
	 * Returns a new object of class '<em>Declarations Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declarations Type</em>'.
	 * @generated
	 */
	DeclarationsType createDeclarationsType();

	/**
	 * Returns a new object of class '<em>Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definitions Type</em>'.
	 * @generated
	 */
	DefinitionsType createDefinitionsType();

	/**
	 * Returns a new object of class '<em>Dependencies Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependencies Type</em>'.
	 * @generated
	 */
	DependenciesType createDependenciesType();

	/**
	 * Returns a new object of class '<em>Dependencies Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependencies Type1</em>'.
	 * @generated
	 */
	DependenciesType1 createDependenciesType1();

	/**
	 * Returns a new object of class '<em>Dependency Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependency Type</em>'.
	 * @generated
	 */
	DependencyType createDependencyType();

	/**
	 * Returns a new object of class '<em>Descriptions Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Descriptions Type</em>'.
	 * @generated
	 */
	DescriptionsType createDescriptionsType();

	/**
	 * Returns a new object of class '<em>Destination Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Destination Type</em>'.
	 * @generated
	 */
	DestinationType createDestinationType();

	/**
	 * Returns a new object of class '<em>Diff Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Type</em>'.
	 * @generated
	 */
	DiffType createDiffType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Endpoints Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Endpoints Type</em>'.
	 * @generated
	 */
	EndpointsType createEndpointsType();

	/**
	 * Returns a new object of class '<em>Energy Consumptions Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Energy Consumptions Type</em>'.
	 * @generated
	 */
	EnergyConsumptionsType createEnergyConsumptionsType();

	/**
	 * Returns a new object of class '<em>Energy Consumption Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Energy Consumption Type</em>'.
	 * @generated
	 */
	EnergyConsumptionType createEnergyConsumptionType();

	/**
	 * Returns a new object of class '<em>Energy Measure Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Energy Measure Type</em>'.
	 * @generated
	 */
	EnergyMeasureType createEnergyMeasureType();

	/**
	 * Returns a new object of class '<em>Energy Provider Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Energy Provider Type</em>'.
	 * @generated
	 */
	EnergyProviderType createEnergyProviderType();

	/**
	 * Returns a new object of class '<em>Environmental Considerations Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environmental Considerations Type</em>'.
	 * @generated
	 */
	EnvironmentalConsiderationsType createEnvironmentalConsiderationsType();

	/**
	 * Returns a new object of class '<em>Environment Vars Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Vars Type</em>'.
	 * @generated
	 */
	EnvironmentVarsType createEnvironmentVarsType();

	/**
	 * Returns a new object of class '<em>Environment Vars Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment Vars Type1</em>'.
	 * @generated
	 */
	EnvironmentVarsType1 createEnvironmentVarsType1();

	/**
	 * Returns a new object of class '<em>Ethical Considerations Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ethical Considerations Type</em>'.
	 * @generated
	 */
	EthicalConsiderationsType createEthicalConsiderationsType();

	/**
	 * Returns a new object of class '<em>Ethical Consideration Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ethical Consideration Type</em>'.
	 * @generated
	 */
	EthicalConsiderationType createEthicalConsiderationType();

	/**
	 * Returns a new object of class '<em>Event Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Type</em>'.
	 * @generated
	 */
	EventType createEventType();

	/**
	 * Returns a new object of class '<em>Evidence Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evidence Type</em>'.
	 * @generated
	 */
	EvidenceType createEvidenceType();

	/**
	 * Returns a new object of class '<em>Evidence Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evidence Type1</em>'.
	 * @generated
	 */
	EvidenceType1 createEvidenceType1();

	/**
	 * Returns a new object of class '<em>Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Type</em>'.
	 * @generated
	 */
	ExpressionType createExpressionType();

	/**
	 * Returns a new object of class '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Reference</em>'.
	 * @generated
	 */
	ExternalReference createExternalReference();

	/**
	 * Returns a new object of class '<em>External References</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External References</em>'.
	 * @generated
	 */
	ExternalReferences createExternalReferences();

	/**
	 * Returns a new object of class '<em>Fairness Assessments Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fairness Assessments Type</em>'.
	 * @generated
	 */
	FairnessAssessmentsType createFairnessAssessmentsType();

	/**
	 * Returns a new object of class '<em>Fairness Assessment Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fairness Assessment Type</em>'.
	 * @generated
	 */
	FairnessAssessmentType createFairnessAssessmentType();

	/**
	 * Returns a new object of class '<em>Formulation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formulation Type</em>'.
	 * @generated
	 */
	FormulationType createFormulationType();

	/**
	 * Returns a new object of class '<em>Formula Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formula Type</em>'.
	 * @generated
	 */
	FormulaType createFormulaType();

	/**
	 * Returns a new object of class '<em>Frames Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frames Type</em>'.
	 * @generated
	 */
	FramesType createFramesType();

	/**
	 * Returns a new object of class '<em>Frame Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frame Type</em>'.
	 * @generated
	 */
	FrameType createFrameType();

	/**
	 * Returns a new object of class '<em>Graphics Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graphics Collection Type</em>'.
	 * @generated
	 */
	GraphicsCollectionType createGraphicsCollectionType();

	/**
	 * Returns a new object of class '<em>Graphics Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graphics Type</em>'.
	 * @generated
	 */
	GraphicsType createGraphicsType();

	/**
	 * Returns a new object of class '<em>Graphic Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graphic Type</em>'.
	 * @generated
	 */
	GraphicType createGraphicType();

	/**
	 * Returns a new object of class '<em>Graphic Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graphic Type1</em>'.
	 * @generated
	 */
	GraphicType1 createGraphicType1();

	/**
	 * Returns a new object of class '<em>Hashes Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hashes Type</em>'.
	 * @generated
	 */
	HashesType createHashesType();

	/**
	 * Returns a new object of class '<em>Hashes Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hashes Type1</em>'.
	 * @generated
	 */
	HashesType1 createHashesType1();

	/**
	 * Returns a new object of class '<em>Hashes Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hashes Type2</em>'.
	 * @generated
	 */
	HashesType2 createHashesType2();

	/**
	 * Returns a new object of class '<em>Hash Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hash Type</em>'.
	 * @generated
	 */
	HashType createHashType();

	/**
	 * Returns a new object of class '<em>Identifiable Action Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identifiable Action Type</em>'.
	 * @generated
	 */
	IdentifiableActionType createIdentifiableActionType();

	/**
	 * Returns a new object of class '<em>Identifiers Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identifiers Type</em>'.
	 * @generated
	 */
	IdentifiersType createIdentifiersType();

	/**
	 * Returns a new object of class '<em>Identity Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identity Type</em>'.
	 * @generated
	 */
	IdentityType createIdentityType();

	/**
	 * Returns a new object of class '<em>Ikev2 Transform Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ikev2 Transform Types Type</em>'.
	 * @generated
	 */
	Ikev2TransformTypesType createIkev2TransformTypesType();

	/**
	 * Returns a new object of class '<em>Individuals Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Individuals Type</em>'.
	 * @generated
	 */
	IndividualsType createIndividualsType();

	/**
	 * Returns a new object of class '<em>Inputs Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inputs Type</em>'.
	 * @generated
	 */
	InputsType createInputsType();

	/**
	 * Returns a new object of class '<em>Inputs Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inputs Type1</em>'.
	 * @generated
	 */
	InputsType1 createInputsType1();

	/**
	 * Returns a new object of class '<em>Inputs Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inputs Type2</em>'.
	 * @generated
	 */
	InputsType2 createInputsType2();

	/**
	 * Returns a new object of class '<em>Inputs Type3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inputs Type3</em>'.
	 * @generated
	 */
	InputsType3 createInputsType3();

	/**
	 * Returns a new object of class '<em>Input Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Type</em>'.
	 * @generated
	 */
	InputType createInputType();

	/**
	 * Returns a new object of class '<em>Input Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Type1</em>'.
	 * @generated
	 */
	InputType1 createInputType1();

	/**
	 * Returns a new object of class '<em>Issue Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Issue Type</em>'.
	 * @generated
	 */
	IssueType createIssueType();

	/**
	 * Returns a new object of class '<em>Levels Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Levels Type</em>'.
	 * @generated
	 */
	LevelsType createLevelsType();

	/**
	 * Returns a new object of class '<em>Level Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Level Type</em>'.
	 * @generated
	 */
	LevelType createLevelType();

	/**
	 * Returns a new object of class '<em>License Choice Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>License Choice Type</em>'.
	 * @generated
	 */
	LicenseChoiceType createLicenseChoiceType();

	/**
	 * Returns a new object of class '<em>Licensee Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Licensee Type</em>'.
	 * @generated
	 */
	LicenseeType createLicenseeType();

	/**
	 * Returns a new object of class '<em>License Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>License Type</em>'.
	 * @generated
	 */
	LicenseType createLicenseType();

	/**
	 * Returns a new object of class '<em>License Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>License Types Type</em>'.
	 * @generated
	 */
	LicenseTypesType createLicenseTypesType();

	/**
	 * Returns a new object of class '<em>Licensing Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Licensing Type</em>'.
	 * @generated
	 */
	LicensingType createLicensingType();

	/**
	 * Returns a new object of class '<em>Licensor Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Licensor Type</em>'.
	 * @generated
	 */
	LicensorType createLicensorType();

	/**
	 * Returns a new object of class '<em>Lifecycles Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lifecycles Type</em>'.
	 * @generated
	 */
	LifecyclesType createLifecyclesType();

	/**
	 * Returns a new object of class '<em>Lifecycle Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lifecycle Type</em>'.
	 * @generated
	 */
	LifecycleType createLifecycleType();

	/**
	 * Returns a new object of class '<em>Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Type</em>'.
	 * @generated
	 */
	MapType createMapType();

	/**
	 * Returns a new object of class '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metadata</em>'.
	 * @generated
	 */
	Metadata createMetadata();

	/**
	 * Returns a new object of class '<em>Methods Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Methods Type</em>'.
	 * @generated
	 */
	MethodsType createMethodsType();

	/**
	 * Returns a new object of class '<em>Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Type</em>'.
	 * @generated
	 */
	MethodType createMethodType();

	/**
	 * Returns a new object of class '<em>Mitigation Strategies Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mitigation Strategies Type</em>'.
	 * @generated
	 */
	MitigationStrategiesType createMitigationStrategiesType();

	/**
	 * Returns a new object of class '<em>Mitigation Strategies Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mitigation Strategies Type1</em>'.
	 * @generated
	 */
	MitigationStrategiesType1 createMitigationStrategiesType1();

	/**
	 * Returns a new object of class '<em>Model Card Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Card Type</em>'.
	 * @generated
	 */
	ModelCardType createModelCardType();

	/**
	 * Returns a new object of class '<em>Model Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Parameters Type</em>'.
	 * @generated
	 */
	ModelParametersType createModelParametersType();

	/**
	 * Returns a new object of class '<em>Notes Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notes Type</em>'.
	 * @generated
	 */
	NotesType createNotesType();

	/**
	 * Returns a new object of class '<em>Note Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Note Type</em>'.
	 * @generated
	 */
	NoteType createNoteType();

	/**
	 * Returns a new object of class '<em>Occurrences Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Occurrences Type</em>'.
	 * @generated
	 */
	OccurrencesType createOccurrencesType();

	/**
	 * Returns a new object of class '<em>Occurrence Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Occurrence Type</em>'.
	 * @generated
	 */
	OccurrenceType createOccurrenceType();

	/**
	 * Returns a new object of class '<em>Organizational Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organizational Contact</em>'.
	 * @generated
	 */
	OrganizationalContact createOrganizationalContact();

	/**
	 * Returns a new object of class '<em>Organizational Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organizational Entity</em>'.
	 * @generated
	 */
	OrganizationalEntity createOrganizationalEntity();

	/**
	 * Returns a new object of class '<em>Organization Or Individual Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organization Or Individual Type</em>'.
	 * @generated
	 */
	OrganizationOrIndividualType createOrganizationOrIndividualType();

	/**
	 * Returns a new object of class '<em>Organizations Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organizations Type</em>'.
	 * @generated
	 */
	OrganizationsType createOrganizationsType();

	/**
	 * Returns a new object of class '<em>Organizations Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Organizations Type1</em>'.
	 * @generated
	 */
	OrganizationsType1 createOrganizationsType1();

	/**
	 * Returns a new object of class '<em>Outputs Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outputs Type</em>'.
	 * @generated
	 */
	OutputsType createOutputsType();

	/**
	 * Returns a new object of class '<em>Outputs Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outputs Type1</em>'.
	 * @generated
	 */
	OutputsType1 createOutputsType1();

	/**
	 * Returns a new object of class '<em>Outputs Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outputs Type2</em>'.
	 * @generated
	 */
	OutputsType2 createOutputsType2();

	/**
	 * Returns a new object of class '<em>Outputs Type3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outputs Type3</em>'.
	 * @generated
	 */
	OutputsType3 createOutputsType3();

	/**
	 * Returns a new object of class '<em>Output Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Type</em>'.
	 * @generated
	 */
	OutputType createOutputType();

	/**
	 * Returns a new object of class '<em>Output Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Type1</em>'.
	 * @generated
	 */
	OutputType1 createOutputType1();

	/**
	 * Returns a new object of class '<em>Owners Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Owners Type</em>'.
	 * @generated
	 */
	OwnersType createOwnersType();

	/**
	 * Returns a new object of class '<em>Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameters Type</em>'.
	 * @generated
	 */
	ParametersType createParametersType();

	/**
	 * Returns a new object of class '<em>Parameters Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameters Type1</em>'.
	 * @generated
	 */
	ParametersType1 createParametersType1();

	/**
	 * Returns a new object of class '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Type</em>'.
	 * @generated
	 */
	ParameterType createParameterType();

	/**
	 * Returns a new object of class '<em>Patches Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patches Type</em>'.
	 * @generated
	 */
	PatchesType createPatchesType();

	/**
	 * Returns a new object of class '<em>Patch Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patch Type</em>'.
	 * @generated
	 */
	PatchType createPatchType();

	/**
	 * Returns a new object of class '<em>Pedigree Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pedigree Type</em>'.
	 * @generated
	 */
	PedigreeType createPedigreeType();

	/**
	 * Returns a new object of class '<em>Performance Metrics Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performance Metrics Type</em>'.
	 * @generated
	 */
	PerformanceMetricsType createPerformanceMetricsType();

	/**
	 * Returns a new object of class '<em>Performance Metric Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performance Metric Type</em>'.
	 * @generated
	 */
	PerformanceMetricType createPerformanceMetricType();

	/**
	 * Returns a new object of class '<em>Performance Tradeoffs Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performance Tradeoffs Type</em>'.
	 * @generated
	 */
	PerformanceTradeoffsType createPerformanceTradeoffsType();

	/**
	 * Returns a new object of class '<em>Postal Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Postal Address Type</em>'.
	 * @generated
	 */
	PostalAddressType createPostalAddressType();

	/**
	 * Returns a new object of class '<em>Proof Of Concept Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proof Of Concept Type</em>'.
	 * @generated
	 */
	ProofOfConceptType createProofOfConceptType();

	/**
	 * Returns a new object of class '<em>Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Properties Type</em>'.
	 * @generated
	 */
	PropertiesType createPropertiesType();

	/**
	 * Returns a new object of class '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Type</em>'.
	 * @generated
	 */
	PropertyType createPropertyType();

	/**
	 * Returns a new object of class '<em>Protocol Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Protocol Properties Type</em>'.
	 * @generated
	 */
	ProtocolPropertiesType createProtocolPropertiesType();

	/**
	 * Returns a new object of class '<em>Provides Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provides Type</em>'.
	 * @generated
	 */
	ProvidesType createProvidesType();

	/**
	 * Returns a new object of class '<em>Purchaser Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Purchaser Type</em>'.
	 * @generated
	 */
	PurchaserType createPurchaserType();

	/**
	 * Returns a new object of class '<em>Quantitative Analysis Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantitative Analysis Type</em>'.
	 * @generated
	 */
	QuantitativeAnalysisType createQuantitativeAnalysisType();

	/**
	 * Returns a new object of class '<em>Ratings Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ratings Type</em>'.
	 * @generated
	 */
	RatingsType createRatingsType();

	/**
	 * Returns a new object of class '<em>Rating Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rating Type</em>'.
	 * @generated
	 */
	RatingType createRatingType();

	/**
	 * Returns a new object of class '<em>References Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>References Type</em>'.
	 * @generated
	 */
	ReferencesType createReferencesType();

	/**
	 * Returns a new object of class '<em>References Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>References Type1</em>'.
	 * @generated
	 */
	ReferencesType1 createReferencesType1();

	/**
	 * Returns a new object of class '<em>Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Type</em>'.
	 * @generated
	 */
	ReferenceType createReferenceType();

	/**
	 * Returns a new object of class '<em>Related Crypto Material Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Related Crypto Material Properties Type</em>'.
	 * @generated
	 */
	RelatedCryptoMaterialPropertiesType createRelatedCryptoMaterialPropertiesType();

	/**
	 * Returns a new object of class '<em>Release Notes Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Release Notes Type</em>'.
	 * @generated
	 */
	ReleaseNotesType createReleaseNotesType();

	/**
	 * Returns a new object of class '<em>Requirements Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirements Type</em>'.
	 * @generated
	 */
	RequirementsType createRequirementsType();

	/**
	 * Returns a new object of class '<em>Requirements Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirements Type1</em>'.
	 * @generated
	 */
	RequirementsType1 createRequirementsType1();

	/**
	 * Returns a new object of class '<em>Requirement Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Type</em>'.
	 * @generated
	 */
	RequirementType createRequirementType();

	/**
	 * Returns a new object of class '<em>Resolves Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resolves Type</em>'.
	 * @generated
	 */
	ResolvesType createResolvesType();

	/**
	 * Returns a new object of class '<em>Resolves Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resolves Type1</em>'.
	 * @generated
	 */
	ResolvesType1 createResolvesType1();

	/**
	 * Returns a new object of class '<em>Resource References Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource References Type</em>'.
	 * @generated
	 */
	ResourceReferencesType createResourceReferencesType();

	/**
	 * Returns a new object of class '<em>Resource Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Reference Type</em>'.
	 * @generated
	 */
	ResourceReferenceType createResourceReferenceType();

	/**
	 * Returns a new object of class '<em>Responses Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Responses Type</em>'.
	 * @generated
	 */
	ResponsesType createResponsesType();

	/**
	 * Returns a new object of class '<em>Secured By Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secured By Type</em>'.
	 * @generated
	 */
	SecuredByType createSecuredByType();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Services Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Services Type</em>'.
	 * @generated
	 */
	ServicesType createServicesType();

	/**
	 * Returns a new object of class '<em>Services Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Services Type1</em>'.
	 * @generated
	 */
	ServicesType1 createServicesType1();

	/**
	 * Returns a new object of class '<em>Services Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Services Type2</em>'.
	 * @generated
	 */
	ServicesType2 createServicesType2();

	/**
	 * Returns a new object of class '<em>Signatories Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signatories Type</em>'.
	 * @generated
	 */
	SignatoriesType createSignatoriesType();

	/**
	 * Returns a new object of class '<em>Signatory Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signatory Type</em>'.
	 * @generated
	 */
	SignatoryType createSignatoryType();

	/**
	 * Returns a new object of class '<em>Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Type</em>'.
	 * @generated
	 */
	SourceType createSourceType();

	/**
	 * Returns a new object of class '<em>Source Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Type1</em>'.
	 * @generated
	 */
	SourceType1 createSourceType1();

	/**
	 * Returns a new object of class '<em>Standard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standard</em>'.
	 * @generated
	 */
	Standard createStandard();

	/**
	 * Returns a new object of class '<em>Standards Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Standards Type</em>'.
	 * @generated
	 */
	StandardsType createStandardsType();

	/**
	 * Returns a new object of class '<em>Steps Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Steps Type</em>'.
	 * @generated
	 */
	StepsType createStepsType();

	/**
	 * Returns a new object of class '<em>Steps Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Steps Type1</em>'.
	 * @generated
	 */
	StepsType1 createStepsType1();

	/**
	 * Returns a new object of class '<em>Step Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Type</em>'.
	 * @generated
	 */
	StepType createStepType();

	/**
	 * Returns a new object of class '<em>Stewards Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stewards Type</em>'.
	 * @generated
	 */
	StewardsType createStewardsType();

	/**
	 * Returns a new object of class '<em>Subjects Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subjects Type</em>'.
	 * @generated
	 */
	SubjectsType createSubjectsType();

	/**
	 * Returns a new object of class '<em>Supporting Material Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supporting Material Type</em>'.
	 * @generated
	 */
	SupportingMaterialType createSupportingMaterialType();

	/**
	 * Returns a new object of class '<em>Swid Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Swid Type</em>'.
	 * @generated
	 */
	SwidType createSwidType();

	/**
	 * Returns a new object of class '<em>Tags Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tags Type</em>'.
	 * @generated
	 */
	TagsType createTagsType();

	/**
	 * Returns a new object of class '<em>Targets Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Targets Type</em>'.
	 * @generated
	 */
	TargetsType createTargetsType();

	/**
	 * Returns a new object of class '<em>Target Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Type</em>'.
	 * @generated
	 */
	TargetType createTargetType();

	/**
	 * Returns a new object of class '<em>Tasks Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tasks Type</em>'.
	 * @generated
	 */
	TasksType createTasksType();

	/**
	 * Returns a new object of class '<em>Task Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Type</em>'.
	 * @generated
	 */
	TaskType createTaskType();

	/**
	 * Returns a new object of class '<em>Task Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Types Type</em>'.
	 * @generated
	 */
	TaskTypesType createTaskTypesType();

	/**
	 * Returns a new object of class '<em>Task Types Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Types Type1</em>'.
	 * @generated
	 */
	TaskTypesType1 createTaskTypesType1();

	/**
	 * Returns a new object of class '<em>Technical Limitations Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Technical Limitations Type</em>'.
	 * @generated
	 */
	TechnicalLimitationsType createTechnicalLimitationsType();

	/**
	 * Returns a new object of class '<em>Tools Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tools Type</em>'.
	 * @generated
	 */
	ToolsType createToolsType();

	/**
	 * Returns a new object of class '<em>Tools Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tools Type1</em>'.
	 * @generated
	 */
	ToolsType1 createToolsType1();

	/**
	 * Returns a new object of class '<em>Tools Type2</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tools Type2</em>'.
	 * @generated
	 */
	ToolsType2 createToolsType2();

	/**
	 * Returns a new object of class '<em>Tools Type3</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tools Type3</em>'.
	 * @generated
	 */
	ToolsType3 createToolsType3();

	/**
	 * Returns a new object of class '<em>Tool Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool Type</em>'.
	 * @generated
	 */
	ToolType createToolType();

	/**
	 * Returns a new object of class '<em>Trigger Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Type</em>'.
	 * @generated
	 */
	TriggerType createTriggerType();

	/**
	 * Returns a new object of class '<em>Use Cases Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Use Cases Type</em>'.
	 * @generated
	 */
	UseCasesType createUseCasesType();

	/**
	 * Returns a new object of class '<em>Users Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Users Type</em>'.
	 * @generated
	 */
	UsersType createUsersType();

	/**
	 * Returns a new object of class '<em>Versions Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Versions Type</em>'.
	 * @generated
	 */
	VersionsType createVersionsType();

	/**
	 * Returns a new object of class '<em>Version Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version Type</em>'.
	 * @generated
	 */
	VersionType createVersionType();

	/**
	 * Returns a new object of class '<em>Volume Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volume Type</em>'.
	 * @generated
	 */
	VolumeType createVolumeType();

	/**
	 * Returns a new object of class '<em>Vulnerabilities Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vulnerabilities Type</em>'.
	 * @generated
	 */
	VulnerabilitiesType createVulnerabilitiesType();

	/**
	 * Returns a new object of class '<em>Vulnerabilities Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vulnerabilities Type1</em>'.
	 * @generated
	 */
	VulnerabilitiesType1 createVulnerabilitiesType1();

	/**
	 * Returns a new object of class '<em>Vulnerability Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vulnerability Source Type</em>'.
	 * @generated
	 */
	VulnerabilitySourceType createVulnerabilitySourceType();

	/**
	 * Returns a new object of class '<em>Vulnerability Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vulnerability Type</em>'.
	 * @generated
	 */
	VulnerabilityType createVulnerabilityType();

	/**
	 * Returns a new object of class '<em>Workflows Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflows Type</em>'.
	 * @generated
	 */
	WorkflowsType createWorkflowsType();

	/**
	 * Returns a new object of class '<em>Workflow Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workflow Type</em>'.
	 * @generated
	 */
	WorkflowType createWorkflowType();

	/**
	 * Returns a new object of class '<em>Workspaces Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workspaces Type</em>'.
	 * @generated
	 */
	WorkspacesType createWorkspacesType();

	/**
	 * Returns a new object of class '<em>Workspace Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workspace Type</em>'.
	 * @generated
	 */
	WorkspaceType createWorkspaceType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BOMPackage getBOMPackage();

} //BOMFactory
