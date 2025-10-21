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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschBewilligungsantrag1001Type;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschVerwendungsnachweispruefung1002Type;

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
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.DocumentRootImpl#getKinderwunschBewilligungsantrag1001 <em>Kinderwunsch Bewilligungsantrag1001</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.DocumentRootImpl#getKinderwunschNachreichung1003 <em>Kinderwunsch Nachreichung1003</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.DocumentRootImpl#getKinderwunschVerwendungsnachweispruefung1002 <em>Kinderwunsch Verwendungsnachweispruefung1002</em>}</li>
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
		return KinderwunschPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, KinderwunschPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, KinderwunschPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, KinderwunschPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KinderwunschBewilligungsantrag1001Type getKinderwunschBewilligungsantrag1001() {
		return (KinderwunschBewilligungsantrag1001Type)getMixed().get(KinderwunschPackage.Literals.DOCUMENT_ROOT__KINDERWUNSCH_BEWILLIGUNGSANTRAG1001, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKinderwunschBewilligungsantrag1001(KinderwunschBewilligungsantrag1001Type newKinderwunschBewilligungsantrag1001, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KinderwunschPackage.Literals.DOCUMENT_ROOT__KINDERWUNSCH_BEWILLIGUNGSANTRAG1001, newKinderwunschBewilligungsantrag1001, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKinderwunschBewilligungsantrag1001(KinderwunschBewilligungsantrag1001Type newKinderwunschBewilligungsantrag1001) {
		((FeatureMap.Internal)getMixed()).set(KinderwunschPackage.Literals.DOCUMENT_ROOT__KINDERWUNSCH_BEWILLIGUNGSANTRAG1001, newKinderwunschBewilligungsantrag1001);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KinderwunschNachreichung1003Type getKinderwunschNachreichung1003() {
		return (KinderwunschNachreichung1003Type)getMixed().get(KinderwunschPackage.Literals.DOCUMENT_ROOT__KINDERWUNSCH_NACHREICHUNG1003, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKinderwunschNachreichung1003(KinderwunschNachreichung1003Type newKinderwunschNachreichung1003, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KinderwunschPackage.Literals.DOCUMENT_ROOT__KINDERWUNSCH_NACHREICHUNG1003, newKinderwunschNachreichung1003, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKinderwunschNachreichung1003(KinderwunschNachreichung1003Type newKinderwunschNachreichung1003) {
		((FeatureMap.Internal)getMixed()).set(KinderwunschPackage.Literals.DOCUMENT_ROOT__KINDERWUNSCH_NACHREICHUNG1003, newKinderwunschNachreichung1003);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KinderwunschVerwendungsnachweispruefung1002Type getKinderwunschVerwendungsnachweispruefung1002() {
		return (KinderwunschVerwendungsnachweispruefung1002Type)getMixed().get(KinderwunschPackage.Literals.DOCUMENT_ROOT__KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKinderwunschVerwendungsnachweispruefung1002(KinderwunschVerwendungsnachweispruefung1002Type newKinderwunschVerwendungsnachweispruefung1002, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(KinderwunschPackage.Literals.DOCUMENT_ROOT__KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002, newKinderwunschVerwendungsnachweispruefung1002, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKinderwunschVerwendungsnachweispruefung1002(KinderwunschVerwendungsnachweispruefung1002Type newKinderwunschVerwendungsnachweispruefung1002) {
		((FeatureMap.Internal)getMixed()).set(KinderwunschPackage.Literals.DOCUMENT_ROOT__KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002, newKinderwunschVerwendungsnachweispruefung1002);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KinderwunschPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case KinderwunschPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case KinderwunschPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case KinderwunschPackage.DOCUMENT_ROOT__KINDERWUNSCH_BEWILLIGUNGSANTRAG1001:
				return basicSetKinderwunschBewilligungsantrag1001(null, msgs);
			case KinderwunschPackage.DOCUMENT_ROOT__KINDERWUNSCH_NACHREICHUNG1003:
				return basicSetKinderwunschNachreichung1003(null, msgs);
			case KinderwunschPackage.DOCUMENT_ROOT__KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002:
				return basicSetKinderwunschVerwendungsnachweispruefung1002(null, msgs);
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
			case KinderwunschPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case KinderwunschPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case KinderwunschPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case KinderwunschPackage.DOCUMENT_ROOT__KINDERWUNSCH_BEWILLIGUNGSANTRAG1001:
				return getKinderwunschBewilligungsantrag1001();
			case KinderwunschPackage.DOCUMENT_ROOT__KINDERWUNSCH_NACHREICHUNG1003:
				return getKinderwunschNachreichung1003();
			case KinderwunschPackage.DOCUMENT_ROOT__KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002:
				return getKinderwunschVerwendungsnachweispruefung1002();
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
			case KinderwunschPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case KinderwunschPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case KinderwunschPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case KinderwunschPackage.DOCUMENT_ROOT__KINDERWUNSCH_BEWILLIGUNGSANTRAG1001:
				setKinderwunschBewilligungsantrag1001((KinderwunschBewilligungsantrag1001Type)newValue);
				return;
			case KinderwunschPackage.DOCUMENT_ROOT__KINDERWUNSCH_NACHREICHUNG1003:
				setKinderwunschNachreichung1003((KinderwunschNachreichung1003Type)newValue);
				return;
			case KinderwunschPackage.DOCUMENT_ROOT__KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002:
				setKinderwunschVerwendungsnachweispruefung1002((KinderwunschVerwendungsnachweispruefung1002Type)newValue);
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
			case KinderwunschPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case KinderwunschPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case KinderwunschPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case KinderwunschPackage.DOCUMENT_ROOT__KINDERWUNSCH_BEWILLIGUNGSANTRAG1001:
				setKinderwunschBewilligungsantrag1001((KinderwunschBewilligungsantrag1001Type)null);
				return;
			case KinderwunschPackage.DOCUMENT_ROOT__KINDERWUNSCH_NACHREICHUNG1003:
				setKinderwunschNachreichung1003((KinderwunschNachreichung1003Type)null);
				return;
			case KinderwunschPackage.DOCUMENT_ROOT__KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002:
				setKinderwunschVerwendungsnachweispruefung1002((KinderwunschVerwendungsnachweispruefung1002Type)null);
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
			case KinderwunschPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case KinderwunschPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case KinderwunschPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case KinderwunschPackage.DOCUMENT_ROOT__KINDERWUNSCH_BEWILLIGUNGSANTRAG1001:
				return getKinderwunschBewilligungsantrag1001() != null;
			case KinderwunschPackage.DOCUMENT_ROOT__KINDERWUNSCH_NACHREICHUNG1003:
				return getKinderwunschNachreichung1003() != null;
			case KinderwunschPackage.DOCUMENT_ROOT__KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002:
				return getKinderwunschVerwendungsnachweispruefung1002() != null;
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
