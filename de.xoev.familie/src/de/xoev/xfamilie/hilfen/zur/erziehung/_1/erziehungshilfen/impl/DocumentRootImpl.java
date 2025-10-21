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
package de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl;

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.DocumentRoot;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAnfrageHJV0702Type;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungAntrag0701Type;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungEingliederungshilfe0703Type;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type;

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
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.DocumentRootImpl#getHilfenZurErziehungAnfrageHJV0702 <em>Hilfen Zur Erziehung Anfrage HJV0702</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.DocumentRootImpl#getHilfenZurErziehungAntrag0701 <em>Hilfen Zur Erziehung Antrag0701</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.DocumentRootImpl#getHilfenZurErziehungEingliederungshilfe0703 <em>Hilfen Zur Erziehung Eingliederungshilfe0703</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.DocumentRootImpl#getHilfenZurErziehungNachweisnachricht0711 <em>Hilfen Zur Erziehung Nachweisnachricht0711</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.DocumentRootImpl#getHilfenZurErziehungWiderspruch0704 <em>Hilfen Zur Erziehung Widerspruch0704</em>}</li>
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
		return ErziehungshilfePackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, ErziehungshilfePackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ErziehungshilfePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ErziehungshilfePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HilfenZurErziehungAnfrageHJV0702Type getHilfenZurErziehungAnfrageHJV0702() {
		return (HilfenZurErziehungAnfrageHJV0702Type)getMixed().get(ErziehungshilfePackage.Literals.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHilfenZurErziehungAnfrageHJV0702(HilfenZurErziehungAnfrageHJV0702Type newHilfenZurErziehungAnfrageHJV0702, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ErziehungshilfePackage.Literals.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702, newHilfenZurErziehungAnfrageHJV0702, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHilfenZurErziehungAnfrageHJV0702(HilfenZurErziehungAnfrageHJV0702Type newHilfenZurErziehungAnfrageHJV0702) {
		((FeatureMap.Internal)getMixed()).set(ErziehungshilfePackage.Literals.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702, newHilfenZurErziehungAnfrageHJV0702);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HilfenZurErziehungAntrag0701Type getHilfenZurErziehungAntrag0701() {
		return (HilfenZurErziehungAntrag0701Type)getMixed().get(ErziehungshilfePackage.Literals.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_ANTRAG0701, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHilfenZurErziehungAntrag0701(HilfenZurErziehungAntrag0701Type newHilfenZurErziehungAntrag0701, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ErziehungshilfePackage.Literals.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_ANTRAG0701, newHilfenZurErziehungAntrag0701, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHilfenZurErziehungAntrag0701(HilfenZurErziehungAntrag0701Type newHilfenZurErziehungAntrag0701) {
		((FeatureMap.Internal)getMixed()).set(ErziehungshilfePackage.Literals.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_ANTRAG0701, newHilfenZurErziehungAntrag0701);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HilfenZurErziehungEingliederungshilfe0703Type getHilfenZurErziehungEingliederungshilfe0703() {
		return (HilfenZurErziehungEingliederungshilfe0703Type)getMixed().get(ErziehungshilfePackage.Literals.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHilfenZurErziehungEingliederungshilfe0703(HilfenZurErziehungEingliederungshilfe0703Type newHilfenZurErziehungEingliederungshilfe0703, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ErziehungshilfePackage.Literals.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703, newHilfenZurErziehungEingliederungshilfe0703, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHilfenZurErziehungEingliederungshilfe0703(HilfenZurErziehungEingliederungshilfe0703Type newHilfenZurErziehungEingliederungshilfe0703) {
		((FeatureMap.Internal)getMixed()).set(ErziehungshilfePackage.Literals.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703, newHilfenZurErziehungEingliederungshilfe0703);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HilfenZurErziehungNachweisnachricht0711Type getHilfenZurErziehungNachweisnachricht0711() {
		return (HilfenZurErziehungNachweisnachricht0711Type)getMixed().get(ErziehungshilfePackage.Literals.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHilfenZurErziehungNachweisnachricht0711(HilfenZurErziehungNachweisnachricht0711Type newHilfenZurErziehungNachweisnachricht0711, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ErziehungshilfePackage.Literals.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711, newHilfenZurErziehungNachweisnachricht0711, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHilfenZurErziehungNachweisnachricht0711(HilfenZurErziehungNachweisnachricht0711Type newHilfenZurErziehungNachweisnachricht0711) {
		((FeatureMap.Internal)getMixed()).set(ErziehungshilfePackage.Literals.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711, newHilfenZurErziehungNachweisnachricht0711);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HilfenZurErziehungWiderspruch0704Type getHilfenZurErziehungWiderspruch0704() {
		return (HilfenZurErziehungWiderspruch0704Type)getMixed().get(ErziehungshilfePackage.Literals.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHilfenZurErziehungWiderspruch0704(HilfenZurErziehungWiderspruch0704Type newHilfenZurErziehungWiderspruch0704, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ErziehungshilfePackage.Literals.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704, newHilfenZurErziehungWiderspruch0704, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHilfenZurErziehungWiderspruch0704(HilfenZurErziehungWiderspruch0704Type newHilfenZurErziehungWiderspruch0704) {
		((FeatureMap.Internal)getMixed()).set(ErziehungshilfePackage.Literals.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704, newHilfenZurErziehungWiderspruch0704);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErziehungshilfePackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case ErziehungshilfePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case ErziehungshilfePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702:
				return basicSetHilfenZurErziehungAnfrageHJV0702(null, msgs);
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_ANTRAG0701:
				return basicSetHilfenZurErziehungAntrag0701(null, msgs);
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703:
				return basicSetHilfenZurErziehungEingliederungshilfe0703(null, msgs);
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711:
				return basicSetHilfenZurErziehungNachweisnachricht0711(null, msgs);
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704:
				return basicSetHilfenZurErziehungWiderspruch0704(null, msgs);
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
			case ErziehungshilfePackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case ErziehungshilfePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case ErziehungshilfePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702:
				return getHilfenZurErziehungAnfrageHJV0702();
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_ANTRAG0701:
				return getHilfenZurErziehungAntrag0701();
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703:
				return getHilfenZurErziehungEingliederungshilfe0703();
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711:
				return getHilfenZurErziehungNachweisnachricht0711();
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704:
				return getHilfenZurErziehungWiderspruch0704();
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
			case ErziehungshilfePackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case ErziehungshilfePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case ErziehungshilfePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702:
				setHilfenZurErziehungAnfrageHJV0702((HilfenZurErziehungAnfrageHJV0702Type)newValue);
				return;
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_ANTRAG0701:
				setHilfenZurErziehungAntrag0701((HilfenZurErziehungAntrag0701Type)newValue);
				return;
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703:
				setHilfenZurErziehungEingliederungshilfe0703((HilfenZurErziehungEingliederungshilfe0703Type)newValue);
				return;
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711:
				setHilfenZurErziehungNachweisnachricht0711((HilfenZurErziehungNachweisnachricht0711Type)newValue);
				return;
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704:
				setHilfenZurErziehungWiderspruch0704((HilfenZurErziehungWiderspruch0704Type)newValue);
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
			case ErziehungshilfePackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case ErziehungshilfePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case ErziehungshilfePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702:
				setHilfenZurErziehungAnfrageHJV0702((HilfenZurErziehungAnfrageHJV0702Type)null);
				return;
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_ANTRAG0701:
				setHilfenZurErziehungAntrag0701((HilfenZurErziehungAntrag0701Type)null);
				return;
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703:
				setHilfenZurErziehungEingliederungshilfe0703((HilfenZurErziehungEingliederungshilfe0703Type)null);
				return;
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711:
				setHilfenZurErziehungNachweisnachricht0711((HilfenZurErziehungNachweisnachricht0711Type)null);
				return;
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704:
				setHilfenZurErziehungWiderspruch0704((HilfenZurErziehungWiderspruch0704Type)null);
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
			case ErziehungshilfePackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case ErziehungshilfePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case ErziehungshilfePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_ANFRAGE_HJV0702:
				return getHilfenZurErziehungAnfrageHJV0702() != null;
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_ANTRAG0701:
				return getHilfenZurErziehungAntrag0701() != null;
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_EINGLIEDERUNGSHILFE0703:
				return getHilfenZurErziehungEingliederungshilfe0703() != null;
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711:
				return getHilfenZurErziehungNachweisnachricht0711() != null;
			case ErziehungshilfePackage.DOCUMENT_ROOT__HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704:
				return getHilfenZurErziehungWiderspruch0704() != null;
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
