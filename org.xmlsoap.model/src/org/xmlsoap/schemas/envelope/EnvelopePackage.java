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
package org.xmlsoap.schemas.envelope;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.xmlsoap.schemas.envelope.EnvelopeFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = EnvelopePackage.eNS_URI, genModel = "/model/soap-envelope.genmodel", genModelSourceLocations = {"model/soap-envelope.genmodel","org.xmlsoap.model/model/soap-envelope.genmodel"}, ecore="/model/soap-envelope.ecore", ecoreSourceLocations="/model/soap-envelope.ecore")
public interface EnvelopePackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "envelope";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.xmlsoap.org/soap/envelope/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "envelope";

	/**
	 * The package content type ID.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eCONTENT_TYPE = "soap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnvelopePackage eINSTANCE = org.xmlsoap.schemas.envelope.impl.EnvelopePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.xmlsoap.schemas.envelope.impl.BodyImpl <em>Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmlsoap.schemas.envelope.impl.BodyImpl
	 * @see org.xmlsoap.schemas.envelope.impl.EnvelopePackageImpl#getBody()
	 * @generated
	 */
	int BODY = 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__ANY = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xmlsoap.schemas.envelope.impl.DetailImpl <em>Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmlsoap.schemas.envelope.impl.DetailImpl
	 * @see org.xmlsoap.schemas.envelope.impl.EnvelopePackageImpl#getDetail()
	 * @generated
	 */
	int DETAIL = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL__ANY = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAIL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xmlsoap.schemas.envelope.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmlsoap.schemas.envelope.impl.DocumentRootImpl
	 * @see org.xmlsoap.schemas.envelope.impl.EnvelopePackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

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
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BODY = 3;

	/**
	 * The feature id for the '<em><b>Envelope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENVELOPE = 4;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FAULT = 5;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HEADER = 6;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACTOR = 7;

	/**
	 * The feature id for the '<em><b>Encoding Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENCODING_STYLE = 8;

	/**
	 * The feature id for the '<em><b>Must Understand</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUST_UNDERSTAND = 9;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xmlsoap.schemas.envelope.impl.EnvelopeImpl <em>Envelope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmlsoap.schemas.envelope.impl.EnvelopeImpl
	 * @see org.xmlsoap.schemas.envelope.impl.EnvelopePackageImpl#getEnvelope()
	 * @generated
	 */
	int ENVELOPE = 3;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVELOPE__HEADER = 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVELOPE__BODY = 1;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVELOPE__ANY = 2;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVELOPE__ANY_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Envelope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVELOPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Envelope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVELOPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xmlsoap.schemas.envelope.impl.FaultImpl <em>Fault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmlsoap.schemas.envelope.impl.FaultImpl
	 * @see org.xmlsoap.schemas.envelope.impl.EnvelopePackageImpl#getFault()
	 * @generated
	 */
	int FAULT = 4;

	/**
	 * The feature id for the '<em><b>Faultcode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT__FAULTCODE = 0;

	/**
	 * The feature id for the '<em><b>Faultstring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT__FAULTSTRING = 1;

	/**
	 * The feature id for the '<em><b>Faultactor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT__FAULTACTOR = 2;

	/**
	 * The feature id for the '<em><b>Detail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT__DETAIL = 3;

	/**
	 * The number of structural features of the '<em>Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.xmlsoap.schemas.envelope.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmlsoap.schemas.envelope.impl.HeaderImpl
	 * @see org.xmlsoap.schemas.envelope.impl.EnvelopePackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 5;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__ANY = 0;

	/**
	 * The feature id for the '<em><b>Any Attribute</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__ANY_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Encoding Style</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.xmlsoap.schemas.envelope.impl.EnvelopePackageImpl#getEncodingStyle()
	 * @generated
	 */
	int ENCODING_STYLE = 6;

	/**
	 * The meta object id for the '<em>Must Understand Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xmlsoap.schemas.envelope.impl.EnvelopePackageImpl#getMustUnderstandType()
	 * @generated
	 */
	int MUST_UNDERSTAND_TYPE = 7;

	/**
	 * The meta object id for the '<em>Must Understand Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see org.xmlsoap.schemas.envelope.impl.EnvelopePackageImpl#getMustUnderstandTypeObject()
	 * @generated
	 */
	int MUST_UNDERSTAND_TYPE_OBJECT = 8;


	/**
	 * Returns the meta object for class '{@link org.xmlsoap.schemas.envelope.Body <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body</em>'.
	 * @see org.xmlsoap.schemas.envelope.Body
	 * @generated
	 */
	EClass getBody();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.envelope.Body#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.xmlsoap.schemas.envelope.Body#getAny()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.envelope.Body#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.xmlsoap.schemas.envelope.Body#getAnyAttribute()
	 * @see #getBody()
	 * @generated
	 */
	EAttribute getBody_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.xmlsoap.schemas.envelope.Detail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detail</em>'.
	 * @see org.xmlsoap.schemas.envelope.Detail
	 * @generated
	 */
	EClass getDetail();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.envelope.Detail#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.xmlsoap.schemas.envelope.Detail#getAny()
	 * @see #getDetail()
	 * @generated
	 */
	EAttribute getDetail_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.envelope.Detail#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.xmlsoap.schemas.envelope.Detail#getAnyAttribute()
	 * @see #getDetail()
	 * @generated
	 */
	EAttribute getDetail_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.xmlsoap.schemas.envelope.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.xmlsoap.schemas.envelope.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.envelope.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.xmlsoap.schemas.envelope.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.xmlsoap.schemas.envelope.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.xmlsoap.schemas.envelope.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.xmlsoap.schemas.envelope.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.xmlsoap.schemas.envelope.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.envelope.DocumentRoot#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.xmlsoap.schemas.envelope.DocumentRoot#getBody()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.envelope.DocumentRoot#getEnvelope <em>Envelope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Envelope</em>'.
	 * @see org.xmlsoap.schemas.envelope.DocumentRoot#getEnvelope()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Envelope();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.envelope.DocumentRoot#getFault <em>Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault</em>'.
	 * @see org.xmlsoap.schemas.envelope.DocumentRoot#getFault()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Fault();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.envelope.DocumentRoot#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.xmlsoap.schemas.envelope.DocumentRoot#getHeader()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Header();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.envelope.DocumentRoot#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actor</em>'.
	 * @see org.xmlsoap.schemas.envelope.DocumentRoot#getActor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Actor();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.envelope.DocumentRoot#getEncodingStyle <em>Encoding Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encoding Style</em>'.
	 * @see org.xmlsoap.schemas.envelope.DocumentRoot#getEncodingStyle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_EncodingStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.envelope.DocumentRoot#isMustUnderstand <em>Must Understand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Understand</em>'.
	 * @see org.xmlsoap.schemas.envelope.DocumentRoot#isMustUnderstand()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_MustUnderstand();

	/**
	 * Returns the meta object for class '{@link org.xmlsoap.schemas.envelope.Envelope <em>Envelope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Envelope</em>'.
	 * @see org.xmlsoap.schemas.envelope.Envelope
	 * @generated
	 */
	EClass getEnvelope();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.envelope.Envelope#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see org.xmlsoap.schemas.envelope.Envelope#getHeader()
	 * @see #getEnvelope()
	 * @generated
	 */
	EReference getEnvelope_Header();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.envelope.Envelope#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.xmlsoap.schemas.envelope.Envelope#getBody()
	 * @see #getEnvelope()
	 * @generated
	 */
	EReference getEnvelope_Body();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.envelope.Envelope#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.xmlsoap.schemas.envelope.Envelope#getAny()
	 * @see #getEnvelope()
	 * @generated
	 */
	EAttribute getEnvelope_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.envelope.Envelope#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.xmlsoap.schemas.envelope.Envelope#getAnyAttribute()
	 * @see #getEnvelope()
	 * @generated
	 */
	EAttribute getEnvelope_AnyAttribute();

	/**
	 * Returns the meta object for class '{@link org.xmlsoap.schemas.envelope.Fault <em>Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fault</em>'.
	 * @see org.xmlsoap.schemas.envelope.Fault
	 * @generated
	 */
	EClass getFault();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.envelope.Fault#getFaultcode <em>Faultcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Faultcode</em>'.
	 * @see org.xmlsoap.schemas.envelope.Fault#getFaultcode()
	 * @see #getFault()
	 * @generated
	 */
	EAttribute getFault_Faultcode();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.envelope.Fault#getFaultstring <em>Faultstring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Faultstring</em>'.
	 * @see org.xmlsoap.schemas.envelope.Fault#getFaultstring()
	 * @see #getFault()
	 * @generated
	 */
	EAttribute getFault_Faultstring();

	/**
	 * Returns the meta object for the attribute '{@link org.xmlsoap.schemas.envelope.Fault#getFaultactor <em>Faultactor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Faultactor</em>'.
	 * @see org.xmlsoap.schemas.envelope.Fault#getFaultactor()
	 * @see #getFault()
	 * @generated
	 */
	EAttribute getFault_Faultactor();

	/**
	 * Returns the meta object for the containment reference '{@link org.xmlsoap.schemas.envelope.Fault#getDetail <em>Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Detail</em>'.
	 * @see org.xmlsoap.schemas.envelope.Fault#getDetail()
	 * @see #getFault()
	 * @generated
	 */
	EReference getFault_Detail();

	/**
	 * Returns the meta object for class '{@link org.xmlsoap.schemas.envelope.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see org.xmlsoap.schemas.envelope.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.envelope.Header#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see org.xmlsoap.schemas.envelope.Header#getAny()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Any();

	/**
	 * Returns the meta object for the attribute list '{@link org.xmlsoap.schemas.envelope.Header#getAnyAttribute <em>Any Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any Attribute</em>'.
	 * @see org.xmlsoap.schemas.envelope.Header#getAnyAttribute()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_AnyAttribute();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Encoding Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * 	    'encodingStyle' indicates any canonicalization conventions followed in the contents of the containing element.  For example, the value 'http://schemas.xmlsoap.org/soap/encoding/' indicates the pattern described in SOAP specification
     * 	  
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Encoding Style</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='encodingStyle' itemType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getEncodingStyle();

	/**
	 * Returns the meta object for data type '<em>Must Understand Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Must Understand Type</em>'.
	 * @model instanceClass="boolean"
	 *        extendedMetaData="name='mustUnderstand_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#boolean' pattern='0|1'"
	 * @generated
	 */
	EDataType getMustUnderstandType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Must Understand Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Must Understand Type Object</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 *        extendedMetaData="name='mustUnderstand_._type:Object' baseType='mustUnderstand_._type'"
	 * @generated
	 */
	EDataType getMustUnderstandTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnvelopeFactory getEnvelopeFactory();

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
		 * The meta object literal for the '{@link org.xmlsoap.schemas.envelope.impl.BodyImpl <em>Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmlsoap.schemas.envelope.impl.BodyImpl
		 * @see org.xmlsoap.schemas.envelope.impl.EnvelopePackageImpl#getBody()
		 * @generated
		 */
		EClass BODY = eINSTANCE.getBody();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__ANY = eINSTANCE.getBody_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY__ANY_ATTRIBUTE = eINSTANCE.getBody_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.xmlsoap.schemas.envelope.impl.DetailImpl <em>Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmlsoap.schemas.envelope.impl.DetailImpl
		 * @see org.xmlsoap.schemas.envelope.impl.EnvelopePackageImpl#getDetail()
		 * @generated
		 */
		EClass DETAIL = eINSTANCE.getDetail();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAIL__ANY = eINSTANCE.getDetail_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAIL__ANY_ATTRIBUTE = eINSTANCE.getDetail_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.xmlsoap.schemas.envelope.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmlsoap.schemas.envelope.impl.DocumentRootImpl
		 * @see org.xmlsoap.schemas.envelope.impl.EnvelopePackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BODY = eINSTANCE.getDocumentRoot_Body();

		/**
		 * The meta object literal for the '<em><b>Envelope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENVELOPE = eINSTANCE.getDocumentRoot_Envelope();

		/**
		 * The meta object literal for the '<em><b>Fault</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FAULT = eINSTANCE.getDocumentRoot_Fault();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HEADER = eINSTANCE.getDocumentRoot_Header();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ACTOR = eINSTANCE.getDocumentRoot_Actor();

		/**
		 * The meta object literal for the '<em><b>Encoding Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ENCODING_STYLE = eINSTANCE.getDocumentRoot_EncodingStyle();

		/**
		 * The meta object literal for the '<em><b>Must Understand</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MUST_UNDERSTAND = eINSTANCE.getDocumentRoot_MustUnderstand();

		/**
		 * The meta object literal for the '{@link org.xmlsoap.schemas.envelope.impl.EnvelopeImpl <em>Envelope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmlsoap.schemas.envelope.impl.EnvelopeImpl
		 * @see org.xmlsoap.schemas.envelope.impl.EnvelopePackageImpl#getEnvelope()
		 * @generated
		 */
		EClass ENVELOPE = eINSTANCE.getEnvelope();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVELOPE__HEADER = eINSTANCE.getEnvelope_Header();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVELOPE__BODY = eINSTANCE.getEnvelope_Body();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVELOPE__ANY = eINSTANCE.getEnvelope_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVELOPE__ANY_ATTRIBUTE = eINSTANCE.getEnvelope_AnyAttribute();

		/**
		 * The meta object literal for the '{@link org.xmlsoap.schemas.envelope.impl.FaultImpl <em>Fault</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmlsoap.schemas.envelope.impl.FaultImpl
		 * @see org.xmlsoap.schemas.envelope.impl.EnvelopePackageImpl#getFault()
		 * @generated
		 */
		EClass FAULT = eINSTANCE.getFault();

		/**
		 * The meta object literal for the '<em><b>Faultcode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT__FAULTCODE = eINSTANCE.getFault_Faultcode();

		/**
		 * The meta object literal for the '<em><b>Faultstring</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT__FAULTSTRING = eINSTANCE.getFault_Faultstring();

		/**
		 * The meta object literal for the '<em><b>Faultactor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAULT__FAULTACTOR = eINSTANCE.getFault_Faultactor();

		/**
		 * The meta object literal for the '<em><b>Detail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAULT__DETAIL = eINSTANCE.getFault_Detail();

		/**
		 * The meta object literal for the '{@link org.xmlsoap.schemas.envelope.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmlsoap.schemas.envelope.impl.HeaderImpl
		 * @see org.xmlsoap.schemas.envelope.impl.EnvelopePackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__ANY = eINSTANCE.getHeader_Any();

		/**
		 * The meta object literal for the '<em><b>Any Attribute</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__ANY_ATTRIBUTE = eINSTANCE.getHeader_AnyAttribute();

		/**
		 * The meta object literal for the '<em>Encoding Style</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.xmlsoap.schemas.envelope.impl.EnvelopePackageImpl#getEncodingStyle()
		 * @generated
		 */
		EDataType ENCODING_STYLE = eINSTANCE.getEncodingStyle();

		/**
		 * The meta object literal for the '<em>Must Understand Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xmlsoap.schemas.envelope.impl.EnvelopePackageImpl#getMustUnderstandType()
		 * @generated
		 */
		EDataType MUST_UNDERSTAND_TYPE = eINSTANCE.getMustUnderstandType();

		/**
		 * The meta object literal for the '<em>Must Understand Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see org.xmlsoap.schemas.envelope.impl.EnvelopePackageImpl#getMustUnderstandTypeObject()
		 * @generated
		 */
		EDataType MUST_UNDERSTAND_TYPE_OBJECT = eINSTANCE.getMustUnderstandTypeObject();

	}

} //EnvelopePackage
