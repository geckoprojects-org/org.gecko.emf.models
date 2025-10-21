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
package de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl;

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderAdoption0901Type;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionundpflegekinderPflegekinder0902Type;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.DocumentRoot;

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
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.DocumentRootImpl#getAdoptionundpflegekinderAdoption0901 <em>Adoptionundpflegekinder Adoption0901</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.DocumentRootImpl#getAdoptionundpflegekinderPflegekinder0902 <em>Adoptionundpflegekinder Pflegekinder0902</em>}</li>
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
		return AdoptionPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, AdoptionPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, AdoptionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, AdoptionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdoptionundpflegekinderAdoption0901Type getAdoptionundpflegekinderAdoption0901() {
		return (AdoptionundpflegekinderAdoption0901Type)getMixed().get(AdoptionPackage.Literals.DOCUMENT_ROOT__ADOPTIONUNDPFLEGEKINDER_ADOPTION0901, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdoptionundpflegekinderAdoption0901(AdoptionundpflegekinderAdoption0901Type newAdoptionundpflegekinderAdoption0901, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AdoptionPackage.Literals.DOCUMENT_ROOT__ADOPTIONUNDPFLEGEKINDER_ADOPTION0901, newAdoptionundpflegekinderAdoption0901, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdoptionundpflegekinderAdoption0901(AdoptionundpflegekinderAdoption0901Type newAdoptionundpflegekinderAdoption0901) {
		((FeatureMap.Internal)getMixed()).set(AdoptionPackage.Literals.DOCUMENT_ROOT__ADOPTIONUNDPFLEGEKINDER_ADOPTION0901, newAdoptionundpflegekinderAdoption0901);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdoptionundpflegekinderPflegekinder0902Type getAdoptionundpflegekinderPflegekinder0902() {
		return (AdoptionundpflegekinderPflegekinder0902Type)getMixed().get(AdoptionPackage.Literals.DOCUMENT_ROOT__ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdoptionundpflegekinderPflegekinder0902(AdoptionundpflegekinderPflegekinder0902Type newAdoptionundpflegekinderPflegekinder0902, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(AdoptionPackage.Literals.DOCUMENT_ROOT__ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902, newAdoptionundpflegekinderPflegekinder0902, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdoptionundpflegekinderPflegekinder0902(AdoptionundpflegekinderPflegekinder0902Type newAdoptionundpflegekinderPflegekinder0902) {
		((FeatureMap.Internal)getMixed()).set(AdoptionPackage.Literals.DOCUMENT_ROOT__ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902, newAdoptionundpflegekinderPflegekinder0902);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case AdoptionPackage.DOCUMENT_ROOT__ADOPTIONUNDPFLEGEKINDER_ADOPTION0901:
				return basicSetAdoptionundpflegekinderAdoption0901(null, msgs);
			case AdoptionPackage.DOCUMENT_ROOT__ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902:
				return basicSetAdoptionundpflegekinderPflegekinder0902(null, msgs);
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
			case AdoptionPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case AdoptionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case AdoptionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case AdoptionPackage.DOCUMENT_ROOT__ADOPTIONUNDPFLEGEKINDER_ADOPTION0901:
				return getAdoptionundpflegekinderAdoption0901();
			case AdoptionPackage.DOCUMENT_ROOT__ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902:
				return getAdoptionundpflegekinderPflegekinder0902();
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
			case AdoptionPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case AdoptionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case AdoptionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case AdoptionPackage.DOCUMENT_ROOT__ADOPTIONUNDPFLEGEKINDER_ADOPTION0901:
				setAdoptionundpflegekinderAdoption0901((AdoptionundpflegekinderAdoption0901Type)newValue);
				return;
			case AdoptionPackage.DOCUMENT_ROOT__ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902:
				setAdoptionundpflegekinderPflegekinder0902((AdoptionundpflegekinderPflegekinder0902Type)newValue);
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
			case AdoptionPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case AdoptionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case AdoptionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case AdoptionPackage.DOCUMENT_ROOT__ADOPTIONUNDPFLEGEKINDER_ADOPTION0901:
				setAdoptionundpflegekinderAdoption0901((AdoptionundpflegekinderAdoption0901Type)null);
				return;
			case AdoptionPackage.DOCUMENT_ROOT__ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902:
				setAdoptionundpflegekinderPflegekinder0902((AdoptionundpflegekinderPflegekinder0902Type)null);
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
			case AdoptionPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case AdoptionPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case AdoptionPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case AdoptionPackage.DOCUMENT_ROOT__ADOPTIONUNDPFLEGEKINDER_ADOPTION0901:
				return getAdoptionundpflegekinderAdoption0901() != null;
			case AdoptionPackage.DOCUMENT_ROOT__ADOPTIONUNDPFLEGEKINDER_PFLEGEKINDER0902:
				return getAdoptionundpflegekinderPflegekinder0902() != null;
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
