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
package org.omg.spec.cmmn.casemodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.omg.spec.cmmn.casemodel.CaseFileItemTransition;
import org.omg.spec.cmmn.casemodel.CaseModelFactory;
import org.omg.spec.cmmn.casemodel.CaseModelPackage;
import org.omg.spec.cmmn.casemodel.CaseModelRoot;
import org.omg.spec.cmmn.casemodel.DecisionTypeEnumMember1;
import org.omg.spec.cmmn.casemodel.DefinitionTypeEnumMember1;
import org.omg.spec.cmmn.casemodel.MultiplicityEnum;
import org.omg.spec.cmmn.casemodel.PlanItemTransition;
import org.omg.spec.cmmn.casemodel.ProcessTypeEnumMember1;
import org.omg.spec.cmmn.casemodel.PropertyTypeEnumMember1;
import org.omg.spec.cmmn.casemodel.TApplicabilityRule;
import org.omg.spec.cmmn.casemodel.TArtifact;
import org.omg.spec.cmmn.casemodel.TAssociation;
import org.omg.spec.cmmn.casemodel.TAssociationDirection;
import org.omg.spec.cmmn.casemodel.TCase;
import org.omg.spec.cmmn.casemodel.TCaseFile;
import org.omg.spec.cmmn.casemodel.TCaseFileItem;
import org.omg.spec.cmmn.casemodel.TCaseFileItemDefinition;
import org.omg.spec.cmmn.casemodel.TCaseFileItemOnPart;
import org.omg.spec.cmmn.casemodel.TCaseFileItemStartTrigger;
import org.omg.spec.cmmn.casemodel.TCaseParameter;
import org.omg.spec.cmmn.casemodel.TCaseRoles;
import org.omg.spec.cmmn.casemodel.TCaseTask;
import org.omg.spec.cmmn.casemodel.TChildren;
import org.omg.spec.cmmn.casemodel.TCmmnElement;
import org.omg.spec.cmmn.casemodel.TCmmnElementWithMixedContent;
import org.omg.spec.cmmn.casemodel.TCriterion;
import org.omg.spec.cmmn.casemodel.TDecision;
import org.omg.spec.cmmn.casemodel.TDecisionParameter;
import org.omg.spec.cmmn.casemodel.TDecisionTask;
import org.omg.spec.cmmn.casemodel.TDefinitions;
import org.omg.spec.cmmn.casemodel.TDiscretionaryItem;
import org.omg.spec.cmmn.casemodel.TDocumentation;
import org.omg.spec.cmmn.casemodel.TEntryCriterion;
import org.omg.spec.cmmn.casemodel.TEventListener;
import org.omg.spec.cmmn.casemodel.TExitCriterion;
import org.omg.spec.cmmn.casemodel.TExpression;
import org.omg.spec.cmmn.casemodel.TExtensionElements;
import org.omg.spec.cmmn.casemodel.THumanTask;
import org.omg.spec.cmmn.casemodel.TIfPart;
import org.omg.spec.cmmn.casemodel.TImport;
import org.omg.spec.cmmn.casemodel.TManualActivationRule;
import org.omg.spec.cmmn.casemodel.TMilestone;
import org.omg.spec.cmmn.casemodel.TOnPart;
import org.omg.spec.cmmn.casemodel.TParameter;
import org.omg.spec.cmmn.casemodel.TParameterMapping;
import org.omg.spec.cmmn.casemodel.TPlanFragment;
import org.omg.spec.cmmn.casemodel.TPlanItem;
import org.omg.spec.cmmn.casemodel.TPlanItemControl;
import org.omg.spec.cmmn.casemodel.TPlanItemDefinition;
import org.omg.spec.cmmn.casemodel.TPlanItemOnPart;
import org.omg.spec.cmmn.casemodel.TPlanItemStartTrigger;
import org.omg.spec.cmmn.casemodel.TPlanningTable;
import org.omg.spec.cmmn.casemodel.TProcess;
import org.omg.spec.cmmn.casemodel.TProcessParameter;
import org.omg.spec.cmmn.casemodel.TProcessTask;
import org.omg.spec.cmmn.casemodel.TProperty;
import org.omg.spec.cmmn.casemodel.TRelationship;
import org.omg.spec.cmmn.casemodel.TRelationshipDirection;
import org.omg.spec.cmmn.casemodel.TRepetitionRule;
import org.omg.spec.cmmn.casemodel.TRequiredRule;
import org.omg.spec.cmmn.casemodel.TRole;
import org.omg.spec.cmmn.casemodel.TSentry;
import org.omg.spec.cmmn.casemodel.TStage;
import org.omg.spec.cmmn.casemodel.TStartTrigger;
import org.omg.spec.cmmn.casemodel.TTableItem;
import org.omg.spec.cmmn.casemodel.TTask;
import org.omg.spec.cmmn.casemodel.TTextAnnotation;
import org.omg.spec.cmmn.casemodel.TTimerEventListener;
import org.omg.spec.cmmn.casemodel.TUserEventListener;

import org.omg.spec.cmmn.casemodel.util.CaseModelValidator;

import org.omg.spec.cmmn.cmmndi.CMMNDIPackage;

import org.omg.spec.cmmn.cmmndi.impl.CMMNDIPackageImpl;

import org.omg.spec.cmmn.dc.DCPackage;

import org.omg.spec.cmmn.dc.impl.DCPackageImpl;

import org.omg.spec.cmmn.di.DIPackage;

import org.omg.spec.cmmn.di.impl.DIPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CaseModelPackageImpl extends EPackageImpl implements CaseModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseModelRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tApplicabilityRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tCaseFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tCaseFileItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tCaseFileItemDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tCaseFileItemOnPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tCaseFileItemStartTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tCaseParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tCaseRolesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tCaseTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tChildrenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tCmmnElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tCmmnElementWithMixedContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDecisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDecisionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDecisionTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDiscretionaryItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tEntryCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tEventListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tExitCriterionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tExtensionElementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tHumanTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tIfPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tManualActivationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tMilestoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tOnPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tParameterMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPlanFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPlanItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPlanItemControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPlanItemDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPlanItemOnPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPlanItemStartTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPlanningTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tProcessParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tProcessTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tRepetitionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tRequiredRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tSentryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tStageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tStartTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTableItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTextAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tTimerEventListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tUserEventListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum caseFileItemTransitionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum decisionTypeEnumMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum definitionTypeEnumMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiplicityEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum planItemTransitionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processTypeEnumMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyTypeEnumMember1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tAssociationDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tRelationshipDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType caseFileItemTransitionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType decisionTypeEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType decisionTypeEnumMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType definitionTypeEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType definitionTypeEnumMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType multiplicityEnumObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType planItemTransitionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType processTypeEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType processTypeEnumMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyTypeEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyTypeEnumMember1ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tAssociationDirectionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tRelationshipDirectionObjectEDataType = null;

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
	 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CaseModelPackageImpl() {
		super(eNS_URI, CaseModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CaseModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CaseModelPackage init() {
		if (isInited) return (CaseModelPackage)EPackage.Registry.INSTANCE.getEPackage(CaseModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCaseModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CaseModelPackageImpl theCaseModelPackage = registeredCaseModelPackage instanceof CaseModelPackageImpl ? (CaseModelPackageImpl)registeredCaseModelPackage : new CaseModelPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DCPackage.eNS_URI);
		DCPackageImpl theDCPackage = (DCPackageImpl)(registeredPackage instanceof DCPackageImpl ? registeredPackage : DCPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CMMNDIPackage.eNS_URI);
		CMMNDIPackageImpl theCMMNDIPackage = (CMMNDIPackageImpl)(registeredPackage instanceof CMMNDIPackageImpl ? registeredPackage : CMMNDIPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DIPackage.eNS_URI);
		DIPackageImpl theDIPackage = (DIPackageImpl)(registeredPackage instanceof DIPackageImpl ? registeredPackage : DIPackage.eINSTANCE);

		// Create package meta-data objects
		theCaseModelPackage.createPackageContents();
		theDCPackage.createPackageContents();
		theCMMNDIPackage.createPackageContents();
		theDIPackage.createPackageContents();

		// Initialize created meta-data
		theCaseModelPackage.initializePackageContents();
		theDCPackage.initializePackageContents();
		theCMMNDIPackage.initializePackageContents();
		theDIPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCaseModelPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return CaseModelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCaseModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CaseModelPackage.eNS_URI, theCaseModelPackage);
		return theCaseModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCaseModelRoot() {
		return caseModelRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCaseModelRoot_Mixed() {
		return (EAttribute)caseModelRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_XMLNSPrefixMap() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_XSISchemaLocation() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_ApplicabilityRule() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_Artifact() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_Association() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_Case() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_CaseFile() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_CaseFileItem() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_CaseFileItemDefinition() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_CaseFileItemOnPart() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_OnPart() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_CaseFileItemStartTrigger() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_TimerStart() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_CaseParameter() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_Parameter() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_CaseTask() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_Task() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_PlanItemDefinition() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_Decision() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_DecisionParameter() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_DecisionTask() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_Definitions() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_DiscretionaryItem() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_TableItem() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_Documentation() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_EntryCriterion() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_EventListener() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_ExitCriterion() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_Expression() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_ExtensionElements() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_HumanTask() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_IfPart() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_Import() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_ManualActivationRule() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_Milestone() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_ParameterMapping() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_PlanFragment() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_PlanItem() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_PlanItemControl() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_PlanItemOnPart() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_PlanItemStartTrigger() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_PlanningTable() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_Process() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_ProcessParameter() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_ProcessTask() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_Property() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_Relationship() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_RepetitionRule() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_RequiredRule() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_Role() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_Sentry() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_Stage() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_TextAnnotation() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_TimerEventListener() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaseModelRoot_UserEventListener() {
		return (EReference)caseModelRootEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTApplicabilityRule() {
		return tApplicabilityRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTApplicabilityRule_Condition() {
		return (EReference)tApplicabilityRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTApplicabilityRule_ContextRef() {
		return (EAttribute)tApplicabilityRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTApplicabilityRule_Name() {
		return (EAttribute)tApplicabilityRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTArtifact() {
		return tArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTAssociation() {
		return tAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTAssociation_AssociationDirection() {
		return (EAttribute)tAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTAssociation_SourceRef() {
		return (EAttribute)tAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTAssociation_TargetRef() {
		return (EAttribute)tAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTCase() {
		return tCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCase_CaseFileModel() {
		return (EReference)tCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCase_CasePlanModel() {
		return (EReference)tCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCase_CaseRoles() {
		return (EReference)tCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCase_Input() {
		return (EReference)tCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCase_Output() {
		return (EReference)tCaseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCase_Name() {
		return (EAttribute)tCaseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTCaseFile() {
		return tCaseFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCaseFile_CaseFileItem() {
		return (EReference)tCaseFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTCaseFileItem() {
		return tCaseFileItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCaseFileItem_Children() {
		return (EReference)tCaseFileItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCaseFileItem_DefinitionRef() {
		return (EAttribute)tCaseFileItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCaseFileItem_Multiplicity() {
		return (EAttribute)tCaseFileItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCaseFileItem_Name() {
		return (EAttribute)tCaseFileItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCaseFileItem_SourceRef() {
		return (EAttribute)tCaseFileItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCaseFileItem_TargetRefs() {
		return (EAttribute)tCaseFileItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTCaseFileItemDefinition() {
		return tCaseFileItemDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCaseFileItemDefinition_Property() {
		return (EReference)tCaseFileItemDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCaseFileItemDefinition_DefinitionType() {
		return (EAttribute)tCaseFileItemDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCaseFileItemDefinition_ImportRef() {
		return (EAttribute)tCaseFileItemDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCaseFileItemDefinition_Name() {
		return (EAttribute)tCaseFileItemDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCaseFileItemDefinition_StructureRef() {
		return (EAttribute)tCaseFileItemDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTCaseFileItemOnPart() {
		return tCaseFileItemOnPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCaseFileItemOnPart_StandardEvent() {
		return (EAttribute)tCaseFileItemOnPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCaseFileItemOnPart_SourceRef() {
		return (EAttribute)tCaseFileItemOnPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTCaseFileItemStartTrigger() {
		return tCaseFileItemStartTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCaseFileItemStartTrigger_StandardEvent() {
		return (EAttribute)tCaseFileItemStartTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCaseFileItemStartTrigger_SourceRef() {
		return (EAttribute)tCaseFileItemStartTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTCaseParameter() {
		return tCaseParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCaseParameter_BindingRefinement() {
		return (EReference)tCaseParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCaseParameter_BindingRef() {
		return (EAttribute)tCaseParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTCaseRoles() {
		return tCaseRolesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCaseRoles_Role() {
		return (EReference)tCaseRolesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTCaseTask() {
		return tCaseTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCaseTask_ParameterMapping() {
		return (EReference)tCaseTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCaseTask_CaseRefExpression() {
		return (EReference)tCaseTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCaseTask_CaseRef() {
		return (EAttribute)tCaseTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTChildren() {
		return tChildrenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTChildren_CaseFileItem() {
		return (EReference)tChildrenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTCmmnElement() {
		return tCmmnElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCmmnElement_Documentation() {
		return (EReference)tCmmnElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCmmnElement_ExtensionElements() {
		return (EReference)tCmmnElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCmmnElement_Id() {
		return (EAttribute)tCmmnElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCmmnElement_AnyAttribute() {
		return (EAttribute)tCmmnElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTCmmnElementWithMixedContent() {
		return tCmmnElementWithMixedContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCmmnElementWithMixedContent_Mixed() {
		return (EAttribute)tCmmnElementWithMixedContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCmmnElementWithMixedContent_Documentation() {
		return (EReference)tCmmnElementWithMixedContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTCmmnElementWithMixedContent_ExtensionElements() {
		return (EReference)tCmmnElementWithMixedContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCmmnElementWithMixedContent_Id() {
		return (EAttribute)tCmmnElementWithMixedContentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCmmnElementWithMixedContent_AnyAttribute() {
		return (EAttribute)tCmmnElementWithMixedContentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTCriterion() {
		return tCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCriterion_Name() {
		return (EAttribute)tCriterionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTCriterion_SentryRef() {
		return (EAttribute)tCriterionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTDecision() {
		return tDecisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecision_Input() {
		return (EReference)tDecisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecision_Output() {
		return (EReference)tDecisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDecision_ExternalRef() {
		return (EAttribute)tDecisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDecision_ImplementationType() {
		return (EAttribute)tDecisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDecision_Name() {
		return (EAttribute)tDecisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTDecisionParameter() {
		return tDecisionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTDecisionTask() {
		return tDecisionTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecisionTask_ParameterMapping() {
		return (EReference)tDecisionTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDecisionTask_DecisionRefExpression() {
		return (EReference)tDecisionTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDecisionTask_DecisionRef() {
		return (EAttribute)tDecisionTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTDefinitions() {
		return tDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDefinitions_Import() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDefinitions_CaseFileItemDefinition() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDefinitions_Case() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDefinitions_Process() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDefinitions_Decision() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDefinitions_ExtensionElements() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDefinitions_Relationship() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDefinitions_ArtifactGroup() {
		return (EAttribute)tDefinitionsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDefinitions_Artifact() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDefinitions_CMMNDI() {
		return (EReference)tDefinitionsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDefinitions_Author() {
		return (EAttribute)tDefinitionsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDefinitions_CreationDate() {
		return (EAttribute)tDefinitionsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDefinitions_Exporter() {
		return (EAttribute)tDefinitionsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDefinitions_ExporterVersion() {
		return (EAttribute)tDefinitionsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDefinitions_ExpressionLanguage() {
		return (EAttribute)tDefinitionsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDefinitions_Id() {
		return (EAttribute)tDefinitionsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDefinitions_Name() {
		return (EAttribute)tDefinitionsEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDefinitions_TargetNamespace() {
		return (EAttribute)tDefinitionsEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDefinitions_AnyAttribute() {
		return (EAttribute)tDefinitionsEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTDiscretionaryItem() {
		return tDiscretionaryItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDiscretionaryItem_ItemControl() {
		return (EReference)tDiscretionaryItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDiscretionaryItem_EntryCriterion() {
		return (EReference)tDiscretionaryItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTDiscretionaryItem_ExitCriterion() {
		return (EReference)tDiscretionaryItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDiscretionaryItem_DefinitionRef() {
		return (EAttribute)tDiscretionaryItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDiscretionaryItem_Name() {
		return (EAttribute)tDiscretionaryItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTDocumentation() {
		return tDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDocumentation_Mixed() {
		return (EAttribute)tDocumentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDocumentation_Any() {
		return (EAttribute)tDocumentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDocumentation_Id() {
		return (EAttribute)tDocumentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTDocumentation_TextFormat() {
		return (EAttribute)tDocumentationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTEntryCriterion() {
		return tEntryCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTEventListener() {
		return tEventListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTExitCriterion() {
		return tExitCriterionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTExpression() {
		return tExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTExpression_Language() {
		return (EAttribute)tExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTExtensionElements() {
		return tExtensionElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTExtensionElements_Any() {
		return (EAttribute)tExtensionElementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTHumanTask() {
		return tHumanTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTHumanTask_PlanningTable() {
		return (EReference)tHumanTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTHumanTask_PerformerRef() {
		return (EAttribute)tHumanTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTIfPart() {
		return tIfPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTIfPart_Condition() {
		return (EReference)tIfPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTIfPart_ContextRef() {
		return (EAttribute)tIfPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTImport() {
		return tImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTImport_ImportType() {
		return (EAttribute)tImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTImport_Location() {
		return (EAttribute)tImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTImport_Namespace() {
		return (EAttribute)tImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTManualActivationRule() {
		return tManualActivationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTManualActivationRule_Condition() {
		return (EReference)tManualActivationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTManualActivationRule_ContextRef() {
		return (EAttribute)tManualActivationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTManualActivationRule_Name() {
		return (EAttribute)tManualActivationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTMilestone() {
		return tMilestoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTOnPart() {
		return tOnPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTOnPart_Name() {
		return (EAttribute)tOnPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTParameter() {
		return tParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTParameter_Name() {
		return (EAttribute)tParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTParameterMapping() {
		return tParameterMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTParameterMapping_Transformation() {
		return (EReference)tParameterMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTParameterMapping_SourceRef() {
		return (EAttribute)tParameterMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTParameterMapping_TargetRef() {
		return (EAttribute)tParameterMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTPlanFragment() {
		return tPlanFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPlanFragment_PlanItem() {
		return (EReference)tPlanFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPlanFragment_Sentry() {
		return (EReference)tPlanFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTPlanItem() {
		return tPlanItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPlanItem_ItemControl() {
		return (EReference)tPlanItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPlanItem_EntryCriterion() {
		return (EReference)tPlanItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPlanItem_ExitCriterion() {
		return (EReference)tPlanItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPlanItem_DefinitionRef() {
		return (EAttribute)tPlanItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPlanItem_Name() {
		return (EAttribute)tPlanItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTPlanItemControl() {
		return tPlanItemControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPlanItemControl_RepetitionRule() {
		return (EReference)tPlanItemControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPlanItemControl_RequiredRule() {
		return (EReference)tPlanItemControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPlanItemControl_ManualActivationRule() {
		return (EReference)tPlanItemControlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTPlanItemDefinition() {
		return tPlanItemDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPlanItemDefinition_DefaultControl() {
		return (EReference)tPlanItemDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPlanItemDefinition_Name() {
		return (EAttribute)tPlanItemDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTPlanItemOnPart() {
		return tPlanItemOnPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPlanItemOnPart_StandardEvent() {
		return (EAttribute)tPlanItemOnPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPlanItemOnPart_ExitCriterionRef() {
		return (EAttribute)tPlanItemOnPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPlanItemOnPart_SourceRef() {
		return (EAttribute)tPlanItemOnPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTPlanItemStartTrigger() {
		return tPlanItemStartTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPlanItemStartTrigger_StandardEvent() {
		return (EAttribute)tPlanItemStartTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPlanItemStartTrigger_SourceRef() {
		return (EAttribute)tPlanItemStartTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTPlanningTable() {
		return tPlanningTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTPlanningTable_TableItemGroup() {
		return (EAttribute)tPlanningTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPlanningTable_TableItem() {
		return (EReference)tPlanningTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTPlanningTable_ApplicabilityRule() {
		return (EReference)tPlanningTableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTProcess() {
		return tProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTProcess_Input() {
		return (EReference)tProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTProcess_Output() {
		return (EReference)tProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTProcess_ExternalRef() {
		return (EAttribute)tProcessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTProcess_ImplementationType() {
		return (EAttribute)tProcessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTProcess_Name() {
		return (EAttribute)tProcessEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTProcessParameter() {
		return tProcessParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTProcessTask() {
		return tProcessTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTProcessTask_ParameterMapping() {
		return (EReference)tProcessTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTProcessTask_ProcessRefExpression() {
		return (EReference)tProcessTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTProcessTask_ProcessRef() {
		return (EAttribute)tProcessTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTProperty() {
		return tPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTProperty_Name() {
		return (EAttribute)tPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTProperty_Type() {
		return (EAttribute)tPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTRelationship() {
		return tRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTRelationship_Source() {
		return (EAttribute)tRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTRelationship_Target() {
		return (EAttribute)tRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTRelationship_Direction() {
		return (EAttribute)tRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTRelationship_Type() {
		return (EAttribute)tRelationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTRepetitionRule() {
		return tRepetitionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTRepetitionRule_Condition() {
		return (EReference)tRepetitionRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTRepetitionRule_ContextRef() {
		return (EAttribute)tRepetitionRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTRepetitionRule_Name() {
		return (EAttribute)tRepetitionRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTRequiredRule() {
		return tRequiredRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTRequiredRule_Condition() {
		return (EReference)tRequiredRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTRequiredRule_ContextRef() {
		return (EAttribute)tRequiredRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTRequiredRule_Name() {
		return (EAttribute)tRequiredRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTRole() {
		return tRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTRole_Name() {
		return (EAttribute)tRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTSentry() {
		return tSentryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTSentry_OnPartGroup() {
		return (EAttribute)tSentryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSentry_OnPart() {
		return (EReference)tSentryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTSentry_IfPart() {
		return (EReference)tSentryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTSentry_Name() {
		return (EAttribute)tSentryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTStage() {
		return tStageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTStage_PlanningTable() {
		return (EReference)tStageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTStage_PlanItemDefinitionGroup() {
		return (EAttribute)tStageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTStage_PlanItemDefinition() {
		return (EReference)tStageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTStage_ExitCriterion() {
		return (EReference)tStageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTStage_AutoComplete() {
		return (EAttribute)tStageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTStartTrigger() {
		return tStartTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTTableItem() {
		return tTableItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTableItem_ApplicabilityRuleRefs() {
		return (EAttribute)tTableItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTableItem_AuthorizedRoleRefs() {
		return (EAttribute)tTableItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTTask() {
		return tTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTask_Input() {
		return (EReference)tTaskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTask_Output() {
		return (EReference)tTaskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTask_IsBlocking() {
		return (EAttribute)tTaskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTTextAnnotation() {
		return tTextAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTextAnnotation_Text() {
		return (EAttribute)tTextAnnotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTextAnnotation_TextFormat() {
		return (EAttribute)tTextAnnotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTTimerEventListener() {
		return tTimerEventListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTimerEventListener_TimerExpression() {
		return (EReference)tTimerEventListenerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTTimerEventListener_TimerStartGroup() {
		return (EAttribute)tTimerEventListenerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTTimerEventListener_TimerStart() {
		return (EReference)tTimerEventListenerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTUserEventListener() {
		return tUserEventListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTUserEventListener_AuthorizedRoleRefs() {
		return (EAttribute)tUserEventListenerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCaseFileItemTransition() {
		return caseFileItemTransitionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDecisionTypeEnumMember1() {
		return decisionTypeEnumMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDefinitionTypeEnumMember1() {
		return definitionTypeEnumMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMultiplicityEnum() {
		return multiplicityEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPlanItemTransition() {
		return planItemTransitionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProcessTypeEnumMember1() {
		return processTypeEnumMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPropertyTypeEnumMember1() {
		return propertyTypeEnumMember1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTAssociationDirection() {
		return tAssociationDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTRelationshipDirection() {
		return tRelationshipDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCaseFileItemTransitionObject() {
		return caseFileItemTransitionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDecisionTypeEnum() {
		return decisionTypeEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDecisionTypeEnumMember1Object() {
		return decisionTypeEnumMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDefinitionTypeEnum() {
		return definitionTypeEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDefinitionTypeEnumMember1Object() {
		return definitionTypeEnumMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMultiplicityEnumObject() {
		return multiplicityEnumObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPlanItemTransitionObject() {
		return planItemTransitionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getProcessTypeEnum() {
		return processTypeEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getProcessTypeEnumMember1Object() {
		return processTypeEnumMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPropertyTypeEnum() {
		return propertyTypeEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPropertyTypeEnumMember1Object() {
		return propertyTypeEnumMember1ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTAssociationDirectionObject() {
		return tAssociationDirectionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTRelationshipDirectionObject() {
		return tRelationshipDirectionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseModelFactory getCaseModelFactory() {
		return (CaseModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		caseModelRootEClass = createEClass(CASE_MODEL_ROOT);
		createEAttribute(caseModelRootEClass, CASE_MODEL_ROOT__MIXED);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__XMLNS_PREFIX_MAP);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__APPLICABILITY_RULE);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__ARTIFACT);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__ASSOCIATION);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__CASE);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__CASE_FILE);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__CASE_FILE_ITEM);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__CASE_FILE_ITEM_DEFINITION);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__CASE_FILE_ITEM_ON_PART);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__ON_PART);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__CASE_FILE_ITEM_START_TRIGGER);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__TIMER_START);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__CASE_PARAMETER);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__PARAMETER);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__CASE_TASK);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__TASK);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__PLAN_ITEM_DEFINITION);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__DECISION);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__DECISION_PARAMETER);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__DECISION_TASK);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__DEFINITIONS);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__DISCRETIONARY_ITEM);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__TABLE_ITEM);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__DOCUMENTATION);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__ENTRY_CRITERION);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__EVENT_LISTENER);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__EXIT_CRITERION);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__EXPRESSION);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__EXTENSION_ELEMENTS);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__HUMAN_TASK);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__IF_PART);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__IMPORT);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__MANUAL_ACTIVATION_RULE);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__MILESTONE);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__PARAMETER_MAPPING);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__PLAN_FRAGMENT);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__PLAN_ITEM);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__PLAN_ITEM_CONTROL);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__PLAN_ITEM_ON_PART);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__PLAN_ITEM_START_TRIGGER);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__PLANNING_TABLE);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__PROCESS);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__PROCESS_PARAMETER);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__PROCESS_TASK);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__PROPERTY);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__RELATIONSHIP);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__REPETITION_RULE);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__REQUIRED_RULE);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__ROLE);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__SENTRY);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__STAGE);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__TEXT_ANNOTATION);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__TIMER_EVENT_LISTENER);
		createEReference(caseModelRootEClass, CASE_MODEL_ROOT__USER_EVENT_LISTENER);

		tApplicabilityRuleEClass = createEClass(TAPPLICABILITY_RULE);
		createEReference(tApplicabilityRuleEClass, TAPPLICABILITY_RULE__CONDITION);
		createEAttribute(tApplicabilityRuleEClass, TAPPLICABILITY_RULE__CONTEXT_REF);
		createEAttribute(tApplicabilityRuleEClass, TAPPLICABILITY_RULE__NAME);

		tArtifactEClass = createEClass(TARTIFACT);

		tAssociationEClass = createEClass(TASSOCIATION);
		createEAttribute(tAssociationEClass, TASSOCIATION__ASSOCIATION_DIRECTION);
		createEAttribute(tAssociationEClass, TASSOCIATION__SOURCE_REF);
		createEAttribute(tAssociationEClass, TASSOCIATION__TARGET_REF);

		tCaseEClass = createEClass(TCASE);
		createEReference(tCaseEClass, TCASE__CASE_FILE_MODEL);
		createEReference(tCaseEClass, TCASE__CASE_PLAN_MODEL);
		createEReference(tCaseEClass, TCASE__CASE_ROLES);
		createEReference(tCaseEClass, TCASE__INPUT);
		createEReference(tCaseEClass, TCASE__OUTPUT);
		createEAttribute(tCaseEClass, TCASE__NAME);

		tCaseFileEClass = createEClass(TCASE_FILE);
		createEReference(tCaseFileEClass, TCASE_FILE__CASE_FILE_ITEM);

		tCaseFileItemEClass = createEClass(TCASE_FILE_ITEM);
		createEReference(tCaseFileItemEClass, TCASE_FILE_ITEM__CHILDREN);
		createEAttribute(tCaseFileItemEClass, TCASE_FILE_ITEM__DEFINITION_REF);
		createEAttribute(tCaseFileItemEClass, TCASE_FILE_ITEM__MULTIPLICITY);
		createEAttribute(tCaseFileItemEClass, TCASE_FILE_ITEM__NAME);
		createEAttribute(tCaseFileItemEClass, TCASE_FILE_ITEM__SOURCE_REF);
		createEAttribute(tCaseFileItemEClass, TCASE_FILE_ITEM__TARGET_REFS);

		tCaseFileItemDefinitionEClass = createEClass(TCASE_FILE_ITEM_DEFINITION);
		createEReference(tCaseFileItemDefinitionEClass, TCASE_FILE_ITEM_DEFINITION__PROPERTY);
		createEAttribute(tCaseFileItemDefinitionEClass, TCASE_FILE_ITEM_DEFINITION__DEFINITION_TYPE);
		createEAttribute(tCaseFileItemDefinitionEClass, TCASE_FILE_ITEM_DEFINITION__IMPORT_REF);
		createEAttribute(tCaseFileItemDefinitionEClass, TCASE_FILE_ITEM_DEFINITION__NAME);
		createEAttribute(tCaseFileItemDefinitionEClass, TCASE_FILE_ITEM_DEFINITION__STRUCTURE_REF);

		tCaseFileItemOnPartEClass = createEClass(TCASE_FILE_ITEM_ON_PART);
		createEAttribute(tCaseFileItemOnPartEClass, TCASE_FILE_ITEM_ON_PART__STANDARD_EVENT);
		createEAttribute(tCaseFileItemOnPartEClass, TCASE_FILE_ITEM_ON_PART__SOURCE_REF);

		tCaseFileItemStartTriggerEClass = createEClass(TCASE_FILE_ITEM_START_TRIGGER);
		createEAttribute(tCaseFileItemStartTriggerEClass, TCASE_FILE_ITEM_START_TRIGGER__STANDARD_EVENT);
		createEAttribute(tCaseFileItemStartTriggerEClass, TCASE_FILE_ITEM_START_TRIGGER__SOURCE_REF);

		tCaseParameterEClass = createEClass(TCASE_PARAMETER);
		createEReference(tCaseParameterEClass, TCASE_PARAMETER__BINDING_REFINEMENT);
		createEAttribute(tCaseParameterEClass, TCASE_PARAMETER__BINDING_REF);

		tCaseRolesEClass = createEClass(TCASE_ROLES);
		createEReference(tCaseRolesEClass, TCASE_ROLES__ROLE);

		tCaseTaskEClass = createEClass(TCASE_TASK);
		createEReference(tCaseTaskEClass, TCASE_TASK__PARAMETER_MAPPING);
		createEReference(tCaseTaskEClass, TCASE_TASK__CASE_REF_EXPRESSION);
		createEAttribute(tCaseTaskEClass, TCASE_TASK__CASE_REF);

		tChildrenEClass = createEClass(TCHILDREN);
		createEReference(tChildrenEClass, TCHILDREN__CASE_FILE_ITEM);

		tCmmnElementEClass = createEClass(TCMMN_ELEMENT);
		createEReference(tCmmnElementEClass, TCMMN_ELEMENT__DOCUMENTATION);
		createEReference(tCmmnElementEClass, TCMMN_ELEMENT__EXTENSION_ELEMENTS);
		createEAttribute(tCmmnElementEClass, TCMMN_ELEMENT__ID);
		createEAttribute(tCmmnElementEClass, TCMMN_ELEMENT__ANY_ATTRIBUTE);

		tCmmnElementWithMixedContentEClass = createEClass(TCMMN_ELEMENT_WITH_MIXED_CONTENT);
		createEAttribute(tCmmnElementWithMixedContentEClass, TCMMN_ELEMENT_WITH_MIXED_CONTENT__MIXED);
		createEReference(tCmmnElementWithMixedContentEClass, TCMMN_ELEMENT_WITH_MIXED_CONTENT__DOCUMENTATION);
		createEReference(tCmmnElementWithMixedContentEClass, TCMMN_ELEMENT_WITH_MIXED_CONTENT__EXTENSION_ELEMENTS);
		createEAttribute(tCmmnElementWithMixedContentEClass, TCMMN_ELEMENT_WITH_MIXED_CONTENT__ID);
		createEAttribute(tCmmnElementWithMixedContentEClass, TCMMN_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE);

		tCriterionEClass = createEClass(TCRITERION);
		createEAttribute(tCriterionEClass, TCRITERION__NAME);
		createEAttribute(tCriterionEClass, TCRITERION__SENTRY_REF);

		tDecisionEClass = createEClass(TDECISION);
		createEReference(tDecisionEClass, TDECISION__INPUT);
		createEReference(tDecisionEClass, TDECISION__OUTPUT);
		createEAttribute(tDecisionEClass, TDECISION__EXTERNAL_REF);
		createEAttribute(tDecisionEClass, TDECISION__IMPLEMENTATION_TYPE);
		createEAttribute(tDecisionEClass, TDECISION__NAME);

		tDecisionParameterEClass = createEClass(TDECISION_PARAMETER);

		tDecisionTaskEClass = createEClass(TDECISION_TASK);
		createEReference(tDecisionTaskEClass, TDECISION_TASK__PARAMETER_MAPPING);
		createEReference(tDecisionTaskEClass, TDECISION_TASK__DECISION_REF_EXPRESSION);
		createEAttribute(tDecisionTaskEClass, TDECISION_TASK__DECISION_REF);

		tDefinitionsEClass = createEClass(TDEFINITIONS);
		createEReference(tDefinitionsEClass, TDEFINITIONS__IMPORT);
		createEReference(tDefinitionsEClass, TDEFINITIONS__CASE_FILE_ITEM_DEFINITION);
		createEReference(tDefinitionsEClass, TDEFINITIONS__CASE);
		createEReference(tDefinitionsEClass, TDEFINITIONS__PROCESS);
		createEReference(tDefinitionsEClass, TDEFINITIONS__DECISION);
		createEReference(tDefinitionsEClass, TDEFINITIONS__EXTENSION_ELEMENTS);
		createEReference(tDefinitionsEClass, TDEFINITIONS__RELATIONSHIP);
		createEAttribute(tDefinitionsEClass, TDEFINITIONS__ARTIFACT_GROUP);
		createEReference(tDefinitionsEClass, TDEFINITIONS__ARTIFACT);
		createEReference(tDefinitionsEClass, TDEFINITIONS__CMMNDI);
		createEAttribute(tDefinitionsEClass, TDEFINITIONS__AUTHOR);
		createEAttribute(tDefinitionsEClass, TDEFINITIONS__CREATION_DATE);
		createEAttribute(tDefinitionsEClass, TDEFINITIONS__EXPORTER);
		createEAttribute(tDefinitionsEClass, TDEFINITIONS__EXPORTER_VERSION);
		createEAttribute(tDefinitionsEClass, TDEFINITIONS__EXPRESSION_LANGUAGE);
		createEAttribute(tDefinitionsEClass, TDEFINITIONS__ID);
		createEAttribute(tDefinitionsEClass, TDEFINITIONS__NAME);
		createEAttribute(tDefinitionsEClass, TDEFINITIONS__TARGET_NAMESPACE);
		createEAttribute(tDefinitionsEClass, TDEFINITIONS__ANY_ATTRIBUTE);

		tDiscretionaryItemEClass = createEClass(TDISCRETIONARY_ITEM);
		createEReference(tDiscretionaryItemEClass, TDISCRETIONARY_ITEM__ITEM_CONTROL);
		createEReference(tDiscretionaryItemEClass, TDISCRETIONARY_ITEM__ENTRY_CRITERION);
		createEReference(tDiscretionaryItemEClass, TDISCRETIONARY_ITEM__EXIT_CRITERION);
		createEAttribute(tDiscretionaryItemEClass, TDISCRETIONARY_ITEM__DEFINITION_REF);
		createEAttribute(tDiscretionaryItemEClass, TDISCRETIONARY_ITEM__NAME);

		tDocumentationEClass = createEClass(TDOCUMENTATION);
		createEAttribute(tDocumentationEClass, TDOCUMENTATION__MIXED);
		createEAttribute(tDocumentationEClass, TDOCUMENTATION__ANY);
		createEAttribute(tDocumentationEClass, TDOCUMENTATION__ID);
		createEAttribute(tDocumentationEClass, TDOCUMENTATION__TEXT_FORMAT);

		tEntryCriterionEClass = createEClass(TENTRY_CRITERION);

		tEventListenerEClass = createEClass(TEVENT_LISTENER);

		tExitCriterionEClass = createEClass(TEXIT_CRITERION);

		tExpressionEClass = createEClass(TEXPRESSION);
		createEAttribute(tExpressionEClass, TEXPRESSION__LANGUAGE);

		tExtensionElementsEClass = createEClass(TEXTENSION_ELEMENTS);
		createEAttribute(tExtensionElementsEClass, TEXTENSION_ELEMENTS__ANY);

		tHumanTaskEClass = createEClass(THUMAN_TASK);
		createEReference(tHumanTaskEClass, THUMAN_TASK__PLANNING_TABLE);
		createEAttribute(tHumanTaskEClass, THUMAN_TASK__PERFORMER_REF);

		tIfPartEClass = createEClass(TIF_PART);
		createEReference(tIfPartEClass, TIF_PART__CONDITION);
		createEAttribute(tIfPartEClass, TIF_PART__CONTEXT_REF);

		tImportEClass = createEClass(TIMPORT);
		createEAttribute(tImportEClass, TIMPORT__IMPORT_TYPE);
		createEAttribute(tImportEClass, TIMPORT__LOCATION);
		createEAttribute(tImportEClass, TIMPORT__NAMESPACE);

		tManualActivationRuleEClass = createEClass(TMANUAL_ACTIVATION_RULE);
		createEReference(tManualActivationRuleEClass, TMANUAL_ACTIVATION_RULE__CONDITION);
		createEAttribute(tManualActivationRuleEClass, TMANUAL_ACTIVATION_RULE__CONTEXT_REF);
		createEAttribute(tManualActivationRuleEClass, TMANUAL_ACTIVATION_RULE__NAME);

		tMilestoneEClass = createEClass(TMILESTONE);

		tOnPartEClass = createEClass(TON_PART);
		createEAttribute(tOnPartEClass, TON_PART__NAME);

		tParameterEClass = createEClass(TPARAMETER);
		createEAttribute(tParameterEClass, TPARAMETER__NAME);

		tParameterMappingEClass = createEClass(TPARAMETER_MAPPING);
		createEReference(tParameterMappingEClass, TPARAMETER_MAPPING__TRANSFORMATION);
		createEAttribute(tParameterMappingEClass, TPARAMETER_MAPPING__SOURCE_REF);
		createEAttribute(tParameterMappingEClass, TPARAMETER_MAPPING__TARGET_REF);

		tPlanFragmentEClass = createEClass(TPLAN_FRAGMENT);
		createEReference(tPlanFragmentEClass, TPLAN_FRAGMENT__PLAN_ITEM);
		createEReference(tPlanFragmentEClass, TPLAN_FRAGMENT__SENTRY);

		tPlanItemEClass = createEClass(TPLAN_ITEM);
		createEReference(tPlanItemEClass, TPLAN_ITEM__ITEM_CONTROL);
		createEReference(tPlanItemEClass, TPLAN_ITEM__ENTRY_CRITERION);
		createEReference(tPlanItemEClass, TPLAN_ITEM__EXIT_CRITERION);
		createEAttribute(tPlanItemEClass, TPLAN_ITEM__DEFINITION_REF);
		createEAttribute(tPlanItemEClass, TPLAN_ITEM__NAME);

		tPlanItemControlEClass = createEClass(TPLAN_ITEM_CONTROL);
		createEReference(tPlanItemControlEClass, TPLAN_ITEM_CONTROL__REPETITION_RULE);
		createEReference(tPlanItemControlEClass, TPLAN_ITEM_CONTROL__REQUIRED_RULE);
		createEReference(tPlanItemControlEClass, TPLAN_ITEM_CONTROL__MANUAL_ACTIVATION_RULE);

		tPlanItemDefinitionEClass = createEClass(TPLAN_ITEM_DEFINITION);
		createEReference(tPlanItemDefinitionEClass, TPLAN_ITEM_DEFINITION__DEFAULT_CONTROL);
		createEAttribute(tPlanItemDefinitionEClass, TPLAN_ITEM_DEFINITION__NAME);

		tPlanItemOnPartEClass = createEClass(TPLAN_ITEM_ON_PART);
		createEAttribute(tPlanItemOnPartEClass, TPLAN_ITEM_ON_PART__STANDARD_EVENT);
		createEAttribute(tPlanItemOnPartEClass, TPLAN_ITEM_ON_PART__EXIT_CRITERION_REF);
		createEAttribute(tPlanItemOnPartEClass, TPLAN_ITEM_ON_PART__SOURCE_REF);

		tPlanItemStartTriggerEClass = createEClass(TPLAN_ITEM_START_TRIGGER);
		createEAttribute(tPlanItemStartTriggerEClass, TPLAN_ITEM_START_TRIGGER__STANDARD_EVENT);
		createEAttribute(tPlanItemStartTriggerEClass, TPLAN_ITEM_START_TRIGGER__SOURCE_REF);

		tPlanningTableEClass = createEClass(TPLANNING_TABLE);
		createEAttribute(tPlanningTableEClass, TPLANNING_TABLE__TABLE_ITEM_GROUP);
		createEReference(tPlanningTableEClass, TPLANNING_TABLE__TABLE_ITEM);
		createEReference(tPlanningTableEClass, TPLANNING_TABLE__APPLICABILITY_RULE);

		tProcessEClass = createEClass(TPROCESS);
		createEReference(tProcessEClass, TPROCESS__INPUT);
		createEReference(tProcessEClass, TPROCESS__OUTPUT);
		createEAttribute(tProcessEClass, TPROCESS__EXTERNAL_REF);
		createEAttribute(tProcessEClass, TPROCESS__IMPLEMENTATION_TYPE);
		createEAttribute(tProcessEClass, TPROCESS__NAME);

		tProcessParameterEClass = createEClass(TPROCESS_PARAMETER);

		tProcessTaskEClass = createEClass(TPROCESS_TASK);
		createEReference(tProcessTaskEClass, TPROCESS_TASK__PARAMETER_MAPPING);
		createEReference(tProcessTaskEClass, TPROCESS_TASK__PROCESS_REF_EXPRESSION);
		createEAttribute(tProcessTaskEClass, TPROCESS_TASK__PROCESS_REF);

		tPropertyEClass = createEClass(TPROPERTY);
		createEAttribute(tPropertyEClass, TPROPERTY__NAME);
		createEAttribute(tPropertyEClass, TPROPERTY__TYPE);

		tRelationshipEClass = createEClass(TRELATIONSHIP);
		createEAttribute(tRelationshipEClass, TRELATIONSHIP__SOURCE);
		createEAttribute(tRelationshipEClass, TRELATIONSHIP__TARGET);
		createEAttribute(tRelationshipEClass, TRELATIONSHIP__DIRECTION);
		createEAttribute(tRelationshipEClass, TRELATIONSHIP__TYPE);

		tRepetitionRuleEClass = createEClass(TREPETITION_RULE);
		createEReference(tRepetitionRuleEClass, TREPETITION_RULE__CONDITION);
		createEAttribute(tRepetitionRuleEClass, TREPETITION_RULE__CONTEXT_REF);
		createEAttribute(tRepetitionRuleEClass, TREPETITION_RULE__NAME);

		tRequiredRuleEClass = createEClass(TREQUIRED_RULE);
		createEReference(tRequiredRuleEClass, TREQUIRED_RULE__CONDITION);
		createEAttribute(tRequiredRuleEClass, TREQUIRED_RULE__CONTEXT_REF);
		createEAttribute(tRequiredRuleEClass, TREQUIRED_RULE__NAME);

		tRoleEClass = createEClass(TROLE);
		createEAttribute(tRoleEClass, TROLE__NAME);

		tSentryEClass = createEClass(TSENTRY);
		createEAttribute(tSentryEClass, TSENTRY__ON_PART_GROUP);
		createEReference(tSentryEClass, TSENTRY__ON_PART);
		createEReference(tSentryEClass, TSENTRY__IF_PART);
		createEAttribute(tSentryEClass, TSENTRY__NAME);

		tStageEClass = createEClass(TSTAGE);
		createEReference(tStageEClass, TSTAGE__PLANNING_TABLE);
		createEAttribute(tStageEClass, TSTAGE__PLAN_ITEM_DEFINITION_GROUP);
		createEReference(tStageEClass, TSTAGE__PLAN_ITEM_DEFINITION);
		createEReference(tStageEClass, TSTAGE__EXIT_CRITERION);
		createEAttribute(tStageEClass, TSTAGE__AUTO_COMPLETE);

		tStartTriggerEClass = createEClass(TSTART_TRIGGER);

		tTableItemEClass = createEClass(TTABLE_ITEM);
		createEAttribute(tTableItemEClass, TTABLE_ITEM__APPLICABILITY_RULE_REFS);
		createEAttribute(tTableItemEClass, TTABLE_ITEM__AUTHORIZED_ROLE_REFS);

		tTaskEClass = createEClass(TTASK);
		createEReference(tTaskEClass, TTASK__INPUT);
		createEReference(tTaskEClass, TTASK__OUTPUT);
		createEAttribute(tTaskEClass, TTASK__IS_BLOCKING);

		tTextAnnotationEClass = createEClass(TTEXT_ANNOTATION);
		createEAttribute(tTextAnnotationEClass, TTEXT_ANNOTATION__TEXT);
		createEAttribute(tTextAnnotationEClass, TTEXT_ANNOTATION__TEXT_FORMAT);

		tTimerEventListenerEClass = createEClass(TTIMER_EVENT_LISTENER);
		createEReference(tTimerEventListenerEClass, TTIMER_EVENT_LISTENER__TIMER_EXPRESSION);
		createEAttribute(tTimerEventListenerEClass, TTIMER_EVENT_LISTENER__TIMER_START_GROUP);
		createEReference(tTimerEventListenerEClass, TTIMER_EVENT_LISTENER__TIMER_START);

		tUserEventListenerEClass = createEClass(TUSER_EVENT_LISTENER);
		createEAttribute(tUserEventListenerEClass, TUSER_EVENT_LISTENER__AUTHORIZED_ROLE_REFS);

		// Create enums
		caseFileItemTransitionEEnum = createEEnum(CASE_FILE_ITEM_TRANSITION);
		decisionTypeEnumMember1EEnum = createEEnum(DECISION_TYPE_ENUM_MEMBER1);
		definitionTypeEnumMember1EEnum = createEEnum(DEFINITION_TYPE_ENUM_MEMBER1);
		multiplicityEnumEEnum = createEEnum(MULTIPLICITY_ENUM);
		planItemTransitionEEnum = createEEnum(PLAN_ITEM_TRANSITION);
		processTypeEnumMember1EEnum = createEEnum(PROCESS_TYPE_ENUM_MEMBER1);
		propertyTypeEnumMember1EEnum = createEEnum(PROPERTY_TYPE_ENUM_MEMBER1);
		tAssociationDirectionEEnum = createEEnum(TASSOCIATION_DIRECTION);
		tRelationshipDirectionEEnum = createEEnum(TRELATIONSHIP_DIRECTION);

		// Create data types
		caseFileItemTransitionObjectEDataType = createEDataType(CASE_FILE_ITEM_TRANSITION_OBJECT);
		decisionTypeEnumEDataType = createEDataType(DECISION_TYPE_ENUM);
		decisionTypeEnumMember1ObjectEDataType = createEDataType(DECISION_TYPE_ENUM_MEMBER1_OBJECT);
		definitionTypeEnumEDataType = createEDataType(DEFINITION_TYPE_ENUM);
		definitionTypeEnumMember1ObjectEDataType = createEDataType(DEFINITION_TYPE_ENUM_MEMBER1_OBJECT);
		multiplicityEnumObjectEDataType = createEDataType(MULTIPLICITY_ENUM_OBJECT);
		planItemTransitionObjectEDataType = createEDataType(PLAN_ITEM_TRANSITION_OBJECT);
		processTypeEnumEDataType = createEDataType(PROCESS_TYPE_ENUM);
		processTypeEnumMember1ObjectEDataType = createEDataType(PROCESS_TYPE_ENUM_MEMBER1_OBJECT);
		propertyTypeEnumEDataType = createEDataType(PROPERTY_TYPE_ENUM);
		propertyTypeEnumMember1ObjectEDataType = createEDataType(PROPERTY_TYPE_ENUM_MEMBER1_OBJECT);
		tAssociationDirectionObjectEDataType = createEDataType(TASSOCIATION_DIRECTION_OBJECT);
		tRelationshipDirectionObjectEDataType = createEDataType(TRELATIONSHIP_DIRECTION_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		CMMNDIPackage theCMMNDIPackage = (CMMNDIPackage)EPackage.Registry.INSTANCE.getEPackage(CMMNDIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tApplicabilityRuleEClass.getESuperTypes().add(this.getTCmmnElement());
		tArtifactEClass.getESuperTypes().add(this.getTCmmnElement());
		tAssociationEClass.getESuperTypes().add(this.getTArtifact());
		tCaseEClass.getESuperTypes().add(this.getTCmmnElement());
		tCaseFileEClass.getESuperTypes().add(this.getTCmmnElement());
		tCaseFileItemEClass.getESuperTypes().add(this.getTCmmnElement());
		tCaseFileItemDefinitionEClass.getESuperTypes().add(this.getTCmmnElement());
		tCaseFileItemOnPartEClass.getESuperTypes().add(this.getTOnPart());
		tCaseFileItemStartTriggerEClass.getESuperTypes().add(this.getTStartTrigger());
		tCaseParameterEClass.getESuperTypes().add(this.getTParameter());
		tCaseRolesEClass.getESuperTypes().add(this.getTCmmnElement());
		tCaseTaskEClass.getESuperTypes().add(this.getTTask());
		tChildrenEClass.getESuperTypes().add(this.getTCmmnElement());
		tCriterionEClass.getESuperTypes().add(this.getTCmmnElement());
		tDecisionEClass.getESuperTypes().add(this.getTCmmnElement());
		tDecisionParameterEClass.getESuperTypes().add(this.getTParameter());
		tDecisionTaskEClass.getESuperTypes().add(this.getTTask());
		tDiscretionaryItemEClass.getESuperTypes().add(this.getTTableItem());
		tEntryCriterionEClass.getESuperTypes().add(this.getTCriterion());
		tEventListenerEClass.getESuperTypes().add(this.getTPlanItemDefinition());
		tExitCriterionEClass.getESuperTypes().add(this.getTCriterion());
		tExpressionEClass.getESuperTypes().add(this.getTCmmnElementWithMixedContent());
		tHumanTaskEClass.getESuperTypes().add(this.getTTask());
		tIfPartEClass.getESuperTypes().add(this.getTCmmnElement());
		tManualActivationRuleEClass.getESuperTypes().add(this.getTCmmnElement());
		tMilestoneEClass.getESuperTypes().add(this.getTPlanItemDefinition());
		tOnPartEClass.getESuperTypes().add(this.getTCmmnElement());
		tParameterEClass.getESuperTypes().add(this.getTCmmnElement());
		tParameterMappingEClass.getESuperTypes().add(this.getTCmmnElement());
		tPlanFragmentEClass.getESuperTypes().add(this.getTPlanItemDefinition());
		tPlanItemEClass.getESuperTypes().add(this.getTCmmnElement());
		tPlanItemControlEClass.getESuperTypes().add(this.getTCmmnElement());
		tPlanItemDefinitionEClass.getESuperTypes().add(this.getTCmmnElement());
		tPlanItemOnPartEClass.getESuperTypes().add(this.getTOnPart());
		tPlanItemStartTriggerEClass.getESuperTypes().add(this.getTStartTrigger());
		tPlanningTableEClass.getESuperTypes().add(this.getTTableItem());
		tProcessEClass.getESuperTypes().add(this.getTCmmnElement());
		tProcessParameterEClass.getESuperTypes().add(this.getTParameter());
		tProcessTaskEClass.getESuperTypes().add(this.getTTask());
		tPropertyEClass.getESuperTypes().add(this.getTCmmnElement());
		tRelationshipEClass.getESuperTypes().add(this.getTCmmnElement());
		tRepetitionRuleEClass.getESuperTypes().add(this.getTCmmnElement());
		tRequiredRuleEClass.getESuperTypes().add(this.getTCmmnElement());
		tRoleEClass.getESuperTypes().add(this.getTCmmnElement());
		tSentryEClass.getESuperTypes().add(this.getTCmmnElement());
		tStageEClass.getESuperTypes().add(this.getTPlanFragment());
		tStartTriggerEClass.getESuperTypes().add(this.getTCmmnElement());
		tTableItemEClass.getESuperTypes().add(this.getTCmmnElement());
		tTaskEClass.getESuperTypes().add(this.getTPlanItemDefinition());
		tTextAnnotationEClass.getESuperTypes().add(this.getTArtifact());
		tTimerEventListenerEClass.getESuperTypes().add(this.getTEventListener());
		tUserEventListenerEClass.getESuperTypes().add(this.getTEventListener());

		// Initialize classes, features, and operations; add parameters
		initEClass(caseModelRootEClass, CaseModelRoot.class, "CaseModelRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCaseModelRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_ApplicabilityRule(), this.getTApplicabilityRule(), null, "applicabilityRule", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_Artifact(), this.getTArtifact(), null, "artifact", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_Association(), this.getTAssociation(), null, "association", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_Case(), this.getTCase(), null, "case", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_CaseFile(), this.getTCaseFile(), null, "caseFile", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_CaseFileItem(), this.getTCaseFileItem(), null, "caseFileItem", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_CaseFileItemDefinition(), this.getTCaseFileItemDefinition(), null, "caseFileItemDefinition", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_CaseFileItemOnPart(), this.getTCaseFileItemOnPart(), null, "caseFileItemOnPart", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_OnPart(), this.getTOnPart(), null, "onPart", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_CaseFileItemStartTrigger(), this.getTCaseFileItemStartTrigger(), null, "caseFileItemStartTrigger", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_TimerStart(), this.getTStartTrigger(), null, "timerStart", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_CaseParameter(), this.getTCaseParameter(), null, "caseParameter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_Parameter(), this.getTParameter(), null, "parameter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_CaseTask(), this.getTCaseTask(), null, "caseTask", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_Task(), this.getTTask(), null, "task", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_PlanItemDefinition(), this.getTPlanItemDefinition(), null, "planItemDefinition", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_Decision(), this.getTDecision(), null, "decision", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_DecisionParameter(), this.getTDecisionParameter(), null, "decisionParameter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_DecisionTask(), this.getTDecisionTask(), null, "decisionTask", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_Definitions(), this.getTDefinitions(), null, "definitions", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_DiscretionaryItem(), this.getTDiscretionaryItem(), null, "discretionaryItem", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_TableItem(), this.getTTableItem(), null, "tableItem", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_Documentation(), this.getTDocumentation(), null, "documentation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_EntryCriterion(), this.getTEntryCriterion(), null, "entryCriterion", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_EventListener(), this.getTEventListener(), null, "eventListener", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_ExitCriterion(), this.getTExitCriterion(), null, "exitCriterion", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_Expression(), this.getTExpression(), null, "expression", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_ExtensionElements(), this.getTExtensionElements(), null, "extensionElements", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_HumanTask(), this.getTHumanTask(), null, "humanTask", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_IfPart(), this.getTIfPart(), null, "ifPart", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_Import(), this.getTImport(), null, "import", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_ManualActivationRule(), this.getTManualActivationRule(), null, "manualActivationRule", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_Milestone(), this.getTMilestone(), null, "milestone", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_ParameterMapping(), this.getTParameterMapping(), null, "parameterMapping", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_PlanFragment(), this.getTPlanFragment(), null, "planFragment", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_PlanItem(), this.getTPlanItem(), null, "planItem", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_PlanItemControl(), this.getTPlanItemControl(), null, "planItemControl", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_PlanItemOnPart(), this.getTPlanItemOnPart(), null, "planItemOnPart", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_PlanItemStartTrigger(), this.getTPlanItemStartTrigger(), null, "planItemStartTrigger", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_PlanningTable(), this.getTPlanningTable(), null, "planningTable", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_Process(), this.getTProcess(), null, "process", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_ProcessParameter(), this.getTProcessParameter(), null, "processParameter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_ProcessTask(), this.getTProcessTask(), null, "processTask", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_Property(), this.getTProperty(), null, "property", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_Relationship(), this.getTRelationship(), null, "relationship", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_RepetitionRule(), this.getTRepetitionRule(), null, "repetitionRule", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_RequiredRule(), this.getTRequiredRule(), null, "requiredRule", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_Role(), this.getTRole(), null, "role", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_Sentry(), this.getTSentry(), null, "sentry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_Stage(), this.getTStage(), null, "stage", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_TextAnnotation(), this.getTTextAnnotation(), null, "textAnnotation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_TimerEventListener(), this.getTTimerEventListener(), null, "timerEventListener", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCaseModelRoot_UserEventListener(), this.getTUserEventListener(), null, "userEventListener", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tApplicabilityRuleEClass, TApplicabilityRule.class, "TApplicabilityRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTApplicabilityRule_Condition(), this.getTExpression(), null, "condition", null, 0, 1, TApplicabilityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTApplicabilityRule_ContextRef(), theXMLTypePackage.getIDREF(), "contextRef", null, 0, 1, TApplicabilityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTApplicabilityRule_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TApplicabilityRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tArtifactEClass, TArtifact.class, "TArtifact", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tAssociationEClass, TAssociation.class, "TAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTAssociation_AssociationDirection(), this.getTAssociationDirection(), "associationDirection", null, 0, 1, TAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTAssociation_SourceRef(), theXMLTypePackage.getIDREF(), "sourceRef", null, 0, 1, TAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTAssociation_TargetRef(), theXMLTypePackage.getIDREF(), "targetRef", null, 0, 1, TAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tCaseEClass, TCase.class, "TCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCase_CaseFileModel(), this.getTCaseFile(), null, "caseFileModel", null, 0, 1, TCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCase_CasePlanModel(), this.getTStage(), null, "casePlanModel", null, 0, 1, TCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCase_CaseRoles(), this.getTCaseRoles(), null, "caseRoles", null, 0, 1, TCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCase_Input(), this.getTCaseParameter(), null, "input", null, 0, -1, TCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCase_Output(), this.getTCaseParameter(), null, "output", null, 0, -1, TCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCase_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tCaseFileEClass, TCaseFile.class, "TCaseFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCaseFile_CaseFileItem(), this.getTCaseFileItem(), null, "caseFileItem", null, 0, -1, TCaseFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tCaseFileItemEClass, TCaseFileItem.class, "TCaseFileItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCaseFileItem_Children(), this.getTChildren(), null, "children", null, 0, 1, TCaseFileItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCaseFileItem_DefinitionRef(), theXMLTypePackage.getQName(), "definitionRef", null, 0, 1, TCaseFileItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCaseFileItem_Multiplicity(), this.getMultiplicityEnum(), "multiplicity", "Unspecified", 0, 1, TCaseFileItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCaseFileItem_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TCaseFileItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCaseFileItem_SourceRef(), theXMLTypePackage.getIDREF(), "sourceRef", null, 0, 1, TCaseFileItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCaseFileItem_TargetRefs(), theXMLTypePackage.getIDREFS(), "targetRefs", null, 0, 1, TCaseFileItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tCaseFileItemDefinitionEClass, TCaseFileItemDefinition.class, "TCaseFileItemDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCaseFileItemDefinition_Property(), this.getTProperty(), null, "property", null, 0, -1, TCaseFileItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCaseFileItemDefinition_DefinitionType(), this.getDefinitionTypeEnum(), "definitionType", "http://www.omg.org/spec/CMMN/DefinitionType/Unspecified", 0, 1, TCaseFileItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCaseFileItemDefinition_ImportRef(), theXMLTypePackage.getQName(), "importRef", null, 0, 1, TCaseFileItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCaseFileItemDefinition_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TCaseFileItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCaseFileItemDefinition_StructureRef(), theXMLTypePackage.getQName(), "structureRef", null, 0, 1, TCaseFileItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tCaseFileItemOnPartEClass, TCaseFileItemOnPart.class, "TCaseFileItemOnPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCaseFileItemOnPart_StandardEvent(), this.getCaseFileItemTransition(), "standardEvent", null, 0, 1, TCaseFileItemOnPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCaseFileItemOnPart_SourceRef(), theXMLTypePackage.getIDREF(), "sourceRef", null, 0, 1, TCaseFileItemOnPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tCaseFileItemStartTriggerEClass, TCaseFileItemStartTrigger.class, "TCaseFileItemStartTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCaseFileItemStartTrigger_StandardEvent(), this.getCaseFileItemTransition(), "standardEvent", null, 0, 1, TCaseFileItemStartTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCaseFileItemStartTrigger_SourceRef(), theXMLTypePackage.getIDREF(), "sourceRef", null, 0, 1, TCaseFileItemStartTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tCaseParameterEClass, TCaseParameter.class, "TCaseParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCaseParameter_BindingRefinement(), this.getTExpression(), null, "bindingRefinement", null, 0, 1, TCaseParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCaseParameter_BindingRef(), theXMLTypePackage.getIDREF(), "bindingRef", null, 0, 1, TCaseParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tCaseRolesEClass, TCaseRoles.class, "TCaseRoles", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCaseRoles_Role(), this.getTRole(), null, "role", null, 0, -1, TCaseRoles.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tCaseTaskEClass, TCaseTask.class, "TCaseTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCaseTask_ParameterMapping(), this.getTParameterMapping(), null, "parameterMapping", null, 0, -1, TCaseTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCaseTask_CaseRefExpression(), this.getTExpression(), null, "caseRefExpression", null, 0, 1, TCaseTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCaseTask_CaseRef(), theXMLTypePackage.getQName(), "caseRef", null, 0, 1, TCaseTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tChildrenEClass, TChildren.class, "TChildren", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTChildren_CaseFileItem(), this.getTCaseFileItem(), null, "caseFileItem", null, 0, -1, TChildren.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tCmmnElementEClass, TCmmnElement.class, "TCmmnElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTCmmnElement_Documentation(), this.getTDocumentation(), null, "documentation", null, 0, -1, TCmmnElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCmmnElement_ExtensionElements(), this.getTExtensionElements(), null, "extensionElements", null, 0, 1, TCmmnElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCmmnElement_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TCmmnElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCmmnElement_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, TCmmnElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tCmmnElementWithMixedContentEClass, TCmmnElementWithMixedContent.class, "TCmmnElementWithMixedContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCmmnElementWithMixedContent_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, TCmmnElementWithMixedContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTCmmnElementWithMixedContent_Documentation(), this.getTDocumentation(), null, "documentation", null, 0, -1, TCmmnElementWithMixedContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTCmmnElementWithMixedContent_ExtensionElements(), this.getTExtensionElements(), null, "extensionElements", null, 0, 1, TCmmnElementWithMixedContent.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCmmnElementWithMixedContent_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TCmmnElementWithMixedContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCmmnElementWithMixedContent_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, TCmmnElementWithMixedContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tCriterionEClass, TCriterion.class, "TCriterion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTCriterion_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTCriterion_SentryRef(), theXMLTypePackage.getIDREF(), "sentryRef", null, 0, 1, TCriterion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tDecisionEClass, TDecision.class, "TDecision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTDecision_Input(), this.getTDecisionParameter(), null, "input", null, 0, -1, TDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDecision_Output(), this.getTDecisionParameter(), null, "output", null, 0, -1, TDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDecision_ExternalRef(), theXMLTypePackage.getQName(), "externalRef", null, 0, 1, TDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDecision_ImplementationType(), theXMLTypePackage.getAnyURI(), "implementationType", "http://www.omg.org/spec/CMMN/DecisionType/Unspecified", 0, 1, TDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDecision_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TDecision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tDecisionParameterEClass, TDecisionParameter.class, "TDecisionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tDecisionTaskEClass, TDecisionTask.class, "TDecisionTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTDecisionTask_ParameterMapping(), this.getTParameterMapping(), null, "parameterMapping", null, 0, -1, TDecisionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDecisionTask_DecisionRefExpression(), this.getTExpression(), null, "decisionRefExpression", null, 0, 1, TDecisionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDecisionTask_DecisionRef(), theXMLTypePackage.getQName(), "decisionRef", null, 0, 1, TDecisionTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tDefinitionsEClass, TDefinitions.class, "TDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTDefinitions_Import(), this.getTImport(), null, "import", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_CaseFileItemDefinition(), this.getTCaseFileItemDefinition(), null, "caseFileItemDefinition", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_Case(), this.getTCase(), null, "case", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_Process(), this.getTProcess(), null, "process", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_Decision(), this.getTDecision(), null, "decision", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_ExtensionElements(), this.getTExtensionElements(), null, "extensionElements", null, 0, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_Relationship(), this.getTRelationship(), null, "relationship", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDefinitions_ArtifactGroup(), ecorePackage.getEFeatureMapEntry(), "artifactGroup", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_Artifact(), this.getTArtifact(), null, "artifact", null, 0, -1, TDefinitions.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTDefinitions_CMMNDI(), theCMMNDIPackage.getCMMNDI(), null, "cMMNDI", null, 0, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDefinitions_Author(), theXMLTypePackage.getString(), "author", null, 0, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDefinitions_CreationDate(), theXMLTypePackage.getDateTime(), "creationDate", null, 0, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDefinitions_Exporter(), theXMLTypePackage.getString(), "exporter", null, 0, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDefinitions_ExporterVersion(), theXMLTypePackage.getString(), "exporterVersion", null, 0, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDefinitions_ExpressionLanguage(), theXMLTypePackage.getAnyURI(), "expressionLanguage", "http://www.w3.org/1999/XPath", 0, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDefinitions_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDefinitions_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDefinitions_TargetNamespace(), theXMLTypePackage.getAnyURI(), "targetNamespace", null, 1, 1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDefinitions_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, TDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tDiscretionaryItemEClass, TDiscretionaryItem.class, "TDiscretionaryItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTDiscretionaryItem_ItemControl(), this.getTPlanItemControl(), null, "itemControl", null, 0, 1, TDiscretionaryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDiscretionaryItem_EntryCriterion(), this.getTEntryCriterion(), null, "entryCriterion", null, 0, -1, TDiscretionaryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTDiscretionaryItem_ExitCriterion(), this.getTExitCriterion(), null, "exitCriterion", null, 0, -1, TDiscretionaryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDiscretionaryItem_DefinitionRef(), theXMLTypePackage.getIDREF(), "definitionRef", null, 0, 1, TDiscretionaryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDiscretionaryItem_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TDiscretionaryItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tDocumentationEClass, TDocumentation.class, "TDocumentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTDocumentation_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, TDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDocumentation_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, 1, TDocumentation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDocumentation_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTDocumentation_TextFormat(), theXMLTypePackage.getString(), "textFormat", "text/plain", 0, 1, TDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tEntryCriterionEClass, TEntryCriterion.class, "TEntryCriterion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tEventListenerEClass, TEventListener.class, "TEventListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tExitCriterionEClass, TExitCriterion.class, "TExitCriterion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tExpressionEClass, TExpression.class, "TExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTExpression_Language(), theXMLTypePackage.getAnyURI(), "language", null, 0, 1, TExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tExtensionElementsEClass, TExtensionElements.class, "TExtensionElements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTExtensionElements_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, TExtensionElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tHumanTaskEClass, THumanTask.class, "THumanTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTHumanTask_PlanningTable(), this.getTPlanningTable(), null, "planningTable", null, 0, 1, THumanTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTHumanTask_PerformerRef(), theXMLTypePackage.getIDREF(), "performerRef", null, 0, 1, THumanTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tIfPartEClass, TIfPart.class, "TIfPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTIfPart_Condition(), this.getTExpression(), null, "condition", null, 0, 1, TIfPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTIfPart_ContextRef(), theXMLTypePackage.getIDREF(), "contextRef", null, 0, 1, TIfPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tImportEClass, TImport.class, "TImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTImport_ImportType(), theXMLTypePackage.getAnyURI(), "importType", null, 1, 1, TImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTImport_Location(), theXMLTypePackage.getString(), "location", null, 1, 1, TImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTImport_Namespace(), theXMLTypePackage.getAnyURI(), "namespace", null, 0, 1, TImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tManualActivationRuleEClass, TManualActivationRule.class, "TManualActivationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTManualActivationRule_Condition(), this.getTExpression(), null, "condition", null, 0, 1, TManualActivationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTManualActivationRule_ContextRef(), theXMLTypePackage.getIDREF(), "contextRef", null, 0, 1, TManualActivationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTManualActivationRule_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TManualActivationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tMilestoneEClass, TMilestone.class, "TMilestone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tOnPartEClass, TOnPart.class, "TOnPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTOnPart_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TOnPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tParameterEClass, TParameter.class, "TParameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTParameter_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tParameterMappingEClass, TParameterMapping.class, "TParameterMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTParameterMapping_Transformation(), this.getTExpression(), null, "transformation", null, 0, 1, TParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTParameterMapping_SourceRef(), theXMLTypePackage.getIDREF(), "sourceRef", null, 0, 1, TParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTParameterMapping_TargetRef(), theXMLTypePackage.getIDREF(), "targetRef", null, 0, 1, TParameterMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tPlanFragmentEClass, TPlanFragment.class, "TPlanFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTPlanFragment_PlanItem(), this.getTPlanItem(), null, "planItem", null, 0, -1, TPlanFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTPlanFragment_Sentry(), this.getTSentry(), null, "sentry", null, 0, -1, TPlanFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tPlanItemEClass, TPlanItem.class, "TPlanItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTPlanItem_ItemControl(), this.getTPlanItemControl(), null, "itemControl", null, 0, 1, TPlanItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTPlanItem_EntryCriterion(), this.getTEntryCriterion(), null, "entryCriterion", null, 0, -1, TPlanItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTPlanItem_ExitCriterion(), this.getTExitCriterion(), null, "exitCriterion", null, 0, -1, TPlanItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPlanItem_DefinitionRef(), theXMLTypePackage.getIDREF(), "definitionRef", null, 0, 1, TPlanItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPlanItem_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TPlanItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tPlanItemControlEClass, TPlanItemControl.class, "TPlanItemControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTPlanItemControl_RepetitionRule(), this.getTRepetitionRule(), null, "repetitionRule", null, 0, 1, TPlanItemControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTPlanItemControl_RequiredRule(), this.getTRequiredRule(), null, "requiredRule", null, 0, 1, TPlanItemControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTPlanItemControl_ManualActivationRule(), this.getTManualActivationRule(), null, "manualActivationRule", null, 0, 1, TPlanItemControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tPlanItemDefinitionEClass, TPlanItemDefinition.class, "TPlanItemDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTPlanItemDefinition_DefaultControl(), this.getTPlanItemControl(), null, "defaultControl", null, 0, 1, TPlanItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPlanItemDefinition_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TPlanItemDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tPlanItemOnPartEClass, TPlanItemOnPart.class, "TPlanItemOnPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTPlanItemOnPart_StandardEvent(), this.getPlanItemTransition(), "standardEvent", null, 0, 1, TPlanItemOnPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPlanItemOnPart_ExitCriterionRef(), theXMLTypePackage.getIDREF(), "exitCriterionRef", null, 0, 1, TPlanItemOnPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPlanItemOnPart_SourceRef(), theXMLTypePackage.getIDREF(), "sourceRef", null, 0, 1, TPlanItemOnPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tPlanItemStartTriggerEClass, TPlanItemStartTrigger.class, "TPlanItemStartTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTPlanItemStartTrigger_StandardEvent(), this.getPlanItemTransition(), "standardEvent", null, 0, 1, TPlanItemStartTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTPlanItemStartTrigger_SourceRef(), theXMLTypePackage.getIDREF(), "sourceRef", null, 0, 1, TPlanItemStartTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tPlanningTableEClass, TPlanningTable.class, "TPlanningTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTPlanningTable_TableItemGroup(), ecorePackage.getEFeatureMapEntry(), "tableItemGroup", null, 0, -1, TPlanningTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTPlanningTable_TableItem(), this.getTTableItem(), null, "tableItem", null, 0, -1, TPlanningTable.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTPlanningTable_ApplicabilityRule(), this.getTApplicabilityRule(), null, "applicabilityRule", null, 0, -1, TPlanningTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tProcessEClass, TProcess.class, "TProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTProcess_Input(), this.getTProcessParameter(), null, "input", null, 0, -1, TProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTProcess_Output(), this.getTProcessParameter(), null, "output", null, 0, -1, TProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTProcess_ExternalRef(), theXMLTypePackage.getQName(), "externalRef", null, 0, 1, TProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTProcess_ImplementationType(), theXMLTypePackage.getAnyURI(), "implementationType", "http://www.omg.org/spec/CMMN/ProcessType/Unspecified", 0, 1, TProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTProcess_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tProcessParameterEClass, TProcessParameter.class, "TProcessParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tProcessTaskEClass, TProcessTask.class, "TProcessTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTProcessTask_ParameterMapping(), this.getTParameterMapping(), null, "parameterMapping", null, 0, -1, TProcessTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTProcessTask_ProcessRefExpression(), this.getTExpression(), null, "processRefExpression", null, 0, 1, TProcessTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTProcessTask_ProcessRef(), theXMLTypePackage.getQName(), "processRef", null, 0, 1, TProcessTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tPropertyEClass, TProperty.class, "TProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTProperty_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTProperty_Type(), this.getPropertyTypeEnum(), "type", "http://www.omg.org/spec/CMMN/PropertyType/Unspecified", 0, 1, TProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tRelationshipEClass, TRelationship.class, "TRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTRelationship_Source(), theXMLTypePackage.getQName(), "source", null, 1, -1, TRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRelationship_Target(), theXMLTypePackage.getQName(), "target", null, 1, -1, TRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRelationship_Direction(), this.getTRelationshipDirection(), "direction", null, 0, 1, TRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRelationship_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, TRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tRepetitionRuleEClass, TRepetitionRule.class, "TRepetitionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTRepetitionRule_Condition(), this.getTExpression(), null, "condition", null, 0, 1, TRepetitionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRepetitionRule_ContextRef(), theXMLTypePackage.getIDREF(), "contextRef", null, 0, 1, TRepetitionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRepetitionRule_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TRepetitionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tRequiredRuleEClass, TRequiredRule.class, "TRequiredRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTRequiredRule_Condition(), this.getTExpression(), null, "condition", null, 0, 1, TRequiredRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRequiredRule_ContextRef(), theXMLTypePackage.getIDREF(), "contextRef", null, 0, 1, TRequiredRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTRequiredRule_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TRequiredRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tRoleEClass, TRole.class, "TRole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTRole_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tSentryEClass, TSentry.class, "TSentry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTSentry_OnPartGroup(), ecorePackage.getEFeatureMapEntry(), "onPartGroup", null, 0, -1, TSentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTSentry_OnPart(), this.getTOnPart(), null, "onPart", null, 0, -1, TSentry.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTSentry_IfPart(), this.getTIfPart(), null, "ifPart", null, 0, 1, TSentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTSentry_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TSentry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tStageEClass, TStage.class, "TStage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTStage_PlanningTable(), this.getTPlanningTable(), null, "planningTable", null, 0, 1, TStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTStage_PlanItemDefinitionGroup(), ecorePackage.getEFeatureMapEntry(), "planItemDefinitionGroup", null, 0, -1, TStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTStage_PlanItemDefinition(), this.getTPlanItemDefinition(), null, "planItemDefinition", null, 0, -1, TStage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTStage_ExitCriterion(), this.getTExitCriterion(), null, "exitCriterion", null, 0, -1, TStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTStage_AutoComplete(), theXMLTypePackage.getBoolean(), "autoComplete", "false", 0, 1, TStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tStartTriggerEClass, TStartTrigger.class, "TStartTrigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tTableItemEClass, TTableItem.class, "TTableItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTTableItem_ApplicabilityRuleRefs(), theXMLTypePackage.getIDREFS(), "applicabilityRuleRefs", null, 0, 1, TTableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTTableItem_AuthorizedRoleRefs(), theXMLTypePackage.getIDREFS(), "authorizedRoleRefs", null, 0, 1, TTableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tTaskEClass, TTask.class, "TTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTTask_Input(), this.getTCaseParameter(), null, "input", null, 0, -1, TTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTTask_Output(), this.getTCaseParameter(), null, "output", null, 0, -1, TTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTTask_IsBlocking(), theXMLTypePackage.getBoolean(), "isBlocking", "true", 0, 1, TTask.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tTextAnnotationEClass, TTextAnnotation.class, "TTextAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTTextAnnotation_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, TTextAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTTextAnnotation_TextFormat(), theXMLTypePackage.getString(), "textFormat", null, 0, 1, TTextAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tTimerEventListenerEClass, TTimerEventListener.class, "TTimerEventListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTTimerEventListener_TimerExpression(), this.getTExpression(), null, "timerExpression", null, 0, 1, TTimerEventListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTTimerEventListener_TimerStartGroup(), ecorePackage.getEFeatureMapEntry(), "timerStartGroup", null, 0, 1, TTimerEventListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTTimerEventListener_TimerStart(), this.getTStartTrigger(), null, "timerStart", null, 0, 1, TTimerEventListener.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(tUserEventListenerEClass, TUserEventListener.class, "TUserEventListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTUserEventListener_AuthorizedRoleRefs(), theXMLTypePackage.getIDREFS(), "authorizedRoleRefs", null, 0, 1, TUserEventListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(caseFileItemTransitionEEnum, CaseFileItemTransition.class, "CaseFileItemTransition");
		addEEnumLiteral(caseFileItemTransitionEEnum, CaseFileItemTransition.ADD_CHILD);
		addEEnumLiteral(caseFileItemTransitionEEnum, CaseFileItemTransition.ADD_REFERENCE);
		addEEnumLiteral(caseFileItemTransitionEEnum, CaseFileItemTransition.CREATE);
		addEEnumLiteral(caseFileItemTransitionEEnum, CaseFileItemTransition.DELETE);
		addEEnumLiteral(caseFileItemTransitionEEnum, CaseFileItemTransition.REMOVE_CHILD);
		addEEnumLiteral(caseFileItemTransitionEEnum, CaseFileItemTransition.REMOVE_REFERENCE);
		addEEnumLiteral(caseFileItemTransitionEEnum, CaseFileItemTransition.REPLACE);
		addEEnumLiteral(caseFileItemTransitionEEnum, CaseFileItemTransition.UPDATE);

		initEEnum(decisionTypeEnumMember1EEnum, DecisionTypeEnumMember1.class, "DecisionTypeEnumMember1");
		addEEnumLiteral(decisionTypeEnumMember1EEnum, DecisionTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_DMN1);
		addEEnumLiteral(decisionTypeEnumMember1EEnum, DecisionTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_UNKNOWN);
		addEEnumLiteral(decisionTypeEnumMember1EEnum, DecisionTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_DECISION_TYPE_UNSPECIFIED);

		initEEnum(definitionTypeEnumMember1EEnum, DefinitionTypeEnumMember1.class, "DefinitionTypeEnumMember1");
		addEEnumLiteral(definitionTypeEnumMember1EEnum, DefinitionTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_DEFINITION_TYPE_CMIS_FOLDER);
		addEEnumLiteral(definitionTypeEnumMember1EEnum, DefinitionTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_DEFINITION_TYPE_CMIS_DOCUMENT);
		addEEnumLiteral(definitionTypeEnumMember1EEnum, DefinitionTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_DEFINITION_TYPE_CMIS_RELATIONSHIP);
		addEEnumLiteral(definitionTypeEnumMember1EEnum, DefinitionTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_DEFINITION_TYPE_XSD_ELEMENT);
		addEEnumLiteral(definitionTypeEnumMember1EEnum, DefinitionTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_DEFINITION_TYPE_XSD_COMPLEX_TYPE);
		addEEnumLiteral(definitionTypeEnumMember1EEnum, DefinitionTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_DEFINITION_TYPE_XSD_SIMPLE_TYPE);
		addEEnumLiteral(definitionTypeEnumMember1EEnum, DefinitionTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_DEFINITION_TYPE_WSDL_MESSAGE);
		addEEnumLiteral(definitionTypeEnumMember1EEnum, DefinitionTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_DEFINITION_TYPE_UML_CLASS);
		addEEnumLiteral(definitionTypeEnumMember1EEnum, DefinitionTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_DEFINITION_TYPE_UNKNOWN);
		addEEnumLiteral(definitionTypeEnumMember1EEnum, DefinitionTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_DEFINITION_TYPE_UNSPECIFIED);

		initEEnum(multiplicityEnumEEnum, MultiplicityEnum.class, "MultiplicityEnum");
		addEEnumLiteral(multiplicityEnumEEnum, MultiplicityEnum.ZERO_OR_ONE);
		addEEnumLiteral(multiplicityEnumEEnum, MultiplicityEnum.ZERO_OR_MORE);
		addEEnumLiteral(multiplicityEnumEEnum, MultiplicityEnum.EXACTLY_ONE);
		addEEnumLiteral(multiplicityEnumEEnum, MultiplicityEnum.ONE_OR_MORE);
		addEEnumLiteral(multiplicityEnumEEnum, MultiplicityEnum.UNSPECIFIED);
		addEEnumLiteral(multiplicityEnumEEnum, MultiplicityEnum.UNKNOWN);

		initEEnum(planItemTransitionEEnum, PlanItemTransition.class, "PlanItemTransition");
		addEEnumLiteral(planItemTransitionEEnum, PlanItemTransition.CLOSE);
		addEEnumLiteral(planItemTransitionEEnum, PlanItemTransition.COMPLETE);
		addEEnumLiteral(planItemTransitionEEnum, PlanItemTransition.CREATE);
		addEEnumLiteral(planItemTransitionEEnum, PlanItemTransition.DISABLE);
		addEEnumLiteral(planItemTransitionEEnum, PlanItemTransition.ENABLE);
		addEEnumLiteral(planItemTransitionEEnum, PlanItemTransition.EXIT);
		addEEnumLiteral(planItemTransitionEEnum, PlanItemTransition.FAULT);
		addEEnumLiteral(planItemTransitionEEnum, PlanItemTransition.MANUAL_START);
		addEEnumLiteral(planItemTransitionEEnum, PlanItemTransition.OCCUR);
		addEEnumLiteral(planItemTransitionEEnum, PlanItemTransition.PARENT_RESUME);
		addEEnumLiteral(planItemTransitionEEnum, PlanItemTransition.PARENT_SUSPEND);
		addEEnumLiteral(planItemTransitionEEnum, PlanItemTransition.REACTIVATE);
		addEEnumLiteral(planItemTransitionEEnum, PlanItemTransition.REENABLE);
		addEEnumLiteral(planItemTransitionEEnum, PlanItemTransition.RESUME);
		addEEnumLiteral(planItemTransitionEEnum, PlanItemTransition.START);
		addEEnumLiteral(planItemTransitionEEnum, PlanItemTransition.SUSPEND);
		addEEnumLiteral(planItemTransitionEEnum, PlanItemTransition.TERMINATE);

		initEEnum(processTypeEnumMember1EEnum, ProcessTypeEnumMember1.class, "ProcessTypeEnumMember1");
		addEEnumLiteral(processTypeEnumMember1EEnum, ProcessTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROCESS_TYPE_BPMN20);
		addEEnumLiteral(processTypeEnumMember1EEnum, ProcessTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROCESS_TYPE_XPDL2);
		addEEnumLiteral(processTypeEnumMember1EEnum, ProcessTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROCESS_TYPE_WSBPEL20);
		addEEnumLiteral(processTypeEnumMember1EEnum, ProcessTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROCESS_TYPE_WSBPEL1);
		addEEnumLiteral(processTypeEnumMember1EEnum, ProcessTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROCESS_TYPE_UNKNOWN);
		addEEnumLiteral(processTypeEnumMember1EEnum, ProcessTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROCESS_TYPE_UNSPECIFIED);

		initEEnum(propertyTypeEnumMember1EEnum, PropertyTypeEnumMember1.class, "PropertyTypeEnumMember1");
		addEEnumLiteral(propertyTypeEnumMember1EEnum, PropertyTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROPERTY_TYPE_STRING);
		addEEnumLiteral(propertyTypeEnumMember1EEnum, PropertyTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROPERTY_TYPE_BOOLEAN);
		addEEnumLiteral(propertyTypeEnumMember1EEnum, PropertyTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROPERTY_TYPE_INTEGER);
		addEEnumLiteral(propertyTypeEnumMember1EEnum, PropertyTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROPERTY_TYPE_FLOAT);
		addEEnumLiteral(propertyTypeEnumMember1EEnum, PropertyTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROPERTY_TYPE_DECIMAL);
		addEEnumLiteral(propertyTypeEnumMember1EEnum, PropertyTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROPERTY_TYPE_DOUBLE);
		addEEnumLiteral(propertyTypeEnumMember1EEnum, PropertyTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROPERTY_TYPE_DURATION);
		addEEnumLiteral(propertyTypeEnumMember1EEnum, PropertyTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROPERTY_TYPE_DATE_TIME);
		addEEnumLiteral(propertyTypeEnumMember1EEnum, PropertyTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROPERTY_TYPE_TIME);
		addEEnumLiteral(propertyTypeEnumMember1EEnum, PropertyTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROPERTY_TYPE_DATE);
		addEEnumLiteral(propertyTypeEnumMember1EEnum, PropertyTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROPERTY_TYPE_GYEAR_MONTH);
		addEEnumLiteral(propertyTypeEnumMember1EEnum, PropertyTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROPERTY_TYPE_GYEAR);
		addEEnumLiteral(propertyTypeEnumMember1EEnum, PropertyTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROPERTY_TYPE_GMONTH_DAY);
		addEEnumLiteral(propertyTypeEnumMember1EEnum, PropertyTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROPERTY_TYPE_GDAY);
		addEEnumLiteral(propertyTypeEnumMember1EEnum, PropertyTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROPERTY_TYPE_GMONTH);
		addEEnumLiteral(propertyTypeEnumMember1EEnum, PropertyTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROPERTY_TYPE_HEX_BINARY);
		addEEnumLiteral(propertyTypeEnumMember1EEnum, PropertyTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROPERTY_TYPE_BASE64_BINARY);
		addEEnumLiteral(propertyTypeEnumMember1EEnum, PropertyTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROPERTY_TYPE_ANY_URI);
		addEEnumLiteral(propertyTypeEnumMember1EEnum, PropertyTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROPERTY_TYPE_QNAME);
		addEEnumLiteral(propertyTypeEnumMember1EEnum, PropertyTypeEnumMember1.HTTP_WWW_OMG_ORG_SPEC_CMMN_PROPERTY_TYPE_UNSPECIFIED);

		initEEnum(tAssociationDirectionEEnum, TAssociationDirection.class, "TAssociationDirection");
		addEEnumLiteral(tAssociationDirectionEEnum, TAssociationDirection.NONE);
		addEEnumLiteral(tAssociationDirectionEEnum, TAssociationDirection.ONE);
		addEEnumLiteral(tAssociationDirectionEEnum, TAssociationDirection.BOTH);

		initEEnum(tRelationshipDirectionEEnum, TRelationshipDirection.class, "TRelationshipDirection");
		addEEnumLiteral(tRelationshipDirectionEEnum, TRelationshipDirection.NONE);
		addEEnumLiteral(tRelationshipDirectionEEnum, TRelationshipDirection.FORWARD);
		addEEnumLiteral(tRelationshipDirectionEEnum, TRelationshipDirection.BACKWARD);
		addEEnumLiteral(tRelationshipDirectionEEnum, TRelationshipDirection.BOTH);

		// Initialize data types
		initEDataType(caseFileItemTransitionObjectEDataType, CaseFileItemTransition.class, "CaseFileItemTransitionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(decisionTypeEnumEDataType, Object.class, "DecisionTypeEnum", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(decisionTypeEnumMember1ObjectEDataType, DecisionTypeEnumMember1.class, "DecisionTypeEnumMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(definitionTypeEnumEDataType, Object.class, "DefinitionTypeEnum", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(definitionTypeEnumMember1ObjectEDataType, DefinitionTypeEnumMember1.class, "DefinitionTypeEnumMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(multiplicityEnumObjectEDataType, MultiplicityEnum.class, "MultiplicityEnumObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(planItemTransitionObjectEDataType, PlanItemTransition.class, "PlanItemTransitionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(processTypeEnumEDataType, Object.class, "ProcessTypeEnum", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(processTypeEnumMember1ObjectEDataType, ProcessTypeEnumMember1.class, "ProcessTypeEnumMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(propertyTypeEnumEDataType, Object.class, "PropertyTypeEnum", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(propertyTypeEnumMember1ObjectEDataType, PropertyTypeEnumMember1.class, "PropertyTypeEnumMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tAssociationDirectionObjectEDataType, TAssociationDirection.class, "TAssociationDirectionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tRelationshipDirectionObjectEDataType, TRelationshipDirection.class, "TRelationshipDirectionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (caseFileItemTransitionEEnum,
		   source,
		   new String[] {
			   "name", "CaseFileItemTransition"
		   });
		addAnnotation
		  (caseFileItemTransitionObjectEDataType,
		   source,
		   new String[] {
			   "name", "CaseFileItemTransition:Object",
			   "baseType", "CaseFileItemTransition"
		   });
		addAnnotation
		  (decisionTypeEnumEDataType,
		   source,
		   new String[] {
			   "name", "DecisionTypeEnum",
			   "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#anyURI DecisionTypeEnum_._member_._1"
		   });
		addAnnotation
		  (decisionTypeEnumMember1EEnum,
		   source,
		   new String[] {
			   "name", "DecisionTypeEnum_._member_._1"
		   });
		addAnnotation
		  (decisionTypeEnumMember1ObjectEDataType,
		   source,
		   new String[] {
			   "name", "DecisionTypeEnum_._member_._1:Object",
			   "baseType", "DecisionTypeEnum_._member_._1"
		   });
		addAnnotation
		  (definitionTypeEnumEDataType,
		   source,
		   new String[] {
			   "name", "DefinitionTypeEnum",
			   "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#anyURI DefinitionTypeEnum_._member_._1"
		   });
		addAnnotation
		  (definitionTypeEnumMember1EEnum,
		   source,
		   new String[] {
			   "name", "DefinitionTypeEnum_._member_._1"
		   });
		addAnnotation
		  (definitionTypeEnumMember1ObjectEDataType,
		   source,
		   new String[] {
			   "name", "DefinitionTypeEnum_._member_._1:Object",
			   "baseType", "DefinitionTypeEnum_._member_._1"
		   });
		addAnnotation
		  (caseModelRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getCaseModelRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getCaseModelRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getCaseModelRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getCaseModelRoot_ApplicabilityRule(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "applicabilityRule",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_Artifact(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "artifact",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_Association(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "association",
			   "namespace", "##targetNamespace",
			   "affiliation", "artifact"
		   });
		addAnnotation
		  (getCaseModelRoot_Case(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "case",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_CaseFile(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "caseFile",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_CaseFileItem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "caseFileItem",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_CaseFileItemDefinition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "caseFileItemDefinition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_CaseFileItemOnPart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "caseFileItemOnPart",
			   "namespace", "##targetNamespace",
			   "affiliation", "onPart"
		   });
		addAnnotation
		  (getCaseModelRoot_OnPart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "onPart",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_CaseFileItemStartTrigger(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "caseFileItemStartTrigger",
			   "namespace", "##targetNamespace",
			   "affiliation", "timerStart"
		   });
		addAnnotation
		  (getCaseModelRoot_TimerStart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "timerStart",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_CaseParameter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "caseParameter",
			   "namespace", "##targetNamespace",
			   "affiliation", "parameter"
		   });
		addAnnotation
		  (getCaseModelRoot_Parameter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "parameter",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_CaseTask(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "caseTask",
			   "namespace", "##targetNamespace",
			   "affiliation", "task"
		   });
		addAnnotation
		  (getCaseModelRoot_Task(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "task",
			   "namespace", "##targetNamespace",
			   "affiliation", "planItemDefinition"
		   });
		addAnnotation
		  (getCaseModelRoot_PlanItemDefinition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "planItemDefinition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_Decision(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decision",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_DecisionParameter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decisionParameter",
			   "namespace", "##targetNamespace",
			   "affiliation", "parameter"
		   });
		addAnnotation
		  (getCaseModelRoot_DecisionTask(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decisionTask",
			   "namespace", "##targetNamespace",
			   "affiliation", "task"
		   });
		addAnnotation
		  (getCaseModelRoot_Definitions(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "definitions",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_DiscretionaryItem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "discretionaryItem",
			   "namespace", "##targetNamespace",
			   "affiliation", "tableItem"
		   });
		addAnnotation
		  (getCaseModelRoot_TableItem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tableItem",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_Documentation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "documentation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_EntryCriterion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "entryCriterion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_EventListener(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "eventListener",
			   "namespace", "##targetNamespace",
			   "affiliation", "planItemDefinition"
		   });
		addAnnotation
		  (getCaseModelRoot_ExitCriterion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "exitCriterion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_Expression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "expression",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_ExtensionElements(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "extensionElements",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_HumanTask(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "humanTask",
			   "namespace", "##targetNamespace",
			   "affiliation", "task"
		   });
		addAnnotation
		  (getCaseModelRoot_IfPart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ifPart",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_Import(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "import",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_ManualActivationRule(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "manualActivationRule",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_Milestone(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "milestone",
			   "namespace", "##targetNamespace",
			   "affiliation", "planItemDefinition"
		   });
		addAnnotation
		  (getCaseModelRoot_ParameterMapping(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "parameterMapping",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_PlanFragment(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "planFragment",
			   "namespace", "##targetNamespace",
			   "affiliation", "planItemDefinition"
		   });
		addAnnotation
		  (getCaseModelRoot_PlanItem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "planItem",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_PlanItemControl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "planItemControl",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_PlanItemOnPart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "planItemOnPart",
			   "namespace", "##targetNamespace",
			   "affiliation", "onPart"
		   });
		addAnnotation
		  (getCaseModelRoot_PlanItemStartTrigger(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "planItemStartTrigger",
			   "namespace", "##targetNamespace",
			   "affiliation", "timerStart"
		   });
		addAnnotation
		  (getCaseModelRoot_PlanningTable(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "planningTable",
			   "namespace", "##targetNamespace",
			   "affiliation", "tableItem"
		   });
		addAnnotation
		  (getCaseModelRoot_Process(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "process",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_ProcessParameter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "processParameter",
			   "namespace", "##targetNamespace",
			   "affiliation", "parameter"
		   });
		addAnnotation
		  (getCaseModelRoot_ProcessTask(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "processTask",
			   "namespace", "##targetNamespace",
			   "affiliation", "task"
		   });
		addAnnotation
		  (getCaseModelRoot_Property(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "property",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_Relationship(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "relationship",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_RepetitionRule(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "repetitionRule",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_RequiredRule(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "requiredRule",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_Role(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "role",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_Sentry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sentry",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getCaseModelRoot_Stage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "stage",
			   "namespace", "##targetNamespace",
			   "affiliation", "planItemDefinition"
		   });
		addAnnotation
		  (getCaseModelRoot_TextAnnotation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "textAnnotation",
			   "namespace", "##targetNamespace",
			   "affiliation", "artifact"
		   });
		addAnnotation
		  (getCaseModelRoot_TimerEventListener(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "timerEventListener",
			   "namespace", "##targetNamespace",
			   "affiliation", "eventListener"
		   });
		addAnnotation
		  (getCaseModelRoot_UserEventListener(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "userEventListener",
			   "namespace", "##targetNamespace",
			   "affiliation", "eventListener"
		   });
		addAnnotation
		  (multiplicityEnumEEnum,
		   source,
		   new String[] {
			   "name", "MultiplicityEnum"
		   });
		addAnnotation
		  (multiplicityEnumObjectEDataType,
		   source,
		   new String[] {
			   "name", "MultiplicityEnum:Object",
			   "baseType", "MultiplicityEnum"
		   });
		addAnnotation
		  (planItemTransitionEEnum,
		   source,
		   new String[] {
			   "name", "PlanItemTransition"
		   });
		addAnnotation
		  (planItemTransitionObjectEDataType,
		   source,
		   new String[] {
			   "name", "PlanItemTransition:Object",
			   "baseType", "PlanItemTransition"
		   });
		addAnnotation
		  (processTypeEnumEDataType,
		   source,
		   new String[] {
			   "name", "ProcessTypeEnum",
			   "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#anyURI ProcessTypeEnum_._member_._1"
		   });
		addAnnotation
		  (processTypeEnumMember1EEnum,
		   source,
		   new String[] {
			   "name", "ProcessTypeEnum_._member_._1"
		   });
		addAnnotation
		  (processTypeEnumMember1ObjectEDataType,
		   source,
		   new String[] {
			   "name", "ProcessTypeEnum_._member_._1:Object",
			   "baseType", "ProcessTypeEnum_._member_._1"
		   });
		addAnnotation
		  (propertyTypeEnumEDataType,
		   source,
		   new String[] {
			   "name", "PropertyTypeEnum",
			   "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#anyURI PropertyTypeEnum_._member_._1"
		   });
		addAnnotation
		  (propertyTypeEnumMember1EEnum,
		   source,
		   new String[] {
			   "name", "PropertyTypeEnum_._member_._1"
		   });
		addAnnotation
		  (propertyTypeEnumMember1ObjectEDataType,
		   source,
		   new String[] {
			   "name", "PropertyTypeEnum_._member_._1:Object",
			   "baseType", "PropertyTypeEnum_._member_._1"
		   });
		addAnnotation
		  (tApplicabilityRuleEClass,
		   source,
		   new String[] {
			   "name", "tApplicabilityRule",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTApplicabilityRule_Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "condition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTApplicabilityRule_ContextRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "contextRef"
		   });
		addAnnotation
		  (getTApplicabilityRule_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (tArtifactEClass,
		   source,
		   new String[] {
			   "name", "tArtifact",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (tAssociationEClass,
		   source,
		   new String[] {
			   "name", "tAssociation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTAssociation_AssociationDirection(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "associationDirection"
		   });
		addAnnotation
		  (getTAssociation_SourceRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "sourceRef"
		   });
		addAnnotation
		  (getTAssociation_TargetRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "targetRef"
		   });
		addAnnotation
		  (tAssociationDirectionEEnum,
		   source,
		   new String[] {
			   "name", "tAssociationDirection"
		   });
		addAnnotation
		  (tAssociationDirectionObjectEDataType,
		   source,
		   new String[] {
			   "name", "tAssociationDirection:Object",
			   "baseType", "tAssociationDirection"
		   });
		addAnnotation
		  (tCaseEClass,
		   source,
		   new String[] {
			   "name", "tCase",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTCase_CaseFileModel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "caseFileModel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTCase_CasePlanModel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "casePlanModel",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTCase_CaseRoles(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "caseRoles",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTCase_Input(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "input",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTCase_Output(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "output",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTCase_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (tCaseFileEClass,
		   source,
		   new String[] {
			   "name", "tCaseFile",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTCaseFile_CaseFileItem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "caseFileItem",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tCaseFileItemEClass,
		   source,
		   new String[] {
			   "name", "tCaseFileItem",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTCaseFileItem_Children(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "children",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTCaseFileItem_DefinitionRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "definitionRef"
		   });
		addAnnotation
		  (getTCaseFileItem_Multiplicity(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "multiplicity"
		   });
		addAnnotation
		  (getTCaseFileItem_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getTCaseFileItem_SourceRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "sourceRef"
		   });
		addAnnotation
		  (getTCaseFileItem_TargetRefs(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "targetRefs"
		   });
		addAnnotation
		  (tCaseFileItemDefinitionEClass,
		   source,
		   new String[] {
			   "name", "tCaseFileItemDefinition",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTCaseFileItemDefinition_Property(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "property",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTCaseFileItemDefinition_DefinitionType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "definitionType"
		   });
		addAnnotation
		  (getTCaseFileItemDefinition_ImportRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "importRef"
		   });
		addAnnotation
		  (getTCaseFileItemDefinition_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getTCaseFileItemDefinition_StructureRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "structureRef"
		   });
		addAnnotation
		  (tCaseFileItemOnPartEClass,
		   source,
		   new String[] {
			   "name", "tCaseFileItemOnPart",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTCaseFileItemOnPart_StandardEvent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "standardEvent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTCaseFileItemOnPart_SourceRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "sourceRef"
		   });
		addAnnotation
		  (tCaseFileItemStartTriggerEClass,
		   source,
		   new String[] {
			   "name", "tCaseFileItemStartTrigger",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTCaseFileItemStartTrigger_StandardEvent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "standardEvent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTCaseFileItemStartTrigger_SourceRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "sourceRef"
		   });
		addAnnotation
		  (tCaseParameterEClass,
		   source,
		   new String[] {
			   "name", "tCaseParameter",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTCaseParameter_BindingRefinement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "bindingRefinement",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTCaseParameter_BindingRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "bindingRef"
		   });
		addAnnotation
		  (tCaseRolesEClass,
		   source,
		   new String[] {
			   "name", "tCaseRoles",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTCaseRoles_Role(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "role",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tCaseTaskEClass,
		   source,
		   new String[] {
			   "name", "tCaseTask",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTCaseTask_ParameterMapping(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "parameterMapping",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTCaseTask_CaseRefExpression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "caseRefExpression",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTCaseTask_CaseRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "caseRef"
		   });
		addAnnotation
		  (tChildrenEClass,
		   source,
		   new String[] {
			   "name", "tChildren",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTChildren_CaseFileItem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "caseFileItem",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tCmmnElementEClass,
		   source,
		   new String[] {
			   "name", "tCmmnElement",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTCmmnElement_Documentation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "documentation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTCmmnElement_ExtensionElements(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "extensionElements",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTCmmnElement_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getTCmmnElement_AnyAttribute(),
		   source,
		   new String[] {
			   "kind", "attributeWildcard",
			   "wildcards", "##other",
			   "name", ":3",
			   "processing", "lax"
		   });
		addAnnotation
		  (tCmmnElementWithMixedContentEClass,
		   source,
		   new String[] {
			   "name", "tCmmnElementWithMixedContent",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getTCmmnElementWithMixedContent_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getTCmmnElementWithMixedContent_Documentation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "documentation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTCmmnElementWithMixedContent_ExtensionElements(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "extensionElements",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTCmmnElementWithMixedContent_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getTCmmnElementWithMixedContent_AnyAttribute(),
		   source,
		   new String[] {
			   "kind", "attributeWildcard",
			   "wildcards", "##other",
			   "name", ":4",
			   "processing", "lax"
		   });
		addAnnotation
		  (tCriterionEClass,
		   source,
		   new String[] {
			   "name", "tCriterion",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTCriterion_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getTCriterion_SentryRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "sentryRef"
		   });
		addAnnotation
		  (tDecisionEClass,
		   source,
		   new String[] {
			   "name", "tDecision",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTDecision_Input(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "input",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecision_Output(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "output",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecision_ExternalRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "externalRef"
		   });
		addAnnotation
		  (getTDecision_ImplementationType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "implementationType"
		   });
		addAnnotation
		  (getTDecision_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (tDecisionParameterEClass,
		   source,
		   new String[] {
			   "name", "tDecisionParameter",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (tDecisionTaskEClass,
		   source,
		   new String[] {
			   "name", "tDecisionTask",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTDecisionTask_ParameterMapping(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "parameterMapping",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecisionTask_DecisionRefExpression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decisionRefExpression",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDecisionTask_DecisionRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "decisionRef"
		   });
		addAnnotation
		  (tDefinitionsEClass,
		   source,
		   new String[] {
			   "name", "tDefinitions",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTDefinitions_Import(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "import",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDefinitions_CaseFileItemDefinition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "caseFileItemDefinition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDefinitions_Case(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "case",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDefinitions_Process(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "process",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDefinitions_Decision(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "decision",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDefinitions_ExtensionElements(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "extensionElements",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDefinitions_Relationship(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "relationship",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDefinitions_ArtifactGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "artifact:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDefinitions_Artifact(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "artifact",
			   "namespace", "##targetNamespace",
			   "group", "artifact:group"
		   });
		addAnnotation
		  (getTDefinitions_CMMNDI(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CMMNDI",
			   "namespace", "http://www.omg.org/spec/CMMN/20151109/CMMNDI"
		   });
		addAnnotation
		  (getTDefinitions_Author(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "author"
		   });
		addAnnotation
		  (getTDefinitions_CreationDate(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "creationDate"
		   });
		addAnnotation
		  (getTDefinitions_Exporter(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "exporter"
		   });
		addAnnotation
		  (getTDefinitions_ExporterVersion(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "exporterVersion"
		   });
		addAnnotation
		  (getTDefinitions_ExpressionLanguage(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "expressionLanguage"
		   });
		addAnnotation
		  (getTDefinitions_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getTDefinitions_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getTDefinitions_TargetNamespace(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "targetNamespace"
		   });
		addAnnotation
		  (getTDefinitions_AnyAttribute(),
		   source,
		   new String[] {
			   "kind", "attributeWildcard",
			   "wildcards", "##other",
			   "name", ":18",
			   "processing", "lax"
		   });
		addAnnotation
		  (tDiscretionaryItemEClass,
		   source,
		   new String[] {
			   "name", "tDiscretionaryItem",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTDiscretionaryItem_ItemControl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "itemControl",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDiscretionaryItem_EntryCriterion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "entryCriterion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDiscretionaryItem_ExitCriterion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "exitCriterion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTDiscretionaryItem_DefinitionRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "definitionRef"
		   });
		addAnnotation
		  (getTDiscretionaryItem_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (tDocumentationEClass,
		   source,
		   new String[] {
			   "name", "tDocumentation",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getTDocumentation_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getTDocumentation_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##any",
			   "name", ":1",
			   "processing", "lax"
		   });
		addAnnotation
		  (getTDocumentation_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getTDocumentation_TextFormat(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "textFormat"
		   });
		addAnnotation
		  (tEntryCriterionEClass,
		   source,
		   new String[] {
			   "name", "tEntryCriterion",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (tEventListenerEClass,
		   source,
		   new String[] {
			   "name", "tEventListener",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (tExitCriterionEClass,
		   source,
		   new String[] {
			   "name", "tExitCriterion",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (tExpressionEClass,
		   source,
		   new String[] {
			   "name", "tExpression",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getTExpression_Language(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "language"
		   });
		addAnnotation
		  (tExtensionElementsEClass,
		   source,
		   new String[] {
			   "name", "tExtensionElements",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTExtensionElements_Any(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "wildcards", "##other",
			   "name", ":0",
			   "processing", "lax"
		   });
		addAnnotation
		  (tHumanTaskEClass,
		   source,
		   new String[] {
			   "name", "tHumanTask",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTHumanTask_PlanningTable(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "planningTable",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTHumanTask_PerformerRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "performerRef"
		   });
		addAnnotation
		  (tIfPartEClass,
		   source,
		   new String[] {
			   "name", "tIfPart",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTIfPart_Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "condition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTIfPart_ContextRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "contextRef"
		   });
		addAnnotation
		  (tImportEClass,
		   source,
		   new String[] {
			   "name", "tImport",
			   "kind", "empty"
		   });
		addAnnotation
		  (getTImport_ImportType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "importType"
		   });
		addAnnotation
		  (getTImport_Location(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "location"
		   });
		addAnnotation
		  (getTImport_Namespace(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "namespace"
		   });
		addAnnotation
		  (tManualActivationRuleEClass,
		   source,
		   new String[] {
			   "name", "tManualActivationRule",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTManualActivationRule_Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "condition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTManualActivationRule_ContextRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "contextRef"
		   });
		addAnnotation
		  (getTManualActivationRule_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (tMilestoneEClass,
		   source,
		   new String[] {
			   "name", "tMilestone",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (tOnPartEClass,
		   source,
		   new String[] {
			   "name", "tOnPart",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTOnPart_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (tParameterEClass,
		   source,
		   new String[] {
			   "name", "tParameter",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTParameter_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (tParameterMappingEClass,
		   source,
		   new String[] {
			   "name", "tParameterMapping",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTParameterMapping_Transformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "transformation",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTParameterMapping_SourceRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "sourceRef"
		   });
		addAnnotation
		  (getTParameterMapping_TargetRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "targetRef"
		   });
		addAnnotation
		  (tPlanFragmentEClass,
		   source,
		   new String[] {
			   "name", "tPlanFragment",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTPlanFragment_PlanItem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "planItem",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTPlanFragment_Sentry(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "sentry",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tPlanItemEClass,
		   source,
		   new String[] {
			   "name", "tPlanItem",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTPlanItem_ItemControl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "itemControl",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTPlanItem_EntryCriterion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "entryCriterion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTPlanItem_ExitCriterion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "exitCriterion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTPlanItem_DefinitionRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "definitionRef"
		   });
		addAnnotation
		  (getTPlanItem_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (tPlanItemControlEClass,
		   source,
		   new String[] {
			   "name", "tPlanItemControl",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTPlanItemControl_RepetitionRule(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "repetitionRule",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTPlanItemControl_RequiredRule(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "requiredRule",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTPlanItemControl_ManualActivationRule(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "manualActivationRule",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tPlanItemDefinitionEClass,
		   source,
		   new String[] {
			   "name", "tPlanItemDefinition",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTPlanItemDefinition_DefaultControl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "defaultControl",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTPlanItemDefinition_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (tPlanItemOnPartEClass,
		   source,
		   new String[] {
			   "name", "tPlanItemOnPart",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTPlanItemOnPart_StandardEvent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "standardEvent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTPlanItemOnPart_ExitCriterionRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "exitCriterionRef"
		   });
		addAnnotation
		  (getTPlanItemOnPart_SourceRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "sourceRef"
		   });
		addAnnotation
		  (tPlanItemStartTriggerEClass,
		   source,
		   new String[] {
			   "name", "tPlanItemStartTrigger",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTPlanItemStartTrigger_StandardEvent(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "standardEvent",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTPlanItemStartTrigger_SourceRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "sourceRef"
		   });
		addAnnotation
		  (tPlanningTableEClass,
		   source,
		   new String[] {
			   "name", "tPlanningTable",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTPlanningTable_TableItemGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "tableItem:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTPlanningTable_TableItem(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "tableItem",
			   "namespace", "##targetNamespace",
			   "group", "tableItem:group"
		   });
		addAnnotation
		  (getTPlanningTable_ApplicabilityRule(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "applicabilityRule",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (tProcessEClass,
		   source,
		   new String[] {
			   "name", "tProcess",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTProcess_Input(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "input",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTProcess_Output(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "output",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTProcess_ExternalRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "externalRef"
		   });
		addAnnotation
		  (getTProcess_ImplementationType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "implementationType"
		   });
		addAnnotation
		  (getTProcess_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (tProcessParameterEClass,
		   source,
		   new String[] {
			   "name", "tProcessParameter",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (tProcessTaskEClass,
		   source,
		   new String[] {
			   "name", "tProcessTask",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTProcessTask_ParameterMapping(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "parameterMapping",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTProcessTask_ProcessRefExpression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "processRefExpression",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTProcessTask_ProcessRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "processRef"
		   });
		addAnnotation
		  (tPropertyEClass,
		   source,
		   new String[] {
			   "name", "tProperty",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTProperty_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (getTProperty_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (tRelationshipEClass,
		   source,
		   new String[] {
			   "name", "tRelationship",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTRelationship_Source(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "source",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTRelationship_Target(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "target",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTRelationship_Direction(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "direction"
		   });
		addAnnotation
		  (getTRelationship_Type(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "type"
		   });
		addAnnotation
		  (tRelationshipDirectionEEnum,
		   source,
		   new String[] {
			   "name", "tRelationshipDirection"
		   });
		addAnnotation
		  (tRelationshipDirectionObjectEDataType,
		   source,
		   new String[] {
			   "name", "tRelationshipDirection:Object",
			   "baseType", "tRelationshipDirection"
		   });
		addAnnotation
		  (tRepetitionRuleEClass,
		   source,
		   new String[] {
			   "name", "tRepetitionRule",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTRepetitionRule_Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "condition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTRepetitionRule_ContextRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "contextRef"
		   });
		addAnnotation
		  (getTRepetitionRule_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (tRequiredRuleEClass,
		   source,
		   new String[] {
			   "name", "tRequiredRule",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTRequiredRule_Condition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "condition",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTRequiredRule_ContextRef(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "contextRef"
		   });
		addAnnotation
		  (getTRequiredRule_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (tRoleEClass,
		   source,
		   new String[] {
			   "name", "tRole",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTRole_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (tSentryEClass,
		   source,
		   new String[] {
			   "name", "tSentry",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTSentry_OnPartGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "onPart:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTSentry_OnPart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "onPart",
			   "namespace", "##targetNamespace",
			   "group", "onPart:group"
		   });
		addAnnotation
		  (getTSentry_IfPart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ifPart",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTSentry_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "name"
		   });
		addAnnotation
		  (tStageEClass,
		   source,
		   new String[] {
			   "name", "tStage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTStage_PlanningTable(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "planningTable",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTStage_PlanItemDefinitionGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "planItemDefinition:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTStage_PlanItemDefinition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "planItemDefinition",
			   "namespace", "##targetNamespace",
			   "group", "planItemDefinition:group"
		   });
		addAnnotation
		  (getTStage_ExitCriterion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "exitCriterion",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTStage_AutoComplete(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "autoComplete"
		   });
		addAnnotation
		  (tStartTriggerEClass,
		   source,
		   new String[] {
			   "name", "tStartTrigger",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (tTableItemEClass,
		   source,
		   new String[] {
			   "name", "tTableItem",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTTableItem_ApplicabilityRuleRefs(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "applicabilityRuleRefs"
		   });
		addAnnotation
		  (getTTableItem_AuthorizedRoleRefs(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "authorizedRoleRefs"
		   });
		addAnnotation
		  (tTaskEClass,
		   source,
		   new String[] {
			   "name", "tTask",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTTask_Input(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "input",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTTask_Output(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "output",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTTask_IsBlocking(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "isBlocking"
		   });
		addAnnotation
		  (tTextAnnotationEClass,
		   source,
		   new String[] {
			   "name", "tTextAnnotation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTTextAnnotation_Text(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "text",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTTextAnnotation_TextFormat(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "textFormat"
		   });
		addAnnotation
		  (tTimerEventListenerEClass,
		   source,
		   new String[] {
			   "name", "tTimerEventListener",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTTimerEventListener_TimerExpression(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "timerExpression",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTTimerEventListener_TimerStartGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "timerStart:group",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getTTimerEventListener_TimerStart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "timerStart",
			   "namespace", "##targetNamespace",
			   "group", "timerStart:group"
		   });
		addAnnotation
		  (tUserEventListenerEClass,
		   source,
		   new String[] {
			   "name", "tUserEventListener",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTUserEventListener_AuthorizedRoleRefs(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "authorizedRoleRefs"
		   });
	}

} //CaseModelPackageImpl
