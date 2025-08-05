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
package net.opengis.wms;

import java.math.BigInteger;

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
 *   <li>{@link net.opengis.wms.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getExtendedCapabilities <em>Extended Capabilities</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getExtendedOperation <em>Extended Operation</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getAccessConstraints <em>Access Constraints</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getAddress <em>Address</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getAddressType <em>Address Type</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getAttribution <em>Attribution</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getAuthorityURL <em>Authority URL</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getBoundingBox <em>Bounding Box</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getCapability <em>Capability</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getCity <em>City</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getContactAddress <em>Contact Address</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getContactElectronicMailAddress <em>Contact Electronic Mail Address</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getContactFacsimileTelephone <em>Contact Facsimile Telephone</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getContactInformation <em>Contact Information</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getContactOrganization <em>Contact Organization</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getContactPerson <em>Contact Person</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getContactPersonPrimary <em>Contact Person Primary</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getContactPosition <em>Contact Position</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getContactVoiceTelephone <em>Contact Voice Telephone</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getCountry <em>Country</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getCRS <em>CRS</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getDataURL <em>Data URL</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getDCPType <em>DCP Type</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getDimension <em>Dimension</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getEXGeographicBoundingBox <em>EX Geographic Bounding Box</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getException <em>Exception</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getFeatureListURL <em>Feature List URL</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getFees <em>Fees</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getFormat <em>Format</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getGet <em>Get</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getGetCapabilities <em>Get Capabilities</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getGetFeatureInfo <em>Get Feature Info</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getGetMap <em>Get Map</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getHTTP <em>HTTP</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getKeywordList <em>Keyword List</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getLayer <em>Layer</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getLayerLimit <em>Layer Limit</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getLegendURL <em>Legend URL</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getLogoURL <em>Logo URL</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getMaxHeight <em>Max Height</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getMaxScaleDenominator <em>Max Scale Denominator</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getMaxWidth <em>Max Width</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getMetadataURL <em>Metadata URL</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getMinScaleDenominator <em>Min Scale Denominator</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getOnlineResource <em>Online Resource</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getPost <em>Post</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getPostCode <em>Post Code</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getRequest <em>Request</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getService <em>Service</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getStateOrProvince <em>State Or Province</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getStyle <em>Style</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getStyleSheetURL <em>Style Sheet URL</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getStyleURL <em>Style URL</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.wms.DocumentRoot#getWMSCapabilities <em>WMS Capabilities</em>}</li>
 * </ul>
 *
 * @see net.opengis.wms.WMSPackage#getDocumentRoot()
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
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_Mixed()
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
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Extended Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Individual service providers may use this element to report extended
	 *         capabilities.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Capabilities</em>' containment reference.
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_ExtendedCapabilities()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_ExtendedCapabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getExtendedCapabilities();

	/**
	 * Returns the value of the '<em><b>Extended Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extended Operation</em>' containment reference.
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_ExtendedOperation()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='_ExtendedOperation' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationType getExtendedOperation();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The abstract is a longer narrative description of an object.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(String)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_Abstract()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAbstract();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(String value);

	/**
	 * Returns the value of the '<em><b>Access Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Constraints</em>' attribute.
	 * @see #setAccessConstraints(String)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_AccessConstraints()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AccessConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAccessConstraints();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getAccessConstraints <em>Access Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Constraints</em>' attribute.
	 * @see #getAccessConstraints()
	 * @generated
	 */
	void setAccessConstraints(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_Address()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Address' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Address Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Type</em>' attribute.
	 * @see #setAddressType(String)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_AddressType()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AddressType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAddressType();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getAddressType <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Type</em>' attribute.
	 * @see #getAddressType()
	 * @generated
	 */
	void setAddressType(String value);

	/**
	 * Returns the value of the '<em><b>Attribution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Attribution indicates the provider of a Layer or collection of Layers.
	 *         The provider's URL, descriptive title string, and/or logo image URL
	 *         may be supplied.  Client applications may choose to display one or
	 *         more of these items.  A format element indicates the MIME type of
	 *         the logo image located at LogoURL.  The logo image's width and height
	 *         assist client applications in laying out space to display the logo.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribution</em>' containment reference.
	 * @see #setAttribution(AttributionType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_Attribution()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Attribution' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributionType getAttribution();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getAttribution <em>Attribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribution</em>' containment reference.
	 * @see #getAttribution()
	 * @generated
	 */
	void setAttribution(AttributionType value);

	/**
	 * Returns the value of the '<em><b>Authority URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A Map Server may use zero or more Identifier elements to list ID
	 *         numbers or labels defined by a particular Authority.  For example,
	 *         the Global Change Master Directory (gcmd.gsfc.nasa.gov) defines a
	 *         DIF_ID label for every dataset.  The authority name and explanatory
	 *         URL are defined in a separate AuthorityURL element, which may be
	 *         defined once and inherited by subsidiary layers.  Identifiers
	 *         themselves are not inherited.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authority URL</em>' containment reference.
	 * @see #setAuthorityURL(AuthorityURLType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_AuthorityURL()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AuthorityURL' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthorityURLType getAuthorityURL();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getAuthorityURL <em>Authority URL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authority URL</em>' containment reference.
	 * @see #getAuthorityURL()
	 * @generated
	 */
	void setAuthorityURL(AuthorityURLType value);

	/**
	 * Returns the value of the '<em><b>Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The BoundingBox attributes indicate the limits of the bounding box
	 *         in units of the specified coordinate reference system.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bounding Box</em>' containment reference.
	 * @see #setBoundingBox(BoundingBoxType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_BoundingBox()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BoundingBox' namespace='##targetNamespace'"
	 * @generated
	 */
	BoundingBoxType getBoundingBox();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getBoundingBox <em>Bounding Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounding Box</em>' containment reference.
	 * @see #getBoundingBox()
	 * @generated
	 */
	void setBoundingBox(BoundingBoxType value);

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A Capability lists available request types, how exceptions may be
	 *         reported, and whether any extended capabilities are defined.
	 *         It also includes an optional list of map layers available from this
	 *         server.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability</em>' containment reference.
	 * @see #setCapability(CapabilityType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_Capability()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Capability' namespace='##targetNamespace'"
	 * @generated
	 */
	CapabilityType getCapability();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getCapability <em>Capability</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capability</em>' containment reference.
	 * @see #getCapability()
	 * @generated
	 */
	void setCapability(CapabilityType value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_City()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='City' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Contact Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Address</em>' containment reference.
	 * @see #setContactAddress(ContactAddressType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_ContactAddress()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContactAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactAddressType getContactAddress();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getContactAddress <em>Contact Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Address</em>' containment reference.
	 * @see #getContactAddress()
	 * @generated
	 */
	void setContactAddress(ContactAddressType value);

	/**
	 * Returns the value of the '<em><b>Contact Electronic Mail Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Electronic Mail Address</em>' attribute.
	 * @see #setContactElectronicMailAddress(String)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_ContactElectronicMailAddress()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContactElectronicMailAddress' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContactElectronicMailAddress();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getContactElectronicMailAddress <em>Contact Electronic Mail Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Electronic Mail Address</em>' attribute.
	 * @see #getContactElectronicMailAddress()
	 * @generated
	 */
	void setContactElectronicMailAddress(String value);

	/**
	 * Returns the value of the '<em><b>Contact Facsimile Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Facsimile Telephone</em>' attribute.
	 * @see #setContactFacsimileTelephone(String)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_ContactFacsimileTelephone()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContactFacsimileTelephone' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContactFacsimileTelephone();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getContactFacsimileTelephone <em>Contact Facsimile Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Facsimile Telephone</em>' attribute.
	 * @see #getContactFacsimileTelephone()
	 * @generated
	 */
	void setContactFacsimileTelephone(String value);

	/**
	 * Returns the value of the '<em><b>Contact Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Information about a contact person for the service.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contact Information</em>' containment reference.
	 * @see #setContactInformation(ContactInformationType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_ContactInformation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContactInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactInformationType getContactInformation();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getContactInformation <em>Contact Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Information</em>' containment reference.
	 * @see #getContactInformation()
	 * @generated
	 */
	void setContactInformation(ContactInformationType value);

	/**
	 * Returns the value of the '<em><b>Contact Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Organization</em>' attribute.
	 * @see #setContactOrganization(String)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_ContactOrganization()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContactOrganization' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContactOrganization();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getContactOrganization <em>Contact Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Organization</em>' attribute.
	 * @see #getContactOrganization()
	 * @generated
	 */
	void setContactOrganization(String value);

	/**
	 * Returns the value of the '<em><b>Contact Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Person</em>' attribute.
	 * @see #setContactPerson(String)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_ContactPerson()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContactPerson' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContactPerson();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getContactPerson <em>Contact Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Person</em>' attribute.
	 * @see #getContactPerson()
	 * @generated
	 */
	void setContactPerson(String value);

	/**
	 * Returns the value of the '<em><b>Contact Person Primary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Person Primary</em>' containment reference.
	 * @see #setContactPersonPrimary(ContactPersonPrimaryType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_ContactPersonPrimary()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContactPersonPrimary' namespace='##targetNamespace'"
	 * @generated
	 */
	ContactPersonPrimaryType getContactPersonPrimary();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getContactPersonPrimary <em>Contact Person Primary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Person Primary</em>' containment reference.
	 * @see #getContactPersonPrimary()
	 * @generated
	 */
	void setContactPersonPrimary(ContactPersonPrimaryType value);

	/**
	 * Returns the value of the '<em><b>Contact Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Position</em>' attribute.
	 * @see #setContactPosition(String)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_ContactPosition()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContactPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContactPosition();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getContactPosition <em>Contact Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Position</em>' attribute.
	 * @see #getContactPosition()
	 * @generated
	 */
	void setContactPosition(String value);

	/**
	 * Returns the value of the '<em><b>Contact Voice Telephone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Voice Telephone</em>' attribute.
	 * @see #setContactVoiceTelephone(String)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_ContactVoiceTelephone()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ContactVoiceTelephone' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContactVoiceTelephone();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getContactVoiceTelephone <em>Contact Voice Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact Voice Telephone</em>' attribute.
	 * @see #getContactVoiceTelephone()
	 * @generated
	 */
	void setContactVoiceTelephone(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_Country()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Country' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>CRS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Identifier for a single Coordinate Reference System (CRS).
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CRS</em>' attribute.
	 * @see #setCRS(String)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_CRS()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CRS' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCRS();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getCRS <em>CRS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CRS</em>' attribute.
	 * @see #getCRS()
	 * @generated
	 */
	void setCRS(String value);

	/**
	 * Returns the value of the '<em><b>Data URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A Map Server may use DataURL offer a link to the underlying data represented
	 *         by a particular layer.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data URL</em>' containment reference.
	 * @see #setDataURL(DataURLType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_DataURL()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataURL' namespace='##targetNamespace'"
	 * @generated
	 */
	DataURLType getDataURL();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getDataURL <em>Data URL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data URL</em>' containment reference.
	 * @see #getDataURL()
	 * @generated
	 */
	void setDataURL(DataURLType value);

	/**
	 * Returns the value of the '<em><b>DCP Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Available Distributed Computing Platforms (DCPs) are listed here.
	 *         At present, only HTTP is defined.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DCP Type</em>' containment reference.
	 * @see #setDCPType(DCPTypeType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_DCPType()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DCPType' namespace='##targetNamespace'"
	 * @generated
	 */
	DCPTypeType getDCPType();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getDCPType <em>DCP Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DCP Type</em>' containment reference.
	 * @see #getDCPType()
	 * @generated
	 */
	void setDCPType(DCPTypeType value);

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The Dimension element declares the existence of a dimension and indicates what
	 *         values along a dimension are valid.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dimension</em>' containment reference.
	 * @see #setDimension(DimensionType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_Dimension()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Dimension' namespace='##targetNamespace'"
	 * @generated
	 */
	DimensionType getDimension();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getDimension <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' containment reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(DimensionType value);

	/**
	 * Returns the value of the '<em><b>EX Geographic Bounding Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The EX_GeographicBoundingBox attributes indicate the limits of the enclosing
	 *         rectangle in longitude and latitude decimal degrees.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EX Geographic Bounding Box</em>' containment reference.
	 * @see #setEXGeographicBoundingBox(EXGeographicBoundingBoxType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_EXGeographicBoundingBox()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EX_GeographicBoundingBox' namespace='##targetNamespace'"
	 * @generated
	 */
	EXGeographicBoundingBoxType getEXGeographicBoundingBox();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getEXGeographicBoundingBox <em>EX Geographic Bounding Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EX Geographic Bounding Box</em>' containment reference.
	 * @see #getEXGeographicBoundingBox()
	 * @generated
	 */
	void setEXGeographicBoundingBox(EXGeographicBoundingBoxType value);

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         An Exception element indicates which error-reporting formats are
	 *         supported.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception</em>' containment reference.
	 * @see #setException(ExceptionType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_Exception()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Exception' namespace='##targetNamespace'"
	 * @generated
	 */
	ExceptionType getException();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getException <em>Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' containment reference.
	 * @see #getException()
	 * @generated
	 */
	void setException(ExceptionType value);

	/**
	 * Returns the value of the '<em><b>Feature List URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A Map Server may use FeatureListURL to point to a list of the
	 *         features represented in a Layer.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature List URL</em>' containment reference.
	 * @see #setFeatureListURL(FeatureListURLType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_FeatureListURL()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FeatureListURL' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureListURLType getFeatureListURL();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getFeatureListURL <em>Feature List URL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature List URL</em>' containment reference.
	 * @see #getFeatureListURL()
	 * @generated
	 */
	void setFeatureListURL(FeatureListURLType value);

	/**
	 * Returns the value of the '<em><b>Fees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fees</em>' attribute.
	 * @see #setFees(String)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_Fees()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Fees' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFees();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getFees <em>Fees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fees</em>' attribute.
	 * @see #getFees()
	 * @generated
	 */
	void setFees(String value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A container for listing an available format's MIME type.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_Format()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Format' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Get</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The URL prefix for the HTTP "Get" request method.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Get</em>' containment reference.
	 * @see #setGet(GetType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_Get()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Get' namespace='##targetNamespace'"
	 * @generated
	 */
	GetType getGet();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getGet <em>Get</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get</em>' containment reference.
	 * @see #getGet()
	 * @generated
	 */
	void setGet(GetType value);

	/**
	 * Returns the value of the '<em><b>Get Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Capabilities</em>' containment reference.
	 * @see #setGetCapabilities(OperationType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_GetCapabilities()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GetCapabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationType getGetCapabilities();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getGetCapabilities <em>Get Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Capabilities</em>' containment reference.
	 * @see #getGetCapabilities()
	 * @generated
	 */
	void setGetCapabilities(OperationType value);

	/**
	 * Returns the value of the '<em><b>Get Feature Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Feature Info</em>' containment reference.
	 * @see #setGetFeatureInfo(OperationType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_GetFeatureInfo()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GetFeatureInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationType getGetFeatureInfo();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getGetFeatureInfo <em>Get Feature Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Feature Info</em>' containment reference.
	 * @see #getGetFeatureInfo()
	 * @generated
	 */
	void setGetFeatureInfo(OperationType value);

	/**
	 * Returns the value of the '<em><b>Get Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Map</em>' containment reference.
	 * @see #setGetMap(OperationType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_GetMap()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GetMap' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationType getGetMap();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getGetMap <em>Get Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Map</em>' containment reference.
	 * @see #getGetMap()
	 * @generated
	 */
	void setGetMap(OperationType value);

	/**
	 * Returns the value of the '<em><b>HTTP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Available HTTP request methods.  At least "Get" shall be supported.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>HTTP</em>' containment reference.
	 * @see #setHTTP(HTTPType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_HTTP()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HTTP' namespace='##targetNamespace'"
	 * @generated
	 */
	HTTPType getHTTP();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getHTTP <em>HTTP</em>}' containment reference.
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
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(IdentifierType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_Identifier()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifierType getIdentifier();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(IdentifierType value);

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A single keyword or phrase.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keyword</em>' containment reference.
	 * @see #setKeyword(KeywordType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_Keyword()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Keyword' namespace='##targetNamespace'"
	 * @generated
	 */
	KeywordType getKeyword();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getKeyword <em>Keyword</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword</em>' containment reference.
	 * @see #getKeyword()
	 * @generated
	 */
	void setKeyword(KeywordType value);

	/**
	 * Returns the value of the '<em><b>Keyword List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         List of keywords or keyword phrases to help catalog searching.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keyword List</em>' containment reference.
	 * @see #setKeywordList(KeywordListType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_KeywordList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='KeywordList' namespace='##targetNamespace'"
	 * @generated
	 */
	KeywordListType getKeywordList();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getKeywordList <em>Keyword List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword List</em>' containment reference.
	 * @see #getKeywordList()
	 * @generated
	 */
	void setKeywordList(KeywordListType value);

	/**
	 * Returns the value of the '<em><b>Layer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Nested list of zero or more map Layers offered by this server.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layer</em>' containment reference.
	 * @see #setLayer(LayerType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_Layer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Layer' namespace='##targetNamespace'"
	 * @generated
	 */
	LayerType getLayer();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getLayer <em>Layer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer</em>' containment reference.
	 * @see #getLayer()
	 * @generated
	 */
	void setLayer(LayerType value);

	/**
	 * Returns the value of the '<em><b>Layer Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Limit</em>' attribute.
	 * @see #setLayerLimit(BigInteger)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_LayerLimit()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LayerLimit' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getLayerLimit();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getLayerLimit <em>Layer Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer Limit</em>' attribute.
	 * @see #getLayerLimit()
	 * @generated
	 */
	void setLayerLimit(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Legend URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A Map Server may use zero or more LegendURL elements to provide an
	 *         image(s) of a legend relevant to each Style of a Layer.  The Format
	 *         element indicates the MIME type of the legend. Width and height
	 *         attributes may be provided to assist client applications in laying out
	 *         space to display the legend.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legend URL</em>' containment reference.
	 * @see #setLegendURL(LegendURLType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_LegendURL()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LegendURL' namespace='##targetNamespace'"
	 * @generated
	 */
	LegendURLType getLegendURL();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getLegendURL <em>Legend URL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend URL</em>' containment reference.
	 * @see #getLegendURL()
	 * @generated
	 */
	void setLegendURL(LegendURLType value);

	/**
	 * Returns the value of the '<em><b>Logo URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logo URL</em>' containment reference.
	 * @see #setLogoURL(LogoURLType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_LogoURL()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LogoURL' namespace='##targetNamespace'"
	 * @generated
	 */
	LogoURLType getLogoURL();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getLogoURL <em>Logo URL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logo URL</em>' containment reference.
	 * @see #getLogoURL()
	 * @generated
	 */
	void setLogoURL(LogoURLType value);

	/**
	 * Returns the value of the '<em><b>Max Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Height</em>' attribute.
	 * @see #setMaxHeight(BigInteger)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_MaxHeight()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MaxHeight' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaxHeight();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getMaxHeight <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Height</em>' attribute.
	 * @see #getMaxHeight()
	 * @generated
	 */
	void setMaxHeight(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Max Scale Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Maximum scale denominator for which it is appropriate to
	 *         display this layer.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Scale Denominator</em>' attribute.
	 * @see #setMaxScaleDenominator(double)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_MaxScaleDenominator()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MaxScaleDenominator' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMaxScaleDenominator();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getMaxScaleDenominator <em>Max Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Scale Denominator</em>' attribute.
	 * @see #getMaxScaleDenominator()
	 * @generated
	 */
	void setMaxScaleDenominator(double value);

	/**
	 * Returns the value of the '<em><b>Max Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Width</em>' attribute.
	 * @see #setMaxWidth(BigInteger)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_MaxWidth()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MaxWidth' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMaxWidth();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getMaxWidth <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Width</em>' attribute.
	 * @see #getMaxWidth()
	 * @generated
	 */
	void setMaxWidth(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Metadata URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A Map Server may use zero or more MetadataURL elements to offer
	 *         detailed, standardized metadata about the data underneath a
	 *         particular layer. The type attribute indicates the standard to which
	 *         the metadata complies.  The format element indicates how the metadata is structured.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metadata URL</em>' containment reference.
	 * @see #setMetadataURL(MetadataURLType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_MetadataURL()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MetadataURL' namespace='##targetNamespace'"
	 * @generated
	 */
	MetadataURLType getMetadataURL();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getMetadataURL <em>Metadata URL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata URL</em>' containment reference.
	 * @see #getMetadataURL()
	 * @generated
	 */
	void setMetadataURL(MetadataURLType value);

	/**
	 * Returns the value of the '<em><b>Min Scale Denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Minimum scale denominator for which it is appropriate to
	 *         display this layer.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Scale Denominator</em>' attribute.
	 * @see #setMinScaleDenominator(double)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_MinScaleDenominator()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.Double" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MinScaleDenominator' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMinScaleDenominator();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getMinScaleDenominator <em>Min Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Scale Denominator</em>' attribute.
	 * @see #getMinScaleDenominator()
	 * @generated
	 */
	void setMinScaleDenominator(double value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The Name is typically for machine-to-machine communication.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Online Resource</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         An OnlineResource is typically an HTTP URL.  The URL is placed in
	 *         the xlink:href attribute, and the value "simple" is placed in the
	 *         xlink:type attribute.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Online Resource</em>' containment reference.
	 * @see #setOnlineResource(OnlineResourceType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_OnlineResource()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OnlineResource' namespace='##targetNamespace'"
	 * @generated
	 */
	OnlineResourceType getOnlineResource();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getOnlineResource <em>Online Resource</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Online Resource</em>' containment reference.
	 * @see #getOnlineResource()
	 * @generated
	 */
	void setOnlineResource(OnlineResourceType value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The URL prefix for the HTTP "Post" request method.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post</em>' containment reference.
	 * @see #setPost(PostType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_Post()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Post' namespace='##targetNamespace'"
	 * @generated
	 */
	PostType getPost();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getPost <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' containment reference.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(PostType value);

	/**
	 * Returns the value of the '<em><b>Post Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post Code</em>' attribute.
	 * @see #setPostCode(String)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_PostCode()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PostCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPostCode();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getPostCode <em>Post Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Code</em>' attribute.
	 * @see #getPostCode()
	 * @generated
	 */
	void setPostCode(String value);

	/**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         Available WMS Operations are listed in a Request element.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(RequestType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_Request()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Request' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestType getRequest();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
	void setRequest(RequestType value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         General service metadata.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(ServiceType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_Service()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Service' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceType getService();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(ServiceType value);

	/**
	 * Returns the value of the '<em><b>State Or Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Or Province</em>' attribute.
	 * @see #setStateOrProvince(String)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_StateOrProvince()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StateOrProvince' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStateOrProvince();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getStateOrProvince <em>State Or Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Or Province</em>' attribute.
	 * @see #getStateOrProvince()
	 * @generated
	 */
	void setStateOrProvince(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A Style element lists the name by which a style is requested and a
	 *         human-readable title for pick lists, optionally (and ideally)
	 *         provides a human-readable description, and optionally gives a style
	 *         URL.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(StyleType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_Style()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Style' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleType getStyle();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(StyleType value);

	/**
	 * Returns the value of the '<em><b>Style Sheet URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         StyleSheeetURL provides symbology information for each Style of a Layer.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style Sheet URL</em>' containment reference.
	 * @see #setStyleSheetURL(StyleSheetURLType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_StyleSheetURL()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StyleSheetURL' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleSheetURLType getStyleSheetURL();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getStyleSheetURL <em>Style Sheet URL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Sheet URL</em>' containment reference.
	 * @see #getStyleSheetURL()
	 * @generated
	 */
	void setStyleSheetURL(StyleSheetURLType value);

	/**
	 * Returns the value of the '<em><b>Style URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A Map Server may use StyleURL to offer more information about the
	 *         data or symbology underlying a particular Style. While the semantics
	 *         are not well-defined, as long as the results of an HTTP GET request
	 *         against the StyleURL are properly MIME-typed, Viewer Clients and
	 *         Cascading Map Servers can make use of this. A possible use could be
	 *         to allow a Map Server to provide legend information.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style URL</em>' containment reference.
	 * @see #setStyleURL(StyleURLType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_StyleURL()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StyleURL' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleURLType getStyleURL();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getStyleURL <em>Style URL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style URL</em>' containment reference.
	 * @see #getStyleURL()
	 * @generated
	 */
	void setStyleURL(StyleURLType value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The Title is for informative display to a human.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_Title()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>WMS Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A WMS_Capabilities document is returned in response to a
	 *         GetCapabilities request made on a WMS.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>WMS Capabilities</em>' containment reference.
	 * @see #setWMSCapabilities(WMSCapabilitiesType)
	 * @see net.opengis.wms.WMSPackage#getDocumentRoot_WMSCapabilities()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='WMS_Capabilities' namespace='##targetNamespace'"
	 * @generated
	 */
	WMSCapabilitiesType getWMSCapabilities();

	/**
	 * Sets the value of the '{@link net.opengis.wms.DocumentRoot#getWMSCapabilities <em>WMS Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WMS Capabilities</em>' containment reference.
	 * @see #getWMSCapabilities()
	 * @generated
	 */
	void setWMSCapabilities(WMSCapabilitiesType value);

} // DocumentRoot
