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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.DocumentRoot;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragAntrag0301Type;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachreichen0303Type;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussantragNachweisnachricht0311Type;

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
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.DocumentRootImpl#getUnterhaltsvorschussantragAntrag0301 <em>Unterhaltsvorschussantrag Antrag0301</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.DocumentRootImpl#getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302 <em>Unterhaltsvorschussantrag Jaehrliche Ueberpruefung0302</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.DocumentRootImpl#getUnterhaltsvorschussantragNachreichen0303 <em>Unterhaltsvorschussantrag Nachreichen0303</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.DocumentRootImpl#getUnterhaltsvorschussantragNachweisnachricht0311 <em>Unterhaltsvorschussantrag Nachweisnachricht0311</em>}</li>
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
		return UnterhaltsvorschussPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, UnterhaltsvorschussPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, UnterhaltsvorschussPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, UnterhaltsvorschussPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnterhaltsvorschussantragAntrag0301Type getUnterhaltsvorschussantragAntrag0301() {
		return (UnterhaltsvorschussantragAntrag0301Type)getMixed().get(UnterhaltsvorschussPackage.eINSTANCE.getDocumentRoot_UnterhaltsvorschussantragAntrag0301(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnterhaltsvorschussantragAntrag0301(UnterhaltsvorschussantragAntrag0301Type newUnterhaltsvorschussantragAntrag0301, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UnterhaltsvorschussPackage.eINSTANCE.getDocumentRoot_UnterhaltsvorschussantragAntrag0301(), newUnterhaltsvorschussantragAntrag0301, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnterhaltsvorschussantragAntrag0301(UnterhaltsvorschussantragAntrag0301Type newUnterhaltsvorschussantragAntrag0301) {
		((FeatureMap.Internal)getMixed()).set(UnterhaltsvorschussPackage.eINSTANCE.getDocumentRoot_UnterhaltsvorschussantragAntrag0301(), newUnterhaltsvorschussantragAntrag0301);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302() {
		return (UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type)getMixed().get(UnterhaltsvorschussPackage.eINSTANCE.getDocumentRoot_UnterhaltsvorschussantragJaehrlicheUeberpruefung0302(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnterhaltsvorschussantragJaehrlicheUeberpruefung0302(UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type newUnterhaltsvorschussantragJaehrlicheUeberpruefung0302, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UnterhaltsvorschussPackage.eINSTANCE.getDocumentRoot_UnterhaltsvorschussantragJaehrlicheUeberpruefung0302(), newUnterhaltsvorschussantragJaehrlicheUeberpruefung0302, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnterhaltsvorschussantragJaehrlicheUeberpruefung0302(UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type newUnterhaltsvorschussantragJaehrlicheUeberpruefung0302) {
		((FeatureMap.Internal)getMixed()).set(UnterhaltsvorschussPackage.eINSTANCE.getDocumentRoot_UnterhaltsvorschussantragJaehrlicheUeberpruefung0302(), newUnterhaltsvorschussantragJaehrlicheUeberpruefung0302);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnterhaltsvorschussantragNachreichen0303Type getUnterhaltsvorschussantragNachreichen0303() {
		return (UnterhaltsvorschussantragNachreichen0303Type)getMixed().get(UnterhaltsvorschussPackage.eINSTANCE.getDocumentRoot_UnterhaltsvorschussantragNachreichen0303(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnterhaltsvorschussantragNachreichen0303(UnterhaltsvorschussantragNachreichen0303Type newUnterhaltsvorschussantragNachreichen0303, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UnterhaltsvorschussPackage.eINSTANCE.getDocumentRoot_UnterhaltsvorschussantragNachreichen0303(), newUnterhaltsvorschussantragNachreichen0303, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnterhaltsvorschussantragNachreichen0303(UnterhaltsvorschussantragNachreichen0303Type newUnterhaltsvorschussantragNachreichen0303) {
		((FeatureMap.Internal)getMixed()).set(UnterhaltsvorschussPackage.eINSTANCE.getDocumentRoot_UnterhaltsvorschussantragNachreichen0303(), newUnterhaltsvorschussantragNachreichen0303);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnterhaltsvorschussantragNachweisnachricht0311Type getUnterhaltsvorschussantragNachweisnachricht0311() {
		return (UnterhaltsvorschussantragNachweisnachricht0311Type)getMixed().get(UnterhaltsvorschussPackage.eINSTANCE.getDocumentRoot_UnterhaltsvorschussantragNachweisnachricht0311(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnterhaltsvorschussantragNachweisnachricht0311(UnterhaltsvorschussantragNachweisnachricht0311Type newUnterhaltsvorschussantragNachweisnachricht0311, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(UnterhaltsvorschussPackage.eINSTANCE.getDocumentRoot_UnterhaltsvorschussantragNachweisnachricht0311(), newUnterhaltsvorschussantragNachweisnachricht0311, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnterhaltsvorschussantragNachweisnachricht0311(UnterhaltsvorschussantragNachweisnachricht0311Type newUnterhaltsvorschussantragNachweisnachricht0311) {
		((FeatureMap.Internal)getMixed()).set(UnterhaltsvorschussPackage.eINSTANCE.getDocumentRoot_UnterhaltsvorschussantragNachweisnachricht0311(), newUnterhaltsvorschussantragNachweisnachricht0311);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301:
				return basicSetUnterhaltsvorschussantragAntrag0301(null, msgs);
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302:
				return basicSetUnterhaltsvorschussantragJaehrlicheUeberpruefung0302(null, msgs);
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303:
				return basicSetUnterhaltsvorschussantragNachreichen0303(null, msgs);
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311:
				return basicSetUnterhaltsvorschussantragNachweisnachricht0311(null, msgs);
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
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301:
				return getUnterhaltsvorschussantragAntrag0301();
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302:
				return getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302();
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303:
				return getUnterhaltsvorschussantragNachreichen0303();
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311:
				return getUnterhaltsvorschussantragNachweisnachricht0311();
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
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301:
				setUnterhaltsvorschussantragAntrag0301((UnterhaltsvorschussantragAntrag0301Type)newValue);
				return;
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302:
				setUnterhaltsvorschussantragJaehrlicheUeberpruefung0302((UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type)newValue);
				return;
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303:
				setUnterhaltsvorschussantragNachreichen0303((UnterhaltsvorschussantragNachreichen0303Type)newValue);
				return;
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311:
				setUnterhaltsvorschussantragNachweisnachricht0311((UnterhaltsvorschussantragNachweisnachricht0311Type)newValue);
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
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301:
				setUnterhaltsvorschussantragAntrag0301((UnterhaltsvorschussantragAntrag0301Type)null);
				return;
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302:
				setUnterhaltsvorschussantragJaehrlicheUeberpruefung0302((UnterhaltsvorschussantragJaehrlicheUeberpruefung0302Type)null);
				return;
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303:
				setUnterhaltsvorschussantragNachreichen0303((UnterhaltsvorschussantragNachreichen0303Type)null);
				return;
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311:
				setUnterhaltsvorschussantragNachweisnachricht0311((UnterhaltsvorschussantragNachweisnachricht0311Type)null);
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
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_ANTRAG0301:
				return getUnterhaltsvorschussantragAntrag0301() != null;
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_JAEHRLICHE_UEBERPRUEFUNG0302:
				return getUnterhaltsvorschussantragJaehrlicheUeberpruefung0302() != null;
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_NACHREICHEN0303:
				return getUnterhaltsvorschussantragNachreichen0303() != null;
			case UnterhaltsvorschussPackage.DOCUMENT_ROOT__UNTERHALTSVORSCHUSSANTRAG_NACHWEISNACHRICHT0311:
				return getUnterhaltsvorschussantragNachweisnachricht0311() != null;
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
