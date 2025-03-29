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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.omg.spec.cmmn.casemodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CaseModelFactoryImpl extends EFactoryImpl implements CaseModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CaseModelFactory init() {
		try {
			CaseModelFactory theCaseModelFactory = (CaseModelFactory)EPackage.Registry.INSTANCE.getEFactory(CaseModelPackage.eNS_URI);
			if (theCaseModelFactory != null) {
				return theCaseModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CaseModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseModelFactoryImpl() {
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
			case CaseModelPackage.CASE_MODEL_ROOT: return createCaseModelRoot();
			case CaseModelPackage.TAPPLICABILITY_RULE: return createTApplicabilityRule();
			case CaseModelPackage.TASSOCIATION: return createTAssociation();
			case CaseModelPackage.TCASE: return createTCase();
			case CaseModelPackage.TCASE_FILE: return createTCaseFile();
			case CaseModelPackage.TCASE_FILE_ITEM: return createTCaseFileItem();
			case CaseModelPackage.TCASE_FILE_ITEM_DEFINITION: return createTCaseFileItemDefinition();
			case CaseModelPackage.TCASE_FILE_ITEM_ON_PART: return createTCaseFileItemOnPart();
			case CaseModelPackage.TCASE_FILE_ITEM_START_TRIGGER: return createTCaseFileItemStartTrigger();
			case CaseModelPackage.TCASE_PARAMETER: return createTCaseParameter();
			case CaseModelPackage.TCASE_ROLES: return createTCaseRoles();
			case CaseModelPackage.TCASE_TASK: return createTCaseTask();
			case CaseModelPackage.TCHILDREN: return createTChildren();
			case CaseModelPackage.TDECISION: return createTDecision();
			case CaseModelPackage.TDECISION_PARAMETER: return createTDecisionParameter();
			case CaseModelPackage.TDECISION_TASK: return createTDecisionTask();
			case CaseModelPackage.TDEFINITIONS: return createTDefinitions();
			case CaseModelPackage.TDISCRETIONARY_ITEM: return createTDiscretionaryItem();
			case CaseModelPackage.TDOCUMENTATION: return createTDocumentation();
			case CaseModelPackage.TENTRY_CRITERION: return createTEntryCriterion();
			case CaseModelPackage.TEVENT_LISTENER: return createTEventListener();
			case CaseModelPackage.TEXIT_CRITERION: return createTExitCriterion();
			case CaseModelPackage.TEXPRESSION: return createTExpression();
			case CaseModelPackage.TEXTENSION_ELEMENTS: return createTExtensionElements();
			case CaseModelPackage.THUMAN_TASK: return createTHumanTask();
			case CaseModelPackage.TIF_PART: return createTIfPart();
			case CaseModelPackage.TIMPORT: return createTImport();
			case CaseModelPackage.TMANUAL_ACTIVATION_RULE: return createTManualActivationRule();
			case CaseModelPackage.TMILESTONE: return createTMilestone();
			case CaseModelPackage.TPARAMETER_MAPPING: return createTParameterMapping();
			case CaseModelPackage.TPLAN_FRAGMENT: return createTPlanFragment();
			case CaseModelPackage.TPLAN_ITEM: return createTPlanItem();
			case CaseModelPackage.TPLAN_ITEM_CONTROL: return createTPlanItemControl();
			case CaseModelPackage.TPLAN_ITEM_ON_PART: return createTPlanItemOnPart();
			case CaseModelPackage.TPLAN_ITEM_START_TRIGGER: return createTPlanItemStartTrigger();
			case CaseModelPackage.TPLANNING_TABLE: return createTPlanningTable();
			case CaseModelPackage.TPROCESS: return createTProcess();
			case CaseModelPackage.TPROCESS_PARAMETER: return createTProcessParameter();
			case CaseModelPackage.TPROCESS_TASK: return createTProcessTask();
			case CaseModelPackage.TPROPERTY: return createTProperty();
			case CaseModelPackage.TRELATIONSHIP: return createTRelationship();
			case CaseModelPackage.TREPETITION_RULE: return createTRepetitionRule();
			case CaseModelPackage.TREQUIRED_RULE: return createTRequiredRule();
			case CaseModelPackage.TROLE: return createTRole();
			case CaseModelPackage.TSENTRY: return createTSentry();
			case CaseModelPackage.TSTAGE: return createTStage();
			case CaseModelPackage.TTASK: return createTTask();
			case CaseModelPackage.TTEXT_ANNOTATION: return createTTextAnnotation();
			case CaseModelPackage.TTIMER_EVENT_LISTENER: return createTTimerEventListener();
			case CaseModelPackage.TUSER_EVENT_LISTENER: return createTUserEventListener();
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
			case CaseModelPackage.CASE_FILE_ITEM_TRANSITION:
				return createCaseFileItemTransitionFromString(eDataType, initialValue);
			case CaseModelPackage.DECISION_TYPE_ENUM_MEMBER1:
				return createDecisionTypeEnumMember1FromString(eDataType, initialValue);
			case CaseModelPackage.DEFINITION_TYPE_ENUM_MEMBER1:
				return createDefinitionTypeEnumMember1FromString(eDataType, initialValue);
			case CaseModelPackage.MULTIPLICITY_ENUM:
				return createMultiplicityEnumFromString(eDataType, initialValue);
			case CaseModelPackage.PLAN_ITEM_TRANSITION:
				return createPlanItemTransitionFromString(eDataType, initialValue);
			case CaseModelPackage.PROCESS_TYPE_ENUM_MEMBER1:
				return createProcessTypeEnumMember1FromString(eDataType, initialValue);
			case CaseModelPackage.PROPERTY_TYPE_ENUM_MEMBER1:
				return createPropertyTypeEnumMember1FromString(eDataType, initialValue);
			case CaseModelPackage.TASSOCIATION_DIRECTION:
				return createTAssociationDirectionFromString(eDataType, initialValue);
			case CaseModelPackage.TRELATIONSHIP_DIRECTION:
				return createTRelationshipDirectionFromString(eDataType, initialValue);
			case CaseModelPackage.CASE_FILE_ITEM_TRANSITION_OBJECT:
				return createCaseFileItemTransitionObjectFromString(eDataType, initialValue);
			case CaseModelPackage.DECISION_TYPE_ENUM:
				return createDecisionTypeEnumFromString(eDataType, initialValue);
			case CaseModelPackage.DECISION_TYPE_ENUM_MEMBER1_OBJECT:
				return createDecisionTypeEnumMember1ObjectFromString(eDataType, initialValue);
			case CaseModelPackage.DEFINITION_TYPE_ENUM:
				return createDefinitionTypeEnumFromString(eDataType, initialValue);
			case CaseModelPackage.DEFINITION_TYPE_ENUM_MEMBER1_OBJECT:
				return createDefinitionTypeEnumMember1ObjectFromString(eDataType, initialValue);
			case CaseModelPackage.MULTIPLICITY_ENUM_OBJECT:
				return createMultiplicityEnumObjectFromString(eDataType, initialValue);
			case CaseModelPackage.PLAN_ITEM_TRANSITION_OBJECT:
				return createPlanItemTransitionObjectFromString(eDataType, initialValue);
			case CaseModelPackage.PROCESS_TYPE_ENUM:
				return createProcessTypeEnumFromString(eDataType, initialValue);
			case CaseModelPackage.PROCESS_TYPE_ENUM_MEMBER1_OBJECT:
				return createProcessTypeEnumMember1ObjectFromString(eDataType, initialValue);
			case CaseModelPackage.PROPERTY_TYPE_ENUM:
				return createPropertyTypeEnumFromString(eDataType, initialValue);
			case CaseModelPackage.PROPERTY_TYPE_ENUM_MEMBER1_OBJECT:
				return createPropertyTypeEnumMember1ObjectFromString(eDataType, initialValue);
			case CaseModelPackage.TASSOCIATION_DIRECTION_OBJECT:
				return createTAssociationDirectionObjectFromString(eDataType, initialValue);
			case CaseModelPackage.TRELATIONSHIP_DIRECTION_OBJECT:
				return createTRelationshipDirectionObjectFromString(eDataType, initialValue);
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
			case CaseModelPackage.CASE_FILE_ITEM_TRANSITION:
				return convertCaseFileItemTransitionToString(eDataType, instanceValue);
			case CaseModelPackage.DECISION_TYPE_ENUM_MEMBER1:
				return convertDecisionTypeEnumMember1ToString(eDataType, instanceValue);
			case CaseModelPackage.DEFINITION_TYPE_ENUM_MEMBER1:
				return convertDefinitionTypeEnumMember1ToString(eDataType, instanceValue);
			case CaseModelPackage.MULTIPLICITY_ENUM:
				return convertMultiplicityEnumToString(eDataType, instanceValue);
			case CaseModelPackage.PLAN_ITEM_TRANSITION:
				return convertPlanItemTransitionToString(eDataType, instanceValue);
			case CaseModelPackage.PROCESS_TYPE_ENUM_MEMBER1:
				return convertProcessTypeEnumMember1ToString(eDataType, instanceValue);
			case CaseModelPackage.PROPERTY_TYPE_ENUM_MEMBER1:
				return convertPropertyTypeEnumMember1ToString(eDataType, instanceValue);
			case CaseModelPackage.TASSOCIATION_DIRECTION:
				return convertTAssociationDirectionToString(eDataType, instanceValue);
			case CaseModelPackage.TRELATIONSHIP_DIRECTION:
				return convertTRelationshipDirectionToString(eDataType, instanceValue);
			case CaseModelPackage.CASE_FILE_ITEM_TRANSITION_OBJECT:
				return convertCaseFileItemTransitionObjectToString(eDataType, instanceValue);
			case CaseModelPackage.DECISION_TYPE_ENUM:
				return convertDecisionTypeEnumToString(eDataType, instanceValue);
			case CaseModelPackage.DECISION_TYPE_ENUM_MEMBER1_OBJECT:
				return convertDecisionTypeEnumMember1ObjectToString(eDataType, instanceValue);
			case CaseModelPackage.DEFINITION_TYPE_ENUM:
				return convertDefinitionTypeEnumToString(eDataType, instanceValue);
			case CaseModelPackage.DEFINITION_TYPE_ENUM_MEMBER1_OBJECT:
				return convertDefinitionTypeEnumMember1ObjectToString(eDataType, instanceValue);
			case CaseModelPackage.MULTIPLICITY_ENUM_OBJECT:
				return convertMultiplicityEnumObjectToString(eDataType, instanceValue);
			case CaseModelPackage.PLAN_ITEM_TRANSITION_OBJECT:
				return convertPlanItemTransitionObjectToString(eDataType, instanceValue);
			case CaseModelPackage.PROCESS_TYPE_ENUM:
				return convertProcessTypeEnumToString(eDataType, instanceValue);
			case CaseModelPackage.PROCESS_TYPE_ENUM_MEMBER1_OBJECT:
				return convertProcessTypeEnumMember1ObjectToString(eDataType, instanceValue);
			case CaseModelPackage.PROPERTY_TYPE_ENUM:
				return convertPropertyTypeEnumToString(eDataType, instanceValue);
			case CaseModelPackage.PROPERTY_TYPE_ENUM_MEMBER1_OBJECT:
				return convertPropertyTypeEnumMember1ObjectToString(eDataType, instanceValue);
			case CaseModelPackage.TASSOCIATION_DIRECTION_OBJECT:
				return convertTAssociationDirectionObjectToString(eDataType, instanceValue);
			case CaseModelPackage.TRELATIONSHIP_DIRECTION_OBJECT:
				return convertTRelationshipDirectionObjectToString(eDataType, instanceValue);
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
	public CaseModelRoot createCaseModelRoot() {
		CaseModelRootImpl caseModelRoot = new CaseModelRootImpl();
		return caseModelRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TApplicabilityRule createTApplicabilityRule() {
		TApplicabilityRuleImpl tApplicabilityRule = new TApplicabilityRuleImpl();
		return tApplicabilityRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAssociation createTAssociation() {
		TAssociationImpl tAssociation = new TAssociationImpl();
		return tAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCase createTCase() {
		TCaseImpl tCase = new TCaseImpl();
		return tCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCaseFile createTCaseFile() {
		TCaseFileImpl tCaseFile = new TCaseFileImpl();
		return tCaseFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCaseFileItem createTCaseFileItem() {
		TCaseFileItemImpl tCaseFileItem = new TCaseFileItemImpl();
		return tCaseFileItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCaseFileItemDefinition createTCaseFileItemDefinition() {
		TCaseFileItemDefinitionImpl tCaseFileItemDefinition = new TCaseFileItemDefinitionImpl();
		return tCaseFileItemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCaseFileItemOnPart createTCaseFileItemOnPart() {
		TCaseFileItemOnPartImpl tCaseFileItemOnPart = new TCaseFileItemOnPartImpl();
		return tCaseFileItemOnPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCaseFileItemStartTrigger createTCaseFileItemStartTrigger() {
		TCaseFileItemStartTriggerImpl tCaseFileItemStartTrigger = new TCaseFileItemStartTriggerImpl();
		return tCaseFileItemStartTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCaseParameter createTCaseParameter() {
		TCaseParameterImpl tCaseParameter = new TCaseParameterImpl();
		return tCaseParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCaseRoles createTCaseRoles() {
		TCaseRolesImpl tCaseRoles = new TCaseRolesImpl();
		return tCaseRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCaseTask createTCaseTask() {
		TCaseTaskImpl tCaseTask = new TCaseTaskImpl();
		return tCaseTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TChildren createTChildren() {
		TChildrenImpl tChildren = new TChildrenImpl();
		return tChildren;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDecision createTDecision() {
		TDecisionImpl tDecision = new TDecisionImpl();
		return tDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDecisionParameter createTDecisionParameter() {
		TDecisionParameterImpl tDecisionParameter = new TDecisionParameterImpl();
		return tDecisionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDecisionTask createTDecisionTask() {
		TDecisionTaskImpl tDecisionTask = new TDecisionTaskImpl();
		return tDecisionTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDefinitions createTDefinitions() {
		TDefinitionsImpl tDefinitions = new TDefinitionsImpl();
		return tDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDiscretionaryItem createTDiscretionaryItem() {
		TDiscretionaryItemImpl tDiscretionaryItem = new TDiscretionaryItemImpl();
		return tDiscretionaryItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDocumentation createTDocumentation() {
		TDocumentationImpl tDocumentation = new TDocumentationImpl();
		return tDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEntryCriterion createTEntryCriterion() {
		TEntryCriterionImpl tEntryCriterion = new TEntryCriterionImpl();
		return tEntryCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEventListener createTEventListener() {
		TEventListenerImpl tEventListener = new TEventListenerImpl();
		return tEventListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExitCriterion createTExitCriterion() {
		TExitCriterionImpl tExitCriterion = new TExitCriterionImpl();
		return tExitCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExpression createTExpression() {
		TExpressionImpl tExpression = new TExpressionImpl();
		return tExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExtensionElements createTExtensionElements() {
		TExtensionElementsImpl tExtensionElements = new TExtensionElementsImpl();
		return tExtensionElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public THumanTask createTHumanTask() {
		THumanTaskImpl tHumanTask = new THumanTaskImpl();
		return tHumanTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TIfPart createTIfPart() {
		TIfPartImpl tIfPart = new TIfPartImpl();
		return tIfPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TImport createTImport() {
		TImportImpl tImport = new TImportImpl();
		return tImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TManualActivationRule createTManualActivationRule() {
		TManualActivationRuleImpl tManualActivationRule = new TManualActivationRuleImpl();
		return tManualActivationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMilestone createTMilestone() {
		TMilestoneImpl tMilestone = new TMilestoneImpl();
		return tMilestone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TParameterMapping createTParameterMapping() {
		TParameterMappingImpl tParameterMapping = new TParameterMappingImpl();
		return tParameterMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPlanFragment createTPlanFragment() {
		TPlanFragmentImpl tPlanFragment = new TPlanFragmentImpl();
		return tPlanFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPlanItem createTPlanItem() {
		TPlanItemImpl tPlanItem = new TPlanItemImpl();
		return tPlanItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPlanItemControl createTPlanItemControl() {
		TPlanItemControlImpl tPlanItemControl = new TPlanItemControlImpl();
		return tPlanItemControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPlanItemOnPart createTPlanItemOnPart() {
		TPlanItemOnPartImpl tPlanItemOnPart = new TPlanItemOnPartImpl();
		return tPlanItemOnPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPlanItemStartTrigger createTPlanItemStartTrigger() {
		TPlanItemStartTriggerImpl tPlanItemStartTrigger = new TPlanItemStartTriggerImpl();
		return tPlanItemStartTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPlanningTable createTPlanningTable() {
		TPlanningTableImpl tPlanningTable = new TPlanningTableImpl();
		return tPlanningTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TProcess createTProcess() {
		TProcessImpl tProcess = new TProcessImpl();
		return tProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TProcessParameter createTProcessParameter() {
		TProcessParameterImpl tProcessParameter = new TProcessParameterImpl();
		return tProcessParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TProcessTask createTProcessTask() {
		TProcessTaskImpl tProcessTask = new TProcessTaskImpl();
		return tProcessTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TProperty createTProperty() {
		TPropertyImpl tProperty = new TPropertyImpl();
		return tProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRelationship createTRelationship() {
		TRelationshipImpl tRelationship = new TRelationshipImpl();
		return tRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRepetitionRule createTRepetitionRule() {
		TRepetitionRuleImpl tRepetitionRule = new TRepetitionRuleImpl();
		return tRepetitionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRequiredRule createTRequiredRule() {
		TRequiredRuleImpl tRequiredRule = new TRequiredRuleImpl();
		return tRequiredRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRole createTRole() {
		TRoleImpl tRole = new TRoleImpl();
		return tRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSentry createTSentry() {
		TSentryImpl tSentry = new TSentryImpl();
		return tSentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TStage createTStage() {
		TStageImpl tStage = new TStageImpl();
		return tStage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTask createTTask() {
		TTaskImpl tTask = new TTaskImpl();
		return tTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTextAnnotation createTTextAnnotation() {
		TTextAnnotationImpl tTextAnnotation = new TTextAnnotationImpl();
		return tTextAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTimerEventListener createTTimerEventListener() {
		TTimerEventListenerImpl tTimerEventListener = new TTimerEventListenerImpl();
		return tTimerEventListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TUserEventListener createTUserEventListener() {
		TUserEventListenerImpl tUserEventListener = new TUserEventListenerImpl();
		return tUserEventListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseFileItemTransition createCaseFileItemTransitionFromString(EDataType eDataType, String initialValue) {
		CaseFileItemTransition result = CaseFileItemTransition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCaseFileItemTransitionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionTypeEnumMember1 createDecisionTypeEnumMember1FromString(EDataType eDataType, String initialValue) {
		DecisionTypeEnumMember1 result = DecisionTypeEnumMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecisionTypeEnumMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionTypeEnumMember1 createDefinitionTypeEnumMember1FromString(EDataType eDataType, String initialValue) {
		DefinitionTypeEnumMember1 result = DefinitionTypeEnumMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefinitionTypeEnumMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityEnum createMultiplicityEnumFromString(EDataType eDataType, String initialValue) {
		MultiplicityEnum result = MultiplicityEnum.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityEnumToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanItemTransition createPlanItemTransitionFromString(EDataType eDataType, String initialValue) {
		PlanItemTransition result = PlanItemTransition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanItemTransitionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessTypeEnumMember1 createProcessTypeEnumMember1FromString(EDataType eDataType, String initialValue) {
		ProcessTypeEnumMember1 result = ProcessTypeEnumMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessTypeEnumMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyTypeEnumMember1 createPropertyTypeEnumMember1FromString(EDataType eDataType, String initialValue) {
		PropertyTypeEnumMember1 result = PropertyTypeEnumMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeEnumMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAssociationDirection createTAssociationDirectionFromString(EDataType eDataType, String initialValue) {
		TAssociationDirection result = TAssociationDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTAssociationDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRelationshipDirection createTRelationshipDirectionFromString(EDataType eDataType, String initialValue) {
		TRelationshipDirection result = TRelationshipDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRelationshipDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseFileItemTransition createCaseFileItemTransitionObjectFromString(EDataType eDataType, String initialValue) {
		return createCaseFileItemTransitionFromString(CaseModelPackage.Literals.CASE_FILE_ITEM_TRANSITION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCaseFileItemTransitionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCaseFileItemTransitionToString(CaseModelPackage.Literals.CASE_FILE_ITEM_TRANSITION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createDecisionTypeEnumFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createDecisionTypeEnumMember1FromString(CaseModelPackage.Literals.DECISION_TYPE_ENUM_MEMBER1, initialValue);
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
	public String convertDecisionTypeEnumToString(EDataType eDataType, Object instanceValue) {
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
		if (CaseModelPackage.Literals.DECISION_TYPE_ENUM_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertDecisionTypeEnumMember1ToString(CaseModelPackage.Literals.DECISION_TYPE_ENUM_MEMBER1, instanceValue);
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
	public DecisionTypeEnumMember1 createDecisionTypeEnumMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createDecisionTypeEnumMember1FromString(CaseModelPackage.Literals.DECISION_TYPE_ENUM_MEMBER1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecisionTypeEnumMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDecisionTypeEnumMember1ToString(CaseModelPackage.Literals.DECISION_TYPE_ENUM_MEMBER1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createDefinitionTypeEnumFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createDefinitionTypeEnumMember1FromString(CaseModelPackage.Literals.DEFINITION_TYPE_ENUM_MEMBER1, initialValue);
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
	public String convertDefinitionTypeEnumToString(EDataType eDataType, Object instanceValue) {
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
		if (CaseModelPackage.Literals.DEFINITION_TYPE_ENUM_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertDefinitionTypeEnumMember1ToString(CaseModelPackage.Literals.DEFINITION_TYPE_ENUM_MEMBER1, instanceValue);
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
	public DefinitionTypeEnumMember1 createDefinitionTypeEnumMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createDefinitionTypeEnumMember1FromString(CaseModelPackage.Literals.DEFINITION_TYPE_ENUM_MEMBER1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDefinitionTypeEnumMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDefinitionTypeEnumMember1ToString(CaseModelPackage.Literals.DEFINITION_TYPE_ENUM_MEMBER1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityEnum createMultiplicityEnumObjectFromString(EDataType eDataType, String initialValue) {
		return createMultiplicityEnumFromString(CaseModelPackage.Literals.MULTIPLICITY_ENUM, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityEnumObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMultiplicityEnumToString(CaseModelPackage.Literals.MULTIPLICITY_ENUM, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanItemTransition createPlanItemTransitionObjectFromString(EDataType eDataType, String initialValue) {
		return createPlanItemTransitionFromString(CaseModelPackage.Literals.PLAN_ITEM_TRANSITION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanItemTransitionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPlanItemTransitionToString(CaseModelPackage.Literals.PLAN_ITEM_TRANSITION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createProcessTypeEnumFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createProcessTypeEnumMember1FromString(CaseModelPackage.Literals.PROCESS_TYPE_ENUM_MEMBER1, initialValue);
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
	public String convertProcessTypeEnumToString(EDataType eDataType, Object instanceValue) {
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
		if (CaseModelPackage.Literals.PROCESS_TYPE_ENUM_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertProcessTypeEnumMember1ToString(CaseModelPackage.Literals.PROCESS_TYPE_ENUM_MEMBER1, instanceValue);
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
	public ProcessTypeEnumMember1 createProcessTypeEnumMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createProcessTypeEnumMember1FromString(CaseModelPackage.Literals.PROCESS_TYPE_ENUM_MEMBER1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessTypeEnumMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertProcessTypeEnumMember1ToString(CaseModelPackage.Literals.PROCESS_TYPE_ENUM_MEMBER1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createPropertyTypeEnumFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createPropertyTypeEnumMember1FromString(CaseModelPackage.Literals.PROPERTY_TYPE_ENUM_MEMBER1, initialValue);
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
	public String convertPropertyTypeEnumToString(EDataType eDataType, Object instanceValue) {
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
		if (CaseModelPackage.Literals.PROPERTY_TYPE_ENUM_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertPropertyTypeEnumMember1ToString(CaseModelPackage.Literals.PROPERTY_TYPE_ENUM_MEMBER1, instanceValue);
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
	public PropertyTypeEnumMember1 createPropertyTypeEnumMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createPropertyTypeEnumMember1FromString(CaseModelPackage.Literals.PROPERTY_TYPE_ENUM_MEMBER1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyTypeEnumMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPropertyTypeEnumMember1ToString(CaseModelPackage.Literals.PROPERTY_TYPE_ENUM_MEMBER1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAssociationDirection createTAssociationDirectionObjectFromString(EDataType eDataType, String initialValue) {
		return createTAssociationDirectionFromString(CaseModelPackage.Literals.TASSOCIATION_DIRECTION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTAssociationDirectionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTAssociationDirectionToString(CaseModelPackage.Literals.TASSOCIATION_DIRECTION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRelationshipDirection createTRelationshipDirectionObjectFromString(EDataType eDataType, String initialValue) {
		return createTRelationshipDirectionFromString(CaseModelPackage.Literals.TRELATIONSHIP_DIRECTION, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRelationshipDirectionObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTRelationshipDirectionToString(CaseModelPackage.Literals.TRELATIONSHIP_DIRECTION, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CaseModelPackage getCaseModelPackage() {
		return (CaseModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CaseModelPackage getPackage() {
		return CaseModelPackage.eINSTANCE;
	}

} //CaseModelFactoryImpl
