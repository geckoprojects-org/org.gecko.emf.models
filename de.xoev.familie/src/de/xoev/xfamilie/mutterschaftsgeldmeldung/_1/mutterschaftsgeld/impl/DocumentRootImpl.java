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
package de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl;

import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.DocumentRoot;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type;
import de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type;

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
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.DocumentRootImpl#getMutterschaftsgeldmeldungAnforderung0501 <em>Mutterschaftsgeldmeldung Anforderung0501</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.impl.DocumentRootImpl#getMutterschaftsgeldmeldungRueckmeldung0502 <em>Mutterschaftsgeldmeldung Rueckmeldung0502</em>}</li>
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
		return MutterschaftsgeldPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, MutterschaftsgeldPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, MutterschaftsgeldPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, MutterschaftsgeldPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MutterschaftsgeldmeldungAnforderung0501Type getMutterschaftsgeldmeldungAnforderung0501() {
		return (MutterschaftsgeldmeldungAnforderung0501Type)getMixed().get(MutterschaftsgeldPackage.Literals.DOCUMENT_ROOT__MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMutterschaftsgeldmeldungAnforderung0501(MutterschaftsgeldmeldungAnforderung0501Type newMutterschaftsgeldmeldungAnforderung0501, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MutterschaftsgeldPackage.Literals.DOCUMENT_ROOT__MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501, newMutterschaftsgeldmeldungAnforderung0501, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMutterschaftsgeldmeldungAnforderung0501(MutterschaftsgeldmeldungAnforderung0501Type newMutterschaftsgeldmeldungAnforderung0501) {
		((FeatureMap.Internal)getMixed()).set(MutterschaftsgeldPackage.Literals.DOCUMENT_ROOT__MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501, newMutterschaftsgeldmeldungAnforderung0501);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MutterschaftsgeldmeldungRueckmeldung0502Type getMutterschaftsgeldmeldungRueckmeldung0502() {
		return (MutterschaftsgeldmeldungRueckmeldung0502Type)getMixed().get(MutterschaftsgeldPackage.Literals.DOCUMENT_ROOT__MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMutterschaftsgeldmeldungRueckmeldung0502(MutterschaftsgeldmeldungRueckmeldung0502Type newMutterschaftsgeldmeldungRueckmeldung0502, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(MutterschaftsgeldPackage.Literals.DOCUMENT_ROOT__MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502, newMutterschaftsgeldmeldungRueckmeldung0502, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMutterschaftsgeldmeldungRueckmeldung0502(MutterschaftsgeldmeldungRueckmeldung0502Type newMutterschaftsgeldmeldungRueckmeldung0502) {
		((FeatureMap.Internal)getMixed()).set(MutterschaftsgeldPackage.Literals.DOCUMENT_ROOT__MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502, newMutterschaftsgeldmeldungRueckmeldung0502);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501:
				return basicSetMutterschaftsgeldmeldungAnforderung0501(null, msgs);
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502:
				return basicSetMutterschaftsgeldmeldungRueckmeldung0502(null, msgs);
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
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501:
				return getMutterschaftsgeldmeldungAnforderung0501();
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502:
				return getMutterschaftsgeldmeldungRueckmeldung0502();
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
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501:
				setMutterschaftsgeldmeldungAnforderung0501((MutterschaftsgeldmeldungAnforderung0501Type)newValue);
				return;
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502:
				setMutterschaftsgeldmeldungRueckmeldung0502((MutterschaftsgeldmeldungRueckmeldung0502Type)newValue);
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
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501:
				setMutterschaftsgeldmeldungAnforderung0501((MutterschaftsgeldmeldungAnforderung0501Type)null);
				return;
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502:
				setMutterschaftsgeldmeldungRueckmeldung0502((MutterschaftsgeldmeldungRueckmeldung0502Type)null);
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
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__MUTTERSCHAFTSGELDMELDUNG_ANFORDERUNG0501:
				return getMutterschaftsgeldmeldungAnforderung0501() != null;
			case MutterschaftsgeldPackage.DOCUMENT_ROOT__MUTTERSCHAFTSGELDMELDUNG_RUECKMELDUNG0502:
				return getMutterschaftsgeldmeldungRueckmeldung0502() != null;
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
