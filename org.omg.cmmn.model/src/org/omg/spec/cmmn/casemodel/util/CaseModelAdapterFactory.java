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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.omg.spec.cmmn.casemodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.omg.spec.cmmn.casemodel.CaseModelPackage
 * @generated
 */
public class CaseModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CaseModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CaseModelPackage.eINSTANCE;
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
	protected CaseModelSwitch<Adapter> modelSwitch =
		new CaseModelSwitch<Adapter>() {
			@Override
			public Adapter caseCaseModelRoot(CaseModelRoot object) {
				return createCaseModelRootAdapter();
			}
			@Override
			public Adapter caseTApplicabilityRule(TApplicabilityRule object) {
				return createTApplicabilityRuleAdapter();
			}
			@Override
			public Adapter caseTArtifact(TArtifact object) {
				return createTArtifactAdapter();
			}
			@Override
			public Adapter caseTAssociation(TAssociation object) {
				return createTAssociationAdapter();
			}
			@Override
			public Adapter caseTCase(TCase object) {
				return createTCaseAdapter();
			}
			@Override
			public Adapter caseTCaseFile(TCaseFile object) {
				return createTCaseFileAdapter();
			}
			@Override
			public Adapter caseTCaseFileItem(TCaseFileItem object) {
				return createTCaseFileItemAdapter();
			}
			@Override
			public Adapter caseTCaseFileItemDefinition(TCaseFileItemDefinition object) {
				return createTCaseFileItemDefinitionAdapter();
			}
			@Override
			public Adapter caseTCaseFileItemOnPart(TCaseFileItemOnPart object) {
				return createTCaseFileItemOnPartAdapter();
			}
			@Override
			public Adapter caseTCaseFileItemStartTrigger(TCaseFileItemStartTrigger object) {
				return createTCaseFileItemStartTriggerAdapter();
			}
			@Override
			public Adapter caseTCaseParameter(TCaseParameter object) {
				return createTCaseParameterAdapter();
			}
			@Override
			public Adapter caseTCaseRoles(TCaseRoles object) {
				return createTCaseRolesAdapter();
			}
			@Override
			public Adapter caseTCaseTask(TCaseTask object) {
				return createTCaseTaskAdapter();
			}
			@Override
			public Adapter caseTChildren(TChildren object) {
				return createTChildrenAdapter();
			}
			@Override
			public Adapter caseTCmmnElement(TCmmnElement object) {
				return createTCmmnElementAdapter();
			}
			@Override
			public Adapter caseTCmmnElementWithMixedContent(TCmmnElementWithMixedContent object) {
				return createTCmmnElementWithMixedContentAdapter();
			}
			@Override
			public Adapter caseTCriterion(TCriterion object) {
				return createTCriterionAdapter();
			}
			@Override
			public Adapter caseTDecision(TDecision object) {
				return createTDecisionAdapter();
			}
			@Override
			public Adapter caseTDecisionParameter(TDecisionParameter object) {
				return createTDecisionParameterAdapter();
			}
			@Override
			public Adapter caseTDecisionTask(TDecisionTask object) {
				return createTDecisionTaskAdapter();
			}
			@Override
			public Adapter caseTDefinitions(TDefinitions object) {
				return createTDefinitionsAdapter();
			}
			@Override
			public Adapter caseTDiscretionaryItem(TDiscretionaryItem object) {
				return createTDiscretionaryItemAdapter();
			}
			@Override
			public Adapter caseTDocumentation(TDocumentation object) {
				return createTDocumentationAdapter();
			}
			@Override
			public Adapter caseTEntryCriterion(TEntryCriterion object) {
				return createTEntryCriterionAdapter();
			}
			@Override
			public Adapter caseTEventListener(TEventListener object) {
				return createTEventListenerAdapter();
			}
			@Override
			public Adapter caseTExitCriterion(TExitCriterion object) {
				return createTExitCriterionAdapter();
			}
			@Override
			public Adapter caseTExpression(TExpression object) {
				return createTExpressionAdapter();
			}
			@Override
			public Adapter caseTExtensionElements(TExtensionElements object) {
				return createTExtensionElementsAdapter();
			}
			@Override
			public Adapter caseTHumanTask(THumanTask object) {
				return createTHumanTaskAdapter();
			}
			@Override
			public Adapter caseTIfPart(TIfPart object) {
				return createTIfPartAdapter();
			}
			@Override
			public Adapter caseTImport(TImport object) {
				return createTImportAdapter();
			}
			@Override
			public Adapter caseTManualActivationRule(TManualActivationRule object) {
				return createTManualActivationRuleAdapter();
			}
			@Override
			public Adapter caseTMilestone(TMilestone object) {
				return createTMilestoneAdapter();
			}
			@Override
			public Adapter caseTOnPart(TOnPart object) {
				return createTOnPartAdapter();
			}
			@Override
			public Adapter caseTParameter(TParameter object) {
				return createTParameterAdapter();
			}
			@Override
			public Adapter caseTParameterMapping(TParameterMapping object) {
				return createTParameterMappingAdapter();
			}
			@Override
			public Adapter caseTPlanFragment(TPlanFragment object) {
				return createTPlanFragmentAdapter();
			}
			@Override
			public Adapter caseTPlanItem(TPlanItem object) {
				return createTPlanItemAdapter();
			}
			@Override
			public Adapter caseTPlanItemControl(TPlanItemControl object) {
				return createTPlanItemControlAdapter();
			}
			@Override
			public Adapter caseTPlanItemDefinition(TPlanItemDefinition object) {
				return createTPlanItemDefinitionAdapter();
			}
			@Override
			public Adapter caseTPlanItemOnPart(TPlanItemOnPart object) {
				return createTPlanItemOnPartAdapter();
			}
			@Override
			public Adapter caseTPlanItemStartTrigger(TPlanItemStartTrigger object) {
				return createTPlanItemStartTriggerAdapter();
			}
			@Override
			public Adapter caseTPlanningTable(TPlanningTable object) {
				return createTPlanningTableAdapter();
			}
			@Override
			public Adapter caseTProcess(TProcess object) {
				return createTProcessAdapter();
			}
			@Override
			public Adapter caseTProcessParameter(TProcessParameter object) {
				return createTProcessParameterAdapter();
			}
			@Override
			public Adapter caseTProcessTask(TProcessTask object) {
				return createTProcessTaskAdapter();
			}
			@Override
			public Adapter caseTProperty(TProperty object) {
				return createTPropertyAdapter();
			}
			@Override
			public Adapter caseTRelationship(TRelationship object) {
				return createTRelationshipAdapter();
			}
			@Override
			public Adapter caseTRepetitionRule(TRepetitionRule object) {
				return createTRepetitionRuleAdapter();
			}
			@Override
			public Adapter caseTRequiredRule(TRequiredRule object) {
				return createTRequiredRuleAdapter();
			}
			@Override
			public Adapter caseTRole(TRole object) {
				return createTRoleAdapter();
			}
			@Override
			public Adapter caseTSentry(TSentry object) {
				return createTSentryAdapter();
			}
			@Override
			public Adapter caseTStage(TStage object) {
				return createTStageAdapter();
			}
			@Override
			public Adapter caseTStartTrigger(TStartTrigger object) {
				return createTStartTriggerAdapter();
			}
			@Override
			public Adapter caseTTableItem(TTableItem object) {
				return createTTableItemAdapter();
			}
			@Override
			public Adapter caseTTask(TTask object) {
				return createTTaskAdapter();
			}
			@Override
			public Adapter caseTTextAnnotation(TTextAnnotation object) {
				return createTTextAnnotationAdapter();
			}
			@Override
			public Adapter caseTTimerEventListener(TTimerEventListener object) {
				return createTTimerEventListenerAdapter();
			}
			@Override
			public Adapter caseTUserEventListener(TUserEventListener object) {
				return createTUserEventListenerAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot
	 * @generated
	 */
	public Adapter createCaseModelRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TApplicabilityRule <em>TApplicability Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TApplicabilityRule
	 * @generated
	 */
	public Adapter createTApplicabilityRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TArtifact <em>TArtifact</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TArtifact
	 * @generated
	 */
	public Adapter createTArtifactAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TAssociation <em>TAssociation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TAssociation
	 * @generated
	 */
	public Adapter createTAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TCase <em>TCase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TCase
	 * @generated
	 */
	public Adapter createTCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TCaseFile <em>TCase File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFile
	 * @generated
	 */
	public Adapter createTCaseFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TCaseFileItem <em>TCase File Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFileItem
	 * @generated
	 */
	public Adapter createTCaseFileItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TCaseFileItemDefinition <em>TCase File Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFileItemDefinition
	 * @generated
	 */
	public Adapter createTCaseFileItemDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TCaseFileItemOnPart <em>TCase File Item On Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFileItemOnPart
	 * @generated
	 */
	public Adapter createTCaseFileItemOnPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TCaseFileItemStartTrigger <em>TCase File Item Start Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFileItemStartTrigger
	 * @generated
	 */
	public Adapter createTCaseFileItemStartTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TCaseParameter <em>TCase Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TCaseParameter
	 * @generated
	 */
	public Adapter createTCaseParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TCaseRoles <em>TCase Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TCaseRoles
	 * @generated
	 */
	public Adapter createTCaseRolesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TCaseTask <em>TCase Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TCaseTask
	 * @generated
	 */
	public Adapter createTCaseTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TChildren <em>TChildren</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TChildren
	 * @generated
	 */
	public Adapter createTChildrenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TCmmnElement <em>TCmmn Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TCmmnElement
	 * @generated
	 */
	public Adapter createTCmmnElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TCmmnElementWithMixedContent <em>TCmmn Element With Mixed Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TCmmnElementWithMixedContent
	 * @generated
	 */
	public Adapter createTCmmnElementWithMixedContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TCriterion <em>TCriterion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TCriterion
	 * @generated
	 */
	public Adapter createTCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TDecision <em>TDecision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TDecision
	 * @generated
	 */
	public Adapter createTDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TDecisionParameter <em>TDecision Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TDecisionParameter
	 * @generated
	 */
	public Adapter createTDecisionParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TDecisionTask <em>TDecision Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TDecisionTask
	 * @generated
	 */
	public Adapter createTDecisionTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TDefinitions <em>TDefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TDefinitions
	 * @generated
	 */
	public Adapter createTDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TDiscretionaryItem <em>TDiscretionary Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TDiscretionaryItem
	 * @generated
	 */
	public Adapter createTDiscretionaryItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TDocumentation <em>TDocumentation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TDocumentation
	 * @generated
	 */
	public Adapter createTDocumentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TEntryCriterion <em>TEntry Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TEntryCriterion
	 * @generated
	 */
	public Adapter createTEntryCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TEventListener <em>TEvent Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TEventListener
	 * @generated
	 */
	public Adapter createTEventListenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TExitCriterion <em>TExit Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TExitCriterion
	 * @generated
	 */
	public Adapter createTExitCriterionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TExpression <em>TExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TExpression
	 * @generated
	 */
	public Adapter createTExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TExtensionElements <em>TExtension Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TExtensionElements
	 * @generated
	 */
	public Adapter createTExtensionElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.THumanTask <em>THuman Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.THumanTask
	 * @generated
	 */
	public Adapter createTHumanTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TIfPart <em>TIf Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TIfPart
	 * @generated
	 */
	public Adapter createTIfPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TImport <em>TImport</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TImport
	 * @generated
	 */
	public Adapter createTImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TManualActivationRule <em>TManual Activation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TManualActivationRule
	 * @generated
	 */
	public Adapter createTManualActivationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TMilestone <em>TMilestone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TMilestone
	 * @generated
	 */
	public Adapter createTMilestoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TOnPart <em>TOn Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TOnPart
	 * @generated
	 */
	public Adapter createTOnPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TParameter <em>TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TParameter
	 * @generated
	 */
	public Adapter createTParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TParameterMapping <em>TParameter Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TParameterMapping
	 * @generated
	 */
	public Adapter createTParameterMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TPlanFragment <em>TPlan Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TPlanFragment
	 * @generated
	 */
	public Adapter createTPlanFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TPlanItem <em>TPlan Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItem
	 * @generated
	 */
	public Adapter createTPlanItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TPlanItemControl <em>TPlan Item Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItemControl
	 * @generated
	 */
	public Adapter createTPlanItemControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TPlanItemDefinition <em>TPlan Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItemDefinition
	 * @generated
	 */
	public Adapter createTPlanItemDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TPlanItemOnPart <em>TPlan Item On Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItemOnPart
	 * @generated
	 */
	public Adapter createTPlanItemOnPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TPlanItemStartTrigger <em>TPlan Item Start Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItemStartTrigger
	 * @generated
	 */
	public Adapter createTPlanItemStartTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TPlanningTable <em>TPlanning Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TPlanningTable
	 * @generated
	 */
	public Adapter createTPlanningTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TProcess <em>TProcess</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TProcess
	 * @generated
	 */
	public Adapter createTProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TProcessParameter <em>TProcess Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TProcessParameter
	 * @generated
	 */
	public Adapter createTProcessParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TProcessTask <em>TProcess Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TProcessTask
	 * @generated
	 */
	public Adapter createTProcessTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TProperty <em>TProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TProperty
	 * @generated
	 */
	public Adapter createTPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TRelationship <em>TRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TRelationship
	 * @generated
	 */
	public Adapter createTRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TRepetitionRule <em>TRepetition Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TRepetitionRule
	 * @generated
	 */
	public Adapter createTRepetitionRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TRequiredRule <em>TRequired Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TRequiredRule
	 * @generated
	 */
	public Adapter createTRequiredRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TRole <em>TRole</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TRole
	 * @generated
	 */
	public Adapter createTRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TSentry <em>TSentry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TSentry
	 * @generated
	 */
	public Adapter createTSentryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TStage <em>TStage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TStage
	 * @generated
	 */
	public Adapter createTStageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TStartTrigger <em>TStart Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TStartTrigger
	 * @generated
	 */
	public Adapter createTStartTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TTableItem <em>TTable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TTableItem
	 * @generated
	 */
	public Adapter createTTableItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TTask <em>TTask</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TTask
	 * @generated
	 */
	public Adapter createTTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TTextAnnotation <em>TText Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TTextAnnotation
	 * @generated
	 */
	public Adapter createTTextAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TTimerEventListener <em>TTimer Event Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TTimerEventListener
	 * @generated
	 */
	public Adapter createTTimerEventListenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.omg.spec.cmmn.casemodel.TUserEventListener <em>TUser Event Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.omg.spec.cmmn.casemodel.TUserEventListener
	 * @generated
	 */
	public Adapter createTUserEventListenerAdapter() {
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

} //CaseModelAdapterFactory
