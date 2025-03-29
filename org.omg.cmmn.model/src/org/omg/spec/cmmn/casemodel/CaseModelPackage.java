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


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.omg.spec.cmmn.casemodel.CaseModelFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = CaseModelPackage.eNS_URI, genModel = "/model/CMMN11.genmodel", genModelSourceLocations = {"model/CMMN11.genmodel","org.omg.cmmn.model/model/CMMN11.genmodel"}, ecore="/model/casemodel.ecore", ecoreSourceLocations="/model/casemodel.ecore")
public interface CaseModelPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "casemodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/CMMN/20151109/MODEL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "casemodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CaseModelPackage eINSTANCE = org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getCaseModelRoot()
	 * @generated
	 */
	int CASE_MODEL_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Applicability Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__APPLICABILITY_RULE = 3;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__ARTIFACT = 4;

	/**
	 * The feature id for the '<em><b>Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__ASSOCIATION = 5;

	/**
	 * The feature id for the '<em><b>Case</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__CASE = 6;

	/**
	 * The feature id for the '<em><b>Case File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__CASE_FILE = 7;

	/**
	 * The feature id for the '<em><b>Case File Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__CASE_FILE_ITEM = 8;

	/**
	 * The feature id for the '<em><b>Case File Item Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__CASE_FILE_ITEM_DEFINITION = 9;

	/**
	 * The feature id for the '<em><b>Case File Item On Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__CASE_FILE_ITEM_ON_PART = 10;

	/**
	 * The feature id for the '<em><b>On Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__ON_PART = 11;

	/**
	 * The feature id for the '<em><b>Case File Item Start Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__CASE_FILE_ITEM_START_TRIGGER = 12;

	/**
	 * The feature id for the '<em><b>Timer Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__TIMER_START = 13;

	/**
	 * The feature id for the '<em><b>Case Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__CASE_PARAMETER = 14;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__PARAMETER = 15;

	/**
	 * The feature id for the '<em><b>Case Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__CASE_TASK = 16;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__TASK = 17;

	/**
	 * The feature id for the '<em><b>Plan Item Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__PLAN_ITEM_DEFINITION = 18;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__DECISION = 19;

	/**
	 * The feature id for the '<em><b>Decision Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__DECISION_PARAMETER = 20;

	/**
	 * The feature id for the '<em><b>Decision Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__DECISION_TASK = 21;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__DEFINITIONS = 22;

	/**
	 * The feature id for the '<em><b>Discretionary Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__DISCRETIONARY_ITEM = 23;

	/**
	 * The feature id for the '<em><b>Table Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__TABLE_ITEM = 24;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__DOCUMENTATION = 25;

	/**
	 * The feature id for the '<em><b>Entry Criterion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__ENTRY_CRITERION = 26;

	/**
	 * The feature id for the '<em><b>Event Listener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__EVENT_LISTENER = 27;

	/**
	 * The feature id for the '<em><b>Exit Criterion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__EXIT_CRITERION = 28;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__EXPRESSION = 29;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__EXTENSION_ELEMENTS = 30;

	/**
	 * The feature id for the '<em><b>Human Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__HUMAN_TASK = 31;

	/**
	 * The feature id for the '<em><b>If Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__IF_PART = 32;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__IMPORT = 33;

	/**
	 * The feature id for the '<em><b>Manual Activation Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__MANUAL_ACTIVATION_RULE = 34;

	/**
	 * The feature id for the '<em><b>Milestone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__MILESTONE = 35;

	/**
	 * The feature id for the '<em><b>Parameter Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__PARAMETER_MAPPING = 36;

	/**
	 * The feature id for the '<em><b>Plan Fragment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__PLAN_FRAGMENT = 37;

	/**
	 * The feature id for the '<em><b>Plan Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__PLAN_ITEM = 38;

	/**
	 * The feature id for the '<em><b>Plan Item Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__PLAN_ITEM_CONTROL = 39;

	/**
	 * The feature id for the '<em><b>Plan Item On Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__PLAN_ITEM_ON_PART = 40;

	/**
	 * The feature id for the '<em><b>Plan Item Start Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__PLAN_ITEM_START_TRIGGER = 41;

	/**
	 * The feature id for the '<em><b>Planning Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__PLANNING_TABLE = 42;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__PROCESS = 43;

	/**
	 * The feature id for the '<em><b>Process Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__PROCESS_PARAMETER = 44;

	/**
	 * The feature id for the '<em><b>Process Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__PROCESS_TASK = 45;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__PROPERTY = 46;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__RELATIONSHIP = 47;

	/**
	 * The feature id for the '<em><b>Repetition Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__REPETITION_RULE = 48;

	/**
	 * The feature id for the '<em><b>Required Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__REQUIRED_RULE = 49;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__ROLE = 50;

	/**
	 * The feature id for the '<em><b>Sentry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__SENTRY = 51;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__STAGE = 52;

	/**
	 * The feature id for the '<em><b>Text Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__TEXT_ANNOTATION = 53;

	/**
	 * The feature id for the '<em><b>Timer Event Listener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__TIMER_EVENT_LISTENER = 54;

	/**
	 * The feature id for the '<em><b>User Event Listener</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT__USER_EVENT_LISTENER = 55;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT_FEATURE_COUNT = 56;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_MODEL_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TCmmnElementImpl <em>TCmmn Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TCmmnElementImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCmmnElement()
	 * @generated
	 */
	int TCMMN_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCMMN_ELEMENT__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCMMN_ELEMENT__EXTENSION_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCMMN_ELEMENT__ID = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCMMN_ELEMENT__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>TCmmn Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCMMN_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TCmmn Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCMMN_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TApplicabilityRuleImpl <em>TApplicability Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TApplicabilityRuleImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTApplicabilityRule()
	 * @generated
	 */
	int TAPPLICABILITY_RULE = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLICABILITY_RULE__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLICABILITY_RULE__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLICABILITY_RULE__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLICABILITY_RULE__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLICABILITY_RULE__CONDITION = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLICABILITY_RULE__CONTEXT_REF = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLICABILITY_RULE__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TApplicability Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLICABILITY_RULE_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TApplicability Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLICABILITY_RULE_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TArtifactImpl <em>TArtifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TArtifactImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTArtifact()
	 * @generated
	 */
	int TARTIFACT = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>TArtifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TArtifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TAssociationImpl <em>TAssociation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TAssociationImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTAssociation()
	 * @generated
	 */
	int TASSOCIATION = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION__DOCUMENTATION = TARTIFACT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION__EXTENSION_ELEMENTS = TARTIFACT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION__ID = TARTIFACT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION__ANY_ATTRIBUTE = TARTIFACT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Association Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION__ASSOCIATION_DIRECTION = TARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION__SOURCE_REF = TARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION__TARGET_REF = TARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TAssociation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION_FEATURE_COUNT = TARTIFACT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TAssociation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION_OPERATION_COUNT = TARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TCaseImpl <em>TCase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TCaseImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCase()
	 * @generated
	 */
	int TCASE = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Case File Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE__CASE_FILE_MODEL = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Case Plan Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE__CASE_PLAN_MODEL = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Case Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE__CASE_ROLES = TCMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE__INPUT = TCMMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE__OUTPUT = TCMMN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>TCase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>TCase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TCaseFileImpl <em>TCase File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TCaseFileImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCaseFile()
	 * @generated
	 */
	int TCASE_FILE = 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Case File Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE__CASE_FILE_ITEM = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TCase File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TCase File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TCaseFileItemImpl <em>TCase File Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TCaseFileItemImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCaseFileItem()
	 * @generated
	 */
	int TCASE_FILE_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM__CHILDREN = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM__DEFINITION_REF = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM__MULTIPLICITY = TCMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM__SOURCE_REF = TCMMN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Target Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM__TARGET_REFS = TCMMN_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>TCase File Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>TCase File Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TCaseFileItemDefinitionImpl <em>TCase File Item Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TCaseFileItemDefinitionImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCaseFileItemDefinition()
	 * @generated
	 */
	int TCASE_FILE_ITEM_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_DEFINITION__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_DEFINITION__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_DEFINITION__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_DEFINITION__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_DEFINITION__PROPERTY = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_DEFINITION__DEFINITION_TYPE = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Import Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_DEFINITION__IMPORT_REF = TCMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_DEFINITION__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Structure Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_DEFINITION__STRUCTURE_REF = TCMMN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TCase File Item Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_DEFINITION_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TCase File Item Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_DEFINITION_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TOnPartImpl <em>TOn Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TOnPartImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTOnPart()
	 * @generated
	 */
	int TON_PART = 33;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TON_PART__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TON_PART__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TON_PART__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TON_PART__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TON_PART__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TOn Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TON_PART_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TOn Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TON_PART_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TCaseFileItemOnPartImpl <em>TCase File Item On Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TCaseFileItemOnPartImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCaseFileItemOnPart()
	 * @generated
	 */
	int TCASE_FILE_ITEM_ON_PART = 8;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_ON_PART__DOCUMENTATION = TON_PART__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_ON_PART__EXTENSION_ELEMENTS = TON_PART__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_ON_PART__ID = TON_PART__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_ON_PART__ANY_ATTRIBUTE = TON_PART__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_ON_PART__NAME = TON_PART__NAME;

	/**
	 * The feature id for the '<em><b>Standard Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_ON_PART__STANDARD_EVENT = TON_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_ON_PART__SOURCE_REF = TON_PART_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TCase File Item On Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_ON_PART_FEATURE_COUNT = TON_PART_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TCase File Item On Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_ON_PART_OPERATION_COUNT = TON_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TStartTriggerImpl <em>TStart Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TStartTriggerImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTStartTrigger()
	 * @generated
	 */
	int TSTART_TRIGGER = 53;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_TRIGGER__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_TRIGGER__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_TRIGGER__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_TRIGGER__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>TStart Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_TRIGGER_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TStart Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_TRIGGER_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TCaseFileItemStartTriggerImpl <em>TCase File Item Start Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TCaseFileItemStartTriggerImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCaseFileItemStartTrigger()
	 * @generated
	 */
	int TCASE_FILE_ITEM_START_TRIGGER = 9;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_START_TRIGGER__DOCUMENTATION = TSTART_TRIGGER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_START_TRIGGER__EXTENSION_ELEMENTS = TSTART_TRIGGER__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_START_TRIGGER__ID = TSTART_TRIGGER__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_START_TRIGGER__ANY_ATTRIBUTE = TSTART_TRIGGER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Standard Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_START_TRIGGER__STANDARD_EVENT = TSTART_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_START_TRIGGER__SOURCE_REF = TSTART_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TCase File Item Start Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_START_TRIGGER_FEATURE_COUNT = TSTART_TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TCase File Item Start Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_FILE_ITEM_START_TRIGGER_OPERATION_COUNT = TSTART_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TParameterImpl <em>TParameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TParameterImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTParameter()
	 * @generated
	 */
	int TPARAMETER = 34;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TParameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TCaseParameterImpl <em>TCase Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TCaseParameterImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCaseParameter()
	 * @generated
	 */
	int TCASE_PARAMETER = 10;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_PARAMETER__DOCUMENTATION = TPARAMETER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_PARAMETER__EXTENSION_ELEMENTS = TPARAMETER__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_PARAMETER__ID = TPARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_PARAMETER__ANY_ATTRIBUTE = TPARAMETER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_PARAMETER__NAME = TPARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Binding Refinement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_PARAMETER__BINDING_REFINEMENT = TPARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_PARAMETER__BINDING_REF = TPARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TCase Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_PARAMETER_FEATURE_COUNT = TPARAMETER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TCase Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_PARAMETER_OPERATION_COUNT = TPARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TCaseRolesImpl <em>TCase Roles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TCaseRolesImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCaseRoles()
	 * @generated
	 */
	int TCASE_ROLES = 11;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_ROLES__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_ROLES__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_ROLES__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_ROLES__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_ROLES__ROLE = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TCase Roles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_ROLES_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TCase Roles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_ROLES_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TPlanItemDefinitionImpl <em>TPlan Item Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TPlanItemDefinitionImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTPlanItemDefinition()
	 * @generated
	 */
	int TPLAN_ITEM_DEFINITION = 39;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_DEFINITION__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_DEFINITION__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_DEFINITION__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_DEFINITION__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Default Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_DEFINITION__DEFAULT_CONTROL = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_DEFINITION__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TPlan Item Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_DEFINITION_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TPlan Item Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_DEFINITION_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TTaskImpl <em>TTask</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TTaskImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTTask()
	 * @generated
	 */
	int TTASK = 55;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__DOCUMENTATION = TPLAN_ITEM_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__EXTENSION_ELEMENTS = TPLAN_ITEM_DEFINITION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__ID = TPLAN_ITEM_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__ANY_ATTRIBUTE = TPLAN_ITEM_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Default Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__DEFAULT_CONTROL = TPLAN_ITEM_DEFINITION__DEFAULT_CONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__NAME = TPLAN_ITEM_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__INPUT = TPLAN_ITEM_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__OUTPUT = TPLAN_ITEM_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Blocking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__IS_BLOCKING = TPLAN_ITEM_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TTask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK_FEATURE_COUNT = TPLAN_ITEM_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TTask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK_OPERATION_COUNT = TPLAN_ITEM_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TCaseTaskImpl <em>TCase Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TCaseTaskImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCaseTask()
	 * @generated
	 */
	int TCASE_TASK = 12;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_TASK__DOCUMENTATION = TTASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_TASK__EXTENSION_ELEMENTS = TTASK__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_TASK__ID = TTASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_TASK__ANY_ATTRIBUTE = TTASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Default Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_TASK__DEFAULT_CONTROL = TTASK__DEFAULT_CONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_TASK__NAME = TTASK__NAME;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_TASK__INPUT = TTASK__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_TASK__OUTPUT = TTASK__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Blocking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_TASK__IS_BLOCKING = TTASK__IS_BLOCKING;

	/**
	 * The feature id for the '<em><b>Parameter Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_TASK__PARAMETER_MAPPING = TTASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Case Ref Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_TASK__CASE_REF_EXPRESSION = TTASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Case Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_TASK__CASE_REF = TTASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TCase Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_TASK_FEATURE_COUNT = TTASK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TCase Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCASE_TASK_OPERATION_COUNT = TTASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TChildrenImpl <em>TChildren</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TChildrenImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTChildren()
	 * @generated
	 */
	int TCHILDREN = 13;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHILDREN__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHILDREN__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHILDREN__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHILDREN__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Case File Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHILDREN__CASE_FILE_ITEM = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TChildren</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHILDREN_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TChildren</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHILDREN_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TCmmnElementWithMixedContentImpl <em>TCmmn Element With Mixed Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TCmmnElementWithMixedContentImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCmmnElementWithMixedContent()
	 * @generated
	 */
	int TCMMN_ELEMENT_WITH_MIXED_CONTENT = 15;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCMMN_ELEMENT_WITH_MIXED_CONTENT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCMMN_ELEMENT_WITH_MIXED_CONTENT__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCMMN_ELEMENT_WITH_MIXED_CONTENT__EXTENSION_ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCMMN_ELEMENT_WITH_MIXED_CONTENT__ID = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCMMN_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>TCmmn Element With Mixed Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCMMN_ELEMENT_WITH_MIXED_CONTENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>TCmmn Element With Mixed Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCMMN_ELEMENT_WITH_MIXED_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TCriterionImpl <em>TCriterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TCriterionImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCriterion()
	 * @generated
	 */
	int TCRITERION = 16;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITERION__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITERION__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITERION__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITERION__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITERION__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sentry Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITERION__SENTRY_REF = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TCriterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITERION_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TCriterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCRITERION_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TDecisionImpl <em>TDecision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TDecisionImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTDecision()
	 * @generated
	 */
	int TDECISION = 17;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__INPUT = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__OUTPUT = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>External Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__EXTERNAL_REF = TCMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__IMPLEMENTATION_TYPE = TCMMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TDecision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TDecision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TDecisionParameterImpl <em>TDecision Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TDecisionParameterImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTDecisionParameter()
	 * @generated
	 */
	int TDECISION_PARAMETER = 18;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_PARAMETER__DOCUMENTATION = TPARAMETER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_PARAMETER__EXTENSION_ELEMENTS = TPARAMETER__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_PARAMETER__ID = TPARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_PARAMETER__ANY_ATTRIBUTE = TPARAMETER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_PARAMETER__NAME = TPARAMETER__NAME;

	/**
	 * The number of structural features of the '<em>TDecision Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_PARAMETER_FEATURE_COUNT = TPARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TDecision Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_PARAMETER_OPERATION_COUNT = TPARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TDecisionTaskImpl <em>TDecision Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TDecisionTaskImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTDecisionTask()
	 * @generated
	 */
	int TDECISION_TASK = 19;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TASK__DOCUMENTATION = TTASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TASK__EXTENSION_ELEMENTS = TTASK__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TASK__ID = TTASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TASK__ANY_ATTRIBUTE = TTASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Default Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TASK__DEFAULT_CONTROL = TTASK__DEFAULT_CONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TASK__NAME = TTASK__NAME;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TASK__INPUT = TTASK__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TASK__OUTPUT = TTASK__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Blocking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TASK__IS_BLOCKING = TTASK__IS_BLOCKING;

	/**
	 * The feature id for the '<em><b>Parameter Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TASK__PARAMETER_MAPPING = TTASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decision Ref Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TASK__DECISION_REF_EXPRESSION = TTASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Decision Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TASK__DECISION_REF = TTASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TDecision Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TASK_FEATURE_COUNT = TTASK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TDecision Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TASK_OPERATION_COUNT = TTASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TDefinitionsImpl <em>TDefinitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TDefinitionsImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTDefinitions()
	 * @generated
	 */
	int TDEFINITIONS = 20;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__IMPORT = 0;

	/**
	 * The feature id for the '<em><b>Case File Item Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__CASE_FILE_ITEM_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__CASE = 2;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__PROCESS = 3;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__DECISION = 4;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__EXTENSION_ELEMENTS = 5;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Artifact Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ARTIFACT_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ARTIFACT = 8;

	/**
	 * The feature id for the '<em><b>CMMNDI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__CMMNDI = 9;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__AUTHOR = 10;

	/**
	 * The feature id for the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__CREATION_DATE = 11;

	/**
	 * The feature id for the '<em><b>Exporter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__EXPORTER = 12;

	/**
	 * The feature id for the '<em><b>Exporter Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__EXPORTER_VERSION = 13;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__EXPRESSION_LANGUAGE = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ID = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__NAME = 16;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__TARGET_NAMESPACE = 17;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ANY_ATTRIBUTE = 18;

	/**
	 * The number of structural features of the '<em>TDefinitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>TDefinitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TTableItemImpl <em>TTable Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TTableItemImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTTableItem()
	 * @generated
	 */
	int TTABLE_ITEM = 54;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTABLE_ITEM__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTABLE_ITEM__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTABLE_ITEM__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTABLE_ITEM__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applicability Rule Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTABLE_ITEM__APPLICABILITY_RULE_REFS = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Authorized Role Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTABLE_ITEM__AUTHORIZED_ROLE_REFS = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TTable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTABLE_ITEM_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TTable Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTABLE_ITEM_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TDiscretionaryItemImpl <em>TDiscretionary Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TDiscretionaryItemImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTDiscretionaryItem()
	 * @generated
	 */
	int TDISCRETIONARY_ITEM = 21;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISCRETIONARY_ITEM__DOCUMENTATION = TTABLE_ITEM__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISCRETIONARY_ITEM__EXTENSION_ELEMENTS = TTABLE_ITEM__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISCRETIONARY_ITEM__ID = TTABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISCRETIONARY_ITEM__ANY_ATTRIBUTE = TTABLE_ITEM__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applicability Rule Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISCRETIONARY_ITEM__APPLICABILITY_RULE_REFS = TTABLE_ITEM__APPLICABILITY_RULE_REFS;

	/**
	 * The feature id for the '<em><b>Authorized Role Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISCRETIONARY_ITEM__AUTHORIZED_ROLE_REFS = TTABLE_ITEM__AUTHORIZED_ROLE_REFS;

	/**
	 * The feature id for the '<em><b>Item Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISCRETIONARY_ITEM__ITEM_CONTROL = TTABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entry Criterion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISCRETIONARY_ITEM__ENTRY_CRITERION = TTABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exit Criterion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISCRETIONARY_ITEM__EXIT_CRITERION = TTABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Definition Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISCRETIONARY_ITEM__DEFINITION_REF = TTABLE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISCRETIONARY_ITEM__NAME = TTABLE_ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TDiscretionary Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISCRETIONARY_ITEM_FEATURE_COUNT = TTABLE_ITEM_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TDiscretionary Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDISCRETIONARY_ITEM_OPERATION_COUNT = TTABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TDocumentationImpl <em>TDocumentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TDocumentationImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTDocumentation()
	 * @generated
	 */
	int TDOCUMENTATION = 22;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION__ANY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION__ID = 2;

	/**
	 * The feature id for the '<em><b>Text Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION__TEXT_FORMAT = 3;

	/**
	 * The number of structural features of the '<em>TDocumentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TDocumentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDOCUMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TEntryCriterionImpl <em>TEntry Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TEntryCriterionImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTEntryCriterion()
	 * @generated
	 */
	int TENTRY_CRITERION = 23;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTRY_CRITERION__DOCUMENTATION = TCRITERION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTRY_CRITERION__EXTENSION_ELEMENTS = TCRITERION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTRY_CRITERION__ID = TCRITERION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTRY_CRITERION__ANY_ATTRIBUTE = TCRITERION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTRY_CRITERION__NAME = TCRITERION__NAME;

	/**
	 * The feature id for the '<em><b>Sentry Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTRY_CRITERION__SENTRY_REF = TCRITERION__SENTRY_REF;

	/**
	 * The number of structural features of the '<em>TEntry Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTRY_CRITERION_FEATURE_COUNT = TCRITERION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TEntry Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTRY_CRITERION_OPERATION_COUNT = TCRITERION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TEventListenerImpl <em>TEvent Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TEventListenerImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTEventListener()
	 * @generated
	 */
	int TEVENT_LISTENER = 24;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_LISTENER__DOCUMENTATION = TPLAN_ITEM_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_LISTENER__EXTENSION_ELEMENTS = TPLAN_ITEM_DEFINITION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_LISTENER__ID = TPLAN_ITEM_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_LISTENER__ANY_ATTRIBUTE = TPLAN_ITEM_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Default Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_LISTENER__DEFAULT_CONTROL = TPLAN_ITEM_DEFINITION__DEFAULT_CONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_LISTENER__NAME = TPLAN_ITEM_DEFINITION__NAME;

	/**
	 * The number of structural features of the '<em>TEvent Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_LISTENER_FEATURE_COUNT = TPLAN_ITEM_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TEvent Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_LISTENER_OPERATION_COUNT = TPLAN_ITEM_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TExitCriterionImpl <em>TExit Criterion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TExitCriterionImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTExitCriterion()
	 * @generated
	 */
	int TEXIT_CRITERION = 25;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXIT_CRITERION__DOCUMENTATION = TCRITERION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXIT_CRITERION__EXTENSION_ELEMENTS = TCRITERION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXIT_CRITERION__ID = TCRITERION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXIT_CRITERION__ANY_ATTRIBUTE = TCRITERION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXIT_CRITERION__NAME = TCRITERION__NAME;

	/**
	 * The feature id for the '<em><b>Sentry Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXIT_CRITERION__SENTRY_REF = TCRITERION__SENTRY_REF;

	/**
	 * The number of structural features of the '<em>TExit Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXIT_CRITERION_FEATURE_COUNT = TCRITERION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TExit Criterion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXIT_CRITERION_OPERATION_COUNT = TCRITERION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TExpressionImpl <em>TExpression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TExpressionImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTExpression()
	 * @generated
	 */
	int TEXPRESSION = 26;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPRESSION__MIXED = TCMMN_ELEMENT_WITH_MIXED_CONTENT__MIXED;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPRESSION__DOCUMENTATION = TCMMN_ELEMENT_WITH_MIXED_CONTENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPRESSION__EXTENSION_ELEMENTS = TCMMN_ELEMENT_WITH_MIXED_CONTENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPRESSION__ID = TCMMN_ELEMENT_WITH_MIXED_CONTENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPRESSION__ANY_ATTRIBUTE = TCMMN_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPRESSION__LANGUAGE = TCMMN_ELEMENT_WITH_MIXED_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPRESSION_FEATURE_COUNT = TCMMN_ELEMENT_WITH_MIXED_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPRESSION_OPERATION_COUNT = TCMMN_ELEMENT_WITH_MIXED_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TExtensionElementsImpl <em>TExtension Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TExtensionElementsImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTExtensionElements()
	 * @generated
	 */
	int TEXTENSION_ELEMENTS = 27;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION_ELEMENTS__ANY = 0;

	/**
	 * The number of structural features of the '<em>TExtension Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION_ELEMENTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TExtension Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION_ELEMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.THumanTaskImpl <em>THuman Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.THumanTaskImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTHumanTask()
	 * @generated
	 */
	int THUMAN_TASK = 28;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMAN_TASK__DOCUMENTATION = TTASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMAN_TASK__EXTENSION_ELEMENTS = TTASK__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMAN_TASK__ID = TTASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMAN_TASK__ANY_ATTRIBUTE = TTASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Default Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMAN_TASK__DEFAULT_CONTROL = TTASK__DEFAULT_CONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMAN_TASK__NAME = TTASK__NAME;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMAN_TASK__INPUT = TTASK__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMAN_TASK__OUTPUT = TTASK__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Blocking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMAN_TASK__IS_BLOCKING = TTASK__IS_BLOCKING;

	/**
	 * The feature id for the '<em><b>Planning Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMAN_TASK__PLANNING_TABLE = TTASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Performer Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMAN_TASK__PERFORMER_REF = TTASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>THuman Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMAN_TASK_FEATURE_COUNT = TTASK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>THuman Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMAN_TASK_OPERATION_COUNT = TTASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TIfPartImpl <em>TIf Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TIfPartImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTIfPart()
	 * @generated
	 */
	int TIF_PART = 29;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_PART__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_PART__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_PART__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_PART__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_PART__CONDITION = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_PART__CONTEXT_REF = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TIf Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_PART_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TIf Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_PART_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TImportImpl <em>TImport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TImportImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTImport()
	 * @generated
	 */
	int TIMPORT = 30;

	/**
	 * The feature id for the '<em><b>Import Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__IMPORT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__NAMESPACE = 2;

	/**
	 * The number of structural features of the '<em>TImport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TImport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TManualActivationRuleImpl <em>TManual Activation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TManualActivationRuleImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTManualActivationRule()
	 * @generated
	 */
	int TMANUAL_ACTIVATION_RULE = 31;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_ACTIVATION_RULE__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_ACTIVATION_RULE__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_ACTIVATION_RULE__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_ACTIVATION_RULE__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_ACTIVATION_RULE__CONDITION = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_ACTIVATION_RULE__CONTEXT_REF = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_ACTIVATION_RULE__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TManual Activation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_ACTIVATION_RULE_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TManual Activation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_ACTIVATION_RULE_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TMilestoneImpl <em>TMilestone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TMilestoneImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTMilestone()
	 * @generated
	 */
	int TMILESTONE = 32;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMILESTONE__DOCUMENTATION = TPLAN_ITEM_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMILESTONE__EXTENSION_ELEMENTS = TPLAN_ITEM_DEFINITION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMILESTONE__ID = TPLAN_ITEM_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMILESTONE__ANY_ATTRIBUTE = TPLAN_ITEM_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Default Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMILESTONE__DEFAULT_CONTROL = TPLAN_ITEM_DEFINITION__DEFAULT_CONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMILESTONE__NAME = TPLAN_ITEM_DEFINITION__NAME;

	/**
	 * The number of structural features of the '<em>TMilestone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMILESTONE_FEATURE_COUNT = TPLAN_ITEM_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TMilestone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMILESTONE_OPERATION_COUNT = TPLAN_ITEM_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TParameterMappingImpl <em>TParameter Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TParameterMappingImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTParameterMapping()
	 * @generated
	 */
	int TPARAMETER_MAPPING = 35;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_MAPPING__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_MAPPING__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_MAPPING__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_MAPPING__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_MAPPING__TRANSFORMATION = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_MAPPING__SOURCE_REF = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_MAPPING__TARGET_REF = TCMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TParameter Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_MAPPING_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TParameter Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARAMETER_MAPPING_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TPlanFragmentImpl <em>TPlan Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TPlanFragmentImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTPlanFragment()
	 * @generated
	 */
	int TPLAN_FRAGMENT = 36;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_FRAGMENT__DOCUMENTATION = TPLAN_ITEM_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_FRAGMENT__EXTENSION_ELEMENTS = TPLAN_ITEM_DEFINITION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_FRAGMENT__ID = TPLAN_ITEM_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_FRAGMENT__ANY_ATTRIBUTE = TPLAN_ITEM_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Default Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_FRAGMENT__DEFAULT_CONTROL = TPLAN_ITEM_DEFINITION__DEFAULT_CONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_FRAGMENT__NAME = TPLAN_ITEM_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Plan Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_FRAGMENT__PLAN_ITEM = TPLAN_ITEM_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sentry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_FRAGMENT__SENTRY = TPLAN_ITEM_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TPlan Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_FRAGMENT_FEATURE_COUNT = TPLAN_ITEM_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TPlan Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_FRAGMENT_OPERATION_COUNT = TPLAN_ITEM_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TPlanItemImpl <em>TPlan Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TPlanItemImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTPlanItem()
	 * @generated
	 */
	int TPLAN_ITEM = 37;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Item Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM__ITEM_CONTROL = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entry Criterion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM__ENTRY_CRITERION = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exit Criterion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM__EXIT_CRITERION = TCMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Definition Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM__DEFINITION_REF = TCMMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TPlan Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TPlan Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TPlanItemControlImpl <em>TPlan Item Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TPlanItemControlImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTPlanItemControl()
	 * @generated
	 */
	int TPLAN_ITEM_CONTROL = 38;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_CONTROL__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_CONTROL__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_CONTROL__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_CONTROL__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Repetition Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_CONTROL__REPETITION_RULE = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_CONTROL__REQUIRED_RULE = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Manual Activation Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_CONTROL__MANUAL_ACTIVATION_RULE = TCMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TPlan Item Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_CONTROL_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TPlan Item Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_CONTROL_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TPlanItemOnPartImpl <em>TPlan Item On Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TPlanItemOnPartImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTPlanItemOnPart()
	 * @generated
	 */
	int TPLAN_ITEM_ON_PART = 40;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_ON_PART__DOCUMENTATION = TON_PART__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_ON_PART__EXTENSION_ELEMENTS = TON_PART__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_ON_PART__ID = TON_PART__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_ON_PART__ANY_ATTRIBUTE = TON_PART__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_ON_PART__NAME = TON_PART__NAME;

	/**
	 * The feature id for the '<em><b>Standard Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_ON_PART__STANDARD_EVENT = TON_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exit Criterion Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_ON_PART__EXIT_CRITERION_REF = TON_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_ON_PART__SOURCE_REF = TON_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TPlan Item On Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_ON_PART_FEATURE_COUNT = TON_PART_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TPlan Item On Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_ON_PART_OPERATION_COUNT = TON_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TPlanItemStartTriggerImpl <em>TPlan Item Start Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TPlanItemStartTriggerImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTPlanItemStartTrigger()
	 * @generated
	 */
	int TPLAN_ITEM_START_TRIGGER = 41;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_START_TRIGGER__DOCUMENTATION = TSTART_TRIGGER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_START_TRIGGER__EXTENSION_ELEMENTS = TSTART_TRIGGER__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_START_TRIGGER__ID = TSTART_TRIGGER__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_START_TRIGGER__ANY_ATTRIBUTE = TSTART_TRIGGER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Standard Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_START_TRIGGER__STANDARD_EVENT = TSTART_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_START_TRIGGER__SOURCE_REF = TSTART_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TPlan Item Start Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_START_TRIGGER_FEATURE_COUNT = TSTART_TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TPlan Item Start Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLAN_ITEM_START_TRIGGER_OPERATION_COUNT = TSTART_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TPlanningTableImpl <em>TPlanning Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TPlanningTableImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTPlanningTable()
	 * @generated
	 */
	int TPLANNING_TABLE = 42;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLANNING_TABLE__DOCUMENTATION = TTABLE_ITEM__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLANNING_TABLE__EXTENSION_ELEMENTS = TTABLE_ITEM__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLANNING_TABLE__ID = TTABLE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLANNING_TABLE__ANY_ATTRIBUTE = TTABLE_ITEM__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Applicability Rule Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLANNING_TABLE__APPLICABILITY_RULE_REFS = TTABLE_ITEM__APPLICABILITY_RULE_REFS;

	/**
	 * The feature id for the '<em><b>Authorized Role Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLANNING_TABLE__AUTHORIZED_ROLE_REFS = TTABLE_ITEM__AUTHORIZED_ROLE_REFS;

	/**
	 * The feature id for the '<em><b>Table Item Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLANNING_TABLE__TABLE_ITEM_GROUP = TTABLE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Table Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLANNING_TABLE__TABLE_ITEM = TTABLE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Applicability Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLANNING_TABLE__APPLICABILITY_RULE = TTABLE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TPlanning Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLANNING_TABLE_FEATURE_COUNT = TTABLE_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TPlanning Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPLANNING_TABLE_OPERATION_COUNT = TTABLE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TProcessImpl <em>TProcess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TProcessImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTProcess()
	 * @generated
	 */
	int TPROCESS = 43;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__INPUT = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__OUTPUT = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>External Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__EXTERNAL_REF = TCMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implementation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__IMPLEMENTATION_TYPE = TCMMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TProcess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TProcess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TProcessParameterImpl <em>TProcess Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TProcessParameterImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTProcessParameter()
	 * @generated
	 */
	int TPROCESS_PARAMETER = 44;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_PARAMETER__DOCUMENTATION = TPARAMETER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_PARAMETER__EXTENSION_ELEMENTS = TPARAMETER__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_PARAMETER__ID = TPARAMETER__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_PARAMETER__ANY_ATTRIBUTE = TPARAMETER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_PARAMETER__NAME = TPARAMETER__NAME;

	/**
	 * The number of structural features of the '<em>TProcess Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_PARAMETER_FEATURE_COUNT = TPARAMETER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TProcess Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_PARAMETER_OPERATION_COUNT = TPARAMETER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TProcessTaskImpl <em>TProcess Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TProcessTaskImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTProcessTask()
	 * @generated
	 */
	int TPROCESS_TASK = 45;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_TASK__DOCUMENTATION = TTASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_TASK__EXTENSION_ELEMENTS = TTASK__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_TASK__ID = TTASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_TASK__ANY_ATTRIBUTE = TTASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Default Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_TASK__DEFAULT_CONTROL = TTASK__DEFAULT_CONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_TASK__NAME = TTASK__NAME;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_TASK__INPUT = TTASK__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_TASK__OUTPUT = TTASK__OUTPUT;

	/**
	 * The feature id for the '<em><b>Is Blocking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_TASK__IS_BLOCKING = TTASK__IS_BLOCKING;

	/**
	 * The feature id for the '<em><b>Parameter Mapping</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_TASK__PARAMETER_MAPPING = TTASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Process Ref Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_TASK__PROCESS_REF_EXPRESSION = TTASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Process Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_TASK__PROCESS_REF = TTASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TProcess Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_TASK_FEATURE_COUNT = TTASK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TProcess Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_TASK_OPERATION_COUNT = TTASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TPropertyImpl <em>TProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TPropertyImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTProperty()
	 * @generated
	 */
	int TPROPERTY = 46;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__TYPE = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TRelationshipImpl <em>TRelationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TRelationshipImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTRelationship()
	 * @generated
	 */
	int TRELATIONSHIP = 47;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP__SOURCE = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP__TARGET = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP__DIRECTION = TCMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP__TYPE = TCMMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TRelationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TRelationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TRepetitionRuleImpl <em>TRepetition Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TRepetitionRuleImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTRepetitionRule()
	 * @generated
	 */
	int TREPETITION_RULE = 48;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPETITION_RULE__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPETITION_RULE__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPETITION_RULE__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPETITION_RULE__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPETITION_RULE__CONDITION = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPETITION_RULE__CONTEXT_REF = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPETITION_RULE__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TRepetition Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPETITION_RULE_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TRepetition Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREPETITION_RULE_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TRequiredRuleImpl <em>TRequired Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TRequiredRuleImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTRequiredRule()
	 * @generated
	 */
	int TREQUIRED_RULE = 49;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_RULE__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_RULE__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_RULE__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_RULE__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_RULE__CONDITION = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Context Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_RULE__CONTEXT_REF = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_RULE__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TRequired Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_RULE_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TRequired Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREQUIRED_RULE_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TRoleImpl <em>TRole</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TRoleImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTRole()
	 * @generated
	 */
	int TROLE = 50;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROLE__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROLE__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROLE__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROLE__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROLE__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TRole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROLE_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TRole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROLE_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TSentryImpl <em>TSentry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TSentryImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTSentry()
	 * @generated
	 */
	int TSENTRY = 51;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSENTRY__DOCUMENTATION = TCMMN_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSENTRY__EXTENSION_ELEMENTS = TCMMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSENTRY__ID = TCMMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSENTRY__ANY_ATTRIBUTE = TCMMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>On Part Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSENTRY__ON_PART_GROUP = TCMMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>On Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSENTRY__ON_PART = TCMMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>If Part</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSENTRY__IF_PART = TCMMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSENTRY__NAME = TCMMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TSentry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSENTRY_FEATURE_COUNT = TCMMN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TSentry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSENTRY_OPERATION_COUNT = TCMMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TStageImpl <em>TStage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TStageImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTStage()
	 * @generated
	 */
	int TSTAGE = 52;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTAGE__DOCUMENTATION = TPLAN_FRAGMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTAGE__EXTENSION_ELEMENTS = TPLAN_FRAGMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTAGE__ID = TPLAN_FRAGMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTAGE__ANY_ATTRIBUTE = TPLAN_FRAGMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Default Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTAGE__DEFAULT_CONTROL = TPLAN_FRAGMENT__DEFAULT_CONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTAGE__NAME = TPLAN_FRAGMENT__NAME;

	/**
	 * The feature id for the '<em><b>Plan Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTAGE__PLAN_ITEM = TPLAN_FRAGMENT__PLAN_ITEM;

	/**
	 * The feature id for the '<em><b>Sentry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTAGE__SENTRY = TPLAN_FRAGMENT__SENTRY;

	/**
	 * The feature id for the '<em><b>Planning Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTAGE__PLANNING_TABLE = TPLAN_FRAGMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Plan Item Definition Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTAGE__PLAN_ITEM_DEFINITION_GROUP = TPLAN_FRAGMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Plan Item Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTAGE__PLAN_ITEM_DEFINITION = TPLAN_FRAGMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Exit Criterion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTAGE__EXIT_CRITERION = TPLAN_FRAGMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Auto Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTAGE__AUTO_COMPLETE = TPLAN_FRAGMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TStage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTAGE_FEATURE_COUNT = TPLAN_FRAGMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TStage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTAGE_OPERATION_COUNT = TPLAN_FRAGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TTextAnnotationImpl <em>TText Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TTextAnnotationImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTTextAnnotation()
	 * @generated
	 */
	int TTEXT_ANNOTATION = 56;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION__DOCUMENTATION = TARTIFACT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION__EXTENSION_ELEMENTS = TARTIFACT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION__ID = TARTIFACT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION__ANY_ATTRIBUTE = TARTIFACT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION__TEXT = TARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION__TEXT_FORMAT = TARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TText Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION_FEATURE_COUNT = TARTIFACT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TText Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION_OPERATION_COUNT = TARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TTimerEventListenerImpl <em>TTimer Event Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TTimerEventListenerImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTTimerEventListener()
	 * @generated
	 */
	int TTIMER_EVENT_LISTENER = 57;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIMER_EVENT_LISTENER__DOCUMENTATION = TEVENT_LISTENER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIMER_EVENT_LISTENER__EXTENSION_ELEMENTS = TEVENT_LISTENER__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIMER_EVENT_LISTENER__ID = TEVENT_LISTENER__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIMER_EVENT_LISTENER__ANY_ATTRIBUTE = TEVENT_LISTENER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Default Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIMER_EVENT_LISTENER__DEFAULT_CONTROL = TEVENT_LISTENER__DEFAULT_CONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIMER_EVENT_LISTENER__NAME = TEVENT_LISTENER__NAME;

	/**
	 * The feature id for the '<em><b>Timer Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIMER_EVENT_LISTENER__TIMER_EXPRESSION = TEVENT_LISTENER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Timer Start Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIMER_EVENT_LISTENER__TIMER_START_GROUP = TEVENT_LISTENER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timer Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIMER_EVENT_LISTENER__TIMER_START = TEVENT_LISTENER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TTimer Event Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIMER_EVENT_LISTENER_FEATURE_COUNT = TEVENT_LISTENER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TTimer Event Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIMER_EVENT_LISTENER_OPERATION_COUNT = TEVENT_LISTENER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.impl.TUserEventListenerImpl <em>TUser Event Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.impl.TUserEventListenerImpl
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTUserEventListener()
	 * @generated
	 */
	int TUSER_EVENT_LISTENER = 58;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_EVENT_LISTENER__DOCUMENTATION = TEVENT_LISTENER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_EVENT_LISTENER__EXTENSION_ELEMENTS = TEVENT_LISTENER__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_EVENT_LISTENER__ID = TEVENT_LISTENER__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_EVENT_LISTENER__ANY_ATTRIBUTE = TEVENT_LISTENER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Default Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_EVENT_LISTENER__DEFAULT_CONTROL = TEVENT_LISTENER__DEFAULT_CONTROL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_EVENT_LISTENER__NAME = TEVENT_LISTENER__NAME;

	/**
	 * The feature id for the '<em><b>Authorized Role Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_EVENT_LISTENER__AUTHORIZED_ROLE_REFS = TEVENT_LISTENER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TUser Event Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_EVENT_LISTENER_FEATURE_COUNT = TEVENT_LISTENER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TUser Event Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_EVENT_LISTENER_OPERATION_COUNT = TEVENT_LISTENER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.CaseFileItemTransition <em>Case File Item Transition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.CaseFileItemTransition
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getCaseFileItemTransition()
	 * @generated
	 */
	int CASE_FILE_ITEM_TRANSITION = 59;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.DecisionTypeEnumMember1 <em>Decision Type Enum Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.DecisionTypeEnumMember1
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getDecisionTypeEnumMember1()
	 * @generated
	 */
	int DECISION_TYPE_ENUM_MEMBER1 = 60;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.DefinitionTypeEnumMember1 <em>Definition Type Enum Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.DefinitionTypeEnumMember1
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getDefinitionTypeEnumMember1()
	 * @generated
	 */
	int DEFINITION_TYPE_ENUM_MEMBER1 = 61;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.MultiplicityEnum <em>Multiplicity Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.MultiplicityEnum
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getMultiplicityEnum()
	 * @generated
	 */
	int MULTIPLICITY_ENUM = 62;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.PlanItemTransition <em>Plan Item Transition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.PlanItemTransition
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getPlanItemTransition()
	 * @generated
	 */
	int PLAN_ITEM_TRANSITION = 63;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.ProcessTypeEnumMember1 <em>Process Type Enum Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.ProcessTypeEnumMember1
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getProcessTypeEnumMember1()
	 * @generated
	 */
	int PROCESS_TYPE_ENUM_MEMBER1 = 64;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.PropertyTypeEnumMember1 <em>Property Type Enum Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.PropertyTypeEnumMember1
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getPropertyTypeEnumMember1()
	 * @generated
	 */
	int PROPERTY_TYPE_ENUM_MEMBER1 = 65;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.TAssociationDirection <em>TAssociation Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.TAssociationDirection
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTAssociationDirection()
	 * @generated
	 */
	int TASSOCIATION_DIRECTION = 66;

	/**
	 * The meta object id for the '{@link org.omg.spec.cmmn.casemodel.TRelationshipDirection <em>TRelationship Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.TRelationshipDirection
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTRelationshipDirection()
	 * @generated
	 */
	int TRELATIONSHIP_DIRECTION = 67;

	/**
	 * The meta object id for the '<em>Case File Item Transition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.CaseFileItemTransition
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getCaseFileItemTransitionObject()
	 * @generated
	 */
	int CASE_FILE_ITEM_TRANSITION_OBJECT = 68;

	/**
	 * The meta object id for the '<em>Decision Type Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getDecisionTypeEnum()
	 * @generated
	 */
	int DECISION_TYPE_ENUM = 69;

	/**
	 * The meta object id for the '<em>Decision Type Enum Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.DecisionTypeEnumMember1
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getDecisionTypeEnumMember1Object()
	 * @generated
	 */
	int DECISION_TYPE_ENUM_MEMBER1_OBJECT = 70;

	/**
	 * The meta object id for the '<em>Definition Type Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getDefinitionTypeEnum()
	 * @generated
	 */
	int DEFINITION_TYPE_ENUM = 71;

	/**
	 * The meta object id for the '<em>Definition Type Enum Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.DefinitionTypeEnumMember1
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getDefinitionTypeEnumMember1Object()
	 * @generated
	 */
	int DEFINITION_TYPE_ENUM_MEMBER1_OBJECT = 72;

	/**
	 * The meta object id for the '<em>Multiplicity Enum Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.MultiplicityEnum
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getMultiplicityEnumObject()
	 * @generated
	 */
	int MULTIPLICITY_ENUM_OBJECT = 73;

	/**
	 * The meta object id for the '<em>Plan Item Transition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.PlanItemTransition
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getPlanItemTransitionObject()
	 * @generated
	 */
	int PLAN_ITEM_TRANSITION_OBJECT = 74;

	/**
	 * The meta object id for the '<em>Process Type Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getProcessTypeEnum()
	 * @generated
	 */
	int PROCESS_TYPE_ENUM = 75;

	/**
	 * The meta object id for the '<em>Process Type Enum Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.ProcessTypeEnumMember1
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getProcessTypeEnumMember1Object()
	 * @generated
	 */
	int PROCESS_TYPE_ENUM_MEMBER1_OBJECT = 76;

	/**
	 * The meta object id for the '<em>Property Type Enum</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getPropertyTypeEnum()
	 * @generated
	 */
	int PROPERTY_TYPE_ENUM = 77;

	/**
	 * The meta object id for the '<em>Property Type Enum Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.PropertyTypeEnumMember1
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getPropertyTypeEnumMember1Object()
	 * @generated
	 */
	int PROPERTY_TYPE_ENUM_MEMBER1_OBJECT = 78;

	/**
	 * The meta object id for the '<em>TAssociation Direction Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.TAssociationDirection
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTAssociationDirectionObject()
	 * @generated
	 */
	int TASSOCIATION_DIRECTION_OBJECT = 79;

	/**
	 * The meta object id for the '<em>TRelationship Direction Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.cmmn.casemodel.TRelationshipDirection
	 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTRelationshipDirectionObject()
	 * @generated
	 */
	int TRELATIONSHIP_DIRECTION_OBJECT = 80;


	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot
	 * @generated
	 */
	EClass getCaseModelRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getMixed()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EAttribute getCaseModelRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getXMLNSPrefixMap()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getXSISchemaLocation()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getApplicabilityRule <em>Applicability Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Applicability Rule</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getApplicabilityRule()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_ApplicabilityRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifact</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getArtifact()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_Artifact();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Association</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getAssociation()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_Association();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Case</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getCase()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_Case();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getCaseFile <em>Case File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Case File</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getCaseFile()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_CaseFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getCaseFileItem <em>Case File Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Case File Item</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getCaseFileItem()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_CaseFileItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getCaseFileItemDefinition <em>Case File Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Case File Item Definition</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getCaseFileItemDefinition()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_CaseFileItemDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getCaseFileItemOnPart <em>Case File Item On Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Case File Item On Part</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getCaseFileItemOnPart()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_CaseFileItemOnPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getOnPart <em>On Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On Part</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getOnPart()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_OnPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getCaseFileItemStartTrigger <em>Case File Item Start Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Case File Item Start Trigger</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getCaseFileItemStartTrigger()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_CaseFileItemStartTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getTimerStart <em>Timer Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timer Start</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getTimerStart()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_TimerStart();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getCaseParameter <em>Case Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Case Parameter</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getCaseParameter()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_CaseParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getParameter()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getCaseTask <em>Case Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Case Task</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getCaseTask()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_CaseTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getTask()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_Task();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getPlanItemDefinition <em>Plan Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan Item Definition</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getPlanItemDefinition()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_PlanItemDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decision</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getDecision()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_Decision();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getDecisionParameter <em>Decision Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decision Parameter</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getDecisionParameter()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_DecisionParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getDecisionTask <em>Decision Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decision Task</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getDecisionTask()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_DecisionTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definitions</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getDefinitions()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_Definitions();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getDiscretionaryItem <em>Discretionary Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discretionary Item</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getDiscretionaryItem()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_DiscretionaryItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getTableItem <em>Table Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Item</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getTableItem()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_TableItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getDocumentation()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getEntryCriterion <em>Entry Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry Criterion</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getEntryCriterion()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_EntryCriterion();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getEventListener <em>Event Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Listener</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getEventListener()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_EventListener();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getExitCriterion <em>Exit Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit Criterion</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getExitCriterion()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_ExitCriterion();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getExpression()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getExtensionElements <em>Extension Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension Elements</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getExtensionElements()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_ExtensionElements();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getHumanTask <em>Human Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Human Task</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getHumanTask()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_HumanTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getIfPart <em>If Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Part</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getIfPart()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_IfPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Import</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getImport()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_Import();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getManualActivationRule <em>Manual Activation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manual Activation Rule</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getManualActivationRule()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_ManualActivationRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getMilestone <em>Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Milestone</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getMilestone()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_Milestone();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getParameterMapping <em>Parameter Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Mapping</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getParameterMapping()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_ParameterMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getPlanFragment <em>Plan Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan Fragment</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getPlanFragment()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_PlanFragment();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getPlanItem <em>Plan Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan Item</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getPlanItem()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_PlanItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getPlanItemControl <em>Plan Item Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan Item Control</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getPlanItemControl()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_PlanItemControl();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getPlanItemOnPart <em>Plan Item On Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan Item On Part</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getPlanItemOnPart()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_PlanItemOnPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getPlanItemStartTrigger <em>Plan Item Start Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plan Item Start Trigger</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getPlanItemStartTrigger()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_PlanItemStartTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getPlanningTable <em>Planning Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Planning Table</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getPlanningTable()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_PlanningTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getProcess()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_Process();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getProcessParameter <em>Process Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process Parameter</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getProcessParameter()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_ProcessParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getProcessTask <em>Process Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process Task</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getProcessTask()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_ProcessTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getProperty()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_Property();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationship</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getRelationship()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_Relationship();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getRepetitionRule <em>Repetition Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repetition Rule</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getRepetitionRule()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_RepetitionRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getRequiredRule <em>Required Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Rule</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getRequiredRule()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_RequiredRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getRole()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_Role();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getSentry <em>Sentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sentry</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getSentry()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_Sentry();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stage</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getStage()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_Stage();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getTextAnnotation <em>Text Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Annotation</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getTextAnnotation()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_TextAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getTimerEventListener <em>Timer Event Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timer Event Listener</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getTimerEventListener()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_TimerEventListener();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.CaseModelRoot#getUserEventListener <em>User Event Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Event Listener</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseModelRoot#getUserEventListener()
	 * @see #getCaseModelRoot()
	 * @generated
	 */
	EReference getCaseModelRoot_UserEventListener();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TApplicabilityRule <em>TApplicability Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TApplicability Rule</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TApplicabilityRule
	 * @generated
	 */
	EClass getTApplicabilityRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TApplicabilityRule#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TApplicabilityRule#getCondition()
	 * @see #getTApplicabilityRule()
	 * @generated
	 */
	EReference getTApplicabilityRule_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TApplicabilityRule#getContextRef <em>Context Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TApplicabilityRule#getContextRef()
	 * @see #getTApplicabilityRule()
	 * @generated
	 */
	EAttribute getTApplicabilityRule_ContextRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TApplicabilityRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TApplicabilityRule#getName()
	 * @see #getTApplicabilityRule()
	 * @generated
	 */
	EAttribute getTApplicabilityRule_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TArtifact <em>TArtifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TArtifact</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TArtifact
	 * @generated
	 */
	EClass getTArtifact();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TAssociation <em>TAssociation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAssociation</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TAssociation
	 * @generated
	 */
	EClass getTAssociation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TAssociation#getAssociationDirection <em>Association Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Direction</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TAssociation#getAssociationDirection()
	 * @see #getTAssociation()
	 * @generated
	 */
	EAttribute getTAssociation_AssociationDirection();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TAssociation#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TAssociation#getSourceRef()
	 * @see #getTAssociation()
	 * @generated
	 */
	EAttribute getTAssociation_SourceRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TAssociation#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TAssociation#getTargetRef()
	 * @see #getTAssociation()
	 * @generated
	 */
	EAttribute getTAssociation_TargetRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TCase <em>TCase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCase</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCase
	 * @generated
	 */
	EClass getTCase();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TCase#getCaseFileModel <em>Case File Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Case File Model</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCase#getCaseFileModel()
	 * @see #getTCase()
	 * @generated
	 */
	EReference getTCase_CaseFileModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TCase#getCasePlanModel <em>Case Plan Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Case Plan Model</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCase#getCasePlanModel()
	 * @see #getTCase()
	 * @generated
	 */
	EReference getTCase_CasePlanModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TCase#getCaseRoles <em>Case Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Case Roles</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCase#getCaseRoles()
	 * @see #getTCase()
	 * @generated
	 */
	EReference getTCase_CaseRoles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TCase#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCase#getInput()
	 * @see #getTCase()
	 * @generated
	 */
	EReference getTCase_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TCase#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCase#getOutput()
	 * @see #getTCase()
	 * @generated
	 */
	EReference getTCase_Output();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TCase#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCase#getName()
	 * @see #getTCase()
	 * @generated
	 */
	EAttribute getTCase_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TCaseFile <em>TCase File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCase File</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFile
	 * @generated
	 */
	EClass getTCaseFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TCaseFile#getCaseFileItem <em>Case File Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Case File Item</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFile#getCaseFileItem()
	 * @see #getTCaseFile()
	 * @generated
	 */
	EReference getTCaseFile_CaseFileItem();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TCaseFileItem <em>TCase File Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCase File Item</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFileItem
	 * @generated
	 */
	EClass getTCaseFileItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TCaseFileItem#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Children</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFileItem#getChildren()
	 * @see #getTCaseFileItem()
	 * @generated
	 */
	EReference getTCaseFileItem_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TCaseFileItem#getDefinitionRef <em>Definition Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFileItem#getDefinitionRef()
	 * @see #getTCaseFileItem()
	 * @generated
	 */
	EAttribute getTCaseFileItem_DefinitionRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TCaseFileItem#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFileItem#getMultiplicity()
	 * @see #getTCaseFileItem()
	 * @generated
	 */
	EAttribute getTCaseFileItem_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TCaseFileItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFileItem#getName()
	 * @see #getTCaseFileItem()
	 * @generated
	 */
	EAttribute getTCaseFileItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TCaseFileItem#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFileItem#getSourceRef()
	 * @see #getTCaseFileItem()
	 * @generated
	 */
	EAttribute getTCaseFileItem_SourceRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TCaseFileItem#getTargetRefs <em>Target Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Refs</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFileItem#getTargetRefs()
	 * @see #getTCaseFileItem()
	 * @generated
	 */
	EAttribute getTCaseFileItem_TargetRefs();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TCaseFileItemDefinition <em>TCase File Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCase File Item Definition</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFileItemDefinition
	 * @generated
	 */
	EClass getTCaseFileItemDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TCaseFileItemDefinition#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFileItemDefinition#getProperty()
	 * @see #getTCaseFileItemDefinition()
	 * @generated
	 */
	EReference getTCaseFileItemDefinition_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TCaseFileItemDefinition#getDefinitionType <em>Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition Type</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFileItemDefinition#getDefinitionType()
	 * @see #getTCaseFileItemDefinition()
	 * @generated
	 */
	EAttribute getTCaseFileItemDefinition_DefinitionType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TCaseFileItemDefinition#getImportRef <em>Import Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFileItemDefinition#getImportRef()
	 * @see #getTCaseFileItemDefinition()
	 * @generated
	 */
	EAttribute getTCaseFileItemDefinition_ImportRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TCaseFileItemDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFileItemDefinition#getName()
	 * @see #getTCaseFileItemDefinition()
	 * @generated
	 */
	EAttribute getTCaseFileItemDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TCaseFileItemDefinition#getStructureRef <em>Structure Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Structure Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFileItemDefinition#getStructureRef()
	 * @see #getTCaseFileItemDefinition()
	 * @generated
	 */
	EAttribute getTCaseFileItemDefinition_StructureRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TCaseFileItemOnPart <em>TCase File Item On Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCase File Item On Part</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFileItemOnPart
	 * @generated
	 */
	EClass getTCaseFileItemOnPart();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TCaseFileItemOnPart#getStandardEvent <em>Standard Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Event</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFileItemOnPart#getStandardEvent()
	 * @see #getTCaseFileItemOnPart()
	 * @generated
	 */
	EAttribute getTCaseFileItemOnPart_StandardEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TCaseFileItemOnPart#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFileItemOnPart#getSourceRef()
	 * @see #getTCaseFileItemOnPart()
	 * @generated
	 */
	EAttribute getTCaseFileItemOnPart_SourceRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TCaseFileItemStartTrigger <em>TCase File Item Start Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCase File Item Start Trigger</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFileItemStartTrigger
	 * @generated
	 */
	EClass getTCaseFileItemStartTrigger();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TCaseFileItemStartTrigger#getStandardEvent <em>Standard Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Event</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFileItemStartTrigger#getStandardEvent()
	 * @see #getTCaseFileItemStartTrigger()
	 * @generated
	 */
	EAttribute getTCaseFileItemStartTrigger_StandardEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TCaseFileItemStartTrigger#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseFileItemStartTrigger#getSourceRef()
	 * @see #getTCaseFileItemStartTrigger()
	 * @generated
	 */
	EAttribute getTCaseFileItemStartTrigger_SourceRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TCaseParameter <em>TCase Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCase Parameter</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseParameter
	 * @generated
	 */
	EClass getTCaseParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TCaseParameter#getBindingRefinement <em>Binding Refinement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding Refinement</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseParameter#getBindingRefinement()
	 * @see #getTCaseParameter()
	 * @generated
	 */
	EReference getTCaseParameter_BindingRefinement();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TCaseParameter#getBindingRef <em>Binding Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binding Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseParameter#getBindingRef()
	 * @see #getTCaseParameter()
	 * @generated
	 */
	EAttribute getTCaseParameter_BindingRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TCaseRoles <em>TCase Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCase Roles</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseRoles
	 * @generated
	 */
	EClass getTCaseRoles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TCaseRoles#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseRoles#getRole()
	 * @see #getTCaseRoles()
	 * @generated
	 */
	EReference getTCaseRoles_Role();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TCaseTask <em>TCase Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCase Task</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseTask
	 * @generated
	 */
	EClass getTCaseTask();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TCaseTask#getParameterMapping <em>Parameter Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Mapping</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseTask#getParameterMapping()
	 * @see #getTCaseTask()
	 * @generated
	 */
	EReference getTCaseTask_ParameterMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TCaseTask#getCaseRefExpression <em>Case Ref Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Case Ref Expression</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseTask#getCaseRefExpression()
	 * @see #getTCaseTask()
	 * @generated
	 */
	EReference getTCaseTask_CaseRefExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TCaseTask#getCaseRef <em>Case Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Case Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCaseTask#getCaseRef()
	 * @see #getTCaseTask()
	 * @generated
	 */
	EAttribute getTCaseTask_CaseRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TChildren <em>TChildren</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TChildren</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TChildren
	 * @generated
	 */
	EClass getTChildren();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TChildren#getCaseFileItem <em>Case File Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Case File Item</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TChildren#getCaseFileItem()
	 * @see #getTChildren()
	 * @generated
	 */
	EReference getTChildren_CaseFileItem();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TCmmnElement <em>TCmmn Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCmmn Element</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCmmnElement
	 * @generated
	 */
	EClass getTCmmnElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TCmmnElement#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCmmnElement#getDocumentation()
	 * @see #getTCmmnElement()
	 * @generated
	 */
	EReference getTCmmnElement_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TCmmnElement#getExtensionElements <em>Extension Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension Elements</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCmmnElement#getExtensionElements()
	 * @see #getTCmmnElement()
	 * @generated
	 */
	EReference getTCmmnElement_ExtensionElements();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TCmmnElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCmmnElement#getId()
	 * @see #getTCmmnElement()
	 * @generated
	 */
	EAttribute getTCmmnElement_Id();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.cmmn.casemodel.TCmmnElement#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCmmnElement#getAnyAttribute()
	 * @see #getTCmmnElement()
	 * @generated
	 */
	EAttribute getTCmmnElement_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TCmmnElementWithMixedContent <em>TCmmn Element With Mixed Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCmmn Element With Mixed Content</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCmmnElementWithMixedContent
	 * @generated
	 */
	EClass getTCmmnElementWithMixedContent();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.cmmn.casemodel.TCmmnElementWithMixedContent#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCmmnElementWithMixedContent#getMixed()
	 * @see #getTCmmnElementWithMixedContent()
	 * @generated
	 */
	EAttribute getTCmmnElementWithMixedContent_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TCmmnElementWithMixedContent#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCmmnElementWithMixedContent#getDocumentation()
	 * @see #getTCmmnElementWithMixedContent()
	 * @generated
	 */
	EReference getTCmmnElementWithMixedContent_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TCmmnElementWithMixedContent#getExtensionElements <em>Extension Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension Elements</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCmmnElementWithMixedContent#getExtensionElements()
	 * @see #getTCmmnElementWithMixedContent()
	 * @generated
	 */
	EReference getTCmmnElementWithMixedContent_ExtensionElements();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TCmmnElementWithMixedContent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCmmnElementWithMixedContent#getId()
	 * @see #getTCmmnElementWithMixedContent()
	 * @generated
	 */
	EAttribute getTCmmnElementWithMixedContent_Id();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.cmmn.casemodel.TCmmnElementWithMixedContent#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCmmnElementWithMixedContent#getAnyAttribute()
	 * @see #getTCmmnElementWithMixedContent()
	 * @generated
	 */
	EAttribute getTCmmnElementWithMixedContent_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TCriterion <em>TCriterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCriterion</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCriterion
	 * @generated
	 */
	EClass getTCriterion();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TCriterion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCriterion#getName()
	 * @see #getTCriterion()
	 * @generated
	 */
	EAttribute getTCriterion_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TCriterion#getSentryRef <em>Sentry Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sentry Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TCriterion#getSentryRef()
	 * @see #getTCriterion()
	 * @generated
	 */
	EAttribute getTCriterion_SentryRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TDecision <em>TDecision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDecision</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDecision
	 * @generated
	 */
	EClass getTDecision();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TDecision#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDecision#getInput()
	 * @see #getTDecision()
	 * @generated
	 */
	EReference getTDecision_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TDecision#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDecision#getOutput()
	 * @see #getTDecision()
	 * @generated
	 */
	EReference getTDecision_Output();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TDecision#getExternalRef <em>External Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDecision#getExternalRef()
	 * @see #getTDecision()
	 * @generated
	 */
	EAttribute getTDecision_ExternalRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TDecision#getImplementationType <em>Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Type</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDecision#getImplementationType()
	 * @see #getTDecision()
	 * @generated
	 */
	EAttribute getTDecision_ImplementationType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TDecision#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDecision#getName()
	 * @see #getTDecision()
	 * @generated
	 */
	EAttribute getTDecision_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TDecisionParameter <em>TDecision Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDecision Parameter</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDecisionParameter
	 * @generated
	 */
	EClass getTDecisionParameter();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TDecisionTask <em>TDecision Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDecision Task</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDecisionTask
	 * @generated
	 */
	EClass getTDecisionTask();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TDecisionTask#getParameterMapping <em>Parameter Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Mapping</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDecisionTask#getParameterMapping()
	 * @see #getTDecisionTask()
	 * @generated
	 */
	EReference getTDecisionTask_ParameterMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TDecisionTask#getDecisionRefExpression <em>Decision Ref Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decision Ref Expression</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDecisionTask#getDecisionRefExpression()
	 * @see #getTDecisionTask()
	 * @generated
	 */
	EReference getTDecisionTask_DecisionRefExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TDecisionTask#getDecisionRef <em>Decision Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decision Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDecisionTask#getDecisionRef()
	 * @see #getTDecisionTask()
	 * @generated
	 */
	EAttribute getTDecisionTask_DecisionRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TDefinitions <em>TDefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDefinitions</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDefinitions
	 * @generated
	 */
	EClass getTDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TDefinitions#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDefinitions#getImport()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_Import();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TDefinitions#getCaseFileItemDefinition <em>Case File Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Case File Item Definition</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDefinitions#getCaseFileItemDefinition()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_CaseFileItemDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TDefinitions#getCase <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Case</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDefinitions#getCase()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_Case();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TDefinitions#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Process</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDefinitions#getProcess()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_Process();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TDefinitions#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDefinitions#getDecision()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_Decision();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TDefinitions#getExtensionElements <em>Extension Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension Elements</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDefinitions#getExtensionElements()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_ExtensionElements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TDefinitions#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDefinitions#getRelationship()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_Relationship();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.cmmn.casemodel.TDefinitions#getArtifactGroup <em>Artifact Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Artifact Group</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDefinitions#getArtifactGroup()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_ArtifactGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TDefinitions#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDefinitions#getArtifact()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_Artifact();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TDefinitions#getCMMNDI <em>CMMNDI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>CMMNDI</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDefinitions#getCMMNDI()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_CMMNDI();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TDefinitions#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDefinitions#getAuthor()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TDefinitions#getCreationDate <em>Creation Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creation Date</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDefinitions#getCreationDate()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_CreationDate();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TDefinitions#getExporter <em>Exporter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exporter</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDefinitions#getExporter()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_Exporter();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TDefinitions#getExporterVersion <em>Exporter Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exporter Version</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDefinitions#getExporterVersion()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_ExporterVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TDefinitions#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDefinitions#getExpressionLanguage()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_ExpressionLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TDefinitions#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDefinitions#getId()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TDefinitions#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDefinitions#getName()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TDefinitions#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDefinitions#getTargetNamespace()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_TargetNamespace();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.cmmn.casemodel.TDefinitions#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDefinitions#getAnyAttribute()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TDiscretionaryItem <em>TDiscretionary Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDiscretionary Item</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDiscretionaryItem
	 * @generated
	 */
	EClass getTDiscretionaryItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TDiscretionaryItem#getItemControl <em>Item Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Control</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDiscretionaryItem#getItemControl()
	 * @see #getTDiscretionaryItem()
	 * @generated
	 */
	EReference getTDiscretionaryItem_ItemControl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TDiscretionaryItem#getEntryCriterion <em>Entry Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Criterion</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDiscretionaryItem#getEntryCriterion()
	 * @see #getTDiscretionaryItem()
	 * @generated
	 */
	EReference getTDiscretionaryItem_EntryCriterion();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TDiscretionaryItem#getExitCriterion <em>Exit Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exit Criterion</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDiscretionaryItem#getExitCriterion()
	 * @see #getTDiscretionaryItem()
	 * @generated
	 */
	EReference getTDiscretionaryItem_ExitCriterion();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TDiscretionaryItem#getDefinitionRef <em>Definition Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDiscretionaryItem#getDefinitionRef()
	 * @see #getTDiscretionaryItem()
	 * @generated
	 */
	EAttribute getTDiscretionaryItem_DefinitionRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TDiscretionaryItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDiscretionaryItem#getName()
	 * @see #getTDiscretionaryItem()
	 * @generated
	 */
	EAttribute getTDiscretionaryItem_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TDocumentation <em>TDocumentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDocumentation</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDocumentation
	 * @generated
	 */
	EClass getTDocumentation();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.cmmn.casemodel.TDocumentation#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDocumentation#getMixed()
	 * @see #getTDocumentation()
	 * @generated
	 */
	EAttribute getTDocumentation_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.cmmn.casemodel.TDocumentation#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDocumentation#getAny()
	 * @see #getTDocumentation()
	 * @generated
	 */
	EAttribute getTDocumentation_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TDocumentation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDocumentation#getId()
	 * @see #getTDocumentation()
	 * @generated
	 */
	EAttribute getTDocumentation_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TDocumentation#getTextFormat <em>Text Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Format</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TDocumentation#getTextFormat()
	 * @see #getTDocumentation()
	 * @generated
	 */
	EAttribute getTDocumentation_TextFormat();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TEntryCriterion <em>TEntry Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEntry Criterion</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TEntryCriterion
	 * @generated
	 */
	EClass getTEntryCriterion();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TEventListener <em>TEvent Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEvent Listener</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TEventListener
	 * @generated
	 */
	EClass getTEventListener();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TExitCriterion <em>TExit Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExit Criterion</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TExitCriterion
	 * @generated
	 */
	EClass getTExitCriterion();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TExpression <em>TExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExpression</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TExpression
	 * @generated
	 */
	EClass getTExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TExpression#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TExpression#getLanguage()
	 * @see #getTExpression()
	 * @generated
	 */
	EAttribute getTExpression_Language();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TExtensionElements <em>TExtension Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExtension Elements</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TExtensionElements
	 * @generated
	 */
	EClass getTExtensionElements();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.cmmn.casemodel.TExtensionElements#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TExtensionElements#getAny()
	 * @see #getTExtensionElements()
	 * @generated
	 */
	EAttribute getTExtensionElements_Any();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.THumanTask <em>THuman Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>THuman Task</em>'.
	 * @see org.omg.spec.cmmn.casemodel.THumanTask
	 * @generated
	 */
	EClass getTHumanTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.THumanTask#getPlanningTable <em>Planning Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Planning Table</em>'.
	 * @see org.omg.spec.cmmn.casemodel.THumanTask#getPlanningTable()
	 * @see #getTHumanTask()
	 * @generated
	 */
	EReference getTHumanTask_PlanningTable();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.THumanTask#getPerformerRef <em>Performer Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performer Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.THumanTask#getPerformerRef()
	 * @see #getTHumanTask()
	 * @generated
	 */
	EAttribute getTHumanTask_PerformerRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TIfPart <em>TIf Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TIf Part</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TIfPart
	 * @generated
	 */
	EClass getTIfPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TIfPart#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TIfPart#getCondition()
	 * @see #getTIfPart()
	 * @generated
	 */
	EReference getTIfPart_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TIfPart#getContextRef <em>Context Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TIfPart#getContextRef()
	 * @see #getTIfPart()
	 * @generated
	 */
	EAttribute getTIfPart_ContextRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TImport <em>TImport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TImport</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TImport
	 * @generated
	 */
	EClass getTImport();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TImport#getImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Type</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TImport#getImportType()
	 * @see #getTImport()
	 * @generated
	 */
	EAttribute getTImport_ImportType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TImport#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TImport#getLocation()
	 * @see #getTImport()
	 * @generated
	 */
	EAttribute getTImport_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TImport#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TImport#getNamespace()
	 * @see #getTImport()
	 * @generated
	 */
	EAttribute getTImport_Namespace();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TManualActivationRule <em>TManual Activation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TManual Activation Rule</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TManualActivationRule
	 * @generated
	 */
	EClass getTManualActivationRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TManualActivationRule#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TManualActivationRule#getCondition()
	 * @see #getTManualActivationRule()
	 * @generated
	 */
	EReference getTManualActivationRule_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TManualActivationRule#getContextRef <em>Context Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TManualActivationRule#getContextRef()
	 * @see #getTManualActivationRule()
	 * @generated
	 */
	EAttribute getTManualActivationRule_ContextRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TManualActivationRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TManualActivationRule#getName()
	 * @see #getTManualActivationRule()
	 * @generated
	 */
	EAttribute getTManualActivationRule_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TMilestone <em>TMilestone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMilestone</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TMilestone
	 * @generated
	 */
	EClass getTMilestone();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TOnPart <em>TOn Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOn Part</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TOnPart
	 * @generated
	 */
	EClass getTOnPart();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TOnPart#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TOnPart#getName()
	 * @see #getTOnPart()
	 * @generated
	 */
	EAttribute getTOnPart_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TParameter <em>TParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TParameter</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TParameter
	 * @generated
	 */
	EClass getTParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TParameter#getName()
	 * @see #getTParameter()
	 * @generated
	 */
	EAttribute getTParameter_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TParameterMapping <em>TParameter Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TParameter Mapping</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TParameterMapping
	 * @generated
	 */
	EClass getTParameterMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TParameterMapping#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TParameterMapping#getTransformation()
	 * @see #getTParameterMapping()
	 * @generated
	 */
	EReference getTParameterMapping_Transformation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TParameterMapping#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TParameterMapping#getSourceRef()
	 * @see #getTParameterMapping()
	 * @generated
	 */
	EAttribute getTParameterMapping_SourceRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TParameterMapping#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TParameterMapping#getTargetRef()
	 * @see #getTParameterMapping()
	 * @generated
	 */
	EAttribute getTParameterMapping_TargetRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TPlanFragment <em>TPlan Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPlan Fragment</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanFragment
	 * @generated
	 */
	EClass getTPlanFragment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TPlanFragment#getPlanItem <em>Plan Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plan Item</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanFragment#getPlanItem()
	 * @see #getTPlanFragment()
	 * @generated
	 */
	EReference getTPlanFragment_PlanItem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TPlanFragment#getSentry <em>Sentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentry</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanFragment#getSentry()
	 * @see #getTPlanFragment()
	 * @generated
	 */
	EReference getTPlanFragment_Sentry();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TPlanItem <em>TPlan Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPlan Item</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItem
	 * @generated
	 */
	EClass getTPlanItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TPlanItem#getItemControl <em>Item Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Control</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItem#getItemControl()
	 * @see #getTPlanItem()
	 * @generated
	 */
	EReference getTPlanItem_ItemControl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TPlanItem#getEntryCriterion <em>Entry Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Criterion</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItem#getEntryCriterion()
	 * @see #getTPlanItem()
	 * @generated
	 */
	EReference getTPlanItem_EntryCriterion();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TPlanItem#getExitCriterion <em>Exit Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exit Criterion</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItem#getExitCriterion()
	 * @see #getTPlanItem()
	 * @generated
	 */
	EReference getTPlanItem_ExitCriterion();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TPlanItem#getDefinitionRef <em>Definition Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItem#getDefinitionRef()
	 * @see #getTPlanItem()
	 * @generated
	 */
	EAttribute getTPlanItem_DefinitionRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TPlanItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItem#getName()
	 * @see #getTPlanItem()
	 * @generated
	 */
	EAttribute getTPlanItem_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TPlanItemControl <em>TPlan Item Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPlan Item Control</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItemControl
	 * @generated
	 */
	EClass getTPlanItemControl();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TPlanItemControl#getRepetitionRule <em>Repetition Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repetition Rule</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItemControl#getRepetitionRule()
	 * @see #getTPlanItemControl()
	 * @generated
	 */
	EReference getTPlanItemControl_RepetitionRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TPlanItemControl#getRequiredRule <em>Required Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Rule</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItemControl#getRequiredRule()
	 * @see #getTPlanItemControl()
	 * @generated
	 */
	EReference getTPlanItemControl_RequiredRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TPlanItemControl#getManualActivationRule <em>Manual Activation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manual Activation Rule</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItemControl#getManualActivationRule()
	 * @see #getTPlanItemControl()
	 * @generated
	 */
	EReference getTPlanItemControl_ManualActivationRule();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TPlanItemDefinition <em>TPlan Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPlan Item Definition</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItemDefinition
	 * @generated
	 */
	EClass getTPlanItemDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TPlanItemDefinition#getDefaultControl <em>Default Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Control</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItemDefinition#getDefaultControl()
	 * @see #getTPlanItemDefinition()
	 * @generated
	 */
	EReference getTPlanItemDefinition_DefaultControl();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TPlanItemDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItemDefinition#getName()
	 * @see #getTPlanItemDefinition()
	 * @generated
	 */
	EAttribute getTPlanItemDefinition_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TPlanItemOnPart <em>TPlan Item On Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPlan Item On Part</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItemOnPart
	 * @generated
	 */
	EClass getTPlanItemOnPart();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TPlanItemOnPart#getStandardEvent <em>Standard Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Event</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItemOnPart#getStandardEvent()
	 * @see #getTPlanItemOnPart()
	 * @generated
	 */
	EAttribute getTPlanItemOnPart_StandardEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TPlanItemOnPart#getExitCriterionRef <em>Exit Criterion Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit Criterion Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItemOnPart#getExitCriterionRef()
	 * @see #getTPlanItemOnPart()
	 * @generated
	 */
	EAttribute getTPlanItemOnPart_ExitCriterionRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TPlanItemOnPart#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItemOnPart#getSourceRef()
	 * @see #getTPlanItemOnPart()
	 * @generated
	 */
	EAttribute getTPlanItemOnPart_SourceRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TPlanItemStartTrigger <em>TPlan Item Start Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPlan Item Start Trigger</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItemStartTrigger
	 * @generated
	 */
	EClass getTPlanItemStartTrigger();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TPlanItemStartTrigger#getStandardEvent <em>Standard Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard Event</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItemStartTrigger#getStandardEvent()
	 * @see #getTPlanItemStartTrigger()
	 * @generated
	 */
	EAttribute getTPlanItemStartTrigger_StandardEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TPlanItemStartTrigger#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanItemStartTrigger#getSourceRef()
	 * @see #getTPlanItemStartTrigger()
	 * @generated
	 */
	EAttribute getTPlanItemStartTrigger_SourceRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TPlanningTable <em>TPlanning Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPlanning Table</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanningTable
	 * @generated
	 */
	EClass getTPlanningTable();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.cmmn.casemodel.TPlanningTable#getTableItemGroup <em>Table Item Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Table Item Group</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanningTable#getTableItemGroup()
	 * @see #getTPlanningTable()
	 * @generated
	 */
	EAttribute getTPlanningTable_TableItemGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TPlanningTable#getTableItem <em>Table Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Item</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanningTable#getTableItem()
	 * @see #getTPlanningTable()
	 * @generated
	 */
	EReference getTPlanningTable_TableItem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TPlanningTable#getApplicabilityRule <em>Applicability Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applicability Rule</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TPlanningTable#getApplicabilityRule()
	 * @see #getTPlanningTable()
	 * @generated
	 */
	EReference getTPlanningTable_ApplicabilityRule();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TProcess <em>TProcess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TProcess</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TProcess
	 * @generated
	 */
	EClass getTProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TProcess#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TProcess#getInput()
	 * @see #getTProcess()
	 * @generated
	 */
	EReference getTProcess_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TProcess#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TProcess#getOutput()
	 * @see #getTProcess()
	 * @generated
	 */
	EReference getTProcess_Output();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TProcess#getExternalRef <em>External Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TProcess#getExternalRef()
	 * @see #getTProcess()
	 * @generated
	 */
	EAttribute getTProcess_ExternalRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TProcess#getImplementationType <em>Implementation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Type</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TProcess#getImplementationType()
	 * @see #getTProcess()
	 * @generated
	 */
	EAttribute getTProcess_ImplementationType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TProcess#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TProcess#getName()
	 * @see #getTProcess()
	 * @generated
	 */
	EAttribute getTProcess_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TProcessParameter <em>TProcess Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TProcess Parameter</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TProcessParameter
	 * @generated
	 */
	EClass getTProcessParameter();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TProcessTask <em>TProcess Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TProcess Task</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TProcessTask
	 * @generated
	 */
	EClass getTProcessTask();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TProcessTask#getParameterMapping <em>Parameter Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Mapping</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TProcessTask#getParameterMapping()
	 * @see #getTProcessTask()
	 * @generated
	 */
	EReference getTProcessTask_ParameterMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TProcessTask#getProcessRefExpression <em>Process Ref Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process Ref Expression</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TProcessTask#getProcessRefExpression()
	 * @see #getTProcessTask()
	 * @generated
	 */
	EReference getTProcessTask_ProcessRefExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TProcessTask#getProcessRef <em>Process Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TProcessTask#getProcessRef()
	 * @see #getTProcessTask()
	 * @generated
	 */
	EAttribute getTProcessTask_ProcessRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TProperty <em>TProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TProperty</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TProperty
	 * @generated
	 */
	EClass getTProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TProperty#getName()
	 * @see #getTProperty()
	 * @generated
	 */
	EAttribute getTProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TProperty#getType()
	 * @see #getTProperty()
	 * @generated
	 */
	EAttribute getTProperty_Type();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TRelationship <em>TRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRelationship</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TRelationship
	 * @generated
	 */
	EClass getTRelationship();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.cmmn.casemodel.TRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Source</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TRelationship#getSource()
	 * @see #getTRelationship()
	 * @generated
	 */
	EAttribute getTRelationship_Source();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.cmmn.casemodel.TRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Target</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TRelationship#getTarget()
	 * @see #getTRelationship()
	 * @generated
	 */
	EAttribute getTRelationship_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TRelationship#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TRelationship#getDirection()
	 * @see #getTRelationship()
	 * @generated
	 */
	EAttribute getTRelationship_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TRelationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TRelationship#getType()
	 * @see #getTRelationship()
	 * @generated
	 */
	EAttribute getTRelationship_Type();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TRepetitionRule <em>TRepetition Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRepetition Rule</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TRepetitionRule
	 * @generated
	 */
	EClass getTRepetitionRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TRepetitionRule#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TRepetitionRule#getCondition()
	 * @see #getTRepetitionRule()
	 * @generated
	 */
	EReference getTRepetitionRule_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TRepetitionRule#getContextRef <em>Context Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TRepetitionRule#getContextRef()
	 * @see #getTRepetitionRule()
	 * @generated
	 */
	EAttribute getTRepetitionRule_ContextRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TRepetitionRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TRepetitionRule#getName()
	 * @see #getTRepetitionRule()
	 * @generated
	 */
	EAttribute getTRepetitionRule_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TRequiredRule <em>TRequired Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRequired Rule</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TRequiredRule
	 * @generated
	 */
	EClass getTRequiredRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TRequiredRule#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TRequiredRule#getCondition()
	 * @see #getTRequiredRule()
	 * @generated
	 */
	EReference getTRequiredRule_Condition();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TRequiredRule#getContextRef <em>Context Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Ref</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TRequiredRule#getContextRef()
	 * @see #getTRequiredRule()
	 * @generated
	 */
	EAttribute getTRequiredRule_ContextRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TRequiredRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TRequiredRule#getName()
	 * @see #getTRequiredRule()
	 * @generated
	 */
	EAttribute getTRequiredRule_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TRole <em>TRole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRole</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TRole
	 * @generated
	 */
	EClass getTRole();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TRole#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TRole#getName()
	 * @see #getTRole()
	 * @generated
	 */
	EAttribute getTRole_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TSentry <em>TSentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSentry</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TSentry
	 * @generated
	 */
	EClass getTSentry();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.cmmn.casemodel.TSentry#getOnPartGroup <em>On Part Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>On Part Group</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TSentry#getOnPartGroup()
	 * @see #getTSentry()
	 * @generated
	 */
	EAttribute getTSentry_OnPartGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TSentry#getOnPart <em>On Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Part</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TSentry#getOnPart()
	 * @see #getTSentry()
	 * @generated
	 */
	EReference getTSentry_OnPart();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TSentry#getIfPart <em>If Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If Part</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TSentry#getIfPart()
	 * @see #getTSentry()
	 * @generated
	 */
	EReference getTSentry_IfPart();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TSentry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TSentry#getName()
	 * @see #getTSentry()
	 * @generated
	 */
	EAttribute getTSentry_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TStage <em>TStage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TStage</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TStage
	 * @generated
	 */
	EClass getTStage();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TStage#getPlanningTable <em>Planning Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Planning Table</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TStage#getPlanningTable()
	 * @see #getTStage()
	 * @generated
	 */
	EReference getTStage_PlanningTable();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.cmmn.casemodel.TStage#getPlanItemDefinitionGroup <em>Plan Item Definition Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Plan Item Definition Group</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TStage#getPlanItemDefinitionGroup()
	 * @see #getTStage()
	 * @generated
	 */
	EAttribute getTStage_PlanItemDefinitionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TStage#getPlanItemDefinition <em>Plan Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plan Item Definition</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TStage#getPlanItemDefinition()
	 * @see #getTStage()
	 * @generated
	 */
	EReference getTStage_PlanItemDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TStage#getExitCriterion <em>Exit Criterion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exit Criterion</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TStage#getExitCriterion()
	 * @see #getTStage()
	 * @generated
	 */
	EReference getTStage_ExitCriterion();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TStage#isAutoComplete <em>Auto Complete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Complete</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TStage#isAutoComplete()
	 * @see #getTStage()
	 * @generated
	 */
	EAttribute getTStage_AutoComplete();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TStartTrigger <em>TStart Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TStart Trigger</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TStartTrigger
	 * @generated
	 */
	EClass getTStartTrigger();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TTableItem <em>TTable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTable Item</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TTableItem
	 * @generated
	 */
	EClass getTTableItem();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TTableItem#getApplicabilityRuleRefs <em>Applicability Rule Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicability Rule Refs</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TTableItem#getApplicabilityRuleRefs()
	 * @see #getTTableItem()
	 * @generated
	 */
	EAttribute getTTableItem_ApplicabilityRuleRefs();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TTableItem#getAuthorizedRoleRefs <em>Authorized Role Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorized Role Refs</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TTableItem#getAuthorizedRoleRefs()
	 * @see #getTTableItem()
	 * @generated
	 */
	EAttribute getTTableItem_AuthorizedRoleRefs();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TTask <em>TTask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTask</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TTask
	 * @generated
	 */
	EClass getTTask();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TTask#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TTask#getInput()
	 * @see #getTTask()
	 * @generated
	 */
	EReference getTTask_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.cmmn.casemodel.TTask#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TTask#getOutput()
	 * @see #getTTask()
	 * @generated
	 */
	EReference getTTask_Output();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TTask#isIsBlocking <em>Is Blocking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Blocking</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TTask#isIsBlocking()
	 * @see #getTTask()
	 * @generated
	 */
	EAttribute getTTask_IsBlocking();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TTextAnnotation <em>TText Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TText Annotation</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TTextAnnotation
	 * @generated
	 */
	EClass getTTextAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TTextAnnotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TTextAnnotation#getText()
	 * @see #getTTextAnnotation()
	 * @generated
	 */
	EAttribute getTTextAnnotation_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TTextAnnotation#getTextFormat <em>Text Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Format</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TTextAnnotation#getTextFormat()
	 * @see #getTTextAnnotation()
	 * @generated
	 */
	EAttribute getTTextAnnotation_TextFormat();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TTimerEventListener <em>TTimer Event Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTimer Event Listener</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TTimerEventListener
	 * @generated
	 */
	EClass getTTimerEventListener();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TTimerEventListener#getTimerExpression <em>Timer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timer Expression</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TTimerEventListener#getTimerExpression()
	 * @see #getTTimerEventListener()
	 * @generated
	 */
	EReference getTTimerEventListener_TimerExpression();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.cmmn.casemodel.TTimerEventListener#getTimerStartGroup <em>Timer Start Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Timer Start Group</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TTimerEventListener#getTimerStartGroup()
	 * @see #getTTimerEventListener()
	 * @generated
	 */
	EAttribute getTTimerEventListener_TimerStartGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.cmmn.casemodel.TTimerEventListener#getTimerStart <em>Timer Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timer Start</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TTimerEventListener#getTimerStart()
	 * @see #getTTimerEventListener()
	 * @generated
	 */
	EReference getTTimerEventListener_TimerStart();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.cmmn.casemodel.TUserEventListener <em>TUser Event Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TUser Event Listener</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TUserEventListener
	 * @generated
	 */
	EClass getTUserEventListener();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.cmmn.casemodel.TUserEventListener#getAuthorizedRoleRefs <em>Authorized Role Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorized Role Refs</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TUserEventListener#getAuthorizedRoleRefs()
	 * @see #getTUserEventListener()
	 * @generated
	 */
	EAttribute getTUserEventListener_AuthorizedRoleRefs();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.cmmn.casemodel.CaseFileItemTransition <em>Case File Item Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Case File Item Transition</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseFileItemTransition
	 * @generated
	 */
	EEnum getCaseFileItemTransition();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.cmmn.casemodel.DecisionTypeEnumMember1 <em>Decision Type Enum Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decision Type Enum Member1</em>'.
	 * @see org.omg.spec.cmmn.casemodel.DecisionTypeEnumMember1
	 * @generated
	 */
	EEnum getDecisionTypeEnumMember1();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.cmmn.casemodel.DefinitionTypeEnumMember1 <em>Definition Type Enum Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Definition Type Enum Member1</em>'.
	 * @see org.omg.spec.cmmn.casemodel.DefinitionTypeEnumMember1
	 * @generated
	 */
	EEnum getDefinitionTypeEnumMember1();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.cmmn.casemodel.MultiplicityEnum <em>Multiplicity Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity Enum</em>'.
	 * @see org.omg.spec.cmmn.casemodel.MultiplicityEnum
	 * @generated
	 */
	EEnum getMultiplicityEnum();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.cmmn.casemodel.PlanItemTransition <em>Plan Item Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Plan Item Transition</em>'.
	 * @see org.omg.spec.cmmn.casemodel.PlanItemTransition
	 * @generated
	 */
	EEnum getPlanItemTransition();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.cmmn.casemodel.ProcessTypeEnumMember1 <em>Process Type Enum Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Process Type Enum Member1</em>'.
	 * @see org.omg.spec.cmmn.casemodel.ProcessTypeEnumMember1
	 * @generated
	 */
	EEnum getProcessTypeEnumMember1();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.cmmn.casemodel.PropertyTypeEnumMember1 <em>Property Type Enum Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Type Enum Member1</em>'.
	 * @see org.omg.spec.cmmn.casemodel.PropertyTypeEnumMember1
	 * @generated
	 */
	EEnum getPropertyTypeEnumMember1();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.cmmn.casemodel.TAssociationDirection <em>TAssociation Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TAssociation Direction</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TAssociationDirection
	 * @generated
	 */
	EEnum getTAssociationDirection();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.cmmn.casemodel.TRelationshipDirection <em>TRelationship Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TRelationship Direction</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TRelationshipDirection
	 * @generated
	 */
	EEnum getTRelationshipDirection();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.cmmn.casemodel.CaseFileItemTransition <em>Case File Item Transition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Case File Item Transition Object</em>'.
	 * @see org.omg.spec.cmmn.casemodel.CaseFileItemTransition
	 * @model instanceClass="org.omg.spec.cmmn.casemodel.CaseFileItemTransition"
	 *        extendedMetaData="name='CaseFileItemTransition:Object' baseType='CaseFileItemTransition'"
	 * @generated
	 */
	EDataType getCaseFileItemTransitionObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Decision Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *         Enumeration of Decision standards known to CMMN 1.1
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Decision Type Enum</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='DecisionTypeEnum' memberTypes='http://www.eclipse.org/emf/2003/XMLType#anyURI DecisionTypeEnum_._member_._1'"
	 * @generated
	 */
	EDataType getDecisionTypeEnum();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.cmmn.casemodel.DecisionTypeEnumMember1 <em>Decision Type Enum Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Decision Type Enum Member1 Object</em>'.
	 * @see org.omg.spec.cmmn.casemodel.DecisionTypeEnumMember1
	 * @model instanceClass="org.omg.spec.cmmn.casemodel.DecisionTypeEnumMember1"
	 *        extendedMetaData="name='DecisionTypeEnum_._member_._1:Object' baseType='DecisionTypeEnum_._member_._1'"
	 * @generated
	 */
	EDataType getDecisionTypeEnumMember1Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Definition Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Definition Type Enum</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='DefinitionTypeEnum' memberTypes='http://www.eclipse.org/emf/2003/XMLType#anyURI DefinitionTypeEnum_._member_._1'"
	 * @generated
	 */
	EDataType getDefinitionTypeEnum();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.cmmn.casemodel.DefinitionTypeEnumMember1 <em>Definition Type Enum Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Definition Type Enum Member1 Object</em>'.
	 * @see org.omg.spec.cmmn.casemodel.DefinitionTypeEnumMember1
	 * @model instanceClass="org.omg.spec.cmmn.casemodel.DefinitionTypeEnumMember1"
	 *        extendedMetaData="name='DefinitionTypeEnum_._member_._1:Object' baseType='DefinitionTypeEnum_._member_._1'"
	 * @generated
	 */
	EDataType getDefinitionTypeEnumMember1Object();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.cmmn.casemodel.MultiplicityEnum <em>Multiplicity Enum Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Multiplicity Enum Object</em>'.
	 * @see org.omg.spec.cmmn.casemodel.MultiplicityEnum
	 * @model instanceClass="org.omg.spec.cmmn.casemodel.MultiplicityEnum"
	 *        extendedMetaData="name='MultiplicityEnum:Object' baseType='MultiplicityEnum'"
	 * @generated
	 */
	EDataType getMultiplicityEnumObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.cmmn.casemodel.PlanItemTransition <em>Plan Item Transition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Plan Item Transition Object</em>'.
	 * @see org.omg.spec.cmmn.casemodel.PlanItemTransition
	 * @model instanceClass="org.omg.spec.cmmn.casemodel.PlanItemTransition"
	 *        extendedMetaData="name='PlanItemTransition:Object' baseType='PlanItemTransition'"
	 * @generated
	 */
	EDataType getPlanItemTransitionObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Process Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *         Enumeration of Business Process standards known to CMMN 1.1
     *       
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Process Type Enum</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='ProcessTypeEnum' memberTypes='http://www.eclipse.org/emf/2003/XMLType#anyURI ProcessTypeEnum_._member_._1'"
	 * @generated
	 */
	EDataType getProcessTypeEnum();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.cmmn.casemodel.ProcessTypeEnumMember1 <em>Process Type Enum Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Process Type Enum Member1 Object</em>'.
	 * @see org.omg.spec.cmmn.casemodel.ProcessTypeEnumMember1
	 * @model instanceClass="org.omg.spec.cmmn.casemodel.ProcessTypeEnumMember1"
	 *        extendedMetaData="name='ProcessTypeEnum_._member_._1:Object' baseType='ProcessTypeEnum_._member_._1'"
	 * @generated
	 */
	EDataType getProcessTypeEnumMember1Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Property Type Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Type Enum</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='PropertyTypeEnum' memberTypes='http://www.eclipse.org/emf/2003/XMLType#anyURI PropertyTypeEnum_._member_._1'"
	 * @generated
	 */
	EDataType getPropertyTypeEnum();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.cmmn.casemodel.PropertyTypeEnumMember1 <em>Property Type Enum Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Property Type Enum Member1 Object</em>'.
	 * @see org.omg.spec.cmmn.casemodel.PropertyTypeEnumMember1
	 * @model instanceClass="org.omg.spec.cmmn.casemodel.PropertyTypeEnumMember1"
	 *        extendedMetaData="name='PropertyTypeEnum_._member_._1:Object' baseType='PropertyTypeEnum_._member_._1'"
	 * @generated
	 */
	EDataType getPropertyTypeEnumMember1Object();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.cmmn.casemodel.TAssociationDirection <em>TAssociation Direction Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TAssociation Direction Object</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TAssociationDirection
	 * @model instanceClass="org.omg.spec.cmmn.casemodel.TAssociationDirection"
	 *        extendedMetaData="name='tAssociationDirection:Object' baseType='tAssociationDirection'"
	 * @generated
	 */
	EDataType getTAssociationDirectionObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.cmmn.casemodel.TRelationshipDirection <em>TRelationship Direction Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TRelationship Direction Object</em>'.
	 * @see org.omg.spec.cmmn.casemodel.TRelationshipDirection
	 * @model instanceClass="org.omg.spec.cmmn.casemodel.TRelationshipDirection"
	 *        extendedMetaData="name='tRelationshipDirection:Object' baseType='tRelationshipDirection'"
	 * @generated
	 */
	EDataType getTRelationshipDirectionObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CaseModelFactory getCaseModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelRootImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getCaseModelRoot()
		 * @generated
		 */
		EClass CASE_MODEL_ROOT = eINSTANCE.getCaseModelRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE_MODEL_ROOT__MIXED = eINSTANCE.getCaseModelRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getCaseModelRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getCaseModelRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Applicability Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__APPLICABILITY_RULE = eINSTANCE.getCaseModelRoot_ApplicabilityRule();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__ARTIFACT = eINSTANCE.getCaseModelRoot_Artifact();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__ASSOCIATION = eINSTANCE.getCaseModelRoot_Association();

		/**
		 * The meta object literal for the '<em><b>Case</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__CASE = eINSTANCE.getCaseModelRoot_Case();

		/**
		 * The meta object literal for the '<em><b>Case File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__CASE_FILE = eINSTANCE.getCaseModelRoot_CaseFile();

		/**
		 * The meta object literal for the '<em><b>Case File Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__CASE_FILE_ITEM = eINSTANCE.getCaseModelRoot_CaseFileItem();

		/**
		 * The meta object literal for the '<em><b>Case File Item Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__CASE_FILE_ITEM_DEFINITION = eINSTANCE.getCaseModelRoot_CaseFileItemDefinition();

		/**
		 * The meta object literal for the '<em><b>Case File Item On Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__CASE_FILE_ITEM_ON_PART = eINSTANCE.getCaseModelRoot_CaseFileItemOnPart();

		/**
		 * The meta object literal for the '<em><b>On Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__ON_PART = eINSTANCE.getCaseModelRoot_OnPart();

		/**
		 * The meta object literal for the '<em><b>Case File Item Start Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__CASE_FILE_ITEM_START_TRIGGER = eINSTANCE.getCaseModelRoot_CaseFileItemStartTrigger();

		/**
		 * The meta object literal for the '<em><b>Timer Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__TIMER_START = eINSTANCE.getCaseModelRoot_TimerStart();

		/**
		 * The meta object literal for the '<em><b>Case Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__CASE_PARAMETER = eINSTANCE.getCaseModelRoot_CaseParameter();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__PARAMETER = eINSTANCE.getCaseModelRoot_Parameter();

		/**
		 * The meta object literal for the '<em><b>Case Task</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__CASE_TASK = eINSTANCE.getCaseModelRoot_CaseTask();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__TASK = eINSTANCE.getCaseModelRoot_Task();

		/**
		 * The meta object literal for the '<em><b>Plan Item Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__PLAN_ITEM_DEFINITION = eINSTANCE.getCaseModelRoot_PlanItemDefinition();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__DECISION = eINSTANCE.getCaseModelRoot_Decision();

		/**
		 * The meta object literal for the '<em><b>Decision Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__DECISION_PARAMETER = eINSTANCE.getCaseModelRoot_DecisionParameter();

		/**
		 * The meta object literal for the '<em><b>Decision Task</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__DECISION_TASK = eINSTANCE.getCaseModelRoot_DecisionTask();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__DEFINITIONS = eINSTANCE.getCaseModelRoot_Definitions();

		/**
		 * The meta object literal for the '<em><b>Discretionary Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__DISCRETIONARY_ITEM = eINSTANCE.getCaseModelRoot_DiscretionaryItem();

		/**
		 * The meta object literal for the '<em><b>Table Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__TABLE_ITEM = eINSTANCE.getCaseModelRoot_TableItem();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__DOCUMENTATION = eINSTANCE.getCaseModelRoot_Documentation();

		/**
		 * The meta object literal for the '<em><b>Entry Criterion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__ENTRY_CRITERION = eINSTANCE.getCaseModelRoot_EntryCriterion();

		/**
		 * The meta object literal for the '<em><b>Event Listener</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__EVENT_LISTENER = eINSTANCE.getCaseModelRoot_EventListener();

		/**
		 * The meta object literal for the '<em><b>Exit Criterion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__EXIT_CRITERION = eINSTANCE.getCaseModelRoot_ExitCriterion();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__EXPRESSION = eINSTANCE.getCaseModelRoot_Expression();

		/**
		 * The meta object literal for the '<em><b>Extension Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__EXTENSION_ELEMENTS = eINSTANCE.getCaseModelRoot_ExtensionElements();

		/**
		 * The meta object literal for the '<em><b>Human Task</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__HUMAN_TASK = eINSTANCE.getCaseModelRoot_HumanTask();

		/**
		 * The meta object literal for the '<em><b>If Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__IF_PART = eINSTANCE.getCaseModelRoot_IfPart();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__IMPORT = eINSTANCE.getCaseModelRoot_Import();

		/**
		 * The meta object literal for the '<em><b>Manual Activation Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__MANUAL_ACTIVATION_RULE = eINSTANCE.getCaseModelRoot_ManualActivationRule();

		/**
		 * The meta object literal for the '<em><b>Milestone</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__MILESTONE = eINSTANCE.getCaseModelRoot_Milestone();

		/**
		 * The meta object literal for the '<em><b>Parameter Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__PARAMETER_MAPPING = eINSTANCE.getCaseModelRoot_ParameterMapping();

		/**
		 * The meta object literal for the '<em><b>Plan Fragment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__PLAN_FRAGMENT = eINSTANCE.getCaseModelRoot_PlanFragment();

		/**
		 * The meta object literal for the '<em><b>Plan Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__PLAN_ITEM = eINSTANCE.getCaseModelRoot_PlanItem();

		/**
		 * The meta object literal for the '<em><b>Plan Item Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__PLAN_ITEM_CONTROL = eINSTANCE.getCaseModelRoot_PlanItemControl();

		/**
		 * The meta object literal for the '<em><b>Plan Item On Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__PLAN_ITEM_ON_PART = eINSTANCE.getCaseModelRoot_PlanItemOnPart();

		/**
		 * The meta object literal for the '<em><b>Plan Item Start Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__PLAN_ITEM_START_TRIGGER = eINSTANCE.getCaseModelRoot_PlanItemStartTrigger();

		/**
		 * The meta object literal for the '<em><b>Planning Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__PLANNING_TABLE = eINSTANCE.getCaseModelRoot_PlanningTable();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__PROCESS = eINSTANCE.getCaseModelRoot_Process();

		/**
		 * The meta object literal for the '<em><b>Process Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__PROCESS_PARAMETER = eINSTANCE.getCaseModelRoot_ProcessParameter();

		/**
		 * The meta object literal for the '<em><b>Process Task</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__PROCESS_TASK = eINSTANCE.getCaseModelRoot_ProcessTask();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__PROPERTY = eINSTANCE.getCaseModelRoot_Property();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__RELATIONSHIP = eINSTANCE.getCaseModelRoot_Relationship();

		/**
		 * The meta object literal for the '<em><b>Repetition Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__REPETITION_RULE = eINSTANCE.getCaseModelRoot_RepetitionRule();

		/**
		 * The meta object literal for the '<em><b>Required Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__REQUIRED_RULE = eINSTANCE.getCaseModelRoot_RequiredRule();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__ROLE = eINSTANCE.getCaseModelRoot_Role();

		/**
		 * The meta object literal for the '<em><b>Sentry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__SENTRY = eINSTANCE.getCaseModelRoot_Sentry();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__STAGE = eINSTANCE.getCaseModelRoot_Stage();

		/**
		 * The meta object literal for the '<em><b>Text Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__TEXT_ANNOTATION = eINSTANCE.getCaseModelRoot_TextAnnotation();

		/**
		 * The meta object literal for the '<em><b>Timer Event Listener</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__TIMER_EVENT_LISTENER = eINSTANCE.getCaseModelRoot_TimerEventListener();

		/**
		 * The meta object literal for the '<em><b>User Event Listener</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_MODEL_ROOT__USER_EVENT_LISTENER = eINSTANCE.getCaseModelRoot_UserEventListener();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TApplicabilityRuleImpl <em>TApplicability Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TApplicabilityRuleImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTApplicabilityRule()
		 * @generated
		 */
		EClass TAPPLICABILITY_RULE = eINSTANCE.getTApplicabilityRule();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAPPLICABILITY_RULE__CONDITION = eINSTANCE.getTApplicabilityRule_Condition();

		/**
		 * The meta object literal for the '<em><b>Context Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAPPLICABILITY_RULE__CONTEXT_REF = eINSTANCE.getTApplicabilityRule_ContextRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAPPLICABILITY_RULE__NAME = eINSTANCE.getTApplicabilityRule_Name();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TArtifactImpl <em>TArtifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TArtifactImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTArtifact()
		 * @generated
		 */
		EClass TARTIFACT = eINSTANCE.getTArtifact();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TAssociationImpl <em>TAssociation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TAssociationImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTAssociation()
		 * @generated
		 */
		EClass TASSOCIATION = eINSTANCE.getTAssociation();

		/**
		 * The meta object literal for the '<em><b>Association Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASSOCIATION__ASSOCIATION_DIRECTION = eINSTANCE.getTAssociation_AssociationDirection();

		/**
		 * The meta object literal for the '<em><b>Source Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASSOCIATION__SOURCE_REF = eINSTANCE.getTAssociation_SourceRef();

		/**
		 * The meta object literal for the '<em><b>Target Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASSOCIATION__TARGET_REF = eINSTANCE.getTAssociation_TargetRef();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TCaseImpl <em>TCase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TCaseImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCase()
		 * @generated
		 */
		EClass TCASE = eINSTANCE.getTCase();

		/**
		 * The meta object literal for the '<em><b>Case File Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCASE__CASE_FILE_MODEL = eINSTANCE.getTCase_CaseFileModel();

		/**
		 * The meta object literal for the '<em><b>Case Plan Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCASE__CASE_PLAN_MODEL = eINSTANCE.getTCase_CasePlanModel();

		/**
		 * The meta object literal for the '<em><b>Case Roles</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCASE__CASE_ROLES = eINSTANCE.getTCase_CaseRoles();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCASE__INPUT = eINSTANCE.getTCase_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCASE__OUTPUT = eINSTANCE.getTCase_Output();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCASE__NAME = eINSTANCE.getTCase_Name();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TCaseFileImpl <em>TCase File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TCaseFileImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCaseFile()
		 * @generated
		 */
		EClass TCASE_FILE = eINSTANCE.getTCaseFile();

		/**
		 * The meta object literal for the '<em><b>Case File Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCASE_FILE__CASE_FILE_ITEM = eINSTANCE.getTCaseFile_CaseFileItem();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TCaseFileItemImpl <em>TCase File Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TCaseFileItemImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCaseFileItem()
		 * @generated
		 */
		EClass TCASE_FILE_ITEM = eINSTANCE.getTCaseFileItem();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCASE_FILE_ITEM__CHILDREN = eINSTANCE.getTCaseFileItem_Children();

		/**
		 * The meta object literal for the '<em><b>Definition Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCASE_FILE_ITEM__DEFINITION_REF = eINSTANCE.getTCaseFileItem_DefinitionRef();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCASE_FILE_ITEM__MULTIPLICITY = eINSTANCE.getTCaseFileItem_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCASE_FILE_ITEM__NAME = eINSTANCE.getTCaseFileItem_Name();

		/**
		 * The meta object literal for the '<em><b>Source Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCASE_FILE_ITEM__SOURCE_REF = eINSTANCE.getTCaseFileItem_SourceRef();

		/**
		 * The meta object literal for the '<em><b>Target Refs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCASE_FILE_ITEM__TARGET_REFS = eINSTANCE.getTCaseFileItem_TargetRefs();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TCaseFileItemDefinitionImpl <em>TCase File Item Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TCaseFileItemDefinitionImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCaseFileItemDefinition()
		 * @generated
		 */
		EClass TCASE_FILE_ITEM_DEFINITION = eINSTANCE.getTCaseFileItemDefinition();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCASE_FILE_ITEM_DEFINITION__PROPERTY = eINSTANCE.getTCaseFileItemDefinition_Property();

		/**
		 * The meta object literal for the '<em><b>Definition Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCASE_FILE_ITEM_DEFINITION__DEFINITION_TYPE = eINSTANCE.getTCaseFileItemDefinition_DefinitionType();

		/**
		 * The meta object literal for the '<em><b>Import Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCASE_FILE_ITEM_DEFINITION__IMPORT_REF = eINSTANCE.getTCaseFileItemDefinition_ImportRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCASE_FILE_ITEM_DEFINITION__NAME = eINSTANCE.getTCaseFileItemDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Structure Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCASE_FILE_ITEM_DEFINITION__STRUCTURE_REF = eINSTANCE.getTCaseFileItemDefinition_StructureRef();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TCaseFileItemOnPartImpl <em>TCase File Item On Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TCaseFileItemOnPartImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCaseFileItemOnPart()
		 * @generated
		 */
		EClass TCASE_FILE_ITEM_ON_PART = eINSTANCE.getTCaseFileItemOnPart();

		/**
		 * The meta object literal for the '<em><b>Standard Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCASE_FILE_ITEM_ON_PART__STANDARD_EVENT = eINSTANCE.getTCaseFileItemOnPart_StandardEvent();

		/**
		 * The meta object literal for the '<em><b>Source Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCASE_FILE_ITEM_ON_PART__SOURCE_REF = eINSTANCE.getTCaseFileItemOnPart_SourceRef();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TCaseFileItemStartTriggerImpl <em>TCase File Item Start Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TCaseFileItemStartTriggerImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCaseFileItemStartTrigger()
		 * @generated
		 */
		EClass TCASE_FILE_ITEM_START_TRIGGER = eINSTANCE.getTCaseFileItemStartTrigger();

		/**
		 * The meta object literal for the '<em><b>Standard Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCASE_FILE_ITEM_START_TRIGGER__STANDARD_EVENT = eINSTANCE.getTCaseFileItemStartTrigger_StandardEvent();

		/**
		 * The meta object literal for the '<em><b>Source Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCASE_FILE_ITEM_START_TRIGGER__SOURCE_REF = eINSTANCE.getTCaseFileItemStartTrigger_SourceRef();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TCaseParameterImpl <em>TCase Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TCaseParameterImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCaseParameter()
		 * @generated
		 */
		EClass TCASE_PARAMETER = eINSTANCE.getTCaseParameter();

		/**
		 * The meta object literal for the '<em><b>Binding Refinement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCASE_PARAMETER__BINDING_REFINEMENT = eINSTANCE.getTCaseParameter_BindingRefinement();

		/**
		 * The meta object literal for the '<em><b>Binding Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCASE_PARAMETER__BINDING_REF = eINSTANCE.getTCaseParameter_BindingRef();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TCaseRolesImpl <em>TCase Roles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TCaseRolesImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCaseRoles()
		 * @generated
		 */
		EClass TCASE_ROLES = eINSTANCE.getTCaseRoles();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCASE_ROLES__ROLE = eINSTANCE.getTCaseRoles_Role();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TCaseTaskImpl <em>TCase Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TCaseTaskImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCaseTask()
		 * @generated
		 */
		EClass TCASE_TASK = eINSTANCE.getTCaseTask();

		/**
		 * The meta object literal for the '<em><b>Parameter Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCASE_TASK__PARAMETER_MAPPING = eINSTANCE.getTCaseTask_ParameterMapping();

		/**
		 * The meta object literal for the '<em><b>Case Ref Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCASE_TASK__CASE_REF_EXPRESSION = eINSTANCE.getTCaseTask_CaseRefExpression();

		/**
		 * The meta object literal for the '<em><b>Case Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCASE_TASK__CASE_REF = eINSTANCE.getTCaseTask_CaseRef();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TChildrenImpl <em>TChildren</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TChildrenImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTChildren()
		 * @generated
		 */
		EClass TCHILDREN = eINSTANCE.getTChildren();

		/**
		 * The meta object literal for the '<em><b>Case File Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCHILDREN__CASE_FILE_ITEM = eINSTANCE.getTChildren_CaseFileItem();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TCmmnElementImpl <em>TCmmn Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TCmmnElementImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCmmnElement()
		 * @generated
		 */
		EClass TCMMN_ELEMENT = eINSTANCE.getTCmmnElement();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCMMN_ELEMENT__DOCUMENTATION = eINSTANCE.getTCmmnElement_Documentation();

		/**
		 * The meta object literal for the '<em><b>Extension Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCMMN_ELEMENT__EXTENSION_ELEMENTS = eINSTANCE.getTCmmnElement_ExtensionElements();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCMMN_ELEMENT__ID = eINSTANCE.getTCmmnElement_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCMMN_ELEMENT__ANY_ATTRIBUTE = eINSTANCE.getTCmmnElement_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TCmmnElementWithMixedContentImpl <em>TCmmn Element With Mixed Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TCmmnElementWithMixedContentImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCmmnElementWithMixedContent()
		 * @generated
		 */
		EClass TCMMN_ELEMENT_WITH_MIXED_CONTENT = eINSTANCE.getTCmmnElementWithMixedContent();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCMMN_ELEMENT_WITH_MIXED_CONTENT__MIXED = eINSTANCE.getTCmmnElementWithMixedContent_Mixed();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCMMN_ELEMENT_WITH_MIXED_CONTENT__DOCUMENTATION = eINSTANCE.getTCmmnElementWithMixedContent_Documentation();

		/**
		 * The meta object literal for the '<em><b>Extension Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCMMN_ELEMENT_WITH_MIXED_CONTENT__EXTENSION_ELEMENTS = eINSTANCE.getTCmmnElementWithMixedContent_ExtensionElements();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCMMN_ELEMENT_WITH_MIXED_CONTENT__ID = eINSTANCE.getTCmmnElementWithMixedContent_Id();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCMMN_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE = eINSTANCE.getTCmmnElementWithMixedContent_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TCriterionImpl <em>TCriterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TCriterionImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTCriterion()
		 * @generated
		 */
		EClass TCRITERION = eINSTANCE.getTCriterion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCRITERION__NAME = eINSTANCE.getTCriterion_Name();

		/**
		 * The meta object literal for the '<em><b>Sentry Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCRITERION__SENTRY_REF = eINSTANCE.getTCriterion_SentryRef();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TDecisionImpl <em>TDecision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TDecisionImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTDecision()
		 * @generated
		 */
		EClass TDECISION = eINSTANCE.getTDecision();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION__INPUT = eINSTANCE.getTDecision_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION__OUTPUT = eINSTANCE.getTDecision_Output();

		/**
		 * The meta object literal for the '<em><b>External Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDECISION__EXTERNAL_REF = eINSTANCE.getTDecision_ExternalRef();

		/**
		 * The meta object literal for the '<em><b>Implementation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDECISION__IMPLEMENTATION_TYPE = eINSTANCE.getTDecision_ImplementationType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDECISION__NAME = eINSTANCE.getTDecision_Name();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TDecisionParameterImpl <em>TDecision Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TDecisionParameterImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTDecisionParameter()
		 * @generated
		 */
		EClass TDECISION_PARAMETER = eINSTANCE.getTDecisionParameter();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TDecisionTaskImpl <em>TDecision Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TDecisionTaskImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTDecisionTask()
		 * @generated
		 */
		EClass TDECISION_TASK = eINSTANCE.getTDecisionTask();

		/**
		 * The meta object literal for the '<em><b>Parameter Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION_TASK__PARAMETER_MAPPING = eINSTANCE.getTDecisionTask_ParameterMapping();

		/**
		 * The meta object literal for the '<em><b>Decision Ref Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION_TASK__DECISION_REF_EXPRESSION = eINSTANCE.getTDecisionTask_DecisionRefExpression();

		/**
		 * The meta object literal for the '<em><b>Decision Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDECISION_TASK__DECISION_REF = eINSTANCE.getTDecisionTask_DecisionRef();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TDefinitionsImpl <em>TDefinitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TDefinitionsImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTDefinitions()
		 * @generated
		 */
		EClass TDEFINITIONS = eINSTANCE.getTDefinitions();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__IMPORT = eINSTANCE.getTDefinitions_Import();

		/**
		 * The meta object literal for the '<em><b>Case File Item Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__CASE_FILE_ITEM_DEFINITION = eINSTANCE.getTDefinitions_CaseFileItemDefinition();

		/**
		 * The meta object literal for the '<em><b>Case</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__CASE = eINSTANCE.getTDefinitions_Case();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__PROCESS = eINSTANCE.getTDefinitions_Process();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__DECISION = eINSTANCE.getTDefinitions_Decision();

		/**
		 * The meta object literal for the '<em><b>Extension Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__EXTENSION_ELEMENTS = eINSTANCE.getTDefinitions_ExtensionElements();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__RELATIONSHIP = eINSTANCE.getTDefinitions_Relationship();

		/**
		 * The meta object literal for the '<em><b>Artifact Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__ARTIFACT_GROUP = eINSTANCE.getTDefinitions_ArtifactGroup();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__ARTIFACT = eINSTANCE.getTDefinitions_Artifact();

		/**
		 * The meta object literal for the '<em><b>CMMNDI</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__CMMNDI = eINSTANCE.getTDefinitions_CMMNDI();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__AUTHOR = eINSTANCE.getTDefinitions_Author();

		/**
		 * The meta object literal for the '<em><b>Creation Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__CREATION_DATE = eINSTANCE.getTDefinitions_CreationDate();

		/**
		 * The meta object literal for the '<em><b>Exporter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__EXPORTER = eINSTANCE.getTDefinitions_Exporter();

		/**
		 * The meta object literal for the '<em><b>Exporter Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__EXPORTER_VERSION = eINSTANCE.getTDefinitions_ExporterVersion();

		/**
		 * The meta object literal for the '<em><b>Expression Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__EXPRESSION_LANGUAGE = eINSTANCE.getTDefinitions_ExpressionLanguage();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__ID = eINSTANCE.getTDefinitions_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__NAME = eINSTANCE.getTDefinitions_Name();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__TARGET_NAMESPACE = eINSTANCE.getTDefinitions_TargetNamespace();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__ANY_ATTRIBUTE = eINSTANCE.getTDefinitions_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TDiscretionaryItemImpl <em>TDiscretionary Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TDiscretionaryItemImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTDiscretionaryItem()
		 * @generated
		 */
		EClass TDISCRETIONARY_ITEM = eINSTANCE.getTDiscretionaryItem();

		/**
		 * The meta object literal for the '<em><b>Item Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDISCRETIONARY_ITEM__ITEM_CONTROL = eINSTANCE.getTDiscretionaryItem_ItemControl();

		/**
		 * The meta object literal for the '<em><b>Entry Criterion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDISCRETIONARY_ITEM__ENTRY_CRITERION = eINSTANCE.getTDiscretionaryItem_EntryCriterion();

		/**
		 * The meta object literal for the '<em><b>Exit Criterion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDISCRETIONARY_ITEM__EXIT_CRITERION = eINSTANCE.getTDiscretionaryItem_ExitCriterion();

		/**
		 * The meta object literal for the '<em><b>Definition Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDISCRETIONARY_ITEM__DEFINITION_REF = eINSTANCE.getTDiscretionaryItem_DefinitionRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDISCRETIONARY_ITEM__NAME = eINSTANCE.getTDiscretionaryItem_Name();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TDocumentationImpl <em>TDocumentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TDocumentationImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTDocumentation()
		 * @generated
		 */
		EClass TDOCUMENTATION = eINSTANCE.getTDocumentation();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDOCUMENTATION__MIXED = eINSTANCE.getTDocumentation_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDOCUMENTATION__ANY = eINSTANCE.getTDocumentation_Any();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDOCUMENTATION__ID = eINSTANCE.getTDocumentation_Id();

		/**
		 * The meta object literal for the '<em><b>Text Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDOCUMENTATION__TEXT_FORMAT = eINSTANCE.getTDocumentation_TextFormat();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TEntryCriterionImpl <em>TEntry Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TEntryCriterionImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTEntryCriterion()
		 * @generated
		 */
		EClass TENTRY_CRITERION = eINSTANCE.getTEntryCriterion();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TEventListenerImpl <em>TEvent Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TEventListenerImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTEventListener()
		 * @generated
		 */
		EClass TEVENT_LISTENER = eINSTANCE.getTEventListener();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TExitCriterionImpl <em>TExit Criterion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TExitCriterionImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTExitCriterion()
		 * @generated
		 */
		EClass TEXIT_CRITERION = eINSTANCE.getTExitCriterion();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TExpressionImpl <em>TExpression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TExpressionImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTExpression()
		 * @generated
		 */
		EClass TEXPRESSION = eINSTANCE.getTExpression();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXPRESSION__LANGUAGE = eINSTANCE.getTExpression_Language();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TExtensionElementsImpl <em>TExtension Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TExtensionElementsImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTExtensionElements()
		 * @generated
		 */
		EClass TEXTENSION_ELEMENTS = eINSTANCE.getTExtensionElements();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTENSION_ELEMENTS__ANY = eINSTANCE.getTExtensionElements_Any();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.THumanTaskImpl <em>THuman Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.THumanTaskImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTHumanTask()
		 * @generated
		 */
		EClass THUMAN_TASK = eINSTANCE.getTHumanTask();

		/**
		 * The meta object literal for the '<em><b>Planning Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THUMAN_TASK__PLANNING_TABLE = eINSTANCE.getTHumanTask_PlanningTable();

		/**
		 * The meta object literal for the '<em><b>Performer Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THUMAN_TASK__PERFORMER_REF = eINSTANCE.getTHumanTask_PerformerRef();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TIfPartImpl <em>TIf Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TIfPartImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTIfPart()
		 * @generated
		 */
		EClass TIF_PART = eINSTANCE.getTIfPart();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIF_PART__CONDITION = eINSTANCE.getTIfPart_Condition();

		/**
		 * The meta object literal for the '<em><b>Context Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIF_PART__CONTEXT_REF = eINSTANCE.getTIfPart_ContextRef();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TImportImpl <em>TImport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TImportImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTImport()
		 * @generated
		 */
		EClass TIMPORT = eINSTANCE.getTImport();

		/**
		 * The meta object literal for the '<em><b>Import Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPORT__IMPORT_TYPE = eINSTANCE.getTImport_ImportType();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPORT__LOCATION = eINSTANCE.getTImport_Location();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPORT__NAMESPACE = eINSTANCE.getTImport_Namespace();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TManualActivationRuleImpl <em>TManual Activation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TManualActivationRuleImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTManualActivationRule()
		 * @generated
		 */
		EClass TMANUAL_ACTIVATION_RULE = eINSTANCE.getTManualActivationRule();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TMANUAL_ACTIVATION_RULE__CONDITION = eINSTANCE.getTManualActivationRule_Condition();

		/**
		 * The meta object literal for the '<em><b>Context Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMANUAL_ACTIVATION_RULE__CONTEXT_REF = eINSTANCE.getTManualActivationRule_ContextRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TMANUAL_ACTIVATION_RULE__NAME = eINSTANCE.getTManualActivationRule_Name();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TMilestoneImpl <em>TMilestone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TMilestoneImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTMilestone()
		 * @generated
		 */
		EClass TMILESTONE = eINSTANCE.getTMilestone();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TOnPartImpl <em>TOn Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TOnPartImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTOnPart()
		 * @generated
		 */
		EClass TON_PART = eINSTANCE.getTOnPart();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TON_PART__NAME = eINSTANCE.getTOnPart_Name();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TParameterImpl <em>TParameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TParameterImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTParameter()
		 * @generated
		 */
		EClass TPARAMETER = eINSTANCE.getTParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPARAMETER__NAME = eINSTANCE.getTParameter_Name();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TParameterMappingImpl <em>TParameter Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TParameterMappingImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTParameterMapping()
		 * @generated
		 */
		EClass TPARAMETER_MAPPING = eINSTANCE.getTParameterMapping();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPARAMETER_MAPPING__TRANSFORMATION = eINSTANCE.getTParameterMapping_Transformation();

		/**
		 * The meta object literal for the '<em><b>Source Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPARAMETER_MAPPING__SOURCE_REF = eINSTANCE.getTParameterMapping_SourceRef();

		/**
		 * The meta object literal for the '<em><b>Target Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPARAMETER_MAPPING__TARGET_REF = eINSTANCE.getTParameterMapping_TargetRef();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TPlanFragmentImpl <em>TPlan Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TPlanFragmentImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTPlanFragment()
		 * @generated
		 */
		EClass TPLAN_FRAGMENT = eINSTANCE.getTPlanFragment();

		/**
		 * The meta object literal for the '<em><b>Plan Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN_FRAGMENT__PLAN_ITEM = eINSTANCE.getTPlanFragment_PlanItem();

		/**
		 * The meta object literal for the '<em><b>Sentry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN_FRAGMENT__SENTRY = eINSTANCE.getTPlanFragment_Sentry();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TPlanItemImpl <em>TPlan Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TPlanItemImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTPlanItem()
		 * @generated
		 */
		EClass TPLAN_ITEM = eINSTANCE.getTPlanItem();

		/**
		 * The meta object literal for the '<em><b>Item Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN_ITEM__ITEM_CONTROL = eINSTANCE.getTPlanItem_ItemControl();

		/**
		 * The meta object literal for the '<em><b>Entry Criterion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN_ITEM__ENTRY_CRITERION = eINSTANCE.getTPlanItem_EntryCriterion();

		/**
		 * The meta object literal for the '<em><b>Exit Criterion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN_ITEM__EXIT_CRITERION = eINSTANCE.getTPlanItem_ExitCriterion();

		/**
		 * The meta object literal for the '<em><b>Definition Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLAN_ITEM__DEFINITION_REF = eINSTANCE.getTPlanItem_DefinitionRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLAN_ITEM__NAME = eINSTANCE.getTPlanItem_Name();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TPlanItemControlImpl <em>TPlan Item Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TPlanItemControlImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTPlanItemControl()
		 * @generated
		 */
		EClass TPLAN_ITEM_CONTROL = eINSTANCE.getTPlanItemControl();

		/**
		 * The meta object literal for the '<em><b>Repetition Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN_ITEM_CONTROL__REPETITION_RULE = eINSTANCE.getTPlanItemControl_RepetitionRule();

		/**
		 * The meta object literal for the '<em><b>Required Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN_ITEM_CONTROL__REQUIRED_RULE = eINSTANCE.getTPlanItemControl_RequiredRule();

		/**
		 * The meta object literal for the '<em><b>Manual Activation Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN_ITEM_CONTROL__MANUAL_ACTIVATION_RULE = eINSTANCE.getTPlanItemControl_ManualActivationRule();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TPlanItemDefinitionImpl <em>TPlan Item Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TPlanItemDefinitionImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTPlanItemDefinition()
		 * @generated
		 */
		EClass TPLAN_ITEM_DEFINITION = eINSTANCE.getTPlanItemDefinition();

		/**
		 * The meta object literal for the '<em><b>Default Control</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLAN_ITEM_DEFINITION__DEFAULT_CONTROL = eINSTANCE.getTPlanItemDefinition_DefaultControl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLAN_ITEM_DEFINITION__NAME = eINSTANCE.getTPlanItemDefinition_Name();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TPlanItemOnPartImpl <em>TPlan Item On Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TPlanItemOnPartImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTPlanItemOnPart()
		 * @generated
		 */
		EClass TPLAN_ITEM_ON_PART = eINSTANCE.getTPlanItemOnPart();

		/**
		 * The meta object literal for the '<em><b>Standard Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLAN_ITEM_ON_PART__STANDARD_EVENT = eINSTANCE.getTPlanItemOnPart_StandardEvent();

		/**
		 * The meta object literal for the '<em><b>Exit Criterion Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLAN_ITEM_ON_PART__EXIT_CRITERION_REF = eINSTANCE.getTPlanItemOnPart_ExitCriterionRef();

		/**
		 * The meta object literal for the '<em><b>Source Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLAN_ITEM_ON_PART__SOURCE_REF = eINSTANCE.getTPlanItemOnPart_SourceRef();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TPlanItemStartTriggerImpl <em>TPlan Item Start Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TPlanItemStartTriggerImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTPlanItemStartTrigger()
		 * @generated
		 */
		EClass TPLAN_ITEM_START_TRIGGER = eINSTANCE.getTPlanItemStartTrigger();

		/**
		 * The meta object literal for the '<em><b>Standard Event</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLAN_ITEM_START_TRIGGER__STANDARD_EVENT = eINSTANCE.getTPlanItemStartTrigger_StandardEvent();

		/**
		 * The meta object literal for the '<em><b>Source Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLAN_ITEM_START_TRIGGER__SOURCE_REF = eINSTANCE.getTPlanItemStartTrigger_SourceRef();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TPlanningTableImpl <em>TPlanning Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TPlanningTableImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTPlanningTable()
		 * @generated
		 */
		EClass TPLANNING_TABLE = eINSTANCE.getTPlanningTable();

		/**
		 * The meta object literal for the '<em><b>Table Item Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPLANNING_TABLE__TABLE_ITEM_GROUP = eINSTANCE.getTPlanningTable_TableItemGroup();

		/**
		 * The meta object literal for the '<em><b>Table Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLANNING_TABLE__TABLE_ITEM = eINSTANCE.getTPlanningTable_TableItem();

		/**
		 * The meta object literal for the '<em><b>Applicability Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPLANNING_TABLE__APPLICABILITY_RULE = eINSTANCE.getTPlanningTable_ApplicabilityRule();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TProcessImpl <em>TProcess</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TProcessImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTProcess()
		 * @generated
		 */
		EClass TPROCESS = eINSTANCE.getTProcess();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPROCESS__INPUT = eINSTANCE.getTProcess_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPROCESS__OUTPUT = eINSTANCE.getTProcess_Output();

		/**
		 * The meta object literal for the '<em><b>External Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPROCESS__EXTERNAL_REF = eINSTANCE.getTProcess_ExternalRef();

		/**
		 * The meta object literal for the '<em><b>Implementation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPROCESS__IMPLEMENTATION_TYPE = eINSTANCE.getTProcess_ImplementationType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPROCESS__NAME = eINSTANCE.getTProcess_Name();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TProcessParameterImpl <em>TProcess Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TProcessParameterImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTProcessParameter()
		 * @generated
		 */
		EClass TPROCESS_PARAMETER = eINSTANCE.getTProcessParameter();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TProcessTaskImpl <em>TProcess Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TProcessTaskImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTProcessTask()
		 * @generated
		 */
		EClass TPROCESS_TASK = eINSTANCE.getTProcessTask();

		/**
		 * The meta object literal for the '<em><b>Parameter Mapping</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPROCESS_TASK__PARAMETER_MAPPING = eINSTANCE.getTProcessTask_ParameterMapping();

		/**
		 * The meta object literal for the '<em><b>Process Ref Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPROCESS_TASK__PROCESS_REF_EXPRESSION = eINSTANCE.getTProcessTask_ProcessRefExpression();

		/**
		 * The meta object literal for the '<em><b>Process Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPROCESS_TASK__PROCESS_REF = eINSTANCE.getTProcessTask_ProcessRef();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TPropertyImpl <em>TProperty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TPropertyImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTProperty()
		 * @generated
		 */
		EClass TPROPERTY = eINSTANCE.getTProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPROPERTY__NAME = eINSTANCE.getTProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TPROPERTY__TYPE = eINSTANCE.getTProperty_Type();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TRelationshipImpl <em>TRelationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TRelationshipImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTRelationship()
		 * @generated
		 */
		EClass TRELATIONSHIP = eINSTANCE.getTRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRELATIONSHIP__SOURCE = eINSTANCE.getTRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRELATIONSHIP__TARGET = eINSTANCE.getTRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRELATIONSHIP__DIRECTION = eINSTANCE.getTRelationship_Direction();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRELATIONSHIP__TYPE = eINSTANCE.getTRelationship_Type();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TRepetitionRuleImpl <em>TRepetition Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TRepetitionRuleImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTRepetitionRule()
		 * @generated
		 */
		EClass TREPETITION_RULE = eINSTANCE.getTRepetitionRule();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREPETITION_RULE__CONDITION = eINSTANCE.getTRepetitionRule_Condition();

		/**
		 * The meta object literal for the '<em><b>Context Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREPETITION_RULE__CONTEXT_REF = eINSTANCE.getTRepetitionRule_ContextRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREPETITION_RULE__NAME = eINSTANCE.getTRepetitionRule_Name();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TRequiredRuleImpl <em>TRequired Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TRequiredRuleImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTRequiredRule()
		 * @generated
		 */
		EClass TREQUIRED_RULE = eINSTANCE.getTRequiredRule();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREQUIRED_RULE__CONDITION = eINSTANCE.getTRequiredRule_Condition();

		/**
		 * The meta object literal for the '<em><b>Context Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIRED_RULE__CONTEXT_REF = eINSTANCE.getTRequiredRule_ContextRef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREQUIRED_RULE__NAME = eINSTANCE.getTRequiredRule_Name();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TRoleImpl <em>TRole</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TRoleImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTRole()
		 * @generated
		 */
		EClass TROLE = eINSTANCE.getTRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TROLE__NAME = eINSTANCE.getTRole_Name();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TSentryImpl <em>TSentry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TSentryImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTSentry()
		 * @generated
		 */
		EClass TSENTRY = eINSTANCE.getTSentry();

		/**
		 * The meta object literal for the '<em><b>On Part Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSENTRY__ON_PART_GROUP = eINSTANCE.getTSentry_OnPartGroup();

		/**
		 * The meta object literal for the '<em><b>On Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSENTRY__ON_PART = eINSTANCE.getTSentry_OnPart();

		/**
		 * The meta object literal for the '<em><b>If Part</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSENTRY__IF_PART = eINSTANCE.getTSentry_IfPart();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSENTRY__NAME = eINSTANCE.getTSentry_Name();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TStageImpl <em>TStage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TStageImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTStage()
		 * @generated
		 */
		EClass TSTAGE = eINSTANCE.getTStage();

		/**
		 * The meta object literal for the '<em><b>Planning Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSTAGE__PLANNING_TABLE = eINSTANCE.getTStage_PlanningTable();

		/**
		 * The meta object literal for the '<em><b>Plan Item Definition Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSTAGE__PLAN_ITEM_DEFINITION_GROUP = eINSTANCE.getTStage_PlanItemDefinitionGroup();

		/**
		 * The meta object literal for the '<em><b>Plan Item Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSTAGE__PLAN_ITEM_DEFINITION = eINSTANCE.getTStage_PlanItemDefinition();

		/**
		 * The meta object literal for the '<em><b>Exit Criterion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TSTAGE__EXIT_CRITERION = eINSTANCE.getTStage_ExitCriterion();

		/**
		 * The meta object literal for the '<em><b>Auto Complete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TSTAGE__AUTO_COMPLETE = eINSTANCE.getTStage_AutoComplete();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TStartTriggerImpl <em>TStart Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TStartTriggerImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTStartTrigger()
		 * @generated
		 */
		EClass TSTART_TRIGGER = eINSTANCE.getTStartTrigger();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TTableItemImpl <em>TTable Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TTableItemImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTTableItem()
		 * @generated
		 */
		EClass TTABLE_ITEM = eINSTANCE.getTTableItem();

		/**
		 * The meta object literal for the '<em><b>Applicability Rule Refs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTABLE_ITEM__APPLICABILITY_RULE_REFS = eINSTANCE.getTTableItem_ApplicabilityRuleRefs();

		/**
		 * The meta object literal for the '<em><b>Authorized Role Refs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTABLE_ITEM__AUTHORIZED_ROLE_REFS = eINSTANCE.getTTableItem_AuthorizedRoleRefs();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TTaskImpl <em>TTask</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TTaskImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTTask()
		 * @generated
		 */
		EClass TTASK = eINSTANCE.getTTask();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTASK__INPUT = eINSTANCE.getTTask_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTASK__OUTPUT = eINSTANCE.getTTask_Output();

		/**
		 * The meta object literal for the '<em><b>Is Blocking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTASK__IS_BLOCKING = eINSTANCE.getTTask_IsBlocking();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TTextAnnotationImpl <em>TText Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TTextAnnotationImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTTextAnnotation()
		 * @generated
		 */
		EClass TTEXT_ANNOTATION = eINSTANCE.getTTextAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTEXT_ANNOTATION__TEXT = eINSTANCE.getTTextAnnotation_Text();

		/**
		 * The meta object literal for the '<em><b>Text Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTEXT_ANNOTATION__TEXT_FORMAT = eINSTANCE.getTTextAnnotation_TextFormat();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TTimerEventListenerImpl <em>TTimer Event Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TTimerEventListenerImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTTimerEventListener()
		 * @generated
		 */
		EClass TTIMER_EVENT_LISTENER = eINSTANCE.getTTimerEventListener();

		/**
		 * The meta object literal for the '<em><b>Timer Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTIMER_EVENT_LISTENER__TIMER_EXPRESSION = eINSTANCE.getTTimerEventListener_TimerExpression();

		/**
		 * The meta object literal for the '<em><b>Timer Start Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTIMER_EVENT_LISTENER__TIMER_START_GROUP = eINSTANCE.getTTimerEventListener_TimerStartGroup();

		/**
		 * The meta object literal for the '<em><b>Timer Start</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TTIMER_EVENT_LISTENER__TIMER_START = eINSTANCE.getTTimerEventListener_TimerStart();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.impl.TUserEventListenerImpl <em>TUser Event Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.impl.TUserEventListenerImpl
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTUserEventListener()
		 * @generated
		 */
		EClass TUSER_EVENT_LISTENER = eINSTANCE.getTUserEventListener();

		/**
		 * The meta object literal for the '<em><b>Authorized Role Refs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUSER_EVENT_LISTENER__AUTHORIZED_ROLE_REFS = eINSTANCE.getTUserEventListener_AuthorizedRoleRefs();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.CaseFileItemTransition <em>Case File Item Transition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.CaseFileItemTransition
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getCaseFileItemTransition()
		 * @generated
		 */
		EEnum CASE_FILE_ITEM_TRANSITION = eINSTANCE.getCaseFileItemTransition();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.DecisionTypeEnumMember1 <em>Decision Type Enum Member1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.DecisionTypeEnumMember1
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getDecisionTypeEnumMember1()
		 * @generated
		 */
		EEnum DECISION_TYPE_ENUM_MEMBER1 = eINSTANCE.getDecisionTypeEnumMember1();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.DefinitionTypeEnumMember1 <em>Definition Type Enum Member1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.DefinitionTypeEnumMember1
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getDefinitionTypeEnumMember1()
		 * @generated
		 */
		EEnum DEFINITION_TYPE_ENUM_MEMBER1 = eINSTANCE.getDefinitionTypeEnumMember1();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.MultiplicityEnum <em>Multiplicity Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.MultiplicityEnum
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getMultiplicityEnum()
		 * @generated
		 */
		EEnum MULTIPLICITY_ENUM = eINSTANCE.getMultiplicityEnum();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.PlanItemTransition <em>Plan Item Transition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.PlanItemTransition
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getPlanItemTransition()
		 * @generated
		 */
		EEnum PLAN_ITEM_TRANSITION = eINSTANCE.getPlanItemTransition();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.ProcessTypeEnumMember1 <em>Process Type Enum Member1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.ProcessTypeEnumMember1
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getProcessTypeEnumMember1()
		 * @generated
		 */
		EEnum PROCESS_TYPE_ENUM_MEMBER1 = eINSTANCE.getProcessTypeEnumMember1();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.PropertyTypeEnumMember1 <em>Property Type Enum Member1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.PropertyTypeEnumMember1
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getPropertyTypeEnumMember1()
		 * @generated
		 */
		EEnum PROPERTY_TYPE_ENUM_MEMBER1 = eINSTANCE.getPropertyTypeEnumMember1();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.TAssociationDirection <em>TAssociation Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.TAssociationDirection
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTAssociationDirection()
		 * @generated
		 */
		EEnum TASSOCIATION_DIRECTION = eINSTANCE.getTAssociationDirection();

		/**
		 * The meta object literal for the '{@link org.omg.spec.cmmn.casemodel.TRelationshipDirection <em>TRelationship Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.TRelationshipDirection
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTRelationshipDirection()
		 * @generated
		 */
		EEnum TRELATIONSHIP_DIRECTION = eINSTANCE.getTRelationshipDirection();

		/**
		 * The meta object literal for the '<em>Case File Item Transition Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.CaseFileItemTransition
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getCaseFileItemTransitionObject()
		 * @generated
		 */
		EDataType CASE_FILE_ITEM_TRANSITION_OBJECT = eINSTANCE.getCaseFileItemTransitionObject();

		/**
		 * The meta object literal for the '<em>Decision Type Enum</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getDecisionTypeEnum()
		 * @generated
		 */
		EDataType DECISION_TYPE_ENUM = eINSTANCE.getDecisionTypeEnum();

		/**
		 * The meta object literal for the '<em>Decision Type Enum Member1 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.DecisionTypeEnumMember1
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getDecisionTypeEnumMember1Object()
		 * @generated
		 */
		EDataType DECISION_TYPE_ENUM_MEMBER1_OBJECT = eINSTANCE.getDecisionTypeEnumMember1Object();

		/**
		 * The meta object literal for the '<em>Definition Type Enum</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getDefinitionTypeEnum()
		 * @generated
		 */
		EDataType DEFINITION_TYPE_ENUM = eINSTANCE.getDefinitionTypeEnum();

		/**
		 * The meta object literal for the '<em>Definition Type Enum Member1 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.DefinitionTypeEnumMember1
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getDefinitionTypeEnumMember1Object()
		 * @generated
		 */
		EDataType DEFINITION_TYPE_ENUM_MEMBER1_OBJECT = eINSTANCE.getDefinitionTypeEnumMember1Object();

		/**
		 * The meta object literal for the '<em>Multiplicity Enum Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.MultiplicityEnum
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getMultiplicityEnumObject()
		 * @generated
		 */
		EDataType MULTIPLICITY_ENUM_OBJECT = eINSTANCE.getMultiplicityEnumObject();

		/**
		 * The meta object literal for the '<em>Plan Item Transition Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.PlanItemTransition
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getPlanItemTransitionObject()
		 * @generated
		 */
		EDataType PLAN_ITEM_TRANSITION_OBJECT = eINSTANCE.getPlanItemTransitionObject();

		/**
		 * The meta object literal for the '<em>Process Type Enum</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getProcessTypeEnum()
		 * @generated
		 */
		EDataType PROCESS_TYPE_ENUM = eINSTANCE.getProcessTypeEnum();

		/**
		 * The meta object literal for the '<em>Process Type Enum Member1 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.ProcessTypeEnumMember1
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getProcessTypeEnumMember1Object()
		 * @generated
		 */
		EDataType PROCESS_TYPE_ENUM_MEMBER1_OBJECT = eINSTANCE.getProcessTypeEnumMember1Object();

		/**
		 * The meta object literal for the '<em>Property Type Enum</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getPropertyTypeEnum()
		 * @generated
		 */
		EDataType PROPERTY_TYPE_ENUM = eINSTANCE.getPropertyTypeEnum();

		/**
		 * The meta object literal for the '<em>Property Type Enum Member1 Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.PropertyTypeEnumMember1
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getPropertyTypeEnumMember1Object()
		 * @generated
		 */
		EDataType PROPERTY_TYPE_ENUM_MEMBER1_OBJECT = eINSTANCE.getPropertyTypeEnumMember1Object();

		/**
		 * The meta object literal for the '<em>TAssociation Direction Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.TAssociationDirection
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTAssociationDirectionObject()
		 * @generated
		 */
		EDataType TASSOCIATION_DIRECTION_OBJECT = eINSTANCE.getTAssociationDirectionObject();

		/**
		 * The meta object literal for the '<em>TRelationship Direction Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.cmmn.casemodel.TRelationshipDirection
		 * @see org.omg.spec.cmmn.casemodel.impl.CaseModelPackageImpl#getTRelationshipDirectionObject()
		 * @generated
		 */
		EDataType TRELATIONSHIP_DIRECTION_OBJECT = eINSTANCE.getTRelationshipDirectionObject();

	}

} //CaseModelPackage
