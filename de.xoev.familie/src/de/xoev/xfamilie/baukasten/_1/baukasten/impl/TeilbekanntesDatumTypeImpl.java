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
package de.xoev.xfamilie.baukasten._1.baukasten.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;
import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Teilbekanntes Datum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.TeilbekanntesDatumTypeImpl#getJahrMonatTag <em>Jahr Monat Tag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.TeilbekanntesDatumTypeImpl#getJahrMonat <em>Jahr Monat</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.TeilbekanntesDatumTypeImpl#getJahr <em>Jahr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeilbekanntesDatumTypeImpl extends MinimalEObjectImpl.Container implements TeilbekanntesDatumType {
	/**
	 * The default value of the '{@link #getJahrMonatTag() <em>Jahr Monat Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJahrMonatTag()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar JAHR_MONAT_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJahrMonatTag() <em>Jahr Monat Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJahrMonatTag()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar jahrMonatTag = JAHR_MONAT_TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getJahrMonat() <em>Jahr Monat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJahrMonat()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar JAHR_MONAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJahrMonat() <em>Jahr Monat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJahrMonat()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar jahrMonat = JAHR_MONAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getJahr() <em>Jahr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJahr()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar JAHR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJahr() <em>Jahr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJahr()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar jahr = JAHR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeilbekanntesDatumTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.TEILBEKANNTES_DATUM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getJahrMonatTag() {
		return jahrMonatTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJahrMonatTag(XMLGregorianCalendar newJahrMonatTag) {
		XMLGregorianCalendar oldJahrMonatTag = jahrMonatTag;
		jahrMonatTag = newJahrMonatTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.TEILBEKANNTES_DATUM_TYPE__JAHR_MONAT_TAG, oldJahrMonatTag, jahrMonatTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getJahrMonat() {
		return jahrMonat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJahrMonat(XMLGregorianCalendar newJahrMonat) {
		XMLGregorianCalendar oldJahrMonat = jahrMonat;
		jahrMonat = newJahrMonat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.TEILBEKANNTES_DATUM_TYPE__JAHR_MONAT, oldJahrMonat, jahrMonat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getJahr() {
		return jahr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJahr(XMLGregorianCalendar newJahr) {
		XMLGregorianCalendar oldJahr = jahr;
		jahr = newJahr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.TEILBEKANNTES_DATUM_TYPE__JAHR, oldJahr, jahr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BaukastenPackage.TEILBEKANNTES_DATUM_TYPE__JAHR_MONAT_TAG:
				return getJahrMonatTag();
			case BaukastenPackage.TEILBEKANNTES_DATUM_TYPE__JAHR_MONAT:
				return getJahrMonat();
			case BaukastenPackage.TEILBEKANNTES_DATUM_TYPE__JAHR:
				return getJahr();
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
			case BaukastenPackage.TEILBEKANNTES_DATUM_TYPE__JAHR_MONAT_TAG:
				setJahrMonatTag((XMLGregorianCalendar)newValue);
				return;
			case BaukastenPackage.TEILBEKANNTES_DATUM_TYPE__JAHR_MONAT:
				setJahrMonat((XMLGregorianCalendar)newValue);
				return;
			case BaukastenPackage.TEILBEKANNTES_DATUM_TYPE__JAHR:
				setJahr((XMLGregorianCalendar)newValue);
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
			case BaukastenPackage.TEILBEKANNTES_DATUM_TYPE__JAHR_MONAT_TAG:
				setJahrMonatTag(JAHR_MONAT_TAG_EDEFAULT);
				return;
			case BaukastenPackage.TEILBEKANNTES_DATUM_TYPE__JAHR_MONAT:
				setJahrMonat(JAHR_MONAT_EDEFAULT);
				return;
			case BaukastenPackage.TEILBEKANNTES_DATUM_TYPE__JAHR:
				setJahr(JAHR_EDEFAULT);
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
			case BaukastenPackage.TEILBEKANNTES_DATUM_TYPE__JAHR_MONAT_TAG:
				return JAHR_MONAT_TAG_EDEFAULT == null ? jahrMonatTag != null : !JAHR_MONAT_TAG_EDEFAULT.equals(jahrMonatTag);
			case BaukastenPackage.TEILBEKANNTES_DATUM_TYPE__JAHR_MONAT:
				return JAHR_MONAT_EDEFAULT == null ? jahrMonat != null : !JAHR_MONAT_EDEFAULT.equals(jahrMonat);
			case BaukastenPackage.TEILBEKANNTES_DATUM_TYPE__JAHR:
				return JAHR_EDEFAULT == null ? jahr != null : !JAHR_EDEFAULT.equals(jahr);
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
		result.append(" (jahrMonatTag: ");
		result.append(jahrMonatTag);
		result.append(", jahrMonat: ");
		result.append(jahrMonat);
		result.append(", jahr: ");
		result.append(jahr);
		result.append(')');
		return result.toString();
	}

} //TeilbekanntesDatumTypeImpl
