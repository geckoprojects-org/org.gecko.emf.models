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
package de.xoev.schemata.basisnachricht.g2g.basisg2g.impl;

import de.xoev.schemata.basisnachricht.behoerde.basisbehoerde.BehoerdeType;

import de.xoev.schemata.basisnachricht.g2g.basisg2g.BasisG2GPackage;
import de.xoev.schemata.basisnachricht.g2g.basisg2g.DocumentRoot;
import de.xoev.schemata.basisnachricht.g2g.basisg2g.IdentifikationNachrichtType;
import de.xoev.schemata.basisnachricht.g2g.basisg2g.NachrichtenkopfG2GType;

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
 *   <li>{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.impl.DocumentRootImpl#getAutor <em>Autor</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.impl.DocumentRootImpl#getIdentifikationNachricht <em>Identifikation Nachricht</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.impl.DocumentRootImpl#getLeser <em>Leser</em>}</li>
 *   <li>{@link de.xoev.schemata.basisnachricht.g2g.basisg2g.impl.DocumentRootImpl#getNachrichtenkopfG2g <em>Nachrichtenkopf G2g</em>}</li>
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
		return BasisG2GPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, BasisG2GPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, BasisG2GPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, BasisG2GPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehoerdeType getAutor() {
		return (BehoerdeType)getMixed().get(BasisG2GPackage.Literals.DOCUMENT_ROOT__AUTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutor(BehoerdeType newAutor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BasisG2GPackage.Literals.DOCUMENT_ROOT__AUTOR, newAutor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutor(BehoerdeType newAutor) {
		((FeatureMap.Internal)getMixed()).set(BasisG2GPackage.Literals.DOCUMENT_ROOT__AUTOR, newAutor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IdentifikationNachrichtType getIdentifikationNachricht() {
		return (IdentifikationNachrichtType)getMixed().get(BasisG2GPackage.Literals.DOCUMENT_ROOT__IDENTIFIKATION_NACHRICHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentifikationNachricht(IdentifikationNachrichtType newIdentifikationNachricht, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BasisG2GPackage.Literals.DOCUMENT_ROOT__IDENTIFIKATION_NACHRICHT, newIdentifikationNachricht, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifikationNachricht(IdentifikationNachrichtType newIdentifikationNachricht) {
		((FeatureMap.Internal)getMixed()).set(BasisG2GPackage.Literals.DOCUMENT_ROOT__IDENTIFIKATION_NACHRICHT, newIdentifikationNachricht);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehoerdeType getLeser() {
		return (BehoerdeType)getMixed().get(BasisG2GPackage.Literals.DOCUMENT_ROOT__LESER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeser(BehoerdeType newLeser, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BasisG2GPackage.Literals.DOCUMENT_ROOT__LESER, newLeser, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLeser(BehoerdeType newLeser) {
		((FeatureMap.Internal)getMixed()).set(BasisG2GPackage.Literals.DOCUMENT_ROOT__LESER, newLeser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachrichtenkopfG2GType getNachrichtenkopfG2g() {
		return (NachrichtenkopfG2GType)getMixed().get(BasisG2GPackage.Literals.DOCUMENT_ROOT__NACHRICHTENKOPF_G2G, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachrichtenkopfG2g(NachrichtenkopfG2GType newNachrichtenkopfG2g, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(BasisG2GPackage.Literals.DOCUMENT_ROOT__NACHRICHTENKOPF_G2G, newNachrichtenkopfG2g, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNachrichtenkopfG2g(NachrichtenkopfG2GType newNachrichtenkopfG2g) {
		((FeatureMap.Internal)getMixed()).set(BasisG2GPackage.Literals.DOCUMENT_ROOT__NACHRICHTENKOPF_G2G, newNachrichtenkopfG2g);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasisG2GPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case BasisG2GPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case BasisG2GPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case BasisG2GPackage.DOCUMENT_ROOT__AUTOR:
				return basicSetAutor(null, msgs);
			case BasisG2GPackage.DOCUMENT_ROOT__IDENTIFIKATION_NACHRICHT:
				return basicSetIdentifikationNachricht(null, msgs);
			case BasisG2GPackage.DOCUMENT_ROOT__LESER:
				return basicSetLeser(null, msgs);
			case BasisG2GPackage.DOCUMENT_ROOT__NACHRICHTENKOPF_G2G:
				return basicSetNachrichtenkopfG2g(null, msgs);
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
			case BasisG2GPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case BasisG2GPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case BasisG2GPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case BasisG2GPackage.DOCUMENT_ROOT__AUTOR:
				return getAutor();
			case BasisG2GPackage.DOCUMENT_ROOT__IDENTIFIKATION_NACHRICHT:
				return getIdentifikationNachricht();
			case BasisG2GPackage.DOCUMENT_ROOT__LESER:
				return getLeser();
			case BasisG2GPackage.DOCUMENT_ROOT__NACHRICHTENKOPF_G2G:
				return getNachrichtenkopfG2g();
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
			case BasisG2GPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case BasisG2GPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case BasisG2GPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case BasisG2GPackage.DOCUMENT_ROOT__AUTOR:
				setAutor((BehoerdeType)newValue);
				return;
			case BasisG2GPackage.DOCUMENT_ROOT__IDENTIFIKATION_NACHRICHT:
				setIdentifikationNachricht((IdentifikationNachrichtType)newValue);
				return;
			case BasisG2GPackage.DOCUMENT_ROOT__LESER:
				setLeser((BehoerdeType)newValue);
				return;
			case BasisG2GPackage.DOCUMENT_ROOT__NACHRICHTENKOPF_G2G:
				setNachrichtenkopfG2g((NachrichtenkopfG2GType)newValue);
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
			case BasisG2GPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case BasisG2GPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case BasisG2GPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case BasisG2GPackage.DOCUMENT_ROOT__AUTOR:
				setAutor((BehoerdeType)null);
				return;
			case BasisG2GPackage.DOCUMENT_ROOT__IDENTIFIKATION_NACHRICHT:
				setIdentifikationNachricht((IdentifikationNachrichtType)null);
				return;
			case BasisG2GPackage.DOCUMENT_ROOT__LESER:
				setLeser((BehoerdeType)null);
				return;
			case BasisG2GPackage.DOCUMENT_ROOT__NACHRICHTENKOPF_G2G:
				setNachrichtenkopfG2g((NachrichtenkopfG2GType)null);
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
			case BasisG2GPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case BasisG2GPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case BasisG2GPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case BasisG2GPackage.DOCUMENT_ROOT__AUTOR:
				return getAutor() != null;
			case BasisG2GPackage.DOCUMENT_ROOT__IDENTIFIKATION_NACHRICHT:
				return getIdentifikationNachricht() != null;
			case BasisG2GPackage.DOCUMENT_ROOT__LESER:
				return getLeser() != null;
			case BasisG2GPackage.DOCUMENT_ROOT__NACHRICHTENKOPF_G2G:
				return getNachrichtenkopfG2g() != null;
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
