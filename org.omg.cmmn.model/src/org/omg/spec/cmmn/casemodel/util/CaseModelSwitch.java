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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.omg.spec.cmmn.casemodel.*;

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
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage
 * @generated
 */
public class CaseModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CaseModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseModelSwitch() {
		if (modelPackage == null) {
			modelPackage = CaseModelPackage.eINSTANCE;
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
			case CaseModelPackage.CASE_MODEL_ROOT: {
				CaseModelRoot caseModelRoot = (CaseModelRoot)theEObject;
				T result = caseCaseModelRoot(caseModelRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TAPPLICABILITY_RULE: {
				TApplicabilityRule tApplicabilityRule = (TApplicabilityRule)theEObject;
				T result = caseTApplicabilityRule(tApplicabilityRule);
				if (result == null) result = caseTCmmnElement(tApplicabilityRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TARTIFACT: {
				TArtifact tArtifact = (TArtifact)theEObject;
				T result = caseTArtifact(tArtifact);
				if (result == null) result = caseTCmmnElement(tArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TASSOCIATION: {
				TAssociation tAssociation = (TAssociation)theEObject;
				T result = caseTAssociation(tAssociation);
				if (result == null) result = caseTArtifact(tAssociation);
				if (result == null) result = caseTCmmnElement(tAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TCASE: {
				TCase tCase = (TCase)theEObject;
				T result = caseTCase(tCase);
				if (result == null) result = caseTCmmnElement(tCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TCASE_FILE: {
				TCaseFile tCaseFile = (TCaseFile)theEObject;
				T result = caseTCaseFile(tCaseFile);
				if (result == null) result = caseTCmmnElement(tCaseFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TCASE_FILE_ITEM: {
				TCaseFileItem tCaseFileItem = (TCaseFileItem)theEObject;
				T result = caseTCaseFileItem(tCaseFileItem);
				if (result == null) result = caseTCmmnElement(tCaseFileItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TCASE_FILE_ITEM_DEFINITION: {
				TCaseFileItemDefinition tCaseFileItemDefinition = (TCaseFileItemDefinition)theEObject;
				T result = caseTCaseFileItemDefinition(tCaseFileItemDefinition);
				if (result == null) result = caseTCmmnElement(tCaseFileItemDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TCASE_FILE_ITEM_ON_PART: {
				TCaseFileItemOnPart tCaseFileItemOnPart = (TCaseFileItemOnPart)theEObject;
				T result = caseTCaseFileItemOnPart(tCaseFileItemOnPart);
				if (result == null) result = caseTOnPart(tCaseFileItemOnPart);
				if (result == null) result = caseTCmmnElement(tCaseFileItemOnPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TCASE_FILE_ITEM_START_TRIGGER: {
				TCaseFileItemStartTrigger tCaseFileItemStartTrigger = (TCaseFileItemStartTrigger)theEObject;
				T result = caseTCaseFileItemStartTrigger(tCaseFileItemStartTrigger);
				if (result == null) result = caseTStartTrigger(tCaseFileItemStartTrigger);
				if (result == null) result = caseTCmmnElement(tCaseFileItemStartTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TCASE_PARAMETER: {
				TCaseParameter tCaseParameter = (TCaseParameter)theEObject;
				T result = caseTCaseParameter(tCaseParameter);
				if (result == null) result = caseTParameter(tCaseParameter);
				if (result == null) result = caseTCmmnElement(tCaseParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TCASE_ROLES: {
				TCaseRoles tCaseRoles = (TCaseRoles)theEObject;
				T result = caseTCaseRoles(tCaseRoles);
				if (result == null) result = caseTCmmnElement(tCaseRoles);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TCASE_TASK: {
				TCaseTask tCaseTask = (TCaseTask)theEObject;
				T result = caseTCaseTask(tCaseTask);
				if (result == null) result = caseTTask(tCaseTask);
				if (result == null) result = caseTPlanItemDefinition(tCaseTask);
				if (result == null) result = caseTCmmnElement(tCaseTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TCHILDREN: {
				TChildren tChildren = (TChildren)theEObject;
				T result = caseTChildren(tChildren);
				if (result == null) result = caseTCmmnElement(tChildren);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TCMMN_ELEMENT: {
				TCmmnElement tCmmnElement = (TCmmnElement)theEObject;
				T result = caseTCmmnElement(tCmmnElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TCMMN_ELEMENT_WITH_MIXED_CONTENT: {
				TCmmnElementWithMixedContent tCmmnElementWithMixedContent = (TCmmnElementWithMixedContent)theEObject;
				T result = caseTCmmnElementWithMixedContent(tCmmnElementWithMixedContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TCRITERION: {
				TCriterion tCriterion = (TCriterion)theEObject;
				T result = caseTCriterion(tCriterion);
				if (result == null) result = caseTCmmnElement(tCriterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TDECISION: {
				TDecision tDecision = (TDecision)theEObject;
				T result = caseTDecision(tDecision);
				if (result == null) result = caseTCmmnElement(tDecision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TDECISION_PARAMETER: {
				TDecisionParameter tDecisionParameter = (TDecisionParameter)theEObject;
				T result = caseTDecisionParameter(tDecisionParameter);
				if (result == null) result = caseTParameter(tDecisionParameter);
				if (result == null) result = caseTCmmnElement(tDecisionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TDECISION_TASK: {
				TDecisionTask tDecisionTask = (TDecisionTask)theEObject;
				T result = caseTDecisionTask(tDecisionTask);
				if (result == null) result = caseTTask(tDecisionTask);
				if (result == null) result = caseTPlanItemDefinition(tDecisionTask);
				if (result == null) result = caseTCmmnElement(tDecisionTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TDEFINITIONS: {
				TDefinitions tDefinitions = (TDefinitions)theEObject;
				T result = caseTDefinitions(tDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TDISCRETIONARY_ITEM: {
				TDiscretionaryItem tDiscretionaryItem = (TDiscretionaryItem)theEObject;
				T result = caseTDiscretionaryItem(tDiscretionaryItem);
				if (result == null) result = caseTTableItem(tDiscretionaryItem);
				if (result == null) result = caseTCmmnElement(tDiscretionaryItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TDOCUMENTATION: {
				TDocumentation tDocumentation = (TDocumentation)theEObject;
				T result = caseTDocumentation(tDocumentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TENTRY_CRITERION: {
				TEntryCriterion tEntryCriterion = (TEntryCriterion)theEObject;
				T result = caseTEntryCriterion(tEntryCriterion);
				if (result == null) result = caseTCriterion(tEntryCriterion);
				if (result == null) result = caseTCmmnElement(tEntryCriterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TEVENT_LISTENER: {
				TEventListener tEventListener = (TEventListener)theEObject;
				T result = caseTEventListener(tEventListener);
				if (result == null) result = caseTPlanItemDefinition(tEventListener);
				if (result == null) result = caseTCmmnElement(tEventListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TEXIT_CRITERION: {
				TExitCriterion tExitCriterion = (TExitCriterion)theEObject;
				T result = caseTExitCriterion(tExitCriterion);
				if (result == null) result = caseTCriterion(tExitCriterion);
				if (result == null) result = caseTCmmnElement(tExitCriterion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TEXPRESSION: {
				TExpression tExpression = (TExpression)theEObject;
				T result = caseTExpression(tExpression);
				if (result == null) result = caseTCmmnElementWithMixedContent(tExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TEXTENSION_ELEMENTS: {
				TExtensionElements tExtensionElements = (TExtensionElements)theEObject;
				T result = caseTExtensionElements(tExtensionElements);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.THUMAN_TASK: {
				THumanTask tHumanTask = (THumanTask)theEObject;
				T result = caseTHumanTask(tHumanTask);
				if (result == null) result = caseTTask(tHumanTask);
				if (result == null) result = caseTPlanItemDefinition(tHumanTask);
				if (result == null) result = caseTCmmnElement(tHumanTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TIF_PART: {
				TIfPart tIfPart = (TIfPart)theEObject;
				T result = caseTIfPart(tIfPart);
				if (result == null) result = caseTCmmnElement(tIfPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TIMPORT: {
				TImport tImport = (TImport)theEObject;
				T result = caseTImport(tImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TMANUAL_ACTIVATION_RULE: {
				TManualActivationRule tManualActivationRule = (TManualActivationRule)theEObject;
				T result = caseTManualActivationRule(tManualActivationRule);
				if (result == null) result = caseTCmmnElement(tManualActivationRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TMILESTONE: {
				TMilestone tMilestone = (TMilestone)theEObject;
				T result = caseTMilestone(tMilestone);
				if (result == null) result = caseTPlanItemDefinition(tMilestone);
				if (result == null) result = caseTCmmnElement(tMilestone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TON_PART: {
				TOnPart tOnPart = (TOnPart)theEObject;
				T result = caseTOnPart(tOnPart);
				if (result == null) result = caseTCmmnElement(tOnPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TPARAMETER: {
				TParameter tParameter = (TParameter)theEObject;
				T result = caseTParameter(tParameter);
				if (result == null) result = caseTCmmnElement(tParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TPARAMETER_MAPPING: {
				TParameterMapping tParameterMapping = (TParameterMapping)theEObject;
				T result = caseTParameterMapping(tParameterMapping);
				if (result == null) result = caseTCmmnElement(tParameterMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TPLAN_FRAGMENT: {
				TPlanFragment tPlanFragment = (TPlanFragment)theEObject;
				T result = caseTPlanFragment(tPlanFragment);
				if (result == null) result = caseTPlanItemDefinition(tPlanFragment);
				if (result == null) result = caseTCmmnElement(tPlanFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TPLAN_ITEM: {
				TPlanItem tPlanItem = (TPlanItem)theEObject;
				T result = caseTPlanItem(tPlanItem);
				if (result == null) result = caseTCmmnElement(tPlanItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TPLAN_ITEM_CONTROL: {
				TPlanItemControl tPlanItemControl = (TPlanItemControl)theEObject;
				T result = caseTPlanItemControl(tPlanItemControl);
				if (result == null) result = caseTCmmnElement(tPlanItemControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TPLAN_ITEM_DEFINITION: {
				TPlanItemDefinition tPlanItemDefinition = (TPlanItemDefinition)theEObject;
				T result = caseTPlanItemDefinition(tPlanItemDefinition);
				if (result == null) result = caseTCmmnElement(tPlanItemDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TPLAN_ITEM_ON_PART: {
				TPlanItemOnPart tPlanItemOnPart = (TPlanItemOnPart)theEObject;
				T result = caseTPlanItemOnPart(tPlanItemOnPart);
				if (result == null) result = caseTOnPart(tPlanItemOnPart);
				if (result == null) result = caseTCmmnElement(tPlanItemOnPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TPLAN_ITEM_START_TRIGGER: {
				TPlanItemStartTrigger tPlanItemStartTrigger = (TPlanItemStartTrigger)theEObject;
				T result = caseTPlanItemStartTrigger(tPlanItemStartTrigger);
				if (result == null) result = caseTStartTrigger(tPlanItemStartTrigger);
				if (result == null) result = caseTCmmnElement(tPlanItemStartTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TPLANNING_TABLE: {
				TPlanningTable tPlanningTable = (TPlanningTable)theEObject;
				T result = caseTPlanningTable(tPlanningTable);
				if (result == null) result = caseTTableItem(tPlanningTable);
				if (result == null) result = caseTCmmnElement(tPlanningTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TPROCESS: {
				TProcess tProcess = (TProcess)theEObject;
				T result = caseTProcess(tProcess);
				if (result == null) result = caseTCmmnElement(tProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TPROCESS_PARAMETER: {
				TProcessParameter tProcessParameter = (TProcessParameter)theEObject;
				T result = caseTProcessParameter(tProcessParameter);
				if (result == null) result = caseTParameter(tProcessParameter);
				if (result == null) result = caseTCmmnElement(tProcessParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TPROCESS_TASK: {
				TProcessTask tProcessTask = (TProcessTask)theEObject;
				T result = caseTProcessTask(tProcessTask);
				if (result == null) result = caseTTask(tProcessTask);
				if (result == null) result = caseTPlanItemDefinition(tProcessTask);
				if (result == null) result = caseTCmmnElement(tProcessTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TPROPERTY: {
				TProperty tProperty = (TProperty)theEObject;
				T result = caseTProperty(tProperty);
				if (result == null) result = caseTCmmnElement(tProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TRELATIONSHIP: {
				TRelationship tRelationship = (TRelationship)theEObject;
				T result = caseTRelationship(tRelationship);
				if (result == null) result = caseTCmmnElement(tRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TREPETITION_RULE: {
				TRepetitionRule tRepetitionRule = (TRepetitionRule)theEObject;
				T result = caseTRepetitionRule(tRepetitionRule);
				if (result == null) result = caseTCmmnElement(tRepetitionRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TREQUIRED_RULE: {
				TRequiredRule tRequiredRule = (TRequiredRule)theEObject;
				T result = caseTRequiredRule(tRequiredRule);
				if (result == null) result = caseTCmmnElement(tRequiredRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TROLE: {
				TRole tRole = (TRole)theEObject;
				T result = caseTRole(tRole);
				if (result == null) result = caseTCmmnElement(tRole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TSENTRY: {
				TSentry tSentry = (TSentry)theEObject;
				T result = caseTSentry(tSentry);
				if (result == null) result = caseTCmmnElement(tSentry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TSTAGE: {
				TStage tStage = (TStage)theEObject;
				T result = caseTStage(tStage);
				if (result == null) result = caseTPlanFragment(tStage);
				if (result == null) result = caseTPlanItemDefinition(tStage);
				if (result == null) result = caseTCmmnElement(tStage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TSTART_TRIGGER: {
				TStartTrigger tStartTrigger = (TStartTrigger)theEObject;
				T result = caseTStartTrigger(tStartTrigger);
				if (result == null) result = caseTCmmnElement(tStartTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TTABLE_ITEM: {
				TTableItem tTableItem = (TTableItem)theEObject;
				T result = caseTTableItem(tTableItem);
				if (result == null) result = caseTCmmnElement(tTableItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TTASK: {
				TTask tTask = (TTask)theEObject;
				T result = caseTTask(tTask);
				if (result == null) result = caseTPlanItemDefinition(tTask);
				if (result == null) result = caseTCmmnElement(tTask);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TTEXT_ANNOTATION: {
				TTextAnnotation tTextAnnotation = (TTextAnnotation)theEObject;
				T result = caseTTextAnnotation(tTextAnnotation);
				if (result == null) result = caseTArtifact(tTextAnnotation);
				if (result == null) result = caseTCmmnElement(tTextAnnotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TTIMER_EVENT_LISTENER: {
				TTimerEventListener tTimerEventListener = (TTimerEventListener)theEObject;
				T result = caseTTimerEventListener(tTimerEventListener);
				if (result == null) result = caseTEventListener(tTimerEventListener);
				if (result == null) result = caseTPlanItemDefinition(tTimerEventListener);
				if (result == null) result = caseTCmmnElement(tTimerEventListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CaseModelPackage.TUSER_EVENT_LISTENER: {
				TUserEventListener tUserEventListener = (TUserEventListener)theEObject;
				T result = caseTUserEventListener(tUserEventListener);
				if (result == null) result = caseTEventListener(tUserEventListener);
				if (result == null) result = caseTPlanItemDefinition(tUserEventListener);
				if (result == null) result = caseTCmmnElement(tUserEventListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseModelRoot(CaseModelRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TApplicability Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TApplicability Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTApplicabilityRule(TApplicabilityRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TArtifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TArtifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTArtifact(TArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TAssociation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TAssociation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTAssociation(TAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCase(TCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCase File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCase File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCaseFile(TCaseFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCase File Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCase File Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCaseFileItem(TCaseFileItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCase File Item Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCase File Item Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCaseFileItemDefinition(TCaseFileItemDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCase File Item On Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCase File Item On Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCaseFileItemOnPart(TCaseFileItemOnPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCase File Item Start Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCase File Item Start Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCaseFileItemStartTrigger(TCaseFileItemStartTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCase Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCase Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCaseParameter(TCaseParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCase Roles</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCase Roles</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCaseRoles(TCaseRoles object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCase Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCase Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCaseTask(TCaseTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TChildren</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TChildren</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTChildren(TChildren object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCmmn Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCmmn Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCmmnElement(TCmmnElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCmmn Element With Mixed Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCmmn Element With Mixed Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCmmnElementWithMixedContent(TCmmnElementWithMixedContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TCriterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TCriterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCriterion(TCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDecision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDecision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDecision(TDecision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDecision Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDecision Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDecisionParameter(TDecisionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDecision Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDecision Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDecisionTask(TDecisionTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDefinitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDefinitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDefinitions(TDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDiscretionary Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDiscretionary Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDiscretionaryItem(TDiscretionaryItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TDocumentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TDocumentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTDocumentation(TDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEntry Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEntry Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEntryCriterion(TEntryCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TEvent Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TEvent Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTEventListener(TEventListener object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TExit Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TExit Criterion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTExitCriterion(TExitCriterion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TExpression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TExpression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTExpression(TExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TExtension Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TExtension Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTExtensionElements(TExtensionElements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>THuman Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>THuman Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTHumanTask(THumanTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TIf Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TIf Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTIfPart(TIfPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TImport</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TImport</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTImport(TImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TManual Activation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TManual Activation Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTManualActivationRule(TManualActivationRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TMilestone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TMilestone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTMilestone(TMilestone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TOn Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TOn Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTOnPart(TOnPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TParameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TParameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTParameter(TParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TParameter Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TParameter Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTParameterMapping(TParameterMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPlan Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPlan Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPlanFragment(TPlanFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPlan Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPlan Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPlanItem(TPlanItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPlan Item Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPlan Item Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPlanItemControl(TPlanItemControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPlan Item Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPlan Item Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPlanItemDefinition(TPlanItemDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPlan Item On Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPlan Item On Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPlanItemOnPart(TPlanItemOnPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPlan Item Start Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPlan Item Start Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPlanItemStartTrigger(TPlanItemStartTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TPlanning Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TPlanning Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTPlanningTable(TPlanningTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TProcess</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TProcess</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTProcess(TProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TProcess Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TProcess Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTProcessParameter(TProcessParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TProcess Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TProcess Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTProcessTask(TProcessTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TProperty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TProperty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTProperty(TProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRelationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRelationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRelationship(TRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRepetition Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRepetition Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRepetitionRule(TRepetitionRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRequired Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRequired Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRequiredRule(TRequiredRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TRole</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TRole</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTRole(TRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TSentry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TSentry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTSentry(TSentry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TStage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TStage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTStage(TStage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TStart Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TStart Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTStartTrigger(TStartTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTable Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTable Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTableItem(TTableItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTask</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTask</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTask(TTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TText Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TText Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTextAnnotation(TTextAnnotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TTimer Event Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TTimer Event Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTTimerEventListener(TTimerEventListener object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TUser Event Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TUser Event Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTUserEventListener(TUserEventListener object) {
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

} //CaseModelSwitch
