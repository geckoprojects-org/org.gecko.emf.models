/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
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
package net.opengis.kml;


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
 * XML Schema Document for OGC KML version 2.2. Copyright (c)
 *       2008 Open Geospatial Consortium.
 *     
 * There is no official atom XSD. This XSD is created based on:
 *       http://atompub.org/2005/08/17/atom.rnc. A subset of Atom as used in the
 *       ogckml22.xsd is defined here. 
 * xAL: eXtensible Address Language 
 * This is an XML document type definition (DTD) for
 * defining addresses.
 * Original Date of Creation: 1 March 2001
 * Copyright(c) 2000, OASIS. All Rights Reserved [http://www.oasis-open.org]
 * Contact: Customer Information Quality Technical Committee, OASIS
 * http://www.oasis-open.org/committees/ciq
 * VERSION: 2.0 [MAJOR RELEASE] Date of Creation: 01 May 2002
 * Last Update: 24 July 2002
 * Previous Version: 1.3
 * Common Attributes:Type - If not documented then it means, possible values of Type not limited to: Official, Unique, Abbreviation, OldName, Synonym
 * Code:Address element codes are used by groups like postal groups like ECCMA, ADIS, UN/PROLIST for postal services
 * <!-- end-model-doc -->
 * @see net.opengis.kml.KMLFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = KMLPackage.eNS_URI, genModel = "/model/ogckml22.genmodel", genModelSourceLocations = {"model/ogckml22.genmodel","net.opengis.kml.model/model/ogckml22.genmodel"}, ecore="/model/kml-2.2.ecore", ecoreSourceLocations="/model/kml-2.2.ecore")
public interface KMLPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengis.net/kml/2.2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KMLPackage eINSTANCE = net.opengis.kml.impl.KMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.AbstractObjectTypeImpl <em>Abstract Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.AbstractObjectTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAbstractObjectType()
	 * @generated
	 */
	int ABSTRACT_OBJECT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT_TYPE__TARGET_ID = 3;

	/**
	 * The number of structural features of the '<em>Abstract Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Abstract Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.AbstractSubStyleTypeImpl <em>Abstract Sub Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.AbstractSubStyleTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAbstractSubStyleType()
	 * @generated
	 */
	int ABSTRACT_SUB_STYLE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SUB_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SUB_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SUB_STYLE_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SUB_STYLE_TYPE__TARGET_ID = ABSTRACT_OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Sub Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Abstract Sub Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SUB_STYLE_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.AbstractColorStyleTypeImpl <em>Abstract Color Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.AbstractColorStyleTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAbstractColorStyleType()
	 * @generated
	 */
	int ABSTRACT_COLOR_STYLE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COLOR_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_SUB_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COLOR_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_SUB_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COLOR_STYLE_TYPE__ID = ABSTRACT_SUB_STYLE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COLOR_STYLE_TYPE__TARGET_ID = ABSTRACT_SUB_STYLE_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP = ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP = ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COLOR_STYLE_TYPE__COLOR = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COLOR_STYLE_TYPE__COLOR_MODE = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Color Style Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Color Style Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Abstract Color Style Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract Color Style Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Abstract Color Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Abstract Color Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COLOR_STYLE_TYPE_OPERATION_COUNT = ABSTRACT_SUB_STYLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.AbstractFeatureTypeImpl <em>Abstract Feature Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.AbstractFeatureTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAbstractFeatureType()
	 * @generated
	 */
	int ABSTRACT_FEATURE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__TARGET_ID = ABSTRACT_OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__NAME = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__VISIBILITY = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__OPEN = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__AUTHOR = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__LINK = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__ADDRESS = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__ADDRESS_DETAILS = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__PHONE_NUMBER = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__SNIPPET = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Snippet1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__SNIPPET1 = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__DESCRIPTION = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Abstract View Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__ABSTRACT_VIEW_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Abstract View Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__ABSTRACT_VIEW_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__STYLE_URL = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__REGION = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__METADATA = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__EXTENDED_DATA = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Abstract Feature Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Abstract Feature Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Abstract Feature Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Abstract Feature Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 24;

	/**
	 * The number of structural features of the '<em>Abstract Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 25;

	/**
	 * The number of operations of the '<em>Abstract Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_FEATURE_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.AbstractContainerTypeImpl <em>Abstract Container Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.AbstractContainerTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAbstractContainerType()
	 * @generated
	 */
	int ABSTRACT_CONTAINER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_FEATURE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__ID = ABSTRACT_FEATURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__TARGET_ID = ABSTRACT_FEATURE_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__NAME = ABSTRACT_FEATURE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__VISIBILITY = ABSTRACT_FEATURE_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__OPEN = ABSTRACT_FEATURE_TYPE__OPEN;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__AUTHOR = ABSTRACT_FEATURE_TYPE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__LINK = ABSTRACT_FEATURE_TYPE__LINK;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__ADDRESS = ABSTRACT_FEATURE_TYPE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__ADDRESS_DETAILS = ABSTRACT_FEATURE_TYPE__ADDRESS_DETAILS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__PHONE_NUMBER = ABSTRACT_FEATURE_TYPE__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__SNIPPET = ABSTRACT_FEATURE_TYPE__SNIPPET;

	/**
	 * The feature id for the '<em><b>Snippet1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__SNIPPET1 = ABSTRACT_FEATURE_TYPE__SNIPPET1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__DESCRIPTION = ABSTRACT_FEATURE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Abstract View Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__ABSTRACT_VIEW_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_VIEW_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract View Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__ABSTRACT_VIEW_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_VIEW_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__STYLE_URL = ABSTRACT_FEATURE_TYPE__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__REGION = ABSTRACT_FEATURE_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__METADATA = ABSTRACT_FEATURE_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__EXTENDED_DATA = ABSTRACT_FEATURE_TYPE__EXTENDED_DATA;

	/**
	 * The feature id for the '<em><b>Abstract Feature Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Container Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Container Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Container Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Container Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_OBJECT_EXTENSION_GROUP = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Container Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE_FEATURE_COUNT = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Abstract Container Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTAINER_TYPE_OPERATION_COUNT = ABSTRACT_FEATURE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.AbstractGeometryTypeImpl <em>Abstract Geometry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.AbstractGeometryTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAbstractGeometryType()
	 * @generated
	 */
	int ABSTRACT_GEOMETRY_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GEOMETRY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GEOMETRY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GEOMETRY_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GEOMETRY_TYPE__TARGET_ID = ABSTRACT_OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Geometry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Abstract Geometry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GEOMETRY_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.AbstractLatLonBoxTypeImpl <em>Abstract Lat Lon Box Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.AbstractLatLonBoxTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAbstractLatLonBoxType()
	 * @generated
	 */
	int ABSTRACT_LAT_LON_BOX_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LAT_LON_BOX_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LAT_LON_BOX_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LAT_LON_BOX_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LAT_LON_BOX_TYPE__TARGET_ID = ABSTRACT_OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>North</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LAT_LON_BOX_TYPE__NORTH = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>South</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LAT_LON_BOX_TYPE__SOUTH = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>East</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LAT_LON_BOX_TYPE__EAST = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>West</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LAT_LON_BOX_TYPE__WEST = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Abstract Lat Lon Box Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract Lat Lon Box Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Abstract Lat Lon Box Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Abstract Lat Lon Box Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_OBJECT_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Abstract Lat Lon Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LAT_LON_BOX_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Abstract Lat Lon Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_LAT_LON_BOX_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.AbstractOverlayTypeImpl <em>Abstract Overlay Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.AbstractOverlayTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAbstractOverlayType()
	 * @generated
	 */
	int ABSTRACT_OVERLAY_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_FEATURE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__ID = ABSTRACT_FEATURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__TARGET_ID = ABSTRACT_FEATURE_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__NAME = ABSTRACT_FEATURE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__VISIBILITY = ABSTRACT_FEATURE_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__OPEN = ABSTRACT_FEATURE_TYPE__OPEN;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__AUTHOR = ABSTRACT_FEATURE_TYPE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__LINK = ABSTRACT_FEATURE_TYPE__LINK;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__ADDRESS = ABSTRACT_FEATURE_TYPE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__ADDRESS_DETAILS = ABSTRACT_FEATURE_TYPE__ADDRESS_DETAILS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__PHONE_NUMBER = ABSTRACT_FEATURE_TYPE__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__SNIPPET = ABSTRACT_FEATURE_TYPE__SNIPPET;

	/**
	 * The feature id for the '<em><b>Snippet1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__SNIPPET1 = ABSTRACT_FEATURE_TYPE__SNIPPET1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__DESCRIPTION = ABSTRACT_FEATURE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Abstract View Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__ABSTRACT_VIEW_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_VIEW_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract View Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__ABSTRACT_VIEW_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_VIEW_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__STYLE_URL = ABSTRACT_FEATURE_TYPE__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__REGION = ABSTRACT_FEATURE_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__METADATA = ABSTRACT_FEATURE_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__EXTENDED_DATA = ABSTRACT_FEATURE_TYPE__EXTENDED_DATA;

	/**
	 * The feature id for the '<em><b>Abstract Feature Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__COLOR = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Draw Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__DRAW_ORDER = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__ICON = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Overlay Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Abstract Overlay Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract Overlay Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Abstract Overlay Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Abstract Overlay Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Abstract Overlay Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OVERLAY_TYPE_OPERATION_COUNT = ABSTRACT_FEATURE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.AbstractStyleSelectorTypeImpl <em>Abstract Style Selector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.AbstractStyleSelectorTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAbstractStyleSelectorType()
	 * @generated
	 */
	int ABSTRACT_STYLE_SELECTOR_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STYLE_SELECTOR_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STYLE_SELECTOR_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STYLE_SELECTOR_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STYLE_SELECTOR_TYPE__TARGET_ID = ABSTRACT_OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_OBJECT_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Style Selector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STYLE_SELECTOR_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Abstract Style Selector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STYLE_SELECTOR_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.AbstractTimePrimitiveTypeImpl <em>Abstract Time Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.AbstractTimePrimitiveTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAbstractTimePrimitiveType()
	 * @generated
	 */
	int ABSTRACT_TIME_PRIMITIVE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_PRIMITIVE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_PRIMITIVE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_PRIMITIVE_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_PRIMITIVE_TYPE__TARGET_ID = ABSTRACT_OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_OBJECT_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract Time Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_PRIMITIVE_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Abstract Time Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TIME_PRIMITIVE_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.AbstractViewTypeImpl <em>Abstract View Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.AbstractViewTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAbstractViewType()
	 * @generated
	 */
	int ABSTRACT_VIEW_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW_TYPE__TARGET_ID = ABSTRACT_OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract View Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract View Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract View Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract View Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_OBJECT_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abstract View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Abstract View Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.AliasTypeImpl <em>Alias Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.AliasTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAliasType()
	 * @generated
	 */
	int ALIAS_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE__TARGET_ID = ABSTRACT_OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Target Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE__TARGET_HREF = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE__SOURCE_HREF = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alias Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE__ALIAS_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alias Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE__ALIAS_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alias Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE__ALIAS_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Alias Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE__ALIAS_OBJECT_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Alias Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Alias Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.BalloonStyleTypeImpl <em>Balloon Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.BalloonStyleTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getBalloonStyleType()
	 * @generated
	 */
	int BALLOON_STYLE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_SUB_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_SUB_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE__ID = ABSTRACT_SUB_STYLE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE__TARGET_ID = ABSTRACT_SUB_STYLE_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP = ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP = ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE__COLOR = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bg Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE__BG_COLOR = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE__TEXT_COLOR = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE__TEXT = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Display Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE__DISPLAY_MODE = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Balloon Style Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE__BALLOON_STYLE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Balloon Style Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE__BALLOON_STYLE_SIMPLE_EXTENSION_GROUP = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Balloon Style Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE__BALLOON_STYLE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Balloon Style Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE__BALLOON_STYLE_OBJECT_EXTENSION_GROUP = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Balloon Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE_FEATURE_COUNT = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Balloon Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOON_STYLE_TYPE_OPERATION_COUNT = ABSTRACT_SUB_STYLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.BasicLinkTypeImpl <em>Basic Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.BasicLinkTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getBasicLinkType()
	 * @generated
	 */
	int BASIC_LINK_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LINK_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LINK_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LINK_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LINK_TYPE__TARGET_ID = ABSTRACT_OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LINK_TYPE__HREF = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Basic Link Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LINK_TYPE__BASIC_LINK_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Basic Link Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LINK_TYPE__BASIC_LINK_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Basic Link Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LINK_TYPE__BASIC_LINK_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Basic Link Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LINK_TYPE__BASIC_LINK_OBJECT_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Basic Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LINK_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Basic Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LINK_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.BoundaryTypeImpl <em>Boundary Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.BoundaryTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getBoundaryType()
	 * @generated
	 */
	int BOUNDARY_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Linear Ring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_TYPE__LINEAR_RING = 0;

	/**
	 * The feature id for the '<em><b>Boundary Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_TYPE__BOUNDARY_SIMPLE_EXTENSION_GROUP_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Boundary Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_TYPE__BOUNDARY_SIMPLE_EXTENSION_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Boundary Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_TYPE__BOUNDARY_OBJECT_EXTENSION_GROUP_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Boundary Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_TYPE__BOUNDARY_OBJECT_EXTENSION_GROUP = 4;

	/**
	 * The number of structural features of the '<em>Boundary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Boundary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.CameraTypeImpl <em>Camera Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.CameraTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getCameraType()
	 * @generated
	 */
	int CAMERA_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_VIEW_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_VIEW_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TYPE__ID = ABSTRACT_VIEW_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TYPE__TARGET_ID = ABSTRACT_VIEW_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract View Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TYPE__ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract View Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TYPE__ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP = ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract View Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TYPE__ABSTRACT_VIEW_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract View Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TYPE__ABSTRACT_VIEW_OBJECT_EXTENSION_GROUP = ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TYPE__LONGITUDE = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TYPE__LATITUDE = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TYPE__ALTITUDE = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TYPE__HEADING = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tilt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TYPE__TILT = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TYPE__ROLL = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Altitude Mode Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TYPE__ALTITUDE_MODE_GROUP_GROUP = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Altitude Mode Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TYPE__ALTITUDE_MODE_GROUP = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Camera Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TYPE__CAMERA_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Camera Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TYPE__CAMERA_SIMPLE_EXTENSION_GROUP = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Camera Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TYPE__CAMERA_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Camera Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TYPE__CAMERA_OBJECT_EXTENSION_GROUP = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Camera Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TYPE_FEATURE_COUNT = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Camera Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_TYPE_OPERATION_COUNT = ABSTRACT_VIEW_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.ChangeTypeImpl <em>Change Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.ChangeTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getChangeType()
	 * @generated
	 */
	int CHANGE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Abstract Object Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE__ABSTRACT_OBJECT_GROUP_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Abstract Object Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE__ABSTRACT_OBJECT_GROUP = 1;

	/**
	 * The number of structural features of the '<em>Change Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Change Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.CreateTypeImpl <em>Create Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.CreateTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getCreateType()
	 * @generated
	 */
	int CREATE_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Abstract Container Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TYPE__ABSTRACT_CONTAINER_GROUP_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Abstract Container Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TYPE__ABSTRACT_CONTAINER_GROUP = 1;

	/**
	 * The number of structural features of the '<em>Create Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Create Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.DataTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TARGET_ID = ABSTRACT_OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DISPLAY_NAME = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__VALUE = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DATA_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Data Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DATA_EXTENSION = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.DeleteTypeImpl <em>Delete Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.DeleteTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getDeleteType()
	 * @generated
	 */
	int DELETE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Abstract Feature Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TYPE__ABSTRACT_FEATURE_GROUP_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Abstract Feature Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TYPE__ABSTRACT_FEATURE_GROUP = 1;

	/**
	 * The number of structural features of the '<em>Delete Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Delete Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.DocumentRootImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 20;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Abstract Color Style Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_COLOR_STYLE_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_SUB_STYLE_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Abstract Object Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_OBJECT_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Abstract Color Style Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Abstract Color Style Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Abstract Container Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_CONTAINER_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Abstract Feature Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_FEATURE_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Abstract Container Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_CONTAINER_OBJECT_EXTENSION_GROUP = 10;

	/**
	 * The feature id for the '<em><b>Abstract Container Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Abstract Feature Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP = 12;

	/**
	 * The feature id for the '<em><b>Abstract Feature Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP = 13;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_GEOMETRY_GROUP = 14;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP = 15;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP = 16;

	/**
	 * The feature id for the '<em><b>Abstract Lat Lon Box Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_LAT_LON_BOX_OBJECT_EXTENSION_GROUP = 17;

	/**
	 * The feature id for the '<em><b>Abstract Lat Lon Box Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP = 18;

	/**
	 * The feature id for the '<em><b>Abstract Overlay Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_OVERLAY_GROUP = 19;

	/**
	 * The feature id for the '<em><b>Abstract Overlay Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP = 20;

	/**
	 * The feature id for the '<em><b>Abstract Overlay Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP = 21;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_STYLE_SELECTOR_GROUP = 22;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_STYLE_SELECTOR_OBJECT_EXTENSION_GROUP = 23;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP = 24;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP = 25;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP = 26;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_TIME_PRIMITIVE_GROUP = 27;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_TIME_PRIMITIVE_OBJECT_EXTENSION_GROUP = 28;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP = 29;

	/**
	 * The feature id for the '<em><b>Abstract View Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_VIEW_GROUP = 30;

	/**
	 * The feature id for the '<em><b>Abstract View Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_VIEW_OBJECT_EXTENSION_GROUP = 31;

	/**
	 * The feature id for the '<em><b>Abstract View Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP = 32;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADDRESS = 33;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALIAS = 34;

	/**
	 * The feature id for the '<em><b>Alias Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALIAS_OBJECT_EXTENSION_GROUP = 35;

	/**
	 * The feature id for the '<em><b>Alias Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALIAS_SIMPLE_EXTENSION_GROUP = 36;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALTITUDE = 37;

	/**
	 * The feature id for the '<em><b>Altitude Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALTITUDE_MODE = 38;

	/**
	 * The feature id for the '<em><b>Altitude Mode Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ALTITUDE_MODE_GROUP = 39;

	/**
	 * The feature id for the '<em><b>Balloon Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BALLOON_STYLE = 40;

	/**
	 * The feature id for the '<em><b>Balloon Style Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BALLOON_STYLE_OBJECT_EXTENSION_GROUP = 41;

	/**
	 * The feature id for the '<em><b>Balloon Style Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BALLOON_STYLE_SIMPLE_EXTENSION_GROUP = 42;

	/**
	 * The feature id for the '<em><b>Basic Link Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BASIC_LINK_OBJECT_EXTENSION_GROUP = 43;

	/**
	 * The feature id for the '<em><b>Basic Link Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BASIC_LINK_SIMPLE_EXTENSION_GROUP = 44;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BEGIN = 45;

	/**
	 * The feature id for the '<em><b>Bg Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BG_COLOR = 46;

	/**
	 * The feature id for the '<em><b>Bottom Fov</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOTTOM_FOV = 47;

	/**
	 * The feature id for the '<em><b>Boundary Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOUNDARY_OBJECT_EXTENSION_GROUP = 48;

	/**
	 * The feature id for the '<em><b>Boundary Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOUNDARY_SIMPLE_EXTENSION_GROUP = 49;

	/**
	 * The feature id for the '<em><b>Camera</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAMERA = 50;

	/**
	 * The feature id for the '<em><b>Camera Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAMERA_OBJECT_EXTENSION_GROUP = 51;

	/**
	 * The feature id for the '<em><b>Camera Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAMERA_SIMPLE_EXTENSION_GROUP = 52;

	/**
	 * The feature id for the '<em><b>Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHANGE = 53;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLOR = 54;

	/**
	 * The feature id for the '<em><b>Color Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLOR_MODE = 55;

	/**
	 * The feature id for the '<em><b>Cookie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COOKIE = 56;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COORDINATES = 57;

	/**
	 * The feature id for the '<em><b>Create</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CREATE = 58;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA = 59;

	/**
	 * The feature id for the '<em><b>Data Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATA_EXTENSION = 60;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DELETE = 61;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIPTION = 62;

	/**
	 * The feature id for the '<em><b>Display Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISPLAY_MODE = 63;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISPLAY_NAME = 64;

	/**
	 * The feature id for the '<em><b>Document</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENT = 65;

	/**
	 * The feature id for the '<em><b>Document Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENT_OBJECT_EXTENSION_GROUP = 66;

	/**
	 * The feature id for the '<em><b>Document Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DOCUMENT_SIMPLE_EXTENSION_GROUP = 67;

	/**
	 * The feature id for the '<em><b>Draw Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DRAW_ORDER = 68;

	/**
	 * The feature id for the '<em><b>East</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EAST = 69;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__END = 70;

	/**
	 * The feature id for the '<em><b>Expires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXPIRES = 71;

	/**
	 * The feature id for the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTENDED_DATA = 72;

	/**
	 * The feature id for the '<em><b>Extrude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXTRUDE = 73;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILL = 74;

	/**
	 * The feature id for the '<em><b>Fly To View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FLY_TO_VIEW = 75;

	/**
	 * The feature id for the '<em><b>Folder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOLDER = 76;

	/**
	 * The feature id for the '<em><b>Folder Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOLDER_OBJECT_EXTENSION_GROUP = 77;

	/**
	 * The feature id for the '<em><b>Folder Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOLDER_SIMPLE_EXTENSION_GROUP = 78;

	/**
	 * The feature id for the '<em><b>Grid Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GRID_ORIGIN = 79;

	/**
	 * The feature id for the '<em><b>Ground Overlay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GROUND_OVERLAY = 80;

	/**
	 * The feature id for the '<em><b>Ground Overlay Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GROUND_OVERLAY_OBJECT_EXTENSION_GROUP = 81;

	/**
	 * The feature id for the '<em><b>Ground Overlay Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GROUND_OVERLAY_SIMPLE_EXTENSION_GROUP = 82;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HEADING = 83;

	/**
	 * The feature id for the '<em><b>Hot Spot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HOT_SPOT = 84;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HREF = 85;

	/**
	 * The feature id for the '<em><b>Http Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HTTP_QUERY = 86;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ICON = 87;

	/**
	 * The feature id for the '<em><b>Icon Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ICON_STYLE = 88;

	/**
	 * The feature id for the '<em><b>Icon Style Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ICON_STYLE_OBJECT_EXTENSION_GROUP = 89;

	/**
	 * The feature id for the '<em><b>Icon Style Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ICON_STYLE_SIMPLE_EXTENSION_GROUP = 90;

	/**
	 * The feature id for the '<em><b>Image Pyramid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMAGE_PYRAMID = 91;

	/**
	 * The feature id for the '<em><b>Image Pyramid Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMAGE_PYRAMID_OBJECT_EXTENSION_GROUP = 92;

	/**
	 * The feature id for the '<em><b>Image Pyramid Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMAGE_PYRAMID_SIMPLE_EXTENSION_GROUP = 93;

	/**
	 * The feature id for the '<em><b>Inner Boundary Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INNER_BOUNDARY_IS = 94;

	/**
	 * The feature id for the '<em><b>Item Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ITEM_ICON = 95;

	/**
	 * The feature id for the '<em><b>Item Icon Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ITEM_ICON_OBJECT_EXTENSION_GROUP = 96;

	/**
	 * The feature id for the '<em><b>Item Icon Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ITEM_ICON_SIMPLE_EXTENSION_GROUP = 97;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEY = 98;

	/**
	 * The feature id for the '<em><b>Kml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KML = 99;

	/**
	 * The feature id for the '<em><b>Kml Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KML_OBJECT_EXTENSION_GROUP = 100;

	/**
	 * The feature id for the '<em><b>Kml Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KML_SIMPLE_EXTENSION_GROUP = 101;

	/**
	 * The feature id for the '<em><b>Label Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LABEL_STYLE = 102;

	/**
	 * The feature id for the '<em><b>Label Style Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LABEL_STYLE_OBJECT_EXTENSION_GROUP = 103;

	/**
	 * The feature id for the '<em><b>Label Style Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LABEL_STYLE_SIMPLE_EXTENSION_GROUP = 104;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LATITUDE = 105;

	/**
	 * The feature id for the '<em><b>Lat Lon Alt Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAT_LON_ALT_BOX = 106;

	/**
	 * The feature id for the '<em><b>Lat Lon Alt Box Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAT_LON_ALT_BOX_OBJECT_EXTENSION_GROUP = 107;

	/**
	 * The feature id for the '<em><b>Lat Lon Alt Box Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAT_LON_ALT_BOX_SIMPLE_EXTENSION_GROUP = 108;

	/**
	 * The feature id for the '<em><b>Lat Lon Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAT_LON_BOX = 109;

	/**
	 * The feature id for the '<em><b>Lat Lon Box Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAT_LON_BOX_OBJECT_EXTENSION_GROUP = 110;

	/**
	 * The feature id for the '<em><b>Lat Lon Box Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LAT_LON_BOX_SIMPLE_EXTENSION_GROUP = 111;

	/**
	 * The feature id for the '<em><b>Left Fov</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LEFT_FOV = 112;

	/**
	 * The feature id for the '<em><b>Linear Ring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINEAR_RING = 113;

	/**
	 * The feature id for the '<em><b>Linear Ring Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINEAR_RING_OBJECT_EXTENSION_GROUP = 114;

	/**
	 * The feature id for the '<em><b>Linear Ring Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINEAR_RING_SIMPLE_EXTENSION_GROUP = 115;

	/**
	 * The feature id for the '<em><b>Line String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINE_STRING = 116;

	/**
	 * The feature id for the '<em><b>Line String Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINE_STRING_OBJECT_EXTENSION_GROUP = 117;

	/**
	 * The feature id for the '<em><b>Line String Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINE_STRING_SIMPLE_EXTENSION_GROUP = 118;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINE_STYLE = 119;

	/**
	 * The feature id for the '<em><b>Line Style Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINE_STYLE_OBJECT_EXTENSION_GROUP = 120;

	/**
	 * The feature id for the '<em><b>Line Style Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINE_STYLE_SIMPLE_EXTENSION_GROUP = 121;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINK = 122;

	/**
	 * The feature id for the '<em><b>Link Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINK_DESCRIPTION = 123;

	/**
	 * The feature id for the '<em><b>Link Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINK_NAME = 124;

	/**
	 * The feature id for the '<em><b>Link Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINK_OBJECT_EXTENSION_GROUP = 125;

	/**
	 * The feature id for the '<em><b>Link Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINK_SIMPLE_EXTENSION_GROUP = 126;

	/**
	 * The feature id for the '<em><b>Link Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINK_SNIPPET = 127;

	/**
	 * The feature id for the '<em><b>List Item Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_ITEM_TYPE = 128;

	/**
	 * The feature id for the '<em><b>List Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_STYLE = 129;

	/**
	 * The feature id for the '<em><b>List Style Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_STYLE_OBJECT_EXTENSION_GROUP = 130;

	/**
	 * The feature id for the '<em><b>List Style Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LIST_STYLE_SIMPLE_EXTENSION_GROUP = 131;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCATION = 132;

	/**
	 * The feature id for the '<em><b>Location Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCATION_OBJECT_EXTENSION_GROUP = 133;

	/**
	 * The feature id for the '<em><b>Location Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCATION_SIMPLE_EXTENSION_GROUP = 134;

	/**
	 * The feature id for the '<em><b>Lod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOD = 135;

	/**
	 * The feature id for the '<em><b>Lod Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOD_OBJECT_EXTENSION_GROUP = 136;

	/**
	 * The feature id for the '<em><b>Lod Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOD_SIMPLE_EXTENSION_GROUP = 137;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LONGITUDE = 138;

	/**
	 * The feature id for the '<em><b>Look At</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOOK_AT = 139;

	/**
	 * The feature id for the '<em><b>Look At Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOOK_AT_OBJECT_EXTENSION_GROUP = 140;

	/**
	 * The feature id for the '<em><b>Look At Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOOK_AT_SIMPLE_EXTENSION_GROUP = 141;

	/**
	 * The feature id for the '<em><b>Max Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAX_ALTITUDE = 142;

	/**
	 * The feature id for the '<em><b>Max Fade Extent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAX_FADE_EXTENT = 143;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAX_HEIGHT = 144;

	/**
	 * The feature id for the '<em><b>Max Lod Pixels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAX_LOD_PIXELS = 145;

	/**
	 * The feature id for the '<em><b>Max Session Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAX_SESSION_LENGTH = 146;

	/**
	 * The feature id for the '<em><b>Max Snippet Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAX_SNIPPET_LINES = 147;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MAX_WIDTH = 148;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MESSAGE = 149;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__METADATA = 150;

	/**
	 * The feature id for the '<em><b>Min Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIN_ALTITUDE = 151;

	/**
	 * The feature id for the '<em><b>Min Fade Extent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIN_FADE_EXTENT = 152;

	/**
	 * The feature id for the '<em><b>Min Lod Pixels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIN_LOD_PIXELS = 153;

	/**
	 * The feature id for the '<em><b>Min Refresh Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIN_REFRESH_PERIOD = 154;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODEL = 155;

	/**
	 * The feature id for the '<em><b>Model Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODEL_OBJECT_EXTENSION_GROUP = 156;

	/**
	 * The feature id for the '<em><b>Model Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MODEL_SIMPLE_EXTENSION_GROUP = 157;

	/**
	 * The feature id for the '<em><b>Multi Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MULTI_GEOMETRY = 158;

	/**
	 * The feature id for the '<em><b>Multi Geometry Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MULTI_GEOMETRY_OBJECT_EXTENSION_GROUP = 159;

	/**
	 * The feature id for the '<em><b>Multi Geometry Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MULTI_GEOMETRY_SIMPLE_EXTENSION_GROUP = 160;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NAME = 161;

	/**
	 * The feature id for the '<em><b>Near</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NEAR = 162;

	/**
	 * The feature id for the '<em><b>Network Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NETWORK_LINK = 163;

	/**
	 * The feature id for the '<em><b>Network Link Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NETWORK_LINK_CONTROL = 164;

	/**
	 * The feature id for the '<em><b>Network Link Control Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NETWORK_LINK_CONTROL_OBJECT_EXTENSION_GROUP = 165;

	/**
	 * The feature id for the '<em><b>Network Link Control Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NETWORK_LINK_CONTROL_SIMPLE_EXTENSION_GROUP = 166;

	/**
	 * The feature id for the '<em><b>Network Link Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NETWORK_LINK_OBJECT_EXTENSION_GROUP = 167;

	/**
	 * The feature id for the '<em><b>Network Link Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NETWORK_LINK_SIMPLE_EXTENSION_GROUP = 168;

	/**
	 * The feature id for the '<em><b>North</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NORTH = 169;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OBJECT_SIMPLE_EXTENSION_GROUP = 170;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OPEN = 171;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORIENTATION = 172;

	/**
	 * The feature id for the '<em><b>Orientation Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORIENTATION_OBJECT_EXTENSION_GROUP = 173;

	/**
	 * The feature id for the '<em><b>Orientation Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORIENTATION_SIMPLE_EXTENSION_GROUP = 174;

	/**
	 * The feature id for the '<em><b>Outer Boundary Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OUTER_BOUNDARY_IS = 175;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OUTLINE = 176;

	/**
	 * The feature id for the '<em><b>Overlay XY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OVERLAY_XY = 177;

	/**
	 * The feature id for the '<em><b>Pair</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAIR = 178;

	/**
	 * The feature id for the '<em><b>Pair Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAIR_OBJECT_EXTENSION_GROUP = 179;

	/**
	 * The feature id for the '<em><b>Pair Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PAIR_SIMPLE_EXTENSION_GROUP = 180;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PHONE_NUMBER = 181;

	/**
	 * The feature id for the '<em><b>Photo Overlay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PHOTO_OVERLAY = 182;

	/**
	 * The feature id for the '<em><b>Photo Overlay Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PHOTO_OVERLAY_OBJECT_EXTENSION_GROUP = 183;

	/**
	 * The feature id for the '<em><b>Photo Overlay Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PHOTO_OVERLAY_SIMPLE_EXTENSION_GROUP = 184;

	/**
	 * The feature id for the '<em><b>Placemark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLACEMARK = 185;

	/**
	 * The feature id for the '<em><b>Placemark Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLACEMARK_OBJECT_EXTENSION_GROUP = 186;

	/**
	 * The feature id for the '<em><b>Placemark Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLACEMARK_SIMPLE_EXTENSION_GROUP = 187;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POINT = 188;

	/**
	 * The feature id for the '<em><b>Point Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POINT_OBJECT_EXTENSION_GROUP = 189;

	/**
	 * The feature id for the '<em><b>Point Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POINT_SIMPLE_EXTENSION_GROUP = 190;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POLYGON = 191;

	/**
	 * The feature id for the '<em><b>Polygon Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POLYGON_OBJECT_EXTENSION_GROUP = 192;

	/**
	 * The feature id for the '<em><b>Polygon Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POLYGON_SIMPLE_EXTENSION_GROUP = 193;

	/**
	 * The feature id for the '<em><b>Poly Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POLY_STYLE = 194;

	/**
	 * The feature id for the '<em><b>Poly Style Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POLY_STYLE_OBJECT_EXTENSION_GROUP = 195;

	/**
	 * The feature id for the '<em><b>Poly Style Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__POLY_STYLE_SIMPLE_EXTENSION_GROUP = 196;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RANGE = 197;

	/**
	 * The feature id for the '<em><b>Refresh Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REFRESH_INTERVAL = 198;

	/**
	 * The feature id for the '<em><b>Refresh Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REFRESH_MODE = 199;

	/**
	 * The feature id for the '<em><b>Refresh Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REFRESH_VISIBILITY = 200;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGION = 201;

	/**
	 * The feature id for the '<em><b>Region Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGION_OBJECT_EXTENSION_GROUP = 202;

	/**
	 * The feature id for the '<em><b>Region Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REGION_SIMPLE_EXTENSION_GROUP = 203;

	/**
	 * The feature id for the '<em><b>Resource Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE_MAP = 204;

	/**
	 * The feature id for the '<em><b>Resource Map Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE_MAP_OBJECT_EXTENSION_GROUP = 205;

	/**
	 * The feature id for the '<em><b>Resource Map Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESOURCE_MAP_SIMPLE_EXTENSION_GROUP = 206;

	/**
	 * The feature id for the '<em><b>Right Fov</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RIGHT_FOV = 207;

	/**
	 * The feature id for the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROLL = 208;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROTATION = 209;

	/**
	 * The feature id for the '<em><b>Rotation XY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROTATION_XY = 210;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCALE = 211;

	/**
	 * The feature id for the '<em><b>Scale1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCALE1 = 212;

	/**
	 * The feature id for the '<em><b>Scale Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCALE_OBJECT_EXTENSION_GROUP = 213;

	/**
	 * The feature id for the '<em><b>Scale Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCALE_SIMPLE_EXTENSION_GROUP = 214;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCHEMA = 215;

	/**
	 * The feature id for the '<em><b>Schema Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCHEMA_DATA = 216;

	/**
	 * The feature id for the '<em><b>Schema Data Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCHEMA_DATA_EXTENSION = 217;

	/**
	 * The feature id for the '<em><b>Schema Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCHEMA_EXTENSION = 218;

	/**
	 * The feature id for the '<em><b>Screen Overlay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCREEN_OVERLAY = 219;

	/**
	 * The feature id for the '<em><b>Screen Overlay Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCREEN_OVERLAY_OBJECT_EXTENSION_GROUP = 220;

	/**
	 * The feature id for the '<em><b>Screen Overlay Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCREEN_OVERLAY_SIMPLE_EXTENSION_GROUP = 221;

	/**
	 * The feature id for the '<em><b>Screen XY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCREEN_XY = 222;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SHAPE = 223;

	/**
	 * The feature id for the '<em><b>Simple Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIMPLE_DATA = 224;

	/**
	 * The feature id for the '<em><b>Simple Field</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIMPLE_FIELD = 225;

	/**
	 * The feature id for the '<em><b>Simple Field Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIMPLE_FIELD_EXTENSION = 226;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIZE = 227;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SNIPPET = 228;

	/**
	 * The feature id for the '<em><b>Snippet1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SNIPPET1 = 229;

	/**
	 * The feature id for the '<em><b>Source Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOURCE_HREF = 230;

	/**
	 * The feature id for the '<em><b>South</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SOUTH = 231;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STATE = 232;

	/**
	 * The feature id for the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLE = 233;

	/**
	 * The feature id for the '<em><b>Style Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLE_MAP = 234;

	/**
	 * The feature id for the '<em><b>Style Map Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLE_MAP_OBJECT_EXTENSION_GROUP = 235;

	/**
	 * The feature id for the '<em><b>Style Map Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLE_MAP_SIMPLE_EXTENSION_GROUP = 236;

	/**
	 * The feature id for the '<em><b>Style Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLE_OBJECT_EXTENSION_GROUP = 237;

	/**
	 * The feature id for the '<em><b>Style Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLE_SIMPLE_EXTENSION_GROUP = 238;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STYLE_URL = 239;

	/**
	 * The feature id for the '<em><b>Target Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TARGET_HREF = 240;

	/**
	 * The feature id for the '<em><b>Tessellate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TESSELLATE = 241;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT = 242;

	/**
	 * The feature id for the '<em><b>Text Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TEXT_COLOR = 243;

	/**
	 * The feature id for the '<em><b>Tile Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TILE_SIZE = 244;

	/**
	 * The feature id for the '<em><b>Tilt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TILT = 245;

	/**
	 * The feature id for the '<em><b>Time Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TIME_SPAN = 246;

	/**
	 * The feature id for the '<em><b>Time Span Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TIME_SPAN_OBJECT_EXTENSION_GROUP = 247;

	/**
	 * The feature id for the '<em><b>Time Span Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TIME_SPAN_SIMPLE_EXTENSION_GROUP = 248;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TIME_STAMP = 249;

	/**
	 * The feature id for the '<em><b>Time Stamp Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TIME_STAMP_OBJECT_EXTENSION_GROUP = 250;

	/**
	 * The feature id for the '<em><b>Time Stamp Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TIME_STAMP_SIMPLE_EXTENSION_GROUP = 251;

	/**
	 * The feature id for the '<em><b>Top Fov</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TOP_FOV = 252;

	/**
	 * The feature id for the '<em><b>Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UPDATE = 253;

	/**
	 * The feature id for the '<em><b>Update Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UPDATE_EXTENSION_GROUP = 254;

	/**
	 * The feature id for the '<em><b>Update Op Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UPDATE_OP_EXTENSION_GROUP = 255;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__URL = 256;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VALUE = 257;

	/**
	 * The feature id for the '<em><b>View Bound Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VIEW_BOUND_SCALE = 258;

	/**
	 * The feature id for the '<em><b>View Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VIEW_FORMAT = 259;

	/**
	 * The feature id for the '<em><b>View Refresh Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VIEW_REFRESH_MODE = 260;

	/**
	 * The feature id for the '<em><b>View Refresh Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VIEW_REFRESH_TIME = 261;

	/**
	 * The feature id for the '<em><b>View Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VIEW_VOLUME = 262;

	/**
	 * The feature id for the '<em><b>View Volume Object Extension Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VIEW_VOLUME_OBJECT_EXTENSION_GROUP = 263;

	/**
	 * The feature id for the '<em><b>View Volume Simple Extension Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VIEW_VOLUME_SIMPLE_EXTENSION_GROUP = 264;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VISIBILITY = 265;

	/**
	 * The feature id for the '<em><b>West</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WEST = 266;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WHEN = 267;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WIDTH = 268;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__X = 269;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__Y = 270;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__Z = 271;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 272;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.DocumentTypeImpl <em>Document Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.DocumentTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getDocumentType()
	 * @generated
	 */
	int DOCUMENT_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_CONTAINER_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_CONTAINER_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ID = ABSTRACT_CONTAINER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__TARGET_ID = ABSTRACT_CONTAINER_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__NAME = ABSTRACT_CONTAINER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__VISIBILITY = ABSTRACT_CONTAINER_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__OPEN = ABSTRACT_CONTAINER_TYPE__OPEN;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__AUTHOR = ABSTRACT_CONTAINER_TYPE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__LINK = ABSTRACT_CONTAINER_TYPE__LINK;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ADDRESS = ABSTRACT_CONTAINER_TYPE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ADDRESS_DETAILS = ABSTRACT_CONTAINER_TYPE__ADDRESS_DETAILS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__PHONE_NUMBER = ABSTRACT_CONTAINER_TYPE__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__SNIPPET = ABSTRACT_CONTAINER_TYPE__SNIPPET;

	/**
	 * The feature id for the '<em><b>Snippet1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__SNIPPET1 = ABSTRACT_CONTAINER_TYPE__SNIPPET1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__DESCRIPTION = ABSTRACT_CONTAINER_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Abstract View Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ABSTRACT_VIEW_GROUP_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_VIEW_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract View Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ABSTRACT_VIEW_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_VIEW_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__STYLE_URL = ABSTRACT_CONTAINER_TYPE__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__REGION = ABSTRACT_CONTAINER_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__METADATA = ABSTRACT_CONTAINER_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__EXTENDED_DATA = ABSTRACT_CONTAINER_TYPE__EXTENDED_DATA;

	/**
	 * The feature id for the '<em><b>Abstract Feature Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Container Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Container Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Container Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ABSTRACT_CONTAINER_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Container Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ABSTRACT_CONTAINER_OBJECT_EXTENSION_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__SCHEMA = ABSTRACT_CONTAINER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Feature Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ABSTRACT_FEATURE_GROUP_GROUP = ABSTRACT_CONTAINER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Feature Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__ABSTRACT_FEATURE_GROUP = ABSTRACT_CONTAINER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Document Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__DOCUMENT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_CONTAINER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Document Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__DOCUMENT_SIMPLE_EXTENSION_GROUP = ABSTRACT_CONTAINER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Document Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__DOCUMENT_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_CONTAINER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Document Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE__DOCUMENT_OBJECT_EXTENSION_GROUP = ABSTRACT_CONTAINER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Document Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE_FEATURE_COUNT = ABSTRACT_CONTAINER_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Document Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_TYPE_OPERATION_COUNT = ABSTRACT_CONTAINER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.ExtendedDataTypeImpl <em>Extended Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.ExtendedDataTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getExtendedDataType()
	 * @generated
	 */
	int EXTENDED_DATA_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DATA_TYPE__DATA = 0;

	/**
	 * The feature id for the '<em><b>Schema Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DATA_TYPE__SCHEMA_DATA = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DATA_TYPE__ANY = 2;

	/**
	 * The number of structural features of the '<em>Extended Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DATA_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Extended Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDED_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.FolderTypeImpl <em>Folder Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.FolderTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getFolderType()
	 * @generated
	 */
	int FOLDER_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_CONTAINER_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_CONTAINER_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ID = ABSTRACT_CONTAINER_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__TARGET_ID = ABSTRACT_CONTAINER_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__NAME = ABSTRACT_CONTAINER_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__VISIBILITY = ABSTRACT_CONTAINER_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__OPEN = ABSTRACT_CONTAINER_TYPE__OPEN;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__AUTHOR = ABSTRACT_CONTAINER_TYPE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__LINK = ABSTRACT_CONTAINER_TYPE__LINK;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ADDRESS = ABSTRACT_CONTAINER_TYPE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ADDRESS_DETAILS = ABSTRACT_CONTAINER_TYPE__ADDRESS_DETAILS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__PHONE_NUMBER = ABSTRACT_CONTAINER_TYPE__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__SNIPPET = ABSTRACT_CONTAINER_TYPE__SNIPPET;

	/**
	 * The feature id for the '<em><b>Snippet1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__SNIPPET1 = ABSTRACT_CONTAINER_TYPE__SNIPPET1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__DESCRIPTION = ABSTRACT_CONTAINER_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Abstract View Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ABSTRACT_VIEW_GROUP_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_VIEW_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract View Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ABSTRACT_VIEW_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_VIEW_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__STYLE_URL = ABSTRACT_CONTAINER_TYPE__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__REGION = ABSTRACT_CONTAINER_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__METADATA = ABSTRACT_CONTAINER_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__EXTENDED_DATA = ABSTRACT_CONTAINER_TYPE__EXTENDED_DATA;

	/**
	 * The feature id for the '<em><b>Abstract Feature Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Container Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Container Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Container Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ABSTRACT_CONTAINER_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Container Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ABSTRACT_CONTAINER_OBJECT_EXTENSION_GROUP = ABSTRACT_CONTAINER_TYPE__ABSTRACT_CONTAINER_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ABSTRACT_FEATURE_GROUP_GROUP = ABSTRACT_CONTAINER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Feature Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__ABSTRACT_FEATURE_GROUP = ABSTRACT_CONTAINER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Folder Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__FOLDER_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_CONTAINER_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Folder Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__FOLDER_SIMPLE_EXTENSION_GROUP = ABSTRACT_CONTAINER_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Folder Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__FOLDER_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_CONTAINER_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Folder Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE__FOLDER_OBJECT_EXTENSION_GROUP = ABSTRACT_CONTAINER_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Folder Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE_FEATURE_COUNT = ABSTRACT_CONTAINER_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Folder Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_TYPE_OPERATION_COUNT = ABSTRACT_CONTAINER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.GroundOverlayTypeImpl <em>Ground Overlay Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.GroundOverlayTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getGroundOverlayType()
	 * @generated
	 */
	int GROUND_OVERLAY_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OVERLAY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ID = ABSTRACT_OVERLAY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__TARGET_ID = ABSTRACT_OVERLAY_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__NAME = ABSTRACT_OVERLAY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__VISIBILITY = ABSTRACT_OVERLAY_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__OPEN = ABSTRACT_OVERLAY_TYPE__OPEN;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__AUTHOR = ABSTRACT_OVERLAY_TYPE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__LINK = ABSTRACT_OVERLAY_TYPE__LINK;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ADDRESS = ABSTRACT_OVERLAY_TYPE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ADDRESS_DETAILS = ABSTRACT_OVERLAY_TYPE__ADDRESS_DETAILS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__PHONE_NUMBER = ABSTRACT_OVERLAY_TYPE__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__SNIPPET = ABSTRACT_OVERLAY_TYPE__SNIPPET;

	/**
	 * The feature id for the '<em><b>Snippet1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__SNIPPET1 = ABSTRACT_OVERLAY_TYPE__SNIPPET1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__DESCRIPTION = ABSTRACT_OVERLAY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Abstract View Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ABSTRACT_VIEW_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_VIEW_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract View Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ABSTRACT_VIEW_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_VIEW_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__STYLE_URL = ABSTRACT_OVERLAY_TYPE__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__REGION = ABSTRACT_OVERLAY_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__METADATA = ABSTRACT_OVERLAY_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__EXTENDED_DATA = ABSTRACT_OVERLAY_TYPE__EXTENDED_DATA;

	/**
	 * The feature id for the '<em><b>Abstract Feature Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__COLOR = ABSTRACT_OVERLAY_TYPE__COLOR;

	/**
	 * The feature id for the '<em><b>Draw Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__DRAW_ORDER = ABSTRACT_OVERLAY_TYPE__DRAW_ORDER;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ICON = ABSTRACT_OVERLAY_TYPE__ICON;

	/**
	 * The feature id for the '<em><b>Abstract Overlay Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Overlay Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Overlay Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Overlay Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ALTITUDE = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Altitude Mode Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ALTITUDE_MODE_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Altitude Mode Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__ALTITUDE_MODE_GROUP = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lat Lon Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__LAT_LON_BOX = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ground Overlay Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__GROUND_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ground Overlay Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__GROUND_OVERLAY_SIMPLE_EXTENSION_GROUP = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ground Overlay Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__GROUND_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Ground Overlay Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE__GROUND_OVERLAY_OBJECT_EXTENSION_GROUP = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Ground Overlay Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE_FEATURE_COUNT = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Ground Overlay Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUND_OVERLAY_TYPE_OPERATION_COUNT = ABSTRACT_OVERLAY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.IconStyleTypeImpl <em>Icon Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.IconStyleTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getIconStyleType()
	 * @generated
	 */
	int ICON_STYLE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__ID = ABSTRACT_COLOR_STYLE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__TARGET_ID = ABSTRACT_COLOR_STYLE_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__COLOR = ABSTRACT_COLOR_STYLE_TYPE__COLOR;

	/**
	 * The feature id for the '<em><b>Color Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__COLOR_MODE = ABSTRACT_COLOR_STYLE_TYPE__COLOR_MODE;

	/**
	 * The feature id for the '<em><b>Abstract Color Style Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Color Style Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Color Style Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Color Style Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__SCALE = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__HEADING = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__ICON = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hot Spot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__HOT_SPOT = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Icon Style Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__ICON_STYLE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Icon Style Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__ICON_STYLE_SIMPLE_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Icon Style Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__ICON_STYLE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Icon Style Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE__ICON_STYLE_OBJECT_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Icon Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE_FEATURE_COUNT = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Icon Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_STYLE_TYPE_OPERATION_COUNT = ABSTRACT_COLOR_STYLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.ImagePyramidTypeImpl <em>Image Pyramid Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.ImagePyramidTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getImagePyramidType()
	 * @generated
	 */
	int IMAGE_PYRAMID_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PYRAMID_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PYRAMID_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PYRAMID_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PYRAMID_TYPE__TARGET_ID = ABSTRACT_OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Tile Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PYRAMID_TYPE__TILE_SIZE = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PYRAMID_TYPE__MAX_WIDTH = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PYRAMID_TYPE__MAX_HEIGHT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Grid Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PYRAMID_TYPE__GRID_ORIGIN = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Image Pyramid Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PYRAMID_TYPE__IMAGE_PYRAMID_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Image Pyramid Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PYRAMID_TYPE__IMAGE_PYRAMID_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Image Pyramid Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PYRAMID_TYPE__IMAGE_PYRAMID_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Image Pyramid Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PYRAMID_TYPE__IMAGE_PYRAMID_OBJECT_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Image Pyramid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PYRAMID_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Image Pyramid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PYRAMID_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.ItemIconTypeImpl <em>Item Icon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.ItemIconTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getItemIconType()
	 * @generated
	 */
	int ITEM_ICON_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ICON_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ICON_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ICON_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ICON_TYPE__TARGET_ID = ABSTRACT_OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ICON_TYPE__STATE = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ICON_TYPE__HREF = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Item Icon Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ICON_TYPE__ITEM_ICON_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Item Icon Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ICON_TYPE__ITEM_ICON_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Item Icon Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ICON_TYPE__ITEM_ICON_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Item Icon Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ICON_TYPE__ITEM_ICON_OBJECT_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Item Icon Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ICON_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Item Icon Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_ICON_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.KmlTypeImpl <em>Kml Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.KmlTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getKmlType()
	 * @generated
	 */
	int KML_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Network Link Control</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KML_TYPE__NETWORK_LINK_CONTROL = 0;

	/**
	 * The feature id for the '<em><b>Abstract Feature Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KML_TYPE__ABSTRACT_FEATURE_GROUP_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Abstract Feature Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KML_TYPE__ABSTRACT_FEATURE_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Kml Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KML_TYPE__KML_SIMPLE_EXTENSION_GROUP_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Kml Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KML_TYPE__KML_SIMPLE_EXTENSION_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Kml Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KML_TYPE__KML_OBJECT_EXTENSION_GROUP_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Kml Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KML_TYPE__KML_OBJECT_EXTENSION_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KML_TYPE__HINT = 7;

	/**
	 * The number of structural features of the '<em>Kml Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KML_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Kml Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KML_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.LabelStyleTypeImpl <em>Label Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.LabelStyleTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getLabelStyleType()
	 * @generated
	 */
	int LABEL_STYLE_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__ID = ABSTRACT_COLOR_STYLE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__TARGET_ID = ABSTRACT_COLOR_STYLE_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__COLOR = ABSTRACT_COLOR_STYLE_TYPE__COLOR;

	/**
	 * The feature id for the '<em><b>Color Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__COLOR_MODE = ABSTRACT_COLOR_STYLE_TYPE__COLOR_MODE;

	/**
	 * The feature id for the '<em><b>Abstract Color Style Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Color Style Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Color Style Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Color Style Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__SCALE = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label Style Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__LABEL_STYLE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label Style Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__LABEL_STYLE_SIMPLE_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label Style Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__LABEL_STYLE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label Style Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE__LABEL_STYLE_OBJECT_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Label Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE_FEATURE_COUNT = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Label Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_STYLE_TYPE_OPERATION_COUNT = ABSTRACT_COLOR_STYLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.LatLonAltBoxTypeImpl <em>Lat Lon Alt Box Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.LatLonAltBoxTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getLatLonAltBoxType()
	 * @generated
	 */
	int LAT_LON_ALT_BOX_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_LAT_LON_BOX_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_LAT_LON_BOX_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__ID = ABSTRACT_LAT_LON_BOX_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__TARGET_ID = ABSTRACT_LAT_LON_BOX_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>North</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__NORTH = ABSTRACT_LAT_LON_BOX_TYPE__NORTH;

	/**
	 * The feature id for the '<em><b>South</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__SOUTH = ABSTRACT_LAT_LON_BOX_TYPE__SOUTH;

	/**
	 * The feature id for the '<em><b>East</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__EAST = ABSTRACT_LAT_LON_BOX_TYPE__EAST;

	/**
	 * The feature id for the '<em><b>West</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__WEST = ABSTRACT_LAT_LON_BOX_TYPE__WEST;

	/**
	 * The feature id for the '<em><b>Abstract Lat Lon Box Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Lat Lon Box Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP = ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Lat Lon Box Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__ABSTRACT_LAT_LON_BOX_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Lat Lon Box Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__ABSTRACT_LAT_LON_BOX_OBJECT_EXTENSION_GROUP = ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Min Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__MIN_ALTITUDE = ABSTRACT_LAT_LON_BOX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__MAX_ALTITUDE = ABSTRACT_LAT_LON_BOX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Altitude Mode Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__ALTITUDE_MODE_GROUP_GROUP = ABSTRACT_LAT_LON_BOX_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Altitude Mode Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__ALTITUDE_MODE_GROUP = ABSTRACT_LAT_LON_BOX_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lat Lon Alt Box Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__LAT_LON_ALT_BOX_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_LAT_LON_BOX_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lat Lon Alt Box Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__LAT_LON_ALT_BOX_SIMPLE_EXTENSION_GROUP = ABSTRACT_LAT_LON_BOX_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lat Lon Alt Box Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__LAT_LON_ALT_BOX_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_LAT_LON_BOX_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Lat Lon Alt Box Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE__LAT_LON_ALT_BOX_OBJECT_EXTENSION_GROUP = ABSTRACT_LAT_LON_BOX_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Lat Lon Alt Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE_FEATURE_COUNT = ABSTRACT_LAT_LON_BOX_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Lat Lon Alt Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_ALT_BOX_TYPE_OPERATION_COUNT = ABSTRACT_LAT_LON_BOX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.LatLonBoxTypeImpl <em>Lat Lon Box Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.LatLonBoxTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getLatLonBoxType()
	 * @generated
	 */
	int LAT_LON_BOX_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_LAT_LON_BOX_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_LAT_LON_BOX_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__ID = ABSTRACT_LAT_LON_BOX_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__TARGET_ID = ABSTRACT_LAT_LON_BOX_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>North</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__NORTH = ABSTRACT_LAT_LON_BOX_TYPE__NORTH;

	/**
	 * The feature id for the '<em><b>South</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__SOUTH = ABSTRACT_LAT_LON_BOX_TYPE__SOUTH;

	/**
	 * The feature id for the '<em><b>East</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__EAST = ABSTRACT_LAT_LON_BOX_TYPE__EAST;

	/**
	 * The feature id for the '<em><b>West</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__WEST = ABSTRACT_LAT_LON_BOX_TYPE__WEST;

	/**
	 * The feature id for the '<em><b>Abstract Lat Lon Box Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Lat Lon Box Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP = ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Lat Lon Box Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Lat Lon Box Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_OBJECT_EXTENSION_GROUP = ABSTRACT_LAT_LON_BOX_TYPE__ABSTRACT_LAT_LON_BOX_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__ROTATION = ABSTRACT_LAT_LON_BOX_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lat Lon Box Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__LAT_LON_BOX_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_LAT_LON_BOX_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lat Lon Box Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__LAT_LON_BOX_SIMPLE_EXTENSION_GROUP = ABSTRACT_LAT_LON_BOX_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lat Lon Box Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__LAT_LON_BOX_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_LAT_LON_BOX_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lat Lon Box Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE__LAT_LON_BOX_OBJECT_EXTENSION_GROUP = ABSTRACT_LAT_LON_BOX_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Lat Lon Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE_FEATURE_COUNT = ABSTRACT_LAT_LON_BOX_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Lat Lon Box Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAT_LON_BOX_TYPE_OPERATION_COUNT = ABSTRACT_LAT_LON_BOX_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.LinearRingTypeImpl <em>Linear Ring Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.LinearRingTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getLinearRingType()
	 * @generated
	 */
	int LINEAR_RING_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE__ID = ABSTRACT_GEOMETRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE__TARGET_ID = ABSTRACT_GEOMETRY_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Extrude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE__EXTRUDE = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tessellate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE__TESSELLATE = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Altitude Mode Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE__ALTITUDE_MODE_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Altitude Mode Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE__ALTITUDE_MODE_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE__COORDINATES = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Linear Ring Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE__LINEAR_RING_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Linear Ring Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE__LINEAR_RING_SIMPLE_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Linear Ring Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE__LINEAR_RING_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Linear Ring Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE__LINEAR_RING_OBJECT_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Linear Ring Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE_FEATURE_COUNT = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Linear Ring Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_RING_TYPE_OPERATION_COUNT = ABSTRACT_GEOMETRY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.LineStringTypeImpl <em>Line String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.LineStringTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getLineStringType()
	 * @generated
	 */
	int LINE_STRING_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE__ID = ABSTRACT_GEOMETRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE__TARGET_ID = ABSTRACT_GEOMETRY_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Extrude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE__EXTRUDE = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tessellate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE__TESSELLATE = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Altitude Mode Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE__ALTITUDE_MODE_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Altitude Mode Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE__ALTITUDE_MODE_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE__COORDINATES = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Line String Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE__LINE_STRING_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Line String Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE__LINE_STRING_SIMPLE_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Line String Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE__LINE_STRING_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Line String Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE__LINE_STRING_OBJECT_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Line String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE_FEATURE_COUNT = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Line String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STRING_TYPE_OPERATION_COUNT = ABSTRACT_GEOMETRY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.LineStyleTypeImpl <em>Line Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.LineStyleTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getLineStyleType()
	 * @generated
	 */
	int LINE_STYLE_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__ID = ABSTRACT_COLOR_STYLE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__TARGET_ID = ABSTRACT_COLOR_STYLE_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__COLOR = ABSTRACT_COLOR_STYLE_TYPE__COLOR;

	/**
	 * The feature id for the '<em><b>Color Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__COLOR_MODE = ABSTRACT_COLOR_STYLE_TYPE__COLOR_MODE;

	/**
	 * The feature id for the '<em><b>Abstract Color Style Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Color Style Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Color Style Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Color Style Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__WIDTH = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line Style Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__LINE_STYLE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line Style Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__LINE_STYLE_SIMPLE_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line Style Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__LINE_STYLE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Line Style Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE__LINE_STYLE_OBJECT_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Line Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE_FEATURE_COUNT = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Line Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_TYPE_OPERATION_COUNT = ABSTRACT_COLOR_STYLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.LinkTypeImpl <em>Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.LinkTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getLinkType()
	 * @generated
	 */
	int LINK_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = BASIC_LINK_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = BASIC_LINK_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__ID = BASIC_LINK_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__TARGET_ID = BASIC_LINK_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__HREF = BASIC_LINK_TYPE__HREF;

	/**
	 * The feature id for the '<em><b>Basic Link Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__BASIC_LINK_SIMPLE_EXTENSION_GROUP_GROUP = BASIC_LINK_TYPE__BASIC_LINK_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Basic Link Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__BASIC_LINK_SIMPLE_EXTENSION_GROUP = BASIC_LINK_TYPE__BASIC_LINK_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Basic Link Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__BASIC_LINK_OBJECT_EXTENSION_GROUP_GROUP = BASIC_LINK_TYPE__BASIC_LINK_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Basic Link Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__BASIC_LINK_OBJECT_EXTENSION_GROUP = BASIC_LINK_TYPE__BASIC_LINK_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Refresh Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__REFRESH_MODE = BASIC_LINK_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refresh Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__REFRESH_INTERVAL = BASIC_LINK_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>View Refresh Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__VIEW_REFRESH_MODE = BASIC_LINK_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>View Refresh Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__VIEW_REFRESH_TIME = BASIC_LINK_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>View Bound Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__VIEW_BOUND_SCALE = BASIC_LINK_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>View Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__VIEW_FORMAT = BASIC_LINK_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Http Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__HTTP_QUERY = BASIC_LINK_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Link Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__LINK_SIMPLE_EXTENSION_GROUP_GROUP = BASIC_LINK_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Link Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__LINK_SIMPLE_EXTENSION_GROUP = BASIC_LINK_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Link Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__LINK_OBJECT_EXTENSION_GROUP_GROUP = BASIC_LINK_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Link Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__LINK_OBJECT_EXTENSION_GROUP = BASIC_LINK_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE_FEATURE_COUNT = BASIC_LINK_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE_OPERATION_COUNT = BASIC_LINK_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.ListStyleTypeImpl <em>List Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.ListStyleTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getListStyleType()
	 * @generated
	 */
	int LIST_STYLE_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_SUB_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_SUB_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE__ID = ABSTRACT_SUB_STYLE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE__TARGET_ID = ABSTRACT_SUB_STYLE_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP = ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP = ABSTRACT_SUB_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>List Item Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE__LIST_ITEM_TYPE = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bg Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE__BG_COLOR = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Item Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE__ITEM_ICON = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Snippet Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE__MAX_SNIPPET_LINES = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>List Style Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE__LIST_STYLE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>List Style Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE__LIST_STYLE_SIMPLE_EXTENSION_GROUP = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>List Style Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE__LIST_STYLE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>List Style Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE__LIST_STYLE_OBJECT_EXTENSION_GROUP = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>List Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE_FEATURE_COUNT = ABSTRACT_SUB_STYLE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>List Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_STYLE_TYPE_OPERATION_COUNT = ABSTRACT_SUB_STYLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.LocationTypeImpl <em>Location Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.LocationTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getLocationType()
	 * @generated
	 */
	int LOCATION_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__TARGET_ID = ABSTRACT_OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__LONGITUDE = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__LATITUDE = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__ALTITUDE = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Location Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__LOCATION_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Location Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__LOCATION_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Location Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__LOCATION_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Location Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE__LOCATION_OBJECT_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Location Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.LodTypeImpl <em>Lod Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.LodTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getLodType()
	 * @generated
	 */
	int LOD_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD_TYPE__TARGET_ID = ABSTRACT_OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Min Lod Pixels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD_TYPE__MIN_LOD_PIXELS = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Lod Pixels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD_TYPE__MAX_LOD_PIXELS = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Fade Extent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD_TYPE__MIN_FADE_EXTENT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Fade Extent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD_TYPE__MAX_FADE_EXTENT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Lod Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD_TYPE__LOD_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lod Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD_TYPE__LOD_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lod Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD_TYPE__LOD_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Lod Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD_TYPE__LOD_OBJECT_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Lod Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Lod Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOD_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.LookAtTypeImpl <em>Look At Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.LookAtTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getLookAtType()
	 * @generated
	 */
	int LOOK_AT_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_VIEW_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_VIEW_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__ID = ABSTRACT_VIEW_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__TARGET_ID = ABSTRACT_VIEW_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract View Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract View Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP = ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract View Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__ABSTRACT_VIEW_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract View Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__ABSTRACT_VIEW_OBJECT_EXTENSION_GROUP = ABSTRACT_VIEW_TYPE__ABSTRACT_VIEW_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Longitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__LONGITUDE = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Latitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__LATITUDE = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Altitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__ALTITUDE = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__HEADING = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tilt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__TILT = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__RANGE = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Altitude Mode Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__ALTITUDE_MODE_GROUP_GROUP = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Altitude Mode Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__ALTITUDE_MODE_GROUP = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Look At Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__LOOK_AT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Look At Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__LOOK_AT_SIMPLE_EXTENSION_GROUP = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Look At Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__LOOK_AT_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Look At Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE__LOOK_AT_OBJECT_EXTENSION_GROUP = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Look At Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE_FEATURE_COUNT = ABSTRACT_VIEW_TYPE_FEATURE_COUNT + 12;

	/**
	 * The number of operations of the '<em>Look At Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOK_AT_TYPE_OPERATION_COUNT = ABSTRACT_VIEW_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.MetadataTypeImpl <em>Metadata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.MetadataTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getMetadataType()
	 * @generated
	 */
	int METADATA_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Metadata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.ModelTypeImpl <em>Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.ModelTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getModelType()
	 * @generated
	 */
	int MODEL_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__ID = ABSTRACT_GEOMETRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__TARGET_ID = ABSTRACT_GEOMETRY_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Altitude Mode Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__ALTITUDE_MODE_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Altitude Mode Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__ALTITUDE_MODE_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__LOCATION = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__ORIENTATION = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__SCALE = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__LINK = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Resource Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__RESOURCE_MAP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Model Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__MODEL_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Model Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__MODEL_SIMPLE_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Model Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__MODEL_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Model Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE__MODEL_OBJECT_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_FEATURE_COUNT = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_TYPE_OPERATION_COUNT = ABSTRACT_GEOMETRY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.MultiGeometryTypeImpl <em>Multi Geometry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.MultiGeometryTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getMultiGeometryType()
	 * @generated
	 */
	int MULTI_GEOMETRY_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_TYPE__ID = ABSTRACT_GEOMETRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_TYPE__TARGET_ID = ABSTRACT_GEOMETRY_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multi Geometry Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_TYPE__MULTI_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multi Geometry Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_TYPE__MULTI_GEOMETRY_SIMPLE_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Multi Geometry Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_TYPE__MULTI_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Multi Geometry Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_TYPE__MULTI_GEOMETRY_OBJECT_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Multi Geometry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_TYPE_FEATURE_COUNT = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Multi Geometry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_GEOMETRY_TYPE_OPERATION_COUNT = ABSTRACT_GEOMETRY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.NetworkLinkControlTypeImpl <em>Network Link Control Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.NetworkLinkControlTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getNetworkLinkControlType()
	 * @generated
	 */
	int NETWORK_LINK_CONTROL_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Min Refresh Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__MIN_REFRESH_PERIOD = 0;

	/**
	 * The feature id for the '<em><b>Max Session Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__MAX_SESSION_LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Cookie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__COOKIE = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Link Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__LINK_NAME = 4;

	/**
	 * The feature id for the '<em><b>Link Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__LINK_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Link Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__LINK_SNIPPET = 6;

	/**
	 * The feature id for the '<em><b>Expires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__EXPIRES = 7;

	/**
	 * The feature id for the '<em><b>Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__UPDATE = 8;

	/**
	 * The feature id for the '<em><b>Abstract View Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__ABSTRACT_VIEW_GROUP_GROUP = 9;

	/**
	 * The feature id for the '<em><b>Abstract View Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__ABSTRACT_VIEW_GROUP = 10;

	/**
	 * The feature id for the '<em><b>Network Link Control Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__NETWORK_LINK_CONTROL_SIMPLE_EXTENSION_GROUP_GROUP = 11;

	/**
	 * The feature id for the '<em><b>Network Link Control Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__NETWORK_LINK_CONTROL_SIMPLE_EXTENSION_GROUP = 12;

	/**
	 * The feature id for the '<em><b>Network Link Control Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__NETWORK_LINK_CONTROL_OBJECT_EXTENSION_GROUP_GROUP = 13;

	/**
	 * The feature id for the '<em><b>Network Link Control Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE__NETWORK_LINK_CONTROL_OBJECT_EXTENSION_GROUP = 14;

	/**
	 * The number of structural features of the '<em>Network Link Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Network Link Control Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_CONTROL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.NetworkLinkTypeImpl <em>Network Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.NetworkLinkTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getNetworkLinkType()
	 * @generated
	 */
	int NETWORK_LINK_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_FEATURE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__ID = ABSTRACT_FEATURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__TARGET_ID = ABSTRACT_FEATURE_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__NAME = ABSTRACT_FEATURE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__VISIBILITY = ABSTRACT_FEATURE_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__OPEN = ABSTRACT_FEATURE_TYPE__OPEN;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__AUTHOR = ABSTRACT_FEATURE_TYPE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__LINK = ABSTRACT_FEATURE_TYPE__LINK;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__ADDRESS = ABSTRACT_FEATURE_TYPE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__ADDRESS_DETAILS = ABSTRACT_FEATURE_TYPE__ADDRESS_DETAILS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__PHONE_NUMBER = ABSTRACT_FEATURE_TYPE__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__SNIPPET = ABSTRACT_FEATURE_TYPE__SNIPPET;

	/**
	 * The feature id for the '<em><b>Snippet1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__SNIPPET1 = ABSTRACT_FEATURE_TYPE__SNIPPET1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__DESCRIPTION = ABSTRACT_FEATURE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Abstract View Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__ABSTRACT_VIEW_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_VIEW_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract View Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__ABSTRACT_VIEW_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_VIEW_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__STYLE_URL = ABSTRACT_FEATURE_TYPE__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__REGION = ABSTRACT_FEATURE_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__METADATA = ABSTRACT_FEATURE_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__EXTENDED_DATA = ABSTRACT_FEATURE_TYPE__EXTENDED_DATA;

	/**
	 * The feature id for the '<em><b>Abstract Feature Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Refresh Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__REFRESH_VISIBILITY = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fly To View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__FLY_TO_VIEW = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__URL = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Link1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__LINK1 = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Network Link Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__NETWORK_LINK_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Network Link Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__NETWORK_LINK_SIMPLE_EXTENSION_GROUP = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Network Link Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__NETWORK_LINK_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Network Link Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE__NETWORK_LINK_OBJECT_EXTENSION_GROUP = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Network Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE_FEATURE_COUNT = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Network Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_LINK_TYPE_OPERATION_COUNT = ABSTRACT_FEATURE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.OrientationTypeImpl <em>Orientation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.OrientationTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getOrientationType()
	 * @generated
	 */
	int ORIENTATION_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_TYPE__TARGET_ID = ABSTRACT_OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_TYPE__HEADING = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tilt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_TYPE__TILT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Roll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_TYPE__ROLL = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Orientation Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_TYPE__ORIENTATION_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Orientation Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_TYPE__ORIENTATION_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Orientation Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_TYPE__ORIENTATION_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Orientation Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_TYPE__ORIENTATION_OBJECT_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Orientation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Orientation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORIENTATION_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.PairTypeImpl <em>Pair Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.PairTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getPairType()
	 * @generated
	 */
	int PAIR_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_TYPE__TARGET_ID = ABSTRACT_OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_TYPE__KEY = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_TYPE__STYLE_URL = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pair Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_TYPE__PAIR_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pair Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_TYPE__PAIR_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pair Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_TYPE__PAIR_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pair Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_TYPE__PAIR_OBJECT_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Pair Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Pair Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAIR_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.PhotoOverlayTypeImpl <em>Photo Overlay Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.PhotoOverlayTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getPhotoOverlayType()
	 * @generated
	 */
	int PHOTO_OVERLAY_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OVERLAY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__ID = ABSTRACT_OVERLAY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__TARGET_ID = ABSTRACT_OVERLAY_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__NAME = ABSTRACT_OVERLAY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__VISIBILITY = ABSTRACT_OVERLAY_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__OPEN = ABSTRACT_OVERLAY_TYPE__OPEN;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__AUTHOR = ABSTRACT_OVERLAY_TYPE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__LINK = ABSTRACT_OVERLAY_TYPE__LINK;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__ADDRESS = ABSTRACT_OVERLAY_TYPE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__ADDRESS_DETAILS = ABSTRACT_OVERLAY_TYPE__ADDRESS_DETAILS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__PHONE_NUMBER = ABSTRACT_OVERLAY_TYPE__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__SNIPPET = ABSTRACT_OVERLAY_TYPE__SNIPPET;

	/**
	 * The feature id for the '<em><b>Snippet1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__SNIPPET1 = ABSTRACT_OVERLAY_TYPE__SNIPPET1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__DESCRIPTION = ABSTRACT_OVERLAY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Abstract View Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__ABSTRACT_VIEW_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_VIEW_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract View Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__ABSTRACT_VIEW_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_VIEW_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__STYLE_URL = ABSTRACT_OVERLAY_TYPE__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__REGION = ABSTRACT_OVERLAY_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__METADATA = ABSTRACT_OVERLAY_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__EXTENDED_DATA = ABSTRACT_OVERLAY_TYPE__EXTENDED_DATA;

	/**
	 * The feature id for the '<em><b>Abstract Feature Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__COLOR = ABSTRACT_OVERLAY_TYPE__COLOR;

	/**
	 * The feature id for the '<em><b>Draw Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__DRAW_ORDER = ABSTRACT_OVERLAY_TYPE__DRAW_ORDER;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__ICON = ABSTRACT_OVERLAY_TYPE__ICON;

	/**
	 * The feature id for the '<em><b>Abstract Overlay Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Overlay Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Overlay Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Overlay Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__ROTATION = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>View Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__VIEW_VOLUME = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image Pyramid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__IMAGE_PYRAMID = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__POINT = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__SHAPE = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Photo Overlay Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__PHOTO_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Photo Overlay Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__PHOTO_OVERLAY_SIMPLE_EXTENSION_GROUP = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Photo Overlay Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__PHOTO_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Photo Overlay Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE__PHOTO_OVERLAY_OBJECT_EXTENSION_GROUP = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Photo Overlay Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE_FEATURE_COUNT = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Photo Overlay Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHOTO_OVERLAY_TYPE_OPERATION_COUNT = ABSTRACT_OVERLAY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.PlacemarkTypeImpl <em>Placemark Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.PlacemarkTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getPlacemarkType()
	 * @generated
	 */
	int PLACEMARK_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_FEATURE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__ID = ABSTRACT_FEATURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__TARGET_ID = ABSTRACT_FEATURE_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__NAME = ABSTRACT_FEATURE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__VISIBILITY = ABSTRACT_FEATURE_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__OPEN = ABSTRACT_FEATURE_TYPE__OPEN;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__AUTHOR = ABSTRACT_FEATURE_TYPE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__LINK = ABSTRACT_FEATURE_TYPE__LINK;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__ADDRESS = ABSTRACT_FEATURE_TYPE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__ADDRESS_DETAILS = ABSTRACT_FEATURE_TYPE__ADDRESS_DETAILS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__PHONE_NUMBER = ABSTRACT_FEATURE_TYPE__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__SNIPPET = ABSTRACT_FEATURE_TYPE__SNIPPET;

	/**
	 * The feature id for the '<em><b>Snippet1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__SNIPPET1 = ABSTRACT_FEATURE_TYPE__SNIPPET1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__DESCRIPTION = ABSTRACT_FEATURE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Abstract View Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__ABSTRACT_VIEW_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_VIEW_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract View Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__ABSTRACT_VIEW_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_VIEW_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__STYLE_URL = ABSTRACT_FEATURE_TYPE__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__REGION = ABSTRACT_FEATURE_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__METADATA = ABSTRACT_FEATURE_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__EXTENDED_DATA = ABSTRACT_FEATURE_TYPE__EXTENDED_DATA;

	/**
	 * The feature id for the '<em><b>Abstract Feature Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP = ABSTRACT_FEATURE_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__ABSTRACT_GEOMETRY_GROUP_GROUP = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__ABSTRACT_GEOMETRY_GROUP = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Placemark Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__PLACEMARK_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Placemark Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__PLACEMARK_SIMPLE_EXTENSION_GROUP = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Placemark Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__PLACEMARK_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Placemark Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE__PLACEMARK_OBJECT_EXTENSION_GROUP = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Placemark Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE_FEATURE_COUNT = ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Placemark Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEMARK_TYPE_OPERATION_COUNT = ABSTRACT_FEATURE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.PointTypeImpl <em>Point Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.PointTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getPointType()
	 * @generated
	 */
	int POINT_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__ID = ABSTRACT_GEOMETRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__TARGET_ID = ABSTRACT_GEOMETRY_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Extrude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__EXTRUDE = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Altitude Mode Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__ALTITUDE_MODE_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Altitude Mode Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__ALTITUDE_MODE_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__COORDINATES = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Point Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__POINT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Point Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__POINT_SIMPLE_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Point Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__POINT_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Point Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE__POINT_OBJECT_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE_FEATURE_COUNT = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Point Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_TYPE_OPERATION_COUNT = ABSTRACT_GEOMETRY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.PolygonTypeImpl <em>Polygon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.PolygonTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getPolygonType()
	 * @generated
	 */
	int POLYGON_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__ID = ABSTRACT_GEOMETRY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__TARGET_ID = ABSTRACT_GEOMETRY_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Geometry Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE__ABSTRACT_GEOMETRY_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Extrude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__EXTRUDE = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tessellate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__TESSELLATE = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Altitude Mode Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__ALTITUDE_MODE_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Altitude Mode Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__ALTITUDE_MODE_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outer Boundary Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__OUTER_BOUNDARY_IS = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Inner Boundary Is</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__INNER_BOUNDARY_IS = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Polygon Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__POLYGON_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Polygon Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__POLYGON_SIMPLE_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Polygon Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__POLYGON_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Polygon Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE__POLYGON_OBJECT_EXTENSION_GROUP = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Polygon Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE_FEATURE_COUNT = ABSTRACT_GEOMETRY_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Polygon Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_TYPE_OPERATION_COUNT = ABSTRACT_GEOMETRY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.PolyStyleTypeImpl <em>Poly Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.PolyStyleTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getPolyStyleType()
	 * @generated
	 */
	int POLY_STYLE_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__ID = ABSTRACT_COLOR_STYLE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__TARGET_ID = ABSTRACT_COLOR_STYLE_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_SUB_STYLE_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Sub Style Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_SUB_STYLE_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__COLOR = ABSTRACT_COLOR_STYLE_TYPE__COLOR;

	/**
	 * The feature id for the '<em><b>Color Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__COLOR_MODE = ABSTRACT_COLOR_STYLE_TYPE__COLOR_MODE;

	/**
	 * The feature id for the '<em><b>Abstract Color Style Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Color Style Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Color Style Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Color Style Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE__ABSTRACT_COLOR_STYLE_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__FILL = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__OUTLINE = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Poly Style Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__POLY_STYLE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Poly Style Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__POLY_STYLE_SIMPLE_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Poly Style Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__POLY_STYLE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Poly Style Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE__POLY_STYLE_OBJECT_EXTENSION_GROUP = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Poly Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE_FEATURE_COUNT = ABSTRACT_COLOR_STYLE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Poly Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLY_STYLE_TYPE_OPERATION_COUNT = ABSTRACT_COLOR_STYLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.RegionTypeImpl <em>Region Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.RegionTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getRegionType()
	 * @generated
	 */
	int REGION_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TYPE__TARGET_ID = ABSTRACT_OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Lat Lon Alt Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TYPE__LAT_LON_ALT_BOX = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TYPE__LOD = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Region Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TYPE__REGION_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Region Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TYPE__REGION_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Region Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TYPE__REGION_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Region Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TYPE__REGION_OBJECT_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Region Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Region Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGION_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.ResourceMapTypeImpl <em>Resource Map Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.ResourceMapTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getResourceMapType()
	 * @generated
	 */
	int RESOURCE_MAP_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAP_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAP_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAP_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAP_TYPE__TARGET_ID = ABSTRACT_OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAP_TYPE__ALIAS = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resource Map Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAP_TYPE__RESOURCE_MAP_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Resource Map Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAP_TYPE__RESOURCE_MAP_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Resource Map Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAP_TYPE__RESOURCE_MAP_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Resource Map Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAP_TYPE__RESOURCE_MAP_OBJECT_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Resource Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAP_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Resource Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_MAP_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.ScaleTypeImpl <em>Scale Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.ScaleTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getScaleType()
	 * @generated
	 */
	int SCALE_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_TYPE__TARGET_ID = ABSTRACT_OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_TYPE__X = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_TYPE__Y = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_TYPE__Z = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scale Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_TYPE__SCALE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Scale Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_TYPE__SCALE_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Scale Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_TYPE__SCALE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Scale Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_TYPE__SCALE_OBJECT_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Scale Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Scale Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.SchemaDataTypeImpl <em>Schema Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.SchemaDataTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getSchemaDataType()
	 * @generated
	 */
	int SCHEMA_DATA_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DATA_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DATA_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DATA_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DATA_TYPE__TARGET_ID = ABSTRACT_OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Simple Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DATA_TYPE__SIMPLE_DATA = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Schema Data Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DATA_TYPE__SCHEMA_DATA_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schema Data Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DATA_TYPE__SCHEMA_DATA_EXTENSION = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Schema Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DATA_TYPE__SCHEMA_URL = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Schema Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DATA_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Schema Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_DATA_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.SchemaTypeImpl <em>Schema Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.SchemaTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getSchemaType()
	 * @generated
	 */
	int SCHEMA_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Simple Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__SIMPLE_FIELD = 0;

	/**
	 * The feature id for the '<em><b>Schema Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__SCHEMA_EXTENSION_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Schema Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__SCHEMA_EXTENSION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE__NAME = 4;

	/**
	 * The number of structural features of the '<em>Schema Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Schema Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.ScreenOverlayTypeImpl <em>Screen Overlay Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.ScreenOverlayTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getScreenOverlayType()
	 * @generated
	 */
	int SCREEN_OVERLAY_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OVERLAY_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ID = ABSTRACT_OVERLAY_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__TARGET_ID = ABSTRACT_OVERLAY_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__NAME = ABSTRACT_OVERLAY_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__VISIBILITY = ABSTRACT_OVERLAY_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__OPEN = ABSTRACT_OVERLAY_TYPE__OPEN;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__AUTHOR = ABSTRACT_OVERLAY_TYPE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__LINK = ABSTRACT_OVERLAY_TYPE__LINK;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ADDRESS = ABSTRACT_OVERLAY_TYPE__ADDRESS;

	/**
	 * The feature id for the '<em><b>Address Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ADDRESS_DETAILS = ABSTRACT_OVERLAY_TYPE__ADDRESS_DETAILS;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__PHONE_NUMBER = ABSTRACT_OVERLAY_TYPE__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Snippet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__SNIPPET = ABSTRACT_OVERLAY_TYPE__SNIPPET;

	/**
	 * The feature id for the '<em><b>Snippet1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__SNIPPET1 = ABSTRACT_OVERLAY_TYPE__SNIPPET1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__DESCRIPTION = ABSTRACT_OVERLAY_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Abstract View Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ABSTRACT_VIEW_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_VIEW_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract View Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ABSTRACT_VIEW_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_VIEW_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP;

	/**
	 * The feature id for the '<em><b>Style Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__STYLE_URL = ABSTRACT_OVERLAY_TYPE__STYLE_URL;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_STYLE_SELECTOR_GROUP;

	/**
	 * The feature id for the '<em><b>Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__REGION = ABSTRACT_OVERLAY_TYPE__REGION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__METADATA = ABSTRACT_OVERLAY_TYPE__METADATA;

	/**
	 * The feature id for the '<em><b>Extended Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__EXTENDED_DATA = ABSTRACT_OVERLAY_TYPE__EXTENDED_DATA;

	/**
	 * The feature id for the '<em><b>Abstract Feature Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_FEATURE_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Feature Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_FEATURE_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__COLOR = ABSTRACT_OVERLAY_TYPE__COLOR;

	/**
	 * The feature id for the '<em><b>Draw Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__DRAW_ORDER = ABSTRACT_OVERLAY_TYPE__DRAW_ORDER;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ICON = ABSTRACT_OVERLAY_TYPE__ICON;

	/**
	 * The feature id for the '<em><b>Abstract Overlay Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Overlay Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Overlay Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Overlay Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP = ABSTRACT_OVERLAY_TYPE__ABSTRACT_OVERLAY_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Overlay XY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__OVERLAY_XY = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Screen XY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__SCREEN_XY = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rotation XY</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ROTATION_XY = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__SIZE = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__ROTATION = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Screen Overlay Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__SCREEN_OVERLAY_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Screen Overlay Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__SCREEN_OVERLAY_SIMPLE_EXTENSION_GROUP = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Screen Overlay Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__SCREEN_OVERLAY_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Screen Overlay Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE__SCREEN_OVERLAY_OBJECT_EXTENSION_GROUP = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Screen Overlay Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE_FEATURE_COUNT = ABSTRACT_OVERLAY_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Screen Overlay Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCREEN_OVERLAY_TYPE_OPERATION_COUNT = ABSTRACT_OVERLAY_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.SimpleDataTypeImpl <em>Simple Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.SimpleDataTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getSimpleDataType()
	 * @generated
	 */
	int SIMPLE_DATA_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Simple Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Simple Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.SimpleFieldTypeImpl <em>Simple Field Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.SimpleFieldTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getSimpleFieldType()
	 * @generated
	 */
	int SIMPLE_FIELD_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD_TYPE__DISPLAY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Simple Field Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD_TYPE__SIMPLE_FIELD_EXTENSION_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Simple Field Extension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD_TYPE__SIMPLE_FIELD_EXTENSION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD_TYPE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD_TYPE__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Simple Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Simple Field Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.SnippetTypeImpl <em>Snippet Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.SnippetTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getSnippetType()
	 * @generated
	 */
	int SNIPPET_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Max Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_TYPE__MAX_LINES = 1;

	/**
	 * The number of structural features of the '<em>Snippet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Snippet Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNIPPET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.StyleMapTypeImpl <em>Style Map Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.StyleMapTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getStyleMapType()
	 * @generated
	 */
	int STYLE_MAP_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_STYLE_SELECTOR_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_STYLE_SELECTOR_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP_TYPE__ID = ABSTRACT_STYLE_SELECTOR_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP_TYPE__TARGET_ID = ABSTRACT_STYLE_SELECTOR_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP_TYPE__ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP_TYPE__ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP = ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP_TYPE__ABSTRACT_STYLE_SELECTOR_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP_TYPE__ABSTRACT_STYLE_SELECTOR_OBJECT_EXTENSION_GROUP = ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Pair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP_TYPE__PAIR = ABSTRACT_STYLE_SELECTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Style Map Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP_TYPE__STYLE_MAP_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_STYLE_SELECTOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style Map Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP_TYPE__STYLE_MAP_SIMPLE_EXTENSION_GROUP = ABSTRACT_STYLE_SELECTOR_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style Map Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP_TYPE__STYLE_MAP_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_STYLE_SELECTOR_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Style Map Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP_TYPE__STYLE_MAP_OBJECT_EXTENSION_GROUP = ABSTRACT_STYLE_SELECTOR_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Style Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP_TYPE_FEATURE_COUNT = ABSTRACT_STYLE_SELECTOR_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Style Map Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_MAP_TYPE_OPERATION_COUNT = ABSTRACT_STYLE_SELECTOR_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.StyleTypeImpl <em>Style Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.StyleTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getStyleType()
	 * @generated
	 */
	int STYLE_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_STYLE_SELECTOR_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_STYLE_SELECTOR_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__ID = ABSTRACT_STYLE_SELECTOR_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__TARGET_ID = ABSTRACT_STYLE_SELECTOR_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP = ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__ABSTRACT_STYLE_SELECTOR_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Style Selector Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__ABSTRACT_STYLE_SELECTOR_OBJECT_EXTENSION_GROUP = ABSTRACT_STYLE_SELECTOR_TYPE__ABSTRACT_STYLE_SELECTOR_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Icon Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__ICON_STYLE = ABSTRACT_STYLE_SELECTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__LABEL_STYLE = ABSTRACT_STYLE_SELECTOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__LINE_STYLE = ABSTRACT_STYLE_SELECTOR_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Poly Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__POLY_STYLE = ABSTRACT_STYLE_SELECTOR_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Balloon Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__BALLOON_STYLE = ABSTRACT_STYLE_SELECTOR_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>List Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__LIST_STYLE = ABSTRACT_STYLE_SELECTOR_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Style Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__STYLE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_STYLE_SELECTOR_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Style Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__STYLE_SIMPLE_EXTENSION_GROUP = ABSTRACT_STYLE_SELECTOR_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Style Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__STYLE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_STYLE_SELECTOR_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Style Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE__STYLE_OBJECT_EXTENSION_GROUP = ABSTRACT_STYLE_SELECTOR_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE_FEATURE_COUNT = ABSTRACT_STYLE_SELECTOR_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Style Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_TYPE_OPERATION_COUNT = ABSTRACT_STYLE_SELECTOR_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.TimeSpanTypeImpl <em>Time Span Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.TimeSpanTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getTimeSpanType()
	 * @generated
	 */
	int TIME_SPAN_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_TIME_PRIMITIVE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_TIME_PRIMITIVE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_TYPE__ID = ABSTRACT_TIME_PRIMITIVE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_TYPE__TARGET_ID = ABSTRACT_TIME_PRIMITIVE_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_TYPE__ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_TYPE__ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP = ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_TYPE__ABSTRACT_TIME_PRIMITIVE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_TYPE__ABSTRACT_TIME_PRIMITIVE_OBJECT_EXTENSION_GROUP = ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_TYPE__BEGIN = ABSTRACT_TIME_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_TYPE__END = ABSTRACT_TIME_PRIMITIVE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Span Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_TYPE__TIME_SPAN_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_TIME_PRIMITIVE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Span Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_TYPE__TIME_SPAN_SIMPLE_EXTENSION_GROUP = ABSTRACT_TIME_PRIMITIVE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time Span Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_TYPE__TIME_SPAN_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_TIME_PRIMITIVE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Time Span Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_TYPE__TIME_SPAN_OBJECT_EXTENSION_GROUP = ABSTRACT_TIME_PRIMITIVE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Time Span Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_TYPE_FEATURE_COUNT = ABSTRACT_TIME_PRIMITIVE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Time Span Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SPAN_TYPE_OPERATION_COUNT = ABSTRACT_TIME_PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.TimeStampTypeImpl <em>Time Stamp Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.TimeStampTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getTimeStampType()
	 * @generated
	 */
	int TIME_STAMP_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_TIME_PRIMITIVE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_TIME_PRIMITIVE_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_TYPE__ID = ABSTRACT_TIME_PRIMITIVE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_TYPE__TARGET_ID = ABSTRACT_TIME_PRIMITIVE_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_TYPE__ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_TYPE__ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP = ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_TYPE__ABSTRACT_TIME_PRIMITIVE_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_OBJECT_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_TYPE__ABSTRACT_TIME_PRIMITIVE_OBJECT_EXTENSION_GROUP = ABSTRACT_TIME_PRIMITIVE_TYPE__ABSTRACT_TIME_PRIMITIVE_OBJECT_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_TYPE__WHEN = ABSTRACT_TIME_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Stamp Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_TYPE__TIME_STAMP_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_TIME_PRIMITIVE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Stamp Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_TYPE__TIME_STAMP_SIMPLE_EXTENSION_GROUP = ABSTRACT_TIME_PRIMITIVE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Stamp Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_TYPE__TIME_STAMP_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_TIME_PRIMITIVE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Time Stamp Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_TYPE__TIME_STAMP_OBJECT_EXTENSION_GROUP = ABSTRACT_TIME_PRIMITIVE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Time Stamp Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_TYPE_FEATURE_COUNT = ABSTRACT_TIME_PRIMITIVE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Time Stamp Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STAMP_TYPE_OPERATION_COUNT = ABSTRACT_TIME_PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.UpdateTypeImpl <em>Update Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.UpdateTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getUpdateType()
	 * @generated
	 */
	int UPDATE_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Target Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__TARGET_HREF = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Create</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__CREATE = 2;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__DELETE = 3;

	/**
	 * The feature id for the '<em><b>Change</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__CHANGE = 4;

	/**
	 * The feature id for the '<em><b>Update Op Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__UPDATE_OP_EXTENSION_GROUP_GROUP = 5;

	/**
	 * The feature id for the '<em><b>Update Op Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__UPDATE_OP_EXTENSION_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Update Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__UPDATE_EXTENSION_GROUP_GROUP = 7;

	/**
	 * The feature id for the '<em><b>Update Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE__UPDATE_EXTENSION_GROUP = 8;

	/**
	 * The number of structural features of the '<em>Update Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Update Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.Vec2TypeImpl <em>Vec2 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.Vec2TypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getVec2Type()
	 * @generated
	 */
	int VEC2_TYPE = 66;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEC2_TYPE__X = 0;

	/**
	 * The feature id for the '<em><b>Xunits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEC2_TYPE__XUNITS = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEC2_TYPE__Y = 2;

	/**
	 * The feature id for the '<em><b>Yunits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEC2_TYPE__YUNITS = 3;

	/**
	 * The number of structural features of the '<em>Vec2 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEC2_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Vec2 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEC2_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.impl.ViewVolumeTypeImpl <em>View Volume Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.ViewVolumeTypeImpl
	 * @see net.opengis.kml.impl.KMLPackageImpl#getViewVolumeType()
	 * @generated
	 */
	int VIEW_VOLUME_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_VOLUME_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP_GROUP;

	/**
	 * The feature id for the '<em><b>Object Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_VOLUME_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE__OBJECT_SIMPLE_EXTENSION_GROUP;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_VOLUME_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Target Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_VOLUME_TYPE__TARGET_ID = ABSTRACT_OBJECT_TYPE__TARGET_ID;

	/**
	 * The feature id for the '<em><b>Left Fov</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_VOLUME_TYPE__LEFT_FOV = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Fov</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_VOLUME_TYPE__RIGHT_FOV = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bottom Fov</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_VOLUME_TYPE__BOTTOM_FOV = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Top Fov</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_VOLUME_TYPE__TOP_FOV = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Near</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_VOLUME_TYPE__NEAR = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>View Volume Simple Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_VOLUME_TYPE__VIEW_VOLUME_SIMPLE_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>View Volume Simple Extension Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_VOLUME_TYPE__VIEW_VOLUME_SIMPLE_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>View Volume Object Extension Group Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_VOLUME_TYPE__VIEW_VOLUME_OBJECT_EXTENSION_GROUP_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>View Volume Object Extension Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_VOLUME_TYPE__VIEW_VOLUME_OBJECT_EXTENSION_GROUP = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>View Volume Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_VOLUME_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>View Volume Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_VOLUME_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.kml.AltitudeModeEnumType <em>Altitude Mode Enum Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.AltitudeModeEnumType
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAltitudeModeEnumType()
	 * @generated
	 */
	int ALTITUDE_MODE_ENUM_TYPE = 68;

	/**
	 * The meta object id for the '{@link net.opengis.kml.ColorModeEnumType <em>Color Mode Enum Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.ColorModeEnumType
	 * @see net.opengis.kml.impl.KMLPackageImpl#getColorModeEnumType()
	 * @generated
	 */
	int COLOR_MODE_ENUM_TYPE = 69;

	/**
	 * The meta object id for the '{@link net.opengis.kml.DisplayModeEnumType <em>Display Mode Enum Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.DisplayModeEnumType
	 * @see net.opengis.kml.impl.KMLPackageImpl#getDisplayModeEnumType()
	 * @generated
	 */
	int DISPLAY_MODE_ENUM_TYPE = 70;

	/**
	 * The meta object id for the '{@link net.opengis.kml.GridOriginEnumType <em>Grid Origin Enum Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.GridOriginEnumType
	 * @see net.opengis.kml.impl.KMLPackageImpl#getGridOriginEnumType()
	 * @generated
	 */
	int GRID_ORIGIN_ENUM_TYPE = 71;

	/**
	 * The meta object id for the '{@link net.opengis.kml.ItemIconStateEnumType <em>Item Icon State Enum Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.ItemIconStateEnumType
	 * @see net.opengis.kml.impl.KMLPackageImpl#getItemIconStateEnumType()
	 * @generated
	 */
	int ITEM_ICON_STATE_ENUM_TYPE = 72;

	/**
	 * The meta object id for the '{@link net.opengis.kml.ListItemTypeEnumType <em>List Item Type Enum Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.ListItemTypeEnumType
	 * @see net.opengis.kml.impl.KMLPackageImpl#getListItemTypeEnumType()
	 * @generated
	 */
	int LIST_ITEM_TYPE_ENUM_TYPE = 73;

	/**
	 * The meta object id for the '{@link net.opengis.kml.RefreshModeEnumType <em>Refresh Mode Enum Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.RefreshModeEnumType
	 * @see net.opengis.kml.impl.KMLPackageImpl#getRefreshModeEnumType()
	 * @generated
	 */
	int REFRESH_MODE_ENUM_TYPE = 74;

	/**
	 * The meta object id for the '{@link net.opengis.kml.ShapeEnumType <em>Shape Enum Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.ShapeEnumType
	 * @see net.opengis.kml.impl.KMLPackageImpl#getShapeEnumType()
	 * @generated
	 */
	int SHAPE_ENUM_TYPE = 75;

	/**
	 * The meta object id for the '{@link net.opengis.kml.StyleStateEnumType <em>Style State Enum Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.StyleStateEnumType
	 * @see net.opengis.kml.impl.KMLPackageImpl#getStyleStateEnumType()
	 * @generated
	 */
	int STYLE_STATE_ENUM_TYPE = 76;

	/**
	 * The meta object id for the '{@link net.opengis.kml.UnitsEnumType <em>Units Enum Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.UnitsEnumType
	 * @see net.opengis.kml.impl.KMLPackageImpl#getUnitsEnumType()
	 * @generated
	 */
	int UNITS_ENUM_TYPE = 77;

	/**
	 * The meta object id for the '{@link net.opengis.kml.ViewRefreshModeEnumType <em>View Refresh Mode Enum Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.ViewRefreshModeEnumType
	 * @see net.opengis.kml.impl.KMLPackageImpl#getViewRefreshModeEnumType()
	 * @generated
	 */
	int VIEW_REFRESH_MODE_ENUM_TYPE = 78;

	/**
	 * The meta object id for the '<em>Altitude Mode Enum Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.AltitudeModeEnumType
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAltitudeModeEnumTypeObject()
	 * @generated
	 */
	int ALTITUDE_MODE_ENUM_TYPE_OBJECT = 79;

	/**
	 * The meta object id for the '<em>Angle180 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAngle180Type()
	 * @generated
	 */
	int ANGLE180_TYPE = 80;

	/**
	 * The meta object id for the '<em>Angle180 Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAngle180TypeObject()
	 * @generated
	 */
	int ANGLE180_TYPE_OBJECT = 81;

	/**
	 * The meta object id for the '<em>Angle360 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAngle360Type()
	 * @generated
	 */
	int ANGLE360_TYPE = 82;

	/**
	 * The meta object id for the '<em>Angle360 Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAngle360TypeObject()
	 * @generated
	 */
	int ANGLE360_TYPE_OBJECT = 83;

	/**
	 * The meta object id for the '<em>Angle90 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAngle90Type()
	 * @generated
	 */
	int ANGLE90_TYPE = 84;

	/**
	 * The meta object id for the '<em>Angle90 Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAngle90TypeObject()
	 * @generated
	 */
	int ANGLE90_TYPE_OBJECT = 85;

	/**
	 * The meta object id for the '<em>Anglepos180 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAnglepos180Type()
	 * @generated
	 */
	int ANGLEPOS180_TYPE = 86;

	/**
	 * The meta object id for the '<em>Anglepos180 Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAnglepos180TypeObject()
	 * @generated
	 */
	int ANGLEPOS180_TYPE_OBJECT = 87;

	/**
	 * The meta object id for the '<em>Anglepos90 Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAnglepos90Type()
	 * @generated
	 */
	int ANGLEPOS90_TYPE = 88;

	/**
	 * The meta object id for the '<em>Anglepos90 Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see net.opengis.kml.impl.KMLPackageImpl#getAnglepos90TypeObject()
	 * @generated
	 */
	int ANGLEPOS90_TYPE_OBJECT = 89;

	/**
	 * The meta object id for the '<em>Color Mode Enum Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.ColorModeEnumType
	 * @see net.opengis.kml.impl.KMLPackageImpl#getColorModeEnumTypeObject()
	 * @generated
	 */
	int COLOR_MODE_ENUM_TYPE_OBJECT = 90;

	/**
	 * The meta object id for the '<em>Color Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.impl.KMLPackageImpl#getColorType()
	 * @generated
	 */
	int COLOR_TYPE = 91;

	/**
	 * The meta object id for the '<em>Coordinates Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see net.opengis.kml.impl.KMLPackageImpl#getCoordinatesType()
	 * @generated
	 */
	int COORDINATES_TYPE = 92;

	/**
	 * The meta object id for the '<em>Date Time Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see net.opengis.kml.impl.KMLPackageImpl#getDateTimeType()
	 * @generated
	 */
	int DATE_TIME_TYPE = 93;

	/**
	 * The meta object id for the '<em>Display Mode Enum Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.DisplayModeEnumType
	 * @see net.opengis.kml.impl.KMLPackageImpl#getDisplayModeEnumTypeObject()
	 * @generated
	 */
	int DISPLAY_MODE_ENUM_TYPE_OBJECT = 94;

	/**
	 * The meta object id for the '<em>Grid Origin Enum Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.GridOriginEnumType
	 * @see net.opengis.kml.impl.KMLPackageImpl#getGridOriginEnumTypeObject()
	 * @generated
	 */
	int GRID_ORIGIN_ENUM_TYPE_OBJECT = 95;

	/**
	 * The meta object id for the '<em>Item Icon State Enum Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.ItemIconStateEnumType
	 * @see net.opengis.kml.impl.KMLPackageImpl#getItemIconStateEnumTypeObject()
	 * @generated
	 */
	int ITEM_ICON_STATE_ENUM_TYPE_OBJECT = 96;

	/**
	 * The meta object id for the '<em>Item Icon State Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see net.opengis.kml.impl.KMLPackageImpl#getItemIconStateType()
	 * @generated
	 */
	int ITEM_ICON_STATE_TYPE = 97;

	/**
	 * The meta object id for the '<em>List Item Type Enum Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.ListItemTypeEnumType
	 * @see net.opengis.kml.impl.KMLPackageImpl#getListItemTypeEnumTypeObject()
	 * @generated
	 */
	int LIST_ITEM_TYPE_ENUM_TYPE_OBJECT = 98;

	/**
	 * The meta object id for the '<em>Refresh Mode Enum Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.RefreshModeEnumType
	 * @see net.opengis.kml.impl.KMLPackageImpl#getRefreshModeEnumTypeObject()
	 * @generated
	 */
	int REFRESH_MODE_ENUM_TYPE_OBJECT = 99;

	/**
	 * The meta object id for the '<em>Shape Enum Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.ShapeEnumType
	 * @see net.opengis.kml.impl.KMLPackageImpl#getShapeEnumTypeObject()
	 * @generated
	 */
	int SHAPE_ENUM_TYPE_OBJECT = 100;

	/**
	 * The meta object id for the '<em>Style State Enum Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.StyleStateEnumType
	 * @see net.opengis.kml.impl.KMLPackageImpl#getStyleStateEnumTypeObject()
	 * @generated
	 */
	int STYLE_STATE_ENUM_TYPE_OBJECT = 101;

	/**
	 * The meta object id for the '<em>Units Enum Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.UnitsEnumType
	 * @see net.opengis.kml.impl.KMLPackageImpl#getUnitsEnumTypeObject()
	 * @generated
	 */
	int UNITS_ENUM_TYPE_OBJECT = 102;

	/**
	 * The meta object id for the '<em>View Refresh Mode Enum Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.kml.ViewRefreshModeEnumType
	 * @see net.opengis.kml.impl.KMLPackageImpl#getViewRefreshModeEnumTypeObject()
	 * @generated
	 */
	int VIEW_REFRESH_MODE_ENUM_TYPE_OBJECT = 103;


	/**
	 * Returns the meta object for class '{@link net.opengis.kml.AbstractColorStyleType <em>Abstract Color Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Color Style Type</em>'.
	 * @see net.opengis.kml.AbstractColorStyleType
	 * @generated
	 */
	EClass getAbstractColorStyleType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.AbstractColorStyleType#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.opengis.kml.AbstractColorStyleType#getColor()
	 * @see #getAbstractColorStyleType()
	 * @generated
	 */
	EAttribute getAbstractColorStyleType_Color();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.AbstractColorStyleType#getColorMode <em>Color Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Mode</em>'.
	 * @see net.opengis.kml.AbstractColorStyleType#getColorMode()
	 * @see #getAbstractColorStyleType()
	 * @generated
	 */
	EAttribute getAbstractColorStyleType_ColorMode();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractColorStyleType#getAbstractColorStyleSimpleExtensionGroupGroup <em>Abstract Color Style Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Color Style Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.AbstractColorStyleType#getAbstractColorStyleSimpleExtensionGroupGroup()
	 * @see #getAbstractColorStyleType()
	 * @generated
	 */
	EAttribute getAbstractColorStyleType_AbstractColorStyleSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractColorStyleType#getAbstractColorStyleSimpleExtensionGroup <em>Abstract Color Style Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Color Style Simple Extension Group</em>'.
	 * @see net.opengis.kml.AbstractColorStyleType#getAbstractColorStyleSimpleExtensionGroup()
	 * @see #getAbstractColorStyleType()
	 * @generated
	 */
	EAttribute getAbstractColorStyleType_AbstractColorStyleSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractColorStyleType#getAbstractColorStyleObjectExtensionGroupGroup <em>Abstract Color Style Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Color Style Object Extension Group Group</em>'.
	 * @see net.opengis.kml.AbstractColorStyleType#getAbstractColorStyleObjectExtensionGroupGroup()
	 * @see #getAbstractColorStyleType()
	 * @generated
	 */
	EAttribute getAbstractColorStyleType_AbstractColorStyleObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.AbstractColorStyleType#getAbstractColorStyleObjectExtensionGroup <em>Abstract Color Style Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Color Style Object Extension Group</em>'.
	 * @see net.opengis.kml.AbstractColorStyleType#getAbstractColorStyleObjectExtensionGroup()
	 * @see #getAbstractColorStyleType()
	 * @generated
	 */
	EReference getAbstractColorStyleType_AbstractColorStyleObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.AbstractContainerType <em>Abstract Container Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Container Type</em>'.
	 * @see net.opengis.kml.AbstractContainerType
	 * @generated
	 */
	EClass getAbstractContainerType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractContainerType#getAbstractContainerSimpleExtensionGroupGroup <em>Abstract Container Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Container Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.AbstractContainerType#getAbstractContainerSimpleExtensionGroupGroup()
	 * @see #getAbstractContainerType()
	 * @generated
	 */
	EAttribute getAbstractContainerType_AbstractContainerSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractContainerType#getAbstractContainerSimpleExtensionGroup <em>Abstract Container Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Container Simple Extension Group</em>'.
	 * @see net.opengis.kml.AbstractContainerType#getAbstractContainerSimpleExtensionGroup()
	 * @see #getAbstractContainerType()
	 * @generated
	 */
	EAttribute getAbstractContainerType_AbstractContainerSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractContainerType#getAbstractContainerObjectExtensionGroupGroup <em>Abstract Container Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Container Object Extension Group Group</em>'.
	 * @see net.opengis.kml.AbstractContainerType#getAbstractContainerObjectExtensionGroupGroup()
	 * @see #getAbstractContainerType()
	 * @generated
	 */
	EAttribute getAbstractContainerType_AbstractContainerObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.AbstractContainerType#getAbstractContainerObjectExtensionGroup <em>Abstract Container Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Container Object Extension Group</em>'.
	 * @see net.opengis.kml.AbstractContainerType#getAbstractContainerObjectExtensionGroup()
	 * @see #getAbstractContainerType()
	 * @generated
	 */
	EReference getAbstractContainerType_AbstractContainerObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.AbstractFeatureType <em>Abstract Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Feature Type</em>'.
	 * @see net.opengis.kml.AbstractFeatureType
	 * @generated
	 */
	EClass getAbstractFeatureType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.AbstractFeatureType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#getName()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EAttribute getAbstractFeatureType_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.AbstractFeatureType#isVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#isVisibility()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EAttribute getAbstractFeatureType_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.AbstractFeatureType#isOpen <em>Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#isOpen()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EAttribute getAbstractFeatureType_Open();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.AbstractFeatureType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Author</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#getAuthor()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EReference getAbstractFeatureType_Author();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.AbstractFeatureType#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#getLink()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EReference getAbstractFeatureType_Link();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.AbstractFeatureType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#getAddress()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EAttribute getAbstractFeatureType_Address();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.AbstractFeatureType#getAddressDetails <em>Address Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address Details</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#getAddressDetails()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EReference getAbstractFeatureType_AddressDetails();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.AbstractFeatureType#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#getPhoneNumber()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EAttribute getAbstractFeatureType_PhoneNumber();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.AbstractFeatureType#getSnippet <em>Snippet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Snippet</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#getSnippet()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EReference getAbstractFeatureType_Snippet();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.AbstractFeatureType#getSnippet1 <em>Snippet1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Snippet1</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#getSnippet1()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EAttribute getAbstractFeatureType_Snippet1();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.AbstractFeatureType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#getDescription()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EAttribute getAbstractFeatureType_Description();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractFeatureType#getAbstractViewGroupGroup <em>Abstract View Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract View Group Group</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#getAbstractViewGroupGroup()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EAttribute getAbstractFeatureType_AbstractViewGroupGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.AbstractFeatureType#getAbstractViewGroup <em>Abstract View Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract View Group</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#getAbstractViewGroup()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EReference getAbstractFeatureType_AbstractViewGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractFeatureType#getAbstractTimePrimitiveGroupGroup <em>Abstract Time Primitive Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Time Primitive Group Group</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#getAbstractTimePrimitiveGroupGroup()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EAttribute getAbstractFeatureType_AbstractTimePrimitiveGroupGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.AbstractFeatureType#getAbstractTimePrimitiveGroup <em>Abstract Time Primitive Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Time Primitive Group</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#getAbstractTimePrimitiveGroup()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EReference getAbstractFeatureType_AbstractTimePrimitiveGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.AbstractFeatureType#getStyleUrl <em>Style Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Url</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#getStyleUrl()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EAttribute getAbstractFeatureType_StyleUrl();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractFeatureType#getAbstractStyleSelectorGroupGroup <em>Abstract Style Selector Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Style Selector Group Group</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#getAbstractStyleSelectorGroupGroup()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EAttribute getAbstractFeatureType_AbstractStyleSelectorGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.AbstractFeatureType#getAbstractStyleSelectorGroup <em>Abstract Style Selector Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Style Selector Group</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#getAbstractStyleSelectorGroup()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EReference getAbstractFeatureType_AbstractStyleSelectorGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.AbstractFeatureType#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Region</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#getRegion()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EReference getAbstractFeatureType_Region();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.AbstractFeatureType#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#getMetadata()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EReference getAbstractFeatureType_Metadata();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.AbstractFeatureType#getExtendedData <em>Extended Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Data</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#getExtendedData()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EReference getAbstractFeatureType_ExtendedData();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractFeatureType#getAbstractFeatureSimpleExtensionGroupGroup <em>Abstract Feature Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Feature Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#getAbstractFeatureSimpleExtensionGroupGroup()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EAttribute getAbstractFeatureType_AbstractFeatureSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractFeatureType#getAbstractFeatureSimpleExtensionGroup <em>Abstract Feature Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Feature Simple Extension Group</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#getAbstractFeatureSimpleExtensionGroup()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EAttribute getAbstractFeatureType_AbstractFeatureSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractFeatureType#getAbstractFeatureObjectExtensionGroupGroup <em>Abstract Feature Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Feature Object Extension Group Group</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#getAbstractFeatureObjectExtensionGroupGroup()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EAttribute getAbstractFeatureType_AbstractFeatureObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.AbstractFeatureType#getAbstractFeatureObjectExtensionGroup <em>Abstract Feature Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Feature Object Extension Group</em>'.
	 * @see net.opengis.kml.AbstractFeatureType#getAbstractFeatureObjectExtensionGroup()
	 * @see #getAbstractFeatureType()
	 * @generated
	 */
	EReference getAbstractFeatureType_AbstractFeatureObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.AbstractGeometryType <em>Abstract Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Geometry Type</em>'.
	 * @see net.opengis.kml.AbstractGeometryType
	 * @generated
	 */
	EClass getAbstractGeometryType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractGeometryType#getAbstractGeometrySimpleExtensionGroupGroup <em>Abstract Geometry Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Geometry Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.AbstractGeometryType#getAbstractGeometrySimpleExtensionGroupGroup()
	 * @see #getAbstractGeometryType()
	 * @generated
	 */
	EAttribute getAbstractGeometryType_AbstractGeometrySimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractGeometryType#getAbstractGeometrySimpleExtensionGroup <em>Abstract Geometry Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Geometry Simple Extension Group</em>'.
	 * @see net.opengis.kml.AbstractGeometryType#getAbstractGeometrySimpleExtensionGroup()
	 * @see #getAbstractGeometryType()
	 * @generated
	 */
	EAttribute getAbstractGeometryType_AbstractGeometrySimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractGeometryType#getAbstractGeometryObjectExtensionGroupGroup <em>Abstract Geometry Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Geometry Object Extension Group Group</em>'.
	 * @see net.opengis.kml.AbstractGeometryType#getAbstractGeometryObjectExtensionGroupGroup()
	 * @see #getAbstractGeometryType()
	 * @generated
	 */
	EAttribute getAbstractGeometryType_AbstractGeometryObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.AbstractGeometryType#getAbstractGeometryObjectExtensionGroup <em>Abstract Geometry Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Geometry Object Extension Group</em>'.
	 * @see net.opengis.kml.AbstractGeometryType#getAbstractGeometryObjectExtensionGroup()
	 * @see #getAbstractGeometryType()
	 * @generated
	 */
	EReference getAbstractGeometryType_AbstractGeometryObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.AbstractLatLonBoxType <em>Abstract Lat Lon Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Lat Lon Box Type</em>'.
	 * @see net.opengis.kml.AbstractLatLonBoxType
	 * @generated
	 */
	EClass getAbstractLatLonBoxType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.AbstractLatLonBoxType#getNorth <em>North</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>North</em>'.
	 * @see net.opengis.kml.AbstractLatLonBoxType#getNorth()
	 * @see #getAbstractLatLonBoxType()
	 * @generated
	 */
	EAttribute getAbstractLatLonBoxType_North();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.AbstractLatLonBoxType#getSouth <em>South</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>South</em>'.
	 * @see net.opengis.kml.AbstractLatLonBoxType#getSouth()
	 * @see #getAbstractLatLonBoxType()
	 * @generated
	 */
	EAttribute getAbstractLatLonBoxType_South();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.AbstractLatLonBoxType#getEast <em>East</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>East</em>'.
	 * @see net.opengis.kml.AbstractLatLonBoxType#getEast()
	 * @see #getAbstractLatLonBoxType()
	 * @generated
	 */
	EAttribute getAbstractLatLonBoxType_East();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.AbstractLatLonBoxType#getWest <em>West</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>West</em>'.
	 * @see net.opengis.kml.AbstractLatLonBoxType#getWest()
	 * @see #getAbstractLatLonBoxType()
	 * @generated
	 */
	EAttribute getAbstractLatLonBoxType_West();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractLatLonBoxType#getAbstractLatLonBoxSimpleExtensionGroupGroup <em>Abstract Lat Lon Box Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Lat Lon Box Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.AbstractLatLonBoxType#getAbstractLatLonBoxSimpleExtensionGroupGroup()
	 * @see #getAbstractLatLonBoxType()
	 * @generated
	 */
	EAttribute getAbstractLatLonBoxType_AbstractLatLonBoxSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractLatLonBoxType#getAbstractLatLonBoxSimpleExtensionGroup <em>Abstract Lat Lon Box Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Lat Lon Box Simple Extension Group</em>'.
	 * @see net.opengis.kml.AbstractLatLonBoxType#getAbstractLatLonBoxSimpleExtensionGroup()
	 * @see #getAbstractLatLonBoxType()
	 * @generated
	 */
	EAttribute getAbstractLatLonBoxType_AbstractLatLonBoxSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractLatLonBoxType#getAbstractLatLonBoxObjectExtensionGroupGroup <em>Abstract Lat Lon Box Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Lat Lon Box Object Extension Group Group</em>'.
	 * @see net.opengis.kml.AbstractLatLonBoxType#getAbstractLatLonBoxObjectExtensionGroupGroup()
	 * @see #getAbstractLatLonBoxType()
	 * @generated
	 */
	EAttribute getAbstractLatLonBoxType_AbstractLatLonBoxObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.AbstractLatLonBoxType#getAbstractLatLonBoxObjectExtensionGroup <em>Abstract Lat Lon Box Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Lat Lon Box Object Extension Group</em>'.
	 * @see net.opengis.kml.AbstractLatLonBoxType#getAbstractLatLonBoxObjectExtensionGroup()
	 * @see #getAbstractLatLonBoxType()
	 * @generated
	 */
	EReference getAbstractLatLonBoxType_AbstractLatLonBoxObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.AbstractObjectType <em>Abstract Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Object Type</em>'.
	 * @see net.opengis.kml.AbstractObjectType
	 * @generated
	 */
	EClass getAbstractObjectType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractObjectType#getObjectSimpleExtensionGroupGroup <em>Object Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Object Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.AbstractObjectType#getObjectSimpleExtensionGroupGroup()
	 * @see #getAbstractObjectType()
	 * @generated
	 */
	EAttribute getAbstractObjectType_ObjectSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractObjectType#getObjectSimpleExtensionGroup <em>Object Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Object Simple Extension Group</em>'.
	 * @see net.opengis.kml.AbstractObjectType#getObjectSimpleExtensionGroup()
	 * @see #getAbstractObjectType()
	 * @generated
	 */
	EAttribute getAbstractObjectType_ObjectSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.AbstractObjectType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.opengis.kml.AbstractObjectType#getId()
	 * @see #getAbstractObjectType()
	 * @generated
	 */
	EAttribute getAbstractObjectType_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.AbstractObjectType#getTargetId <em>Target Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Id</em>'.
	 * @see net.opengis.kml.AbstractObjectType#getTargetId()
	 * @see #getAbstractObjectType()
	 * @generated
	 */
	EAttribute getAbstractObjectType_TargetId();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.AbstractOverlayType <em>Abstract Overlay Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Overlay Type</em>'.
	 * @see net.opengis.kml.AbstractOverlayType
	 * @generated
	 */
	EClass getAbstractOverlayType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.AbstractOverlayType#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.opengis.kml.AbstractOverlayType#getColor()
	 * @see #getAbstractOverlayType()
	 * @generated
	 */
	EAttribute getAbstractOverlayType_Color();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.AbstractOverlayType#getDrawOrder <em>Draw Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Draw Order</em>'.
	 * @see net.opengis.kml.AbstractOverlayType#getDrawOrder()
	 * @see #getAbstractOverlayType()
	 * @generated
	 */
	EAttribute getAbstractOverlayType_DrawOrder();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.AbstractOverlayType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see net.opengis.kml.AbstractOverlayType#getIcon()
	 * @see #getAbstractOverlayType()
	 * @generated
	 */
	EReference getAbstractOverlayType_Icon();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractOverlayType#getAbstractOverlaySimpleExtensionGroupGroup <em>Abstract Overlay Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Overlay Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.AbstractOverlayType#getAbstractOverlaySimpleExtensionGroupGroup()
	 * @see #getAbstractOverlayType()
	 * @generated
	 */
	EAttribute getAbstractOverlayType_AbstractOverlaySimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractOverlayType#getAbstractOverlaySimpleExtensionGroup <em>Abstract Overlay Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Overlay Simple Extension Group</em>'.
	 * @see net.opengis.kml.AbstractOverlayType#getAbstractOverlaySimpleExtensionGroup()
	 * @see #getAbstractOverlayType()
	 * @generated
	 */
	EAttribute getAbstractOverlayType_AbstractOverlaySimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractOverlayType#getAbstractOverlayObjectExtensionGroupGroup <em>Abstract Overlay Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Overlay Object Extension Group Group</em>'.
	 * @see net.opengis.kml.AbstractOverlayType#getAbstractOverlayObjectExtensionGroupGroup()
	 * @see #getAbstractOverlayType()
	 * @generated
	 */
	EAttribute getAbstractOverlayType_AbstractOverlayObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.AbstractOverlayType#getAbstractOverlayObjectExtensionGroup <em>Abstract Overlay Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Overlay Object Extension Group</em>'.
	 * @see net.opengis.kml.AbstractOverlayType#getAbstractOverlayObjectExtensionGroup()
	 * @see #getAbstractOverlayType()
	 * @generated
	 */
	EReference getAbstractOverlayType_AbstractOverlayObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.AbstractStyleSelectorType <em>Abstract Style Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Style Selector Type</em>'.
	 * @see net.opengis.kml.AbstractStyleSelectorType
	 * @generated
	 */
	EClass getAbstractStyleSelectorType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractStyleSelectorType#getAbstractStyleSelectorSimpleExtensionGroupGroup <em>Abstract Style Selector Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Style Selector Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.AbstractStyleSelectorType#getAbstractStyleSelectorSimpleExtensionGroupGroup()
	 * @see #getAbstractStyleSelectorType()
	 * @generated
	 */
	EAttribute getAbstractStyleSelectorType_AbstractStyleSelectorSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractStyleSelectorType#getAbstractStyleSelectorSimpleExtensionGroup <em>Abstract Style Selector Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Style Selector Simple Extension Group</em>'.
	 * @see net.opengis.kml.AbstractStyleSelectorType#getAbstractStyleSelectorSimpleExtensionGroup()
	 * @see #getAbstractStyleSelectorType()
	 * @generated
	 */
	EAttribute getAbstractStyleSelectorType_AbstractStyleSelectorSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractStyleSelectorType#getAbstractStyleSelectorObjectExtensionGroupGroup <em>Abstract Style Selector Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Style Selector Object Extension Group Group</em>'.
	 * @see net.opengis.kml.AbstractStyleSelectorType#getAbstractStyleSelectorObjectExtensionGroupGroup()
	 * @see #getAbstractStyleSelectorType()
	 * @generated
	 */
	EAttribute getAbstractStyleSelectorType_AbstractStyleSelectorObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.AbstractStyleSelectorType#getAbstractStyleSelectorObjectExtensionGroup <em>Abstract Style Selector Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Style Selector Object Extension Group</em>'.
	 * @see net.opengis.kml.AbstractStyleSelectorType#getAbstractStyleSelectorObjectExtensionGroup()
	 * @see #getAbstractStyleSelectorType()
	 * @generated
	 */
	EReference getAbstractStyleSelectorType_AbstractStyleSelectorObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.AbstractSubStyleType <em>Abstract Sub Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Sub Style Type</em>'.
	 * @see net.opengis.kml.AbstractSubStyleType
	 * @generated
	 */
	EClass getAbstractSubStyleType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractSubStyleType#getAbstractSubStyleSimpleExtensionGroupGroup <em>Abstract Sub Style Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Sub Style Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.AbstractSubStyleType#getAbstractSubStyleSimpleExtensionGroupGroup()
	 * @see #getAbstractSubStyleType()
	 * @generated
	 */
	EAttribute getAbstractSubStyleType_AbstractSubStyleSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractSubStyleType#getAbstractSubStyleSimpleExtensionGroup <em>Abstract Sub Style Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Sub Style Simple Extension Group</em>'.
	 * @see net.opengis.kml.AbstractSubStyleType#getAbstractSubStyleSimpleExtensionGroup()
	 * @see #getAbstractSubStyleType()
	 * @generated
	 */
	EAttribute getAbstractSubStyleType_AbstractSubStyleSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractSubStyleType#getAbstractSubStyleObjectExtensionGroupGroup <em>Abstract Sub Style Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Sub Style Object Extension Group Group</em>'.
	 * @see net.opengis.kml.AbstractSubStyleType#getAbstractSubStyleObjectExtensionGroupGroup()
	 * @see #getAbstractSubStyleType()
	 * @generated
	 */
	EAttribute getAbstractSubStyleType_AbstractSubStyleObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.AbstractSubStyleType#getAbstractSubStyleObjectExtensionGroup <em>Abstract Sub Style Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Sub Style Object Extension Group</em>'.
	 * @see net.opengis.kml.AbstractSubStyleType#getAbstractSubStyleObjectExtensionGroup()
	 * @see #getAbstractSubStyleType()
	 * @generated
	 */
	EReference getAbstractSubStyleType_AbstractSubStyleObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.AbstractTimePrimitiveType <em>Abstract Time Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Time Primitive Type</em>'.
	 * @see net.opengis.kml.AbstractTimePrimitiveType
	 * @generated
	 */
	EClass getAbstractTimePrimitiveType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractTimePrimitiveType#getAbstractTimePrimitiveSimpleExtensionGroupGroup <em>Abstract Time Primitive Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Time Primitive Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.AbstractTimePrimitiveType#getAbstractTimePrimitiveSimpleExtensionGroupGroup()
	 * @see #getAbstractTimePrimitiveType()
	 * @generated
	 */
	EAttribute getAbstractTimePrimitiveType_AbstractTimePrimitiveSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractTimePrimitiveType#getAbstractTimePrimitiveSimpleExtensionGroup <em>Abstract Time Primitive Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Time Primitive Simple Extension Group</em>'.
	 * @see net.opengis.kml.AbstractTimePrimitiveType#getAbstractTimePrimitiveSimpleExtensionGroup()
	 * @see #getAbstractTimePrimitiveType()
	 * @generated
	 */
	EAttribute getAbstractTimePrimitiveType_AbstractTimePrimitiveSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractTimePrimitiveType#getAbstractTimePrimitiveObjectExtensionGroupGroup <em>Abstract Time Primitive Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Time Primitive Object Extension Group Group</em>'.
	 * @see net.opengis.kml.AbstractTimePrimitiveType#getAbstractTimePrimitiveObjectExtensionGroupGroup()
	 * @see #getAbstractTimePrimitiveType()
	 * @generated
	 */
	EAttribute getAbstractTimePrimitiveType_AbstractTimePrimitiveObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.AbstractTimePrimitiveType#getAbstractTimePrimitiveObjectExtensionGroup <em>Abstract Time Primitive Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Time Primitive Object Extension Group</em>'.
	 * @see net.opengis.kml.AbstractTimePrimitiveType#getAbstractTimePrimitiveObjectExtensionGroup()
	 * @see #getAbstractTimePrimitiveType()
	 * @generated
	 */
	EReference getAbstractTimePrimitiveType_AbstractTimePrimitiveObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.AbstractViewType <em>Abstract View Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract View Type</em>'.
	 * @see net.opengis.kml.AbstractViewType
	 * @generated
	 */
	EClass getAbstractViewType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractViewType#getAbstractViewSimpleExtensionGroupGroup <em>Abstract View Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract View Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.AbstractViewType#getAbstractViewSimpleExtensionGroupGroup()
	 * @see #getAbstractViewType()
	 * @generated
	 */
	EAttribute getAbstractViewType_AbstractViewSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractViewType#getAbstractViewSimpleExtensionGroup <em>Abstract View Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract View Simple Extension Group</em>'.
	 * @see net.opengis.kml.AbstractViewType#getAbstractViewSimpleExtensionGroup()
	 * @see #getAbstractViewType()
	 * @generated
	 */
	EAttribute getAbstractViewType_AbstractViewSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AbstractViewType#getAbstractViewObjectExtensionGroupGroup <em>Abstract View Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract View Object Extension Group Group</em>'.
	 * @see net.opengis.kml.AbstractViewType#getAbstractViewObjectExtensionGroupGroup()
	 * @see #getAbstractViewType()
	 * @generated
	 */
	EAttribute getAbstractViewType_AbstractViewObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.AbstractViewType#getAbstractViewObjectExtensionGroup <em>Abstract View Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract View Object Extension Group</em>'.
	 * @see net.opengis.kml.AbstractViewType#getAbstractViewObjectExtensionGroup()
	 * @see #getAbstractViewType()
	 * @generated
	 */
	EReference getAbstractViewType_AbstractViewObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.AliasType <em>Alias Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias Type</em>'.
	 * @see net.opengis.kml.AliasType
	 * @generated
	 */
	EClass getAliasType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.AliasType#getTargetHref <em>Target Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Href</em>'.
	 * @see net.opengis.kml.AliasType#getTargetHref()
	 * @see #getAliasType()
	 * @generated
	 */
	EAttribute getAliasType_TargetHref();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.AliasType#getSourceHref <em>Source Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Href</em>'.
	 * @see net.opengis.kml.AliasType#getSourceHref()
	 * @see #getAliasType()
	 * @generated
	 */
	EAttribute getAliasType_SourceHref();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AliasType#getAliasSimpleExtensionGroupGroup <em>Alias Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Alias Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.AliasType#getAliasSimpleExtensionGroupGroup()
	 * @see #getAliasType()
	 * @generated
	 */
	EAttribute getAliasType_AliasSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AliasType#getAliasSimpleExtensionGroup <em>Alias Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Alias Simple Extension Group</em>'.
	 * @see net.opengis.kml.AliasType#getAliasSimpleExtensionGroup()
	 * @see #getAliasType()
	 * @generated
	 */
	EAttribute getAliasType_AliasSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.AliasType#getAliasObjectExtensionGroupGroup <em>Alias Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Alias Object Extension Group Group</em>'.
	 * @see net.opengis.kml.AliasType#getAliasObjectExtensionGroupGroup()
	 * @see #getAliasType()
	 * @generated
	 */
	EAttribute getAliasType_AliasObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.AliasType#getAliasObjectExtensionGroup <em>Alias Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias Object Extension Group</em>'.
	 * @see net.opengis.kml.AliasType#getAliasObjectExtensionGroup()
	 * @see #getAliasType()
	 * @generated
	 */
	EReference getAliasType_AliasObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.BalloonStyleType <em>Balloon Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Balloon Style Type</em>'.
	 * @see net.opengis.kml.BalloonStyleType
	 * @generated
	 */
	EClass getBalloonStyleType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.BalloonStyleType#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.opengis.kml.BalloonStyleType#getColor()
	 * @see #getBalloonStyleType()
	 * @generated
	 */
	EAttribute getBalloonStyleType_Color();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.BalloonStyleType#getBgColor <em>Bg Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bg Color</em>'.
	 * @see net.opengis.kml.BalloonStyleType#getBgColor()
	 * @see #getBalloonStyleType()
	 * @generated
	 */
	EAttribute getBalloonStyleType_BgColor();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.BalloonStyleType#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Color</em>'.
	 * @see net.opengis.kml.BalloonStyleType#getTextColor()
	 * @see #getBalloonStyleType()
	 * @generated
	 */
	EAttribute getBalloonStyleType_TextColor();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.BalloonStyleType#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.opengis.kml.BalloonStyleType#getText()
	 * @see #getBalloonStyleType()
	 * @generated
	 */
	EAttribute getBalloonStyleType_Text();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.BalloonStyleType#getDisplayMode <em>Display Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Mode</em>'.
	 * @see net.opengis.kml.BalloonStyleType#getDisplayMode()
	 * @see #getBalloonStyleType()
	 * @generated
	 */
	EAttribute getBalloonStyleType_DisplayMode();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.BalloonStyleType#getBalloonStyleSimpleExtensionGroupGroup <em>Balloon Style Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Balloon Style Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.BalloonStyleType#getBalloonStyleSimpleExtensionGroupGroup()
	 * @see #getBalloonStyleType()
	 * @generated
	 */
	EAttribute getBalloonStyleType_BalloonStyleSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.BalloonStyleType#getBalloonStyleSimpleExtensionGroup <em>Balloon Style Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Balloon Style Simple Extension Group</em>'.
	 * @see net.opengis.kml.BalloonStyleType#getBalloonStyleSimpleExtensionGroup()
	 * @see #getBalloonStyleType()
	 * @generated
	 */
	EAttribute getBalloonStyleType_BalloonStyleSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.BalloonStyleType#getBalloonStyleObjectExtensionGroupGroup <em>Balloon Style Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Balloon Style Object Extension Group Group</em>'.
	 * @see net.opengis.kml.BalloonStyleType#getBalloonStyleObjectExtensionGroupGroup()
	 * @see #getBalloonStyleType()
	 * @generated
	 */
	EAttribute getBalloonStyleType_BalloonStyleObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.BalloonStyleType#getBalloonStyleObjectExtensionGroup <em>Balloon Style Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Balloon Style Object Extension Group</em>'.
	 * @see net.opengis.kml.BalloonStyleType#getBalloonStyleObjectExtensionGroup()
	 * @see #getBalloonStyleType()
	 * @generated
	 */
	EReference getBalloonStyleType_BalloonStyleObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.BasicLinkType <em>Basic Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Link Type</em>'.
	 * @see net.opengis.kml.BasicLinkType
	 * @generated
	 */
	EClass getBasicLinkType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.BasicLinkType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see net.opengis.kml.BasicLinkType#getHref()
	 * @see #getBasicLinkType()
	 * @generated
	 */
	EAttribute getBasicLinkType_Href();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.BasicLinkType#getBasicLinkSimpleExtensionGroupGroup <em>Basic Link Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Basic Link Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.BasicLinkType#getBasicLinkSimpleExtensionGroupGroup()
	 * @see #getBasicLinkType()
	 * @generated
	 */
	EAttribute getBasicLinkType_BasicLinkSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.BasicLinkType#getBasicLinkSimpleExtensionGroup <em>Basic Link Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Basic Link Simple Extension Group</em>'.
	 * @see net.opengis.kml.BasicLinkType#getBasicLinkSimpleExtensionGroup()
	 * @see #getBasicLinkType()
	 * @generated
	 */
	EAttribute getBasicLinkType_BasicLinkSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.BasicLinkType#getBasicLinkObjectExtensionGroupGroup <em>Basic Link Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Basic Link Object Extension Group Group</em>'.
	 * @see net.opengis.kml.BasicLinkType#getBasicLinkObjectExtensionGroupGroup()
	 * @see #getBasicLinkType()
	 * @generated
	 */
	EAttribute getBasicLinkType_BasicLinkObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.BasicLinkType#getBasicLinkObjectExtensionGroup <em>Basic Link Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basic Link Object Extension Group</em>'.
	 * @see net.opengis.kml.BasicLinkType#getBasicLinkObjectExtensionGroup()
	 * @see #getBasicLinkType()
	 * @generated
	 */
	EReference getBasicLinkType_BasicLinkObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.BoundaryType <em>Boundary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boundary Type</em>'.
	 * @see net.opengis.kml.BoundaryType
	 * @generated
	 */
	EClass getBoundaryType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.BoundaryType#getLinearRing <em>Linear Ring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Linear Ring</em>'.
	 * @see net.opengis.kml.BoundaryType#getLinearRing()
	 * @see #getBoundaryType()
	 * @generated
	 */
	EReference getBoundaryType_LinearRing();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.BoundaryType#getBoundarySimpleExtensionGroupGroup <em>Boundary Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Boundary Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.BoundaryType#getBoundarySimpleExtensionGroupGroup()
	 * @see #getBoundaryType()
	 * @generated
	 */
	EAttribute getBoundaryType_BoundarySimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.BoundaryType#getBoundarySimpleExtensionGroup <em>Boundary Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Boundary Simple Extension Group</em>'.
	 * @see net.opengis.kml.BoundaryType#getBoundarySimpleExtensionGroup()
	 * @see #getBoundaryType()
	 * @generated
	 */
	EAttribute getBoundaryType_BoundarySimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.BoundaryType#getBoundaryObjectExtensionGroupGroup <em>Boundary Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Boundary Object Extension Group Group</em>'.
	 * @see net.opengis.kml.BoundaryType#getBoundaryObjectExtensionGroupGroup()
	 * @see #getBoundaryType()
	 * @generated
	 */
	EAttribute getBoundaryType_BoundaryObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.BoundaryType#getBoundaryObjectExtensionGroup <em>Boundary Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boundary Object Extension Group</em>'.
	 * @see net.opengis.kml.BoundaryType#getBoundaryObjectExtensionGroup()
	 * @see #getBoundaryType()
	 * @generated
	 */
	EReference getBoundaryType_BoundaryObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.CameraType <em>Camera Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera Type</em>'.
	 * @see net.opengis.kml.CameraType
	 * @generated
	 */
	EClass getCameraType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.CameraType#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see net.opengis.kml.CameraType#getLongitude()
	 * @see #getCameraType()
	 * @generated
	 */
	EAttribute getCameraType_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.CameraType#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see net.opengis.kml.CameraType#getLatitude()
	 * @see #getCameraType()
	 * @generated
	 */
	EAttribute getCameraType_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.CameraType#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see net.opengis.kml.CameraType#getAltitude()
	 * @see #getCameraType()
	 * @generated
	 */
	EAttribute getCameraType_Altitude();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.CameraType#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see net.opengis.kml.CameraType#getHeading()
	 * @see #getCameraType()
	 * @generated
	 */
	EAttribute getCameraType_Heading();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.CameraType#getTilt <em>Tilt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tilt</em>'.
	 * @see net.opengis.kml.CameraType#getTilt()
	 * @see #getCameraType()
	 * @generated
	 */
	EAttribute getCameraType_Tilt();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.CameraType#getRoll <em>Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll</em>'.
	 * @see net.opengis.kml.CameraType#getRoll()
	 * @see #getCameraType()
	 * @generated
	 */
	EAttribute getCameraType_Roll();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.CameraType#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Altitude Mode Group Group</em>'.
	 * @see net.opengis.kml.CameraType#getAltitudeModeGroupGroup()
	 * @see #getCameraType()
	 * @generated
	 */
	EAttribute getCameraType_AltitudeModeGroupGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.CameraType#getAltitudeModeGroup <em>Altitude Mode Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Altitude Mode Group</em>'.
	 * @see net.opengis.kml.CameraType#getAltitudeModeGroup()
	 * @see #getCameraType()
	 * @generated
	 */
	EReference getCameraType_AltitudeModeGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.CameraType#getCameraSimpleExtensionGroupGroup <em>Camera Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Camera Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.CameraType#getCameraSimpleExtensionGroupGroup()
	 * @see #getCameraType()
	 * @generated
	 */
	EAttribute getCameraType_CameraSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.CameraType#getCameraSimpleExtensionGroup <em>Camera Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Camera Simple Extension Group</em>'.
	 * @see net.opengis.kml.CameraType#getCameraSimpleExtensionGroup()
	 * @see #getCameraType()
	 * @generated
	 */
	EAttribute getCameraType_CameraSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.CameraType#getCameraObjectExtensionGroupGroup <em>Camera Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Camera Object Extension Group Group</em>'.
	 * @see net.opengis.kml.CameraType#getCameraObjectExtensionGroupGroup()
	 * @see #getCameraType()
	 * @generated
	 */
	EAttribute getCameraType_CameraObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.CameraType#getCameraObjectExtensionGroup <em>Camera Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Camera Object Extension Group</em>'.
	 * @see net.opengis.kml.CameraType#getCameraObjectExtensionGroup()
	 * @see #getCameraType()
	 * @generated
	 */
	EReference getCameraType_CameraObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.ChangeType <em>Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Type</em>'.
	 * @see net.opengis.kml.ChangeType
	 * @generated
	 */
	EClass getChangeType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ChangeType#getAbstractObjectGroupGroup <em>Abstract Object Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Object Group Group</em>'.
	 * @see net.opengis.kml.ChangeType#getAbstractObjectGroupGroup()
	 * @see #getChangeType()
	 * @generated
	 */
	EAttribute getChangeType_AbstractObjectGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.ChangeType#getAbstractObjectGroup <em>Abstract Object Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Object Group</em>'.
	 * @see net.opengis.kml.ChangeType#getAbstractObjectGroup()
	 * @see #getChangeType()
	 * @generated
	 */
	EReference getChangeType_AbstractObjectGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.CreateType <em>Create Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Type</em>'.
	 * @see net.opengis.kml.CreateType
	 * @generated
	 */
	EClass getCreateType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.CreateType#getAbstractContainerGroupGroup <em>Abstract Container Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Container Group Group</em>'.
	 * @see net.opengis.kml.CreateType#getAbstractContainerGroupGroup()
	 * @see #getCreateType()
	 * @generated
	 */
	EAttribute getCreateType_AbstractContainerGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.CreateType#getAbstractContainerGroup <em>Abstract Container Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Container Group</em>'.
	 * @see net.opengis.kml.CreateType#getAbstractContainerGroup()
	 * @see #getCreateType()
	 * @generated
	 */
	EReference getCreateType_AbstractContainerGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see net.opengis.kml.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DataType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see net.opengis.kml.DataType#getDisplayName()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DataType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.kml.DataType#getValue()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Value();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.DataType#getDataExtensionGroup <em>Data Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data Extension Group</em>'.
	 * @see net.opengis.kml.DataType#getDataExtensionGroup()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_DataExtensionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.DataType#getDataExtension <em>Data Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Extension</em>'.
	 * @see net.opengis.kml.DataType#getDataExtension()
	 * @see #getDataType()
	 * @generated
	 */
	EReference getDataType_DataExtension();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.kml.DataType#getName()
	 * @see #getDataType()
	 * @generated
	 */
	EAttribute getDataType_Name();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.DeleteType <em>Delete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Type</em>'.
	 * @see net.opengis.kml.DeleteType
	 * @generated
	 */
	EClass getDeleteType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.DeleteType#getAbstractFeatureGroupGroup <em>Abstract Feature Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Feature Group Group</em>'.
	 * @see net.opengis.kml.DeleteType#getAbstractFeatureGroupGroup()
	 * @see #getDeleteType()
	 * @generated
	 */
	EAttribute getDeleteType_AbstractFeatureGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.DeleteType#getAbstractFeatureGroup <em>Abstract Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Feature Group</em>'.
	 * @see net.opengis.kml.DeleteType#getAbstractFeatureGroup()
	 * @see #getDeleteType()
	 * @generated
	 */
	EReference getDeleteType_AbstractFeatureGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see net.opengis.kml.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.kml.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link net.opengis.kml.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see net.opengis.kml.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link net.opengis.kml.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see net.opengis.kml.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getAbstractColorStyleGroup <em>Abstract Color Style Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Color Style Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractColorStyleGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractColorStyleGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getAbstractSubStyleGroup <em>Abstract Sub Style Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Sub Style Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractSubStyleGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractSubStyleGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getAbstractObjectGroup <em>Abstract Object Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Object Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractObjectGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractObjectGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getAbstractColorStyleObjectExtensionGroup <em>Abstract Color Style Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Color Style Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractColorStyleObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractColorStyleObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getAbstractColorStyleSimpleExtensionGroup <em>Abstract Color Style Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract Color Style Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractColorStyleSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AbstractColorStyleSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getAbstractContainerGroup <em>Abstract Container Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Container Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractContainerGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractContainerGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getAbstractFeatureGroup <em>Abstract Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Feature Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractFeatureGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractFeatureGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getAbstractContainerObjectExtensionGroup <em>Abstract Container Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Container Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractContainerObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractContainerObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getAbstractContainerSimpleExtensionGroup <em>Abstract Container Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract Container Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractContainerSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AbstractContainerSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getAbstractFeatureObjectExtensionGroup <em>Abstract Feature Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Feature Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractFeatureObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractFeatureObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getAbstractFeatureSimpleExtensionGroup <em>Abstract Feature Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract Feature Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractFeatureSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AbstractFeatureSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getAbstractGeometryGroup <em>Abstract Geometry Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Geometry Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractGeometryGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractGeometryGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getAbstractGeometryObjectExtensionGroup <em>Abstract Geometry Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Geometry Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractGeometryObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractGeometryObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getAbstractGeometrySimpleExtensionGroup <em>Abstract Geometry Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract Geometry Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractGeometrySimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AbstractGeometrySimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getAbstractLatLonBoxObjectExtensionGroup <em>Abstract Lat Lon Box Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Lat Lon Box Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractLatLonBoxObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractLatLonBoxObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getAbstractLatLonBoxSimpleExtensionGroup <em>Abstract Lat Lon Box Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract Lat Lon Box Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractLatLonBoxSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AbstractLatLonBoxSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getAbstractOverlayGroup <em>Abstract Overlay Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Overlay Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractOverlayGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractOverlayGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getAbstractOverlayObjectExtensionGroup <em>Abstract Overlay Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Overlay Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractOverlayObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractOverlayObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getAbstractOverlaySimpleExtensionGroup <em>Abstract Overlay Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract Overlay Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractOverlaySimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AbstractOverlaySimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getAbstractStyleSelectorGroup <em>Abstract Style Selector Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Style Selector Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractStyleSelectorGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractStyleSelectorGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getAbstractStyleSelectorObjectExtensionGroup <em>Abstract Style Selector Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Style Selector Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractStyleSelectorObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractStyleSelectorObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getAbstractStyleSelectorSimpleExtensionGroup <em>Abstract Style Selector Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract Style Selector Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractStyleSelectorSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AbstractStyleSelectorSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getAbstractSubStyleObjectExtensionGroup <em>Abstract Sub Style Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Sub Style Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractSubStyleObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractSubStyleObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getAbstractSubStyleSimpleExtensionGroup <em>Abstract Sub Style Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract Sub Style Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractSubStyleSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AbstractSubStyleSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getAbstractTimePrimitiveGroup <em>Abstract Time Primitive Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Time Primitive Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractTimePrimitiveGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractTimePrimitiveGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getAbstractTimePrimitiveObjectExtensionGroup <em>Abstract Time Primitive Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Time Primitive Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractTimePrimitiveObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractTimePrimitiveObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getAbstractTimePrimitiveSimpleExtensionGroup <em>Abstract Time Primitive Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract Time Primitive Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractTimePrimitiveSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AbstractTimePrimitiveSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getAbstractViewGroup <em>Abstract View Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract View Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractViewGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractViewGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getAbstractViewObjectExtensionGroup <em>Abstract View Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract View Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractViewObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractViewObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getAbstractViewSimpleExtensionGroup <em>Abstract View Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract View Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAbstractViewSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AbstractViewSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Address();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alias</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAlias()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Alias();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getAliasObjectExtensionGroup <em>Alias Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alias Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAliasObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AliasObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getAliasSimpleExtensionGroup <em>Alias Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAliasSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AliasSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAltitude()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Altitude();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getAltitudeMode <em>Altitude Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude Mode</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAltitudeMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_AltitudeMode();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getAltitudeModeGroup <em>Altitude Mode Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Altitude Mode Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getAltitudeModeGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AltitudeModeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getBalloonStyle <em>Balloon Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Balloon Style</em>'.
	 * @see net.opengis.kml.DocumentRoot#getBalloonStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BalloonStyle();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getBalloonStyleObjectExtensionGroup <em>Balloon Style Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Balloon Style Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getBalloonStyleObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BalloonStyleObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getBalloonStyleSimpleExtensionGroup <em>Balloon Style Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balloon Style Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getBalloonStyleSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BalloonStyleSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getBasicLinkObjectExtensionGroup <em>Basic Link Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basic Link Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getBasicLinkObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BasicLinkObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getBasicLinkSimpleExtensionGroup <em>Basic Link Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Basic Link Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getBasicLinkSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BasicLinkSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see net.opengis.kml.DocumentRoot#getBegin()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Begin();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getBgColor <em>Bg Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bg Color</em>'.
	 * @see net.opengis.kml.DocumentRoot#getBgColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BgColor();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getBottomFov <em>Bottom Fov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom Fov</em>'.
	 * @see net.opengis.kml.DocumentRoot#getBottomFov()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BottomFov();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getBoundaryObjectExtensionGroup <em>Boundary Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boundary Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getBoundaryObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BoundaryObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getBoundarySimpleExtensionGroup <em>Boundary Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boundary Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getBoundarySimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_BoundarySimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getCamera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Camera</em>'.
	 * @see net.opengis.kml.DocumentRoot#getCamera()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Camera();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getCameraObjectExtensionGroup <em>Camera Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Camera Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getCameraObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_CameraObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getCameraSimpleExtensionGroup <em>Camera Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Camera Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getCameraSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CameraSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getChange <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Change</em>'.
	 * @see net.opengis.kml.DocumentRoot#getChange()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Change();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.opengis.kml.DocumentRoot#getColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Color();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getColorMode <em>Color Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color Mode</em>'.
	 * @see net.opengis.kml.DocumentRoot#getColorMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ColorMode();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getCookie <em>Cookie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cookie</em>'.
	 * @see net.opengis.kml.DocumentRoot#getCookie()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Cookie();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinates</em>'.
	 * @see net.opengis.kml.DocumentRoot#getCoordinates()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Coordinates();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getCreate <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create</em>'.
	 * @see net.opengis.kml.DocumentRoot#getCreate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Create();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data</em>'.
	 * @see net.opengis.kml.DocumentRoot#getData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Data();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getDataExtension <em>Data Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Extension</em>'.
	 * @see net.opengis.kml.DocumentRoot#getDataExtension()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DataExtension();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delete</em>'.
	 * @see net.opengis.kml.DocumentRoot#getDelete()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Delete();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.opengis.kml.DocumentRoot#getDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getDisplayMode <em>Display Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Mode</em>'.
	 * @see net.opengis.kml.DocumentRoot#getDisplayMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DisplayMode();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see net.opengis.kml.DocumentRoot#getDisplayName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DisplayName();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getDocument <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document</em>'.
	 * @see net.opengis.kml.DocumentRoot#getDocument()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Document();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getDocumentObjectExtensionGroup <em>Document Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Document Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getDocumentObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DocumentObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getDocumentSimpleExtensionGroup <em>Document Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getDocumentSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DocumentSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getDrawOrder <em>Draw Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Draw Order</em>'.
	 * @see net.opengis.kml.DocumentRoot#getDrawOrder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DrawOrder();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getEast <em>East</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>East</em>'.
	 * @see net.opengis.kml.DocumentRoot#getEast()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_East();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see net.opengis.kml.DocumentRoot#getEnd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_End();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getExpires <em>Expires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expires</em>'.
	 * @see net.opengis.kml.DocumentRoot#getExpires()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Expires();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getExtendedData <em>Extended Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extended Data</em>'.
	 * @see net.opengis.kml.DocumentRoot#getExtendedData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ExtendedData();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#isExtrude <em>Extrude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrude</em>'.
	 * @see net.opengis.kml.DocumentRoot#isExtrude()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Extrude();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#isFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see net.opengis.kml.DocumentRoot#isFill()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Fill();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#isFlyToView <em>Fly To View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fly To View</em>'.
	 * @see net.opengis.kml.DocumentRoot#isFlyToView()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FlyToView();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Folder</em>'.
	 * @see net.opengis.kml.DocumentRoot#getFolder()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Folder();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getFolderObjectExtensionGroup <em>Folder Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Folder Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getFolderObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FolderObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getFolderSimpleExtensionGroup <em>Folder Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Folder Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getFolderSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_FolderSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getGridOrigin <em>Grid Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Origin</em>'.
	 * @see net.opengis.kml.DocumentRoot#getGridOrigin()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GridOrigin();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getGroundOverlay <em>Ground Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ground Overlay</em>'.
	 * @see net.opengis.kml.DocumentRoot#getGroundOverlay()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GroundOverlay();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getGroundOverlayObjectExtensionGroup <em>Ground Overlay Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ground Overlay Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getGroundOverlayObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GroundOverlayObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getGroundOverlaySimpleExtensionGroup <em>Ground Overlay Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ground Overlay Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getGroundOverlaySimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GroundOverlaySimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see net.opengis.kml.DocumentRoot#getHeading()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Heading();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getHotSpot <em>Hot Spot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hot Spot</em>'.
	 * @see net.opengis.kml.DocumentRoot#getHotSpot()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_HotSpot();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see net.opengis.kml.DocumentRoot#getHref()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Href();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getHttpQuery <em>Http Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Query</em>'.
	 * @see net.opengis.kml.DocumentRoot#getHttpQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_HttpQuery();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see net.opengis.kml.DocumentRoot#getIcon()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getIconStyle <em>Icon Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon Style</em>'.
	 * @see net.opengis.kml.DocumentRoot#getIconStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IconStyle();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getIconStyleObjectExtensionGroup <em>Icon Style Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon Style Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getIconStyleObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_IconStyleObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getIconStyleSimpleExtensionGroup <em>Icon Style Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon Style Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getIconStyleSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IconStyleSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getImagePyramid <em>Image Pyramid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Pyramid</em>'.
	 * @see net.opengis.kml.DocumentRoot#getImagePyramid()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ImagePyramid();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getImagePyramidObjectExtensionGroup <em>Image Pyramid Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Pyramid Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getImagePyramidObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ImagePyramidObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getImagePyramidSimpleExtensionGroup <em>Image Pyramid Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Pyramid Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getImagePyramidSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ImagePyramidSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getInnerBoundaryIs <em>Inner Boundary Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inner Boundary Is</em>'.
	 * @see net.opengis.kml.DocumentRoot#getInnerBoundaryIs()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_InnerBoundaryIs();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getItemIcon <em>Item Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Icon</em>'.
	 * @see net.opengis.kml.DocumentRoot#getItemIcon()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ItemIcon();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getItemIconObjectExtensionGroup <em>Item Icon Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Icon Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getItemIconObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ItemIconObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getItemIconSimpleExtensionGroup <em>Item Icon Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item Icon Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getItemIconSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ItemIconSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see net.opengis.kml.DocumentRoot#getKey()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Key();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getKml <em>Kml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kml</em>'.
	 * @see net.opengis.kml.DocumentRoot#getKml()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Kml();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getKmlObjectExtensionGroup <em>Kml Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kml Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getKmlObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_KmlObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getKmlSimpleExtensionGroup <em>Kml Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kml Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getKmlSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_KmlSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getLabelStyle <em>Label Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Style</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLabelStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LabelStyle();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getLabelStyleObjectExtensionGroup <em>Label Style Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Style Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLabelStyleObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LabelStyleObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getLabelStyleSimpleExtensionGroup <em>Label Style Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Style Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLabelStyleSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LabelStyleSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLatitude()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Latitude();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getLatLonAltBox <em>Lat Lon Alt Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lat Lon Alt Box</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLatLonAltBox()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LatLonAltBox();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getLatLonAltBoxObjectExtensionGroup <em>Lat Lon Alt Box Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lat Lon Alt Box Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLatLonAltBoxObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LatLonAltBoxObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getLatLonAltBoxSimpleExtensionGroup <em>Lat Lon Alt Box Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat Lon Alt Box Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLatLonAltBoxSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LatLonAltBoxSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getLatLonBox <em>Lat Lon Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lat Lon Box</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLatLonBox()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LatLonBox();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getLatLonBoxObjectExtensionGroup <em>Lat Lon Box Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lat Lon Box Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLatLonBoxObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LatLonBoxObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getLatLonBoxSimpleExtensionGroup <em>Lat Lon Box Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat Lon Box Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLatLonBoxSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LatLonBoxSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getLeftFov <em>Left Fov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Fov</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLeftFov()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LeftFov();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getLinearRing <em>Linear Ring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Linear Ring</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLinearRing()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LinearRing();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getLinearRingObjectExtensionGroup <em>Linear Ring Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Linear Ring Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLinearRingObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LinearRingObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getLinearRingSimpleExtensionGroup <em>Linear Ring Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linear Ring Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLinearRingSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LinearRingSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getLineString <em>Line String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line String</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLineString()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LineString();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getLineStringObjectExtensionGroup <em>Line String Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line String Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLineStringObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LineStringObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getLineStringSimpleExtensionGroup <em>Line String Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line String Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLineStringSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LineStringSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getLineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line Style</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLineStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LineStyle();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getLineStyleObjectExtensionGroup <em>Line Style Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line Style Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLineStyleObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LineStyleObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getLineStyleSimpleExtensionGroup <em>Line Style Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Style Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLineStyleSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LineStyleSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Link();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getLinkDescription <em>Link Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Description</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLinkDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LinkDescription();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getLinkName <em>Link Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Name</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLinkName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LinkName();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getLinkObjectExtensionGroup <em>Link Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLinkObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LinkObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getLinkSimpleExtensionGroup <em>Link Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLinkSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LinkSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getLinkSnippet <em>Link Snippet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link Snippet</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLinkSnippet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LinkSnippet();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getListItemType <em>List Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Item Type</em>'.
	 * @see net.opengis.kml.DocumentRoot#getListItemType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ListItemType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getListStyle <em>List Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Style</em>'.
	 * @see net.opengis.kml.DocumentRoot#getListStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ListStyle();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getListStyleObjectExtensionGroup <em>List Style Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Style Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getListStyleObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ListStyleObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getListStyleSimpleExtensionGroup <em>List Style Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Style Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getListStyleSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ListStyleSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Location();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getLocationObjectExtensionGroup <em>Location Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLocationObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LocationObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getLocationSimpleExtensionGroup <em>Location Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLocationSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LocationSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getLod <em>Lod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Lod();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getLodObjectExtensionGroup <em>Lod Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLodObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LodObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getLodSimpleExtensionGroup <em>Lod Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lod Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLodSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LodSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLongitude()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Longitude();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getLookAt <em>Look At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Look At</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLookAt()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LookAt();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getLookAtObjectExtensionGroup <em>Look At Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Look At Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLookAtObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LookAtObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getLookAtSimpleExtensionGroup <em>Look At Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Look At Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getLookAtSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LookAtSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getMaxAltitude <em>Max Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Altitude</em>'.
	 * @see net.opengis.kml.DocumentRoot#getMaxAltitude()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MaxAltitude();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getMaxFadeExtent <em>Max Fade Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Fade Extent</em>'.
	 * @see net.opengis.kml.DocumentRoot#getMaxFadeExtent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MaxFadeExtent();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getMaxHeight <em>Max Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Height</em>'.
	 * @see net.opengis.kml.DocumentRoot#getMaxHeight()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MaxHeight();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getMaxLodPixels <em>Max Lod Pixels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Lod Pixels</em>'.
	 * @see net.opengis.kml.DocumentRoot#getMaxLodPixels()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MaxLodPixels();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getMaxSessionLength <em>Max Session Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Session Length</em>'.
	 * @see net.opengis.kml.DocumentRoot#getMaxSessionLength()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MaxSessionLength();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getMaxSnippetLines <em>Max Snippet Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Snippet Lines</em>'.
	 * @see net.opengis.kml.DocumentRoot#getMaxSnippetLines()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MaxSnippetLines();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getMaxWidth <em>Max Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Width</em>'.
	 * @see net.opengis.kml.DocumentRoot#getMaxWidth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MaxWidth();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see net.opengis.kml.DocumentRoot#getMessage()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Message();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see net.opengis.kml.DocumentRoot#getMetadata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getMinAltitude <em>Min Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Altitude</em>'.
	 * @see net.opengis.kml.DocumentRoot#getMinAltitude()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MinAltitude();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getMinFadeExtent <em>Min Fade Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Fade Extent</em>'.
	 * @see net.opengis.kml.DocumentRoot#getMinFadeExtent()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MinFadeExtent();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getMinLodPixels <em>Min Lod Pixels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Lod Pixels</em>'.
	 * @see net.opengis.kml.DocumentRoot#getMinLodPixels()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MinLodPixels();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getMinRefreshPeriod <em>Min Refresh Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Refresh Period</em>'.
	 * @see net.opengis.kml.DocumentRoot#getMinRefreshPeriod()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MinRefreshPeriod();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see net.opengis.kml.DocumentRoot#getModel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Model();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getModelObjectExtensionGroup <em>Model Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getModelObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ModelObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getModelSimpleExtensionGroup <em>Model Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getModelSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ModelSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getMultiGeometry <em>Multi Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multi Geometry</em>'.
	 * @see net.opengis.kml.DocumentRoot#getMultiGeometry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MultiGeometry();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getMultiGeometryObjectExtensionGroup <em>Multi Geometry Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multi Geometry Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getMultiGeometryObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MultiGeometryObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getMultiGeometrySimpleExtensionGroup <em>Multi Geometry Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Geometry Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getMultiGeometrySimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MultiGeometrySimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.kml.DocumentRoot#getName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getNear <em>Near</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Near</em>'.
	 * @see net.opengis.kml.DocumentRoot#getNear()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Near();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getNetworkLink <em>Network Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Link</em>'.
	 * @see net.opengis.kml.DocumentRoot#getNetworkLink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NetworkLink();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getNetworkLinkControl <em>Network Link Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Link Control</em>'.
	 * @see net.opengis.kml.DocumentRoot#getNetworkLinkControl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NetworkLinkControl();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getNetworkLinkControlObjectExtensionGroup <em>Network Link Control Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Link Control Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getNetworkLinkControlObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NetworkLinkControlObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getNetworkLinkControlSimpleExtensionGroup <em>Network Link Control Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Link Control Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getNetworkLinkControlSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NetworkLinkControlSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getNetworkLinkObjectExtensionGroup <em>Network Link Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Link Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getNetworkLinkObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_NetworkLinkObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getNetworkLinkSimpleExtensionGroup <em>Network Link Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Link Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getNetworkLinkSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NetworkLinkSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getNorth <em>North</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>North</em>'.
	 * @see net.opengis.kml.DocumentRoot#getNorth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_North();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getObjectSimpleExtensionGroup <em>Object Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getObjectSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ObjectSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#isOpen <em>Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open</em>'.
	 * @see net.opengis.kml.DocumentRoot#isOpen()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Open();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Orientation</em>'.
	 * @see net.opengis.kml.DocumentRoot#getOrientation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Orientation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getOrientationObjectExtensionGroup <em>Orientation Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Orientation Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getOrientationObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OrientationObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getOrientationSimpleExtensionGroup <em>Orientation Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getOrientationSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_OrientationSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getOuterBoundaryIs <em>Outer Boundary Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outer Boundary Is</em>'.
	 * @see net.opengis.kml.DocumentRoot#getOuterBoundaryIs()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OuterBoundaryIs();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#isOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see net.opengis.kml.DocumentRoot#isOutline()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Outline();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getOverlayXY <em>Overlay XY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Overlay XY</em>'.
	 * @see net.opengis.kml.DocumentRoot#getOverlayXY()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OverlayXY();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getPair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pair</em>'.
	 * @see net.opengis.kml.DocumentRoot#getPair()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Pair();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getPairObjectExtensionGroup <em>Pair Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pair Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getPairObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PairObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getPairSimpleExtensionGroup <em>Pair Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pair Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getPairSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PairSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see net.opengis.kml.DocumentRoot#getPhoneNumber()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PhoneNumber();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getPhotoOverlay <em>Photo Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Photo Overlay</em>'.
	 * @see net.opengis.kml.DocumentRoot#getPhotoOverlay()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PhotoOverlay();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getPhotoOverlayObjectExtensionGroup <em>Photo Overlay Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Photo Overlay Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getPhotoOverlayObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PhotoOverlayObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getPhotoOverlaySimpleExtensionGroup <em>Photo Overlay Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Photo Overlay Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getPhotoOverlaySimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PhotoOverlaySimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getPlacemark <em>Placemark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Placemark</em>'.
	 * @see net.opengis.kml.DocumentRoot#getPlacemark()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Placemark();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getPlacemarkObjectExtensionGroup <em>Placemark Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Placemark Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getPlacemarkObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PlacemarkObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getPlacemarkSimpleExtensionGroup <em>Placemark Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Placemark Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getPlacemarkSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PlacemarkSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point</em>'.
	 * @see net.opengis.kml.DocumentRoot#getPoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Point();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getPointObjectExtensionGroup <em>Point Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getPointObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PointObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getPointSimpleExtensionGroup <em>Point Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Point Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getPointSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PointSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Polygon</em>'.
	 * @see net.opengis.kml.DocumentRoot#getPolygon()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Polygon();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getPolygonObjectExtensionGroup <em>Polygon Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Polygon Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getPolygonObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PolygonObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getPolygonSimpleExtensionGroup <em>Polygon Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polygon Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getPolygonSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PolygonSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getPolyStyle <em>Poly Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Poly Style</em>'.
	 * @see net.opengis.kml.DocumentRoot#getPolyStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PolyStyle();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getPolyStyleObjectExtensionGroup <em>Poly Style Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Poly Style Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getPolyStyleObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PolyStyleObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getPolyStyleSimpleExtensionGroup <em>Poly Style Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Poly Style Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getPolyStyleSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PolyStyleSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see net.opengis.kml.DocumentRoot#getRange()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Range();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getRefreshInterval <em>Refresh Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Interval</em>'.
	 * @see net.opengis.kml.DocumentRoot#getRefreshInterval()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RefreshInterval();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getRefreshMode <em>Refresh Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Mode</em>'.
	 * @see net.opengis.kml.DocumentRoot#getRefreshMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RefreshMode();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#isRefreshVisibility <em>Refresh Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Visibility</em>'.
	 * @see net.opengis.kml.DocumentRoot#isRefreshVisibility()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RefreshVisibility();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Region</em>'.
	 * @see net.opengis.kml.DocumentRoot#getRegion()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Region();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getRegionObjectExtensionGroup <em>Region Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Region Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getRegionObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RegionObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getRegionSimpleExtensionGroup <em>Region Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getRegionSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RegionSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getResourceMap <em>Resource Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Map</em>'.
	 * @see net.opengis.kml.DocumentRoot#getResourceMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResourceMap();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getResourceMapObjectExtensionGroup <em>Resource Map Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Map Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getResourceMapObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ResourceMapObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getResourceMapSimpleExtensionGroup <em>Resource Map Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Map Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getResourceMapSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ResourceMapSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getRightFov <em>Right Fov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Fov</em>'.
	 * @see net.opengis.kml.DocumentRoot#getRightFov()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_RightFov();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getRoll <em>Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll</em>'.
	 * @see net.opengis.kml.DocumentRoot#getRoll()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Roll();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see net.opengis.kml.DocumentRoot#getRotation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Rotation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getRotationXY <em>Rotation XY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rotation XY</em>'.
	 * @see net.opengis.kml.DocumentRoot#getRotationXY()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RotationXY();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see net.opengis.kml.DocumentRoot#getScale()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Scale();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getScale1 <em>Scale1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scale1</em>'.
	 * @see net.opengis.kml.DocumentRoot#getScale1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Scale1();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getScaleObjectExtensionGroup <em>Scale Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scale Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getScaleObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ScaleObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getScaleSimpleExtensionGroup <em>Scale Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getScaleSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ScaleSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see net.opengis.kml.DocumentRoot#getSchema()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Schema();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getSchemaData <em>Schema Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema Data</em>'.
	 * @see net.opengis.kml.DocumentRoot#getSchemaData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SchemaData();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getSchemaDataExtension <em>Schema Data Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema Data Extension</em>'.
	 * @see net.opengis.kml.DocumentRoot#getSchemaDataExtension()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SchemaDataExtension();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getSchemaExtension <em>Schema Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema Extension</em>'.
	 * @see net.opengis.kml.DocumentRoot#getSchemaExtension()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SchemaExtension();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getScreenOverlay <em>Screen Overlay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Screen Overlay</em>'.
	 * @see net.opengis.kml.DocumentRoot#getScreenOverlay()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ScreenOverlay();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getScreenOverlayObjectExtensionGroup <em>Screen Overlay Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Screen Overlay Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getScreenOverlayObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ScreenOverlayObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getScreenOverlaySimpleExtensionGroup <em>Screen Overlay Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Screen Overlay Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getScreenOverlaySimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ScreenOverlaySimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getScreenXY <em>Screen XY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Screen XY</em>'.
	 * @see net.opengis.kml.DocumentRoot#getScreenXY()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ScreenXY();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see net.opengis.kml.DocumentRoot#getShape()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Shape();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getSimpleData <em>Simple Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Data</em>'.
	 * @see net.opengis.kml.DocumentRoot#getSimpleData()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SimpleData();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getSimpleField <em>Simple Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Field</em>'.
	 * @see net.opengis.kml.DocumentRoot#getSimpleField()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SimpleField();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getSimpleFieldExtension <em>Simple Field Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Field Extension</em>'.
	 * @see net.opengis.kml.DocumentRoot#getSimpleFieldExtension()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SimpleFieldExtension();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see net.opengis.kml.DocumentRoot#getSize()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Size();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getSnippet <em>Snippet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Snippet</em>'.
	 * @see net.opengis.kml.DocumentRoot#getSnippet()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Snippet();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getSnippet1 <em>Snippet1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Snippet1</em>'.
	 * @see net.opengis.kml.DocumentRoot#getSnippet1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Snippet1();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getSourceHref <em>Source Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Href</em>'.
	 * @see net.opengis.kml.DocumentRoot#getSourceHref()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SourceHref();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getSouth <em>South</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>South</em>'.
	 * @see net.opengis.kml.DocumentRoot#getSouth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_South();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see net.opengis.kml.DocumentRoot#getState()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_State();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style</em>'.
	 * @see net.opengis.kml.DocumentRoot#getStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Style();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getStyleMap <em>Style Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style Map</em>'.
	 * @see net.opengis.kml.DocumentRoot#getStyleMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StyleMap();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getStyleMapObjectExtensionGroup <em>Style Map Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style Map Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getStyleMapObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StyleMapObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getStyleMapSimpleExtensionGroup <em>Style Map Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Map Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getStyleMapSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StyleMapSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getStyleObjectExtensionGroup <em>Style Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Style Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getStyleObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_StyleObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getStyleSimpleExtensionGroup <em>Style Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getStyleSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StyleSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getStyleUrl <em>Style Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Url</em>'.
	 * @see net.opengis.kml.DocumentRoot#getStyleUrl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StyleUrl();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getTargetHref <em>Target Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Href</em>'.
	 * @see net.opengis.kml.DocumentRoot#getTargetHref()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TargetHref();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#isTessellate <em>Tessellate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tessellate</em>'.
	 * @see net.opengis.kml.DocumentRoot#isTessellate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Tessellate();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.opengis.kml.DocumentRoot#getText()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Text();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getTextColor <em>Text Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Color</em>'.
	 * @see net.opengis.kml.DocumentRoot#getTextColor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TextColor();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getTileSize <em>Tile Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tile Size</em>'.
	 * @see net.opengis.kml.DocumentRoot#getTileSize()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TileSize();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getTilt <em>Tilt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tilt</em>'.
	 * @see net.opengis.kml.DocumentRoot#getTilt()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Tilt();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getTimeSpan <em>Time Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Span</em>'.
	 * @see net.opengis.kml.DocumentRoot#getTimeSpan()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TimeSpan();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getTimeSpanObjectExtensionGroup <em>Time Span Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Span Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getTimeSpanObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TimeSpanObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getTimeSpanSimpleExtensionGroup <em>Time Span Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Span Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getTimeSpanSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TimeSpanSimpleExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp</em>'.
	 * @see net.opengis.kml.DocumentRoot#getTimeStamp()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TimeStamp();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getTimeStampObjectExtensionGroup <em>Time Stamp Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stamp Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getTimeStampObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TimeStampObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getTimeStampSimpleExtensionGroup <em>Time Stamp Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getTimeStampSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TimeStampSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getTopFov <em>Top Fov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Fov</em>'.
	 * @see net.opengis.kml.DocumentRoot#getTopFov()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TopFov();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update</em>'.
	 * @see net.opengis.kml.DocumentRoot#getUpdate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Update();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getUpdateExtensionGroup <em>Update Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getUpdateExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UpdateExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getUpdateOpExtensionGroup <em>Update Op Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update Op Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getUpdateOpExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UpdateOpExtensionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url</em>'.
	 * @see net.opengis.kml.DocumentRoot#getUrl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Url();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.kml.DocumentRoot#getValue()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getViewBoundScale <em>View Bound Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Bound Scale</em>'.
	 * @see net.opengis.kml.DocumentRoot#getViewBoundScale()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ViewBoundScale();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getViewFormat <em>View Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Format</em>'.
	 * @see net.opengis.kml.DocumentRoot#getViewFormat()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ViewFormat();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getViewRefreshMode <em>View Refresh Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Refresh Mode</em>'.
	 * @see net.opengis.kml.DocumentRoot#getViewRefreshMode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ViewRefreshMode();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getViewRefreshTime <em>View Refresh Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Refresh Time</em>'.
	 * @see net.opengis.kml.DocumentRoot#getViewRefreshTime()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ViewRefreshTime();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getViewVolume <em>View Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View Volume</em>'.
	 * @see net.opengis.kml.DocumentRoot#getViewVolume()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ViewVolume();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.DocumentRoot#getViewVolumeObjectExtensionGroup <em>View Volume Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View Volume Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getViewVolumeObjectExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ViewVolumeObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getViewVolumeSimpleExtensionGroup <em>View Volume Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Volume Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentRoot#getViewVolumeSimpleExtensionGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_ViewVolumeSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#isVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see net.opengis.kml.DocumentRoot#isVisibility()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getWest <em>West</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>West</em>'.
	 * @see net.opengis.kml.DocumentRoot#getWest()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_West();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see net.opengis.kml.DocumentRoot#getWhen()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_When();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see net.opengis.kml.DocumentRoot#getWidth()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Width();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.opengis.kml.DocumentRoot#getX()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_X();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.opengis.kml.DocumentRoot#getY()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Y();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.DocumentRoot#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see net.opengis.kml.DocumentRoot#getZ()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Z();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.DocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Type</em>'.
	 * @see net.opengis.kml.DocumentType
	 * @generated
	 */
	EClass getDocumentType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.DocumentType#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema</em>'.
	 * @see net.opengis.kml.DocumentType#getSchema()
	 * @see #getDocumentType()
	 * @generated
	 */
	EReference getDocumentType_Schema();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.DocumentType#getAbstractFeatureGroupGroup <em>Abstract Feature Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Feature Group Group</em>'.
	 * @see net.opengis.kml.DocumentType#getAbstractFeatureGroupGroup()
	 * @see #getDocumentType()
	 * @generated
	 */
	EAttribute getDocumentType_AbstractFeatureGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.DocumentType#getAbstractFeatureGroup <em>Abstract Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Feature Group</em>'.
	 * @see net.opengis.kml.DocumentType#getAbstractFeatureGroup()
	 * @see #getDocumentType()
	 * @generated
	 */
	EReference getDocumentType_AbstractFeatureGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.DocumentType#getDocumentSimpleExtensionGroupGroup <em>Document Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Document Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.DocumentType#getDocumentSimpleExtensionGroupGroup()
	 * @see #getDocumentType()
	 * @generated
	 */
	EAttribute getDocumentType_DocumentSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.DocumentType#getDocumentSimpleExtensionGroup <em>Document Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Document Simple Extension Group</em>'.
	 * @see net.opengis.kml.DocumentType#getDocumentSimpleExtensionGroup()
	 * @see #getDocumentType()
	 * @generated
	 */
	EAttribute getDocumentType_DocumentSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.DocumentType#getDocumentObjectExtensionGroupGroup <em>Document Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Document Object Extension Group Group</em>'.
	 * @see net.opengis.kml.DocumentType#getDocumentObjectExtensionGroupGroup()
	 * @see #getDocumentType()
	 * @generated
	 */
	EAttribute getDocumentType_DocumentObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.DocumentType#getDocumentObjectExtensionGroup <em>Document Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Document Object Extension Group</em>'.
	 * @see net.opengis.kml.DocumentType#getDocumentObjectExtensionGroup()
	 * @see #getDocumentType()
	 * @generated
	 */
	EReference getDocumentType_DocumentObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.ExtendedDataType <em>Extended Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extended Data Type</em>'.
	 * @see net.opengis.kml.ExtendedDataType
	 * @generated
	 */
	EClass getExtendedDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.ExtendedDataType#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see net.opengis.kml.ExtendedDataType#getData()
	 * @see #getExtendedDataType()
	 * @generated
	 */
	EReference getExtendedDataType_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.ExtendedDataType#getSchemaData <em>Schema Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema Data</em>'.
	 * @see net.opengis.kml.ExtendedDataType#getSchemaData()
	 * @see #getExtendedDataType()
	 * @generated
	 */
	EReference getExtendedDataType_SchemaData();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ExtendedDataType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see net.opengis.kml.ExtendedDataType#getAny()
	 * @see #getExtendedDataType()
	 * @generated
	 */
	EAttribute getExtendedDataType_Any();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.FolderType <em>Folder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder Type</em>'.
	 * @see net.opengis.kml.FolderType
	 * @generated
	 */
	EClass getFolderType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.FolderType#getAbstractFeatureGroupGroup <em>Abstract Feature Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Feature Group Group</em>'.
	 * @see net.opengis.kml.FolderType#getAbstractFeatureGroupGroup()
	 * @see #getFolderType()
	 * @generated
	 */
	EAttribute getFolderType_AbstractFeatureGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.FolderType#getAbstractFeatureGroup <em>Abstract Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Feature Group</em>'.
	 * @see net.opengis.kml.FolderType#getAbstractFeatureGroup()
	 * @see #getFolderType()
	 * @generated
	 */
	EReference getFolderType_AbstractFeatureGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.FolderType#getFolderSimpleExtensionGroupGroup <em>Folder Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Folder Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.FolderType#getFolderSimpleExtensionGroupGroup()
	 * @see #getFolderType()
	 * @generated
	 */
	EAttribute getFolderType_FolderSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.FolderType#getFolderSimpleExtensionGroup <em>Folder Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Folder Simple Extension Group</em>'.
	 * @see net.opengis.kml.FolderType#getFolderSimpleExtensionGroup()
	 * @see #getFolderType()
	 * @generated
	 */
	EAttribute getFolderType_FolderSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.FolderType#getFolderObjectExtensionGroupGroup <em>Folder Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Folder Object Extension Group Group</em>'.
	 * @see net.opengis.kml.FolderType#getFolderObjectExtensionGroupGroup()
	 * @see #getFolderType()
	 * @generated
	 */
	EAttribute getFolderType_FolderObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.FolderType#getFolderObjectExtensionGroup <em>Folder Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folder Object Extension Group</em>'.
	 * @see net.opengis.kml.FolderType#getFolderObjectExtensionGroup()
	 * @see #getFolderType()
	 * @generated
	 */
	EReference getFolderType_FolderObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.GroundOverlayType <em>Ground Overlay Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ground Overlay Type</em>'.
	 * @see net.opengis.kml.GroundOverlayType
	 * @generated
	 */
	EClass getGroundOverlayType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.GroundOverlayType#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see net.opengis.kml.GroundOverlayType#getAltitude()
	 * @see #getGroundOverlayType()
	 * @generated
	 */
	EAttribute getGroundOverlayType_Altitude();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.GroundOverlayType#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Altitude Mode Group Group</em>'.
	 * @see net.opengis.kml.GroundOverlayType#getAltitudeModeGroupGroup()
	 * @see #getGroundOverlayType()
	 * @generated
	 */
	EAttribute getGroundOverlayType_AltitudeModeGroupGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.GroundOverlayType#getAltitudeModeGroup <em>Altitude Mode Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Altitude Mode Group</em>'.
	 * @see net.opengis.kml.GroundOverlayType#getAltitudeModeGroup()
	 * @see #getGroundOverlayType()
	 * @generated
	 */
	EReference getGroundOverlayType_AltitudeModeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.GroundOverlayType#getLatLonBox <em>Lat Lon Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lat Lon Box</em>'.
	 * @see net.opengis.kml.GroundOverlayType#getLatLonBox()
	 * @see #getGroundOverlayType()
	 * @generated
	 */
	EReference getGroundOverlayType_LatLonBox();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.GroundOverlayType#getGroundOverlaySimpleExtensionGroupGroup <em>Ground Overlay Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ground Overlay Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.GroundOverlayType#getGroundOverlaySimpleExtensionGroupGroup()
	 * @see #getGroundOverlayType()
	 * @generated
	 */
	EAttribute getGroundOverlayType_GroundOverlaySimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.GroundOverlayType#getGroundOverlaySimpleExtensionGroup <em>Ground Overlay Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ground Overlay Simple Extension Group</em>'.
	 * @see net.opengis.kml.GroundOverlayType#getGroundOverlaySimpleExtensionGroup()
	 * @see #getGroundOverlayType()
	 * @generated
	 */
	EAttribute getGroundOverlayType_GroundOverlaySimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.GroundOverlayType#getGroundOverlayObjectExtensionGroupGroup <em>Ground Overlay Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ground Overlay Object Extension Group Group</em>'.
	 * @see net.opengis.kml.GroundOverlayType#getGroundOverlayObjectExtensionGroupGroup()
	 * @see #getGroundOverlayType()
	 * @generated
	 */
	EAttribute getGroundOverlayType_GroundOverlayObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.GroundOverlayType#getGroundOverlayObjectExtensionGroup <em>Ground Overlay Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ground Overlay Object Extension Group</em>'.
	 * @see net.opengis.kml.GroundOverlayType#getGroundOverlayObjectExtensionGroup()
	 * @see #getGroundOverlayType()
	 * @generated
	 */
	EReference getGroundOverlayType_GroundOverlayObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.IconStyleType <em>Icon Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon Style Type</em>'.
	 * @see net.opengis.kml.IconStyleType
	 * @generated
	 */
	EClass getIconStyleType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.IconStyleType#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see net.opengis.kml.IconStyleType#getScale()
	 * @see #getIconStyleType()
	 * @generated
	 */
	EAttribute getIconStyleType_Scale();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.IconStyleType#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see net.opengis.kml.IconStyleType#getHeading()
	 * @see #getIconStyleType()
	 * @generated
	 */
	EAttribute getIconStyleType_Heading();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.IconStyleType#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon</em>'.
	 * @see net.opengis.kml.IconStyleType#getIcon()
	 * @see #getIconStyleType()
	 * @generated
	 */
	EReference getIconStyleType_Icon();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.IconStyleType#getHotSpot <em>Hot Spot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hot Spot</em>'.
	 * @see net.opengis.kml.IconStyleType#getHotSpot()
	 * @see #getIconStyleType()
	 * @generated
	 */
	EReference getIconStyleType_HotSpot();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.IconStyleType#getIconStyleSimpleExtensionGroupGroup <em>Icon Style Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Icon Style Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.IconStyleType#getIconStyleSimpleExtensionGroupGroup()
	 * @see #getIconStyleType()
	 * @generated
	 */
	EAttribute getIconStyleType_IconStyleSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.IconStyleType#getIconStyleSimpleExtensionGroup <em>Icon Style Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Icon Style Simple Extension Group</em>'.
	 * @see net.opengis.kml.IconStyleType#getIconStyleSimpleExtensionGroup()
	 * @see #getIconStyleType()
	 * @generated
	 */
	EAttribute getIconStyleType_IconStyleSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.IconStyleType#getIconStyleObjectExtensionGroupGroup <em>Icon Style Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Icon Style Object Extension Group Group</em>'.
	 * @see net.opengis.kml.IconStyleType#getIconStyleObjectExtensionGroupGroup()
	 * @see #getIconStyleType()
	 * @generated
	 */
	EAttribute getIconStyleType_IconStyleObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.IconStyleType#getIconStyleObjectExtensionGroup <em>Icon Style Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon Style Object Extension Group</em>'.
	 * @see net.opengis.kml.IconStyleType#getIconStyleObjectExtensionGroup()
	 * @see #getIconStyleType()
	 * @generated
	 */
	EReference getIconStyleType_IconStyleObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.ImagePyramidType <em>Image Pyramid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Pyramid Type</em>'.
	 * @see net.opengis.kml.ImagePyramidType
	 * @generated
	 */
	EClass getImagePyramidType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.ImagePyramidType#getTileSize <em>Tile Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tile Size</em>'.
	 * @see net.opengis.kml.ImagePyramidType#getTileSize()
	 * @see #getImagePyramidType()
	 * @generated
	 */
	EAttribute getImagePyramidType_TileSize();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.ImagePyramidType#getMaxWidth <em>Max Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Width</em>'.
	 * @see net.opengis.kml.ImagePyramidType#getMaxWidth()
	 * @see #getImagePyramidType()
	 * @generated
	 */
	EAttribute getImagePyramidType_MaxWidth();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.ImagePyramidType#getMaxHeight <em>Max Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Height</em>'.
	 * @see net.opengis.kml.ImagePyramidType#getMaxHeight()
	 * @see #getImagePyramidType()
	 * @generated
	 */
	EAttribute getImagePyramidType_MaxHeight();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.ImagePyramidType#getGridOrigin <em>Grid Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Origin</em>'.
	 * @see net.opengis.kml.ImagePyramidType#getGridOrigin()
	 * @see #getImagePyramidType()
	 * @generated
	 */
	EAttribute getImagePyramidType_GridOrigin();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ImagePyramidType#getImagePyramidSimpleExtensionGroupGroup <em>Image Pyramid Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Image Pyramid Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.ImagePyramidType#getImagePyramidSimpleExtensionGroupGroup()
	 * @see #getImagePyramidType()
	 * @generated
	 */
	EAttribute getImagePyramidType_ImagePyramidSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ImagePyramidType#getImagePyramidSimpleExtensionGroup <em>Image Pyramid Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Image Pyramid Simple Extension Group</em>'.
	 * @see net.opengis.kml.ImagePyramidType#getImagePyramidSimpleExtensionGroup()
	 * @see #getImagePyramidType()
	 * @generated
	 */
	EAttribute getImagePyramidType_ImagePyramidSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ImagePyramidType#getImagePyramidObjectExtensionGroupGroup <em>Image Pyramid Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Image Pyramid Object Extension Group Group</em>'.
	 * @see net.opengis.kml.ImagePyramidType#getImagePyramidObjectExtensionGroupGroup()
	 * @see #getImagePyramidType()
	 * @generated
	 */
	EAttribute getImagePyramidType_ImagePyramidObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.ImagePyramidType#getImagePyramidObjectExtensionGroup <em>Image Pyramid Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Image Pyramid Object Extension Group</em>'.
	 * @see net.opengis.kml.ImagePyramidType#getImagePyramidObjectExtensionGroup()
	 * @see #getImagePyramidType()
	 * @generated
	 */
	EReference getImagePyramidType_ImagePyramidObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.ItemIconType <em>Item Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Icon Type</em>'.
	 * @see net.opengis.kml.ItemIconType
	 * @generated
	 */
	EClass getItemIconType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.ItemIconType#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see net.opengis.kml.ItemIconType#getState()
	 * @see #getItemIconType()
	 * @generated
	 */
	EAttribute getItemIconType_State();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.ItemIconType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see net.opengis.kml.ItemIconType#getHref()
	 * @see #getItemIconType()
	 * @generated
	 */
	EAttribute getItemIconType_Href();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ItemIconType#getItemIconSimpleExtensionGroupGroup <em>Item Icon Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Item Icon Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.ItemIconType#getItemIconSimpleExtensionGroupGroup()
	 * @see #getItemIconType()
	 * @generated
	 */
	EAttribute getItemIconType_ItemIconSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ItemIconType#getItemIconSimpleExtensionGroup <em>Item Icon Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Item Icon Simple Extension Group</em>'.
	 * @see net.opengis.kml.ItemIconType#getItemIconSimpleExtensionGroup()
	 * @see #getItemIconType()
	 * @generated
	 */
	EAttribute getItemIconType_ItemIconSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ItemIconType#getItemIconObjectExtensionGroupGroup <em>Item Icon Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Item Icon Object Extension Group Group</em>'.
	 * @see net.opengis.kml.ItemIconType#getItemIconObjectExtensionGroupGroup()
	 * @see #getItemIconType()
	 * @generated
	 */
	EAttribute getItemIconType_ItemIconObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.ItemIconType#getItemIconObjectExtensionGroup <em>Item Icon Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Icon Object Extension Group</em>'.
	 * @see net.opengis.kml.ItemIconType#getItemIconObjectExtensionGroup()
	 * @see #getItemIconType()
	 * @generated
	 */
	EReference getItemIconType_ItemIconObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.KmlType <em>Kml Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kml Type</em>'.
	 * @see net.opengis.kml.KmlType
	 * @generated
	 */
	EClass getKmlType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.KmlType#getNetworkLinkControl <em>Network Link Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Link Control</em>'.
	 * @see net.opengis.kml.KmlType#getNetworkLinkControl()
	 * @see #getKmlType()
	 * @generated
	 */
	EReference getKmlType_NetworkLinkControl();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.KmlType#getAbstractFeatureGroupGroup <em>Abstract Feature Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Feature Group Group</em>'.
	 * @see net.opengis.kml.KmlType#getAbstractFeatureGroupGroup()
	 * @see #getKmlType()
	 * @generated
	 */
	EAttribute getKmlType_AbstractFeatureGroupGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.KmlType#getAbstractFeatureGroup <em>Abstract Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Feature Group</em>'.
	 * @see net.opengis.kml.KmlType#getAbstractFeatureGroup()
	 * @see #getKmlType()
	 * @generated
	 */
	EReference getKmlType_AbstractFeatureGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.KmlType#getKmlSimpleExtensionGroupGroup <em>Kml Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Kml Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.KmlType#getKmlSimpleExtensionGroupGroup()
	 * @see #getKmlType()
	 * @generated
	 */
	EAttribute getKmlType_KmlSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.KmlType#getKmlSimpleExtensionGroup <em>Kml Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Kml Simple Extension Group</em>'.
	 * @see net.opengis.kml.KmlType#getKmlSimpleExtensionGroup()
	 * @see #getKmlType()
	 * @generated
	 */
	EAttribute getKmlType_KmlSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.KmlType#getKmlObjectExtensionGroupGroup <em>Kml Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Kml Object Extension Group Group</em>'.
	 * @see net.opengis.kml.KmlType#getKmlObjectExtensionGroupGroup()
	 * @see #getKmlType()
	 * @generated
	 */
	EAttribute getKmlType_KmlObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.KmlType#getKmlObjectExtensionGroup <em>Kml Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kml Object Extension Group</em>'.
	 * @see net.opengis.kml.KmlType#getKmlObjectExtensionGroup()
	 * @see #getKmlType()
	 * @generated
	 */
	EReference getKmlType_KmlObjectExtensionGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.KmlType#getHint <em>Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hint</em>'.
	 * @see net.opengis.kml.KmlType#getHint()
	 * @see #getKmlType()
	 * @generated
	 */
	EAttribute getKmlType_Hint();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.LabelStyleType <em>Label Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label Style Type</em>'.
	 * @see net.opengis.kml.LabelStyleType
	 * @generated
	 */
	EClass getLabelStyleType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LabelStyleType#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see net.opengis.kml.LabelStyleType#getScale()
	 * @see #getLabelStyleType()
	 * @generated
	 */
	EAttribute getLabelStyleType_Scale();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LabelStyleType#getLabelStyleSimpleExtensionGroupGroup <em>Label Style Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Label Style Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.LabelStyleType#getLabelStyleSimpleExtensionGroupGroup()
	 * @see #getLabelStyleType()
	 * @generated
	 */
	EAttribute getLabelStyleType_LabelStyleSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LabelStyleType#getLabelStyleSimpleExtensionGroup <em>Label Style Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Label Style Simple Extension Group</em>'.
	 * @see net.opengis.kml.LabelStyleType#getLabelStyleSimpleExtensionGroup()
	 * @see #getLabelStyleType()
	 * @generated
	 */
	EAttribute getLabelStyleType_LabelStyleSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LabelStyleType#getLabelStyleObjectExtensionGroupGroup <em>Label Style Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Label Style Object Extension Group Group</em>'.
	 * @see net.opengis.kml.LabelStyleType#getLabelStyleObjectExtensionGroupGroup()
	 * @see #getLabelStyleType()
	 * @generated
	 */
	EAttribute getLabelStyleType_LabelStyleObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.LabelStyleType#getLabelStyleObjectExtensionGroup <em>Label Style Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label Style Object Extension Group</em>'.
	 * @see net.opengis.kml.LabelStyleType#getLabelStyleObjectExtensionGroup()
	 * @see #getLabelStyleType()
	 * @generated
	 */
	EReference getLabelStyleType_LabelStyleObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.LatLonAltBoxType <em>Lat Lon Alt Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lat Lon Alt Box Type</em>'.
	 * @see net.opengis.kml.LatLonAltBoxType
	 * @generated
	 */
	EClass getLatLonAltBoxType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LatLonAltBoxType#getMinAltitude <em>Min Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Altitude</em>'.
	 * @see net.opengis.kml.LatLonAltBoxType#getMinAltitude()
	 * @see #getLatLonAltBoxType()
	 * @generated
	 */
	EAttribute getLatLonAltBoxType_MinAltitude();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LatLonAltBoxType#getMaxAltitude <em>Max Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Altitude</em>'.
	 * @see net.opengis.kml.LatLonAltBoxType#getMaxAltitude()
	 * @see #getLatLonAltBoxType()
	 * @generated
	 */
	EAttribute getLatLonAltBoxType_MaxAltitude();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LatLonAltBoxType#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Altitude Mode Group Group</em>'.
	 * @see net.opengis.kml.LatLonAltBoxType#getAltitudeModeGroupGroup()
	 * @see #getLatLonAltBoxType()
	 * @generated
	 */
	EAttribute getLatLonAltBoxType_AltitudeModeGroupGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.LatLonAltBoxType#getAltitudeModeGroup <em>Altitude Mode Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Altitude Mode Group</em>'.
	 * @see net.opengis.kml.LatLonAltBoxType#getAltitudeModeGroup()
	 * @see #getLatLonAltBoxType()
	 * @generated
	 */
	EReference getLatLonAltBoxType_AltitudeModeGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LatLonAltBoxType#getLatLonAltBoxSimpleExtensionGroupGroup <em>Lat Lon Alt Box Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lat Lon Alt Box Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.LatLonAltBoxType#getLatLonAltBoxSimpleExtensionGroupGroup()
	 * @see #getLatLonAltBoxType()
	 * @generated
	 */
	EAttribute getLatLonAltBoxType_LatLonAltBoxSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LatLonAltBoxType#getLatLonAltBoxSimpleExtensionGroup <em>Lat Lon Alt Box Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lat Lon Alt Box Simple Extension Group</em>'.
	 * @see net.opengis.kml.LatLonAltBoxType#getLatLonAltBoxSimpleExtensionGroup()
	 * @see #getLatLonAltBoxType()
	 * @generated
	 */
	EAttribute getLatLonAltBoxType_LatLonAltBoxSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LatLonAltBoxType#getLatLonAltBoxObjectExtensionGroupGroup <em>Lat Lon Alt Box Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lat Lon Alt Box Object Extension Group Group</em>'.
	 * @see net.opengis.kml.LatLonAltBoxType#getLatLonAltBoxObjectExtensionGroupGroup()
	 * @see #getLatLonAltBoxType()
	 * @generated
	 */
	EAttribute getLatLonAltBoxType_LatLonAltBoxObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.LatLonAltBoxType#getLatLonAltBoxObjectExtensionGroup <em>Lat Lon Alt Box Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lat Lon Alt Box Object Extension Group</em>'.
	 * @see net.opengis.kml.LatLonAltBoxType#getLatLonAltBoxObjectExtensionGroup()
	 * @see #getLatLonAltBoxType()
	 * @generated
	 */
	EReference getLatLonAltBoxType_LatLonAltBoxObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.LatLonBoxType <em>Lat Lon Box Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lat Lon Box Type</em>'.
	 * @see net.opengis.kml.LatLonBoxType
	 * @generated
	 */
	EClass getLatLonBoxType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LatLonBoxType#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see net.opengis.kml.LatLonBoxType#getRotation()
	 * @see #getLatLonBoxType()
	 * @generated
	 */
	EAttribute getLatLonBoxType_Rotation();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LatLonBoxType#getLatLonBoxSimpleExtensionGroupGroup <em>Lat Lon Box Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lat Lon Box Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.LatLonBoxType#getLatLonBoxSimpleExtensionGroupGroup()
	 * @see #getLatLonBoxType()
	 * @generated
	 */
	EAttribute getLatLonBoxType_LatLonBoxSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LatLonBoxType#getLatLonBoxSimpleExtensionGroup <em>Lat Lon Box Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lat Lon Box Simple Extension Group</em>'.
	 * @see net.opengis.kml.LatLonBoxType#getLatLonBoxSimpleExtensionGroup()
	 * @see #getLatLonBoxType()
	 * @generated
	 */
	EAttribute getLatLonBoxType_LatLonBoxSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LatLonBoxType#getLatLonBoxObjectExtensionGroupGroup <em>Lat Lon Box Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lat Lon Box Object Extension Group Group</em>'.
	 * @see net.opengis.kml.LatLonBoxType#getLatLonBoxObjectExtensionGroupGroup()
	 * @see #getLatLonBoxType()
	 * @generated
	 */
	EAttribute getLatLonBoxType_LatLonBoxObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.LatLonBoxType#getLatLonBoxObjectExtensionGroup <em>Lat Lon Box Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lat Lon Box Object Extension Group</em>'.
	 * @see net.opengis.kml.LatLonBoxType#getLatLonBoxObjectExtensionGroup()
	 * @see #getLatLonBoxType()
	 * @generated
	 */
	EReference getLatLonBoxType_LatLonBoxObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.LinearRingType <em>Linear Ring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Ring Type</em>'.
	 * @see net.opengis.kml.LinearRingType
	 * @generated
	 */
	EClass getLinearRingType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LinearRingType#isExtrude <em>Extrude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrude</em>'.
	 * @see net.opengis.kml.LinearRingType#isExtrude()
	 * @see #getLinearRingType()
	 * @generated
	 */
	EAttribute getLinearRingType_Extrude();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LinearRingType#isTessellate <em>Tessellate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tessellate</em>'.
	 * @see net.opengis.kml.LinearRingType#isTessellate()
	 * @see #getLinearRingType()
	 * @generated
	 */
	EAttribute getLinearRingType_Tessellate();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LinearRingType#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Altitude Mode Group Group</em>'.
	 * @see net.opengis.kml.LinearRingType#getAltitudeModeGroupGroup()
	 * @see #getLinearRingType()
	 * @generated
	 */
	EAttribute getLinearRingType_AltitudeModeGroupGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.LinearRingType#getAltitudeModeGroup <em>Altitude Mode Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Altitude Mode Group</em>'.
	 * @see net.opengis.kml.LinearRingType#getAltitudeModeGroup()
	 * @see #getLinearRingType()
	 * @generated
	 */
	EReference getLinearRingType_AltitudeModeGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LinearRingType#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinates</em>'.
	 * @see net.opengis.kml.LinearRingType#getCoordinates()
	 * @see #getLinearRingType()
	 * @generated
	 */
	EAttribute getLinearRingType_Coordinates();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LinearRingType#getLinearRingSimpleExtensionGroupGroup <em>Linear Ring Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Linear Ring Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.LinearRingType#getLinearRingSimpleExtensionGroupGroup()
	 * @see #getLinearRingType()
	 * @generated
	 */
	EAttribute getLinearRingType_LinearRingSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LinearRingType#getLinearRingSimpleExtensionGroup <em>Linear Ring Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Linear Ring Simple Extension Group</em>'.
	 * @see net.opengis.kml.LinearRingType#getLinearRingSimpleExtensionGroup()
	 * @see #getLinearRingType()
	 * @generated
	 */
	EAttribute getLinearRingType_LinearRingSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LinearRingType#getLinearRingObjectExtensionGroupGroup <em>Linear Ring Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Linear Ring Object Extension Group Group</em>'.
	 * @see net.opengis.kml.LinearRingType#getLinearRingObjectExtensionGroupGroup()
	 * @see #getLinearRingType()
	 * @generated
	 */
	EAttribute getLinearRingType_LinearRingObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.LinearRingType#getLinearRingObjectExtensionGroup <em>Linear Ring Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Linear Ring Object Extension Group</em>'.
	 * @see net.opengis.kml.LinearRingType#getLinearRingObjectExtensionGroup()
	 * @see #getLinearRingType()
	 * @generated
	 */
	EReference getLinearRingType_LinearRingObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.LineStringType <em>Line String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line String Type</em>'.
	 * @see net.opengis.kml.LineStringType
	 * @generated
	 */
	EClass getLineStringType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LineStringType#isExtrude <em>Extrude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrude</em>'.
	 * @see net.opengis.kml.LineStringType#isExtrude()
	 * @see #getLineStringType()
	 * @generated
	 */
	EAttribute getLineStringType_Extrude();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LineStringType#isTessellate <em>Tessellate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tessellate</em>'.
	 * @see net.opengis.kml.LineStringType#isTessellate()
	 * @see #getLineStringType()
	 * @generated
	 */
	EAttribute getLineStringType_Tessellate();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LineStringType#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Altitude Mode Group Group</em>'.
	 * @see net.opengis.kml.LineStringType#getAltitudeModeGroupGroup()
	 * @see #getLineStringType()
	 * @generated
	 */
	EAttribute getLineStringType_AltitudeModeGroupGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.LineStringType#getAltitudeModeGroup <em>Altitude Mode Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Altitude Mode Group</em>'.
	 * @see net.opengis.kml.LineStringType#getAltitudeModeGroup()
	 * @see #getLineStringType()
	 * @generated
	 */
	EReference getLineStringType_AltitudeModeGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LineStringType#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinates</em>'.
	 * @see net.opengis.kml.LineStringType#getCoordinates()
	 * @see #getLineStringType()
	 * @generated
	 */
	EAttribute getLineStringType_Coordinates();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LineStringType#getLineStringSimpleExtensionGroupGroup <em>Line String Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Line String Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.LineStringType#getLineStringSimpleExtensionGroupGroup()
	 * @see #getLineStringType()
	 * @generated
	 */
	EAttribute getLineStringType_LineStringSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LineStringType#getLineStringSimpleExtensionGroup <em>Line String Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Line String Simple Extension Group</em>'.
	 * @see net.opengis.kml.LineStringType#getLineStringSimpleExtensionGroup()
	 * @see #getLineStringType()
	 * @generated
	 */
	EAttribute getLineStringType_LineStringSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LineStringType#getLineStringObjectExtensionGroupGroup <em>Line String Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Line String Object Extension Group Group</em>'.
	 * @see net.opengis.kml.LineStringType#getLineStringObjectExtensionGroupGroup()
	 * @see #getLineStringType()
	 * @generated
	 */
	EAttribute getLineStringType_LineStringObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.LineStringType#getLineStringObjectExtensionGroup <em>Line String Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line String Object Extension Group</em>'.
	 * @see net.opengis.kml.LineStringType#getLineStringObjectExtensionGroup()
	 * @see #getLineStringType()
	 * @generated
	 */
	EReference getLineStringType_LineStringObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.LineStyleType <em>Line Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Style Type</em>'.
	 * @see net.opengis.kml.LineStyleType
	 * @generated
	 */
	EClass getLineStyleType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LineStyleType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see net.opengis.kml.LineStyleType#getWidth()
	 * @see #getLineStyleType()
	 * @generated
	 */
	EAttribute getLineStyleType_Width();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LineStyleType#getLineStyleSimpleExtensionGroupGroup <em>Line Style Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Line Style Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.LineStyleType#getLineStyleSimpleExtensionGroupGroup()
	 * @see #getLineStyleType()
	 * @generated
	 */
	EAttribute getLineStyleType_LineStyleSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LineStyleType#getLineStyleSimpleExtensionGroup <em>Line Style Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Line Style Simple Extension Group</em>'.
	 * @see net.opengis.kml.LineStyleType#getLineStyleSimpleExtensionGroup()
	 * @see #getLineStyleType()
	 * @generated
	 */
	EAttribute getLineStyleType_LineStyleSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LineStyleType#getLineStyleObjectExtensionGroupGroup <em>Line Style Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Line Style Object Extension Group Group</em>'.
	 * @see net.opengis.kml.LineStyleType#getLineStyleObjectExtensionGroupGroup()
	 * @see #getLineStyleType()
	 * @generated
	 */
	EAttribute getLineStyleType_LineStyleObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.LineStyleType#getLineStyleObjectExtensionGroup <em>Line Style Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line Style Object Extension Group</em>'.
	 * @see net.opengis.kml.LineStyleType#getLineStyleObjectExtensionGroup()
	 * @see #getLineStyleType()
	 * @generated
	 */
	EReference getLineStyleType_LineStyleObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Type</em>'.
	 * @see net.opengis.kml.LinkType
	 * @generated
	 */
	EClass getLinkType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LinkType#getRefreshMode <em>Refresh Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Mode</em>'.
	 * @see net.opengis.kml.LinkType#getRefreshMode()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_RefreshMode();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LinkType#getRefreshInterval <em>Refresh Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Interval</em>'.
	 * @see net.opengis.kml.LinkType#getRefreshInterval()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_RefreshInterval();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LinkType#getViewRefreshMode <em>View Refresh Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Refresh Mode</em>'.
	 * @see net.opengis.kml.LinkType#getViewRefreshMode()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_ViewRefreshMode();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LinkType#getViewRefreshTime <em>View Refresh Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Refresh Time</em>'.
	 * @see net.opengis.kml.LinkType#getViewRefreshTime()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_ViewRefreshTime();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LinkType#getViewBoundScale <em>View Bound Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Bound Scale</em>'.
	 * @see net.opengis.kml.LinkType#getViewBoundScale()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_ViewBoundScale();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LinkType#getViewFormat <em>View Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>View Format</em>'.
	 * @see net.opengis.kml.LinkType#getViewFormat()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_ViewFormat();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LinkType#getHttpQuery <em>Http Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Query</em>'.
	 * @see net.opengis.kml.LinkType#getHttpQuery()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_HttpQuery();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LinkType#getLinkSimpleExtensionGroupGroup <em>Link Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Link Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.LinkType#getLinkSimpleExtensionGroupGroup()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_LinkSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LinkType#getLinkSimpleExtensionGroup <em>Link Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Link Simple Extension Group</em>'.
	 * @see net.opengis.kml.LinkType#getLinkSimpleExtensionGroup()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_LinkSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LinkType#getLinkObjectExtensionGroupGroup <em>Link Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Link Object Extension Group Group</em>'.
	 * @see net.opengis.kml.LinkType#getLinkObjectExtensionGroupGroup()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_LinkObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.LinkType#getLinkObjectExtensionGroup <em>Link Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link Object Extension Group</em>'.
	 * @see net.opengis.kml.LinkType#getLinkObjectExtensionGroup()
	 * @see #getLinkType()
	 * @generated
	 */
	EReference getLinkType_LinkObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.ListStyleType <em>List Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Style Type</em>'.
	 * @see net.opengis.kml.ListStyleType
	 * @generated
	 */
	EClass getListStyleType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.ListStyleType#getListItemType <em>List Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>List Item Type</em>'.
	 * @see net.opengis.kml.ListStyleType#getListItemType()
	 * @see #getListStyleType()
	 * @generated
	 */
	EAttribute getListStyleType_ListItemType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.ListStyleType#getBgColor <em>Bg Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bg Color</em>'.
	 * @see net.opengis.kml.ListStyleType#getBgColor()
	 * @see #getListStyleType()
	 * @generated
	 */
	EAttribute getListStyleType_BgColor();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.ListStyleType#getItemIcon <em>Item Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item Icon</em>'.
	 * @see net.opengis.kml.ListStyleType#getItemIcon()
	 * @see #getListStyleType()
	 * @generated
	 */
	EReference getListStyleType_ItemIcon();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.ListStyleType#getMaxSnippetLines <em>Max Snippet Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Snippet Lines</em>'.
	 * @see net.opengis.kml.ListStyleType#getMaxSnippetLines()
	 * @see #getListStyleType()
	 * @generated
	 */
	EAttribute getListStyleType_MaxSnippetLines();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ListStyleType#getListStyleSimpleExtensionGroupGroup <em>List Style Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>List Style Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.ListStyleType#getListStyleSimpleExtensionGroupGroup()
	 * @see #getListStyleType()
	 * @generated
	 */
	EAttribute getListStyleType_ListStyleSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ListStyleType#getListStyleSimpleExtensionGroup <em>List Style Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>List Style Simple Extension Group</em>'.
	 * @see net.opengis.kml.ListStyleType#getListStyleSimpleExtensionGroup()
	 * @see #getListStyleType()
	 * @generated
	 */
	EAttribute getListStyleType_ListStyleSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ListStyleType#getListStyleObjectExtensionGroupGroup <em>List Style Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>List Style Object Extension Group Group</em>'.
	 * @see net.opengis.kml.ListStyleType#getListStyleObjectExtensionGroupGroup()
	 * @see #getListStyleType()
	 * @generated
	 */
	EAttribute getListStyleType_ListStyleObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.ListStyleType#getListStyleObjectExtensionGroup <em>List Style Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>List Style Object Extension Group</em>'.
	 * @see net.opengis.kml.ListStyleType#getListStyleObjectExtensionGroup()
	 * @see #getListStyleType()
	 * @generated
	 */
	EReference getListStyleType_ListStyleObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.LocationType <em>Location Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location Type</em>'.
	 * @see net.opengis.kml.LocationType
	 * @generated
	 */
	EClass getLocationType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LocationType#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see net.opengis.kml.LocationType#getLongitude()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LocationType#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see net.opengis.kml.LocationType#getLatitude()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LocationType#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see net.opengis.kml.LocationType#getAltitude()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_Altitude();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LocationType#getLocationSimpleExtensionGroupGroup <em>Location Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Location Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.LocationType#getLocationSimpleExtensionGroupGroup()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_LocationSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LocationType#getLocationSimpleExtensionGroup <em>Location Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Location Simple Extension Group</em>'.
	 * @see net.opengis.kml.LocationType#getLocationSimpleExtensionGroup()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_LocationSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LocationType#getLocationObjectExtensionGroupGroup <em>Location Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Location Object Extension Group Group</em>'.
	 * @see net.opengis.kml.LocationType#getLocationObjectExtensionGroupGroup()
	 * @see #getLocationType()
	 * @generated
	 */
	EAttribute getLocationType_LocationObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.LocationType#getLocationObjectExtensionGroup <em>Location Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location Object Extension Group</em>'.
	 * @see net.opengis.kml.LocationType#getLocationObjectExtensionGroup()
	 * @see #getLocationType()
	 * @generated
	 */
	EReference getLocationType_LocationObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.LodType <em>Lod Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lod Type</em>'.
	 * @see net.opengis.kml.LodType
	 * @generated
	 */
	EClass getLodType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LodType#getMinLodPixels <em>Min Lod Pixels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Lod Pixels</em>'.
	 * @see net.opengis.kml.LodType#getMinLodPixels()
	 * @see #getLodType()
	 * @generated
	 */
	EAttribute getLodType_MinLodPixels();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LodType#getMaxLodPixels <em>Max Lod Pixels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Lod Pixels</em>'.
	 * @see net.opengis.kml.LodType#getMaxLodPixels()
	 * @see #getLodType()
	 * @generated
	 */
	EAttribute getLodType_MaxLodPixels();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LodType#getMinFadeExtent <em>Min Fade Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Fade Extent</em>'.
	 * @see net.opengis.kml.LodType#getMinFadeExtent()
	 * @see #getLodType()
	 * @generated
	 */
	EAttribute getLodType_MinFadeExtent();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LodType#getMaxFadeExtent <em>Max Fade Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Fade Extent</em>'.
	 * @see net.opengis.kml.LodType#getMaxFadeExtent()
	 * @see #getLodType()
	 * @generated
	 */
	EAttribute getLodType_MaxFadeExtent();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LodType#getLodSimpleExtensionGroupGroup <em>Lod Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lod Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.LodType#getLodSimpleExtensionGroupGroup()
	 * @see #getLodType()
	 * @generated
	 */
	EAttribute getLodType_LodSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LodType#getLodSimpleExtensionGroup <em>Lod Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lod Simple Extension Group</em>'.
	 * @see net.opengis.kml.LodType#getLodSimpleExtensionGroup()
	 * @see #getLodType()
	 * @generated
	 */
	EAttribute getLodType_LodSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LodType#getLodObjectExtensionGroupGroup <em>Lod Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lod Object Extension Group Group</em>'.
	 * @see net.opengis.kml.LodType#getLodObjectExtensionGroupGroup()
	 * @see #getLodType()
	 * @generated
	 */
	EAttribute getLodType_LodObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.LodType#getLodObjectExtensionGroup <em>Lod Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lod Object Extension Group</em>'.
	 * @see net.opengis.kml.LodType#getLodObjectExtensionGroup()
	 * @see #getLodType()
	 * @generated
	 */
	EReference getLodType_LodObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.LookAtType <em>Look At Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Look At Type</em>'.
	 * @see net.opengis.kml.LookAtType
	 * @generated
	 */
	EClass getLookAtType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LookAtType#getLongitude <em>Longitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longitude</em>'.
	 * @see net.opengis.kml.LookAtType#getLongitude()
	 * @see #getLookAtType()
	 * @generated
	 */
	EAttribute getLookAtType_Longitude();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LookAtType#getLatitude <em>Latitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latitude</em>'.
	 * @see net.opengis.kml.LookAtType#getLatitude()
	 * @see #getLookAtType()
	 * @generated
	 */
	EAttribute getLookAtType_Latitude();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LookAtType#getAltitude <em>Altitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altitude</em>'.
	 * @see net.opengis.kml.LookAtType#getAltitude()
	 * @see #getLookAtType()
	 * @generated
	 */
	EAttribute getLookAtType_Altitude();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LookAtType#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see net.opengis.kml.LookAtType#getHeading()
	 * @see #getLookAtType()
	 * @generated
	 */
	EAttribute getLookAtType_Heading();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LookAtType#getTilt <em>Tilt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tilt</em>'.
	 * @see net.opengis.kml.LookAtType#getTilt()
	 * @see #getLookAtType()
	 * @generated
	 */
	EAttribute getLookAtType_Tilt();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.LookAtType#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Range</em>'.
	 * @see net.opengis.kml.LookAtType#getRange()
	 * @see #getLookAtType()
	 * @generated
	 */
	EAttribute getLookAtType_Range();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LookAtType#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Altitude Mode Group Group</em>'.
	 * @see net.opengis.kml.LookAtType#getAltitudeModeGroupGroup()
	 * @see #getLookAtType()
	 * @generated
	 */
	EAttribute getLookAtType_AltitudeModeGroupGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.LookAtType#getAltitudeModeGroup <em>Altitude Mode Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Altitude Mode Group</em>'.
	 * @see net.opengis.kml.LookAtType#getAltitudeModeGroup()
	 * @see #getLookAtType()
	 * @generated
	 */
	EReference getLookAtType_AltitudeModeGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LookAtType#getLookAtSimpleExtensionGroupGroup <em>Look At Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Look At Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.LookAtType#getLookAtSimpleExtensionGroupGroup()
	 * @see #getLookAtType()
	 * @generated
	 */
	EAttribute getLookAtType_LookAtSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LookAtType#getLookAtSimpleExtensionGroup <em>Look At Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Look At Simple Extension Group</em>'.
	 * @see net.opengis.kml.LookAtType#getLookAtSimpleExtensionGroup()
	 * @see #getLookAtType()
	 * @generated
	 */
	EAttribute getLookAtType_LookAtSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.LookAtType#getLookAtObjectExtensionGroupGroup <em>Look At Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Look At Object Extension Group Group</em>'.
	 * @see net.opengis.kml.LookAtType#getLookAtObjectExtensionGroupGroup()
	 * @see #getLookAtType()
	 * @generated
	 */
	EAttribute getLookAtType_LookAtObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.LookAtType#getLookAtObjectExtensionGroup <em>Look At Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Look At Object Extension Group</em>'.
	 * @see net.opengis.kml.LookAtType#getLookAtObjectExtensionGroup()
	 * @see #getLookAtType()
	 * @generated
	 */
	EReference getLookAtType_LookAtObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.MetadataType <em>Metadata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata Type</em>'.
	 * @see net.opengis.kml.MetadataType
	 * @generated
	 */
	EClass getMetadataType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.MetadataType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see net.opengis.kml.MetadataType#getAny()
	 * @see #getMetadataType()
	 * @generated
	 */
	EAttribute getMetadataType_Any();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Type</em>'.
	 * @see net.opengis.kml.ModelType
	 * @generated
	 */
	EClass getModelType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ModelType#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Altitude Mode Group Group</em>'.
	 * @see net.opengis.kml.ModelType#getAltitudeModeGroupGroup()
	 * @see #getModelType()
	 * @generated
	 */
	EAttribute getModelType_AltitudeModeGroupGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.ModelType#getAltitudeModeGroup <em>Altitude Mode Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Altitude Mode Group</em>'.
	 * @see net.opengis.kml.ModelType#getAltitudeModeGroup()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_AltitudeModeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.ModelType#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see net.opengis.kml.ModelType#getLocation()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Location();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.ModelType#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Orientation</em>'.
	 * @see net.opengis.kml.ModelType#getOrientation()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Orientation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.ModelType#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scale</em>'.
	 * @see net.opengis.kml.ModelType#getScale()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Scale();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.ModelType#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see net.opengis.kml.ModelType#getLink()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_Link();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.ModelType#getResourceMap <em>Resource Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Map</em>'.
	 * @see net.opengis.kml.ModelType#getResourceMap()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_ResourceMap();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ModelType#getModelSimpleExtensionGroupGroup <em>Model Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Model Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.ModelType#getModelSimpleExtensionGroupGroup()
	 * @see #getModelType()
	 * @generated
	 */
	EAttribute getModelType_ModelSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ModelType#getModelSimpleExtensionGroup <em>Model Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Model Simple Extension Group</em>'.
	 * @see net.opengis.kml.ModelType#getModelSimpleExtensionGroup()
	 * @see #getModelType()
	 * @generated
	 */
	EAttribute getModelType_ModelSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ModelType#getModelObjectExtensionGroupGroup <em>Model Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Model Object Extension Group Group</em>'.
	 * @see net.opengis.kml.ModelType#getModelObjectExtensionGroupGroup()
	 * @see #getModelType()
	 * @generated
	 */
	EAttribute getModelType_ModelObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.ModelType#getModelObjectExtensionGroup <em>Model Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Object Extension Group</em>'.
	 * @see net.opengis.kml.ModelType#getModelObjectExtensionGroup()
	 * @see #getModelType()
	 * @generated
	 */
	EReference getModelType_ModelObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.MultiGeometryType <em>Multi Geometry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Geometry Type</em>'.
	 * @see net.opengis.kml.MultiGeometryType
	 * @generated
	 */
	EClass getMultiGeometryType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.MultiGeometryType#getAbstractGeometryGroupGroup <em>Abstract Geometry Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Geometry Group Group</em>'.
	 * @see net.opengis.kml.MultiGeometryType#getAbstractGeometryGroupGroup()
	 * @see #getMultiGeometryType()
	 * @generated
	 */
	EAttribute getMultiGeometryType_AbstractGeometryGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.MultiGeometryType#getAbstractGeometryGroup <em>Abstract Geometry Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Geometry Group</em>'.
	 * @see net.opengis.kml.MultiGeometryType#getAbstractGeometryGroup()
	 * @see #getMultiGeometryType()
	 * @generated
	 */
	EReference getMultiGeometryType_AbstractGeometryGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.MultiGeometryType#getMultiGeometrySimpleExtensionGroupGroup <em>Multi Geometry Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Multi Geometry Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.MultiGeometryType#getMultiGeometrySimpleExtensionGroupGroup()
	 * @see #getMultiGeometryType()
	 * @generated
	 */
	EAttribute getMultiGeometryType_MultiGeometrySimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.MultiGeometryType#getMultiGeometrySimpleExtensionGroup <em>Multi Geometry Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Multi Geometry Simple Extension Group</em>'.
	 * @see net.opengis.kml.MultiGeometryType#getMultiGeometrySimpleExtensionGroup()
	 * @see #getMultiGeometryType()
	 * @generated
	 */
	EAttribute getMultiGeometryType_MultiGeometrySimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.MultiGeometryType#getMultiGeometryObjectExtensionGroupGroup <em>Multi Geometry Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Multi Geometry Object Extension Group Group</em>'.
	 * @see net.opengis.kml.MultiGeometryType#getMultiGeometryObjectExtensionGroupGroup()
	 * @see #getMultiGeometryType()
	 * @generated
	 */
	EAttribute getMultiGeometryType_MultiGeometryObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.MultiGeometryType#getMultiGeometryObjectExtensionGroup <em>Multi Geometry Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multi Geometry Object Extension Group</em>'.
	 * @see net.opengis.kml.MultiGeometryType#getMultiGeometryObjectExtensionGroup()
	 * @see #getMultiGeometryType()
	 * @generated
	 */
	EReference getMultiGeometryType_MultiGeometryObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.NetworkLinkControlType <em>Network Link Control Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Link Control Type</em>'.
	 * @see net.opengis.kml.NetworkLinkControlType
	 * @generated
	 */
	EClass getNetworkLinkControlType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.NetworkLinkControlType#getMinRefreshPeriod <em>Min Refresh Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Refresh Period</em>'.
	 * @see net.opengis.kml.NetworkLinkControlType#getMinRefreshPeriod()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EAttribute getNetworkLinkControlType_MinRefreshPeriod();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.NetworkLinkControlType#getMaxSessionLength <em>Max Session Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Session Length</em>'.
	 * @see net.opengis.kml.NetworkLinkControlType#getMaxSessionLength()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EAttribute getNetworkLinkControlType_MaxSessionLength();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.NetworkLinkControlType#getCookie <em>Cookie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cookie</em>'.
	 * @see net.opengis.kml.NetworkLinkControlType#getCookie()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EAttribute getNetworkLinkControlType_Cookie();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.NetworkLinkControlType#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see net.opengis.kml.NetworkLinkControlType#getMessage()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EAttribute getNetworkLinkControlType_Message();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.NetworkLinkControlType#getLinkName <em>Link Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Name</em>'.
	 * @see net.opengis.kml.NetworkLinkControlType#getLinkName()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EAttribute getNetworkLinkControlType_LinkName();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.NetworkLinkControlType#getLinkDescription <em>Link Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Description</em>'.
	 * @see net.opengis.kml.NetworkLinkControlType#getLinkDescription()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EAttribute getNetworkLinkControlType_LinkDescription();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.NetworkLinkControlType#getLinkSnippet <em>Link Snippet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link Snippet</em>'.
	 * @see net.opengis.kml.NetworkLinkControlType#getLinkSnippet()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EReference getNetworkLinkControlType_LinkSnippet();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.NetworkLinkControlType#getExpires <em>Expires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expires</em>'.
	 * @see net.opengis.kml.NetworkLinkControlType#getExpires()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EAttribute getNetworkLinkControlType_Expires();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.NetworkLinkControlType#getUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update</em>'.
	 * @see net.opengis.kml.NetworkLinkControlType#getUpdate()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EReference getNetworkLinkControlType_Update();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.NetworkLinkControlType#getAbstractViewGroupGroup <em>Abstract View Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract View Group Group</em>'.
	 * @see net.opengis.kml.NetworkLinkControlType#getAbstractViewGroupGroup()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EAttribute getNetworkLinkControlType_AbstractViewGroupGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.NetworkLinkControlType#getAbstractViewGroup <em>Abstract View Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract View Group</em>'.
	 * @see net.opengis.kml.NetworkLinkControlType#getAbstractViewGroup()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EReference getNetworkLinkControlType_AbstractViewGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.NetworkLinkControlType#getNetworkLinkControlSimpleExtensionGroupGroup <em>Network Link Control Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Network Link Control Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.NetworkLinkControlType#getNetworkLinkControlSimpleExtensionGroupGroup()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EAttribute getNetworkLinkControlType_NetworkLinkControlSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.NetworkLinkControlType#getNetworkLinkControlSimpleExtensionGroup <em>Network Link Control Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Network Link Control Simple Extension Group</em>'.
	 * @see net.opengis.kml.NetworkLinkControlType#getNetworkLinkControlSimpleExtensionGroup()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EAttribute getNetworkLinkControlType_NetworkLinkControlSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.NetworkLinkControlType#getNetworkLinkControlObjectExtensionGroupGroup <em>Network Link Control Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Network Link Control Object Extension Group Group</em>'.
	 * @see net.opengis.kml.NetworkLinkControlType#getNetworkLinkControlObjectExtensionGroupGroup()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EAttribute getNetworkLinkControlType_NetworkLinkControlObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.NetworkLinkControlType#getNetworkLinkControlObjectExtensionGroup <em>Network Link Control Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Network Link Control Object Extension Group</em>'.
	 * @see net.opengis.kml.NetworkLinkControlType#getNetworkLinkControlObjectExtensionGroup()
	 * @see #getNetworkLinkControlType()
	 * @generated
	 */
	EReference getNetworkLinkControlType_NetworkLinkControlObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.NetworkLinkType <em>Network Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Link Type</em>'.
	 * @see net.opengis.kml.NetworkLinkType
	 * @generated
	 */
	EClass getNetworkLinkType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.NetworkLinkType#isRefreshVisibility <em>Refresh Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refresh Visibility</em>'.
	 * @see net.opengis.kml.NetworkLinkType#isRefreshVisibility()
	 * @see #getNetworkLinkType()
	 * @generated
	 */
	EAttribute getNetworkLinkType_RefreshVisibility();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.NetworkLinkType#isFlyToView <em>Fly To View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fly To View</em>'.
	 * @see net.opengis.kml.NetworkLinkType#isFlyToView()
	 * @see #getNetworkLinkType()
	 * @generated
	 */
	EAttribute getNetworkLinkType_FlyToView();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.NetworkLinkType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Url</em>'.
	 * @see net.opengis.kml.NetworkLinkType#getUrl()
	 * @see #getNetworkLinkType()
	 * @generated
	 */
	EReference getNetworkLinkType_Url();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.NetworkLinkType#getLink1 <em>Link1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link1</em>'.
	 * @see net.opengis.kml.NetworkLinkType#getLink1()
	 * @see #getNetworkLinkType()
	 * @generated
	 */
	EReference getNetworkLinkType_Link1();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.NetworkLinkType#getNetworkLinkSimpleExtensionGroupGroup <em>Network Link Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Network Link Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.NetworkLinkType#getNetworkLinkSimpleExtensionGroupGroup()
	 * @see #getNetworkLinkType()
	 * @generated
	 */
	EAttribute getNetworkLinkType_NetworkLinkSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.NetworkLinkType#getNetworkLinkSimpleExtensionGroup <em>Network Link Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Network Link Simple Extension Group</em>'.
	 * @see net.opengis.kml.NetworkLinkType#getNetworkLinkSimpleExtensionGroup()
	 * @see #getNetworkLinkType()
	 * @generated
	 */
	EAttribute getNetworkLinkType_NetworkLinkSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.NetworkLinkType#getNetworkLinkObjectExtensionGroupGroup <em>Network Link Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Network Link Object Extension Group Group</em>'.
	 * @see net.opengis.kml.NetworkLinkType#getNetworkLinkObjectExtensionGroupGroup()
	 * @see #getNetworkLinkType()
	 * @generated
	 */
	EAttribute getNetworkLinkType_NetworkLinkObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.NetworkLinkType#getNetworkLinkObjectExtensionGroup <em>Network Link Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Network Link Object Extension Group</em>'.
	 * @see net.opengis.kml.NetworkLinkType#getNetworkLinkObjectExtensionGroup()
	 * @see #getNetworkLinkType()
	 * @generated
	 */
	EReference getNetworkLinkType_NetworkLinkObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.OrientationType <em>Orientation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orientation Type</em>'.
	 * @see net.opengis.kml.OrientationType
	 * @generated
	 */
	EClass getOrientationType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.OrientationType#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see net.opengis.kml.OrientationType#getHeading()
	 * @see #getOrientationType()
	 * @generated
	 */
	EAttribute getOrientationType_Heading();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.OrientationType#getTilt <em>Tilt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tilt</em>'.
	 * @see net.opengis.kml.OrientationType#getTilt()
	 * @see #getOrientationType()
	 * @generated
	 */
	EAttribute getOrientationType_Tilt();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.OrientationType#getRoll <em>Roll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roll</em>'.
	 * @see net.opengis.kml.OrientationType#getRoll()
	 * @see #getOrientationType()
	 * @generated
	 */
	EAttribute getOrientationType_Roll();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.OrientationType#getOrientationSimpleExtensionGroupGroup <em>Orientation Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Orientation Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.OrientationType#getOrientationSimpleExtensionGroupGroup()
	 * @see #getOrientationType()
	 * @generated
	 */
	EAttribute getOrientationType_OrientationSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.OrientationType#getOrientationSimpleExtensionGroup <em>Orientation Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Orientation Simple Extension Group</em>'.
	 * @see net.opengis.kml.OrientationType#getOrientationSimpleExtensionGroup()
	 * @see #getOrientationType()
	 * @generated
	 */
	EAttribute getOrientationType_OrientationSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.OrientationType#getOrientationObjectExtensionGroupGroup <em>Orientation Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Orientation Object Extension Group Group</em>'.
	 * @see net.opengis.kml.OrientationType#getOrientationObjectExtensionGroupGroup()
	 * @see #getOrientationType()
	 * @generated
	 */
	EAttribute getOrientationType_OrientationObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.OrientationType#getOrientationObjectExtensionGroup <em>Orientation Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orientation Object Extension Group</em>'.
	 * @see net.opengis.kml.OrientationType#getOrientationObjectExtensionGroup()
	 * @see #getOrientationType()
	 * @generated
	 */
	EReference getOrientationType_OrientationObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.PairType <em>Pair Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pair Type</em>'.
	 * @see net.opengis.kml.PairType
	 * @generated
	 */
	EClass getPairType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.PairType#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see net.opengis.kml.PairType#getKey()
	 * @see #getPairType()
	 * @generated
	 */
	EAttribute getPairType_Key();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.PairType#getStyleUrl <em>Style Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Url</em>'.
	 * @see net.opengis.kml.PairType#getStyleUrl()
	 * @see #getPairType()
	 * @generated
	 */
	EAttribute getPairType_StyleUrl();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.PairType#getAbstractStyleSelectorGroupGroup <em>Abstract Style Selector Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Style Selector Group Group</em>'.
	 * @see net.opengis.kml.PairType#getAbstractStyleSelectorGroupGroup()
	 * @see #getPairType()
	 * @generated
	 */
	EAttribute getPairType_AbstractStyleSelectorGroupGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.PairType#getAbstractStyleSelectorGroup <em>Abstract Style Selector Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Style Selector Group</em>'.
	 * @see net.opengis.kml.PairType#getAbstractStyleSelectorGroup()
	 * @see #getPairType()
	 * @generated
	 */
	EReference getPairType_AbstractStyleSelectorGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.PairType#getPairSimpleExtensionGroupGroup <em>Pair Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Pair Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.PairType#getPairSimpleExtensionGroupGroup()
	 * @see #getPairType()
	 * @generated
	 */
	EAttribute getPairType_PairSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.PairType#getPairSimpleExtensionGroup <em>Pair Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Pair Simple Extension Group</em>'.
	 * @see net.opengis.kml.PairType#getPairSimpleExtensionGroup()
	 * @see #getPairType()
	 * @generated
	 */
	EAttribute getPairType_PairSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.PairType#getPairObjectExtensionGroupGroup <em>Pair Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Pair Object Extension Group Group</em>'.
	 * @see net.opengis.kml.PairType#getPairObjectExtensionGroupGroup()
	 * @see #getPairType()
	 * @generated
	 */
	EAttribute getPairType_PairObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.PairType#getPairObjectExtensionGroup <em>Pair Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pair Object Extension Group</em>'.
	 * @see net.opengis.kml.PairType#getPairObjectExtensionGroup()
	 * @see #getPairType()
	 * @generated
	 */
	EReference getPairType_PairObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.PhotoOverlayType <em>Photo Overlay Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Photo Overlay Type</em>'.
	 * @see net.opengis.kml.PhotoOverlayType
	 * @generated
	 */
	EClass getPhotoOverlayType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.PhotoOverlayType#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see net.opengis.kml.PhotoOverlayType#getRotation()
	 * @see #getPhotoOverlayType()
	 * @generated
	 */
	EAttribute getPhotoOverlayType_Rotation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.PhotoOverlayType#getViewVolume <em>View Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>View Volume</em>'.
	 * @see net.opengis.kml.PhotoOverlayType#getViewVolume()
	 * @see #getPhotoOverlayType()
	 * @generated
	 */
	EReference getPhotoOverlayType_ViewVolume();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.PhotoOverlayType#getImagePyramid <em>Image Pyramid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Pyramid</em>'.
	 * @see net.opengis.kml.PhotoOverlayType#getImagePyramid()
	 * @see #getPhotoOverlayType()
	 * @generated
	 */
	EReference getPhotoOverlayType_ImagePyramid();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.PhotoOverlayType#getPoint <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Point</em>'.
	 * @see net.opengis.kml.PhotoOverlayType#getPoint()
	 * @see #getPhotoOverlayType()
	 * @generated
	 */
	EReference getPhotoOverlayType_Point();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.PhotoOverlayType#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see net.opengis.kml.PhotoOverlayType#getShape()
	 * @see #getPhotoOverlayType()
	 * @generated
	 */
	EAttribute getPhotoOverlayType_Shape();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.PhotoOverlayType#getPhotoOverlaySimpleExtensionGroupGroup <em>Photo Overlay Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Photo Overlay Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.PhotoOverlayType#getPhotoOverlaySimpleExtensionGroupGroup()
	 * @see #getPhotoOverlayType()
	 * @generated
	 */
	EAttribute getPhotoOverlayType_PhotoOverlaySimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.PhotoOverlayType#getPhotoOverlaySimpleExtensionGroup <em>Photo Overlay Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Photo Overlay Simple Extension Group</em>'.
	 * @see net.opengis.kml.PhotoOverlayType#getPhotoOverlaySimpleExtensionGroup()
	 * @see #getPhotoOverlayType()
	 * @generated
	 */
	EAttribute getPhotoOverlayType_PhotoOverlaySimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.PhotoOverlayType#getPhotoOverlayObjectExtensionGroupGroup <em>Photo Overlay Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Photo Overlay Object Extension Group Group</em>'.
	 * @see net.opengis.kml.PhotoOverlayType#getPhotoOverlayObjectExtensionGroupGroup()
	 * @see #getPhotoOverlayType()
	 * @generated
	 */
	EAttribute getPhotoOverlayType_PhotoOverlayObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.PhotoOverlayType#getPhotoOverlayObjectExtensionGroup <em>Photo Overlay Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Photo Overlay Object Extension Group</em>'.
	 * @see net.opengis.kml.PhotoOverlayType#getPhotoOverlayObjectExtensionGroup()
	 * @see #getPhotoOverlayType()
	 * @generated
	 */
	EReference getPhotoOverlayType_PhotoOverlayObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.PlacemarkType <em>Placemark Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placemark Type</em>'.
	 * @see net.opengis.kml.PlacemarkType
	 * @generated
	 */
	EClass getPlacemarkType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.PlacemarkType#getAbstractGeometryGroupGroup <em>Abstract Geometry Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Geometry Group Group</em>'.
	 * @see net.opengis.kml.PlacemarkType#getAbstractGeometryGroupGroup()
	 * @see #getPlacemarkType()
	 * @generated
	 */
	EAttribute getPlacemarkType_AbstractGeometryGroupGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.PlacemarkType#getAbstractGeometryGroup <em>Abstract Geometry Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Geometry Group</em>'.
	 * @see net.opengis.kml.PlacemarkType#getAbstractGeometryGroup()
	 * @see #getPlacemarkType()
	 * @generated
	 */
	EReference getPlacemarkType_AbstractGeometryGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.PlacemarkType#getPlacemarkSimpleExtensionGroupGroup <em>Placemark Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Placemark Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.PlacemarkType#getPlacemarkSimpleExtensionGroupGroup()
	 * @see #getPlacemarkType()
	 * @generated
	 */
	EAttribute getPlacemarkType_PlacemarkSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.PlacemarkType#getPlacemarkSimpleExtensionGroup <em>Placemark Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Placemark Simple Extension Group</em>'.
	 * @see net.opengis.kml.PlacemarkType#getPlacemarkSimpleExtensionGroup()
	 * @see #getPlacemarkType()
	 * @generated
	 */
	EAttribute getPlacemarkType_PlacemarkSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.PlacemarkType#getPlacemarkObjectExtensionGroupGroup <em>Placemark Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Placemark Object Extension Group Group</em>'.
	 * @see net.opengis.kml.PlacemarkType#getPlacemarkObjectExtensionGroupGroup()
	 * @see #getPlacemarkType()
	 * @generated
	 */
	EAttribute getPlacemarkType_PlacemarkObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.PlacemarkType#getPlacemarkObjectExtensionGroup <em>Placemark Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Placemark Object Extension Group</em>'.
	 * @see net.opengis.kml.PlacemarkType#getPlacemarkObjectExtensionGroup()
	 * @see #getPlacemarkType()
	 * @generated
	 */
	EReference getPlacemarkType_PlacemarkObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.PointType <em>Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Type</em>'.
	 * @see net.opengis.kml.PointType
	 * @generated
	 */
	EClass getPointType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.PointType#isExtrude <em>Extrude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrude</em>'.
	 * @see net.opengis.kml.PointType#isExtrude()
	 * @see #getPointType()
	 * @generated
	 */
	EAttribute getPointType_Extrude();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.PointType#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Altitude Mode Group Group</em>'.
	 * @see net.opengis.kml.PointType#getAltitudeModeGroupGroup()
	 * @see #getPointType()
	 * @generated
	 */
	EAttribute getPointType_AltitudeModeGroupGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.PointType#getAltitudeModeGroup <em>Altitude Mode Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Altitude Mode Group</em>'.
	 * @see net.opengis.kml.PointType#getAltitudeModeGroup()
	 * @see #getPointType()
	 * @generated
	 */
	EReference getPointType_AltitudeModeGroup();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.PointType#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinates</em>'.
	 * @see net.opengis.kml.PointType#getCoordinates()
	 * @see #getPointType()
	 * @generated
	 */
	EAttribute getPointType_Coordinates();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.PointType#getPointSimpleExtensionGroupGroup <em>Point Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Point Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.PointType#getPointSimpleExtensionGroupGroup()
	 * @see #getPointType()
	 * @generated
	 */
	EAttribute getPointType_PointSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.PointType#getPointSimpleExtensionGroup <em>Point Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Point Simple Extension Group</em>'.
	 * @see net.opengis.kml.PointType#getPointSimpleExtensionGroup()
	 * @see #getPointType()
	 * @generated
	 */
	EAttribute getPointType_PointSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.PointType#getPointObjectExtensionGroupGroup <em>Point Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Point Object Extension Group Group</em>'.
	 * @see net.opengis.kml.PointType#getPointObjectExtensionGroupGroup()
	 * @see #getPointType()
	 * @generated
	 */
	EAttribute getPointType_PointObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.PointType#getPointObjectExtensionGroup <em>Point Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Point Object Extension Group</em>'.
	 * @see net.opengis.kml.PointType#getPointObjectExtensionGroup()
	 * @see #getPointType()
	 * @generated
	 */
	EReference getPointType_PointObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.PolygonType <em>Polygon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon Type</em>'.
	 * @see net.opengis.kml.PolygonType
	 * @generated
	 */
	EClass getPolygonType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.PolygonType#isExtrude <em>Extrude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extrude</em>'.
	 * @see net.opengis.kml.PolygonType#isExtrude()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_Extrude();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.PolygonType#isTessellate <em>Tessellate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tessellate</em>'.
	 * @see net.opengis.kml.PolygonType#isTessellate()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_Tessellate();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.PolygonType#getAltitudeModeGroupGroup <em>Altitude Mode Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Altitude Mode Group Group</em>'.
	 * @see net.opengis.kml.PolygonType#getAltitudeModeGroupGroup()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_AltitudeModeGroupGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.PolygonType#getAltitudeModeGroup <em>Altitude Mode Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Altitude Mode Group</em>'.
	 * @see net.opengis.kml.PolygonType#getAltitudeModeGroup()
	 * @see #getPolygonType()
	 * @generated
	 */
	EReference getPolygonType_AltitudeModeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.PolygonType#getOuterBoundaryIs <em>Outer Boundary Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Outer Boundary Is</em>'.
	 * @see net.opengis.kml.PolygonType#getOuterBoundaryIs()
	 * @see #getPolygonType()
	 * @generated
	 */
	EReference getPolygonType_OuterBoundaryIs();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.PolygonType#getInnerBoundaryIs <em>Inner Boundary Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inner Boundary Is</em>'.
	 * @see net.opengis.kml.PolygonType#getInnerBoundaryIs()
	 * @see #getPolygonType()
	 * @generated
	 */
	EReference getPolygonType_InnerBoundaryIs();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.PolygonType#getPolygonSimpleExtensionGroupGroup <em>Polygon Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Polygon Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.PolygonType#getPolygonSimpleExtensionGroupGroup()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_PolygonSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.PolygonType#getPolygonSimpleExtensionGroup <em>Polygon Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Polygon Simple Extension Group</em>'.
	 * @see net.opengis.kml.PolygonType#getPolygonSimpleExtensionGroup()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_PolygonSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.PolygonType#getPolygonObjectExtensionGroupGroup <em>Polygon Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Polygon Object Extension Group Group</em>'.
	 * @see net.opengis.kml.PolygonType#getPolygonObjectExtensionGroupGroup()
	 * @see #getPolygonType()
	 * @generated
	 */
	EAttribute getPolygonType_PolygonObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.PolygonType#getPolygonObjectExtensionGroup <em>Polygon Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polygon Object Extension Group</em>'.
	 * @see net.opengis.kml.PolygonType#getPolygonObjectExtensionGroup()
	 * @see #getPolygonType()
	 * @generated
	 */
	EReference getPolygonType_PolygonObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.PolyStyleType <em>Poly Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poly Style Type</em>'.
	 * @see net.opengis.kml.PolyStyleType
	 * @generated
	 */
	EClass getPolyStyleType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.PolyStyleType#isFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see net.opengis.kml.PolyStyleType#isFill()
	 * @see #getPolyStyleType()
	 * @generated
	 */
	EAttribute getPolyStyleType_Fill();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.PolyStyleType#isOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see net.opengis.kml.PolyStyleType#isOutline()
	 * @see #getPolyStyleType()
	 * @generated
	 */
	EAttribute getPolyStyleType_Outline();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.PolyStyleType#getPolyStyleSimpleExtensionGroupGroup <em>Poly Style Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Poly Style Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.PolyStyleType#getPolyStyleSimpleExtensionGroupGroup()
	 * @see #getPolyStyleType()
	 * @generated
	 */
	EAttribute getPolyStyleType_PolyStyleSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.PolyStyleType#getPolyStyleSimpleExtensionGroup <em>Poly Style Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Poly Style Simple Extension Group</em>'.
	 * @see net.opengis.kml.PolyStyleType#getPolyStyleSimpleExtensionGroup()
	 * @see #getPolyStyleType()
	 * @generated
	 */
	EAttribute getPolyStyleType_PolyStyleSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.PolyStyleType#getPolyStyleObjectExtensionGroupGroup <em>Poly Style Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Poly Style Object Extension Group Group</em>'.
	 * @see net.opengis.kml.PolyStyleType#getPolyStyleObjectExtensionGroupGroup()
	 * @see #getPolyStyleType()
	 * @generated
	 */
	EAttribute getPolyStyleType_PolyStyleObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.PolyStyleType#getPolyStyleObjectExtensionGroup <em>Poly Style Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Poly Style Object Extension Group</em>'.
	 * @see net.opengis.kml.PolyStyleType#getPolyStyleObjectExtensionGroup()
	 * @see #getPolyStyleType()
	 * @generated
	 */
	EReference getPolyStyleType_PolyStyleObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.RegionType <em>Region Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Region Type</em>'.
	 * @see net.opengis.kml.RegionType
	 * @generated
	 */
	EClass getRegionType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.RegionType#getLatLonAltBox <em>Lat Lon Alt Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lat Lon Alt Box</em>'.
	 * @see net.opengis.kml.RegionType#getLatLonAltBox()
	 * @see #getRegionType()
	 * @generated
	 */
	EReference getRegionType_LatLonAltBox();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.RegionType#getLod <em>Lod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lod</em>'.
	 * @see net.opengis.kml.RegionType#getLod()
	 * @see #getRegionType()
	 * @generated
	 */
	EReference getRegionType_Lod();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.RegionType#getRegionSimpleExtensionGroupGroup <em>Region Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Region Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.RegionType#getRegionSimpleExtensionGroupGroup()
	 * @see #getRegionType()
	 * @generated
	 */
	EAttribute getRegionType_RegionSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.RegionType#getRegionSimpleExtensionGroup <em>Region Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Region Simple Extension Group</em>'.
	 * @see net.opengis.kml.RegionType#getRegionSimpleExtensionGroup()
	 * @see #getRegionType()
	 * @generated
	 */
	EAttribute getRegionType_RegionSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.RegionType#getRegionObjectExtensionGroupGroup <em>Region Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Region Object Extension Group Group</em>'.
	 * @see net.opengis.kml.RegionType#getRegionObjectExtensionGroupGroup()
	 * @see #getRegionType()
	 * @generated
	 */
	EAttribute getRegionType_RegionObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.RegionType#getRegionObjectExtensionGroup <em>Region Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Region Object Extension Group</em>'.
	 * @see net.opengis.kml.RegionType#getRegionObjectExtensionGroup()
	 * @see #getRegionType()
	 * @generated
	 */
	EReference getRegionType_RegionObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.ResourceMapType <em>Resource Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Map Type</em>'.
	 * @see net.opengis.kml.ResourceMapType
	 * @generated
	 */
	EClass getResourceMapType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.ResourceMapType#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alias</em>'.
	 * @see net.opengis.kml.ResourceMapType#getAlias()
	 * @see #getResourceMapType()
	 * @generated
	 */
	EReference getResourceMapType_Alias();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ResourceMapType#getResourceMapSimpleExtensionGroupGroup <em>Resource Map Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Resource Map Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.ResourceMapType#getResourceMapSimpleExtensionGroupGroup()
	 * @see #getResourceMapType()
	 * @generated
	 */
	EAttribute getResourceMapType_ResourceMapSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ResourceMapType#getResourceMapSimpleExtensionGroup <em>Resource Map Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Resource Map Simple Extension Group</em>'.
	 * @see net.opengis.kml.ResourceMapType#getResourceMapSimpleExtensionGroup()
	 * @see #getResourceMapType()
	 * @generated
	 */
	EAttribute getResourceMapType_ResourceMapSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ResourceMapType#getResourceMapObjectExtensionGroupGroup <em>Resource Map Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Resource Map Object Extension Group Group</em>'.
	 * @see net.opengis.kml.ResourceMapType#getResourceMapObjectExtensionGroupGroup()
	 * @see #getResourceMapType()
	 * @generated
	 */
	EAttribute getResourceMapType_ResourceMapObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.ResourceMapType#getResourceMapObjectExtensionGroup <em>Resource Map Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Map Object Extension Group</em>'.
	 * @see net.opengis.kml.ResourceMapType#getResourceMapObjectExtensionGroup()
	 * @see #getResourceMapType()
	 * @generated
	 */
	EReference getResourceMapType_ResourceMapObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.ScaleType <em>Scale Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scale Type</em>'.
	 * @see net.opengis.kml.ScaleType
	 * @generated
	 */
	EClass getScaleType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.ScaleType#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.opengis.kml.ScaleType#getX()
	 * @see #getScaleType()
	 * @generated
	 */
	EAttribute getScaleType_X();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.ScaleType#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.opengis.kml.ScaleType#getY()
	 * @see #getScaleType()
	 * @generated
	 */
	EAttribute getScaleType_Y();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.ScaleType#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see net.opengis.kml.ScaleType#getZ()
	 * @see #getScaleType()
	 * @generated
	 */
	EAttribute getScaleType_Z();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ScaleType#getScaleSimpleExtensionGroupGroup <em>Scale Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Scale Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.ScaleType#getScaleSimpleExtensionGroupGroup()
	 * @see #getScaleType()
	 * @generated
	 */
	EAttribute getScaleType_ScaleSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ScaleType#getScaleSimpleExtensionGroup <em>Scale Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Scale Simple Extension Group</em>'.
	 * @see net.opengis.kml.ScaleType#getScaleSimpleExtensionGroup()
	 * @see #getScaleType()
	 * @generated
	 */
	EAttribute getScaleType_ScaleSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ScaleType#getScaleObjectExtensionGroupGroup <em>Scale Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Scale Object Extension Group Group</em>'.
	 * @see net.opengis.kml.ScaleType#getScaleObjectExtensionGroupGroup()
	 * @see #getScaleType()
	 * @generated
	 */
	EAttribute getScaleType_ScaleObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.ScaleType#getScaleObjectExtensionGroup <em>Scale Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scale Object Extension Group</em>'.
	 * @see net.opengis.kml.ScaleType#getScaleObjectExtensionGroup()
	 * @see #getScaleType()
	 * @generated
	 */
	EReference getScaleType_ScaleObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.SchemaDataType <em>Schema Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Data Type</em>'.
	 * @see net.opengis.kml.SchemaDataType
	 * @generated
	 */
	EClass getSchemaDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.SchemaDataType#getSimpleData <em>Simple Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Data</em>'.
	 * @see net.opengis.kml.SchemaDataType#getSimpleData()
	 * @see #getSchemaDataType()
	 * @generated
	 */
	EReference getSchemaDataType_SimpleData();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.SchemaDataType#getSchemaDataExtensionGroup <em>Schema Data Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Schema Data Extension Group</em>'.
	 * @see net.opengis.kml.SchemaDataType#getSchemaDataExtensionGroup()
	 * @see #getSchemaDataType()
	 * @generated
	 */
	EAttribute getSchemaDataType_SchemaDataExtensionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.SchemaDataType#getSchemaDataExtension <em>Schema Data Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema Data Extension</em>'.
	 * @see net.opengis.kml.SchemaDataType#getSchemaDataExtension()
	 * @see #getSchemaDataType()
	 * @generated
	 */
	EReference getSchemaDataType_SchemaDataExtension();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.SchemaDataType#getSchemaUrl <em>Schema Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schema Url</em>'.
	 * @see net.opengis.kml.SchemaDataType#getSchemaUrl()
	 * @see #getSchemaDataType()
	 * @generated
	 */
	EAttribute getSchemaDataType_SchemaUrl();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.SchemaType <em>Schema Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema Type</em>'.
	 * @see net.opengis.kml.SchemaType
	 * @generated
	 */
	EClass getSchemaType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.SchemaType#getSimpleField <em>Simple Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Field</em>'.
	 * @see net.opengis.kml.SchemaType#getSimpleField()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_SimpleField();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.SchemaType#getSchemaExtensionGroup <em>Schema Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Schema Extension Group</em>'.
	 * @see net.opengis.kml.SchemaType#getSchemaExtensionGroup()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_SchemaExtensionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.SchemaType#getSchemaExtension <em>Schema Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema Extension</em>'.
	 * @see net.opengis.kml.SchemaType#getSchemaExtension()
	 * @see #getSchemaType()
	 * @generated
	 */
	EReference getSchemaType_SchemaExtension();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.SchemaType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.opengis.kml.SchemaType#getId()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_Id();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.SchemaType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.kml.SchemaType#getName()
	 * @see #getSchemaType()
	 * @generated
	 */
	EAttribute getSchemaType_Name();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.ScreenOverlayType <em>Screen Overlay Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Screen Overlay Type</em>'.
	 * @see net.opengis.kml.ScreenOverlayType
	 * @generated
	 */
	EClass getScreenOverlayType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.ScreenOverlayType#getOverlayXY <em>Overlay XY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Overlay XY</em>'.
	 * @see net.opengis.kml.ScreenOverlayType#getOverlayXY()
	 * @see #getScreenOverlayType()
	 * @generated
	 */
	EReference getScreenOverlayType_OverlayXY();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.ScreenOverlayType#getScreenXY <em>Screen XY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Screen XY</em>'.
	 * @see net.opengis.kml.ScreenOverlayType#getScreenXY()
	 * @see #getScreenOverlayType()
	 * @generated
	 */
	EReference getScreenOverlayType_ScreenXY();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.ScreenOverlayType#getRotationXY <em>Rotation XY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rotation XY</em>'.
	 * @see net.opengis.kml.ScreenOverlayType#getRotationXY()
	 * @see #getScreenOverlayType()
	 * @generated
	 */
	EReference getScreenOverlayType_RotationXY();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.ScreenOverlayType#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Size</em>'.
	 * @see net.opengis.kml.ScreenOverlayType#getSize()
	 * @see #getScreenOverlayType()
	 * @generated
	 */
	EReference getScreenOverlayType_Size();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.ScreenOverlayType#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see net.opengis.kml.ScreenOverlayType#getRotation()
	 * @see #getScreenOverlayType()
	 * @generated
	 */
	EAttribute getScreenOverlayType_Rotation();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ScreenOverlayType#getScreenOverlaySimpleExtensionGroupGroup <em>Screen Overlay Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Screen Overlay Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.ScreenOverlayType#getScreenOverlaySimpleExtensionGroupGroup()
	 * @see #getScreenOverlayType()
	 * @generated
	 */
	EAttribute getScreenOverlayType_ScreenOverlaySimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ScreenOverlayType#getScreenOverlaySimpleExtensionGroup <em>Screen Overlay Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Screen Overlay Simple Extension Group</em>'.
	 * @see net.opengis.kml.ScreenOverlayType#getScreenOverlaySimpleExtensionGroup()
	 * @see #getScreenOverlayType()
	 * @generated
	 */
	EAttribute getScreenOverlayType_ScreenOverlaySimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ScreenOverlayType#getScreenOverlayObjectExtensionGroupGroup <em>Screen Overlay Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Screen Overlay Object Extension Group Group</em>'.
	 * @see net.opengis.kml.ScreenOverlayType#getScreenOverlayObjectExtensionGroupGroup()
	 * @see #getScreenOverlayType()
	 * @generated
	 */
	EAttribute getScreenOverlayType_ScreenOverlayObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.ScreenOverlayType#getScreenOverlayObjectExtensionGroup <em>Screen Overlay Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Screen Overlay Object Extension Group</em>'.
	 * @see net.opengis.kml.ScreenOverlayType#getScreenOverlayObjectExtensionGroup()
	 * @see #getScreenOverlayType()
	 * @generated
	 */
	EReference getScreenOverlayType_ScreenOverlayObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.SimpleDataType <em>Simple Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Data Type</em>'.
	 * @see net.opengis.kml.SimpleDataType
	 * @generated
	 */
	EClass getSimpleDataType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.SimpleDataType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.kml.SimpleDataType#getValue()
	 * @see #getSimpleDataType()
	 * @generated
	 */
	EAttribute getSimpleDataType_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.SimpleDataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.kml.SimpleDataType#getName()
	 * @see #getSimpleDataType()
	 * @generated
	 */
	EAttribute getSimpleDataType_Name();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.SimpleFieldType <em>Simple Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Field Type</em>'.
	 * @see net.opengis.kml.SimpleFieldType
	 * @generated
	 */
	EClass getSimpleFieldType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.SimpleFieldType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see net.opengis.kml.SimpleFieldType#getDisplayName()
	 * @see #getSimpleFieldType()
	 * @generated
	 */
	EAttribute getSimpleFieldType_DisplayName();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.SimpleFieldType#getSimpleFieldExtensionGroup <em>Simple Field Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Simple Field Extension Group</em>'.
	 * @see net.opengis.kml.SimpleFieldType#getSimpleFieldExtensionGroup()
	 * @see #getSimpleFieldType()
	 * @generated
	 */
	EAttribute getSimpleFieldType_SimpleFieldExtensionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.SimpleFieldType#getSimpleFieldExtension <em>Simple Field Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Field Extension</em>'.
	 * @see net.opengis.kml.SimpleFieldType#getSimpleFieldExtension()
	 * @see #getSimpleFieldType()
	 * @generated
	 */
	EReference getSimpleFieldType_SimpleFieldExtension();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.SimpleFieldType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.kml.SimpleFieldType#getName()
	 * @see #getSimpleFieldType()
	 * @generated
	 */
	EAttribute getSimpleFieldType_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.SimpleFieldType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.opengis.kml.SimpleFieldType#getType()
	 * @see #getSimpleFieldType()
	 * @generated
	 */
	EAttribute getSimpleFieldType_Type();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.SnippetType <em>Snippet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Snippet Type</em>'.
	 * @see net.opengis.kml.SnippetType
	 * @generated
	 */
	EClass getSnippetType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.SnippetType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.kml.SnippetType#getValue()
	 * @see #getSnippetType()
	 * @generated
	 */
	EAttribute getSnippetType_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.SnippetType#getMaxLines <em>Max Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Lines</em>'.
	 * @see net.opengis.kml.SnippetType#getMaxLines()
	 * @see #getSnippetType()
	 * @generated
	 */
	EAttribute getSnippetType_MaxLines();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.StyleMapType <em>Style Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Map Type</em>'.
	 * @see net.opengis.kml.StyleMapType
	 * @generated
	 */
	EClass getStyleMapType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.StyleMapType#getPair <em>Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pair</em>'.
	 * @see net.opengis.kml.StyleMapType#getPair()
	 * @see #getStyleMapType()
	 * @generated
	 */
	EReference getStyleMapType_Pair();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.StyleMapType#getStyleMapSimpleExtensionGroupGroup <em>Style Map Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Style Map Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.StyleMapType#getStyleMapSimpleExtensionGroupGroup()
	 * @see #getStyleMapType()
	 * @generated
	 */
	EAttribute getStyleMapType_StyleMapSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.StyleMapType#getStyleMapSimpleExtensionGroup <em>Style Map Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Style Map Simple Extension Group</em>'.
	 * @see net.opengis.kml.StyleMapType#getStyleMapSimpleExtensionGroup()
	 * @see #getStyleMapType()
	 * @generated
	 */
	EAttribute getStyleMapType_StyleMapSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.StyleMapType#getStyleMapObjectExtensionGroupGroup <em>Style Map Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Style Map Object Extension Group Group</em>'.
	 * @see net.opengis.kml.StyleMapType#getStyleMapObjectExtensionGroupGroup()
	 * @see #getStyleMapType()
	 * @generated
	 */
	EAttribute getStyleMapType_StyleMapObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.StyleMapType#getStyleMapObjectExtensionGroup <em>Style Map Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Style Map Object Extension Group</em>'.
	 * @see net.opengis.kml.StyleMapType#getStyleMapObjectExtensionGroup()
	 * @see #getStyleMapType()
	 * @generated
	 */
	EReference getStyleMapType_StyleMapObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.StyleType <em>Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Type</em>'.
	 * @see net.opengis.kml.StyleType
	 * @generated
	 */
	EClass getStyleType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.StyleType#getIconStyle <em>Icon Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Icon Style</em>'.
	 * @see net.opengis.kml.StyleType#getIconStyle()
	 * @see #getStyleType()
	 * @generated
	 */
	EReference getStyleType_IconStyle();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.StyleType#getLabelStyle <em>Label Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Style</em>'.
	 * @see net.opengis.kml.StyleType#getLabelStyle()
	 * @see #getStyleType()
	 * @generated
	 */
	EReference getStyleType_LabelStyle();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.StyleType#getLineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line Style</em>'.
	 * @see net.opengis.kml.StyleType#getLineStyle()
	 * @see #getStyleType()
	 * @generated
	 */
	EReference getStyleType_LineStyle();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.StyleType#getPolyStyle <em>Poly Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Poly Style</em>'.
	 * @see net.opengis.kml.StyleType#getPolyStyle()
	 * @see #getStyleType()
	 * @generated
	 */
	EReference getStyleType_PolyStyle();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.StyleType#getBalloonStyle <em>Balloon Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Balloon Style</em>'.
	 * @see net.opengis.kml.StyleType#getBalloonStyle()
	 * @see #getStyleType()
	 * @generated
	 */
	EReference getStyleType_BalloonStyle();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.kml.StyleType#getListStyle <em>List Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List Style</em>'.
	 * @see net.opengis.kml.StyleType#getListStyle()
	 * @see #getStyleType()
	 * @generated
	 */
	EReference getStyleType_ListStyle();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.StyleType#getStyleSimpleExtensionGroupGroup <em>Style Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Style Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.StyleType#getStyleSimpleExtensionGroupGroup()
	 * @see #getStyleType()
	 * @generated
	 */
	EAttribute getStyleType_StyleSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.StyleType#getStyleSimpleExtensionGroup <em>Style Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Style Simple Extension Group</em>'.
	 * @see net.opengis.kml.StyleType#getStyleSimpleExtensionGroup()
	 * @see #getStyleType()
	 * @generated
	 */
	EAttribute getStyleType_StyleSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.StyleType#getStyleObjectExtensionGroupGroup <em>Style Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Style Object Extension Group Group</em>'.
	 * @see net.opengis.kml.StyleType#getStyleObjectExtensionGroupGroup()
	 * @see #getStyleType()
	 * @generated
	 */
	EAttribute getStyleType_StyleObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.StyleType#getStyleObjectExtensionGroup <em>Style Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Style Object Extension Group</em>'.
	 * @see net.opengis.kml.StyleType#getStyleObjectExtensionGroup()
	 * @see #getStyleType()
	 * @generated
	 */
	EReference getStyleType_StyleObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.TimeSpanType <em>Time Span Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Span Type</em>'.
	 * @see net.opengis.kml.TimeSpanType
	 * @generated
	 */
	EClass getTimeSpanType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.TimeSpanType#getBegin <em>Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Begin</em>'.
	 * @see net.opengis.kml.TimeSpanType#getBegin()
	 * @see #getTimeSpanType()
	 * @generated
	 */
	EAttribute getTimeSpanType_Begin();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.TimeSpanType#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see net.opengis.kml.TimeSpanType#getEnd()
	 * @see #getTimeSpanType()
	 * @generated
	 */
	EAttribute getTimeSpanType_End();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.TimeSpanType#getTimeSpanSimpleExtensionGroupGroup <em>Time Span Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Time Span Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.TimeSpanType#getTimeSpanSimpleExtensionGroupGroup()
	 * @see #getTimeSpanType()
	 * @generated
	 */
	EAttribute getTimeSpanType_TimeSpanSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.TimeSpanType#getTimeSpanSimpleExtensionGroup <em>Time Span Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Time Span Simple Extension Group</em>'.
	 * @see net.opengis.kml.TimeSpanType#getTimeSpanSimpleExtensionGroup()
	 * @see #getTimeSpanType()
	 * @generated
	 */
	EAttribute getTimeSpanType_TimeSpanSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.TimeSpanType#getTimeSpanObjectExtensionGroupGroup <em>Time Span Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Time Span Object Extension Group Group</em>'.
	 * @see net.opengis.kml.TimeSpanType#getTimeSpanObjectExtensionGroupGroup()
	 * @see #getTimeSpanType()
	 * @generated
	 */
	EAttribute getTimeSpanType_TimeSpanObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.TimeSpanType#getTimeSpanObjectExtensionGroup <em>Time Span Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Span Object Extension Group</em>'.
	 * @see net.opengis.kml.TimeSpanType#getTimeSpanObjectExtensionGroup()
	 * @see #getTimeSpanType()
	 * @generated
	 */
	EReference getTimeSpanType_TimeSpanObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.TimeStampType <em>Time Stamp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Stamp Type</em>'.
	 * @see net.opengis.kml.TimeStampType
	 * @generated
	 */
	EClass getTimeStampType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.TimeStampType#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see net.opengis.kml.TimeStampType#getWhen()
	 * @see #getTimeStampType()
	 * @generated
	 */
	EAttribute getTimeStampType_When();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.TimeStampType#getTimeStampSimpleExtensionGroupGroup <em>Time Stamp Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Time Stamp Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.TimeStampType#getTimeStampSimpleExtensionGroupGroup()
	 * @see #getTimeStampType()
	 * @generated
	 */
	EAttribute getTimeStampType_TimeStampSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.TimeStampType#getTimeStampSimpleExtensionGroup <em>Time Stamp Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Time Stamp Simple Extension Group</em>'.
	 * @see net.opengis.kml.TimeStampType#getTimeStampSimpleExtensionGroup()
	 * @see #getTimeStampType()
	 * @generated
	 */
	EAttribute getTimeStampType_TimeStampSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.TimeStampType#getTimeStampObjectExtensionGroupGroup <em>Time Stamp Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Time Stamp Object Extension Group Group</em>'.
	 * @see net.opengis.kml.TimeStampType#getTimeStampObjectExtensionGroupGroup()
	 * @see #getTimeStampType()
	 * @generated
	 */
	EAttribute getTimeStampType_TimeStampObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.TimeStampType#getTimeStampObjectExtensionGroup <em>Time Stamp Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Time Stamp Object Extension Group</em>'.
	 * @see net.opengis.kml.TimeStampType#getTimeStampObjectExtensionGroup()
	 * @see #getTimeStampType()
	 * @generated
	 */
	EReference getTimeStampType_TimeStampObjectExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.UpdateType <em>Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Type</em>'.
	 * @see net.opengis.kml.UpdateType
	 * @generated
	 */
	EClass getUpdateType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.UpdateType#getTargetHref <em>Target Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Href</em>'.
	 * @see net.opengis.kml.UpdateType#getTargetHref()
	 * @see #getUpdateType()
	 * @generated
	 */
	EAttribute getUpdateType_TargetHref();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.UpdateType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.opengis.kml.UpdateType#getGroup()
	 * @see #getUpdateType()
	 * @generated
	 */
	EAttribute getUpdateType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.UpdateType#getCreate <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Create</em>'.
	 * @see net.opengis.kml.UpdateType#getCreate()
	 * @see #getUpdateType()
	 * @generated
	 */
	EReference getUpdateType_Create();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.UpdateType#getDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delete</em>'.
	 * @see net.opengis.kml.UpdateType#getDelete()
	 * @see #getUpdateType()
	 * @generated
	 */
	EReference getUpdateType_Delete();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.UpdateType#getChange <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change</em>'.
	 * @see net.opengis.kml.UpdateType#getChange()
	 * @see #getUpdateType()
	 * @generated
	 */
	EReference getUpdateType_Change();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.UpdateType#getUpdateOpExtensionGroupGroup <em>Update Op Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Update Op Extension Group Group</em>'.
	 * @see net.opengis.kml.UpdateType#getUpdateOpExtensionGroupGroup()
	 * @see #getUpdateType()
	 * @generated
	 */
	EAttribute getUpdateType_UpdateOpExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.UpdateType#getUpdateOpExtensionGroup <em>Update Op Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Update Op Extension Group</em>'.
	 * @see net.opengis.kml.UpdateType#getUpdateOpExtensionGroup()
	 * @see #getUpdateType()
	 * @generated
	 */
	EReference getUpdateType_UpdateOpExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.UpdateType#getUpdateExtensionGroupGroup <em>Update Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Update Extension Group Group</em>'.
	 * @see net.opengis.kml.UpdateType#getUpdateExtensionGroupGroup()
	 * @see #getUpdateType()
	 * @generated
	 */
	EAttribute getUpdateType_UpdateExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.UpdateType#getUpdateExtensionGroup <em>Update Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Update Extension Group</em>'.
	 * @see net.opengis.kml.UpdateType#getUpdateExtensionGroup()
	 * @see #getUpdateType()
	 * @generated
	 */
	EReference getUpdateType_UpdateExtensionGroup();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.Vec2Type <em>Vec2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vec2 Type</em>'.
	 * @see net.opengis.kml.Vec2Type
	 * @generated
	 */
	EClass getVec2Type();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.Vec2Type#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.opengis.kml.Vec2Type#getX()
	 * @see #getVec2Type()
	 * @generated
	 */
	EAttribute getVec2Type_X();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.Vec2Type#getXunits <em>Xunits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xunits</em>'.
	 * @see net.opengis.kml.Vec2Type#getXunits()
	 * @see #getVec2Type()
	 * @generated
	 */
	EAttribute getVec2Type_Xunits();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.Vec2Type#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.opengis.kml.Vec2Type#getY()
	 * @see #getVec2Type()
	 * @generated
	 */
	EAttribute getVec2Type_Y();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.Vec2Type#getYunits <em>Yunits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yunits</em>'.
	 * @see net.opengis.kml.Vec2Type#getYunits()
	 * @see #getVec2Type()
	 * @generated
	 */
	EAttribute getVec2Type_Yunits();

	/**
	 * Returns the meta object for class '{@link net.opengis.kml.ViewVolumeType <em>View Volume Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Volume Type</em>'.
	 * @see net.opengis.kml.ViewVolumeType
	 * @generated
	 */
	EClass getViewVolumeType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.ViewVolumeType#getLeftFov <em>Left Fov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Left Fov</em>'.
	 * @see net.opengis.kml.ViewVolumeType#getLeftFov()
	 * @see #getViewVolumeType()
	 * @generated
	 */
	EAttribute getViewVolumeType_LeftFov();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.ViewVolumeType#getRightFov <em>Right Fov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Right Fov</em>'.
	 * @see net.opengis.kml.ViewVolumeType#getRightFov()
	 * @see #getViewVolumeType()
	 * @generated
	 */
	EAttribute getViewVolumeType_RightFov();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.ViewVolumeType#getBottomFov <em>Bottom Fov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom Fov</em>'.
	 * @see net.opengis.kml.ViewVolumeType#getBottomFov()
	 * @see #getViewVolumeType()
	 * @generated
	 */
	EAttribute getViewVolumeType_BottomFov();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.ViewVolumeType#getTopFov <em>Top Fov</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Fov</em>'.
	 * @see net.opengis.kml.ViewVolumeType#getTopFov()
	 * @see #getViewVolumeType()
	 * @generated
	 */
	EAttribute getViewVolumeType_TopFov();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.kml.ViewVolumeType#getNear <em>Near</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Near</em>'.
	 * @see net.opengis.kml.ViewVolumeType#getNear()
	 * @see #getViewVolumeType()
	 * @generated
	 */
	EAttribute getViewVolumeType_Near();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ViewVolumeType#getViewVolumeSimpleExtensionGroupGroup <em>View Volume Simple Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>View Volume Simple Extension Group Group</em>'.
	 * @see net.opengis.kml.ViewVolumeType#getViewVolumeSimpleExtensionGroupGroup()
	 * @see #getViewVolumeType()
	 * @generated
	 */
	EAttribute getViewVolumeType_ViewVolumeSimpleExtensionGroupGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ViewVolumeType#getViewVolumeSimpleExtensionGroup <em>View Volume Simple Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>View Volume Simple Extension Group</em>'.
	 * @see net.opengis.kml.ViewVolumeType#getViewVolumeSimpleExtensionGroup()
	 * @see #getViewVolumeType()
	 * @generated
	 */
	EAttribute getViewVolumeType_ViewVolumeSimpleExtensionGroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.kml.ViewVolumeType#getViewVolumeObjectExtensionGroupGroup <em>View Volume Object Extension Group Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>View Volume Object Extension Group Group</em>'.
	 * @see net.opengis.kml.ViewVolumeType#getViewVolumeObjectExtensionGroupGroup()
	 * @see #getViewVolumeType()
	 * @generated
	 */
	EAttribute getViewVolumeType_ViewVolumeObjectExtensionGroupGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.kml.ViewVolumeType#getViewVolumeObjectExtensionGroup <em>View Volume Object Extension Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Volume Object Extension Group</em>'.
	 * @see net.opengis.kml.ViewVolumeType#getViewVolumeObjectExtensionGroup()
	 * @see #getViewVolumeType()
	 * @generated
	 */
	EReference getViewVolumeType_ViewVolumeObjectExtensionGroup();

	/**
	 * Returns the meta object for enum '{@link net.opengis.kml.AltitudeModeEnumType <em>Altitude Mode Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Altitude Mode Enum Type</em>'.
	 * @see net.opengis.kml.AltitudeModeEnumType
	 * @generated
	 */
	EEnum getAltitudeModeEnumType();

	/**
	 * Returns the meta object for enum '{@link net.opengis.kml.ColorModeEnumType <em>Color Mode Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color Mode Enum Type</em>'.
	 * @see net.opengis.kml.ColorModeEnumType
	 * @generated
	 */
	EEnum getColorModeEnumType();

	/**
	 * Returns the meta object for enum '{@link net.opengis.kml.DisplayModeEnumType <em>Display Mode Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Display Mode Enum Type</em>'.
	 * @see net.opengis.kml.DisplayModeEnumType
	 * @generated
	 */
	EEnum getDisplayModeEnumType();

	/**
	 * Returns the meta object for enum '{@link net.opengis.kml.GridOriginEnumType <em>Grid Origin Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Grid Origin Enum Type</em>'.
	 * @see net.opengis.kml.GridOriginEnumType
	 * @generated
	 */
	EEnum getGridOriginEnumType();

	/**
	 * Returns the meta object for enum '{@link net.opengis.kml.ItemIconStateEnumType <em>Item Icon State Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Item Icon State Enum Type</em>'.
	 * @see net.opengis.kml.ItemIconStateEnumType
	 * @generated
	 */
	EEnum getItemIconStateEnumType();

	/**
	 * Returns the meta object for enum '{@link net.opengis.kml.ListItemTypeEnumType <em>List Item Type Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>List Item Type Enum Type</em>'.
	 * @see net.opengis.kml.ListItemTypeEnumType
	 * @generated
	 */
	EEnum getListItemTypeEnumType();

	/**
	 * Returns the meta object for enum '{@link net.opengis.kml.RefreshModeEnumType <em>Refresh Mode Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Refresh Mode Enum Type</em>'.
	 * @see net.opengis.kml.RefreshModeEnumType
	 * @generated
	 */
	EEnum getRefreshModeEnumType();

	/**
	 * Returns the meta object for enum '{@link net.opengis.kml.ShapeEnumType <em>Shape Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shape Enum Type</em>'.
	 * @see net.opengis.kml.ShapeEnumType
	 * @generated
	 */
	EEnum getShapeEnumType();

	/**
	 * Returns the meta object for enum '{@link net.opengis.kml.StyleStateEnumType <em>Style State Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Style State Enum Type</em>'.
	 * @see net.opengis.kml.StyleStateEnumType
	 * @generated
	 */
	EEnum getStyleStateEnumType();

	/**
	 * Returns the meta object for enum '{@link net.opengis.kml.UnitsEnumType <em>Units Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Units Enum Type</em>'.
	 * @see net.opengis.kml.UnitsEnumType
	 * @generated
	 */
	EEnum getUnitsEnumType();

	/**
	 * Returns the meta object for enum '{@link net.opengis.kml.ViewRefreshModeEnumType <em>View Refresh Mode Enum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>View Refresh Mode Enum Type</em>'.
	 * @see net.opengis.kml.ViewRefreshModeEnumType
	 * @generated
	 */
	EEnum getViewRefreshModeEnumType();

	/**
	 * Returns the meta object for data type '{@link net.opengis.kml.AltitudeModeEnumType <em>Altitude Mode Enum Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Altitude Mode Enum Type Object</em>'.
	 * @see net.opengis.kml.AltitudeModeEnumType
	 * @model instanceClass="net.opengis.kml.AltitudeModeEnumType"
	 *        extendedMetaData="name='altitudeModeEnumType:Object' baseType='altitudeModeEnumType'"
	 * @generated
	 */
	EDataType getAltitudeModeEnumTypeObject();

	/**
	 * Returns the meta object for data type '<em>Angle180 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle180 Type</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='angle180Type' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='-180.0' maxInclusive='180.0'"
	 * @generated
	 */
	EDataType getAngle180Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Angle180 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle180 Type Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='angle180Type:Object' baseType='angle180Type'"
	 * @generated
	 */
	EDataType getAngle180TypeObject();

	/**
	 * Returns the meta object for data type '<em>Angle360 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle360 Type</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='angle360Type' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='-360.0' maxInclusive='360.0'"
	 * @generated
	 */
	EDataType getAngle360Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Angle360 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle360 Type Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='angle360Type:Object' baseType='angle360Type'"
	 * @generated
	 */
	EDataType getAngle360TypeObject();

	/**
	 * Returns the meta object for data type '<em>Angle90 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle90 Type</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='angle90Type' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='-90' maxInclusive='90.0'"
	 * @generated
	 */
	EDataType getAngle90Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Angle90 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Angle90 Type Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='angle90Type:Object' baseType='angle90Type'"
	 * @generated
	 */
	EDataType getAngle90TypeObject();

	/**
	 * Returns the meta object for data type '<em>Anglepos180 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Anglepos180 Type</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='anglepos180Type' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0.0' maxInclusive='180.0'"
	 * @generated
	 */
	EDataType getAnglepos180Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Anglepos180 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Anglepos180 Type Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='anglepos180Type:Object' baseType='anglepos180Type'"
	 * @generated
	 */
	EDataType getAnglepos180TypeObject();

	/**
	 * Returns the meta object for data type '<em>Anglepos90 Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Anglepos90 Type</em>'.
	 * @model instanceClass="double"
	 *        extendedMetaData="name='anglepos90Type' baseType='http://www.eclipse.org/emf/2003/XMLType#double' minInclusive='0.0' maxInclusive='90.0'"
	 * @generated
	 */
	EDataType getAnglepos90Type();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Anglepos90 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Anglepos90 Type Object</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        extendedMetaData="name='anglepos90Type:Object' baseType='anglepos90Type'"
	 * @generated
	 */
	EDataType getAnglepos90TypeObject();

	/**
	 * Returns the meta object for data type '{@link net.opengis.kml.ColorModeEnumType <em>Color Mode Enum Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color Mode Enum Type Object</em>'.
	 * @see net.opengis.kml.ColorModeEnumType
	 * @model instanceClass="net.opengis.kml.ColorModeEnumType"
	 *        extendedMetaData="name='colorModeEnumType:Object' baseType='colorModeEnumType'"
	 * @generated
	 */
	EDataType getColorModeEnumTypeObject();

	/**
	 * Returns the meta object for data type '<em>Color Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *         
     *         aabbggrr
     *         
     *         ffffffff: opaque white
     *         ff000000: opaque black
     *         
     *         
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Color Type</em>'.
	 * @model instanceClass="byte[]"
	 *        extendedMetaData="name='colorType' baseType='http://www.eclipse.org/emf/2003/XMLType#hexBinary' length='4'"
	 * @generated
	 */
	EDataType getColorType();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Coordinates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Coordinates Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='coordinatesType' itemType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getCoordinatesType();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Date Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Time Type</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='dateTimeType' memberTypes='http://www.eclipse.org/emf/2003/XMLType#dateTime http://www.eclipse.org/emf/2003/XMLType#date http://www.eclipse.org/emf/2003/XMLType#gYearMonth http://www.eclipse.org/emf/2003/XMLType#gYear'"
	 * @generated
	 */
	EDataType getDateTimeType();

	/**
	 * Returns the meta object for data type '{@link net.opengis.kml.DisplayModeEnumType <em>Display Mode Enum Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Display Mode Enum Type Object</em>'.
	 * @see net.opengis.kml.DisplayModeEnumType
	 * @model instanceClass="net.opengis.kml.DisplayModeEnumType"
	 *        extendedMetaData="name='displayModeEnumType:Object' baseType='displayModeEnumType'"
	 * @generated
	 */
	EDataType getDisplayModeEnumTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.opengis.kml.GridOriginEnumType <em>Grid Origin Enum Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Grid Origin Enum Type Object</em>'.
	 * @see net.opengis.kml.GridOriginEnumType
	 * @model instanceClass="net.opengis.kml.GridOriginEnumType"
	 *        extendedMetaData="name='gridOriginEnumType:Object' baseType='gridOriginEnumType'"
	 * @generated
	 */
	EDataType getGridOriginEnumTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.opengis.kml.ItemIconStateEnumType <em>Item Icon State Enum Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Item Icon State Enum Type Object</em>'.
	 * @see net.opengis.kml.ItemIconStateEnumType
	 * @model instanceClass="net.opengis.kml.ItemIconStateEnumType"
	 *        extendedMetaData="name='itemIconStateEnumType:Object' baseType='itemIconStateEnumType'"
	 * @generated
	 */
	EDataType getItemIconStateEnumTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Item Icon State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Item Icon State Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='itemIconStateType' itemType='itemIconStateEnumType'"
	 * @generated
	 */
	EDataType getItemIconStateType();

	/**
	 * Returns the meta object for data type '{@link net.opengis.kml.ListItemTypeEnumType <em>List Item Type Enum Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List Item Type Enum Type Object</em>'.
	 * @see net.opengis.kml.ListItemTypeEnumType
	 * @model instanceClass="net.opengis.kml.ListItemTypeEnumType"
	 *        extendedMetaData="name='listItemTypeEnumType:Object' baseType='listItemTypeEnumType'"
	 * @generated
	 */
	EDataType getListItemTypeEnumTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.opengis.kml.RefreshModeEnumType <em>Refresh Mode Enum Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Refresh Mode Enum Type Object</em>'.
	 * @see net.opengis.kml.RefreshModeEnumType
	 * @model instanceClass="net.opengis.kml.RefreshModeEnumType"
	 *        extendedMetaData="name='refreshModeEnumType:Object' baseType='refreshModeEnumType'"
	 * @generated
	 */
	EDataType getRefreshModeEnumTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.opengis.kml.ShapeEnumType <em>Shape Enum Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Shape Enum Type Object</em>'.
	 * @see net.opengis.kml.ShapeEnumType
	 * @model instanceClass="net.opengis.kml.ShapeEnumType"
	 *        extendedMetaData="name='shapeEnumType:Object' baseType='shapeEnumType'"
	 * @generated
	 */
	EDataType getShapeEnumTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.opengis.kml.StyleStateEnumType <em>Style State Enum Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Style State Enum Type Object</em>'.
	 * @see net.opengis.kml.StyleStateEnumType
	 * @model instanceClass="net.opengis.kml.StyleStateEnumType"
	 *        extendedMetaData="name='styleStateEnumType:Object' baseType='styleStateEnumType'"
	 * @generated
	 */
	EDataType getStyleStateEnumTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.opengis.kml.UnitsEnumType <em>Units Enum Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Units Enum Type Object</em>'.
	 * @see net.opengis.kml.UnitsEnumType
	 * @model instanceClass="net.opengis.kml.UnitsEnumType"
	 *        extendedMetaData="name='unitsEnumType:Object' baseType='unitsEnumType'"
	 * @generated
	 */
	EDataType getUnitsEnumTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.opengis.kml.ViewRefreshModeEnumType <em>View Refresh Mode Enum Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>View Refresh Mode Enum Type Object</em>'.
	 * @see net.opengis.kml.ViewRefreshModeEnumType
	 * @model instanceClass="net.opengis.kml.ViewRefreshModeEnumType"
	 *        extendedMetaData="name='viewRefreshModeEnumType:Object' baseType='viewRefreshModeEnumType'"
	 * @generated
	 */
	EDataType getViewRefreshModeEnumTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KMLFactory getKMLFactory();

} //KMLPackage
