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
package de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl;

import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeineNachrichtenPackage;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenQuittung0011Type;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.AllgemeinenachrichtenRueckweisung0001Type;
import de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.DocumentRoot;

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
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.DocumentRootImpl#getAllgemeinenachrichtenQuittung0011 <em>Allgemeinenachrichten Quittung0011</em>}</li>
 *   <li>{@link de.xoev.xfamilie.allgemeinenachrichten._1.allgemeinenachrichten.impl.DocumentRootImpl#getAllgemeinenachrichtenRueckweisung0001 <em>Allgemeinenachrichten Rueckweisung0001</em>}</li>
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
		return AllgemeineNachrichtenPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, AllgemeineNachrichtenPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, AllgemeineNachrichtenPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, AllgemeineNachrichtenPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllgemeinenachrichtenQuittung0011Type getAllgemeinenachrichtenQuittung0011() {
		return (AllgemeinenachrichtenQuittung0011Type)getMixed().get(AllgemeineNachrichtenPackage.Literals.DOCUMENT_ROOT__ALLGEMEINENACHRICHTEN_QUITTUNG0011, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllgemeinenachrichtenQuittung0011(AllgemeinenachrichtenQuittung0011Type newAllgemeinenachrichtenQuittung0011, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AllgemeineNachrichtenPackage.Literals.DOCUMENT_ROOT__ALLGEMEINENACHRICHTEN_QUITTUNG0011, newAllgemeinenachrichtenQuittung0011, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllgemeinenachrichtenQuittung0011(AllgemeinenachrichtenQuittung0011Type newAllgemeinenachrichtenQuittung0011) {
		((FeatureMap.Internal)getMixed()).set(AllgemeineNachrichtenPackage.Literals.DOCUMENT_ROOT__ALLGEMEINENACHRICHTEN_QUITTUNG0011, newAllgemeinenachrichtenQuittung0011);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllgemeinenachrichtenRueckweisung0001Type getAllgemeinenachrichtenRueckweisung0001() {
		return (AllgemeinenachrichtenRueckweisung0001Type)getMixed().get(AllgemeineNachrichtenPackage.Literals.DOCUMENT_ROOT__ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllgemeinenachrichtenRueckweisung0001(AllgemeinenachrichtenRueckweisung0001Type newAllgemeinenachrichtenRueckweisung0001, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AllgemeineNachrichtenPackage.Literals.DOCUMENT_ROOT__ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001, newAllgemeinenachrichtenRueckweisung0001, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllgemeinenachrichtenRueckweisung0001(AllgemeinenachrichtenRueckweisung0001Type newAllgemeinenachrichtenRueckweisung0001) {
		((FeatureMap.Internal)getMixed()).set(AllgemeineNachrichtenPackage.Literals.DOCUMENT_ROOT__ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001, newAllgemeinenachrichtenRueckweisung0001);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__ALLGEMEINENACHRICHTEN_QUITTUNG0011:
				return basicSetAllgemeinenachrichtenQuittung0011(null, msgs);
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001:
				return basicSetAllgemeinenachrichtenRueckweisung0001(null, msgs);
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
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__ALLGEMEINENACHRICHTEN_QUITTUNG0011:
				return getAllgemeinenachrichtenQuittung0011();
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001:
				return getAllgemeinenachrichtenRueckweisung0001();
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
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__ALLGEMEINENACHRICHTEN_QUITTUNG0011:
				setAllgemeinenachrichtenQuittung0011((AllgemeinenachrichtenQuittung0011Type)newValue);
				return;
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001:
				setAllgemeinenachrichtenRueckweisung0001((AllgemeinenachrichtenRueckweisung0001Type)newValue);
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
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__ALLGEMEINENACHRICHTEN_QUITTUNG0011:
				setAllgemeinenachrichtenQuittung0011((AllgemeinenachrichtenQuittung0011Type)null);
				return;
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001:
				setAllgemeinenachrichtenRueckweisung0001((AllgemeinenachrichtenRueckweisung0001Type)null);
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
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__ALLGEMEINENACHRICHTEN_QUITTUNG0011:
				return getAllgemeinenachrichtenQuittung0011() != null;
			case AllgemeineNachrichtenPackage.DOCUMENT_ROOT__ALLGEMEINENACHRICHTEN_RUECKWEISUNG0001:
				return getAllgemeinenachrichtenRueckweisung0001() != null;
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
