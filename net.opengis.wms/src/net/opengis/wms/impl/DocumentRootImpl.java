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
package net.opengis.wms.impl;

import java.math.BigInteger;

import net.opengis.wms.AttributionType;
import net.opengis.wms.AuthorityURLType;
import net.opengis.wms.BoundingBoxType;
import net.opengis.wms.CapabilityType;
import net.opengis.wms.ContactAddressType;
import net.opengis.wms.ContactInformationType;
import net.opengis.wms.ContactPersonPrimaryType;
import net.opengis.wms.DCPTypeType;
import net.opengis.wms.DataURLType;
import net.opengis.wms.DimensionType;
import net.opengis.wms.DocumentRoot;
import net.opengis.wms.EXGeographicBoundingBoxType;
import net.opengis.wms.ExceptionType;
import net.opengis.wms.FeatureListURLType;
import net.opengis.wms.GetType;
import net.opengis.wms.HTTPType;
import net.opengis.wms.IdentifierType;
import net.opengis.wms.KeywordListType;
import net.opengis.wms.KeywordType;
import net.opengis.wms.LayerType;
import net.opengis.wms.LegendURLType;
import net.opengis.wms.LogoURLType;
import net.opengis.wms.MetadataURLType;
import net.opengis.wms.OnlineResourceType;
import net.opengis.wms.OperationType;
import net.opengis.wms.PostType;
import net.opengis.wms.RequestType;
import net.opengis.wms.ServiceType;
import net.opengis.wms.StyleSheetURLType;
import net.opengis.wms.StyleType;
import net.opengis.wms.StyleURLType;
import net.opengis.wms.WMSCapabilitiesType;
import net.opengis.wms.WMSPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getExtendedCapabilities <em>Extended Capabilities</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getExtendedOperation <em>Extended Operation</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getAccessConstraints <em>Access Constraints</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getAddressType <em>Address Type</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getAttribution <em>Attribution</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getAuthorityURL <em>Authority URL</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getBoundingBox <em>Bounding Box</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getCity <em>City</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getContactAddress <em>Contact Address</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getContactElectronicMailAddress <em>Contact Electronic Mail Address</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getContactFacsimileTelephone <em>Contact Facsimile Telephone</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getContactInformation <em>Contact Information</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getContactOrganization <em>Contact Organization</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getContactPerson <em>Contact Person</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getContactPersonPrimary <em>Contact Person Primary</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getContactPosition <em>Contact Position</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getContactVoiceTelephone <em>Contact Voice Telephone</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getCRS <em>CRS</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getDataURL <em>Data URL</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getDCPType <em>DCP Type</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getEXGeographicBoundingBox <em>EX Geographic Bounding Box</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getException <em>Exception</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getFeatureListURL <em>Feature List URL</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getFees <em>Fees</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getGet <em>Get</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getGetCapabilities <em>Get Capabilities</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getGetFeatureInfo <em>Get Feature Info</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getGetMap <em>Get Map</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getHTTP <em>HTTP</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getKeywordList <em>Keyword List</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getLayer <em>Layer</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getLayerLimit <em>Layer Limit</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getLegendURL <em>Legend URL</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getLogoURL <em>Logo URL</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getMaxHeight <em>Max Height</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getMaxScaleDenominator <em>Max Scale Denominator</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getMaxWidth <em>Max Width</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getMetadataURL <em>Metadata URL</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getMinScaleDenominator <em>Min Scale Denominator</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getOnlineResource <em>Online Resource</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getPost <em>Post</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getPostCode <em>Post Code</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getService <em>Service</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getStateOrProvince <em>State Or Province</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getStyleSheetURL <em>Style Sheet URL</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getStyleURL <em>Style URL</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.wms.impl.DocumentRootImpl#getWMSCapabilities <em>WMS Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAccessConstraints() <em>Access Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessConstraints()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_CONSTRAINTS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAddressType() <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressType()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_TYPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContactElectronicMailAddress() <em>Contact Electronic Mail Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactElectronicMailAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_ELECTRONIC_MAIL_ADDRESS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContactFacsimileTelephone() <em>Contact Facsimile Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactFacsimileTelephone()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_FACSIMILE_TELEPHONE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContactOrganization() <em>Contact Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactOrganization()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_ORGANIZATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContactPerson() <em>Contact Person</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPerson()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_PERSON_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContactPosition() <em>Contact Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_POSITION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContactVoiceTelephone() <em>Contact Voice Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactVoiceTelephone()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_VOICE_TELEPHONE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCRS() <em>CRS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCRS()
	 * @generated
	 * @ordered
	 */
	protected static final String CRS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFees() <em>Fees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFees()
	 * @generated
	 * @ordered
	 */
	protected static final String FEES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLayerLimit() <em>Layer Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayerLimit()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LAYER_LIMIT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMaxHeight() <em>Max Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxHeight()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_HEIGHT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMaxScaleDenominator() <em>Max Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxScaleDenominator()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_SCALE_DENOMINATOR_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMaxWidth() <em>Max Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxWidth()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_WIDTH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMinScaleDenominator() <em>Min Scale Denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinScaleDenominator()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_SCALE_DENOMINATOR_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPostCode() <em>Post Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_CODE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStateOrProvince() <em>State Or Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateOrProvince()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_OR_PROVINCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WMSPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, WMSPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, WMSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, WMSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getExtendedCapabilities() {
		return (EObject)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__EXTENDED_CAPABILITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedCapabilities(EObject newExtendedCapabilities, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__EXTENDED_CAPABILITIES, newExtendedCapabilities, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationType getExtendedOperation() {
		return (OperationType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__EXTENDED_OPERATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedOperation(OperationType newExtendedOperation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__EXTENDED_OPERATION, newExtendedOperation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbstract() {
		return (String)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__ABSTRACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(String newAbstract) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__ABSTRACT, newAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessConstraints() {
		return (String)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__ACCESS_CONSTRAINTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessConstraints(String newAccessConstraints) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__ACCESS_CONSTRAINTS, newAccessConstraints);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddress() {
		return (String)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddress(String newAddress) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__ADDRESS, newAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAddressType() {
		return (String)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__ADDRESS_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressType(String newAddressType) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__ADDRESS_TYPE, newAddressType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributionType getAttribution() {
		return (AttributionType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__ATTRIBUTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttribution(AttributionType newAttribution, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__ATTRIBUTION, newAttribution, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttribution(AttributionType newAttribution) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__ATTRIBUTION, newAttribution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorityURLType getAuthorityURL() {
		return (AuthorityURLType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__AUTHORITY_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorityURL(AuthorityURLType newAuthorityURL, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__AUTHORITY_URL, newAuthorityURL, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorityURL(AuthorityURLType newAuthorityURL) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__AUTHORITY_URL, newAuthorityURL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundingBoxType getBoundingBox() {
		return (BoundingBoxType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__BOUNDING_BOX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundingBox(BoundingBoxType newBoundingBox, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__BOUNDING_BOX, newBoundingBox, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoundingBox(BoundingBoxType newBoundingBox) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__BOUNDING_BOX, newBoundingBox);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CapabilityType getCapability() {
		return (CapabilityType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__CAPABILITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapability(CapabilityType newCapability, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__CAPABILITY, newCapability, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapability(CapabilityType newCapability) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__CAPABILITY, newCapability);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCity() {
		return (String)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__CITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(String newCity) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__CITY, newCity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactAddressType getContactAddress() {
		return (ContactAddressType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__CONTACT_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContactAddress(ContactAddressType newContactAddress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__CONTACT_ADDRESS, newContactAddress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactAddress(ContactAddressType newContactAddress) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__CONTACT_ADDRESS, newContactAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactElectronicMailAddress() {
		return (String)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__CONTACT_ELECTRONIC_MAIL_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactElectronicMailAddress(String newContactElectronicMailAddress) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__CONTACT_ELECTRONIC_MAIL_ADDRESS, newContactElectronicMailAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactFacsimileTelephone() {
		return (String)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__CONTACT_FACSIMILE_TELEPHONE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactFacsimileTelephone(String newContactFacsimileTelephone) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__CONTACT_FACSIMILE_TELEPHONE, newContactFacsimileTelephone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactInformationType getContactInformation() {
		return (ContactInformationType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__CONTACT_INFORMATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContactInformation(ContactInformationType newContactInformation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__CONTACT_INFORMATION, newContactInformation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactInformation(ContactInformationType newContactInformation) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__CONTACT_INFORMATION, newContactInformation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactOrganization() {
		return (String)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__CONTACT_ORGANIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactOrganization(String newContactOrganization) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__CONTACT_ORGANIZATION, newContactOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactPerson() {
		return (String)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__CONTACT_PERSON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactPerson(String newContactPerson) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__CONTACT_PERSON, newContactPerson);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactPersonPrimaryType getContactPersonPrimary() {
		return (ContactPersonPrimaryType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__CONTACT_PERSON_PRIMARY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContactPersonPrimary(ContactPersonPrimaryType newContactPersonPrimary, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__CONTACT_PERSON_PRIMARY, newContactPersonPrimary, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactPersonPrimary(ContactPersonPrimaryType newContactPersonPrimary) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__CONTACT_PERSON_PRIMARY, newContactPersonPrimary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactPosition() {
		return (String)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__CONTACT_POSITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactPosition(String newContactPosition) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__CONTACT_POSITION, newContactPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContactVoiceTelephone() {
		return (String)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__CONTACT_VOICE_TELEPHONE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactVoiceTelephone(String newContactVoiceTelephone) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__CONTACT_VOICE_TELEPHONE, newContactVoiceTelephone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCountry() {
		return (String)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__COUNTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountry(String newCountry) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__COUNTRY, newCountry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCRS() {
		return (String)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__CRS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCRS(String newCRS) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__CRS, newCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataURLType getDataURL() {
		return (DataURLType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__DATA_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataURL(DataURLType newDataURL, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__DATA_URL, newDataURL, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataURL(DataURLType newDataURL) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__DATA_URL, newDataURL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DCPTypeType getDCPType() {
		return (DCPTypeType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__DCP_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDCPType(DCPTypeType newDCPType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__DCP_TYPE, newDCPType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDCPType(DCPTypeType newDCPType) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__DCP_TYPE, newDCPType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DimensionType getDimension() {
		return (DimensionType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__DIMENSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimension(DimensionType newDimension, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__DIMENSION, newDimension, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDimension(DimensionType newDimension) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__DIMENSION, newDimension);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EXGeographicBoundingBoxType getEXGeographicBoundingBox() {
		return (EXGeographicBoundingBoxType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__EX_GEOGRAPHIC_BOUNDING_BOX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEXGeographicBoundingBox(EXGeographicBoundingBoxType newEXGeographicBoundingBox, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__EX_GEOGRAPHIC_BOUNDING_BOX, newEXGeographicBoundingBox, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEXGeographicBoundingBox(EXGeographicBoundingBoxType newEXGeographicBoundingBox) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__EX_GEOGRAPHIC_BOUNDING_BOX, newEXGeographicBoundingBox);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExceptionType getException() {
		return (ExceptionType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__EXCEPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetException(ExceptionType newException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__EXCEPTION, newException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setException(ExceptionType newException) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__EXCEPTION, newException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureListURLType getFeatureListURL() {
		return (FeatureListURLType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__FEATURE_LIST_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureListURL(FeatureListURLType newFeatureListURL, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__FEATURE_LIST_URL, newFeatureListURL, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureListURL(FeatureListURLType newFeatureListURL) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__FEATURE_LIST_URL, newFeatureListURL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFees() {
		return (String)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__FEES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFees(String newFees) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__FEES, newFees);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormat() {
		return (String)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__FORMAT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(String newFormat) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__FORMAT, newFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetType getGet() {
		return (GetType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__GET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGet(GetType newGet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__GET, newGet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGet(GetType newGet) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__GET, newGet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationType getGetCapabilities() {
		return (OperationType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__GET_CAPABILITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetCapabilities(OperationType newGetCapabilities, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__GET_CAPABILITIES, newGetCapabilities, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetCapabilities(OperationType newGetCapabilities) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__GET_CAPABILITIES, newGetCapabilities);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationType getGetFeatureInfo() {
		return (OperationType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__GET_FEATURE_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetFeatureInfo(OperationType newGetFeatureInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__GET_FEATURE_INFO, newGetFeatureInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetFeatureInfo(OperationType newGetFeatureInfo) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__GET_FEATURE_INFO, newGetFeatureInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationType getGetMap() {
		return (OperationType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__GET_MAP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetMap(OperationType newGetMap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__GET_MAP, newGetMap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetMap(OperationType newGetMap) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__GET_MAP, newGetMap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HTTPType getHTTP() {
		return (HTTPType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__HTTP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHTTP(HTTPType newHTTP, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__HTTP, newHTTP, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHTTP(HTTPType newHTTP) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__HTTP, newHTTP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifierType getIdentifier() {
		return (IdentifierType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__IDENTIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(IdentifierType newIdentifier, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__IDENTIFIER, newIdentifier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(IdentifierType newIdentifier) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__IDENTIFIER, newIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeywordType getKeyword() {
		return (KeywordType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__KEYWORD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyword(KeywordType newKeyword, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__KEYWORD, newKeyword, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeyword(KeywordType newKeyword) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__KEYWORD, newKeyword);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeywordListType getKeywordList() {
		return (KeywordListType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__KEYWORD_LIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeywordList(KeywordListType newKeywordList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__KEYWORD_LIST, newKeywordList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeywordList(KeywordListType newKeywordList) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__KEYWORD_LIST, newKeywordList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LayerType getLayer() {
		return (LayerType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__LAYER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayer(LayerType newLayer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__LAYER, newLayer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayer(LayerType newLayer) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__LAYER, newLayer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getLayerLimit() {
		return (BigInteger)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__LAYER_LIMIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayerLimit(BigInteger newLayerLimit) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__LAYER_LIMIT, newLayerLimit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LegendURLType getLegendURL() {
		return (LegendURLType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__LEGEND_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegendURL(LegendURLType newLegendURL, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__LEGEND_URL, newLegendURL, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLegendURL(LegendURLType newLegendURL) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__LEGEND_URL, newLegendURL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogoURLType getLogoURL() {
		return (LogoURLType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__LOGO_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogoURL(LogoURLType newLogoURL, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__LOGO_URL, newLogoURL, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogoURL(LogoURLType newLogoURL) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__LOGO_URL, newLogoURL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMaxHeight() {
		return (BigInteger)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__MAX_HEIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxHeight(BigInteger newMaxHeight) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__MAX_HEIGHT, newMaxHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMaxScaleDenominator() {
		return (Double)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__MAX_SCALE_DENOMINATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxScaleDenominator(double newMaxScaleDenominator) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__MAX_SCALE_DENOMINATOR, newMaxScaleDenominator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMaxWidth() {
		return (BigInteger)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__MAX_WIDTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxWidth(BigInteger newMaxWidth) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__MAX_WIDTH, newMaxWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataURLType getMetadataURL() {
		return (MetadataURLType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__METADATA_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadataURL(MetadataURLType newMetadataURL, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__METADATA_URL, newMetadataURL, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadataURL(MetadataURLType newMetadataURL) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__METADATA_URL, newMetadataURL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMinScaleDenominator() {
		return (Double)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__MIN_SCALE_DENOMINATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinScaleDenominator(double newMinScaleDenominator) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__MIN_SCALE_DENOMINATOR, newMinScaleDenominator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnlineResourceType getOnlineResource() {
		return (OnlineResourceType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__ONLINE_RESOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOnlineResource(OnlineResourceType newOnlineResource, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__ONLINE_RESOURCE, newOnlineResource, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnlineResource(OnlineResourceType newOnlineResource) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__ONLINE_RESOURCE, newOnlineResource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostType getPost() {
		return (PostType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__POST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPost(PostType newPost, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__POST, newPost, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPost(PostType newPost) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__POST, newPost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostCode() {
		return (String)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__POST_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostCode(String newPostCode) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__POST_CODE, newPostCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestType getRequest() {
		return (RequestType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__REQUEST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequest(RequestType newRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__REQUEST, newRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequest(RequestType newRequest) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__REQUEST, newRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceType getService() {
		return (ServiceType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__SERVICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(ServiceType newService, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__SERVICE, newService, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setService(ServiceType newService) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__SERVICE, newService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStateOrProvince() {
		return (String)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__STATE_OR_PROVINCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateOrProvince(String newStateOrProvince) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__STATE_OR_PROVINCE, newStateOrProvince);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleType getStyle() {
		return (StyleType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__STYLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyle(StyleType newStyle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__STYLE, newStyle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyle(StyleType newStyle) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__STYLE, newStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleSheetURLType getStyleSheetURL() {
		return (StyleSheetURLType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__STYLE_SHEET_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyleSheetURL(StyleSheetURLType newStyleSheetURL, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__STYLE_SHEET_URL, newStyleSheetURL, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyleSheetURL(StyleSheetURLType newStyleSheetURL) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__STYLE_SHEET_URL, newStyleSheetURL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyleURLType getStyleURL() {
		return (StyleURLType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__STYLE_URL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyleURL(StyleURLType newStyleURL, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__STYLE_URL, newStyleURL, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyleURL(StyleURLType newStyleURL) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__STYLE_URL, newStyleURL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return (String)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WMSCapabilitiesType getWMSCapabilities() {
		return (WMSCapabilitiesType)getMixed().get(WMSPackage.Literals.DOCUMENT_ROOT__WMS_CAPABILITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWMSCapabilities(WMSCapabilitiesType newWMSCapabilities, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(WMSPackage.Literals.DOCUMENT_ROOT__WMS_CAPABILITIES, newWMSCapabilities, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWMSCapabilities(WMSCapabilitiesType newWMSCapabilities) {
		((FeatureMap.Internal)getMixed()).set(WMSPackage.Literals.DOCUMENT_ROOT__WMS_CAPABILITIES, newWMSCapabilities);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WMSPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case WMSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case WMSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case WMSPackage.DOCUMENT_ROOT__EXTENDED_CAPABILITIES:
				return basicSetExtendedCapabilities(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__EXTENDED_OPERATION:
				return basicSetExtendedOperation(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__ATTRIBUTION:
				return basicSetAttribution(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__AUTHORITY_URL:
				return basicSetAuthorityURL(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__BOUNDING_BOX:
				return basicSetBoundingBox(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__CAPABILITY:
				return basicSetCapability(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__CONTACT_ADDRESS:
				return basicSetContactAddress(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__CONTACT_INFORMATION:
				return basicSetContactInformation(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__CONTACT_PERSON_PRIMARY:
				return basicSetContactPersonPrimary(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__DATA_URL:
				return basicSetDataURL(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__DCP_TYPE:
				return basicSetDCPType(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__DIMENSION:
				return basicSetDimension(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__EX_GEOGRAPHIC_BOUNDING_BOX:
				return basicSetEXGeographicBoundingBox(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__EXCEPTION:
				return basicSetException(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__FEATURE_LIST_URL:
				return basicSetFeatureListURL(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__GET:
				return basicSetGet(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__GET_CAPABILITIES:
				return basicSetGetCapabilities(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__GET_FEATURE_INFO:
				return basicSetGetFeatureInfo(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__GET_MAP:
				return basicSetGetMap(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__HTTP:
				return basicSetHTTP(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__KEYWORD:
				return basicSetKeyword(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__KEYWORD_LIST:
				return basicSetKeywordList(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__LAYER:
				return basicSetLayer(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__LEGEND_URL:
				return basicSetLegendURL(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__LOGO_URL:
				return basicSetLogoURL(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__METADATA_URL:
				return basicSetMetadataURL(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__ONLINE_RESOURCE:
				return basicSetOnlineResource(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__POST:
				return basicSetPost(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__REQUEST:
				return basicSetRequest(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__SERVICE:
				return basicSetService(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__STYLE:
				return basicSetStyle(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__STYLE_SHEET_URL:
				return basicSetStyleSheetURL(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__STYLE_URL:
				return basicSetStyleURL(null, msgs);
			case WMSPackage.DOCUMENT_ROOT__WMS_CAPABILITIES:
				return basicSetWMSCapabilities(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WMSPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case WMSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case WMSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case WMSPackage.DOCUMENT_ROOT__EXTENDED_CAPABILITIES:
				return getExtendedCapabilities();
			case WMSPackage.DOCUMENT_ROOT__EXTENDED_OPERATION:
				return getExtendedOperation();
			case WMSPackage.DOCUMENT_ROOT__ABSTRACT:
				return getAbstract();
			case WMSPackage.DOCUMENT_ROOT__ACCESS_CONSTRAINTS:
				return getAccessConstraints();
			case WMSPackage.DOCUMENT_ROOT__ADDRESS:
				return getAddress();
			case WMSPackage.DOCUMENT_ROOT__ADDRESS_TYPE:
				return getAddressType();
			case WMSPackage.DOCUMENT_ROOT__ATTRIBUTION:
				return getAttribution();
			case WMSPackage.DOCUMENT_ROOT__AUTHORITY_URL:
				return getAuthorityURL();
			case WMSPackage.DOCUMENT_ROOT__BOUNDING_BOX:
				return getBoundingBox();
			case WMSPackage.DOCUMENT_ROOT__CAPABILITY:
				return getCapability();
			case WMSPackage.DOCUMENT_ROOT__CITY:
				return getCity();
			case WMSPackage.DOCUMENT_ROOT__CONTACT_ADDRESS:
				return getContactAddress();
			case WMSPackage.DOCUMENT_ROOT__CONTACT_ELECTRONIC_MAIL_ADDRESS:
				return getContactElectronicMailAddress();
			case WMSPackage.DOCUMENT_ROOT__CONTACT_FACSIMILE_TELEPHONE:
				return getContactFacsimileTelephone();
			case WMSPackage.DOCUMENT_ROOT__CONTACT_INFORMATION:
				return getContactInformation();
			case WMSPackage.DOCUMENT_ROOT__CONTACT_ORGANIZATION:
				return getContactOrganization();
			case WMSPackage.DOCUMENT_ROOT__CONTACT_PERSON:
				return getContactPerson();
			case WMSPackage.DOCUMENT_ROOT__CONTACT_PERSON_PRIMARY:
				return getContactPersonPrimary();
			case WMSPackage.DOCUMENT_ROOT__CONTACT_POSITION:
				return getContactPosition();
			case WMSPackage.DOCUMENT_ROOT__CONTACT_VOICE_TELEPHONE:
				return getContactVoiceTelephone();
			case WMSPackage.DOCUMENT_ROOT__COUNTRY:
				return getCountry();
			case WMSPackage.DOCUMENT_ROOT__CRS:
				return getCRS();
			case WMSPackage.DOCUMENT_ROOT__DATA_URL:
				return getDataURL();
			case WMSPackage.DOCUMENT_ROOT__DCP_TYPE:
				return getDCPType();
			case WMSPackage.DOCUMENT_ROOT__DIMENSION:
				return getDimension();
			case WMSPackage.DOCUMENT_ROOT__EX_GEOGRAPHIC_BOUNDING_BOX:
				return getEXGeographicBoundingBox();
			case WMSPackage.DOCUMENT_ROOT__EXCEPTION:
				return getException();
			case WMSPackage.DOCUMENT_ROOT__FEATURE_LIST_URL:
				return getFeatureListURL();
			case WMSPackage.DOCUMENT_ROOT__FEES:
				return getFees();
			case WMSPackage.DOCUMENT_ROOT__FORMAT:
				return getFormat();
			case WMSPackage.DOCUMENT_ROOT__GET:
				return getGet();
			case WMSPackage.DOCUMENT_ROOT__GET_CAPABILITIES:
				return getGetCapabilities();
			case WMSPackage.DOCUMENT_ROOT__GET_FEATURE_INFO:
				return getGetFeatureInfo();
			case WMSPackage.DOCUMENT_ROOT__GET_MAP:
				return getGetMap();
			case WMSPackage.DOCUMENT_ROOT__HTTP:
				return getHTTP();
			case WMSPackage.DOCUMENT_ROOT__IDENTIFIER:
				return getIdentifier();
			case WMSPackage.DOCUMENT_ROOT__KEYWORD:
				return getKeyword();
			case WMSPackage.DOCUMENT_ROOT__KEYWORD_LIST:
				return getKeywordList();
			case WMSPackage.DOCUMENT_ROOT__LAYER:
				return getLayer();
			case WMSPackage.DOCUMENT_ROOT__LAYER_LIMIT:
				return getLayerLimit();
			case WMSPackage.DOCUMENT_ROOT__LEGEND_URL:
				return getLegendURL();
			case WMSPackage.DOCUMENT_ROOT__LOGO_URL:
				return getLogoURL();
			case WMSPackage.DOCUMENT_ROOT__MAX_HEIGHT:
				return getMaxHeight();
			case WMSPackage.DOCUMENT_ROOT__MAX_SCALE_DENOMINATOR:
				return getMaxScaleDenominator();
			case WMSPackage.DOCUMENT_ROOT__MAX_WIDTH:
				return getMaxWidth();
			case WMSPackage.DOCUMENT_ROOT__METADATA_URL:
				return getMetadataURL();
			case WMSPackage.DOCUMENT_ROOT__MIN_SCALE_DENOMINATOR:
				return getMinScaleDenominator();
			case WMSPackage.DOCUMENT_ROOT__NAME:
				return getName();
			case WMSPackage.DOCUMENT_ROOT__ONLINE_RESOURCE:
				return getOnlineResource();
			case WMSPackage.DOCUMENT_ROOT__POST:
				return getPost();
			case WMSPackage.DOCUMENT_ROOT__POST_CODE:
				return getPostCode();
			case WMSPackage.DOCUMENT_ROOT__REQUEST:
				return getRequest();
			case WMSPackage.DOCUMENT_ROOT__SERVICE:
				return getService();
			case WMSPackage.DOCUMENT_ROOT__STATE_OR_PROVINCE:
				return getStateOrProvince();
			case WMSPackage.DOCUMENT_ROOT__STYLE:
				return getStyle();
			case WMSPackage.DOCUMENT_ROOT__STYLE_SHEET_URL:
				return getStyleSheetURL();
			case WMSPackage.DOCUMENT_ROOT__STYLE_URL:
				return getStyleURL();
			case WMSPackage.DOCUMENT_ROOT__TITLE:
				return getTitle();
			case WMSPackage.DOCUMENT_ROOT__WMS_CAPABILITIES:
				return getWMSCapabilities();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WMSPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__ABSTRACT:
				setAbstract((String)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__ACCESS_CONSTRAINTS:
				setAccessConstraints((String)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__ADDRESS:
				setAddress((String)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__ADDRESS_TYPE:
				setAddressType((String)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__ATTRIBUTION:
				setAttribution((AttributionType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__AUTHORITY_URL:
				setAuthorityURL((AuthorityURLType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__BOUNDING_BOX:
				setBoundingBox((BoundingBoxType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__CAPABILITY:
				setCapability((CapabilityType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__CITY:
				setCity((String)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__CONTACT_ADDRESS:
				setContactAddress((ContactAddressType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__CONTACT_ELECTRONIC_MAIL_ADDRESS:
				setContactElectronicMailAddress((String)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__CONTACT_FACSIMILE_TELEPHONE:
				setContactFacsimileTelephone((String)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__CONTACT_INFORMATION:
				setContactInformation((ContactInformationType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__CONTACT_ORGANIZATION:
				setContactOrganization((String)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__CONTACT_PERSON:
				setContactPerson((String)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__CONTACT_PERSON_PRIMARY:
				setContactPersonPrimary((ContactPersonPrimaryType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__CONTACT_POSITION:
				setContactPosition((String)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__CONTACT_VOICE_TELEPHONE:
				setContactVoiceTelephone((String)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__COUNTRY:
				setCountry((String)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__CRS:
				setCRS((String)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__DATA_URL:
				setDataURL((DataURLType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__DCP_TYPE:
				setDCPType((DCPTypeType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__DIMENSION:
				setDimension((DimensionType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__EX_GEOGRAPHIC_BOUNDING_BOX:
				setEXGeographicBoundingBox((EXGeographicBoundingBoxType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__EXCEPTION:
				setException((ExceptionType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__FEATURE_LIST_URL:
				setFeatureListURL((FeatureListURLType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__FEES:
				setFees((String)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__FORMAT:
				setFormat((String)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__GET:
				setGet((GetType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__GET_CAPABILITIES:
				setGetCapabilities((OperationType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__GET_FEATURE_INFO:
				setGetFeatureInfo((OperationType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__GET_MAP:
				setGetMap((OperationType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__HTTP:
				setHTTP((HTTPType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__IDENTIFIER:
				setIdentifier((IdentifierType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__KEYWORD:
				setKeyword((KeywordType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__KEYWORD_LIST:
				setKeywordList((KeywordListType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__LAYER:
				setLayer((LayerType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__LAYER_LIMIT:
				setLayerLimit((BigInteger)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__LEGEND_URL:
				setLegendURL((LegendURLType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__LOGO_URL:
				setLogoURL((LogoURLType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__MAX_HEIGHT:
				setMaxHeight((BigInteger)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__MAX_SCALE_DENOMINATOR:
				setMaxScaleDenominator((Double)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__MAX_WIDTH:
				setMaxWidth((BigInteger)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__METADATA_URL:
				setMetadataURL((MetadataURLType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__MIN_SCALE_DENOMINATOR:
				setMinScaleDenominator((Double)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__NAME:
				setName((String)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__ONLINE_RESOURCE:
				setOnlineResource((OnlineResourceType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__POST:
				setPost((PostType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__POST_CODE:
				setPostCode((String)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__REQUEST:
				setRequest((RequestType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__SERVICE:
				setService((ServiceType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__STATE_OR_PROVINCE:
				setStateOrProvince((String)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__STYLE:
				setStyle((StyleType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__STYLE_SHEET_URL:
				setStyleSheetURL((StyleSheetURLType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__STYLE_URL:
				setStyleURL((StyleURLType)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__TITLE:
				setTitle((String)newValue);
				return;
			case WMSPackage.DOCUMENT_ROOT__WMS_CAPABILITIES:
				setWMSCapabilities((WMSCapabilitiesType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WMSPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case WMSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case WMSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case WMSPackage.DOCUMENT_ROOT__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__ACCESS_CONSTRAINTS:
				setAccessConstraints(ACCESS_CONSTRAINTS_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__ADDRESS_TYPE:
				setAddressType(ADDRESS_TYPE_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__ATTRIBUTION:
				setAttribution((AttributionType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__AUTHORITY_URL:
				setAuthorityURL((AuthorityURLType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__BOUNDING_BOX:
				setBoundingBox((BoundingBoxType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__CAPABILITY:
				setCapability((CapabilityType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__CONTACT_ADDRESS:
				setContactAddress((ContactAddressType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__CONTACT_ELECTRONIC_MAIL_ADDRESS:
				setContactElectronicMailAddress(CONTACT_ELECTRONIC_MAIL_ADDRESS_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__CONTACT_FACSIMILE_TELEPHONE:
				setContactFacsimileTelephone(CONTACT_FACSIMILE_TELEPHONE_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__CONTACT_INFORMATION:
				setContactInformation((ContactInformationType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__CONTACT_ORGANIZATION:
				setContactOrganization(CONTACT_ORGANIZATION_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__CONTACT_PERSON:
				setContactPerson(CONTACT_PERSON_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__CONTACT_PERSON_PRIMARY:
				setContactPersonPrimary((ContactPersonPrimaryType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__CONTACT_POSITION:
				setContactPosition(CONTACT_POSITION_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__CONTACT_VOICE_TELEPHONE:
				setContactVoiceTelephone(CONTACT_VOICE_TELEPHONE_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__CRS:
				setCRS(CRS_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__DATA_URL:
				setDataURL((DataURLType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__DCP_TYPE:
				setDCPType((DCPTypeType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__DIMENSION:
				setDimension((DimensionType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__EX_GEOGRAPHIC_BOUNDING_BOX:
				setEXGeographicBoundingBox((EXGeographicBoundingBoxType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__EXCEPTION:
				setException((ExceptionType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__FEATURE_LIST_URL:
				setFeatureListURL((FeatureListURLType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__FEES:
				setFees(FEES_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__GET:
				setGet((GetType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__GET_CAPABILITIES:
				setGetCapabilities((OperationType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__GET_FEATURE_INFO:
				setGetFeatureInfo((OperationType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__GET_MAP:
				setGetMap((OperationType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__HTTP:
				setHTTP((HTTPType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__IDENTIFIER:
				setIdentifier((IdentifierType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__KEYWORD:
				setKeyword((KeywordType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__KEYWORD_LIST:
				setKeywordList((KeywordListType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__LAYER:
				setLayer((LayerType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__LAYER_LIMIT:
				setLayerLimit(LAYER_LIMIT_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__LEGEND_URL:
				setLegendURL((LegendURLType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__LOGO_URL:
				setLogoURL((LogoURLType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__MAX_HEIGHT:
				setMaxHeight(MAX_HEIGHT_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__MAX_SCALE_DENOMINATOR:
				setMaxScaleDenominator(MAX_SCALE_DENOMINATOR_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__MAX_WIDTH:
				setMaxWidth(MAX_WIDTH_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__METADATA_URL:
				setMetadataURL((MetadataURLType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__MIN_SCALE_DENOMINATOR:
				setMinScaleDenominator(MIN_SCALE_DENOMINATOR_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__ONLINE_RESOURCE:
				setOnlineResource((OnlineResourceType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__POST:
				setPost((PostType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__POST_CODE:
				setPostCode(POST_CODE_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__REQUEST:
				setRequest((RequestType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__SERVICE:
				setService((ServiceType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__STATE_OR_PROVINCE:
				setStateOrProvince(STATE_OR_PROVINCE_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__STYLE:
				setStyle((StyleType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__STYLE_SHEET_URL:
				setStyleSheetURL((StyleSheetURLType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__STYLE_URL:
				setStyleURL((StyleURLType)null);
				return;
			case WMSPackage.DOCUMENT_ROOT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case WMSPackage.DOCUMENT_ROOT__WMS_CAPABILITIES:
				setWMSCapabilities((WMSCapabilitiesType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WMSPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case WMSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case WMSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case WMSPackage.DOCUMENT_ROOT__EXTENDED_CAPABILITIES:
				return getExtendedCapabilities() != null;
			case WMSPackage.DOCUMENT_ROOT__EXTENDED_OPERATION:
				return getExtendedOperation() != null;
			case WMSPackage.DOCUMENT_ROOT__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? getAbstract() != null : !ABSTRACT_EDEFAULT.equals(getAbstract());
			case WMSPackage.DOCUMENT_ROOT__ACCESS_CONSTRAINTS:
				return ACCESS_CONSTRAINTS_EDEFAULT == null ? getAccessConstraints() != null : !ACCESS_CONSTRAINTS_EDEFAULT.equals(getAccessConstraints());
			case WMSPackage.DOCUMENT_ROOT__ADDRESS:
				return ADDRESS_EDEFAULT == null ? getAddress() != null : !ADDRESS_EDEFAULT.equals(getAddress());
			case WMSPackage.DOCUMENT_ROOT__ADDRESS_TYPE:
				return ADDRESS_TYPE_EDEFAULT == null ? getAddressType() != null : !ADDRESS_TYPE_EDEFAULT.equals(getAddressType());
			case WMSPackage.DOCUMENT_ROOT__ATTRIBUTION:
				return getAttribution() != null;
			case WMSPackage.DOCUMENT_ROOT__AUTHORITY_URL:
				return getAuthorityURL() != null;
			case WMSPackage.DOCUMENT_ROOT__BOUNDING_BOX:
				return getBoundingBox() != null;
			case WMSPackage.DOCUMENT_ROOT__CAPABILITY:
				return getCapability() != null;
			case WMSPackage.DOCUMENT_ROOT__CITY:
				return CITY_EDEFAULT == null ? getCity() != null : !CITY_EDEFAULT.equals(getCity());
			case WMSPackage.DOCUMENT_ROOT__CONTACT_ADDRESS:
				return getContactAddress() != null;
			case WMSPackage.DOCUMENT_ROOT__CONTACT_ELECTRONIC_MAIL_ADDRESS:
				return CONTACT_ELECTRONIC_MAIL_ADDRESS_EDEFAULT == null ? getContactElectronicMailAddress() != null : !CONTACT_ELECTRONIC_MAIL_ADDRESS_EDEFAULT.equals(getContactElectronicMailAddress());
			case WMSPackage.DOCUMENT_ROOT__CONTACT_FACSIMILE_TELEPHONE:
				return CONTACT_FACSIMILE_TELEPHONE_EDEFAULT == null ? getContactFacsimileTelephone() != null : !CONTACT_FACSIMILE_TELEPHONE_EDEFAULT.equals(getContactFacsimileTelephone());
			case WMSPackage.DOCUMENT_ROOT__CONTACT_INFORMATION:
				return getContactInformation() != null;
			case WMSPackage.DOCUMENT_ROOT__CONTACT_ORGANIZATION:
				return CONTACT_ORGANIZATION_EDEFAULT == null ? getContactOrganization() != null : !CONTACT_ORGANIZATION_EDEFAULT.equals(getContactOrganization());
			case WMSPackage.DOCUMENT_ROOT__CONTACT_PERSON:
				return CONTACT_PERSON_EDEFAULT == null ? getContactPerson() != null : !CONTACT_PERSON_EDEFAULT.equals(getContactPerson());
			case WMSPackage.DOCUMENT_ROOT__CONTACT_PERSON_PRIMARY:
				return getContactPersonPrimary() != null;
			case WMSPackage.DOCUMENT_ROOT__CONTACT_POSITION:
				return CONTACT_POSITION_EDEFAULT == null ? getContactPosition() != null : !CONTACT_POSITION_EDEFAULT.equals(getContactPosition());
			case WMSPackage.DOCUMENT_ROOT__CONTACT_VOICE_TELEPHONE:
				return CONTACT_VOICE_TELEPHONE_EDEFAULT == null ? getContactVoiceTelephone() != null : !CONTACT_VOICE_TELEPHONE_EDEFAULT.equals(getContactVoiceTelephone());
			case WMSPackage.DOCUMENT_ROOT__COUNTRY:
				return COUNTRY_EDEFAULT == null ? getCountry() != null : !COUNTRY_EDEFAULT.equals(getCountry());
			case WMSPackage.DOCUMENT_ROOT__CRS:
				return CRS_EDEFAULT == null ? getCRS() != null : !CRS_EDEFAULT.equals(getCRS());
			case WMSPackage.DOCUMENT_ROOT__DATA_URL:
				return getDataURL() != null;
			case WMSPackage.DOCUMENT_ROOT__DCP_TYPE:
				return getDCPType() != null;
			case WMSPackage.DOCUMENT_ROOT__DIMENSION:
				return getDimension() != null;
			case WMSPackage.DOCUMENT_ROOT__EX_GEOGRAPHIC_BOUNDING_BOX:
				return getEXGeographicBoundingBox() != null;
			case WMSPackage.DOCUMENT_ROOT__EXCEPTION:
				return getException() != null;
			case WMSPackage.DOCUMENT_ROOT__FEATURE_LIST_URL:
				return getFeatureListURL() != null;
			case WMSPackage.DOCUMENT_ROOT__FEES:
				return FEES_EDEFAULT == null ? getFees() != null : !FEES_EDEFAULT.equals(getFees());
			case WMSPackage.DOCUMENT_ROOT__FORMAT:
				return FORMAT_EDEFAULT == null ? getFormat() != null : !FORMAT_EDEFAULT.equals(getFormat());
			case WMSPackage.DOCUMENT_ROOT__GET:
				return getGet() != null;
			case WMSPackage.DOCUMENT_ROOT__GET_CAPABILITIES:
				return getGetCapabilities() != null;
			case WMSPackage.DOCUMENT_ROOT__GET_FEATURE_INFO:
				return getGetFeatureInfo() != null;
			case WMSPackage.DOCUMENT_ROOT__GET_MAP:
				return getGetMap() != null;
			case WMSPackage.DOCUMENT_ROOT__HTTP:
				return getHTTP() != null;
			case WMSPackage.DOCUMENT_ROOT__IDENTIFIER:
				return getIdentifier() != null;
			case WMSPackage.DOCUMENT_ROOT__KEYWORD:
				return getKeyword() != null;
			case WMSPackage.DOCUMENT_ROOT__KEYWORD_LIST:
				return getKeywordList() != null;
			case WMSPackage.DOCUMENT_ROOT__LAYER:
				return getLayer() != null;
			case WMSPackage.DOCUMENT_ROOT__LAYER_LIMIT:
				return LAYER_LIMIT_EDEFAULT == null ? getLayerLimit() != null : !LAYER_LIMIT_EDEFAULT.equals(getLayerLimit());
			case WMSPackage.DOCUMENT_ROOT__LEGEND_URL:
				return getLegendURL() != null;
			case WMSPackage.DOCUMENT_ROOT__LOGO_URL:
				return getLogoURL() != null;
			case WMSPackage.DOCUMENT_ROOT__MAX_HEIGHT:
				return MAX_HEIGHT_EDEFAULT == null ? getMaxHeight() != null : !MAX_HEIGHT_EDEFAULT.equals(getMaxHeight());
			case WMSPackage.DOCUMENT_ROOT__MAX_SCALE_DENOMINATOR:
				return getMaxScaleDenominator() != MAX_SCALE_DENOMINATOR_EDEFAULT;
			case WMSPackage.DOCUMENT_ROOT__MAX_WIDTH:
				return MAX_WIDTH_EDEFAULT == null ? getMaxWidth() != null : !MAX_WIDTH_EDEFAULT.equals(getMaxWidth());
			case WMSPackage.DOCUMENT_ROOT__METADATA_URL:
				return getMetadataURL() != null;
			case WMSPackage.DOCUMENT_ROOT__MIN_SCALE_DENOMINATOR:
				return getMinScaleDenominator() != MIN_SCALE_DENOMINATOR_EDEFAULT;
			case WMSPackage.DOCUMENT_ROOT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case WMSPackage.DOCUMENT_ROOT__ONLINE_RESOURCE:
				return getOnlineResource() != null;
			case WMSPackage.DOCUMENT_ROOT__POST:
				return getPost() != null;
			case WMSPackage.DOCUMENT_ROOT__POST_CODE:
				return POST_CODE_EDEFAULT == null ? getPostCode() != null : !POST_CODE_EDEFAULT.equals(getPostCode());
			case WMSPackage.DOCUMENT_ROOT__REQUEST:
				return getRequest() != null;
			case WMSPackage.DOCUMENT_ROOT__SERVICE:
				return getService() != null;
			case WMSPackage.DOCUMENT_ROOT__STATE_OR_PROVINCE:
				return STATE_OR_PROVINCE_EDEFAULT == null ? getStateOrProvince() != null : !STATE_OR_PROVINCE_EDEFAULT.equals(getStateOrProvince());
			case WMSPackage.DOCUMENT_ROOT__STYLE:
				return getStyle() != null;
			case WMSPackage.DOCUMENT_ROOT__STYLE_SHEET_URL:
				return getStyleSheetURL() != null;
			case WMSPackage.DOCUMENT_ROOT__STYLE_URL:
				return getStyleURL() != null;
			case WMSPackage.DOCUMENT_ROOT__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case WMSPackage.DOCUMENT_ROOT__WMS_CAPABILITIES:
				return getWMSCapabilities() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
