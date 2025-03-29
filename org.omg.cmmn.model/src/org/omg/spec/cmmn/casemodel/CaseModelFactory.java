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
package org.omg.spec.cmmn.casemodel;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage
 * @generated
 */
@ProviderType
public interface CaseModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CaseModelFactory eINSTANCE = org.omg.spec.cmmn.casemodel.impl.CaseModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	CaseModelRoot createCaseModelRoot();

	/**
	 * Returns a new object of class '<em>TApplicability Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TApplicability Rule</em>'.
	 * @generated
	 */
	TApplicabilityRule createTApplicabilityRule();

	/**
	 * Returns a new object of class '<em>TAssociation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TAssociation</em>'.
	 * @generated
	 */
	TAssociation createTAssociation();

	/**
	 * Returns a new object of class '<em>TCase</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCase</em>'.
	 * @generated
	 */
	TCase createTCase();

	/**
	 * Returns a new object of class '<em>TCase File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCase File</em>'.
	 * @generated
	 */
	TCaseFile createTCaseFile();

	/**
	 * Returns a new object of class '<em>TCase File Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCase File Item</em>'.
	 * @generated
	 */
	TCaseFileItem createTCaseFileItem();

	/**
	 * Returns a new object of class '<em>TCase File Item Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCase File Item Definition</em>'.
	 * @generated
	 */
	TCaseFileItemDefinition createTCaseFileItemDefinition();

	/**
	 * Returns a new object of class '<em>TCase File Item On Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCase File Item On Part</em>'.
	 * @generated
	 */
	TCaseFileItemOnPart createTCaseFileItemOnPart();

	/**
	 * Returns a new object of class '<em>TCase File Item Start Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCase File Item Start Trigger</em>'.
	 * @generated
	 */
	TCaseFileItemStartTrigger createTCaseFileItemStartTrigger();

	/**
	 * Returns a new object of class '<em>TCase Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCase Parameter</em>'.
	 * @generated
	 */
	TCaseParameter createTCaseParameter();

	/**
	 * Returns a new object of class '<em>TCase Roles</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCase Roles</em>'.
	 * @generated
	 */
	TCaseRoles createTCaseRoles();

	/**
	 * Returns a new object of class '<em>TCase Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TCase Task</em>'.
	 * @generated
	 */
	TCaseTask createTCaseTask();

	/**
	 * Returns a new object of class '<em>TChildren</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TChildren</em>'.
	 * @generated
	 */
	TChildren createTChildren();

	/**
	 * Returns a new object of class '<em>TDecision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDecision</em>'.
	 * @generated
	 */
	TDecision createTDecision();

	/**
	 * Returns a new object of class '<em>TDecision Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDecision Parameter</em>'.
	 * @generated
	 */
	TDecisionParameter createTDecisionParameter();

	/**
	 * Returns a new object of class '<em>TDecision Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDecision Task</em>'.
	 * @generated
	 */
	TDecisionTask createTDecisionTask();

	/**
	 * Returns a new object of class '<em>TDefinitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDefinitions</em>'.
	 * @generated
	 */
	TDefinitions createTDefinitions();

	/**
	 * Returns a new object of class '<em>TDiscretionary Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDiscretionary Item</em>'.
	 * @generated
	 */
	TDiscretionaryItem createTDiscretionaryItem();

	/**
	 * Returns a new object of class '<em>TDocumentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TDocumentation</em>'.
	 * @generated
	 */
	TDocumentation createTDocumentation();

	/**
	 * Returns a new object of class '<em>TEntry Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TEntry Criterion</em>'.
	 * @generated
	 */
	TEntryCriterion createTEntryCriterion();

	/**
	 * Returns a new object of class '<em>TEvent Listener</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TEvent Listener</em>'.
	 * @generated
	 */
	TEventListener createTEventListener();

	/**
	 * Returns a new object of class '<em>TExit Criterion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TExit Criterion</em>'.
	 * @generated
	 */
	TExitCriterion createTExitCriterion();

	/**
	 * Returns a new object of class '<em>TExpression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TExpression</em>'.
	 * @generated
	 */
	TExpression createTExpression();

	/**
	 * Returns a new object of class '<em>TExtension Elements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TExtension Elements</em>'.
	 * @generated
	 */
	TExtensionElements createTExtensionElements();

	/**
	 * Returns a new object of class '<em>THuman Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>THuman Task</em>'.
	 * @generated
	 */
	THumanTask createTHumanTask();

	/**
	 * Returns a new object of class '<em>TIf Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TIf Part</em>'.
	 * @generated
	 */
	TIfPart createTIfPart();

	/**
	 * Returns a new object of class '<em>TImport</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TImport</em>'.
	 * @generated
	 */
	TImport createTImport();

	/**
	 * Returns a new object of class '<em>TManual Activation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TManual Activation Rule</em>'.
	 * @generated
	 */
	TManualActivationRule createTManualActivationRule();

	/**
	 * Returns a new object of class '<em>TMilestone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TMilestone</em>'.
	 * @generated
	 */
	TMilestone createTMilestone();

	/**
	 * Returns a new object of class '<em>TParameter Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TParameter Mapping</em>'.
	 * @generated
	 */
	TParameterMapping createTParameterMapping();

	/**
	 * Returns a new object of class '<em>TPlan Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TPlan Fragment</em>'.
	 * @generated
	 */
	TPlanFragment createTPlanFragment();

	/**
	 * Returns a new object of class '<em>TPlan Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TPlan Item</em>'.
	 * @generated
	 */
	TPlanItem createTPlanItem();

	/**
	 * Returns a new object of class '<em>TPlan Item Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TPlan Item Control</em>'.
	 * @generated
	 */
	TPlanItemControl createTPlanItemControl();

	/**
	 * Returns a new object of class '<em>TPlan Item On Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TPlan Item On Part</em>'.
	 * @generated
	 */
	TPlanItemOnPart createTPlanItemOnPart();

	/**
	 * Returns a new object of class '<em>TPlan Item Start Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TPlan Item Start Trigger</em>'.
	 * @generated
	 */
	TPlanItemStartTrigger createTPlanItemStartTrigger();

	/**
	 * Returns a new object of class '<em>TPlanning Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TPlanning Table</em>'.
	 * @generated
	 */
	TPlanningTable createTPlanningTable();

	/**
	 * Returns a new object of class '<em>TProcess</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TProcess</em>'.
	 * @generated
	 */
	TProcess createTProcess();

	/**
	 * Returns a new object of class '<em>TProcess Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TProcess Parameter</em>'.
	 * @generated
	 */
	TProcessParameter createTProcessParameter();

	/**
	 * Returns a new object of class '<em>TProcess Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TProcess Task</em>'.
	 * @generated
	 */
	TProcessTask createTProcessTask();

	/**
	 * Returns a new object of class '<em>TProperty</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TProperty</em>'.
	 * @generated
	 */
	TProperty createTProperty();

	/**
	 * Returns a new object of class '<em>TRelationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TRelationship</em>'.
	 * @generated
	 */
	TRelationship createTRelationship();

	/**
	 * Returns a new object of class '<em>TRepetition Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TRepetition Rule</em>'.
	 * @generated
	 */
	TRepetitionRule createTRepetitionRule();

	/**
	 * Returns a new object of class '<em>TRequired Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TRequired Rule</em>'.
	 * @generated
	 */
	TRequiredRule createTRequiredRule();

	/**
	 * Returns a new object of class '<em>TRole</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TRole</em>'.
	 * @generated
	 */
	TRole createTRole();

	/**
	 * Returns a new object of class '<em>TSentry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TSentry</em>'.
	 * @generated
	 */
	TSentry createTSentry();

	/**
	 * Returns a new object of class '<em>TStage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TStage</em>'.
	 * @generated
	 */
	TStage createTStage();

	/**
	 * Returns a new object of class '<em>TTask</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TTask</em>'.
	 * @generated
	 */
	TTask createTTask();

	/**
	 * Returns a new object of class '<em>TText Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TText Annotation</em>'.
	 * @generated
	 */
	TTextAnnotation createTTextAnnotation();

	/**
	 * Returns a new object of class '<em>TTimer Event Listener</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TTimer Event Listener</em>'.
	 * @generated
	 */
	TTimerEventListener createTTimerEventListener();

	/**
	 * Returns a new object of class '<em>TUser Event Listener</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TUser Event Listener</em>'.
	 * @generated
	 */
	TUserEventListener createTUserEventListener();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CaseModelPackage getCaseModelPackage();

} //CaseModelFactory
