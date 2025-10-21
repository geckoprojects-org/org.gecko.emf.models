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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.DocumentRoot;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAbbruch0206Type;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrage0204Type;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAnfrageabschluss0205Type;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragAntrag0201Type;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragStandesamtsmeldung0203Type;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldantragVorabmeldung0202Type;

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
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.DocumentRootImpl#getElterngeldantragAbbruch0206 <em>Elterngeldantrag Abbruch0206</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.DocumentRootImpl#getElterngeldantragAnfrage0204 <em>Elterngeldantrag Anfrage0204</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.DocumentRootImpl#getElterngeldantragAnfrageabschluss0205 <em>Elterngeldantrag Anfrageabschluss0205</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.DocumentRootImpl#getElterngeldantragAntrag0201 <em>Elterngeldantrag Antrag0201</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.DocumentRootImpl#getElterngeldantragStandesamtsmeldung0203 <em>Elterngeldantrag Standesamtsmeldung0203</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.DocumentRootImpl#getElterngeldantragVorabmeldung0202 <em>Elterngeldantrag Vorabmeldung0202</em>}</li>
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
		return ElterngeldPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, ElterngeldPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ElterngeldPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ElterngeldPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElterngeldantragAbbruch0206Type getElterngeldantragAbbruch0206() {
		return (ElterngeldantragAbbruch0206Type)getMixed().get(ElterngeldPackage.eINSTANCE.getDocumentRoot_ElterngeldantragAbbruch0206(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElterngeldantragAbbruch0206(ElterngeldantragAbbruch0206Type newElterngeldantragAbbruch0206, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ElterngeldPackage.eINSTANCE.getDocumentRoot_ElterngeldantragAbbruch0206(), newElterngeldantragAbbruch0206, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElterngeldantragAbbruch0206(ElterngeldantragAbbruch0206Type newElterngeldantragAbbruch0206) {
		((FeatureMap.Internal)getMixed()).set(ElterngeldPackage.eINSTANCE.getDocumentRoot_ElterngeldantragAbbruch0206(), newElterngeldantragAbbruch0206);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElterngeldantragAnfrage0204Type getElterngeldantragAnfrage0204() {
		return (ElterngeldantragAnfrage0204Type)getMixed().get(ElterngeldPackage.eINSTANCE.getDocumentRoot_ElterngeldantragAnfrage0204(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElterngeldantragAnfrage0204(ElterngeldantragAnfrage0204Type newElterngeldantragAnfrage0204, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ElterngeldPackage.eINSTANCE.getDocumentRoot_ElterngeldantragAnfrage0204(), newElterngeldantragAnfrage0204, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElterngeldantragAnfrage0204(ElterngeldantragAnfrage0204Type newElterngeldantragAnfrage0204) {
		((FeatureMap.Internal)getMixed()).set(ElterngeldPackage.eINSTANCE.getDocumentRoot_ElterngeldantragAnfrage0204(), newElterngeldantragAnfrage0204);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElterngeldantragAnfrageabschluss0205Type getElterngeldantragAnfrageabschluss0205() {
		return (ElterngeldantragAnfrageabschluss0205Type)getMixed().get(ElterngeldPackage.eINSTANCE.getDocumentRoot_ElterngeldantragAnfrageabschluss0205(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElterngeldantragAnfrageabschluss0205(ElterngeldantragAnfrageabschluss0205Type newElterngeldantragAnfrageabschluss0205, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ElterngeldPackage.eINSTANCE.getDocumentRoot_ElterngeldantragAnfrageabschluss0205(), newElterngeldantragAnfrageabschluss0205, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElterngeldantragAnfrageabschluss0205(ElterngeldantragAnfrageabschluss0205Type newElterngeldantragAnfrageabschluss0205) {
		((FeatureMap.Internal)getMixed()).set(ElterngeldPackage.eINSTANCE.getDocumentRoot_ElterngeldantragAnfrageabschluss0205(), newElterngeldantragAnfrageabschluss0205);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElterngeldantragAntrag0201Type getElterngeldantragAntrag0201() {
		return (ElterngeldantragAntrag0201Type)getMixed().get(ElterngeldPackage.eINSTANCE.getDocumentRoot_ElterngeldantragAntrag0201(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElterngeldantragAntrag0201(ElterngeldantragAntrag0201Type newElterngeldantragAntrag0201, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ElterngeldPackage.eINSTANCE.getDocumentRoot_ElterngeldantragAntrag0201(), newElterngeldantragAntrag0201, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElterngeldantragAntrag0201(ElterngeldantragAntrag0201Type newElterngeldantragAntrag0201) {
		((FeatureMap.Internal)getMixed()).set(ElterngeldPackage.eINSTANCE.getDocumentRoot_ElterngeldantragAntrag0201(), newElterngeldantragAntrag0201);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElterngeldantragStandesamtsmeldung0203Type getElterngeldantragStandesamtsmeldung0203() {
		return (ElterngeldantragStandesamtsmeldung0203Type)getMixed().get(ElterngeldPackage.eINSTANCE.getDocumentRoot_ElterngeldantragStandesamtsmeldung0203(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElterngeldantragStandesamtsmeldung0203(ElterngeldantragStandesamtsmeldung0203Type newElterngeldantragStandesamtsmeldung0203, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ElterngeldPackage.eINSTANCE.getDocumentRoot_ElterngeldantragStandesamtsmeldung0203(), newElterngeldantragStandesamtsmeldung0203, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElterngeldantragStandesamtsmeldung0203(ElterngeldantragStandesamtsmeldung0203Type newElterngeldantragStandesamtsmeldung0203) {
		((FeatureMap.Internal)getMixed()).set(ElterngeldPackage.eINSTANCE.getDocumentRoot_ElterngeldantragStandesamtsmeldung0203(), newElterngeldantragStandesamtsmeldung0203);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElterngeldantragVorabmeldung0202Type getElterngeldantragVorabmeldung0202() {
		return (ElterngeldantragVorabmeldung0202Type)getMixed().get(ElterngeldPackage.eINSTANCE.getDocumentRoot_ElterngeldantragVorabmeldung0202(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElterngeldantragVorabmeldung0202(ElterngeldantragVorabmeldung0202Type newElterngeldantragVorabmeldung0202, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ElterngeldPackage.eINSTANCE.getDocumentRoot_ElterngeldantragVorabmeldung0202(), newElterngeldantragVorabmeldung0202, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElterngeldantragVorabmeldung0202(ElterngeldantragVorabmeldung0202Type newElterngeldantragVorabmeldung0202) {
		((FeatureMap.Internal)getMixed()).set(ElterngeldPackage.eINSTANCE.getDocumentRoot_ElterngeldantragVorabmeldung0202(), newElterngeldantragVorabmeldung0202);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_ABBRUCH0206:
				return basicSetElterngeldantragAbbruch0206(null, msgs);
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_ANFRAGE0204:
				return basicSetElterngeldantragAnfrage0204(null, msgs);
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205:
				return basicSetElterngeldantragAnfrageabschluss0205(null, msgs);
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_ANTRAG0201:
				return basicSetElterngeldantragAntrag0201(null, msgs);
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203:
				return basicSetElterngeldantragStandesamtsmeldung0203(null, msgs);
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_VORABMELDUNG0202:
				return basicSetElterngeldantragVorabmeldung0202(null, msgs);
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
			case ElterngeldPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case ElterngeldPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case ElterngeldPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_ABBRUCH0206:
				return getElterngeldantragAbbruch0206();
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_ANFRAGE0204:
				return getElterngeldantragAnfrage0204();
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205:
				return getElterngeldantragAnfrageabschluss0205();
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_ANTRAG0201:
				return getElterngeldantragAntrag0201();
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203:
				return getElterngeldantragStandesamtsmeldung0203();
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_VORABMELDUNG0202:
				return getElterngeldantragVorabmeldung0202();
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
			case ElterngeldPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case ElterngeldPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case ElterngeldPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_ABBRUCH0206:
				setElterngeldantragAbbruch0206((ElterngeldantragAbbruch0206Type)newValue);
				return;
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_ANFRAGE0204:
				setElterngeldantragAnfrage0204((ElterngeldantragAnfrage0204Type)newValue);
				return;
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205:
				setElterngeldantragAnfrageabschluss0205((ElterngeldantragAnfrageabschluss0205Type)newValue);
				return;
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_ANTRAG0201:
				setElterngeldantragAntrag0201((ElterngeldantragAntrag0201Type)newValue);
				return;
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203:
				setElterngeldantragStandesamtsmeldung0203((ElterngeldantragStandesamtsmeldung0203Type)newValue);
				return;
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_VORABMELDUNG0202:
				setElterngeldantragVorabmeldung0202((ElterngeldantragVorabmeldung0202Type)newValue);
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
			case ElterngeldPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case ElterngeldPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case ElterngeldPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_ABBRUCH0206:
				setElterngeldantragAbbruch0206((ElterngeldantragAbbruch0206Type)null);
				return;
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_ANFRAGE0204:
				setElterngeldantragAnfrage0204((ElterngeldantragAnfrage0204Type)null);
				return;
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205:
				setElterngeldantragAnfrageabschluss0205((ElterngeldantragAnfrageabschluss0205Type)null);
				return;
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_ANTRAG0201:
				setElterngeldantragAntrag0201((ElterngeldantragAntrag0201Type)null);
				return;
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203:
				setElterngeldantragStandesamtsmeldung0203((ElterngeldantragStandesamtsmeldung0203Type)null);
				return;
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_VORABMELDUNG0202:
				setElterngeldantragVorabmeldung0202((ElterngeldantragVorabmeldung0202Type)null);
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
			case ElterngeldPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case ElterngeldPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case ElterngeldPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_ABBRUCH0206:
				return getElterngeldantragAbbruch0206() != null;
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_ANFRAGE0204:
				return getElterngeldantragAnfrage0204() != null;
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_ANFRAGEABSCHLUSS0205:
				return getElterngeldantragAnfrageabschluss0205() != null;
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_ANTRAG0201:
				return getElterngeldantragAntrag0201() != null;
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_STANDESAMTSMELDUNG0203:
				return getElterngeldantragStandesamtsmeldung0203() != null;
			case ElterngeldPackage.DOCUMENT_ROOT__ELTERNGELDANTRAG_VORABMELDUNG0202:
				return getElterngeldantragVorabmeldung0202() != null;
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
