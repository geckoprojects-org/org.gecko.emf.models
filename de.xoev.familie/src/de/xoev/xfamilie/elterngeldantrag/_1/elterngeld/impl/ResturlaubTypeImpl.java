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

import de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType;

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ResturlaubType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resturlaub Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ResturlaubTypeImpl#getAnzahlTage <em>Anzahl Tage</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ResturlaubTypeImpl#getZeitraum <em>Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ResturlaubTypeImpl#getAnzahlDerWochenstunden <em>Anzahl Der Wochenstunden</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResturlaubTypeImpl extends MinimalEObjectImpl.Container implements ResturlaubType {
	/**
	 * The default value of the '{@link #getAnzahlTage() <em>Anzahl Tage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlTage()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ANZAHL_TAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnzahlTage() <em>Anzahl Tage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlTage()
	 * @generated
	 * @ordered
	 */
	protected BigInteger anzahlTage = ANZAHL_TAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getZeitraum() <em>Zeitraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraum()
	 * @generated
	 * @ordered
	 */
	protected ZeitraumType zeitraum;

	/**
	 * The default value of the '{@link #getAnzahlDerWochenstunden() <em>Anzahl Der Wochenstunden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlDerWochenstunden()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ANZAHL_DER_WOCHENSTUNDEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnzahlDerWochenstunden() <em>Anzahl Der Wochenstunden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnzahlDerWochenstunden()
	 * @generated
	 * @ordered
	 */
	protected BigInteger anzahlDerWochenstunden = ANZAHL_DER_WOCHENSTUNDEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResturlaubTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getResturlaubType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getAnzahlTage() {
		return anzahlTage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnzahlTage(BigInteger newAnzahlTage) {
		BigInteger oldAnzahlTage = anzahlTage;
		anzahlTage = newAnzahlTage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.RESTURLAUB_TYPE__ANZAHL_TAGE, oldAnzahlTage, anzahlTage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZeitraumType getZeitraum() {
		return zeitraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZeitraum(ZeitraumType newZeitraum, NotificationChain msgs) {
		ZeitraumType oldZeitraum = zeitraum;
		zeitraum = newZeitraum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ElterngeldPackage.RESTURLAUB_TYPE__ZEITRAUM, oldZeitraum, newZeitraum);
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
	public void setZeitraum(ZeitraumType newZeitraum) {
		if (newZeitraum != zeitraum) {
			NotificationChain msgs = null;
			if (zeitraum != null)
				msgs = ((InternalEObject)zeitraum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.RESTURLAUB_TYPE__ZEITRAUM, null, msgs);
			if (newZeitraum != null)
				msgs = ((InternalEObject)newZeitraum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ElterngeldPackage.RESTURLAUB_TYPE__ZEITRAUM, null, msgs);
			msgs = basicSetZeitraum(newZeitraum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.RESTURLAUB_TYPE__ZEITRAUM, newZeitraum, newZeitraum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getAnzahlDerWochenstunden() {
		return anzahlDerWochenstunden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnzahlDerWochenstunden(BigInteger newAnzahlDerWochenstunden) {
		BigInteger oldAnzahlDerWochenstunden = anzahlDerWochenstunden;
		anzahlDerWochenstunden = newAnzahlDerWochenstunden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.RESTURLAUB_TYPE__ANZAHL_DER_WOCHENSTUNDEN, oldAnzahlDerWochenstunden, anzahlDerWochenstunden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ElterngeldPackage.RESTURLAUB_TYPE__ZEITRAUM:
				return basicSetZeitraum(null, msgs);
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
			case ElterngeldPackage.RESTURLAUB_TYPE__ANZAHL_TAGE:
				return getAnzahlTage();
			case ElterngeldPackage.RESTURLAUB_TYPE__ZEITRAUM:
				return getZeitraum();
			case ElterngeldPackage.RESTURLAUB_TYPE__ANZAHL_DER_WOCHENSTUNDEN:
				return getAnzahlDerWochenstunden();
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
			case ElterngeldPackage.RESTURLAUB_TYPE__ANZAHL_TAGE:
				setAnzahlTage((BigInteger)newValue);
				return;
			case ElterngeldPackage.RESTURLAUB_TYPE__ZEITRAUM:
				setZeitraum((ZeitraumType)newValue);
				return;
			case ElterngeldPackage.RESTURLAUB_TYPE__ANZAHL_DER_WOCHENSTUNDEN:
				setAnzahlDerWochenstunden((BigInteger)newValue);
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
			case ElterngeldPackage.RESTURLAUB_TYPE__ANZAHL_TAGE:
				setAnzahlTage(ANZAHL_TAGE_EDEFAULT);
				return;
			case ElterngeldPackage.RESTURLAUB_TYPE__ZEITRAUM:
				setZeitraum((ZeitraumType)null);
				return;
			case ElterngeldPackage.RESTURLAUB_TYPE__ANZAHL_DER_WOCHENSTUNDEN:
				setAnzahlDerWochenstunden(ANZAHL_DER_WOCHENSTUNDEN_EDEFAULT);
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
			case ElterngeldPackage.RESTURLAUB_TYPE__ANZAHL_TAGE:
				return ANZAHL_TAGE_EDEFAULT == null ? anzahlTage != null : !ANZAHL_TAGE_EDEFAULT.equals(anzahlTage);
			case ElterngeldPackage.RESTURLAUB_TYPE__ZEITRAUM:
				return zeitraum != null;
			case ElterngeldPackage.RESTURLAUB_TYPE__ANZAHL_DER_WOCHENSTUNDEN:
				return ANZAHL_DER_WOCHENSTUNDEN_EDEFAULT == null ? anzahlDerWochenstunden != null : !ANZAHL_DER_WOCHENSTUNDEN_EDEFAULT.equals(anzahlDerWochenstunden);
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
		result.append(" (anzahlTage: ");
		result.append(anzahlTage);
		result.append(", anzahlDerWochenstunden: ");
		result.append(anzahlDerWochenstunden);
		result.append(')');
		return result.toString();
	}

} //ResturlaubTypeImpl
