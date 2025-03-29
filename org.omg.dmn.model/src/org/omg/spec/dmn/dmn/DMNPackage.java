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
package org.omg.spec.dmn.dmn;


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
 * <!-- begin-model-doc -->
 * The Diagram Interchange (DI) package enables interchange of graphical information that language users have control over, such as position of nodes and line routing points. Language specifications specialize elements of DI to define diagram interchange elements for a language.
 * <!-- end-model-doc -->
 * @see org.omg.spec.dmn.dmn.DMNFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = DMNPackage.eNS_URI, genModel = "/model/DMN16.genmodel", genModelSourceLocations = {"model/DMN16.genmodel","org.omg.dmn.model/model/DMN16.genmodel"}, ecore="/model/dmn.ecore", ecoreSourceLocations="/model/dmn.ecore")
public interface DMNPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dmn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://www.omg.org/spec/DMN/20240513/MODEL/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dmn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DMNPackage eINSTANCE = org.omg.spec.dmn.dmn.impl.DMNPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.DMNRootImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getDMNRoot()
	 * @generated
	 */
	int DMN_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__ARTIFACT = 3;

	/**
	 * The feature id for the '<em><b>DMN Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__DMN_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__ASSOCIATION = 5;

	/**
	 * The feature id for the '<em><b>Authority Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__AUTHORITY_REQUIREMENT = 6;

	/**
	 * The feature id for the '<em><b>Business Context Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__BUSINESS_CONTEXT_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Business Knowledge Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__BUSINESS_KNOWLEDGE_MODEL = 8;

	/**
	 * The feature id for the '<em><b>Invocable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__INVOCABLE = 9;

	/**
	 * The feature id for the '<em><b>Drg Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__DRG_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Named Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__NAMED_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Conditional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__CONDITIONAL = 12;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__CONTEXT = 14;

	/**
	 * The feature id for the '<em><b>Context Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__CONTEXT_ENTRY = 15;

	/**
	 * The feature id for the '<em><b>Decision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__DECISION = 16;

	/**
	 * The feature id for the '<em><b>Decision Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__DECISION_SERVICE = 17;

	/**
	 * The feature id for the '<em><b>Decision Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__DECISION_TABLE = 18;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__DEFINITIONS = 19;

	/**
	 * The feature id for the '<em><b>Element Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__ELEMENT_COLLECTION = 20;

	/**
	 * The feature id for the '<em><b>Every</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__EVERY = 21;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__FILTER = 22;

	/**
	 * The feature id for the '<em><b>For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__FOR = 23;

	/**
	 * The feature id for the '<em><b>Function Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__FUNCTION_DEFINITION = 24;

	/**
	 * The feature id for the '<em><b>Function Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__FUNCTION_ITEM = 25;

	/**
	 * The feature id for the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__GROUP = 26;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__IMPORT = 27;

	/**
	 * The feature id for the '<em><b>Information Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__INFORMATION_ITEM = 28;

	/**
	 * The feature id for the '<em><b>Information Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__INFORMATION_REQUIREMENT = 29;

	/**
	 * The feature id for the '<em><b>Input Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__INPUT_DATA = 30;

	/**
	 * The feature id for the '<em><b>Invocation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__INVOCATION = 31;

	/**
	 * The feature id for the '<em><b>Item Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__ITEM_DEFINITION = 32;

	/**
	 * The feature id for the '<em><b>Knowledge Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__KNOWLEDGE_REQUIREMENT = 33;

	/**
	 * The feature id for the '<em><b>Knowledge Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__KNOWLEDGE_SOURCE = 34;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__LIST = 35;

	/**
	 * The feature id for the '<em><b>Literal Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__LITERAL_EXPRESSION = 36;

	/**
	 * The feature id for the '<em><b>Organization Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__ORGANIZATION_UNIT = 37;

	/**
	 * The feature id for the '<em><b>Performance Indicator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__PERFORMANCE_INDICATOR = 38;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__RELATION = 39;

	/**
	 * The feature id for the '<em><b>Some</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__SOME = 40;

	/**
	 * The feature id for the '<em><b>Text Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT__TEXT_ANNOTATION = 41;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT_FEATURE_COUNT = 42;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DMN_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.ExtensionElementsTypeImpl <em>Extension Elements Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.ExtensionElementsTypeImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getExtensionElementsType()
	 * @generated
	 */
	int EXTENSION_ELEMENTS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ELEMENTS_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Extension Elements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ELEMENTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Extension Elements Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSION_ELEMENTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TDMNElementImpl <em>TDMN Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TDMNElementImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTDMNElement()
	 * @generated
	 */
	int TDMN_ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDMN_ELEMENT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDMN_ELEMENT__EXTENSION_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDMN_ELEMENT__ID = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDMN_ELEMENT__LABEL = 3;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDMN_ELEMENT__ANY_ATTRIBUTE = 4;

	/**
	 * The number of structural features of the '<em>TDMN Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDMN_ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>TDMN Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDMN_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TArtifactImpl <em>TArtifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TArtifactImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTArtifact()
	 * @generated
	 */
	int TARTIFACT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT__DESCRIPTION = TDMN_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT__EXTENSION_ELEMENTS = TDMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT__ID = TDMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT__LABEL = TDMN_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT__ANY_ATTRIBUTE = TDMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>TArtifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_FEATURE_COUNT = TDMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TArtifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARTIFACT_OPERATION_COUNT = TDMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TAssociationImpl <em>TAssociation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TAssociationImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTAssociation()
	 * @generated
	 */
	int TASSOCIATION = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION__DESCRIPTION = TARTIFACT__DESCRIPTION;

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
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION__LABEL = TARTIFACT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION__ANY_ATTRIBUTE = TARTIFACT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Source Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION__SOURCE_REF = TARTIFACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION__TARGET_REF = TARTIFACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Association Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASSOCIATION__ASSOCIATION_DIRECTION = TARTIFACT_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TAuthorityRequirementImpl <em>TAuthority Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TAuthorityRequirementImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTAuthorityRequirement()
	 * @generated
	 */
	int TAUTHORITY_REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAUTHORITY_REQUIREMENT__DESCRIPTION = TDMN_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAUTHORITY_REQUIREMENT__EXTENSION_ELEMENTS = TDMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAUTHORITY_REQUIREMENT__ID = TDMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAUTHORITY_REQUIREMENT__LABEL = TDMN_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAUTHORITY_REQUIREMENT__ANY_ATTRIBUTE = TDMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Required Decision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAUTHORITY_REQUIREMENT__REQUIRED_DECISION = TDMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAUTHORITY_REQUIREMENT__REQUIRED_INPUT = TDMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Required Authority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAUTHORITY_REQUIREMENT__REQUIRED_AUTHORITY = TDMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TAuthority Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAUTHORITY_REQUIREMENT_FEATURE_COUNT = TDMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TAuthority Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAUTHORITY_REQUIREMENT_OPERATION_COUNT = TDMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TBindingImpl <em>TBinding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TBindingImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTBinding()
	 * @generated
	 */
	int TBINDING = 5;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBINDING__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBINDING__EXPRESSION_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBINDING__EXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>TBinding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBINDING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TBinding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TNamedElementImpl <em>TNamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TNamedElementImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTNamedElement()
	 * @generated
	 */
	int TNAMED_ELEMENT = 41;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAMED_ELEMENT__DESCRIPTION = TDMN_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAMED_ELEMENT__EXTENSION_ELEMENTS = TDMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAMED_ELEMENT__ID = TDMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAMED_ELEMENT__LABEL = TDMN_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAMED_ELEMENT__ANY_ATTRIBUTE = TDMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAMED_ELEMENT__NAME = TDMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAMED_ELEMENT_FEATURE_COUNT = TDMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAMED_ELEMENT_OPERATION_COUNT = TDMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TBusinessContextElementImpl <em>TBusiness Context Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TBusinessContextElementImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTBusinessContextElement()
	 * @generated
	 */
	int TBUSINESS_CONTEXT_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_CONTEXT_ELEMENT__DESCRIPTION = TNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_CONTEXT_ELEMENT__EXTENSION_ELEMENTS = TNAMED_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_CONTEXT_ELEMENT__ID = TNAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_CONTEXT_ELEMENT__LABEL = TNAMED_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_CONTEXT_ELEMENT__ANY_ATTRIBUTE = TNAMED_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_CONTEXT_ELEMENT__NAME = TNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_CONTEXT_ELEMENT__URI = TNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TBusiness Context Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_CONTEXT_ELEMENT_FEATURE_COUNT = TNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TBusiness Context Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_CONTEXT_ELEMENT_OPERATION_COUNT = TNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TDRGElementImpl <em>TDRG Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TDRGElementImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTDRGElement()
	 * @generated
	 */
	int TDRG_ELEMENT = 19;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDRG_ELEMENT__DESCRIPTION = TNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDRG_ELEMENT__EXTENSION_ELEMENTS = TNAMED_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDRG_ELEMENT__ID = TNAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDRG_ELEMENT__LABEL = TNAMED_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDRG_ELEMENT__ANY_ATTRIBUTE = TNAMED_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDRG_ELEMENT__NAME = TNAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>TDRG Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDRG_ELEMENT_FEATURE_COUNT = TNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>TDRG Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDRG_ELEMENT_OPERATION_COUNT = TNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TInvocableImpl <em>TInvocable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TInvocableImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTInvocable()
	 * @generated
	 */
	int TINVOCABLE = 33;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINVOCABLE__DESCRIPTION = TDRG_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINVOCABLE__EXTENSION_ELEMENTS = TDRG_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINVOCABLE__ID = TDRG_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINVOCABLE__LABEL = TDRG_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINVOCABLE__ANY_ATTRIBUTE = TDRG_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINVOCABLE__NAME = TDRG_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINVOCABLE__VARIABLE = TDRG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TInvocable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINVOCABLE_FEATURE_COUNT = TDRG_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TInvocable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINVOCABLE_OPERATION_COUNT = TDRG_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TBusinessKnowledgeModelImpl <em>TBusiness Knowledge Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TBusinessKnowledgeModelImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTBusinessKnowledgeModel()
	 * @generated
	 */
	int TBUSINESS_KNOWLEDGE_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_KNOWLEDGE_MODEL__DESCRIPTION = TINVOCABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_KNOWLEDGE_MODEL__EXTENSION_ELEMENTS = TINVOCABLE__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_KNOWLEDGE_MODEL__ID = TINVOCABLE__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_KNOWLEDGE_MODEL__LABEL = TINVOCABLE__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_KNOWLEDGE_MODEL__ANY_ATTRIBUTE = TINVOCABLE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_KNOWLEDGE_MODEL__NAME = TINVOCABLE__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_KNOWLEDGE_MODEL__VARIABLE = TINVOCABLE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Encapsulated Logic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_KNOWLEDGE_MODEL__ENCAPSULATED_LOGIC = TINVOCABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Knowledge Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_KNOWLEDGE_MODEL__KNOWLEDGE_REQUIREMENT = TINVOCABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Authority Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_KNOWLEDGE_MODEL__AUTHORITY_REQUIREMENT = TINVOCABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TBusiness Knowledge Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_KNOWLEDGE_MODEL_FEATURE_COUNT = TINVOCABLE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TBusiness Knowledge Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBUSINESS_KNOWLEDGE_MODEL_OPERATION_COUNT = TINVOCABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TChildExpressionImpl <em>TChild Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TChildExpressionImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTChildExpression()
	 * @generated
	 */
	int TCHILD_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHILD_EXPRESSION__EXPRESSION_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHILD_EXPRESSION__EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHILD_EXPRESSION__ID = 2;

	/**
	 * The number of structural features of the '<em>TChild Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHILD_EXPRESSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TChild Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCHILD_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TExpressionImpl <em>TExpression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TExpressionImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTExpression()
	 * @generated
	 */
	int TEXPRESSION = 21;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPRESSION__DESCRIPTION = TDMN_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPRESSION__EXTENSION_ELEMENTS = TDMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPRESSION__ID = TDMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPRESSION__LABEL = TDMN_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPRESSION__ANY_ATTRIBUTE = TDMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPRESSION__TYPE_REF = TDMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPRESSION_FEATURE_COUNT = TDMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TExpression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXPRESSION_OPERATION_COUNT = TDMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TConditionalImpl <em>TConditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TConditionalImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTConditional()
	 * @generated
	 */
	int TCONDITIONAL = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL__DESCRIPTION = TEXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL__EXTENSION_ELEMENTS = TEXPRESSION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL__ID = TEXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL__LABEL = TEXPRESSION__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL__ANY_ATTRIBUTE = TEXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL__TYPE_REF = TEXPRESSION__TYPE_REF;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL__IF = TEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL__THEN = TEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL__ELSE = TEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TConditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL_FEATURE_COUNT = TEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TConditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONDITIONAL_OPERATION_COUNT = TEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TContextImpl <em>TContext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TContextImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTContext()
	 * @generated
	 */
	int TCONTEXT = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTEXT__DESCRIPTION = TEXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTEXT__EXTENSION_ELEMENTS = TEXPRESSION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTEXT__ID = TEXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTEXT__LABEL = TEXPRESSION__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTEXT__ANY_ATTRIBUTE = TEXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTEXT__TYPE_REF = TEXPRESSION__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Context Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTEXT__CONTEXT_ENTRY = TEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TContext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTEXT_FEATURE_COUNT = TEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TContext</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTEXT_OPERATION_COUNT = TEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TContextEntryImpl <em>TContext Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TContextEntryImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTContextEntry()
	 * @generated
	 */
	int TCONTEXT_ENTRY = 11;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTEXT_ENTRY__DESCRIPTION = TDMN_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTEXT_ENTRY__EXTENSION_ELEMENTS = TDMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTEXT_ENTRY__ID = TDMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTEXT_ENTRY__LABEL = TDMN_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTEXT_ENTRY__ANY_ATTRIBUTE = TDMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTEXT_ENTRY__VARIABLE = TDMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTEXT_ENTRY__EXPRESSION_GROUP = TDMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTEXT_ENTRY__EXPRESSION = TDMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TContext Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTEXT_ENTRY_FEATURE_COUNT = TDMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TContext Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCONTEXT_ENTRY_OPERATION_COUNT = TDMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TDecisionImpl <em>TDecision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TDecisionImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTDecision()
	 * @generated
	 */
	int TDECISION = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__DESCRIPTION = TDRG_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__EXTENSION_ELEMENTS = TDRG_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__ID = TDRG_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__LABEL = TDRG_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__ANY_ATTRIBUTE = TDRG_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__NAME = TDRG_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__QUESTION = TDRG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allowed Answers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__ALLOWED_ANSWERS = TDRG_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__VARIABLE = TDRG_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Information Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__INFORMATION_REQUIREMENT = TDRG_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Knowledge Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__KNOWLEDGE_REQUIREMENT = TDRG_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Authority Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__AUTHORITY_REQUIREMENT = TDRG_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Supported Objective</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__SUPPORTED_OBJECTIVE = TDRG_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Impacted Performance Indicator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__IMPACTED_PERFORMANCE_INDICATOR = TDRG_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Decision Maker</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__DECISION_MAKER = TDRG_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Decision Owner</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__DECISION_OWNER = TDRG_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Using Process</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__USING_PROCESS = TDRG_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Using Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__USING_TASK = TDRG_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__EXPRESSION_GROUP = TDRG_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION__EXPRESSION = TDRG_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>TDecision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_FEATURE_COUNT = TDRG_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>TDecision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_OPERATION_COUNT = TDRG_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TDecisionRuleImpl <em>TDecision Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TDecisionRuleImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTDecisionRule()
	 * @generated
	 */
	int TDECISION_RULE = 13;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_RULE__DESCRIPTION = TDMN_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_RULE__EXTENSION_ELEMENTS = TDMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_RULE__ID = TDMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_RULE__LABEL = TDMN_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_RULE__ANY_ATTRIBUTE = TDMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Input Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_RULE__INPUT_ENTRY = TDMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_RULE__OUTPUT_ENTRY = TDMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotation Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_RULE__ANNOTATION_ENTRY = TDMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TDecision Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_RULE_FEATURE_COUNT = TDMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TDecision Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_RULE_OPERATION_COUNT = TDMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TDecisionServiceImpl <em>TDecision Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TDecisionServiceImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTDecisionService()
	 * @generated
	 */
	int TDECISION_SERVICE = 14;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_SERVICE__DESCRIPTION = TINVOCABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_SERVICE__EXTENSION_ELEMENTS = TINVOCABLE__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_SERVICE__ID = TINVOCABLE__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_SERVICE__LABEL = TINVOCABLE__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_SERVICE__ANY_ATTRIBUTE = TINVOCABLE__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_SERVICE__NAME = TINVOCABLE__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_SERVICE__VARIABLE = TINVOCABLE__VARIABLE;

	/**
	 * The feature id for the '<em><b>Output Decision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_SERVICE__OUTPUT_DECISION = TINVOCABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Encapsulated Decision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_SERVICE__ENCAPSULATED_DECISION = TINVOCABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Decision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_SERVICE__INPUT_DECISION = TINVOCABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_SERVICE__INPUT_DATA = TINVOCABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TDecision Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_SERVICE_FEATURE_COUNT = TINVOCABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TDecision Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_SERVICE_OPERATION_COUNT = TINVOCABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TDecisionTableImpl <em>TDecision Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TDecisionTableImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTDecisionTable()
	 * @generated
	 */
	int TDECISION_TABLE = 15;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TABLE__DESCRIPTION = TEXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TABLE__EXTENSION_ELEMENTS = TEXPRESSION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TABLE__ID = TEXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TABLE__LABEL = TEXPRESSION__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TABLE__ANY_ATTRIBUTE = TEXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TABLE__TYPE_REF = TEXPRESSION__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TABLE__INPUT = TEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TABLE__OUTPUT = TEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TABLE__ANNOTATION = TEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TABLE__RULE = TEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TABLE__AGGREGATION = TEXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Hit Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TABLE__HIT_POLICY = TEXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TABLE__OUTPUT_LABEL = TEXPRESSION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Preferred Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TABLE__PREFERRED_ORIENTATION = TEXPRESSION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>TDecision Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TABLE_FEATURE_COUNT = TEXPRESSION_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>TDecision Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECISION_TABLE_OPERATION_COUNT = TEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TDefinitionsImpl <em>TDefinitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TDefinitionsImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTDefinitions()
	 * @generated
	 */
	int TDEFINITIONS = 16;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__DESCRIPTION = TNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__EXTENSION_ELEMENTS = TNAMED_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ID = TNAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__LABEL = TNAMED_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ANY_ATTRIBUTE = TNAMED_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__NAME = TNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__IMPORT = TNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Item Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ITEM_DEFINITION = TNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Drg Element Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__DRG_ELEMENT_GROUP = TNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Drg Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__DRG_ELEMENT = TNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Artifact Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ARTIFACT_GROUP = TNAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ARTIFACT = TNAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Element Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__ELEMENT_COLLECTION = TNAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Business Context Element Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__BUSINESS_CONTEXT_ELEMENT_GROUP = TNAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Business Context Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__BUSINESS_CONTEXT_ELEMENT = TNAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>DMNDI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__DMNDI = TNAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Exporter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__EXPORTER = TNAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Exporter Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__EXPORTER_VERSION = TNAMED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__EXPRESSION_LANGUAGE = TNAMED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__NAMESPACE = TNAMED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Type Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS__TYPE_LANGUAGE = TNAMED_ELEMENT_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>TDefinitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS_FEATURE_COUNT = TNAMED_ELEMENT_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>TDefinitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDEFINITIONS_OPERATION_COUNT = TNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TDMNElementReferenceImpl <em>TDMN Element Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TDMNElementReferenceImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTDMNElementReference()
	 * @generated
	 */
	int TDMN_ELEMENT_REFERENCE = 18;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDMN_ELEMENT_REFERENCE__HREF = 0;

	/**
	 * The number of structural features of the '<em>TDMN Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDMN_ELEMENT_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TDMN Element Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDMN_ELEMENT_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TElementCollectionImpl <em>TElement Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TElementCollectionImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTElementCollection()
	 * @generated
	 */
	int TELEMENT_COLLECTION = 20;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMENT_COLLECTION__DESCRIPTION = TNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMENT_COLLECTION__EXTENSION_ELEMENTS = TNAMED_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMENT_COLLECTION__ID = TNAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMENT_COLLECTION__LABEL = TNAMED_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMENT_COLLECTION__ANY_ATTRIBUTE = TNAMED_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMENT_COLLECTION__NAME = TNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Drg Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMENT_COLLECTION__DRG_ELEMENT = TNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TElement Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMENT_COLLECTION_FEATURE_COUNT = TNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TElement Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TELEMENT_COLLECTION_OPERATION_COUNT = TNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TFilterImpl <em>TFilter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TFilterImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTFilter()
	 * @generated
	 */
	int TFILTER = 22;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFILTER__DESCRIPTION = TEXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFILTER__EXTENSION_ELEMENTS = TEXPRESSION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFILTER__ID = TEXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFILTER__LABEL = TEXPRESSION__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFILTER__ANY_ATTRIBUTE = TEXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFILTER__TYPE_REF = TEXPRESSION__TYPE_REF;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFILTER__IN = TEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Match</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFILTER__MATCH = TEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TFilter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFILTER_FEATURE_COUNT = TEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TFilter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFILTER_OPERATION_COUNT = TEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TIteratorImpl <em>TIterator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TIteratorImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTIterator()
	 * @generated
	 */
	int TITERATOR = 36;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITERATOR__DESCRIPTION = TEXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITERATOR__EXTENSION_ELEMENTS = TEXPRESSION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITERATOR__ID = TEXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITERATOR__LABEL = TEXPRESSION__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITERATOR__ANY_ATTRIBUTE = TEXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITERATOR__TYPE_REF = TEXPRESSION__TYPE_REF;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITERATOR__IN = TEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iterator Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITERATOR__ITERATOR_VARIABLE = TEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TIterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITERATOR_FEATURE_COUNT = TEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TIterator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITERATOR_OPERATION_COUNT = TEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TForImpl <em>TFor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TForImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTFor()
	 * @generated
	 */
	int TFOR = 23;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOR__DESCRIPTION = TITERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOR__EXTENSION_ELEMENTS = TITERATOR__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOR__ID = TITERATOR__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOR__LABEL = TITERATOR__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOR__ANY_ATTRIBUTE = TITERATOR__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOR__TYPE_REF = TITERATOR__TYPE_REF;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOR__IN = TITERATOR__IN;

	/**
	 * The feature id for the '<em><b>Iterator Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOR__ITERATOR_VARIABLE = TITERATOR__ITERATOR_VARIABLE;

	/**
	 * The feature id for the '<em><b>Return</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOR__RETURN = TITERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TFor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOR_FEATURE_COUNT = TITERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TFor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOR_OPERATION_COUNT = TITERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TFunctionDefinitionImpl <em>TFunction Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TFunctionDefinitionImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTFunctionDefinition()
	 * @generated
	 */
	int TFUNCTION_DEFINITION = 24;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_DEFINITION__DESCRIPTION = TEXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_DEFINITION__EXTENSION_ELEMENTS = TEXPRESSION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_DEFINITION__ID = TEXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_DEFINITION__LABEL = TEXPRESSION__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_DEFINITION__ANY_ATTRIBUTE = TEXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_DEFINITION__TYPE_REF = TEXPRESSION__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Formal Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_DEFINITION__FORMAL_PARAMETER = TEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_DEFINITION__EXPRESSION_GROUP = TEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_DEFINITION__EXPRESSION = TEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_DEFINITION__KIND = TEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TFunction Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_DEFINITION_FEATURE_COUNT = TEXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TFunction Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_DEFINITION_OPERATION_COUNT = TEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TFunctionItemImpl <em>TFunction Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TFunctionItemImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTFunctionItem()
	 * @generated
	 */
	int TFUNCTION_ITEM = 25;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_ITEM__DESCRIPTION = TDMN_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_ITEM__EXTENSION_ELEMENTS = TDMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_ITEM__ID = TDMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_ITEM__LABEL = TDMN_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_ITEM__ANY_ATTRIBUTE = TDMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_ITEM__PARAMETERS = TDMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_ITEM__OUTPUT_TYPE_REF = TDMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TFunction Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_ITEM_FEATURE_COUNT = TDMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TFunction Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_ITEM_OPERATION_COUNT = TDMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TGroupImpl <em>TGroup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TGroupImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTGroup()
	 * @generated
	 */
	int TGROUP = 26;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP__DESCRIPTION = TARTIFACT__DESCRIPTION;

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
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP__LABEL = TARTIFACT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP__ANY_ATTRIBUTE = TARTIFACT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP__NAME = TARTIFACT_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TImportImpl <em>TImport</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TImportImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTImport()
	 * @generated
	 */
	int TIMPORT = 27;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__DESCRIPTION = TNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__EXTENSION_ELEMENTS = TNAMED_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__ID = TNAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__LABEL = TNAMED_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__ANY_ATTRIBUTE = TNAMED_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__NAME = TNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Import Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__IMPORT_TYPE = TNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__LOCATION_URI = TNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT__NAMESPACE = TNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TImport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT_FEATURE_COUNT = TNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TImport</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORT_OPERATION_COUNT = TNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TImportedValuesImpl <em>TImported Values</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TImportedValuesImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTImportedValues()
	 * @generated
	 */
	int TIMPORTED_VALUES = 28;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORTED_VALUES__DESCRIPTION = TIMPORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORTED_VALUES__EXTENSION_ELEMENTS = TIMPORT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORTED_VALUES__ID = TIMPORT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORTED_VALUES__LABEL = TIMPORT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORTED_VALUES__ANY_ATTRIBUTE = TIMPORT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORTED_VALUES__NAME = TIMPORT__NAME;

	/**
	 * The feature id for the '<em><b>Import Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORTED_VALUES__IMPORT_TYPE = TIMPORT__IMPORT_TYPE;

	/**
	 * The feature id for the '<em><b>Location URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORTED_VALUES__LOCATION_URI = TIMPORT__LOCATION_URI;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORTED_VALUES__NAMESPACE = TIMPORT__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Imported Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORTED_VALUES__IMPORTED_ELEMENT = TIMPORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORTED_VALUES__EXPRESSION_LANGUAGE = TIMPORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TImported Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORTED_VALUES_FEATURE_COUNT = TIMPORT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TImported Values</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMPORTED_VALUES_OPERATION_COUNT = TIMPORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TInformationItemImpl <em>TInformation Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TInformationItemImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTInformationItem()
	 * @generated
	 */
	int TINFORMATION_ITEM = 29;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_ITEM__DESCRIPTION = TNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_ITEM__EXTENSION_ELEMENTS = TNAMED_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_ITEM__ID = TNAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_ITEM__LABEL = TNAMED_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_ITEM__ANY_ATTRIBUTE = TNAMED_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_ITEM__NAME = TNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_ITEM__TYPE_REF = TNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TInformation Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_ITEM_FEATURE_COUNT = TNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TInformation Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_ITEM_OPERATION_COUNT = TNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TInformationRequirementImpl <em>TInformation Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TInformationRequirementImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTInformationRequirement()
	 * @generated
	 */
	int TINFORMATION_REQUIREMENT = 30;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_REQUIREMENT__DESCRIPTION = TDMN_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_REQUIREMENT__EXTENSION_ELEMENTS = TDMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_REQUIREMENT__ID = TDMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_REQUIREMENT__LABEL = TDMN_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_REQUIREMENT__ANY_ATTRIBUTE = TDMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Required Decision</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_REQUIREMENT__REQUIRED_DECISION = TDMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_REQUIREMENT__REQUIRED_INPUT = TDMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TInformation Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_REQUIREMENT_FEATURE_COUNT = TDMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TInformation Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINFORMATION_REQUIREMENT_OPERATION_COUNT = TDMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TInputClauseImpl <em>TInput Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TInputClauseImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTInputClause()
	 * @generated
	 */
	int TINPUT_CLAUSE = 31;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_CLAUSE__DESCRIPTION = TDMN_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_CLAUSE__EXTENSION_ELEMENTS = TDMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_CLAUSE__ID = TDMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_CLAUSE__LABEL = TDMN_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_CLAUSE__ANY_ATTRIBUTE = TDMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Input Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_CLAUSE__INPUT_EXPRESSION = TDMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_CLAUSE__INPUT_VALUES = TDMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TInput Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_CLAUSE_FEATURE_COUNT = TDMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TInput Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_CLAUSE_OPERATION_COUNT = TDMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TInputDataImpl <em>TInput Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TInputDataImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTInputData()
	 * @generated
	 */
	int TINPUT_DATA = 32;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_DATA__DESCRIPTION = TDRG_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_DATA__EXTENSION_ELEMENTS = TDRG_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_DATA__ID = TDRG_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_DATA__LABEL = TDRG_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_DATA__ANY_ATTRIBUTE = TDRG_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_DATA__NAME = TDRG_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_DATA__VARIABLE = TDRG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TInput Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_DATA_FEATURE_COUNT = TDRG_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TInput Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINPUT_DATA_OPERATION_COUNT = TDRG_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TInvocationImpl <em>TInvocation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TInvocationImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTInvocation()
	 * @generated
	 */
	int TINVOCATION = 34;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINVOCATION__DESCRIPTION = TEXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINVOCATION__EXTENSION_ELEMENTS = TEXPRESSION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINVOCATION__ID = TEXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINVOCATION__LABEL = TEXPRESSION__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINVOCATION__ANY_ATTRIBUTE = TEXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINVOCATION__TYPE_REF = TEXPRESSION__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINVOCATION__EXPRESSION_GROUP = TEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINVOCATION__EXPRESSION = TEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINVOCATION__BINDING = TEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TInvocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINVOCATION_FEATURE_COUNT = TEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TInvocation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINVOCATION_OPERATION_COUNT = TEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TItemDefinitionImpl <em>TItem Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TItemDefinitionImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTItemDefinition()
	 * @generated
	 */
	int TITEM_DEFINITION = 35;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION__DESCRIPTION = TNAMED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION__EXTENSION_ELEMENTS = TNAMED_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION__ID = TNAMED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION__LABEL = TNAMED_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION__ANY_ATTRIBUTE = TNAMED_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION__NAME = TNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION__TYPE_REF = TNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allowed Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION__ALLOWED_VALUES = TNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION__TYPE_CONSTRAINT = TNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Item Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION__ITEM_COMPONENT = TNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Function Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION__FUNCTION_ITEM = TNAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION__IS_COLLECTION = TNAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION__TYPE_LANGUAGE = TNAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>TItem Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION_FEATURE_COUNT = TNAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>TItem Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITEM_DEFINITION_OPERATION_COUNT = TNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TKnowledgeRequirementImpl <em>TKnowledge Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TKnowledgeRequirementImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTKnowledgeRequirement()
	 * @generated
	 */
	int TKNOWLEDGE_REQUIREMENT = 37;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TKNOWLEDGE_REQUIREMENT__DESCRIPTION = TDMN_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TKNOWLEDGE_REQUIREMENT__EXTENSION_ELEMENTS = TDMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TKNOWLEDGE_REQUIREMENT__ID = TDMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TKNOWLEDGE_REQUIREMENT__LABEL = TDMN_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TKNOWLEDGE_REQUIREMENT__ANY_ATTRIBUTE = TDMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Required Knowledge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TKNOWLEDGE_REQUIREMENT__REQUIRED_KNOWLEDGE = TDMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TKnowledge Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TKNOWLEDGE_REQUIREMENT_FEATURE_COUNT = TDMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TKnowledge Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TKNOWLEDGE_REQUIREMENT_OPERATION_COUNT = TDMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TKnowledgeSourceImpl <em>TKnowledge Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TKnowledgeSourceImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTKnowledgeSource()
	 * @generated
	 */
	int TKNOWLEDGE_SOURCE = 38;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TKNOWLEDGE_SOURCE__DESCRIPTION = TDRG_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TKNOWLEDGE_SOURCE__EXTENSION_ELEMENTS = TDRG_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TKNOWLEDGE_SOURCE__ID = TDRG_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TKNOWLEDGE_SOURCE__LABEL = TDRG_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TKNOWLEDGE_SOURCE__ANY_ATTRIBUTE = TDRG_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TKNOWLEDGE_SOURCE__NAME = TDRG_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Authority Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TKNOWLEDGE_SOURCE__AUTHORITY_REQUIREMENT = TDRG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TKNOWLEDGE_SOURCE__TYPE = TDRG_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TKNOWLEDGE_SOURCE__OWNER = TDRG_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TKNOWLEDGE_SOURCE__LOCATION_URI = TDRG_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TKnowledge Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TKNOWLEDGE_SOURCE_FEATURE_COUNT = TDRG_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TKnowledge Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TKNOWLEDGE_SOURCE_OPERATION_COUNT = TDRG_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TListImpl <em>TList</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TListImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTList()
	 * @generated
	 */
	int TLIST = 39;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLIST__DESCRIPTION = TEXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLIST__EXTENSION_ELEMENTS = TEXPRESSION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLIST__ID = TEXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLIST__LABEL = TEXPRESSION__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLIST__ANY_ATTRIBUTE = TEXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLIST__TYPE_REF = TEXPRESSION__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLIST__EXPRESSION_GROUP = TEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLIST__EXPRESSION = TEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TList</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLIST_FEATURE_COUNT = TEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TList</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLIST_OPERATION_COUNT = TEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TLiteralExpressionImpl <em>TLiteral Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TLiteralExpressionImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTLiteralExpression()
	 * @generated
	 */
	int TLITERAL_EXPRESSION = 40;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_EXPRESSION__DESCRIPTION = TEXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_EXPRESSION__EXTENSION_ELEMENTS = TEXPRESSION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_EXPRESSION__ID = TEXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_EXPRESSION__LABEL = TEXPRESSION__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_EXPRESSION__ANY_ATTRIBUTE = TEXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_EXPRESSION__TYPE_REF = TEXPRESSION__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_EXPRESSION__TEXT = TEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imported Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_EXPRESSION__IMPORTED_VALUES = TEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_EXPRESSION__EXPRESSION_LANGUAGE = TEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>TLiteral Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_EXPRESSION_FEATURE_COUNT = TEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>TLiteral Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLITERAL_EXPRESSION_OPERATION_COUNT = TEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TOrganizationUnitImpl <em>TOrganization Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TOrganizationUnitImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTOrganizationUnit()
	 * @generated
	 */
	int TORGANIZATION_UNIT = 42;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORGANIZATION_UNIT__DESCRIPTION = TBUSINESS_CONTEXT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORGANIZATION_UNIT__EXTENSION_ELEMENTS = TBUSINESS_CONTEXT_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORGANIZATION_UNIT__ID = TBUSINESS_CONTEXT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORGANIZATION_UNIT__LABEL = TBUSINESS_CONTEXT_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORGANIZATION_UNIT__ANY_ATTRIBUTE = TBUSINESS_CONTEXT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORGANIZATION_UNIT__NAME = TBUSINESS_CONTEXT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORGANIZATION_UNIT__URI = TBUSINESS_CONTEXT_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Decision Made</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORGANIZATION_UNIT__DECISION_MADE = TBUSINESS_CONTEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decision Owned</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORGANIZATION_UNIT__DECISION_OWNED = TBUSINESS_CONTEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TOrganization Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORGANIZATION_UNIT_FEATURE_COUNT = TBUSINESS_CONTEXT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TOrganization Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TORGANIZATION_UNIT_OPERATION_COUNT = TBUSINESS_CONTEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TOutputClauseImpl <em>TOutput Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TOutputClauseImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTOutputClause()
	 * @generated
	 */
	int TOUTPUT_CLAUSE = 43;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_CLAUSE__DESCRIPTION = TDMN_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_CLAUSE__EXTENSION_ELEMENTS = TDMN_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_CLAUSE__ID = TDMN_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_CLAUSE__LABEL = TDMN_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_CLAUSE__ANY_ATTRIBUTE = TDMN_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Output Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_CLAUSE__OUTPUT_VALUES = TDMN_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Output Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY = TDMN_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_CLAUSE__NAME = TDMN_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_CLAUSE__TYPE_REF = TDMN_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>TOutput Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_CLAUSE_FEATURE_COUNT = TDMN_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>TOutput Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUTPUT_CLAUSE_OPERATION_COUNT = TDMN_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TPerformanceIndicatorImpl <em>TPerformance Indicator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TPerformanceIndicatorImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTPerformanceIndicator()
	 * @generated
	 */
	int TPERFORMANCE_INDICATOR = 44;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPERFORMANCE_INDICATOR__DESCRIPTION = TBUSINESS_CONTEXT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPERFORMANCE_INDICATOR__EXTENSION_ELEMENTS = TBUSINESS_CONTEXT_ELEMENT__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPERFORMANCE_INDICATOR__ID = TBUSINESS_CONTEXT_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPERFORMANCE_INDICATOR__LABEL = TBUSINESS_CONTEXT_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPERFORMANCE_INDICATOR__ANY_ATTRIBUTE = TBUSINESS_CONTEXT_ELEMENT__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPERFORMANCE_INDICATOR__NAME = TBUSINESS_CONTEXT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPERFORMANCE_INDICATOR__URI = TBUSINESS_CONTEXT_ELEMENT__URI;

	/**
	 * The feature id for the '<em><b>Impacting Decision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPERFORMANCE_INDICATOR__IMPACTING_DECISION = TBUSINESS_CONTEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TPerformance Indicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPERFORMANCE_INDICATOR_FEATURE_COUNT = TBUSINESS_CONTEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TPerformance Indicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPERFORMANCE_INDICATOR_OPERATION_COUNT = TBUSINESS_CONTEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TQuantifiedImpl <em>TQuantified</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TQuantifiedImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTQuantified()
	 * @generated
	 */
	int TQUANTIFIED = 45;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUANTIFIED__DESCRIPTION = TITERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUANTIFIED__EXTENSION_ELEMENTS = TITERATOR__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUANTIFIED__ID = TITERATOR__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUANTIFIED__LABEL = TITERATOR__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUANTIFIED__ANY_ATTRIBUTE = TITERATOR__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUANTIFIED__TYPE_REF = TITERATOR__TYPE_REF;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUANTIFIED__IN = TITERATOR__IN;

	/**
	 * The feature id for the '<em><b>Iterator Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUANTIFIED__ITERATOR_VARIABLE = TITERATOR__ITERATOR_VARIABLE;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUANTIFIED__SATISFIES = TITERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TQuantified</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUANTIFIED_FEATURE_COUNT = TITERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TQuantified</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TQUANTIFIED_OPERATION_COUNT = TITERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TRelationImpl <em>TRelation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TRelationImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTRelation()
	 * @generated
	 */
	int TRELATION = 46;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATION__DESCRIPTION = TEXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATION__EXTENSION_ELEMENTS = TEXPRESSION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATION__ID = TEXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATION__LABEL = TEXPRESSION__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATION__ANY_ATTRIBUTE = TEXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATION__TYPE_REF = TEXPRESSION__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATION__COLUMN = TEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Row</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATION__ROW = TEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TRelation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATION_FEATURE_COUNT = TEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TRelation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRELATION_OPERATION_COUNT = TEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TRuleAnnotationImpl <em>TRule Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TRuleAnnotationImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTRuleAnnotation()
	 * @generated
	 */
	int TRULE_ANNOTATION = 47;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRULE_ANNOTATION__TEXT = 0;

	/**
	 * The number of structural features of the '<em>TRule Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRULE_ANNOTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TRule Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRULE_ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TRuleAnnotationClauseImpl <em>TRule Annotation Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TRuleAnnotationClauseImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTRuleAnnotationClause()
	 * @generated
	 */
	int TRULE_ANNOTATION_CLAUSE = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRULE_ANNOTATION_CLAUSE__NAME = 0;

	/**
	 * The number of structural features of the '<em>TRule Annotation Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRULE_ANNOTATION_CLAUSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TRule Annotation Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRULE_ANNOTATION_CLAUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TTextAnnotationImpl <em>TText Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TTextAnnotationImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTTextAnnotation()
	 * @generated
	 */
	int TTEXT_ANNOTATION = 49;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION__DESCRIPTION = TARTIFACT__DESCRIPTION;

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
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTEXT_ANNOTATION__LABEL = TARTIFACT__LABEL;

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
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TTypedChildExpressionImpl <em>TTyped Child Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TTypedChildExpressionImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTTypedChildExpression()
	 * @generated
	 */
	int TTYPED_CHILD_EXPRESSION = 50;

	/**
	 * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPED_CHILD_EXPRESSION__EXPRESSION_GROUP = TCHILD_EXPRESSION__EXPRESSION_GROUP;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPED_CHILD_EXPRESSION__EXPRESSION = TCHILD_EXPRESSION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPED_CHILD_EXPRESSION__ID = TCHILD_EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPED_CHILD_EXPRESSION__TYPE_REF = TCHILD_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>TTyped Child Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPED_CHILD_EXPRESSION_FEATURE_COUNT = TCHILD_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>TTyped Child Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPED_CHILD_EXPRESSION_OPERATION_COUNT = TCHILD_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.impl.TUnaryTestsImpl <em>TUnary Tests</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.impl.TUnaryTestsImpl
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTUnaryTests()
	 * @generated
	 */
	int TUNARY_TESTS = 51;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNARY_TESTS__DESCRIPTION = TEXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Extension Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNARY_TESTS__EXTENSION_ELEMENTS = TEXPRESSION__EXTENSION_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNARY_TESTS__ID = TEXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNARY_TESTS__LABEL = TEXPRESSION__LABEL;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNARY_TESTS__ANY_ATTRIBUTE = TEXPRESSION__ANY_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Type Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNARY_TESTS__TYPE_REF = TEXPRESSION__TYPE_REF;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNARY_TESTS__TEXT = TEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNARY_TESTS__EXPRESSION_LANGUAGE = TEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TUnary Tests</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNARY_TESTS_FEATURE_COUNT = TEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TUnary Tests</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUNARY_TESTS_OPERATION_COUNT = TEXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.TAssociationDirection <em>TAssociation Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.TAssociationDirection
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTAssociationDirection()
	 * @generated
	 */
	int TASSOCIATION_DIRECTION = 52;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.TBuiltinAggregator <em>TBuiltin Aggregator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.TBuiltinAggregator
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTBuiltinAggregator()
	 * @generated
	 */
	int TBUILTIN_AGGREGATOR = 53;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.TDecisionTableOrientation <em>TDecision Table Orientation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.TDecisionTableOrientation
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTDecisionTableOrientation()
	 * @generated
	 */
	int TDECISION_TABLE_ORIENTATION = 54;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.TFunctionKind <em>TFunction Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.TFunctionKind
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTFunctionKind()
	 * @generated
	 */
	int TFUNCTION_KIND = 55;

	/**
	 * The meta object id for the '{@link org.omg.spec.dmn.dmn.THitPolicy <em>THit Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.THitPolicy
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTHitPolicy()
	 * @generated
	 */
	int THIT_POLICY = 56;

	/**
	 * The meta object id for the '<em>TAssociation Direction Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.TAssociationDirection
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTAssociationDirectionObject()
	 * @generated
	 */
	int TASSOCIATION_DIRECTION_OBJECT = 57;

	/**
	 * The meta object id for the '<em>TBuiltin Aggregator Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.TBuiltinAggregator
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTBuiltinAggregatorObject()
	 * @generated
	 */
	int TBUILTIN_AGGREGATOR_OBJECT = 58;

	/**
	 * The meta object id for the '<em>TDecision Table Orientation Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.TDecisionTableOrientation
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTDecisionTableOrientationObject()
	 * @generated
	 */
	int TDECISION_TABLE_ORIENTATION_OBJECT = 59;

	/**
	 * The meta object id for the '<em>TFunction Kind Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.TFunctionKind
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTFunctionKindObject()
	 * @generated
	 */
	int TFUNCTION_KIND_OBJECT = 60;

	/**
	 * The meta object id for the '<em>THit Policy Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.omg.spec.dmn.dmn.THitPolicy
	 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTHitPolicyObject()
	 * @generated
	 */
	int THIT_POLICY_OBJECT = 61;


	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.DMNRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot
	 * @generated
	 */
	EClass getDMNRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.dmn.dmn.DMNRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getMixed()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EAttribute getDMNRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.omg.spec.dmn.dmn.DMNRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getXMLNSPrefixMap()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.omg.spec.dmn.dmn.DMNRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getXSISchemaLocation()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifact</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getArtifact()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_Artifact();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getDMNElement <em>DMN Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DMN Element</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getDMNElement()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_DMNElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Association</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getAssociation()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_Association();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getAuthorityRequirement <em>Authority Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authority Requirement</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getAuthorityRequirement()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_AuthorityRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getBusinessContextElement <em>Business Context Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Business Context Element</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getBusinessContextElement()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_BusinessContextElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getBusinessKnowledgeModel <em>Business Knowledge Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Business Knowledge Model</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getBusinessKnowledgeModel()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_BusinessKnowledgeModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getInvocable <em>Invocable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invocable</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getInvocable()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_Invocable();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getDrgElement <em>Drg Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drg Element</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getDrgElement()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_DrgElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getNamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Named Element</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getNamedElement()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_NamedElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getConditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conditional</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getConditional()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_Conditional();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getExpression()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getContext()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_Context();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getContextEntry <em>Context Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Context Entry</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getContextEntry()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_ContextEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getDecision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decision</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getDecision()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_Decision();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getDecisionService <em>Decision Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decision Service</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getDecisionService()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_DecisionService();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getDecisionTable <em>Decision Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decision Table</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getDecisionTable()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_DecisionTable();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definitions</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getDefinitions()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_Definitions();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getElementCollection <em>Element Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Collection</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getElementCollection()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_ElementCollection();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getEvery <em>Every</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Every</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getEvery()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_Every();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getFilter()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_Filter();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getFor <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>For</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getFor()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_For();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getFunctionDefinition <em>Function Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function Definition</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getFunctionDefinition()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_FunctionDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getFunctionItem <em>Function Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function Item</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getFunctionItem()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_FunctionItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getGroup()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_Group();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Import</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getImport()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_Import();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getInformationItem <em>Information Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Information Item</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getInformationItem()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_InformationItem();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getInformationRequirement <em>Information Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Information Requirement</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getInformationRequirement()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_InformationRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getInputData <em>Input Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Data</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getInputData()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_InputData();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getInvocation <em>Invocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invocation</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getInvocation()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_Invocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getItemDefinition <em>Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Definition</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getItemDefinition()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_ItemDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getKnowledgeRequirement <em>Knowledge Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Knowledge Requirement</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getKnowledgeRequirement()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_KnowledgeRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getKnowledgeSource <em>Knowledge Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Knowledge Source</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getKnowledgeSource()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_KnowledgeSource();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getList()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_List();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getLiteralExpression <em>Literal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Literal Expression</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getLiteralExpression()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_LiteralExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getOrganizationUnit <em>Organization Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Organization Unit</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getOrganizationUnit()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_OrganizationUnit();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getPerformanceIndicator <em>Performance Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Performance Indicator</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getPerformanceIndicator()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_PerformanceIndicator();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relation</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getRelation()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_Relation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getSome <em>Some</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Some</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getSome()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_Some();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.DMNRoot#getTextAnnotation <em>Text Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Annotation</em>'.
	 * @see org.omg.spec.dmn.dmn.DMNRoot#getTextAnnotation()
	 * @see #getDMNRoot()
	 * @generated
	 */
	EReference getDMNRoot_TextAnnotation();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.ExtensionElementsType <em>Extension Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extension Elements Type</em>'.
	 * @see org.omg.spec.dmn.dmn.ExtensionElementsType
	 * @generated
	 */
	EClass getExtensionElementsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.dmn.dmn.ExtensionElementsType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.omg.spec.dmn.dmn.ExtensionElementsType#getAny()
	 * @see #getExtensionElementsType()
	 * @generated
	 */
	EAttribute getExtensionElementsType_Any();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TArtifact <em>TArtifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TArtifact</em>'.
	 * @see org.omg.spec.dmn.dmn.TArtifact
	 * @generated
	 */
	EClass getTArtifact();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TAssociation <em>TAssociation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAssociation</em>'.
	 * @see org.omg.spec.dmn.dmn.TAssociation
	 * @generated
	 */
	EClass getTAssociation();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TAssociation#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Ref</em>'.
	 * @see org.omg.spec.dmn.dmn.TAssociation#getSourceRef()
	 * @see #getTAssociation()
	 * @generated
	 */
	EReference getTAssociation_SourceRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TAssociation#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Ref</em>'.
	 * @see org.omg.spec.dmn.dmn.TAssociation#getTargetRef()
	 * @see #getTAssociation()
	 * @generated
	 */
	EReference getTAssociation_TargetRef();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TAssociation#getAssociationDirection <em>Association Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Direction</em>'.
	 * @see org.omg.spec.dmn.dmn.TAssociation#getAssociationDirection()
	 * @see #getTAssociation()
	 * @generated
	 */
	EAttribute getTAssociation_AssociationDirection();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TAuthorityRequirement <em>TAuthority Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAuthority Requirement</em>'.
	 * @see org.omg.spec.dmn.dmn.TAuthorityRequirement
	 * @generated
	 */
	EClass getTAuthorityRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TAuthorityRequirement#getRequiredDecision <em>Required Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Decision</em>'.
	 * @see org.omg.spec.dmn.dmn.TAuthorityRequirement#getRequiredDecision()
	 * @see #getTAuthorityRequirement()
	 * @generated
	 */
	EReference getTAuthorityRequirement_RequiredDecision();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TAuthorityRequirement#getRequiredInput <em>Required Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Input</em>'.
	 * @see org.omg.spec.dmn.dmn.TAuthorityRequirement#getRequiredInput()
	 * @see #getTAuthorityRequirement()
	 * @generated
	 */
	EReference getTAuthorityRequirement_RequiredInput();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TAuthorityRequirement#getRequiredAuthority <em>Required Authority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Authority</em>'.
	 * @see org.omg.spec.dmn.dmn.TAuthorityRequirement#getRequiredAuthority()
	 * @see #getTAuthorityRequirement()
	 * @generated
	 */
	EReference getTAuthorityRequirement_RequiredAuthority();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TBinding <em>TBinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TBinding</em>'.
	 * @see org.omg.spec.dmn.dmn.TBinding
	 * @generated
	 */
	EClass getTBinding();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TBinding#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter</em>'.
	 * @see org.omg.spec.dmn.dmn.TBinding#getParameter()
	 * @see #getTBinding()
	 * @generated
	 */
	EReference getTBinding_Parameter();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.dmn.dmn.TBinding#getExpressionGroup <em>Expression Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expression Group</em>'.
	 * @see org.omg.spec.dmn.dmn.TBinding#getExpressionGroup()
	 * @see #getTBinding()
	 * @generated
	 */
	EAttribute getTBinding_ExpressionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TBinding#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.omg.spec.dmn.dmn.TBinding#getExpression()
	 * @see #getTBinding()
	 * @generated
	 */
	EReference getTBinding_Expression();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TBusinessContextElement <em>TBusiness Context Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TBusiness Context Element</em>'.
	 * @see org.omg.spec.dmn.dmn.TBusinessContextElement
	 * @generated
	 */
	EClass getTBusinessContextElement();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TBusinessContextElement#getURI <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>URI</em>'.
	 * @see org.omg.spec.dmn.dmn.TBusinessContextElement#getURI()
	 * @see #getTBusinessContextElement()
	 * @generated
	 */
	EAttribute getTBusinessContextElement_URI();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TBusinessKnowledgeModel <em>TBusiness Knowledge Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TBusiness Knowledge Model</em>'.
	 * @see org.omg.spec.dmn.dmn.TBusinessKnowledgeModel
	 * @generated
	 */
	EClass getTBusinessKnowledgeModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TBusinessKnowledgeModel#getEncapsulatedLogic <em>Encapsulated Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Encapsulated Logic</em>'.
	 * @see org.omg.spec.dmn.dmn.TBusinessKnowledgeModel#getEncapsulatedLogic()
	 * @see #getTBusinessKnowledgeModel()
	 * @generated
	 */
	EReference getTBusinessKnowledgeModel_EncapsulatedLogic();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TBusinessKnowledgeModel#getKnowledgeRequirement <em>Knowledge Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Knowledge Requirement</em>'.
	 * @see org.omg.spec.dmn.dmn.TBusinessKnowledgeModel#getKnowledgeRequirement()
	 * @see #getTBusinessKnowledgeModel()
	 * @generated
	 */
	EReference getTBusinessKnowledgeModel_KnowledgeRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TBusinessKnowledgeModel#getAuthorityRequirement <em>Authority Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authority Requirement</em>'.
	 * @see org.omg.spec.dmn.dmn.TBusinessKnowledgeModel#getAuthorityRequirement()
	 * @see #getTBusinessKnowledgeModel()
	 * @generated
	 */
	EReference getTBusinessKnowledgeModel_AuthorityRequirement();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TChildExpression <em>TChild Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TChild Expression</em>'.
	 * @see org.omg.spec.dmn.dmn.TChildExpression
	 * @generated
	 */
	EClass getTChildExpression();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.dmn.dmn.TChildExpression#getExpressionGroup <em>Expression Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expression Group</em>'.
	 * @see org.omg.spec.dmn.dmn.TChildExpression#getExpressionGroup()
	 * @see #getTChildExpression()
	 * @generated
	 */
	EAttribute getTChildExpression_ExpressionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TChildExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.omg.spec.dmn.dmn.TChildExpression#getExpression()
	 * @see #getTChildExpression()
	 * @generated
	 */
	EReference getTChildExpression_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TChildExpression#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.omg.spec.dmn.dmn.TChildExpression#getId()
	 * @see #getTChildExpression()
	 * @generated
	 */
	EAttribute getTChildExpression_Id();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TConditional <em>TConditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TConditional</em>'.
	 * @see org.omg.spec.dmn.dmn.TConditional
	 * @generated
	 */
	EClass getTConditional();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TConditional#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.omg.spec.dmn.dmn.TConditional#getIf()
	 * @see #getTConditional()
	 * @generated
	 */
	EReference getTConditional_If();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TConditional#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see org.omg.spec.dmn.dmn.TConditional#getThen()
	 * @see #getTConditional()
	 * @generated
	 */
	EReference getTConditional_Then();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TConditional#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see org.omg.spec.dmn.dmn.TConditional#getElse()
	 * @see #getTConditional()
	 * @generated
	 */
	EReference getTConditional_Else();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TContext <em>TContext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TContext</em>'.
	 * @see org.omg.spec.dmn.dmn.TContext
	 * @generated
	 */
	EClass getTContext();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TContext#getContextEntry <em>Context Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Context Entry</em>'.
	 * @see org.omg.spec.dmn.dmn.TContext#getContextEntry()
	 * @see #getTContext()
	 * @generated
	 */
	EReference getTContext_ContextEntry();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TContextEntry <em>TContext Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TContext Entry</em>'.
	 * @see org.omg.spec.dmn.dmn.TContextEntry
	 * @generated
	 */
	EClass getTContextEntry();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TContextEntry#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see org.omg.spec.dmn.dmn.TContextEntry#getVariable()
	 * @see #getTContextEntry()
	 * @generated
	 */
	EReference getTContextEntry_Variable();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.dmn.dmn.TContextEntry#getExpressionGroup <em>Expression Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expression Group</em>'.
	 * @see org.omg.spec.dmn.dmn.TContextEntry#getExpressionGroup()
	 * @see #getTContextEntry()
	 * @generated
	 */
	EAttribute getTContextEntry_ExpressionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TContextEntry#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.omg.spec.dmn.dmn.TContextEntry#getExpression()
	 * @see #getTContextEntry()
	 * @generated
	 */
	EReference getTContextEntry_Expression();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TDecision <em>TDecision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDecision</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecision
	 * @generated
	 */
	EClass getTDecision();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TDecision#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecision#getQuestion()
	 * @see #getTDecision()
	 * @generated
	 */
	EAttribute getTDecision_Question();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TDecision#getAllowedAnswers <em>Allowed Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allowed Answers</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecision#getAllowedAnswers()
	 * @see #getTDecision()
	 * @generated
	 */
	EAttribute getTDecision_AllowedAnswers();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TDecision#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecision#getVariable()
	 * @see #getTDecision()
	 * @generated
	 */
	EReference getTDecision_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDecision#getInformationRequirement <em>Information Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Information Requirement</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecision#getInformationRequirement()
	 * @see #getTDecision()
	 * @generated
	 */
	EReference getTDecision_InformationRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDecision#getKnowledgeRequirement <em>Knowledge Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Knowledge Requirement</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecision#getKnowledgeRequirement()
	 * @see #getTDecision()
	 * @generated
	 */
	EReference getTDecision_KnowledgeRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDecision#getAuthorityRequirement <em>Authority Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authority Requirement</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecision#getAuthorityRequirement()
	 * @see #getTDecision()
	 * @generated
	 */
	EReference getTDecision_AuthorityRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDecision#getSupportedObjective <em>Supported Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supported Objective</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecision#getSupportedObjective()
	 * @see #getTDecision()
	 * @generated
	 */
	EReference getTDecision_SupportedObjective();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDecision#getImpactedPerformanceIndicator <em>Impacted Performance Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Impacted Performance Indicator</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecision#getImpactedPerformanceIndicator()
	 * @see #getTDecision()
	 * @generated
	 */
	EReference getTDecision_ImpactedPerformanceIndicator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDecision#getDecisionMaker <em>Decision Maker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision Maker</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecision#getDecisionMaker()
	 * @see #getTDecision()
	 * @generated
	 */
	EReference getTDecision_DecisionMaker();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDecision#getDecisionOwner <em>Decision Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision Owner</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecision#getDecisionOwner()
	 * @see #getTDecision()
	 * @generated
	 */
	EReference getTDecision_DecisionOwner();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDecision#getUsingProcess <em>Using Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Using Process</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecision#getUsingProcess()
	 * @see #getTDecision()
	 * @generated
	 */
	EReference getTDecision_UsingProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDecision#getUsingTask <em>Using Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Using Task</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecision#getUsingTask()
	 * @see #getTDecision()
	 * @generated
	 */
	EReference getTDecision_UsingTask();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.dmn.dmn.TDecision#getExpressionGroup <em>Expression Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expression Group</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecision#getExpressionGroup()
	 * @see #getTDecision()
	 * @generated
	 */
	EAttribute getTDecision_ExpressionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TDecision#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecision#getExpression()
	 * @see #getTDecision()
	 * @generated
	 */
	EReference getTDecision_Expression();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TDecisionRule <em>TDecision Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDecision Rule</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecisionRule
	 * @generated
	 */
	EClass getTDecisionRule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDecisionRule#getInputEntry <em>Input Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Entry</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecisionRule#getInputEntry()
	 * @see #getTDecisionRule()
	 * @generated
	 */
	EReference getTDecisionRule_InputEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDecisionRule#getOutputEntry <em>Output Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Entry</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecisionRule#getOutputEntry()
	 * @see #getTDecisionRule()
	 * @generated
	 */
	EReference getTDecisionRule_OutputEntry();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDecisionRule#getAnnotationEntry <em>Annotation Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Entry</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecisionRule#getAnnotationEntry()
	 * @see #getTDecisionRule()
	 * @generated
	 */
	EReference getTDecisionRule_AnnotationEntry();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TDecisionService <em>TDecision Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDecision Service</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecisionService
	 * @generated
	 */
	EClass getTDecisionService();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDecisionService#getOutputDecision <em>Output Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Decision</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecisionService#getOutputDecision()
	 * @see #getTDecisionService()
	 * @generated
	 */
	EReference getTDecisionService_OutputDecision();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDecisionService#getEncapsulatedDecision <em>Encapsulated Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Encapsulated Decision</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecisionService#getEncapsulatedDecision()
	 * @see #getTDecisionService()
	 * @generated
	 */
	EReference getTDecisionService_EncapsulatedDecision();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDecisionService#getInputDecision <em>Input Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Decision</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecisionService#getInputDecision()
	 * @see #getTDecisionService()
	 * @generated
	 */
	EReference getTDecisionService_InputDecision();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDecisionService#getInputData <em>Input Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Data</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecisionService#getInputData()
	 * @see #getTDecisionService()
	 * @generated
	 */
	EReference getTDecisionService_InputData();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TDecisionTable <em>TDecision Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDecision Table</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecisionTable
	 * @generated
	 */
	EClass getTDecisionTable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDecisionTable#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecisionTable#getInput()
	 * @see #getTDecisionTable()
	 * @generated
	 */
	EReference getTDecisionTable_Input();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDecisionTable#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecisionTable#getOutput()
	 * @see #getTDecisionTable()
	 * @generated
	 */
	EReference getTDecisionTable_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDecisionTable#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecisionTable#getAnnotation()
	 * @see #getTDecisionTable()
	 * @generated
	 */
	EReference getTDecisionTable_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDecisionTable#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rule</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecisionTable#getRule()
	 * @see #getTDecisionTable()
	 * @generated
	 */
	EReference getTDecisionTable_Rule();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TDecisionTable#getAggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecisionTable#getAggregation()
	 * @see #getTDecisionTable()
	 * @generated
	 */
	EAttribute getTDecisionTable_Aggregation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TDecisionTable#getHitPolicy <em>Hit Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hit Policy</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecisionTable#getHitPolicy()
	 * @see #getTDecisionTable()
	 * @generated
	 */
	EAttribute getTDecisionTable_HitPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TDecisionTable#getOutputLabel <em>Output Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Label</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecisionTable#getOutputLabel()
	 * @see #getTDecisionTable()
	 * @generated
	 */
	EAttribute getTDecisionTable_OutputLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TDecisionTable#getPreferredOrientation <em>Preferred Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preferred Orientation</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecisionTable#getPreferredOrientation()
	 * @see #getTDecisionTable()
	 * @generated
	 */
	EAttribute getTDecisionTable_PreferredOrientation();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TDefinitions <em>TDefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDefinitions</em>'.
	 * @see org.omg.spec.dmn.dmn.TDefinitions
	 * @generated
	 */
	EClass getTDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDefinitions#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Import</em>'.
	 * @see org.omg.spec.dmn.dmn.TDefinitions#getImport()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_Import();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDefinitions#getItemDefinition <em>Item Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Definition</em>'.
	 * @see org.omg.spec.dmn.dmn.TDefinitions#getItemDefinition()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_ItemDefinition();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.dmn.dmn.TDefinitions#getDrgElementGroup <em>Drg Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Drg Element Group</em>'.
	 * @see org.omg.spec.dmn.dmn.TDefinitions#getDrgElementGroup()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_DrgElementGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDefinitions#getDrgElement <em>Drg Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drg Element</em>'.
	 * @see org.omg.spec.dmn.dmn.TDefinitions#getDrgElement()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_DrgElement();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.dmn.dmn.TDefinitions#getArtifactGroup <em>Artifact Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Artifact Group</em>'.
	 * @see org.omg.spec.dmn.dmn.TDefinitions#getArtifactGroup()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_ArtifactGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDefinitions#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifact</em>'.
	 * @see org.omg.spec.dmn.dmn.TDefinitions#getArtifact()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_Artifact();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDefinitions#getElementCollection <em>Element Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Collection</em>'.
	 * @see org.omg.spec.dmn.dmn.TDefinitions#getElementCollection()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_ElementCollection();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.dmn.dmn.TDefinitions#getBusinessContextElementGroup <em>Business Context Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Business Context Element Group</em>'.
	 * @see org.omg.spec.dmn.dmn.TDefinitions#getBusinessContextElementGroup()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_BusinessContextElementGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TDefinitions#getBusinessContextElement <em>Business Context Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Business Context Element</em>'.
	 * @see org.omg.spec.dmn.dmn.TDefinitions#getBusinessContextElement()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_BusinessContextElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TDefinitions#getDMNDI <em>DMNDI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DMNDI</em>'.
	 * @see org.omg.spec.dmn.dmn.TDefinitions#getDMNDI()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EReference getTDefinitions_DMNDI();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TDefinitions#getExporter <em>Exporter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exporter</em>'.
	 * @see org.omg.spec.dmn.dmn.TDefinitions#getExporter()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_Exporter();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TDefinitions#getExporterVersion <em>Exporter Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exporter Version</em>'.
	 * @see org.omg.spec.dmn.dmn.TDefinitions#getExporterVersion()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_ExporterVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TDefinitions#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see org.omg.spec.dmn.dmn.TDefinitions#getExpressionLanguage()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_ExpressionLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TDefinitions#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.omg.spec.dmn.dmn.TDefinitions#getNamespace()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TDefinitions#getTypeLanguage <em>Type Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Language</em>'.
	 * @see org.omg.spec.dmn.dmn.TDefinitions#getTypeLanguage()
	 * @see #getTDefinitions()
	 * @generated
	 */
	EAttribute getTDefinitions_TypeLanguage();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TDMNElement <em>TDMN Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDMN Element</em>'.
	 * @see org.omg.spec.dmn.dmn.TDMNElement
	 * @generated
	 */
	EClass getTDMNElement();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TDMNElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.omg.spec.dmn.dmn.TDMNElement#getDescription()
	 * @see #getTDMNElement()
	 * @generated
	 */
	EAttribute getTDMNElement_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TDMNElement#getExtensionElements <em>Extension Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extension Elements</em>'.
	 * @see org.omg.spec.dmn.dmn.TDMNElement#getExtensionElements()
	 * @see #getTDMNElement()
	 * @generated
	 */
	EReference getTDMNElement_ExtensionElements();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TDMNElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.omg.spec.dmn.dmn.TDMNElement#getId()
	 * @see #getTDMNElement()
	 * @generated
	 */
	EAttribute getTDMNElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TDMNElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.omg.spec.dmn.dmn.TDMNElement#getLabel()
	 * @see #getTDMNElement()
	 * @generated
	 */
	EAttribute getTDMNElement_Label();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.dmn.dmn.TDMNElement#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.omg.spec.dmn.dmn.TDMNElement#getAnyAttribute()
	 * @see #getTDMNElement()
	 * @generated
	 */
	EAttribute getTDMNElement_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TDMNElementReference <em>TDMN Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDMN Element Reference</em>'.
	 * @see org.omg.spec.dmn.dmn.TDMNElementReference
	 * @generated
	 */
	EClass getTDMNElementReference();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TDMNElementReference#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.omg.spec.dmn.dmn.TDMNElementReference#getHref()
	 * @see #getTDMNElementReference()
	 * @generated
	 */
	EAttribute getTDMNElementReference_Href();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TDRGElement <em>TDRG Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDRG Element</em>'.
	 * @see org.omg.spec.dmn.dmn.TDRGElement
	 * @generated
	 */
	EClass getTDRGElement();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TElementCollection <em>TElement Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TElement Collection</em>'.
	 * @see org.omg.spec.dmn.dmn.TElementCollection
	 * @generated
	 */
	EClass getTElementCollection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TElementCollection#getDrgElement <em>Drg Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drg Element</em>'.
	 * @see org.omg.spec.dmn.dmn.TElementCollection#getDrgElement()
	 * @see #getTElementCollection()
	 * @generated
	 */
	EReference getTElementCollection_DrgElement();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TExpression <em>TExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TExpression</em>'.
	 * @see org.omg.spec.dmn.dmn.TExpression
	 * @generated
	 */
	EClass getTExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TExpression#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Ref</em>'.
	 * @see org.omg.spec.dmn.dmn.TExpression#getTypeRef()
	 * @see #getTExpression()
	 * @generated
	 */
	EAttribute getTExpression_TypeRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TFilter <em>TFilter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFilter</em>'.
	 * @see org.omg.spec.dmn.dmn.TFilter
	 * @generated
	 */
	EClass getTFilter();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TFilter#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In</em>'.
	 * @see org.omg.spec.dmn.dmn.TFilter#getIn()
	 * @see #getTFilter()
	 * @generated
	 */
	EReference getTFilter_In();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TFilter#getMatch <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Match</em>'.
	 * @see org.omg.spec.dmn.dmn.TFilter#getMatch()
	 * @see #getTFilter()
	 * @generated
	 */
	EReference getTFilter_Match();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TFor <em>TFor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFor</em>'.
	 * @see org.omg.spec.dmn.dmn.TFor
	 * @generated
	 */
	EClass getTFor();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TFor#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return</em>'.
	 * @see org.omg.spec.dmn.dmn.TFor#getReturn()
	 * @see #getTFor()
	 * @generated
	 */
	EReference getTFor_Return();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TFunctionDefinition <em>TFunction Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFunction Definition</em>'.
	 * @see org.omg.spec.dmn.dmn.TFunctionDefinition
	 * @generated
	 */
	EClass getTFunctionDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TFunctionDefinition#getFormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formal Parameter</em>'.
	 * @see org.omg.spec.dmn.dmn.TFunctionDefinition#getFormalParameter()
	 * @see #getTFunctionDefinition()
	 * @generated
	 */
	EReference getTFunctionDefinition_FormalParameter();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.dmn.dmn.TFunctionDefinition#getExpressionGroup <em>Expression Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expression Group</em>'.
	 * @see org.omg.spec.dmn.dmn.TFunctionDefinition#getExpressionGroup()
	 * @see #getTFunctionDefinition()
	 * @generated
	 */
	EAttribute getTFunctionDefinition_ExpressionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TFunctionDefinition#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.omg.spec.dmn.dmn.TFunctionDefinition#getExpression()
	 * @see #getTFunctionDefinition()
	 * @generated
	 */
	EReference getTFunctionDefinition_Expression();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TFunctionDefinition#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.omg.spec.dmn.dmn.TFunctionDefinition#getKind()
	 * @see #getTFunctionDefinition()
	 * @generated
	 */
	EAttribute getTFunctionDefinition_Kind();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TFunctionItem <em>TFunction Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFunction Item</em>'.
	 * @see org.omg.spec.dmn.dmn.TFunctionItem
	 * @generated
	 */
	EClass getTFunctionItem();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TFunctionItem#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.omg.spec.dmn.dmn.TFunctionItem#getParameters()
	 * @see #getTFunctionItem()
	 * @generated
	 */
	EReference getTFunctionItem_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TFunctionItem#getOutputTypeRef <em>Output Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Type Ref</em>'.
	 * @see org.omg.spec.dmn.dmn.TFunctionItem#getOutputTypeRef()
	 * @see #getTFunctionItem()
	 * @generated
	 */
	EAttribute getTFunctionItem_OutputTypeRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TGroup <em>TGroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGroup</em>'.
	 * @see org.omg.spec.dmn.dmn.TGroup
	 * @generated
	 */
	EClass getTGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.dmn.dmn.TGroup#getName()
	 * @see #getTGroup()
	 * @generated
	 */
	EAttribute getTGroup_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TImport <em>TImport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TImport</em>'.
	 * @see org.omg.spec.dmn.dmn.TImport
	 * @generated
	 */
	EClass getTImport();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TImport#getImportType <em>Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Type</em>'.
	 * @see org.omg.spec.dmn.dmn.TImport#getImportType()
	 * @see #getTImport()
	 * @generated
	 */
	EAttribute getTImport_ImportType();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TImport#getLocationURI <em>Location URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location URI</em>'.
	 * @see org.omg.spec.dmn.dmn.TImport#getLocationURI()
	 * @see #getTImport()
	 * @generated
	 */
	EAttribute getTImport_LocationURI();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TImport#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.omg.spec.dmn.dmn.TImport#getNamespace()
	 * @see #getTImport()
	 * @generated
	 */
	EAttribute getTImport_Namespace();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TImportedValues <em>TImported Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TImported Values</em>'.
	 * @see org.omg.spec.dmn.dmn.TImportedValues
	 * @generated
	 */
	EClass getTImportedValues();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TImportedValues#getImportedElement <em>Imported Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Element</em>'.
	 * @see org.omg.spec.dmn.dmn.TImportedValues#getImportedElement()
	 * @see #getTImportedValues()
	 * @generated
	 */
	EAttribute getTImportedValues_ImportedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TImportedValues#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see org.omg.spec.dmn.dmn.TImportedValues#getExpressionLanguage()
	 * @see #getTImportedValues()
	 * @generated
	 */
	EAttribute getTImportedValues_ExpressionLanguage();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TInformationItem <em>TInformation Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInformation Item</em>'.
	 * @see org.omg.spec.dmn.dmn.TInformationItem
	 * @generated
	 */
	EClass getTInformationItem();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TInformationItem#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Ref</em>'.
	 * @see org.omg.spec.dmn.dmn.TInformationItem#getTypeRef()
	 * @see #getTInformationItem()
	 * @generated
	 */
	EAttribute getTInformationItem_TypeRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TInformationRequirement <em>TInformation Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInformation Requirement</em>'.
	 * @see org.omg.spec.dmn.dmn.TInformationRequirement
	 * @generated
	 */
	EClass getTInformationRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TInformationRequirement#getRequiredDecision <em>Required Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Decision</em>'.
	 * @see org.omg.spec.dmn.dmn.TInformationRequirement#getRequiredDecision()
	 * @see #getTInformationRequirement()
	 * @generated
	 */
	EReference getTInformationRequirement_RequiredDecision();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TInformationRequirement#getRequiredInput <em>Required Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Input</em>'.
	 * @see org.omg.spec.dmn.dmn.TInformationRequirement#getRequiredInput()
	 * @see #getTInformationRequirement()
	 * @generated
	 */
	EReference getTInformationRequirement_RequiredInput();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TInputClause <em>TInput Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInput Clause</em>'.
	 * @see org.omg.spec.dmn.dmn.TInputClause
	 * @generated
	 */
	EClass getTInputClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TInputClause#getInputExpression <em>Input Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Expression</em>'.
	 * @see org.omg.spec.dmn.dmn.TInputClause#getInputExpression()
	 * @see #getTInputClause()
	 * @generated
	 */
	EReference getTInputClause_InputExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TInputClause#getInputValues <em>Input Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Values</em>'.
	 * @see org.omg.spec.dmn.dmn.TInputClause#getInputValues()
	 * @see #getTInputClause()
	 * @generated
	 */
	EReference getTInputClause_InputValues();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TInputData <em>TInput Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInput Data</em>'.
	 * @see org.omg.spec.dmn.dmn.TInputData
	 * @generated
	 */
	EClass getTInputData();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TInputData#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see org.omg.spec.dmn.dmn.TInputData#getVariable()
	 * @see #getTInputData()
	 * @generated
	 */
	EReference getTInputData_Variable();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TInvocable <em>TInvocable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInvocable</em>'.
	 * @see org.omg.spec.dmn.dmn.TInvocable
	 * @generated
	 */
	EClass getTInvocable();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TInvocable#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see org.omg.spec.dmn.dmn.TInvocable#getVariable()
	 * @see #getTInvocable()
	 * @generated
	 */
	EReference getTInvocable_Variable();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TInvocation <em>TInvocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInvocation</em>'.
	 * @see org.omg.spec.dmn.dmn.TInvocation
	 * @generated
	 */
	EClass getTInvocation();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.dmn.dmn.TInvocation#getExpressionGroup <em>Expression Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expression Group</em>'.
	 * @see org.omg.spec.dmn.dmn.TInvocation#getExpressionGroup()
	 * @see #getTInvocation()
	 * @generated
	 */
	EAttribute getTInvocation_ExpressionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TInvocation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.omg.spec.dmn.dmn.TInvocation#getExpression()
	 * @see #getTInvocation()
	 * @generated
	 */
	EReference getTInvocation_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TInvocation#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding</em>'.
	 * @see org.omg.spec.dmn.dmn.TInvocation#getBinding()
	 * @see #getTInvocation()
	 * @generated
	 */
	EReference getTInvocation_Binding();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TItemDefinition <em>TItem Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TItem Definition</em>'.
	 * @see org.omg.spec.dmn.dmn.TItemDefinition
	 * @generated
	 */
	EClass getTItemDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TItemDefinition#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Ref</em>'.
	 * @see org.omg.spec.dmn.dmn.TItemDefinition#getTypeRef()
	 * @see #getTItemDefinition()
	 * @generated
	 */
	EAttribute getTItemDefinition_TypeRef();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TItemDefinition#getAllowedValues <em>Allowed Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allowed Values</em>'.
	 * @see org.omg.spec.dmn.dmn.TItemDefinition#getAllowedValues()
	 * @see #getTItemDefinition()
	 * @generated
	 */
	EReference getTItemDefinition_AllowedValues();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TItemDefinition#getTypeConstraint <em>Type Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Constraint</em>'.
	 * @see org.omg.spec.dmn.dmn.TItemDefinition#getTypeConstraint()
	 * @see #getTItemDefinition()
	 * @generated
	 */
	EReference getTItemDefinition_TypeConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TItemDefinition#getItemComponent <em>Item Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Component</em>'.
	 * @see org.omg.spec.dmn.dmn.TItemDefinition#getItemComponent()
	 * @see #getTItemDefinition()
	 * @generated
	 */
	EReference getTItemDefinition_ItemComponent();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TItemDefinition#getFunctionItem <em>Function Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function Item</em>'.
	 * @see org.omg.spec.dmn.dmn.TItemDefinition#getFunctionItem()
	 * @see #getTItemDefinition()
	 * @generated
	 */
	EReference getTItemDefinition_FunctionItem();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TItemDefinition#isIsCollection <em>Is Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Collection</em>'.
	 * @see org.omg.spec.dmn.dmn.TItemDefinition#isIsCollection()
	 * @see #getTItemDefinition()
	 * @generated
	 */
	EAttribute getTItemDefinition_IsCollection();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TItemDefinition#getTypeLanguage <em>Type Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Language</em>'.
	 * @see org.omg.spec.dmn.dmn.TItemDefinition#getTypeLanguage()
	 * @see #getTItemDefinition()
	 * @generated
	 */
	EAttribute getTItemDefinition_TypeLanguage();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TIterator <em>TIterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TIterator</em>'.
	 * @see org.omg.spec.dmn.dmn.TIterator
	 * @generated
	 */
	EClass getTIterator();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TIterator#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In</em>'.
	 * @see org.omg.spec.dmn.dmn.TIterator#getIn()
	 * @see #getTIterator()
	 * @generated
	 */
	EReference getTIterator_In();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TIterator#getIteratorVariable <em>Iterator Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterator Variable</em>'.
	 * @see org.omg.spec.dmn.dmn.TIterator#getIteratorVariable()
	 * @see #getTIterator()
	 * @generated
	 */
	EAttribute getTIterator_IteratorVariable();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TKnowledgeRequirement <em>TKnowledge Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TKnowledge Requirement</em>'.
	 * @see org.omg.spec.dmn.dmn.TKnowledgeRequirement
	 * @generated
	 */
	EClass getTKnowledgeRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TKnowledgeRequirement#getRequiredKnowledge <em>Required Knowledge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Required Knowledge</em>'.
	 * @see org.omg.spec.dmn.dmn.TKnowledgeRequirement#getRequiredKnowledge()
	 * @see #getTKnowledgeRequirement()
	 * @generated
	 */
	EReference getTKnowledgeRequirement_RequiredKnowledge();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TKnowledgeSource <em>TKnowledge Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TKnowledge Source</em>'.
	 * @see org.omg.spec.dmn.dmn.TKnowledgeSource
	 * @generated
	 */
	EClass getTKnowledgeSource();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TKnowledgeSource#getAuthorityRequirement <em>Authority Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authority Requirement</em>'.
	 * @see org.omg.spec.dmn.dmn.TKnowledgeSource#getAuthorityRequirement()
	 * @see #getTKnowledgeSource()
	 * @generated
	 */
	EReference getTKnowledgeSource_AuthorityRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TKnowledgeSource#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.omg.spec.dmn.dmn.TKnowledgeSource#getType()
	 * @see #getTKnowledgeSource()
	 * @generated
	 */
	EAttribute getTKnowledgeSource_Type();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TKnowledgeSource#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owner</em>'.
	 * @see org.omg.spec.dmn.dmn.TKnowledgeSource#getOwner()
	 * @see #getTKnowledgeSource()
	 * @generated
	 */
	EReference getTKnowledgeSource_Owner();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TKnowledgeSource#getLocationURI <em>Location URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location URI</em>'.
	 * @see org.omg.spec.dmn.dmn.TKnowledgeSource#getLocationURI()
	 * @see #getTKnowledgeSource()
	 * @generated
	 */
	EAttribute getTKnowledgeSource_LocationURI();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TList <em>TList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TList</em>'.
	 * @see org.omg.spec.dmn.dmn.TList
	 * @generated
	 */
	EClass getTList();

	/**
	 * Returns the meta object for the attribute list '{@link org.omg.spec.dmn.dmn.TList#getExpressionGroup <em>Expression Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expression Group</em>'.
	 * @see org.omg.spec.dmn.dmn.TList#getExpressionGroup()
	 * @see #getTList()
	 * @generated
	 */
	EAttribute getTList_ExpressionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TList#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see org.omg.spec.dmn.dmn.TList#getExpression()
	 * @see #getTList()
	 * @generated
	 */
	EReference getTList_Expression();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TLiteralExpression <em>TLiteral Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TLiteral Expression</em>'.
	 * @see org.omg.spec.dmn.dmn.TLiteralExpression
	 * @generated
	 */
	EClass getTLiteralExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TLiteralExpression#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.omg.spec.dmn.dmn.TLiteralExpression#getText()
	 * @see #getTLiteralExpression()
	 * @generated
	 */
	EAttribute getTLiteralExpression_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TLiteralExpression#getImportedValues <em>Imported Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imported Values</em>'.
	 * @see org.omg.spec.dmn.dmn.TLiteralExpression#getImportedValues()
	 * @see #getTLiteralExpression()
	 * @generated
	 */
	EReference getTLiteralExpression_ImportedValues();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TLiteralExpression#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see org.omg.spec.dmn.dmn.TLiteralExpression#getExpressionLanguage()
	 * @see #getTLiteralExpression()
	 * @generated
	 */
	EAttribute getTLiteralExpression_ExpressionLanguage();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TNamedElement <em>TNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TNamed Element</em>'.
	 * @see org.omg.spec.dmn.dmn.TNamedElement
	 * @generated
	 */
	EClass getTNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.dmn.dmn.TNamedElement#getName()
	 * @see #getTNamedElement()
	 * @generated
	 */
	EAttribute getTNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TOrganizationUnit <em>TOrganization Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOrganization Unit</em>'.
	 * @see org.omg.spec.dmn.dmn.TOrganizationUnit
	 * @generated
	 */
	EClass getTOrganizationUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TOrganizationUnit#getDecisionMade <em>Decision Made</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision Made</em>'.
	 * @see org.omg.spec.dmn.dmn.TOrganizationUnit#getDecisionMade()
	 * @see #getTOrganizationUnit()
	 * @generated
	 */
	EReference getTOrganizationUnit_DecisionMade();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TOrganizationUnit#getDecisionOwned <em>Decision Owned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision Owned</em>'.
	 * @see org.omg.spec.dmn.dmn.TOrganizationUnit#getDecisionOwned()
	 * @see #getTOrganizationUnit()
	 * @generated
	 */
	EReference getTOrganizationUnit_DecisionOwned();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TOutputClause <em>TOutput Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOutput Clause</em>'.
	 * @see org.omg.spec.dmn.dmn.TOutputClause
	 * @generated
	 */
	EClass getTOutputClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TOutputClause#getOutputValues <em>Output Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Values</em>'.
	 * @see org.omg.spec.dmn.dmn.TOutputClause#getOutputValues()
	 * @see #getTOutputClause()
	 * @generated
	 */
	EReference getTOutputClause_OutputValues();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TOutputClause#getDefaultOutputEntry <em>Default Output Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Output Entry</em>'.
	 * @see org.omg.spec.dmn.dmn.TOutputClause#getDefaultOutputEntry()
	 * @see #getTOutputClause()
	 * @generated
	 */
	EReference getTOutputClause_DefaultOutputEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TOutputClause#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.dmn.dmn.TOutputClause#getName()
	 * @see #getTOutputClause()
	 * @generated
	 */
	EAttribute getTOutputClause_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TOutputClause#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Ref</em>'.
	 * @see org.omg.spec.dmn.dmn.TOutputClause#getTypeRef()
	 * @see #getTOutputClause()
	 * @generated
	 */
	EAttribute getTOutputClause_TypeRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TPerformanceIndicator <em>TPerformance Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TPerformance Indicator</em>'.
	 * @see org.omg.spec.dmn.dmn.TPerformanceIndicator
	 * @generated
	 */
	EClass getTPerformanceIndicator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TPerformanceIndicator#getImpactingDecision <em>Impacting Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Impacting Decision</em>'.
	 * @see org.omg.spec.dmn.dmn.TPerformanceIndicator#getImpactingDecision()
	 * @see #getTPerformanceIndicator()
	 * @generated
	 */
	EReference getTPerformanceIndicator_ImpactingDecision();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TQuantified <em>TQuantified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TQuantified</em>'.
	 * @see org.omg.spec.dmn.dmn.TQuantified
	 * @generated
	 */
	EClass getTQuantified();

	/**
	 * Returns the meta object for the containment reference '{@link org.omg.spec.dmn.dmn.TQuantified#getSatisfies <em>Satisfies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Satisfies</em>'.
	 * @see org.omg.spec.dmn.dmn.TQuantified#getSatisfies()
	 * @see #getTQuantified()
	 * @generated
	 */
	EReference getTQuantified_Satisfies();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TRelation <em>TRelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRelation</em>'.
	 * @see org.omg.spec.dmn.dmn.TRelation
	 * @generated
	 */
	EClass getTRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TRelation#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see org.omg.spec.dmn.dmn.TRelation#getColumn()
	 * @see #getTRelation()
	 * @generated
	 */
	EReference getTRelation_Column();

	/**
	 * Returns the meta object for the containment reference list '{@link org.omg.spec.dmn.dmn.TRelation#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Row</em>'.
	 * @see org.omg.spec.dmn.dmn.TRelation#getRow()
	 * @see #getTRelation()
	 * @generated
	 */
	EReference getTRelation_Row();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TRuleAnnotation <em>TRule Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRule Annotation</em>'.
	 * @see org.omg.spec.dmn.dmn.TRuleAnnotation
	 * @generated
	 */
	EClass getTRuleAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TRuleAnnotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.omg.spec.dmn.dmn.TRuleAnnotation#getText()
	 * @see #getTRuleAnnotation()
	 * @generated
	 */
	EAttribute getTRuleAnnotation_Text();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TRuleAnnotationClause <em>TRule Annotation Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRule Annotation Clause</em>'.
	 * @see org.omg.spec.dmn.dmn.TRuleAnnotationClause
	 * @generated
	 */
	EClass getTRuleAnnotationClause();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TRuleAnnotationClause#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.omg.spec.dmn.dmn.TRuleAnnotationClause#getName()
	 * @see #getTRuleAnnotationClause()
	 * @generated
	 */
	EAttribute getTRuleAnnotationClause_Name();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TTextAnnotation <em>TText Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TText Annotation</em>'.
	 * @see org.omg.spec.dmn.dmn.TTextAnnotation
	 * @generated
	 */
	EClass getTTextAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TTextAnnotation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.omg.spec.dmn.dmn.TTextAnnotation#getText()
	 * @see #getTTextAnnotation()
	 * @generated
	 */
	EAttribute getTTextAnnotation_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TTextAnnotation#getTextFormat <em>Text Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Format</em>'.
	 * @see org.omg.spec.dmn.dmn.TTextAnnotation#getTextFormat()
	 * @see #getTTextAnnotation()
	 * @generated
	 */
	EAttribute getTTextAnnotation_TextFormat();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TTypedChildExpression <em>TTyped Child Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTyped Child Expression</em>'.
	 * @see org.omg.spec.dmn.dmn.TTypedChildExpression
	 * @generated
	 */
	EClass getTTypedChildExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TTypedChildExpression#getTypeRef <em>Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Ref</em>'.
	 * @see org.omg.spec.dmn.dmn.TTypedChildExpression#getTypeRef()
	 * @see #getTTypedChildExpression()
	 * @generated
	 */
	EAttribute getTTypedChildExpression_TypeRef();

	/**
	 * Returns the meta object for class '{@link org.omg.spec.dmn.dmn.TUnaryTests <em>TUnary Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TUnary Tests</em>'.
	 * @see org.omg.spec.dmn.dmn.TUnaryTests
	 * @generated
	 */
	EClass getTUnaryTests();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TUnaryTests#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.omg.spec.dmn.dmn.TUnaryTests#getText()
	 * @see #getTUnaryTests()
	 * @generated
	 */
	EAttribute getTUnaryTests_Text();

	/**
	 * Returns the meta object for the attribute '{@link org.omg.spec.dmn.dmn.TUnaryTests#getExpressionLanguage <em>Expression Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression Language</em>'.
	 * @see org.omg.spec.dmn.dmn.TUnaryTests#getExpressionLanguage()
	 * @see #getTUnaryTests()
	 * @generated
	 */
	EAttribute getTUnaryTests_ExpressionLanguage();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.dmn.dmn.TAssociationDirection <em>TAssociation Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TAssociation Direction</em>'.
	 * @see org.omg.spec.dmn.dmn.TAssociationDirection
	 * @generated
	 */
	EEnum getTAssociationDirection();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.dmn.dmn.TBuiltinAggregator <em>TBuiltin Aggregator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TBuiltin Aggregator</em>'.
	 * @see org.omg.spec.dmn.dmn.TBuiltinAggregator
	 * @generated
	 */
	EEnum getTBuiltinAggregator();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.dmn.dmn.TDecisionTableOrientation <em>TDecision Table Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TDecision Table Orientation</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecisionTableOrientation
	 * @generated
	 */
	EEnum getTDecisionTableOrientation();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.dmn.dmn.TFunctionKind <em>TFunction Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TFunction Kind</em>'.
	 * @see org.omg.spec.dmn.dmn.TFunctionKind
	 * @generated
	 */
	EEnum getTFunctionKind();

	/**
	 * Returns the meta object for enum '{@link org.omg.spec.dmn.dmn.THitPolicy <em>THit Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>THit Policy</em>'.
	 * @see org.omg.spec.dmn.dmn.THitPolicy
	 * @generated
	 */
	EEnum getTHitPolicy();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.dmn.dmn.TAssociationDirection <em>TAssociation Direction Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TAssociation Direction Object</em>'.
	 * @see org.omg.spec.dmn.dmn.TAssociationDirection
	 * @model instanceClass="org.omg.spec.dmn.dmn.TAssociationDirection"
	 *        extendedMetaData="name='tAssociationDirection:Object' baseType='tAssociationDirection'"
	 * @generated
	 */
	EDataType getTAssociationDirectionObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.dmn.dmn.TBuiltinAggregator <em>TBuiltin Aggregator Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TBuiltin Aggregator Object</em>'.
	 * @see org.omg.spec.dmn.dmn.TBuiltinAggregator
	 * @model instanceClass="org.omg.spec.dmn.dmn.TBuiltinAggregator"
	 *        extendedMetaData="name='tBuiltinAggregator:Object' baseType='tBuiltinAggregator'"
	 * @generated
	 */
	EDataType getTBuiltinAggregatorObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.dmn.dmn.TDecisionTableOrientation <em>TDecision Table Orientation Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TDecision Table Orientation Object</em>'.
	 * @see org.omg.spec.dmn.dmn.TDecisionTableOrientation
	 * @model instanceClass="org.omg.spec.dmn.dmn.TDecisionTableOrientation"
	 *        extendedMetaData="name='tDecisionTableOrientation:Object' baseType='tDecisionTableOrientation'"
	 * @generated
	 */
	EDataType getTDecisionTableOrientationObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.dmn.dmn.TFunctionKind <em>TFunction Kind Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TFunction Kind Object</em>'.
	 * @see org.omg.spec.dmn.dmn.TFunctionKind
	 * @model instanceClass="org.omg.spec.dmn.dmn.TFunctionKind"
	 *        extendedMetaData="name='tFunctionKind:Object' baseType='tFunctionKind'"
	 * @generated
	 */
	EDataType getTFunctionKindObject();

	/**
	 * Returns the meta object for data type '{@link org.omg.spec.dmn.dmn.THitPolicy <em>THit Policy Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>THit Policy Object</em>'.
	 * @see org.omg.spec.dmn.dmn.THitPolicy
	 * @model instanceClass="org.omg.spec.dmn.dmn.THitPolicy"
	 *        extendedMetaData="name='tHitPolicy:Object' baseType='tHitPolicy'"
	 * @generated
	 */
	EDataType getTHitPolicyObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DMNFactory getDMNFactory();

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
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.DMNRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.DMNRootImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getDMNRoot()
		 * @generated
		 */
		EClass DMN_ROOT = eINSTANCE.getDMNRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DMN_ROOT__MIXED = eINSTANCE.getDMNRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDMNRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDMNRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__ARTIFACT = eINSTANCE.getDMNRoot_Artifact();

		/**
		 * The meta object literal for the '<em><b>DMN Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__DMN_ELEMENT = eINSTANCE.getDMNRoot_DMNElement();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__ASSOCIATION = eINSTANCE.getDMNRoot_Association();

		/**
		 * The meta object literal for the '<em><b>Authority Requirement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__AUTHORITY_REQUIREMENT = eINSTANCE.getDMNRoot_AuthorityRequirement();

		/**
		 * The meta object literal for the '<em><b>Business Context Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__BUSINESS_CONTEXT_ELEMENT = eINSTANCE.getDMNRoot_BusinessContextElement();

		/**
		 * The meta object literal for the '<em><b>Business Knowledge Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__BUSINESS_KNOWLEDGE_MODEL = eINSTANCE.getDMNRoot_BusinessKnowledgeModel();

		/**
		 * The meta object literal for the '<em><b>Invocable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__INVOCABLE = eINSTANCE.getDMNRoot_Invocable();

		/**
		 * The meta object literal for the '<em><b>Drg Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__DRG_ELEMENT = eINSTANCE.getDMNRoot_DrgElement();

		/**
		 * The meta object literal for the '<em><b>Named Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__NAMED_ELEMENT = eINSTANCE.getDMNRoot_NamedElement();

		/**
		 * The meta object literal for the '<em><b>Conditional</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__CONDITIONAL = eINSTANCE.getDMNRoot_Conditional();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__EXPRESSION = eINSTANCE.getDMNRoot_Expression();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__CONTEXT = eINSTANCE.getDMNRoot_Context();

		/**
		 * The meta object literal for the '<em><b>Context Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__CONTEXT_ENTRY = eINSTANCE.getDMNRoot_ContextEntry();

		/**
		 * The meta object literal for the '<em><b>Decision</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__DECISION = eINSTANCE.getDMNRoot_Decision();

		/**
		 * The meta object literal for the '<em><b>Decision Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__DECISION_SERVICE = eINSTANCE.getDMNRoot_DecisionService();

		/**
		 * The meta object literal for the '<em><b>Decision Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__DECISION_TABLE = eINSTANCE.getDMNRoot_DecisionTable();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__DEFINITIONS = eINSTANCE.getDMNRoot_Definitions();

		/**
		 * The meta object literal for the '<em><b>Element Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__ELEMENT_COLLECTION = eINSTANCE.getDMNRoot_ElementCollection();

		/**
		 * The meta object literal for the '<em><b>Every</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__EVERY = eINSTANCE.getDMNRoot_Every();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__FILTER = eINSTANCE.getDMNRoot_Filter();

		/**
		 * The meta object literal for the '<em><b>For</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__FOR = eINSTANCE.getDMNRoot_For();

		/**
		 * The meta object literal for the '<em><b>Function Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__FUNCTION_DEFINITION = eINSTANCE.getDMNRoot_FunctionDefinition();

		/**
		 * The meta object literal for the '<em><b>Function Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__FUNCTION_ITEM = eINSTANCE.getDMNRoot_FunctionItem();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__GROUP = eINSTANCE.getDMNRoot_Group();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__IMPORT = eINSTANCE.getDMNRoot_Import();

		/**
		 * The meta object literal for the '<em><b>Information Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__INFORMATION_ITEM = eINSTANCE.getDMNRoot_InformationItem();

		/**
		 * The meta object literal for the '<em><b>Information Requirement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__INFORMATION_REQUIREMENT = eINSTANCE.getDMNRoot_InformationRequirement();

		/**
		 * The meta object literal for the '<em><b>Input Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__INPUT_DATA = eINSTANCE.getDMNRoot_InputData();

		/**
		 * The meta object literal for the '<em><b>Invocation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__INVOCATION = eINSTANCE.getDMNRoot_Invocation();

		/**
		 * The meta object literal for the '<em><b>Item Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__ITEM_DEFINITION = eINSTANCE.getDMNRoot_ItemDefinition();

		/**
		 * The meta object literal for the '<em><b>Knowledge Requirement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__KNOWLEDGE_REQUIREMENT = eINSTANCE.getDMNRoot_KnowledgeRequirement();

		/**
		 * The meta object literal for the '<em><b>Knowledge Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__KNOWLEDGE_SOURCE = eINSTANCE.getDMNRoot_KnowledgeSource();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__LIST = eINSTANCE.getDMNRoot_List();

		/**
		 * The meta object literal for the '<em><b>Literal Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__LITERAL_EXPRESSION = eINSTANCE.getDMNRoot_LiteralExpression();

		/**
		 * The meta object literal for the '<em><b>Organization Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__ORGANIZATION_UNIT = eINSTANCE.getDMNRoot_OrganizationUnit();

		/**
		 * The meta object literal for the '<em><b>Performance Indicator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__PERFORMANCE_INDICATOR = eINSTANCE.getDMNRoot_PerformanceIndicator();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__RELATION = eINSTANCE.getDMNRoot_Relation();

		/**
		 * The meta object literal for the '<em><b>Some</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__SOME = eINSTANCE.getDMNRoot_Some();

		/**
		 * The meta object literal for the '<em><b>Text Annotation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DMN_ROOT__TEXT_ANNOTATION = eINSTANCE.getDMNRoot_TextAnnotation();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.ExtensionElementsTypeImpl <em>Extension Elements Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.ExtensionElementsTypeImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getExtensionElementsType()
		 * @generated
		 */
		EClass EXTENSION_ELEMENTS_TYPE = eINSTANCE.getExtensionElementsType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSION_ELEMENTS_TYPE__ANY = eINSTANCE.getExtensionElementsType_Any();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TArtifactImpl <em>TArtifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TArtifactImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTArtifact()
		 * @generated
		 */
		EClass TARTIFACT = eINSTANCE.getTArtifact();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TAssociationImpl <em>TAssociation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TAssociationImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTAssociation()
		 * @generated
		 */
		EClass TASSOCIATION = eINSTANCE.getTAssociation();

		/**
		 * The meta object literal for the '<em><b>Source Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASSOCIATION__SOURCE_REF = eINSTANCE.getTAssociation_SourceRef();

		/**
		 * The meta object literal for the '<em><b>Target Ref</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASSOCIATION__TARGET_REF = eINSTANCE.getTAssociation_TargetRef();

		/**
		 * The meta object literal for the '<em><b>Association Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASSOCIATION__ASSOCIATION_DIRECTION = eINSTANCE.getTAssociation_AssociationDirection();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TAuthorityRequirementImpl <em>TAuthority Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TAuthorityRequirementImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTAuthorityRequirement()
		 * @generated
		 */
		EClass TAUTHORITY_REQUIREMENT = eINSTANCE.getTAuthorityRequirement();

		/**
		 * The meta object literal for the '<em><b>Required Decision</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAUTHORITY_REQUIREMENT__REQUIRED_DECISION = eINSTANCE.getTAuthorityRequirement_RequiredDecision();

		/**
		 * The meta object literal for the '<em><b>Required Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAUTHORITY_REQUIREMENT__REQUIRED_INPUT = eINSTANCE.getTAuthorityRequirement_RequiredInput();

		/**
		 * The meta object literal for the '<em><b>Required Authority</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAUTHORITY_REQUIREMENT__REQUIRED_AUTHORITY = eINSTANCE.getTAuthorityRequirement_RequiredAuthority();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TBindingImpl <em>TBinding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TBindingImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTBinding()
		 * @generated
		 */
		EClass TBINDING = eINSTANCE.getTBinding();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBINDING__PARAMETER = eINSTANCE.getTBinding_Parameter();

		/**
		 * The meta object literal for the '<em><b>Expression Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBINDING__EXPRESSION_GROUP = eINSTANCE.getTBinding_ExpressionGroup();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBINDING__EXPRESSION = eINSTANCE.getTBinding_Expression();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TBusinessContextElementImpl <em>TBusiness Context Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TBusinessContextElementImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTBusinessContextElement()
		 * @generated
		 */
		EClass TBUSINESS_CONTEXT_ELEMENT = eINSTANCE.getTBusinessContextElement();

		/**
		 * The meta object literal for the '<em><b>URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBUSINESS_CONTEXT_ELEMENT__URI = eINSTANCE.getTBusinessContextElement_URI();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TBusinessKnowledgeModelImpl <em>TBusiness Knowledge Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TBusinessKnowledgeModelImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTBusinessKnowledgeModel()
		 * @generated
		 */
		EClass TBUSINESS_KNOWLEDGE_MODEL = eINSTANCE.getTBusinessKnowledgeModel();

		/**
		 * The meta object literal for the '<em><b>Encapsulated Logic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBUSINESS_KNOWLEDGE_MODEL__ENCAPSULATED_LOGIC = eINSTANCE.getTBusinessKnowledgeModel_EncapsulatedLogic();

		/**
		 * The meta object literal for the '<em><b>Knowledge Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBUSINESS_KNOWLEDGE_MODEL__KNOWLEDGE_REQUIREMENT = eINSTANCE.getTBusinessKnowledgeModel_KnowledgeRequirement();

		/**
		 * The meta object literal for the '<em><b>Authority Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBUSINESS_KNOWLEDGE_MODEL__AUTHORITY_REQUIREMENT = eINSTANCE.getTBusinessKnowledgeModel_AuthorityRequirement();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TChildExpressionImpl <em>TChild Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TChildExpressionImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTChildExpression()
		 * @generated
		 */
		EClass TCHILD_EXPRESSION = eINSTANCE.getTChildExpression();

		/**
		 * The meta object literal for the '<em><b>Expression Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCHILD_EXPRESSION__EXPRESSION_GROUP = eINSTANCE.getTChildExpression_ExpressionGroup();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCHILD_EXPRESSION__EXPRESSION = eINSTANCE.getTChildExpression_Expression();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCHILD_EXPRESSION__ID = eINSTANCE.getTChildExpression_Id();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TConditionalImpl <em>TConditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TConditionalImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTConditional()
		 * @generated
		 */
		EClass TCONDITIONAL = eINSTANCE.getTConditional();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCONDITIONAL__IF = eINSTANCE.getTConditional_If();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCONDITIONAL__THEN = eINSTANCE.getTConditional_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCONDITIONAL__ELSE = eINSTANCE.getTConditional_Else();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TContextImpl <em>TContext</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TContextImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTContext()
		 * @generated
		 */
		EClass TCONTEXT = eINSTANCE.getTContext();

		/**
		 * The meta object literal for the '<em><b>Context Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCONTEXT__CONTEXT_ENTRY = eINSTANCE.getTContext_ContextEntry();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TContextEntryImpl <em>TContext Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TContextEntryImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTContextEntry()
		 * @generated
		 */
		EClass TCONTEXT_ENTRY = eINSTANCE.getTContextEntry();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCONTEXT_ENTRY__VARIABLE = eINSTANCE.getTContextEntry_Variable();

		/**
		 * The meta object literal for the '<em><b>Expression Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCONTEXT_ENTRY__EXPRESSION_GROUP = eINSTANCE.getTContextEntry_ExpressionGroup();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCONTEXT_ENTRY__EXPRESSION = eINSTANCE.getTContextEntry_Expression();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TDecisionImpl <em>TDecision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TDecisionImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTDecision()
		 * @generated
		 */
		EClass TDECISION = eINSTANCE.getTDecision();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDECISION__QUESTION = eINSTANCE.getTDecision_Question();

		/**
		 * The meta object literal for the '<em><b>Allowed Answers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDECISION__ALLOWED_ANSWERS = eINSTANCE.getTDecision_AllowedAnswers();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION__VARIABLE = eINSTANCE.getTDecision_Variable();

		/**
		 * The meta object literal for the '<em><b>Information Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION__INFORMATION_REQUIREMENT = eINSTANCE.getTDecision_InformationRequirement();

		/**
		 * The meta object literal for the '<em><b>Knowledge Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION__KNOWLEDGE_REQUIREMENT = eINSTANCE.getTDecision_KnowledgeRequirement();

		/**
		 * The meta object literal for the '<em><b>Authority Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION__AUTHORITY_REQUIREMENT = eINSTANCE.getTDecision_AuthorityRequirement();

		/**
		 * The meta object literal for the '<em><b>Supported Objective</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION__SUPPORTED_OBJECTIVE = eINSTANCE.getTDecision_SupportedObjective();

		/**
		 * The meta object literal for the '<em><b>Impacted Performance Indicator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION__IMPACTED_PERFORMANCE_INDICATOR = eINSTANCE.getTDecision_ImpactedPerformanceIndicator();

		/**
		 * The meta object literal for the '<em><b>Decision Maker</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION__DECISION_MAKER = eINSTANCE.getTDecision_DecisionMaker();

		/**
		 * The meta object literal for the '<em><b>Decision Owner</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION__DECISION_OWNER = eINSTANCE.getTDecision_DecisionOwner();

		/**
		 * The meta object literal for the '<em><b>Using Process</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION__USING_PROCESS = eINSTANCE.getTDecision_UsingProcess();

		/**
		 * The meta object literal for the '<em><b>Using Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION__USING_TASK = eINSTANCE.getTDecision_UsingTask();

		/**
		 * The meta object literal for the '<em><b>Expression Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDECISION__EXPRESSION_GROUP = eINSTANCE.getTDecision_ExpressionGroup();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION__EXPRESSION = eINSTANCE.getTDecision_Expression();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TDecisionRuleImpl <em>TDecision Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TDecisionRuleImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTDecisionRule()
		 * @generated
		 */
		EClass TDECISION_RULE = eINSTANCE.getTDecisionRule();

		/**
		 * The meta object literal for the '<em><b>Input Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION_RULE__INPUT_ENTRY = eINSTANCE.getTDecisionRule_InputEntry();

		/**
		 * The meta object literal for the '<em><b>Output Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION_RULE__OUTPUT_ENTRY = eINSTANCE.getTDecisionRule_OutputEntry();

		/**
		 * The meta object literal for the '<em><b>Annotation Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION_RULE__ANNOTATION_ENTRY = eINSTANCE.getTDecisionRule_AnnotationEntry();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TDecisionServiceImpl <em>TDecision Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TDecisionServiceImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTDecisionService()
		 * @generated
		 */
		EClass TDECISION_SERVICE = eINSTANCE.getTDecisionService();

		/**
		 * The meta object literal for the '<em><b>Output Decision</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION_SERVICE__OUTPUT_DECISION = eINSTANCE.getTDecisionService_OutputDecision();

		/**
		 * The meta object literal for the '<em><b>Encapsulated Decision</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION_SERVICE__ENCAPSULATED_DECISION = eINSTANCE.getTDecisionService_EncapsulatedDecision();

		/**
		 * The meta object literal for the '<em><b>Input Decision</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION_SERVICE__INPUT_DECISION = eINSTANCE.getTDecisionService_InputDecision();

		/**
		 * The meta object literal for the '<em><b>Input Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION_SERVICE__INPUT_DATA = eINSTANCE.getTDecisionService_InputData();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TDecisionTableImpl <em>TDecision Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TDecisionTableImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTDecisionTable()
		 * @generated
		 */
		EClass TDECISION_TABLE = eINSTANCE.getTDecisionTable();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION_TABLE__INPUT = eINSTANCE.getTDecisionTable_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION_TABLE__OUTPUT = eINSTANCE.getTDecisionTable_Output();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION_TABLE__ANNOTATION = eINSTANCE.getTDecisionTable_Annotation();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDECISION_TABLE__RULE = eINSTANCE.getTDecisionTable_Rule();

		/**
		 * The meta object literal for the '<em><b>Aggregation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDECISION_TABLE__AGGREGATION = eINSTANCE.getTDecisionTable_Aggregation();

		/**
		 * The meta object literal for the '<em><b>Hit Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDECISION_TABLE__HIT_POLICY = eINSTANCE.getTDecisionTable_HitPolicy();

		/**
		 * The meta object literal for the '<em><b>Output Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDECISION_TABLE__OUTPUT_LABEL = eINSTANCE.getTDecisionTable_OutputLabel();

		/**
		 * The meta object literal for the '<em><b>Preferred Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDECISION_TABLE__PREFERRED_ORIENTATION = eINSTANCE.getTDecisionTable_PreferredOrientation();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TDefinitionsImpl <em>TDefinitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TDefinitionsImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTDefinitions()
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
		 * The meta object literal for the '<em><b>Item Definition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__ITEM_DEFINITION = eINSTANCE.getTDefinitions_ItemDefinition();

		/**
		 * The meta object literal for the '<em><b>Drg Element Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__DRG_ELEMENT_GROUP = eINSTANCE.getTDefinitions_DrgElementGroup();

		/**
		 * The meta object literal for the '<em><b>Drg Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__DRG_ELEMENT = eINSTANCE.getTDefinitions_DrgElement();

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
		 * The meta object literal for the '<em><b>Element Collection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__ELEMENT_COLLECTION = eINSTANCE.getTDefinitions_ElementCollection();

		/**
		 * The meta object literal for the '<em><b>Business Context Element Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__BUSINESS_CONTEXT_ELEMENT_GROUP = eINSTANCE.getTDefinitions_BusinessContextElementGroup();

		/**
		 * The meta object literal for the '<em><b>Business Context Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__BUSINESS_CONTEXT_ELEMENT = eINSTANCE.getTDefinitions_BusinessContextElement();

		/**
		 * The meta object literal for the '<em><b>DMNDI</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDEFINITIONS__DMNDI = eINSTANCE.getTDefinitions_DMNDI();

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
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__NAMESPACE = eINSTANCE.getTDefinitions_Namespace();

		/**
		 * The meta object literal for the '<em><b>Type Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDEFINITIONS__TYPE_LANGUAGE = eINSTANCE.getTDefinitions_TypeLanguage();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TDMNElementImpl <em>TDMN Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TDMNElementImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTDMNElement()
		 * @generated
		 */
		EClass TDMN_ELEMENT = eINSTANCE.getTDMNElement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDMN_ELEMENT__DESCRIPTION = eINSTANCE.getTDMNElement_Description();

		/**
		 * The meta object literal for the '<em><b>Extension Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDMN_ELEMENT__EXTENSION_ELEMENTS = eINSTANCE.getTDMNElement_ExtensionElements();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDMN_ELEMENT__ID = eINSTANCE.getTDMNElement_Id();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDMN_ELEMENT__LABEL = eINSTANCE.getTDMNElement_Label();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDMN_ELEMENT__ANY_ATTRIBUTE = eINSTANCE.getTDMNElement_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TDMNElementReferenceImpl <em>TDMN Element Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TDMNElementReferenceImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTDMNElementReference()
		 * @generated
		 */
		EClass TDMN_ELEMENT_REFERENCE = eINSTANCE.getTDMNElementReference();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TDMN_ELEMENT_REFERENCE__HREF = eINSTANCE.getTDMNElementReference_Href();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TDRGElementImpl <em>TDRG Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TDRGElementImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTDRGElement()
		 * @generated
		 */
		EClass TDRG_ELEMENT = eINSTANCE.getTDRGElement();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TElementCollectionImpl <em>TElement Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TElementCollectionImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTElementCollection()
		 * @generated
		 */
		EClass TELEMENT_COLLECTION = eINSTANCE.getTElementCollection();

		/**
		 * The meta object literal for the '<em><b>Drg Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TELEMENT_COLLECTION__DRG_ELEMENT = eINSTANCE.getTElementCollection_DrgElement();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TExpressionImpl <em>TExpression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TExpressionImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTExpression()
		 * @generated
		 */
		EClass TEXPRESSION = eINSTANCE.getTExpression();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXPRESSION__TYPE_REF = eINSTANCE.getTExpression_TypeRef();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TFilterImpl <em>TFilter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TFilterImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTFilter()
		 * @generated
		 */
		EClass TFILTER = eINSTANCE.getTFilter();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFILTER__IN = eINSTANCE.getTFilter_In();

		/**
		 * The meta object literal for the '<em><b>Match</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFILTER__MATCH = eINSTANCE.getTFilter_Match();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TForImpl <em>TFor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TForImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTFor()
		 * @generated
		 */
		EClass TFOR = eINSTANCE.getTFor();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFOR__RETURN = eINSTANCE.getTFor_Return();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TFunctionDefinitionImpl <em>TFunction Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TFunctionDefinitionImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTFunctionDefinition()
		 * @generated
		 */
		EClass TFUNCTION_DEFINITION = eINSTANCE.getTFunctionDefinition();

		/**
		 * The meta object literal for the '<em><b>Formal Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFUNCTION_DEFINITION__FORMAL_PARAMETER = eINSTANCE.getTFunctionDefinition_FormalParameter();

		/**
		 * The meta object literal for the '<em><b>Expression Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFUNCTION_DEFINITION__EXPRESSION_GROUP = eINSTANCE.getTFunctionDefinition_ExpressionGroup();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFUNCTION_DEFINITION__EXPRESSION = eINSTANCE.getTFunctionDefinition_Expression();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFUNCTION_DEFINITION__KIND = eINSTANCE.getTFunctionDefinition_Kind();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TFunctionItemImpl <em>TFunction Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TFunctionItemImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTFunctionItem()
		 * @generated
		 */
		EClass TFUNCTION_ITEM = eINSTANCE.getTFunctionItem();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFUNCTION_ITEM__PARAMETERS = eINSTANCE.getTFunctionItem_Parameters();

		/**
		 * The meta object literal for the '<em><b>Output Type Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFUNCTION_ITEM__OUTPUT_TYPE_REF = eINSTANCE.getTFunctionItem_OutputTypeRef();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TGroupImpl <em>TGroup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TGroupImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTGroup()
		 * @generated
		 */
		EClass TGROUP = eINSTANCE.getTGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TGROUP__NAME = eINSTANCE.getTGroup_Name();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TImportImpl <em>TImport</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TImportImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTImport()
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
		 * The meta object literal for the '<em><b>Location URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPORT__LOCATION_URI = eINSTANCE.getTImport_LocationURI();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPORT__NAMESPACE = eINSTANCE.getTImport_Namespace();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TImportedValuesImpl <em>TImported Values</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TImportedValuesImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTImportedValues()
		 * @generated
		 */
		EClass TIMPORTED_VALUES = eINSTANCE.getTImportedValues();

		/**
		 * The meta object literal for the '<em><b>Imported Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPORTED_VALUES__IMPORTED_ELEMENT = eINSTANCE.getTImportedValues_ImportedElement();

		/**
		 * The meta object literal for the '<em><b>Expression Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMPORTED_VALUES__EXPRESSION_LANGUAGE = eINSTANCE.getTImportedValues_ExpressionLanguage();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TInformationItemImpl <em>TInformation Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TInformationItemImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTInformationItem()
		 * @generated
		 */
		EClass TINFORMATION_ITEM = eINSTANCE.getTInformationItem();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINFORMATION_ITEM__TYPE_REF = eINSTANCE.getTInformationItem_TypeRef();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TInformationRequirementImpl <em>TInformation Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TInformationRequirementImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTInformationRequirement()
		 * @generated
		 */
		EClass TINFORMATION_REQUIREMENT = eINSTANCE.getTInformationRequirement();

		/**
		 * The meta object literal for the '<em><b>Required Decision</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINFORMATION_REQUIREMENT__REQUIRED_DECISION = eINSTANCE.getTInformationRequirement_RequiredDecision();

		/**
		 * The meta object literal for the '<em><b>Required Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINFORMATION_REQUIREMENT__REQUIRED_INPUT = eINSTANCE.getTInformationRequirement_RequiredInput();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TInputClauseImpl <em>TInput Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TInputClauseImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTInputClause()
		 * @generated
		 */
		EClass TINPUT_CLAUSE = eINSTANCE.getTInputClause();

		/**
		 * The meta object literal for the '<em><b>Input Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINPUT_CLAUSE__INPUT_EXPRESSION = eINSTANCE.getTInputClause_InputExpression();

		/**
		 * The meta object literal for the '<em><b>Input Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINPUT_CLAUSE__INPUT_VALUES = eINSTANCE.getTInputClause_InputValues();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TInputDataImpl <em>TInput Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TInputDataImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTInputData()
		 * @generated
		 */
		EClass TINPUT_DATA = eINSTANCE.getTInputData();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINPUT_DATA__VARIABLE = eINSTANCE.getTInputData_Variable();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TInvocableImpl <em>TInvocable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TInvocableImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTInvocable()
		 * @generated
		 */
		EClass TINVOCABLE = eINSTANCE.getTInvocable();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINVOCABLE__VARIABLE = eINSTANCE.getTInvocable_Variable();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TInvocationImpl <em>TInvocation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TInvocationImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTInvocation()
		 * @generated
		 */
		EClass TINVOCATION = eINSTANCE.getTInvocation();

		/**
		 * The meta object literal for the '<em><b>Expression Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINVOCATION__EXPRESSION_GROUP = eINSTANCE.getTInvocation_ExpressionGroup();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINVOCATION__EXPRESSION = eINSTANCE.getTInvocation_Expression();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINVOCATION__BINDING = eINSTANCE.getTInvocation_Binding();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TItemDefinitionImpl <em>TItem Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TItemDefinitionImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTItemDefinition()
		 * @generated
		 */
		EClass TITEM_DEFINITION = eINSTANCE.getTItemDefinition();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITEM_DEFINITION__TYPE_REF = eINSTANCE.getTItemDefinition_TypeRef();

		/**
		 * The meta object literal for the '<em><b>Allowed Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITEM_DEFINITION__ALLOWED_VALUES = eINSTANCE.getTItemDefinition_AllowedValues();

		/**
		 * The meta object literal for the '<em><b>Type Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITEM_DEFINITION__TYPE_CONSTRAINT = eINSTANCE.getTItemDefinition_TypeConstraint();

		/**
		 * The meta object literal for the '<em><b>Item Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITEM_DEFINITION__ITEM_COMPONENT = eINSTANCE.getTItemDefinition_ItemComponent();

		/**
		 * The meta object literal for the '<em><b>Function Item</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITEM_DEFINITION__FUNCTION_ITEM = eINSTANCE.getTItemDefinition_FunctionItem();

		/**
		 * The meta object literal for the '<em><b>Is Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITEM_DEFINITION__IS_COLLECTION = eINSTANCE.getTItemDefinition_IsCollection();

		/**
		 * The meta object literal for the '<em><b>Type Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITEM_DEFINITION__TYPE_LANGUAGE = eINSTANCE.getTItemDefinition_TypeLanguage();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TIteratorImpl <em>TIterator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TIteratorImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTIterator()
		 * @generated
		 */
		EClass TITERATOR = eINSTANCE.getTIterator();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITERATOR__IN = eINSTANCE.getTIterator_In();

		/**
		 * The meta object literal for the '<em><b>Iterator Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITERATOR__ITERATOR_VARIABLE = eINSTANCE.getTIterator_IteratorVariable();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TKnowledgeRequirementImpl <em>TKnowledge Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TKnowledgeRequirementImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTKnowledgeRequirement()
		 * @generated
		 */
		EClass TKNOWLEDGE_REQUIREMENT = eINSTANCE.getTKnowledgeRequirement();

		/**
		 * The meta object literal for the '<em><b>Required Knowledge</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TKNOWLEDGE_REQUIREMENT__REQUIRED_KNOWLEDGE = eINSTANCE.getTKnowledgeRequirement_RequiredKnowledge();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TKnowledgeSourceImpl <em>TKnowledge Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TKnowledgeSourceImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTKnowledgeSource()
		 * @generated
		 */
		EClass TKNOWLEDGE_SOURCE = eINSTANCE.getTKnowledgeSource();

		/**
		 * The meta object literal for the '<em><b>Authority Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TKNOWLEDGE_SOURCE__AUTHORITY_REQUIREMENT = eINSTANCE.getTKnowledgeSource_AuthorityRequirement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TKNOWLEDGE_SOURCE__TYPE = eINSTANCE.getTKnowledgeSource_Type();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TKNOWLEDGE_SOURCE__OWNER = eINSTANCE.getTKnowledgeSource_Owner();

		/**
		 * The meta object literal for the '<em><b>Location URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TKNOWLEDGE_SOURCE__LOCATION_URI = eINSTANCE.getTKnowledgeSource_LocationURI();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TListImpl <em>TList</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TListImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTList()
		 * @generated
		 */
		EClass TLIST = eINSTANCE.getTList();

		/**
		 * The meta object literal for the '<em><b>Expression Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLIST__EXPRESSION_GROUP = eINSTANCE.getTList_ExpressionGroup();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TLIST__EXPRESSION = eINSTANCE.getTList_Expression();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TLiteralExpressionImpl <em>TLiteral Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TLiteralExpressionImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTLiteralExpression()
		 * @generated
		 */
		EClass TLITERAL_EXPRESSION = eINSTANCE.getTLiteralExpression();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLITERAL_EXPRESSION__TEXT = eINSTANCE.getTLiteralExpression_Text();

		/**
		 * The meta object literal for the '<em><b>Imported Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TLITERAL_EXPRESSION__IMPORTED_VALUES = eINSTANCE.getTLiteralExpression_ImportedValues();

		/**
		 * The meta object literal for the '<em><b>Expression Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLITERAL_EXPRESSION__EXPRESSION_LANGUAGE = eINSTANCE.getTLiteralExpression_ExpressionLanguage();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TNamedElementImpl <em>TNamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TNamedElementImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTNamedElement()
		 * @generated
		 */
		EClass TNAMED_ELEMENT = eINSTANCE.getTNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TNAMED_ELEMENT__NAME = eINSTANCE.getTNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TOrganizationUnitImpl <em>TOrganization Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TOrganizationUnitImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTOrganizationUnit()
		 * @generated
		 */
		EClass TORGANIZATION_UNIT = eINSTANCE.getTOrganizationUnit();

		/**
		 * The meta object literal for the '<em><b>Decision Made</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TORGANIZATION_UNIT__DECISION_MADE = eINSTANCE.getTOrganizationUnit_DecisionMade();

		/**
		 * The meta object literal for the '<em><b>Decision Owned</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TORGANIZATION_UNIT__DECISION_OWNED = eINSTANCE.getTOrganizationUnit_DecisionOwned();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TOutputClauseImpl <em>TOutput Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TOutputClauseImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTOutputClause()
		 * @generated
		 */
		EClass TOUTPUT_CLAUSE = eINSTANCE.getTOutputClause();

		/**
		 * The meta object literal for the '<em><b>Output Values</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUTPUT_CLAUSE__OUTPUT_VALUES = eINSTANCE.getTOutputClause_OutputValues();

		/**
		 * The meta object literal for the '<em><b>Default Output Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOUTPUT_CLAUSE__DEFAULT_OUTPUT_ENTRY = eINSTANCE.getTOutputClause_DefaultOutputEntry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUTPUT_CLAUSE__NAME = eINSTANCE.getTOutputClause_Name();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOUTPUT_CLAUSE__TYPE_REF = eINSTANCE.getTOutputClause_TypeRef();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TPerformanceIndicatorImpl <em>TPerformance Indicator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TPerformanceIndicatorImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTPerformanceIndicator()
		 * @generated
		 */
		EClass TPERFORMANCE_INDICATOR = eINSTANCE.getTPerformanceIndicator();

		/**
		 * The meta object literal for the '<em><b>Impacting Decision</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TPERFORMANCE_INDICATOR__IMPACTING_DECISION = eINSTANCE.getTPerformanceIndicator_ImpactingDecision();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TQuantifiedImpl <em>TQuantified</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TQuantifiedImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTQuantified()
		 * @generated
		 */
		EClass TQUANTIFIED = eINSTANCE.getTQuantified();

		/**
		 * The meta object literal for the '<em><b>Satisfies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TQUANTIFIED__SATISFIES = eINSTANCE.getTQuantified_Satisfies();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TRelationImpl <em>TRelation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TRelationImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTRelation()
		 * @generated
		 */
		EClass TRELATION = eINSTANCE.getTRelation();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATION__COLUMN = eINSTANCE.getTRelation_Column();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRELATION__ROW = eINSTANCE.getTRelation_Row();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TRuleAnnotationImpl <em>TRule Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TRuleAnnotationImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTRuleAnnotation()
		 * @generated
		 */
		EClass TRULE_ANNOTATION = eINSTANCE.getTRuleAnnotation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRULE_ANNOTATION__TEXT = eINSTANCE.getTRuleAnnotation_Text();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TRuleAnnotationClauseImpl <em>TRule Annotation Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TRuleAnnotationClauseImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTRuleAnnotationClause()
		 * @generated
		 */
		EClass TRULE_ANNOTATION_CLAUSE = eINSTANCE.getTRuleAnnotationClause();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRULE_ANNOTATION_CLAUSE__NAME = eINSTANCE.getTRuleAnnotationClause_Name();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TTextAnnotationImpl <em>TText Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TTextAnnotationImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTTextAnnotation()
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
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TTypedChildExpressionImpl <em>TTyped Child Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TTypedChildExpressionImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTTypedChildExpression()
		 * @generated
		 */
		EClass TTYPED_CHILD_EXPRESSION = eINSTANCE.getTTypedChildExpression();

		/**
		 * The meta object literal for the '<em><b>Type Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTYPED_CHILD_EXPRESSION__TYPE_REF = eINSTANCE.getTTypedChildExpression_TypeRef();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.impl.TUnaryTestsImpl <em>TUnary Tests</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.impl.TUnaryTestsImpl
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTUnaryTests()
		 * @generated
		 */
		EClass TUNARY_TESTS = eINSTANCE.getTUnaryTests();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUNARY_TESTS__TEXT = eINSTANCE.getTUnaryTests_Text();

		/**
		 * The meta object literal for the '<em><b>Expression Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TUNARY_TESTS__EXPRESSION_LANGUAGE = eINSTANCE.getTUnaryTests_ExpressionLanguage();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.TAssociationDirection <em>TAssociation Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.TAssociationDirection
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTAssociationDirection()
		 * @generated
		 */
		EEnum TASSOCIATION_DIRECTION = eINSTANCE.getTAssociationDirection();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.TBuiltinAggregator <em>TBuiltin Aggregator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.TBuiltinAggregator
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTBuiltinAggregator()
		 * @generated
		 */
		EEnum TBUILTIN_AGGREGATOR = eINSTANCE.getTBuiltinAggregator();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.TDecisionTableOrientation <em>TDecision Table Orientation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.TDecisionTableOrientation
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTDecisionTableOrientation()
		 * @generated
		 */
		EEnum TDECISION_TABLE_ORIENTATION = eINSTANCE.getTDecisionTableOrientation();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.TFunctionKind <em>TFunction Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.TFunctionKind
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTFunctionKind()
		 * @generated
		 */
		EEnum TFUNCTION_KIND = eINSTANCE.getTFunctionKind();

		/**
		 * The meta object literal for the '{@link org.omg.spec.dmn.dmn.THitPolicy <em>THit Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.THitPolicy
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTHitPolicy()
		 * @generated
		 */
		EEnum THIT_POLICY = eINSTANCE.getTHitPolicy();

		/**
		 * The meta object literal for the '<em>TAssociation Direction Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.TAssociationDirection
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTAssociationDirectionObject()
		 * @generated
		 */
		EDataType TASSOCIATION_DIRECTION_OBJECT = eINSTANCE.getTAssociationDirectionObject();

		/**
		 * The meta object literal for the '<em>TBuiltin Aggregator Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.TBuiltinAggregator
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTBuiltinAggregatorObject()
		 * @generated
		 */
		EDataType TBUILTIN_AGGREGATOR_OBJECT = eINSTANCE.getTBuiltinAggregatorObject();

		/**
		 * The meta object literal for the '<em>TDecision Table Orientation Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.TDecisionTableOrientation
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTDecisionTableOrientationObject()
		 * @generated
		 */
		EDataType TDECISION_TABLE_ORIENTATION_OBJECT = eINSTANCE.getTDecisionTableOrientationObject();

		/**
		 * The meta object literal for the '<em>TFunction Kind Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.TFunctionKind
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTFunctionKindObject()
		 * @generated
		 */
		EDataType TFUNCTION_KIND_OBJECT = eINSTANCE.getTFunctionKindObject();

		/**
		 * The meta object literal for the '<em>THit Policy Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.omg.spec.dmn.dmn.THitPolicy
		 * @see org.omg.spec.dmn.dmn.impl.DMNPackageImpl#getTHitPolicyObject()
		 * @generated
		 */
		EDataType THIT_POLICY_OBJECT = eINSTANCE.getTHitPolicyObject();

	}

} //DMNPackage
