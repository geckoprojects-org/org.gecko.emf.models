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
package net.opengis.ogc.features.impl;

import net.opengis.ogc.features.Begin;
import net.opengis.ogc.features.ConformsTo;
import net.opengis.ogc.features.DocumentRoot;
import net.opengis.ogc.features.End;
import net.opengis.ogc.features.ExceptionReport;
import net.opengis.ogc.features.Extent;
import net.opengis.ogc.features.FeatureCollections;
import net.opengis.ogc.features.GregorianPeriod;
import net.opengis.ogc.features.LandingPage;
import net.opengis.ogc.features.LanguageString;
import net.opengis.ogc.features.OGCFeaturesPackage;
import net.opengis.ogc.features.SpatialExtent;
import net.opengis.ogc.features.TemporalExtent;
import net.opengis.ogc.features.WGS84BoundingBox;

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
 *   <li>{@link net.opengis.ogc.features.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.DocumentRootImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.DocumentRootImpl#getCollections <em>Collections</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.DocumentRootImpl#getConformsTo <em>Conforms To</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.DocumentRootImpl#getEnd <em>End</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.DocumentRootImpl#getException <em>Exception</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.DocumentRootImpl#getExceptionReport <em>Exception Report</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.DocumentRootImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.DocumentRootImpl#getLandingPage <em>Landing Page</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.DocumentRootImpl#getSpatial <em>Spatial</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.DocumentRootImpl#getSpatialExtent <em>Spatial Extent</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.DocumentRootImpl#getTemporal <em>Temporal</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.DocumentRootImpl#getTemporalExtent <em>Temporal Extent</em>}</li>
 *   <li>{@link net.opengis.ogc.features.impl.DocumentRootImpl#getTitle <em>Title</em>}</li>
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
		return OGCFeaturesPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, OGCFeaturesPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, OGCFeaturesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, OGCFeaturesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Begin getBegin() {
		return (Begin)getMixed().get(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__BEGIN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBegin(Begin newBegin, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__BEGIN, newBegin, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBegin(Begin newBegin) {
		((FeatureMap.Internal)getMixed()).set(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__BEGIN, newBegin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureCollections getCollections() {
		return (FeatureCollections)getMixed().get(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__COLLECTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCollections(FeatureCollections newCollections, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__COLLECTIONS, newCollections, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollections(FeatureCollections newCollections) {
		((FeatureMap.Internal)getMixed()).set(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__COLLECTIONS, newCollections);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConformsTo getConformsTo() {
		return (ConformsTo)getMixed().get(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__CONFORMS_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConformsTo(ConformsTo newConformsTo, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__CONFORMS_TO, newConformsTo, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConformsTo(ConformsTo newConformsTo) {
		((FeatureMap.Internal)getMixed()).set(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__CONFORMS_TO, newConformsTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageString getDescription() {
		return (LanguageString)getMixed().get(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(LanguageString newDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(LanguageString newDescription) {
		((FeatureMap.Internal)getMixed()).set(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public End getEnd() {
		return (End)getMixed().get(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__END, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(End newEnd, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__END, newEnd, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(End newEnd) {
		((FeatureMap.Internal)getMixed()).set(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public net.opengis.ogc.features.Exception getException() {
		return (net.opengis.ogc.features.Exception)getMixed().get(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__EXCEPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetException(net.opengis.ogc.features.Exception newException, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__EXCEPTION, newException, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setException(net.opengis.ogc.features.Exception newException) {
		((FeatureMap.Internal)getMixed()).set(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__EXCEPTION, newException);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExceptionReport getExceptionReport() {
		return (ExceptionReport)getMixed().get(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__EXCEPTION_REPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExceptionReport(ExceptionReport newExceptionReport, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__EXCEPTION_REPORT, newExceptionReport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExceptionReport(ExceptionReport newExceptionReport) {
		((FeatureMap.Internal)getMixed()).set(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__EXCEPTION_REPORT, newExceptionReport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Extent getExtent() {
		return (Extent)getMixed().get(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__EXTENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtent(Extent newExtent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__EXTENT, newExtent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtent(Extent newExtent) {
		((FeatureMap.Internal)getMixed()).set(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__EXTENT, newExtent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LandingPage getLandingPage() {
		return (LandingPage)getMixed().get(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__LANDING_PAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLandingPage(LandingPage newLandingPage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__LANDING_PAGE, newLandingPage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLandingPage(LandingPage newLandingPage) {
		((FeatureMap.Internal)getMixed()).set(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__LANDING_PAGE, newLandingPage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WGS84BoundingBox getSpatial() {
		return (WGS84BoundingBox)getMixed().get(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__SPATIAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpatial(WGS84BoundingBox newSpatial, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__SPATIAL, newSpatial, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpatial(WGS84BoundingBox newSpatial) {
		((FeatureMap.Internal)getMixed()).set(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__SPATIAL, newSpatial);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpatialExtent getSpatialExtent() {
		return (SpatialExtent)getMixed().get(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__SPATIAL_EXTENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpatialExtent(SpatialExtent newSpatialExtent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__SPATIAL_EXTENT, newSpatialExtent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GregorianPeriod getTemporal() {
		return (GregorianPeriod)getMixed().get(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__TEMPORAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporal(GregorianPeriod newTemporal, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__TEMPORAL, newTemporal, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTemporal(GregorianPeriod newTemporal) {
		((FeatureMap.Internal)getMixed()).set(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__TEMPORAL, newTemporal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalExtent getTemporalExtent() {
		return (TemporalExtent)getMixed().get(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__TEMPORAL_EXTENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemporalExtent(TemporalExtent newTemporalExtent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__TEMPORAL_EXTENT, newTemporalExtent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LanguageString getTitle() {
		return (LanguageString)getMixed().get(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(LanguageString newTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(LanguageString newTitle) {
		((FeatureMap.Internal)getMixed()).set(OGCFeaturesPackage.Literals.DOCUMENT_ROOT__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OGCFeaturesPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case OGCFeaturesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case OGCFeaturesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case OGCFeaturesPackage.DOCUMENT_ROOT__BEGIN:
				return basicSetBegin(null, msgs);
			case OGCFeaturesPackage.DOCUMENT_ROOT__COLLECTIONS:
				return basicSetCollections(null, msgs);
			case OGCFeaturesPackage.DOCUMENT_ROOT__CONFORMS_TO:
				return basicSetConformsTo(null, msgs);
			case OGCFeaturesPackage.DOCUMENT_ROOT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case OGCFeaturesPackage.DOCUMENT_ROOT__END:
				return basicSetEnd(null, msgs);
			case OGCFeaturesPackage.DOCUMENT_ROOT__EXCEPTION:
				return basicSetException(null, msgs);
			case OGCFeaturesPackage.DOCUMENT_ROOT__EXCEPTION_REPORT:
				return basicSetExceptionReport(null, msgs);
			case OGCFeaturesPackage.DOCUMENT_ROOT__EXTENT:
				return basicSetExtent(null, msgs);
			case OGCFeaturesPackage.DOCUMENT_ROOT__LANDING_PAGE:
				return basicSetLandingPage(null, msgs);
			case OGCFeaturesPackage.DOCUMENT_ROOT__SPATIAL:
				return basicSetSpatial(null, msgs);
			case OGCFeaturesPackage.DOCUMENT_ROOT__SPATIAL_EXTENT:
				return basicSetSpatialExtent(null, msgs);
			case OGCFeaturesPackage.DOCUMENT_ROOT__TEMPORAL:
				return basicSetTemporal(null, msgs);
			case OGCFeaturesPackage.DOCUMENT_ROOT__TEMPORAL_EXTENT:
				return basicSetTemporalExtent(null, msgs);
			case OGCFeaturesPackage.DOCUMENT_ROOT__TITLE:
				return basicSetTitle(null, msgs);
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
			case OGCFeaturesPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case OGCFeaturesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case OGCFeaturesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case OGCFeaturesPackage.DOCUMENT_ROOT__BEGIN:
				return getBegin();
			case OGCFeaturesPackage.DOCUMENT_ROOT__COLLECTIONS:
				return getCollections();
			case OGCFeaturesPackage.DOCUMENT_ROOT__CONFORMS_TO:
				return getConformsTo();
			case OGCFeaturesPackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case OGCFeaturesPackage.DOCUMENT_ROOT__END:
				return getEnd();
			case OGCFeaturesPackage.DOCUMENT_ROOT__EXCEPTION:
				return getException();
			case OGCFeaturesPackage.DOCUMENT_ROOT__EXCEPTION_REPORT:
				return getExceptionReport();
			case OGCFeaturesPackage.DOCUMENT_ROOT__EXTENT:
				return getExtent();
			case OGCFeaturesPackage.DOCUMENT_ROOT__LANDING_PAGE:
				return getLandingPage();
			case OGCFeaturesPackage.DOCUMENT_ROOT__SPATIAL:
				return getSpatial();
			case OGCFeaturesPackage.DOCUMENT_ROOT__SPATIAL_EXTENT:
				return getSpatialExtent();
			case OGCFeaturesPackage.DOCUMENT_ROOT__TEMPORAL:
				return getTemporal();
			case OGCFeaturesPackage.DOCUMENT_ROOT__TEMPORAL_EXTENT:
				return getTemporalExtent();
			case OGCFeaturesPackage.DOCUMENT_ROOT__TITLE:
				return getTitle();
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
			case OGCFeaturesPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__BEGIN:
				setBegin((Begin)newValue);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__COLLECTIONS:
				setCollections((FeatureCollections)newValue);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__CONFORMS_TO:
				setConformsTo((ConformsTo)newValue);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((LanguageString)newValue);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__END:
				setEnd((End)newValue);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__EXCEPTION:
				setException((net.opengis.ogc.features.Exception)newValue);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__EXCEPTION_REPORT:
				setExceptionReport((ExceptionReport)newValue);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__EXTENT:
				setExtent((Extent)newValue);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__LANDING_PAGE:
				setLandingPage((LandingPage)newValue);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__SPATIAL:
				setSpatial((WGS84BoundingBox)newValue);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__TEMPORAL:
				setTemporal((GregorianPeriod)newValue);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__TITLE:
				setTitle((LanguageString)newValue);
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
			case OGCFeaturesPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__BEGIN:
				setBegin((Begin)null);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__COLLECTIONS:
				setCollections((FeatureCollections)null);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__CONFORMS_TO:
				setConformsTo((ConformsTo)null);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((LanguageString)null);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__END:
				setEnd((End)null);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__EXCEPTION:
				setException((net.opengis.ogc.features.Exception)null);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__EXCEPTION_REPORT:
				setExceptionReport((ExceptionReport)null);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__EXTENT:
				setExtent((Extent)null);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__LANDING_PAGE:
				setLandingPage((LandingPage)null);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__SPATIAL:
				setSpatial((WGS84BoundingBox)null);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__TEMPORAL:
				setTemporal((GregorianPeriod)null);
				return;
			case OGCFeaturesPackage.DOCUMENT_ROOT__TITLE:
				setTitle((LanguageString)null);
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
			case OGCFeaturesPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case OGCFeaturesPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case OGCFeaturesPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case OGCFeaturesPackage.DOCUMENT_ROOT__BEGIN:
				return getBegin() != null;
			case OGCFeaturesPackage.DOCUMENT_ROOT__COLLECTIONS:
				return getCollections() != null;
			case OGCFeaturesPackage.DOCUMENT_ROOT__CONFORMS_TO:
				return getConformsTo() != null;
			case OGCFeaturesPackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription() != null;
			case OGCFeaturesPackage.DOCUMENT_ROOT__END:
				return getEnd() != null;
			case OGCFeaturesPackage.DOCUMENT_ROOT__EXCEPTION:
				return getException() != null;
			case OGCFeaturesPackage.DOCUMENT_ROOT__EXCEPTION_REPORT:
				return getExceptionReport() != null;
			case OGCFeaturesPackage.DOCUMENT_ROOT__EXTENT:
				return getExtent() != null;
			case OGCFeaturesPackage.DOCUMENT_ROOT__LANDING_PAGE:
				return getLandingPage() != null;
			case OGCFeaturesPackage.DOCUMENT_ROOT__SPATIAL:
				return getSpatial() != null;
			case OGCFeaturesPackage.DOCUMENT_ROOT__SPATIAL_EXTENT:
				return getSpatialExtent() != null;
			case OGCFeaturesPackage.DOCUMENT_ROOT__TEMPORAL:
				return getTemporal() != null;
			case OGCFeaturesPackage.DOCUMENT_ROOT__TEMPORAL_EXTENT:
				return getTemporalExtent() != null;
			case OGCFeaturesPackage.DOCUMENT_ROOT__TITLE:
				return getTitle() != null;
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
