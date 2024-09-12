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
package net.opengis.ows;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ows.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getAbstractMetaData <em>Abstract Meta Data</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getAccessConstraints <em>Access Constraints</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getAvailableCRS <em>Available CRS</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getBoundingBox <em>Bounding Box</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getContactInfo <em>Contact Info</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getDCP <em>DCP</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getException <em>Exception</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getExceptionReport <em>Exception Report</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getExtendedCapabilities <em>Extended Capabilities</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getFees <em>Fees</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getGetCapabilities <em>Get Capabilities</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getHTTP <em>HTTP</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getIndividualName <em>Individual Name</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getLanguage <em>Language</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getOperation <em>Operation</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getOperationsMetadata <em>Operations Metadata</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getOrganisationName <em>Organisation Name</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getOutputFormat <em>Output Format</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getPointOfContact <em>Point Of Contact</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getPositionName <em>Position Name</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getRole <em>Role</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getServiceIdentification <em>Service Identification</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getServiceProvider <em>Service Provider</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getSupportedCRS <em>Supported CRS</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.ows.DocumentRoot#getWGS84BoundingBox <em>WGS84 Bounding Box</em>}</li>
 * </ul>
 *
 * @see net.opengis.ows.OWSPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
@ProviderType
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Brief narrative description of this resource, normally used for display to a human. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(String)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_Abstract()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAbstract();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(String value);

	/**
	 * Returns the value of the '<em><b>Abstract Meta Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstract element containing more metadata about the element that includes the containing "metadata" element. A specific server implementation, or an Implementation Specification, can define concrete elements in the AbstractMetaData substitution group. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Meta Data</em>' containment reference.
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_AbstractMetaData()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractMetaData' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getAbstractMetaData();

	/**
	 * Returns the value of the '<em><b>Access Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Access constraint applied to assure the protection of privacy or intellectual property, or any other restrictions on retrieving or using data from or otherwise using this server. The reserved value NONE (case insensitive) shall be used to mean no access constraints are imposed. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Access Constraints</em>' attribute.
	 * @see #setAccessConstraints(String)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_AccessConstraints()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AccessConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccessConstraints();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getAccessConstraints <em>Access Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Constraints</em>' attribute.
	 * @see #getAccessConstraints()
	 * @generated
	 */
	void setAccessConstraints(String value);

	/**
	 * Returns the value of the '<em><b>Available CRS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available CRS</em>' attribute.
	 * @see #setAvailableCRS(String)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_AvailableCRS()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AvailableCRS' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAvailableCRS();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getAvailableCRS <em>Available CRS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available CRS</em>' attribute.
	 * @see #getAvailableCRS()
	 * @generated
	 */
	void setAvailableCRS(String value);

	/**
	 * Returns the value of the '<em><b>Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounding Box</em>' containment reference.
	 * @see #setBoundingBox(BoundingBoxType)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_BoundingBox()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BoundingBox' namespace='##targetNamespace'"
	 * @generated
	 */
	BoundingBoxType getBoundingBox();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getBoundingBox <em>Bounding Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounding Box</em>' containment reference.
	 * @see #getBoundingBox()
	 * @generated
	 */
	void setBoundingBox(BoundingBoxType value);

	/**
	 * Returns the value of the '<em><b>Contact Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Address of the responsible party. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Info</em>' containment reference.
	 * @see #setContactInfo(ContactType)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_ContactInfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContactInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactType getContactInfo();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getContactInfo <em>Contact Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Info</em>' containment reference.
	 * @see #getContactInfo()
	 * @generated
	 */
	void setContactInfo(ContactType value);

	/**
	 * Returns the value of the '<em><b>DCP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information for one distributed Computing Platform (DCP) supported for this operation. At present, only the HTTP DCP is defined, so this element only includes the HTTP element.
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DCP</em>' containment reference.
	 * @see #setDCP(DCPType)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_DCP()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DCP' namespace='##targetNamespace'"
	 * @generated
	 */
	DCPType getDCP();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getDCP <em>DCP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DCP</em>' containment reference.
	 * @see #getDCP()
	 * @generated
	 */
	void setDCP(DCPType value);

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' containment reference.
	 * @see #setException(ExceptionType)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_Exception()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Exception' namespace='##targetNamespace'"
	 * @generated
	 */
	ExceptionType getException();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getException <em>Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' containment reference.
	 * @see #getException()
	 * @generated
	 */
	void setException(ExceptionType value);

	/**
	 * Returns the value of the '<em><b>Exception Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Report message returned to the client that requested any OWS operation when the server detects an error while processing that operation request. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception Report</em>' containment reference.
	 * @see #setExceptionReport(ExceptionReportType)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_ExceptionReport()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExceptionReport' namespace='##targetNamespace'"
	 * @generated
	 */
	ExceptionReportType getExceptionReport();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getExceptionReport <em>Exception Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Report</em>' containment reference.
	 * @see #getExceptionReport()
	 * @generated
	 */
	void setExceptionReport(ExceptionReportType value);

	/**
	 * Returns the value of the '<em><b>Extended Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Individual software vendors and servers can use this element to provide metadata about any additional server abilities. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Capabilities</em>' containment reference.
	 * @see #setExtendedCapabilities(EObject)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_ExtendedCapabilities()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExtendedCapabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getExtendedCapabilities();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getExtendedCapabilities <em>Extended Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Capabilities</em>' containment reference.
	 * @see #getExtendedCapabilities()
	 * @generated
	 */
	void setExtendedCapabilities(EObject value);

	/**
	 * Returns the value of the '<em><b>Fees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fees and terms for retrieving data from or otherwise using this server, including the monetary units as specified in ISO 4217. The reserved value NONE (case insensitive) shall be used to mean no fees or terms. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fees</em>' attribute.
	 * @see #setFees(String)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_Fees()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Fees' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFees();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getFees <em>Fees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fees</em>' attribute.
	 * @see #getFees()
	 * @generated
	 */
	void setFees(String value);

	/**
	 * Returns the value of the '<em><b>Get Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Capabilities</em>' containment reference.
	 * @see #setGetCapabilities(GetCapabilitiesType)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_GetCapabilities()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GetCapabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	GetCapabilitiesType getGetCapabilities();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getGetCapabilities <em>Get Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Capabilities</em>' containment reference.
	 * @see #getGetCapabilities()
	 * @generated
	 */
	void setGetCapabilities(GetCapabilitiesType value);

	/**
	 * Returns the value of the '<em><b>HTTP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Connect point URLs for the HTTP Distributed Computing Platform (DCP). Normally, only one Get and/or one Post is included in this element. More than one Get and/or Post is allowed to support including alternative URLs for uses such as load balancing or backup. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>HTTP</em>' containment reference.
	 * @see #setHTTP(HTTPType)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_HTTP()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HTTP' namespace='##targetNamespace'"
	 * @generated
	 */
	HTTPType getHTTP();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getHTTP <em>HTTP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HTTP</em>' containment reference.
	 * @see #getHTTP()
	 * @generated
	 */
	void setHTTP(HTTPType value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier or name of this dataset. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(CodeType)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_Identifier()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getIdentifier();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(CodeType value);

	/**
	 * Returns the value of the '<em><b>Individual Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the responsible person: surname, given name, title separated by a delimiter. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Individual Name</em>' attribute.
	 * @see #setIndividualName(String)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_IndividualName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IndividualName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIndividualName();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getIndividualName <em>Individual Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual Name</em>' attribute.
	 * @see #getIndividualName()
	 * @generated
	 */
	void setIndividualName(String value);

	/**
	 * Returns the value of the '<em><b>Keywords</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywords</em>' containment reference.
	 * @see #setKeywords(KeywordsType)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_Keywords()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Keywords' namespace='##targetNamespace'"
	 * @generated
	 */
	KeywordsType getKeywords();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getKeywords <em>Keywords</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keywords</em>' containment reference.
	 * @see #getKeywords()
	 * @generated
	 */
	void setKeywords(KeywordsType value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier of a language used by the data(set) contents. This language identifier shall be as specified in IETF RFC 1766. When this element is omitted, the language used is not identified. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_Language()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Language" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Language' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(MetadataType)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_Metadata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Metadata' namespace='##targetNamespace'"
	 * @generated
	 */
	MetadataType getMetadata();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(MetadataType value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Metadata for one operation that this server implements. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(OperationType)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_Operation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Operation' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationType getOperation();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(OperationType value);

	/**
	 * Returns the value of the '<em><b>Operations Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Metadata about the operations and related abilities specified by this service and implemented by this server, including the URLs for operation requests. The basic contents of this section shall be the same for all OWS types, but individual services can add elements and/or change the optionality of optional elements. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operations Metadata</em>' containment reference.
	 * @see #setOperationsMetadata(OperationsMetadataType)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_OperationsMetadata()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OperationsMetadata' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationsMetadataType getOperationsMetadata();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getOperationsMetadata <em>Operations Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operations Metadata</em>' containment reference.
	 * @see #getOperationsMetadata()
	 * @generated
	 */
	void setOperationsMetadata(OperationsMetadataType value);

	/**
	 * Returns the value of the '<em><b>Organisation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the responsible organization. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organisation Name</em>' attribute.
	 * @see #setOrganisationName(String)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_OrganisationName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrganisationName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrganisationName();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getOrganisationName <em>Organisation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisation Name</em>' attribute.
	 * @see #getOrganisationName()
	 * @generated
	 */
	void setOrganisationName(String value);

	/**
	 * Returns the value of the '<em><b>Output Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a format in which this data can be encoded and transferred. More specific parameter names should be used by specific OWS specifications wherever applicable. More than one such parameter can be included for different purposes. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Format</em>' attribute.
	 * @see #setOutputFormat(String)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_OutputFormat()
	 * @model unique="false" dataType="net.opengis.ows.MimeType" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OutputFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOutputFormat();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getOutputFormat <em>Output Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Format</em>' attribute.
	 * @see #getOutputFormat()
	 * @generated
	 */
	void setOutputFormat(String value);

	/**
	 * Returns the value of the '<em><b>Point Of Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identification of, and means of communication with, person(s) responsible for the resource(s). 
	 * For OWS use in the ServiceProvider section of a service metadata document, the optional organizationName element was removed, since this type is always used with the ProviderName element which provides that information. The optional individualName element was made mandatory, since either the organizationName or individualName element is mandatory. The mandatory "role" element was changed to optional, since no clear use of this information is known in the ServiceProvider section. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Of Contact</em>' containment reference.
	 * @see #setPointOfContact(ResponsiblePartyType)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_PointOfContact()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PointOfContact' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponsiblePartyType getPointOfContact();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getPointOfContact <em>Point Of Contact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Of Contact</em>' containment reference.
	 * @see #getPointOfContact()
	 * @generated
	 */
	void setPointOfContact(ResponsiblePartyType value);

	/**
	 * Returns the value of the '<em><b>Position Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Role or position of the responsible person. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position Name</em>' attribute.
	 * @see #setPositionName(String)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_PositionName()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PositionName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPositionName();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getPositionName <em>Position Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Name</em>' attribute.
	 * @see #getPositionName()
	 * @generated
	 */
	void setPositionName(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Function performed by the responsible party. Possible values of this Role shall include the values and the meanings listed in Subclause B.5.5 of ISO 19115:2003. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(CodeType)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_Role()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Role' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeType getRole();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(CodeType value);

	/**
	 * Returns the value of the '<em><b>Service Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * General metadata for this specific server. This XML Schema of this section shall be the same for all OWS. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Identification</em>' containment reference.
	 * @see #setServiceIdentification(ServiceIdentificationType)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_ServiceIdentification()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceIdentificationType getServiceIdentification();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getServiceIdentification <em>Service Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Identification</em>' containment reference.
	 * @see #getServiceIdentification()
	 * @generated
	 */
	void setServiceIdentification(ServiceIdentificationType value);

	/**
	 * Returns the value of the '<em><b>Service Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Metadata about the organization that provides this specific service instance or server. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Provider</em>' containment reference.
	 * @see #setServiceProvider(ServiceProviderType)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_ServiceProvider()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ServiceProvider' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceProviderType getServiceProvider();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getServiceProvider <em>Service Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Provider</em>' containment reference.
	 * @see #getServiceProvider()
	 * @generated
	 */
	void setServiceProvider(ServiceProviderType value);

	/**
	 * Returns the value of the '<em><b>Supported CRS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Coordinate reference system in which data from this data(set) or resource is available or supported. More specific parameter names should be used by specific OWS specifications wherever applicable. More than one such parameter can be included for different purposes. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported CRS</em>' attribute.
	 * @see #setSupportedCRS(String)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_SupportedCRS()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnyURI" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SupportedCRS' namespace='##targetNamespace' affiliation='AvailableCRS'"
	 * @generated
	 */
	String getSupportedCRS();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getSupportedCRS <em>Supported CRS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported CRS</em>' attribute.
	 * @see #getSupportedCRS()
	 * @generated
	 */
	void setSupportedCRS(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Title of this resource, normally used for display to a human. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_Title()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>WGS84 Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WGS84 Bounding Box</em>' containment reference.
	 * @see #setWGS84BoundingBox(WGS84BoundingBoxType)
	 * @see net.opengis.ows.OWSPackage#getDocumentRoot_WGS84BoundingBox()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WGS84BoundingBox' namespace='##targetNamespace' affiliation='BoundingBox'"
	 * @generated
	 */
	WGS84BoundingBoxType getWGS84BoundingBox();

	/**
	 * Sets the value of the '{@link net.opengis.ows.DocumentRoot#getWGS84BoundingBox <em>WGS84 Bounding Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WGS84 Bounding Box</em>' containment reference.
	 * @see #getWGS84BoundingBox()
	 * @generated
	 */
	void setWGS84BoundingBox(WGS84BoundingBoxType value);

} // DocumentRoot
