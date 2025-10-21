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

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BerufsausbildungType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Berufsausbildung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BerufsausbildungTypeImpl#isBerufsbildung <em>Berufsbildung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BerufsausbildungTypeImpl#getZeitraum <em>Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BerufsausbildungTypeImpl#getWochenstundenJeTaetigkeit <em>Wochenstunden Je Taetigkeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BerufsausbildungTypeImpl extends MinimalEObjectImpl.Container implements BerufsausbildungType {
	/**
	 * The default value of the '{@link #isBerufsbildung() <em>Berufsbildung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBerufsbildung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BERUFSBILDUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBerufsbildung() <em>Berufsbildung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBerufsbildung()
	 * @generated
	 * @ordered
	 */
	protected boolean berufsbildung = BERUFSBILDUNG_EDEFAULT;

	/**
	 * This is true if the Berufsbildung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean berufsbildungESet;

	/**
	 * The default value of the '{@link #getZeitraum() <em>Zeitraum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraum()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ZEITRAUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZeitraum() <em>Zeitraum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraum()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar zeitraum = ZEITRAUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getWochenstundenJeTaetigkeit() <em>Wochenstunden Je Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWochenstundenJeTaetigkeit()
	 * @generated
	 * @ordered
	 */
	protected static final String WOCHENSTUNDEN_JE_TAETIGKEIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWochenstundenJeTaetigkeit() <em>Wochenstunden Je Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWochenstundenJeTaetigkeit()
	 * @generated
	 * @ordered
	 */
	protected String wochenstundenJeTaetigkeit = WOCHENSTUNDEN_JE_TAETIGKEIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BerufsausbildungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getBerufsausbildungType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBerufsbildung() {
		return berufsbildung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBerufsbildung(boolean newBerufsbildung) {
		boolean oldBerufsbildung = berufsbildung;
		berufsbildung = newBerufsbildung;
		boolean oldBerufsbildungESet = berufsbildungESet;
		berufsbildungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.BERUFSAUSBILDUNG_TYPE__BERUFSBILDUNG, oldBerufsbildung, berufsbildung, !oldBerufsbildungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBerufsbildung() {
		boolean oldBerufsbildung = berufsbildung;
		boolean oldBerufsbildungESet = berufsbildungESet;
		berufsbildung = BERUFSBILDUNG_EDEFAULT;
		berufsbildungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.BERUFSAUSBILDUNG_TYPE__BERUFSBILDUNG, oldBerufsbildung, BERUFSBILDUNG_EDEFAULT, oldBerufsbildungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBerufsbildung() {
		return berufsbildungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getZeitraum() {
		return zeitraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZeitraum(XMLGregorianCalendar newZeitraum) {
		XMLGregorianCalendar oldZeitraum = zeitraum;
		zeitraum = newZeitraum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.BERUFSAUSBILDUNG_TYPE__ZEITRAUM, oldZeitraum, zeitraum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWochenstundenJeTaetigkeit() {
		return wochenstundenJeTaetigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWochenstundenJeTaetigkeit(String newWochenstundenJeTaetigkeit) {
		String oldWochenstundenJeTaetigkeit = wochenstundenJeTaetigkeit;
		wochenstundenJeTaetigkeit = newWochenstundenJeTaetigkeit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.BERUFSAUSBILDUNG_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT, oldWochenstundenJeTaetigkeit, wochenstundenJeTaetigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ElterngeldPackage.BERUFSAUSBILDUNG_TYPE__BERUFSBILDUNG:
				return isBerufsbildung();
			case ElterngeldPackage.BERUFSAUSBILDUNG_TYPE__ZEITRAUM:
				return getZeitraum();
			case ElterngeldPackage.BERUFSAUSBILDUNG_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT:
				return getWochenstundenJeTaetigkeit();
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
			case ElterngeldPackage.BERUFSAUSBILDUNG_TYPE__BERUFSBILDUNG:
				setBerufsbildung((Boolean)newValue);
				return;
			case ElterngeldPackage.BERUFSAUSBILDUNG_TYPE__ZEITRAUM:
				setZeitraum((XMLGregorianCalendar)newValue);
				return;
			case ElterngeldPackage.BERUFSAUSBILDUNG_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT:
				setWochenstundenJeTaetigkeit((String)newValue);
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
			case ElterngeldPackage.BERUFSAUSBILDUNG_TYPE__BERUFSBILDUNG:
				unsetBerufsbildung();
				return;
			case ElterngeldPackage.BERUFSAUSBILDUNG_TYPE__ZEITRAUM:
				setZeitraum(ZEITRAUM_EDEFAULT);
				return;
			case ElterngeldPackage.BERUFSAUSBILDUNG_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT:
				setWochenstundenJeTaetigkeit(WOCHENSTUNDEN_JE_TAETIGKEIT_EDEFAULT);
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
			case ElterngeldPackage.BERUFSAUSBILDUNG_TYPE__BERUFSBILDUNG:
				return isSetBerufsbildung();
			case ElterngeldPackage.BERUFSAUSBILDUNG_TYPE__ZEITRAUM:
				return ZEITRAUM_EDEFAULT == null ? zeitraum != null : !ZEITRAUM_EDEFAULT.equals(zeitraum);
			case ElterngeldPackage.BERUFSAUSBILDUNG_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT:
				return WOCHENSTUNDEN_JE_TAETIGKEIT_EDEFAULT == null ? wochenstundenJeTaetigkeit != null : !WOCHENSTUNDEN_JE_TAETIGKEIT_EDEFAULT.equals(wochenstundenJeTaetigkeit);
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
		result.append(" (berufsbildung: ");
		if (berufsbildungESet) result.append(berufsbildung); else result.append("<unset>");
		result.append(", zeitraum: ");
		result.append(zeitraum);
		result.append(", wochenstundenJeTaetigkeit: ");
		result.append(wochenstundenJeTaetigkeit);
		result.append(')');
		return result.toString();
	}

} //BerufsausbildungTypeImpl
