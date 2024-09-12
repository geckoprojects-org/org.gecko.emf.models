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
package net.opengis.ows.impl;

import net.opengis.ows.BoundingBoxType;
import net.opengis.ows.CodeType;
import net.opengis.ows.ContactType;
import net.opengis.ows.DCPType;
import net.opengis.ows.DocumentRoot;
import net.opengis.ows.ExceptionReportType;
import net.opengis.ows.ExceptionType;
import net.opengis.ows.GetCapabilitiesType;
import net.opengis.ows.HTTPType;
import net.opengis.ows.KeywordsType;
import net.opengis.ows.MetadataType;
import net.opengis.ows.OWSPackage;
import net.opengis.ows.OperationType;
import net.opengis.ows.OperationsMetadataType;
import net.opengis.ows.ResponsiblePartyType;
import net.opengis.ows.ServiceIdentificationType;
import net.opengis.ows.ServiceProviderType;
import net.opengis.ows.WGS84BoundingBoxType;

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
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getAbstractMetaData <em>Abstract Meta Data</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getAccessConstraints <em>Access Constraints</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getAvailableCRS <em>Available CRS</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getBoundingBox <em>Bounding Box</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getContactInfo <em>Contact Info</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getDCP <em>DCP</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getException <em>Exception</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getExceptionReport <em>Exception Report</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getExtendedCapabilities <em>Extended Capabilities</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getFees <em>Fees</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getGetCapabilities <em>Get Capabilities</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getHTTP <em>HTTP</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getIndividualName <em>Individual Name</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getKeywords <em>Keywords</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getOperationsMetadata <em>Operations Metadata</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getOrganisationName <em>Organisation Name</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getOutputFormat <em>Output Format</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getPointOfContact <em>Point Of Contact</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getPositionName <em>Position Name</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getRole <em>Role</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getServiceIdentification <em>Service Identification</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getServiceProvider <em>Service Provider</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getSupportedCRS <em>Supported CRS</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.ows.impl.DocumentRootImpl#getWGS84BoundingBox <em>WGS84 Bounding Box</em>}</li>
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
	 * The default value of the '{@link #getAvailableCRS() <em>Available CRS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableCRS()
	 * @generated
	 * @ordered
	 */
	protected static final String AVAILABLE_CRS_EDEFAULT = null;

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
	 * The default value of the '{@link #getIndividualName() <em>Individual Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualName()
	 * @generated
	 * @ordered
	 */
	protected static final String INDIVIDUAL_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOrganisationName() <em>Organisation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisationName()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANISATION_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOutputFormat() <em>Output Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_FORMAT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPositionName() <em>Position Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionName()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSupportedCRS() <em>Supported CRS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedCRS()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPORTED_CRS_EDEFAULT = null;

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
		return OWSPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, OWSPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, OWSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, OWSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAbstract() {
		return (String)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__ABSTRACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(String newAbstract) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__ABSTRACT, newAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getAbstractMetaData() {
		return (EObject)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__ABSTRACT_META_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractMetaData(EObject newAbstractMetaData, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OWSPackage.Literals.DOCUMENT_ROOT__ABSTRACT_META_DATA, newAbstractMetaData, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAccessConstraints() {
		return (String)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__ACCESS_CONSTRAINTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessConstraints(String newAccessConstraints) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__ACCESS_CONSTRAINTS, newAccessConstraints);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAvailableCRS() {
		return (String)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__AVAILABLE_CRS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailableCRS(String newAvailableCRS) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__AVAILABLE_CRS, newAvailableCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundingBoxType getBoundingBox() {
		return (BoundingBoxType)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__BOUNDING_BOX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundingBox(BoundingBoxType newBoundingBox, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OWSPackage.Literals.DOCUMENT_ROOT__BOUNDING_BOX, newBoundingBox, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoundingBox(BoundingBoxType newBoundingBox) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__BOUNDING_BOX, newBoundingBox);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContactType getContactInfo() {
		return (ContactType)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__CONTACT_INFO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContactInfo(ContactType newContactInfo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OWSPackage.Literals.DOCUMENT_ROOT__CONTACT_INFO, newContactInfo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContactInfo(ContactType newContactInfo) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__CONTACT_INFO, newContactInfo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DCPType getDCP() {
		return (DCPType)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__DCP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDCP(DCPType newDCP, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OWSPackage.Literals.DOCUMENT_ROOT__DCP, newDCP, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDCP(DCPType newDCP) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__DCP, newDCP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExceptionType getException() {
		return (ExceptionType)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__EXCEPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetException(ExceptionType newException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OWSPackage.Literals.DOCUMENT_ROOT__EXCEPTION, newException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setException(ExceptionType newException) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__EXCEPTION, newException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExceptionReportType getExceptionReport() {
		return (ExceptionReportType)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__EXCEPTION_REPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExceptionReport(ExceptionReportType newExceptionReport, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OWSPackage.Literals.DOCUMENT_ROOT__EXCEPTION_REPORT, newExceptionReport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionReport(ExceptionReportType newExceptionReport) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__EXCEPTION_REPORT, newExceptionReport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getExtendedCapabilities() {
		return (EObject)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__EXTENDED_CAPABILITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedCapabilities(EObject newExtendedCapabilities, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OWSPackage.Literals.DOCUMENT_ROOT__EXTENDED_CAPABILITIES, newExtendedCapabilities, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtendedCapabilities(EObject newExtendedCapabilities) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__EXTENDED_CAPABILITIES, newExtendedCapabilities);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFees() {
		return (String)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__FEES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFees(String newFees) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__FEES, newFees);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GetCapabilitiesType getGetCapabilities() {
		return (GetCapabilitiesType)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__GET_CAPABILITIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetCapabilities(GetCapabilitiesType newGetCapabilities, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OWSPackage.Literals.DOCUMENT_ROOT__GET_CAPABILITIES, newGetCapabilities, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGetCapabilities(GetCapabilitiesType newGetCapabilities) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__GET_CAPABILITIES, newGetCapabilities);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HTTPType getHTTP() {
		return (HTTPType)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__HTTP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHTTP(HTTPType newHTTP, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OWSPackage.Literals.DOCUMENT_ROOT__HTTP, newHTTP, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHTTP(HTTPType newHTTP) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__HTTP, newHTTP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getIdentifier() {
		return (CodeType)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__IDENTIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifier(CodeType newIdentifier, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OWSPackage.Literals.DOCUMENT_ROOT__IDENTIFIER, newIdentifier, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(CodeType newIdentifier) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__IDENTIFIER, newIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIndividualName() {
		return (String)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__INDIVIDUAL_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndividualName(String newIndividualName) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__INDIVIDUAL_NAME, newIndividualName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeywordsType getKeywords() {
		return (KeywordsType)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__KEYWORDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeywords(KeywordsType newKeywords, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OWSPackage.Literals.DOCUMENT_ROOT__KEYWORDS, newKeywords, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKeywords(KeywordsType newKeywords) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__KEYWORDS, newKeywords);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguage() {
		return (String)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__LANGUAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(String newLanguage) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__LANGUAGE, newLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataType getMetadata() {
		return (MetadataType)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__METADATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(MetadataType newMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OWSPackage.Literals.DOCUMENT_ROOT__METADATA, newMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadata(MetadataType newMetadata) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__METADATA, newMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationType getOperation() {
		return (OperationType)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__OPERATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperation(OperationType newOperation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OWSPackage.Literals.DOCUMENT_ROOT__OPERATION, newOperation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperation(OperationType newOperation) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__OPERATION, newOperation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationsMetadataType getOperationsMetadata() {
		return (OperationsMetadataType)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__OPERATIONS_METADATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationsMetadata(OperationsMetadataType newOperationsMetadata, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OWSPackage.Literals.DOCUMENT_ROOT__OPERATIONS_METADATA, newOperationsMetadata, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationsMetadata(OperationsMetadataType newOperationsMetadata) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__OPERATIONS_METADATA, newOperationsMetadata);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrganisationName() {
		return (String)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__ORGANISATION_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrganisationName(String newOrganisationName) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__ORGANISATION_NAME, newOrganisationName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutputFormat() {
		return (String)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__OUTPUT_FORMAT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputFormat(String newOutputFormat) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__OUTPUT_FORMAT, newOutputFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponsiblePartyType getPointOfContact() {
		return (ResponsiblePartyType)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__POINT_OF_CONTACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointOfContact(ResponsiblePartyType newPointOfContact, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OWSPackage.Literals.DOCUMENT_ROOT__POINT_OF_CONTACT, newPointOfContact, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointOfContact(ResponsiblePartyType newPointOfContact) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__POINT_OF_CONTACT, newPointOfContact);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPositionName() {
		return (String)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__POSITION_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionName(String newPositionName) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__POSITION_NAME, newPositionName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getRole() {
		return (CodeType)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(CodeType newRole, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OWSPackage.Literals.DOCUMENT_ROOT__ROLE, newRole, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(CodeType newRole) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__ROLE, newRole);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceIdentificationType getServiceIdentification() {
		return (ServiceIdentificationType)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__SERVICE_IDENTIFICATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceIdentification(ServiceIdentificationType newServiceIdentification, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OWSPackage.Literals.DOCUMENT_ROOT__SERVICE_IDENTIFICATION, newServiceIdentification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceIdentification(ServiceIdentificationType newServiceIdentification) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__SERVICE_IDENTIFICATION, newServiceIdentification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceProviderType getServiceProvider() {
		return (ServiceProviderType)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__SERVICE_PROVIDER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceProvider(ServiceProviderType newServiceProvider, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OWSPackage.Literals.DOCUMENT_ROOT__SERVICE_PROVIDER, newServiceProvider, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setServiceProvider(ServiceProviderType newServiceProvider) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__SERVICE_PROVIDER, newServiceProvider);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupportedCRS() {
		return (String)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__SUPPORTED_CRS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupportedCRS(String newSupportedCRS) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__SUPPORTED_CRS, newSupportedCRS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return (String)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WGS84BoundingBoxType getWGS84BoundingBox() {
		return (WGS84BoundingBoxType)getMixed().get(OWSPackage.Literals.DOCUMENT_ROOT__WGS84_BOUNDING_BOX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWGS84BoundingBox(WGS84BoundingBoxType newWGS84BoundingBox, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OWSPackage.Literals.DOCUMENT_ROOT__WGS84_BOUNDING_BOX, newWGS84BoundingBox, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWGS84BoundingBox(WGS84BoundingBoxType newWGS84BoundingBox) {
		((FeatureMap.Internal)getMixed()).set(OWSPackage.Literals.DOCUMENT_ROOT__WGS84_BOUNDING_BOX, newWGS84BoundingBox);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWSPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case OWSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case OWSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case OWSPackage.DOCUMENT_ROOT__ABSTRACT_META_DATA:
				return basicSetAbstractMetaData(null, msgs);
			case OWSPackage.DOCUMENT_ROOT__BOUNDING_BOX:
				return basicSetBoundingBox(null, msgs);
			case OWSPackage.DOCUMENT_ROOT__CONTACT_INFO:
				return basicSetContactInfo(null, msgs);
			case OWSPackage.DOCUMENT_ROOT__DCP:
				return basicSetDCP(null, msgs);
			case OWSPackage.DOCUMENT_ROOT__EXCEPTION:
				return basicSetException(null, msgs);
			case OWSPackage.DOCUMENT_ROOT__EXCEPTION_REPORT:
				return basicSetExceptionReport(null, msgs);
			case OWSPackage.DOCUMENT_ROOT__EXTENDED_CAPABILITIES:
				return basicSetExtendedCapabilities(null, msgs);
			case OWSPackage.DOCUMENT_ROOT__GET_CAPABILITIES:
				return basicSetGetCapabilities(null, msgs);
			case OWSPackage.DOCUMENT_ROOT__HTTP:
				return basicSetHTTP(null, msgs);
			case OWSPackage.DOCUMENT_ROOT__IDENTIFIER:
				return basicSetIdentifier(null, msgs);
			case OWSPackage.DOCUMENT_ROOT__KEYWORDS:
				return basicSetKeywords(null, msgs);
			case OWSPackage.DOCUMENT_ROOT__METADATA:
				return basicSetMetadata(null, msgs);
			case OWSPackage.DOCUMENT_ROOT__OPERATION:
				return basicSetOperation(null, msgs);
			case OWSPackage.DOCUMENT_ROOT__OPERATIONS_METADATA:
				return basicSetOperationsMetadata(null, msgs);
			case OWSPackage.DOCUMENT_ROOT__POINT_OF_CONTACT:
				return basicSetPointOfContact(null, msgs);
			case OWSPackage.DOCUMENT_ROOT__ROLE:
				return basicSetRole(null, msgs);
			case OWSPackage.DOCUMENT_ROOT__SERVICE_IDENTIFICATION:
				return basicSetServiceIdentification(null, msgs);
			case OWSPackage.DOCUMENT_ROOT__SERVICE_PROVIDER:
				return basicSetServiceProvider(null, msgs);
			case OWSPackage.DOCUMENT_ROOT__WGS84_BOUNDING_BOX:
				return basicSetWGS84BoundingBox(null, msgs);
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
			case OWSPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case OWSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case OWSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case OWSPackage.DOCUMENT_ROOT__ABSTRACT:
				return getAbstract();
			case OWSPackage.DOCUMENT_ROOT__ABSTRACT_META_DATA:
				return getAbstractMetaData();
			case OWSPackage.DOCUMENT_ROOT__ACCESS_CONSTRAINTS:
				return getAccessConstraints();
			case OWSPackage.DOCUMENT_ROOT__AVAILABLE_CRS:
				return getAvailableCRS();
			case OWSPackage.DOCUMENT_ROOT__BOUNDING_BOX:
				return getBoundingBox();
			case OWSPackage.DOCUMENT_ROOT__CONTACT_INFO:
				return getContactInfo();
			case OWSPackage.DOCUMENT_ROOT__DCP:
				return getDCP();
			case OWSPackage.DOCUMENT_ROOT__EXCEPTION:
				return getException();
			case OWSPackage.DOCUMENT_ROOT__EXCEPTION_REPORT:
				return getExceptionReport();
			case OWSPackage.DOCUMENT_ROOT__EXTENDED_CAPABILITIES:
				return getExtendedCapabilities();
			case OWSPackage.DOCUMENT_ROOT__FEES:
				return getFees();
			case OWSPackage.DOCUMENT_ROOT__GET_CAPABILITIES:
				return getGetCapabilities();
			case OWSPackage.DOCUMENT_ROOT__HTTP:
				return getHTTP();
			case OWSPackage.DOCUMENT_ROOT__IDENTIFIER:
				return getIdentifier();
			case OWSPackage.DOCUMENT_ROOT__INDIVIDUAL_NAME:
				return getIndividualName();
			case OWSPackage.DOCUMENT_ROOT__KEYWORDS:
				return getKeywords();
			case OWSPackage.DOCUMENT_ROOT__LANGUAGE:
				return getLanguage();
			case OWSPackage.DOCUMENT_ROOT__METADATA:
				return getMetadata();
			case OWSPackage.DOCUMENT_ROOT__OPERATION:
				return getOperation();
			case OWSPackage.DOCUMENT_ROOT__OPERATIONS_METADATA:
				return getOperationsMetadata();
			case OWSPackage.DOCUMENT_ROOT__ORGANISATION_NAME:
				return getOrganisationName();
			case OWSPackage.DOCUMENT_ROOT__OUTPUT_FORMAT:
				return getOutputFormat();
			case OWSPackage.DOCUMENT_ROOT__POINT_OF_CONTACT:
				return getPointOfContact();
			case OWSPackage.DOCUMENT_ROOT__POSITION_NAME:
				return getPositionName();
			case OWSPackage.DOCUMENT_ROOT__ROLE:
				return getRole();
			case OWSPackage.DOCUMENT_ROOT__SERVICE_IDENTIFICATION:
				return getServiceIdentification();
			case OWSPackage.DOCUMENT_ROOT__SERVICE_PROVIDER:
				return getServiceProvider();
			case OWSPackage.DOCUMENT_ROOT__SUPPORTED_CRS:
				return getSupportedCRS();
			case OWSPackage.DOCUMENT_ROOT__TITLE:
				return getTitle();
			case OWSPackage.DOCUMENT_ROOT__WGS84_BOUNDING_BOX:
				return getWGS84BoundingBox();
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
			case OWSPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__ABSTRACT:
				setAbstract((String)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__ACCESS_CONSTRAINTS:
				setAccessConstraints((String)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__AVAILABLE_CRS:
				setAvailableCRS((String)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__BOUNDING_BOX:
				setBoundingBox((BoundingBoxType)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__CONTACT_INFO:
				setContactInfo((ContactType)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__DCP:
				setDCP((DCPType)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__EXCEPTION:
				setException((ExceptionType)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__EXCEPTION_REPORT:
				setExceptionReport((ExceptionReportType)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__EXTENDED_CAPABILITIES:
				setExtendedCapabilities((EObject)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__FEES:
				setFees((String)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__GET_CAPABILITIES:
				setGetCapabilities((GetCapabilitiesType)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__HTTP:
				setHTTP((HTTPType)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__IDENTIFIER:
				setIdentifier((CodeType)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__INDIVIDUAL_NAME:
				setIndividualName((String)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__KEYWORDS:
				setKeywords((KeywordsType)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__METADATA:
				setMetadata((MetadataType)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__OPERATION:
				setOperation((OperationType)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__OPERATIONS_METADATA:
				setOperationsMetadata((OperationsMetadataType)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__ORGANISATION_NAME:
				setOrganisationName((String)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__OUTPUT_FORMAT:
				setOutputFormat((String)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__POINT_OF_CONTACT:
				setPointOfContact((ResponsiblePartyType)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__POSITION_NAME:
				setPositionName((String)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__ROLE:
				setRole((CodeType)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__SERVICE_IDENTIFICATION:
				setServiceIdentification((ServiceIdentificationType)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__SERVICE_PROVIDER:
				setServiceProvider((ServiceProviderType)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__SUPPORTED_CRS:
				setSupportedCRS((String)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__TITLE:
				setTitle((String)newValue);
				return;
			case OWSPackage.DOCUMENT_ROOT__WGS84_BOUNDING_BOX:
				setWGS84BoundingBox((WGS84BoundingBoxType)newValue);
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
			case OWSPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case OWSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case OWSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case OWSPackage.DOCUMENT_ROOT__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case OWSPackage.DOCUMENT_ROOT__ACCESS_CONSTRAINTS:
				setAccessConstraints(ACCESS_CONSTRAINTS_EDEFAULT);
				return;
			case OWSPackage.DOCUMENT_ROOT__AVAILABLE_CRS:
				setAvailableCRS(AVAILABLE_CRS_EDEFAULT);
				return;
			case OWSPackage.DOCUMENT_ROOT__BOUNDING_BOX:
				setBoundingBox((BoundingBoxType)null);
				return;
			case OWSPackage.DOCUMENT_ROOT__CONTACT_INFO:
				setContactInfo((ContactType)null);
				return;
			case OWSPackage.DOCUMENT_ROOT__DCP:
				setDCP((DCPType)null);
				return;
			case OWSPackage.DOCUMENT_ROOT__EXCEPTION:
				setException((ExceptionType)null);
				return;
			case OWSPackage.DOCUMENT_ROOT__EXCEPTION_REPORT:
				setExceptionReport((ExceptionReportType)null);
				return;
			case OWSPackage.DOCUMENT_ROOT__EXTENDED_CAPABILITIES:
				setExtendedCapabilities((EObject)null);
				return;
			case OWSPackage.DOCUMENT_ROOT__FEES:
				setFees(FEES_EDEFAULT);
				return;
			case OWSPackage.DOCUMENT_ROOT__GET_CAPABILITIES:
				setGetCapabilities((GetCapabilitiesType)null);
				return;
			case OWSPackage.DOCUMENT_ROOT__HTTP:
				setHTTP((HTTPType)null);
				return;
			case OWSPackage.DOCUMENT_ROOT__IDENTIFIER:
				setIdentifier((CodeType)null);
				return;
			case OWSPackage.DOCUMENT_ROOT__INDIVIDUAL_NAME:
				setIndividualName(INDIVIDUAL_NAME_EDEFAULT);
				return;
			case OWSPackage.DOCUMENT_ROOT__KEYWORDS:
				setKeywords((KeywordsType)null);
				return;
			case OWSPackage.DOCUMENT_ROOT__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case OWSPackage.DOCUMENT_ROOT__METADATA:
				setMetadata((MetadataType)null);
				return;
			case OWSPackage.DOCUMENT_ROOT__OPERATION:
				setOperation((OperationType)null);
				return;
			case OWSPackage.DOCUMENT_ROOT__OPERATIONS_METADATA:
				setOperationsMetadata((OperationsMetadataType)null);
				return;
			case OWSPackage.DOCUMENT_ROOT__ORGANISATION_NAME:
				setOrganisationName(ORGANISATION_NAME_EDEFAULT);
				return;
			case OWSPackage.DOCUMENT_ROOT__OUTPUT_FORMAT:
				setOutputFormat(OUTPUT_FORMAT_EDEFAULT);
				return;
			case OWSPackage.DOCUMENT_ROOT__POINT_OF_CONTACT:
				setPointOfContact((ResponsiblePartyType)null);
				return;
			case OWSPackage.DOCUMENT_ROOT__POSITION_NAME:
				setPositionName(POSITION_NAME_EDEFAULT);
				return;
			case OWSPackage.DOCUMENT_ROOT__ROLE:
				setRole((CodeType)null);
				return;
			case OWSPackage.DOCUMENT_ROOT__SERVICE_IDENTIFICATION:
				setServiceIdentification((ServiceIdentificationType)null);
				return;
			case OWSPackage.DOCUMENT_ROOT__SERVICE_PROVIDER:
				setServiceProvider((ServiceProviderType)null);
				return;
			case OWSPackage.DOCUMENT_ROOT__SUPPORTED_CRS:
				setSupportedCRS(SUPPORTED_CRS_EDEFAULT);
				return;
			case OWSPackage.DOCUMENT_ROOT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case OWSPackage.DOCUMENT_ROOT__WGS84_BOUNDING_BOX:
				setWGS84BoundingBox((WGS84BoundingBoxType)null);
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
			case OWSPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case OWSPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case OWSPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case OWSPackage.DOCUMENT_ROOT__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? getAbstract() != null : !ABSTRACT_EDEFAULT.equals(getAbstract());
			case OWSPackage.DOCUMENT_ROOT__ABSTRACT_META_DATA:
				return getAbstractMetaData() != null;
			case OWSPackage.DOCUMENT_ROOT__ACCESS_CONSTRAINTS:
				return ACCESS_CONSTRAINTS_EDEFAULT == null ? getAccessConstraints() != null : !ACCESS_CONSTRAINTS_EDEFAULT.equals(getAccessConstraints());
			case OWSPackage.DOCUMENT_ROOT__AVAILABLE_CRS:
				return AVAILABLE_CRS_EDEFAULT == null ? getAvailableCRS() != null : !AVAILABLE_CRS_EDEFAULT.equals(getAvailableCRS());
			case OWSPackage.DOCUMENT_ROOT__BOUNDING_BOX:
				return getBoundingBox() != null;
			case OWSPackage.DOCUMENT_ROOT__CONTACT_INFO:
				return getContactInfo() != null;
			case OWSPackage.DOCUMENT_ROOT__DCP:
				return getDCP() != null;
			case OWSPackage.DOCUMENT_ROOT__EXCEPTION:
				return getException() != null;
			case OWSPackage.DOCUMENT_ROOT__EXCEPTION_REPORT:
				return getExceptionReport() != null;
			case OWSPackage.DOCUMENT_ROOT__EXTENDED_CAPABILITIES:
				return getExtendedCapabilities() != null;
			case OWSPackage.DOCUMENT_ROOT__FEES:
				return FEES_EDEFAULT == null ? getFees() != null : !FEES_EDEFAULT.equals(getFees());
			case OWSPackage.DOCUMENT_ROOT__GET_CAPABILITIES:
				return getGetCapabilities() != null;
			case OWSPackage.DOCUMENT_ROOT__HTTP:
				return getHTTP() != null;
			case OWSPackage.DOCUMENT_ROOT__IDENTIFIER:
				return getIdentifier() != null;
			case OWSPackage.DOCUMENT_ROOT__INDIVIDUAL_NAME:
				return INDIVIDUAL_NAME_EDEFAULT == null ? getIndividualName() != null : !INDIVIDUAL_NAME_EDEFAULT.equals(getIndividualName());
			case OWSPackage.DOCUMENT_ROOT__KEYWORDS:
				return getKeywords() != null;
			case OWSPackage.DOCUMENT_ROOT__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? getLanguage() != null : !LANGUAGE_EDEFAULT.equals(getLanguage());
			case OWSPackage.DOCUMENT_ROOT__METADATA:
				return getMetadata() != null;
			case OWSPackage.DOCUMENT_ROOT__OPERATION:
				return getOperation() != null;
			case OWSPackage.DOCUMENT_ROOT__OPERATIONS_METADATA:
				return getOperationsMetadata() != null;
			case OWSPackage.DOCUMENT_ROOT__ORGANISATION_NAME:
				return ORGANISATION_NAME_EDEFAULT == null ? getOrganisationName() != null : !ORGANISATION_NAME_EDEFAULT.equals(getOrganisationName());
			case OWSPackage.DOCUMENT_ROOT__OUTPUT_FORMAT:
				return OUTPUT_FORMAT_EDEFAULT == null ? getOutputFormat() != null : !OUTPUT_FORMAT_EDEFAULT.equals(getOutputFormat());
			case OWSPackage.DOCUMENT_ROOT__POINT_OF_CONTACT:
				return getPointOfContact() != null;
			case OWSPackage.DOCUMENT_ROOT__POSITION_NAME:
				return POSITION_NAME_EDEFAULT == null ? getPositionName() != null : !POSITION_NAME_EDEFAULT.equals(getPositionName());
			case OWSPackage.DOCUMENT_ROOT__ROLE:
				return getRole() != null;
			case OWSPackage.DOCUMENT_ROOT__SERVICE_IDENTIFICATION:
				return getServiceIdentification() != null;
			case OWSPackage.DOCUMENT_ROOT__SERVICE_PROVIDER:
				return getServiceProvider() != null;
			case OWSPackage.DOCUMENT_ROOT__SUPPORTED_CRS:
				return SUPPORTED_CRS_EDEFAULT == null ? getSupportedCRS() != null : !SUPPORTED_CRS_EDEFAULT.equals(getSupportedCRS());
			case OWSPackage.DOCUMENT_ROOT__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case OWSPackage.DOCUMENT_ROOT__WGS84_BOUNDING_BOX:
				return getWGS84BoundingBox() != null;
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
