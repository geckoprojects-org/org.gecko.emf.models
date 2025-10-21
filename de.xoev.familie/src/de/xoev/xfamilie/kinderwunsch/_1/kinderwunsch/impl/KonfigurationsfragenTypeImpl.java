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

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Konfigurationsfragen Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KonfigurationsfragenTypeImpl#isGleicherHaushalt <em>Gleicher Haushalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KonfigurationsfragenTypeImpl#getAngabenZurBehandlung <em>Angaben Zur Behandlung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KonfigurationsfragenTypeImpl extends MinimalEObjectImpl.Container implements KonfigurationsfragenType {
	/**
	 * The default value of the '{@link #isGleicherHaushalt() <em>Gleicher Haushalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGleicherHaushalt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GLEICHER_HAUSHALT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGleicherHaushalt() <em>Gleicher Haushalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGleicherHaushalt()
	 * @generated
	 * @ordered
	 */
	protected boolean gleicherHaushalt = GLEICHER_HAUSHALT_EDEFAULT;

	/**
	 * This is true if the Gleicher Haushalt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gleicherHaushaltESet;

	/**
	 * The cached value of the '{@link #getAngabenZurBehandlung() <em>Angaben Zur Behandlung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenZurBehandlung()
	 * @generated
	 * @ordered
	 */
	protected ArtDerBehandlungType angabenZurBehandlung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KonfigurationsfragenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.KONFIGURATIONSFRAGEN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGleicherHaushalt() {
		return gleicherHaushalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGleicherHaushalt(boolean newGleicherHaushalt) {
		boolean oldGleicherHaushalt = gleicherHaushalt;
		gleicherHaushalt = newGleicherHaushalt;
		boolean oldGleicherHaushaltESet = gleicherHaushaltESet;
		gleicherHaushaltESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KONFIGURATIONSFRAGEN_TYPE__GLEICHER_HAUSHALT, oldGleicherHaushalt, gleicherHaushalt, !oldGleicherHaushaltESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGleicherHaushalt() {
		boolean oldGleicherHaushalt = gleicherHaushalt;
		boolean oldGleicherHaushaltESet = gleicherHaushaltESet;
		gleicherHaushalt = GLEICHER_HAUSHALT_EDEFAULT;
		gleicherHaushaltESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.KONFIGURATIONSFRAGEN_TYPE__GLEICHER_HAUSHALT, oldGleicherHaushalt, GLEICHER_HAUSHALT_EDEFAULT, oldGleicherHaushaltESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGleicherHaushalt() {
		return gleicherHaushaltESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtDerBehandlungType getAngabenZurBehandlung() {
		return angabenZurBehandlung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenZurBehandlung(ArtDerBehandlungType newAngabenZurBehandlung, NotificationChain msgs) {
		ArtDerBehandlungType oldAngabenZurBehandlung = angabenZurBehandlung;
		angabenZurBehandlung = newAngabenZurBehandlung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KONFIGURATIONSFRAGEN_TYPE__ANGABEN_ZUR_BEHANDLUNG, oldAngabenZurBehandlung, newAngabenZurBehandlung);
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
	public void setAngabenZurBehandlung(ArtDerBehandlungType newAngabenZurBehandlung) {
		if (newAngabenZurBehandlung != angabenZurBehandlung) {
			NotificationChain msgs = null;
			if (angabenZurBehandlung != null)
				msgs = ((InternalEObject)angabenZurBehandlung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.KONFIGURATIONSFRAGEN_TYPE__ANGABEN_ZUR_BEHANDLUNG, null, msgs);
			if (newAngabenZurBehandlung != null)
				msgs = ((InternalEObject)newAngabenZurBehandlung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.KONFIGURATIONSFRAGEN_TYPE__ANGABEN_ZUR_BEHANDLUNG, null, msgs);
			msgs = basicSetAngabenZurBehandlung(newAngabenZurBehandlung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KONFIGURATIONSFRAGEN_TYPE__ANGABEN_ZUR_BEHANDLUNG, newAngabenZurBehandlung, newAngabenZurBehandlung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KinderwunschPackage.KONFIGURATIONSFRAGEN_TYPE__ANGABEN_ZUR_BEHANDLUNG:
				return basicSetAngabenZurBehandlung(null, msgs);
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
			case KinderwunschPackage.KONFIGURATIONSFRAGEN_TYPE__GLEICHER_HAUSHALT:
				return isGleicherHaushalt();
			case KinderwunschPackage.KONFIGURATIONSFRAGEN_TYPE__ANGABEN_ZUR_BEHANDLUNG:
				return getAngabenZurBehandlung();
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
			case KinderwunschPackage.KONFIGURATIONSFRAGEN_TYPE__GLEICHER_HAUSHALT:
				setGleicherHaushalt((Boolean)newValue);
				return;
			case KinderwunschPackage.KONFIGURATIONSFRAGEN_TYPE__ANGABEN_ZUR_BEHANDLUNG:
				setAngabenZurBehandlung((ArtDerBehandlungType)newValue);
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
			case KinderwunschPackage.KONFIGURATIONSFRAGEN_TYPE__GLEICHER_HAUSHALT:
				unsetGleicherHaushalt();
				return;
			case KinderwunschPackage.KONFIGURATIONSFRAGEN_TYPE__ANGABEN_ZUR_BEHANDLUNG:
				setAngabenZurBehandlung((ArtDerBehandlungType)null);
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
			case KinderwunschPackage.KONFIGURATIONSFRAGEN_TYPE__GLEICHER_HAUSHALT:
				return isSetGleicherHaushalt();
			case KinderwunschPackage.KONFIGURATIONSFRAGEN_TYPE__ANGABEN_ZUR_BEHANDLUNG:
				return angabenZurBehandlung != null;
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
		result.append(" (gleicherHaushalt: ");
		if (gleicherHaushaltESet) result.append(gleicherHaushalt); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //KonfigurationsfragenTypeImpl
