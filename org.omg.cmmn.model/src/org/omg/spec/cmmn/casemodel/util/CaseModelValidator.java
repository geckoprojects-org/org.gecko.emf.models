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
package org.omg.spec.cmmn.casemodel.util;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.omg.spec.cmmn.casemodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage
 * @generated
 */
public class CaseModelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CaseModelValidator INSTANCE = new CaseModelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.omg.spec.cmmn.casemodel";

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
	public CaseModelValidator() {
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
	  return CaseModelPackage.eINSTANCE;
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
			case CaseModelPackage.CASE_MODEL_ROOT:
				return validateCaseModelRoot((CaseModelRoot)value, diagnostics, context);
			case CaseModelPackage.TAPPLICABILITY_RULE:
				return validateTApplicabilityRule((TApplicabilityRule)value, diagnostics, context);
			case CaseModelPackage.TARTIFACT:
				return validateTArtifact((TArtifact)value, diagnostics, context);
			case CaseModelPackage.TASSOCIATION:
				return validateTAssociation((TAssociation)value, diagnostics, context);
			case CaseModelPackage.TCASE:
				return validateTCase((TCase)value, diagnostics, context);
			case CaseModelPackage.TCASE_FILE:
				return validateTCaseFile((TCaseFile)value, diagnostics, context);
			case CaseModelPackage.TCASE_FILE_ITEM:
				return validateTCaseFileItem((TCaseFileItem)value, diagnostics, context);
			case CaseModelPackage.TCASE_FILE_ITEM_DEFINITION:
				return validateTCaseFileItemDefinition((TCaseFileItemDefinition)value, diagnostics, context);
			case CaseModelPackage.TCASE_FILE_ITEM_ON_PART:
				return validateTCaseFileItemOnPart((TCaseFileItemOnPart)value, diagnostics, context);
			case CaseModelPackage.TCASE_FILE_ITEM_START_TRIGGER:
				return validateTCaseFileItemStartTrigger((TCaseFileItemStartTrigger)value, diagnostics, context);
			case CaseModelPackage.TCASE_PARAMETER:
				return validateTCaseParameter((TCaseParameter)value, diagnostics, context);
			case CaseModelPackage.TCASE_ROLES:
				return validateTCaseRoles((TCaseRoles)value, diagnostics, context);
			case CaseModelPackage.TCASE_TASK:
				return validateTCaseTask((TCaseTask)value, diagnostics, context);
			case CaseModelPackage.TCHILDREN:
				return validateTChildren((TChildren)value, diagnostics, context);
			case CaseModelPackage.TCMMN_ELEMENT:
				return validateTCmmnElement((TCmmnElement)value, diagnostics, context);
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT:
				return validateTCmmnElementWithMixedContent((TCmmnElementWithMixedContent)value, diagnostics, context);
			case CaseModelPackage.TCRITERION:
				return validateTCriterion((TCriterion)value, diagnostics, context);
			case CaseModelPackage.TDECISION:
				return validateTDecision((TDecision)value, diagnostics, context);
			case CaseModelPackage.TDECISION_PARAMETER:
				return validateTDecisionParameter((TDecisionParameter)value, diagnostics, context);
			case CaseModelPackage.TDECISION_TASK:
				return validateTDecisionTask((TDecisionTask)value, diagnostics, context);
			case CaseModelPackage.TDEFINITIONS:
				return validateTDefinitions((TDefinitions)value, diagnostics, context);
			case CaseModelPackage.TDISCRETIONARY_ITEM:
				return validateTDiscretionaryItem((TDiscretionaryItem)value, diagnostics, context);
			case CaseModelPackage.TDOCUMENTATION:
				return validateTDocumentation((TDocumentation)value, diagnostics, context);
			case CaseModelPackage.TENTRY_CRITERION:
				return validateTEntryCriterion((TEntryCriterion)value, diagnostics, context);
			case CaseModelPackage.TEVENT_LISTENER:
				return validateTEventListener((TEventListener)value, diagnostics, context);
			case CaseModelPackage.TEXIT_CRITERION:
				return validateTExitCriterion((TExitCriterion)value, diagnostics, context);
			case CaseModelPackage.TEXPRESSION:
				return validateTExpression((TExpression)value, diagnostics, context);
			case CaseModelPackage.TEXTENSION_ELEMENTS:
				return validateTExtensionElements((TExtensionElements)value, diagnostics, context);
			case CaseModelPackage.THUMAN_TASK:
				return validateTHumanTask((THumanTask)value, diagnostics, context);
			case CaseModelPackage.TIF_PART:
				return validateTIfPart((TIfPart)value, diagnostics, context);
			case CaseModelPackage.TIMPORT:
				return validateTImport((TImport)value, diagnostics, context);
			case CaseModelPackage.TMANUAL_ACTIVATION_RULE:
				return validateTManualActivationRule((TManualActivationRule)value, diagnostics, context);
			case CaseModelPackage.TMILESTONE:
				return validateTMilestone((TMilestone)value, diagnostics, context);
			case CaseModelPackage.TON_PART:
				return validateTOnPart((TOnPart)value, diagnostics, context);
			case CaseModelPackage.TPARAMETER:
				return validateTParameter((TParameter)value, diagnostics, context);
			case CaseModelPackage.TPARAMETER_MAPPING:
				return validateTParameterMapping((TParameterMapping)value, diagnostics, context);
			case CaseModelPackage.TPLAN_FRAGMENT:
				return validateTPlanFragment((TPlanFragment)value, diagnostics, context);
			case CaseModelPackage.TPLAN_ITEM:
				return validateTPlanItem((TPlanItem)value, diagnostics, context);
			case CaseModelPackage.TPLAN_ITEM_CONTROL:
				return validateTPlanItemControl((TPlanItemControl)value, diagnostics, context);
			case CaseModelPackage.TPLAN_ITEM_DEFINITION:
				return validateTPlanItemDefinition((TPlanItemDefinition)value, diagnostics, context);
			case CaseModelPackage.TPLAN_ITEM_ON_PART:
				return validateTPlanItemOnPart((TPlanItemOnPart)value, diagnostics, context);
			case CaseModelPackage.TPLAN_ITEM_START_TRIGGER:
				return validateTPlanItemStartTrigger((TPlanItemStartTrigger)value, diagnostics, context);
			case CaseModelPackage.TPLANNING_TABLE:
				return validateTPlanningTable((TPlanningTable)value, diagnostics, context);
			case CaseModelPackage.TPROCESS:
				return validateTProcess((TProcess)value, diagnostics, context);
			case CaseModelPackage.TPROCESS_PARAMETER:
				return validateTProcessParameter((TProcessParameter)value, diagnostics, context);
			case CaseModelPackage.TPROCESS_TASK:
				return validateTProcessTask((TProcessTask)value, diagnostics, context);
			case CaseModelPackage.TPROPERTY:
				return validateTProperty((TProperty)value, diagnostics, context);
			case CaseModelPackage.TRELATIONSHIP:
				return validateTRelationship((TRelationship)value, diagnostics, context);
			case CaseModelPackage.TREPETITION_RULE:
				return validateTRepetitionRule((TRepetitionRule)value, diagnostics, context);
			case CaseModelPackage.TREQUIRED_RULE:
				return validateTRequiredRule((TRequiredRule)value, diagnostics, context);
			case CaseModelPackage.TROLE:
				return validateTRole((TRole)value, diagnostics, context);
			case CaseModelPackage.TSENTRY:
				return validateTSentry((TSentry)value, diagnostics, context);
			case CaseModelPackage.TSTAGE:
				return validateTStage((TStage)value, diagnostics, context);
			case CaseModelPackage.TSTART_TRIGGER:
				return validateTStartTrigger((TStartTrigger)value, diagnostics, context);
			case CaseModelPackage.TTABLE_ITEM:
				return validateTTableItem((TTableItem)value, diagnostics, context);
			case CaseModelPackage.TTASK:
				return validateTTask((TTask)value, diagnostics, context);
			case CaseModelPackage.TTEXT_ANNOTATION:
				return validateTTextAnnotation((TTextAnnotation)value, diagnostics, context);
			case CaseModelPackage.TTIMER_EVENT_LISTENER:
				return validateTTimerEventListener((TTimerEventListener)value, diagnostics, context);
			case CaseModelPackage.TUSER_EVENT_LISTENER:
				return validateTUserEventListener((TUserEventListener)value, diagnostics, context);
			case CaseModelPackage.CASE_FILE_ITEM_TRANSITION:
				return validateCaseFileItemTransition((CaseFileItemTransition)value, diagnostics, context);
			case CaseModelPackage.DECISION_TYPE_ENUM_MEMBER1:
				return validateDecisionTypeEnumMember1((DecisionTypeEnumMember1)value, diagnostics, context);
			case CaseModelPackage.DEFINITION_TYPE_ENUM_MEMBER1:
				return validateDefinitionTypeEnumMember1((DefinitionTypeEnumMember1)value, diagnostics, context);
			case CaseModelPackage.MULTIPLICITY_ENUM:
				return validateMultiplicityEnum((MultiplicityEnum)value, diagnostics, context);
			case CaseModelPackage.PLAN_ITEM_TRANSITION:
				return validatePlanItemTransition((PlanItemTransition)value, diagnostics, context);
			case CaseModelPackage.PROCESS_TYPE_ENUM_MEMBER1:
				return validateProcessTypeEnumMember1((ProcessTypeEnumMember1)value, diagnostics, context);
			case CaseModelPackage.PROPERTY_TYPE_ENUM_MEMBER1:
				return validatePropertyTypeEnumMember1((PropertyTypeEnumMember1)value, diagnostics, context);
			case CaseModelPackage.TASSOCIATION_DIRECTION:
				return validateTAssociationDirection((TAssociationDirection)value, diagnostics, context);
			case CaseModelPackage.TRELATIONSHIP_DIRECTION:
				return validateTRelationshipDirection((TRelationshipDirection)value, diagnostics, context);
			case CaseModelPackage.CASE_FILE_ITEM_TRANSITION_OBJECT:
				return validateCaseFileItemTransitionObject((CaseFileItemTransition)value, diagnostics, context);
			case CaseModelPackage.DECISION_TYPE_ENUM:
				return validateDecisionTypeEnum(value, diagnostics, context);
			case CaseModelPackage.DECISION_TYPE_ENUM_MEMBER1_OBJECT:
				return validateDecisionTypeEnumMember1Object((DecisionTypeEnumMember1)value, diagnostics, context);
			case CaseModelPackage.DEFINITION_TYPE_ENUM:
				return validateDefinitionTypeEnum(value, diagnostics, context);
			case CaseModelPackage.DEFINITION_TYPE_ENUM_MEMBER1_OBJECT:
				return validateDefinitionTypeEnumMember1Object((DefinitionTypeEnumMember1)value, diagnostics, context);
			case CaseModelPackage.MULTIPLICITY_ENUM_OBJECT:
				return validateMultiplicityEnumObject((MultiplicityEnum)value, diagnostics, context);
			case CaseModelPackage.PLAN_ITEM_TRANSITION_OBJECT:
				return validatePlanItemTransitionObject((PlanItemTransition)value, diagnostics, context);
			case CaseModelPackage.PROCESS_TYPE_ENUM:
				return validateProcessTypeEnum(value, diagnostics, context);
			case CaseModelPackage.PROCESS_TYPE_ENUM_MEMBER1_OBJECT:
				return validateProcessTypeEnumMember1Object((ProcessTypeEnumMember1)value, diagnostics, context);
			case CaseModelPackage.PROPERTY_TYPE_ENUM:
				return validatePropertyTypeEnum(value, diagnostics, context);
			case CaseModelPackage.PROPERTY_TYPE_ENUM_MEMBER1_OBJECT:
				return validatePropertyTypeEnumMember1Object((PropertyTypeEnumMember1)value, diagnostics, context);
			case CaseModelPackage.TASSOCIATION_DIRECTION_OBJECT:
				return validateTAssociationDirectionObject((TAssociationDirection)value, diagnostics, context);
			case CaseModelPackage.TRELATIONSHIP_DIRECTION_OBJECT:
				return validateTRelationshipDirectionObject((TRelationshipDirection)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaseModelRoot(CaseModelRoot caseModelRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(caseModelRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTApplicabilityRule(TApplicabilityRule tApplicabilityRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tApplicabilityRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTArtifact(TArtifact tArtifact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tArtifact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAssociation(TAssociation tAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tAssociation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCase(TCase tCase, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tCase, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCaseFile(TCaseFile tCaseFile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tCaseFile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCaseFileItem(TCaseFileItem tCaseFileItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tCaseFileItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCaseFileItemDefinition(TCaseFileItemDefinition tCaseFileItemDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tCaseFileItemDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCaseFileItemOnPart(TCaseFileItemOnPart tCaseFileItemOnPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tCaseFileItemOnPart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCaseFileItemStartTrigger(TCaseFileItemStartTrigger tCaseFileItemStartTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tCaseFileItemStartTrigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCaseParameter(TCaseParameter tCaseParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tCaseParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCaseRoles(TCaseRoles tCaseRoles, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tCaseRoles, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCaseTask(TCaseTask tCaseTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tCaseTask, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTChildren(TChildren tChildren, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tChildren, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCmmnElement(TCmmnElement tCmmnElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tCmmnElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCmmnElementWithMixedContent(TCmmnElementWithMixedContent tCmmnElementWithMixedContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tCmmnElementWithMixedContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCriterion(TCriterion tCriterion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tCriterion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDecision(TDecision tDecision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDecision, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDecisionParameter(TDecisionParameter tDecisionParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDecisionParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDecisionTask(TDecisionTask tDecisionTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDecisionTask, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDefinitions(TDefinitions tDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDefinitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDiscretionaryItem(TDiscretionaryItem tDiscretionaryItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDiscretionaryItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDocumentation(TDocumentation tDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEntryCriterion(TEntryCriterion tEntryCriterion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tEntryCriterion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEventListener(TEventListener tEventListener, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tEventListener, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExitCriterion(TExitCriterion tExitCriterion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tExitCriterion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExpression(TExpression tExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExtensionElements(TExtensionElements tExtensionElements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tExtensionElements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTHumanTask(THumanTask tHumanTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tHumanTask, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTIfPart(TIfPart tIfPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tIfPart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTImport(TImport tImport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tImport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTManualActivationRule(TManualActivationRule tManualActivationRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tManualActivationRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTMilestone(TMilestone tMilestone, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tMilestone, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTOnPart(TOnPart tOnPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tOnPart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTParameter(TParameter tParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTParameterMapping(TParameterMapping tParameterMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tParameterMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPlanFragment(TPlanFragment tPlanFragment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tPlanFragment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPlanItem(TPlanItem tPlanItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tPlanItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPlanItemControl(TPlanItemControl tPlanItemControl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tPlanItemControl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPlanItemDefinition(TPlanItemDefinition tPlanItemDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tPlanItemDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPlanItemOnPart(TPlanItemOnPart tPlanItemOnPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tPlanItemOnPart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPlanItemStartTrigger(TPlanItemStartTrigger tPlanItemStartTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tPlanItemStartTrigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPlanningTable(TPlanningTable tPlanningTable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tPlanningTable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTProcess(TProcess tProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tProcess, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTProcessParameter(TProcessParameter tProcessParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tProcessParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTProcessTask(TProcessTask tProcessTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tProcessTask, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTProperty(TProperty tProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRelationship(TRelationship tRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRepetitionRule(TRepetitionRule tRepetitionRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tRepetitionRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRequiredRule(TRequiredRule tRequiredRule, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tRequiredRule, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRole(TRole tRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tRole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTSentry(TSentry tSentry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tSentry, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTStage(TStage tStage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tStage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTStartTrigger(TStartTrigger tStartTrigger, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tStartTrigger, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTableItem(TTableItem tTableItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tTableItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTask(TTask tTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tTask, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTextAnnotation(TTextAnnotation tTextAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tTextAnnotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTimerEventListener(TTimerEventListener tTimerEventListener, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tTimerEventListener, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTUserEventListener(TUserEventListener tUserEventListener, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tUserEventListener, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaseFileItemTransition(CaseFileItemTransition caseFileItemTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionTypeEnumMember1(DecisionTypeEnumMember1 decisionTypeEnumMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinitionTypeEnumMember1(DefinitionTypeEnumMember1 definitionTypeEnumMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityEnum(MultiplicityEnum multiplicityEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanItemTransition(PlanItemTransition planItemTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessTypeEnumMember1(ProcessTypeEnumMember1 processTypeEnumMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyTypeEnumMember1(PropertyTypeEnumMember1 propertyTypeEnumMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAssociationDirection(TAssociationDirection tAssociationDirection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRelationshipDirection(TRelationshipDirection tRelationshipDirection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaseFileItemTransitionObject(CaseFileItemTransition caseFileItemTransitionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionTypeEnum(Object decisionTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDecisionTypeEnum_MemberTypes(decisionTypeEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Decision Type Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionTypeEnum_MemberTypes(Object decisionTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.ANY_URI.isInstance(decisionTypeEnum)) {
				if (xmlTypeValidator.validateAnyURI((String)decisionTypeEnum, tempDiagnostics, context)) return true;
			}
			if (CaseModelPackage.Literals.DECISION_TYPE_ENUM_MEMBER1.isInstance(decisionTypeEnum)) {
				if (validateDecisionTypeEnumMember1((DecisionTypeEnumMember1)decisionTypeEnum, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.ANY_URI.isInstance(decisionTypeEnum)) {
				if (xmlTypeValidator.validateAnyURI((String)decisionTypeEnum, null, context)) return true;
			}
			if (CaseModelPackage.Literals.DECISION_TYPE_ENUM_MEMBER1.isInstance(decisionTypeEnum)) {
				if (validateDecisionTypeEnumMember1((DecisionTypeEnumMember1)decisionTypeEnum, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecisionTypeEnumMember1Object(DecisionTypeEnumMember1 decisionTypeEnumMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinitionTypeEnum(Object definitionTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateDefinitionTypeEnum_MemberTypes(definitionTypeEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Definition Type Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinitionTypeEnum_MemberTypes(Object definitionTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.ANY_URI.isInstance(definitionTypeEnum)) {
				if (xmlTypeValidator.validateAnyURI((String)definitionTypeEnum, tempDiagnostics, context)) return true;
			}
			if (CaseModelPackage.Literals.DEFINITION_TYPE_ENUM_MEMBER1.isInstance(definitionTypeEnum)) {
				if (validateDefinitionTypeEnumMember1((DefinitionTypeEnumMember1)definitionTypeEnum, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.ANY_URI.isInstance(definitionTypeEnum)) {
				if (xmlTypeValidator.validateAnyURI((String)definitionTypeEnum, null, context)) return true;
			}
			if (CaseModelPackage.Literals.DEFINITION_TYPE_ENUM_MEMBER1.isInstance(definitionTypeEnum)) {
				if (validateDefinitionTypeEnumMember1((DefinitionTypeEnumMember1)definitionTypeEnum, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinitionTypeEnumMember1Object(DefinitionTypeEnumMember1 definitionTypeEnumMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiplicityEnumObject(MultiplicityEnum multiplicityEnumObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanItemTransitionObject(PlanItemTransition planItemTransitionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessTypeEnum(Object processTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateProcessTypeEnum_MemberTypes(processTypeEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Process Type Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessTypeEnum_MemberTypes(Object processTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.ANY_URI.isInstance(processTypeEnum)) {
				if (xmlTypeValidator.validateAnyURI((String)processTypeEnum, tempDiagnostics, context)) return true;
			}
			if (CaseModelPackage.Literals.PROCESS_TYPE_ENUM_MEMBER1.isInstance(processTypeEnum)) {
				if (validateProcessTypeEnumMember1((ProcessTypeEnumMember1)processTypeEnum, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.ANY_URI.isInstance(processTypeEnum)) {
				if (xmlTypeValidator.validateAnyURI((String)processTypeEnum, null, context)) return true;
			}
			if (CaseModelPackage.Literals.PROCESS_TYPE_ENUM_MEMBER1.isInstance(processTypeEnum)) {
				if (validateProcessTypeEnumMember1((ProcessTypeEnumMember1)processTypeEnum, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessTypeEnumMember1Object(ProcessTypeEnumMember1 processTypeEnumMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyTypeEnum(Object propertyTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePropertyTypeEnum_MemberTypes(propertyTypeEnum, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Property Type Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyTypeEnum_MemberTypes(Object propertyTypeEnum, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (XMLTypePackage.Literals.ANY_URI.isInstance(propertyTypeEnum)) {
				if (xmlTypeValidator.validateAnyURI((String)propertyTypeEnum, tempDiagnostics, context)) return true;
			}
			if (CaseModelPackage.Literals.PROPERTY_TYPE_ENUM_MEMBER1.isInstance(propertyTypeEnum)) {
				if (validatePropertyTypeEnumMember1((PropertyTypeEnumMember1)propertyTypeEnum, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (XMLTypePackage.Literals.ANY_URI.isInstance(propertyTypeEnum)) {
				if (xmlTypeValidator.validateAnyURI((String)propertyTypeEnum, null, context)) return true;
			}
			if (CaseModelPackage.Literals.PROPERTY_TYPE_ENUM_MEMBER1.isInstance(propertyTypeEnum)) {
				if (validatePropertyTypeEnumMember1((PropertyTypeEnumMember1)propertyTypeEnum, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyTypeEnumMember1Object(PropertyTypeEnumMember1 propertyTypeEnumMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAssociationDirectionObject(TAssociationDirection tAssociationDirectionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRelationshipDirectionObject(TRelationshipDirection tRelationshipDirectionObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
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

} //CaseModelValidator
