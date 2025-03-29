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
package org.omg.spec.bpmn.bpmn;


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
 * @see org.omg.spec.bpmn.bpmn.BPMNFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = BPMNPackage.eNS_URI, genModel = "/model/BPMN20.genmodel", genModelSourceLocations = {"model/BPMN20.genmodel","org.omg.bpmn.model/model/BPMN20.genmodel"}, ecore="/model/bpmn.ecore", ecoreSourceLocations="/model/bpmn.ecore")
public interface BPMNPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bpmn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/BPMN/20100524/MODEL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bpmn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BPMNPackage eINSTANCE = org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNRootImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getBPMNRoot()
	 * @generated
	 */
	int BPMN_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__ACTIVITY = 3;

	/**
	 * The feature id for the '<em><b>Ad Hoc Sub Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__AD_HOC_SUB_PROCESS = 4;

	/**
	 * The feature id for the '<em><b>Flow Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__FLOW_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__ARTIFACT = 6;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__ASSIGNMENT = 7;

	/**
	 * The feature id for the '<em><b>Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__ASSOCIATION = 8;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__AUDITING = 9;

	/**
	 * The feature id for the '<em><b>Base Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__BASE_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Base Element With Mixed Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__BASE_ELEMENT_WITH_MIXED_CONTENT = 11;

	/**
	 * The feature id for the '<em><b>Boundary Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__BOUNDARY_EVENT = 12;

	/**
	 * The feature id for the '<em><b>Business Rule Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__BUSINESS_RULE_TASK = 13;

	/**
	 * The feature id for the '<em><b>Callable Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__CALLABLE_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Call Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__CALL_ACTIVITY = 15;

	/**
	 * The feature id for the '<em><b>Call Choreography</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__CALL_CHOREOGRAPHY = 16;

	/**
	 * The feature id for the '<em><b>Call Conversation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__CALL_CONVERSATION = 17;

	/**
	 * The feature id for the '<em><b>Conversation Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__CONVERSATION_NODE = 18;

	/**
	 * The feature id for the '<em><b>Cancel Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__CANCEL_EVENT_DEFINITION = 19;

	/**
	 * The feature id for the '<em><b>Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__EVENT_DEFINITION = 20;

	/**
	 * The feature id for the '<em><b>Root Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__ROOT_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Catch Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__CATCH_EVENT = 22;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__CATEGORY = 23;

	/**
	 * The feature id for the '<em><b>Category Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__CATEGORY_VALUE = 24;

	/**
	 * The feature id for the '<em><b>Choreography</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__CHOREOGRAPHY = 25;

	/**
	 * The feature id for the '<em><b>Collaboration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__COLLABORATION = 26;

	/**
	 * The feature id for the '<em><b>Choreography Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__CHOREOGRAPHY_ACTIVITY = 27;

	/**
	 * The feature id for the '<em><b>Choreography Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__CHOREOGRAPHY_TASK = 28;

	/**
	 * The feature id for the '<em><b>Compensate Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__COMPENSATE_EVENT_DEFINITION = 29;

	/**
	 * The feature id for the '<em><b>Complex Behavior Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__COMPLEX_BEHAVIOR_DEFINITION = 30;

	/**
	 * The feature id for the '<em><b>Complex Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__COMPLEX_GATEWAY = 31;

	/**
	 * The feature id for the '<em><b>Conditional Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__CONDITIONAL_EVENT_DEFINITION = 32;

	/**
	 * The feature id for the '<em><b>Conversation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__CONVERSATION = 33;

	/**
	 * The feature id for the '<em><b>Conversation Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__CONVERSATION_ASSOCIATION = 34;

	/**
	 * The feature id for the '<em><b>Conversation Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__CONVERSATION_LINK = 35;

	/**
	 * The feature id for the '<em><b>Correlation Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__CORRELATION_KEY = 36;

	/**
	 * The feature id for the '<em><b>Correlation Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__CORRELATION_PROPERTY = 37;

	/**
	 * The feature id for the '<em><b>Correlation Property Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__CORRELATION_PROPERTY_BINDING = 38;

	/**
	 * The feature id for the '<em><b>Correlation Property Retrieval Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION = 39;

	/**
	 * The feature id for the '<em><b>Correlation Subscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__CORRELATION_SUBSCRIPTION = 40;

	/**
	 * The feature id for the '<em><b>Data Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__DATA_ASSOCIATION = 41;

	/**
	 * The feature id for the '<em><b>Data Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__DATA_INPUT = 42;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__DATA_INPUT_ASSOCIATION = 43;

	/**
	 * The feature id for the '<em><b>Data Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__DATA_OBJECT = 44;

	/**
	 * The feature id for the '<em><b>Data Object Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__DATA_OBJECT_REFERENCE = 45;

	/**
	 * The feature id for the '<em><b>Data Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__DATA_OUTPUT = 46;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__DATA_OUTPUT_ASSOCIATION = 47;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__DATA_STATE = 48;

	/**
	 * The feature id for the '<em><b>Data Store</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__DATA_STORE = 49;

	/**
	 * The feature id for the '<em><b>Data Store Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__DATA_STORE_REFERENCE = 50;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__DEFINITIONS = 51;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__DOCUMENTATION = 52;

	/**
	 * The feature id for the '<em><b>End Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__END_EVENT = 53;

	/**
	 * The feature id for the '<em><b>End Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__END_POINT = 54;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__ERROR = 55;

	/**
	 * The feature id for the '<em><b>Error Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__ERROR_EVENT_DEFINITION = 56;

	/**
	 * The feature id for the '<em><b>Escalation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__ESCALATION = 57;

	/**
	 * The feature id for the '<em><b>Escalation Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__ESCALATION_EVENT_DEFINITION = 58;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__EVENT = 59;

	/**
	 * The feature id for the '<em><b>Event Based Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__EVENT_BASED_GATEWAY = 60;

	/**
	 * The feature id for the '<em><b>Exclusive Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__EXCLUSIVE_GATEWAY = 61;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__EXPRESSION = 62;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__EXTENSION = 63;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__EXTENSION_ELEMENTS = 64;

	/**
	 * The feature id for the '<em><b>Flow Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__FLOW_NODE = 65;

	/**
	 * The feature id for the '<em><b>Formal Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__FORMAL_EXPRESSION = 66;

	/**
	 * The feature id for the '<em><b>Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__GATEWAY = 67;

	/**
	 * The feature id for the '<em><b>Global Business Rule Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__GLOBAL_BUSINESS_RULE_TASK = 68;

	/**
	 * The feature id for the '<em><b>Global Choreography Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__GLOBAL_CHOREOGRAPHY_TASK = 69;

	/**
	 * The feature id for the '<em><b>Global Conversation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__GLOBAL_CONVERSATION = 70;

	/**
	 * The feature id for the '<em><b>Global Manual Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__GLOBAL_MANUAL_TASK = 71;

	/**
	 * The feature id for the '<em><b>Global Script Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__GLOBAL_SCRIPT_TASK = 72;

	/**
	 * The feature id for the '<em><b>Global Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__GLOBAL_TASK = 73;

	/**
	 * The feature id for the '<em><b>Global User Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__GLOBAL_USER_TASK = 74;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__GROUP = 75;

	/**
	 * The feature id for the '<em><b>Human Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__HUMAN_PERFORMER = 76;

	/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__PERFORMER = 77;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__RESOURCE_ROLE = 78;

	/**
	 * The feature id for the '<em><b>Implicit Throw Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__IMPLICIT_THROW_EVENT = 79;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__IMPORT = 80;

	/**
	 * The feature id for the '<em><b>Inclusive Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__INCLUSIVE_GATEWAY = 81;

	/**
	 * The feature id for the '<em><b>Input Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__INPUT_SET = 82;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__INTERFACE = 83;

	/**
	 * The feature id for the '<em><b>Intermediate Catch Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__INTERMEDIATE_CATCH_EVENT = 84;

	/**
	 * The feature id for the '<em><b>Intermediate Throw Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__INTERMEDIATE_THROW_EVENT = 85;

	/**
	 * The feature id for the '<em><b>Io Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__IO_BINDING = 86;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__IO_SPECIFICATION = 87;

	/**
	 * The feature id for the '<em><b>Item Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__ITEM_DEFINITION = 88;

	/**
	 * The feature id for the '<em><b>Lane</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__LANE = 89;

	/**
	 * The feature id for the '<em><b>Lane Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__LANE_SET = 90;

	/**
	 * The feature id for the '<em><b>Link Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__LINK_EVENT_DEFINITION = 91;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__LOOP_CHARACTERISTICS = 92;

	/**
	 * The feature id for the '<em><b>Manual Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__MANUAL_TASK = 93;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__MESSAGE = 94;

	/**
	 * The feature id for the '<em><b>Message Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__MESSAGE_EVENT_DEFINITION = 95;

	/**
	 * The feature id for the '<em><b>Message Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__MESSAGE_FLOW = 96;

	/**
	 * The feature id for the '<em><b>Message Flow Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__MESSAGE_FLOW_ASSOCIATION = 97;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__MONITORING = 98;

	/**
	 * The feature id for the '<em><b>Multi Instance Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__MULTI_INSTANCE_LOOP_CHARACTERISTICS = 99;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__OPERATION = 100;

	/**
	 * The feature id for the '<em><b>Output Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__OUTPUT_SET = 101;

	/**
	 * The feature id for the '<em><b>Parallel Gateway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__PARALLEL_GATEWAY = 102;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__PARTICIPANT = 103;

	/**
	 * The feature id for the '<em><b>Participant Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__PARTICIPANT_ASSOCIATION = 104;

	/**
	 * The feature id for the '<em><b>Participant Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__PARTICIPANT_MULTIPLICITY = 105;

	/**
	 * The feature id for the '<em><b>Partner Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__PARTNER_ENTITY = 106;

	/**
	 * The feature id for the '<em><b>Partner Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__PARTNER_ROLE = 107;

	/**
	 * The feature id for the '<em><b>Potential Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__POTENTIAL_OWNER = 108;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__PROCESS = 109;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__PROPERTY = 110;

	/**
	 * The feature id for the '<em><b>Receive Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__RECEIVE_TASK = 111;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__RELATIONSHIP = 112;

	/**
	 * The feature id for the '<em><b>Rendering</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__RENDERING = 113;

	/**
	 * The feature id for the '<em><b>Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__RESOURCE = 114;

	/**
	 * The feature id for the '<em><b>Resource Assignment Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__RESOURCE_ASSIGNMENT_EXPRESSION = 115;

	/**
	 * The feature id for the '<em><b>Resource Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__RESOURCE_PARAMETER = 116;

	/**
	 * The feature id for the '<em><b>Resource Parameter Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__RESOURCE_PARAMETER_BINDING = 117;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__SCRIPT = 118;

	/**
	 * The feature id for the '<em><b>Script Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__SCRIPT_TASK = 119;

	/**
	 * The feature id for the '<em><b>Send Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__SEND_TASK = 120;

	/**
	 * The feature id for the '<em><b>Sequence Flow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__SEQUENCE_FLOW = 121;

	/**
	 * The feature id for the '<em><b>Service Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__SERVICE_TASK = 122;

	/**
	 * The feature id for the '<em><b>Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__SIGNAL = 123;

	/**
	 * The feature id for the '<em><b>Signal Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__SIGNAL_EVENT_DEFINITION = 124;

	/**
	 * The feature id for the '<em><b>Standard Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__STANDARD_LOOP_CHARACTERISTICS = 125;

	/**
	 * The feature id for the '<em><b>Start Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__START_EVENT = 126;

	/**
	 * The feature id for the '<em><b>Sub Choreography</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__SUB_CHOREOGRAPHY = 127;

	/**
	 * The feature id for the '<em><b>Sub Conversation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__SUB_CONVERSATION = 128;

	/**
	 * The feature id for the '<em><b>Sub Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__SUB_PROCESS = 129;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__TASK = 130;

	/**
	 * The feature id for the '<em><b>Terminate Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__TERMINATE_EVENT_DEFINITION = 131;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__TEXT = 132;

	/**
	 * The feature id for the '<em><b>Text Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__TEXT_ANNOTATION = 133;

	/**
	 * The feature id for the '<em><b>Throw Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__THROW_EVENT = 134;

	/**
	 * The feature id for the '<em><b>Timer Event Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__TIMER_EVENT_DEFINITION = 135;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__TRANSACTION = 136;

	/**
	 * The feature id for the '<em><b>User Task</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT__USER_TASK = 137;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT_FEATURE_COUNT = 138;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPMN_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TBaseElementImpl <em>TBase Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TBaseElementImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTBaseElement()
	 * @generated
	 */
	int TBASE_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASE_ELEMENT__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASE_ELEMENT__EXTENSION_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASE_ELEMENT__ID = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASE_ELEMENT__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>TBase Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASE_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TBase Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TFlowElementImpl <em>TFlow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TFlowElementImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTFlowElement()
	 * @generated
	 */
	int TFLOW_ELEMENT = 61;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_ELEMENT__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_ELEMENT__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_ELEMENT__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_ELEMENT__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_ELEMENT__AUDITING = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_ELEMENT__MONITORING = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_ELEMENT__CATEGORY_VALUE_REF = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_ELEMENT__NAME = TBASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TFlow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_ELEMENT_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TFlow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_ELEMENT_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TFlowNodeImpl <em>TFlow Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TFlowNodeImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTFlowNode()
	 * @generated
	 */
	int TFLOW_NODE = 62;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_NODE__DOCUMENTATION = TFLOW_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_NODE__EXTENSION_ELEMENTS = TFLOW_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_NODE__ID = TFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_NODE__ANY_ATTRIBUTE = TFLOW_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_NODE__AUDITING = TFLOW_ELEMENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_NODE__MONITORING = TFLOW_ELEMENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_NODE__CATEGORY_VALUE_REF = TFLOW_ELEMENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_NODE__NAME = TFLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_NODE__INCOMING = TFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_NODE__OUTGOING = TFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TFlow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_NODE_FEATURE_COUNT = TFLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TFlow Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOW_NODE_OPERATION_COUNT = TFLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TActivityImpl <em>TActivity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TActivityImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTActivity()
	 * @generated
	 */
	int TACTIVITY = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY__DOCUMENTATION = TFLOW_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY__EXTENSION_ELEMENTS = TFLOW_NODE__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY__ID = TFLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY__ANY_ATTRIBUTE = TFLOW_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY__AUDITING = TFLOW_NODE__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY__MONITORING = TFLOW_NODE__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY__CATEGORY_VALUE_REF = TFLOW_NODE__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY__NAME = TFLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY__INCOMING = TFLOW_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY__OUTGOING = TFLOW_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY__IO_SPECIFICATION = TFLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY__PROPERTY = TFLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY__DATA_INPUT_ASSOCIATION = TFLOW_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY__DATA_OUTPUT_ASSOCIATION = TFLOW_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resource Role Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY__RESOURCE_ROLE_GROUP = TFLOW_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY__RESOURCE_ROLE = TFLOW_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY__LOOP_CHARACTERISTICS_GROUP = TFLOW_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY__LOOP_CHARACTERISTICS = TFLOW_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY__COMPLETION_QUANTITY = TFLOW_NODE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY__DEFAULT = TFLOW_NODE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY__IS_FOR_COMPENSATION = TFLOW_NODE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY__START_QUANTITY = TFLOW_NODE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>TActivity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY_FEATURE_COUNT = TFLOW_NODE_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>TActivity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTIVITY_OPERATION_COUNT = TFLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TSubProcessImpl <em>TSub Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TSubProcessImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTSubProcess()
	 * @generated
	 */
	int TSUB_PROCESS = 127;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__DOCUMENTATION = TACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__EXTENSION_ELEMENTS = TACTIVITY__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__ID = TACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__ANY_ATTRIBUTE = TACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__AUDITING = TACTIVITY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__MONITORING = TACTIVITY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__CATEGORY_VALUE_REF = TACTIVITY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__NAME = TACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__INCOMING = TACTIVITY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__OUTGOING = TACTIVITY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__IO_SPECIFICATION = TACTIVITY__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__PROPERTY = TACTIVITY__PROPERTY;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__DATA_INPUT_ASSOCIATION = TACTIVITY__DATA_INPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__DATA_OUTPUT_ASSOCIATION = TACTIVITY__DATA_OUTPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Resource Role Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__RESOURCE_ROLE_GROUP = TACTIVITY__RESOURCE_ROLE_GROUP;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__RESOURCE_ROLE = TACTIVITY__RESOURCE_ROLE;

	/**
	 * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__LOOP_CHARACTERISTICS_GROUP = TACTIVITY__LOOP_CHARACTERISTICS_GROUP;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__LOOP_CHARACTERISTICS = TACTIVITY__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__COMPLETION_QUANTITY = TACTIVITY__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__DEFAULT = TACTIVITY__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__IS_FOR_COMPENSATION = TACTIVITY__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__START_QUANTITY = TACTIVITY__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Lane Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__LANE_SET = TACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flow Element Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__FLOW_ELEMENT_GROUP = TACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Flow Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__FLOW_ELEMENT = TACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Artifact Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__ARTIFACT_GROUP = TACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__ARTIFACT = TACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Triggered By Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS__TRIGGERED_BY_EVENT = TACTIVITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>TSub Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS_FEATURE_COUNT = TACTIVITY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>TSub Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_PROCESS_OPERATION_COUNT = TACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TAdHocSubProcessImpl <em>TAd Hoc Sub Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TAdHocSubProcessImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTAdHocSubProcess()
	 * @generated
	 */
	int TAD_HOC_SUB_PROCESS = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__DOCUMENTATION = TSUB_PROCESS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__EXTENSION_ELEMENTS = TSUB_PROCESS__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__ID = TSUB_PROCESS__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__ANY_ATTRIBUTE = TSUB_PROCESS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__AUDITING = TSUB_PROCESS__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__MONITORING = TSUB_PROCESS__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__CATEGORY_VALUE_REF = TSUB_PROCESS__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__NAME = TSUB_PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__INCOMING = TSUB_PROCESS__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__OUTGOING = TSUB_PROCESS__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__IO_SPECIFICATION = TSUB_PROCESS__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__PROPERTY = TSUB_PROCESS__PROPERTY;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__DATA_INPUT_ASSOCIATION = TSUB_PROCESS__DATA_INPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__DATA_OUTPUT_ASSOCIATION = TSUB_PROCESS__DATA_OUTPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Resource Role Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__RESOURCE_ROLE_GROUP = TSUB_PROCESS__RESOURCE_ROLE_GROUP;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__RESOURCE_ROLE = TSUB_PROCESS__RESOURCE_ROLE;

	/**
	 * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__LOOP_CHARACTERISTICS_GROUP = TSUB_PROCESS__LOOP_CHARACTERISTICS_GROUP;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__LOOP_CHARACTERISTICS = TSUB_PROCESS__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__COMPLETION_QUANTITY = TSUB_PROCESS__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__DEFAULT = TSUB_PROCESS__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__IS_FOR_COMPENSATION = TSUB_PROCESS__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__START_QUANTITY = TSUB_PROCESS__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Lane Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__LANE_SET = TSUB_PROCESS__LANE_SET;

	/**
	 * The feature id for the '<em><b>Flow Element Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__FLOW_ELEMENT_GROUP = TSUB_PROCESS__FLOW_ELEMENT_GROUP;

	/**
	 * The feature id for the '<em><b>Flow Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__FLOW_ELEMENT = TSUB_PROCESS__FLOW_ELEMENT;

	/**
	 * The feature id for the '<em><b>Artifact Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__ARTIFACT_GROUP = TSUB_PROCESS__ARTIFACT_GROUP;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__ARTIFACT = TSUB_PROCESS__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Triggered By Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__TRIGGERED_BY_EVENT = TSUB_PROCESS__TRIGGERED_BY_EVENT;

	/**
	 * The feature id for the '<em><b>Completion Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__COMPLETION_CONDITION = TSUB_PROCESS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cancel Remaining Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__CANCEL_REMAINING_INSTANCES = TSUB_PROCESS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS__ORDERING = TSUB_PROCESS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TAd Hoc Sub Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS_FEATURE_COUNT = TSUB_PROCESS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TAd Hoc Sub Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAD_HOC_SUB_PROCESS_OPERATION_COUNT = TSUB_PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TArtifactImpl <em>TArtifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TArtifactImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTArtifact()
	 * @generated
	 */
	int TARTIFACT = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>TArtifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TArtifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TAssignmentImpl <em>TAssignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TAssignmentImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTAssignment()
	 * @generated
	 */
	int TASSIGNMENT = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSIGNMENT__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSIGNMENT__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSIGNMENT__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSIGNMENT__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSIGNMENT__FROM = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSIGNMENT__TO = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TAssignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSIGNMENT_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TAssignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSIGNMENT_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TAssociationImpl <em>TAssociation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TAssociationImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTAssociation()
	 * @generated
	 */
	int TASSOCIATION = 5;

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
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TAuditingImpl <em>TAuditing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TAuditingImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTAuditing()
	 * @generated
	 */
	int TAUDITING = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAUDITING__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAUDITING__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAUDITING__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAUDITING__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>TAuditing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAUDITING_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TAuditing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAUDITING_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TBaseElementWithMixedContentImpl <em>TBase Element With Mixed Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TBaseElementWithMixedContentImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTBaseElementWithMixedContent()
	 * @generated
	 */
	int TBASE_ELEMENT_WITH_MIXED_CONTENT = 8;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASE_ELEMENT_WITH_MIXED_CONTENT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASE_ELEMENT_WITH_MIXED_CONTENT__DOCUMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASE_ELEMENT_WITH_MIXED_CONTENT__EXTENSION_ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASE_ELEMENT_WITH_MIXED_CONTENT__ID = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASE_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>TBase Element With Mixed Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASE_ELEMENT_WITH_MIXED_CONTENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>TBase Element With Mixed Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBASE_ELEMENT_WITH_MIXED_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TEventImpl <em>TEvent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TEventImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTEvent()
	 * @generated
	 */
	int TEVENT = 54;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT__DOCUMENTATION = TFLOW_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT__EXTENSION_ELEMENTS = TFLOW_NODE__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT__ID = TFLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT__ANY_ATTRIBUTE = TFLOW_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT__AUDITING = TFLOW_NODE__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT__MONITORING = TFLOW_NODE__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT__CATEGORY_VALUE_REF = TFLOW_NODE__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT__NAME = TFLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT__INCOMING = TFLOW_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT__OUTGOING = TFLOW_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT__PROPERTY = TFLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TEvent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_FEATURE_COUNT = TFLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TEvent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_OPERATION_COUNT = TFLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TCatchEventImpl <em>TCatch Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TCatchEventImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTCatchEvent()
	 * @generated
	 */
	int TCATCH_EVENT = 16;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATCH_EVENT__DOCUMENTATION = TEVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATCH_EVENT__EXTENSION_ELEMENTS = TEVENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATCH_EVENT__ID = TEVENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATCH_EVENT__ANY_ATTRIBUTE = TEVENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATCH_EVENT__AUDITING = TEVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATCH_EVENT__MONITORING = TEVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATCH_EVENT__CATEGORY_VALUE_REF = TEVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATCH_EVENT__NAME = TEVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATCH_EVENT__INCOMING = TEVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATCH_EVENT__OUTGOING = TEVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATCH_EVENT__PROPERTY = TEVENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Data Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATCH_EVENT__DATA_OUTPUT = TEVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATCH_EVENT__DATA_OUTPUT_ASSOCIATION = TEVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATCH_EVENT__OUTPUT_SET = TEVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event Definition Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATCH_EVENT__EVENT_DEFINITION_GROUP = TEVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Event Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATCH_EVENT__EVENT_DEFINITION = TEVENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Event Definition Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATCH_EVENT__EVENT_DEFINITION_REF = TEVENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parallel Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATCH_EVENT__PARALLEL_MULTIPLE = TEVENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>TCatch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATCH_EVENT_FEATURE_COUNT = TEVENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>TCatch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATCH_EVENT_OPERATION_COUNT = TEVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TBoundaryEventImpl <em>TBoundary Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TBoundaryEventImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTBoundaryEvent()
	 * @generated
	 */
	int TBOUNDARY_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_EVENT__DOCUMENTATION = TCATCH_EVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_EVENT__EXTENSION_ELEMENTS = TCATCH_EVENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_EVENT__ID = TCATCH_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_EVENT__ANY_ATTRIBUTE = TCATCH_EVENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_EVENT__AUDITING = TCATCH_EVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_EVENT__MONITORING = TCATCH_EVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_EVENT__CATEGORY_VALUE_REF = TCATCH_EVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_EVENT__NAME = TCATCH_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_EVENT__INCOMING = TCATCH_EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_EVENT__OUTGOING = TCATCH_EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_EVENT__PROPERTY = TCATCH_EVENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Data Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_EVENT__DATA_OUTPUT = TCATCH_EVENT__DATA_OUTPUT;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_EVENT__DATA_OUTPUT_ASSOCIATION = TCATCH_EVENT__DATA_OUTPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Output Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_EVENT__OUTPUT_SET = TCATCH_EVENT__OUTPUT_SET;

	/**
	 * The feature id for the '<em><b>Event Definition Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_EVENT__EVENT_DEFINITION_GROUP = TCATCH_EVENT__EVENT_DEFINITION_GROUP;

	/**
	 * The feature id for the '<em><b>Event Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_EVENT__EVENT_DEFINITION = TCATCH_EVENT__EVENT_DEFINITION;

	/**
	 * The feature id for the '<em><b>Event Definition Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_EVENT__EVENT_DEFINITION_REF = TCATCH_EVENT__EVENT_DEFINITION_REF;

	/**
	 * The feature id for the '<em><b>Parallel Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_EVENT__PARALLEL_MULTIPLE = TCATCH_EVENT__PARALLEL_MULTIPLE;

	/**
	 * The feature id for the '<em><b>Attached To Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_EVENT__ATTACHED_TO_REF = TCATCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cancel Activity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_EVENT__CANCEL_ACTIVITY = TCATCH_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TBoundary Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_EVENT_FEATURE_COUNT = TCATCH_EVENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TBoundary Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOUNDARY_EVENT_OPERATION_COUNT = TCATCH_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TTaskImpl <em>TTask</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TTaskImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTTask()
	 * @generated
	 */
	int TTASK = 128;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__DOCUMENTATION = TACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__EXTENSION_ELEMENTS = TACTIVITY__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__ID = TACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__ANY_ATTRIBUTE = TACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__AUDITING = TACTIVITY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__MONITORING = TACTIVITY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__CATEGORY_VALUE_REF = TACTIVITY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__NAME = TACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__INCOMING = TACTIVITY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__OUTGOING = TACTIVITY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__IO_SPECIFICATION = TACTIVITY__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__PROPERTY = TACTIVITY__PROPERTY;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__DATA_INPUT_ASSOCIATION = TACTIVITY__DATA_INPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__DATA_OUTPUT_ASSOCIATION = TACTIVITY__DATA_OUTPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Resource Role Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__RESOURCE_ROLE_GROUP = TACTIVITY__RESOURCE_ROLE_GROUP;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__RESOURCE_ROLE = TACTIVITY__RESOURCE_ROLE;

	/**
	 * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__LOOP_CHARACTERISTICS_GROUP = TACTIVITY__LOOP_CHARACTERISTICS_GROUP;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__LOOP_CHARACTERISTICS = TACTIVITY__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__COMPLETION_QUANTITY = TACTIVITY__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__DEFAULT = TACTIVITY__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__IS_FOR_COMPENSATION = TACTIVITY__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK__START_QUANTITY = TACTIVITY__START_QUANTITY;

	/**
	 * The number of structural features of the '<em>TTask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK_FEATURE_COUNT = TACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TTask</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTASK_OPERATION_COUNT = TACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TBusinessRuleTaskImpl <em>TBusiness Rule Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TBusinessRuleTaskImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTBusinessRuleTask()
	 * @generated
	 */
	int TBUSINESS_RULE_TASK = 10;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK__DOCUMENTATION = TTASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK__EXTENSION_ELEMENTS = TTASK__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK__ID = TTASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK__ANY_ATTRIBUTE = TTASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK__AUDITING = TTASK__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK__MONITORING = TTASK__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK__CATEGORY_VALUE_REF = TTASK__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK__NAME = TTASK__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK__INCOMING = TTASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK__OUTGOING = TTASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK__IO_SPECIFICATION = TTASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK__PROPERTY = TTASK__PROPERTY;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK__DATA_INPUT_ASSOCIATION = TTASK__DATA_INPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK__DATA_OUTPUT_ASSOCIATION = TTASK__DATA_OUTPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Resource Role Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK__RESOURCE_ROLE_GROUP = TTASK__RESOURCE_ROLE_GROUP;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK__RESOURCE_ROLE = TTASK__RESOURCE_ROLE;

	/**
	 * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK__LOOP_CHARACTERISTICS_GROUP = TTASK__LOOP_CHARACTERISTICS_GROUP;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK__LOOP_CHARACTERISTICS = TTASK__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK__COMPLETION_QUANTITY = TTASK__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK__DEFAULT = TTASK__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK__IS_FOR_COMPENSATION = TTASK__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK__START_QUANTITY = TTASK__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK__IMPLEMENTATION = TTASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TBusiness Rule Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK_FEATURE_COUNT = TTASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TBusiness Rule Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_RULE_TASK_OPERATION_COUNT = TTASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TRootElementImpl <em>TRoot Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TRootElementImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTRootElement()
	 * @generated
	 */
	int TROOT_ELEMENT = 115;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROOT_ELEMENT__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROOT_ELEMENT__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROOT_ELEMENT__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROOT_ELEMENT__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>TRoot Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROOT_ELEMENT_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TRoot Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TROOT_ELEMENT_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TCallableElementImpl <em>TCallable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TCallableElementImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTCallableElement()
	 * @generated
	 */
	int TCALLABLE_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALLABLE_ELEMENT__DOCUMENTATION = TROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALLABLE_ELEMENT__EXTENSION_ELEMENTS = TROOT_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALLABLE_ELEMENT__ID = TROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALLABLE_ELEMENT__ANY_ATTRIBUTE = TROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Supported Interface Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALLABLE_ELEMENT__SUPPORTED_INTERFACE_REF = TROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALLABLE_ELEMENT__IO_SPECIFICATION = TROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALLABLE_ELEMENT__IO_BINDING = TROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALLABLE_ELEMENT__NAME = TROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TCallable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALLABLE_ELEMENT_FEATURE_COUNT = TROOT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TCallable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALLABLE_ELEMENT_OPERATION_COUNT = TROOT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TCallActivityImpl <em>TCall Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TCallActivityImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTCallActivity()
	 * @generated
	 */
	int TCALL_ACTIVITY = 12;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY__DOCUMENTATION = TACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY__EXTENSION_ELEMENTS = TACTIVITY__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY__ID = TACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY__ANY_ATTRIBUTE = TACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY__AUDITING = TACTIVITY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY__MONITORING = TACTIVITY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY__CATEGORY_VALUE_REF = TACTIVITY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY__NAME = TACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY__INCOMING = TACTIVITY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY__OUTGOING = TACTIVITY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY__IO_SPECIFICATION = TACTIVITY__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY__PROPERTY = TACTIVITY__PROPERTY;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY__DATA_INPUT_ASSOCIATION = TACTIVITY__DATA_INPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY__DATA_OUTPUT_ASSOCIATION = TACTIVITY__DATA_OUTPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Resource Role Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY__RESOURCE_ROLE_GROUP = TACTIVITY__RESOURCE_ROLE_GROUP;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY__RESOURCE_ROLE = TACTIVITY__RESOURCE_ROLE;

	/**
	 * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY__LOOP_CHARACTERISTICS_GROUP = TACTIVITY__LOOP_CHARACTERISTICS_GROUP;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY__LOOP_CHARACTERISTICS = TACTIVITY__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY__COMPLETION_QUANTITY = TACTIVITY__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY__DEFAULT = TACTIVITY__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY__IS_FOR_COMPENSATION = TACTIVITY__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY__START_QUANTITY = TACTIVITY__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Called Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY__CALLED_ELEMENT = TACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TCall Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY_FEATURE_COUNT = TACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TCall Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_ACTIVITY_OPERATION_COUNT = TACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TChoreographyActivityImpl <em>TChoreography Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TChoreographyActivityImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTChoreographyActivity()
	 * @generated
	 */
	int TCHOREOGRAPHY_ACTIVITY = 20;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_ACTIVITY__DOCUMENTATION = TFLOW_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_ACTIVITY__EXTENSION_ELEMENTS = TFLOW_NODE__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_ACTIVITY__ID = TFLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_ACTIVITY__ANY_ATTRIBUTE = TFLOW_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_ACTIVITY__AUDITING = TFLOW_NODE__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_ACTIVITY__MONITORING = TFLOW_NODE__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_ACTIVITY__CATEGORY_VALUE_REF = TFLOW_NODE__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_ACTIVITY__NAME = TFLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_ACTIVITY__INCOMING = TFLOW_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_ACTIVITY__OUTGOING = TFLOW_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Participant Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_ACTIVITY__PARTICIPANT_REF = TFLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correlation Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_ACTIVITY__CORRELATION_KEY = TFLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initiating Participant Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF = TFLOW_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Loop Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_ACTIVITY__LOOP_TYPE = TFLOW_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TChoreography Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_ACTIVITY_FEATURE_COUNT = TFLOW_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TChoreography Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_ACTIVITY_OPERATION_COUNT = TFLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TCallChoreographyImpl <em>TCall Choreography</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TCallChoreographyImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTCallChoreography()
	 * @generated
	 */
	int TCALL_CHOREOGRAPHY = 13;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CHOREOGRAPHY__DOCUMENTATION = TCHOREOGRAPHY_ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CHOREOGRAPHY__EXTENSION_ELEMENTS = TCHOREOGRAPHY_ACTIVITY__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CHOREOGRAPHY__ID = TCHOREOGRAPHY_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CHOREOGRAPHY__ANY_ATTRIBUTE = TCHOREOGRAPHY_ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CHOREOGRAPHY__AUDITING = TCHOREOGRAPHY_ACTIVITY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CHOREOGRAPHY__MONITORING = TCHOREOGRAPHY_ACTIVITY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CHOREOGRAPHY__CATEGORY_VALUE_REF = TCHOREOGRAPHY_ACTIVITY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CHOREOGRAPHY__NAME = TCHOREOGRAPHY_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CHOREOGRAPHY__INCOMING = TCHOREOGRAPHY_ACTIVITY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CHOREOGRAPHY__OUTGOING = TCHOREOGRAPHY_ACTIVITY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Participant Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CHOREOGRAPHY__PARTICIPANT_REF = TCHOREOGRAPHY_ACTIVITY__PARTICIPANT_REF;

	/**
	 * The feature id for the '<em><b>Correlation Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CHOREOGRAPHY__CORRELATION_KEY = TCHOREOGRAPHY_ACTIVITY__CORRELATION_KEY;

	/**
	 * The feature id for the '<em><b>Initiating Participant Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CHOREOGRAPHY__INITIATING_PARTICIPANT_REF = TCHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF;

	/**
	 * The feature id for the '<em><b>Loop Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CHOREOGRAPHY__LOOP_TYPE = TCHOREOGRAPHY_ACTIVITY__LOOP_TYPE;

	/**
	 * The feature id for the '<em><b>Participant Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CHOREOGRAPHY__PARTICIPANT_ASSOCIATION = TCHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Called Choreography Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CHOREOGRAPHY__CALLED_CHOREOGRAPHY_REF = TCHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TCall Choreography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CHOREOGRAPHY_FEATURE_COUNT = TCHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TCall Choreography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CHOREOGRAPHY_OPERATION_COUNT = TCHOREOGRAPHY_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TConversationNodeImpl <em>TConversation Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TConversationNodeImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTConversationNode()
	 * @generated
	 */
	int TCONVERSATION_NODE = 30;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_NODE__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_NODE__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_NODE__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_NODE__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Participant Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_NODE__PARTICIPANT_REF = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Flow Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_NODE__MESSAGE_FLOW_REF = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Correlation Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_NODE__CORRELATION_KEY = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_NODE__NAME = TBASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TConversation Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_NODE_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TConversation Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_NODE_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TCallConversationImpl <em>TCall Conversation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TCallConversationImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTCallConversation()
	 * @generated
	 */
	int TCALL_CONVERSATION = 14;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CONVERSATION__DOCUMENTATION = TCONVERSATION_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CONVERSATION__EXTENSION_ELEMENTS = TCONVERSATION_NODE__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CONVERSATION__ID = TCONVERSATION_NODE__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CONVERSATION__ANY_ATTRIBUTE = TCONVERSATION_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Participant Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CONVERSATION__PARTICIPANT_REF = TCONVERSATION_NODE__PARTICIPANT_REF;

	/**
	 * The feature id for the '<em><b>Message Flow Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CONVERSATION__MESSAGE_FLOW_REF = TCONVERSATION_NODE__MESSAGE_FLOW_REF;

	/**
	 * The feature id for the '<em><b>Correlation Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CONVERSATION__CORRELATION_KEY = TCONVERSATION_NODE__CORRELATION_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CONVERSATION__NAME = TCONVERSATION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Participant Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CONVERSATION__PARTICIPANT_ASSOCIATION = TCONVERSATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Called Collaboration Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CONVERSATION__CALLED_COLLABORATION_REF = TCONVERSATION_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TCall Conversation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CONVERSATION_FEATURE_COUNT = TCONVERSATION_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TCall Conversation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCALL_CONVERSATION_OPERATION_COUNT = TCONVERSATION_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TEventDefinitionImpl <em>TEvent Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TEventDefinitionImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTEventDefinition()
	 * @generated
	 */
	int TEVENT_DEFINITION = 56;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_DEFINITION__DOCUMENTATION = TROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_DEFINITION__EXTENSION_ELEMENTS = TROOT_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_DEFINITION__ID = TROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_DEFINITION__ANY_ATTRIBUTE = TROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>TEvent Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_DEFINITION_FEATURE_COUNT = TROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TEvent Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_DEFINITION_OPERATION_COUNT = TROOT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TCancelEventDefinitionImpl <em>TCancel Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TCancelEventDefinitionImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTCancelEventDefinition()
	 * @generated
	 */
	int TCANCEL_EVENT_DEFINITION = 15;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCANCEL_EVENT_DEFINITION__DOCUMENTATION = TEVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCANCEL_EVENT_DEFINITION__EXTENSION_ELEMENTS = TEVENT_DEFINITION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCANCEL_EVENT_DEFINITION__ID = TEVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCANCEL_EVENT_DEFINITION__ANY_ATTRIBUTE = TEVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>TCancel Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCANCEL_EVENT_DEFINITION_FEATURE_COUNT = TEVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TCancel Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCANCEL_EVENT_DEFINITION_OPERATION_COUNT = TEVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TCategoryImpl <em>TCategory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TCategoryImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTCategory()
	 * @generated
	 */
	int TCATEGORY = 17;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATEGORY__DOCUMENTATION = TROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATEGORY__EXTENSION_ELEMENTS = TROOT_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATEGORY__ID = TROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATEGORY__ANY_ATTRIBUTE = TROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Category Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATEGORY__CATEGORY_VALUE = TROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATEGORY__NAME = TROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TCategory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATEGORY_FEATURE_COUNT = TROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TCategory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATEGORY_OPERATION_COUNT = TROOT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TCategoryValueImpl <em>TCategory Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TCategoryValueImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTCategoryValue()
	 * @generated
	 */
	int TCATEGORY_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATEGORY_VALUE__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATEGORY_VALUE__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATEGORY_VALUE__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATEGORY_VALUE__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATEGORY_VALUE__VALUE = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TCategory Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATEGORY_VALUE_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TCategory Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCATEGORY_VALUE_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TCollaborationImpl <em>TCollaboration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TCollaborationImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTCollaboration()
	 * @generated
	 */
	int TCOLLABORATION = 22;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLABORATION__DOCUMENTATION = TROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLABORATION__EXTENSION_ELEMENTS = TROOT_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLABORATION__ID = TROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLABORATION__ANY_ATTRIBUTE = TROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLABORATION__PARTICIPANT = TROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Flow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLABORATION__MESSAGE_FLOW = TROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Artifact Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLABORATION__ARTIFACT_GROUP = TROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLABORATION__ARTIFACT = TROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Conversation Node Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLABORATION__CONVERSATION_NODE_GROUP = TROOT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Conversation Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLABORATION__CONVERSATION_NODE = TROOT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Conversation Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLABORATION__CONVERSATION_ASSOCIATION = TROOT_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Participant Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLABORATION__PARTICIPANT_ASSOCIATION = TROOT_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Message Flow Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLABORATION__MESSAGE_FLOW_ASSOCIATION = TROOT_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Correlation Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLABORATION__CORRELATION_KEY = TROOT_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Choreography Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLABORATION__CHOREOGRAPHY_REF = TROOT_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Conversation Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLABORATION__CONVERSATION_LINK = TROOT_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Is Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLABORATION__IS_CLOSED = TROOT_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLABORATION__NAME = TROOT_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>TCollaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLABORATION_FEATURE_COUNT = TROOT_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>TCollaboration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLABORATION_OPERATION_COUNT = TROOT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TChoreographyImpl <em>TChoreography</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TChoreographyImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTChoreography()
	 * @generated
	 */
	int TCHOREOGRAPHY = 19;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY__DOCUMENTATION = TCOLLABORATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY__EXTENSION_ELEMENTS = TCOLLABORATION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY__ID = TCOLLABORATION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY__ANY_ATTRIBUTE = TCOLLABORATION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY__PARTICIPANT = TCOLLABORATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Message Flow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY__MESSAGE_FLOW = TCOLLABORATION__MESSAGE_FLOW;

	/**
	 * The feature id for the '<em><b>Artifact Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY__ARTIFACT_GROUP = TCOLLABORATION__ARTIFACT_GROUP;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY__ARTIFACT = TCOLLABORATION__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Conversation Node Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY__CONVERSATION_NODE_GROUP = TCOLLABORATION__CONVERSATION_NODE_GROUP;

	/**
	 * The feature id for the '<em><b>Conversation Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY__CONVERSATION_NODE = TCOLLABORATION__CONVERSATION_NODE;

	/**
	 * The feature id for the '<em><b>Conversation Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY__CONVERSATION_ASSOCIATION = TCOLLABORATION__CONVERSATION_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Participant Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY__PARTICIPANT_ASSOCIATION = TCOLLABORATION__PARTICIPANT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Message Flow Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY__MESSAGE_FLOW_ASSOCIATION = TCOLLABORATION__MESSAGE_FLOW_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Correlation Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY__CORRELATION_KEY = TCOLLABORATION__CORRELATION_KEY;

	/**
	 * The feature id for the '<em><b>Choreography Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY__CHOREOGRAPHY_REF = TCOLLABORATION__CHOREOGRAPHY_REF;

	/**
	 * The feature id for the '<em><b>Conversation Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY__CONVERSATION_LINK = TCOLLABORATION__CONVERSATION_LINK;

	/**
	 * The feature id for the '<em><b>Is Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY__IS_CLOSED = TCOLLABORATION__IS_CLOSED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY__NAME = TCOLLABORATION__NAME;

	/**
	 * The feature id for the '<em><b>Flow Element Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY__FLOW_ELEMENT_GROUP = TCOLLABORATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flow Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY__FLOW_ELEMENT = TCOLLABORATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TChoreography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_FEATURE_COUNT = TCOLLABORATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TChoreography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_OPERATION_COUNT = TCOLLABORATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TChoreographyTaskImpl <em>TChoreography Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TChoreographyTaskImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTChoreographyTask()
	 * @generated
	 */
	int TCHOREOGRAPHY_TASK = 21;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_TASK__DOCUMENTATION = TCHOREOGRAPHY_ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_TASK__EXTENSION_ELEMENTS = TCHOREOGRAPHY_ACTIVITY__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_TASK__ID = TCHOREOGRAPHY_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_TASK__ANY_ATTRIBUTE = TCHOREOGRAPHY_ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_TASK__AUDITING = TCHOREOGRAPHY_ACTIVITY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_TASK__MONITORING = TCHOREOGRAPHY_ACTIVITY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_TASK__CATEGORY_VALUE_REF = TCHOREOGRAPHY_ACTIVITY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_TASK__NAME = TCHOREOGRAPHY_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_TASK__INCOMING = TCHOREOGRAPHY_ACTIVITY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_TASK__OUTGOING = TCHOREOGRAPHY_ACTIVITY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Participant Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_TASK__PARTICIPANT_REF = TCHOREOGRAPHY_ACTIVITY__PARTICIPANT_REF;

	/**
	 * The feature id for the '<em><b>Correlation Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_TASK__CORRELATION_KEY = TCHOREOGRAPHY_ACTIVITY__CORRELATION_KEY;

	/**
	 * The feature id for the '<em><b>Initiating Participant Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF = TCHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF;

	/**
	 * The feature id for the '<em><b>Loop Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_TASK__LOOP_TYPE = TCHOREOGRAPHY_ACTIVITY__LOOP_TYPE;

	/**
	 * The feature id for the '<em><b>Message Flow Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_TASK__MESSAGE_FLOW_REF = TCHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TChoreography Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_TASK_FEATURE_COUNT = TCHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TChoreography Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHOREOGRAPHY_TASK_OPERATION_COUNT = TCHOREOGRAPHY_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TCompensateEventDefinitionImpl <em>TCompensate Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TCompensateEventDefinitionImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTCompensateEventDefinition()
	 * @generated
	 */
	int TCOMPENSATE_EVENT_DEFINITION = 23;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPENSATE_EVENT_DEFINITION__DOCUMENTATION = TEVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPENSATE_EVENT_DEFINITION__EXTENSION_ELEMENTS = TEVENT_DEFINITION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPENSATE_EVENT_DEFINITION__ID = TEVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPENSATE_EVENT_DEFINITION__ANY_ATTRIBUTE = TEVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Activity Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPENSATE_EVENT_DEFINITION__ACTIVITY_REF = TEVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Wait For Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPENSATE_EVENT_DEFINITION__WAIT_FOR_COMPLETION = TEVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TCompensate Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPENSATE_EVENT_DEFINITION_FEATURE_COUNT = TEVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TCompensate Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPENSATE_EVENT_DEFINITION_OPERATION_COUNT = TEVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TComplexBehaviorDefinitionImpl <em>TComplex Behavior Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TComplexBehaviorDefinitionImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTComplexBehaviorDefinition()
	 * @generated
	 */
	int TCOMPLEX_BEHAVIOR_DEFINITION = 24;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_BEHAVIOR_DEFINITION__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_BEHAVIOR_DEFINITION__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_BEHAVIOR_DEFINITION__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_BEHAVIOR_DEFINITION__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_BEHAVIOR_DEFINITION__CONDITION = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_BEHAVIOR_DEFINITION__EVENT = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TComplex Behavior Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_BEHAVIOR_DEFINITION_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TComplex Behavior Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_BEHAVIOR_DEFINITION_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TGatewayImpl <em>TGateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TGatewayImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTGateway()
	 * @generated
	 */
	int TGATEWAY = 64;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGATEWAY__DOCUMENTATION = TFLOW_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGATEWAY__EXTENSION_ELEMENTS = TFLOW_NODE__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGATEWAY__ID = TFLOW_NODE__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGATEWAY__ANY_ATTRIBUTE = TFLOW_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGATEWAY__AUDITING = TFLOW_NODE__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGATEWAY__MONITORING = TFLOW_NODE__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGATEWAY__CATEGORY_VALUE_REF = TFLOW_NODE__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGATEWAY__NAME = TFLOW_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGATEWAY__INCOMING = TFLOW_NODE__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGATEWAY__OUTGOING = TFLOW_NODE__OUTGOING;

	/**
	 * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGATEWAY__GATEWAY_DIRECTION = TFLOW_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TGateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGATEWAY_FEATURE_COUNT = TFLOW_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TGateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGATEWAY_OPERATION_COUNT = TFLOW_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TComplexGatewayImpl <em>TComplex Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TComplexGatewayImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTComplexGateway()
	 * @generated
	 */
	int TCOMPLEX_GATEWAY = 25;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_GATEWAY__DOCUMENTATION = TGATEWAY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_GATEWAY__EXTENSION_ELEMENTS = TGATEWAY__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_GATEWAY__ID = TGATEWAY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_GATEWAY__ANY_ATTRIBUTE = TGATEWAY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_GATEWAY__AUDITING = TGATEWAY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_GATEWAY__MONITORING = TGATEWAY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_GATEWAY__CATEGORY_VALUE_REF = TGATEWAY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_GATEWAY__NAME = TGATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_GATEWAY__INCOMING = TGATEWAY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_GATEWAY__OUTGOING = TGATEWAY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_GATEWAY__GATEWAY_DIRECTION = TGATEWAY__GATEWAY_DIRECTION;

	/**
	 * The feature id for the '<em><b>Activation Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_GATEWAY__ACTIVATION_CONDITION = TGATEWAY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_GATEWAY__DEFAULT = TGATEWAY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TComplex Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_GATEWAY_FEATURE_COUNT = TGATEWAY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TComplex Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_GATEWAY_OPERATION_COUNT = TGATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TConditionalEventDefinitionImpl <em>TConditional Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TConditionalEventDefinitionImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTConditionalEventDefinition()
	 * @generated
	 */
	int TCONDITIONAL_EVENT_DEFINITION = 26;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL_EVENT_DEFINITION__DOCUMENTATION = TEVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL_EVENT_DEFINITION__EXTENSION_ELEMENTS = TEVENT_DEFINITION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL_EVENT_DEFINITION__ID = TEVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL_EVENT_DEFINITION__ANY_ATTRIBUTE = TEVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL_EVENT_DEFINITION__CONDITION = TEVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TConditional Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL_EVENT_DEFINITION_FEATURE_COUNT = TEVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TConditional Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL_EVENT_DEFINITION_OPERATION_COUNT = TEVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TConversationImpl <em>TConversation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TConversationImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTConversation()
	 * @generated
	 */
	int TCONVERSATION = 27;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION__DOCUMENTATION = TCONVERSATION_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION__EXTENSION_ELEMENTS = TCONVERSATION_NODE__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION__ID = TCONVERSATION_NODE__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION__ANY_ATTRIBUTE = TCONVERSATION_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Participant Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION__PARTICIPANT_REF = TCONVERSATION_NODE__PARTICIPANT_REF;

	/**
	 * The feature id for the '<em><b>Message Flow Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION__MESSAGE_FLOW_REF = TCONVERSATION_NODE__MESSAGE_FLOW_REF;

	/**
	 * The feature id for the '<em><b>Correlation Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION__CORRELATION_KEY = TCONVERSATION_NODE__CORRELATION_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION__NAME = TCONVERSATION_NODE__NAME;

	/**
	 * The number of structural features of the '<em>TConversation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_FEATURE_COUNT = TCONVERSATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TConversation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_OPERATION_COUNT = TCONVERSATION_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TConversationAssociationImpl <em>TConversation Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TConversationAssociationImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTConversationAssociation()
	 * @generated
	 */
	int TCONVERSATION_ASSOCIATION = 28;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_ASSOCIATION__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_ASSOCIATION__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_ASSOCIATION__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_ASSOCIATION__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Inner Conversation Node Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outer Conversation Node Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TConversation Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_ASSOCIATION_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TConversation Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_ASSOCIATION_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TConversationLinkImpl <em>TConversation Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TConversationLinkImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTConversationLink()
	 * @generated
	 */
	int TCONVERSATION_LINK = 29;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_LINK__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_LINK__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_LINK__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_LINK__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_LINK__NAME = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_LINK__SOURCE_REF = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_LINK__TARGET_REF = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TConversation Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_LINK_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TConversation Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONVERSATION_LINK_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TCorrelationKeyImpl <em>TCorrelation Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TCorrelationKeyImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTCorrelationKey()
	 * @generated
	 */
	int TCORRELATION_KEY = 31;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_KEY__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_KEY__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_KEY__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_KEY__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Correlation Property Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_KEY__CORRELATION_PROPERTY_REF = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_KEY__NAME = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TCorrelation Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_KEY_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TCorrelation Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_KEY_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TCorrelationPropertyImpl <em>TCorrelation Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TCorrelationPropertyImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTCorrelationProperty()
	 * @generated
	 */
	int TCORRELATION_PROPERTY = 32;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY__DOCUMENTATION = TROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY__EXTENSION_ELEMENTS = TROOT_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY__ID = TROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY__ANY_ATTRIBUTE = TROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Correlation Property Retrieval Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY__CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION = TROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY__NAME = TROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY__TYPE = TROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TCorrelation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY_FEATURE_COUNT = TROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TCorrelation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY_OPERATION_COUNT = TROOT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TCorrelationPropertyBindingImpl <em>TCorrelation Property Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TCorrelationPropertyBindingImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTCorrelationPropertyBinding()
	 * @generated
	 */
	int TCORRELATION_PROPERTY_BINDING = 33;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY_BINDING__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY_BINDING__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY_BINDING__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY_BINDING__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Data Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY_BINDING__DATA_PATH = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correlation Property Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TCorrelation Property Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY_BINDING_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TCorrelation Property Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY_BINDING_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TCorrelationPropertyRetrievalExpressionImpl <em>TCorrelation Property Retrieval Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TCorrelationPropertyRetrievalExpressionImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTCorrelationPropertyRetrievalExpression()
	 * @generated
	 */
	int TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION = 34;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Message Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TCorrelation Property Retrieval Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TCorrelation Property Retrieval Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_PROPERTY_RETRIEVAL_EXPRESSION_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TCorrelationSubscriptionImpl <em>TCorrelation Subscription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TCorrelationSubscriptionImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTCorrelationSubscription()
	 * @generated
	 */
	int TCORRELATION_SUBSCRIPTION = 35;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_SUBSCRIPTION__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_SUBSCRIPTION__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_SUBSCRIPTION__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_SUBSCRIPTION__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Correlation Property Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correlation Key Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TCorrelation Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_SUBSCRIPTION_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TCorrelation Subscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCORRELATION_SUBSCRIPTION_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TDataAssociationImpl <em>TData Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TDataAssociationImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTDataAssociation()
	 * @generated
	 */
	int TDATA_ASSOCIATION = 36;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_ASSOCIATION__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_ASSOCIATION__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_ASSOCIATION__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_ASSOCIATION__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_ASSOCIATION__SOURCE_REF = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_ASSOCIATION__TARGET_REF = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_ASSOCIATION__TRANSFORMATION = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_ASSOCIATION__ASSIGNMENT = TBASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TData Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_ASSOCIATION_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TData Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_ASSOCIATION_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TDataInputImpl <em>TData Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TDataInputImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTDataInput()
	 * @generated
	 */
	int TDATA_INPUT = 37;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_INPUT__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_INPUT__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_INPUT__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_INPUT__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_INPUT__DATA_STATE = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_INPUT__IS_COLLECTION = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Item Subject Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_INPUT__ITEM_SUBJECT_REF = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_INPUT__NAME = TBASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TData Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_INPUT_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TData Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_INPUT_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TDataInputAssociationImpl <em>TData Input Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TDataInputAssociationImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTDataInputAssociation()
	 * @generated
	 */
	int TDATA_INPUT_ASSOCIATION = 38;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_INPUT_ASSOCIATION__DOCUMENTATION = TDATA_ASSOCIATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_INPUT_ASSOCIATION__EXTENSION_ELEMENTS = TDATA_ASSOCIATION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_INPUT_ASSOCIATION__ID = TDATA_ASSOCIATION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_INPUT_ASSOCIATION__ANY_ATTRIBUTE = TDATA_ASSOCIATION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_INPUT_ASSOCIATION__SOURCE_REF = TDATA_ASSOCIATION__SOURCE_REF;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_INPUT_ASSOCIATION__TARGET_REF = TDATA_ASSOCIATION__TARGET_REF;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_INPUT_ASSOCIATION__TRANSFORMATION = TDATA_ASSOCIATION__TRANSFORMATION;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_INPUT_ASSOCIATION__ASSIGNMENT = TDATA_ASSOCIATION__ASSIGNMENT;

	/**
	 * The number of structural features of the '<em>TData Input Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_INPUT_ASSOCIATION_FEATURE_COUNT = TDATA_ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TData Input Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_INPUT_ASSOCIATION_OPERATION_COUNT = TDATA_ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TDataObjectImpl <em>TData Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TDataObjectImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTDataObject()
	 * @generated
	 */
	int TDATA_OBJECT = 39;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT__DOCUMENTATION = TFLOW_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT__EXTENSION_ELEMENTS = TFLOW_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT__ID = TFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT__ANY_ATTRIBUTE = TFLOW_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT__AUDITING = TFLOW_ELEMENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT__MONITORING = TFLOW_ELEMENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT__CATEGORY_VALUE_REF = TFLOW_ELEMENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT__NAME = TFLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT__DATA_STATE = TFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT__IS_COLLECTION = TFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Item Subject Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT__ITEM_SUBJECT_REF = TFLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TData Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT_FEATURE_COUNT = TFLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TData Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT_OPERATION_COUNT = TFLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TDataObjectReferenceImpl <em>TData Object Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TDataObjectReferenceImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTDataObjectReference()
	 * @generated
	 */
	int TDATA_OBJECT_REFERENCE = 40;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT_REFERENCE__DOCUMENTATION = TFLOW_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT_REFERENCE__EXTENSION_ELEMENTS = TFLOW_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT_REFERENCE__ID = TFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT_REFERENCE__ANY_ATTRIBUTE = TFLOW_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT_REFERENCE__AUDITING = TFLOW_ELEMENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT_REFERENCE__MONITORING = TFLOW_ELEMENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT_REFERENCE__CATEGORY_VALUE_REF = TFLOW_ELEMENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT_REFERENCE__NAME = TFLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT_REFERENCE__DATA_STATE = TFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Object Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT_REFERENCE__DATA_OBJECT_REF = TFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Item Subject Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF = TFLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TData Object Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT_REFERENCE_FEATURE_COUNT = TFLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TData Object Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OBJECT_REFERENCE_OPERATION_COUNT = TFLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TDataOutputImpl <em>TData Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TDataOutputImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTDataOutput()
	 * @generated
	 */
	int TDATA_OUTPUT = 41;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OUTPUT__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OUTPUT__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OUTPUT__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OUTPUT__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OUTPUT__DATA_STATE = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OUTPUT__IS_COLLECTION = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Item Subject Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OUTPUT__ITEM_SUBJECT_REF = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OUTPUT__NAME = TBASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TData Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OUTPUT_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TData Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OUTPUT_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TDataOutputAssociationImpl <em>TData Output Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TDataOutputAssociationImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTDataOutputAssociation()
	 * @generated
	 */
	int TDATA_OUTPUT_ASSOCIATION = 42;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OUTPUT_ASSOCIATION__DOCUMENTATION = TDATA_ASSOCIATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OUTPUT_ASSOCIATION__EXTENSION_ELEMENTS = TDATA_ASSOCIATION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OUTPUT_ASSOCIATION__ID = TDATA_ASSOCIATION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OUTPUT_ASSOCIATION__ANY_ATTRIBUTE = TDATA_ASSOCIATION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OUTPUT_ASSOCIATION__SOURCE_REF = TDATA_ASSOCIATION__SOURCE_REF;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OUTPUT_ASSOCIATION__TARGET_REF = TDATA_ASSOCIATION__TARGET_REF;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OUTPUT_ASSOCIATION__TRANSFORMATION = TDATA_ASSOCIATION__TRANSFORMATION;

	/**
	 * The feature id for the '<em><b>Assignment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OUTPUT_ASSOCIATION__ASSIGNMENT = TDATA_ASSOCIATION__ASSIGNMENT;

	/**
	 * The number of structural features of the '<em>TData Output Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OUTPUT_ASSOCIATION_FEATURE_COUNT = TDATA_ASSOCIATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TData Output Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_OUTPUT_ASSOCIATION_OPERATION_COUNT = TDATA_ASSOCIATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TDataStateImpl <em>TData State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TDataStateImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTDataState()
	 * @generated
	 */
	int TDATA_STATE = 43;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STATE__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STATE__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STATE__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STATE__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STATE__NAME = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TData State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STATE_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TData State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STATE_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TDataStoreImpl <em>TData Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TDataStoreImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTDataStore()
	 * @generated
	 */
	int TDATA_STORE = 44;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE__DOCUMENTATION = TROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE__EXTENSION_ELEMENTS = TROOT_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE__ID = TROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE__ANY_ATTRIBUTE = TROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE__DATA_STATE = TROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE__CAPACITY = TROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Unlimited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE__IS_UNLIMITED = TROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Item Subject Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE__ITEM_SUBJECT_REF = TROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE__NAME = TROOT_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TData Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE_FEATURE_COUNT = TROOT_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TData Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE_OPERATION_COUNT = TROOT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TDataStoreReferenceImpl <em>TData Store Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TDataStoreReferenceImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTDataStoreReference()
	 * @generated
	 */
	int TDATA_STORE_REFERENCE = 45;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE_REFERENCE__DOCUMENTATION = TFLOW_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE_REFERENCE__EXTENSION_ELEMENTS = TFLOW_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE_REFERENCE__ID = TFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE_REFERENCE__ANY_ATTRIBUTE = TFLOW_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE_REFERENCE__AUDITING = TFLOW_ELEMENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE_REFERENCE__MONITORING = TFLOW_ELEMENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE_REFERENCE__CATEGORY_VALUE_REF = TFLOW_ELEMENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE_REFERENCE__NAME = TFLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE_REFERENCE__DATA_STATE = TFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Store Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE_REFERENCE__DATA_STORE_REF = TFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Item Subject Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE_REFERENCE__ITEM_SUBJECT_REF = TFLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TData Store Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE_REFERENCE_FEATURE_COUNT = TFLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TData Store Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_STORE_REFERENCE_OPERATION_COUNT = TFLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TDefinitionsImpl <em>TDefinitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TDefinitionsImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTDefinitions()
	 * @generated
	 */
	int TDEFINITIONS = 46;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__IMPORT = 0;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__EXTENSION = 1;

	/**
	 * The feature id for the '<em><b>Root Element Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ROOT_ELEMENT_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Root Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ROOT_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>BPMN Diagram</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__BPMN_DIAGRAM = 4;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__RELATIONSHIP = 5;

	/**
	 * The feature id for the '<em><b>Exporter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__EXPORTER = 6;

	/**
	 * The feature id for the '<em><b>Exporter Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__EXPORTER_VERSION = 7;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__EXPRESSION_LANGUAGE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ID = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__NAME = 10;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__TARGET_NAMESPACE = 11;

	/**
	 * The feature id for the '<em><b>Type Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__TYPE_LANGUAGE = 12;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ANY_ATTRIBUTE = 13;

	/**
	 * The number of structural features of the '<em>TDefinitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>TDefinitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TDocumentationImpl <em>TDocumentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TDocumentationImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTDocumentation()
	 * @generated
	 */
	int TDOCUMENTATION = 47;

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
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TThrowEventImpl <em>TThrow Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TThrowEventImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTThrowEvent()
	 * @generated
	 */
	int TTHROW_EVENT = 132;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTHROW_EVENT__DOCUMENTATION = TEVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTHROW_EVENT__EXTENSION_ELEMENTS = TEVENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTHROW_EVENT__ID = TEVENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTHROW_EVENT__ANY_ATTRIBUTE = TEVENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTHROW_EVENT__AUDITING = TEVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTHROW_EVENT__MONITORING = TEVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTHROW_EVENT__CATEGORY_VALUE_REF = TEVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTHROW_EVENT__NAME = TEVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTHROW_EVENT__INCOMING = TEVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTHROW_EVENT__OUTGOING = TEVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTHROW_EVENT__PROPERTY = TEVENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Data Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTHROW_EVENT__DATA_INPUT = TEVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTHROW_EVENT__DATA_INPUT_ASSOCIATION = TEVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTHROW_EVENT__INPUT_SET = TEVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event Definition Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTHROW_EVENT__EVENT_DEFINITION_GROUP = TEVENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Event Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTHROW_EVENT__EVENT_DEFINITION = TEVENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Event Definition Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTHROW_EVENT__EVENT_DEFINITION_REF = TEVENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>TThrow Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTHROW_EVENT_FEATURE_COUNT = TEVENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>TThrow Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTHROW_EVENT_OPERATION_COUNT = TEVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TEndEventImpl <em>TEnd Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TEndEventImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTEndEvent()
	 * @generated
	 */
	int TEND_EVENT = 48;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_EVENT__DOCUMENTATION = TTHROW_EVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_EVENT__EXTENSION_ELEMENTS = TTHROW_EVENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_EVENT__ID = TTHROW_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_EVENT__ANY_ATTRIBUTE = TTHROW_EVENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_EVENT__AUDITING = TTHROW_EVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_EVENT__MONITORING = TTHROW_EVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_EVENT__CATEGORY_VALUE_REF = TTHROW_EVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_EVENT__NAME = TTHROW_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_EVENT__INCOMING = TTHROW_EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_EVENT__OUTGOING = TTHROW_EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_EVENT__PROPERTY = TTHROW_EVENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Data Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_EVENT__DATA_INPUT = TTHROW_EVENT__DATA_INPUT;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_EVENT__DATA_INPUT_ASSOCIATION = TTHROW_EVENT__DATA_INPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Input Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_EVENT__INPUT_SET = TTHROW_EVENT__INPUT_SET;

	/**
	 * The feature id for the '<em><b>Event Definition Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_EVENT__EVENT_DEFINITION_GROUP = TTHROW_EVENT__EVENT_DEFINITION_GROUP;

	/**
	 * The feature id for the '<em><b>Event Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_EVENT__EVENT_DEFINITION = TTHROW_EVENT__EVENT_DEFINITION;

	/**
	 * The feature id for the '<em><b>Event Definition Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_EVENT__EVENT_DEFINITION_REF = TTHROW_EVENT__EVENT_DEFINITION_REF;

	/**
	 * The number of structural features of the '<em>TEnd Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_EVENT_FEATURE_COUNT = TTHROW_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TEnd Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_EVENT_OPERATION_COUNT = TTHROW_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TEndPointImpl <em>TEnd Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TEndPointImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTEndPoint()
	 * @generated
	 */
	int TEND_POINT = 49;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_POINT__DOCUMENTATION = TROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_POINT__EXTENSION_ELEMENTS = TROOT_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_POINT__ID = TROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_POINT__ANY_ATTRIBUTE = TROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>TEnd Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_POINT_FEATURE_COUNT = TROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TEnd Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEND_POINT_OPERATION_COUNT = TROOT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TErrorImpl <em>TError</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TErrorImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTError()
	 * @generated
	 */
	int TERROR = 50;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERROR__DOCUMENTATION = TROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERROR__EXTENSION_ELEMENTS = TROOT_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERROR__ID = TROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERROR__ANY_ATTRIBUTE = TROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERROR__ERROR_CODE = TROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERROR__NAME = TROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Structure Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERROR__STRUCTURE_REF = TROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TError</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERROR_FEATURE_COUNT = TROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TError</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERROR_OPERATION_COUNT = TROOT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TErrorEventDefinitionImpl <em>TError Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TErrorEventDefinitionImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTErrorEventDefinition()
	 * @generated
	 */
	int TERROR_EVENT_DEFINITION = 51;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERROR_EVENT_DEFINITION__DOCUMENTATION = TEVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERROR_EVENT_DEFINITION__EXTENSION_ELEMENTS = TEVENT_DEFINITION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERROR_EVENT_DEFINITION__ID = TEVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERROR_EVENT_DEFINITION__ANY_ATTRIBUTE = TEVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Error Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERROR_EVENT_DEFINITION__ERROR_REF = TEVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TError Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERROR_EVENT_DEFINITION_FEATURE_COUNT = TEVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TError Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERROR_EVENT_DEFINITION_OPERATION_COUNT = TEVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TEscalationImpl <em>TEscalation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TEscalationImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTEscalation()
	 * @generated
	 */
	int TESCALATION = 52;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESCALATION__DOCUMENTATION = TROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESCALATION__EXTENSION_ELEMENTS = TROOT_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESCALATION__ID = TROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESCALATION__ANY_ATTRIBUTE = TROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Escalation Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESCALATION__ESCALATION_CODE = TROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESCALATION__NAME = TROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Structure Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESCALATION__STRUCTURE_REF = TROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TEscalation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESCALATION_FEATURE_COUNT = TROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TEscalation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESCALATION_OPERATION_COUNT = TROOT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TEscalationEventDefinitionImpl <em>TEscalation Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TEscalationEventDefinitionImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTEscalationEventDefinition()
	 * @generated
	 */
	int TESCALATION_EVENT_DEFINITION = 53;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESCALATION_EVENT_DEFINITION__DOCUMENTATION = TEVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESCALATION_EVENT_DEFINITION__EXTENSION_ELEMENTS = TEVENT_DEFINITION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESCALATION_EVENT_DEFINITION__ID = TEVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESCALATION_EVENT_DEFINITION__ANY_ATTRIBUTE = TEVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Escalation Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESCALATION_EVENT_DEFINITION__ESCALATION_REF = TEVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TEscalation Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESCALATION_EVENT_DEFINITION_FEATURE_COUNT = TEVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TEscalation Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESCALATION_EVENT_DEFINITION_OPERATION_COUNT = TEVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TEventBasedGatewayImpl <em>TEvent Based Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TEventBasedGatewayImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTEventBasedGateway()
	 * @generated
	 */
	int TEVENT_BASED_GATEWAY = 55;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_BASED_GATEWAY__DOCUMENTATION = TGATEWAY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_BASED_GATEWAY__EXTENSION_ELEMENTS = TGATEWAY__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_BASED_GATEWAY__ID = TGATEWAY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_BASED_GATEWAY__ANY_ATTRIBUTE = TGATEWAY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_BASED_GATEWAY__AUDITING = TGATEWAY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_BASED_GATEWAY__MONITORING = TGATEWAY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_BASED_GATEWAY__CATEGORY_VALUE_REF = TGATEWAY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_BASED_GATEWAY__NAME = TGATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_BASED_GATEWAY__INCOMING = TGATEWAY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_BASED_GATEWAY__OUTGOING = TGATEWAY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_BASED_GATEWAY__GATEWAY_DIRECTION = TGATEWAY__GATEWAY_DIRECTION;

	/**
	 * The feature id for the '<em><b>Event Gateway Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE = TGATEWAY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instantiate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_BASED_GATEWAY__INSTANTIATE = TGATEWAY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TEvent Based Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_BASED_GATEWAY_FEATURE_COUNT = TGATEWAY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TEvent Based Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEVENT_BASED_GATEWAY_OPERATION_COUNT = TGATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TExclusiveGatewayImpl <em>TExclusive Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TExclusiveGatewayImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTExclusiveGateway()
	 * @generated
	 */
	int TEXCLUSIVE_GATEWAY = 57;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCLUSIVE_GATEWAY__DOCUMENTATION = TGATEWAY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCLUSIVE_GATEWAY__EXTENSION_ELEMENTS = TGATEWAY__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCLUSIVE_GATEWAY__ID = TGATEWAY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCLUSIVE_GATEWAY__ANY_ATTRIBUTE = TGATEWAY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCLUSIVE_GATEWAY__AUDITING = TGATEWAY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCLUSIVE_GATEWAY__MONITORING = TGATEWAY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCLUSIVE_GATEWAY__CATEGORY_VALUE_REF = TGATEWAY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCLUSIVE_GATEWAY__NAME = TGATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCLUSIVE_GATEWAY__INCOMING = TGATEWAY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCLUSIVE_GATEWAY__OUTGOING = TGATEWAY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCLUSIVE_GATEWAY__GATEWAY_DIRECTION = TGATEWAY__GATEWAY_DIRECTION;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCLUSIVE_GATEWAY__DEFAULT = TGATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TExclusive Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCLUSIVE_GATEWAY_FEATURE_COUNT = TGATEWAY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TExclusive Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXCLUSIVE_GATEWAY_OPERATION_COUNT = TGATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TExpressionImpl <em>TExpression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TExpressionImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTExpression()
	 * @generated
	 */
	int TEXPRESSION = 58;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPRESSION__MIXED = TBASE_ELEMENT_WITH_MIXED_CONTENT__MIXED;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPRESSION__DOCUMENTATION = TBASE_ELEMENT_WITH_MIXED_CONTENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPRESSION__EXTENSION_ELEMENTS = TBASE_ELEMENT_WITH_MIXED_CONTENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPRESSION__ID = TBASE_ELEMENT_WITH_MIXED_CONTENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPRESSION__ANY_ATTRIBUTE = TBASE_ELEMENT_WITH_MIXED_CONTENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>TExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPRESSION_FEATURE_COUNT = TBASE_ELEMENT_WITH_MIXED_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPRESSION_OPERATION_COUNT = TBASE_ELEMENT_WITH_MIXED_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TExtensionImpl <em>TExtension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TExtensionImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTExtension()
	 * @generated
	 */
	int TEXTENSION = 59;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION__DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION__DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Must Understand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION__MUST_UNDERSTAND = 2;

	/**
	 * The number of structural features of the '<em>TExtension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TExtension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TExtensionElementsImpl <em>TExtension Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TExtensionElementsImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTExtensionElements()
	 * @generated
	 */
	int TEXTENSION_ELEMENTS = 60;

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
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TFormalExpressionImpl <em>TFormal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TFormalExpressionImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTFormalExpression()
	 * @generated
	 */
	int TFORMAL_EXPRESSION = 63;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFORMAL_EXPRESSION__MIXED = TEXPRESSION__MIXED;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFORMAL_EXPRESSION__DOCUMENTATION = TEXPRESSION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFORMAL_EXPRESSION__EXTENSION_ELEMENTS = TEXPRESSION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFORMAL_EXPRESSION__ID = TEXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFORMAL_EXPRESSION__ANY_ATTRIBUTE = TEXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Evaluates To Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFORMAL_EXPRESSION__EVALUATES_TO_TYPE_REF = TEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFORMAL_EXPRESSION__LANGUAGE = TEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TFormal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFORMAL_EXPRESSION_FEATURE_COUNT = TEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TFormal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFORMAL_EXPRESSION_OPERATION_COUNT = TEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TGlobalTaskImpl <em>TGlobal Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TGlobalTaskImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTGlobalTask()
	 * @generated
	 */
	int TGLOBAL_TASK = 70;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_TASK__DOCUMENTATION = TCALLABLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_TASK__EXTENSION_ELEMENTS = TCALLABLE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_TASK__ID = TCALLABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_TASK__ANY_ATTRIBUTE = TCALLABLE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Supported Interface Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_TASK__SUPPORTED_INTERFACE_REF = TCALLABLE_ELEMENT__SUPPORTED_INTERFACE_REF;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_TASK__IO_SPECIFICATION = TCALLABLE_ELEMENT__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_TASK__IO_BINDING = TCALLABLE_ELEMENT__IO_BINDING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_TASK__NAME = TCALLABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Resource Role Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_TASK__RESOURCE_ROLE_GROUP = TCALLABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_TASK__RESOURCE_ROLE = TCALLABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TGlobal Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_TASK_FEATURE_COUNT = TCALLABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TGlobal Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_TASK_OPERATION_COUNT = TCALLABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TGlobalBusinessRuleTaskImpl <em>TGlobal Business Rule Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TGlobalBusinessRuleTaskImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTGlobalBusinessRuleTask()
	 * @generated
	 */
	int TGLOBAL_BUSINESS_RULE_TASK = 65;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_BUSINESS_RULE_TASK__DOCUMENTATION = TGLOBAL_TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_BUSINESS_RULE_TASK__EXTENSION_ELEMENTS = TGLOBAL_TASK__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_BUSINESS_RULE_TASK__ID = TGLOBAL_TASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_BUSINESS_RULE_TASK__ANY_ATTRIBUTE = TGLOBAL_TASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Supported Interface Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_BUSINESS_RULE_TASK__SUPPORTED_INTERFACE_REF = TGLOBAL_TASK__SUPPORTED_INTERFACE_REF;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_BUSINESS_RULE_TASK__IO_SPECIFICATION = TGLOBAL_TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_BUSINESS_RULE_TASK__IO_BINDING = TGLOBAL_TASK__IO_BINDING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_BUSINESS_RULE_TASK__NAME = TGLOBAL_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Resource Role Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_BUSINESS_RULE_TASK__RESOURCE_ROLE_GROUP = TGLOBAL_TASK__RESOURCE_ROLE_GROUP;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_BUSINESS_RULE_TASK__RESOURCE_ROLE = TGLOBAL_TASK__RESOURCE_ROLE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_BUSINESS_RULE_TASK__IMPLEMENTATION = TGLOBAL_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TGlobal Business Rule Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_BUSINESS_RULE_TASK_FEATURE_COUNT = TGLOBAL_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TGlobal Business Rule Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_BUSINESS_RULE_TASK_OPERATION_COUNT = TGLOBAL_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TGlobalChoreographyTaskImpl <em>TGlobal Choreography Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TGlobalChoreographyTaskImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTGlobalChoreographyTask()
	 * @generated
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK = 66;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK__DOCUMENTATION = TCHOREOGRAPHY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK__EXTENSION_ELEMENTS = TCHOREOGRAPHY__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK__ID = TCHOREOGRAPHY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK__ANY_ATTRIBUTE = TCHOREOGRAPHY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK__PARTICIPANT = TCHOREOGRAPHY__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Message Flow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK__MESSAGE_FLOW = TCHOREOGRAPHY__MESSAGE_FLOW;

	/**
	 * The feature id for the '<em><b>Artifact Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK__ARTIFACT_GROUP = TCHOREOGRAPHY__ARTIFACT_GROUP;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK__ARTIFACT = TCHOREOGRAPHY__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Conversation Node Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK__CONVERSATION_NODE_GROUP = TCHOREOGRAPHY__CONVERSATION_NODE_GROUP;

	/**
	 * The feature id for the '<em><b>Conversation Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK__CONVERSATION_NODE = TCHOREOGRAPHY__CONVERSATION_NODE;

	/**
	 * The feature id for the '<em><b>Conversation Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK__CONVERSATION_ASSOCIATION = TCHOREOGRAPHY__CONVERSATION_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Participant Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK__PARTICIPANT_ASSOCIATION = TCHOREOGRAPHY__PARTICIPANT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Message Flow Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK__MESSAGE_FLOW_ASSOCIATION = TCHOREOGRAPHY__MESSAGE_FLOW_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Correlation Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK__CORRELATION_KEY = TCHOREOGRAPHY__CORRELATION_KEY;

	/**
	 * The feature id for the '<em><b>Choreography Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK__CHOREOGRAPHY_REF = TCHOREOGRAPHY__CHOREOGRAPHY_REF;

	/**
	 * The feature id for the '<em><b>Conversation Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK__CONVERSATION_LINK = TCHOREOGRAPHY__CONVERSATION_LINK;

	/**
	 * The feature id for the '<em><b>Is Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK__IS_CLOSED = TCHOREOGRAPHY__IS_CLOSED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK__NAME = TCHOREOGRAPHY__NAME;

	/**
	 * The feature id for the '<em><b>Flow Element Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK__FLOW_ELEMENT_GROUP = TCHOREOGRAPHY__FLOW_ELEMENT_GROUP;

	/**
	 * The feature id for the '<em><b>Flow Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK__FLOW_ELEMENT = TCHOREOGRAPHY__FLOW_ELEMENT;

	/**
	 * The feature id for the '<em><b>Initiating Participant Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK__INITIATING_PARTICIPANT_REF = TCHOREOGRAPHY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TGlobal Choreography Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK_FEATURE_COUNT = TCHOREOGRAPHY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TGlobal Choreography Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CHOREOGRAPHY_TASK_OPERATION_COUNT = TCHOREOGRAPHY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TGlobalConversationImpl <em>TGlobal Conversation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TGlobalConversationImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTGlobalConversation()
	 * @generated
	 */
	int TGLOBAL_CONVERSATION = 67;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CONVERSATION__DOCUMENTATION = TCOLLABORATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CONVERSATION__EXTENSION_ELEMENTS = TCOLLABORATION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CONVERSATION__ID = TCOLLABORATION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CONVERSATION__ANY_ATTRIBUTE = TCOLLABORATION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CONVERSATION__PARTICIPANT = TCOLLABORATION__PARTICIPANT;

	/**
	 * The feature id for the '<em><b>Message Flow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CONVERSATION__MESSAGE_FLOW = TCOLLABORATION__MESSAGE_FLOW;

	/**
	 * The feature id for the '<em><b>Artifact Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CONVERSATION__ARTIFACT_GROUP = TCOLLABORATION__ARTIFACT_GROUP;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CONVERSATION__ARTIFACT = TCOLLABORATION__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Conversation Node Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CONVERSATION__CONVERSATION_NODE_GROUP = TCOLLABORATION__CONVERSATION_NODE_GROUP;

	/**
	 * The feature id for the '<em><b>Conversation Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CONVERSATION__CONVERSATION_NODE = TCOLLABORATION__CONVERSATION_NODE;

	/**
	 * The feature id for the '<em><b>Conversation Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CONVERSATION__CONVERSATION_ASSOCIATION = TCOLLABORATION__CONVERSATION_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Participant Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CONVERSATION__PARTICIPANT_ASSOCIATION = TCOLLABORATION__PARTICIPANT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Message Flow Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CONVERSATION__MESSAGE_FLOW_ASSOCIATION = TCOLLABORATION__MESSAGE_FLOW_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Correlation Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CONVERSATION__CORRELATION_KEY = TCOLLABORATION__CORRELATION_KEY;

	/**
	 * The feature id for the '<em><b>Choreography Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CONVERSATION__CHOREOGRAPHY_REF = TCOLLABORATION__CHOREOGRAPHY_REF;

	/**
	 * The feature id for the '<em><b>Conversation Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CONVERSATION__CONVERSATION_LINK = TCOLLABORATION__CONVERSATION_LINK;

	/**
	 * The feature id for the '<em><b>Is Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CONVERSATION__IS_CLOSED = TCOLLABORATION__IS_CLOSED;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CONVERSATION__NAME = TCOLLABORATION__NAME;

	/**
	 * The number of structural features of the '<em>TGlobal Conversation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CONVERSATION_FEATURE_COUNT = TCOLLABORATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TGlobal Conversation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_CONVERSATION_OPERATION_COUNT = TCOLLABORATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TGlobalManualTaskImpl <em>TGlobal Manual Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TGlobalManualTaskImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTGlobalManualTask()
	 * @generated
	 */
	int TGLOBAL_MANUAL_TASK = 68;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_MANUAL_TASK__DOCUMENTATION = TGLOBAL_TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_MANUAL_TASK__EXTENSION_ELEMENTS = TGLOBAL_TASK__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_MANUAL_TASK__ID = TGLOBAL_TASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_MANUAL_TASK__ANY_ATTRIBUTE = TGLOBAL_TASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Supported Interface Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_MANUAL_TASK__SUPPORTED_INTERFACE_REF = TGLOBAL_TASK__SUPPORTED_INTERFACE_REF;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_MANUAL_TASK__IO_SPECIFICATION = TGLOBAL_TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_MANUAL_TASK__IO_BINDING = TGLOBAL_TASK__IO_BINDING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_MANUAL_TASK__NAME = TGLOBAL_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Resource Role Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_MANUAL_TASK__RESOURCE_ROLE_GROUP = TGLOBAL_TASK__RESOURCE_ROLE_GROUP;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_MANUAL_TASK__RESOURCE_ROLE = TGLOBAL_TASK__RESOURCE_ROLE;

	/**
	 * The number of structural features of the '<em>TGlobal Manual Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_MANUAL_TASK_FEATURE_COUNT = TGLOBAL_TASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TGlobal Manual Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_MANUAL_TASK_OPERATION_COUNT = TGLOBAL_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TGlobalScriptTaskImpl <em>TGlobal Script Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TGlobalScriptTaskImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTGlobalScriptTask()
	 * @generated
	 */
	int TGLOBAL_SCRIPT_TASK = 69;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_SCRIPT_TASK__DOCUMENTATION = TGLOBAL_TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_SCRIPT_TASK__EXTENSION_ELEMENTS = TGLOBAL_TASK__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_SCRIPT_TASK__ID = TGLOBAL_TASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_SCRIPT_TASK__ANY_ATTRIBUTE = TGLOBAL_TASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Supported Interface Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_SCRIPT_TASK__SUPPORTED_INTERFACE_REF = TGLOBAL_TASK__SUPPORTED_INTERFACE_REF;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_SCRIPT_TASK__IO_SPECIFICATION = TGLOBAL_TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_SCRIPT_TASK__IO_BINDING = TGLOBAL_TASK__IO_BINDING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_SCRIPT_TASK__NAME = TGLOBAL_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Resource Role Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_SCRIPT_TASK__RESOURCE_ROLE_GROUP = TGLOBAL_TASK__RESOURCE_ROLE_GROUP;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_SCRIPT_TASK__RESOURCE_ROLE = TGLOBAL_TASK__RESOURCE_ROLE;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_SCRIPT_TASK__SCRIPT = TGLOBAL_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_SCRIPT_TASK__SCRIPT_LANGUAGE = TGLOBAL_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TGlobal Script Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_SCRIPT_TASK_FEATURE_COUNT = TGLOBAL_TASK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TGlobal Script Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_SCRIPT_TASK_OPERATION_COUNT = TGLOBAL_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TGlobalUserTaskImpl <em>TGlobal User Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TGlobalUserTaskImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTGlobalUserTask()
	 * @generated
	 */
	int TGLOBAL_USER_TASK = 71;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_USER_TASK__DOCUMENTATION = TGLOBAL_TASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_USER_TASK__EXTENSION_ELEMENTS = TGLOBAL_TASK__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_USER_TASK__ID = TGLOBAL_TASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_USER_TASK__ANY_ATTRIBUTE = TGLOBAL_TASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Supported Interface Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_USER_TASK__SUPPORTED_INTERFACE_REF = TGLOBAL_TASK__SUPPORTED_INTERFACE_REF;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_USER_TASK__IO_SPECIFICATION = TGLOBAL_TASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_USER_TASK__IO_BINDING = TGLOBAL_TASK__IO_BINDING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_USER_TASK__NAME = TGLOBAL_TASK__NAME;

	/**
	 * The feature id for the '<em><b>Resource Role Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_USER_TASK__RESOURCE_ROLE_GROUP = TGLOBAL_TASK__RESOURCE_ROLE_GROUP;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_USER_TASK__RESOURCE_ROLE = TGLOBAL_TASK__RESOURCE_ROLE;

	/**
	 * The feature id for the '<em><b>Rendering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_USER_TASK__RENDERING = TGLOBAL_TASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_USER_TASK__IMPLEMENTATION = TGLOBAL_TASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TGlobal User Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_USER_TASK_FEATURE_COUNT = TGLOBAL_TASK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TGlobal User Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGLOBAL_USER_TASK_OPERATION_COUNT = TGLOBAL_TASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TGroupImpl <em>TGroup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TGroupImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTGroup()
	 * @generated
	 */
	int TGROUP = 72;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP__DOCUMENTATION = TARTIFACT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP__EXTENSION_ELEMENTS = TARTIFACT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP__ID = TARTIFACT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP__ANY_ATTRIBUTE = TARTIFACT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP__CATEGORY_VALUE_REF = TARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TGroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_FEATURE_COUNT = TARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TGroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_OPERATION_COUNT = TARTIFACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TResourceRoleImpl <em>TResource Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TResourceRoleImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTResourceRole()
	 * @generated
	 */
	int TRESOURCE_ROLE = 114;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_ROLE__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_ROLE__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_ROLE__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_ROLE__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_ROLE__RESOURCE_REF = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Parameter Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_ROLE__RESOURCE_PARAMETER_BINDING = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Assignment Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_ROLE__NAME = TBASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TResource Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_ROLE_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TResource Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_ROLE_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TPerformerImpl <em>TPerformer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TPerformerImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTPerformer()
	 * @generated
	 */
	int TPERFORMER = 103;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPERFORMER__DOCUMENTATION = TRESOURCE_ROLE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPERFORMER__EXTENSION_ELEMENTS = TRESOURCE_ROLE__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPERFORMER__ID = TRESOURCE_ROLE__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPERFORMER__ANY_ATTRIBUTE = TRESOURCE_ROLE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPERFORMER__RESOURCE_REF = TRESOURCE_ROLE__RESOURCE_REF;

	/**
	 * The feature id for the '<em><b>Resource Parameter Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPERFORMER__RESOURCE_PARAMETER_BINDING = TRESOURCE_ROLE__RESOURCE_PARAMETER_BINDING;

	/**
	 * The feature id for the '<em><b>Resource Assignment Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPERFORMER__RESOURCE_ASSIGNMENT_EXPRESSION = TRESOURCE_ROLE__RESOURCE_ASSIGNMENT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPERFORMER__NAME = TRESOURCE_ROLE__NAME;

	/**
	 * The number of structural features of the '<em>TPerformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPERFORMER_FEATURE_COUNT = TRESOURCE_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TPerformer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPERFORMER_OPERATION_COUNT = TRESOURCE_ROLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.THumanPerformerImpl <em>THuman Performer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.THumanPerformerImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTHumanPerformer()
	 * @generated
	 */
	int THUMAN_PERFORMER = 73;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMAN_PERFORMER__DOCUMENTATION = TPERFORMER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMAN_PERFORMER__EXTENSION_ELEMENTS = TPERFORMER__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMAN_PERFORMER__ID = TPERFORMER__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMAN_PERFORMER__ANY_ATTRIBUTE = TPERFORMER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMAN_PERFORMER__RESOURCE_REF = TPERFORMER__RESOURCE_REF;

	/**
	 * The feature id for the '<em><b>Resource Parameter Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMAN_PERFORMER__RESOURCE_PARAMETER_BINDING = TPERFORMER__RESOURCE_PARAMETER_BINDING;

	/**
	 * The feature id for the '<em><b>Resource Assignment Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMAN_PERFORMER__RESOURCE_ASSIGNMENT_EXPRESSION = TPERFORMER__RESOURCE_ASSIGNMENT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMAN_PERFORMER__NAME = TPERFORMER__NAME;

	/**
	 * The number of structural features of the '<em>THuman Performer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMAN_PERFORMER_FEATURE_COUNT = TPERFORMER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>THuman Performer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMAN_PERFORMER_OPERATION_COUNT = TPERFORMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TImplicitThrowEventImpl <em>TImplicit Throw Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TImplicitThrowEventImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTImplicitThrowEvent()
	 * @generated
	 */
	int TIMPLICIT_THROW_EVENT = 74;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLICIT_THROW_EVENT__DOCUMENTATION = TTHROW_EVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLICIT_THROW_EVENT__EXTENSION_ELEMENTS = TTHROW_EVENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLICIT_THROW_EVENT__ID = TTHROW_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLICIT_THROW_EVENT__ANY_ATTRIBUTE = TTHROW_EVENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLICIT_THROW_EVENT__AUDITING = TTHROW_EVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLICIT_THROW_EVENT__MONITORING = TTHROW_EVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLICIT_THROW_EVENT__CATEGORY_VALUE_REF = TTHROW_EVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLICIT_THROW_EVENT__NAME = TTHROW_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLICIT_THROW_EVENT__INCOMING = TTHROW_EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLICIT_THROW_EVENT__OUTGOING = TTHROW_EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLICIT_THROW_EVENT__PROPERTY = TTHROW_EVENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Data Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLICIT_THROW_EVENT__DATA_INPUT = TTHROW_EVENT__DATA_INPUT;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLICIT_THROW_EVENT__DATA_INPUT_ASSOCIATION = TTHROW_EVENT__DATA_INPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Input Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLICIT_THROW_EVENT__INPUT_SET = TTHROW_EVENT__INPUT_SET;

	/**
	 * The feature id for the '<em><b>Event Definition Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLICIT_THROW_EVENT__EVENT_DEFINITION_GROUP = TTHROW_EVENT__EVENT_DEFINITION_GROUP;

	/**
	 * The feature id for the '<em><b>Event Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLICIT_THROW_EVENT__EVENT_DEFINITION = TTHROW_EVENT__EVENT_DEFINITION;

	/**
	 * The feature id for the '<em><b>Event Definition Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLICIT_THROW_EVENT__EVENT_DEFINITION_REF = TTHROW_EVENT__EVENT_DEFINITION_REF;

	/**
	 * The number of structural features of the '<em>TImplicit Throw Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLICIT_THROW_EVENT_FEATURE_COUNT = TTHROW_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TImplicit Throw Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPLICIT_THROW_EVENT_OPERATION_COUNT = TTHROW_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TImportImpl <em>TImport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TImportImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTImport()
	 * @generated
	 */
	int TIMPORT = 75;

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
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TInclusiveGatewayImpl <em>TInclusive Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TInclusiveGatewayImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTInclusiveGateway()
	 * @generated
	 */
	int TINCLUSIVE_GATEWAY = 76;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUSIVE_GATEWAY__DOCUMENTATION = TGATEWAY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUSIVE_GATEWAY__EXTENSION_ELEMENTS = TGATEWAY__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUSIVE_GATEWAY__ID = TGATEWAY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUSIVE_GATEWAY__ANY_ATTRIBUTE = TGATEWAY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUSIVE_GATEWAY__AUDITING = TGATEWAY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUSIVE_GATEWAY__MONITORING = TGATEWAY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUSIVE_GATEWAY__CATEGORY_VALUE_REF = TGATEWAY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUSIVE_GATEWAY__NAME = TGATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUSIVE_GATEWAY__INCOMING = TGATEWAY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUSIVE_GATEWAY__OUTGOING = TGATEWAY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUSIVE_GATEWAY__GATEWAY_DIRECTION = TGATEWAY__GATEWAY_DIRECTION;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUSIVE_GATEWAY__DEFAULT = TGATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TInclusive Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUSIVE_GATEWAY_FEATURE_COUNT = TGATEWAY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TInclusive Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUSIVE_GATEWAY_OPERATION_COUNT = TGATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TInputOutputBindingImpl <em>TInput Output Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TInputOutputBindingImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTInputOutputBinding()
	 * @generated
	 */
	int TINPUT_OUTPUT_BINDING = 77;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_OUTPUT_BINDING__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_OUTPUT_BINDING__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_OUTPUT_BINDING__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_OUTPUT_BINDING__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Input Data Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_OUTPUT_BINDING__INPUT_DATA_REF = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_OUTPUT_BINDING__OPERATION_REF = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Data Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_OUTPUT_BINDING__OUTPUT_DATA_REF = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TInput Output Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_OUTPUT_BINDING_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TInput Output Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_OUTPUT_BINDING_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TInputOutputSpecificationImpl <em>TInput Output Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TInputOutputSpecificationImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTInputOutputSpecification()
	 * @generated
	 */
	int TINPUT_OUTPUT_SPECIFICATION = 78;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_OUTPUT_SPECIFICATION__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_OUTPUT_SPECIFICATION__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_OUTPUT_SPECIFICATION__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_OUTPUT_SPECIFICATION__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Data Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_OUTPUT_SPECIFICATION__DATA_INPUT = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_OUTPUT_SPECIFICATION__DATA_OUTPUT = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_OUTPUT_SPECIFICATION__INPUT_SET = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_OUTPUT_SPECIFICATION__OUTPUT_SET = TBASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TInput Output Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_OUTPUT_SPECIFICATION_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TInput Output Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_OUTPUT_SPECIFICATION_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TInputSetImpl <em>TInput Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TInputSetImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTInputSet()
	 * @generated
	 */
	int TINPUT_SET = 79;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_SET__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_SET__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_SET__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_SET__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Data Input Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_SET__DATA_INPUT_REFS = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Optional Input Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_SET__OPTIONAL_INPUT_REFS = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>While Executing Input Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_SET__WHILE_EXECUTING_INPUT_REFS = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Set Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_SET__OUTPUT_SET_REFS = TBASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_SET__NAME = TBASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TInput Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_SET_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TInput Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_SET_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TInterfaceImpl <em>TInterface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TInterfaceImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTInterface()
	 * @generated
	 */
	int TINTERFACE = 80;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__DOCUMENTATION = TROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__EXTENSION_ELEMENTS = TROOT_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__ID = TROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__ANY_ATTRIBUTE = TROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__OPERATION = TROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementation Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__IMPLEMENTATION_REF = TROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE__NAME = TROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE_FEATURE_COUNT = TROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TInterface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERFACE_OPERATION_COUNT = TROOT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TIntermediateCatchEventImpl <em>TIntermediate Catch Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TIntermediateCatchEventImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTIntermediateCatchEvent()
	 * @generated
	 */
	int TINTERMEDIATE_CATCH_EVENT = 81;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_CATCH_EVENT__DOCUMENTATION = TCATCH_EVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_CATCH_EVENT__EXTENSION_ELEMENTS = TCATCH_EVENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_CATCH_EVENT__ID = TCATCH_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_CATCH_EVENT__ANY_ATTRIBUTE = TCATCH_EVENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_CATCH_EVENT__AUDITING = TCATCH_EVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_CATCH_EVENT__MONITORING = TCATCH_EVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_CATCH_EVENT__CATEGORY_VALUE_REF = TCATCH_EVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_CATCH_EVENT__NAME = TCATCH_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_CATCH_EVENT__INCOMING = TCATCH_EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_CATCH_EVENT__OUTGOING = TCATCH_EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_CATCH_EVENT__PROPERTY = TCATCH_EVENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Data Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_CATCH_EVENT__DATA_OUTPUT = TCATCH_EVENT__DATA_OUTPUT;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_CATCH_EVENT__DATA_OUTPUT_ASSOCIATION = TCATCH_EVENT__DATA_OUTPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Output Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_CATCH_EVENT__OUTPUT_SET = TCATCH_EVENT__OUTPUT_SET;

	/**
	 * The feature id for the '<em><b>Event Definition Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_CATCH_EVENT__EVENT_DEFINITION_GROUP = TCATCH_EVENT__EVENT_DEFINITION_GROUP;

	/**
	 * The feature id for the '<em><b>Event Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_CATCH_EVENT__EVENT_DEFINITION = TCATCH_EVENT__EVENT_DEFINITION;

	/**
	 * The feature id for the '<em><b>Event Definition Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_CATCH_EVENT__EVENT_DEFINITION_REF = TCATCH_EVENT__EVENT_DEFINITION_REF;

	/**
	 * The feature id for the '<em><b>Parallel Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_CATCH_EVENT__PARALLEL_MULTIPLE = TCATCH_EVENT__PARALLEL_MULTIPLE;

	/**
	 * The number of structural features of the '<em>TIntermediate Catch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_CATCH_EVENT_FEATURE_COUNT = TCATCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TIntermediate Catch Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_CATCH_EVENT_OPERATION_COUNT = TCATCH_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TIntermediateThrowEventImpl <em>TIntermediate Throw Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TIntermediateThrowEventImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTIntermediateThrowEvent()
	 * @generated
	 */
	int TINTERMEDIATE_THROW_EVENT = 82;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_THROW_EVENT__DOCUMENTATION = TTHROW_EVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_THROW_EVENT__EXTENSION_ELEMENTS = TTHROW_EVENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_THROW_EVENT__ID = TTHROW_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_THROW_EVENT__ANY_ATTRIBUTE = TTHROW_EVENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_THROW_EVENT__AUDITING = TTHROW_EVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_THROW_EVENT__MONITORING = TTHROW_EVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_THROW_EVENT__CATEGORY_VALUE_REF = TTHROW_EVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_THROW_EVENT__NAME = TTHROW_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_THROW_EVENT__INCOMING = TTHROW_EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_THROW_EVENT__OUTGOING = TTHROW_EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_THROW_EVENT__PROPERTY = TTHROW_EVENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Data Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_THROW_EVENT__DATA_INPUT = TTHROW_EVENT__DATA_INPUT;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_THROW_EVENT__DATA_INPUT_ASSOCIATION = TTHROW_EVENT__DATA_INPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Input Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_THROW_EVENT__INPUT_SET = TTHROW_EVENT__INPUT_SET;

	/**
	 * The feature id for the '<em><b>Event Definition Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_THROW_EVENT__EVENT_DEFINITION_GROUP = TTHROW_EVENT__EVENT_DEFINITION_GROUP;

	/**
	 * The feature id for the '<em><b>Event Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_THROW_EVENT__EVENT_DEFINITION = TTHROW_EVENT__EVENT_DEFINITION;

	/**
	 * The feature id for the '<em><b>Event Definition Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_THROW_EVENT__EVENT_DEFINITION_REF = TTHROW_EVENT__EVENT_DEFINITION_REF;

	/**
	 * The number of structural features of the '<em>TIntermediate Throw Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_THROW_EVENT_FEATURE_COUNT = TTHROW_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TIntermediate Throw Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINTERMEDIATE_THROW_EVENT_OPERATION_COUNT = TTHROW_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TItemDefinitionImpl <em>TItem Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TItemDefinitionImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTItemDefinition()
	 * @generated
	 */
	int TITEM_DEFINITION = 83;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION__DOCUMENTATION = TROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION__EXTENSION_ELEMENTS = TROOT_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION__ID = TROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION__ANY_ATTRIBUTE = TROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION__IS_COLLECTION = TROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION__ITEM_KIND = TROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Structure Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION__STRUCTURE_REF = TROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TItem Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION_FEATURE_COUNT = TROOT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TItem Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION_OPERATION_COUNT = TROOT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TLaneImpl <em>TLane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TLaneImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTLane()
	 * @generated
	 */
	int TLANE = 84;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLANE__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLANE__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLANE__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLANE__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Partition Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLANE__PARTITION_ELEMENT = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flow Node Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLANE__FLOW_NODE_REF = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Child Lane Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLANE__CHILD_LANE_SET = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLANE__NAME = TBASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Partition Element Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLANE__PARTITION_ELEMENT_REF = TBASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TLane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLANE_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TLane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLANE_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TLaneSetImpl <em>TLane Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TLaneSetImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTLaneSet()
	 * @generated
	 */
	int TLANE_SET = 85;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLANE_SET__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLANE_SET__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLANE_SET__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLANE_SET__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Lane</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLANE_SET__LANE = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLANE_SET__NAME = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TLane Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLANE_SET_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TLane Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLANE_SET_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TLinkEventDefinitionImpl <em>TLink Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TLinkEventDefinitionImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTLinkEventDefinition()
	 * @generated
	 */
	int TLINK_EVENT_DEFINITION = 86;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLINK_EVENT_DEFINITION__DOCUMENTATION = TEVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLINK_EVENT_DEFINITION__EXTENSION_ELEMENTS = TEVENT_DEFINITION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLINK_EVENT_DEFINITION__ID = TEVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLINK_EVENT_DEFINITION__ANY_ATTRIBUTE = TEVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLINK_EVENT_DEFINITION__SOURCE = TEVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLINK_EVENT_DEFINITION__TARGET = TEVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLINK_EVENT_DEFINITION__NAME = TEVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TLink Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLINK_EVENT_DEFINITION_FEATURE_COUNT = TEVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TLink Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLINK_EVENT_DEFINITION_OPERATION_COUNT = TEVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TLoopCharacteristicsImpl <em>TLoop Characteristics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TLoopCharacteristicsImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTLoopCharacteristics()
	 * @generated
	 */
	int TLOOP_CHARACTERISTICS = 87;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOOP_CHARACTERISTICS__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOOP_CHARACTERISTICS__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOOP_CHARACTERISTICS__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOOP_CHARACTERISTICS__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>TLoop Characteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOOP_CHARACTERISTICS_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TLoop Characteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLOOP_CHARACTERISTICS_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TManualTaskImpl <em>TManual Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TManualTaskImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTManualTask()
	 * @generated
	 */
	int TMANUAL_TASK = 88;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK__DOCUMENTATION = TTASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK__EXTENSION_ELEMENTS = TTASK__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK__ID = TTASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK__ANY_ATTRIBUTE = TTASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK__AUDITING = TTASK__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK__MONITORING = TTASK__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK__CATEGORY_VALUE_REF = TTASK__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK__NAME = TTASK__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK__INCOMING = TTASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK__OUTGOING = TTASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK__IO_SPECIFICATION = TTASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK__PROPERTY = TTASK__PROPERTY;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK__DATA_INPUT_ASSOCIATION = TTASK__DATA_INPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK__DATA_OUTPUT_ASSOCIATION = TTASK__DATA_OUTPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Resource Role Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK__RESOURCE_ROLE_GROUP = TTASK__RESOURCE_ROLE_GROUP;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK__RESOURCE_ROLE = TTASK__RESOURCE_ROLE;

	/**
	 * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK__LOOP_CHARACTERISTICS_GROUP = TTASK__LOOP_CHARACTERISTICS_GROUP;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK__LOOP_CHARACTERISTICS = TTASK__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK__COMPLETION_QUANTITY = TTASK__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK__DEFAULT = TTASK__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK__IS_FOR_COMPENSATION = TTASK__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK__START_QUANTITY = TTASK__START_QUANTITY;

	/**
	 * The number of structural features of the '<em>TManual Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK_FEATURE_COUNT = TTASK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TManual Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMANUAL_TASK_OPERATION_COUNT = TTASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TMessageImpl <em>TMessage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TMessageImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTMessage()
	 * @generated
	 */
	int TMESSAGE = 89;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE__DOCUMENTATION = TROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE__EXTENSION_ELEMENTS = TROOT_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE__ID = TROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE__ANY_ATTRIBUTE = TROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Item Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE__ITEM_REF = TROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE__NAME = TROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TMessage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_FEATURE_COUNT = TROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TMessage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_OPERATION_COUNT = TROOT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TMessageEventDefinitionImpl <em>TMessage Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TMessageEventDefinitionImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTMessageEventDefinition()
	 * @generated
	 */
	int TMESSAGE_EVENT_DEFINITION = 90;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_EVENT_DEFINITION__DOCUMENTATION = TEVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_EVENT_DEFINITION__EXTENSION_ELEMENTS = TEVENT_DEFINITION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_EVENT_DEFINITION__ID = TEVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_EVENT_DEFINITION__ANY_ATTRIBUTE = TEVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Operation Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_EVENT_DEFINITION__OPERATION_REF = TEVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_EVENT_DEFINITION__MESSAGE_REF = TEVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TMessage Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_EVENT_DEFINITION_FEATURE_COUNT = TEVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TMessage Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_EVENT_DEFINITION_OPERATION_COUNT = TEVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TMessageFlowImpl <em>TMessage Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TMessageFlowImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTMessageFlow()
	 * @generated
	 */
	int TMESSAGE_FLOW = 91;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_FLOW__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_FLOW__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_FLOW__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_FLOW__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Message Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_FLOW__MESSAGE_REF = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_FLOW__NAME = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_FLOW__SOURCE_REF = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_FLOW__TARGET_REF = TBASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TMessage Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_FLOW_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TMessage Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_FLOW_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TMessageFlowAssociationImpl <em>TMessage Flow Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TMessageFlowAssociationImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTMessageFlowAssociation()
	 * @generated
	 */
	int TMESSAGE_FLOW_ASSOCIATION = 92;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_FLOW_ASSOCIATION__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_FLOW_ASSOCIATION__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_FLOW_ASSOCIATION__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_FLOW_ASSOCIATION__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Inner Message Flow Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_FLOW_ASSOCIATION__INNER_MESSAGE_FLOW_REF = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outer Message Flow Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_FLOW_ASSOCIATION__OUTER_MESSAGE_FLOW_REF = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TMessage Flow Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_FLOW_ASSOCIATION_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TMessage Flow Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMESSAGE_FLOW_ASSOCIATION_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TMonitoringImpl <em>TMonitoring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TMonitoringImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTMonitoring()
	 * @generated
	 */
	int TMONITORING = 93;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMONITORING__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMONITORING__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMONITORING__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMONITORING__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>TMonitoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMONITORING_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TMonitoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMONITORING_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TMultiInstanceLoopCharacteristicsImpl <em>TMulti Instance Loop Characteristics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TMultiInstanceLoopCharacteristicsImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	int TMULTI_INSTANCE_LOOP_CHARACTERISTICS = 94;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMULTI_INSTANCE_LOOP_CHARACTERISTICS__DOCUMENTATION = TLOOP_CHARACTERISTICS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMULTI_INSTANCE_LOOP_CHARACTERISTICS__EXTENSION_ELEMENTS = TLOOP_CHARACTERISTICS__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMULTI_INSTANCE_LOOP_CHARACTERISTICS__ID = TLOOP_CHARACTERISTICS__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMULTI_INSTANCE_LOOP_CHARACTERISTICS__ANY_ATTRIBUTE = TLOOP_CHARACTERISTICS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Loop Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY = TLOOP_CHARACTERISTICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loop Data Input Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF = TLOOP_CHARACTERISTICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loop Data Output Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF = TLOOP_CHARACTERISTICS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Data Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM = TLOOP_CHARACTERISTICS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output Data Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM = TLOOP_CHARACTERISTICS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Complex Behavior Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION = TLOOP_CHARACTERISTICS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Completion Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION = TLOOP_CHARACTERISTICS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Behavior</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR = TLOOP_CHARACTERISTICS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Sequential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL = TLOOP_CHARACTERISTICS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>None Behavior Event Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF = TLOOP_CHARACTERISTICS_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>One Behavior Event Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF = TLOOP_CHARACTERISTICS_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>TMulti Instance Loop Characteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMULTI_INSTANCE_LOOP_CHARACTERISTICS_FEATURE_COUNT = TLOOP_CHARACTERISTICS_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>TMulti Instance Loop Characteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TMULTI_INSTANCE_LOOP_CHARACTERISTICS_OPERATION_COUNT = TLOOP_CHARACTERISTICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TOperationImpl <em>TOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TOperationImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTOperation()
	 * @generated
	 */
	int TOPERATION = 95;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>In Message Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__IN_MESSAGE_REF = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out Message Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__OUT_MESSAGE_REF = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__ERROR_REF = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implementation Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__IMPLEMENTATION_REF = TBASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION__NAME = TBASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPERATION_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TOutputSetImpl <em>TOutput Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TOutputSetImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTOutputSet()
	 * @generated
	 */
	int TOUTPUT_SET = 96;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_SET__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_SET__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_SET__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_SET__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Data Output Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_SET__DATA_OUTPUT_REFS = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Optional Output Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_SET__OPTIONAL_OUTPUT_REFS = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>While Executing Output Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_SET__WHILE_EXECUTING_OUTPUT_REFS = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Set Refs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_SET__INPUT_SET_REFS = TBASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_SET__NAME = TBASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TOutput Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_SET_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TOutput Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_SET_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TParallelGatewayImpl <em>TParallel Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TParallelGatewayImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTParallelGateway()
	 * @generated
	 */
	int TPARALLEL_GATEWAY = 97;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARALLEL_GATEWAY__DOCUMENTATION = TGATEWAY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARALLEL_GATEWAY__EXTENSION_ELEMENTS = TGATEWAY__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARALLEL_GATEWAY__ID = TGATEWAY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARALLEL_GATEWAY__ANY_ATTRIBUTE = TGATEWAY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARALLEL_GATEWAY__AUDITING = TGATEWAY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARALLEL_GATEWAY__MONITORING = TGATEWAY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARALLEL_GATEWAY__CATEGORY_VALUE_REF = TGATEWAY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARALLEL_GATEWAY__NAME = TGATEWAY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARALLEL_GATEWAY__INCOMING = TGATEWAY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARALLEL_GATEWAY__OUTGOING = TGATEWAY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Gateway Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARALLEL_GATEWAY__GATEWAY_DIRECTION = TGATEWAY__GATEWAY_DIRECTION;

	/**
	 * The number of structural features of the '<em>TParallel Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARALLEL_GATEWAY_FEATURE_COUNT = TGATEWAY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TParallel Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARALLEL_GATEWAY_OPERATION_COUNT = TGATEWAY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TParticipantImpl <em>TParticipant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TParticipantImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTParticipant()
	 * @generated
	 */
	int TPARTICIPANT = 98;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Interface Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT__INTERFACE_REF = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Point Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT__END_POINT_REF = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Participant Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT__PARTICIPANT_MULTIPLICITY = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT__NAME = TBASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Process Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT__PROCESS_REF = TBASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>TParticipant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>TParticipant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TParticipantAssociationImpl <em>TParticipant Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TParticipantAssociationImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTParticipantAssociation()
	 * @generated
	 */
	int TPARTICIPANT_ASSOCIATION = 99;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT_ASSOCIATION__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT_ASSOCIATION__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT_ASSOCIATION__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT_ASSOCIATION__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Inner Participant Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT_ASSOCIATION__INNER_PARTICIPANT_REF = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outer Participant Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT_ASSOCIATION__OUTER_PARTICIPANT_REF = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TParticipant Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT_ASSOCIATION_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TParticipant Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT_ASSOCIATION_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TParticipantMultiplicityImpl <em>TParticipant Multiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TParticipantMultiplicityImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTParticipantMultiplicity()
	 * @generated
	 */
	int TPARTICIPANT_MULTIPLICITY = 100;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT_MULTIPLICITY__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT_MULTIPLICITY__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT_MULTIPLICITY__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT_MULTIPLICITY__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT_MULTIPLICITY__MAXIMUM = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT_MULTIPLICITY__MINIMUM = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TParticipant Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT_MULTIPLICITY_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TParticipant Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTICIPANT_MULTIPLICITY_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TPartnerEntityImpl <em>TPartner Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TPartnerEntityImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTPartnerEntity()
	 * @generated
	 */
	int TPARTNER_ENTITY = 101;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTNER_ENTITY__DOCUMENTATION = TROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTNER_ENTITY__EXTENSION_ELEMENTS = TROOT_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTNER_ENTITY__ID = TROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTNER_ENTITY__ANY_ATTRIBUTE = TROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Participant Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTNER_ENTITY__PARTICIPANT_REF = TROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTNER_ENTITY__NAME = TROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TPartner Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTNER_ENTITY_FEATURE_COUNT = TROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TPartner Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTNER_ENTITY_OPERATION_COUNT = TROOT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TPartnerRoleImpl <em>TPartner Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TPartnerRoleImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTPartnerRole()
	 * @generated
	 */
	int TPARTNER_ROLE = 102;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTNER_ROLE__DOCUMENTATION = TROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTNER_ROLE__EXTENSION_ELEMENTS = TROOT_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTNER_ROLE__ID = TROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTNER_ROLE__ANY_ATTRIBUTE = TROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Participant Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTNER_ROLE__PARTICIPANT_REF = TROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTNER_ROLE__NAME = TROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TPartner Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTNER_ROLE_FEATURE_COUNT = TROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TPartner Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPARTNER_ROLE_OPERATION_COUNT = TROOT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TPotentialOwnerImpl <em>TPotential Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TPotentialOwnerImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTPotentialOwner()
	 * @generated
	 */
	int TPOTENTIAL_OWNER = 104;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOTENTIAL_OWNER__DOCUMENTATION = THUMAN_PERFORMER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOTENTIAL_OWNER__EXTENSION_ELEMENTS = THUMAN_PERFORMER__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOTENTIAL_OWNER__ID = THUMAN_PERFORMER__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOTENTIAL_OWNER__ANY_ATTRIBUTE = THUMAN_PERFORMER__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Resource Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOTENTIAL_OWNER__RESOURCE_REF = THUMAN_PERFORMER__RESOURCE_REF;

	/**
	 * The feature id for the '<em><b>Resource Parameter Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOTENTIAL_OWNER__RESOURCE_PARAMETER_BINDING = THUMAN_PERFORMER__RESOURCE_PARAMETER_BINDING;

	/**
	 * The feature id for the '<em><b>Resource Assignment Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOTENTIAL_OWNER__RESOURCE_ASSIGNMENT_EXPRESSION = THUMAN_PERFORMER__RESOURCE_ASSIGNMENT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOTENTIAL_OWNER__NAME = THUMAN_PERFORMER__NAME;

	/**
	 * The number of structural features of the '<em>TPotential Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOTENTIAL_OWNER_FEATURE_COUNT = THUMAN_PERFORMER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TPotential Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPOTENTIAL_OWNER_OPERATION_COUNT = THUMAN_PERFORMER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TProcessImpl <em>TProcess</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TProcessImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTProcess()
	 * @generated
	 */
	int TPROCESS = 105;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__DOCUMENTATION = TCALLABLE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__EXTENSION_ELEMENTS = TCALLABLE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__ID = TCALLABLE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__ANY_ATTRIBUTE = TCALLABLE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Supported Interface Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__SUPPORTED_INTERFACE_REF = TCALLABLE_ELEMENT__SUPPORTED_INTERFACE_REF;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__IO_SPECIFICATION = TCALLABLE_ELEMENT__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Io Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__IO_BINDING = TCALLABLE_ELEMENT__IO_BINDING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__NAME = TCALLABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__AUDITING = TCALLABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__MONITORING = TCALLABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__PROPERTY = TCALLABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lane Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__LANE_SET = TCALLABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Flow Element Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__FLOW_ELEMENT_GROUP = TCALLABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Flow Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__FLOW_ELEMENT = TCALLABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Artifact Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__ARTIFACT_GROUP = TCALLABLE_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__ARTIFACT = TCALLABLE_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Resource Role Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__RESOURCE_ROLE_GROUP = TCALLABLE_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__RESOURCE_ROLE = TCALLABLE_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Correlation Subscription</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__CORRELATION_SUBSCRIPTION = TCALLABLE_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Supports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__SUPPORTS = TCALLABLE_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Definitional Collaboration Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__DEFINITIONAL_COLLABORATION_REF = TCALLABLE_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Is Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__IS_CLOSED = TCALLABLE_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Is Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__IS_EXECUTABLE = TCALLABLE_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Process Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS__PROCESS_TYPE = TCALLABLE_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of structural features of the '<em>TProcess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_FEATURE_COUNT = TCALLABLE_ELEMENT_FEATURE_COUNT + 16;

	/**
	 * The number of operations of the '<em>TProcess</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROCESS_OPERATION_COUNT = TCALLABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TPropertyImpl <em>TProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TPropertyImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTProperty()
	 * @generated
	 */
	int TPROPERTY = 106;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Data State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__DATA_STATE = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Subject Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__ITEM_SUBJECT_REF = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__NAME = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TReceiveTaskImpl <em>TReceive Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TReceiveTaskImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTReceiveTask()
	 * @generated
	 */
	int TRECEIVE_TASK = 107;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__DOCUMENTATION = TTASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__EXTENSION_ELEMENTS = TTASK__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__ID = TTASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__ANY_ATTRIBUTE = TTASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__AUDITING = TTASK__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__MONITORING = TTASK__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__CATEGORY_VALUE_REF = TTASK__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__NAME = TTASK__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__INCOMING = TTASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__OUTGOING = TTASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__IO_SPECIFICATION = TTASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__PROPERTY = TTASK__PROPERTY;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__DATA_INPUT_ASSOCIATION = TTASK__DATA_INPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__DATA_OUTPUT_ASSOCIATION = TTASK__DATA_OUTPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Resource Role Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__RESOURCE_ROLE_GROUP = TTASK__RESOURCE_ROLE_GROUP;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__RESOURCE_ROLE = TTASK__RESOURCE_ROLE;

	/**
	 * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__LOOP_CHARACTERISTICS_GROUP = TTASK__LOOP_CHARACTERISTICS_GROUP;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__LOOP_CHARACTERISTICS = TTASK__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__COMPLETION_QUANTITY = TTASK__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__DEFAULT = TTASK__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__IS_FOR_COMPENSATION = TTASK__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__START_QUANTITY = TTASK__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__IMPLEMENTATION = TTASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instantiate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__INSTANTIATE = TTASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Message Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__MESSAGE_REF = TTASK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operation Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK__OPERATION_REF = TTASK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TReceive Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK_FEATURE_COUNT = TTASK_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TReceive Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECEIVE_TASK_OPERATION_COUNT = TTASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TRelationshipImpl <em>TRelationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TRelationshipImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTRelationship()
	 * @generated
	 */
	int TRELATIONSHIP = 108;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP__SOURCE = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP__TARGET = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP__DIRECTION = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP__TYPE = TBASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TRelationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TRelationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATIONSHIP_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TRenderingImpl <em>TRendering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TRenderingImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTRendering()
	 * @generated
	 */
	int TRENDERING = 109;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRENDERING__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRENDERING__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRENDERING__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRENDERING__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>TRendering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRENDERING_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TRendering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRENDERING_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TResourceImpl <em>TResource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TResourceImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTResource()
	 * @generated
	 */
	int TRESOURCE = 110;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE__DOCUMENTATION = TROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE__EXTENSION_ELEMENTS = TROOT_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE__ID = TROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE__ANY_ATTRIBUTE = TROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Resource Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE__RESOURCE_PARAMETER = TROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE__NAME = TROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TResource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_FEATURE_COUNT = TROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TResource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_OPERATION_COUNT = TROOT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TResourceAssignmentExpressionImpl <em>TResource Assignment Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TResourceAssignmentExpressionImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTResourceAssignmentExpression()
	 * @generated
	 */
	int TRESOURCE_ASSIGNMENT_EXPRESSION = 111;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_ASSIGNMENT_EXPRESSION__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_ASSIGNMENT_EXPRESSION__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_ASSIGNMENT_EXPRESSION__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_ASSIGNMENT_EXPRESSION__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_ASSIGNMENT_EXPRESSION__EXPRESSION_GROUP = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_ASSIGNMENT_EXPRESSION__EXPRESSION = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TResource Assignment Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_ASSIGNMENT_EXPRESSION_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TResource Assignment Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_ASSIGNMENT_EXPRESSION_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TResourceParameterImpl <em>TResource Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TResourceParameterImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTResourceParameter()
	 * @generated
	 */
	int TRESOURCE_PARAMETER = 112;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_PARAMETER__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_PARAMETER__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_PARAMETER__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_PARAMETER__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Is Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_PARAMETER__IS_REQUIRED = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_PARAMETER__NAME = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_PARAMETER__TYPE = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TResource Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_PARAMETER_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TResource Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_PARAMETER_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TResourceParameterBindingImpl <em>TResource Parameter Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TResourceParameterBindingImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTResourceParameterBinding()
	 * @generated
	 */
	int TRESOURCE_PARAMETER_BINDING = 113;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_PARAMETER_BINDING__DOCUMENTATION = TBASE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_PARAMETER_BINDING__EXTENSION_ELEMENTS = TBASE_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_PARAMETER_BINDING__ID = TBASE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_PARAMETER_BINDING__ANY_ATTRIBUTE = TBASE_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_PARAMETER_BINDING__EXPRESSION_GROUP = TBASE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_PARAMETER_BINDING__EXPRESSION = TBASE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_PARAMETER_BINDING__PARAMETER_REF = TBASE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TResource Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_PARAMETER_BINDING_FEATURE_COUNT = TBASE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TResource Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRESOURCE_PARAMETER_BINDING_OPERATION_COUNT = TBASE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TScriptImpl <em>TScript</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TScriptImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTScript()
	 * @generated
	 */
	int TSCRIPT = 116;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT__ANY = 1;

	/**
	 * The number of structural features of the '<em>TScript</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TScript</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TScriptTaskImpl <em>TScript Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TScriptTaskImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTScriptTask()
	 * @generated
	 */
	int TSCRIPT_TASK = 117;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__DOCUMENTATION = TTASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__EXTENSION_ELEMENTS = TTASK__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__ID = TTASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__ANY_ATTRIBUTE = TTASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__AUDITING = TTASK__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__MONITORING = TTASK__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__CATEGORY_VALUE_REF = TTASK__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__NAME = TTASK__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__INCOMING = TTASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__OUTGOING = TTASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__IO_SPECIFICATION = TTASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__PROPERTY = TTASK__PROPERTY;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__DATA_INPUT_ASSOCIATION = TTASK__DATA_INPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__DATA_OUTPUT_ASSOCIATION = TTASK__DATA_OUTPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Resource Role Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__RESOURCE_ROLE_GROUP = TTASK__RESOURCE_ROLE_GROUP;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__RESOURCE_ROLE = TTASK__RESOURCE_ROLE;

	/**
	 * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__LOOP_CHARACTERISTICS_GROUP = TTASK__LOOP_CHARACTERISTICS_GROUP;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__LOOP_CHARACTERISTICS = TTASK__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__COMPLETION_QUANTITY = TTASK__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__DEFAULT = TTASK__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__IS_FOR_COMPENSATION = TTASK__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__START_QUANTITY = TTASK__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Script</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__SCRIPT = TTASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Script Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK__SCRIPT_FORMAT = TTASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TScript Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK_FEATURE_COUNT = TTASK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TScript Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSCRIPT_TASK_OPERATION_COUNT = TTASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TSendTaskImpl <em>TSend Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TSendTaskImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTSendTask()
	 * @generated
	 */
	int TSEND_TASK = 118;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__DOCUMENTATION = TTASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__EXTENSION_ELEMENTS = TTASK__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__ID = TTASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__ANY_ATTRIBUTE = TTASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__AUDITING = TTASK__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__MONITORING = TTASK__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__CATEGORY_VALUE_REF = TTASK__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__NAME = TTASK__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__INCOMING = TTASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__OUTGOING = TTASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__IO_SPECIFICATION = TTASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__PROPERTY = TTASK__PROPERTY;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__DATA_INPUT_ASSOCIATION = TTASK__DATA_INPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__DATA_OUTPUT_ASSOCIATION = TTASK__DATA_OUTPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Resource Role Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__RESOURCE_ROLE_GROUP = TTASK__RESOURCE_ROLE_GROUP;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__RESOURCE_ROLE = TTASK__RESOURCE_ROLE;

	/**
	 * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__LOOP_CHARACTERISTICS_GROUP = TTASK__LOOP_CHARACTERISTICS_GROUP;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__LOOP_CHARACTERISTICS = TTASK__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__COMPLETION_QUANTITY = TTASK__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__DEFAULT = TTASK__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__IS_FOR_COMPENSATION = TTASK__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__START_QUANTITY = TTASK__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__IMPLEMENTATION = TTASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__MESSAGE_REF = TTASK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK__OPERATION_REF = TTASK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TSend Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK_FEATURE_COUNT = TTASK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TSend Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEND_TASK_OPERATION_COUNT = TTASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TSequenceFlowImpl <em>TSequence Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TSequenceFlowImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTSequenceFlow()
	 * @generated
	 */
	int TSEQUENCE_FLOW = 119;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEQUENCE_FLOW__DOCUMENTATION = TFLOW_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEQUENCE_FLOW__EXTENSION_ELEMENTS = TFLOW_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEQUENCE_FLOW__ID = TFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEQUENCE_FLOW__ANY_ATTRIBUTE = TFLOW_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEQUENCE_FLOW__AUDITING = TFLOW_ELEMENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEQUENCE_FLOW__MONITORING = TFLOW_ELEMENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEQUENCE_FLOW__CATEGORY_VALUE_REF = TFLOW_ELEMENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEQUENCE_FLOW__NAME = TFLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Condition Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEQUENCE_FLOW__CONDITION_EXPRESSION = TFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEQUENCE_FLOW__IS_IMMEDIATE = TFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEQUENCE_FLOW__SOURCE_REF = TFLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEQUENCE_FLOW__TARGET_REF = TFLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TSequence Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEQUENCE_FLOW_FEATURE_COUNT = TFLOW_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TSequence Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSEQUENCE_FLOW_OPERATION_COUNT = TFLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TServiceTaskImpl <em>TService Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TServiceTaskImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTServiceTask()
	 * @generated
	 */
	int TSERVICE_TASK = 120;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__DOCUMENTATION = TTASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__EXTENSION_ELEMENTS = TTASK__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__ID = TTASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__ANY_ATTRIBUTE = TTASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__AUDITING = TTASK__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__MONITORING = TTASK__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__CATEGORY_VALUE_REF = TTASK__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__NAME = TTASK__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__INCOMING = TTASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__OUTGOING = TTASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__IO_SPECIFICATION = TTASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__PROPERTY = TTASK__PROPERTY;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__DATA_INPUT_ASSOCIATION = TTASK__DATA_INPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__DATA_OUTPUT_ASSOCIATION = TTASK__DATA_OUTPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Resource Role Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__RESOURCE_ROLE_GROUP = TTASK__RESOURCE_ROLE_GROUP;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__RESOURCE_ROLE = TTASK__RESOURCE_ROLE;

	/**
	 * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__LOOP_CHARACTERISTICS_GROUP = TTASK__LOOP_CHARACTERISTICS_GROUP;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__LOOP_CHARACTERISTICS = TTASK__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__COMPLETION_QUANTITY = TTASK__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__DEFAULT = TTASK__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__IS_FOR_COMPENSATION = TTASK__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__START_QUANTITY = TTASK__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__IMPLEMENTATION = TTASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK__OPERATION_REF = TTASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TService Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK_FEATURE_COUNT = TTASK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TService Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSERVICE_TASK_OPERATION_COUNT = TTASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TSignalImpl <em>TSignal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TSignalImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTSignal()
	 * @generated
	 */
	int TSIGNAL = 121;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNAL__DOCUMENTATION = TROOT_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNAL__EXTENSION_ELEMENTS = TROOT_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNAL__ID = TROOT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNAL__ANY_ATTRIBUTE = TROOT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNAL__NAME = TROOT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Structure Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNAL__STRUCTURE_REF = TROOT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TSignal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNAL_FEATURE_COUNT = TROOT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TSignal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNAL_OPERATION_COUNT = TROOT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TSignalEventDefinitionImpl <em>TSignal Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TSignalEventDefinitionImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTSignalEventDefinition()
	 * @generated
	 */
	int TSIGNAL_EVENT_DEFINITION = 122;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNAL_EVENT_DEFINITION__DOCUMENTATION = TEVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNAL_EVENT_DEFINITION__EXTENSION_ELEMENTS = TEVENT_DEFINITION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNAL_EVENT_DEFINITION__ID = TEVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNAL_EVENT_DEFINITION__ANY_ATTRIBUTE = TEVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Signal Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNAL_EVENT_DEFINITION__SIGNAL_REF = TEVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TSignal Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNAL_EVENT_DEFINITION_FEATURE_COUNT = TEVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TSignal Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSIGNAL_EVENT_DEFINITION_OPERATION_COUNT = TEVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TStandardLoopCharacteristicsImpl <em>TStandard Loop Characteristics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TStandardLoopCharacteristicsImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTStandardLoopCharacteristics()
	 * @generated
	 */
	int TSTANDARD_LOOP_CHARACTERISTICS = 123;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTANDARD_LOOP_CHARACTERISTICS__DOCUMENTATION = TLOOP_CHARACTERISTICS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTANDARD_LOOP_CHARACTERISTICS__EXTENSION_ELEMENTS = TLOOP_CHARACTERISTICS__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTANDARD_LOOP_CHARACTERISTICS__ID = TLOOP_CHARACTERISTICS__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTANDARD_LOOP_CHARACTERISTICS__ANY_ATTRIBUTE = TLOOP_CHARACTERISTICS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Loop Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTANDARD_LOOP_CHARACTERISTICS__LOOP_CONDITION = TLOOP_CHARACTERISTICS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loop Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTANDARD_LOOP_CHARACTERISTICS__LOOP_MAXIMUM = TLOOP_CHARACTERISTICS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test Before</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTANDARD_LOOP_CHARACTERISTICS__TEST_BEFORE = TLOOP_CHARACTERISTICS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TStandard Loop Characteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTANDARD_LOOP_CHARACTERISTICS_FEATURE_COUNT = TLOOP_CHARACTERISTICS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TStandard Loop Characteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTANDARD_LOOP_CHARACTERISTICS_OPERATION_COUNT = TLOOP_CHARACTERISTICS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TStartEventImpl <em>TStart Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TStartEventImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTStartEvent()
	 * @generated
	 */
	int TSTART_EVENT = 124;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_EVENT__DOCUMENTATION = TCATCH_EVENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_EVENT__EXTENSION_ELEMENTS = TCATCH_EVENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_EVENT__ID = TCATCH_EVENT__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_EVENT__ANY_ATTRIBUTE = TCATCH_EVENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_EVENT__AUDITING = TCATCH_EVENT__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_EVENT__MONITORING = TCATCH_EVENT__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_EVENT__CATEGORY_VALUE_REF = TCATCH_EVENT__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_EVENT__NAME = TCATCH_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_EVENT__INCOMING = TCATCH_EVENT__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_EVENT__OUTGOING = TCATCH_EVENT__OUTGOING;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_EVENT__PROPERTY = TCATCH_EVENT__PROPERTY;

	/**
	 * The feature id for the '<em><b>Data Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_EVENT__DATA_OUTPUT = TCATCH_EVENT__DATA_OUTPUT;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_EVENT__DATA_OUTPUT_ASSOCIATION = TCATCH_EVENT__DATA_OUTPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Output Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_EVENT__OUTPUT_SET = TCATCH_EVENT__OUTPUT_SET;

	/**
	 * The feature id for the '<em><b>Event Definition Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_EVENT__EVENT_DEFINITION_GROUP = TCATCH_EVENT__EVENT_DEFINITION_GROUP;

	/**
	 * The feature id for the '<em><b>Event Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_EVENT__EVENT_DEFINITION = TCATCH_EVENT__EVENT_DEFINITION;

	/**
	 * The feature id for the '<em><b>Event Definition Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_EVENT__EVENT_DEFINITION_REF = TCATCH_EVENT__EVENT_DEFINITION_REF;

	/**
	 * The feature id for the '<em><b>Parallel Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_EVENT__PARALLEL_MULTIPLE = TCATCH_EVENT__PARALLEL_MULTIPLE;

	/**
	 * The feature id for the '<em><b>Is Interrupting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_EVENT__IS_INTERRUPTING = TCATCH_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TStart Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_EVENT_FEATURE_COUNT = TCATCH_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TStart Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTART_EVENT_OPERATION_COUNT = TCATCH_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TSubChoreographyImpl <em>TSub Choreography</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TSubChoreographyImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTSubChoreography()
	 * @generated
	 */
	int TSUB_CHOREOGRAPHY = 125;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CHOREOGRAPHY__DOCUMENTATION = TCHOREOGRAPHY_ACTIVITY__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CHOREOGRAPHY__EXTENSION_ELEMENTS = TCHOREOGRAPHY_ACTIVITY__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CHOREOGRAPHY__ID = TCHOREOGRAPHY_ACTIVITY__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CHOREOGRAPHY__ANY_ATTRIBUTE = TCHOREOGRAPHY_ACTIVITY__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CHOREOGRAPHY__AUDITING = TCHOREOGRAPHY_ACTIVITY__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CHOREOGRAPHY__MONITORING = TCHOREOGRAPHY_ACTIVITY__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CHOREOGRAPHY__CATEGORY_VALUE_REF = TCHOREOGRAPHY_ACTIVITY__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CHOREOGRAPHY__NAME = TCHOREOGRAPHY_ACTIVITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CHOREOGRAPHY__INCOMING = TCHOREOGRAPHY_ACTIVITY__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CHOREOGRAPHY__OUTGOING = TCHOREOGRAPHY_ACTIVITY__OUTGOING;

	/**
	 * The feature id for the '<em><b>Participant Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CHOREOGRAPHY__PARTICIPANT_REF = TCHOREOGRAPHY_ACTIVITY__PARTICIPANT_REF;

	/**
	 * The feature id for the '<em><b>Correlation Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CHOREOGRAPHY__CORRELATION_KEY = TCHOREOGRAPHY_ACTIVITY__CORRELATION_KEY;

	/**
	 * The feature id for the '<em><b>Initiating Participant Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CHOREOGRAPHY__INITIATING_PARTICIPANT_REF = TCHOREOGRAPHY_ACTIVITY__INITIATING_PARTICIPANT_REF;

	/**
	 * The feature id for the '<em><b>Loop Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CHOREOGRAPHY__LOOP_TYPE = TCHOREOGRAPHY_ACTIVITY__LOOP_TYPE;

	/**
	 * The feature id for the '<em><b>Flow Element Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CHOREOGRAPHY__FLOW_ELEMENT_GROUP = TCHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flow Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CHOREOGRAPHY__FLOW_ELEMENT = TCHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Artifact Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CHOREOGRAPHY__ARTIFACT_GROUP = TCHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CHOREOGRAPHY__ARTIFACT = TCHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TSub Choreography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CHOREOGRAPHY_FEATURE_COUNT = TCHOREOGRAPHY_ACTIVITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TSub Choreography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CHOREOGRAPHY_OPERATION_COUNT = TCHOREOGRAPHY_ACTIVITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TSubConversationImpl <em>TSub Conversation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TSubConversationImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTSubConversation()
	 * @generated
	 */
	int TSUB_CONVERSATION = 126;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CONVERSATION__DOCUMENTATION = TCONVERSATION_NODE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CONVERSATION__EXTENSION_ELEMENTS = TCONVERSATION_NODE__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CONVERSATION__ID = TCONVERSATION_NODE__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CONVERSATION__ANY_ATTRIBUTE = TCONVERSATION_NODE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Participant Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CONVERSATION__PARTICIPANT_REF = TCONVERSATION_NODE__PARTICIPANT_REF;

	/**
	 * The feature id for the '<em><b>Message Flow Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CONVERSATION__MESSAGE_FLOW_REF = TCONVERSATION_NODE__MESSAGE_FLOW_REF;

	/**
	 * The feature id for the '<em><b>Correlation Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CONVERSATION__CORRELATION_KEY = TCONVERSATION_NODE__CORRELATION_KEY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CONVERSATION__NAME = TCONVERSATION_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Conversation Node Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CONVERSATION__CONVERSATION_NODE_GROUP = TCONVERSATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conversation Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CONVERSATION__CONVERSATION_NODE = TCONVERSATION_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TSub Conversation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CONVERSATION_FEATURE_COUNT = TCONVERSATION_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TSub Conversation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSUB_CONVERSATION_OPERATION_COUNT = TCONVERSATION_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TTerminateEventDefinitionImpl <em>TTerminate Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TTerminateEventDefinitionImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTTerminateEventDefinition()
	 * @generated
	 */
	int TTERMINATE_EVENT_DEFINITION = 129;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERMINATE_EVENT_DEFINITION__DOCUMENTATION = TEVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERMINATE_EVENT_DEFINITION__EXTENSION_ELEMENTS = TEVENT_DEFINITION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERMINATE_EVENT_DEFINITION__ID = TEVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERMINATE_EVENT_DEFINITION__ANY_ATTRIBUTE = TEVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>TTerminate Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERMINATE_EVENT_DEFINITION_FEATURE_COUNT = TEVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TTerminate Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERMINATE_EVENT_DEFINITION_OPERATION_COUNT = TEVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TTextImpl <em>TText</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TTextImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTText()
	 * @generated
	 */
	int TTEXT = 130;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT__ANY = 1;

	/**
	 * The number of structural features of the '<em>TText</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TText</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TTextAnnotationImpl <em>TText Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TTextAnnotationImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTTextAnnotation()
	 * @generated
	 */
	int TTEXT_ANNOTATION = 131;

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
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
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
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TTimerEventDefinitionImpl <em>TTimer Event Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TTimerEventDefinitionImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTTimerEventDefinition()
	 * @generated
	 */
	int TTIMER_EVENT_DEFINITION = 133;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIMER_EVENT_DEFINITION__DOCUMENTATION = TEVENT_DEFINITION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIMER_EVENT_DEFINITION__EXTENSION_ELEMENTS = TEVENT_DEFINITION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIMER_EVENT_DEFINITION__ID = TEVENT_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIMER_EVENT_DEFINITION__ANY_ATTRIBUTE = TEVENT_DEFINITION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Time Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIMER_EVENT_DEFINITION__TIME_DATE = TEVENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIMER_EVENT_DEFINITION__TIME_DURATION = TEVENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Cycle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIMER_EVENT_DEFINITION__TIME_CYCLE = TEVENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TTimer Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIMER_EVENT_DEFINITION_FEATURE_COUNT = TEVENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TTimer Event Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIMER_EVENT_DEFINITION_OPERATION_COUNT = TEVENT_DEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TTransactionImpl <em>TTransaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TTransactionImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTTransaction()
	 * @generated
	 */
	int TTRANSACTION = 134;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__DOCUMENTATION = TSUB_PROCESS__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__EXTENSION_ELEMENTS = TSUB_PROCESS__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__ID = TSUB_PROCESS__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__ANY_ATTRIBUTE = TSUB_PROCESS__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__AUDITING = TSUB_PROCESS__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__MONITORING = TSUB_PROCESS__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__CATEGORY_VALUE_REF = TSUB_PROCESS__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__NAME = TSUB_PROCESS__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__INCOMING = TSUB_PROCESS__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__OUTGOING = TSUB_PROCESS__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__IO_SPECIFICATION = TSUB_PROCESS__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__PROPERTY = TSUB_PROCESS__PROPERTY;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__DATA_INPUT_ASSOCIATION = TSUB_PROCESS__DATA_INPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__DATA_OUTPUT_ASSOCIATION = TSUB_PROCESS__DATA_OUTPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Resource Role Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__RESOURCE_ROLE_GROUP = TSUB_PROCESS__RESOURCE_ROLE_GROUP;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__RESOURCE_ROLE = TSUB_PROCESS__RESOURCE_ROLE;

	/**
	 * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__LOOP_CHARACTERISTICS_GROUP = TSUB_PROCESS__LOOP_CHARACTERISTICS_GROUP;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__LOOP_CHARACTERISTICS = TSUB_PROCESS__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__COMPLETION_QUANTITY = TSUB_PROCESS__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__DEFAULT = TSUB_PROCESS__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__IS_FOR_COMPENSATION = TSUB_PROCESS__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__START_QUANTITY = TSUB_PROCESS__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Lane Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__LANE_SET = TSUB_PROCESS__LANE_SET;

	/**
	 * The feature id for the '<em><b>Flow Element Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__FLOW_ELEMENT_GROUP = TSUB_PROCESS__FLOW_ELEMENT_GROUP;

	/**
	 * The feature id for the '<em><b>Flow Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__FLOW_ELEMENT = TSUB_PROCESS__FLOW_ELEMENT;

	/**
	 * The feature id for the '<em><b>Artifact Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__ARTIFACT_GROUP = TSUB_PROCESS__ARTIFACT_GROUP;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__ARTIFACT = TSUB_PROCESS__ARTIFACT;

	/**
	 * The feature id for the '<em><b>Triggered By Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__TRIGGERED_BY_EVENT = TSUB_PROCESS__TRIGGERED_BY_EVENT;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION__METHOD = TSUB_PROCESS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TTransaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION_FEATURE_COUNT = TSUB_PROCESS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TTransaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTRANSACTION_OPERATION_COUNT = TSUB_PROCESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.impl.TUserTaskImpl <em>TUser Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.impl.TUserTaskImpl
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTUserTask()
	 * @generated
	 */
	int TUSER_TASK = 135;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__DOCUMENTATION = TTASK__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__EXTENSION_ELEMENTS = TTASK__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__ID = TTASK__ID;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__ANY_ATTRIBUTE = TTASK__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Auditing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__AUDITING = TTASK__AUDITING;

	/**
	 * The feature id for the '<em><b>Monitoring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__MONITORING = TTASK__MONITORING;

	/**
	 * The feature id for the '<em><b>Category Value Ref</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__CATEGORY_VALUE_REF = TTASK__CATEGORY_VALUE_REF;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__NAME = TTASK__NAME;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__INCOMING = TTASK__INCOMING;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__OUTGOING = TTASK__OUTGOING;

	/**
	 * The feature id for the '<em><b>Io Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__IO_SPECIFICATION = TTASK__IO_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__PROPERTY = TTASK__PROPERTY;

	/**
	 * The feature id for the '<em><b>Data Input Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__DATA_INPUT_ASSOCIATION = TTASK__DATA_INPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Data Output Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__DATA_OUTPUT_ASSOCIATION = TTASK__DATA_OUTPUT_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Resource Role Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__RESOURCE_ROLE_GROUP = TTASK__RESOURCE_ROLE_GROUP;

	/**
	 * The feature id for the '<em><b>Resource Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__RESOURCE_ROLE = TTASK__RESOURCE_ROLE;

	/**
	 * The feature id for the '<em><b>Loop Characteristics Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__LOOP_CHARACTERISTICS_GROUP = TTASK__LOOP_CHARACTERISTICS_GROUP;

	/**
	 * The feature id for the '<em><b>Loop Characteristics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__LOOP_CHARACTERISTICS = TTASK__LOOP_CHARACTERISTICS;

	/**
	 * The feature id for the '<em><b>Completion Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__COMPLETION_QUANTITY = TTASK__COMPLETION_QUANTITY;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__DEFAULT = TTASK__DEFAULT;

	/**
	 * The feature id for the '<em><b>Is For Compensation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__IS_FOR_COMPENSATION = TTASK__IS_FOR_COMPENSATION;

	/**
	 * The feature id for the '<em><b>Start Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__START_QUANTITY = TTASK__START_QUANTITY;

	/**
	 * The feature id for the '<em><b>Rendering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__RENDERING = TTASK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK__IMPLEMENTATION = TTASK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TUser Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK_FEATURE_COUNT = TTASK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TUser Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUSER_TASK_OPERATION_COUNT = TTASK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.TAdHocOrdering <em>TAd Hoc Ordering</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.TAdHocOrdering
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTAdHocOrdering()
	 * @generated
	 */
	int TAD_HOC_ORDERING = 136;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.TAssociationDirection <em>TAssociation Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.TAssociationDirection
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTAssociationDirection()
	 * @generated
	 */
	int TASSOCIATION_DIRECTION = 137;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.TChoreographyLoopType <em>TChoreography Loop Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.TChoreographyLoopType
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTChoreographyLoopType()
	 * @generated
	 */
	int TCHOREOGRAPHY_LOOP_TYPE = 138;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.TEventBasedGatewayType <em>TEvent Based Gateway Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.TEventBasedGatewayType
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTEventBasedGatewayType()
	 * @generated
	 */
	int TEVENT_BASED_GATEWAY_TYPE = 139;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.TGatewayDirection <em>TGateway Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.TGatewayDirection
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTGatewayDirection()
	 * @generated
	 */
	int TGATEWAY_DIRECTION = 140;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.TImplementationMember1 <em>TImplementation Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.TImplementationMember1
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTImplementationMember1()
	 * @generated
	 */
	int TIMPLEMENTATION_MEMBER1 = 141;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.TItemKind <em>TItem Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.TItemKind
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTItemKind()
	 * @generated
	 */
	int TITEM_KIND = 142;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.TMultiInstanceFlowCondition <em>TMulti Instance Flow Condition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.TMultiInstanceFlowCondition
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTMultiInstanceFlowCondition()
	 * @generated
	 */
	int TMULTI_INSTANCE_FLOW_CONDITION = 143;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.TProcessType <em>TProcess Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.TProcessType
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTProcessType()
	 * @generated
	 */
	int TPROCESS_TYPE = 144;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.TRelationshipDirection <em>TRelationship Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.TRelationshipDirection
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTRelationshipDirection()
	 * @generated
	 */
	int TRELATIONSHIP_DIRECTION = 145;

	/**
	 * The meta object id for the '{@link org.omg.spec.bpmn.bpmn.TTransactionMethodMember1 <em>TTransaction Method Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.TTransactionMethodMember1
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTTransactionMethodMember1()
	 * @generated
	 */
	int TTRANSACTION_METHOD_MEMBER1 = 146;

	/**
	 * The meta object id for the '<em>TAd Hoc Ordering Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.TAdHocOrdering
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTAdHocOrderingObject()
	 * @generated
	 */
	int TAD_HOC_ORDERING_OBJECT = 147;

	/**
	 * The meta object id for the '<em>TAssociation Direction Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.TAssociationDirection
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTAssociationDirectionObject()
	 * @generated
	 */
	int TASSOCIATION_DIRECTION_OBJECT = 148;

	/**
	 * The meta object id for the '<em>TChoreography Loop Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.TChoreographyLoopType
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTChoreographyLoopTypeObject()
	 * @generated
	 */
	int TCHOREOGRAPHY_LOOP_TYPE_OBJECT = 149;

	/**
	 * The meta object id for the '<em>TEvent Based Gateway Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.TEventBasedGatewayType
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTEventBasedGatewayTypeObject()
	 * @generated
	 */
	int TEVENT_BASED_GATEWAY_TYPE_OBJECT = 150;

	/**
	 * The meta object id for the '<em>TGateway Direction Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.TGatewayDirection
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTGatewayDirectionObject()
	 * @generated
	 */
	int TGATEWAY_DIRECTION_OBJECT = 151;

	/**
	 * The meta object id for the '<em>TImplementation</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTImplementation()
	 * @generated
	 */
	int TIMPLEMENTATION = 152;

	/**
	 * The meta object id for the '<em>TImplementation Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.TImplementationMember1
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTImplementationMember1Object()
	 * @generated
	 */
	int TIMPLEMENTATION_MEMBER1_OBJECT = 153;

	/**
	 * The meta object id for the '<em>TItem Kind Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.TItemKind
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTItemKindObject()
	 * @generated
	 */
	int TITEM_KIND_OBJECT = 154;

	/**
	 * The meta object id for the '<em>TMulti Instance Flow Condition Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.TMultiInstanceFlowCondition
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTMultiInstanceFlowConditionObject()
	 * @generated
	 */
	int TMULTI_INSTANCE_FLOW_CONDITION_OBJECT = 155;

	/**
	 * The meta object id for the '<em>TProcess Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.TProcessType
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTProcessTypeObject()
	 * @generated
	 */
	int TPROCESS_TYPE_OBJECT = 156;

	/**
	 * The meta object id for the '<em>TRelationship Direction Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.TRelationshipDirection
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTRelationshipDirectionObject()
	 * @generated
	 */
	int TRELATIONSHIP_DIRECTION_OBJECT = 157;

	/**
	 * The meta object id for the '<em>TTransaction Method</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTTransactionMethod()
	 * @generated
	 */
	int TTRANSACTION_METHOD = 158;

	/**
	 * The meta object id for the '<em>TTransaction Method Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.bpmn.bpmn.TTransactionMethodMember1
	 * @see org.omg.spec.bpmn.bpmn.impl.BPMNPackageImpl#getTTransactionMethodMember1Object()
	 * @generated
	 */
	int TTRANSACTION_METHOD_MEMBER1_OBJECT = 159;


	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.BPMNRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot
	 * @generated
	 */
	EClass getBPMNRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getMixed()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EAttribute getBPMNRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getXMLNSPrefixMap()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getXSISchemaLocation()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getActivity()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Activity();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getAdHocSubProcess <em>Ad Hoc Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ad Hoc Sub Process</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getAdHocSubProcess()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_AdHocSubProcess();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getFlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flow Element</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getFlowElement()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_FlowElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifact</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getArtifact()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Artifact();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assignment</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getAssignment()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Assignment();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Association</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getAssociation()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Association();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getAuditing <em>Auditing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auditing</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getAuditing()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Auditing();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getBaseElement <em>Base Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Element</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getBaseElement()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_BaseElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getBaseElementWithMixedContent <em>Base Element With Mixed Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base Element With Mixed Content</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getBaseElementWithMixedContent()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_BaseElementWithMixedContent();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getBoundaryEvent <em>Boundary Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boundary Event</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getBoundaryEvent()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_BoundaryEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getBusinessRuleTask <em>Business Rule Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Business Rule Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getBusinessRuleTask()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_BusinessRuleTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getCallableElement <em>Callable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Callable Element</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getCallableElement()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_CallableElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getCallActivity <em>Call Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Call Activity</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getCallActivity()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_CallActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getCallChoreography <em>Call Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Call Choreography</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getCallChoreography()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_CallChoreography();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getCallConversation <em>Call Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Call Conversation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getCallConversation()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_CallConversation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getConversationNode <em>Conversation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conversation Node</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getConversationNode()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ConversationNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getCancelEventDefinition <em>Cancel Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cancel Event Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getCancelEventDefinition()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_CancelEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getEventDefinition <em>Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getEventDefinition()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_EventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Element</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getRootElement()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_RootElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getCatchEvent <em>Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Catch Event</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getCatchEvent()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_CatchEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Category</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getCategory()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Category();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getCategoryValue <em>Category Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Category Value</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getCategoryValue()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_CategoryValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getChoreography <em>Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choreography</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getChoreography()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Choreography();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getCollaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collaboration</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getCollaboration()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Collaboration();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getChoreographyActivity <em>Choreography Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choreography Activity</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getChoreographyActivity()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ChoreographyActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getChoreographyTask <em>Choreography Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choreography Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getChoreographyTask()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ChoreographyTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getCompensateEventDefinition <em>Compensate Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compensate Event Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getCompensateEventDefinition()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_CompensateEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getComplexBehaviorDefinition <em>Complex Behavior Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Behavior Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getComplexBehaviorDefinition()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ComplexBehaviorDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getComplexGateway <em>Complex Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Complex Gateway</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getComplexGateway()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ComplexGateway();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getConditionalEventDefinition <em>Conditional Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conditional Event Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getConditionalEventDefinition()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ConditionalEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getConversation <em>Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conversation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getConversation()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Conversation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getConversationAssociation <em>Conversation Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conversation Association</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getConversationAssociation()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ConversationAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getConversationLink <em>Conversation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conversation Link</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getConversationLink()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ConversationLink();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getCorrelationKey <em>Correlation Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Key</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getCorrelationKey()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_CorrelationKey();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getCorrelationProperty <em>Correlation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Property</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getCorrelationProperty()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_CorrelationProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Property Binding</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getCorrelationPropertyBinding()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_CorrelationPropertyBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getCorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Property Retrieval Expression</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getCorrelationPropertyRetrievalExpression()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_CorrelationPropertyRetrievalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getCorrelationSubscription <em>Correlation Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Correlation Subscription</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getCorrelationSubscription()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_CorrelationSubscription();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getDataAssociation <em>Data Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Association</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getDataAssociation()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_DataAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getDataInput <em>Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Input</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getDataInput()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_DataInput();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getDataInputAssociation <em>Data Input Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Input Association</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getDataInputAssociation()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_DataInputAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getDataObject <em>Data Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Object</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getDataObject()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_DataObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getDataObjectReference <em>Data Object Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Object Reference</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getDataObjectReference()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_DataObjectReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getDataOutput <em>Data Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Output</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getDataOutput()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_DataOutput();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getDataOutputAssociation <em>Data Output Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Output Association</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getDataOutputAssociation()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_DataOutputAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getDataState <em>Data State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data State</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getDataState()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_DataState();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getDataStore <em>Data Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Store</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getDataStore()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_DataStore();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getDataStoreReference <em>Data Store Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Store Reference</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getDataStoreReference()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_DataStoreReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definitions</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getDefinitions()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Definitions();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Documentation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getDocumentation()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getEndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Event</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getEndEvent()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_EndEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getEndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Point</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getEndPoint()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_EndPoint();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getError()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Error();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getErrorEventDefinition <em>Error Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Event Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getErrorEventDefinition()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ErrorEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getEscalation <em>Escalation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Escalation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getEscalation()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Escalation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getEscalationEventDefinition <em>Escalation Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Escalation Event Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getEscalationEventDefinition()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_EscalationEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getEvent()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Event();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getEventBasedGateway <em>Event Based Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event Based Gateway</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getEventBasedGateway()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_EventBasedGateway();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getExclusiveGateway <em>Exclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclusive Gateway</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getExclusiveGateway()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ExclusiveGateway();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getExpression()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getExtension()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Extension();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getExtensionElements <em>Extension Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension Elements</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getExtensionElements()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ExtensionElements();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getFlowNode <em>Flow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Flow Node</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getFlowNode()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_FlowNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getFormalExpression <em>Formal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formal Expression</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getFormalExpression()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_FormalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gateway</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getGateway()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Gateway();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getGlobalBusinessRuleTask <em>Global Business Rule Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Business Rule Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getGlobalBusinessRuleTask()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_GlobalBusinessRuleTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getGlobalChoreographyTask <em>Global Choreography Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Choreography Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getGlobalChoreographyTask()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_GlobalChoreographyTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getGlobalConversation <em>Global Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Conversation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getGlobalConversation()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_GlobalConversation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getGlobalManualTask <em>Global Manual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Manual Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getGlobalManualTask()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_GlobalManualTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getGlobalScriptTask <em>Global Script Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Script Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getGlobalScriptTask()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_GlobalScriptTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getGlobalTask <em>Global Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getGlobalTask()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_GlobalTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getGlobalUserTask <em>Global User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global User Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getGlobalUserTask()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_GlobalUserTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getGroup()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Group();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getHumanPerformer <em>Human Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Human Performer</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getHumanPerformer()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_HumanPerformer();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getPerformer <em>Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Performer</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getPerformer()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Performer();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getResourceRole <em>Resource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Role</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getResourceRole()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ResourceRole();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getImplicitThrowEvent <em>Implicit Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implicit Throw Event</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getImplicitThrowEvent()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ImplicitThrowEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Import</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getImport()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Import();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getInclusiveGateway <em>Inclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inclusive Gateway</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getInclusiveGateway()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_InclusiveGateway();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getInputSet <em>Input Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Set</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getInputSet()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_InputSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interface</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getInterface()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Interface();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getIntermediateCatchEvent <em>Intermediate Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Intermediate Catch Event</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getIntermediateCatchEvent()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_IntermediateCatchEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getIntermediateThrowEvent <em>Intermediate Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Intermediate Throw Event</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getIntermediateThrowEvent()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_IntermediateThrowEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getIoBinding <em>Io Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Io Binding</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getIoBinding()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_IoBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getIoSpecification <em>Io Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Io Specification</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getIoSpecification()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_IoSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getItemDefinition <em>Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getItemDefinition()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ItemDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getLane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lane</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getLane()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Lane();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getLaneSet <em>Lane Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lane Set</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getLaneSet()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_LaneSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getLinkEventDefinition <em>Link Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link Event Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getLinkEventDefinition()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_LinkEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getLoopCharacteristics <em>Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Characteristics</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getLoopCharacteristics()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_LoopCharacteristics();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getManualTask <em>Manual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manual Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getManualTask()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ManualTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getMessage()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Message();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getMessageEventDefinition <em>Message Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Event Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getMessageEventDefinition()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_MessageEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getMessageFlow <em>Message Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Flow</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getMessageFlow()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_MessageFlow();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getMessageFlowAssociation <em>Message Flow Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Flow Association</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getMessageFlowAssociation()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_MessageFlowAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getMonitoring <em>Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Monitoring</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getMonitoring()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Monitoring();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getMultiInstanceLoopCharacteristics <em>Multi Instance Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multi Instance Loop Characteristics</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getMultiInstanceLoopCharacteristics()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_MultiInstanceLoopCharacteristics();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getOperation()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Operation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getOutputSet <em>Output Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Set</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getOutputSet()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_OutputSet();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getParallelGateway <em>Parallel Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parallel Gateway</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getParallelGateway()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ParallelGateway();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Participant</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getParticipant()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Participant();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getParticipantAssociation <em>Participant Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Participant Association</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getParticipantAssociation()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ParticipantAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getParticipantMultiplicity <em>Participant Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Participant Multiplicity</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getParticipantMultiplicity()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ParticipantMultiplicity();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getPartnerEntity <em>Partner Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partner Entity</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getPartnerEntity()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_PartnerEntity();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getPartnerRole <em>Partner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partner Role</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getPartnerRole()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_PartnerRole();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getPotentialOwner <em>Potential Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Potential Owner</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getPotentialOwner()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_PotentialOwner();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getProcess()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Process();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getProperty()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Property();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getReceiveTask <em>Receive Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receive Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getReceiveTask()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ReceiveTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relationship</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getRelationship()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Relationship();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getRendering <em>Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rendering</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getRendering()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Rendering();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getResource()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Resource();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Assignment Expression</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getResourceAssignmentExpression()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ResourceAssignmentExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getResourceParameter <em>Resource Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Parameter</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getResourceParameter()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ResourceParameter();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getResourceParameterBinding <em>Resource Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Parameter Binding</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getResourceParameterBinding()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ResourceParameterBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getScript()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Script();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getScriptTask <em>Script Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getScriptTask()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ScriptTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getSendTask <em>Send Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Send Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getSendTask()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_SendTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getSequenceFlow <em>Sequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sequence Flow</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getSequenceFlow()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_SequenceFlow();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getServiceTask <em>Service Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getServiceTask()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ServiceTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getSignal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getSignal()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Signal();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getSignalEventDefinition <em>Signal Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signal Event Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getSignalEventDefinition()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_SignalEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getStandardLoopCharacteristics <em>Standard Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Standard Loop Characteristics</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getStandardLoopCharacteristics()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_StandardLoopCharacteristics();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getStartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Event</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getStartEvent()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_StartEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getSubChoreography <em>Sub Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Choreography</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getSubChoreography()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_SubChoreography();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getSubConversation <em>Sub Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Conversation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getSubConversation()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_SubConversation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getSubProcess <em>Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Process</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getSubProcess()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_SubProcess();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getTask()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Task();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getTerminateEventDefinition <em>Terminate Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Terminate Event Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getTerminateEventDefinition()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_TerminateEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getText()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getTextAnnotation <em>Text Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Annotation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getTextAnnotation()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_TextAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getThrowEvent <em>Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Throw Event</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getThrowEvent()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_ThrowEvent();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getTimerEventDefinition <em>Timer Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Timer Event Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getTimerEventDefinition()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_TimerEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getTransaction()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_Transaction();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.BPMNRoot#getUserTask <em>User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.BPMNRoot#getUserTask()
	 * @see #getBPMNRoot()
	 * @generated
	 */
	EReference getBPMNRoot_UserTask();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TActivity <em>TActivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TActivity</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TActivity
	 * @generated
	 */
	EClass getTActivity();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TActivity#getIoSpecification <em>Io Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Io Specification</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TActivity#getIoSpecification()
	 * @see #getTActivity()
	 * @generated
	 */
	EReference getTActivity_IoSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TActivity#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TActivity#getProperty()
	 * @see #getTActivity()
	 * @generated
	 */
	EReference getTActivity_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TActivity#getDataInputAssociation <em>Data Input Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Input Association</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TActivity#getDataInputAssociation()
	 * @see #getTActivity()
	 * @generated
	 */
	EReference getTActivity_DataInputAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TActivity#getDataOutputAssociation <em>Data Output Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Output Association</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TActivity#getDataOutputAssociation()
	 * @see #getTActivity()
	 * @generated
	 */
	EReference getTActivity_DataOutputAssociation();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TActivity#getResourceRoleGroup <em>Resource Role Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Resource Role Group</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TActivity#getResourceRoleGroup()
	 * @see #getTActivity()
	 * @generated
	 */
	EAttribute getTActivity_ResourceRoleGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TActivity#getResourceRole <em>Resource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Role</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TActivity#getResourceRole()
	 * @see #getTActivity()
	 * @generated
	 */
	EReference getTActivity_ResourceRole();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TActivity#getLoopCharacteristicsGroup <em>Loop Characteristics Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Loop Characteristics Group</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TActivity#getLoopCharacteristicsGroup()
	 * @see #getTActivity()
	 * @generated
	 */
	EAttribute getTActivity_LoopCharacteristicsGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TActivity#getLoopCharacteristics <em>Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Characteristics</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TActivity#getLoopCharacteristics()
	 * @see #getTActivity()
	 * @generated
	 */
	EReference getTActivity_LoopCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TActivity#getCompletionQuantity <em>Completion Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completion Quantity</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TActivity#getCompletionQuantity()
	 * @see #getTActivity()
	 * @generated
	 */
	EAttribute getTActivity_CompletionQuantity();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TActivity#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TActivity#getDefault()
	 * @see #getTActivity()
	 * @generated
	 */
	EAttribute getTActivity_Default();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TActivity#isIsForCompensation <em>Is For Compensation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is For Compensation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TActivity#isIsForCompensation()
	 * @see #getTActivity()
	 * @generated
	 */
	EAttribute getTActivity_IsForCompensation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TActivity#getStartQuantity <em>Start Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Quantity</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TActivity#getStartQuantity()
	 * @see #getTActivity()
	 * @generated
	 */
	EAttribute getTActivity_StartQuantity();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TAdHocSubProcess <em>TAd Hoc Sub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAd Hoc Sub Process</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TAdHocSubProcess
	 * @generated
	 */
	EClass getTAdHocSubProcess();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TAdHocSubProcess#getCompletionCondition <em>Completion Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Completion Condition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TAdHocSubProcess#getCompletionCondition()
	 * @see #getTAdHocSubProcess()
	 * @generated
	 */
	EReference getTAdHocSubProcess_CompletionCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TAdHocSubProcess#isCancelRemainingInstances <em>Cancel Remaining Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Remaining Instances</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TAdHocSubProcess#isCancelRemainingInstances()
	 * @see #getTAdHocSubProcess()
	 * @generated
	 */
	EAttribute getTAdHocSubProcess_CancelRemainingInstances();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TAdHocSubProcess#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordering</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TAdHocSubProcess#getOrdering()
	 * @see #getTAdHocSubProcess()
	 * @generated
	 */
	EAttribute getTAdHocSubProcess_Ordering();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TArtifact <em>TArtifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TArtifact</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TArtifact
	 * @generated
	 */
	EClass getTArtifact();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TAssignment <em>TAssignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAssignment</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TAssignment
	 * @generated
	 */
	EClass getTAssignment();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TAssignment#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TAssignment#getFrom()
	 * @see #getTAssignment()
	 * @generated
	 */
	EReference getTAssignment_From();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TAssignment#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TAssignment#getTo()
	 * @see #getTAssignment()
	 * @generated
	 */
	EReference getTAssignment_To();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TAssociation <em>TAssociation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAssociation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TAssociation
	 * @generated
	 */
	EClass getTAssociation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TAssociation#getAssociationDirection <em>Association Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Direction</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TAssociation#getAssociationDirection()
	 * @see #getTAssociation()
	 * @generated
	 */
	EAttribute getTAssociation_AssociationDirection();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TAssociation#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TAssociation#getSourceRef()
	 * @see #getTAssociation()
	 * @generated
	 */
	EAttribute getTAssociation_SourceRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TAssociation#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TAssociation#getTargetRef()
	 * @see #getTAssociation()
	 * @generated
	 */
	EAttribute getTAssociation_TargetRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TAuditing <em>TAuditing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAuditing</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TAuditing
	 * @generated
	 */
	EClass getTAuditing();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TBaseElement <em>TBase Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TBase Element</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TBaseElement
	 * @generated
	 */
	EClass getTBaseElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TBaseElement#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TBaseElement#getDocumentation()
	 * @see #getTBaseElement()
	 * @generated
	 */
	EReference getTBaseElement_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TBaseElement#getExtensionElements <em>Extension Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension Elements</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TBaseElement#getExtensionElements()
	 * @see #getTBaseElement()
	 * @generated
	 */
	EReference getTBaseElement_ExtensionElements();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TBaseElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TBaseElement#getId()
	 * @see #getTBaseElement()
	 * @generated
	 */
	EAttribute getTBaseElement_Id();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TBaseElement#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TBaseElement#getAnyAttribute()
	 * @see #getTBaseElement()
	 * @generated
	 */
	EAttribute getTBaseElement_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TBaseElementWithMixedContent <em>TBase Element With Mixed Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TBase Element With Mixed Content</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TBaseElementWithMixedContent
	 * @generated
	 */
	EClass getTBaseElementWithMixedContent();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TBaseElementWithMixedContent#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TBaseElementWithMixedContent#getMixed()
	 * @see #getTBaseElementWithMixedContent()
	 * @generated
	 */
	EAttribute getTBaseElementWithMixedContent_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TBaseElementWithMixedContent#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TBaseElementWithMixedContent#getDocumentation()
	 * @see #getTBaseElementWithMixedContent()
	 * @generated
	 */
	EReference getTBaseElementWithMixedContent_Documentation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TBaseElementWithMixedContent#getExtensionElements <em>Extension Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension Elements</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TBaseElementWithMixedContent#getExtensionElements()
	 * @see #getTBaseElementWithMixedContent()
	 * @generated
	 */
	EReference getTBaseElementWithMixedContent_ExtensionElements();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TBaseElementWithMixedContent#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TBaseElementWithMixedContent#getId()
	 * @see #getTBaseElementWithMixedContent()
	 * @generated
	 */
	EAttribute getTBaseElementWithMixedContent_Id();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TBaseElementWithMixedContent#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TBaseElementWithMixedContent#getAnyAttribute()
	 * @see #getTBaseElementWithMixedContent()
	 * @generated
	 */
	EAttribute getTBaseElementWithMixedContent_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TBoundaryEvent <em>TBoundary Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TBoundary Event</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TBoundaryEvent
	 * @generated
	 */
	EClass getTBoundaryEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TBoundaryEvent#getAttachedToRef <em>Attached To Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attached To Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TBoundaryEvent#getAttachedToRef()
	 * @see #getTBoundaryEvent()
	 * @generated
	 */
	EAttribute getTBoundaryEvent_AttachedToRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TBoundaryEvent#isCancelActivity <em>Cancel Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Activity</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TBoundaryEvent#isCancelActivity()
	 * @see #getTBoundaryEvent()
	 * @generated
	 */
	EAttribute getTBoundaryEvent_CancelActivity();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TBusinessRuleTask <em>TBusiness Rule Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TBusiness Rule Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TBusinessRuleTask
	 * @generated
	 */
	EClass getTBusinessRuleTask();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TBusinessRuleTask#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TBusinessRuleTask#getImplementation()
	 * @see #getTBusinessRuleTask()
	 * @generated
	 */
	EAttribute getTBusinessRuleTask_Implementation();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TCallableElement <em>TCallable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCallable Element</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCallableElement
	 * @generated
	 */
	EClass getTCallableElement();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TCallableElement#getSupportedInterfaceRef <em>Supported Interface Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supported Interface Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCallableElement#getSupportedInterfaceRef()
	 * @see #getTCallableElement()
	 * @generated
	 */
	EAttribute getTCallableElement_SupportedInterfaceRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TCallableElement#getIoSpecification <em>Io Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Io Specification</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCallableElement#getIoSpecification()
	 * @see #getTCallableElement()
	 * @generated
	 */
	EReference getTCallableElement_IoSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TCallableElement#getIoBinding <em>Io Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Io Binding</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCallableElement#getIoBinding()
	 * @see #getTCallableElement()
	 * @generated
	 */
	EReference getTCallableElement_IoBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TCallableElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCallableElement#getName()
	 * @see #getTCallableElement()
	 * @generated
	 */
	EAttribute getTCallableElement_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TCallActivity <em>TCall Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCall Activity</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCallActivity
	 * @generated
	 */
	EClass getTCallActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TCallActivity#getCalledElement <em>Called Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Called Element</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCallActivity#getCalledElement()
	 * @see #getTCallActivity()
	 * @generated
	 */
	EAttribute getTCallActivity_CalledElement();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TCallChoreography <em>TCall Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCall Choreography</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCallChoreography
	 * @generated
	 */
	EClass getTCallChoreography();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TCallChoreography#getParticipantAssociation <em>Participant Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant Association</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCallChoreography#getParticipantAssociation()
	 * @see #getTCallChoreography()
	 * @generated
	 */
	EReference getTCallChoreography_ParticipantAssociation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TCallChoreography#getCalledChoreographyRef <em>Called Choreography Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Called Choreography Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCallChoreography#getCalledChoreographyRef()
	 * @see #getTCallChoreography()
	 * @generated
	 */
	EAttribute getTCallChoreography_CalledChoreographyRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TCallConversation <em>TCall Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCall Conversation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCallConversation
	 * @generated
	 */
	EClass getTCallConversation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TCallConversation#getParticipantAssociation <em>Participant Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant Association</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCallConversation#getParticipantAssociation()
	 * @see #getTCallConversation()
	 * @generated
	 */
	EReference getTCallConversation_ParticipantAssociation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TCallConversation#getCalledCollaborationRef <em>Called Collaboration Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Called Collaboration Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCallConversation#getCalledCollaborationRef()
	 * @see #getTCallConversation()
	 * @generated
	 */
	EAttribute getTCallConversation_CalledCollaborationRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TCancelEventDefinition <em>TCancel Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCancel Event Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCancelEventDefinition
	 * @generated
	 */
	EClass getTCancelEventDefinition();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TCatchEvent <em>TCatch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCatch Event</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCatchEvent
	 * @generated
	 */
	EClass getTCatchEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TCatchEvent#getDataOutput <em>Data Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Output</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCatchEvent#getDataOutput()
	 * @see #getTCatchEvent()
	 * @generated
	 */
	EReference getTCatchEvent_DataOutput();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TCatchEvent#getDataOutputAssociation <em>Data Output Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Output Association</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCatchEvent#getDataOutputAssociation()
	 * @see #getTCatchEvent()
	 * @generated
	 */
	EReference getTCatchEvent_DataOutputAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TCatchEvent#getOutputSet <em>Output Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Set</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCatchEvent#getOutputSet()
	 * @see #getTCatchEvent()
	 * @generated
	 */
	EReference getTCatchEvent_OutputSet();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TCatchEvent#getEventDefinitionGroup <em>Event Definition Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Event Definition Group</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCatchEvent#getEventDefinitionGroup()
	 * @see #getTCatchEvent()
	 * @generated
	 */
	EAttribute getTCatchEvent_EventDefinitionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TCatchEvent#getEventDefinition <em>Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCatchEvent#getEventDefinition()
	 * @see #getTCatchEvent()
	 * @generated
	 */
	EReference getTCatchEvent_EventDefinition();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TCatchEvent#getEventDefinitionRef <em>Event Definition Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Event Definition Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCatchEvent#getEventDefinitionRef()
	 * @see #getTCatchEvent()
	 * @generated
	 */
	EAttribute getTCatchEvent_EventDefinitionRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TCatchEvent#isParallelMultiple <em>Parallel Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallel Multiple</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCatchEvent#isParallelMultiple()
	 * @see #getTCatchEvent()
	 * @generated
	 */
	EAttribute getTCatchEvent_ParallelMultiple();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TCategory <em>TCategory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCategory</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCategory
	 * @generated
	 */
	EClass getTCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TCategory#getCategoryValue <em>Category Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category Value</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCategory#getCategoryValue()
	 * @see #getTCategory()
	 * @generated
	 */
	EReference getTCategory_CategoryValue();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TCategory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCategory#getName()
	 * @see #getTCategory()
	 * @generated
	 */
	EAttribute getTCategory_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TCategoryValue <em>TCategory Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCategory Value</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCategoryValue
	 * @generated
	 */
	EClass getTCategoryValue();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TCategoryValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCategoryValue#getValue()
	 * @see #getTCategoryValue()
	 * @generated
	 */
	EAttribute getTCategoryValue_Value();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TChoreography <em>TChoreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TChoreography</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TChoreography
	 * @generated
	 */
	EClass getTChoreography();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TChoreography#getFlowElementGroup <em>Flow Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Flow Element Group</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TChoreography#getFlowElementGroup()
	 * @see #getTChoreography()
	 * @generated
	 */
	EAttribute getTChoreography_FlowElementGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TChoreography#getFlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Element</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TChoreography#getFlowElement()
	 * @see #getTChoreography()
	 * @generated
	 */
	EReference getTChoreography_FlowElement();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TChoreographyActivity <em>TChoreography Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TChoreography Activity</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TChoreographyActivity
	 * @generated
	 */
	EClass getTChoreographyActivity();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TChoreographyActivity#getParticipantRef <em>Participant Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Participant Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TChoreographyActivity#getParticipantRef()
	 * @see #getTChoreographyActivity()
	 * @generated
	 */
	EAttribute getTChoreographyActivity_ParticipantRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TChoreographyActivity#getCorrelationKey <em>Correlation Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation Key</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TChoreographyActivity#getCorrelationKey()
	 * @see #getTChoreographyActivity()
	 * @generated
	 */
	EReference getTChoreographyActivity_CorrelationKey();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TChoreographyActivity#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiating Participant Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TChoreographyActivity#getInitiatingParticipantRef()
	 * @see #getTChoreographyActivity()
	 * @generated
	 */
	EAttribute getTChoreographyActivity_InitiatingParticipantRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TChoreographyActivity#getLoopType <em>Loop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Type</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TChoreographyActivity#getLoopType()
	 * @see #getTChoreographyActivity()
	 * @generated
	 */
	EAttribute getTChoreographyActivity_LoopType();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TChoreographyTask <em>TChoreography Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TChoreography Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TChoreographyTask
	 * @generated
	 */
	EClass getTChoreographyTask();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TChoreographyTask#getMessageFlowRef <em>Message Flow Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Message Flow Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TChoreographyTask#getMessageFlowRef()
	 * @see #getTChoreographyTask()
	 * @generated
	 */
	EAttribute getTChoreographyTask_MessageFlowRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TCollaboration <em>TCollaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCollaboration</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCollaboration
	 * @generated
	 */
	EClass getTCollaboration();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TCollaboration#getParticipant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCollaboration#getParticipant()
	 * @see #getTCollaboration()
	 * @generated
	 */
	EReference getTCollaboration_Participant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TCollaboration#getMessageFlow <em>Message Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Flow</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCollaboration#getMessageFlow()
	 * @see #getTCollaboration()
	 * @generated
	 */
	EReference getTCollaboration_MessageFlow();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TCollaboration#getArtifactGroup <em>Artifact Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Artifact Group</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCollaboration#getArtifactGroup()
	 * @see #getTCollaboration()
	 * @generated
	 */
	EAttribute getTCollaboration_ArtifactGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TCollaboration#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCollaboration#getArtifact()
	 * @see #getTCollaboration()
	 * @generated
	 */
	EReference getTCollaboration_Artifact();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TCollaboration#getConversationNodeGroup <em>Conversation Node Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Conversation Node Group</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCollaboration#getConversationNodeGroup()
	 * @see #getTCollaboration()
	 * @generated
	 */
	EAttribute getTCollaboration_ConversationNodeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TCollaboration#getConversationNode <em>Conversation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conversation Node</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCollaboration#getConversationNode()
	 * @see #getTCollaboration()
	 * @generated
	 */
	EReference getTCollaboration_ConversationNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TCollaboration#getConversationAssociation <em>Conversation Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conversation Association</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCollaboration#getConversationAssociation()
	 * @see #getTCollaboration()
	 * @generated
	 */
	EReference getTCollaboration_ConversationAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TCollaboration#getParticipantAssociation <em>Participant Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participant Association</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCollaboration#getParticipantAssociation()
	 * @see #getTCollaboration()
	 * @generated
	 */
	EReference getTCollaboration_ParticipantAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TCollaboration#getMessageFlowAssociation <em>Message Flow Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message Flow Association</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCollaboration#getMessageFlowAssociation()
	 * @see #getTCollaboration()
	 * @generated
	 */
	EReference getTCollaboration_MessageFlowAssociation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TCollaboration#getCorrelationKey <em>Correlation Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation Key</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCollaboration#getCorrelationKey()
	 * @see #getTCollaboration()
	 * @generated
	 */
	EReference getTCollaboration_CorrelationKey();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TCollaboration#getChoreographyRef <em>Choreography Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Choreography Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCollaboration#getChoreographyRef()
	 * @see #getTCollaboration()
	 * @generated
	 */
	EAttribute getTCollaboration_ChoreographyRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TCollaboration#getConversationLink <em>Conversation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conversation Link</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCollaboration#getConversationLink()
	 * @see #getTCollaboration()
	 * @generated
	 */
	EReference getTCollaboration_ConversationLink();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TCollaboration#isIsClosed <em>Is Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Closed</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCollaboration#isIsClosed()
	 * @see #getTCollaboration()
	 * @generated
	 */
	EAttribute getTCollaboration_IsClosed();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TCollaboration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCollaboration#getName()
	 * @see #getTCollaboration()
	 * @generated
	 */
	EAttribute getTCollaboration_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TCompensateEventDefinition <em>TCompensate Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCompensate Event Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCompensateEventDefinition
	 * @generated
	 */
	EClass getTCompensateEventDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TCompensateEventDefinition#getActivityRef <em>Activity Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activity Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCompensateEventDefinition#getActivityRef()
	 * @see #getTCompensateEventDefinition()
	 * @generated
	 */
	EAttribute getTCompensateEventDefinition_ActivityRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TCompensateEventDefinition#isWaitForCompletion <em>Wait For Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wait For Completion</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCompensateEventDefinition#isWaitForCompletion()
	 * @see #getTCompensateEventDefinition()
	 * @generated
	 */
	EAttribute getTCompensateEventDefinition_WaitForCompletion();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TComplexBehaviorDefinition <em>TComplex Behavior Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TComplex Behavior Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TComplexBehaviorDefinition
	 * @generated
	 */
	EClass getTComplexBehaviorDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TComplexBehaviorDefinition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TComplexBehaviorDefinition#getCondition()
	 * @see #getTComplexBehaviorDefinition()
	 * @generated
	 */
	EReference getTComplexBehaviorDefinition_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TComplexBehaviorDefinition#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TComplexBehaviorDefinition#getEvent()
	 * @see #getTComplexBehaviorDefinition()
	 * @generated
	 */
	EReference getTComplexBehaviorDefinition_Event();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TComplexGateway <em>TComplex Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TComplex Gateway</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TComplexGateway
	 * @generated
	 */
	EClass getTComplexGateway();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TComplexGateway#getActivationCondition <em>Activation Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation Condition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TComplexGateway#getActivationCondition()
	 * @see #getTComplexGateway()
	 * @generated
	 */
	EReference getTComplexGateway_ActivationCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TComplexGateway#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TComplexGateway#getDefault()
	 * @see #getTComplexGateway()
	 * @generated
	 */
	EAttribute getTComplexGateway_Default();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TConditionalEventDefinition <em>TConditional Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TConditional Event Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TConditionalEventDefinition
	 * @generated
	 */
	EClass getTConditionalEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TConditionalEventDefinition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TConditionalEventDefinition#getCondition()
	 * @see #getTConditionalEventDefinition()
	 * @generated
	 */
	EReference getTConditionalEventDefinition_Condition();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TConversation <em>TConversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TConversation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TConversation
	 * @generated
	 */
	EClass getTConversation();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TConversationAssociation <em>TConversation Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TConversation Association</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TConversationAssociation
	 * @generated
	 */
	EClass getTConversationAssociation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TConversationAssociation#getInnerConversationNodeRef <em>Inner Conversation Node Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inner Conversation Node Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TConversationAssociation#getInnerConversationNodeRef()
	 * @see #getTConversationAssociation()
	 * @generated
	 */
	EAttribute getTConversationAssociation_InnerConversationNodeRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TConversationAssociation#getOuterConversationNodeRef <em>Outer Conversation Node Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outer Conversation Node Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TConversationAssociation#getOuterConversationNodeRef()
	 * @see #getTConversationAssociation()
	 * @generated
	 */
	EAttribute getTConversationAssociation_OuterConversationNodeRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TConversationLink <em>TConversation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TConversation Link</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TConversationLink
	 * @generated
	 */
	EClass getTConversationLink();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TConversationLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TConversationLink#getName()
	 * @see #getTConversationLink()
	 * @generated
	 */
	EAttribute getTConversationLink_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TConversationLink#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TConversationLink#getSourceRef()
	 * @see #getTConversationLink()
	 * @generated
	 */
	EAttribute getTConversationLink_SourceRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TConversationLink#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TConversationLink#getTargetRef()
	 * @see #getTConversationLink()
	 * @generated
	 */
	EAttribute getTConversationLink_TargetRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TConversationNode <em>TConversation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TConversation Node</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TConversationNode
	 * @generated
	 */
	EClass getTConversationNode();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TConversationNode#getParticipantRef <em>Participant Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Participant Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TConversationNode#getParticipantRef()
	 * @see #getTConversationNode()
	 * @generated
	 */
	EAttribute getTConversationNode_ParticipantRef();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TConversationNode#getMessageFlowRef <em>Message Flow Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Message Flow Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TConversationNode#getMessageFlowRef()
	 * @see #getTConversationNode()
	 * @generated
	 */
	EAttribute getTConversationNode_MessageFlowRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TConversationNode#getCorrelationKey <em>Correlation Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation Key</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TConversationNode#getCorrelationKey()
	 * @see #getTConversationNode()
	 * @generated
	 */
	EReference getTConversationNode_CorrelationKey();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TConversationNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TConversationNode#getName()
	 * @see #getTConversationNode()
	 * @generated
	 */
	EAttribute getTConversationNode_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TCorrelationKey <em>TCorrelation Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCorrelation Key</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCorrelationKey
	 * @generated
	 */
	EClass getTCorrelationKey();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TCorrelationKey#getCorrelationPropertyRef <em>Correlation Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Correlation Property Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCorrelationKey#getCorrelationPropertyRef()
	 * @see #getTCorrelationKey()
	 * @generated
	 */
	EAttribute getTCorrelationKey_CorrelationPropertyRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TCorrelationKey#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCorrelationKey#getName()
	 * @see #getTCorrelationKey()
	 * @generated
	 */
	EAttribute getTCorrelationKey_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TCorrelationProperty <em>TCorrelation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCorrelation Property</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCorrelationProperty
	 * @generated
	 */
	EClass getTCorrelationProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TCorrelationProperty#getCorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation Property Retrieval Expression</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCorrelationProperty#getCorrelationPropertyRetrievalExpression()
	 * @see #getTCorrelationProperty()
	 * @generated
	 */
	EReference getTCorrelationProperty_CorrelationPropertyRetrievalExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TCorrelationProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCorrelationProperty#getName()
	 * @see #getTCorrelationProperty()
	 * @generated
	 */
	EAttribute getTCorrelationProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TCorrelationProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCorrelationProperty#getType()
	 * @see #getTCorrelationProperty()
	 * @generated
	 */
	EAttribute getTCorrelationProperty_Type();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TCorrelationPropertyBinding <em>TCorrelation Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCorrelation Property Binding</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCorrelationPropertyBinding
	 * @generated
	 */
	EClass getTCorrelationPropertyBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TCorrelationPropertyBinding#getDataPath <em>Data Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Path</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCorrelationPropertyBinding#getDataPath()
	 * @see #getTCorrelationPropertyBinding()
	 * @generated
	 */
	EReference getTCorrelationPropertyBinding_DataPath();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TCorrelationPropertyBinding#getCorrelationPropertyRef <em>Correlation Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correlation Property Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCorrelationPropertyBinding#getCorrelationPropertyRef()
	 * @see #getTCorrelationPropertyBinding()
	 * @generated
	 */
	EAttribute getTCorrelationPropertyBinding_CorrelationPropertyRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TCorrelationPropertyRetrievalExpression <em>TCorrelation Property Retrieval Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCorrelation Property Retrieval Expression</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCorrelationPropertyRetrievalExpression
	 * @generated
	 */
	EClass getTCorrelationPropertyRetrievalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TCorrelationPropertyRetrievalExpression#getMessagePath <em>Message Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Message Path</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCorrelationPropertyRetrievalExpression#getMessagePath()
	 * @see #getTCorrelationPropertyRetrievalExpression()
	 * @generated
	 */
	EReference getTCorrelationPropertyRetrievalExpression_MessagePath();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TCorrelationPropertyRetrievalExpression#getMessageRef <em>Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCorrelationPropertyRetrievalExpression#getMessageRef()
	 * @see #getTCorrelationPropertyRetrievalExpression()
	 * @generated
	 */
	EAttribute getTCorrelationPropertyRetrievalExpression_MessageRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TCorrelationSubscription <em>TCorrelation Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCorrelation Subscription</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCorrelationSubscription
	 * @generated
	 */
	EClass getTCorrelationSubscription();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TCorrelationSubscription#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation Property Binding</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCorrelationSubscription#getCorrelationPropertyBinding()
	 * @see #getTCorrelationSubscription()
	 * @generated
	 */
	EReference getTCorrelationSubscription_CorrelationPropertyBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TCorrelationSubscription#getCorrelationKeyRef <em>Correlation Key Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correlation Key Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TCorrelationSubscription#getCorrelationKeyRef()
	 * @see #getTCorrelationSubscription()
	 * @generated
	 */
	EAttribute getTCorrelationSubscription_CorrelationKeyRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TDataAssociation <em>TData Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TData Association</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataAssociation
	 * @generated
	 */
	EClass getTDataAssociation();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TDataAssociation#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Source Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataAssociation#getSourceRef()
	 * @see #getTDataAssociation()
	 * @generated
	 */
	EAttribute getTDataAssociation_SourceRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDataAssociation#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataAssociation#getTargetRef()
	 * @see #getTDataAssociation()
	 * @generated
	 */
	EAttribute getTDataAssociation_TargetRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TDataAssociation#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transformation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataAssociation#getTransformation()
	 * @see #getTDataAssociation()
	 * @generated
	 */
	EReference getTDataAssociation_Transformation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TDataAssociation#getAssignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignment</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataAssociation#getAssignment()
	 * @see #getTDataAssociation()
	 * @generated
	 */
	EReference getTDataAssociation_Assignment();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TDataInput <em>TData Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TData Input</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataInput
	 * @generated
	 */
	EClass getTDataInput();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TDataInput#getDataState <em>Data State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data State</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataInput#getDataState()
	 * @see #getTDataInput()
	 * @generated
	 */
	EReference getTDataInput_DataState();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDataInput#isIsCollection <em>Is Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Collection</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataInput#isIsCollection()
	 * @see #getTDataInput()
	 * @generated
	 */
	EAttribute getTDataInput_IsCollection();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDataInput#getItemSubjectRef <em>Item Subject Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Subject Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataInput#getItemSubjectRef()
	 * @see #getTDataInput()
	 * @generated
	 */
	EAttribute getTDataInput_ItemSubjectRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDataInput#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataInput#getName()
	 * @see #getTDataInput()
	 * @generated
	 */
	EAttribute getTDataInput_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TDataInputAssociation <em>TData Input Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TData Input Association</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataInputAssociation
	 * @generated
	 */
	EClass getTDataInputAssociation();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TDataObject <em>TData Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TData Object</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataObject
	 * @generated
	 */
	EClass getTDataObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TDataObject#getDataState <em>Data State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data State</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataObject#getDataState()
	 * @see #getTDataObject()
	 * @generated
	 */
	EReference getTDataObject_DataState();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDataObject#isIsCollection <em>Is Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Collection</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataObject#isIsCollection()
	 * @see #getTDataObject()
	 * @generated
	 */
	EAttribute getTDataObject_IsCollection();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDataObject#getItemSubjectRef <em>Item Subject Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Subject Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataObject#getItemSubjectRef()
	 * @see #getTDataObject()
	 * @generated
	 */
	EAttribute getTDataObject_ItemSubjectRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TDataObjectReference <em>TData Object Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TData Object Reference</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataObjectReference
	 * @generated
	 */
	EClass getTDataObjectReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TDataObjectReference#getDataState <em>Data State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data State</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataObjectReference#getDataState()
	 * @see #getTDataObjectReference()
	 * @generated
	 */
	EReference getTDataObjectReference_DataState();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDataObjectReference#getDataObjectRef <em>Data Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Object Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataObjectReference#getDataObjectRef()
	 * @see #getTDataObjectReference()
	 * @generated
	 */
	EAttribute getTDataObjectReference_DataObjectRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDataObjectReference#getItemSubjectRef <em>Item Subject Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Subject Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataObjectReference#getItemSubjectRef()
	 * @see #getTDataObjectReference()
	 * @generated
	 */
	EAttribute getTDataObjectReference_ItemSubjectRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TDataOutput <em>TData Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TData Output</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataOutput
	 * @generated
	 */
	EClass getTDataOutput();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TDataOutput#getDataState <em>Data State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data State</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataOutput#getDataState()
	 * @see #getTDataOutput()
	 * @generated
	 */
	EReference getTDataOutput_DataState();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDataOutput#isIsCollection <em>Is Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Collection</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataOutput#isIsCollection()
	 * @see #getTDataOutput()
	 * @generated
	 */
	EAttribute getTDataOutput_IsCollection();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDataOutput#getItemSubjectRef <em>Item Subject Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Subject Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataOutput#getItemSubjectRef()
	 * @see #getTDataOutput()
	 * @generated
	 */
	EAttribute getTDataOutput_ItemSubjectRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDataOutput#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataOutput#getName()
	 * @see #getTDataOutput()
	 * @generated
	 */
	EAttribute getTDataOutput_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TDataOutputAssociation <em>TData Output Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TData Output Association</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataOutputAssociation
	 * @generated
	 */
	EClass getTDataOutputAssociation();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TDataState <em>TData State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TData State</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataState
	 * @generated
	 */
	EClass getTDataState();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDataState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataState#getName()
	 * @see #getTDataState()
	 * @generated
	 */
	EAttribute getTDataState_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TDataStore <em>TData Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TData Store</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataStore
	 * @generated
	 */
	EClass getTDataStore();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TDataStore#getDataState <em>Data State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data State</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataStore#getDataState()
	 * @see #getTDataStore()
	 * @generated
	 */
	EReference getTDataStore_DataState();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDataStore#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataStore#getCapacity()
	 * @see #getTDataStore()
	 * @generated
	 */
	EAttribute getTDataStore_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDataStore#isIsUnlimited <em>Is Unlimited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Unlimited</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataStore#isIsUnlimited()
	 * @see #getTDataStore()
	 * @generated
	 */
	EAttribute getTDataStore_IsUnlimited();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDataStore#getItemSubjectRef <em>Item Subject Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Subject Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataStore#getItemSubjectRef()
	 * @see #getTDataStore()
	 * @generated
	 */
	EAttribute getTDataStore_ItemSubjectRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDataStore#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataStore#getName()
	 * @see #getTDataStore()
	 * @generated
	 */
	EAttribute getTDataStore_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TDataStoreReference <em>TData Store Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TData Store Reference</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataStoreReference
	 * @generated
	 */
	EClass getTDataStoreReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TDataStoreReference#getDataState <em>Data State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data State</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataStoreReference#getDataState()
	 * @see #getTDataStoreReference()
	 * @generated
	 */
	EReference getTDataStoreReference_DataState();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDataStoreReference#getDataStoreRef <em>Data Store Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Store Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataStoreReference#getDataStoreRef()
	 * @see #getTDataStoreReference()
	 * @generated
	 */
	EAttribute getTDataStoreReference_DataStoreRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDataStoreReference#getItemSubjectRef <em>Item Subject Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Subject Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDataStoreReference#getItemSubjectRef()
	 * @see #getTDataStoreReference()
	 * @generated
	 */
	EAttribute getTDataStoreReference_ItemSubjectRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TDefinitions <em>TDefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDefinitions</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDefinitions
	 * @generated
	 */
	EClass getTDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TDefinitions#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDefinitions#getImport()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_Import();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TDefinitions#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extension</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDefinitions#getExtension()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_Extension();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TDefinitions#getRootElementGroup <em>Root Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Root Element Group</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDefinitions#getRootElementGroup()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_RootElementGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TDefinitions#getRootElement <em>Root Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Element</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDefinitions#getRootElement()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_RootElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TDefinitions#getBPMNDiagram <em>BPMN Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BPMN Diagram</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDefinitions#getBPMNDiagram()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_BPMNDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TDefinitions#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDefinitions#getRelationship()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_Relationship();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDefinitions#getExporter <em>Exporter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exporter</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDefinitions#getExporter()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_Exporter();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDefinitions#getExporterVersion <em>Exporter Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exporter Version</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDefinitions#getExporterVersion()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_ExporterVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDefinitions#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDefinitions#getExpressionLanguage()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_ExpressionLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDefinitions#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDefinitions#getId()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDefinitions#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDefinitions#getName()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDefinitions#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDefinitions#getTargetNamespace()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_TargetNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDefinitions#getTypeLanguage <em>Type Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Language</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDefinitions#getTypeLanguage()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_TypeLanguage();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TDefinitions#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDefinitions#getAnyAttribute()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TDocumentation <em>TDocumentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDocumentation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDocumentation
	 * @generated
	 */
	EClass getTDocumentation();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TDocumentation#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDocumentation#getMixed()
	 * @see #getTDocumentation()
	 * @generated
	 */
	EAttribute getTDocumentation_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TDocumentation#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDocumentation#getAny()
	 * @see #getTDocumentation()
	 * @generated
	 */
	EAttribute getTDocumentation_Any();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDocumentation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDocumentation#getId()
	 * @see #getTDocumentation()
	 * @generated
	 */
	EAttribute getTDocumentation_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TDocumentation#getTextFormat <em>Text Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Format</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TDocumentation#getTextFormat()
	 * @see #getTDocumentation()
	 * @generated
	 */
	EAttribute getTDocumentation_TextFormat();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TEndEvent <em>TEnd Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEnd Event</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TEndEvent
	 * @generated
	 */
	EClass getTEndEvent();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TEndPoint <em>TEnd Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEnd Point</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TEndPoint
	 * @generated
	 */
	EClass getTEndPoint();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TError <em>TError</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TError</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TError
	 * @generated
	 */
	EClass getTError();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TError#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TError#getErrorCode()
	 * @see #getTError()
	 * @generated
	 */
	EAttribute getTError_ErrorCode();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TError#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TError#getName()
	 * @see #getTError()
	 * @generated
	 */
	EAttribute getTError_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TError#getStructureRef <em>Structure Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Structure Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TError#getStructureRef()
	 * @see #getTError()
	 * @generated
	 */
	EAttribute getTError_StructureRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TErrorEventDefinition <em>TError Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TError Event Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TErrorEventDefinition
	 * @generated
	 */
	EClass getTErrorEventDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TErrorEventDefinition#getErrorRef <em>Error Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TErrorEventDefinition#getErrorRef()
	 * @see #getTErrorEventDefinition()
	 * @generated
	 */
	EAttribute getTErrorEventDefinition_ErrorRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TEscalation <em>TEscalation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEscalation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TEscalation
	 * @generated
	 */
	EClass getTEscalation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TEscalation#getEscalationCode <em>Escalation Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Escalation Code</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TEscalation#getEscalationCode()
	 * @see #getTEscalation()
	 * @generated
	 */
	EAttribute getTEscalation_EscalationCode();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TEscalation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TEscalation#getName()
	 * @see #getTEscalation()
	 * @generated
	 */
	EAttribute getTEscalation_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TEscalation#getStructureRef <em>Structure Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Structure Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TEscalation#getStructureRef()
	 * @see #getTEscalation()
	 * @generated
	 */
	EAttribute getTEscalation_StructureRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TEscalationEventDefinition <em>TEscalation Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEscalation Event Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TEscalationEventDefinition
	 * @generated
	 */
	EClass getTEscalationEventDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TEscalationEventDefinition#getEscalationRef <em>Escalation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Escalation Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TEscalationEventDefinition#getEscalationRef()
	 * @see #getTEscalationEventDefinition()
	 * @generated
	 */
	EAttribute getTEscalationEventDefinition_EscalationRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TEvent <em>TEvent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEvent</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TEvent
	 * @generated
	 */
	EClass getTEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TEvent#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TEvent#getProperty()
	 * @see #getTEvent()
	 * @generated
	 */
	EReference getTEvent_Property();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TEventBasedGateway <em>TEvent Based Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEvent Based Gateway</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TEventBasedGateway
	 * @generated
	 */
	EClass getTEventBasedGateway();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TEventBasedGateway#getEventGatewayType <em>Event Gateway Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Gateway Type</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TEventBasedGateway#getEventGatewayType()
	 * @see #getTEventBasedGateway()
	 * @generated
	 */
	EAttribute getTEventBasedGateway_EventGatewayType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TEventBasedGateway#isInstantiate <em>Instantiate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instantiate</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TEventBasedGateway#isInstantiate()
	 * @see #getTEventBasedGateway()
	 * @generated
	 */
	EAttribute getTEventBasedGateway_Instantiate();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TEventDefinition <em>TEvent Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEvent Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TEventDefinition
	 * @generated
	 */
	EClass getTEventDefinition();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TExclusiveGateway <em>TExclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExclusive Gateway</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TExclusiveGateway
	 * @generated
	 */
	EClass getTExclusiveGateway();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TExclusiveGateway#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TExclusiveGateway#getDefault()
	 * @see #getTExclusiveGateway()
	 * @generated
	 */
	EAttribute getTExclusiveGateway_Default();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TExpression <em>TExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExpression</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TExpression
	 * @generated
	 */
	EClass getTExpression();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TExtension <em>TExtension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExtension</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TExtension
	 * @generated
	 */
	EClass getTExtension();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TExtension#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Documentation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TExtension#getDocumentation()
	 * @see #getTExtension()
	 * @generated
	 */
	EReference getTExtension_Documentation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TExtension#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TExtension#getDefinition()
	 * @see #getTExtension()
	 * @generated
	 */
	EAttribute getTExtension_Definition();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TExtension#isMustUnderstand <em>Must Understand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Understand</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TExtension#isMustUnderstand()
	 * @see #getTExtension()
	 * @generated
	 */
	EAttribute getTExtension_MustUnderstand();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TExtensionElements <em>TExtension Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExtension Elements</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TExtensionElements
	 * @generated
	 */
	EClass getTExtensionElements();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TExtensionElements#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TExtensionElements#getAny()
	 * @see #getTExtensionElements()
	 * @generated
	 */
	EAttribute getTExtensionElements_Any();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TFlowElement <em>TFlow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFlow Element</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TFlowElement
	 * @generated
	 */
	EClass getTFlowElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TFlowElement#getAuditing <em>Auditing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auditing</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TFlowElement#getAuditing()
	 * @see #getTFlowElement()
	 * @generated
	 */
	EReference getTFlowElement_Auditing();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TFlowElement#getMonitoring <em>Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Monitoring</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TFlowElement#getMonitoring()
	 * @see #getTFlowElement()
	 * @generated
	 */
	EReference getTFlowElement_Monitoring();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TFlowElement#getCategoryValueRef <em>Category Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Category Value Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TFlowElement#getCategoryValueRef()
	 * @see #getTFlowElement()
	 * @generated
	 */
	EAttribute getTFlowElement_CategoryValueRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TFlowElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TFlowElement#getName()
	 * @see #getTFlowElement()
	 * @generated
	 */
	EAttribute getTFlowElement_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TFlowNode <em>TFlow Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFlow Node</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TFlowNode
	 * @generated
	 */
	EClass getTFlowNode();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TFlowNode#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Incoming</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TFlowNode#getIncoming()
	 * @see #getTFlowNode()
	 * @generated
	 */
	EAttribute getTFlowNode_Incoming();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TFlowNode#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Outgoing</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TFlowNode#getOutgoing()
	 * @see #getTFlowNode()
	 * @generated
	 */
	EAttribute getTFlowNode_Outgoing();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TFormalExpression <em>TFormal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFormal Expression</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TFormalExpression
	 * @generated
	 */
	EClass getTFormalExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TFormalExpression#getEvaluatesToTypeRef <em>Evaluates To Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evaluates To Type Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TFormalExpression#getEvaluatesToTypeRef()
	 * @see #getTFormalExpression()
	 * @generated
	 */
	EAttribute getTFormalExpression_EvaluatesToTypeRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TFormalExpression#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TFormalExpression#getLanguage()
	 * @see #getTFormalExpression()
	 * @generated
	 */
	EAttribute getTFormalExpression_Language();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TGateway <em>TGateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGateway</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TGateway
	 * @generated
	 */
	EClass getTGateway();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TGateway#getGatewayDirection <em>Gateway Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gateway Direction</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TGateway#getGatewayDirection()
	 * @see #getTGateway()
	 * @generated
	 */
	EAttribute getTGateway_GatewayDirection();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TGlobalBusinessRuleTask <em>TGlobal Business Rule Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGlobal Business Rule Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TGlobalBusinessRuleTask
	 * @generated
	 */
	EClass getTGlobalBusinessRuleTask();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TGlobalBusinessRuleTask#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TGlobalBusinessRuleTask#getImplementation()
	 * @see #getTGlobalBusinessRuleTask()
	 * @generated
	 */
	EAttribute getTGlobalBusinessRuleTask_Implementation();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TGlobalChoreographyTask <em>TGlobal Choreography Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGlobal Choreography Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TGlobalChoreographyTask
	 * @generated
	 */
	EClass getTGlobalChoreographyTask();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TGlobalChoreographyTask#getInitiatingParticipantRef <em>Initiating Participant Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiating Participant Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TGlobalChoreographyTask#getInitiatingParticipantRef()
	 * @see #getTGlobalChoreographyTask()
	 * @generated
	 */
	EAttribute getTGlobalChoreographyTask_InitiatingParticipantRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TGlobalConversation <em>TGlobal Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGlobal Conversation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TGlobalConversation
	 * @generated
	 */
	EClass getTGlobalConversation();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TGlobalManualTask <em>TGlobal Manual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGlobal Manual Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TGlobalManualTask
	 * @generated
	 */
	EClass getTGlobalManualTask();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TGlobalScriptTask <em>TGlobal Script Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGlobal Script Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TGlobalScriptTask
	 * @generated
	 */
	EClass getTGlobalScriptTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TGlobalScriptTask#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TGlobalScriptTask#getScript()
	 * @see #getTGlobalScriptTask()
	 * @generated
	 */
	EReference getTGlobalScriptTask_Script();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TGlobalScriptTask#getScriptLanguage <em>Script Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Language</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TGlobalScriptTask#getScriptLanguage()
	 * @see #getTGlobalScriptTask()
	 * @generated
	 */
	EAttribute getTGlobalScriptTask_ScriptLanguage();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TGlobalTask <em>TGlobal Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGlobal Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TGlobalTask
	 * @generated
	 */
	EClass getTGlobalTask();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TGlobalTask#getResourceRoleGroup <em>Resource Role Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Resource Role Group</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TGlobalTask#getResourceRoleGroup()
	 * @see #getTGlobalTask()
	 * @generated
	 */
	EAttribute getTGlobalTask_ResourceRoleGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TGlobalTask#getResourceRole <em>Resource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Role</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TGlobalTask#getResourceRole()
	 * @see #getTGlobalTask()
	 * @generated
	 */
	EReference getTGlobalTask_ResourceRole();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TGlobalUserTask <em>TGlobal User Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGlobal User Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TGlobalUserTask
	 * @generated
	 */
	EClass getTGlobalUserTask();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TGlobalUserTask#getRendering <em>Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rendering</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TGlobalUserTask#getRendering()
	 * @see #getTGlobalUserTask()
	 * @generated
	 */
	EReference getTGlobalUserTask_Rendering();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TGlobalUserTask#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TGlobalUserTask#getImplementation()
	 * @see #getTGlobalUserTask()
	 * @generated
	 */
	EAttribute getTGlobalUserTask_Implementation();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TGroup <em>TGroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGroup</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TGroup
	 * @generated
	 */
	EClass getTGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TGroup#getCategoryValueRef <em>Category Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Value Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TGroup#getCategoryValueRef()
	 * @see #getTGroup()
	 * @generated
	 */
	EAttribute getTGroup_CategoryValueRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.THumanPerformer <em>THuman Performer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>THuman Performer</em>'.
	 * @see org.omg.spec.bpmn.bpmn.THumanPerformer
	 * @generated
	 */
	EClass getTHumanPerformer();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TImplicitThrowEvent <em>TImplicit Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TImplicit Throw Event</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TImplicitThrowEvent
	 * @generated
	 */
	EClass getTImplicitThrowEvent();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TImport <em>TImport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TImport</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TImport
	 * @generated
	 */
	EClass getTImport();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TImport#getImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Type</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TImport#getImportType()
	 * @see #getTImport()
	 * @generated
	 */
	EAttribute getTImport_ImportType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TImport#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TImport#getLocation()
	 * @see #getTImport()
	 * @generated
	 */
	EAttribute getTImport_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TImport#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TImport#getNamespace()
	 * @see #getTImport()
	 * @generated
	 */
	EAttribute getTImport_Namespace();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TInclusiveGateway <em>TInclusive Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInclusive Gateway</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TInclusiveGateway
	 * @generated
	 */
	EClass getTInclusiveGateway();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TInclusiveGateway#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TInclusiveGateway#getDefault()
	 * @see #getTInclusiveGateway()
	 * @generated
	 */
	EAttribute getTInclusiveGateway_Default();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TInputOutputBinding <em>TInput Output Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInput Output Binding</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TInputOutputBinding
	 * @generated
	 */
	EClass getTInputOutputBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TInputOutputBinding#getInputDataRef <em>Input Data Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Data Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TInputOutputBinding#getInputDataRef()
	 * @see #getTInputOutputBinding()
	 * @generated
	 */
	EAttribute getTInputOutputBinding_InputDataRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TInputOutputBinding#getOperationRef <em>Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TInputOutputBinding#getOperationRef()
	 * @see #getTInputOutputBinding()
	 * @generated
	 */
	EAttribute getTInputOutputBinding_OperationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TInputOutputBinding#getOutputDataRef <em>Output Data Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Data Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TInputOutputBinding#getOutputDataRef()
	 * @see #getTInputOutputBinding()
	 * @generated
	 */
	EAttribute getTInputOutputBinding_OutputDataRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TInputOutputSpecification <em>TInput Output Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInput Output Specification</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TInputOutputSpecification
	 * @generated
	 */
	EClass getTInputOutputSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TInputOutputSpecification#getDataInput <em>Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Input</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TInputOutputSpecification#getDataInput()
	 * @see #getTInputOutputSpecification()
	 * @generated
	 */
	EReference getTInputOutputSpecification_DataInput();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TInputOutputSpecification#getDataOutput <em>Data Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Output</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TInputOutputSpecification#getDataOutput()
	 * @see #getTInputOutputSpecification()
	 * @generated
	 */
	EReference getTInputOutputSpecification_DataOutput();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TInputOutputSpecification#getInputSet <em>Input Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Set</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TInputOutputSpecification#getInputSet()
	 * @see #getTInputOutputSpecification()
	 * @generated
	 */
	EReference getTInputOutputSpecification_InputSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TInputOutputSpecification#getOutputSet <em>Output Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Set</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TInputOutputSpecification#getOutputSet()
	 * @see #getTInputOutputSpecification()
	 * @generated
	 */
	EReference getTInputOutputSpecification_OutputSet();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TInputSet <em>TInput Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInput Set</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TInputSet
	 * @generated
	 */
	EClass getTInputSet();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TInputSet#getDataInputRefs <em>Data Input Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data Input Refs</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TInputSet#getDataInputRefs()
	 * @see #getTInputSet()
	 * @generated
	 */
	EAttribute getTInputSet_DataInputRefs();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TInputSet#getOptionalInputRefs <em>Optional Input Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Optional Input Refs</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TInputSet#getOptionalInputRefs()
	 * @see #getTInputSet()
	 * @generated
	 */
	EAttribute getTInputSet_OptionalInputRefs();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TInputSet#getWhileExecutingInputRefs <em>While Executing Input Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>While Executing Input Refs</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TInputSet#getWhileExecutingInputRefs()
	 * @see #getTInputSet()
	 * @generated
	 */
	EAttribute getTInputSet_WhileExecutingInputRefs();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TInputSet#getOutputSetRefs <em>Output Set Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Output Set Refs</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TInputSet#getOutputSetRefs()
	 * @see #getTInputSet()
	 * @generated
	 */
	EAttribute getTInputSet_OutputSetRefs();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TInputSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TInputSet#getName()
	 * @see #getTInputSet()
	 * @generated
	 */
	EAttribute getTInputSet_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TInterface <em>TInterface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInterface</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TInterface
	 * @generated
	 */
	EClass getTInterface();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TInterface#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TInterface#getOperation()
	 * @see #getTInterface()
	 * @generated
	 */
	EReference getTInterface_Operation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TInterface#getImplementationRef <em>Implementation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TInterface#getImplementationRef()
	 * @see #getTInterface()
	 * @generated
	 */
	EAttribute getTInterface_ImplementationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TInterface#getName()
	 * @see #getTInterface()
	 * @generated
	 */
	EAttribute getTInterface_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TIntermediateCatchEvent <em>TIntermediate Catch Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TIntermediate Catch Event</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TIntermediateCatchEvent
	 * @generated
	 */
	EClass getTIntermediateCatchEvent();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TIntermediateThrowEvent <em>TIntermediate Throw Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TIntermediate Throw Event</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TIntermediateThrowEvent
	 * @generated
	 */
	EClass getTIntermediateThrowEvent();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TItemDefinition <em>TItem Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TItem Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TItemDefinition
	 * @generated
	 */
	EClass getTItemDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TItemDefinition#isIsCollection <em>Is Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Collection</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TItemDefinition#isIsCollection()
	 * @see #getTItemDefinition()
	 * @generated
	 */
	EAttribute getTItemDefinition_IsCollection();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TItemDefinition#getItemKind <em>Item Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Kind</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TItemDefinition#getItemKind()
	 * @see #getTItemDefinition()
	 * @generated
	 */
	EAttribute getTItemDefinition_ItemKind();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TItemDefinition#getStructureRef <em>Structure Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Structure Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TItemDefinition#getStructureRef()
	 * @see #getTItemDefinition()
	 * @generated
	 */
	EAttribute getTItemDefinition_StructureRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TLane <em>TLane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TLane</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TLane
	 * @generated
	 */
	EClass getTLane();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TLane#getPartitionElement <em>Partition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Partition Element</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TLane#getPartitionElement()
	 * @see #getTLane()
	 * @generated
	 */
	EReference getTLane_PartitionElement();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TLane#getFlowNodeRef <em>Flow Node Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Flow Node Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TLane#getFlowNodeRef()
	 * @see #getTLane()
	 * @generated
	 */
	EAttribute getTLane_FlowNodeRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TLane#getChildLaneSet <em>Child Lane Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child Lane Set</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TLane#getChildLaneSet()
	 * @see #getTLane()
	 * @generated
	 */
	EReference getTLane_ChildLaneSet();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TLane#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TLane#getName()
	 * @see #getTLane()
	 * @generated
	 */
	EAttribute getTLane_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TLane#getPartitionElementRef <em>Partition Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partition Element Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TLane#getPartitionElementRef()
	 * @see #getTLane()
	 * @generated
	 */
	EAttribute getTLane_PartitionElementRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TLaneSet <em>TLane Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TLane Set</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TLaneSet
	 * @generated
	 */
	EClass getTLaneSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TLaneSet#getLane <em>Lane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lane</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TLaneSet#getLane()
	 * @see #getTLaneSet()
	 * @generated
	 */
	EReference getTLaneSet_Lane();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TLaneSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TLaneSet#getName()
	 * @see #getTLaneSet()
	 * @generated
	 */
	EAttribute getTLaneSet_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TLinkEventDefinition <em>TLink Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TLink Event Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TLinkEventDefinition
	 * @generated
	 */
	EClass getTLinkEventDefinition();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TLinkEventDefinition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Source</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TLinkEventDefinition#getSource()
	 * @see #getTLinkEventDefinition()
	 * @generated
	 */
	EAttribute getTLinkEventDefinition_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TLinkEventDefinition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TLinkEventDefinition#getTarget()
	 * @see #getTLinkEventDefinition()
	 * @generated
	 */
	EAttribute getTLinkEventDefinition_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TLinkEventDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TLinkEventDefinition#getName()
	 * @see #getTLinkEventDefinition()
	 * @generated
	 */
	EAttribute getTLinkEventDefinition_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TLoopCharacteristics <em>TLoop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TLoop Characteristics</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TLoopCharacteristics
	 * @generated
	 */
	EClass getTLoopCharacteristics();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TManualTask <em>TManual Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TManual Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TManualTask
	 * @generated
	 */
	EClass getTManualTask();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TMessage <em>TMessage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMessage</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMessage
	 * @generated
	 */
	EClass getTMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TMessage#getItemRef <em>Item Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMessage#getItemRef()
	 * @see #getTMessage()
	 * @generated
	 */
	EAttribute getTMessage_ItemRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TMessage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMessage#getName()
	 * @see #getTMessage()
	 * @generated
	 */
	EAttribute getTMessage_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TMessageEventDefinition <em>TMessage Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMessage Event Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMessageEventDefinition
	 * @generated
	 */
	EClass getTMessageEventDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TMessageEventDefinition#getOperationRef <em>Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMessageEventDefinition#getOperationRef()
	 * @see #getTMessageEventDefinition()
	 * @generated
	 */
	EAttribute getTMessageEventDefinition_OperationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TMessageEventDefinition#getMessageRef <em>Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMessageEventDefinition#getMessageRef()
	 * @see #getTMessageEventDefinition()
	 * @generated
	 */
	EAttribute getTMessageEventDefinition_MessageRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TMessageFlow <em>TMessage Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMessage Flow</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMessageFlow
	 * @generated
	 */
	EClass getTMessageFlow();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TMessageFlow#getMessageRef <em>Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMessageFlow#getMessageRef()
	 * @see #getTMessageFlow()
	 * @generated
	 */
	EAttribute getTMessageFlow_MessageRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TMessageFlow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMessageFlow#getName()
	 * @see #getTMessageFlow()
	 * @generated
	 */
	EAttribute getTMessageFlow_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TMessageFlow#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMessageFlow#getSourceRef()
	 * @see #getTMessageFlow()
	 * @generated
	 */
	EAttribute getTMessageFlow_SourceRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TMessageFlow#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMessageFlow#getTargetRef()
	 * @see #getTMessageFlow()
	 * @generated
	 */
	EAttribute getTMessageFlow_TargetRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TMessageFlowAssociation <em>TMessage Flow Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMessage Flow Association</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMessageFlowAssociation
	 * @generated
	 */
	EClass getTMessageFlowAssociation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TMessageFlowAssociation#getInnerMessageFlowRef <em>Inner Message Flow Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inner Message Flow Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMessageFlowAssociation#getInnerMessageFlowRef()
	 * @see #getTMessageFlowAssociation()
	 * @generated
	 */
	EAttribute getTMessageFlowAssociation_InnerMessageFlowRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TMessageFlowAssociation#getOuterMessageFlowRef <em>Outer Message Flow Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outer Message Flow Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMessageFlowAssociation#getOuterMessageFlowRef()
	 * @see #getTMessageFlowAssociation()
	 * @generated
	 */
	EAttribute getTMessageFlowAssociation_OuterMessageFlowRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TMonitoring <em>TMonitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMonitoring</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMonitoring
	 * @generated
	 */
	EClass getTMonitoring();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics <em>TMulti Instance Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TMulti Instance Loop Characteristics</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics
	 * @generated
	 */
	EClass getTMultiInstanceLoopCharacteristics();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics#getLoopCardinality <em>Loop Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Cardinality</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics#getLoopCardinality()
	 * @see #getTMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EReference getTMultiInstanceLoopCharacteristics_LoopCardinality();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics#getLoopDataInputRef <em>Loop Data Input Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Data Input Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics#getLoopDataInputRef()
	 * @see #getTMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EAttribute getTMultiInstanceLoopCharacteristics_LoopDataInputRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics#getLoopDataOutputRef <em>Loop Data Output Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Data Output Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics#getLoopDataOutputRef()
	 * @see #getTMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EAttribute getTMultiInstanceLoopCharacteristics_LoopDataOutputRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics#getInputDataItem <em>Input Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Data Item</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics#getInputDataItem()
	 * @see #getTMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EReference getTMultiInstanceLoopCharacteristics_InputDataItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics#getOutputDataItem <em>Output Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Data Item</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics#getOutputDataItem()
	 * @see #getTMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EReference getTMultiInstanceLoopCharacteristics_OutputDataItem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics#getComplexBehaviorDefinition <em>Complex Behavior Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Behavior Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics#getComplexBehaviorDefinition()
	 * @see #getTMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EReference getTMultiInstanceLoopCharacteristics_ComplexBehaviorDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics#getCompletionCondition <em>Completion Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Completion Condition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics#getCompletionCondition()
	 * @see #getTMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EReference getTMultiInstanceLoopCharacteristics_CompletionCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics#getBehavior <em>Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behavior</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics#getBehavior()
	 * @see #getTMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EAttribute getTMultiInstanceLoopCharacteristics_Behavior();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics#isIsSequential <em>Is Sequential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Sequential</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics#isIsSequential()
	 * @see #getTMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EAttribute getTMultiInstanceLoopCharacteristics_IsSequential();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics#getNoneBehaviorEventRef <em>None Behavior Event Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>None Behavior Event Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics#getNoneBehaviorEventRef()
	 * @see #getTMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EAttribute getTMultiInstanceLoopCharacteristics_NoneBehaviorEventRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics#getOneBehaviorEventRef <em>One Behavior Event Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>One Behavior Event Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMultiInstanceLoopCharacteristics#getOneBehaviorEventRef()
	 * @see #getTMultiInstanceLoopCharacteristics()
	 * @generated
	 */
	EAttribute getTMultiInstanceLoopCharacteristics_OneBehaviorEventRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TOperation <em>TOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOperation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TOperation
	 * @generated
	 */
	EClass getTOperation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TOperation#getInMessageRef <em>In Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Message Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TOperation#getInMessageRef()
	 * @see #getTOperation()
	 * @generated
	 */
	EAttribute getTOperation_InMessageRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TOperation#getOutMessageRef <em>Out Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out Message Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TOperation#getOutMessageRef()
	 * @see #getTOperation()
	 * @generated
	 */
	EAttribute getTOperation_OutMessageRef();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TOperation#getErrorRef <em>Error Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Error Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TOperation#getErrorRef()
	 * @see #getTOperation()
	 * @generated
	 */
	EAttribute getTOperation_ErrorRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TOperation#getImplementationRef <em>Implementation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TOperation#getImplementationRef()
	 * @see #getTOperation()
	 * @generated
	 */
	EAttribute getTOperation_ImplementationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TOperation#getName()
	 * @see #getTOperation()
	 * @generated
	 */
	EAttribute getTOperation_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TOutputSet <em>TOutput Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOutput Set</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TOutputSet
	 * @generated
	 */
	EClass getTOutputSet();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TOutputSet#getDataOutputRefs <em>Data Output Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data Output Refs</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TOutputSet#getDataOutputRefs()
	 * @see #getTOutputSet()
	 * @generated
	 */
	EAttribute getTOutputSet_DataOutputRefs();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TOutputSet#getOptionalOutputRefs <em>Optional Output Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Optional Output Refs</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TOutputSet#getOptionalOutputRefs()
	 * @see #getTOutputSet()
	 * @generated
	 */
	EAttribute getTOutputSet_OptionalOutputRefs();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TOutputSet#getWhileExecutingOutputRefs <em>While Executing Output Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>While Executing Output Refs</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TOutputSet#getWhileExecutingOutputRefs()
	 * @see #getTOutputSet()
	 * @generated
	 */
	EAttribute getTOutputSet_WhileExecutingOutputRefs();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TOutputSet#getInputSetRefs <em>Input Set Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Input Set Refs</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TOutputSet#getInputSetRefs()
	 * @see #getTOutputSet()
	 * @generated
	 */
	EAttribute getTOutputSet_InputSetRefs();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TOutputSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TOutputSet#getName()
	 * @see #getTOutputSet()
	 * @generated
	 */
	EAttribute getTOutputSet_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TParallelGateway <em>TParallel Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TParallel Gateway</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TParallelGateway
	 * @generated
	 */
	EClass getTParallelGateway();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TParticipant <em>TParticipant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TParticipant</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TParticipant
	 * @generated
	 */
	EClass getTParticipant();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TParticipant#getInterfaceRef <em>Interface Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Interface Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TParticipant#getInterfaceRef()
	 * @see #getTParticipant()
	 * @generated
	 */
	EAttribute getTParticipant_InterfaceRef();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TParticipant#getEndPointRef <em>End Point Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>End Point Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TParticipant#getEndPointRef()
	 * @see #getTParticipant()
	 * @generated
	 */
	EAttribute getTParticipant_EndPointRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TParticipant#getParticipantMultiplicity <em>Participant Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Participant Multiplicity</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TParticipant#getParticipantMultiplicity()
	 * @see #getTParticipant()
	 * @generated
	 */
	EReference getTParticipant_ParticipantMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TParticipant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TParticipant#getName()
	 * @see #getTParticipant()
	 * @generated
	 */
	EAttribute getTParticipant_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TParticipant#getProcessRef <em>Process Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TParticipant#getProcessRef()
	 * @see #getTParticipant()
	 * @generated
	 */
	EAttribute getTParticipant_ProcessRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TParticipantAssociation <em>TParticipant Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TParticipant Association</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TParticipantAssociation
	 * @generated
	 */
	EClass getTParticipantAssociation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TParticipantAssociation#getInnerParticipantRef <em>Inner Participant Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inner Participant Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TParticipantAssociation#getInnerParticipantRef()
	 * @see #getTParticipantAssociation()
	 * @generated
	 */
	EAttribute getTParticipantAssociation_InnerParticipantRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TParticipantAssociation#getOuterParticipantRef <em>Outer Participant Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outer Participant Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TParticipantAssociation#getOuterParticipantRef()
	 * @see #getTParticipantAssociation()
	 * @generated
	 */
	EAttribute getTParticipantAssociation_OuterParticipantRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TParticipantMultiplicity <em>TParticipant Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TParticipant Multiplicity</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TParticipantMultiplicity
	 * @generated
	 */
	EClass getTParticipantMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TParticipantMultiplicity#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TParticipantMultiplicity#getMaximum()
	 * @see #getTParticipantMultiplicity()
	 * @generated
	 */
	EAttribute getTParticipantMultiplicity_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TParticipantMultiplicity#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TParticipantMultiplicity#getMinimum()
	 * @see #getTParticipantMultiplicity()
	 * @generated
	 */
	EAttribute getTParticipantMultiplicity_Minimum();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TPartnerEntity <em>TPartner Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPartner Entity</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TPartnerEntity
	 * @generated
	 */
	EClass getTPartnerEntity();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TPartnerEntity#getParticipantRef <em>Participant Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Participant Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TPartnerEntity#getParticipantRef()
	 * @see #getTPartnerEntity()
	 * @generated
	 */
	EAttribute getTPartnerEntity_ParticipantRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TPartnerEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TPartnerEntity#getName()
	 * @see #getTPartnerEntity()
	 * @generated
	 */
	EAttribute getTPartnerEntity_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TPartnerRole <em>TPartner Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPartner Role</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TPartnerRole
	 * @generated
	 */
	EClass getTPartnerRole();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TPartnerRole#getParticipantRef <em>Participant Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Participant Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TPartnerRole#getParticipantRef()
	 * @see #getTPartnerRole()
	 * @generated
	 */
	EAttribute getTPartnerRole_ParticipantRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TPartnerRole#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TPartnerRole#getName()
	 * @see #getTPartnerRole()
	 * @generated
	 */
	EAttribute getTPartnerRole_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TPerformer <em>TPerformer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPerformer</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TPerformer
	 * @generated
	 */
	EClass getTPerformer();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TPotentialOwner <em>TPotential Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPotential Owner</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TPotentialOwner
	 * @generated
	 */
	EClass getTPotentialOwner();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TProcess <em>TProcess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TProcess</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TProcess
	 * @generated
	 */
	EClass getTProcess();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TProcess#getAuditing <em>Auditing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auditing</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TProcess#getAuditing()
	 * @see #getTProcess()
	 * @generated
	 */
	EReference getTProcess_Auditing();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TProcess#getMonitoring <em>Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Monitoring</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TProcess#getMonitoring()
	 * @see #getTProcess()
	 * @generated
	 */
	EReference getTProcess_Monitoring();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TProcess#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TProcess#getProperty()
	 * @see #getTProcess()
	 * @generated
	 */
	EReference getTProcess_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TProcess#getLaneSet <em>Lane Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lane Set</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TProcess#getLaneSet()
	 * @see #getTProcess()
	 * @generated
	 */
	EReference getTProcess_LaneSet();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TProcess#getFlowElementGroup <em>Flow Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Flow Element Group</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TProcess#getFlowElementGroup()
	 * @see #getTProcess()
	 * @generated
	 */
	EAttribute getTProcess_FlowElementGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TProcess#getFlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Element</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TProcess#getFlowElement()
	 * @see #getTProcess()
	 * @generated
	 */
	EReference getTProcess_FlowElement();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TProcess#getArtifactGroup <em>Artifact Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Artifact Group</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TProcess#getArtifactGroup()
	 * @see #getTProcess()
	 * @generated
	 */
	EAttribute getTProcess_ArtifactGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TProcess#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TProcess#getArtifact()
	 * @see #getTProcess()
	 * @generated
	 */
	EReference getTProcess_Artifact();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TProcess#getResourceRoleGroup <em>Resource Role Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Resource Role Group</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TProcess#getResourceRoleGroup()
	 * @see #getTProcess()
	 * @generated
	 */
	EAttribute getTProcess_ResourceRoleGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TProcess#getResourceRole <em>Resource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Role</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TProcess#getResourceRole()
	 * @see #getTProcess()
	 * @generated
	 */
	EReference getTProcess_ResourceRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TProcess#getCorrelationSubscription <em>Correlation Subscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correlation Subscription</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TProcess#getCorrelationSubscription()
	 * @see #getTProcess()
	 * @generated
	 */
	EReference getTProcess_CorrelationSubscription();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TProcess#getSupports <em>Supports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Supports</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TProcess#getSupports()
	 * @see #getTProcess()
	 * @generated
	 */
	EAttribute getTProcess_Supports();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TProcess#getDefinitionalCollaborationRef <em>Definitional Collaboration Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definitional Collaboration Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TProcess#getDefinitionalCollaborationRef()
	 * @see #getTProcess()
	 * @generated
	 */
	EAttribute getTProcess_DefinitionalCollaborationRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TProcess#isIsClosed <em>Is Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Closed</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TProcess#isIsClosed()
	 * @see #getTProcess()
	 * @generated
	 */
	EAttribute getTProcess_IsClosed();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TProcess#isIsExecutable <em>Is Executable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Executable</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TProcess#isIsExecutable()
	 * @see #getTProcess()
	 * @generated
	 */
	EAttribute getTProcess_IsExecutable();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TProcess#getProcessType <em>Process Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Process Type</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TProcess#getProcessType()
	 * @see #getTProcess()
	 * @generated
	 */
	EAttribute getTProcess_ProcessType();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TProperty <em>TProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TProperty</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TProperty
	 * @generated
	 */
	EClass getTProperty();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TProperty#getDataState <em>Data State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data State</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TProperty#getDataState()
	 * @see #getTProperty()
	 * @generated
	 */
	EReference getTProperty_DataState();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TProperty#getItemSubjectRef <em>Item Subject Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Subject Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TProperty#getItemSubjectRef()
	 * @see #getTProperty()
	 * @generated
	 */
	EAttribute getTProperty_ItemSubjectRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TProperty#getName()
	 * @see #getTProperty()
	 * @generated
	 */
	EAttribute getTProperty_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TReceiveTask <em>TReceive Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TReceive Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TReceiveTask
	 * @generated
	 */
	EClass getTReceiveTask();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TReceiveTask#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TReceiveTask#getImplementation()
	 * @see #getTReceiveTask()
	 * @generated
	 */
	EAttribute getTReceiveTask_Implementation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TReceiveTask#isInstantiate <em>Instantiate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instantiate</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TReceiveTask#isInstantiate()
	 * @see #getTReceiveTask()
	 * @generated
	 */
	EAttribute getTReceiveTask_Instantiate();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TReceiveTask#getMessageRef <em>Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TReceiveTask#getMessageRef()
	 * @see #getTReceiveTask()
	 * @generated
	 */
	EAttribute getTReceiveTask_MessageRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TReceiveTask#getOperationRef <em>Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TReceiveTask#getOperationRef()
	 * @see #getTReceiveTask()
	 * @generated
	 */
	EAttribute getTReceiveTask_OperationRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TRelationship <em>TRelationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRelationship</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TRelationship
	 * @generated
	 */
	EClass getTRelationship();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Source</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TRelationship#getSource()
	 * @see #getTRelationship()
	 * @generated
	 */
	EAttribute getTRelationship_Source();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Target</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TRelationship#getTarget()
	 * @see #getTRelationship()
	 * @generated
	 */
	EAttribute getTRelationship_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TRelationship#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TRelationship#getDirection()
	 * @see #getTRelationship()
	 * @generated
	 */
	EAttribute getTRelationship_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TRelationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TRelationship#getType()
	 * @see #getTRelationship()
	 * @generated
	 */
	EAttribute getTRelationship_Type();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TRendering <em>TRendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRendering</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TRendering
	 * @generated
	 */
	EClass getTRendering();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TResource <em>TResource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TResource</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TResource
	 * @generated
	 */
	EClass getTResource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TResource#getResourceParameter <em>Resource Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Parameter</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TResource#getResourceParameter()
	 * @see #getTResource()
	 * @generated
	 */
	EReference getTResource_ResourceParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TResource#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TResource#getName()
	 * @see #getTResource()
	 * @generated
	 */
	EAttribute getTResource_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TResourceAssignmentExpression <em>TResource Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TResource Assignment Expression</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TResourceAssignmentExpression
	 * @generated
	 */
	EClass getTResourceAssignmentExpression();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TResourceAssignmentExpression#getExpressionGroup <em>Expression Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expression Group</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TResourceAssignmentExpression#getExpressionGroup()
	 * @see #getTResourceAssignmentExpression()
	 * @generated
	 */
	EAttribute getTResourceAssignmentExpression_ExpressionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TResourceAssignmentExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TResourceAssignmentExpression#getExpression()
	 * @see #getTResourceAssignmentExpression()
	 * @generated
	 */
	EReference getTResourceAssignmentExpression_Expression();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TResourceParameter <em>TResource Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TResource Parameter</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TResourceParameter
	 * @generated
	 */
	EClass getTResourceParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TResourceParameter#isIsRequired <em>Is Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Required</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TResourceParameter#isIsRequired()
	 * @see #getTResourceParameter()
	 * @generated
	 */
	EAttribute getTResourceParameter_IsRequired();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TResourceParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TResourceParameter#getName()
	 * @see #getTResourceParameter()
	 * @generated
	 */
	EAttribute getTResourceParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TResourceParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TResourceParameter#getType()
	 * @see #getTResourceParameter()
	 * @generated
	 */
	EAttribute getTResourceParameter_Type();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TResourceParameterBinding <em>TResource Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TResource Parameter Binding</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TResourceParameterBinding
	 * @generated
	 */
	EClass getTResourceParameterBinding();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TResourceParameterBinding#getExpressionGroup <em>Expression Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expression Group</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TResourceParameterBinding#getExpressionGroup()
	 * @see #getTResourceParameterBinding()
	 * @generated
	 */
	EAttribute getTResourceParameterBinding_ExpressionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TResourceParameterBinding#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TResourceParameterBinding#getExpression()
	 * @see #getTResourceParameterBinding()
	 * @generated
	 */
	EReference getTResourceParameterBinding_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TResourceParameterBinding#getParameterRef <em>Parameter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TResourceParameterBinding#getParameterRef()
	 * @see #getTResourceParameterBinding()
	 * @generated
	 */
	EAttribute getTResourceParameterBinding_ParameterRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TResourceRole <em>TResource Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TResource Role</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TResourceRole
	 * @generated
	 */
	EClass getTResourceRole();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TResourceRole#getResourceRef <em>Resource Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TResourceRole#getResourceRef()
	 * @see #getTResourceRole()
	 * @generated
	 */
	EAttribute getTResourceRole_ResourceRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TResourceRole#getResourceParameterBinding <em>Resource Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Parameter Binding</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TResourceRole#getResourceParameterBinding()
	 * @see #getTResourceRole()
	 * @generated
	 */
	EReference getTResourceRole_ResourceParameterBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TResourceRole#getResourceAssignmentExpression <em>Resource Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Assignment Expression</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TResourceRole#getResourceAssignmentExpression()
	 * @see #getTResourceRole()
	 * @generated
	 */
	EReference getTResourceRole_ResourceAssignmentExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TResourceRole#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TResourceRole#getName()
	 * @see #getTResourceRole()
	 * @generated
	 */
	EAttribute getTResourceRole_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TRootElement <em>TRoot Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRoot Element</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TRootElement
	 * @generated
	 */
	EClass getTRootElement();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TScript <em>TScript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TScript</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TScript
	 * @generated
	 */
	EClass getTScript();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TScript#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TScript#getMixed()
	 * @see #getTScript()
	 * @generated
	 */
	EAttribute getTScript_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TScript#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TScript#getAny()
	 * @see #getTScript()
	 * @generated
	 */
	EAttribute getTScript_Any();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TScriptTask <em>TScript Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TScript Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TScriptTask
	 * @generated
	 */
	EClass getTScriptTask();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TScriptTask#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Script</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TScriptTask#getScript()
	 * @see #getTScriptTask()
	 * @generated
	 */
	EReference getTScriptTask_Script();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TScriptTask#getScriptFormat <em>Script Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Script Format</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TScriptTask#getScriptFormat()
	 * @see #getTScriptTask()
	 * @generated
	 */
	EAttribute getTScriptTask_ScriptFormat();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TSendTask <em>TSend Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSend Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSendTask
	 * @generated
	 */
	EClass getTSendTask();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TSendTask#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSendTask#getImplementation()
	 * @see #getTSendTask()
	 * @generated
	 */
	EAttribute getTSendTask_Implementation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TSendTask#getMessageRef <em>Message Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSendTask#getMessageRef()
	 * @see #getTSendTask()
	 * @generated
	 */
	EAttribute getTSendTask_MessageRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TSendTask#getOperationRef <em>Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSendTask#getOperationRef()
	 * @see #getTSendTask()
	 * @generated
	 */
	EAttribute getTSendTask_OperationRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TSequenceFlow <em>TSequence Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSequence Flow</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSequenceFlow
	 * @generated
	 */
	EClass getTSequenceFlow();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TSequenceFlow#getConditionExpression <em>Condition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition Expression</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSequenceFlow#getConditionExpression()
	 * @see #getTSequenceFlow()
	 * @generated
	 */
	EReference getTSequenceFlow_ConditionExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TSequenceFlow#isIsImmediate <em>Is Immediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Immediate</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSequenceFlow#isIsImmediate()
	 * @see #getTSequenceFlow()
	 * @generated
	 */
	EAttribute getTSequenceFlow_IsImmediate();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TSequenceFlow#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSequenceFlow#getSourceRef()
	 * @see #getTSequenceFlow()
	 * @generated
	 */
	EAttribute getTSequenceFlow_SourceRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TSequenceFlow#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSequenceFlow#getTargetRef()
	 * @see #getTSequenceFlow()
	 * @generated
	 */
	EAttribute getTSequenceFlow_TargetRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TServiceTask <em>TService Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TService Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TServiceTask
	 * @generated
	 */
	EClass getTServiceTask();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TServiceTask#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TServiceTask#getImplementation()
	 * @see #getTServiceTask()
	 * @generated
	 */
	EAttribute getTServiceTask_Implementation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TServiceTask#getOperationRef <em>Operation Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TServiceTask#getOperationRef()
	 * @see #getTServiceTask()
	 * @generated
	 */
	EAttribute getTServiceTask_OperationRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TSignal <em>TSignal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSignal</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSignal
	 * @generated
	 */
	EClass getTSignal();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TSignal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSignal#getName()
	 * @see #getTSignal()
	 * @generated
	 */
	EAttribute getTSignal_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TSignal#getStructureRef <em>Structure Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Structure Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSignal#getStructureRef()
	 * @see #getTSignal()
	 * @generated
	 */
	EAttribute getTSignal_StructureRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TSignalEventDefinition <em>TSignal Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSignal Event Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSignalEventDefinition
	 * @generated
	 */
	EClass getTSignalEventDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TSignalEventDefinition#getSignalRef <em>Signal Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signal Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSignalEventDefinition#getSignalRef()
	 * @see #getTSignalEventDefinition()
	 * @generated
	 */
	EAttribute getTSignalEventDefinition_SignalRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TStandardLoopCharacteristics <em>TStandard Loop Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TStandard Loop Characteristics</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TStandardLoopCharacteristics
	 * @generated
	 */
	EClass getTStandardLoopCharacteristics();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TStandardLoopCharacteristics#getLoopCondition <em>Loop Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loop Condition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TStandardLoopCharacteristics#getLoopCondition()
	 * @see #getTStandardLoopCharacteristics()
	 * @generated
	 */
	EReference getTStandardLoopCharacteristics_LoopCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TStandardLoopCharacteristics#getLoopMaximum <em>Loop Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loop Maximum</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TStandardLoopCharacteristics#getLoopMaximum()
	 * @see #getTStandardLoopCharacteristics()
	 * @generated
	 */
	EAttribute getTStandardLoopCharacteristics_LoopMaximum();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TStandardLoopCharacteristics#isTestBefore <em>Test Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Before</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TStandardLoopCharacteristics#isTestBefore()
	 * @see #getTStandardLoopCharacteristics()
	 * @generated
	 */
	EAttribute getTStandardLoopCharacteristics_TestBefore();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TStartEvent <em>TStart Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TStart Event</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TStartEvent
	 * @generated
	 */
	EClass getTStartEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TStartEvent#isIsInterrupting <em>Is Interrupting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Interrupting</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TStartEvent#isIsInterrupting()
	 * @see #getTStartEvent()
	 * @generated
	 */
	EAttribute getTStartEvent_IsInterrupting();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TSubChoreography <em>TSub Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSub Choreography</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSubChoreography
	 * @generated
	 */
	EClass getTSubChoreography();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TSubChoreography#getFlowElementGroup <em>Flow Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Flow Element Group</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSubChoreography#getFlowElementGroup()
	 * @see #getTSubChoreography()
	 * @generated
	 */
	EAttribute getTSubChoreography_FlowElementGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TSubChoreography#getFlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Element</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSubChoreography#getFlowElement()
	 * @see #getTSubChoreography()
	 * @generated
	 */
	EReference getTSubChoreography_FlowElement();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TSubChoreography#getArtifactGroup <em>Artifact Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Artifact Group</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSubChoreography#getArtifactGroup()
	 * @see #getTSubChoreography()
	 * @generated
	 */
	EAttribute getTSubChoreography_ArtifactGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TSubChoreography#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSubChoreography#getArtifact()
	 * @see #getTSubChoreography()
	 * @generated
	 */
	EReference getTSubChoreography_Artifact();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TSubConversation <em>TSub Conversation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSub Conversation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSubConversation
	 * @generated
	 */
	EClass getTSubConversation();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TSubConversation#getConversationNodeGroup <em>Conversation Node Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Conversation Node Group</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSubConversation#getConversationNodeGroup()
	 * @see #getTSubConversation()
	 * @generated
	 */
	EAttribute getTSubConversation_ConversationNodeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TSubConversation#getConversationNode <em>Conversation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conversation Node</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSubConversation#getConversationNode()
	 * @see #getTSubConversation()
	 * @generated
	 */
	EReference getTSubConversation_ConversationNode();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TSubProcess <em>TSub Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSub Process</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSubProcess
	 * @generated
	 */
	EClass getTSubProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TSubProcess#getLaneSet <em>Lane Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lane Set</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSubProcess#getLaneSet()
	 * @see #getTSubProcess()
	 * @generated
	 */
	EReference getTSubProcess_LaneSet();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TSubProcess#getFlowElementGroup <em>Flow Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Flow Element Group</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSubProcess#getFlowElementGroup()
	 * @see #getTSubProcess()
	 * @generated
	 */
	EAttribute getTSubProcess_FlowElementGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TSubProcess#getFlowElement <em>Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow Element</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSubProcess#getFlowElement()
	 * @see #getTSubProcess()
	 * @generated
	 */
	EReference getTSubProcess_FlowElement();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TSubProcess#getArtifactGroup <em>Artifact Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Artifact Group</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSubProcess#getArtifactGroup()
	 * @see #getTSubProcess()
	 * @generated
	 */
	EAttribute getTSubProcess_ArtifactGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TSubProcess#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSubProcess#getArtifact()
	 * @see #getTSubProcess()
	 * @generated
	 */
	EReference getTSubProcess_Artifact();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TSubProcess#isTriggeredByEvent <em>Triggered By Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Triggered By Event</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TSubProcess#isTriggeredByEvent()
	 * @see #getTSubProcess()
	 * @generated
	 */
	EAttribute getTSubProcess_TriggeredByEvent();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TTask <em>TTask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTask</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TTask
	 * @generated
	 */
	EClass getTTask();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TTerminateEventDefinition <em>TTerminate Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTerminate Event Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TTerminateEventDefinition
	 * @generated
	 */
	EClass getTTerminateEventDefinition();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TText <em>TText</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TText</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TText
	 * @generated
	 */
	EClass getTText();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TText#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TText#getMixed()
	 * @see #getTText()
	 * @generated
	 */
	EAttribute getTText_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TText#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TText#getAny()
	 * @see #getTText()
	 * @generated
	 */
	EAttribute getTText_Any();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TTextAnnotation <em>TText Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TText Annotation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TTextAnnotation
	 * @generated
	 */
	EClass getTTextAnnotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TTextAnnotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TTextAnnotation#getText()
	 * @see #getTTextAnnotation()
	 * @generated
	 */
	EReference getTTextAnnotation_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TTextAnnotation#getTextFormat <em>Text Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Format</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TTextAnnotation#getTextFormat()
	 * @see #getTTextAnnotation()
	 * @generated
	 */
	EAttribute getTTextAnnotation_TextFormat();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TThrowEvent <em>TThrow Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TThrow Event</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TThrowEvent
	 * @generated
	 */
	EClass getTThrowEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TThrowEvent#getDataInput <em>Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Input</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TThrowEvent#getDataInput()
	 * @see #getTThrowEvent()
	 * @generated
	 */
	EReference getTThrowEvent_DataInput();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TThrowEvent#getDataInputAssociation <em>Data Input Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Input Association</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TThrowEvent#getDataInputAssociation()
	 * @see #getTThrowEvent()
	 * @generated
	 */
	EReference getTThrowEvent_DataInputAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TThrowEvent#getInputSet <em>Input Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Set</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TThrowEvent#getInputSet()
	 * @see #getTThrowEvent()
	 * @generated
	 */
	EReference getTThrowEvent_InputSet();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TThrowEvent#getEventDefinitionGroup <em>Event Definition Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Event Definition Group</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TThrowEvent#getEventDefinitionGroup()
	 * @see #getTThrowEvent()
	 * @generated
	 */
	EAttribute getTThrowEvent_EventDefinitionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TThrowEvent#getEventDefinition <em>Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TThrowEvent#getEventDefinition()
	 * @see #getTThrowEvent()
	 * @generated
	 */
	EReference getTThrowEvent_EventDefinition();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.bpmn.bpmn.TThrowEvent#getEventDefinitionRef <em>Event Definition Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Event Definition Ref</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TThrowEvent#getEventDefinitionRef()
	 * @see #getTThrowEvent()
	 * @generated
	 */
	EAttribute getTThrowEvent_EventDefinitionRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TTimerEventDefinition <em>TTimer Event Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTimer Event Definition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TTimerEventDefinition
	 * @generated
	 */
	EClass getTTimerEventDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TTimerEventDefinition#getTimeDate <em>Time Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Date</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TTimerEventDefinition#getTimeDate()
	 * @see #getTTimerEventDefinition()
	 * @generated
	 */
	EReference getTTimerEventDefinition_TimeDate();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TTimerEventDefinition#getTimeDuration <em>Time Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Duration</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TTimerEventDefinition#getTimeDuration()
	 * @see #getTTimerEventDefinition()
	 * @generated
	 */
	EReference getTTimerEventDefinition_TimeDuration();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.bpmn.bpmn.TTimerEventDefinition#getTimeCycle <em>Time Cycle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Cycle</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TTimerEventDefinition#getTimeCycle()
	 * @see #getTTimerEventDefinition()
	 * @generated
	 */
	EReference getTTimerEventDefinition_TimeCycle();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TTransaction <em>TTransaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTransaction</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TTransaction
	 * @generated
	 */
	EClass getTTransaction();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TTransaction#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TTransaction#getMethod()
	 * @see #getTTransaction()
	 * @generated
	 */
	EAttribute getTTransaction_Method();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.bpmn.bpmn.TUserTask <em>TUser Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TUser Task</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TUserTask
	 * @generated
	 */
	EClass getTUserTask();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.bpmn.bpmn.TUserTask#getRendering <em>Rendering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rendering</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TUserTask#getRendering()
	 * @see #getTUserTask()
	 * @generated
	 */
	EReference getTUserTask_Rendering();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.bpmn.bpmn.TUserTask#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Implementation</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TUserTask#getImplementation()
	 * @see #getTUserTask()
	 * @generated
	 */
	EAttribute getTUserTask_Implementation();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.bpmn.bpmn.TAdHocOrdering <em>TAd Hoc Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TAd Hoc Ordering</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TAdHocOrdering
	 * @generated
	 */
	EEnum getTAdHocOrdering();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.bpmn.bpmn.TAssociationDirection <em>TAssociation Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TAssociation Direction</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TAssociationDirection
	 * @generated
	 */
	EEnum getTAssociationDirection();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.bpmn.bpmn.TChoreographyLoopType <em>TChoreography Loop Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TChoreography Loop Type</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TChoreographyLoopType
	 * @generated
	 */
	EEnum getTChoreographyLoopType();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.bpmn.bpmn.TEventBasedGatewayType <em>TEvent Based Gateway Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TEvent Based Gateway Type</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TEventBasedGatewayType
	 * @generated
	 */
	EEnum getTEventBasedGatewayType();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.bpmn.bpmn.TGatewayDirection <em>TGateway Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TGateway Direction</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TGatewayDirection
	 * @generated
	 */
	EEnum getTGatewayDirection();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.bpmn.bpmn.TImplementationMember1 <em>TImplementation Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TImplementation Member1</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TImplementationMember1
	 * @generated
	 */
	EEnum getTImplementationMember1();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.bpmn.bpmn.TItemKind <em>TItem Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TItem Kind</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TItemKind
	 * @generated
	 */
	EEnum getTItemKind();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.bpmn.bpmn.TMultiInstanceFlowCondition <em>TMulti Instance Flow Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TMulti Instance Flow Condition</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMultiInstanceFlowCondition
	 * @generated
	 */
	EEnum getTMultiInstanceFlowCondition();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.bpmn.bpmn.TProcessType <em>TProcess Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TProcess Type</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TProcessType
	 * @generated
	 */
	EEnum getTProcessType();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.bpmn.bpmn.TRelationshipDirection <em>TRelationship Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TRelationship Direction</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TRelationshipDirection
	 * @generated
	 */
	EEnum getTRelationshipDirection();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.bpmn.bpmn.TTransactionMethodMember1 <em>TTransaction Method Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TTransaction Method Member1</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TTransactionMethodMember1
	 * @generated
	 */
	EEnum getTTransactionMethodMember1();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.bpmn.bpmn.TAdHocOrdering <em>TAd Hoc Ordering Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TAd Hoc Ordering Object</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TAdHocOrdering
	 * @model instanceClass="org.omg.spec.bpmn.bpmn.TAdHocOrdering"
	 *        extendedMetaData="name='tAdHocOrdering:Object' baseType='tAdHocOrdering'"
	 * @generated
	 */
	EDataType getTAdHocOrderingObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.bpmn.bpmn.TAssociationDirection <em>TAssociation Direction Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TAssociation Direction Object</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TAssociationDirection
	 * @model instanceClass="org.omg.spec.bpmn.bpmn.TAssociationDirection"
	 *        extendedMetaData="name='tAssociationDirection:Object' baseType='tAssociationDirection'"
	 * @generated
	 */
	EDataType getTAssociationDirectionObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.bpmn.bpmn.TChoreographyLoopType <em>TChoreography Loop Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TChoreography Loop Type Object</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TChoreographyLoopType
	 * @model instanceClass="org.omg.spec.bpmn.bpmn.TChoreographyLoopType"
	 *        extendedMetaData="name='tChoreographyLoopType:Object' baseType='tChoreographyLoopType'"
	 * @generated
	 */
	EDataType getTChoreographyLoopTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.bpmn.bpmn.TEventBasedGatewayType <em>TEvent Based Gateway Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TEvent Based Gateway Type Object</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TEventBasedGatewayType
	 * @model instanceClass="org.omg.spec.bpmn.bpmn.TEventBasedGatewayType"
	 *        extendedMetaData="name='tEventBasedGatewayType:Object' baseType='tEventBasedGatewayType'"
	 * @generated
	 */
	EDataType getTEventBasedGatewayTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.bpmn.bpmn.TGatewayDirection <em>TGateway Direction Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TGateway Direction Object</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TGatewayDirection
	 * @model instanceClass="org.omg.spec.bpmn.bpmn.TGatewayDirection"
	 *        extendedMetaData="name='tGatewayDirection:Object' baseType='tGatewayDirection'"
	 * @generated
	 */
	EDataType getTGatewayDirectionObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>TImplementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TImplementation</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='tImplementation' memberTypes='http://www.eclipse.org/emf/2003/XMLType#anyURI tImplementation_._member_._1'"
	 * @generated
	 */
	EDataType getTImplementation();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.bpmn.bpmn.TImplementationMember1 <em>TImplementation Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TImplementation Member1 Object</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TImplementationMember1
	 * @model instanceClass="org.omg.spec.bpmn.bpmn.TImplementationMember1"
	 *        extendedMetaData="name='tImplementation_._member_._1:Object' baseType='tImplementation_._member_._1'"
	 * @generated
	 */
	EDataType getTImplementationMember1Object();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.bpmn.bpmn.TItemKind <em>TItem Kind Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TItem Kind Object</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TItemKind
	 * @model instanceClass="org.omg.spec.bpmn.bpmn.TItemKind"
	 *        extendedMetaData="name='tItemKind:Object' baseType='tItemKind'"
	 * @generated
	 */
	EDataType getTItemKindObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.bpmn.bpmn.TMultiInstanceFlowCondition <em>TMulti Instance Flow Condition Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TMulti Instance Flow Condition Object</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TMultiInstanceFlowCondition
	 * @model instanceClass="org.omg.spec.bpmn.bpmn.TMultiInstanceFlowCondition"
	 *        extendedMetaData="name='tMultiInstanceFlowCondition:Object' baseType='tMultiInstanceFlowCondition'"
	 * @generated
	 */
	EDataType getTMultiInstanceFlowConditionObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.bpmn.bpmn.TProcessType <em>TProcess Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TProcess Type Object</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TProcessType
	 * @model instanceClass="org.omg.spec.bpmn.bpmn.TProcessType"
	 *        extendedMetaData="name='tProcessType:Object' baseType='tProcessType'"
	 * @generated
	 */
	EDataType getTProcessTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.bpmn.bpmn.TRelationshipDirection <em>TRelationship Direction Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TRelationship Direction Object</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TRelationshipDirection
	 * @model instanceClass="org.omg.spec.bpmn.bpmn.TRelationshipDirection"
	 *        extendedMetaData="name='tRelationshipDirection:Object' baseType='tRelationshipDirection'"
	 * @generated
	 */
	EDataType getTRelationshipDirectionObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>TTransaction Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TTransaction Method</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='tTransactionMethod' memberTypes='http://www.eclipse.org/emf/2003/XMLType#anyURI tTransactionMethod_._member_._1'"
	 * @generated
	 */
	EDataType getTTransactionMethod();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.bpmn.bpmn.TTransactionMethodMember1 <em>TTransaction Method Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TTransaction Method Member1 Object</em>'.
	 * @see org.omg.spec.bpmn.bpmn.TTransactionMethodMember1
	 * @model instanceClass="org.omg.spec.bpmn.bpmn.TTransactionMethodMember1"
	 *        extendedMetaData="name='tTransactionMethod_._member_._1:Object' baseType='tTransactionMethod_._member_._1'"
	 * @generated
	 */
	EDataType getTTransactionMethodMember1Object();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BPMNFactory getBPMNFactory();

} //BPMNPackage
