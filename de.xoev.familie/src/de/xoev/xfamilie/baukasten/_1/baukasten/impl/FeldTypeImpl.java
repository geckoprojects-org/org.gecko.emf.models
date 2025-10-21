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
import de.xoev.xfamilie.baukasten._1.baukasten.FeldType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feld Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.FeldTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.FeldTypeImpl#getWert <em>Wert</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.FeldTypeImpl#getLaufendeNummer <em>Laufende Nummer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeldTypeImpl extends MinimalEObjectImpl.Container implements FeldType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getWert() <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWert()
	 * @generated
	 * @ordered
	 */
	protected static final String WERT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWert() <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWert()
	 * @generated
	 * @ordered
	 */
	protected String wert = WERT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLaufendeNummer() <em>Laufende Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaufendeNummer()
	 * @generated
	 * @ordered
	 */
	protected static final String LAUFENDE_NUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLaufendeNummer() <em>Laufende Nummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaufendeNummer()
	 * @generated
	 * @ordered
	 */
	protected String laufendeNummer = LAUFENDE_NUMMER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeldTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.FELD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.FELD_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWert() {
		return wert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWert(String newWert) {
		String oldWert = wert;
		wert = newWert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.FELD_TYPE__WERT, oldWert, wert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLaufendeNummer() {
		return laufendeNummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLaufendeNummer(String newLaufendeNummer) {
		String oldLaufendeNummer = laufendeNummer;
		laufendeNummer = newLaufendeNummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.FELD_TYPE__LAUFENDE_NUMMER, oldLaufendeNummer, laufendeNummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BaukastenPackage.FELD_TYPE__NAME:
				return getName();
			case BaukastenPackage.FELD_TYPE__WERT:
				return getWert();
			case BaukastenPackage.FELD_TYPE__LAUFENDE_NUMMER:
				return getLaufendeNummer();
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
			case BaukastenPackage.FELD_TYPE__NAME:
				setName((String)newValue);
				return;
			case BaukastenPackage.FELD_TYPE__WERT:
				setWert((String)newValue);
				return;
			case BaukastenPackage.FELD_TYPE__LAUFENDE_NUMMER:
				setLaufendeNummer((String)newValue);
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
			case BaukastenPackage.FELD_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BaukastenPackage.FELD_TYPE__WERT:
				setWert(WERT_EDEFAULT);
				return;
			case BaukastenPackage.FELD_TYPE__LAUFENDE_NUMMER:
				setLaufendeNummer(LAUFENDE_NUMMER_EDEFAULT);
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
			case BaukastenPackage.FELD_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BaukastenPackage.FELD_TYPE__WERT:
				return WERT_EDEFAULT == null ? wert != null : !WERT_EDEFAULT.equals(wert);
			case BaukastenPackage.FELD_TYPE__LAUFENDE_NUMMER:
				return LAUFENDE_NUMMER_EDEFAULT == null ? laufendeNummer != null : !LAUFENDE_NUMMER_EDEFAULT.equals(laufendeNummer);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", wert: ");
		result.append(wert);
		result.append(", laufendeNummer: ");
		result.append(laufendeNummer);
		result.append(')');
		return result.toString();
	}

} //FeldTypeImpl
