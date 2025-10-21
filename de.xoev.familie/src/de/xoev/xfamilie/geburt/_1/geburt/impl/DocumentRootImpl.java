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
package de.xoev.xfamilie.geburt._1.geburt.impl;

import de.xoev.xfamilie.geburt._1.geburt.DocumentRoot;
import de.xoev.xfamilie.geburt._1.geburt.GeburtPackage;
import de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAntrag0801Type;
import de.xoev.xfamilie.geburt._1.geburt.SorgeAlleinsorgeAuskunft0803Type;
import de.xoev.xfamilie.geburt._1.geburt.SorgeErklaerungVorbeitung0802Type;
import de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterEintragung0804Type;
import de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterKorrektur0805Type;
import de.xoev.xfamilie.geburt._1.geburt.SorgeNachweisregisterLoeschung0806Type;

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
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.DocumentRootImpl#getSorgeAlleinsorgeAntrag0801 <em>Sorge Alleinsorge Antrag0801</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.DocumentRootImpl#getSorgeAlleinsorgeAuskunft0803 <em>Sorge Alleinsorge Auskunft0803</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.DocumentRootImpl#getSorgeErklaerungVorbeitung0802 <em>Sorge Erklaerung Vorbeitung0802</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.DocumentRootImpl#getSorgeNachweisregisterEintragung0804 <em>Sorge Nachweisregister Eintragung0804</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.DocumentRootImpl#getSorgeNachweisregisterKorrektur0805 <em>Sorge Nachweisregister Korrektur0805</em>}</li>
 *   <li>{@link de.xoev.xfamilie.geburt._1.geburt.impl.DocumentRootImpl#getSorgeNachweisregisterLoeschung0806 <em>Sorge Nachweisregister Loeschung0806</em>}</li>
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
		return GeburtPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, GeburtPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, GeburtPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, GeburtPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SorgeAlleinsorgeAntrag0801Type getSorgeAlleinsorgeAntrag0801() {
		return (SorgeAlleinsorgeAntrag0801Type)getMixed().get(GeburtPackage.Literals.DOCUMENT_ROOT__SORGE_ALLEINSORGE_ANTRAG0801, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSorgeAlleinsorgeAntrag0801(SorgeAlleinsorgeAntrag0801Type newSorgeAlleinsorgeAntrag0801, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GeburtPackage.Literals.DOCUMENT_ROOT__SORGE_ALLEINSORGE_ANTRAG0801, newSorgeAlleinsorgeAntrag0801, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSorgeAlleinsorgeAntrag0801(SorgeAlleinsorgeAntrag0801Type newSorgeAlleinsorgeAntrag0801) {
		((FeatureMap.Internal)getMixed()).set(GeburtPackage.Literals.DOCUMENT_ROOT__SORGE_ALLEINSORGE_ANTRAG0801, newSorgeAlleinsorgeAntrag0801);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SorgeAlleinsorgeAuskunft0803Type getSorgeAlleinsorgeAuskunft0803() {
		return (SorgeAlleinsorgeAuskunft0803Type)getMixed().get(GeburtPackage.Literals.DOCUMENT_ROOT__SORGE_ALLEINSORGE_AUSKUNFT0803, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSorgeAlleinsorgeAuskunft0803(SorgeAlleinsorgeAuskunft0803Type newSorgeAlleinsorgeAuskunft0803, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GeburtPackage.Literals.DOCUMENT_ROOT__SORGE_ALLEINSORGE_AUSKUNFT0803, newSorgeAlleinsorgeAuskunft0803, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSorgeAlleinsorgeAuskunft0803(SorgeAlleinsorgeAuskunft0803Type newSorgeAlleinsorgeAuskunft0803) {
		((FeatureMap.Internal)getMixed()).set(GeburtPackage.Literals.DOCUMENT_ROOT__SORGE_ALLEINSORGE_AUSKUNFT0803, newSorgeAlleinsorgeAuskunft0803);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SorgeErklaerungVorbeitung0802Type getSorgeErklaerungVorbeitung0802() {
		return (SorgeErklaerungVorbeitung0802Type)getMixed().get(GeburtPackage.Literals.DOCUMENT_ROOT__SORGE_ERKLAERUNG_VORBEITUNG0802, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSorgeErklaerungVorbeitung0802(SorgeErklaerungVorbeitung0802Type newSorgeErklaerungVorbeitung0802, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GeburtPackage.Literals.DOCUMENT_ROOT__SORGE_ERKLAERUNG_VORBEITUNG0802, newSorgeErklaerungVorbeitung0802, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSorgeErklaerungVorbeitung0802(SorgeErklaerungVorbeitung0802Type newSorgeErklaerungVorbeitung0802) {
		((FeatureMap.Internal)getMixed()).set(GeburtPackage.Literals.DOCUMENT_ROOT__SORGE_ERKLAERUNG_VORBEITUNG0802, newSorgeErklaerungVorbeitung0802);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SorgeNachweisregisterEintragung0804Type getSorgeNachweisregisterEintragung0804() {
		return (SorgeNachweisregisterEintragung0804Type)getMixed().get(GeburtPackage.Literals.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_EINTRAGUNG0804, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSorgeNachweisregisterEintragung0804(SorgeNachweisregisterEintragung0804Type newSorgeNachweisregisterEintragung0804, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GeburtPackage.Literals.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_EINTRAGUNG0804, newSorgeNachweisregisterEintragung0804, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSorgeNachweisregisterEintragung0804(SorgeNachweisregisterEintragung0804Type newSorgeNachweisregisterEintragung0804) {
		((FeatureMap.Internal)getMixed()).set(GeburtPackage.Literals.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_EINTRAGUNG0804, newSorgeNachweisregisterEintragung0804);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SorgeNachweisregisterKorrektur0805Type getSorgeNachweisregisterKorrektur0805() {
		return (SorgeNachweisregisterKorrektur0805Type)getMixed().get(GeburtPackage.Literals.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_KORREKTUR0805, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSorgeNachweisregisterKorrektur0805(SorgeNachweisregisterKorrektur0805Type newSorgeNachweisregisterKorrektur0805, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GeburtPackage.Literals.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_KORREKTUR0805, newSorgeNachweisregisterKorrektur0805, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSorgeNachweisregisterKorrektur0805(SorgeNachweisregisterKorrektur0805Type newSorgeNachweisregisterKorrektur0805) {
		((FeatureMap.Internal)getMixed()).set(GeburtPackage.Literals.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_KORREKTUR0805, newSorgeNachweisregisterKorrektur0805);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SorgeNachweisregisterLoeschung0806Type getSorgeNachweisregisterLoeschung0806() {
		return (SorgeNachweisregisterLoeschung0806Type)getMixed().get(GeburtPackage.Literals.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_LOESCHUNG0806, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSorgeNachweisregisterLoeschung0806(SorgeNachweisregisterLoeschung0806Type newSorgeNachweisregisterLoeschung0806, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(GeburtPackage.Literals.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_LOESCHUNG0806, newSorgeNachweisregisterLoeschung0806, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSorgeNachweisregisterLoeschung0806(SorgeNachweisregisterLoeschung0806Type newSorgeNachweisregisterLoeschung0806) {
		((FeatureMap.Internal)getMixed()).set(GeburtPackage.Literals.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_LOESCHUNG0806, newSorgeNachweisregisterLoeschung0806);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeburtPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case GeburtPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case GeburtPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case GeburtPackage.DOCUMENT_ROOT__SORGE_ALLEINSORGE_ANTRAG0801:
				return basicSetSorgeAlleinsorgeAntrag0801(null, msgs);
			case GeburtPackage.DOCUMENT_ROOT__SORGE_ALLEINSORGE_AUSKUNFT0803:
				return basicSetSorgeAlleinsorgeAuskunft0803(null, msgs);
			case GeburtPackage.DOCUMENT_ROOT__SORGE_ERKLAERUNG_VORBEITUNG0802:
				return basicSetSorgeErklaerungVorbeitung0802(null, msgs);
			case GeburtPackage.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_EINTRAGUNG0804:
				return basicSetSorgeNachweisregisterEintragung0804(null, msgs);
			case GeburtPackage.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_KORREKTUR0805:
				return basicSetSorgeNachweisregisterKorrektur0805(null, msgs);
			case GeburtPackage.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_LOESCHUNG0806:
				return basicSetSorgeNachweisregisterLoeschung0806(null, msgs);
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
			case GeburtPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case GeburtPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case GeburtPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case GeburtPackage.DOCUMENT_ROOT__SORGE_ALLEINSORGE_ANTRAG0801:
				return getSorgeAlleinsorgeAntrag0801();
			case GeburtPackage.DOCUMENT_ROOT__SORGE_ALLEINSORGE_AUSKUNFT0803:
				return getSorgeAlleinsorgeAuskunft0803();
			case GeburtPackage.DOCUMENT_ROOT__SORGE_ERKLAERUNG_VORBEITUNG0802:
				return getSorgeErklaerungVorbeitung0802();
			case GeburtPackage.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_EINTRAGUNG0804:
				return getSorgeNachweisregisterEintragung0804();
			case GeburtPackage.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_KORREKTUR0805:
				return getSorgeNachweisregisterKorrektur0805();
			case GeburtPackage.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_LOESCHUNG0806:
				return getSorgeNachweisregisterLoeschung0806();
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
			case GeburtPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case GeburtPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case GeburtPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case GeburtPackage.DOCUMENT_ROOT__SORGE_ALLEINSORGE_ANTRAG0801:
				setSorgeAlleinsorgeAntrag0801((SorgeAlleinsorgeAntrag0801Type)newValue);
				return;
			case GeburtPackage.DOCUMENT_ROOT__SORGE_ALLEINSORGE_AUSKUNFT0803:
				setSorgeAlleinsorgeAuskunft0803((SorgeAlleinsorgeAuskunft0803Type)newValue);
				return;
			case GeburtPackage.DOCUMENT_ROOT__SORGE_ERKLAERUNG_VORBEITUNG0802:
				setSorgeErklaerungVorbeitung0802((SorgeErklaerungVorbeitung0802Type)newValue);
				return;
			case GeburtPackage.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_EINTRAGUNG0804:
				setSorgeNachweisregisterEintragung0804((SorgeNachweisregisterEintragung0804Type)newValue);
				return;
			case GeburtPackage.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_KORREKTUR0805:
				setSorgeNachweisregisterKorrektur0805((SorgeNachweisregisterKorrektur0805Type)newValue);
				return;
			case GeburtPackage.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_LOESCHUNG0806:
				setSorgeNachweisregisterLoeschung0806((SorgeNachweisregisterLoeschung0806Type)newValue);
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
			case GeburtPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case GeburtPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case GeburtPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case GeburtPackage.DOCUMENT_ROOT__SORGE_ALLEINSORGE_ANTRAG0801:
				setSorgeAlleinsorgeAntrag0801((SorgeAlleinsorgeAntrag0801Type)null);
				return;
			case GeburtPackage.DOCUMENT_ROOT__SORGE_ALLEINSORGE_AUSKUNFT0803:
				setSorgeAlleinsorgeAuskunft0803((SorgeAlleinsorgeAuskunft0803Type)null);
				return;
			case GeburtPackage.DOCUMENT_ROOT__SORGE_ERKLAERUNG_VORBEITUNG0802:
				setSorgeErklaerungVorbeitung0802((SorgeErklaerungVorbeitung0802Type)null);
				return;
			case GeburtPackage.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_EINTRAGUNG0804:
				setSorgeNachweisregisterEintragung0804((SorgeNachweisregisterEintragung0804Type)null);
				return;
			case GeburtPackage.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_KORREKTUR0805:
				setSorgeNachweisregisterKorrektur0805((SorgeNachweisregisterKorrektur0805Type)null);
				return;
			case GeburtPackage.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_LOESCHUNG0806:
				setSorgeNachweisregisterLoeschung0806((SorgeNachweisregisterLoeschung0806Type)null);
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
			case GeburtPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case GeburtPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case GeburtPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case GeburtPackage.DOCUMENT_ROOT__SORGE_ALLEINSORGE_ANTRAG0801:
				return getSorgeAlleinsorgeAntrag0801() != null;
			case GeburtPackage.DOCUMENT_ROOT__SORGE_ALLEINSORGE_AUSKUNFT0803:
				return getSorgeAlleinsorgeAuskunft0803() != null;
			case GeburtPackage.DOCUMENT_ROOT__SORGE_ERKLAERUNG_VORBEITUNG0802:
				return getSorgeErklaerungVorbeitung0802() != null;
			case GeburtPackage.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_EINTRAGUNG0804:
				return getSorgeNachweisregisterEintragung0804() != null;
			case GeburtPackage.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_KORREKTUR0805:
				return getSorgeNachweisregisterKorrektur0805() != null;
			case GeburtPackage.DOCUMENT_ROOT__SORGE_NACHWEISREGISTER_LOESCHUNG0806:
				return getSorgeNachweisregisterLoeschung0806() != null;
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
