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
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.DatentypCodeType;
import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.FeldType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link de.xoev.domea.domea.impl.FeldTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.FeldTypeImpl#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.FeldTypeImpl#getDatentyp <em>Datentyp</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.FeldTypeImpl#getWert <em>Wert</em>}</li>
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
	 * The default value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected static final String BESCHREIBUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeschreibung() <em>Beschreibung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeschreibung()
	 * @generated
	 * @ordered
	 */
	protected String beschreibung = BESCHREIBUNG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatentyp() <em>Datentyp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatentyp()
	 * @generated
	 * @ordered
	 */
	protected DatentypCodeType datentyp;

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
		return DomeaPackage.Literals.FELD_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.FELD_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeschreibung() {
		return beschreibung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeschreibung(String newBeschreibung) {
		String oldBeschreibung = beschreibung;
		beschreibung = newBeschreibung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.FELD_TYPE__BESCHREIBUNG, oldBeschreibung, beschreibung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatentypCodeType getDatentyp() {
		return datentyp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatentyp(DatentypCodeType newDatentyp, NotificationChain msgs) {
		DatentypCodeType oldDatentyp = datentyp;
		datentyp = newDatentyp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.FELD_TYPE__DATENTYP, oldDatentyp, newDatentyp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatentyp(DatentypCodeType newDatentyp) {
		if (newDatentyp != datentyp) {
			NotificationChain msgs = null;
			if (datentyp != null)
				msgs = ((InternalEObject)datentyp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.FELD_TYPE__DATENTYP, null, msgs);
			if (newDatentyp != null)
				msgs = ((InternalEObject)newDatentyp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.FELD_TYPE__DATENTYP, null, msgs);
			msgs = basicSetDatentyp(newDatentyp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.FELD_TYPE__DATENTYP, newDatentyp, newDatentyp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.FELD_TYPE__WERT, oldWert, wert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.FELD_TYPE__DATENTYP:
				return basicSetDatentyp(null, msgs);
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
			case DomeaPackage.FELD_TYPE__NAME:
				return getName();
			case DomeaPackage.FELD_TYPE__BESCHREIBUNG:
				return getBeschreibung();
			case DomeaPackage.FELD_TYPE__DATENTYP:
				return getDatentyp();
			case DomeaPackage.FELD_TYPE__WERT:
				return getWert();
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
			case DomeaPackage.FELD_TYPE__NAME:
				setName((String)newValue);
				return;
			case DomeaPackage.FELD_TYPE__BESCHREIBUNG:
				setBeschreibung((String)newValue);
				return;
			case DomeaPackage.FELD_TYPE__DATENTYP:
				setDatentyp((DatentypCodeType)newValue);
				return;
			case DomeaPackage.FELD_TYPE__WERT:
				setWert((String)newValue);
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
			case DomeaPackage.FELD_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DomeaPackage.FELD_TYPE__BESCHREIBUNG:
				setBeschreibung(BESCHREIBUNG_EDEFAULT);
				return;
			case DomeaPackage.FELD_TYPE__DATENTYP:
				setDatentyp((DatentypCodeType)null);
				return;
			case DomeaPackage.FELD_TYPE__WERT:
				setWert(WERT_EDEFAULT);
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
			case DomeaPackage.FELD_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DomeaPackage.FELD_TYPE__BESCHREIBUNG:
				return BESCHREIBUNG_EDEFAULT == null ? beschreibung != null : !BESCHREIBUNG_EDEFAULT.equals(beschreibung);
			case DomeaPackage.FELD_TYPE__DATENTYP:
				return datentyp != null;
			case DomeaPackage.FELD_TYPE__WERT:
				return WERT_EDEFAULT == null ? wert != null : !WERT_EDEFAULT.equals(wert);
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
		result.append(", beschreibung: ");
		result.append(beschreibung);
		result.append(", wert: ");
		result.append(wert);
		result.append(')');
		return result.toString();
	}

} //FeldTypeImpl
