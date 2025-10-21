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

import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltszahlungenType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unterhaltszahlungen Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltszahlungenTypeImpl#getZeitpunktDerZahlung <em>Zeitpunkt Der Zahlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.UnterhaltszahlungenTypeImpl#getHoeheDerZahlung <em>Hoehe Der Zahlung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnterhaltszahlungenTypeImpl extends MinimalEObjectImpl.Container implements UnterhaltszahlungenType {
	/**
	 * The cached value of the '{@link #getZeitpunktDerZahlung() <em>Zeitpunkt Der Zahlung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitpunktDerZahlung()
	 * @generated
	 * @ordered
	 */
	protected TeilbekanntesDatumType zeitpunktDerZahlung;

	/**
	 * The default value of the '{@link #getHoeheDerZahlung() <em>Hoehe Der Zahlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoeheDerZahlung()
	 * @generated
	 * @ordered
	 */
	protected static final String HOEHE_DER_ZAHLUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHoeheDerZahlung() <em>Hoehe Der Zahlung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoeheDerZahlung()
	 * @generated
	 * @ordered
	 */
	protected String hoeheDerZahlung = HOEHE_DER_ZAHLUNG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnterhaltszahlungenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getUnterhaltszahlungenType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeilbekanntesDatumType getZeitpunktDerZahlung() {
		return zeitpunktDerZahlung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZeitpunktDerZahlung(TeilbekanntesDatumType newZeitpunktDerZahlung, NotificationChain msgs) {
		TeilbekanntesDatumType oldZeitpunktDerZahlung = zeitpunktDerZahlung;
		zeitpunktDerZahlung = newZeitpunktDerZahlung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSZAHLUNGEN_TYPE__ZEITPUNKT_DER_ZAHLUNG, oldZeitpunktDerZahlung, newZeitpunktDerZahlung);
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
	public void setZeitpunktDerZahlung(TeilbekanntesDatumType newZeitpunktDerZahlung) {
		if (newZeitpunktDerZahlung != zeitpunktDerZahlung) {
			NotificationChain msgs = null;
			if (zeitpunktDerZahlung != null)
				msgs = ((InternalEObject)zeitpunktDerZahlung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSZAHLUNGEN_TYPE__ZEITPUNKT_DER_ZAHLUNG, null, msgs);
			if (newZeitpunktDerZahlung != null)
				msgs = ((InternalEObject)newZeitpunktDerZahlung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.UNTERHALTSZAHLUNGEN_TYPE__ZEITPUNKT_DER_ZAHLUNG, null, msgs);
			msgs = basicSetZeitpunktDerZahlung(newZeitpunktDerZahlung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSZAHLUNGEN_TYPE__ZEITPUNKT_DER_ZAHLUNG, newZeitpunktDerZahlung, newZeitpunktDerZahlung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHoeheDerZahlung() {
		return hoeheDerZahlung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHoeheDerZahlung(String newHoeheDerZahlung) {
		String oldHoeheDerZahlung = hoeheDerZahlung;
		hoeheDerZahlung = newHoeheDerZahlung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.UNTERHALTSZAHLUNGEN_TYPE__HOEHE_DER_ZAHLUNG, oldHoeheDerZahlung, hoeheDerZahlung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.UNTERHALTSZAHLUNGEN_TYPE__ZEITPUNKT_DER_ZAHLUNG:
				return basicSetZeitpunktDerZahlung(null, msgs);
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
			case UnterhaltsvorschussPackage.UNTERHALTSZAHLUNGEN_TYPE__ZEITPUNKT_DER_ZAHLUNG:
				return getZeitpunktDerZahlung();
			case UnterhaltsvorschussPackage.UNTERHALTSZAHLUNGEN_TYPE__HOEHE_DER_ZAHLUNG:
				return getHoeheDerZahlung();
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
			case UnterhaltsvorschussPackage.UNTERHALTSZAHLUNGEN_TYPE__ZEITPUNKT_DER_ZAHLUNG:
				setZeitpunktDerZahlung((TeilbekanntesDatumType)newValue);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSZAHLUNGEN_TYPE__HOEHE_DER_ZAHLUNG:
				setHoeheDerZahlung((String)newValue);
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
			case UnterhaltsvorschussPackage.UNTERHALTSZAHLUNGEN_TYPE__ZEITPUNKT_DER_ZAHLUNG:
				setZeitpunktDerZahlung((TeilbekanntesDatumType)null);
				return;
			case UnterhaltsvorschussPackage.UNTERHALTSZAHLUNGEN_TYPE__HOEHE_DER_ZAHLUNG:
				setHoeheDerZahlung(HOEHE_DER_ZAHLUNG_EDEFAULT);
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
			case UnterhaltsvorschussPackage.UNTERHALTSZAHLUNGEN_TYPE__ZEITPUNKT_DER_ZAHLUNG:
				return zeitpunktDerZahlung != null;
			case UnterhaltsvorschussPackage.UNTERHALTSZAHLUNGEN_TYPE__HOEHE_DER_ZAHLUNG:
				return HOEHE_DER_ZAHLUNG_EDEFAULT == null ? hoeheDerZahlung != null : !HOEHE_DER_ZAHLUNG_EDEFAULT.equals(hoeheDerZahlung);
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
		result.append(" (hoeheDerZahlung: ");
		result.append(hoeheDerZahlung);
		result.append(')');
		return result.toString();
	}

} //UnterhaltszahlungenTypeImpl
