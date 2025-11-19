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
package org.open.oasis.docs.odata.ns.edmx;


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
 *       Entity Data Model Wrapper part of the Common Schema Definition Language
 *     
 * 
 *       Entity Data Model part of the Common Schema Definition Language
 *     
 * <!-- end-model-doc -->
 * @see org.open.oasis.docs.odata.ns.edmx.EdmxFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = EdmxPackage.eNS_URI, genModel = "/model/edmx.genmodel", genModelSourceLocations = {"model/edmx.genmodel","org.odata.csdl.model/model/edmx.genmodel"}, ecore="/model/edmx.ecore", ecoreSourceLocations="/model/edmx.ecore")
public interface EdmxPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "edmx";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://docs.oasis-open.org/odata/ns/edmx";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "edmx";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EdmxPackage eINSTANCE = org.open.oasis.docs.odata.ns.edmx.impl.EdmxPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edmx.impl.EdmxRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edmx.impl.EdmxRootImpl
	 * @see org.open.oasis.docs.odata.ns.edmx.impl.EdmxPackageImpl#getEdmxRoot()
	 * @generated
	 */
	int EDMX_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDMX_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDMX_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDMX_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Edmx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDMX_ROOT__EDMX = 3;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDMX_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDMX_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edmx.impl.TDataServicesImpl <em>TData Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edmx.impl.TDataServicesImpl
	 * @see org.open.oasis.docs.odata.ns.edmx.impl.EdmxPackageImpl#getTDataServices()
	 * @generated
	 */
	int TDATA_SERVICES = 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_SERVICES__SCHEMA = 0;

	/**
	 * The number of structural features of the '<em>TData Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_SERVICES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>TData Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TDATA_SERVICES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edmx.impl.TEdmxImpl <em>TEdmx</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edmx.impl.TEdmxImpl
	 * @see org.open.oasis.docs.odata.ns.edmx.impl.EdmxPackageImpl#getTEdmx()
	 * @generated
	 */
	int TEDMX = 2;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEDMX__REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Data Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEDMX__DATA_SERVICES = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEDMX__VERSION = 2;

	/**
	 * The number of structural features of the '<em>TEdmx</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEDMX_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TEdmx</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEDMX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edmx.impl.TIncludeImpl <em>TInclude</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edmx.impl.TIncludeImpl
	 * @see org.open.oasis.docs.odata.ns.edmx.impl.EdmxPackageImpl#getTInclude()
	 * @generated
	 */
	int TINCLUDE = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUDE__ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUDE__ALIAS = 1;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUDE__NAMESPACE = 2;

	/**
	 * The number of structural features of the '<em>TInclude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUDE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TInclude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edmx.impl.TIncludeAnnotationsImpl <em>TInclude Annotations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edmx.impl.TIncludeAnnotationsImpl
	 * @see org.open.oasis.docs.odata.ns.edmx.impl.EdmxPackageImpl#getTIncludeAnnotations()
	 * @generated
	 */
	int TINCLUDE_ANNOTATIONS = 4;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUDE_ANNOTATIONS__QUALIFIER = 0;

	/**
	 * The feature id for the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUDE_ANNOTATIONS__TARGET_NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Term Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUDE_ANNOTATIONS__TERM_NAMESPACE = 2;

	/**
	 * The number of structural features of the '<em>TInclude Annotations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUDE_ANNOTATIONS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>TInclude Annotations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TINCLUDE_ANNOTATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edmx.impl.TReferenceImpl <em>TReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edmx.impl.TReferenceImpl
	 * @see org.open.oasis.docs.odata.ns.edmx.impl.EdmxPackageImpl#getTReference()
	 * @generated
	 */
	int TREFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREFERENCE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREFERENCE__INCLUDE = 1;

	/**
	 * The feature id for the '<em><b>Include Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREFERENCE__INCLUDE_ANNOTATIONS = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREFERENCE__ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREFERENCE__URI = 4;

	/**
	 * The number of structural features of the '<em>TReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREFERENCE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>TReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.open.oasis.docs.odata.ns.edmx.TVersion <em>TVersion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edmx.TVersion
	 * @see org.open.oasis.docs.odata.ns.edmx.impl.EdmxPackageImpl#getTVersion()
	 * @generated
	 */
	int TVERSION = 6;

	/**
	 * The meta object id for the '<em>TVersion Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.open.oasis.docs.odata.ns.edmx.TVersion
	 * @see org.open.oasis.docs.odata.ns.edmx.impl.EdmxPackageImpl#getTVersionObject()
	 * @generated
	 */
	int TVERSION_OBJECT = 7;


	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edmx.EdmxRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.EdmxRoot
	 * @generated
	 */
	EClass getEdmxRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edmx.EdmxRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.EdmxRoot#getMixed()
	 * @see #getEdmxRoot()
	 * @generated
	 */
	EAttribute getEdmxRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.open.oasis.docs.odata.ns.edmx.EdmxRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.EdmxRoot#getXMLNSPrefixMap()
	 * @see #getEdmxRoot()
	 * @generated
	 */
	EReference getEdmxRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.open.oasis.docs.odata.ns.edmx.EdmxRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.EdmxRoot#getXSISchemaLocation()
	 * @see #getEdmxRoot()
	 * @generated
	 */
	EReference getEdmxRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edmx.EdmxRoot#getEdmx <em>Edmx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Edmx</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.EdmxRoot#getEdmx()
	 * @see #getEdmxRoot()
	 * @generated
	 */
	EReference getEdmxRoot_Edmx();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edmx.TDataServices <em>TData Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TData Services</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.TDataServices
	 * @generated
	 */
	EClass getTDataServices();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edmx.TDataServices#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schema</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.TDataServices#getSchema()
	 * @see #getTDataServices()
	 * @generated
	 */
	EReference getTDataServices_Schema();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edmx.TEdmx <em>TEdmx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TEdmx</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.TEdmx
	 * @generated
	 */
	EClass getTEdmx();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edmx.TEdmx#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.TEdmx#getReference()
	 * @see #getTEdmx()
	 * @generated
	 */
	EReference getTEdmx_Reference();

	/**
	 * Returns the meta object for the containment reference '{@link org.open.oasis.docs.odata.ns.edmx.TEdmx#getDataServices <em>Data Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Services</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.TEdmx#getDataServices()
	 * @see #getTEdmx()
	 * @generated
	 */
	EReference getTEdmx_DataServices();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edmx.TEdmx#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.TEdmx#getVersion()
	 * @see #getTEdmx()
	 * @generated
	 */
	EAttribute getTEdmx_Version();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edmx.TInclude <em>TInclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInclude</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.TInclude
	 * @generated
	 */
	EClass getTInclude();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edmx.TInclude#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.TInclude#getAnnotation()
	 * @see #getTInclude()
	 * @generated
	 */
	EReference getTInclude_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edmx.TInclude#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.TInclude#getAlias()
	 * @see #getTInclude()
	 * @generated
	 */
	EAttribute getTInclude_Alias();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edmx.TInclude#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.TInclude#getNamespace()
	 * @see #getTInclude()
	 * @generated
	 */
	EAttribute getTInclude_Namespace();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edmx.TIncludeAnnotations <em>TInclude Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TInclude Annotations</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.TIncludeAnnotations
	 * @generated
	 */
	EClass getTIncludeAnnotations();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edmx.TIncludeAnnotations#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.TIncludeAnnotations#getQualifier()
	 * @see #getTIncludeAnnotations()
	 * @generated
	 */
	EAttribute getTIncludeAnnotations_Qualifier();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edmx.TIncludeAnnotations#getTargetNamespace <em>Target Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Namespace</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.TIncludeAnnotations#getTargetNamespace()
	 * @see #getTIncludeAnnotations()
	 * @generated
	 */
	EAttribute getTIncludeAnnotations_TargetNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edmx.TIncludeAnnotations#getTermNamespace <em>Term Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term Namespace</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.TIncludeAnnotations#getTermNamespace()
	 * @see #getTIncludeAnnotations()
	 * @generated
	 */
	EAttribute getTIncludeAnnotations_TermNamespace();

	/**
	 * Returns the meta object for class '{@link org.open.oasis.docs.odata.ns.edmx.TReference <em>TReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TReference</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.TReference
	 * @generated
	 */
	EClass getTReference();

	/**
	 * Returns the meta object for the attribute list '{@link org.open.oasis.docs.odata.ns.edmx.TReference#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.TReference#getGroup()
	 * @see #getTReference()
	 * @generated
	 */
	EAttribute getTReference_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edmx.TReference#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.TReference#getInclude()
	 * @see #getTReference()
	 * @generated
	 */
	EReference getTReference_Include();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edmx.TReference#getIncludeAnnotations <em>Include Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include Annotations</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.TReference#getIncludeAnnotations()
	 * @see #getTReference()
	 * @generated
	 */
	EReference getTReference_IncludeAnnotations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.open.oasis.docs.odata.ns.edmx.TReference#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.TReference#getAnnotation()
	 * @see #getTReference()
	 * @generated
	 */
	EReference getTReference_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link org.open.oasis.docs.odata.ns.edmx.TReference#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.TReference#getUri()
	 * @see #getTReference()
	 * @generated
	 */
	EAttribute getTReference_Uri();

	/**
	 * Returns the meta object for enum '{@link org.open.oasis.docs.odata.ns.edmx.TVersion <em>TVersion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TVersion</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.TVersion
	 * @generated
	 */
	EEnum getTVersion();

	/**
	 * Returns the meta object for data type '{@link org.open.oasis.docs.odata.ns.edmx.TVersion <em>TVersion Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>TVersion Object</em>'.
	 * @see org.open.oasis.docs.odata.ns.edmx.TVersion
	 * @model instanceClass="org.open.oasis.docs.odata.ns.edmx.TVersion"
	 *        extendedMetaData="name='TVersion:Object' baseType='TVersion'"
	 * @generated
	 */
	EDataType getTVersionObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EdmxFactory getEdmxFactory();

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
		 * The meta object literal for the '{@link org.open.oasis.docs.odata.ns.edmx.impl.EdmxRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.odata.ns.edmx.impl.EdmxRootImpl
		 * @see org.open.oasis.docs.odata.ns.edmx.impl.EdmxPackageImpl#getEdmxRoot()
		 * @generated
		 */
		EClass EDMX_ROOT = eINSTANCE.getEdmxRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDMX_ROOT__MIXED = eINSTANCE.getEdmxRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDMX_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getEdmxRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDMX_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getEdmxRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Edmx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDMX_ROOT__EDMX = eINSTANCE.getEdmxRoot_Edmx();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.odata.ns.edmx.impl.TDataServicesImpl <em>TData Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.odata.ns.edmx.impl.TDataServicesImpl
		 * @see org.open.oasis.docs.odata.ns.edmx.impl.EdmxPackageImpl#getTDataServices()
		 * @generated
		 */
		EClass TDATA_SERVICES = eINSTANCE.getTDataServices();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TDATA_SERVICES__SCHEMA = eINSTANCE.getTDataServices_Schema();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.odata.ns.edmx.impl.TEdmxImpl <em>TEdmx</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.odata.ns.edmx.impl.TEdmxImpl
		 * @see org.open.oasis.docs.odata.ns.edmx.impl.EdmxPackageImpl#getTEdmx()
		 * @generated
		 */
		EClass TEDMX = eINSTANCE.getTEdmx();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEDMX__REFERENCE = eINSTANCE.getTEdmx_Reference();

		/**
		 * The meta object literal for the '<em><b>Data Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEDMX__DATA_SERVICES = eINSTANCE.getTEdmx_DataServices();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEDMX__VERSION = eINSTANCE.getTEdmx_Version();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.odata.ns.edmx.impl.TIncludeImpl <em>TInclude</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.odata.ns.edmx.impl.TIncludeImpl
		 * @see org.open.oasis.docs.odata.ns.edmx.impl.EdmxPackageImpl#getTInclude()
		 * @generated
		 */
		EClass TINCLUDE = eINSTANCE.getTInclude();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TINCLUDE__ANNOTATION = eINSTANCE.getTInclude_Annotation();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINCLUDE__ALIAS = eINSTANCE.getTInclude_Alias();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINCLUDE__NAMESPACE = eINSTANCE.getTInclude_Namespace();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.odata.ns.edmx.impl.TIncludeAnnotationsImpl <em>TInclude Annotations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.odata.ns.edmx.impl.TIncludeAnnotationsImpl
		 * @see org.open.oasis.docs.odata.ns.edmx.impl.EdmxPackageImpl#getTIncludeAnnotations()
		 * @generated
		 */
		EClass TINCLUDE_ANNOTATIONS = eINSTANCE.getTIncludeAnnotations();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINCLUDE_ANNOTATIONS__QUALIFIER = eINSTANCE.getTIncludeAnnotations_Qualifier();

		/**
		 * The meta object literal for the '<em><b>Target Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINCLUDE_ANNOTATIONS__TARGET_NAMESPACE = eINSTANCE.getTIncludeAnnotations_TargetNamespace();

		/**
		 * The meta object literal for the '<em><b>Term Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TINCLUDE_ANNOTATIONS__TERM_NAMESPACE = eINSTANCE.getTIncludeAnnotations_TermNamespace();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.odata.ns.edmx.impl.TReferenceImpl <em>TReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.odata.ns.edmx.impl.TReferenceImpl
		 * @see org.open.oasis.docs.odata.ns.edmx.impl.EdmxPackageImpl#getTReference()
		 * @generated
		 */
		EClass TREFERENCE = eINSTANCE.getTReference();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREFERENCE__GROUP = eINSTANCE.getTReference_Group();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREFERENCE__INCLUDE = eINSTANCE.getTReference_Include();

		/**
		 * The meta object literal for the '<em><b>Include Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREFERENCE__INCLUDE_ANNOTATIONS = eINSTANCE.getTReference_IncludeAnnotations();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TREFERENCE__ANNOTATION = eINSTANCE.getTReference_Annotation();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREFERENCE__URI = eINSTANCE.getTReference_Uri();

		/**
		 * The meta object literal for the '{@link org.open.oasis.docs.odata.ns.edmx.TVersion <em>TVersion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.odata.ns.edmx.TVersion
		 * @see org.open.oasis.docs.odata.ns.edmx.impl.EdmxPackageImpl#getTVersion()
		 * @generated
		 */
		EEnum TVERSION = eINSTANCE.getTVersion();

		/**
		 * The meta object literal for the '<em>TVersion Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.open.oasis.docs.odata.ns.edmx.TVersion
		 * @see org.open.oasis.docs.odata.ns.edmx.impl.EdmxPackageImpl#getTVersionObject()
		 * @generated
		 */
		EDataType TVERSION_OBJECT = eINSTANCE.getTVersionObject();

	}

} //EdmxPackage
