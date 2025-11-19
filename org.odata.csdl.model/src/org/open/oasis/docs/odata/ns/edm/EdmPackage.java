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
package org.open.oasis.docs.odata.ns.edm;


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
 * 
 *       Entity Data Model part of the Common Schema Definition Language
 *     
 * <!-- end-model-doc -->
 * @see org.open.oasis.docs.odata.ns.edm.EdmFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = EdmPackage.eNS_URI, genModel = "/model/edmx.genmodel", genModelSourceLocations = {"model/edmx.genmodel","org.odata.csdl.model/model/edmx.genmodel"}, ecore="/model/edm.ecore", ecoreSourceLocations="/model/edm.ecore")
public interface EdmPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "edm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://docs.oasis-open.org/odata/ns/edm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdmPackage eINSTANCE = org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.AnnotationTypeImpl <em>Annotation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.AnnotationTypeImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getAnnotationType()
	 * @generated
	 */
	int ANNOTATION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Binary</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__BINARY = 2;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__BOOL = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__DATE = 4;

	/**
	 * The feature id for the '<em><b>Date Time Offset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__DATE_TIME_OFFSET = 5;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__DECIMAL = 6;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__DURATION = 7;

	/**
	 * The feature id for the '<em><b>Enum Member</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__ENUM_MEMBER = 8;

	/**
	 * The feature id for the '<em><b>Float</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__FLOAT = 9;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__GUID = 10;

	/**
	 * The feature id for the '<em><b>Int</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__INT = 11;

	/**
	 * The feature id for the '<em><b>String</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__STRING = 12;

	/**
	 * The feature id for the '<em><b>Time Of Day</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__TIME_OF_DAY = 13;

	/**
	 * The feature id for the '<em><b>Annotation Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__ANNOTATION_PATH = 14;

	/**
	 * The feature id for the '<em><b>Apply</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__APPLY = 15;

	/**
	 * The feature id for the '<em><b>Cast</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__CAST = 16;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__COLLECTION = 17;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__IF = 18;

	/**
	 * The feature id for the '<em><b>Eq</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__EQ = 19;

	/**
	 * The feature id for the '<em><b>Ne</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__NE = 20;

	/**
	 * The feature id for the '<em><b>Ge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__GE = 21;

	/**
	 * The feature id for the '<em><b>Gt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__GT = 22;

	/**
	 * The feature id for the '<em><b>Le</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__LE = 23;

	/**
	 * The feature id for the '<em><b>Lt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__LT = 24;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__AND = 25;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__OR = 26;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__NOT = 27;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__HAS = 28;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__IN = 29;

	/**
	 * The feature id for the '<em><b>Add</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__ADD = 30;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__SUB = 31;

	/**
	 * The feature id for the '<em><b>Neg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__NEG = 32;

	/**
	 * The feature id for the '<em><b>Mul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__MUL = 33;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__DIV = 34;

	/**
	 * The feature id for the '<em><b>Div By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__DIV_BY = 35;

	/**
	 * The feature id for the '<em><b>Mod</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__MOD = 36;

	/**
	 * The feature id for the '<em><b>Is Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__IS_OF = 37;

	/**
	 * The feature id for the '<em><b>Labeled Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__LABELED_ELEMENT = 38;

	/**
	 * The feature id for the '<em><b>Labeled Element Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__LABELED_ELEMENT_REFERENCE = 39;

	/**
	 * The feature id for the '<em><b>Null</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__NULL = 40;

	/**
	 * The feature id for the '<em><b>Model Element Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__MODEL_ELEMENT_PATH = 41;

	/**
	 * The feature id for the '<em><b>Navigation Property Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__NAVIGATION_PROPERTY_PATH = 42;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__PATH = 43;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__PROPERTY_PATH = 44;

	/**
	 * The feature id for the '<em><b>Record</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__RECORD = 45;

	/**
	 * The feature id for the '<em><b>Url Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__URL_REF = 46;

	/**
	 * The feature id for the '<em><b>Annotation Path1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__ANNOTATION_PATH1 = 47;

	/**
	 * The feature id for the '<em><b>Binary1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__BINARY1 = 48;

	/**
	 * The feature id for the '<em><b>Bool1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__BOOL1 = 49;

	/**
	 * The feature id for the '<em><b>Date1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__DATE1 = 50;

	/**
	 * The feature id for the '<em><b>Date Time Offset1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__DATE_TIME_OFFSET1 = 51;

	/**
	 * The feature id for the '<em><b>Decimal1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__DECIMAL1 = 52;

	/**
	 * The feature id for the '<em><b>Duration1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__DURATION1 = 53;

	/**
	 * The feature id for the '<em><b>Enum Member1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__ENUM_MEMBER1 = 54;

	/**
	 * The feature id for the '<em><b>Float1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__FLOAT1 = 55;

	/**
	 * The feature id for the '<em><b>Guid1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__GUID1 = 56;

	/**
	 * The feature id for the '<em><b>Int1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__INT1 = 57;

	/**
	 * The feature id for the '<em><b>Model Element Path1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__MODEL_ELEMENT_PATH1 = 58;

	/**
	 * The feature id for the '<em><b>Navigation Property Path1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__NAVIGATION_PROPERTY_PATH1 = 59;

	/**
	 * The feature id for the '<em><b>Path1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__PATH1 = 60;

	/**
	 * The feature id for the '<em><b>Property Path1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__PROPERTY_PATH1 = 61;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__QUALIFIER = 62;

	/**
	 * The feature id for the '<em><b>String1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__STRING1 = 63;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__TERM = 64;

	/**
	 * The feature id for the '<em><b>Time Of Day1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__TIME_OF_DAY1 = 65;

	/**
	 * The feature id for the '<em><b>Url Ref1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE__URL_REF1 = 66;

	/**
	 * The number of structural features of the '<em>Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_FEATURE_COUNT = 67;

	/**
	 * The number of operations of the '<em>Annotation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.EdmRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmRootImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getEdmRoot()
	 * @generated
	 */
	int EDM_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDM_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDM_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDM_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDM_ROOT__ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDM_ROOT__ANNOTATIONS = 4;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDM_ROOT__SCHEMA = 5;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDM_ROOT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDM_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.SchemaTypeImpl <em>Schema Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.SchemaTypeImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getSchemaType()
	 * @generated
	 */
	int SCHEMA_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Complex Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__COMPLEX_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__ENTITY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type Definition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__TYPE_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Enum Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__ENUM_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__ACTION = 5;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__FUNCTION = 6;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__TERM = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__ANNOTATIONS = 8;

	/**
	 * The feature id for the '<em><b>Entity Container</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__ENTITY_CONTAINER = 9;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__ANNOTATION = 10;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__ALIAS = 11;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__NAMESPACE = 12;

	/**
	 * The number of structural features of the '<em>Schema Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Schema Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TActionImpl <em>TAction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TActionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTAction()
	 * @generated
	 */
	int TACTION = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION__PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION__ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION__RETURN_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Entity Set Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION__ENTITY_SET_PATH = 4;

	/**
	 * The feature id for the '<em><b>Is Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION__IS_BOUND = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION__NAME = 6;

	/**
	 * The number of structural features of the '<em>TAction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>TAction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TActionFunctionParameterImpl <em>TAction Function Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TActionFunctionParameterImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTActionFunctionParameter()
	 * @generated
	 */
	int TACTION_FUNCTION_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_FUNCTION_PARAMETER__ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_FUNCTION_PARAMETER__MAX_LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_FUNCTION_PARAMETER__NAME = 2;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_FUNCTION_PARAMETER__NULLABLE = 3;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_FUNCTION_PARAMETER__PRECISION = 4;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_FUNCTION_PARAMETER__SCALE = 5;

	/**
	 * The feature id for the '<em><b>SRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_FUNCTION_PARAMETER__SRID = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_FUNCTION_PARAMETER__TYPE = 7;

	/**
	 * The feature id for the '<em><b>Unicode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_FUNCTION_PARAMETER__UNICODE = 8;

	/**
	 * The number of structural features of the '<em>TAction Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_FUNCTION_PARAMETER_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>TAction Function Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_FUNCTION_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TActionFunctionReturnTypeImpl <em>TAction Function Return Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TActionFunctionReturnTypeImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTActionFunctionReturnType()
	 * @generated
	 */
	int TACTION_FUNCTION_RETURN_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_FUNCTION_RETURN_TYPE__ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_FUNCTION_RETURN_TYPE__MAX_LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_FUNCTION_RETURN_TYPE__NULLABLE = 2;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_FUNCTION_RETURN_TYPE__PRECISION = 3;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_FUNCTION_RETURN_TYPE__SCALE = 4;

	/**
	 * The feature id for the '<em><b>SRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_FUNCTION_RETURN_TYPE__SRID = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_FUNCTION_RETURN_TYPE__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Unicode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_FUNCTION_RETURN_TYPE__UNICODE = 7;

	/**
	 * The number of structural features of the '<em>TAction Function Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_FUNCTION_RETURN_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>TAction Function Return Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_FUNCTION_RETURN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TActionImportImpl <em>TAction Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TActionImportImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTActionImport()
	 * @generated
	 */
	int TACTION_IMPORT = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_IMPORT__ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_IMPORT__ACTION = 1;

	/**
	 * The feature id for the '<em><b>Entity Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_IMPORT__ENTITY_SET = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_IMPORT__NAME = 3;

	/**
	 * The number of structural features of the '<em>TAction Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_IMPORT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TAction Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TACTION_IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TAnnotationsImpl <em>TAnnotations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TAnnotationsImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTAnnotations()
	 * @generated
	 */
	int TANNOTATIONS = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATIONS__ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATIONS__QUALIFIER = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATIONS__TARGET = 2;

	/**
	 * The number of structural features of the '<em>TAnnotations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TAnnotations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANNOTATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl <em>TApply Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TApplyExpressionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTApplyExpression()
	 * @generated
	 */
	int TAPPLY_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Binary</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__BINARY = 2;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__BOOL = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__DATE = 4;

	/**
	 * The feature id for the '<em><b>Date Time Offset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__DATE_TIME_OFFSET = 5;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__DECIMAL = 6;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__DURATION = 7;

	/**
	 * The feature id for the '<em><b>Enum Member</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__ENUM_MEMBER = 8;

	/**
	 * The feature id for the '<em><b>Float</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__FLOAT = 9;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__GUID = 10;

	/**
	 * The feature id for the '<em><b>Int</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__INT = 11;

	/**
	 * The feature id for the '<em><b>String</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__STRING = 12;

	/**
	 * The feature id for the '<em><b>Time Of Day</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__TIME_OF_DAY = 13;

	/**
	 * The feature id for the '<em><b>Annotation Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__ANNOTATION_PATH = 14;

	/**
	 * The feature id for the '<em><b>Apply</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__APPLY = 15;

	/**
	 * The feature id for the '<em><b>Cast</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__CAST = 16;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__COLLECTION = 17;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__IF = 18;

	/**
	 * The feature id for the '<em><b>Eq</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__EQ = 19;

	/**
	 * The feature id for the '<em><b>Ne</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__NE = 20;

	/**
	 * The feature id for the '<em><b>Ge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__GE = 21;

	/**
	 * The feature id for the '<em><b>Gt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__GT = 22;

	/**
	 * The feature id for the '<em><b>Le</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__LE = 23;

	/**
	 * The feature id for the '<em><b>Lt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__LT = 24;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__AND = 25;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__OR = 26;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__NOT = 27;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__HAS = 28;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__IN = 29;

	/**
	 * The feature id for the '<em><b>Add</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__ADD = 30;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__SUB = 31;

	/**
	 * The feature id for the '<em><b>Neg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__NEG = 32;

	/**
	 * The feature id for the '<em><b>Mul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__MUL = 33;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__DIV = 34;

	/**
	 * The feature id for the '<em><b>Div By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__DIV_BY = 35;

	/**
	 * The feature id for the '<em><b>Mod</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__MOD = 36;

	/**
	 * The feature id for the '<em><b>Is Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__IS_OF = 37;

	/**
	 * The feature id for the '<em><b>Labeled Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__LABELED_ELEMENT = 38;

	/**
	 * The feature id for the '<em><b>Labeled Element Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__LABELED_ELEMENT_REFERENCE = 39;

	/**
	 * The feature id for the '<em><b>Null</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__NULL = 40;

	/**
	 * The feature id for the '<em><b>Model Element Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__MODEL_ELEMENT_PATH = 41;

	/**
	 * The feature id for the '<em><b>Navigation Property Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__NAVIGATION_PROPERTY_PATH = 42;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__PATH = 43;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__PROPERTY_PATH = 44;

	/**
	 * The feature id for the '<em><b>Record</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__RECORD = 45;

	/**
	 * The feature id for the '<em><b>Url Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__URL_REF = 46;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION__FUNCTION = 47;

	/**
	 * The number of structural features of the '<em>TApply Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION_FEATURE_COUNT = 48;

	/**
	 * The number of operations of the '<em>TApply Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPLY_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TBinaryConstantExpressionImpl <em>TBinary Constant Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TBinaryConstantExpressionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTBinaryConstantExpression()
	 * @generated
	 */
	int TBINARY_CONSTANT_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBINARY_CONSTANT_EXPRESSION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>TBinary Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBINARY_CONSTANT_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TBinary Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBINARY_CONSTANT_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TBoolConstantExpressionImpl <em>TBool Constant Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TBoolConstantExpressionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTBoolConstantExpression()
	 * @generated
	 */
	int TBOOL_CONSTANT_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOOL_CONSTANT_EXPRESSION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>TBool Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOOL_CONSTANT_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TBool Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBOOL_CONSTANT_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TCastOrIsOfExpressionImpl <em>TCast Or Is Of Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TCastOrIsOfExpressionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTCastOrIsOfExpression()
	 * @generated
	 */
	int TCAST_OR_IS_OF_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__BINARY = 1;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__BOOL = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__DATE = 3;

	/**
	 * The feature id for the '<em><b>Date Time Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__DATE_TIME_OFFSET = 4;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__DECIMAL = 5;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__DURATION = 6;

	/**
	 * The feature id for the '<em><b>Enum Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__ENUM_MEMBER = 7;

	/**
	 * The feature id for the '<em><b>Float</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__FLOAT = 8;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__GUID = 9;

	/**
	 * The feature id for the '<em><b>Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__INT = 10;

	/**
	 * The feature id for the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__STRING = 11;

	/**
	 * The feature id for the '<em><b>Time Of Day</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__TIME_OF_DAY = 12;

	/**
	 * The feature id for the '<em><b>Annotation Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__ANNOTATION_PATH = 13;

	/**
	 * The feature id for the '<em><b>Apply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__APPLY = 14;

	/**
	 * The feature id for the '<em><b>Cast</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__CAST = 15;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__COLLECTION = 16;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__IF = 17;

	/**
	 * The feature id for the '<em><b>Eq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__EQ = 18;

	/**
	 * The feature id for the '<em><b>Ne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__NE = 19;

	/**
	 * The feature id for the '<em><b>Ge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__GE = 20;

	/**
	 * The feature id for the '<em><b>Gt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__GT = 21;

	/**
	 * The feature id for the '<em><b>Le</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__LE = 22;

	/**
	 * The feature id for the '<em><b>Lt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__LT = 23;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__AND = 24;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__OR = 25;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__NOT = 26;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__HAS = 27;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__IN = 28;

	/**
	 * The feature id for the '<em><b>Add</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__ADD = 29;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__SUB = 30;

	/**
	 * The feature id for the '<em><b>Neg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__NEG = 31;

	/**
	 * The feature id for the '<em><b>Mul</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__MUL = 32;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__DIV = 33;

	/**
	 * The feature id for the '<em><b>Div By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__DIV_BY = 34;

	/**
	 * The feature id for the '<em><b>Mod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__MOD = 35;

	/**
	 * The feature id for the '<em><b>Is Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__IS_OF = 36;

	/**
	 * The feature id for the '<em><b>Labeled Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__LABELED_ELEMENT = 37;

	/**
	 * The feature id for the '<em><b>Labeled Element Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__LABELED_ELEMENT_REFERENCE = 38;

	/**
	 * The feature id for the '<em><b>Null</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__NULL = 39;

	/**
	 * The feature id for the '<em><b>Model Element Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__MODEL_ELEMENT_PATH = 40;

	/**
	 * The feature id for the '<em><b>Navigation Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__NAVIGATION_PROPERTY_PATH = 41;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__PATH = 42;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__PROPERTY_PATH = 43;

	/**
	 * The feature id for the '<em><b>Record</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__RECORD = 44;

	/**
	 * The feature id for the '<em><b>Url Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__URL_REF = 45;

	/**
	 * The feature id for the '<em><b>Annotation1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__ANNOTATION1 = 46;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__MAX_LENGTH = 47;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__PRECISION = 48;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__SCALE = 49;

	/**
	 * The feature id for the '<em><b>SRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__SRID = 50;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__TYPE = 51;

	/**
	 * The feature id for the '<em><b>Unicode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION__UNICODE = 52;

	/**
	 * The number of structural features of the '<em>TCast Or Is Of Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION_FEATURE_COUNT = 53;

	/**
	 * The number of operations of the '<em>TCast Or Is Of Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCAST_OR_IS_OF_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TCollectionExpressionImpl <em>TCollection Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TCollectionExpressionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTCollectionExpression()
	 * @generated
	 */
	int TCOLLECTION_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>GExpression</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__GEXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Binary</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__BINARY = 1;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__BOOL = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__DATE = 3;

	/**
	 * The feature id for the '<em><b>Date Time Offset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__DATE_TIME_OFFSET = 4;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__DECIMAL = 5;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__DURATION = 6;

	/**
	 * The feature id for the '<em><b>Enum Member</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__ENUM_MEMBER = 7;

	/**
	 * The feature id for the '<em><b>Float</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__FLOAT = 8;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__GUID = 9;

	/**
	 * The feature id for the '<em><b>Int</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__INT = 10;

	/**
	 * The feature id for the '<em><b>String</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__STRING = 11;

	/**
	 * The feature id for the '<em><b>Time Of Day</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__TIME_OF_DAY = 12;

	/**
	 * The feature id for the '<em><b>Annotation Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__ANNOTATION_PATH = 13;

	/**
	 * The feature id for the '<em><b>Apply</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__APPLY = 14;

	/**
	 * The feature id for the '<em><b>Cast</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__CAST = 15;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__COLLECTION = 16;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__IF = 17;

	/**
	 * The feature id for the '<em><b>Eq</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__EQ = 18;

	/**
	 * The feature id for the '<em><b>Ne</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__NE = 19;

	/**
	 * The feature id for the '<em><b>Ge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__GE = 20;

	/**
	 * The feature id for the '<em><b>Gt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__GT = 21;

	/**
	 * The feature id for the '<em><b>Le</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__LE = 22;

	/**
	 * The feature id for the '<em><b>Lt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__LT = 23;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__AND = 24;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__OR = 25;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__NOT = 26;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__HAS = 27;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__IN = 28;

	/**
	 * The feature id for the '<em><b>Add</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__ADD = 29;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__SUB = 30;

	/**
	 * The feature id for the '<em><b>Neg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__NEG = 31;

	/**
	 * The feature id for the '<em><b>Mul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__MUL = 32;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__DIV = 33;

	/**
	 * The feature id for the '<em><b>Div By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__DIV_BY = 34;

	/**
	 * The feature id for the '<em><b>Mod</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__MOD = 35;

	/**
	 * The feature id for the '<em><b>Is Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__IS_OF = 36;

	/**
	 * The feature id for the '<em><b>Labeled Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__LABELED_ELEMENT = 37;

	/**
	 * The feature id for the '<em><b>Labeled Element Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__LABELED_ELEMENT_REFERENCE = 38;

	/**
	 * The feature id for the '<em><b>Null</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__NULL = 39;

	/**
	 * The feature id for the '<em><b>Model Element Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__MODEL_ELEMENT_PATH = 40;

	/**
	 * The feature id for the '<em><b>Navigation Property Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__NAVIGATION_PROPERTY_PATH = 41;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__PATH = 42;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__PROPERTY_PATH = 43;

	/**
	 * The feature id for the '<em><b>Record</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__RECORD = 44;

	/**
	 * The feature id for the '<em><b>Url Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION__URL_REF = 45;

	/**
	 * The number of structural features of the '<em>TCollection Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION_FEATURE_COUNT = 46;

	/**
	 * The number of operations of the '<em>TCollection Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOLLECTION_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TComplexTypeImpl <em>TComplex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TComplexTypeImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTComplexType()
	 * @generated
	 */
	int TCOMPLEX_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_TYPE__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Navigation Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_TYPE__NAVIGATION_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_TYPE__ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_TYPE__ABSTRACT = 4;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_TYPE__BASE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_TYPE__NAME = 6;

	/**
	 * The feature id for the '<em><b>Open Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_TYPE__OPEN_TYPE = 7;

	/**
	 * The number of structural features of the '<em>TComplex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>TComplex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCOMPLEX_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TDateConstantExpressionImpl <em>TDate Constant Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TDateConstantExpressionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTDateConstantExpression()
	 * @generated
	 */
	int TDATE_CONSTANT_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATE_CONSTANT_EXPRESSION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>TDate Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATE_CONSTANT_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TDate Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATE_CONSTANT_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TDateTimeOffsetConstantExpressionImpl <em>TDate Time Offset Constant Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TDateTimeOffsetConstantExpressionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTDateTimeOffsetConstantExpression()
	 * @generated
	 */
	int TDATE_TIME_OFFSET_CONSTANT_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATE_TIME_OFFSET_CONSTANT_EXPRESSION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>TDate Time Offset Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATE_TIME_OFFSET_CONSTANT_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TDate Time Offset Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATE_TIME_OFFSET_CONSTANT_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TDecimalConstantExpressionImpl <em>TDecimal Constant Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TDecimalConstantExpressionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTDecimalConstantExpression()
	 * @generated
	 */
	int TDECIMAL_CONSTANT_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECIMAL_CONSTANT_EXPRESSION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>TDecimal Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECIMAL_CONSTANT_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TDecimal Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDECIMAL_CONSTANT_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TDurationConstantExpressionImpl <em>TDuration Constant Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TDurationConstantExpressionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTDurationConstantExpression()
	 * @generated
	 */
	int TDURATION_CONSTANT_EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDURATION_CONSTANT_EXPRESSION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>TDuration Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDURATION_CONSTANT_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TDuration Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDURATION_CONSTANT_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TEntityContainerImpl <em>TEntity Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TEntityContainerImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTEntityContainer()
	 * @generated
	 */
	int TENTITY_CONTAINER = 18;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_CONTAINER__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Entity Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_CONTAINER__ENTITY_SET = 1;

	/**
	 * The feature id for the '<em><b>Action Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_CONTAINER__ACTION_IMPORT = 2;

	/**
	 * The feature id for the '<em><b>Function Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_CONTAINER__FUNCTION_IMPORT = 3;

	/**
	 * The feature id for the '<em><b>Singleton</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_CONTAINER__SINGLETON = 4;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_CONTAINER__ANNOTATION = 5;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_CONTAINER__EXTENDS = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_CONTAINER__NAME = 7;

	/**
	 * The number of structural features of the '<em>TEntity Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_CONTAINER_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>TEntity Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TEntityKeyElementImpl <em>TEntity Key Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TEntityKeyElementImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTEntityKeyElement()
	 * @generated
	 */
	int TENTITY_KEY_ELEMENT = 19;

	/**
	 * The feature id for the '<em><b>Property Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_KEY_ELEMENT__PROPERTY_REF = 0;

	/**
	 * The number of structural features of the '<em>TEntity Key Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_KEY_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TEntity Key Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_KEY_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TEntitySetImpl <em>TEntity Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TEntitySetImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTEntitySet()
	 * @generated
	 */
	int TENTITY_SET = 20;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_SET__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Navigation Property Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_SET__NAVIGATION_PROPERTY_BINDING = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_SET__ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_SET__ENTITY_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Include In Service Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_SET__INCLUDE_IN_SERVICE_DOCUMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_SET__NAME = 5;

	/**
	 * The number of structural features of the '<em>TEntity Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_SET_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>TEntity Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TEntityTypeImpl <em>TEntity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TEntityTypeImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTEntityType()
	 * @generated
	 */
	int TENTITY_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__KEY = 1;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Navigation Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__NAVIGATION_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__ANNOTATION = 4;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__ABSTRACT = 5;

	/**
	 * The feature id for the '<em><b>Base Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__BASE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Has Stream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__HAS_STREAM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__NAME = 8;

	/**
	 * The feature id for the '<em><b>Open Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE__OPEN_TYPE = 9;

	/**
	 * The number of structural features of the '<em>TEntity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>TEntity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENTITY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TEnumTypeImpl <em>TEnum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TEnumTypeImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTEnumType()
	 * @generated
	 */
	int TENUM_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_TYPE__MEMBER = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_TYPE__ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Is Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_TYPE__IS_FLAGS = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_TYPE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Underlying Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_TYPE__UNDERLYING_TYPE = 5;

	/**
	 * The number of structural features of the '<em>TEnum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>TEnum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TEnumTypeMemberImpl <em>TEnum Type Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TEnumTypeMemberImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTEnumTypeMember()
	 * @generated
	 */
	int TENUM_TYPE_MEMBER = 23;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_TYPE_MEMBER__ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_TYPE_MEMBER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_TYPE_MEMBER__VALUE = 2;

	/**
	 * The number of structural features of the '<em>TEnum Type Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_TYPE_MEMBER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TEnum Type Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TENUM_TYPE_MEMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TFloatConstantExpressionImpl <em>TFloat Constant Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TFloatConstantExpressionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTFloatConstantExpression()
	 * @generated
	 */
	int TFLOAT_CONSTANT_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOAT_CONSTANT_EXPRESSION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>TFloat Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOAT_CONSTANT_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TFloat Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFLOAT_CONSTANT_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TFunctionImpl <em>TFunction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TFunctionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTFunction()
	 * @generated
	 */
	int TFUNCTION = 25;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION__PARAMETER = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION__ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION__RETURN_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Group1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION__GROUP1 = 4;

	/**
	 * The feature id for the '<em><b>Annotation1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION__ANNOTATION1 = 5;

	/**
	 * The feature id for the '<em><b>Entity Set Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION__ENTITY_SET_PATH = 6;

	/**
	 * The feature id for the '<em><b>Is Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION__IS_BOUND = 7;

	/**
	 * The feature id for the '<em><b>Is Composable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION__IS_COMPOSABLE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION__NAME = 9;

	/**
	 * The number of structural features of the '<em>TFunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>TFunction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TFunctionImportImpl <em>TFunction Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TFunctionImportImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTFunctionImport()
	 * @generated
	 */
	int TFUNCTION_IMPORT = 26;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_IMPORT__ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Entity Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_IMPORT__ENTITY_SET = 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_IMPORT__FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Include In Service Document</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_IMPORT__INCLUDE_IN_SERVICE_DOCUMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_IMPORT__NAME = 4;

	/**
	 * The number of structural features of the '<em>TFunction Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_IMPORT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>TFunction Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFUNCTION_IMPORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TGuidConstantExpressionImpl <em>TGuid Constant Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TGuidConstantExpressionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTGuidConstantExpression()
	 * @generated
	 */
	int TGUID_CONSTANT_EXPRESSION = 27;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGUID_CONSTANT_EXPRESSION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>TGuid Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGUID_CONSTANT_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TGuid Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGUID_CONSTANT_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl <em>TIf Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TIfExpressionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTIfExpression()
	 * @generated
	 */
	int TIF_EXPRESSION = 28;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>GExpression</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__GEXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Binary</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__BINARY = 2;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__BOOL = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__DATE = 4;

	/**
	 * The feature id for the '<em><b>Date Time Offset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__DATE_TIME_OFFSET = 5;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__DECIMAL = 6;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__DURATION = 7;

	/**
	 * The feature id for the '<em><b>Enum Member</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__ENUM_MEMBER = 8;

	/**
	 * The feature id for the '<em><b>Float</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__FLOAT = 9;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__GUID = 10;

	/**
	 * The feature id for the '<em><b>Int</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__INT = 11;

	/**
	 * The feature id for the '<em><b>String</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__STRING = 12;

	/**
	 * The feature id for the '<em><b>Time Of Day</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__TIME_OF_DAY = 13;

	/**
	 * The feature id for the '<em><b>Annotation Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__ANNOTATION_PATH = 14;

	/**
	 * The feature id for the '<em><b>Apply</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__APPLY = 15;

	/**
	 * The feature id for the '<em><b>Cast</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__CAST = 16;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__COLLECTION = 17;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__IF = 18;

	/**
	 * The feature id for the '<em><b>Eq</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__EQ = 19;

	/**
	 * The feature id for the '<em><b>Ne</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__NE = 20;

	/**
	 * The feature id for the '<em><b>Ge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__GE = 21;

	/**
	 * The feature id for the '<em><b>Gt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__GT = 22;

	/**
	 * The feature id for the '<em><b>Le</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__LE = 23;

	/**
	 * The feature id for the '<em><b>Lt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__LT = 24;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__AND = 25;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__OR = 26;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__NOT = 27;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__HAS = 28;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__IN = 29;

	/**
	 * The feature id for the '<em><b>Add</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__ADD = 30;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__SUB = 31;

	/**
	 * The feature id for the '<em><b>Neg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__NEG = 32;

	/**
	 * The feature id for the '<em><b>Mul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__MUL = 33;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__DIV = 34;

	/**
	 * The feature id for the '<em><b>Div By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__DIV_BY = 35;

	/**
	 * The feature id for the '<em><b>Mod</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__MOD = 36;

	/**
	 * The feature id for the '<em><b>Is Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__IS_OF = 37;

	/**
	 * The feature id for the '<em><b>Labeled Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__LABELED_ELEMENT = 38;

	/**
	 * The feature id for the '<em><b>Labeled Element Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__LABELED_ELEMENT_REFERENCE = 39;

	/**
	 * The feature id for the '<em><b>Null</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__NULL = 40;

	/**
	 * The feature id for the '<em><b>Model Element Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__MODEL_ELEMENT_PATH = 41;

	/**
	 * The feature id for the '<em><b>Navigation Property Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__NAVIGATION_PROPERTY_PATH = 42;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__PATH = 43;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__PROPERTY_PATH = 44;

	/**
	 * The feature id for the '<em><b>Record</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__RECORD = 45;

	/**
	 * The feature id for the '<em><b>Url Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__URL_REF = 46;

	/**
	 * The feature id for the '<em><b>Annotation1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION__ANNOTATION1 = 47;

	/**
	 * The number of structural features of the '<em>TIf Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION_FEATURE_COUNT = 48;

	/**
	 * The number of operations of the '<em>TIf Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIF_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TIntConstantExpressionImpl <em>TInt Constant Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TIntConstantExpressionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTIntConstantExpression()
	 * @generated
	 */
	int TINT_CONSTANT_EXPRESSION = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINT_CONSTANT_EXPRESSION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>TInt Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINT_CONSTANT_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TInt Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINT_CONSTANT_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TLabeledElementExpressionImpl <em>TLabeled Element Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TLabeledElementExpressionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTLabeledElementExpression()
	 * @generated
	 */
	int TLABELED_ELEMENT_EXPRESSION = 30;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Binary</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__BINARY = 2;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__BOOL = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__DATE = 4;

	/**
	 * The feature id for the '<em><b>Date Time Offset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__DATE_TIME_OFFSET = 5;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__DECIMAL = 6;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__DURATION = 7;

	/**
	 * The feature id for the '<em><b>Enum Member</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__ENUM_MEMBER = 8;

	/**
	 * The feature id for the '<em><b>Float</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__FLOAT = 9;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__GUID = 10;

	/**
	 * The feature id for the '<em><b>Int</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__INT = 11;

	/**
	 * The feature id for the '<em><b>String</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__STRING = 12;

	/**
	 * The feature id for the '<em><b>Time Of Day</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__TIME_OF_DAY = 13;

	/**
	 * The feature id for the '<em><b>Annotation Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__ANNOTATION_PATH = 14;

	/**
	 * The feature id for the '<em><b>Apply</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__APPLY = 15;

	/**
	 * The feature id for the '<em><b>Cast</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__CAST = 16;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__COLLECTION = 17;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__IF = 18;

	/**
	 * The feature id for the '<em><b>Eq</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__EQ = 19;

	/**
	 * The feature id for the '<em><b>Ne</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__NE = 20;

	/**
	 * The feature id for the '<em><b>Ge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__GE = 21;

	/**
	 * The feature id for the '<em><b>Gt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__GT = 22;

	/**
	 * The feature id for the '<em><b>Le</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__LE = 23;

	/**
	 * The feature id for the '<em><b>Lt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__LT = 24;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__AND = 25;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__OR = 26;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__NOT = 27;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__HAS = 28;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__IN = 29;

	/**
	 * The feature id for the '<em><b>Add</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__ADD = 30;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__SUB = 31;

	/**
	 * The feature id for the '<em><b>Neg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__NEG = 32;

	/**
	 * The feature id for the '<em><b>Mul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__MUL = 33;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__DIV = 34;

	/**
	 * The feature id for the '<em><b>Div By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__DIV_BY = 35;

	/**
	 * The feature id for the '<em><b>Mod</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__MOD = 36;

	/**
	 * The feature id for the '<em><b>Is Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__IS_OF = 37;

	/**
	 * The feature id for the '<em><b>Labeled Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__LABELED_ELEMENT = 38;

	/**
	 * The feature id for the '<em><b>Labeled Element Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__LABELED_ELEMENT_REFERENCE = 39;

	/**
	 * The feature id for the '<em><b>Null</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__NULL = 40;

	/**
	 * The feature id for the '<em><b>Model Element Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__MODEL_ELEMENT_PATH = 41;

	/**
	 * The feature id for the '<em><b>Navigation Property Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__NAVIGATION_PROPERTY_PATH = 42;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__PATH = 43;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__PROPERTY_PATH = 44;

	/**
	 * The feature id for the '<em><b>Record</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__RECORD = 45;

	/**
	 * The feature id for the '<em><b>Url Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__URL_REF = 46;

	/**
	 * The feature id for the '<em><b>Annotation Path1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__ANNOTATION_PATH1 = 47;

	/**
	 * The feature id for the '<em><b>Binary1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__BINARY1 = 48;

	/**
	 * The feature id for the '<em><b>Bool1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__BOOL1 = 49;

	/**
	 * The feature id for the '<em><b>Date1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__DATE1 = 50;

	/**
	 * The feature id for the '<em><b>Date Time Offset1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__DATE_TIME_OFFSET1 = 51;

	/**
	 * The feature id for the '<em><b>Decimal1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__DECIMAL1 = 52;

	/**
	 * The feature id for the '<em><b>Duration1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__DURATION1 = 53;

	/**
	 * The feature id for the '<em><b>Enum Member1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__ENUM_MEMBER1 = 54;

	/**
	 * The feature id for the '<em><b>Float1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__FLOAT1 = 55;

	/**
	 * The feature id for the '<em><b>Guid1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__GUID1 = 56;

	/**
	 * The feature id for the '<em><b>Int1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__INT1 = 57;

	/**
	 * The feature id for the '<em><b>Model Element Path1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__MODEL_ELEMENT_PATH1 = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__NAME = 59;

	/**
	 * The feature id for the '<em><b>Navigation Property Path1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__NAVIGATION_PROPERTY_PATH1 = 60;

	/**
	 * The feature id for the '<em><b>Path1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__PATH1 = 61;

	/**
	 * The feature id for the '<em><b>Property Path1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__PROPERTY_PATH1 = 62;

	/**
	 * The feature id for the '<em><b>String1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__STRING1 = 63;

	/**
	 * The feature id for the '<em><b>Time Of Day1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__TIME_OF_DAY1 = 64;

	/**
	 * The feature id for the '<em><b>Url Ref1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION__URL_REF1 = 65;

	/**
	 * The number of structural features of the '<em>TLabeled Element Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION_FEATURE_COUNT = 66;

	/**
	 * The number of operations of the '<em>TLabeled Element Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TLabeledElementReferenceExpressionImpl <em>TLabeled Element Reference Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TLabeledElementReferenceExpressionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTLabeledElementReferenceExpression()
	 * @generated
	 */
	int TLABELED_ELEMENT_REFERENCE_EXPRESSION = 31;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_REFERENCE_EXPRESSION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>TLabeled Element Reference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_REFERENCE_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TLabeled Element Reference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLABELED_ELEMENT_REFERENCE_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TNavigationPropertyImpl <em>TNavigation Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TNavigationPropertyImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTNavigationProperty()
	 * @generated
	 */
	int TNAVIGATION_PROPERTY = 32;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAVIGATION_PROPERTY__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Referential Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAVIGATION_PROPERTY__REFERENTIAL_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>On Delete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAVIGATION_PROPERTY__ON_DELETE = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAVIGATION_PROPERTY__ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Contains Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAVIGATION_PROPERTY__CONTAINS_TARGET = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAVIGATION_PROPERTY__NAME = 5;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAVIGATION_PROPERTY__NULLABLE = 6;

	/**
	 * The feature id for the '<em><b>Partner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAVIGATION_PROPERTY__PARTNER = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAVIGATION_PROPERTY__TYPE = 8;

	/**
	 * The number of structural features of the '<em>TNavigation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAVIGATION_PROPERTY_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>TNavigation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAVIGATION_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TNavigationPropertyBindingImpl <em>TNavigation Property Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TNavigationPropertyBindingImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTNavigationPropertyBinding()
	 * @generated
	 */
	int TNAVIGATION_PROPERTY_BINDING = 33;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAVIGATION_PROPERTY_BINDING__PATH = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAVIGATION_PROPERTY_BINDING__TARGET = 1;

	/**
	 * The number of structural features of the '<em>TNavigation Property Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAVIGATION_PROPERTY_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TNavigation Property Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNAVIGATION_PROPERTY_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TNullExpressionImpl <em>TNull Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TNullExpressionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTNullExpression()
	 * @generated
	 */
	int TNULL_EXPRESSION = 34;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNULL_EXPRESSION__ANNOTATION = 0;

	/**
	 * The number of structural features of the '<em>TNull Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNULL_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TNull Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TNULL_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TOnDeleteImpl <em>TOn Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TOnDeleteImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTOnDelete()
	 * @generated
	 */
	int TON_DELETE = 35;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TON_DELETE__ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TON_DELETE__ACTION = 1;

	/**
	 * The number of structural features of the '<em>TOn Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TON_DELETE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TOn Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TON_DELETE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl <em>TOne Child Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TOneChildExpressionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTOneChildExpression()
	 * @generated
	 */
	int TONE_CHILD_EXPRESSION = 36;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__BINARY = 1;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__BOOL = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__DATE = 3;

	/**
	 * The feature id for the '<em><b>Date Time Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__DATE_TIME_OFFSET = 4;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__DECIMAL = 5;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__DURATION = 6;

	/**
	 * The feature id for the '<em><b>Enum Member</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__ENUM_MEMBER = 7;

	/**
	 * The feature id for the '<em><b>Float</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__FLOAT = 8;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__GUID = 9;

	/**
	 * The feature id for the '<em><b>Int</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__INT = 10;

	/**
	 * The feature id for the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__STRING = 11;

	/**
	 * The feature id for the '<em><b>Time Of Day</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__TIME_OF_DAY = 12;

	/**
	 * The feature id for the '<em><b>Annotation Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__ANNOTATION_PATH = 13;

	/**
	 * The feature id for the '<em><b>Apply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__APPLY = 14;

	/**
	 * The feature id for the '<em><b>Cast</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__CAST = 15;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__COLLECTION = 16;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__IF = 17;

	/**
	 * The feature id for the '<em><b>Eq</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__EQ = 18;

	/**
	 * The feature id for the '<em><b>Ne</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__NE = 19;

	/**
	 * The feature id for the '<em><b>Ge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__GE = 20;

	/**
	 * The feature id for the '<em><b>Gt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__GT = 21;

	/**
	 * The feature id for the '<em><b>Le</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__LE = 22;

	/**
	 * The feature id for the '<em><b>Lt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__LT = 23;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__AND = 24;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__OR = 25;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__NOT = 26;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__HAS = 27;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__IN = 28;

	/**
	 * The feature id for the '<em><b>Add</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__ADD = 29;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__SUB = 30;

	/**
	 * The feature id for the '<em><b>Neg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__NEG = 31;

	/**
	 * The feature id for the '<em><b>Mul</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__MUL = 32;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__DIV = 33;

	/**
	 * The feature id for the '<em><b>Div By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__DIV_BY = 34;

	/**
	 * The feature id for the '<em><b>Mod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__MOD = 35;

	/**
	 * The feature id for the '<em><b>Is Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__IS_OF = 36;

	/**
	 * The feature id for the '<em><b>Labeled Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__LABELED_ELEMENT = 37;

	/**
	 * The feature id for the '<em><b>Labeled Element Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__LABELED_ELEMENT_REFERENCE = 38;

	/**
	 * The feature id for the '<em><b>Null</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__NULL = 39;

	/**
	 * The feature id for the '<em><b>Model Element Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__MODEL_ELEMENT_PATH = 40;

	/**
	 * The feature id for the '<em><b>Navigation Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__NAVIGATION_PROPERTY_PATH = 41;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__PATH = 42;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__PROPERTY_PATH = 43;

	/**
	 * The feature id for the '<em><b>Record</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__RECORD = 44;

	/**
	 * The feature id for the '<em><b>Url Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__URL_REF = 45;

	/**
	 * The feature id for the '<em><b>Annotation1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION__ANNOTATION1 = 46;

	/**
	 * The number of structural features of the '<em>TOne Child Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION_FEATURE_COUNT = 47;

	/**
	 * The number of operations of the '<em>TOne Child Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TONE_CHILD_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyImpl <em>TProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TPropertyImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTProperty()
	 * @generated
	 */
	int TPROPERTY = 37;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__DEFAULT_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__MAX_LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__NAME = 3;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__NULLABLE = 4;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__PRECISION = 5;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__SCALE = 6;

	/**
	 * The feature id for the '<em><b>SRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__SRID = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__TYPE = 8;

	/**
	 * The feature id for the '<em><b>Unicode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY__UNICODE = 9;

	/**
	 * The number of structural features of the '<em>TProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>TProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyRefImpl <em>TProperty Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TPropertyRefImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTPropertyRef()
	 * @generated
	 */
	int TPROPERTY_REF = 38;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_REF__ALIAS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_REF__NAME = 1;

	/**
	 * The number of structural features of the '<em>TProperty Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_REF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TProperty Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl <em>TProperty Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TPropertyValueImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTPropertyValue()
	 * @generated
	 */
	int TPROPERTY_VALUE = 39;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__ANNOTATION = 1;

	/**
	 * The feature id for the '<em><b>Binary</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__BINARY = 2;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__BOOL = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__DATE = 4;

	/**
	 * The feature id for the '<em><b>Date Time Offset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__DATE_TIME_OFFSET = 5;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__DECIMAL = 6;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__DURATION = 7;

	/**
	 * The feature id for the '<em><b>Enum Member</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__ENUM_MEMBER = 8;

	/**
	 * The feature id for the '<em><b>Float</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__FLOAT = 9;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__GUID = 10;

	/**
	 * The feature id for the '<em><b>Int</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__INT = 11;

	/**
	 * The feature id for the '<em><b>String</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__STRING = 12;

	/**
	 * The feature id for the '<em><b>Time Of Day</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__TIME_OF_DAY = 13;

	/**
	 * The feature id for the '<em><b>Annotation Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__ANNOTATION_PATH = 14;

	/**
	 * The feature id for the '<em><b>Apply</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__APPLY = 15;

	/**
	 * The feature id for the '<em><b>Cast</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__CAST = 16;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__COLLECTION = 17;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__IF = 18;

	/**
	 * The feature id for the '<em><b>Eq</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__EQ = 19;

	/**
	 * The feature id for the '<em><b>Ne</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__NE = 20;

	/**
	 * The feature id for the '<em><b>Ge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__GE = 21;

	/**
	 * The feature id for the '<em><b>Gt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__GT = 22;

	/**
	 * The feature id for the '<em><b>Le</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__LE = 23;

	/**
	 * The feature id for the '<em><b>Lt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__LT = 24;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__AND = 25;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__OR = 26;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__NOT = 27;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__HAS = 28;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__IN = 29;

	/**
	 * The feature id for the '<em><b>Add</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__ADD = 30;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__SUB = 31;

	/**
	 * The feature id for the '<em><b>Neg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__NEG = 32;

	/**
	 * The feature id for the '<em><b>Mul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__MUL = 33;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__DIV = 34;

	/**
	 * The feature id for the '<em><b>Div By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__DIV_BY = 35;

	/**
	 * The feature id for the '<em><b>Mod</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__MOD = 36;

	/**
	 * The feature id for the '<em><b>Is Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__IS_OF = 37;

	/**
	 * The feature id for the '<em><b>Labeled Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__LABELED_ELEMENT = 38;

	/**
	 * The feature id for the '<em><b>Labeled Element Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__LABELED_ELEMENT_REFERENCE = 39;

	/**
	 * The feature id for the '<em><b>Null</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__NULL = 40;

	/**
	 * The feature id for the '<em><b>Model Element Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__MODEL_ELEMENT_PATH = 41;

	/**
	 * The feature id for the '<em><b>Navigation Property Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__NAVIGATION_PROPERTY_PATH = 42;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__PATH = 43;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__PROPERTY_PATH = 44;

	/**
	 * The feature id for the '<em><b>Record</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__RECORD = 45;

	/**
	 * The feature id for the '<em><b>Url Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__URL_REF = 46;

	/**
	 * The feature id for the '<em><b>Annotation Path1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__ANNOTATION_PATH1 = 47;

	/**
	 * The feature id for the '<em><b>Binary1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__BINARY1 = 48;

	/**
	 * The feature id for the '<em><b>Bool1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__BOOL1 = 49;

	/**
	 * The feature id for the '<em><b>Date1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__DATE1 = 50;

	/**
	 * The feature id for the '<em><b>Date Time Offset1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__DATE_TIME_OFFSET1 = 51;

	/**
	 * The feature id for the '<em><b>Decimal1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__DECIMAL1 = 52;

	/**
	 * The feature id for the '<em><b>Duration1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__DURATION1 = 53;

	/**
	 * The feature id for the '<em><b>Enum Member1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__ENUM_MEMBER1 = 54;

	/**
	 * The feature id for the '<em><b>Float1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__FLOAT1 = 55;

	/**
	 * The feature id for the '<em><b>Guid1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__GUID1 = 56;

	/**
	 * The feature id for the '<em><b>Int1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__INT1 = 57;

	/**
	 * The feature id for the '<em><b>Model Element Path1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__MODEL_ELEMENT_PATH1 = 58;

	/**
	 * The feature id for the '<em><b>Navigation Property Path1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__NAVIGATION_PROPERTY_PATH1 = 59;

	/**
	 * The feature id for the '<em><b>Path1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__PATH1 = 60;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__PROPERTY = 61;

	/**
	 * The feature id for the '<em><b>Property Path1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__PROPERTY_PATH1 = 62;

	/**
	 * The feature id for the '<em><b>String1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__STRING1 = 63;

	/**
	 * The feature id for the '<em><b>Time Of Day1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__TIME_OF_DAY1 = 64;

	/**
	 * The feature id for the '<em><b>Url Ref1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE__URL_REF1 = 65;

	/**
	 * The number of structural features of the '<em>TProperty Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE_FEATURE_COUNT = 66;

	/**
	 * The number of operations of the '<em>TProperty Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TPROPERTY_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TRecordExpressionImpl <em>TRecord Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TRecordExpressionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTRecordExpression()
	 * @generated
	 */
	int TRECORD_EXPRESSION = 40;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECORD_EXPRESSION__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECORD_EXPRESSION__PROPERTY_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECORD_EXPRESSION__ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECORD_EXPRESSION__TYPE = 3;

	/**
	 * The number of structural features of the '<em>TRecord Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECORD_EXPRESSION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>TRecord Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRECORD_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TReferentialConstraintImpl <em>TReferential Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TReferentialConstraintImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTReferentialConstraint()
	 * @generated
	 */
	int TREFERENTIAL_CONSTRAINT = 41;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREFERENTIAL_CONSTRAINT__ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREFERENTIAL_CONSTRAINT__PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Referenced Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREFERENTIAL_CONSTRAINT__REFERENCED_PROPERTY = 2;

	/**
	 * The number of structural features of the '<em>TReferential Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREFERENTIAL_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TReferential Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREFERENTIAL_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TSingletonImpl <em>TSingleton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TSingletonImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTSingleton()
	 * @generated
	 */
	int TSINGLETON = 42;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSINGLETON__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Navigation Property Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSINGLETON__NAVIGATION_PROPERTY_BINDING = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSINGLETON__ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSINGLETON__NAME = 3;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSINGLETON__NULLABLE = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSINGLETON__TYPE = 5;

	/**
	 * The number of structural features of the '<em>TSingleton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSINGLETON_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>TSingleton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSINGLETON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TStringConstantExpressionImpl <em>TString Constant Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TStringConstantExpressionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTStringConstantExpression()
	 * @generated
	 */
	int TSTRING_CONSTANT_EXPRESSION = 43;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTRING_CONSTANT_EXPRESSION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>TString Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTRING_CONSTANT_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TString Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TSTRING_CONSTANT_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TTermImpl <em>TTerm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TTermImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTTerm()
	 * @generated
	 */
	int TTERM = 44;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERM__ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERM__APPLIES_TO = 1;

	/**
	 * The feature id for the '<em><b>Base Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERM__BASE_TERM = 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERM__DEFAULT_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERM__MAX_LENGTH = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERM__NAME = 5;

	/**
	 * The feature id for the '<em><b>Nullable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERM__NULLABLE = 6;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERM__PRECISION = 7;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERM__SCALE = 8;

	/**
	 * The feature id for the '<em><b>SRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERM__SRID = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERM__TYPE = 10;

	/**
	 * The feature id for the '<em><b>Unicode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERM__UNICODE = 11;

	/**
	 * The number of structural features of the '<em>TTerm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERM_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>TTerm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TTimeOfDayConstantExpressionImpl <em>TTime Of Day Constant Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TTimeOfDayConstantExpressionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTTimeOfDayConstantExpression()
	 * @generated
	 */
	int TTIME_OF_DAY_CONSTANT_EXPRESSION = 45;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIME_OF_DAY_CONSTANT_EXPRESSION__VALUE = 0;

	/**
	 * The number of structural features of the '<em>TTime Of Day Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIME_OF_DAY_CONSTANT_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TTime Of Day Constant Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTIME_OF_DAY_CONSTANT_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl <em>TTwo Children Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TTwoChildrenExpressionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTTwoChildrenExpression()
	 * @generated
	 */
	int TTWO_CHILDREN_EXPRESSION = 46;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>GExpression</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__GEXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Binary</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__BINARY = 2;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__BOOL = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__DATE = 4;

	/**
	 * The feature id for the '<em><b>Date Time Offset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__DATE_TIME_OFFSET = 5;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__DECIMAL = 6;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__DURATION = 7;

	/**
	 * The feature id for the '<em><b>Enum Member</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__ENUM_MEMBER = 8;

	/**
	 * The feature id for the '<em><b>Float</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__FLOAT = 9;

	/**
	 * The feature id for the '<em><b>Guid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__GUID = 10;

	/**
	 * The feature id for the '<em><b>Int</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__INT = 11;

	/**
	 * The feature id for the '<em><b>String</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__STRING = 12;

	/**
	 * The feature id for the '<em><b>Time Of Day</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__TIME_OF_DAY = 13;

	/**
	 * The feature id for the '<em><b>Annotation Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__ANNOTATION_PATH = 14;

	/**
	 * The feature id for the '<em><b>Apply</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__APPLY = 15;

	/**
	 * The feature id for the '<em><b>Cast</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__CAST = 16;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__COLLECTION = 17;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__IF = 18;

	/**
	 * The feature id for the '<em><b>Eq</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__EQ = 19;

	/**
	 * The feature id for the '<em><b>Ne</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__NE = 20;

	/**
	 * The feature id for the '<em><b>Ge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__GE = 21;

	/**
	 * The feature id for the '<em><b>Gt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__GT = 22;

	/**
	 * The feature id for the '<em><b>Le</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__LE = 23;

	/**
	 * The feature id for the '<em><b>Lt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__LT = 24;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__AND = 25;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__OR = 26;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__NOT = 27;

	/**
	 * The feature id for the '<em><b>Has</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__HAS = 28;

	/**
	 * The feature id for the '<em><b>In</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__IN = 29;

	/**
	 * The feature id for the '<em><b>Add</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__ADD = 30;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__SUB = 31;

	/**
	 * The feature id for the '<em><b>Neg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__NEG = 32;

	/**
	 * The feature id for the '<em><b>Mul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__MUL = 33;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__DIV = 34;

	/**
	 * The feature id for the '<em><b>Div By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__DIV_BY = 35;

	/**
	 * The feature id for the '<em><b>Mod</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__MOD = 36;

	/**
	 * The feature id for the '<em><b>Is Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__IS_OF = 37;

	/**
	 * The feature id for the '<em><b>Labeled Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__LABELED_ELEMENT = 38;

	/**
	 * The feature id for the '<em><b>Labeled Element Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__LABELED_ELEMENT_REFERENCE = 39;

	/**
	 * The feature id for the '<em><b>Null</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__NULL = 40;

	/**
	 * The feature id for the '<em><b>Model Element Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__MODEL_ELEMENT_PATH = 41;

	/**
	 * The feature id for the '<em><b>Navigation Property Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__NAVIGATION_PROPERTY_PATH = 42;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__PATH = 43;

	/**
	 * The feature id for the '<em><b>Property Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__PROPERTY_PATH = 44;

	/**
	 * The feature id for the '<em><b>Record</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__RECORD = 45;

	/**
	 * The feature id for the '<em><b>Url Ref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__URL_REF = 46;

	/**
	 * The feature id for the '<em><b>Annotation1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION__ANNOTATION1 = 47;

	/**
	 * The number of structural features of the '<em>TTwo Children Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION_FEATURE_COUNT = 48;

	/**
	 * The number of operations of the '<em>TTwo Children Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTWO_CHILDREN_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.impl.TTypeDefinitionImpl <em>TType Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.TTypeDefinitionImpl
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTTypeDefinition()
	 * @generated
	 */
	int TTYPE_DEFINITION = 47;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_DEFINITION__ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_DEFINITION__MAX_LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_DEFINITION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_DEFINITION__PRECISION = 3;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_DEFINITION__SCALE = 4;

	/**
	 * The feature id for the '<em><b>SRID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_DEFINITION__SRID = 5;

	/**
	 * The feature id for the '<em><b>Underlying Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_DEFINITION__UNDERLYING_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Unicode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_DEFINITION__UNICODE = 7;

	/**
	 * The number of structural features of the '<em>TType Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_DEFINITION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>TType Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTYPE_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.TAbstractType <em>TAbstract Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.TAbstractType
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTAbstractType()
	 * @generated
	 */
	int TABSTRACT_TYPE = 48;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.TAppliesToElementsItem <em>TApplies To Elements Item</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.TAppliesToElementsItem
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTAppliesToElementsItem()
	 * @generated
	 */
	int TAPPLIES_TO_ELEMENTS_ITEM = 49;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.TClientFunctionMember1 <em>TClient Function Member1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.TClientFunctionMember1
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTClientFunctionMember1()
	 * @generated
	 */
	int TCLIENT_FUNCTION_MEMBER1 = 50;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.TFloating <em>TFloating</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.TFloating
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTFloating()
	 * @generated
	 */
	int TFLOATING = 51;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.TMax <em>TMax</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.TMax
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTMax()
	 * @generated
	 */
	int TMAX = 52;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.TOnDeleteAction <em>TOn Delete Action</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.TOnDeleteAction
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTOnDeleteAction()
	 * @generated
	 */
	int TON_DELETE_ACTION = 53;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.TPrimitiveTypeMember0 <em>TPrimitive Type Member0</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.TPrimitiveTypeMember0
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTPrimitiveTypeMember0()
	 * @generated
	 */
	int TPRIMITIVE_TYPE_MEMBER0 = 54;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edm.TVariable <em>TVariable</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.TVariable
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTVariable()
	 * @generated
	 */
	int TVARIABLE = 55;

	/**
	 * The meta object id for the '<em>Binary</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getBinary()
	 * @generated
	 */
	int BINARY = 56;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 57;

	/**
	 * The meta object id for the '<em>Boolean Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getBooleanObject()
	 * @generated
	 */
	int BOOLEAN_OBJECT = 58;

	/**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 59;

	/**
	 * The meta object id for the '<em>Date Time Stamp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getDateTimeStamp()
	 * @generated
	 */
	int DATE_TIME_STAMP = 60;

	/**
	 * The meta object id for the '<em>Day Time Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.Duration
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getDayTimeDuration()
	 * @generated
	 */
	int DAY_TIME_DURATION = 61;

	/**
	 * The meta object id for the '<em>TAbstract Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.TAbstractType
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTAbstractTypeObject()
	 * @generated
	 */
	int TABSTRACT_TYPE_OBJECT = 62;

	/**
	 * The meta object id for the '<em>TApplies To</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTAppliesTo()
	 * @generated
	 */
	int TAPPLIES_TO = 63;

	/**
	 * The meta object id for the '<em>TApplies To Elements</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTAppliesToElements()
	 * @generated
	 */
	int TAPPLIES_TO_ELEMENTS = 64;

	/**
	 * The meta object id for the '<em>TApplies To Elements Item Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.TAppliesToElementsItem
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTAppliesToElementsItemObject()
	 * @generated
	 */
	int TAPPLIES_TO_ELEMENTS_ITEM_OBJECT = 65;

	/**
	 * The meta object id for the '<em>TClient Function</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTClientFunction()
	 * @generated
	 */
	int TCLIENT_FUNCTION = 66;

	/**
	 * The meta object id for the '<em>TClient Function Member1 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.TClientFunctionMember1
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTClientFunctionMember1Object()
	 * @generated
	 */
	int TCLIENT_FUNCTION_MEMBER1_OBJECT = 67;

	/**
	 * The meta object id for the '<em>TDecimal Literal</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTDecimalLiteral()
	 * @generated
	 */
	int TDECIMAL_LITERAL = 68;

	/**
	 * The meta object id for the '<em>TEnum Member List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTEnumMemberList()
	 * @generated
	 */
	int TENUM_MEMBER_LIST = 69;

	/**
	 * The meta object id for the '<em>TFloating Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.TFloating
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTFloatingObject()
	 * @generated
	 */
	int TFLOATING_OBJECT = 70;

	/**
	 * The meta object id for the '<em>TGuid Literal</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTGuidLiteral()
	 * @generated
	 */
	int TGUID_LITERAL = 71;

	/**
	 * The meta object id for the '<em>Time</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 72;

	/**
	 * The meta object id for the '<em>TInstance Path</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTInstancePath()
	 * @generated
	 */
	int TINSTANCE_PATH = 73;

	/**
	 * The meta object id for the '<em>TMax Length Facet</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTMaxLengthFacet()
	 * @generated
	 */
	int TMAX_LENGTH_FACET = 74;

	/**
	 * The meta object id for the '<em>TMax Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.TMax
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTMaxObject()
	 * @generated
	 */
	int TMAX_OBJECT = 75;

	/**
	 * The meta object id for the '<em>TModel Path</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTModelPath()
	 * @generated
	 */
	int TMODEL_PATH = 76;

	/**
	 * The meta object id for the '<em>TNamespace Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTNamespaceName()
	 * @generated
	 */
	int TNAMESPACE_NAME = 77;

	/**
	 * The meta object id for the '<em>TOn Delete Action Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.TOnDeleteAction
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTOnDeleteActionObject()
	 * @generated
	 */
	int TON_DELETE_ACTION_OBJECT = 78;

	/**
	 * The meta object id for the '<em>TPath</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTPath()
	 * @generated
	 */
	int TPATH = 79;

	/**
	 * The meta object id for the '<em>TPrecision Facet</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTPrecisionFacet()
	 * @generated
	 */
	int TPRECISION_FACET = 80;

	/**
	 * The meta object id for the '<em>TPrimitive Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTPrimitiveType()
	 * @generated
	 */
	int TPRIMITIVE_TYPE = 81;

	/**
	 * The meta object id for the '<em>TPrimitive Type Member0 Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.TPrimitiveTypeMember0
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTPrimitiveTypeMember0Object()
	 * @generated
	 */
	int TPRIMITIVE_TYPE_MEMBER0_OBJECT = 82;

	/**
	 * The meta object id for the '<em>TPrimitive Type Member1</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTPrimitiveTypeMember1()
	 * @generated
	 */
	int TPRIMITIVE_TYPE_MEMBER1 = 83;

	/**
	 * The meta object id for the '<em>TQualified Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTQualifiedName()
	 * @generated
	 */
	int TQUALIFIED_NAME = 84;

	/**
	 * The meta object id for the '<em>TScale Facet</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTScaleFacet()
	 * @generated
	 */
	int TSCALE_FACET = 85;

	/**
	 * The meta object id for the '<em>TSimple Identifier</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTSimpleIdentifier()
	 * @generated
	 */
	int TSIMPLE_IDENTIFIER = 86;

	/**
	 * The meta object id for the '<em>TSrid Facet</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTSridFacet()
	 * @generated
	 */
	int TSRID_FACET = 87;

	/**
	 * The meta object id for the '<em>TTarget</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTTarget()
	 * @generated
	 */
	int TTARGET = 88;

	/**
	 * The meta object id for the '<em>TType Name</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTTypeName()
	 * @generated
	 */
	int TTYPE_NAME = 89;

	/**
	 * The meta object id for the '<em>TType Name Member3</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTTypeNameMember3()
	 * @generated
	 */
	int TTYPE_NAME_MEMBER3 = 90;

	/**
	 * The meta object id for the '<em>TUnicode Facet</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTUnicodeFacet()
	 * @generated
	 */
	int TUNICODE_FACET = 91;

	/**
	 * The meta object id for the '<em>TUnicode Facet Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTUnicodeFacetObject()
	 * @generated
	 */
	int TUNICODE_FACET_OBJECT = 92;

	/**
	 * The meta object id for the '<em>TVariable Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edm.TVariable
	 * @see org.open.oasis.docs.odata.ns.edm.impl.EdmPackageImpl#getTVariableObject()
	 * @generated
	 */
	int TVARIABLE_OBJECT = 93;


	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType <em>Annotation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType
	 * @generated
	 */
	EClass getAnnotationType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getGroup()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getAnnotation()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getBinary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binary</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getBinary()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Binary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getBool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bool</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getBool()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Bool();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getDate()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDateTimeOffset <em>Date Time Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Time Offset</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getDateTimeOffset()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_DateTimeOffset();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decimal</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getDecimal()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Decimal();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Duration</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getDuration()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Duration();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getEnumMember <em>Enum Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enum Member</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getEnumMember()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_EnumMember();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Float</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getFloat()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Float();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guid</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getGuid()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Guid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getInt <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Int</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getInt()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Int();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getString()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_String();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getTimeOfDay <em>Time Of Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Of Day</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getTimeOfDay()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_TimeOfDay();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getAnnotationPath <em>Annotation Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Annotation Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getAnnotationPath()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_AnnotationPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getApply <em>Apply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apply</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getApply()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Apply();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getCast <em>Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cast</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getCast()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Cast();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collection</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getCollection()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Collection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getIf()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_If();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getEq <em>Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eq</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getEq()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Eq();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getNe <em>Ne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ne</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getNe()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Ne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getGe <em>Ge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ge</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getGe()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Ge();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getGt <em>Gt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gt</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getGt()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Gt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getLe <em>Le</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Le</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getLe()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Le();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getLt <em>Lt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lt</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getLt()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Lt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>And</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getAnd()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_And();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Or</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getOr()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Or();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Not</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getNot()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Not();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getHas()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Has();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getIn()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_In();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getAdd <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getAdd()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Add();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getSub()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getNeg <em>Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Neg</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getNeg()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Neg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getMul <em>Mul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mul</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getMul()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Mul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getDiv()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDivBy <em>Div By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div By</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getDivBy()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_DivBy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getMod <em>Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mod</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getMod()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Mod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getIsOf <em>Is Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Of</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getIsOf()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_IsOf();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getLabeledElement <em>Labeled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labeled Element</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getLabeledElement()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_LabeledElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getLabeledElementReference <em>Labeled Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labeled Element Reference</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getLabeledElementReference()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_LabeledElementReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getNull <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getNull()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Null();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getModelElementPath <em>Model Element Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Model Element Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getModelElementPath()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_ModelElementPath();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getNavigationPropertyPath <em>Navigation Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Navigation Property Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getNavigationPropertyPath()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_NavigationPropertyPath();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getPath()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Path();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getPropertyPath <em>Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Property Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getPropertyPath()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_PropertyPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getRecord()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_Record();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getUrlRef <em>Url Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Url Ref</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getUrlRef()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EReference getAnnotationType_UrlRef();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getAnnotationPath1 <em>Annotation Path1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation Path1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getAnnotationPath1()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_AnnotationPath1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getBinary1 <em>Binary1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binary1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getBinary1()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Binary1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#isBool1 <em>Bool1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bool1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#isBool1()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Bool1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDate1 <em>Date1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getDate1()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Date1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDateTimeOffset1 <em>Date Time Offset1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time Offset1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getDateTimeOffset1()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_DateTimeOffset1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDecimal1 <em>Decimal1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getDecimal1()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Decimal1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getDuration1 <em>Duration1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getDuration1()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Duration1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getEnumMember1 <em>Enum Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum Member1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getEnumMember1()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_EnumMember1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getFloat1 <em>Float1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getFloat1()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Float1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getGuid1 <em>Guid1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getGuid1()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Guid1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getInt1 <em>Int1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getInt1()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Int1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getModelElementPath1 <em>Model Element Path1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Element Path1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getModelElementPath1()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_ModelElementPath1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getNavigationPropertyPath1 <em>Navigation Property Path1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigation Property Path1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getNavigationPropertyPath1()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_NavigationPropertyPath1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getPath1 <em>Path1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getPath1()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Path1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getPropertyPath1 <em>Property Path1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Path1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getPropertyPath1()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_PropertyPath1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getQualifier()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Qualifier();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getString1 <em>String1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getString1()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_String1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getTerm()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_Term();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getTimeOfDay1 <em>Time Of Day1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Of Day1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getTimeOfDay1()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_TimeOfDay1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.AnnotationType#getUrlRef1 <em>Url Ref1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url Ref1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.AnnotationType#getUrlRef1()
	 * @see #getAnnotationType()
	 * @generated
	 */
	EAttribute getAnnotationType_UrlRef1();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.EdmRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmRoot
	 * @generated
	 */
	EClass getEdmRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.EdmRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmRoot#getMixed()
	 * @see #getEdmRoot()
	 * @generated
	 */
	EAttribute getEdmRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.open.oasis.docs.odata.ns.edm.EdmRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmRoot#getXMLNSPrefixMap()
	 * @see #getEdmRoot()
	 * @generated
	 */
	EReference getEdmRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.open.oasis.docs.odata.ns.edm.EdmRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmRoot#getXSISchemaLocation()
	 * @see #getEdmRoot()
	 * @generated
	 */
	EReference getEdmRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.EdmRoot#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmRoot#getAnnotation()
	 * @see #getEdmRoot()
	 * @generated
	 */
	EReference getEdmRoot_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.EdmRoot#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotations</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmRoot#getAnnotations()
	 * @see #getEdmRoot()
	 * @generated
	 */
	EReference getEdmRoot_Annotations();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.EdmRoot#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.EdmRoot#getSchema()
	 * @see #getEdmRoot()
	 * @generated
	 */
	EReference getEdmRoot_Schema();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.SchemaType <em>Schema Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.SchemaType
	 * @generated
	 */
	EClass getSchemaType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.SchemaType#getGroup()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complex Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.SchemaType#getComplexType()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_ComplexType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getEntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.SchemaType#getEntityType()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_EntityType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getTypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Definition</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.SchemaType#getTypeDefinition()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_TypeDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getEnumType <em>Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.SchemaType#getEnumType()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_EnumType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.SchemaType#getAction()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.SchemaType#getFunction()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_Function();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Term</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.SchemaType#getTerm()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_Term();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.SchemaType#getAnnotations()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_Annotations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getEntityContainer <em>Entity Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Container</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.SchemaType#getEntityContainer()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_EntityContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.SchemaType#getAnnotation()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.SchemaType#getAlias()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_Alias();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.SchemaType#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.SchemaType#getNamespace()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_Namespace();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TAction <em>TAction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAction</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TAction
	 * @generated
	 */
	EClass getTAction();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TAction#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TAction#getGroup()
	 * @see #getTAction()
	 * @generated
	 */
	EAttribute getTAction_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TAction#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TAction#getParameter()
	 * @see #getTAction()
	 * @generated
	 */
	EReference getTAction_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TAction#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TAction#getAnnotation()
	 * @see #getTAction()
	 * @generated
	 */
	EReference getTAction_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TAction#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Return Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TAction#getReturnType()
	 * @see #getTAction()
	 * @generated
	 */
	EReference getTAction_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TAction#getEntitySetPath <em>Entity Set Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Set Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TAction#getEntitySetPath()
	 * @see #getTAction()
	 * @generated
	 */
	EAttribute getTAction_EntitySetPath();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TAction#isIsBound <em>Is Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Bound</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TAction#isIsBound()
	 * @see #getTAction()
	 * @generated
	 */
	EAttribute getTAction_IsBound();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TAction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TAction#getName()
	 * @see #getTAction()
	 * @generated
	 */
	EAttribute getTAction_Name();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter <em>TAction Function Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAction Function Parameter</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter
	 * @generated
	 */
	EClass getTActionFunctionParameter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter#getAnnotation()
	 * @see #getTActionFunctionParameter()
	 * @generated
	 */
	EReference getTActionFunctionParameter_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter#getMaxLength()
	 * @see #getTActionFunctionParameter()
	 * @generated
	 */
	EAttribute getTActionFunctionParameter_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter#getName()
	 * @see #getTActionFunctionParameter()
	 * @generated
	 */
	EAttribute getTActionFunctionParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter#isNullable()
	 * @see #getTActionFunctionParameter()
	 * @generated
	 */
	EAttribute getTActionFunctionParameter_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter#getPrecision()
	 * @see #getTActionFunctionParameter()
	 * @generated
	 */
	EAttribute getTActionFunctionParameter_Precision();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter#getScale()
	 * @see #getTActionFunctionParameter()
	 * @generated
	 */
	EAttribute getTActionFunctionParameter_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter#getSRID <em>SRID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SRID</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter#getSRID()
	 * @see #getTActionFunctionParameter()
	 * @generated
	 */
	EAttribute getTActionFunctionParameter_SRID();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter#getType()
	 * @see #getTActionFunctionParameter()
	 * @generated
	 */
	EAttribute getTActionFunctionParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter#isUnicode <em>Unicode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unicode</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionFunctionParameter#isUnicode()
	 * @see #getTActionFunctionParameter()
	 * @generated
	 */
	EAttribute getTActionFunctionParameter_Unicode();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TActionFunctionReturnType <em>TAction Function Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAction Function Return Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionFunctionReturnType
	 * @generated
	 */
	EClass getTActionFunctionReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TActionFunctionReturnType#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionFunctionReturnType#getAnnotation()
	 * @see #getTActionFunctionReturnType()
	 * @generated
	 */
	EReference getTActionFunctionReturnType_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TActionFunctionReturnType#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionFunctionReturnType#getMaxLength()
	 * @see #getTActionFunctionReturnType()
	 * @generated
	 */
	EAttribute getTActionFunctionReturnType_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TActionFunctionReturnType#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionFunctionReturnType#isNullable()
	 * @see #getTActionFunctionReturnType()
	 * @generated
	 */
	EAttribute getTActionFunctionReturnType_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TActionFunctionReturnType#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionFunctionReturnType#getPrecision()
	 * @see #getTActionFunctionReturnType()
	 * @generated
	 */
	EAttribute getTActionFunctionReturnType_Precision();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TActionFunctionReturnType#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionFunctionReturnType#getScale()
	 * @see #getTActionFunctionReturnType()
	 * @generated
	 */
	EAttribute getTActionFunctionReturnType_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TActionFunctionReturnType#getSRID <em>SRID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SRID</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionFunctionReturnType#getSRID()
	 * @see #getTActionFunctionReturnType()
	 * @generated
	 */
	EAttribute getTActionFunctionReturnType_SRID();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TActionFunctionReturnType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionFunctionReturnType#getType()
	 * @see #getTActionFunctionReturnType()
	 * @generated
	 */
	EAttribute getTActionFunctionReturnType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TActionFunctionReturnType#isUnicode <em>Unicode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unicode</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionFunctionReturnType#isUnicode()
	 * @see #getTActionFunctionReturnType()
	 * @generated
	 */
	EAttribute getTActionFunctionReturnType_Unicode();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TActionImport <em>TAction Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAction Import</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionImport
	 * @generated
	 */
	EClass getTActionImport();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TActionImport#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionImport#getAnnotation()
	 * @see #getTActionImport()
	 * @generated
	 */
	EReference getTActionImport_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TActionImport#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionImport#getAction()
	 * @see #getTActionImport()
	 * @generated
	 */
	EAttribute getTActionImport_Action();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TActionImport#getEntitySet <em>Entity Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Set</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionImport#getEntitySet()
	 * @see #getTActionImport()
	 * @generated
	 */
	EAttribute getTActionImport_EntitySet();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TActionImport#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TActionImport#getName()
	 * @see #getTActionImport()
	 * @generated
	 */
	EAttribute getTActionImport_Name();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TAnnotations <em>TAnnotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TAnnotations</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TAnnotations
	 * @generated
	 */
	EClass getTAnnotations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TAnnotations#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TAnnotations#getAnnotation()
	 * @see #getTAnnotations()
	 * @generated
	 */
	EReference getTAnnotations_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TAnnotations#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TAnnotations#getQualifier()
	 * @see #getTAnnotations()
	 * @generated
	 */
	EAttribute getTAnnotations_Qualifier();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TAnnotations#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TAnnotations#getTarget()
	 * @see #getTAnnotations()
	 * @generated
	 */
	EAttribute getTAnnotations_Target();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression <em>TApply Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TApply Expression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression
	 * @generated
	 */
	EClass getTApplyExpression();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getGroup()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EAttribute getTApplyExpression_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getAnnotation()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getBinary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binary</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getBinary()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Binary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getBool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bool</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getBool()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Bool();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getDate()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getDateTimeOffset <em>Date Time Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Time Offset</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getDateTimeOffset()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_DateTimeOffset();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decimal</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getDecimal()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Decimal();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Duration</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getDuration()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Duration();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getEnumMember <em>Enum Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enum Member</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getEnumMember()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EAttribute getTApplyExpression_EnumMember();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Float</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getFloat()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Float();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guid</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getGuid()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Guid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getInt <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Int</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getInt()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Int();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getString()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_String();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getTimeOfDay <em>Time Of Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Of Day</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getTimeOfDay()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_TimeOfDay();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getAnnotationPath <em>Annotation Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Annotation Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getAnnotationPath()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EAttribute getTApplyExpression_AnnotationPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getApply <em>Apply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apply</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getApply()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Apply();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getCast <em>Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cast</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getCast()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Cast();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collection</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getCollection()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Collection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getIf()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_If();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getEq <em>Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eq</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getEq()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Eq();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getNe <em>Ne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ne</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getNe()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Ne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getGe <em>Ge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ge</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getGe()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Ge();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getGt <em>Gt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gt</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getGt()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Gt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getLe <em>Le</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Le</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getLe()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Le();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getLt <em>Lt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lt</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getLt()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Lt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>And</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getAnd()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_And();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Or</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getOr()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Or();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Not</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getNot()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Not();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getHas()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Has();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getIn()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_In();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getAdd <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getAdd()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Add();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getSub()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getNeg <em>Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Neg</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getNeg()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Neg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getMul <em>Mul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mul</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getMul()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Mul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getDiv()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getDivBy <em>Div By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div By</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getDivBy()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_DivBy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getMod <em>Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mod</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getMod()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Mod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getIsOf <em>Is Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Of</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getIsOf()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_IsOf();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getLabeledElement <em>Labeled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labeled Element</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getLabeledElement()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_LabeledElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getLabeledElementReference <em>Labeled Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labeled Element Reference</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getLabeledElementReference()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_LabeledElementReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getNull <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getNull()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Null();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getModelElementPath <em>Model Element Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Model Element Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getModelElementPath()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EAttribute getTApplyExpression_ModelElementPath();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getNavigationPropertyPath <em>Navigation Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Navigation Property Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getNavigationPropertyPath()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EAttribute getTApplyExpression_NavigationPropertyPath();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getPath()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EAttribute getTApplyExpression_Path();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getPropertyPath <em>Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Property Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getPropertyPath()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EAttribute getTApplyExpression_PropertyPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getRecord()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_Record();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getUrlRef <em>Url Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Url Ref</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getUrlRef()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EReference getTApplyExpression_UrlRef();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TApplyExpression#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TApplyExpression#getFunction()
	 * @see #getTApplyExpression()
	 * @generated
	 */
	EAttribute getTApplyExpression_Function();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TBinaryConstantExpression <em>TBinary Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TBinary Constant Expression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TBinaryConstantExpression
	 * @generated
	 */
	EClass getTBinaryConstantExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TBinaryConstantExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TBinaryConstantExpression#getValue()
	 * @see #getTBinaryConstantExpression()
	 * @generated
	 */
	EAttribute getTBinaryConstantExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TBoolConstantExpression <em>TBool Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TBool Constant Expression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TBoolConstantExpression
	 * @generated
	 */
	EClass getTBoolConstantExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TBoolConstantExpression#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TBoolConstantExpression#isValue()
	 * @see #getTBoolConstantExpression()
	 * @generated
	 */
	EAttribute getTBoolConstantExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression <em>TCast Or Is Of Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCast Or Is Of Expression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression
	 * @generated
	 */
	EClass getTCastOrIsOfExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getAnnotation()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getBinary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binary</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getBinary()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Binary();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getBool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bool</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getBool()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Bool();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getDate()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Date();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getDateTimeOffset <em>Date Time Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Time Offset</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getDateTimeOffset()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_DateTimeOffset();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decimal</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getDecimal()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Decimal();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getDuration()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getEnumMember <em>Enum Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum Member</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getEnumMember()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EAttribute getTCastOrIsOfExpression_EnumMember();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Float</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getFloat()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Float();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guid</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getGuid()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Guid();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getInt <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getInt()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Int();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getString()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_String();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getTimeOfDay <em>Time Of Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Of Day</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getTimeOfDay()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_TimeOfDay();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getAnnotationPath <em>Annotation Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getAnnotationPath()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EAttribute getTCastOrIsOfExpression_AnnotationPath();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getApply <em>Apply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Apply</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getApply()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Apply();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getCast <em>Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cast</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getCast()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Cast();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getCollection()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Collection();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getIf()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_If();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getEq <em>Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eq</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getEq()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Eq();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getNe <em>Ne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ne</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getNe()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Ne();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getGe <em>Ge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ge</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getGe()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Ge();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getGt <em>Gt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gt</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getGt()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Gt();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getLe <em>Le</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Le</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getLe()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Le();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getLt <em>Lt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lt</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getLt()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Lt();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>And</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getAnd()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_And();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Or</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getOr()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Or();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Not</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getNot()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Not();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getHas()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Has();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getIn()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_In();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getAdd <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getAdd()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Add();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getSub()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Sub();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getNeg <em>Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Neg</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getNeg()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Neg();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getMul <em>Mul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mul</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getMul()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Mul();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Div</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getDiv()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Div();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getDivBy <em>Div By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Div By</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getDivBy()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_DivBy();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getMod <em>Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mod</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getMod()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Mod();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getIsOf <em>Is Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Of</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getIsOf()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_IsOf();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getLabeledElement <em>Labeled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Labeled Element</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getLabeledElement()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_LabeledElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getLabeledElementReference <em>Labeled Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Labeled Element Reference</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getLabeledElementReference()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_LabeledElementReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getNull <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Null</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getNull()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Null();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getModelElementPath <em>Model Element Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Element Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getModelElementPath()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EAttribute getTCastOrIsOfExpression_ModelElementPath();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getNavigationPropertyPath <em>Navigation Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigation Property Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getNavigationPropertyPath()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EAttribute getTCastOrIsOfExpression_NavigationPropertyPath();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getPath()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EAttribute getTCastOrIsOfExpression_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getPropertyPath <em>Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getPropertyPath()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EAttribute getTCastOrIsOfExpression_PropertyPath();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Record</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getRecord()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Record();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getUrlRef <em>Url Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url Ref</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getUrlRef()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_UrlRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getAnnotation1 <em>Annotation1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getAnnotation1()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EReference getTCastOrIsOfExpression_Annotation1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getMaxLength()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EAttribute getTCastOrIsOfExpression_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getPrecision()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EAttribute getTCastOrIsOfExpression_Precision();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getScale()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EAttribute getTCastOrIsOfExpression_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getSRID <em>SRID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SRID</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getSRID()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EAttribute getTCastOrIsOfExpression_SRID();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#getType()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EAttribute getTCastOrIsOfExpression_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#isUnicode <em>Unicode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unicode</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCastOrIsOfExpression#isUnicode()
	 * @see #getTCastOrIsOfExpression()
	 * @generated
	 */
	EAttribute getTCastOrIsOfExpression_Unicode();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression <em>TCollection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TCollection Expression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression
	 * @generated
	 */
	EClass getTCollectionExpression();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getGExpression <em>GExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>GExpression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getGExpression()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EAttribute getTCollectionExpression_GExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getBinary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binary</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getBinary()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Binary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getBool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bool</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getBool()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Bool();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getDate()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getDateTimeOffset <em>Date Time Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Time Offset</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getDateTimeOffset()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_DateTimeOffset();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decimal</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getDecimal()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Decimal();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Duration</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getDuration()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Duration();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getEnumMember <em>Enum Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enum Member</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getEnumMember()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EAttribute getTCollectionExpression_EnumMember();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Float</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getFloat()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Float();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guid</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getGuid()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Guid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getInt <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Int</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getInt()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Int();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getString()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_String();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getTimeOfDay <em>Time Of Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Of Day</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getTimeOfDay()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_TimeOfDay();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getAnnotationPath <em>Annotation Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Annotation Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getAnnotationPath()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EAttribute getTCollectionExpression_AnnotationPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getApply <em>Apply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apply</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getApply()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Apply();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getCast <em>Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cast</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getCast()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Cast();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collection</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getCollection()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Collection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getIf()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_If();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getEq <em>Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eq</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getEq()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Eq();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getNe <em>Ne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ne</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getNe()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Ne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getGe <em>Ge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ge</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getGe()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Ge();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getGt <em>Gt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gt</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getGt()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Gt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getLe <em>Le</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Le</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getLe()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Le();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getLt <em>Lt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lt</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getLt()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Lt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>And</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getAnd()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_And();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Or</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getOr()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Or();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Not</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getNot()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Not();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getHas()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Has();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getIn()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_In();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getAdd <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getAdd()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Add();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getSub()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getNeg <em>Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Neg</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getNeg()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Neg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getMul <em>Mul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mul</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getMul()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Mul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getDiv()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getDivBy <em>Div By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div By</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getDivBy()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_DivBy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getMod <em>Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mod</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getMod()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Mod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getIsOf <em>Is Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Of</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getIsOf()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_IsOf();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getLabeledElement <em>Labeled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labeled Element</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getLabeledElement()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_LabeledElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getLabeledElementReference <em>Labeled Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labeled Element Reference</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getLabeledElementReference()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_LabeledElementReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getNull <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getNull()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Null();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getModelElementPath <em>Model Element Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Model Element Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getModelElementPath()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EAttribute getTCollectionExpression_ModelElementPath();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getNavigationPropertyPath <em>Navigation Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Navigation Property Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getNavigationPropertyPath()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EAttribute getTCollectionExpression_NavigationPropertyPath();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getPath()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EAttribute getTCollectionExpression_Path();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getPropertyPath <em>Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Property Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getPropertyPath()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EAttribute getTCollectionExpression_PropertyPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getRecord()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_Record();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getUrlRef <em>Url Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Url Ref</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TCollectionExpression#getUrlRef()
	 * @see #getTCollectionExpression()
	 * @generated
	 */
	EReference getTCollectionExpression_UrlRef();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TComplexType <em>TComplex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TComplex Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TComplexType
	 * @generated
	 */
	EClass getTComplexType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TComplexType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TComplexType#getGroup()
	 * @see #getTComplexType()
	 * @generated
	 */
	EAttribute getTComplexType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TComplexType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TComplexType#getProperty()
	 * @see #getTComplexType()
	 * @generated
	 */
	EReference getTComplexType_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TComplexType#getNavigationProperty <em>Navigation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Navigation Property</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TComplexType#getNavigationProperty()
	 * @see #getTComplexType()
	 * @generated
	 */
	EReference getTComplexType_NavigationProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TComplexType#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TComplexType#getAnnotation()
	 * @see #getTComplexType()
	 * @generated
	 */
	EReference getTComplexType_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TComplexType#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TComplexType#isAbstract()
	 * @see #getTComplexType()
	 * @generated
	 */
	EAttribute getTComplexType_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TComplexType#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TComplexType#getBaseType()
	 * @see #getTComplexType()
	 * @generated
	 */
	EAttribute getTComplexType_BaseType();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TComplexType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TComplexType#getName()
	 * @see #getTComplexType()
	 * @generated
	 */
	EAttribute getTComplexType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TComplexType#isOpenType <em>Open Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TComplexType#isOpenType()
	 * @see #getTComplexType()
	 * @generated
	 */
	EAttribute getTComplexType_OpenType();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TDateConstantExpression <em>TDate Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDate Constant Expression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TDateConstantExpression
	 * @generated
	 */
	EClass getTDateConstantExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TDateConstantExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TDateConstantExpression#getValue()
	 * @see #getTDateConstantExpression()
	 * @generated
	 */
	EAttribute getTDateConstantExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TDateTimeOffsetConstantExpression <em>TDate Time Offset Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDate Time Offset Constant Expression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TDateTimeOffsetConstantExpression
	 * @generated
	 */
	EClass getTDateTimeOffsetConstantExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TDateTimeOffsetConstantExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TDateTimeOffsetConstantExpression#getValue()
	 * @see #getTDateTimeOffsetConstantExpression()
	 * @generated
	 */
	EAttribute getTDateTimeOffsetConstantExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TDecimalConstantExpression <em>TDecimal Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDecimal Constant Expression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TDecimalConstantExpression
	 * @generated
	 */
	EClass getTDecimalConstantExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TDecimalConstantExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TDecimalConstantExpression#getValue()
	 * @see #getTDecimalConstantExpression()
	 * @generated
	 */
	EAttribute getTDecimalConstantExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TDurationConstantExpression <em>TDuration Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TDuration Constant Expression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TDurationConstantExpression
	 * @generated
	 */
	EClass getTDurationConstantExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TDurationConstantExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TDurationConstantExpression#getValue()
	 * @see #getTDurationConstantExpression()
	 * @generated
	 */
	EAttribute getTDurationConstantExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TEntityContainer <em>TEntity Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEntity Container</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityContainer
	 * @generated
	 */
	EClass getTEntityContainer();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TEntityContainer#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityContainer#getGroup()
	 * @see #getTEntityContainer()
	 * @generated
	 */
	EAttribute getTEntityContainer_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TEntityContainer#getEntitySet <em>Entity Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity Set</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityContainer#getEntitySet()
	 * @see #getTEntityContainer()
	 * @generated
	 */
	EReference getTEntityContainer_EntitySet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TEntityContainer#getActionImport <em>Action Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Import</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityContainer#getActionImport()
	 * @see #getTEntityContainer()
	 * @generated
	 */
	EReference getTEntityContainer_ActionImport();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TEntityContainer#getFunctionImport <em>Function Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Import</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityContainer#getFunctionImport()
	 * @see #getTEntityContainer()
	 * @generated
	 */
	EReference getTEntityContainer_FunctionImport();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TEntityContainer#getSingleton <em>Singleton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Singleton</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityContainer#getSingleton()
	 * @see #getTEntityContainer()
	 * @generated
	 */
	EReference getTEntityContainer_Singleton();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TEntityContainer#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityContainer#getAnnotation()
	 * @see #getTEntityContainer()
	 * @generated
	 */
	EReference getTEntityContainer_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TEntityContainer#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extends</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityContainer#getExtends()
	 * @see #getTEntityContainer()
	 * @generated
	 */
	EAttribute getTEntityContainer_Extends();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TEntityContainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityContainer#getName()
	 * @see #getTEntityContainer()
	 * @generated
	 */
	EAttribute getTEntityContainer_Name();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TEntityKeyElement <em>TEntity Key Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEntity Key Element</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityKeyElement
	 * @generated
	 */
	EClass getTEntityKeyElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TEntityKeyElement#getPropertyRef <em>Property Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Ref</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityKeyElement#getPropertyRef()
	 * @see #getTEntityKeyElement()
	 * @generated
	 */
	EReference getTEntityKeyElement_PropertyRef();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TEntitySet <em>TEntity Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEntity Set</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntitySet
	 * @generated
	 */
	EClass getTEntitySet();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TEntitySet#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntitySet#getGroup()
	 * @see #getTEntitySet()
	 * @generated
	 */
	EAttribute getTEntitySet_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TEntitySet#getNavigationPropertyBinding <em>Navigation Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Navigation Property Binding</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntitySet#getNavigationPropertyBinding()
	 * @see #getTEntitySet()
	 * @generated
	 */
	EReference getTEntitySet_NavigationPropertyBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TEntitySet#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntitySet#getAnnotation()
	 * @see #getTEntitySet()
	 * @generated
	 */
	EReference getTEntitySet_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TEntitySet#getEntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntitySet#getEntityType()
	 * @see #getTEntitySet()
	 * @generated
	 */
	EAttribute getTEntitySet_EntityType();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TEntitySet#isIncludeInServiceDocument <em>Include In Service Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include In Service Document</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntitySet#isIncludeInServiceDocument()
	 * @see #getTEntitySet()
	 * @generated
	 */
	EAttribute getTEntitySet_IncludeInServiceDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TEntitySet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntitySet#getName()
	 * @see #getTEntitySet()
	 * @generated
	 */
	EAttribute getTEntitySet_Name();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TEntityType <em>TEntity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEntity Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityType
	 * @generated
	 */
	EClass getTEntityType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TEntityType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityType#getGroup()
	 * @see #getTEntityType()
	 * @generated
	 */
	EAttribute getTEntityType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TEntityType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityType#getKey()
	 * @see #getTEntityType()
	 * @generated
	 */
	EReference getTEntityType_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TEntityType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityType#getProperty()
	 * @see #getTEntityType()
	 * @generated
	 */
	EReference getTEntityType_Property();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TEntityType#getNavigationProperty <em>Navigation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Navigation Property</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityType#getNavigationProperty()
	 * @see #getTEntityType()
	 * @generated
	 */
	EReference getTEntityType_NavigationProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TEntityType#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityType#getAnnotation()
	 * @see #getTEntityType()
	 * @generated
	 */
	EReference getTEntityType_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TEntityType#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityType#isAbstract()
	 * @see #getTEntityType()
	 * @generated
	 */
	EAttribute getTEntityType_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TEntityType#getBaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityType#getBaseType()
	 * @see #getTEntityType()
	 * @generated
	 */
	EAttribute getTEntityType_BaseType();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TEntityType#isHasStream <em>Has Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Stream</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityType#isHasStream()
	 * @see #getTEntityType()
	 * @generated
	 */
	EAttribute getTEntityType_HasStream();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TEntityType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityType#getName()
	 * @see #getTEntityType()
	 * @generated
	 */
	EAttribute getTEntityType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TEntityType#isOpenType <em>Open Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEntityType#isOpenType()
	 * @see #getTEntityType()
	 * @generated
	 */
	EAttribute getTEntityType_OpenType();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TEnumType <em>TEnum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEnum Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEnumType
	 * @generated
	 */
	EClass getTEnumType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TEnumType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEnumType#getGroup()
	 * @see #getTEnumType()
	 * @generated
	 */
	EAttribute getTEnumType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TEnumType#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Member</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEnumType#getMember()
	 * @see #getTEnumType()
	 * @generated
	 */
	EReference getTEnumType_Member();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TEnumType#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEnumType#getAnnotation()
	 * @see #getTEnumType()
	 * @generated
	 */
	EReference getTEnumType_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TEnumType#isIsFlags <em>Is Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Flags</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEnumType#isIsFlags()
	 * @see #getTEnumType()
	 * @generated
	 */
	EAttribute getTEnumType_IsFlags();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TEnumType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEnumType#getName()
	 * @see #getTEnumType()
	 * @generated
	 */
	EAttribute getTEnumType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TEnumType#getUnderlyingType <em>Underlying Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Underlying Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEnumType#getUnderlyingType()
	 * @see #getTEnumType()
	 * @generated
	 */
	EAttribute getTEnumType_UnderlyingType();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TEnumTypeMember <em>TEnum Type Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEnum Type Member</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEnumTypeMember
	 * @generated
	 */
	EClass getTEnumTypeMember();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TEnumTypeMember#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEnumTypeMember#getAnnotation()
	 * @see #getTEnumTypeMember()
	 * @generated
	 */
	EReference getTEnumTypeMember_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TEnumTypeMember#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEnumTypeMember#getName()
	 * @see #getTEnumTypeMember()
	 * @generated
	 */
	EAttribute getTEnumTypeMember_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TEnumTypeMember#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TEnumTypeMember#getValue()
	 * @see #getTEnumTypeMember()
	 * @generated
	 */
	EAttribute getTEnumTypeMember_Value();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TFloatConstantExpression <em>TFloat Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFloat Constant Expression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TFloatConstantExpression
	 * @generated
	 */
	EClass getTFloatConstantExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TFloatConstantExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TFloatConstantExpression#getValue()
	 * @see #getTFloatConstantExpression()
	 * @generated
	 */
	EAttribute getTFloatConstantExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TFunction <em>TFunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFunction</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TFunction
	 * @generated
	 */
	EClass getTFunction();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TFunction#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TFunction#getGroup()
	 * @see #getTFunction()
	 * @generated
	 */
	EAttribute getTFunction_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TFunction#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TFunction#getParameter()
	 * @see #getTFunction()
	 * @generated
	 */
	EReference getTFunction_Parameter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TFunction#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TFunction#getAnnotation()
	 * @see #getTFunction()
	 * @generated
	 */
	EReference getTFunction_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TFunction#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TFunction#getReturnType()
	 * @see #getTFunction()
	 * @generated
	 */
	EReference getTFunction_ReturnType();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TFunction#getGroup1 <em>Group1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TFunction#getGroup1()
	 * @see #getTFunction()
	 * @generated
	 */
	EAttribute getTFunction_Group1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TFunction#getAnnotation1 <em>Annotation1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TFunction#getAnnotation1()
	 * @see #getTFunction()
	 * @generated
	 */
	EReference getTFunction_Annotation1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TFunction#getEntitySetPath <em>Entity Set Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Set Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TFunction#getEntitySetPath()
	 * @see #getTFunction()
	 * @generated
	 */
	EAttribute getTFunction_EntitySetPath();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TFunction#isIsBound <em>Is Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Bound</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TFunction#isIsBound()
	 * @see #getTFunction()
	 * @generated
	 */
	EAttribute getTFunction_IsBound();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TFunction#isIsComposable <em>Is Composable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Composable</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TFunction#isIsComposable()
	 * @see #getTFunction()
	 * @generated
	 */
	EAttribute getTFunction_IsComposable();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TFunction#getName()
	 * @see #getTFunction()
	 * @generated
	 */
	EAttribute getTFunction_Name();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TFunctionImport <em>TFunction Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TFunction Import</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TFunctionImport
	 * @generated
	 */
	EClass getTFunctionImport();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TFunctionImport#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TFunctionImport#getAnnotation()
	 * @see #getTFunctionImport()
	 * @generated
	 */
	EReference getTFunctionImport_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TFunctionImport#getEntitySet <em>Entity Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entity Set</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TFunctionImport#getEntitySet()
	 * @see #getTFunctionImport()
	 * @generated
	 */
	EAttribute getTFunctionImport_EntitySet();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TFunctionImport#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TFunctionImport#getFunction()
	 * @see #getTFunctionImport()
	 * @generated
	 */
	EAttribute getTFunctionImport_Function();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TFunctionImport#isIncludeInServiceDocument <em>Include In Service Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include In Service Document</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TFunctionImport#isIncludeInServiceDocument()
	 * @see #getTFunctionImport()
	 * @generated
	 */
	EAttribute getTFunctionImport_IncludeInServiceDocument();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TFunctionImport#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TFunctionImport#getName()
	 * @see #getTFunctionImport()
	 * @generated
	 */
	EAttribute getTFunctionImport_Name();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TGuidConstantExpression <em>TGuid Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TGuid Constant Expression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TGuidConstantExpression
	 * @generated
	 */
	EClass getTGuidConstantExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TGuidConstantExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TGuidConstantExpression#getValue()
	 * @see #getTGuidConstantExpression()
	 * @generated
	 */
	EAttribute getTGuidConstantExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression <em>TIf Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TIf Expression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression
	 * @generated
	 */
	EClass getTIfExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getAnnotation()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Annotation();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getGExpression <em>GExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>GExpression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getGExpression()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EAttribute getTIfExpression_GExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getBinary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binary</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getBinary()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Binary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getBool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bool</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getBool()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Bool();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getDate()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getDateTimeOffset <em>Date Time Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Time Offset</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getDateTimeOffset()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_DateTimeOffset();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decimal</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getDecimal()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Decimal();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Duration</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getDuration()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Duration();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getEnumMember <em>Enum Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enum Member</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getEnumMember()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EAttribute getTIfExpression_EnumMember();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Float</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getFloat()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Float();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guid</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getGuid()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Guid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getInt <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Int</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getInt()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Int();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getString()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_String();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getTimeOfDay <em>Time Of Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Of Day</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getTimeOfDay()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_TimeOfDay();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getAnnotationPath <em>Annotation Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Annotation Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getAnnotationPath()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EAttribute getTIfExpression_AnnotationPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getApply <em>Apply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apply</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getApply()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Apply();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getCast <em>Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cast</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getCast()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Cast();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collection</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getCollection()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Collection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getIf()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_If();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getEq <em>Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eq</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getEq()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Eq();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getNe <em>Ne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ne</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getNe()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Ne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getGe <em>Ge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ge</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getGe()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Ge();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getGt <em>Gt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gt</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getGt()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Gt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getLe <em>Le</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Le</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getLe()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Le();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getLt <em>Lt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lt</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getLt()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Lt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>And</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getAnd()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_And();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Or</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getOr()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Or();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Not</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getNot()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Not();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getHas()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Has();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getIn()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_In();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getAdd <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getAdd()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Add();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getSub()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getNeg <em>Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Neg</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getNeg()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Neg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getMul <em>Mul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mul</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getMul()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Mul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getDiv()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getDivBy <em>Div By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div By</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getDivBy()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_DivBy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getMod <em>Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mod</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getMod()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Mod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getIsOf <em>Is Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Of</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getIsOf()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_IsOf();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getLabeledElement <em>Labeled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labeled Element</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getLabeledElement()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_LabeledElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getLabeledElementReference <em>Labeled Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labeled Element Reference</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getLabeledElementReference()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_LabeledElementReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getNull <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getNull()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Null();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getModelElementPath <em>Model Element Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Model Element Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getModelElementPath()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EAttribute getTIfExpression_ModelElementPath();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getNavigationPropertyPath <em>Navigation Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Navigation Property Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getNavigationPropertyPath()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EAttribute getTIfExpression_NavigationPropertyPath();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getPath()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EAttribute getTIfExpression_Path();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getPropertyPath <em>Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Property Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getPropertyPath()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EAttribute getTIfExpression_PropertyPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getRecord()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Record();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getUrlRef <em>Url Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Url Ref</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getUrlRef()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_UrlRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TIfExpression#getAnnotation1 <em>Annotation1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIfExpression#getAnnotation1()
	 * @see #getTIfExpression()
	 * @generated
	 */
	EReference getTIfExpression_Annotation1();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TIntConstantExpression <em>TInt Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInt Constant Expression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIntConstantExpression
	 * @generated
	 */
	EClass getTIntConstantExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TIntConstantExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TIntConstantExpression#getValue()
	 * @see #getTIntConstantExpression()
	 * @generated
	 */
	EAttribute getTIntConstantExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression <em>TLabeled Element Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TLabeled Element Expression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression
	 * @generated
	 */
	EClass getTLabeledElementExpression();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getGroup()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getAnnotation()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getBinary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binary</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getBinary()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Binary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getBool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bool</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getBool()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Bool();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getDate()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getDateTimeOffset <em>Date Time Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Time Offset</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getDateTimeOffset()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_DateTimeOffset();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decimal</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getDecimal()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Decimal();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Duration</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getDuration()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Duration();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getEnumMember <em>Enum Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enum Member</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getEnumMember()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_EnumMember();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Float</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getFloat()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Float();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guid</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getGuid()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Guid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getInt <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Int</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getInt()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Int();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getString()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_String();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getTimeOfDay <em>Time Of Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Of Day</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getTimeOfDay()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_TimeOfDay();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getAnnotationPath <em>Annotation Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Annotation Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getAnnotationPath()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_AnnotationPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getApply <em>Apply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apply</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getApply()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Apply();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getCast <em>Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cast</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getCast()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Cast();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collection</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getCollection()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Collection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getIf()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_If();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getEq <em>Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eq</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getEq()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Eq();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getNe <em>Ne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ne</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getNe()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Ne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getGe <em>Ge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ge</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getGe()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Ge();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getGt <em>Gt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gt</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getGt()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Gt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getLe <em>Le</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Le</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getLe()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Le();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getLt <em>Lt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lt</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getLt()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Lt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>And</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getAnd()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_And();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Or</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getOr()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Or();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Not</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getNot()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Not();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getHas()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Has();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getIn()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_In();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getAdd <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getAdd()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Add();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getSub()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getNeg <em>Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Neg</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getNeg()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Neg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getMul <em>Mul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mul</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getMul()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Mul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getDiv()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getDivBy <em>Div By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div By</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getDivBy()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_DivBy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getMod <em>Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mod</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getMod()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Mod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getIsOf <em>Is Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Of</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getIsOf()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_IsOf();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getLabeledElement <em>Labeled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labeled Element</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getLabeledElement()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_LabeledElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getLabeledElementReference <em>Labeled Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labeled Element Reference</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getLabeledElementReference()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_LabeledElementReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getNull <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getNull()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Null();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getModelElementPath <em>Model Element Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Model Element Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getModelElementPath()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_ModelElementPath();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getNavigationPropertyPath <em>Navigation Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Navigation Property Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getNavigationPropertyPath()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_NavigationPropertyPath();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getPath()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_Path();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getPropertyPath <em>Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Property Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getPropertyPath()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_PropertyPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getRecord()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_Record();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getUrlRef <em>Url Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Url Ref</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getUrlRef()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EReference getTLabeledElementExpression_UrlRef();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getAnnotationPath1 <em>Annotation Path1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation Path1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getAnnotationPath1()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_AnnotationPath1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getBinary1 <em>Binary1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binary1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getBinary1()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_Binary1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#isBool1 <em>Bool1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bool1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#isBool1()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_Bool1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getDate1 <em>Date1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getDate1()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_Date1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getDateTimeOffset1 <em>Date Time Offset1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time Offset1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getDateTimeOffset1()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_DateTimeOffset1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getDecimal1 <em>Decimal1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getDecimal1()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_Decimal1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getDuration1 <em>Duration1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getDuration1()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_Duration1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getEnumMember1 <em>Enum Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum Member1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getEnumMember1()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_EnumMember1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getFloat1 <em>Float1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getFloat1()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_Float1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getGuid1 <em>Guid1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getGuid1()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_Guid1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getInt1 <em>Int1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getInt1()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_Int1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getModelElementPath1 <em>Model Element Path1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Element Path1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getModelElementPath1()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_ModelElementPath1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getName()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getNavigationPropertyPath1 <em>Navigation Property Path1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigation Property Path1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getNavigationPropertyPath1()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_NavigationPropertyPath1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getPath1 <em>Path1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getPath1()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_Path1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getPropertyPath1 <em>Property Path1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Path1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getPropertyPath1()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_PropertyPath1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getString1 <em>String1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getString1()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_String1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getTimeOfDay1 <em>Time Of Day1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Of Day1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getTimeOfDay1()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_TimeOfDay1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getUrlRef1 <em>Url Ref1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url Ref1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementExpression#getUrlRef1()
	 * @see #getTLabeledElementExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementExpression_UrlRef1();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementReferenceExpression <em>TLabeled Element Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TLabeled Element Reference Expression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementReferenceExpression
	 * @generated
	 */
	EClass getTLabeledElementReferenceExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TLabeledElementReferenceExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TLabeledElementReferenceExpression#getValue()
	 * @see #getTLabeledElementReferenceExpression()
	 * @generated
	 */
	EAttribute getTLabeledElementReferenceExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty <em>TNavigation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TNavigation Property</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TNavigationProperty
	 * @generated
	 */
	EClass getTNavigationProperty();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getGroup()
	 * @see #getTNavigationProperty()
	 * @generated
	 */
	EAttribute getTNavigationProperty_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getReferentialConstraint <em>Referential Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Referential Constraint</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getReferentialConstraint()
	 * @see #getTNavigationProperty()
	 * @generated
	 */
	EReference getTNavigationProperty_ReferentialConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getOnDelete <em>On Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>On Delete</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getOnDelete()
	 * @see #getTNavigationProperty()
	 * @generated
	 */
	EReference getTNavigationProperty_OnDelete();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getAnnotation()
	 * @see #getTNavigationProperty()
	 * @generated
	 */
	EReference getTNavigationProperty_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#isContainsTarget <em>Contains Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contains Target</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TNavigationProperty#isContainsTarget()
	 * @see #getTNavigationProperty()
	 * @generated
	 */
	EAttribute getTNavigationProperty_ContainsTarget();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getName()
	 * @see #getTNavigationProperty()
	 * @generated
	 */
	EAttribute getTNavigationProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TNavigationProperty#isNullable()
	 * @see #getTNavigationProperty()
	 * @generated
	 */
	EAttribute getTNavigationProperty_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getPartner <em>Partner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partner</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getPartner()
	 * @see #getTNavigationProperty()
	 * @generated
	 */
	EAttribute getTNavigationProperty_Partner();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TNavigationProperty#getType()
	 * @see #getTNavigationProperty()
	 * @generated
	 */
	EAttribute getTNavigationProperty_Type();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TNavigationPropertyBinding <em>TNavigation Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TNavigation Property Binding</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TNavigationPropertyBinding
	 * @generated
	 */
	EClass getTNavigationPropertyBinding();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TNavigationPropertyBinding#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TNavigationPropertyBinding#getPath()
	 * @see #getTNavigationPropertyBinding()
	 * @generated
	 */
	EAttribute getTNavigationPropertyBinding_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TNavigationPropertyBinding#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TNavigationPropertyBinding#getTarget()
	 * @see #getTNavigationPropertyBinding()
	 * @generated
	 */
	EAttribute getTNavigationPropertyBinding_Target();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TNullExpression <em>TNull Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TNull Expression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TNullExpression
	 * @generated
	 */
	EClass getTNullExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TNullExpression#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TNullExpression#getAnnotation()
	 * @see #getTNullExpression()
	 * @generated
	 */
	EReference getTNullExpression_Annotation();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TOnDelete <em>TOn Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOn Delete</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOnDelete
	 * @generated
	 */
	EClass getTOnDelete();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TOnDelete#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOnDelete#getAnnotation()
	 * @see #getTOnDelete()
	 * @generated
	 */
	EReference getTOnDelete_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TOnDelete#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOnDelete#getAction()
	 * @see #getTOnDelete()
	 * @generated
	 */
	EAttribute getTOnDelete_Action();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression <em>TOne Child Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOne Child Expression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression
	 * @generated
	 */
	EClass getTOneChildExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getAnnotation()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Annotation();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getBinary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binary</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getBinary()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Binary();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getBool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bool</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getBool()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Bool();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDate()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Date();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDateTimeOffset <em>Date Time Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Time Offset</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDateTimeOffset()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_DateTimeOffset();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decimal</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDecimal()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Decimal();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Duration</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDuration()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getEnumMember <em>Enum Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum Member</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getEnumMember()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EAttribute getTOneChildExpression_EnumMember();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Float</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getFloat()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Float();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guid</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getGuid()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Guid();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getInt <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Int</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getInt()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Int();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getString()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_String();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getTimeOfDay <em>Time Of Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Of Day</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getTimeOfDay()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_TimeOfDay();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getAnnotationPath <em>Annotation Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getAnnotationPath()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EAttribute getTOneChildExpression_AnnotationPath();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getApply <em>Apply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Apply</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getApply()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Apply();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getCast <em>Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cast</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getCast()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Cast();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getCollection()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Collection();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getIf()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_If();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getEq <em>Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eq</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getEq()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Eq();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getNe <em>Ne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ne</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getNe()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Ne();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getGe <em>Ge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ge</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getGe()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Ge();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getGt <em>Gt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gt</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getGt()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Gt();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getLe <em>Le</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Le</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getLe()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Le();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getLt <em>Lt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lt</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getLt()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Lt();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>And</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getAnd()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_And();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Or</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getOr()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Or();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Not</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getNot()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Not();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getHas()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Has();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>In</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getIn()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_In();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getAdd <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getAdd()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Add();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getSub()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Sub();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getNeg <em>Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Neg</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getNeg()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Neg();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getMul <em>Mul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mul</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getMul()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Mul();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Div</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDiv()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Div();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDivBy <em>Div By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Div By</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getDivBy()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_DivBy();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getMod <em>Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mod</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getMod()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Mod();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getIsOf <em>Is Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is Of</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getIsOf()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_IsOf();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getLabeledElement <em>Labeled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Labeled Element</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getLabeledElement()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_LabeledElement();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getLabeledElementReference <em>Labeled Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Labeled Element Reference</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getLabeledElementReference()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_LabeledElementReference();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getNull <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Null</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getNull()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Null();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getModelElementPath <em>Model Element Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Element Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getModelElementPath()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EAttribute getTOneChildExpression_ModelElementPath();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getNavigationPropertyPath <em>Navigation Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigation Property Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getNavigationPropertyPath()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EAttribute getTOneChildExpression_NavigationPropertyPath();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getPath()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EAttribute getTOneChildExpression_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getPropertyPath <em>Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getPropertyPath()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EAttribute getTOneChildExpression_PropertyPath();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Record</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getRecord()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Record();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getUrlRef <em>Url Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url Ref</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getUrlRef()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_UrlRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getAnnotation1 <em>Annotation1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOneChildExpression#getAnnotation1()
	 * @see #getTOneChildExpression()
	 * @generated
	 */
	EReference getTOneChildExpression_Annotation1();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TProperty <em>TProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TProperty</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TProperty
	 * @generated
	 */
	EClass getTProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TProperty#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TProperty#getAnnotation()
	 * @see #getTProperty()
	 * @generated
	 */
	EReference getTProperty_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TProperty#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TProperty#getDefaultValue()
	 * @see #getTProperty()
	 * @generated
	 */
	EAttribute getTProperty_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TProperty#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TProperty#getMaxLength()
	 * @see #getTProperty()
	 * @generated
	 */
	EAttribute getTProperty_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TProperty#getName()
	 * @see #getTProperty()
	 * @generated
	 */
	EAttribute getTProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TProperty#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TProperty#isNullable()
	 * @see #getTProperty()
	 * @generated
	 */
	EAttribute getTProperty_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TProperty#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TProperty#getPrecision()
	 * @see #getTProperty()
	 * @generated
	 */
	EAttribute getTProperty_Precision();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TProperty#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TProperty#getScale()
	 * @see #getTProperty()
	 * @generated
	 */
	EAttribute getTProperty_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TProperty#getSRID <em>SRID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SRID</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TProperty#getSRID()
	 * @see #getTProperty()
	 * @generated
	 */
	EAttribute getTProperty_SRID();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TProperty#getType()
	 * @see #getTProperty()
	 * @generated
	 */
	EAttribute getTProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TProperty#isUnicode <em>Unicode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unicode</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TProperty#isUnicode()
	 * @see #getTProperty()
	 * @generated
	 */
	EAttribute getTProperty_Unicode();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TPropertyRef <em>TProperty Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TProperty Ref</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyRef
	 * @generated
	 */
	EClass getTPropertyRef();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TPropertyRef#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyRef#getAlias()
	 * @see #getTPropertyRef()
	 * @generated
	 */
	EAttribute getTPropertyRef_Alias();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TPropertyRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyRef#getName()
	 * @see #getTPropertyRef()
	 * @generated
	 */
	EAttribute getTPropertyRef_Name();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue <em>TProperty Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TProperty Value</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue
	 * @generated
	 */
	EClass getTPropertyValue();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getGroup()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getAnnotation()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Annotation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getBinary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binary</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getBinary()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Binary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getBool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bool</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getBool()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Bool();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getDate()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getDateTimeOffset <em>Date Time Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Time Offset</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getDateTimeOffset()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_DateTimeOffset();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decimal</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getDecimal()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Decimal();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Duration</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getDuration()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Duration();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getEnumMember <em>Enum Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enum Member</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getEnumMember()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_EnumMember();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Float</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getFloat()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Float();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guid</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getGuid()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Guid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getInt <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Int</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getInt()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Int();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getString()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_String();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getTimeOfDay <em>Time Of Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Of Day</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getTimeOfDay()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_TimeOfDay();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getAnnotationPath <em>Annotation Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Annotation Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getAnnotationPath()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_AnnotationPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getApply <em>Apply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apply</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getApply()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Apply();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getCast <em>Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cast</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getCast()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Cast();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collection</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getCollection()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Collection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getIf()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_If();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getEq <em>Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eq</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getEq()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Eq();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getNe <em>Ne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ne</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getNe()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Ne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getGe <em>Ge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ge</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getGe()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Ge();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getGt <em>Gt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gt</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getGt()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Gt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getLe <em>Le</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Le</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getLe()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Le();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getLt <em>Lt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lt</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getLt()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Lt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>And</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getAnd()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_And();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Or</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getOr()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Or();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Not</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getNot()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Not();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getHas()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Has();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getIn()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_In();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getAdd <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getAdd()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Add();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getSub()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getNeg <em>Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Neg</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getNeg()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Neg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getMul <em>Mul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mul</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getMul()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Mul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getDiv()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getDivBy <em>Div By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div By</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getDivBy()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_DivBy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getMod <em>Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mod</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getMod()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Mod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getIsOf <em>Is Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Of</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getIsOf()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_IsOf();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getLabeledElement <em>Labeled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labeled Element</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getLabeledElement()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_LabeledElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getLabeledElementReference <em>Labeled Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labeled Element Reference</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getLabeledElementReference()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_LabeledElementReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getNull <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getNull()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Null();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getModelElementPath <em>Model Element Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Model Element Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getModelElementPath()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_ModelElementPath();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getNavigationPropertyPath <em>Navigation Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Navigation Property Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getNavigationPropertyPath()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_NavigationPropertyPath();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getPath()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_Path();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getPropertyPath <em>Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Property Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getPropertyPath()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_PropertyPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getRecord()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_Record();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getUrlRef <em>Url Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Url Ref</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getUrlRef()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EReference getTPropertyValue_UrlRef();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getAnnotationPath1 <em>Annotation Path1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation Path1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getAnnotationPath1()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_AnnotationPath1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getBinary1 <em>Binary1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binary1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getBinary1()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_Binary1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#isBool1 <em>Bool1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bool1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#isBool1()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_Bool1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getDate1 <em>Date1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getDate1()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_Date1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getDateTimeOffset1 <em>Date Time Offset1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time Offset1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getDateTimeOffset1()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_DateTimeOffset1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getDecimal1 <em>Decimal1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getDecimal1()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_Decimal1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getDuration1 <em>Duration1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getDuration1()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_Duration1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getEnumMember1 <em>Enum Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum Member1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getEnumMember1()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_EnumMember1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getFloat1 <em>Float1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getFloat1()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_Float1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getGuid1 <em>Guid1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guid1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getGuid1()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_Guid1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getInt1 <em>Int1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getInt1()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_Int1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getModelElementPath1 <em>Model Element Path1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Element Path1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getModelElementPath1()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_ModelElementPath1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getNavigationPropertyPath1 <em>Navigation Property Path1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Navigation Property Path1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getNavigationPropertyPath1()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_NavigationPropertyPath1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getPath1 <em>Path1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getPath1()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_Path1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getProperty()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getPropertyPath1 <em>Property Path1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Path1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getPropertyPath1()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_PropertyPath1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getString1 <em>String1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getString1()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_String1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getTimeOfDay1 <em>Time Of Day1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Of Day1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getTimeOfDay1()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_TimeOfDay1();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TPropertyValue#getUrlRef1 <em>Url Ref1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url Ref1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPropertyValue#getUrlRef1()
	 * @see #getTPropertyValue()
	 * @generated
	 */
	EAttribute getTPropertyValue_UrlRef1();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TRecordExpression <em>TRecord Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRecord Expression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TRecordExpression
	 * @generated
	 */
	EClass getTRecordExpression();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TRecordExpression#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TRecordExpression#getGroup()
	 * @see #getTRecordExpression()
	 * @generated
	 */
	EAttribute getTRecordExpression_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TRecordExpression#getPropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Value</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TRecordExpression#getPropertyValue()
	 * @see #getTRecordExpression()
	 * @generated
	 */
	EReference getTRecordExpression_PropertyValue();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TRecordExpression#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TRecordExpression#getAnnotation()
	 * @see #getTRecordExpression()
	 * @generated
	 */
	EReference getTRecordExpression_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TRecordExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TRecordExpression#getType()
	 * @see #getTRecordExpression()
	 * @generated
	 */
	EAttribute getTRecordExpression_Type();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TReferentialConstraint <em>TReferential Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TReferential Constraint</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TReferentialConstraint
	 * @generated
	 */
	EClass getTReferentialConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TReferentialConstraint#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TReferentialConstraint#getAnnotation()
	 * @see #getTReferentialConstraint()
	 * @generated
	 */
	EReference getTReferentialConstraint_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TReferentialConstraint#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TReferentialConstraint#getProperty()
	 * @see #getTReferentialConstraint()
	 * @generated
	 */
	EAttribute getTReferentialConstraint_Property();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TReferentialConstraint#getReferencedProperty <em>Referenced Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Property</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TReferentialConstraint#getReferencedProperty()
	 * @see #getTReferentialConstraint()
	 * @generated
	 */
	EAttribute getTReferentialConstraint_ReferencedProperty();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TSingleton <em>TSingleton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TSingleton</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TSingleton
	 * @generated
	 */
	EClass getTSingleton();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TSingleton#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TSingleton#getGroup()
	 * @see #getTSingleton()
	 * @generated
	 */
	EAttribute getTSingleton_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TSingleton#getNavigationPropertyBinding <em>Navigation Property Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Navigation Property Binding</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TSingleton#getNavigationPropertyBinding()
	 * @see #getTSingleton()
	 * @generated
	 */
	EReference getTSingleton_NavigationPropertyBinding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TSingleton#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TSingleton#getAnnotation()
	 * @see #getTSingleton()
	 * @generated
	 */
	EReference getTSingleton_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TSingleton#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TSingleton#getName()
	 * @see #getTSingleton()
	 * @generated
	 */
	EAttribute getTSingleton_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TSingleton#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TSingleton#isNullable()
	 * @see #getTSingleton()
	 * @generated
	 */
	EAttribute getTSingleton_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TSingleton#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TSingleton#getType()
	 * @see #getTSingleton()
	 * @generated
	 */
	EAttribute getTSingleton_Type();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TStringConstantExpression <em>TString Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TString Constant Expression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TStringConstantExpression
	 * @generated
	 */
	EClass getTStringConstantExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TStringConstantExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TStringConstantExpression#getValue()
	 * @see #getTStringConstantExpression()
	 * @generated
	 */
	EAttribute getTStringConstantExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TTerm <em>TTerm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTerm</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTerm
	 * @generated
	 */
	EClass getTTerm();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTerm#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTerm#getAnnotation()
	 * @see #getTTerm()
	 * @generated
	 */
	EReference getTTerm_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TTerm#getAppliesTo <em>Applies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applies To</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTerm#getAppliesTo()
	 * @see #getTTerm()
	 * @generated
	 */
	EAttribute getTTerm_AppliesTo();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TTerm#getBaseTerm <em>Base Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Term</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTerm#getBaseTerm()
	 * @see #getTTerm()
	 * @generated
	 */
	EAttribute getTTerm_BaseTerm();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TTerm#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTerm#getDefaultValue()
	 * @see #getTTerm()
	 * @generated
	 */
	EAttribute getTTerm_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TTerm#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTerm#getMaxLength()
	 * @see #getTTerm()
	 * @generated
	 */
	EAttribute getTTerm_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TTerm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTerm#getName()
	 * @see #getTTerm()
	 * @generated
	 */
	EAttribute getTTerm_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TTerm#isNullable <em>Nullable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nullable</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTerm#isNullable()
	 * @see #getTTerm()
	 * @generated
	 */
	EAttribute getTTerm_Nullable();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TTerm#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTerm#getPrecision()
	 * @see #getTTerm()
	 * @generated
	 */
	EAttribute getTTerm_Precision();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TTerm#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTerm#getScale()
	 * @see #getTTerm()
	 * @generated
	 */
	EAttribute getTTerm_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TTerm#getSRID <em>SRID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SRID</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTerm#getSRID()
	 * @see #getTTerm()
	 * @generated
	 */
	EAttribute getTTerm_SRID();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TTerm#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTerm#getType()
	 * @see #getTTerm()
	 * @generated
	 */
	EAttribute getTTerm_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TTerm#isUnicode <em>Unicode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unicode</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTerm#isUnicode()
	 * @see #getTTerm()
	 * @generated
	 */
	EAttribute getTTerm_Unicode();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TTimeOfDayConstantExpression <em>TTime Of Day Constant Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTime Of Day Constant Expression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTimeOfDayConstantExpression
	 * @generated
	 */
	EClass getTTimeOfDayConstantExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TTimeOfDayConstantExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTimeOfDayConstantExpression#getValue()
	 * @see #getTTimeOfDayConstantExpression()
	 * @generated
	 */
	EAttribute getTTimeOfDayConstantExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression <em>TTwo Children Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTwo Children Expression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression
	 * @generated
	 */
	EClass getTTwoChildrenExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getAnnotation()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Annotation();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getGExpression <em>GExpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>GExpression</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getGExpression()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EAttribute getTTwoChildrenExpression_GExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getBinary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binary</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getBinary()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Binary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getBool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bool</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getBool()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Bool();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getDate()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getDateTimeOffset <em>Date Time Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Time Offset</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getDateTimeOffset()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_DateTimeOffset();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decimal</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getDecimal()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Decimal();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Duration</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getDuration()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Duration();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getEnumMember <em>Enum Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enum Member</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getEnumMember()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EAttribute getTTwoChildrenExpression_EnumMember();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Float</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getFloat()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Float();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getGuid <em>Guid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guid</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getGuid()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Guid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getInt <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Int</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getInt()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Int();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>String</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getString()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_String();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getTimeOfDay <em>Time Of Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Of Day</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getTimeOfDay()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_TimeOfDay();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getAnnotationPath <em>Annotation Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Annotation Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getAnnotationPath()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EAttribute getTTwoChildrenExpression_AnnotationPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getApply <em>Apply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Apply</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getApply()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Apply();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getCast <em>Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cast</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getCast()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Cast();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Collection</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getCollection()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Collection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>If</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getIf()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_If();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getEq <em>Eq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eq</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getEq()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Eq();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getNe <em>Ne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ne</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getNe()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Ne();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getGe <em>Ge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ge</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getGe()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Ge();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getGt <em>Gt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gt</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getGt()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Gt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getLe <em>Le</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Le</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getLe()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Le();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getLt <em>Lt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lt</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getLt()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Lt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>And</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getAnd()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_And();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Or</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getOr()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Or();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Not</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getNot()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Not();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getHas()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Has();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getIn()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_In();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getAdd <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Add</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getAdd()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Add();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getSub()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getNeg <em>Neg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Neg</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getNeg()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Neg();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getMul <em>Mul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mul</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getMul()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Mul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getDiv()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getDivBy <em>Div By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div By</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getDivBy()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_DivBy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getMod <em>Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mod</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getMod()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Mod();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getIsOf <em>Is Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Of</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getIsOf()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_IsOf();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getLabeledElement <em>Labeled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labeled Element</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getLabeledElement()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_LabeledElement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getLabeledElementReference <em>Labeled Element Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labeled Element Reference</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getLabeledElementReference()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_LabeledElementReference();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getNull <em>Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Null</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getNull()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Null();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getModelElementPath <em>Model Element Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Model Element Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getModelElementPath()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EAttribute getTTwoChildrenExpression_ModelElementPath();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getNavigationPropertyPath <em>Navigation Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Navigation Property Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getNavigationPropertyPath()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EAttribute getTTwoChildrenExpression_NavigationPropertyPath();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getPath()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EAttribute getTTwoChildrenExpression_Path();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getPropertyPath <em>Property Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Property Path</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getPropertyPath()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EAttribute getTTwoChildrenExpression_PropertyPath();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getRecord()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Record();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getUrlRef <em>Url Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Url Ref</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getUrlRef()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_UrlRef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getAnnotation1 <em>Annotation1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTwoChildrenExpression#getAnnotation1()
	 * @see #getTTwoChildrenExpression()
	 * @generated
	 */
	EReference getTTwoChildrenExpression_Annotation1();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition <em>TType Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TType Definition</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTypeDefinition
	 * @generated
	 */
	EClass getTTypeDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getAnnotation()
	 * @see #getTTypeDefinition()
	 * @generated
	 */
	EReference getTTypeDefinition_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getMaxLength()
	 * @see #getTTypeDefinition()
	 * @generated
	 */
	EAttribute getTTypeDefinition_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getName()
	 * @see #getTTypeDefinition()
	 * @generated
	 */
	EAttribute getTTypeDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getPrecision()
	 * @see #getTTypeDefinition()
	 * @generated
	 */
	EAttribute getTTypeDefinition_Precision();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getScale()
	 * @see #getTTypeDefinition()
	 * @generated
	 */
	EAttribute getTTypeDefinition_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getSRID <em>SRID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SRID</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getSRID()
	 * @see #getTTypeDefinition()
	 * @generated
	 */
	EAttribute getTTypeDefinition_SRID();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getUnderlyingType <em>Underlying Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Underlying Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTypeDefinition#getUnderlyingType()
	 * @see #getTTypeDefinition()
	 * @generated
	 */
	EAttribute getTTypeDefinition_UnderlyingType();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edm.TTypeDefinition#isUnicode <em>Unicode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unicode</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TTypeDefinition#isUnicode()
	 * @see #getTTypeDefinition()
	 * @generated
	 */
	EAttribute getTTypeDefinition_Unicode();

	/**
	 * Returns the meta object for enum '{@link org.open.oasis.docs.odata.ns.edm.TAbstractType <em>TAbstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TAbstract Type</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TAbstractType
	 * @generated
	 */
	EEnum getTAbstractType();

	/**
	 * Returns the meta object for enum '{@link org.open.oasis.docs.odata.ns.edm.TAppliesToElementsItem <em>TApplies To Elements Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TApplies To Elements Item</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TAppliesToElementsItem
	 * @generated
	 */
	EEnum getTAppliesToElementsItem();

	/**
	 * Returns the meta object for enum '{@link org.open.oasis.docs.odata.ns.edm.TClientFunctionMember1 <em>TClient Function Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TClient Function Member1</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TClientFunctionMember1
	 * @generated
	 */
	EEnum getTClientFunctionMember1();

	/**
	 * Returns the meta object for enum '{@link org.open.oasis.docs.odata.ns.edm.TFloating <em>TFloating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TFloating</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TFloating
	 * @generated
	 */
	EEnum getTFloating();

	/**
	 * Returns the meta object for enum '{@link org.open.oasis.docs.odata.ns.edm.TMax <em>TMax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TMax</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TMax
	 * @generated
	 */
	EEnum getTMax();

	/**
	 * Returns the meta object for enum '{@link org.open.oasis.docs.odata.ns.edm.TOnDeleteAction <em>TOn Delete Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TOn Delete Action</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOnDeleteAction
	 * @generated
	 */
	EEnum getTOnDeleteAction();

	/**
	 * Returns the meta object for enum '{@link org.open.oasis.docs.odata.ns.edm.TPrimitiveTypeMember0 <em>TPrimitive Type Member0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TPrimitive Type Member0</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPrimitiveTypeMember0
	 * @generated
	 */
	EEnum getTPrimitiveTypeMember0();

	/**
	 * Returns the meta object for enum '{@link org.open.oasis.docs.odata.ns.edm.TVariable <em>TVariable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TVariable</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TVariable
	 * @generated
	 */
	EEnum getTVariable();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Binary</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='binary' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='([A-Za-z0-9_\\-]{4})*([A-Za-z0-9_\\-]{3}[A-Za-z0-9_\\-]|[A-Za-z0-9_\\-]{2}[AEIMQUYcgkosw048]=?|[A-Za-z0-9_\\-][AQgw](==)?)?'"
	 * @generated
	 */
	EDataType getBinary();

	/**
	 * Returns the meta object for data type '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @model instanceClass="boolean"
	 *        extendedMetaData="name='boolean' baseType='http://www.eclipse.org/emf/2003/XMLType#boolean' pattern='true|false'"
	 * @generated
	 */
	EDataType getBoolean();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="name='boolean:Object' baseType='boolean'"
	 * @generated
	 */
	EDataType getBooleanObject();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='date' baseType='http://www.eclipse.org/emf/2003/XMLType#date' pattern='[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]'"
	 * @generated
	 */
	EDataType getDate();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Date Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Time Stamp</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='dateTimeStamp' baseType='http://www.eclipse.org/emf/2003/XMLType#dateTime' pattern='.*([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]{1,12})?(Z|(\\+|-)[0-9][0-9]:[0-9][0-9])'"
	 * @generated
	 */
	EDataType getDateTimeStamp();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.Duration <em>Day Time Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Day Time Duration</em>'.
	 * @see javax.xml.datatype.Duration
	 * @model instanceClass="javax.xml.datatype.Duration"
	 *        extendedMetaData="name='dayTimeDuration' baseType='http://www.eclipse.org/emf/2003/XMLType#duration' pattern='[^YM]*[DT].*'"
	 * @generated
	 */
	EDataType getDayTimeDuration();

	/**
	 * Returns the meta object for data type '{@link org.open.oasis.docs.odata.ns.edm.TAbstractType <em>TAbstract Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TAbstract Type Object</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TAbstractType
	 * @model instanceClass="org.open.oasis.docs.odata.ns.edm.TAbstractType"
	 *        extendedMetaData="name='TAbstractType:Object' baseType='TAbstractType'"
	 * @generated
	 */
	EDataType getTAbstractTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>TApplies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TApplies To</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='TAppliesTo' memberTypes='TAppliesToElements TSimpleIdentifier'"
	 * @generated
	 */
	EDataType getTAppliesTo();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>TApplies To Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TApplies To Elements</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='TAppliesToElements' itemType='TAppliesToElements_._item'"
	 * @generated
	 */
	EDataType getTAppliesToElements();

	/**
	 * Returns the meta object for data type '{@link org.open.oasis.docs.odata.ns.edm.TAppliesToElementsItem <em>TApplies To Elements Item Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TApplies To Elements Item Object</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TAppliesToElementsItem
	 * @model instanceClass="org.open.oasis.docs.odata.ns.edm.TAppliesToElementsItem"
	 *        extendedMetaData="name='TAppliesToElements_._item:Object' baseType='TAppliesToElements_._item'"
	 * @generated
	 */
	EDataType getTAppliesToElementsItemObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>TClient Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TClient Function</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='TClientFunction' memberTypes='TQualifiedName TClientFunction_._member_._1'"
	 * @generated
	 */
	EDataType getTClientFunction();

	/**
	 * Returns the meta object for data type '{@link org.open.oasis.docs.odata.ns.edm.TClientFunctionMember1 <em>TClient Function Member1 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TClient Function Member1 Object</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TClientFunctionMember1
	 * @model instanceClass="org.open.oasis.docs.odata.ns.edm.TClientFunctionMember1"
	 *        extendedMetaData="name='TClientFunction_._member_._1:Object' baseType='TClientFunction_._member_._1'"
	 * @generated
	 */
	EDataType getTClientFunctionMember1Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TDecimal Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TDecimal Literal</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TDecimalLiteral' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='(\\+|-)?[0-9]+(\\.[0-9]+)?([Ee](\\+|-)?[0-9]+)?|-?INF|NaN'"
	 * @generated
	 */
	EDataType getTDecimalLiteral();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>TEnum Member List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TEnum Member List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='TEnumMemberList' itemType='TPath'"
	 * @generated
	 */
	EDataType getTEnumMemberList();

	/**
	 * Returns the meta object for data type '{@link org.open.oasis.docs.odata.ns.edm.TFloating <em>TFloating Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TFloating Object</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TFloating
	 * @model instanceClass="org.open.oasis.docs.odata.ns.edm.TFloating"
	 *        extendedMetaData="name='TFloating:Object' baseType='TFloating'"
	 * @generated
	 */
	EDataType getTFloatingObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TGuid Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TGuid Literal</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TGuidLiteral' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}'"
	 * @generated
	 */
	EDataType getTGuidLiteral();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='time' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='([01][0-9]|2[0-3]):[0-5][0-9](:[0-5][0-9](\\.[0-9]{1,12})?)?'"
	 * @generated
	 */
	EDataType getTime();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TInstance Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TInstance Path</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TInstancePath' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getTInstancePath();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>TMax Length Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TMax Length Facet</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='TMaxLengthFacet' memberTypes='TMax http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger'"
	 * @generated
	 */
	EDataType getTMaxLengthFacet();

	/**
	 * Returns the meta object for data type '{@link org.open.oasis.docs.odata.ns.edm.TMax <em>TMax Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TMax Object</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TMax
	 * @model instanceClass="org.open.oasis.docs.odata.ns.edm.TMax"
	 *        extendedMetaData="name='TMax:Object' baseType='TMax'"
	 * @generated
	 */
	EDataType getTMaxObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TModel Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TModel Path</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TModelPath' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='(/?@?[\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}(([\\./#@]|/@)[\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}){0,}(/$count)?)?'"
	 * @generated
	 */
	EDataType getTModelPath();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TNamespace Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TNamespace Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TNamespaceName' baseType='http://www.eclipse.org/emf/2003/XMLType#NCName' maxLength='511' pattern='[\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}(\\.[\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}){0,}'"
	 * @generated
	 */
	EDataType getTNamespaceName();

	/**
	 * Returns the meta object for data type '{@link org.open.oasis.docs.odata.ns.edm.TOnDeleteAction <em>TOn Delete Action Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TOn Delete Action Object</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TOnDeleteAction
	 * @model instanceClass="org.open.oasis.docs.odata.ns.edm.TOnDeleteAction"
	 *        extendedMetaData="name='TOnDeleteAction:Object' baseType='TOnDeleteAction'"
	 * @generated
	 */
	EDataType getTOnDeleteActionObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TPath</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TPath</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TPath' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}([\\./][\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}){0,}'"
	 * @generated
	 */
	EDataType getTPath();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>TPrecision Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TPrecision Facet</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='TPrecisionFacet' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger'"
	 * @generated
	 */
	EDataType getTPrecisionFacet();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>TPrimitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TPrimitive Type</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='TPrimitiveType' memberTypes='TPrimitiveType_._member_._0 TPrimitiveType_._member_._1'"
	 * @generated
	 */
	EDataType getTPrimitiveType();

	/**
	 * Returns the meta object for data type '{@link org.open.oasis.docs.odata.ns.edm.TPrimitiveTypeMember0 <em>TPrimitive Type Member0 Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TPrimitive Type Member0 Object</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TPrimitiveTypeMember0
	 * @model instanceClass="org.open.oasis.docs.odata.ns.edm.TPrimitiveTypeMember0"
	 *        extendedMetaData="name='TPrimitiveType_._member_._0:Object' baseType='TPrimitiveType_._member_._0'"
	 * @generated
	 */
	EDataType getTPrimitiveTypeMember0Object();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TPrimitive Type Member1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TPrimitive Type Member1</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TPrimitiveType_._member_._1' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='Edm\\..+'"
	 * @generated
	 */
	EDataType getTPrimitiveTypeMember1();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TQualified Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TQualified Name</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TQualifiedName' baseType='http://www.eclipse.org/emf/2003/XMLType#NCName' pattern='[\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}(\\.[\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}){1,}'"
	 * @generated
	 */
	EDataType getTQualifiedName();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>TScale Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TScale Facet</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='TScaleFacet' memberTypes='TFloating TVariable http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger'"
	 * @generated
	 */
	EDataType getTScaleFacet();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TSimple Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TSimple Identifier</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TSimpleIdentifier' baseType='http://www.eclipse.org/emf/2003/XMLType#NCName' maxLength='128' pattern='[\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}'"
	 * @generated
	 */
	EDataType getTSimpleIdentifier();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>TSrid Facet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TSrid Facet</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='TSridFacet' memberTypes='TVariable http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger'"
	 * @generated
	 */
	EDataType getTSridFacet();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TTarget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TTarget</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TTarget' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}(([\\.\\(,#]|/@?)(\\)|[\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}\\)?)){0,}(/$ReturnType)?'"
	 * @generated
	 */
	EDataType getTTarget();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>TType Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TType Name</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        extendedMetaData="name='TTypeName' memberTypes='TPrimitiveType TAbstractType TQualifiedName TTypeName_._member_._3'"
	 * @generated
	 */
	EDataType getTTypeName();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>TType Name Member3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TType Name Member3</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='TTypeName_._member_._3' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='Collection\\([\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}(\\.[\\p{L}\\p{Nl}_][\\p{L}\\p{Nl}\\p{Nd}\\p{Mn}\\p{Mc}\\p{Pc}\\p{Cf}]{0,}){1,}\\)'"
	 * @generated
	 */
	EDataType getTTypeNameMember3();

	/**
	 * Returns the meta object for data type '<em>TUnicode Facet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TUnicode Facet</em>'.
	 * @model instanceClass="boolean"
	 *        extendedMetaData="name='TUnicodeFacet' baseType='http://www.eclipse.org/emf/2003/XMLType#boolean'"
	 * @generated
	 */
	EDataType getTUnicodeFacet();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>TUnicode Facet Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TUnicode Facet Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="name='TUnicodeFacet:Object' baseType='TUnicodeFacet'"
	 * @generated
	 */
	EDataType getTUnicodeFacetObject();

	/**
	 * Returns the meta object for data type '{@link org.open.oasis.docs.odata.ns.edm.TVariable <em>TVariable Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TVariable Object</em>'.
	 * @see org.open.oasis.docs.odata.ns.edm.TVariable
	 * @model instanceClass="org.open.oasis.docs.odata.ns.edm.TVariable"
	 *        extendedMetaData="name='TVariable:Object' baseType='TVariable'"
	 * @generated
	 */
	EDataType getTVariableObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EdmFactory getEdmFactory();

} //EdmPackage
