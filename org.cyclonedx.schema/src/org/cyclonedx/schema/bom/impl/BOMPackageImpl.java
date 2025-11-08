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

import java.io.IOException;

import java.net.URL;

import org.cyclonedx.schema.bom.BOMFactory;
import org.cyclonedx.schema.bom.BOMPackage;

import org.cyclonedx.schema.bom.util.BOMValidator;

import org.cyclonedx.schema.spdx.SpdxPackage;

import org.cyclonedx.schema.spdx.impl.SpdxPackageImpl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BOMPackageImpl extends EPackageImpl implements BOMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "bom.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advisoriesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advisoryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affectsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affirmationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algorithmPropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algorithmsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasesType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass altIdsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotatorChoiceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass approachTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assembliesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessorsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assessorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachedTextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attestationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attestationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bomReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bomTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callstackTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass certificatePropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cipherSuitesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cipherSuiteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass co2MeasureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commitsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commitTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEvidenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentsType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confidenceIntervalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confidenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conformanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass considerationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyrightsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass counterClaimsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creditsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cryptoFunctionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cryptoPropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass custodiansTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cwesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataClassificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataflowTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataGovernanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasetsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependenciesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependenciesType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destinationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energyConsumptionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energyConsumptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energyMeasureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energyProviderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentalConsiderationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentVarsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentVarsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ethicalConsiderationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ethicalConsiderationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalReferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fairnessAssessmentsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fairnessAssessmentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formulationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formulaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass framesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicsCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hashesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hashesType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hashesType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hashTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableActionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ikev2TransformTypesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputsType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputsType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass levelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass licenseChoiceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass licenseeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass licenseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass licenseTypesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass licensingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass licensorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifecyclesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifecycleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mitigationStrategiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mitigationStrategiesType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelCardTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelParametersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occurrencesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occurrenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationalContactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationalEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationOrIndividualTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass organizationsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputsType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputsType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ownersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametersType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patchesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pedigreeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceMetricsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceMetricTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceTradeoffsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postalAddressTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass proofOfConceptTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolPropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass purchaserTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantitativeAnalysisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratingsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ratingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencesType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relatedCryptoMaterialPropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseNotesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolvesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolvesType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceReferencesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securedByTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicesType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicesType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatoriesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatoryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stewardsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportingMaterialTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass swidTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tasksTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskTypesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskTypesType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technicalLimitationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolsType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolsType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toolTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCasesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vulnerabilitiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vulnerabilitiesType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vulnerabilitySourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vulnerabilityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workflowTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workspacesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workspaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessModeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum activityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assetTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum certificationLevelTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum classificationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentDataTypeEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cryptoFunctionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataFlowType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum encodingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum energySourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum evidenceTechniqueEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum executionEnvironmentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum externalReferenceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hashAlgEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum identityFieldTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum impactAnalysisAffectedStatusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum impactAnalysisJustificationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum impactAnalysisResponsesTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum impactAnalysisStateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum implementationPlatformTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum issueClassificationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum licenseAcknowledgementEnumerationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum licenseTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lifecyclePhaseTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum machineLearningApproachTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum outputTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paddingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum patchClassificationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scoreSourceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum severityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taskTypeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triggerTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum volumeModeEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType accessModeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType activityTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType aggregateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType assetTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bomLinkDocumentTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bomLinkElementTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bomLinkTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType certificationLevelTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType classicalSecurityLevelTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType classificationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType componentDataTypeEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cpeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cryptoFunctionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataFlowTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType decimalPercentTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType encodingObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType energySourceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType evidenceTechniqueObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType executionEnvironmentTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType externalReferenceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hashAlgObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hashValueEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType identityFieldTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType impactAnalysisAffectedStatusTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType impactAnalysisJustificationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType impactAnalysisResponsesTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType impactAnalysisStateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType implementationPlatformTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType issueClassificationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType licenseAcknowledgementEnumerationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType licenseTypeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lifecyclePhaseTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType localeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType machineLearningApproachTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mimeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nistQuantumSecurityLevelTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType openCreTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType outputTypeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType paddingTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType patchClassificationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType primitiveTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType refLinkTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType refTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType refType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType refType2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType refType3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType refType4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scopeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scoreSourceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scoreTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scoreType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType severityTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType stateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType taskTypeEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType triggerTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType unitTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType urlTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType urlType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType urlType2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType urnUuidEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionRangeTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType versionType1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType volumeModeEnumObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.cyclonedx.schema.bom.BOMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BOMPackageImpl() {
		super(eNS_URI, BOMFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BOMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static BOMPackage init() {
		if (isInited) return (BOMPackage)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBOMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BOMPackageImpl theBOMPackage = registeredBOMPackage instanceof BOMPackageImpl ? (BOMPackageImpl)registeredBOMPackage : new BOMPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SpdxPackage.eNS_URI);
		SpdxPackageImpl theSpdxPackage = (SpdxPackageImpl)(registeredPackage instanceof SpdxPackageImpl ? registeredPackage : SpdxPackage.eINSTANCE);

		// Load packages
		theBOMPackage.loadPackage();
		theSpdxPackage.loadPackage();

		// Fix loaded packages
		theBOMPackage.fixPackageContents();
		theSpdxPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theBOMPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return BOMValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBOMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BOMPackage.eNS_URI, theBOMPackage);
		return theBOMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdvisoriesType() {
		if (advisoriesTypeEClass == null) {
			advisoriesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(4);
		}
		return advisoriesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdvisoriesType_Advisory() {
        return (EReference)getAdvisoriesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdvisoryType() {
		if (advisoryTypeEClass == null) {
			advisoryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(5);
		}
		return advisoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdvisoryType_Title() {
        return (EAttribute)getAdvisoryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdvisoryType_Url() {
        return (EAttribute)getAdvisoryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAffectsType() {
		if (affectsTypeEClass == null) {
			affectsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(6);
		}
		return affectsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffectsType_Group() {
        return (EAttribute)getAffectsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAffectsType_Target() {
        return (EReference)getAffectsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAffirmationType() {
		if (affirmationTypeEClass == null) {
			affirmationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(7);
		}
		return affirmationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffirmationType_Statement() {
        return (EAttribute)getAffirmationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAffirmationType_Signatories() {
        return (EReference)getAffirmationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAffirmationType_Any() {
        return (EAttribute)getAffirmationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlgorithmPropertiesType() {
		if (algorithmPropertiesTypeEClass == null) {
			algorithmPropertiesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(10);
		}
		return algorithmPropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgorithmPropertiesType_Primitive() {
        return (EAttribute)getAlgorithmPropertiesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgorithmPropertiesType_ParameterSetIdentifier() {
        return (EAttribute)getAlgorithmPropertiesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgorithmPropertiesType_Curve() {
        return (EAttribute)getAlgorithmPropertiesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgorithmPropertiesType_ExecutionEnvironment() {
        return (EAttribute)getAlgorithmPropertiesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgorithmPropertiesType_ImplementationPlatform() {
        return (EAttribute)getAlgorithmPropertiesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgorithmPropertiesType_CertificationLevel() {
        return (EAttribute)getAlgorithmPropertiesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgorithmPropertiesType_Mode() {
        return (EAttribute)getAlgorithmPropertiesType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgorithmPropertiesType_Padding() {
        return (EAttribute)getAlgorithmPropertiesType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAlgorithmPropertiesType_CryptoFunctions() {
        return (EReference)getAlgorithmPropertiesType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgorithmPropertiesType_ClassicalSecurityLevel() {
        return (EAttribute)getAlgorithmPropertiesType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgorithmPropertiesType_NistQuantumSecurityLevel() {
        return (EAttribute)getAlgorithmPropertiesType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlgorithmsType() {
		if (algorithmsTypeEClass == null) {
			algorithmsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(11);
		}
		return algorithmsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgorithmsType_Algorithm() {
        return (EAttribute)getAlgorithmsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAliasesType() {
		if (aliasesTypeEClass == null) {
			aliasesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(12);
		}
		return aliasesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAliasesType_Alias() {
        return (EAttribute)getAliasesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAliasesType1() {
		if (aliasesType1EClass == null) {
			aliasesType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(13);
		}
		return aliasesType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAliasesType1_Group() {
        return (EAttribute)getAliasesType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAliasesType1_Alias() {
        return (EAttribute)getAliasesType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAltIdsType() {
		if (altIdsTypeEClass == null) {
			altIdsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(14);
		}
		return altIdsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAltIdsType_AltId() {
        return (EAttribute)getAltIdsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalysisType() {
		if (analysisTypeEClass == null) {
			analysisTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(15);
		}
		return analysisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnalysisType_State() {
        return (EAttribute)getAnalysisType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnalysisType_Justification() {
        return (EAttribute)getAnalysisType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnalysisType_Responses() {
        return (EReference)getAnalysisType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnalysisType_Detail() {
        return (EAttribute)getAnalysisType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnalysisType_FirstIssued() {
        return (EAttribute)getAnalysisType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnalysisType_LastUpdated() {
        return (EAttribute)getAnalysisType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationsType() {
		if (annotationsTypeEClass == null) {
			annotationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(16);
		}
		return annotationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationsType_Group() {
        return (EAttribute)getAnnotationsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationsType_Annotation() {
        return (EReference)getAnnotationsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationsType_Any() {
        return (EAttribute)getAnnotationsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationsType_AnyAttribute() {
        return (EAttribute)getAnnotationsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationType() {
		if (annotationTypeEClass == null) {
			annotationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(17);
		}
		return annotationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Subjects() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotationType_Annotator() {
        return (EReference)getAnnotationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_Timestamp() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_Text() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_Any() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_BomRef() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationType_AnyAttribute() {
        return (EAttribute)getAnnotationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotatorChoiceType() {
		if (annotatorChoiceTypeEClass == null) {
			annotatorChoiceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(18);
		}
		return annotatorChoiceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotatorChoiceType_Organization() {
        return (EReference)getAnnotatorChoiceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotatorChoiceType_Individual() {
        return (EReference)getAnnotatorChoiceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotatorChoiceType_Component() {
        return (EReference)getAnnotatorChoiceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotatorChoiceType_Service() {
        return (EReference)getAnnotatorChoiceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApproachType() {
		if (approachTypeEClass == null) {
			approachTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(19);
		}
		return approachTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApproachType_Type() {
        return (EAttribute)getApproachType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssembliesType() {
		if (assembliesTypeEClass == null) {
			assembliesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(20);
		}
		return assembliesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssembliesType_Group() {
        return (EAttribute)getAssembliesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssembliesType_Assembly() {
        return (EReference)getAssembliesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssembliesType_Any() {
        return (EAttribute)getAssembliesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssessorsType() {
		if (assessorsTypeEClass == null) {
			assessorsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(21);
		}
		return assessorsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessorsType_Assessor() {
        return (EReference)getAssessorsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssessorType() {
		if (assessorTypeEClass == null) {
			assessorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(22);
		}
		return assessorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessorType_ThirdParty() {
        return (EAttribute)getAssessorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssessorType_Organization() {
        return (EReference)getAssessorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessorType_BomRef() {
        return (EAttribute)getAssessorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssessorType_AnyAttribute() {
        return (EAttribute)getAssessorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttachedTextType() {
		if (attachedTextTypeEClass == null) {
			attachedTextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(25);
		}
		return attachedTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttachedTextType_Value() {
        return (EAttribute)getAttachedTextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttachedTextType_ContentType() {
        return (EAttribute)getAttachedTextType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttachedTextType_Encoding() {
        return (EAttribute)getAttachedTextType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttestationsType() {
		if (attestationsTypeEClass == null) {
			attestationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(26);
		}
		return attestationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttestationsType_Attestation() {
        return (EReference)getAttestationsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttestationType() {
		if (attestationTypeEClass == null) {
			attestationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(27);
		}
		return attestationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttestationType_Summary() {
        return (EAttribute)getAttestationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttestationType_Assessor() {
        return (EAttribute)getAttestationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttestationType_Map() {
        return (EReference)getAttestationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttestationType_Any() {
        return (EAttribute)getAttestationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthorsType() {
		if (authorsTypeEClass == null) {
			authorsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(28);
		}
		return authorsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthorsType_Group() {
        return (EAttribute)getAuthorsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthorsType_Author() {
        return (EReference)getAuthorsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthorsType1() {
		if (authorsType1EClass == null) {
			authorsType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(29);
		}
		return authorsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuthorsType1_Group() {
        return (EAttribute)getAuthorsType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAuthorsType1_Author() {
        return (EReference)getAuthorsType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBomReferenceType() {
		if (bomReferenceTypeEClass == null) {
			bomReferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(33);
		}
		return bomReferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBomReferenceType_Ref() {
        return (EAttribute)getBomReferenceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBomReferenceType_AnyAttribute() {
        return (EAttribute)getBomReferenceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBomType() {
		if (bomTypeEClass == null) {
			bomTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(34);
		}
		return bomTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBomType_Metadata() {
        return (EReference)getBomType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBomType_Components() {
        return (EReference)getBomType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBomType_Services() {
        return (EReference)getBomType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBomType_ExternalReferences() {
        return (EReference)getBomType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBomType_Dependencies() {
        return (EReference)getBomType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBomType_Compositions() {
        return (EReference)getBomType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBomType_Properties() {
        return (EReference)getBomType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBomType_Vulnerabilities() {
        return (EReference)getBomType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBomType_Annotations() {
        return (EReference)getBomType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBomType_Formulation() {
        return (EReference)getBomType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBomType_Declarations() {
        return (EReference)getBomType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBomType_Definitions() {
        return (EReference)getBomType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBomType_Any() {
        return (EAttribute)getBomType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBomType_SerialNumber() {
        return (EAttribute)getBomType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBomType_Version() {
        return (EAttribute)getBomType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBomType_AnyAttribute() {
        return (EAttribute)getBomType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCallstackType() {
		if (callstackTypeEClass == null) {
			callstackTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(35);
		}
		return callstackTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCallstackType_Frames() {
        return (EReference)getCallstackType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCallstackType_Tools() {
        return (EReference)getCallstackType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCertificatePropertiesType() {
		if (certificatePropertiesTypeEClass == null) {
			certificatePropertiesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(36);
		}
		return certificatePropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificatePropertiesType_SubjectName() {
        return (EAttribute)getCertificatePropertiesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificatePropertiesType_IssuerName() {
        return (EAttribute)getCertificatePropertiesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificatePropertiesType_NotValidBefore() {
        return (EAttribute)getCertificatePropertiesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificatePropertiesType_NotValidAfter() {
        return (EAttribute)getCertificatePropertiesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificatePropertiesType_SignatureAlgorithmRef() {
        return (EAttribute)getCertificatePropertiesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificatePropertiesType_SubjectPublicKeyRef() {
        return (EAttribute)getCertificatePropertiesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificatePropertiesType_CertificateFormat() {
        return (EAttribute)getCertificatePropertiesType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCertificatePropertiesType_CertificateExtension() {
        return (EAttribute)getCertificatePropertiesType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCipherSuitesType() {
		if (cipherSuitesTypeEClass == null) {
			cipherSuitesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(39);
		}
		return cipherSuitesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCipherSuitesType_CipherSuite() {
        return (EReference)getCipherSuitesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCipherSuiteType() {
		if (cipherSuiteTypeEClass == null) {
			cipherSuiteTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(40);
		}
		return cipherSuiteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCipherSuiteType_Name() {
        return (EAttribute)getCipherSuiteType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCipherSuiteType_Algorithms() {
        return (EReference)getCipherSuiteType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCipherSuiteType_Identifiers() {
        return (EReference)getCipherSuiteType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClaimsType() {
		if (claimsTypeEClass == null) {
			claimsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(41);
		}
		return claimsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClaimsType_Claim() {
        return (EReference)getClaimsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClaimsType1() {
		if (claimsType1EClass == null) {
			claimsType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(42);
		}
		return claimsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClaimsType1_Claim() {
        return (EAttribute)getClaimsType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getClaimType() {
		if (claimTypeEClass == null) {
			claimTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(43);
		}
		return claimTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClaimType_Target() {
        return (EAttribute)getClaimType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClaimType_Predicate() {
        return (EAttribute)getClaimType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClaimType_MitigationStrategies() {
        return (EReference)getClaimType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClaimType_Reasoning() {
        return (EAttribute)getClaimType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClaimType_Evidence() {
        return (EAttribute)getClaimType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClaimType_CounterEvidence() {
        return (EAttribute)getClaimType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getClaimType_ExternalReferences() {
        return (EReference)getClaimType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClaimType_Any() {
        return (EAttribute)getClaimType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClaimType_BomRef() {
        return (EAttribute)getClaimType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getClaimType_AnyAttribute() {
        return (EAttribute)getClaimType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCo2MeasureType() {
		if (co2MeasureTypeEClass == null) {
			co2MeasureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(47);
		}
		return co2MeasureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCo2MeasureType_Value() {
        return (EAttribute)getCo2MeasureType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCo2MeasureType_Unit() {
        return (EAttribute)getCo2MeasureType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollectionType() {
		if (collectionTypeEClass == null) {
			collectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(48);
		}
		return collectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollectionType_Graphic() {
        return (EReference)getCollectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollectionType1() {
		if (collectionType1EClass == null) {
			collectionType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(49);
		}
		return collectionType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCollectionType1_Graphic() {
        return (EReference)getCollectionType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommandsType() {
		if (commandsTypeEClass == null) {
			commandsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(50);
		}
		return commandsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommandsType_Command() {
        return (EReference)getCommandsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommandType() {
		if (commandTypeEClass == null) {
			commandTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(51);
		}
		return commandTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommandType_Executed() {
        return (EAttribute)getCommandType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommandType_Properties() {
        return (EReference)getCommandType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommitsType() {
		if (commitsTypeEClass == null) {
			commitsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(52);
		}
		return commitsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommitsType_Group() {
        return (EAttribute)getCommitsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommitsType_Commit() {
        return (EReference)getCommitsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommitsType_Any() {
        return (EAttribute)getCommitsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommitType() {
		if (commitTypeEClass == null) {
			commitTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(53);
		}
		return commitTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommitType_Uid() {
        return (EAttribute)getCommitType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommitType_Url() {
        return (EAttribute)getCommitType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommitType_Author() {
        return (EReference)getCommitType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommitType_Committer() {
        return (EReference)getCommitType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommitType_Message() {
        return (EAttribute)getCommitType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommitType_Any() {
        return (EAttribute)getCommitType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		if (componentEClass == null) {
			componentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(54);
		}
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Supplier() {
        return (EReference)getComponent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Manufacturer() {
        return (EReference)getComponent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Authors() {
        return (EReference)getComponent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Author() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Publisher() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Group() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Name() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Version() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Description() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Scope() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Hashes() {
        return (EReference)getComponent().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Licenses() {
        return (EReference)getComponent().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Copyright() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Cpe() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Purl() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_OmniborId() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Swhid() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Swid() {
        return (EReference)getComponent().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Modified() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Pedigree() {
        return (EReference)getComponent().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_ExternalReferences() {
        return (EReference)getComponent().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Properties() {
        return (EReference)getComponent().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Components() {
        return (EReference)getComponent().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Evidence() {
        return (EReference)getComponent().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_ReleaseNotes() {
        return (EReference)getComponent().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_ModelCard() {
        return (EReference)getComponent().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Data() {
        return (EReference)getComponent().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_CryptoProperties() {
        return (EReference)getComponent().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Tags() {
        return (EReference)getComponent().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Any() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_BomRef() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_MimeType() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Type() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_AnyAttribute() {
        return (EAttribute)getComponent().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentDataType() {
		if (componentDataTypeEClass == null) {
			componentDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(55);
		}
		return componentDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentDataType_Type() {
        return (EAttribute)getComponentDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentDataType_Name() {
        return (EAttribute)getComponentDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentDataType_Contents() {
        return (EReference)getComponentDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentDataType_Classification() {
        return (EAttribute)getComponentDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentDataType_SensitiveData() {
        return (EReference)getComponentDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentDataType_Graphics() {
        return (EReference)getComponentDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentDataType_Description() {
        return (EAttribute)getComponentDataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentDataType_Governance() {
        return (EReference)getComponentDataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentDataType_BomRef() {
        return (EAttribute)getComponentDataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentEvidenceType() {
		if (componentEvidenceTypeEClass == null) {
			componentEvidenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(58);
		}
		return componentEvidenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentEvidenceType_Identity() {
        return (EReference)getComponentEvidenceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentEvidenceType_Occurrences() {
        return (EReference)getComponentEvidenceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentEvidenceType_Callstack() {
        return (EReference)getComponentEvidenceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentEvidenceType_Licenses() {
        return (EReference)getComponentEvidenceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentEvidenceType_Copyright() {
        return (EReference)getComponentEvidenceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentEvidenceType_Any() {
        return (EAttribute)getComponentEvidenceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentEvidenceType_AnyAttribute() {
        return (EAttribute)getComponentEvidenceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentsType() {
		if (componentsTypeEClass == null) {
			componentsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(59);
		}
		return componentsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentsType_Group() {
        return (EAttribute)getComponentsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentsType_Component() {
        return (EReference)getComponentsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentsType_Any() {
        return (EAttribute)getComponentsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentsType1() {
		if (componentsType1EClass == null) {
			componentsType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(60);
		}
		return componentsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentsType1_Component() {
        return (EReference)getComponentsType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentsType2() {
		if (componentsType2EClass == null) {
			componentsType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(61);
		}
		return componentsType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentsType2_Group() {
        return (EAttribute)getComponentsType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentsType2_Component() {
        return (EReference)getComponentsType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentsType2_Any() {
        return (EAttribute)getComponentsType2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentsType2_AnyAttribute() {
        return (EAttribute)getComponentsType2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositionsType() {
		if (compositionsTypeEClass == null) {
			compositionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(62);
		}
		return compositionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompositionsType_Group() {
        return (EAttribute)getCompositionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositionsType_Composition() {
        return (EReference)getCompositionsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompositionsType_Any() {
        return (EAttribute)getCompositionsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompositionsType_AnyAttribute() {
        return (EAttribute)getCompositionsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositionType() {
		if (compositionTypeEClass == null) {
			compositionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(63);
		}
		return compositionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompositionType_Group() {
        return (EAttribute)getCompositionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompositionType_Aggregate() {
        return (EAttribute)getCompositionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositionType_Assemblies() {
        return (EReference)getCompositionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositionType_Dependencies() {
        return (EReference)getCompositionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositionType_Vulnerabilities() {
        return (EReference)getCompositionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompositionType_BomRef() {
        return (EAttribute)getCompositionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionsType() {
		if (conditionsTypeEClass == null) {
			conditionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(64);
		}
		return conditionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionsType_Condition() {
        return (EReference)getConditionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionType() {
		if (conditionTypeEClass == null) {
			conditionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(65);
		}
		return conditionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConditionType_Description() {
        return (EAttribute)getConditionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConditionType_Expression() {
        return (EAttribute)getConditionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConditionType_Properties() {
        return (EReference)getConditionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfidenceIntervalType() {
		if (confidenceIntervalTypeEClass == null) {
			confidenceIntervalTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(66);
		}
		return confidenceIntervalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfidenceIntervalType_LowerBound() {
        return (EAttribute)getConfidenceIntervalType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfidenceIntervalType_UpperBound() {
        return (EAttribute)getConfidenceIntervalType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfidenceType() {
		if (confidenceTypeEClass == null) {
			confidenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(67);
		}
		return confidenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfidenceType_Score() {
        return (EAttribute)getConfidenceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfidenceType_Rationale() {
        return (EAttribute)getConfidenceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConformanceType() {
		if (conformanceTypeEClass == null) {
			conformanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(68);
		}
		return conformanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConformanceType_Score() {
        return (EAttribute)getConformanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConformanceType_Rationale() {
        return (EAttribute)getConformanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConformanceType_MitigationStrategies() {
        return (EReference)getConformanceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsiderationsType() {
		if (considerationsTypeEClass == null) {
			considerationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(69);
		}
		return considerationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsiderationsType_Users() {
        return (EReference)getConsiderationsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsiderationsType_UseCases() {
        return (EReference)getConsiderationsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsiderationsType_TechnicalLimitations() {
        return (EReference)getConsiderationsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsiderationsType_PerformanceTradeoffs() {
        return (EReference)getConsiderationsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsiderationsType_EthicalConsiderations() {
        return (EReference)getConsiderationsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsiderationsType_EnvironmentalConsiderations() {
        return (EReference)getConsiderationsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsiderationsType_FairnessAssessments() {
        return (EReference)getConsiderationsType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentsType() {
		if (contentsTypeEClass == null) {
			contentsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(70);
		}
		return contentsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentsType_Attachment() {
        return (EReference)getContentsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentsType_Url() {
        return (EAttribute)getContentsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentsType1() {
		if (contentsType1EClass == null) {
			contentsType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(71);
		}
		return contentsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentsType1_Attachment() {
        return (EReference)getContentsType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContentsType1_Url() {
        return (EAttribute)getContentsType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContentsType1_Properties() {
        return (EReference)getContentsType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCopyrightsType() {
		if (copyrightsTypeEClass == null) {
			copyrightsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(72);
		}
		return copyrightsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCopyrightsType_Text() {
        return (EAttribute)getCopyrightsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCounterClaimsType() {
		if (counterClaimsTypeEClass == null) {
			counterClaimsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(73);
		}
		return counterClaimsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCounterClaimsType_CounterClaim() {
        return (EAttribute)getCounterClaimsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreditsType() {
		if (creditsTypeEClass == null) {
			creditsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(75);
		}
		return creditsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCreditsType_Organizations() {
        return (EReference)getCreditsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCreditsType_Individuals() {
        return (EReference)getCreditsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCryptoFunctionsType() {
		if (cryptoFunctionsTypeEClass == null) {
			cryptoFunctionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(76);
		}
		return cryptoFunctionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCryptoFunctionsType_CryptoFunction() {
        return (EAttribute)getCryptoFunctionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCryptoPropertiesType() {
		if (cryptoPropertiesTypeEClass == null) {
			cryptoPropertiesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(79);
		}
		return cryptoPropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCryptoPropertiesType_AssetType() {
        return (EAttribute)getCryptoPropertiesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCryptoPropertiesType_AlgorithmProperties() {
        return (EReference)getCryptoPropertiesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCryptoPropertiesType_CertificateProperties() {
        return (EReference)getCryptoPropertiesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCryptoPropertiesType_RelatedCryptoMaterialProperties() {
        return (EReference)getCryptoPropertiesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCryptoPropertiesType_ProtocolProperties() {
        return (EReference)getCryptoPropertiesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCryptoPropertiesType_Oid() {
        return (EAttribute)getCryptoPropertiesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustodiansType() {
		if (custodiansTypeEClass == null) {
			custodiansTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(80);
		}
		return custodiansTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCustodiansType_Custodian() {
        return (EReference)getCustodiansType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCwesType() {
		if (cwesTypeEClass == null) {
			cwesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(81);
		}
		return cwesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCwesType_Cwe() {
        return (EAttribute)getCwesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataClassificationType() {
		if (dataClassificationTypeEClass == null) {
			dataClassificationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(82);
		}
		return dataClassificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataClassificationType_Value() {
        return (EAttribute)getDataClassificationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataClassificationType_Flow() {
        return (EAttribute)getDataClassificationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataflowType() {
		if (dataflowTypeEClass == null) {
			dataflowTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(83);
		}
		return dataflowTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataflowType_Classification() {
        return (EReference)getDataflowType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataflowType_Governance() {
        return (EReference)getDataflowType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataflowType_Source() {
        return (EReference)getDataflowType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataflowType_Destination() {
        return (EReference)getDataflowType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataflowType_Description() {
        return (EAttribute)getDataflowType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataflowType_Name() {
        return (EAttribute)getDataflowType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataflowType_AnyAttribute() {
        return (EAttribute)getDataflowType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataGovernance() {
		if (dataGovernanceEClass == null) {
			dataGovernanceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(86);
		}
		return dataGovernanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataGovernance_Custodians() {
        return (EReference)getDataGovernance().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataGovernance_Stewards() {
        return (EReference)getDataGovernance().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataGovernance_Owners() {
        return (EReference)getDataGovernance().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatasetsType() {
		if (datasetsTypeEClass == null) {
			datasetsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(87);
		}
		return datasetsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasetsType_Group() {
        return (EAttribute)getDatasetsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasetsType_Ref() {
        return (EAttribute)getDatasetsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatasetsType_Dataset() {
        return (EReference)getDatasetsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataType() {
		if (dataTypeEClass == null) {
			dataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(88);
		}
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_Name() {
        return (EAttribute)getDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataType_Contents() {
        return (EReference)getDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType_Classification() {
        return (EAttribute)getDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataType_SensitiveData() {
        return (EReference)getDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataType_Governance() {
        return (EReference)getDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataType1() {
		if (dataType1EClass == null) {
			dataType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(89);
		}
		return dataType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataType1_Group() {
        return (EAttribute)getDataType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataType1_Classification() {
        return (EReference)getDataType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataType1_Dataflow() {
        return (EReference)getDataType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeclarationsType() {
		if (declarationsTypeEClass == null) {
			declarationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(91);
		}
		return declarationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeclarationsType_Assessors() {
        return (EReference)getDeclarationsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeclarationsType_Attestations() {
        return (EReference)getDeclarationsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeclarationsType_Claims() {
        return (EReference)getDeclarationsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeclarationsType_Evidence() {
        return (EReference)getDeclarationsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeclarationsType_Targets() {
        return (EReference)getDeclarationsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeclarationsType_Affirmation() {
        return (EReference)getDeclarationsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeclarationsType_Any() {
        return (EAttribute)getDeclarationsType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinitionsType() {
		if (definitionsTypeEClass == null) {
			definitionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(92);
		}
		return definitionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefinitionsType_Standards() {
        return (EReference)getDefinitionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependenciesType() {
		if (dependenciesTypeEClass == null) {
			dependenciesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(93);
		}
		return dependenciesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependenciesType_Group() {
        return (EAttribute)getDependenciesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDependenciesType_Dependency() {
        return (EReference)getDependenciesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependenciesType_Any() {
        return (EAttribute)getDependenciesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependenciesType1() {
		if (dependenciesType1EClass == null) {
			dependenciesType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(94);
		}
		return dependenciesType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependenciesType1_Group() {
        return (EAttribute)getDependenciesType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDependenciesType1_Dependency() {
        return (EReference)getDependenciesType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependencyType() {
		if (dependencyTypeEClass == null) {
			dependencyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(95);
		}
		return dependencyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependencyType_Group() {
        return (EAttribute)getDependencyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDependencyType_Dependency() {
        return (EReference)getDependencyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDependencyType_Provides() {
        return (EReference)getDependencyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependencyType_Ref() {
        return (EAttribute)getDependencyType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependencyType_AnyAttribute() {
        return (EAttribute)getDependencyType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDescriptionsType() {
		if (descriptionsTypeEClass == null) {
			descriptionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(96);
		}
		return descriptionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescriptionsType_Description() {
        return (EAttribute)getDescriptionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDestinationType() {
		if (destinationTypeEClass == null) {
			destinationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(97);
		}
		return destinationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDestinationType_Group() {
        return (EAttribute)getDestinationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDestinationType_Url() {
        return (EAttribute)getDestinationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffType() {
		if (diffTypeEClass == null) {
			diffTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(98);
		}
		return diffTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiffType_Text() {
        return (EReference)getDiffType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffType_Url() {
        return (EAttribute)getDiffType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffType_Any() {
        return (EAttribute)getDiffType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(99);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_Bom() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEndpointsType() {
		if (endpointsTypeEClass == null) {
			endpointsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(102);
		}
		return endpointsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndpointsType_Group() {
        return (EAttribute)getEndpointsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndpointsType_Endpoint() {
        return (EAttribute)getEndpointsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnergyConsumptionsType() {
		if (energyConsumptionsTypeEClass == null) {
			energyConsumptionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(103);
		}
		return energyConsumptionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnergyConsumptionsType_Group() {
        return (EAttribute)getEnergyConsumptionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnergyConsumptionsType_EnergyConsumption() {
        return (EReference)getEnergyConsumptionsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnergyConsumptionsType_Any() {
        return (EAttribute)getEnergyConsumptionsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnergyConsumptionsType_AnyAttribute() {
        return (EAttribute)getEnergyConsumptionsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnergyConsumptionType() {
		if (energyConsumptionTypeEClass == null) {
			energyConsumptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(104);
		}
		return energyConsumptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnergyConsumptionType_Activity() {
        return (EAttribute)getEnergyConsumptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnergyConsumptionType_EnergyProviders() {
        return (EReference)getEnergyConsumptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnergyConsumptionType_ActivityEnergyCost() {
        return (EReference)getEnergyConsumptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnergyConsumptionType_Co2CostEquivalent() {
        return (EReference)getEnergyConsumptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnergyConsumptionType_Co2CostOffset() {
        return (EReference)getEnergyConsumptionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnergyConsumptionType_Properties() {
        return (EReference)getEnergyConsumptionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnergyMeasureType() {
		if (energyMeasureTypeEClass == null) {
			energyMeasureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(105);
		}
		return energyMeasureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnergyMeasureType_Value() {
        return (EAttribute)getEnergyMeasureType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnergyMeasureType_Unit() {
        return (EAttribute)getEnergyMeasureType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnergyProviderType() {
		if (energyProviderTypeEClass == null) {
			energyProviderTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(106);
		}
		return energyProviderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnergyProviderType_Description() {
        return (EAttribute)getEnergyProviderType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnergyProviderType_Organization() {
        return (EReference)getEnergyProviderType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnergyProviderType_EnergySource() {
        return (EAttribute)getEnergyProviderType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnergyProviderType_EnergyProvided() {
        return (EReference)getEnergyProviderType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnergyProviderType_ExternalReferences() {
        return (EReference)getEnergyProviderType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnergyProviderType_BomRef() {
        return (EAttribute)getEnergyProviderType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironmentalConsiderationsType() {
		if (environmentalConsiderationsTypeEClass == null) {
			environmentalConsiderationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(109);
		}
		return environmentalConsiderationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvironmentalConsiderationsType_EnergyConsumptions() {
        return (EReference)getEnvironmentalConsiderationsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvironmentalConsiderationsType_Properties() {
        return (EReference)getEnvironmentalConsiderationsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironmentVarsType() {
		if (environmentVarsTypeEClass == null) {
			environmentVarsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(110);
		}
		return environmentVarsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentVarsType_Group() {
        return (EAttribute)getEnvironmentVarsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvironmentVarsType_EnvironmentVar() {
        return (EReference)getEnvironmentVarsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentVarsType_Value() {
        return (EAttribute)getEnvironmentVarsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironmentVarsType1() {
		if (environmentVarsType1EClass == null) {
			environmentVarsType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(111);
		}
		return environmentVarsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentVarsType1_Group() {
        return (EAttribute)getEnvironmentVarsType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvironmentVarsType1_EnvironmentVar() {
        return (EReference)getEnvironmentVarsType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentVarsType1_Value() {
        return (EAttribute)getEnvironmentVarsType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEthicalConsiderationsType() {
		if (ethicalConsiderationsTypeEClass == null) {
			ethicalConsiderationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(112);
		}
		return ethicalConsiderationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEthicalConsiderationsType_EthicalConsideration() {
        return (EReference)getEthicalConsiderationsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEthicalConsiderationType() {
		if (ethicalConsiderationTypeEClass == null) {
			ethicalConsiderationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(113);
		}
		return ethicalConsiderationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEthicalConsiderationType_Name() {
        return (EAttribute)getEthicalConsiderationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEthicalConsiderationType_MitigationStrategy() {
        return (EAttribute)getEthicalConsiderationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventType() {
		if (eventTypeEClass == null) {
			eventTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(114);
		}
		return eventTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventType_Uid() {
        return (EAttribute)getEventType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventType_Description() {
        return (EAttribute)getEventType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventType_TimeReceived() {
        return (EAttribute)getEventType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventType_Data() {
        return (EReference)getEventType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventType_Source() {
        return (EReference)getEventType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventType_Target() {
        return (EReference)getEventType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventType_Properties() {
        return (EReference)getEventType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventType_Any() {
        return (EAttribute)getEventType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventType_AnyAttribute() {
        return (EAttribute)getEventType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvidenceType() {
		if (evidenceTypeEClass == null) {
			evidenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(117);
		}
		return evidenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidenceType_PropertyName() {
        return (EAttribute)getEvidenceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidenceType_Description() {
        return (EAttribute)getEvidenceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvidenceType_Data() {
        return (EReference)getEvidenceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidenceType_Created() {
        return (EAttribute)getEvidenceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidenceType_Expires() {
        return (EAttribute)getEvidenceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvidenceType_Author() {
        return (EReference)getEvidenceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvidenceType_Reviewer() {
        return (EReference)getEvidenceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidenceType_Any() {
        return (EAttribute)getEvidenceType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidenceType_BomRef() {
        return (EAttribute)getEvidenceType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvidenceType_AnyAttribute() {
        return (EAttribute)getEvidenceType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvidenceType1() {
		if (evidenceType1EClass == null) {
			evidenceType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(118);
		}
		return evidenceType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvidenceType1_Evidence() {
        return (EReference)getEvidenceType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpressionType() {
		if (expressionTypeEClass == null) {
			expressionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(121);
		}
		return expressionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpressionType_Value() {
        return (EAttribute)getExpressionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpressionType_Acknowledgement() {
        return (EAttribute)getExpressionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpressionType_BomRef() {
        return (EAttribute)getExpressionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalReference() {
		if (externalReferenceEClass == null) {
			externalReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(122);
		}
		return externalReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalReference_Url() {
        return (EAttribute)getExternalReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalReference_Comment() {
        return (EAttribute)getExternalReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternalReference_Hashes() {
        return (EReference)getExternalReference().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalReference_Type() {
        return (EAttribute)getExternalReference().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalReference_AnyAttribute() {
        return (EAttribute)getExternalReference().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalReferences() {
		if (externalReferencesEClass == null) {
			externalReferencesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(123);
		}
		return externalReferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalReferences_Group() {
        return (EAttribute)getExternalReferences().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternalReferences_Reference() {
        return (EReference)getExternalReferences().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFairnessAssessmentsType() {
		if (fairnessAssessmentsTypeEClass == null) {
			fairnessAssessmentsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(126);
		}
		return fairnessAssessmentsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFairnessAssessmentsType_FairnessAssessment() {
        return (EReference)getFairnessAssessmentsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFairnessAssessmentType() {
		if (fairnessAssessmentTypeEClass == null) {
			fairnessAssessmentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(127);
		}
		return fairnessAssessmentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFairnessAssessmentType_GroupAtRisk() {
        return (EAttribute)getFairnessAssessmentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFairnessAssessmentType_Benefits() {
        return (EAttribute)getFairnessAssessmentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFairnessAssessmentType_Harms() {
        return (EAttribute)getFairnessAssessmentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFairnessAssessmentType_MitigationStrategy() {
        return (EAttribute)getFairnessAssessmentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFormulationType() {
		if (formulationTypeEClass == null) {
			formulationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(128);
		}
		return formulationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFormulationType_Group() {
        return (EAttribute)getFormulationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormulationType_Formula() {
        return (EReference)getFormulationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFormulationType_Any() {
        return (EAttribute)getFormulationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFormulationType_AnyAttribute() {
        return (EAttribute)getFormulationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFormulaType() {
		if (formulaTypeEClass == null) {
			formulaTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(129);
		}
		return formulaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormulaType_Components() {
        return (EReference)getFormulaType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormulaType_Services() {
        return (EReference)getFormulaType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormulaType_Workflows() {
        return (EReference)getFormulaType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormulaType_Properties() {
        return (EReference)getFormulaType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFormulaType_BomRef() {
        return (EAttribute)getFormulaType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFormulaType_AnyAttribute() {
        return (EAttribute)getFormulaType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFramesType() {
		if (framesTypeEClass == null) {
			framesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(130);
		}
		return framesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFramesType_Frame() {
        return (EReference)getFramesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFrameType() {
		if (frameTypeEClass == null) {
			frameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(131);
		}
		return frameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrameType_Package() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrameType_Module() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrameType_Function() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFrameType_Parameters() {
        return (EReference)getFrameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrameType_Line() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrameType_Column() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFrameType_FullFilename() {
        return (EAttribute)getFrameType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicsCollectionType() {
		if (graphicsCollectionTypeEClass == null) {
			graphicsCollectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(132);
		}
		return graphicsCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicsCollectionType_Description() {
        return (EReference)getGraphicsCollectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicsCollectionType_Collection() {
        return (EReference)getGraphicsCollectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicsType() {
		if (graphicsTypeEClass == null) {
			graphicsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(133);
		}
		return graphicsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicsType_Description() {
        return (EAttribute)getGraphicsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicsType_Collection() {
        return (EReference)getGraphicsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicType() {
		if (graphicTypeEClass == null) {
			graphicTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(134);
		}
		return graphicTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType_Name() {
        return (EAttribute)getGraphicType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicType_Image() {
        return (EReference)getGraphicType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraphicType1() {
		if (graphicType1EClass == null) {
			graphicType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(135);
		}
		return graphicType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGraphicType1_Name() {
        return (EAttribute)getGraphicType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraphicType1_Image() {
        return (EReference)getGraphicType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHashesType() {
		if (hashesTypeEClass == null) {
			hashesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(138);
		}
		return hashesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHashesType_Group() {
        return (EAttribute)getHashesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHashesType_Hash() {
        return (EReference)getHashesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHashesType1() {
		if (hashesType1EClass == null) {
			hashesType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(139);
		}
		return hashesType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHashesType1_Group() {
        return (EAttribute)getHashesType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHashesType1_Hash() {
        return (EReference)getHashesType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHashesType2() {
		if (hashesType2EClass == null) {
			hashesType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(140);
		}
		return hashesType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHashesType2_Group() {
        return (EAttribute)getHashesType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHashesType2_Hash() {
        return (EReference)getHashesType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHashType() {
		if (hashTypeEClass == null) {
			hashTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(141);
		}
		return hashTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHashType_Value() {
        return (EAttribute)getHashType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHashType_Alg() {
        return (EAttribute)getHashType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifiableActionType() {
		if (identifiableActionTypeEClass == null) {
			identifiableActionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(143);
		}
		return identifiableActionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiableActionType_Timestamp() {
        return (EAttribute)getIdentifiableActionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiableActionType_Name() {
        return (EAttribute)getIdentifiableActionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiableActionType_Email() {
        return (EAttribute)getIdentifiableActionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiableActionType_Any() {
        return (EAttribute)getIdentifiableActionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifiersType() {
		if (identifiersTypeEClass == null) {
			identifiersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(144);
		}
		return identifiersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiersType_Identifier() {
        return (EAttribute)getIdentifiersType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentityType() {
		if (identityTypeEClass == null) {
			identityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(147);
		}
		return identityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentityType_Field() {
        return (EAttribute)getIdentityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentityType_Confidence() {
        return (EAttribute)getIdentityType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentityType_ConcludedValue() {
        return (EAttribute)getIdentityType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentityType_Methods() {
        return (EReference)getIdentityType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIdentityType_Tools() {
        return (EReference)getIdentityType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIkev2TransformTypesType() {
		if (ikev2TransformTypesTypeEClass == null) {
			ikev2TransformTypesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(148);
		}
		return ikev2TransformTypesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIkev2TransformTypesType_Encr() {
        return (EAttribute)getIkev2TransformTypesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIkev2TransformTypesType_Prf() {
        return (EAttribute)getIkev2TransformTypesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIkev2TransformTypesType_Integ() {
        return (EAttribute)getIkev2TransformTypesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIkev2TransformTypesType_Ke() {
        return (EAttribute)getIkev2TransformTypesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIkev2TransformTypesType_Esn() {
        return (EAttribute)getIkev2TransformTypesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIkev2TransformTypesType_Auth() {
        return (EAttribute)getIkev2TransformTypesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndividualsType() {
		if (individualsTypeEClass == null) {
			individualsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(159);
		}
		return individualsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIndividualsType_Group() {
        return (EAttribute)getIndividualsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIndividualsType_Individual() {
        return (EReference)getIndividualsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputsType() {
		if (inputsTypeEClass == null) {
			inputsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(160);
		}
		return inputsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputsType_Input() {
        return (EReference)getInputsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputsType1() {
		if (inputsType1EClass == null) {
			inputsType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(161);
		}
		return inputsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputsType1_Input() {
        return (EReference)getInputsType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputsType2() {
		if (inputsType2EClass == null) {
			inputsType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(162);
		}
		return inputsType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputsType2_Input() {
        return (EReference)getInputsType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputsType3() {
		if (inputsType3EClass == null) {
			inputsType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(163);
		}
		return inputsType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputsType3_Input() {
        return (EReference)getInputsType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputType() {
		if (inputTypeEClass == null) {
			inputTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(164);
		}
		return inputTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputType_Resource() {
        return (EReference)getInputType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputType_Parameters() {
        return (EReference)getInputType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputType_EnvironmentVars() {
        return (EReference)getInputType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputType_Data() {
        return (EReference)getInputType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputType_Source() {
        return (EReference)getInputType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputType_Target() {
        return (EReference)getInputType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputType_Properties() {
        return (EReference)getInputType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInputType_Any() {
        return (EAttribute)getInputType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInputType_AnyAttribute() {
        return (EAttribute)getInputType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputType1() {
		if (inputType1EClass == null) {
			inputType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(165);
		}
		return inputType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInputType1_Format() {
        return (EAttribute)getInputType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIssueType() {
		if (issueTypeEClass == null) {
			issueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(168);
		}
		return issueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssueType_Id() {
        return (EAttribute)getIssueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssueType_Name() {
        return (EAttribute)getIssueType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssueType_Description() {
        return (EAttribute)getIssueType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssueType_Source() {
        return (EReference)getIssueType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIssueType_References() {
        return (EReference)getIssueType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssueType_Any() {
        return (EAttribute)getIssueType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssueType_Type() {
        return (EAttribute)getIssueType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLevelsType() {
		if (levelsTypeEClass == null) {
			levelsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(169);
		}
		return levelsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLevelsType_Level() {
        return (EReference)getLevelsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLevelType() {
		if (levelTypeEClass == null) {
			levelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(170);
		}
		return levelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLevelType_Identifier() {
        return (EAttribute)getLevelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLevelType_Title() {
        return (EAttribute)getLevelType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLevelType_Description() {
        return (EAttribute)getLevelType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLevelType_Requirements() {
        return (EReference)getLevelType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLevelType_BomRef() {
        return (EAttribute)getLevelType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLevelType_AnyAttribute() {
        return (EAttribute)getLevelType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLicenseChoiceType() {
		if (licenseChoiceTypeEClass == null) {
			licenseChoiceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(173);
		}
		return licenseChoiceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLicenseChoiceType_License() {
        return (EReference)getLicenseChoiceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLicenseChoiceType_Expression() {
        return (EReference)getLicenseChoiceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLicenseeType() {
		if (licenseeTypeEClass == null) {
			licenseeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(174);
		}
		return licenseeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLicenseeType_Organization() {
        return (EReference)getLicenseeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLicenseeType_Individual() {
        return (EReference)getLicenseeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLicenseType() {
		if (licenseTypeEClass == null) {
			licenseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(175);
		}
		return licenseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLicenseType_Id() {
        return (EAttribute)getLicenseType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLicenseType_Name() {
        return (EAttribute)getLicenseType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLicenseType_Text() {
        return (EReference)getLicenseType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLicenseType_Url() {
        return (EAttribute)getLicenseType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLicenseType_Licensing() {
        return (EReference)getLicenseType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLicenseType_Properties() {
        return (EReference)getLicenseType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLicenseType_Any() {
        return (EAttribute)getLicenseType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLicenseType_Acknowledgement() {
        return (EAttribute)getLicenseType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLicenseType_BomRef() {
        return (EAttribute)getLicenseType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLicenseTypesType() {
		if (licenseTypesTypeEClass == null) {
			licenseTypesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(178);
		}
		return licenseTypesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLicenseTypesType_LicenseType() {
        return (EAttribute)getLicenseTypesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLicensingType() {
		if (licensingTypeEClass == null) {
			licensingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(179);
		}
		return licensingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLicensingType_AltIds() {
        return (EReference)getLicensingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLicensingType_Licensor() {
        return (EReference)getLicensingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLicensingType_Licensee() {
        return (EReference)getLicensingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLicensingType_Purchaser() {
        return (EReference)getLicensingType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLicensingType_PurchaseOrder() {
        return (EAttribute)getLicensingType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLicensingType_LicenseTypes() {
        return (EReference)getLicensingType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLicensingType_LastRenewal() {
        return (EAttribute)getLicensingType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLicensingType_Expiration() {
        return (EAttribute)getLicensingType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLicensingType_Any() {
        return (EAttribute)getLicensingType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLicensorType() {
		if (licensorTypeEClass == null) {
			licensorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(180);
		}
		return licensorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLicensorType_Organization() {
        return (EReference)getLicensorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLicensorType_Individual() {
        return (EReference)getLicensorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLifecyclesType() {
		if (lifecyclesTypeEClass == null) {
			lifecyclesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(183);
		}
		return lifecyclesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLifecyclesType_Lifecycle() {
        return (EReference)getLifecyclesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLifecycleType() {
		if (lifecycleTypeEClass == null) {
			lifecycleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(184);
		}
		return lifecycleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLifecycleType_Phase() {
        return (EAttribute)getLifecycleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLifecycleType_Name() {
        return (EAttribute)getLifecycleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLifecycleType_Description() {
        return (EAttribute)getLifecycleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMapType() {
		if (mapTypeEClass == null) {
			mapTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(188);
		}
		return mapTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapType_Requirement() {
        return (EAttribute)getMapType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapType_Claims() {
        return (EReference)getMapType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapType_CounterClaims() {
        return (EReference)getMapType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapType_Conformance() {
        return (EReference)getMapType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapType_Confidence() {
        return (EReference)getMapType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetadata() {
		if (metadataEClass == null) {
			metadataEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(189);
		}
		return metadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadata_Timestamp() {
        return (EAttribute)getMetadata().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_Lifecycles() {
        return (EReference)getMetadata().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_Tools() {
        return (EReference)getMetadata().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_Authors() {
        return (EReference)getMetadata().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_Component() {
        return (EReference)getMetadata().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_Manufacturer() {
        return (EReference)getMetadata().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_Manufacture() {
        return (EReference)getMetadata().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_Supplier() {
        return (EReference)getMetadata().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_Licenses() {
        return (EReference)getMetadata().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetadata_Properties() {
        return (EReference)getMetadata().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadata_Any() {
        return (EAttribute)getMetadata().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMetadata_AnyAttribute() {
        return (EAttribute)getMetadata().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodsType() {
		if (methodsTypeEClass == null) {
			methodsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(190);
		}
		return methodsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodsType_Method() {
        return (EReference)getMethodsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodType() {
		if (methodTypeEClass == null) {
			methodTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(191);
		}
		return methodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodType_Technique() {
        return (EAttribute)getMethodType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodType_Confidence() {
        return (EAttribute)getMethodType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodType_Value() {
        return (EAttribute)getMethodType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMitigationStrategiesType() {
		if (mitigationStrategiesTypeEClass == null) {
			mitigationStrategiesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(193);
		}
		return mitigationStrategiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMitigationStrategiesType_MitigationStrategy() {
        return (EAttribute)getMitigationStrategiesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMitigationStrategiesType1() {
		if (mitigationStrategiesType1EClass == null) {
			mitigationStrategiesType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(194);
		}
		return mitigationStrategiesType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMitigationStrategiesType1_MitigationStrategy() {
        return (EAttribute)getMitigationStrategiesType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelCardType() {
		if (modelCardTypeEClass == null) {
			modelCardTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(195);
		}
		return modelCardTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelCardType_ModelParameters() {
        return (EReference)getModelCardType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelCardType_QuantitativeAnalysis() {
        return (EReference)getModelCardType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelCardType_Considerations() {
        return (EReference)getModelCardType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelCardType_BomRef() {
        return (EAttribute)getModelCardType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelParametersType() {
		if (modelParametersTypeEClass == null) {
			modelParametersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(196);
		}
		return modelParametersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelParametersType_Approach() {
        return (EReference)getModelParametersType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelParametersType_Task() {
        return (EAttribute)getModelParametersType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelParametersType_ArchitectureFamily() {
        return (EAttribute)getModelParametersType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelParametersType_ModelArchitecture() {
        return (EAttribute)getModelParametersType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelParametersType_Datasets() {
        return (EReference)getModelParametersType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelParametersType_Inputs() {
        return (EReference)getModelParametersType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelParametersType_Outputs() {
        return (EReference)getModelParametersType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotesType() {
		if (notesTypeEClass == null) {
			notesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(200);
		}
		return notesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotesType_Group() {
        return (EAttribute)getNotesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNotesType_Note() {
        return (EReference)getNotesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNoteType() {
		if (noteTypeEClass == null) {
			noteTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(201);
		}
		return noteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNoteType_Group() {
        return (EAttribute)getNoteType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNoteType_Locale() {
        return (EAttribute)getNoteType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNoteType_Text() {
        return (EReference)getNoteType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOccurrencesType() {
		if (occurrencesTypeEClass == null) {
			occurrencesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(202);
		}
		return occurrencesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOccurrencesType_Occurrence() {
        return (EReference)getOccurrencesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOccurrenceType() {
		if (occurrenceTypeEClass == null) {
			occurrenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(203);
		}
		return occurrenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOccurrenceType_Location() {
        return (EAttribute)getOccurrenceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOccurrenceType_Line() {
        return (EAttribute)getOccurrenceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOccurrenceType_Offset() {
        return (EAttribute)getOccurrenceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOccurrenceType_Symbol() {
        return (EAttribute)getOccurrenceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOccurrenceType_AdditionalContext() {
        return (EAttribute)getOccurrenceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOccurrenceType_BomRef() {
        return (EAttribute)getOccurrenceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrganizationalContact() {
		if (organizationalContactEClass == null) {
			organizationalContactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(205);
		}
		return organizationalContactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganizationalContact_Name() {
        return (EAttribute)getOrganizationalContact().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganizationalContact_Email() {
        return (EAttribute)getOrganizationalContact().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganizationalContact_Phone() {
        return (EAttribute)getOrganizationalContact().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganizationalContact_Any() {
        return (EAttribute)getOrganizationalContact().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganizationalContact_BomRef() {
        return (EAttribute)getOrganizationalContact().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganizationalContact_AnyAttribute() {
        return (EAttribute)getOrganizationalContact().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrganizationalEntity() {
		if (organizationalEntityEClass == null) {
			organizationalEntityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(206);
		}
		return organizationalEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganizationalEntity_Name() {
        return (EAttribute)getOrganizationalEntity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganizationalEntity_Address() {
        return (EReference)getOrganizationalEntity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganizationalEntity_Url() {
        return (EAttribute)getOrganizationalEntity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganizationalEntity_Contact() {
        return (EReference)getOrganizationalEntity().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganizationalEntity_Any() {
        return (EAttribute)getOrganizationalEntity().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganizationalEntity_BomRef() {
        return (EAttribute)getOrganizationalEntity().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganizationalEntity_AnyAttribute() {
        return (EAttribute)getOrganizationalEntity().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrganizationOrIndividualType() {
		if (organizationOrIndividualTypeEClass == null) {
			organizationOrIndividualTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(207);
		}
		return organizationOrIndividualTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganizationOrIndividualType_Organization() {
        return (EReference)getOrganizationOrIndividualType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganizationOrIndividualType_Individual() {
        return (EReference)getOrganizationOrIndividualType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrganizationsType() {
		if (organizationsTypeEClass == null) {
			organizationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(208);
		}
		return organizationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganizationsType_Organization() {
        return (EReference)getOrganizationsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrganizationsType1() {
		if (organizationsType1EClass == null) {
			organizationsType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(209);
		}
		return organizationsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrganizationsType1_Group() {
        return (EAttribute)getOrganizationsType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrganizationsType1_Organization() {
        return (EReference)getOrganizationsType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputsType() {
		if (outputsTypeEClass == null) {
			outputsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(210);
		}
		return outputsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputsType_Output() {
        return (EReference)getOutputsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputsType1() {
		if (outputsType1EClass == null) {
			outputsType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(211);
		}
		return outputsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputsType1_Output() {
        return (EReference)getOutputsType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputsType2() {
		if (outputsType2EClass == null) {
			outputsType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(212);
		}
		return outputsType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputsType2_Output() {
        return (EReference)getOutputsType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputsType3() {
		if (outputsType3EClass == null) {
			outputsType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(213);
		}
		return outputsType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputsType3_Output() {
        return (EReference)getOutputsType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputType() {
		if (outputTypeEClass == null) {
			outputTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(214);
		}
		return outputTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputType_Resource() {
        return (EReference)getOutputType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputType_EnvironmentVars() {
        return (EReference)getOutputType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputType_Data() {
        return (EReference)getOutputType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutputType_Type() {
        return (EAttribute)getOutputType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputType_Source() {
        return (EReference)getOutputType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputType_Target() {
        return (EReference)getOutputType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputType_Properties() {
        return (EReference)getOutputType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutputType_Any() {
        return (EAttribute)getOutputType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutputType_AnyAttribute() {
        return (EAttribute)getOutputType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputType1() {
		if (outputType1EClass == null) {
			outputType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(215);
		}
		return outputType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutputType1_Format() {
        return (EAttribute)getOutputType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOwnersType() {
		if (ownersTypeEClass == null) {
			ownersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(218);
		}
		return ownersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOwnersType_Owner() {
        return (EReference)getOwnersType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParametersType() {
		if (parametersTypeEClass == null) {
			parametersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(221);
		}
		return parametersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParametersType_Parameter() {
        return (EReference)getParametersType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParametersType1() {
		if (parametersType1EClass == null) {
			parametersType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(222);
		}
		return parametersType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParametersType1_Parameter() {
        return (EAttribute)getParametersType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterType() {
		if (parameterTypeEClass == null) {
			parameterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(223);
		}
		return parameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterType_Name() {
        return (EAttribute)getParameterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterType_Value() {
        return (EAttribute)getParameterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterType_DataType() {
        return (EAttribute)getParameterType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterType_Any() {
        return (EAttribute)getParameterType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterType_AnyAttribute() {
        return (EAttribute)getParameterType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPatchesType() {
		if (patchesTypeEClass == null) {
			patchesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(226);
		}
		return patchesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatchesType_Group() {
        return (EAttribute)getPatchesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatchesType_Patch() {
        return (EReference)getPatchesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatchesType_Any() {
        return (EAttribute)getPatchesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPatchType() {
		if (patchTypeEClass == null) {
			patchTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(227);
		}
		return patchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatchType_Diff() {
        return (EReference)getPatchType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatchType_Resolves() {
        return (EReference)getPatchType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatchType_Any() {
        return (EAttribute)getPatchType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatchType_Type() {
        return (EAttribute)getPatchType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPedigreeType() {
		if (pedigreeTypeEClass == null) {
			pedigreeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(228);
		}
		return pedigreeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPedigreeType_Ancestors() {
        return (EReference)getPedigreeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPedigreeType_Descendants() {
        return (EReference)getPedigreeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPedigreeType_Variants() {
        return (EReference)getPedigreeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPedigreeType_Commits() {
        return (EReference)getPedigreeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPedigreeType_Patches() {
        return (EReference)getPedigreeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPedigreeType_Notes() {
        return (EAttribute)getPedigreeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPedigreeType_Any() {
        return (EAttribute)getPedigreeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerformanceMetricsType() {
		if (performanceMetricsTypeEClass == null) {
			performanceMetricsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(229);
		}
		return performanceMetricsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerformanceMetricsType_PerformanceMetric() {
        return (EReference)getPerformanceMetricsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerformanceMetricType() {
		if (performanceMetricTypeEClass == null) {
			performanceMetricTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(230);
		}
		return performanceMetricTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerformanceMetricType_Type() {
        return (EAttribute)getPerformanceMetricType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerformanceMetricType_Value() {
        return (EAttribute)getPerformanceMetricType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerformanceMetricType_Slice() {
        return (EAttribute)getPerformanceMetricType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPerformanceMetricType_ConfidenceInterval() {
        return (EReference)getPerformanceMetricType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerformanceTradeoffsType() {
		if (performanceTradeoffsTypeEClass == null) {
			performanceTradeoffsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(231);
		}
		return performanceTradeoffsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerformanceTradeoffsType_PerformanceTradeoff() {
        return (EAttribute)getPerformanceTradeoffsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPostalAddressType() {
		if (postalAddressTypeEClass == null) {
			postalAddressTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(232);
		}
		return postalAddressTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalAddressType_Country() {
        return (EAttribute)getPostalAddressType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalAddressType_Region() {
        return (EAttribute)getPostalAddressType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalAddressType_Locality() {
        return (EAttribute)getPostalAddressType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalAddressType_PostOfficeBoxNumber() {
        return (EAttribute)getPostalAddressType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalAddressType_PostalCode() {
        return (EAttribute)getPostalAddressType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalAddressType_StreetAddress() {
        return (EAttribute)getPostalAddressType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPostalAddressType_BomRef() {
        return (EAttribute)getPostalAddressType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProofOfConceptType() {
		if (proofOfConceptTypeEClass == null) {
			proofOfConceptTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(235);
		}
		return proofOfConceptTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProofOfConceptType_ReproductionSteps() {
        return (EAttribute)getProofOfConceptType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProofOfConceptType_Environment() {
        return (EAttribute)getProofOfConceptType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProofOfConceptType_SupportingMaterial() {
        return (EReference)getProofOfConceptType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertiesType() {
		if (propertiesTypeEClass == null) {
			propertiesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(236);
		}
		return propertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertiesType_Group() {
        return (EAttribute)getPropertiesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertiesType_Property() {
        return (EReference)getPropertiesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertiesType_Any() {
        return (EAttribute)getPropertiesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertiesType_AnyAttribute() {
        return (EAttribute)getPropertiesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyType() {
		if (propertyTypeEClass == null) {
			propertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(237);
		}
		return propertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyType_Value() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyType_Name() {
        return (EAttribute)getPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProtocolPropertiesType() {
		if (protocolPropertiesTypeEClass == null) {
			protocolPropertiesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(238);
		}
		return protocolPropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProtocolPropertiesType_Type() {
        return (EAttribute)getProtocolPropertiesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProtocolPropertiesType_Version() {
        return (EAttribute)getProtocolPropertiesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProtocolPropertiesType_CipherSuites() {
        return (EReference)getProtocolPropertiesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProtocolPropertiesType_Ikev2TransformTypes() {
        return (EReference)getProtocolPropertiesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProtocolPropertiesType_CryptoRef() {
        return (EAttribute)getProtocolPropertiesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvidesType() {
		if (providesTypeEClass == null) {
			providesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(239);
		}
		return providesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProvidesType_Ref() {
        return (EAttribute)getProvidesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPurchaserType() {
		if (purchaserTypeEClass == null) {
			purchaserTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(240);
		}
		return purchaserTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPurchaserType_Organization() {
        return (EReference)getPurchaserType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPurchaserType_Individual() {
        return (EReference)getPurchaserType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQuantitativeAnalysisType() {
		if (quantitativeAnalysisTypeEClass == null) {
			quantitativeAnalysisTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(241);
		}
		return quantitativeAnalysisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantitativeAnalysisType_PerformanceMetrics() {
        return (EReference)getQuantitativeAnalysisType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQuantitativeAnalysisType_Graphics() {
        return (EReference)getQuantitativeAnalysisType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRatingsType() {
		if (ratingsTypeEClass == null) {
			ratingsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(242);
		}
		return ratingsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRatingsType_Rating() {
        return (EReference)getRatingsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRatingType() {
		if (ratingTypeEClass == null) {
			ratingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(243);
		}
		return ratingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRatingType_Source() {
        return (EReference)getRatingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRatingType_Score() {
        return (EAttribute)getRatingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRatingType_Severity() {
        return (EAttribute)getRatingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRatingType_Method() {
        return (EAttribute)getRatingType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRatingType_Vector() {
        return (EAttribute)getRatingType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRatingType_Justification() {
        return (EAttribute)getRatingType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferencesType() {
		if (referencesTypeEClass == null) {
			referencesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(244);
		}
		return referencesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferencesType_Group() {
        return (EAttribute)getReferencesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferencesType_Reference() {
        return (EReference)getReferencesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferencesType_Any() {
        return (EAttribute)getReferencesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferencesType1() {
		if (referencesType1EClass == null) {
			referencesType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(245);
		}
		return referencesType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferencesType1_Group() {
        return (EAttribute)getReferencesType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferencesType1_Url() {
        return (EAttribute)getReferencesType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceType() {
		if (referenceTypeEClass == null) {
			referenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(246);
		}
		return referenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceType_Id() {
        return (EAttribute)getReferenceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceType_Source() {
        return (EReference)getReferenceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelatedCryptoMaterialPropertiesType() {
		if (relatedCryptoMaterialPropertiesTypeEClass == null) {
			relatedCryptoMaterialPropertiesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(253);
		}
		return relatedCryptoMaterialPropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelatedCryptoMaterialPropertiesType_Type() {
        return (EAttribute)getRelatedCryptoMaterialPropertiesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelatedCryptoMaterialPropertiesType_Id() {
        return (EAttribute)getRelatedCryptoMaterialPropertiesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelatedCryptoMaterialPropertiesType_State() {
        return (EAttribute)getRelatedCryptoMaterialPropertiesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelatedCryptoMaterialPropertiesType_AlgorithmRef() {
        return (EAttribute)getRelatedCryptoMaterialPropertiesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelatedCryptoMaterialPropertiesType_CreationDate() {
        return (EAttribute)getRelatedCryptoMaterialPropertiesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelatedCryptoMaterialPropertiesType_ActivationDate() {
        return (EAttribute)getRelatedCryptoMaterialPropertiesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelatedCryptoMaterialPropertiesType_UpdateDate() {
        return (EAttribute)getRelatedCryptoMaterialPropertiesType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelatedCryptoMaterialPropertiesType_ExpirationDate() {
        return (EAttribute)getRelatedCryptoMaterialPropertiesType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelatedCryptoMaterialPropertiesType_Value() {
        return (EAttribute)getRelatedCryptoMaterialPropertiesType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelatedCryptoMaterialPropertiesType_Size() {
        return (EAttribute)getRelatedCryptoMaterialPropertiesType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelatedCryptoMaterialPropertiesType_Format() {
        return (EAttribute)getRelatedCryptoMaterialPropertiesType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelatedCryptoMaterialPropertiesType_SecuredBy() {
        return (EReference)getRelatedCryptoMaterialPropertiesType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReleaseNotesType() {
		if (releaseNotesTypeEClass == null) {
			releaseNotesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(254);
		}
		return releaseNotesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReleaseNotesType_Group() {
        return (EAttribute)getReleaseNotesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReleaseNotesType_Type() {
        return (EAttribute)getReleaseNotesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReleaseNotesType_Title() {
        return (EAttribute)getReleaseNotesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReleaseNotesType_FeaturedImage() {
        return (EAttribute)getReleaseNotesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReleaseNotesType_SocialImage() {
        return (EAttribute)getReleaseNotesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReleaseNotesType_Description() {
        return (EAttribute)getReleaseNotesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReleaseNotesType_Timestamp() {
        return (EAttribute)getReleaseNotesType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReleaseNotesType_Aliases() {
        return (EReference)getReleaseNotesType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReleaseNotesType_Tags() {
        return (EReference)getReleaseNotesType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReleaseNotesType_Resolves() {
        return (EReference)getReleaseNotesType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReleaseNotesType_Notes() {
        return (EReference)getReleaseNotesType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReleaseNotesType_Properties() {
        return (EReference)getReleaseNotesType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReleaseNotesType_Any() {
        return (EAttribute)getReleaseNotesType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReleaseNotesType_AnyAttribute() {
        return (EAttribute)getReleaseNotesType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirementsType() {
		if (requirementsTypeEClass == null) {
			requirementsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(255);
		}
		return requirementsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementsType_Requirement() {
        return (EAttribute)getRequirementsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirementsType1() {
		if (requirementsType1EClass == null) {
			requirementsType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(256);
		}
		return requirementsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementsType1_Requirement() {
        return (EReference)getRequirementsType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirementType() {
		if (requirementTypeEClass == null) {
			requirementTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(257);
		}
		return requirementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementType_Identifier() {
        return (EAttribute)getRequirementType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementType_Title() {
        return (EAttribute)getRequirementType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementType_Text() {
        return (EAttribute)getRequirementType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementType_Descriptions() {
        return (EReference)getRequirementType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementType_OpenCre() {
        return (EAttribute)getRequirementType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementType_Parent() {
        return (EAttribute)getRequirementType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementType_Properties() {
        return (EReference)getRequirementType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementType_ExternalReferences() {
        return (EReference)getRequirementType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementType_BomRef() {
        return (EAttribute)getRequirementType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementType_AnyAttribute() {
        return (EAttribute)getRequirementType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResolvesType() {
		if (resolvesTypeEClass == null) {
			resolvesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(258);
		}
		return resolvesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResolvesType_Group() {
        return (EAttribute)getResolvesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResolvesType_Issue() {
        return (EReference)getResolvesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResolvesType1() {
		if (resolvesType1EClass == null) {
			resolvesType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(259);
		}
		return resolvesType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResolvesType1_Group() {
        return (EAttribute)getResolvesType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResolvesType1_Issue() {
        return (EReference)getResolvesType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceReferencesType() {
		if (resourceReferencesTypeEClass == null) {
			resourceReferencesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(260);
		}
		return resourceReferencesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceReferencesType_ResourceReference() {
        return (EReference)getResourceReferencesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceReferencesType_Any() {
        return (EAttribute)getResourceReferencesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceReferencesType_AnyAttribute() {
        return (EAttribute)getResourceReferencesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourceReferenceType() {
		if (resourceReferenceTypeEClass == null) {
			resourceReferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(261);
		}
		return resourceReferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceReferenceType_Ref() {
        return (EAttribute)getResourceReferenceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourceReferenceType_ExternalReference() {
        return (EReference)getResourceReferenceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceReferenceType_Any() {
        return (EAttribute)getResourceReferenceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResourceReferenceType_AnyAttribute() {
        return (EAttribute)getResourceReferenceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponsesType() {
		if (responsesTypeEClass == null) {
			responsesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(262);
		}
		return responsesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponsesType_Group() {
        return (EAttribute)getResponsesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getResponsesType_Response() {
        return (EAttribute)getResponsesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSecuredByType() {
		if (securedByTypeEClass == null) {
			securedByTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(269);
		}
		return securedByTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecuredByType_Mechanism() {
        return (EAttribute)getSecuredByType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSecuredByType_AlgorithmRef() {
        return (EAttribute)getSecuredByType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getService() {
		if (serviceEClass == null) {
			serviceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(270);
		}
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Provider() {
        return (EReference)getService().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Group() {
        return (EAttribute)getService().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Name() {
        return (EAttribute)getService().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Version() {
        return (EAttribute)getService().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Description() {
        return (EAttribute)getService().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Endpoints() {
        return (EReference)getService().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Authenticated() {
        return (EAttribute)getService().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_XTrustBoundary() {
        return (EAttribute)getService().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_TrustZone() {
        return (EAttribute)getService().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Data() {
        return (EReference)getService().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Licenses() {
        return (EReference)getService().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_ExternalReferences() {
        return (EReference)getService().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Properties() {
        return (EReference)getService().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Services() {
        return (EReference)getService().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_ReleaseNotes() {
        return (EReference)getService().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Tags() {
        return (EReference)getService().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Any() {
        return (EAttribute)getService().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_BomRef() {
        return (EAttribute)getService().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_AnyAttribute() {
        return (EAttribute)getService().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServicesType() {
		if (servicesTypeEClass == null) {
			servicesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(271);
		}
		return servicesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServicesType_Service() {
        return (EReference)getServicesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServicesType1() {
		if (servicesType1EClass == null) {
			servicesType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(272);
		}
		return servicesType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServicesType1_Group() {
        return (EAttribute)getServicesType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServicesType1_Service() {
        return (EReference)getServicesType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServicesType1_Any() {
        return (EAttribute)getServicesType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServicesType2() {
		if (servicesType2EClass == null) {
			servicesType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(273);
		}
		return servicesType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServicesType2_Group() {
        return (EAttribute)getServicesType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServicesType2_Service() {
        return (EReference)getServicesType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServicesType2_Any() {
        return (EAttribute)getServicesType2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServicesType2_AnyAttribute() {
        return (EAttribute)getServicesType2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignatoriesType() {
		if (signatoriesTypeEClass == null) {
			signatoriesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(276);
		}
		return signatoriesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignatoriesType_Signatory() {
        return (EReference)getSignatoriesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignatoryType() {
		if (signatoryTypeEClass == null) {
			signatoryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(277);
		}
		return signatoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignatoryType_Name() {
        return (EAttribute)getSignatoryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignatoryType_Role() {
        return (EAttribute)getSignatoryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignatoryType_Organization() {
        return (EReference)getSignatoryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSignatoryType_ExternalReference() {
        return (EReference)getSignatoryType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignatoryType_Any() {
        return (EAttribute)getSignatoryType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceType() {
		if (sourceTypeEClass == null) {
			sourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(278);
		}
		return sourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSourceType_Group() {
        return (EAttribute)getSourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSourceType_Url() {
        return (EAttribute)getSourceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceType1() {
		if (sourceType1EClass == null) {
			sourceType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(279);
		}
		return sourceType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSourceType1_Name() {
        return (EAttribute)getSourceType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSourceType1_Url() {
        return (EAttribute)getSourceType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStandard() {
		if (standardEClass == null) {
			standardEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(280);
		}
		return standardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandard_Name() {
        return (EAttribute)getStandard().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandard_Version() {
        return (EAttribute)getStandard().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandard_Description() {
        return (EAttribute)getStandard().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandard_Owner() {
        return (EAttribute)getStandard().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandard_Requirements() {
        return (EReference)getStandard().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandard_Levels() {
        return (EReference)getStandard().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandard_ExternalReferences() {
        return (EReference)getStandard().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandard_Any() {
        return (EAttribute)getStandard().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandard_BomRef() {
        return (EAttribute)getStandard().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandard_AnyAttribute() {
        return (EAttribute)getStandard().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStandardsType() {
		if (standardsTypeEClass == null) {
			standardsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(281);
		}
		return standardsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandardsType_Group() {
        return (EAttribute)getStandardsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStandardsType_Standard() {
        return (EReference)getStandardsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandardsType_Any() {
        return (EAttribute)getStandardsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStandardsType_AnyAttribute() {
        return (EAttribute)getStandardsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStepsType() {
		if (stepsTypeEClass == null) {
			stepsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(284);
		}
		return stepsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStepsType_Step() {
        return (EReference)getStepsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStepsType1() {
		if (stepsType1EClass == null) {
			stepsType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(285);
		}
		return stepsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStepsType1_Step() {
        return (EReference)getStepsType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStepType() {
		if (stepTypeEClass == null) {
			stepTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(286);
		}
		return stepTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStepType_Name() {
        return (EAttribute)getStepType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStepType_Description() {
        return (EAttribute)getStepType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStepType_Commands() {
        return (EReference)getStepType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStepType_Properties() {
        return (EReference)getStepType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStepType_Any() {
        return (EAttribute)getStepType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStepType_AnyAttribute() {
        return (EAttribute)getStepType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStewardsType() {
		if (stewardsTypeEClass == null) {
			stewardsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(287);
		}
		return stewardsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStewardsType_Steward() {
        return (EReference)getStewardsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubjectsType() {
		if (subjectsTypeEClass == null) {
			subjectsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(288);
		}
		return subjectsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubjectsType_Group() {
        return (EAttribute)getSubjectsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubjectsType_Subject() {
        return (EReference)getSubjectsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubjectsType_Any() {
        return (EAttribute)getSubjectsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSupportingMaterialType() {
		if (supportingMaterialTypeEClass == null) {
			supportingMaterialTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(289);
		}
		return supportingMaterialTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSupportingMaterialType_Attachment() {
        return (EReference)getSupportingMaterialType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSwidType() {
		if (swidTypeEClass == null) {
			swidTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(290);
		}
		return swidTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSwidType_Text() {
        return (EReference)getSwidType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSwidType_Url() {
        return (EAttribute)getSwidType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSwidType_Any() {
        return (EAttribute)getSwidType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSwidType_Name() {
        return (EAttribute)getSwidType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSwidType_Patch() {
        return (EAttribute)getSwidType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSwidType_TagId() {
        return (EAttribute)getSwidType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSwidType_TagVersion() {
        return (EAttribute)getSwidType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSwidType_Version() {
        return (EAttribute)getSwidType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTagsType() {
		if (tagsTypeEClass == null) {
			tagsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(291);
		}
		return tagsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagsType_Group() {
        return (EAttribute)getTagsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTagsType_Tag() {
        return (EAttribute)getTagsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTargetsType() {
		if (targetsTypeEClass == null) {
			targetsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(292);
		}
		return targetsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTargetsType_Organizations() {
        return (EReference)getTargetsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTargetsType_Components() {
        return (EReference)getTargetsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTargetsType_Services() {
        return (EReference)getTargetsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTargetType() {
		if (targetTypeEClass == null) {
			targetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(293);
		}
		return targetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTargetType_Ref() {
        return (EAttribute)getTargetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTargetType_Versions() {
        return (EReference)getTargetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTasksType() {
		if (tasksTypeEClass == null) {
			tasksTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(294);
		}
		return tasksTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTasksType_Task() {
        return (EReference)getTasksType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTasksType_Any() {
        return (EAttribute)getTasksType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTasksType_AnyAttribute() {
        return (EAttribute)getTasksType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskType() {
		if (taskTypeEClass == null) {
			taskTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(295);
		}
		return taskTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskType_Uid() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskType_Name() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskType_Description() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskType_ResourceReferences() {
        return (EReference)getTaskType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskType_TaskTypes() {
        return (EReference)getTaskType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskType_Trigger() {
        return (EReference)getTaskType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskType_Steps() {
        return (EReference)getTaskType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskType_Inputs() {
        return (EReference)getTaskType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskType_Outputs() {
        return (EReference)getTaskType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskType_TimeStart() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskType_TimeEnd() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskType_Workspaces() {
        return (EReference)getTaskType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskType_RuntimeTopology() {
        return (EReference)getTaskType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskType_Properties() {
        return (EReference)getTaskType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskType_Any() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskType_BomRef() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskType_AnyAttribute() {
        return (EAttribute)getTaskType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskTypesType() {
		if (taskTypesTypeEClass == null) {
			taskTypesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(298);
		}
		return taskTypesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskTypesType_TaskType() {
        return (EAttribute)getTaskTypesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskTypesType1() {
		if (taskTypesType1EClass == null) {
			taskTypesType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(299);
		}
		return taskTypesType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskTypesType1_TaskType() {
        return (EAttribute)getTaskTypesType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechnicalLimitationsType() {
		if (technicalLimitationsTypeEClass == null) {
			technicalLimitationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(300);
		}
		return technicalLimitationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTechnicalLimitationsType_TechnicalLimitation() {
        return (EAttribute)getTechnicalLimitationsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToolsType() {
		if (toolsTypeEClass == null) {
			toolsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(301);
		}
		return toolsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToolsType_Tool() {
        return (EReference)getToolsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToolsType1() {
		if (toolsType1EClass == null) {
			toolsType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(302);
		}
		return toolsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToolsType1_Group() {
        return (EAttribute)getToolsType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToolsType1_Tool() {
        return (EReference)getToolsType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToolsType1_Components() {
        return (EReference)getToolsType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToolsType1_Services() {
        return (EReference)getToolsType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToolsType2() {
		if (toolsType2EClass == null) {
			toolsType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(303);
		}
		return toolsType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToolsType2_Tool() {
        return (EReference)getToolsType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToolsType3() {
		if (toolsType3EClass == null) {
			toolsType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(304);
		}
		return toolsType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToolsType3_Group() {
        return (EAttribute)getToolsType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToolsType3_Tool() {
        return (EReference)getToolsType3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToolsType3_Components() {
        return (EReference)getToolsType3().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToolsType3_Services() {
        return (EReference)getToolsType3().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToolType() {
		if (toolTypeEClass == null) {
			toolTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(305);
		}
		return toolTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToolType_Vendor() {
        return (EAttribute)getToolType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToolType_Name() {
        return (EAttribute)getToolType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToolType_Version() {
        return (EAttribute)getToolType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToolType_Hashes() {
        return (EReference)getToolType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getToolType_ExternalReferences() {
        return (EReference)getToolType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToolType_Any() {
        return (EAttribute)getToolType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToolType_AnyAttribute() {
        return (EAttribute)getToolType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriggerType() {
		if (triggerTypeEClass == null) {
			triggerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(306);
		}
		return triggerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriggerType_Uid() {
        return (EAttribute)getTriggerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriggerType_Name() {
        return (EAttribute)getTriggerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriggerType_Description() {
        return (EAttribute)getTriggerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerType_ResourceReferences() {
        return (EReference)getTriggerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriggerType_Type() {
        return (EAttribute)getTriggerType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerType_Event() {
        return (EReference)getTriggerType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerType_Conditions() {
        return (EReference)getTriggerType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriggerType_TimeActivated() {
        return (EAttribute)getTriggerType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerType_Inputs() {
        return (EReference)getTriggerType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerType_Outputs() {
        return (EReference)getTriggerType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriggerType_Properties() {
        return (EReference)getTriggerType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriggerType_Any() {
        return (EAttribute)getTriggerType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriggerType_BomRef() {
        return (EAttribute)getTriggerType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriggerType_AnyAttribute() {
        return (EAttribute)getTriggerType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUseCasesType() {
		if (useCasesTypeEClass == null) {
			useCasesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(321);
		}
		return useCasesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUseCasesType_UseCase() {
        return (EAttribute)getUseCasesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUsersType() {
		if (usersTypeEClass == null) {
			usersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(322);
		}
		return usersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUsersType_User() {
        return (EAttribute)getUsersType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersionsType() {
		if (versionsTypeEClass == null) {
			versionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(324);
		}
		return versionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionsType_Group() {
        return (EAttribute)getVersionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVersionsType_Version() {
        return (EReference)getVersionsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersionType() {
		if (versionTypeEClass == null) {
			versionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(325);
		}
		return versionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionType_Version() {
        return (EAttribute)getVersionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionType_Range() {
        return (EAttribute)getVersionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionType_Status() {
        return (EAttribute)getVersionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVolumeType() {
		if (volumeTypeEClass == null) {
			volumeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(329);
		}
		return volumeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolumeType_Uid() {
        return (EAttribute)getVolumeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolumeType_Name() {
        return (EAttribute)getVolumeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolumeType_Mode() {
        return (EAttribute)getVolumeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolumeType_Path() {
        return (EAttribute)getVolumeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolumeType_SizeAllocated() {
        return (EAttribute)getVolumeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolumeType_Persistent() {
        return (EAttribute)getVolumeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVolumeType_Remote() {
        return (EAttribute)getVolumeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVolumeType_Properties() {
        return (EReference)getVolumeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVulnerabilitiesType() {
		if (vulnerabilitiesTypeEClass == null) {
			vulnerabilitiesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(330);
		}
		return vulnerabilitiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVulnerabilitiesType_Group() {
        return (EAttribute)getVulnerabilitiesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVulnerabilitiesType_Vulnerability() {
        return (EReference)getVulnerabilitiesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVulnerabilitiesType_Any() {
        return (EAttribute)getVulnerabilitiesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVulnerabilitiesType_AnyAttribute() {
        return (EAttribute)getVulnerabilitiesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVulnerabilitiesType1() {
		if (vulnerabilitiesType1EClass == null) {
			vulnerabilitiesType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(331);
		}
		return vulnerabilitiesType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVulnerabilitiesType1_Group() {
        return (EAttribute)getVulnerabilitiesType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVulnerabilitiesType1_Vulnerability() {
        return (EReference)getVulnerabilitiesType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVulnerabilitiesType1_Any() {
        return (EAttribute)getVulnerabilitiesType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVulnerabilitySourceType() {
		if (vulnerabilitySourceTypeEClass == null) {
			vulnerabilitySourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(332);
		}
		return vulnerabilitySourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVulnerabilitySourceType_Group() {
        return (EAttribute)getVulnerabilitySourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVulnerabilitySourceType_Name() {
        return (EAttribute)getVulnerabilitySourceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVulnerabilitySourceType_Url() {
        return (EAttribute)getVulnerabilitySourceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVulnerabilityType() {
		if (vulnerabilityTypeEClass == null) {
			vulnerabilityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(333);
		}
		return vulnerabilityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVulnerabilityType_Id() {
        return (EAttribute)getVulnerabilityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVulnerabilityType_Source() {
        return (EReference)getVulnerabilityType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVulnerabilityType_References() {
        return (EReference)getVulnerabilityType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVulnerabilityType_Ratings() {
        return (EReference)getVulnerabilityType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVulnerabilityType_Cwes() {
        return (EReference)getVulnerabilityType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVulnerabilityType_Description() {
        return (EAttribute)getVulnerabilityType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVulnerabilityType_Detail() {
        return (EAttribute)getVulnerabilityType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVulnerabilityType_Recommendation() {
        return (EAttribute)getVulnerabilityType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVulnerabilityType_Workaround() {
        return (EAttribute)getVulnerabilityType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVulnerabilityType_ProofOfConcept() {
        return (EReference)getVulnerabilityType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVulnerabilityType_Advisories() {
        return (EReference)getVulnerabilityType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVulnerabilityType_Created() {
        return (EAttribute)getVulnerabilityType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVulnerabilityType_Published() {
        return (EAttribute)getVulnerabilityType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVulnerabilityType_Updated() {
        return (EAttribute)getVulnerabilityType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVulnerabilityType_Rejected() {
        return (EAttribute)getVulnerabilityType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVulnerabilityType_Credits() {
        return (EReference)getVulnerabilityType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVulnerabilityType_Tools() {
        return (EReference)getVulnerabilityType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVulnerabilityType_Analysis() {
        return (EReference)getVulnerabilityType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVulnerabilityType_Affects() {
        return (EReference)getVulnerabilityType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVulnerabilityType_Properties() {
        return (EReference)getVulnerabilityType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVulnerabilityType_BomRef() {
        return (EAttribute)getVulnerabilityType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkflowsType() {
		if (workflowsTypeEClass == null) {
			workflowsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(334);
		}
		return workflowsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowsType_Workflow() {
        return (EReference)getWorkflowsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkflowsType_Any() {
        return (EAttribute)getWorkflowsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkflowsType_AnyAttribute() {
        return (EAttribute)getWorkflowsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkflowType() {
		if (workflowTypeEClass == null) {
			workflowTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(335);
		}
		return workflowTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkflowType_Uid() {
        return (EAttribute)getWorkflowType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkflowType_Name() {
        return (EAttribute)getWorkflowType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkflowType_Description() {
        return (EAttribute)getWorkflowType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowType_ResourceReferences() {
        return (EReference)getWorkflowType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowType_Tasks() {
        return (EReference)getWorkflowType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowType_TaskDependencies() {
        return (EReference)getWorkflowType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowType_TaskTypes() {
        return (EReference)getWorkflowType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowType_Trigger() {
        return (EReference)getWorkflowType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowType_Steps() {
        return (EReference)getWorkflowType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowType_Inputs() {
        return (EReference)getWorkflowType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowType_Outputs() {
        return (EReference)getWorkflowType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkflowType_TimeStart() {
        return (EAttribute)getWorkflowType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkflowType_TimeEnd() {
        return (EAttribute)getWorkflowType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowType_Workspaces() {
        return (EReference)getWorkflowType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowType_RuntimeTopology() {
        return (EReference)getWorkflowType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkflowType_Properties() {
        return (EReference)getWorkflowType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkflowType_Any() {
        return (EAttribute)getWorkflowType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkflowType_BomRef() {
        return (EAttribute)getWorkflowType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkflowType_AnyAttribute() {
        return (EAttribute)getWorkflowType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkspacesType() {
		if (workspacesTypeEClass == null) {
			workspacesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(336);
		}
		return workspacesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkspacesType_Workspace() {
        return (EReference)getWorkspacesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkspacesType_Any() {
        return (EAttribute)getWorkspacesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkspacesType_AnyAttribute() {
        return (EAttribute)getWorkspacesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorkspaceType() {
		if (workspaceTypeEClass == null) {
			workspaceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(337);
		}
		return workspaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkspaceType_Group() {
        return (EAttribute)getWorkspaceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkspaceType_Uid() {
        return (EAttribute)getWorkspaceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkspaceType_Name() {
        return (EAttribute)getWorkspaceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkspaceType_Aliases() {
        return (EReference)getWorkspaceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkspaceType_Description() {
        return (EAttribute)getWorkspaceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkspaceType_ResourceReferences() {
        return (EReference)getWorkspaceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkspaceType_AccessMode() {
        return (EAttribute)getWorkspaceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkspaceType_MountPath() {
        return (EAttribute)getWorkspaceType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkspaceType_ManagedDataType() {
        return (EAttribute)getWorkspaceType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkspaceType_VolumeRequest() {
        return (EAttribute)getWorkspaceType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkspaceType_Volume() {
        return (EReference)getWorkspaceType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWorkspaceType_Properties() {
        return (EReference)getWorkspaceType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkspaceType_Any() {
        return (EAttribute)getWorkspaceType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkspaceType_BomRef() {
        return (EAttribute)getWorkspaceType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorkspaceType_AnyAttribute() {
        return (EAttribute)getWorkspaceType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAccessModeEnum() {
		if (accessModeEnumEEnum == null) {
			accessModeEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(0);
		}
		return accessModeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getActivityType() {
		if (activityTypeEEnum == null) {
			activityTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(2);
		}
		return activityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAggregateType() {
		if (aggregateTypeEEnum == null) {
			aggregateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(8);
		}
		return aggregateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAssetTypeType() {
		if (assetTypeTypeEEnum == null) {
			assetTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(23);
		}
		return assetTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCertificationLevelType() {
		if (certificationLevelTypeEEnum == null) {
			certificationLevelTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(37);
		}
		return certificationLevelTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getClassification() {
		if (classificationEEnum == null) {
			classificationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(45);
		}
		return classificationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComponentDataTypeEnumeration() {
		if (componentDataTypeEnumerationEEnum == null) {
			componentDataTypeEnumerationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(56);
		}
		return componentDataTypeEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCryptoFunctionType() {
		if (cryptoFunctionTypeEEnum == null) {
			cryptoFunctionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(77);
		}
		return cryptoFunctionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataFlowType1() {
		if (dataFlowType1EEnum == null) {
			dataFlowType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(84);
		}
		return dataFlowType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEncoding() {
		if (encodingEEnum == null) {
			encodingEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(100);
		}
		return encodingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEnergySourceType() {
		if (energySourceTypeEEnum == null) {
			energySourceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(107);
		}
		return energySourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEvidenceTechnique() {
		if (evidenceTechniqueEEnum == null) {
			evidenceTechniqueEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(115);
		}
		return evidenceTechniqueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExecutionEnvironmentType() {
		if (executionEnvironmentTypeEEnum == null) {
			executionEnvironmentTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(119);
		}
		return executionEnvironmentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExternalReferenceType() {
		if (externalReferenceTypeEEnum == null) {
			externalReferenceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(124);
		}
		return externalReferenceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getHashAlg() {
		if (hashAlgEEnum == null) {
			hashAlgEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(136);
		}
		return hashAlgEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIdentityFieldType() {
		if (identityFieldTypeEEnum == null) {
			identityFieldTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(145);
		}
		return identityFieldTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImpactAnalysisAffectedStatusType() {
		if (impactAnalysisAffectedStatusTypeEEnum == null) {
			impactAnalysisAffectedStatusTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(149);
		}
		return impactAnalysisAffectedStatusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImpactAnalysisJustificationType() {
		if (impactAnalysisJustificationTypeEEnum == null) {
			impactAnalysisJustificationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(151);
		}
		return impactAnalysisJustificationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImpactAnalysisResponsesType() {
		if (impactAnalysisResponsesTypeEEnum == null) {
			impactAnalysisResponsesTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(153);
		}
		return impactAnalysisResponsesTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImpactAnalysisStateType() {
		if (impactAnalysisStateTypeEEnum == null) {
			impactAnalysisStateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(155);
		}
		return impactAnalysisStateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImplementationPlatformType() {
		if (implementationPlatformTypeEEnum == null) {
			implementationPlatformTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(157);
		}
		return implementationPlatformTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIssueClassification() {
		if (issueClassificationEEnum == null) {
			issueClassificationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(166);
		}
		return issueClassificationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLicenseAcknowledgementEnumerationType() {
		if (licenseAcknowledgementEnumerationTypeEEnum == null) {
			licenseAcknowledgementEnumerationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(171);
		}
		return licenseAcknowledgementEnumerationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLicenseTypeEnum() {
		if (licenseTypeEnumEEnum == null) {
			licenseTypeEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(176);
		}
		return licenseTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLifecyclePhaseType() {
		if (lifecyclePhaseTypeEEnum == null) {
			lifecyclePhaseTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(181);
		}
		return lifecyclePhaseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMachineLearningApproachType() {
		if (machineLearningApproachTypeEEnum == null) {
			machineLearningApproachTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(186);
		}
		return machineLearningApproachTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getModeType() {
		if (modeTypeEEnum == null) {
			modeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(197);
		}
		return modeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOutputTypeEnum() {
		if (outputTypeEnumEEnum == null) {
			outputTypeEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(216);
		}
		return outputTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPaddingType() {
		if (paddingTypeEEnum == null) {
			paddingTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(219);
		}
		return paddingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPatchClassification() {
		if (patchClassificationEEnum == null) {
			patchClassificationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(224);
		}
		return patchClassificationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPrimitiveType() {
		if (primitiveTypeEEnum == null) {
			primitiveTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(233);
		}
		return primitiveTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getScope() {
		if (scopeEEnum == null) {
			scopeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(263);
		}
		return scopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getScoreSourceType() {
		if (scoreSourceTypeEEnum == null) {
			scoreSourceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(265);
		}
		return scoreSourceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSeverityType() {
		if (severityTypeEEnum == null) {
			severityTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(274);
		}
		return severityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStateType() {
		if (stateTypeEEnum == null) {
			stateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(282);
		}
		return stateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTaskTypeEnum() {
		if (taskTypeEnumEEnum == null) {
			taskTypeEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(296);
		}
		return taskTypeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTriggerTypeType() {
		if (triggerTypeTypeEEnum == null) {
			triggerTypeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(307);
		}
		return triggerTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeType() {
		if (typeTypeEEnum == null) {
			typeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(309);
		}
		return typeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTypeType1() {
		if (typeType1EEnum == null) {
			typeType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(310);
		}
		return typeType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnitType() {
		if (unitTypeEEnum == null) {
			unitTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(313);
		}
		return unitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUnitType1() {
		if (unitType1EEnum == null) {
			unitType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(314);
		}
		return unitType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVolumeModeEnum() {
		if (volumeModeEnumEEnum == null) {
			volumeModeEnumEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(327);
		}
		return volumeModeEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAccessModeEnumObject() {
		if (accessModeEnumObjectEDataType == null) {
			accessModeEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(1);
		}
		return accessModeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getActivityTypeObject() {
		if (activityTypeObjectEDataType == null) {
			activityTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(3);
		}
		return activityTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAggregateTypeObject() {
		if (aggregateTypeObjectEDataType == null) {
			aggregateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(9);
		}
		return aggregateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAssetTypeTypeObject() {
		if (assetTypeTypeObjectEDataType == null) {
			assetTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(24);
		}
		return assetTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBomLinkDocumentType() {
		if (bomLinkDocumentTypeEDataType == null) {
			bomLinkDocumentTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(30);
		}
		return bomLinkDocumentTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBomLinkElementType() {
		if (bomLinkElementTypeEDataType == null) {
			bomLinkElementTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(31);
		}
		return bomLinkElementTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBomLinkType() {
		if (bomLinkTypeEDataType == null) {
			bomLinkTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(32);
		}
		return bomLinkTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCertificationLevelTypeObject() {
		if (certificationLevelTypeObjectEDataType == null) {
			certificationLevelTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(38);
		}
		return certificationLevelTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getClassicalSecurityLevelType() {
		if (classicalSecurityLevelTypeEDataType == null) {
			classicalSecurityLevelTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(44);
		}
		return classicalSecurityLevelTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getClassificationObject() {
		if (classificationObjectEDataType == null) {
			classificationObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(46);
		}
		return classificationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getComponentDataTypeEnumerationObject() {
		if (componentDataTypeEnumerationObjectEDataType == null) {
			componentDataTypeEnumerationObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(57);
		}
		return componentDataTypeEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCpe() {
		if (cpeEDataType == null) {
			cpeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(74);
		}
		return cpeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCryptoFunctionTypeObject() {
		if (cryptoFunctionTypeObjectEDataType == null) {
			cryptoFunctionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(78);
		}
		return cryptoFunctionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDataFlowTypeObject() {
		if (dataFlowTypeObjectEDataType == null) {
			dataFlowTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(85);
		}
		return dataFlowTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDecimalPercentType() {
		if (decimalPercentTypeEDataType == null) {
			decimalPercentTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(90);
		}
		return decimalPercentTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEncodingObject() {
		if (encodingObjectEDataType == null) {
			encodingObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(101);
		}
		return encodingObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEnergySourceTypeObject() {
		if (energySourceTypeObjectEDataType == null) {
			energySourceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(108);
		}
		return energySourceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEvidenceTechniqueObject() {
		if (evidenceTechniqueObjectEDataType == null) {
			evidenceTechniqueObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(116);
		}
		return evidenceTechniqueObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getExecutionEnvironmentTypeObject() {
		if (executionEnvironmentTypeObjectEDataType == null) {
			executionEnvironmentTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(120);
		}
		return executionEnvironmentTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getExternalReferenceTypeObject() {
		if (externalReferenceTypeObjectEDataType == null) {
			externalReferenceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(125);
		}
		return externalReferenceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getHashAlgObject() {
		if (hashAlgObjectEDataType == null) {
			hashAlgObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(137);
		}
		return hashAlgObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getHashValue() {
		if (hashValueEDataType == null) {
			hashValueEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(142);
		}
		return hashValueEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIdentityFieldTypeObject() {
		if (identityFieldTypeObjectEDataType == null) {
			identityFieldTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(146);
		}
		return identityFieldTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getImpactAnalysisAffectedStatusTypeObject() {
		if (impactAnalysisAffectedStatusTypeObjectEDataType == null) {
			impactAnalysisAffectedStatusTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(150);
		}
		return impactAnalysisAffectedStatusTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getImpactAnalysisJustificationTypeObject() {
		if (impactAnalysisJustificationTypeObjectEDataType == null) {
			impactAnalysisJustificationTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(152);
		}
		return impactAnalysisJustificationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getImpactAnalysisResponsesTypeObject() {
		if (impactAnalysisResponsesTypeObjectEDataType == null) {
			impactAnalysisResponsesTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(154);
		}
		return impactAnalysisResponsesTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getImpactAnalysisStateTypeObject() {
		if (impactAnalysisStateTypeObjectEDataType == null) {
			impactAnalysisStateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(156);
		}
		return impactAnalysisStateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getImplementationPlatformTypeObject() {
		if (implementationPlatformTypeObjectEDataType == null) {
			implementationPlatformTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(158);
		}
		return implementationPlatformTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIssueClassificationObject() {
		if (issueClassificationObjectEDataType == null) {
			issueClassificationObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(167);
		}
		return issueClassificationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLicenseAcknowledgementEnumerationTypeObject() {
		if (licenseAcknowledgementEnumerationTypeObjectEDataType == null) {
			licenseAcknowledgementEnumerationTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(172);
		}
		return licenseAcknowledgementEnumerationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLicenseTypeEnumObject() {
		if (licenseTypeEnumObjectEDataType == null) {
			licenseTypeEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(177);
		}
		return licenseTypeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLifecyclePhaseTypeObject() {
		if (lifecyclePhaseTypeObjectEDataType == null) {
			lifecyclePhaseTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(182);
		}
		return lifecyclePhaseTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLocaleType() {
		if (localeTypeEDataType == null) {
			localeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(185);
		}
		return localeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMachineLearningApproachTypeObject() {
		if (machineLearningApproachTypeObjectEDataType == null) {
			machineLearningApproachTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(187);
		}
		return machineLearningApproachTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMimeType() {
		if (mimeTypeEDataType == null) {
			mimeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(192);
		}
		return mimeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getModeTypeObject() {
		if (modeTypeObjectEDataType == null) {
			modeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(198);
		}
		return modeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNistQuantumSecurityLevelType() {
		if (nistQuantumSecurityLevelTypeEDataType == null) {
			nistQuantumSecurityLevelTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(199);
		}
		return nistQuantumSecurityLevelTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOpenCreType() {
		if (openCreTypeEDataType == null) {
			openCreTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(204);
		}
		return openCreTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOutputTypeEnumObject() {
		if (outputTypeEnumObjectEDataType == null) {
			outputTypeEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(217);
		}
		return outputTypeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPaddingTypeObject() {
		if (paddingTypeObjectEDataType == null) {
			paddingTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(220);
		}
		return paddingTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPatchClassificationObject() {
		if (patchClassificationObjectEDataType == null) {
			patchClassificationObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(225);
		}
		return patchClassificationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPrimitiveTypeObject() {
		if (primitiveTypeObjectEDataType == null) {
			primitiveTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(234);
		}
		return primitiveTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRefLinkType() {
		if (refLinkTypeEDataType == null) {
			refLinkTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(247);
		}
		return refLinkTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRefType() {
		if (refTypeEDataType == null) {
			refTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(248);
		}
		return refTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRefType1() {
		if (refType1EDataType == null) {
			refType1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(249);
		}
		return refType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRefType2() {
		if (refType2EDataType == null) {
			refType2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(250);
		}
		return refType2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRefType3() {
		if (refType3EDataType == null) {
			refType3EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(251);
		}
		return refType3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRefType4() {
		if (refType4EDataType == null) {
			refType4EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(252);
		}
		return refType4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getScopeObject() {
		if (scopeObjectEDataType == null) {
			scopeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(264);
		}
		return scopeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getScoreSourceTypeObject() {
		if (scoreSourceTypeObjectEDataType == null) {
			scoreSourceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(266);
		}
		return scoreSourceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getScoreType() {
		if (scoreTypeEDataType == null) {
			scoreTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(267);
		}
		return scoreTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getScoreType1() {
		if (scoreType1EDataType == null) {
			scoreType1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(268);
		}
		return scoreType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSeverityTypeObject() {
		if (severityTypeObjectEDataType == null) {
			severityTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(275);
		}
		return severityTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getStateTypeObject() {
		if (stateTypeObjectEDataType == null) {
			stateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(283);
		}
		return stateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTaskTypeEnumObject() {
		if (taskTypeEnumObjectEDataType == null) {
			taskTypeEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(297);
		}
		return taskTypeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTriggerTypeTypeObject() {
		if (triggerTypeTypeObjectEDataType == null) {
			triggerTypeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(308);
		}
		return triggerTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTypeTypeObject() {
		if (typeTypeObjectEDataType == null) {
			typeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(311);
		}
		return typeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTypeTypeObject1() {
		if (typeTypeObject1EDataType == null) {
			typeTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(312);
		}
		return typeTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUnitTypeObject() {
		if (unitTypeObjectEDataType == null) {
			unitTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(315);
		}
		return unitTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUnitTypeObject1() {
		if (unitTypeObject1EDataType == null) {
			unitTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(316);
		}
		return unitTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUrlType() {
		if (urlTypeEDataType == null) {
			urlTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(317);
		}
		return urlTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUrlType1() {
		if (urlType1EDataType == null) {
			urlType1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(318);
		}
		return urlType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUrlType2() {
		if (urlType2EDataType == null) {
			urlType2EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(319);
		}
		return urlType2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUrnUuid() {
		if (urnUuidEDataType == null) {
			urnUuidEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(320);
		}
		return urnUuidEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVersionRangeType() {
		if (versionRangeTypeEDataType == null) {
			versionRangeTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(323);
		}
		return versionRangeTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVersionType1() {
		if (versionType1EDataType == null) {
			versionType1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(326);
		}
		return versionType1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVolumeModeEnumObject() {
		if (volumeModeEnumObjectEDataType == null) {
			volumeModeEnumObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(BOMPackage.eNS_URI).getEClassifiers().get(328);
		}
		return volumeModeEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BOMFactory getBOMFactory() {
		return (BOMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Loads the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.cyclonedx.schema.bom." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //BOMPackageImpl
