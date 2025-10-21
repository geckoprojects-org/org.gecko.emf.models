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

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenBewilligungType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Konfigurationsfragen Bewilligung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KonfigurationsfragenBewilligungTypeImpl#isGleicherHaushalt <em>Gleicher Haushalt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KonfigurationsfragenBewilligungTypeImpl extends MinimalEObjectImpl.Container implements KonfigurationsfragenBewilligungType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KonfigurationsfragenBewilligungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.KONFIGURATIONSFRAGEN_BEWILLIGUNG_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KONFIGURATIONSFRAGEN_BEWILLIGUNG_TYPE__GLEICHER_HAUSHALT, oldGleicherHaushalt, gleicherHaushalt, !oldGleicherHaushaltESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.KONFIGURATIONSFRAGEN_BEWILLIGUNG_TYPE__GLEICHER_HAUSHALT, oldGleicherHaushalt, GLEICHER_HAUSHALT_EDEFAULT, oldGleicherHaushaltESet));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KinderwunschPackage.KONFIGURATIONSFRAGEN_BEWILLIGUNG_TYPE__GLEICHER_HAUSHALT:
				return isGleicherHaushalt();
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
			case KinderwunschPackage.KONFIGURATIONSFRAGEN_BEWILLIGUNG_TYPE__GLEICHER_HAUSHALT:
				setGleicherHaushalt((Boolean)newValue);
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
			case KinderwunschPackage.KONFIGURATIONSFRAGEN_BEWILLIGUNG_TYPE__GLEICHER_HAUSHALT:
				unsetGleicherHaushalt();
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
			case KinderwunschPackage.KONFIGURATIONSFRAGEN_BEWILLIGUNG_TYPE__GLEICHER_HAUSHALT:
				return isSetGleicherHaushalt();
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

} //KonfigurationsfragenBewilligungTypeImpl
