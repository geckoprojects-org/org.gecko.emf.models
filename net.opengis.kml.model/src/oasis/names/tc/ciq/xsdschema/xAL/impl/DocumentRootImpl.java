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
package oasis.names.tc.ciq.xsdschema.xAL.impl;

import oasis.names.tc.ciq.xsdschema.xAL.AddressDetails;
import oasis.names.tc.ciq.xsdschema.xAL.AddressLineType;
import oasis.names.tc.ciq.xsdschema.xAL.AdministrativeAreaType;
import oasis.names.tc.ciq.xsdschema.xAL.CountryNameType;
import oasis.names.tc.ciq.xsdschema.xAL.DepartmentType;
import oasis.names.tc.ciq.xsdschema.xAL.DocumentRoot;
import oasis.names.tc.ciq.xsdschema.xAL.LocalityType;
import oasis.names.tc.ciq.xsdschema.xAL.PostBoxType;
import oasis.names.tc.ciq.xsdschema.xAL.PostOfficeType;
import oasis.names.tc.ciq.xsdschema.xAL.PostalCodeType;
import oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberPrefixType;
import oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberSuffixType;
import oasis.names.tc.ciq.xsdschema.xAL.PremiseNumberType;
import oasis.names.tc.ciq.xsdschema.xAL.PremiseType;
import oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberPrefixType;
import oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberSuffixType;
import oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareNumberType;
import oasis.names.tc.ciq.xsdschema.xAL.ThoroughfareType;
import oasis.names.tc.ciq.xsdschema.xAL.XALPackage;
import oasis.names.tc.ciq.xsdschema.xAL.XALType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DocumentRootImpl#getAddressDetails <em>Address Details</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DocumentRootImpl#getAddressLine <em>Address Line</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DocumentRootImpl#getAdministrativeArea <em>Administrative Area</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DocumentRootImpl#getCountryName <em>Country Name</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DocumentRootImpl#getDepartment <em>Department</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DocumentRootImpl#getLocality <em>Locality</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DocumentRootImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DocumentRootImpl#getPostBox <em>Post Box</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DocumentRootImpl#getPostOffice <em>Post Office</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DocumentRootImpl#getPremise <em>Premise</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DocumentRootImpl#getPremiseNumber <em>Premise Number</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DocumentRootImpl#getPremiseNumberPrefix <em>Premise Number Prefix</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DocumentRootImpl#getPremiseNumberSuffix <em>Premise Number Suffix</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DocumentRootImpl#getThoroughfare <em>Thoroughfare</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DocumentRootImpl#getThoroughfareNumber <em>Thoroughfare Number</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DocumentRootImpl#getThoroughfareNumberPrefix <em>Thoroughfare Number Prefix</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DocumentRootImpl#getThoroughfareNumberSuffix <em>Thoroughfare Number Suffix</em>}</li>
 *   <li>{@link oasis.names.tc.ciq.xsdschema.xAL.impl.DocumentRootImpl#getXAL <em>XAL</em>}</li>
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
		return XALPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XALPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, XALPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, XALPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressDetails getAddressDetails() {
		return (AddressDetails)getMixed().get(XALPackage.eINSTANCE.getDocumentRoot_AddressDetails(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressDetails(AddressDetails newAddressDetails, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XALPackage.eINSTANCE.getDocumentRoot_AddressDetails(), newAddressDetails, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressDetails(AddressDetails newAddressDetails) {
		((FeatureMap.Internal)getMixed()).set(XALPackage.eINSTANCE.getDocumentRoot_AddressDetails(), newAddressDetails);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressLineType getAddressLine() {
		return (AddressLineType)getMixed().get(XALPackage.eINSTANCE.getDocumentRoot_AddressLine(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressLine(AddressLineType newAddressLine, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XALPackage.eINSTANCE.getDocumentRoot_AddressLine(), newAddressLine, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddressLine(AddressLineType newAddressLine) {
		((FeatureMap.Internal)getMixed()).set(XALPackage.eINSTANCE.getDocumentRoot_AddressLine(), newAddressLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdministrativeAreaType getAdministrativeArea() {
		return (AdministrativeAreaType)getMixed().get(XALPackage.eINSTANCE.getDocumentRoot_AdministrativeArea(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdministrativeArea(AdministrativeAreaType newAdministrativeArea, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XALPackage.eINSTANCE.getDocumentRoot_AdministrativeArea(), newAdministrativeArea, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdministrativeArea(AdministrativeAreaType newAdministrativeArea) {
		((FeatureMap.Internal)getMixed()).set(XALPackage.eINSTANCE.getDocumentRoot_AdministrativeArea(), newAdministrativeArea);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CountryNameType getCountryName() {
		return (CountryNameType)getMixed().get(XALPackage.eINSTANCE.getDocumentRoot_CountryName(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCountryName(CountryNameType newCountryName, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XALPackage.eINSTANCE.getDocumentRoot_CountryName(), newCountryName, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountryName(CountryNameType newCountryName) {
		((FeatureMap.Internal)getMixed()).set(XALPackage.eINSTANCE.getDocumentRoot_CountryName(), newCountryName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DepartmentType getDepartment() {
		return (DepartmentType)getMixed().get(XALPackage.eINSTANCE.getDocumentRoot_Department(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepartment(DepartmentType newDepartment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XALPackage.eINSTANCE.getDocumentRoot_Department(), newDepartment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepartment(DepartmentType newDepartment) {
		((FeatureMap.Internal)getMixed()).set(XALPackage.eINSTANCE.getDocumentRoot_Department(), newDepartment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LocalityType getLocality() {
		return (LocalityType)getMixed().get(XALPackage.eINSTANCE.getDocumentRoot_Locality(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocality(LocalityType newLocality, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XALPackage.eINSTANCE.getDocumentRoot_Locality(), newLocality, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocality(LocalityType newLocality) {
		((FeatureMap.Internal)getMixed()).set(XALPackage.eINSTANCE.getDocumentRoot_Locality(), newLocality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalCodeType getPostalCode() {
		return (PostalCodeType)getMixed().get(XALPackage.eINSTANCE.getDocumentRoot_PostalCode(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostalCode(PostalCodeType newPostalCode, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XALPackage.eINSTANCE.getDocumentRoot_PostalCode(), newPostalCode, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostalCode(PostalCodeType newPostalCode) {
		((FeatureMap.Internal)getMixed()).set(XALPackage.eINSTANCE.getDocumentRoot_PostalCode(), newPostalCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostBoxType getPostBox() {
		return (PostBoxType)getMixed().get(XALPackage.eINSTANCE.getDocumentRoot_PostBox(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostBox(PostBoxType newPostBox, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XALPackage.eINSTANCE.getDocumentRoot_PostBox(), newPostBox, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostBox(PostBoxType newPostBox) {
		((FeatureMap.Internal)getMixed()).set(XALPackage.eINSTANCE.getDocumentRoot_PostBox(), newPostBox);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostOfficeType getPostOffice() {
		return (PostOfficeType)getMixed().get(XALPackage.eINSTANCE.getDocumentRoot_PostOffice(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostOffice(PostOfficeType newPostOffice, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XALPackage.eINSTANCE.getDocumentRoot_PostOffice(), newPostOffice, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostOffice(PostOfficeType newPostOffice) {
		((FeatureMap.Internal)getMixed()).set(XALPackage.eINSTANCE.getDocumentRoot_PostOffice(), newPostOffice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PremiseType getPremise() {
		return (PremiseType)getMixed().get(XALPackage.eINSTANCE.getDocumentRoot_Premise(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPremise(PremiseType newPremise, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XALPackage.eINSTANCE.getDocumentRoot_Premise(), newPremise, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPremise(PremiseType newPremise) {
		((FeatureMap.Internal)getMixed()).set(XALPackage.eINSTANCE.getDocumentRoot_Premise(), newPremise);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PremiseNumberType getPremiseNumber() {
		return (PremiseNumberType)getMixed().get(XALPackage.eINSTANCE.getDocumentRoot_PremiseNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPremiseNumber(PremiseNumberType newPremiseNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XALPackage.eINSTANCE.getDocumentRoot_PremiseNumber(), newPremiseNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPremiseNumber(PremiseNumberType newPremiseNumber) {
		((FeatureMap.Internal)getMixed()).set(XALPackage.eINSTANCE.getDocumentRoot_PremiseNumber(), newPremiseNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PremiseNumberPrefixType getPremiseNumberPrefix() {
		return (PremiseNumberPrefixType)getMixed().get(XALPackage.eINSTANCE.getDocumentRoot_PremiseNumberPrefix(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPremiseNumberPrefix(PremiseNumberPrefixType newPremiseNumberPrefix, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XALPackage.eINSTANCE.getDocumentRoot_PremiseNumberPrefix(), newPremiseNumberPrefix, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPremiseNumberPrefix(PremiseNumberPrefixType newPremiseNumberPrefix) {
		((FeatureMap.Internal)getMixed()).set(XALPackage.eINSTANCE.getDocumentRoot_PremiseNumberPrefix(), newPremiseNumberPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PremiseNumberSuffixType getPremiseNumberSuffix() {
		return (PremiseNumberSuffixType)getMixed().get(XALPackage.eINSTANCE.getDocumentRoot_PremiseNumberSuffix(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPremiseNumberSuffix(PremiseNumberSuffixType newPremiseNumberSuffix, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XALPackage.eINSTANCE.getDocumentRoot_PremiseNumberSuffix(), newPremiseNumberSuffix, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPremiseNumberSuffix(PremiseNumberSuffixType newPremiseNumberSuffix) {
		((FeatureMap.Internal)getMixed()).set(XALPackage.eINSTANCE.getDocumentRoot_PremiseNumberSuffix(), newPremiseNumberSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThoroughfareType getThoroughfare() {
		return (ThoroughfareType)getMixed().get(XALPackage.eINSTANCE.getDocumentRoot_Thoroughfare(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThoroughfare(ThoroughfareType newThoroughfare, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XALPackage.eINSTANCE.getDocumentRoot_Thoroughfare(), newThoroughfare, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThoroughfare(ThoroughfareType newThoroughfare) {
		((FeatureMap.Internal)getMixed()).set(XALPackage.eINSTANCE.getDocumentRoot_Thoroughfare(), newThoroughfare);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThoroughfareNumberType getThoroughfareNumber() {
		return (ThoroughfareNumberType)getMixed().get(XALPackage.eINSTANCE.getDocumentRoot_ThoroughfareNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThoroughfareNumber(ThoroughfareNumberType newThoroughfareNumber, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XALPackage.eINSTANCE.getDocumentRoot_ThoroughfareNumber(), newThoroughfareNumber, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThoroughfareNumber(ThoroughfareNumberType newThoroughfareNumber) {
		((FeatureMap.Internal)getMixed()).set(XALPackage.eINSTANCE.getDocumentRoot_ThoroughfareNumber(), newThoroughfareNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThoroughfareNumberPrefixType getThoroughfareNumberPrefix() {
		return (ThoroughfareNumberPrefixType)getMixed().get(XALPackage.eINSTANCE.getDocumentRoot_ThoroughfareNumberPrefix(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThoroughfareNumberPrefix(ThoroughfareNumberPrefixType newThoroughfareNumberPrefix, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XALPackage.eINSTANCE.getDocumentRoot_ThoroughfareNumberPrefix(), newThoroughfareNumberPrefix, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThoroughfareNumberPrefix(ThoroughfareNumberPrefixType newThoroughfareNumberPrefix) {
		((FeatureMap.Internal)getMixed()).set(XALPackage.eINSTANCE.getDocumentRoot_ThoroughfareNumberPrefix(), newThoroughfareNumberPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ThoroughfareNumberSuffixType getThoroughfareNumberSuffix() {
		return (ThoroughfareNumberSuffixType)getMixed().get(XALPackage.eINSTANCE.getDocumentRoot_ThoroughfareNumberSuffix(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThoroughfareNumberSuffix(ThoroughfareNumberSuffixType newThoroughfareNumberSuffix, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XALPackage.eINSTANCE.getDocumentRoot_ThoroughfareNumberSuffix(), newThoroughfareNumberSuffix, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThoroughfareNumberSuffix(ThoroughfareNumberSuffixType newThoroughfareNumberSuffix) {
		((FeatureMap.Internal)getMixed()).set(XALPackage.eINSTANCE.getDocumentRoot_ThoroughfareNumberSuffix(), newThoroughfareNumberSuffix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XALType getXAL() {
		return (XALType)getMixed().get(XALPackage.eINSTANCE.getDocumentRoot_XAL(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXAL(XALType newXAL, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(XALPackage.eINSTANCE.getDocumentRoot_XAL(), newXAL, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXAL(XALType newXAL) {
		((FeatureMap.Internal)getMixed()).set(XALPackage.eINSTANCE.getDocumentRoot_XAL(), newXAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XALPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XALPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case XALPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case XALPackage.DOCUMENT_ROOT__ADDRESS_DETAILS:
				return basicSetAddressDetails(null, msgs);
			case XALPackage.DOCUMENT_ROOT__ADDRESS_LINE:
				return basicSetAddressLine(null, msgs);
			case XALPackage.DOCUMENT_ROOT__ADMINISTRATIVE_AREA:
				return basicSetAdministrativeArea(null, msgs);
			case XALPackage.DOCUMENT_ROOT__COUNTRY_NAME:
				return basicSetCountryName(null, msgs);
			case XALPackage.DOCUMENT_ROOT__DEPARTMENT:
				return basicSetDepartment(null, msgs);
			case XALPackage.DOCUMENT_ROOT__LOCALITY:
				return basicSetLocality(null, msgs);
			case XALPackage.DOCUMENT_ROOT__POSTAL_CODE:
				return basicSetPostalCode(null, msgs);
			case XALPackage.DOCUMENT_ROOT__POST_BOX:
				return basicSetPostBox(null, msgs);
			case XALPackage.DOCUMENT_ROOT__POST_OFFICE:
				return basicSetPostOffice(null, msgs);
			case XALPackage.DOCUMENT_ROOT__PREMISE:
				return basicSetPremise(null, msgs);
			case XALPackage.DOCUMENT_ROOT__PREMISE_NUMBER:
				return basicSetPremiseNumber(null, msgs);
			case XALPackage.DOCUMENT_ROOT__PREMISE_NUMBER_PREFIX:
				return basicSetPremiseNumberPrefix(null, msgs);
			case XALPackage.DOCUMENT_ROOT__PREMISE_NUMBER_SUFFIX:
				return basicSetPremiseNumberSuffix(null, msgs);
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE:
				return basicSetThoroughfare(null, msgs);
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE_NUMBER:
				return basicSetThoroughfareNumber(null, msgs);
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE_NUMBER_PREFIX:
				return basicSetThoroughfareNumberPrefix(null, msgs);
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE_NUMBER_SUFFIX:
				return basicSetThoroughfareNumberSuffix(null, msgs);
			case XALPackage.DOCUMENT_ROOT__XAL:
				return basicSetXAL(null, msgs);
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
			case XALPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XALPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case XALPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case XALPackage.DOCUMENT_ROOT__ADDRESS_DETAILS:
				return getAddressDetails();
			case XALPackage.DOCUMENT_ROOT__ADDRESS_LINE:
				return getAddressLine();
			case XALPackage.DOCUMENT_ROOT__ADMINISTRATIVE_AREA:
				return getAdministrativeArea();
			case XALPackage.DOCUMENT_ROOT__COUNTRY_NAME:
				return getCountryName();
			case XALPackage.DOCUMENT_ROOT__DEPARTMENT:
				return getDepartment();
			case XALPackage.DOCUMENT_ROOT__LOCALITY:
				return getLocality();
			case XALPackage.DOCUMENT_ROOT__POSTAL_CODE:
				return getPostalCode();
			case XALPackage.DOCUMENT_ROOT__POST_BOX:
				return getPostBox();
			case XALPackage.DOCUMENT_ROOT__POST_OFFICE:
				return getPostOffice();
			case XALPackage.DOCUMENT_ROOT__PREMISE:
				return getPremise();
			case XALPackage.DOCUMENT_ROOT__PREMISE_NUMBER:
				return getPremiseNumber();
			case XALPackage.DOCUMENT_ROOT__PREMISE_NUMBER_PREFIX:
				return getPremiseNumberPrefix();
			case XALPackage.DOCUMENT_ROOT__PREMISE_NUMBER_SUFFIX:
				return getPremiseNumberSuffix();
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE:
				return getThoroughfare();
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE_NUMBER:
				return getThoroughfareNumber();
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE_NUMBER_PREFIX:
				return getThoroughfareNumberPrefix();
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE_NUMBER_SUFFIX:
				return getThoroughfareNumberSuffix();
			case XALPackage.DOCUMENT_ROOT__XAL:
				return getXAL();
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
			case XALPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XALPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case XALPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case XALPackage.DOCUMENT_ROOT__ADDRESS_DETAILS:
				setAddressDetails((AddressDetails)newValue);
				return;
			case XALPackage.DOCUMENT_ROOT__ADDRESS_LINE:
				setAddressLine((AddressLineType)newValue);
				return;
			case XALPackage.DOCUMENT_ROOT__ADMINISTRATIVE_AREA:
				setAdministrativeArea((AdministrativeAreaType)newValue);
				return;
			case XALPackage.DOCUMENT_ROOT__COUNTRY_NAME:
				setCountryName((CountryNameType)newValue);
				return;
			case XALPackage.DOCUMENT_ROOT__DEPARTMENT:
				setDepartment((DepartmentType)newValue);
				return;
			case XALPackage.DOCUMENT_ROOT__LOCALITY:
				setLocality((LocalityType)newValue);
				return;
			case XALPackage.DOCUMENT_ROOT__POSTAL_CODE:
				setPostalCode((PostalCodeType)newValue);
				return;
			case XALPackage.DOCUMENT_ROOT__POST_BOX:
				setPostBox((PostBoxType)newValue);
				return;
			case XALPackage.DOCUMENT_ROOT__POST_OFFICE:
				setPostOffice((PostOfficeType)newValue);
				return;
			case XALPackage.DOCUMENT_ROOT__PREMISE:
				setPremise((PremiseType)newValue);
				return;
			case XALPackage.DOCUMENT_ROOT__PREMISE_NUMBER:
				setPremiseNumber((PremiseNumberType)newValue);
				return;
			case XALPackage.DOCUMENT_ROOT__PREMISE_NUMBER_PREFIX:
				setPremiseNumberPrefix((PremiseNumberPrefixType)newValue);
				return;
			case XALPackage.DOCUMENT_ROOT__PREMISE_NUMBER_SUFFIX:
				setPremiseNumberSuffix((PremiseNumberSuffixType)newValue);
				return;
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE:
				setThoroughfare((ThoroughfareType)newValue);
				return;
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE_NUMBER:
				setThoroughfareNumber((ThoroughfareNumberType)newValue);
				return;
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE_NUMBER_PREFIX:
				setThoroughfareNumberPrefix((ThoroughfareNumberPrefixType)newValue);
				return;
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE_NUMBER_SUFFIX:
				setThoroughfareNumberSuffix((ThoroughfareNumberSuffixType)newValue);
				return;
			case XALPackage.DOCUMENT_ROOT__XAL:
				setXAL((XALType)newValue);
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
			case XALPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case XALPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case XALPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case XALPackage.DOCUMENT_ROOT__ADDRESS_DETAILS:
				setAddressDetails((AddressDetails)null);
				return;
			case XALPackage.DOCUMENT_ROOT__ADDRESS_LINE:
				setAddressLine((AddressLineType)null);
				return;
			case XALPackage.DOCUMENT_ROOT__ADMINISTRATIVE_AREA:
				setAdministrativeArea((AdministrativeAreaType)null);
				return;
			case XALPackage.DOCUMENT_ROOT__COUNTRY_NAME:
				setCountryName((CountryNameType)null);
				return;
			case XALPackage.DOCUMENT_ROOT__DEPARTMENT:
				setDepartment((DepartmentType)null);
				return;
			case XALPackage.DOCUMENT_ROOT__LOCALITY:
				setLocality((LocalityType)null);
				return;
			case XALPackage.DOCUMENT_ROOT__POSTAL_CODE:
				setPostalCode((PostalCodeType)null);
				return;
			case XALPackage.DOCUMENT_ROOT__POST_BOX:
				setPostBox((PostBoxType)null);
				return;
			case XALPackage.DOCUMENT_ROOT__POST_OFFICE:
				setPostOffice((PostOfficeType)null);
				return;
			case XALPackage.DOCUMENT_ROOT__PREMISE:
				setPremise((PremiseType)null);
				return;
			case XALPackage.DOCUMENT_ROOT__PREMISE_NUMBER:
				setPremiseNumber((PremiseNumberType)null);
				return;
			case XALPackage.DOCUMENT_ROOT__PREMISE_NUMBER_PREFIX:
				setPremiseNumberPrefix((PremiseNumberPrefixType)null);
				return;
			case XALPackage.DOCUMENT_ROOT__PREMISE_NUMBER_SUFFIX:
				setPremiseNumberSuffix((PremiseNumberSuffixType)null);
				return;
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE:
				setThoroughfare((ThoroughfareType)null);
				return;
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE_NUMBER:
				setThoroughfareNumber((ThoroughfareNumberType)null);
				return;
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE_NUMBER_PREFIX:
				setThoroughfareNumberPrefix((ThoroughfareNumberPrefixType)null);
				return;
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE_NUMBER_SUFFIX:
				setThoroughfareNumberSuffix((ThoroughfareNumberSuffixType)null);
				return;
			case XALPackage.DOCUMENT_ROOT__XAL:
				setXAL((XALType)null);
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
			case XALPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XALPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case XALPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case XALPackage.DOCUMENT_ROOT__ADDRESS_DETAILS:
				return getAddressDetails() != null;
			case XALPackage.DOCUMENT_ROOT__ADDRESS_LINE:
				return getAddressLine() != null;
			case XALPackage.DOCUMENT_ROOT__ADMINISTRATIVE_AREA:
				return getAdministrativeArea() != null;
			case XALPackage.DOCUMENT_ROOT__COUNTRY_NAME:
				return getCountryName() != null;
			case XALPackage.DOCUMENT_ROOT__DEPARTMENT:
				return getDepartment() != null;
			case XALPackage.DOCUMENT_ROOT__LOCALITY:
				return getLocality() != null;
			case XALPackage.DOCUMENT_ROOT__POSTAL_CODE:
				return getPostalCode() != null;
			case XALPackage.DOCUMENT_ROOT__POST_BOX:
				return getPostBox() != null;
			case XALPackage.DOCUMENT_ROOT__POST_OFFICE:
				return getPostOffice() != null;
			case XALPackage.DOCUMENT_ROOT__PREMISE:
				return getPremise() != null;
			case XALPackage.DOCUMENT_ROOT__PREMISE_NUMBER:
				return getPremiseNumber() != null;
			case XALPackage.DOCUMENT_ROOT__PREMISE_NUMBER_PREFIX:
				return getPremiseNumberPrefix() != null;
			case XALPackage.DOCUMENT_ROOT__PREMISE_NUMBER_SUFFIX:
				return getPremiseNumberSuffix() != null;
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE:
				return getThoroughfare() != null;
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE_NUMBER:
				return getThoroughfareNumber() != null;
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE_NUMBER_PREFIX:
				return getThoroughfareNumberPrefix() != null;
			case XALPackage.DOCUMENT_ROOT__THOROUGHFARE_NUMBER_SUFFIX:
				return getThoroughfareNumberSuffix() != null;
			case XALPackage.DOCUMENT_ROOT__XAL:
				return getXAL() != null;
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
