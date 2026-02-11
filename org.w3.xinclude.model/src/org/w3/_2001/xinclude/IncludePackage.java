/*
 * Copyright (c) 2012 - 2026 Data In Motion and others.
 * All rights reserved.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.w3._2001.xinclude;


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
 *       W3C XInclude schema.
 *       See http://www.w3.org/TR/XInclude for definitive information.
 *     
 * <!-- end-model-doc -->
 * @see org.w3._2001.xinclude.IncludeFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = IncludePackage.eNS_URI, genModel = "/model/xinclude.genmodel", genModelSourceLocations = {"model/xinclude.genmodel","org.w3.xinclude.model/model/xinclude.genmodel"}, ecore="/model/xinclude.ecore", ecoreSourceLocations="/model/xinclude.ecore")
public interface IncludePackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xinclude";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.w3.org/2001/XInclude";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xinclude";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IncludePackage eINSTANCE = org.w3._2001.xinclude.impl.IncludePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.w3._2001.xinclude.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xinclude.impl.DocumentRootImpl
	 * @see org.w3._2001.xinclude.impl.IncludePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

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
	 * The feature id for the '<em><b>Fallback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FALLBACK = 3;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INCLUDE = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xinclude.impl.FallbackTypeImpl <em>Fallback Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xinclude.impl.FallbackTypeImpl
	 * @see org.w3._2001.xinclude.impl.IncludePackageImpl#getFallbackType()
	 * @generated
	 */
	int FALLBACK_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__INCLUDE = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__ANY = 3;

	/**
	 * The feature id for the '<em><b>Any1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__ANY1 = 4;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE__ANY_ATTRIBUTE = 5;

	/**
	 * The number of structural features of the '<em>Fallback Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Fallback Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALLBACK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xinclude.impl.IncludeTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xinclude.impl.IncludeTypeImpl
	 * @see org.w3._2001.xinclude.impl.IncludePackageImpl#getIncludeType()
	 * @generated
	 */
	int INCLUDE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Fallback</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__FALLBACK = 2;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__ANY = 3;

	/**
	 * The feature id for the '<em><b>Any1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__ANY1 = 4;

	/**
	 * The feature id for the '<em><b>Accept</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__ACCEPT = 5;

	/**
	 * The feature id for the '<em><b>Accept Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__ACCEPT_LANGUAGE = 6;

	/**
	 * The feature id for the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__ENCODING = 7;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__HREF = 8;

	/**
	 * The feature id for the '<em><b>Parse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__PARSE = 9;

	/**
	 * The feature id for the '<em><b>Xpointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__XPOINTER = 10;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__ANY_ATTRIBUTE = 11;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.w3._2001.xinclude.ParseType <em>Parse Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xinclude.ParseType
	 * @see org.w3._2001.xinclude.impl.IncludePackageImpl#getParseType()
	 * @generated
	 */
	int PARSE_TYPE = 3;

	/**
	 * The meta object id for the '<em>Parse Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.w3._2001.xinclude.ParseType
	 * @see org.w3._2001.xinclude.impl.IncludePackageImpl#getParseTypeObject()
	 * @generated
	 */
	int PARSE_TYPE_OBJECT = 4;


	/**
	 * Returns the meta object for class '{@link org.w3._2001.xinclude.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.w3._2001.xinclude.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xinclude.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2001.xinclude.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.w3._2001.xinclude.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.w3._2001.xinclude.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.w3._2001.xinclude.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.w3._2001.xinclude.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xinclude.DocumentRoot#getFallback <em>Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fallback</em>'.
	 * @see org.w3._2001.xinclude.DocumentRoot#getFallback()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Fallback();

	/**
	 * Returns the meta object for the containment reference '{@link org.w3._2001.xinclude.DocumentRoot#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Include</em>'.
	 * @see org.w3._2001.xinclude.DocumentRoot#getInclude()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Include();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xinclude.FallbackType <em>Fallback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fallback Type</em>'.
	 * @see org.w3._2001.xinclude.FallbackType
	 * @generated
	 */
	EClass getFallbackType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xinclude.FallbackType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2001.xinclude.FallbackType#getMixed()
	 * @see #getFallbackType()
	 * @generated
	 */
	EAttribute getFallbackType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xinclude.FallbackType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3._2001.xinclude.FallbackType#getGroup()
	 * @see #getFallbackType()
	 * @generated
	 */
	EAttribute getFallbackType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xinclude.FallbackType#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see org.w3._2001.xinclude.FallbackType#getInclude()
	 * @see #getFallbackType()
	 * @generated
	 */
	EReference getFallbackType_Include();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xinclude.FallbackType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2001.xinclude.FallbackType#getAny()
	 * @see #getFallbackType()
	 * @generated
	 */
	EAttribute getFallbackType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xinclude.FallbackType#getAny1 <em>Any1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any1</em>'.
	 * @see org.w3._2001.xinclude.FallbackType#getAny1()
	 * @see #getFallbackType()
	 * @generated
	 */
	EAttribute getFallbackType_Any1();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xinclude.FallbackType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2001.xinclude.FallbackType#getAnyAttribute()
	 * @see #getFallbackType()
	 * @generated
	 */
	EAttribute getFallbackType_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.w3._2001.xinclude.IncludeType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.w3._2001.xinclude.IncludeType
	 * @generated
	 */
	EClass getIncludeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xinclude.IncludeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.w3._2001.xinclude.IncludeType#getMixed()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xinclude.IncludeType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.w3._2001.xinclude.IncludeType#getGroup()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.w3._2001.xinclude.IncludeType#getFallback <em>Fallback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fallback</em>'.
	 * @see org.w3._2001.xinclude.IncludeType#getFallback()
	 * @see #getIncludeType()
	 * @generated
	 */
	EReference getIncludeType_Fallback();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xinclude.IncludeType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.w3._2001.xinclude.IncludeType#getAny()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xinclude.IncludeType#getAny1 <em>Any1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any1</em>'.
	 * @see org.w3._2001.xinclude.IncludeType#getAny1()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_Any1();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xinclude.IncludeType#getAccept <em>Accept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accept</em>'.
	 * @see org.w3._2001.xinclude.IncludeType#getAccept()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_Accept();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xinclude.IncludeType#getAcceptLanguage <em>Accept Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accept Language</em>'.
	 * @see org.w3._2001.xinclude.IncludeType#getAcceptLanguage()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_AcceptLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xinclude.IncludeType#getEncoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding</em>'.
	 * @see org.w3._2001.xinclude.IncludeType#getEncoding()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_Encoding();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xinclude.IncludeType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.w3._2001.xinclude.IncludeType#getHref()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xinclude.IncludeType#getParse <em>Parse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parse</em>'.
	 * @see org.w3._2001.xinclude.IncludeType#getParse()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_Parse();

	/**
	 * Returns the meta object for the attribute '{@link org.w3._2001.xinclude.IncludeType#getXpointer <em>Xpointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpointer</em>'.
	 * @see org.w3._2001.xinclude.IncludeType#getXpointer()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_Xpointer();

	/**
	 * Returns the meta object for the attribute list '{@link org.w3._2001.xinclude.IncludeType#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.w3._2001.xinclude.IncludeType#getAnyAttribute()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_AnyAttribute();

	/**
	 * Returns the meta object for enum '{@link org.w3._2001.xinclude.ParseType <em>Parse Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parse Type</em>'.
	 * @see org.w3._2001.xinclude.ParseType
	 * @generated
	 */
	EEnum getParseType();

	/**
	 * Returns the meta object for data type '{@link org.w3._2001.xinclude.ParseType <em>Parse Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Parse Type Object</em>'.
	 * @see org.w3._2001.xinclude.ParseType
	 * @model instanceClass="org.w3._2001.xinclude.ParseType"
	 *        extendedMetaData="name='parseType:Object' baseType='parseType'"
	 * @generated
	 */
	EDataType getParseTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IncludeFactory getIncludeFactory();

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
		 * The meta object literal for the '{@link org.w3._2001.xinclude.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xinclude.impl.DocumentRootImpl
		 * @see org.w3._2001.xinclude.impl.IncludePackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Fallback</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FALLBACK = eINSTANCE.getDocumentRoot_Fallback();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INCLUDE = eINSTANCE.getDocumentRoot_Include();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xinclude.impl.FallbackTypeImpl <em>Fallback Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xinclude.impl.FallbackTypeImpl
		 * @see org.w3._2001.xinclude.impl.IncludePackageImpl#getFallbackType()
		 * @generated
		 */
		EClass FALLBACK_TYPE = eINSTANCE.getFallbackType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FALLBACK_TYPE__MIXED = eINSTANCE.getFallbackType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FALLBACK_TYPE__GROUP = eINSTANCE.getFallbackType_Group();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FALLBACK_TYPE__INCLUDE = eINSTANCE.getFallbackType_Include();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FALLBACK_TYPE__ANY = eINSTANCE.getFallbackType_Any();

		/**
		 * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FALLBACK_TYPE__ANY1 = eINSTANCE.getFallbackType_Any1();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FALLBACK_TYPE__ANY_ATTRIBUTE = eINSTANCE.getFallbackType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xinclude.impl.IncludeTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xinclude.impl.IncludeTypeImpl
		 * @see org.w3._2001.xinclude.impl.IncludePackageImpl#getIncludeType()
		 * @generated
		 */
		EClass INCLUDE_TYPE = eINSTANCE.getIncludeType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_TYPE__MIXED = eINSTANCE.getIncludeType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_TYPE__GROUP = eINSTANCE.getIncludeType_Group();

		/**
		 * The meta object literal for the '<em><b>Fallback</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCLUDE_TYPE__FALLBACK = eINSTANCE.getIncludeType_Fallback();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_TYPE__ANY = eINSTANCE.getIncludeType_Any();

		/**
		 * The meta object literal for the '<em><b>Any1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_TYPE__ANY1 = eINSTANCE.getIncludeType_Any1();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_TYPE__ACCEPT = eINSTANCE.getIncludeType_Accept();

		/**
		 * The meta object literal for the '<em><b>Accept Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_TYPE__ACCEPT_LANGUAGE = eINSTANCE.getIncludeType_AcceptLanguage();

		/**
		 * The meta object literal for the '<em><b>Encoding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_TYPE__ENCODING = eINSTANCE.getIncludeType_Encoding();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_TYPE__HREF = eINSTANCE.getIncludeType_Href();

		/**
		 * The meta object literal for the '<em><b>Parse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_TYPE__PARSE = eINSTANCE.getIncludeType_Parse();

		/**
		 * The meta object literal for the '<em><b>Xpointer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_TYPE__XPOINTER = eINSTANCE.getIncludeType_Xpointer();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_TYPE__ANY_ATTRIBUTE = eINSTANCE.getIncludeType_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.w3._2001.xinclude.ParseType <em>Parse Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xinclude.ParseType
		 * @see org.w3._2001.xinclude.impl.IncludePackageImpl#getParseType()
		 * @generated
		 */
		EEnum PARSE_TYPE = eINSTANCE.getParseType();

		/**
		 * The meta object literal for the '<em>Parse Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.w3._2001.xinclude.ParseType
		 * @see org.w3._2001.xinclude.impl.IncludePackageImpl#getParseTypeObject()
		 * @generated
		 */
		EDataType PARSE_TYPE_OBJECT = eINSTANCE.getParseTypeObject();

	}

} //IncludePackage
