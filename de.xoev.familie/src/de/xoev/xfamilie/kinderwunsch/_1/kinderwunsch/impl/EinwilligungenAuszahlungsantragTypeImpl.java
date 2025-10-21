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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenAuszahlungsantragType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Einwilligungen Auszahlungsantrag Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.EinwilligungenAuszahlungsantragTypeImpl#isZustimmungDatenschutz <em>Zustimmung Datenschutz</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.EinwilligungenAuszahlungsantragTypeImpl#isElektronischeBescheidzustellung <em>Elektronische Bescheidzustellung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EinwilligungenAuszahlungsantragTypeImpl extends MinimalEObjectImpl.Container implements EinwilligungenAuszahlungsantragType {
	/**
	 * The default value of the '{@link #isZustimmungDatenschutz() <em>Zustimmung Datenschutz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZustimmungDatenschutz()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZUSTIMMUNG_DATENSCHUTZ_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZustimmungDatenschutz() <em>Zustimmung Datenschutz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZustimmungDatenschutz()
	 * @generated
	 * @ordered
	 */
	protected boolean zustimmungDatenschutz = ZUSTIMMUNG_DATENSCHUTZ_EDEFAULT;

	/**
	 * This is true if the Zustimmung Datenschutz attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zustimmungDatenschutzESet;

	/**
	 * The default value of the '{@link #isElektronischeBescheidzustellung() <em>Elektronische Bescheidzustellung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElektronischeBescheidzustellung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ELEKTRONISCHE_BESCHEIDZUSTELLUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isElektronischeBescheidzustellung() <em>Elektronische Bescheidzustellung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isElektronischeBescheidzustellung()
	 * @generated
	 * @ordered
	 */
	protected boolean elektronischeBescheidzustellung = ELEKTRONISCHE_BESCHEIDZUSTELLUNG_EDEFAULT;

	/**
	 * This is true if the Elektronische Bescheidzustellung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean elektronischeBescheidzustellungESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EinwilligungenAuszahlungsantragTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZustimmungDatenschutz() {
		return zustimmungDatenschutz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZustimmungDatenschutz(boolean newZustimmungDatenschutz) {
		boolean oldZustimmungDatenschutz = zustimmungDatenschutz;
		zustimmungDatenschutz = newZustimmungDatenschutz;
		boolean oldZustimmungDatenschutzESet = zustimmungDatenschutzESet;
		zustimmungDatenschutzESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE__ZUSTIMMUNG_DATENSCHUTZ, oldZustimmungDatenschutz, zustimmungDatenschutz, !oldZustimmungDatenschutzESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZustimmungDatenschutz() {
		boolean oldZustimmungDatenschutz = zustimmungDatenschutz;
		boolean oldZustimmungDatenschutzESet = zustimmungDatenschutzESet;
		zustimmungDatenschutz = ZUSTIMMUNG_DATENSCHUTZ_EDEFAULT;
		zustimmungDatenschutzESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE__ZUSTIMMUNG_DATENSCHUTZ, oldZustimmungDatenschutz, ZUSTIMMUNG_DATENSCHUTZ_EDEFAULT, oldZustimmungDatenschutzESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZustimmungDatenschutz() {
		return zustimmungDatenschutzESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isElektronischeBescheidzustellung() {
		return elektronischeBescheidzustellung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElektronischeBescheidzustellung(boolean newElektronischeBescheidzustellung) {
		boolean oldElektronischeBescheidzustellung = elektronischeBescheidzustellung;
		elektronischeBescheidzustellung = newElektronischeBescheidzustellung;
		boolean oldElektronischeBescheidzustellungESet = elektronischeBescheidzustellungESet;
		elektronischeBescheidzustellungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE__ELEKTRONISCHE_BESCHEIDZUSTELLUNG, oldElektronischeBescheidzustellung, elektronischeBescheidzustellung, !oldElektronischeBescheidzustellungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetElektronischeBescheidzustellung() {
		boolean oldElektronischeBescheidzustellung = elektronischeBescheidzustellung;
		boolean oldElektronischeBescheidzustellungESet = elektronischeBescheidzustellungESet;
		elektronischeBescheidzustellung = ELEKTRONISCHE_BESCHEIDZUSTELLUNG_EDEFAULT;
		elektronischeBescheidzustellungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE__ELEKTRONISCHE_BESCHEIDZUSTELLUNG, oldElektronischeBescheidzustellung, ELEKTRONISCHE_BESCHEIDZUSTELLUNG_EDEFAULT, oldElektronischeBescheidzustellungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetElektronischeBescheidzustellung() {
		return elektronischeBescheidzustellungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KinderwunschPackage.EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE__ZUSTIMMUNG_DATENSCHUTZ:
				return isZustimmungDatenschutz();
			case KinderwunschPackage.EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE__ELEKTRONISCHE_BESCHEIDZUSTELLUNG:
				return isElektronischeBescheidzustellung();
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
			case KinderwunschPackage.EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE__ZUSTIMMUNG_DATENSCHUTZ:
				setZustimmungDatenschutz((Boolean)newValue);
				return;
			case KinderwunschPackage.EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE__ELEKTRONISCHE_BESCHEIDZUSTELLUNG:
				setElektronischeBescheidzustellung((Boolean)newValue);
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
			case KinderwunschPackage.EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE__ZUSTIMMUNG_DATENSCHUTZ:
				unsetZustimmungDatenschutz();
				return;
			case KinderwunschPackage.EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE__ELEKTRONISCHE_BESCHEIDZUSTELLUNG:
				unsetElektronischeBescheidzustellung();
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
			case KinderwunschPackage.EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE__ZUSTIMMUNG_DATENSCHUTZ:
				return isSetZustimmungDatenschutz();
			case KinderwunschPackage.EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE__ELEKTRONISCHE_BESCHEIDZUSTELLUNG:
				return isSetElektronischeBescheidzustellung();
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
		result.append(" (zustimmungDatenschutz: ");
		if (zustimmungDatenschutzESet) result.append(zustimmungDatenschutz); else result.append("<unset>");
		result.append(", elektronischeBescheidzustellung: ");
		if (elektronischeBescheidzustellungESet) result.append(elektronischeBescheidzustellung); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EinwilligungenAuszahlungsantragTypeImpl
