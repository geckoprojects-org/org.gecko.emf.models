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

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.AnschriftKindOptionalType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anschrift Kind Optional Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AnschriftKindOptionalTypeImpl#getHausnummer <em>Hausnummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AnschriftKindOptionalTypeImpl#getPostleitzahl <em>Postleitzahl</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AnschriftKindOptionalTypeImpl#getStrasse <em>Strasse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.AnschriftKindOptionalTypeImpl#getWohnort <em>Wohnort</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnschriftKindOptionalTypeImpl extends MinimalEObjectImpl.Container implements AnschriftKindOptionalType {
	/**
	 * The default value of the '{@link #getHausnummer() <em>Hausnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHausnummer()
	 * @generated
	 * @ordered
	 */
	protected static final String HAUSNUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHausnummer() <em>Hausnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHausnummer()
	 * @generated
	 * @ordered
	 */
	protected String hausnummer = HAUSNUMMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostleitzahl() <em>Postleitzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostleitzahl()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTLEITZAHL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostleitzahl() <em>Postleitzahl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostleitzahl()
	 * @generated
	 * @ordered
	 */
	protected String postleitzahl = POSTLEITZAHL_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrasse() <em>Strasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrasse()
	 * @generated
	 * @ordered
	 */
	protected static final String STRASSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStrasse() <em>Strasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrasse()
	 * @generated
	 * @ordered
	 */
	protected String strasse = STRASSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWohnort() <em>Wohnort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnort()
	 * @generated
	 * @ordered
	 */
	protected static final String WOHNORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWohnort() <em>Wohnort</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnort()
	 * @generated
	 * @ordered
	 */
	protected String wohnort = WOHNORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnschriftKindOptionalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getAnschriftKindOptionalType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHausnummer() {
		return hausnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHausnummer(String newHausnummer) {
		String oldHausnummer = hausnummer;
		hausnummer = newHausnummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ANSCHRIFT_KIND_OPTIONAL_TYPE__HAUSNUMMER, oldHausnummer, hausnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostleitzahl() {
		return postleitzahl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostleitzahl(String newPostleitzahl) {
		String oldPostleitzahl = postleitzahl;
		postleitzahl = newPostleitzahl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ANSCHRIFT_KIND_OPTIONAL_TYPE__POSTLEITZAHL, oldPostleitzahl, postleitzahl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStrasse() {
		return strasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStrasse(String newStrasse) {
		String oldStrasse = strasse;
		strasse = newStrasse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ANSCHRIFT_KIND_OPTIONAL_TYPE__STRASSE, oldStrasse, strasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWohnort() {
		return wohnort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWohnort(String newWohnort) {
		String oldWohnort = wohnort;
		wohnort = newWohnort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ANSCHRIFT_KIND_OPTIONAL_TYPE__WOHNORT, oldWohnort, wohnort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ElterngeldPackage.ANSCHRIFT_KIND_OPTIONAL_TYPE__HAUSNUMMER:
				return getHausnummer();
			case ElterngeldPackage.ANSCHRIFT_KIND_OPTIONAL_TYPE__POSTLEITZAHL:
				return getPostleitzahl();
			case ElterngeldPackage.ANSCHRIFT_KIND_OPTIONAL_TYPE__STRASSE:
				return getStrasse();
			case ElterngeldPackage.ANSCHRIFT_KIND_OPTIONAL_TYPE__WOHNORT:
				return getWohnort();
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
			case ElterngeldPackage.ANSCHRIFT_KIND_OPTIONAL_TYPE__HAUSNUMMER:
				setHausnummer((String)newValue);
				return;
			case ElterngeldPackage.ANSCHRIFT_KIND_OPTIONAL_TYPE__POSTLEITZAHL:
				setPostleitzahl((String)newValue);
				return;
			case ElterngeldPackage.ANSCHRIFT_KIND_OPTIONAL_TYPE__STRASSE:
				setStrasse((String)newValue);
				return;
			case ElterngeldPackage.ANSCHRIFT_KIND_OPTIONAL_TYPE__WOHNORT:
				setWohnort((String)newValue);
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
			case ElterngeldPackage.ANSCHRIFT_KIND_OPTIONAL_TYPE__HAUSNUMMER:
				setHausnummer(HAUSNUMMER_EDEFAULT);
				return;
			case ElterngeldPackage.ANSCHRIFT_KIND_OPTIONAL_TYPE__POSTLEITZAHL:
				setPostleitzahl(POSTLEITZAHL_EDEFAULT);
				return;
			case ElterngeldPackage.ANSCHRIFT_KIND_OPTIONAL_TYPE__STRASSE:
				setStrasse(STRASSE_EDEFAULT);
				return;
			case ElterngeldPackage.ANSCHRIFT_KIND_OPTIONAL_TYPE__WOHNORT:
				setWohnort(WOHNORT_EDEFAULT);
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
			case ElterngeldPackage.ANSCHRIFT_KIND_OPTIONAL_TYPE__HAUSNUMMER:
				return HAUSNUMMER_EDEFAULT == null ? hausnummer != null : !HAUSNUMMER_EDEFAULT.equals(hausnummer);
			case ElterngeldPackage.ANSCHRIFT_KIND_OPTIONAL_TYPE__POSTLEITZAHL:
				return POSTLEITZAHL_EDEFAULT == null ? postleitzahl != null : !POSTLEITZAHL_EDEFAULT.equals(postleitzahl);
			case ElterngeldPackage.ANSCHRIFT_KIND_OPTIONAL_TYPE__STRASSE:
				return STRASSE_EDEFAULT == null ? strasse != null : !STRASSE_EDEFAULT.equals(strasse);
			case ElterngeldPackage.ANSCHRIFT_KIND_OPTIONAL_TYPE__WOHNORT:
				return WOHNORT_EDEFAULT == null ? wohnort != null : !WOHNORT_EDEFAULT.equals(wohnort);
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
		result.append(" (hausnummer: ");
		result.append(hausnummer);
		result.append(", postleitzahl: ");
		result.append(postleitzahl);
		result.append(", strasse: ");
		result.append(strasse);
		result.append(", wohnort: ");
		result.append(wohnort);
		result.append(')');
		return result.toString();
	}

} //AnschriftKindOptionalTypeImpl
