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
package org.omg.spec.cmmn.casemodel.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.cmmn.casemodel.CaseModelPackage;
import org.omg.spec.cmmn.casemodel.CaseModelRoot;
import org.omg.spec.cmmn.casemodel.TApplicabilityRule;
import org.omg.spec.cmmn.casemodel.TArtifact;
import org.omg.spec.cmmn.casemodel.TAssociation;
import org.omg.spec.cmmn.casemodel.TCase;
import org.omg.spec.cmmn.casemodel.TCaseFile;
import org.omg.spec.cmmn.casemodel.TCaseFileItem;
import org.omg.spec.cmmn.casemodel.TCaseFileItemDefinition;
import org.omg.spec.cmmn.casemodel.TCaseFileItemOnPart;
import org.omg.spec.cmmn.casemodel.TCaseFileItemStartTrigger;
import org.omg.spec.cmmn.casemodel.TCaseParameter;
import org.omg.spec.cmmn.casemodel.TCaseTask;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getApplicabilityRule <em>Applicability Rule</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getCase <em>Case</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getCaseFile <em>Case File</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getCaseFileItem <em>Case File Item</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getCaseFileItemDefinition <em>Case File Item Definition</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getCaseFileItemOnPart <em>Case File Item On Part</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getOnPart <em>On Part</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getCaseFileItemStartTrigger <em>Case File Item Start Trigger</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getTimerStart <em>Timer Start</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getCaseParameter <em>Case Parameter</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getCaseTask <em>Case Task</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getTask <em>Task</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getPlanItemDefinition <em>Plan Item Definition</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getDecision <em>Decision</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getDecisionParameter <em>Decision Parameter</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getDecisionTask <em>Decision Task</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getDiscretionaryItem <em>Discretionary Item</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getTableItem <em>Table Item</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getEntryCriterion <em>Entry Criterion</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getEventListener <em>Event Listener</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getExitCriterion <em>Exit Criterion</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getExtensionElements <em>Extension Elements</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getHumanTask <em>Human Task</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getIfPart <em>If Part</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getManualActivationRule <em>Manual Activation Rule</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getMilestone <em>Milestone</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getParameterMapping <em>Parameter Mapping</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getPlanFragment <em>Plan Fragment</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getPlanItem <em>Plan Item</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getPlanItemControl <em>Plan Item Control</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getPlanItemOnPart <em>Plan Item On Part</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getPlanItemStartTrigger <em>Plan Item Start Trigger</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getPlanningTable <em>Planning Table</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getProcessParameter <em>Process Parameter</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getProcessTask <em>Process Task</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getRepetitionRule <em>Repetition Rule</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getRequiredRule <em>Required Rule</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getRole <em>Role</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getSentry <em>Sentry</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getTextAnnotation <em>Text Annotation</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getTimerEventListener <em>Timer Event Listener</em>}</li>
 *   <li>{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl#getUserEventListener <em>User Event Listener</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseModelRootImpl extends MinimalEObjectImpl.Container implements CaseModelRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseModelRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CaseModelPackage.Literals.CASE_MODEL_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CaseModelPackage.CASE_MODEL_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CaseModelPackage.CASE_MODEL_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CaseModelPackage.CASE_MODEL_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TApplicabilityRule getApplicabilityRule() {
		return (TApplicabilityRule)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__APPLICABILITY_RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicabilityRule(TApplicabilityRule newApplicabilityRule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__APPLICABILITY_RULE, newApplicabilityRule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicabilityRule(TApplicabilityRule newApplicabilityRule) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__APPLICABILITY_RULE, newApplicabilityRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TArtifact getArtifact() {
		return (TArtifact)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__ARTIFACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifact(TArtifact newArtifact, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__ARTIFACT, newArtifact, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifact(TArtifact newArtifact) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__ARTIFACT, newArtifact);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TAssociation getAssociation() {
		return (TAssociation)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__ASSOCIATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociation(TAssociation newAssociation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__ASSOCIATION, newAssociation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssociation(TAssociation newAssociation) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__ASSOCIATION, newAssociation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCase getCase() {
		return (TCase)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCase(TCase newCase, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE, newCase, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCase(TCase newCase) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE, newCase);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCaseFile getCaseFile() {
		return (TCaseFile)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE_FILE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaseFile(TCaseFile newCaseFile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE_FILE, newCaseFile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseFile(TCaseFile newCaseFile) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE_FILE, newCaseFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCaseFileItem getCaseFileItem() {
		return (TCaseFileItem)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE_FILE_ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaseFileItem(TCaseFileItem newCaseFileItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE_FILE_ITEM, newCaseFileItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseFileItem(TCaseFileItem newCaseFileItem) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE_FILE_ITEM, newCaseFileItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCaseFileItemDefinition getCaseFileItemDefinition() {
		return (TCaseFileItemDefinition)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE_FILE_ITEM_DEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaseFileItemDefinition(TCaseFileItemDefinition newCaseFileItemDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE_FILE_ITEM_DEFINITION, newCaseFileItemDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseFileItemDefinition(TCaseFileItemDefinition newCaseFileItemDefinition) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE_FILE_ITEM_DEFINITION, newCaseFileItemDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCaseFileItemOnPart getCaseFileItemOnPart() {
		return (TCaseFileItemOnPart)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE_FILE_ITEM_ON_PART, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaseFileItemOnPart(TCaseFileItemOnPart newCaseFileItemOnPart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE_FILE_ITEM_ON_PART, newCaseFileItemOnPart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseFileItemOnPart(TCaseFileItemOnPart newCaseFileItemOnPart) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE_FILE_ITEM_ON_PART, newCaseFileItemOnPart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TOnPart getOnPart() {
		return (TOnPart)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__ON_PART, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnPart(TOnPart newOnPart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__ON_PART, newOnPart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnPart(TOnPart newOnPart) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__ON_PART, newOnPart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCaseFileItemStartTrigger getCaseFileItemStartTrigger() {
		return (TCaseFileItemStartTrigger)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE_FILE_ITEM_START_TRIGGER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaseFileItemStartTrigger(TCaseFileItemStartTrigger newCaseFileItemStartTrigger, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE_FILE_ITEM_START_TRIGGER, newCaseFileItemStartTrigger, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseFileItemStartTrigger(TCaseFileItemStartTrigger newCaseFileItemStartTrigger) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE_FILE_ITEM_START_TRIGGER, newCaseFileItemStartTrigger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TStartTrigger getTimerStart() {
		return (TStartTrigger)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__TIMER_START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimerStart(TStartTrigger newTimerStart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__TIMER_START, newTimerStart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimerStart(TStartTrigger newTimerStart) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__TIMER_START, newTimerStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCaseParameter getCaseParameter() {
		return (TCaseParameter)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE_PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaseParameter(TCaseParameter newCaseParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE_PARAMETER, newCaseParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseParameter(TCaseParameter newCaseParameter) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE_PARAMETER, newCaseParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TParameter getParameter() {
		return (TParameter)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(TParameter newParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__PARAMETER, newParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameter(TParameter newParameter) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__PARAMETER, newParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TCaseTask getCaseTask() {
		return (TCaseTask)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE_TASK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaseTask(TCaseTask newCaseTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE_TASK, newCaseTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCaseTask(TCaseTask newCaseTask) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__CASE_TASK, newCaseTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTask getTask() {
		return (TTask)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__TASK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(TTask newTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__TASK, newTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTask(TTask newTask) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__TASK, newTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPlanItemDefinition getPlanItemDefinition() {
		return (TPlanItemDefinition)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__PLAN_ITEM_DEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanItemDefinition(TPlanItemDefinition newPlanItemDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__PLAN_ITEM_DEFINITION, newPlanItemDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlanItemDefinition(TPlanItemDefinition newPlanItemDefinition) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__PLAN_ITEM_DEFINITION, newPlanItemDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDecision getDecision() {
		return (TDecision)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__DECISION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecision(TDecision newDecision, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__DECISION, newDecision, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecision(TDecision newDecision) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__DECISION, newDecision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDecisionParameter getDecisionParameter() {
		return (TDecisionParameter)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__DECISION_PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecisionParameter(TDecisionParameter newDecisionParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__DECISION_PARAMETER, newDecisionParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecisionParameter(TDecisionParameter newDecisionParameter) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__DECISION_PARAMETER, newDecisionParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDecisionTask getDecisionTask() {
		return (TDecisionTask)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__DECISION_TASK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecisionTask(TDecisionTask newDecisionTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__DECISION_TASK, newDecisionTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecisionTask(TDecisionTask newDecisionTask) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__DECISION_TASK, newDecisionTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDefinitions getDefinitions() {
		return (TDefinitions)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__DEFINITIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitions(TDefinitions newDefinitions, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__DEFINITIONS, newDefinitions, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitions(TDefinitions newDefinitions) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__DEFINITIONS, newDefinitions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDiscretionaryItem getDiscretionaryItem() {
		return (TDiscretionaryItem)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__DISCRETIONARY_ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscretionaryItem(TDiscretionaryItem newDiscretionaryItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__DISCRETIONARY_ITEM, newDiscretionaryItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscretionaryItem(TDiscretionaryItem newDiscretionaryItem) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__DISCRETIONARY_ITEM, newDiscretionaryItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTableItem getTableItem() {
		return (TTableItem)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__TABLE_ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableItem(TTableItem newTableItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__TABLE_ITEM, newTableItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTableItem(TTableItem newTableItem) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__TABLE_ITEM, newTableItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TDocumentation getDocumentation() {
		return (TDocumentation)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__DOCUMENTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentation(TDocumentation newDocumentation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__DOCUMENTATION, newDocumentation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentation(TDocumentation newDocumentation) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__DOCUMENTATION, newDocumentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEntryCriterion getEntryCriterion() {
		return (TEntryCriterion)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__ENTRY_CRITERION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryCriterion(TEntryCriterion newEntryCriterion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__ENTRY_CRITERION, newEntryCriterion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntryCriterion(TEntryCriterion newEntryCriterion) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__ENTRY_CRITERION, newEntryCriterion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TEventListener getEventListener() {
		return (TEventListener)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__EVENT_LISTENER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventListener(TEventListener newEventListener, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__EVENT_LISTENER, newEventListener, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventListener(TEventListener newEventListener) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__EVENT_LISTENER, newEventListener);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExitCriterion getExitCriterion() {
		return (TExitCriterion)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__EXIT_CRITERION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExitCriterion(TExitCriterion newExitCriterion, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__EXIT_CRITERION, newExitCriterion, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExitCriterion(TExitCriterion newExitCriterion) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__EXIT_CRITERION, newExitCriterion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExpression getExpression() {
		return (TExpression)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__EXPRESSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(TExpression newExpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__EXPRESSION, newExpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(TExpression newExpression) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__EXPRESSION, newExpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TExtensionElements getExtensionElements() {
		return (TExtensionElements)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__EXTENSION_ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensionElements(TExtensionElements newExtensionElements, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__EXTENSION_ELEMENTS, newExtensionElements, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtensionElements(TExtensionElements newExtensionElements) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__EXTENSION_ELEMENTS, newExtensionElements);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public THumanTask getHumanTask() {
		return (THumanTask)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__HUMAN_TASK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHumanTask(THumanTask newHumanTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__HUMAN_TASK, newHumanTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHumanTask(THumanTask newHumanTask) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__HUMAN_TASK, newHumanTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TIfPart getIfPart() {
		return (TIfPart)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__IF_PART, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfPart(TIfPart newIfPart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__IF_PART, newIfPart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIfPart(TIfPart newIfPart) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__IF_PART, newIfPart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TImport getImport() {
		return (TImport)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__IMPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImport(TImport newImport, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__IMPORT, newImport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImport(TImport newImport) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__IMPORT, newImport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TManualActivationRule getManualActivationRule() {
		return (TManualActivationRule)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__MANUAL_ACTIVATION_RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManualActivationRule(TManualActivationRule newManualActivationRule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__MANUAL_ACTIVATION_RULE, newManualActivationRule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManualActivationRule(TManualActivationRule newManualActivationRule) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__MANUAL_ACTIVATION_RULE, newManualActivationRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TMilestone getMilestone() {
		return (TMilestone)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__MILESTONE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMilestone(TMilestone newMilestone, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__MILESTONE, newMilestone, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMilestone(TMilestone newMilestone) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__MILESTONE, newMilestone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TParameterMapping getParameterMapping() {
		return (TParameterMapping)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__PARAMETER_MAPPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterMapping(TParameterMapping newParameterMapping, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__PARAMETER_MAPPING, newParameterMapping, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterMapping(TParameterMapping newParameterMapping) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__PARAMETER_MAPPING, newParameterMapping);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPlanFragment getPlanFragment() {
		return (TPlanFragment)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__PLAN_FRAGMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanFragment(TPlanFragment newPlanFragment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__PLAN_FRAGMENT, newPlanFragment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlanFragment(TPlanFragment newPlanFragment) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__PLAN_FRAGMENT, newPlanFragment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPlanItem getPlanItem() {
		return (TPlanItem)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__PLAN_ITEM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanItem(TPlanItem newPlanItem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__PLAN_ITEM, newPlanItem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlanItem(TPlanItem newPlanItem) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__PLAN_ITEM, newPlanItem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPlanItemControl getPlanItemControl() {
		return (TPlanItemControl)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__PLAN_ITEM_CONTROL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanItemControl(TPlanItemControl newPlanItemControl, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__PLAN_ITEM_CONTROL, newPlanItemControl, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlanItemControl(TPlanItemControl newPlanItemControl) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__PLAN_ITEM_CONTROL, newPlanItemControl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPlanItemOnPart getPlanItemOnPart() {
		return (TPlanItemOnPart)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__PLAN_ITEM_ON_PART, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanItemOnPart(TPlanItemOnPart newPlanItemOnPart, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__PLAN_ITEM_ON_PART, newPlanItemOnPart, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlanItemOnPart(TPlanItemOnPart newPlanItemOnPart) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__PLAN_ITEM_ON_PART, newPlanItemOnPart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPlanItemStartTrigger getPlanItemStartTrigger() {
		return (TPlanItemStartTrigger)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__PLAN_ITEM_START_TRIGGER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanItemStartTrigger(TPlanItemStartTrigger newPlanItemStartTrigger, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__PLAN_ITEM_START_TRIGGER, newPlanItemStartTrigger, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlanItemStartTrigger(TPlanItemStartTrigger newPlanItemStartTrigger) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__PLAN_ITEM_START_TRIGGER, newPlanItemStartTrigger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TPlanningTable getPlanningTable() {
		return (TPlanningTable)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__PLANNING_TABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlanningTable(TPlanningTable newPlanningTable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__PLANNING_TABLE, newPlanningTable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlanningTable(TPlanningTable newPlanningTable) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__PLANNING_TABLE, newPlanningTable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TProcess getProcess() {
		return (TProcess)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__PROCESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(TProcess newProcess, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__PROCESS, newProcess, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcess(TProcess newProcess) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__PROCESS, newProcess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TProcessParameter getProcessParameter() {
		return (TProcessParameter)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__PROCESS_PARAMETER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessParameter(TProcessParameter newProcessParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__PROCESS_PARAMETER, newProcessParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessParameter(TProcessParameter newProcessParameter) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__PROCESS_PARAMETER, newProcessParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TProcessTask getProcessTask() {
		return (TProcessTask)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__PROCESS_TASK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessTask(TProcessTask newProcessTask, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__PROCESS_TASK, newProcessTask, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProcessTask(TProcessTask newProcessTask) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__PROCESS_TASK, newProcessTask);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TProperty getProperty() {
		return (TProperty)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__PROPERTY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperty(TProperty newProperty, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__PROPERTY, newProperty, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProperty(TProperty newProperty) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__PROPERTY, newProperty);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRelationship getRelationship() {
		return (TRelationship)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__RELATIONSHIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(TRelationship newRelationship, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__RELATIONSHIP, newRelationship, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationship(TRelationship newRelationship) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__RELATIONSHIP, newRelationship);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRepetitionRule getRepetitionRule() {
		return (TRepetitionRule)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__REPETITION_RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepetitionRule(TRepetitionRule newRepetitionRule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__REPETITION_RULE, newRepetitionRule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepetitionRule(TRepetitionRule newRepetitionRule) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__REPETITION_RULE, newRepetitionRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRequiredRule getRequiredRule() {
		return (TRequiredRule)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__REQUIRED_RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequiredRule(TRequiredRule newRequiredRule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__REQUIRED_RULE, newRequiredRule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredRule(TRequiredRule newRequiredRule) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__REQUIRED_RULE, newRequiredRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TRole getRole() {
		return (TRole)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(TRole newRole, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__ROLE, newRole, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(TRole newRole) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__ROLE, newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TSentry getSentry() {
		return (TSentry)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__SENTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSentry(TSentry newSentry, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__SENTRY, newSentry, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSentry(TSentry newSentry) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__SENTRY, newSentry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TStage getStage() {
		return (TStage)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__STAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStage(TStage newStage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__STAGE, newStage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStage(TStage newStage) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__STAGE, newStage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTextAnnotation getTextAnnotation() {
		return (TTextAnnotation)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__TEXT_ANNOTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextAnnotation(TTextAnnotation newTextAnnotation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__TEXT_ANNOTATION, newTextAnnotation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextAnnotation(TTextAnnotation newTextAnnotation) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__TEXT_ANNOTATION, newTextAnnotation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TTimerEventListener getTimerEventListener() {
		return (TTimerEventListener)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__TIMER_EVENT_LISTENER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimerEventListener(TTimerEventListener newTimerEventListener, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__TIMER_EVENT_LISTENER, newTimerEventListener, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimerEventListener(TTimerEventListener newTimerEventListener) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__TIMER_EVENT_LISTENER, newTimerEventListener);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TUserEventListener getUserEventListener() {
		return (TUserEventListener)getMixed().get(CaseModelPackage.Literals.CASE_MODEL_ROOT__USER_EVENT_LISTENER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserEventListener(TUserEventListener newUserEventListener, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CaseModelPackage.Literals.CASE_MODEL_ROOT__USER_EVENT_LISTENER, newUserEventListener, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserEventListener(TUserEventListener newUserEventListener) {
		((FeatureMap.Internal)getMixed()).set(CaseModelPackage.Literals.CASE_MODEL_ROOT__USER_EVENT_LISTENER, newUserEventListener);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CaseModelPackage.CASE_MODEL_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__APPLICABILITY_RULE:
				return basicSetApplicabilityRule(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__ARTIFACT:
				return basicSetArtifact(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__ASSOCIATION:
				return basicSetAssociation(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__CASE:
				return basicSetCase(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE:
				return basicSetCaseFile(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE_ITEM:
				return basicSetCaseFileItem(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE_ITEM_DEFINITION:
				return basicSetCaseFileItemDefinition(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE_ITEM_ON_PART:
				return basicSetCaseFileItemOnPart(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__ON_PART:
				return basicSetOnPart(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE_ITEM_START_TRIGGER:
				return basicSetCaseFileItemStartTrigger(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__TIMER_START:
				return basicSetTimerStart(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_PARAMETER:
				return basicSetCaseParameter(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__PARAMETER:
				return basicSetParameter(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_TASK:
				return basicSetCaseTask(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__TASK:
				return basicSetTask(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM_DEFINITION:
				return basicSetPlanItemDefinition(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__DECISION:
				return basicSetDecision(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__DECISION_PARAMETER:
				return basicSetDecisionParameter(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__DECISION_TASK:
				return basicSetDecisionTask(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__DEFINITIONS:
				return basicSetDefinitions(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__DISCRETIONARY_ITEM:
				return basicSetDiscretionaryItem(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__TABLE_ITEM:
				return basicSetTableItem(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__DOCUMENTATION:
				return basicSetDocumentation(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__ENTRY_CRITERION:
				return basicSetEntryCriterion(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__EVENT_LISTENER:
				return basicSetEventListener(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__EXIT_CRITERION:
				return basicSetExitCriterion(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__EXPRESSION:
				return basicSetExpression(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__EXTENSION_ELEMENTS:
				return basicSetExtensionElements(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__HUMAN_TASK:
				return basicSetHumanTask(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__IF_PART:
				return basicSetIfPart(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__IMPORT:
				return basicSetImport(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__MANUAL_ACTIVATION_RULE:
				return basicSetManualActivationRule(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__MILESTONE:
				return basicSetMilestone(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__PARAMETER_MAPPING:
				return basicSetParameterMapping(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_FRAGMENT:
				return basicSetPlanFragment(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM:
				return basicSetPlanItem(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM_CONTROL:
				return basicSetPlanItemControl(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM_ON_PART:
				return basicSetPlanItemOnPart(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM_START_TRIGGER:
				return basicSetPlanItemStartTrigger(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__PLANNING_TABLE:
				return basicSetPlanningTable(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__PROCESS:
				return basicSetProcess(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__PROCESS_PARAMETER:
				return basicSetProcessParameter(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__PROCESS_TASK:
				return basicSetProcessTask(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__PROPERTY:
				return basicSetProperty(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__REPETITION_RULE:
				return basicSetRepetitionRule(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__REQUIRED_RULE:
				return basicSetRequiredRule(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__ROLE:
				return basicSetRole(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__SENTRY:
				return basicSetSentry(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__STAGE:
				return basicSetStage(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__TEXT_ANNOTATION:
				return basicSetTextAnnotation(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__TIMER_EVENT_LISTENER:
				return basicSetTimerEventListener(null, msgs);
			case CaseModelPackage.CASE_MODEL_ROOT__USER_EVENT_LISTENER:
				return basicSetUserEventListener(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CaseModelPackage.CASE_MODEL_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case CaseModelPackage.CASE_MODEL_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case CaseModelPackage.CASE_MODEL_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case CaseModelPackage.CASE_MODEL_ROOT__APPLICABILITY_RULE:
				return getApplicabilityRule();
			case CaseModelPackage.CASE_MODEL_ROOT__ARTIFACT:
				return getArtifact();
			case CaseModelPackage.CASE_MODEL_ROOT__ASSOCIATION:
				return getAssociation();
			case CaseModelPackage.CASE_MODEL_ROOT__CASE:
				return getCase();
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE:
				return getCaseFile();
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE_ITEM:
				return getCaseFileItem();
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE_ITEM_DEFINITION:
				return getCaseFileItemDefinition();
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE_ITEM_ON_PART:
				return getCaseFileItemOnPart();
			case CaseModelPackage.CASE_MODEL_ROOT__ON_PART:
				return getOnPart();
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE_ITEM_START_TRIGGER:
				return getCaseFileItemStartTrigger();
			case CaseModelPackage.CASE_MODEL_ROOT__TIMER_START:
				return getTimerStart();
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_PARAMETER:
				return getCaseParameter();
			case CaseModelPackage.CASE_MODEL_ROOT__PARAMETER:
				return getParameter();
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_TASK:
				return getCaseTask();
			case CaseModelPackage.CASE_MODEL_ROOT__TASK:
				return getTask();
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM_DEFINITION:
				return getPlanItemDefinition();
			case CaseModelPackage.CASE_MODEL_ROOT__DECISION:
				return getDecision();
			case CaseModelPackage.CASE_MODEL_ROOT__DECISION_PARAMETER:
				return getDecisionParameter();
			case CaseModelPackage.CASE_MODEL_ROOT__DECISION_TASK:
				return getDecisionTask();
			case CaseModelPackage.CASE_MODEL_ROOT__DEFINITIONS:
				return getDefinitions();
			case CaseModelPackage.CASE_MODEL_ROOT__DISCRETIONARY_ITEM:
				return getDiscretionaryItem();
			case CaseModelPackage.CASE_MODEL_ROOT__TABLE_ITEM:
				return getTableItem();
			case CaseModelPackage.CASE_MODEL_ROOT__DOCUMENTATION:
				return getDocumentation();
			case CaseModelPackage.CASE_MODEL_ROOT__ENTRY_CRITERION:
				return getEntryCriterion();
			case CaseModelPackage.CASE_MODEL_ROOT__EVENT_LISTENER:
				return getEventListener();
			case CaseModelPackage.CASE_MODEL_ROOT__EXIT_CRITERION:
				return getExitCriterion();
			case CaseModelPackage.CASE_MODEL_ROOT__EXPRESSION:
				return getExpression();
			case CaseModelPackage.CASE_MODEL_ROOT__EXTENSION_ELEMENTS:
				return getExtensionElements();
			case CaseModelPackage.CASE_MODEL_ROOT__HUMAN_TASK:
				return getHumanTask();
			case CaseModelPackage.CASE_MODEL_ROOT__IF_PART:
				return getIfPart();
			case CaseModelPackage.CASE_MODEL_ROOT__IMPORT:
				return getImport();
			case CaseModelPackage.CASE_MODEL_ROOT__MANUAL_ACTIVATION_RULE:
				return getManualActivationRule();
			case CaseModelPackage.CASE_MODEL_ROOT__MILESTONE:
				return getMilestone();
			case CaseModelPackage.CASE_MODEL_ROOT__PARAMETER_MAPPING:
				return getParameterMapping();
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_FRAGMENT:
				return getPlanFragment();
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM:
				return getPlanItem();
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM_CONTROL:
				return getPlanItemControl();
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM_ON_PART:
				return getPlanItemOnPart();
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM_START_TRIGGER:
				return getPlanItemStartTrigger();
			case CaseModelPackage.CASE_MODEL_ROOT__PLANNING_TABLE:
				return getPlanningTable();
			case CaseModelPackage.CASE_MODEL_ROOT__PROCESS:
				return getProcess();
			case CaseModelPackage.CASE_MODEL_ROOT__PROCESS_PARAMETER:
				return getProcessParameter();
			case CaseModelPackage.CASE_MODEL_ROOT__PROCESS_TASK:
				return getProcessTask();
			case CaseModelPackage.CASE_MODEL_ROOT__PROPERTY:
				return getProperty();
			case CaseModelPackage.CASE_MODEL_ROOT__RELATIONSHIP:
				return getRelationship();
			case CaseModelPackage.CASE_MODEL_ROOT__REPETITION_RULE:
				return getRepetitionRule();
			case CaseModelPackage.CASE_MODEL_ROOT__REQUIRED_RULE:
				return getRequiredRule();
			case CaseModelPackage.CASE_MODEL_ROOT__ROLE:
				return getRole();
			case CaseModelPackage.CASE_MODEL_ROOT__SENTRY:
				return getSentry();
			case CaseModelPackage.CASE_MODEL_ROOT__STAGE:
				return getStage();
			case CaseModelPackage.CASE_MODEL_ROOT__TEXT_ANNOTATION:
				return getTextAnnotation();
			case CaseModelPackage.CASE_MODEL_ROOT__TIMER_EVENT_LISTENER:
				return getTimerEventListener();
			case CaseModelPackage.CASE_MODEL_ROOT__USER_EVENT_LISTENER:
				return getUserEventListener();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CaseModelPackage.CASE_MODEL_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__APPLICABILITY_RULE:
				setApplicabilityRule((TApplicabilityRule)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__ARTIFACT:
				setArtifact((TArtifact)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__ASSOCIATION:
				setAssociation((TAssociation)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE:
				setCase((TCase)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE:
				setCaseFile((TCaseFile)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE_ITEM:
				setCaseFileItem((TCaseFileItem)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE_ITEM_DEFINITION:
				setCaseFileItemDefinition((TCaseFileItemDefinition)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE_ITEM_ON_PART:
				setCaseFileItemOnPart((TCaseFileItemOnPart)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__ON_PART:
				setOnPart((TOnPart)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE_ITEM_START_TRIGGER:
				setCaseFileItemStartTrigger((TCaseFileItemStartTrigger)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__TIMER_START:
				setTimerStart((TStartTrigger)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_PARAMETER:
				setCaseParameter((TCaseParameter)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PARAMETER:
				setParameter((TParameter)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_TASK:
				setCaseTask((TCaseTask)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__TASK:
				setTask((TTask)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM_DEFINITION:
				setPlanItemDefinition((TPlanItemDefinition)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__DECISION:
				setDecision((TDecision)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__DECISION_PARAMETER:
				setDecisionParameter((TDecisionParameter)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__DECISION_TASK:
				setDecisionTask((TDecisionTask)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__DEFINITIONS:
				setDefinitions((TDefinitions)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__DISCRETIONARY_ITEM:
				setDiscretionaryItem((TDiscretionaryItem)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__TABLE_ITEM:
				setTableItem((TTableItem)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__DOCUMENTATION:
				setDocumentation((TDocumentation)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__ENTRY_CRITERION:
				setEntryCriterion((TEntryCriterion)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__EVENT_LISTENER:
				setEventListener((TEventListener)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__EXIT_CRITERION:
				setExitCriterion((TExitCriterion)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__EXPRESSION:
				setExpression((TExpression)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__EXTENSION_ELEMENTS:
				setExtensionElements((TExtensionElements)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__HUMAN_TASK:
				setHumanTask((THumanTask)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__IF_PART:
				setIfPart((TIfPart)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__IMPORT:
				setImport((TImport)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__MANUAL_ACTIVATION_RULE:
				setManualActivationRule((TManualActivationRule)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__MILESTONE:
				setMilestone((TMilestone)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PARAMETER_MAPPING:
				setParameterMapping((TParameterMapping)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_FRAGMENT:
				setPlanFragment((TPlanFragment)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM:
				setPlanItem((TPlanItem)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM_CONTROL:
				setPlanItemControl((TPlanItemControl)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM_ON_PART:
				setPlanItemOnPart((TPlanItemOnPart)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM_START_TRIGGER:
				setPlanItemStartTrigger((TPlanItemStartTrigger)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PLANNING_TABLE:
				setPlanningTable((TPlanningTable)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PROCESS:
				setProcess((TProcess)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PROCESS_PARAMETER:
				setProcessParameter((TProcessParameter)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PROCESS_TASK:
				setProcessTask((TProcessTask)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PROPERTY:
				setProperty((TProperty)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__RELATIONSHIP:
				setRelationship((TRelationship)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__REPETITION_RULE:
				setRepetitionRule((TRepetitionRule)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__REQUIRED_RULE:
				setRequiredRule((TRequiredRule)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__ROLE:
				setRole((TRole)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__SENTRY:
				setSentry((TSentry)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__STAGE:
				setStage((TStage)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__TEXT_ANNOTATION:
				setTextAnnotation((TTextAnnotation)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__TIMER_EVENT_LISTENER:
				setTimerEventListener((TTimerEventListener)newValue);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__USER_EVENT_LISTENER:
				setUserEventListener((TUserEventListener)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CaseModelPackage.CASE_MODEL_ROOT__MIXED:
				getMixed().clear();
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__APPLICABILITY_RULE:
				setApplicabilityRule((TApplicabilityRule)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__ARTIFACT:
				setArtifact((TArtifact)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__ASSOCIATION:
				setAssociation((TAssociation)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE:
				setCase((TCase)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE:
				setCaseFile((TCaseFile)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE_ITEM:
				setCaseFileItem((TCaseFileItem)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE_ITEM_DEFINITION:
				setCaseFileItemDefinition((TCaseFileItemDefinition)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE_ITEM_ON_PART:
				setCaseFileItemOnPart((TCaseFileItemOnPart)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__ON_PART:
				setOnPart((TOnPart)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE_ITEM_START_TRIGGER:
				setCaseFileItemStartTrigger((TCaseFileItemStartTrigger)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__TIMER_START:
				setTimerStart((TStartTrigger)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_PARAMETER:
				setCaseParameter((TCaseParameter)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PARAMETER:
				setParameter((TParameter)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_TASK:
				setCaseTask((TCaseTask)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__TASK:
				setTask((TTask)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM_DEFINITION:
				setPlanItemDefinition((TPlanItemDefinition)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__DECISION:
				setDecision((TDecision)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__DECISION_PARAMETER:
				setDecisionParameter((TDecisionParameter)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__DECISION_TASK:
				setDecisionTask((TDecisionTask)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__DEFINITIONS:
				setDefinitions((TDefinitions)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__DISCRETIONARY_ITEM:
				setDiscretionaryItem((TDiscretionaryItem)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__TABLE_ITEM:
				setTableItem((TTableItem)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__DOCUMENTATION:
				setDocumentation((TDocumentation)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__ENTRY_CRITERION:
				setEntryCriterion((TEntryCriterion)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__EVENT_LISTENER:
				setEventListener((TEventListener)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__EXIT_CRITERION:
				setExitCriterion((TExitCriterion)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__EXPRESSION:
				setExpression((TExpression)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__EXTENSION_ELEMENTS:
				setExtensionElements((TExtensionElements)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__HUMAN_TASK:
				setHumanTask((THumanTask)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__IF_PART:
				setIfPart((TIfPart)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__IMPORT:
				setImport((TImport)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__MANUAL_ACTIVATION_RULE:
				setManualActivationRule((TManualActivationRule)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__MILESTONE:
				setMilestone((TMilestone)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PARAMETER_MAPPING:
				setParameterMapping((TParameterMapping)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_FRAGMENT:
				setPlanFragment((TPlanFragment)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM:
				setPlanItem((TPlanItem)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM_CONTROL:
				setPlanItemControl((TPlanItemControl)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM_ON_PART:
				setPlanItemOnPart((TPlanItemOnPart)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM_START_TRIGGER:
				setPlanItemStartTrigger((TPlanItemStartTrigger)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PLANNING_TABLE:
				setPlanningTable((TPlanningTable)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PROCESS:
				setProcess((TProcess)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PROCESS_PARAMETER:
				setProcessParameter((TProcessParameter)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PROCESS_TASK:
				setProcessTask((TProcessTask)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__PROPERTY:
				setProperty((TProperty)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__RELATIONSHIP:
				setRelationship((TRelationship)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__REPETITION_RULE:
				setRepetitionRule((TRepetitionRule)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__REQUIRED_RULE:
				setRequiredRule((TRequiredRule)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__ROLE:
				setRole((TRole)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__SENTRY:
				setSentry((TSentry)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__STAGE:
				setStage((TStage)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__TEXT_ANNOTATION:
				setTextAnnotation((TTextAnnotation)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__TIMER_EVENT_LISTENER:
				setTimerEventListener((TTimerEventListener)null);
				return;
			case CaseModelPackage.CASE_MODEL_ROOT__USER_EVENT_LISTENER:
				setUserEventListener((TUserEventListener)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CaseModelPackage.CASE_MODEL_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CaseModelPackage.CASE_MODEL_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case CaseModelPackage.CASE_MODEL_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case CaseModelPackage.CASE_MODEL_ROOT__APPLICABILITY_RULE:
				return getApplicabilityRule() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__ARTIFACT:
				return getArtifact() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__ASSOCIATION:
				return getAssociation() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE:
				return getCase() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE:
				return getCaseFile() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE_ITEM:
				return getCaseFileItem() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE_ITEM_DEFINITION:
				return getCaseFileItemDefinition() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE_ITEM_ON_PART:
				return getCaseFileItemOnPart() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__ON_PART:
				return getOnPart() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_FILE_ITEM_START_TRIGGER:
				return getCaseFileItemStartTrigger() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__TIMER_START:
				return getTimerStart() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_PARAMETER:
				return getCaseParameter() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__PARAMETER:
				return getParameter() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__CASE_TASK:
				return getCaseTask() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__TASK:
				return getTask() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM_DEFINITION:
				return getPlanItemDefinition() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__DECISION:
				return getDecision() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__DECISION_PARAMETER:
				return getDecisionParameter() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__DECISION_TASK:
				return getDecisionTask() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__DEFINITIONS:
				return getDefinitions() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__DISCRETIONARY_ITEM:
				return getDiscretionaryItem() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__TABLE_ITEM:
				return getTableItem() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__DOCUMENTATION:
				return getDocumentation() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__ENTRY_CRITERION:
				return getEntryCriterion() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__EVENT_LISTENER:
				return getEventListener() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__EXIT_CRITERION:
				return getExitCriterion() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__EXPRESSION:
				return getExpression() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__EXTENSION_ELEMENTS:
				return getExtensionElements() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__HUMAN_TASK:
				return getHumanTask() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__IF_PART:
				return getIfPart() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__IMPORT:
				return getImport() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__MANUAL_ACTIVATION_RULE:
				return getManualActivationRule() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__MILESTONE:
				return getMilestone() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__PARAMETER_MAPPING:
				return getParameterMapping() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_FRAGMENT:
				return getPlanFragment() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM:
				return getPlanItem() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM_CONTROL:
				return getPlanItemControl() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM_ON_PART:
				return getPlanItemOnPart() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__PLAN_ITEM_START_TRIGGER:
				return getPlanItemStartTrigger() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__PLANNING_TABLE:
				return getPlanningTable() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__PROCESS:
				return getProcess() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__PROCESS_PARAMETER:
				return getProcessParameter() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__PROCESS_TASK:
				return getProcessTask() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__PROPERTY:
				return getProperty() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__RELATIONSHIP:
				return getRelationship() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__REPETITION_RULE:
				return getRepetitionRule() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__REQUIRED_RULE:
				return getRequiredRule() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__ROLE:
				return getRole() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__SENTRY:
				return getSentry() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__STAGE:
				return getStage() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__TEXT_ANNOTATION:
				return getTextAnnotation() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__TIMER_EVENT_LISTENER:
				return getTimerEventListener() != null;
			case CaseModelPackage.CASE_MODEL_ROOT__USER_EVENT_LISTENER:
				return getUserEventListener() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //CaseModelRootImpl
