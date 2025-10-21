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
package de.xoev.xfamilie.dsrv._1.dsrv.impl;

import de.xoev.xfamilie.dsrv._1.dsrv.DSRVPackage;
import de.xoev.xfamilie.dsrv._1.dsrv.DocumentRoot;
import de.xoev.xfamilie.dsrv._1.dsrv.DsrvAnfragervbea0401Type;
import de.xoev.xfamilie.dsrv._1.dsrv.DsrvEinkommensdatenrvbea0402Type;
import de.xoev.xfamilie.dsrv._1.dsrv.DsrvStatusantwortrvbea0403Type;

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
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DocumentRootImpl#getDsrvAnfragervbea0401 <em>Dsrv Anfragervbea0401</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DocumentRootImpl#getDsrvEinkommensdatenrvbea0402 <em>Dsrv Einkommensdatenrvbea0402</em>}</li>
 *   <li>{@link de.xoev.xfamilie.dsrv._1.dsrv.impl.DocumentRootImpl#getDsrvStatusantwortrvbea0403 <em>Dsrv Statusantwortrvbea0403</em>}</li>
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
		return DSRVPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DSRVPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DSRVPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DSRVPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DsrvAnfragervbea0401Type getDsrvAnfragervbea0401() {
		return (DsrvAnfragervbea0401Type)getMixed().get(DSRVPackage.Literals.DOCUMENT_ROOT__DSRV_ANFRAGERVBEA0401, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDsrvAnfragervbea0401(DsrvAnfragervbea0401Type newDsrvAnfragervbea0401, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DSRVPackage.Literals.DOCUMENT_ROOT__DSRV_ANFRAGERVBEA0401, newDsrvAnfragervbea0401, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDsrvAnfragervbea0401(DsrvAnfragervbea0401Type newDsrvAnfragervbea0401) {
		((FeatureMap.Internal)getMixed()).set(DSRVPackage.Literals.DOCUMENT_ROOT__DSRV_ANFRAGERVBEA0401, newDsrvAnfragervbea0401);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DsrvEinkommensdatenrvbea0402Type getDsrvEinkommensdatenrvbea0402() {
		return (DsrvEinkommensdatenrvbea0402Type)getMixed().get(DSRVPackage.Literals.DOCUMENT_ROOT__DSRV_EINKOMMENSDATENRVBEA0402, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDsrvEinkommensdatenrvbea0402(DsrvEinkommensdatenrvbea0402Type newDsrvEinkommensdatenrvbea0402, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DSRVPackage.Literals.DOCUMENT_ROOT__DSRV_EINKOMMENSDATENRVBEA0402, newDsrvEinkommensdatenrvbea0402, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDsrvEinkommensdatenrvbea0402(DsrvEinkommensdatenrvbea0402Type newDsrvEinkommensdatenrvbea0402) {
		((FeatureMap.Internal)getMixed()).set(DSRVPackage.Literals.DOCUMENT_ROOT__DSRV_EINKOMMENSDATENRVBEA0402, newDsrvEinkommensdatenrvbea0402);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DsrvStatusantwortrvbea0403Type getDsrvStatusantwortrvbea0403() {
		return (DsrvStatusantwortrvbea0403Type)getMixed().get(DSRVPackage.Literals.DOCUMENT_ROOT__DSRV_STATUSANTWORTRVBEA0403, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDsrvStatusantwortrvbea0403(DsrvStatusantwortrvbea0403Type newDsrvStatusantwortrvbea0403, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DSRVPackage.Literals.DOCUMENT_ROOT__DSRV_STATUSANTWORTRVBEA0403, newDsrvStatusantwortrvbea0403, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDsrvStatusantwortrvbea0403(DsrvStatusantwortrvbea0403Type newDsrvStatusantwortrvbea0403) {
		((FeatureMap.Internal)getMixed()).set(DSRVPackage.Literals.DOCUMENT_ROOT__DSRV_STATUSANTWORTRVBEA0403, newDsrvStatusantwortrvbea0403);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DSRVPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DSRVPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case DSRVPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case DSRVPackage.DOCUMENT_ROOT__DSRV_ANFRAGERVBEA0401:
				return basicSetDsrvAnfragervbea0401(null, msgs);
			case DSRVPackage.DOCUMENT_ROOT__DSRV_EINKOMMENSDATENRVBEA0402:
				return basicSetDsrvEinkommensdatenrvbea0402(null, msgs);
			case DSRVPackage.DOCUMENT_ROOT__DSRV_STATUSANTWORTRVBEA0403:
				return basicSetDsrvStatusantwortrvbea0403(null, msgs);
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
			case DSRVPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DSRVPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case DSRVPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case DSRVPackage.DOCUMENT_ROOT__DSRV_ANFRAGERVBEA0401:
				return getDsrvAnfragervbea0401();
			case DSRVPackage.DOCUMENT_ROOT__DSRV_EINKOMMENSDATENRVBEA0402:
				return getDsrvEinkommensdatenrvbea0402();
			case DSRVPackage.DOCUMENT_ROOT__DSRV_STATUSANTWORTRVBEA0403:
				return getDsrvStatusantwortrvbea0403();
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
			case DSRVPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DSRVPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case DSRVPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case DSRVPackage.DOCUMENT_ROOT__DSRV_ANFRAGERVBEA0401:
				setDsrvAnfragervbea0401((DsrvAnfragervbea0401Type)newValue);
				return;
			case DSRVPackage.DOCUMENT_ROOT__DSRV_EINKOMMENSDATENRVBEA0402:
				setDsrvEinkommensdatenrvbea0402((DsrvEinkommensdatenrvbea0402Type)newValue);
				return;
			case DSRVPackage.DOCUMENT_ROOT__DSRV_STATUSANTWORTRVBEA0403:
				setDsrvStatusantwortrvbea0403((DsrvStatusantwortrvbea0403Type)newValue);
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
			case DSRVPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case DSRVPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case DSRVPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case DSRVPackage.DOCUMENT_ROOT__DSRV_ANFRAGERVBEA0401:
				setDsrvAnfragervbea0401((DsrvAnfragervbea0401Type)null);
				return;
			case DSRVPackage.DOCUMENT_ROOT__DSRV_EINKOMMENSDATENRVBEA0402:
				setDsrvEinkommensdatenrvbea0402((DsrvEinkommensdatenrvbea0402Type)null);
				return;
			case DSRVPackage.DOCUMENT_ROOT__DSRV_STATUSANTWORTRVBEA0403:
				setDsrvStatusantwortrvbea0403((DsrvStatusantwortrvbea0403Type)null);
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
			case DSRVPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DSRVPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case DSRVPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case DSRVPackage.DOCUMENT_ROOT__DSRV_ANFRAGERVBEA0401:
				return getDsrvAnfragervbea0401() != null;
			case DSRVPackage.DOCUMENT_ROOT__DSRV_EINKOMMENSDATENRVBEA0402:
				return getDsrvEinkommensdatenrvbea0402() != null;
			case DSRVPackage.DOCUMENT_ROOT__DSRV_STATUSANTWORTRVBEA0403:
				return getDsrvStatusantwortrvbea0403() != null;
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
