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
import de.xoev.xfamilie.baukasten._1.baukasten.HausnummernBisType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hausnummern Bis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.HausnummernBisTypeImpl#getHausnummerBis <em>Hausnummer Bis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.HausnummernBisTypeImpl#getHausnummerbuchstabezusatzzifferBis <em>Hausnummerbuchstabezusatzziffer Bis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.HausnummernBisTypeImpl#getTeilnummerderhausnummerBis <em>Teilnummerderhausnummer Bis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HausnummernBisTypeImpl extends MinimalEObjectImpl.Container implements HausnummernBisType {
	/**
	 * The default value of the '{@link #getHausnummerBis() <em>Hausnummer Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHausnummerBis()
	 * @generated
	 * @ordered
	 */
	protected static final String HAUSNUMMER_BIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHausnummerBis() <em>Hausnummer Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHausnummerBis()
	 * @generated
	 * @ordered
	 */
	protected String hausnummerBis = HAUSNUMMER_BIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHausnummerbuchstabezusatzzifferBis() <em>Hausnummerbuchstabezusatzziffer Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHausnummerbuchstabezusatzzifferBis()
	 * @generated
	 * @ordered
	 */
	protected static final String HAUSNUMMERBUCHSTABEZUSATZZIFFER_BIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHausnummerbuchstabezusatzzifferBis() <em>Hausnummerbuchstabezusatzziffer Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHausnummerbuchstabezusatzzifferBis()
	 * @generated
	 * @ordered
	 */
	protected String hausnummerbuchstabezusatzzifferBis = HAUSNUMMERBUCHSTABEZUSATZZIFFER_BIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTeilnummerderhausnummerBis() <em>Teilnummerderhausnummer Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeilnummerderhausnummerBis()
	 * @generated
	 * @ordered
	 */
	protected static final String TEILNUMMERDERHAUSNUMMER_BIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTeilnummerderhausnummerBis() <em>Teilnummerderhausnummer Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeilnummerderhausnummerBis()
	 * @generated
	 * @ordered
	 */
	protected String teilnummerderhausnummerBis = TEILNUMMERDERHAUSNUMMER_BIS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HausnummernBisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.HAUSNUMMERN_BIS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHausnummerBis() {
		return hausnummerBis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHausnummerBis(String newHausnummerBis) {
		String oldHausnummerBis = hausnummerBis;
		hausnummerBis = newHausnummerBis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.HAUSNUMMERN_BIS_TYPE__HAUSNUMMER_BIS, oldHausnummerBis, hausnummerBis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHausnummerbuchstabezusatzzifferBis() {
		return hausnummerbuchstabezusatzzifferBis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHausnummerbuchstabezusatzzifferBis(String newHausnummerbuchstabezusatzzifferBis) {
		String oldHausnummerbuchstabezusatzzifferBis = hausnummerbuchstabezusatzzifferBis;
		hausnummerbuchstabezusatzzifferBis = newHausnummerbuchstabezusatzzifferBis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.HAUSNUMMERN_BIS_TYPE__HAUSNUMMERBUCHSTABEZUSATZZIFFER_BIS, oldHausnummerbuchstabezusatzzifferBis, hausnummerbuchstabezusatzzifferBis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTeilnummerderhausnummerBis() {
		return teilnummerderhausnummerBis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTeilnummerderhausnummerBis(String newTeilnummerderhausnummerBis) {
		String oldTeilnummerderhausnummerBis = teilnummerderhausnummerBis;
		teilnummerderhausnummerBis = newTeilnummerderhausnummerBis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.HAUSNUMMERN_BIS_TYPE__TEILNUMMERDERHAUSNUMMER_BIS, oldTeilnummerderhausnummerBis, teilnummerderhausnummerBis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BaukastenPackage.HAUSNUMMERN_BIS_TYPE__HAUSNUMMER_BIS:
				return getHausnummerBis();
			case BaukastenPackage.HAUSNUMMERN_BIS_TYPE__HAUSNUMMERBUCHSTABEZUSATZZIFFER_BIS:
				return getHausnummerbuchstabezusatzzifferBis();
			case BaukastenPackage.HAUSNUMMERN_BIS_TYPE__TEILNUMMERDERHAUSNUMMER_BIS:
				return getTeilnummerderhausnummerBis();
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
			case BaukastenPackage.HAUSNUMMERN_BIS_TYPE__HAUSNUMMER_BIS:
				setHausnummerBis((String)newValue);
				return;
			case BaukastenPackage.HAUSNUMMERN_BIS_TYPE__HAUSNUMMERBUCHSTABEZUSATZZIFFER_BIS:
				setHausnummerbuchstabezusatzzifferBis((String)newValue);
				return;
			case BaukastenPackage.HAUSNUMMERN_BIS_TYPE__TEILNUMMERDERHAUSNUMMER_BIS:
				setTeilnummerderhausnummerBis((String)newValue);
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
			case BaukastenPackage.HAUSNUMMERN_BIS_TYPE__HAUSNUMMER_BIS:
				setHausnummerBis(HAUSNUMMER_BIS_EDEFAULT);
				return;
			case BaukastenPackage.HAUSNUMMERN_BIS_TYPE__HAUSNUMMERBUCHSTABEZUSATZZIFFER_BIS:
				setHausnummerbuchstabezusatzzifferBis(HAUSNUMMERBUCHSTABEZUSATZZIFFER_BIS_EDEFAULT);
				return;
			case BaukastenPackage.HAUSNUMMERN_BIS_TYPE__TEILNUMMERDERHAUSNUMMER_BIS:
				setTeilnummerderhausnummerBis(TEILNUMMERDERHAUSNUMMER_BIS_EDEFAULT);
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
			case BaukastenPackage.HAUSNUMMERN_BIS_TYPE__HAUSNUMMER_BIS:
				return HAUSNUMMER_BIS_EDEFAULT == null ? hausnummerBis != null : !HAUSNUMMER_BIS_EDEFAULT.equals(hausnummerBis);
			case BaukastenPackage.HAUSNUMMERN_BIS_TYPE__HAUSNUMMERBUCHSTABEZUSATZZIFFER_BIS:
				return HAUSNUMMERBUCHSTABEZUSATZZIFFER_BIS_EDEFAULT == null ? hausnummerbuchstabezusatzzifferBis != null : !HAUSNUMMERBUCHSTABEZUSATZZIFFER_BIS_EDEFAULT.equals(hausnummerbuchstabezusatzzifferBis);
			case BaukastenPackage.HAUSNUMMERN_BIS_TYPE__TEILNUMMERDERHAUSNUMMER_BIS:
				return TEILNUMMERDERHAUSNUMMER_BIS_EDEFAULT == null ? teilnummerderhausnummerBis != null : !TEILNUMMERDERHAUSNUMMER_BIS_EDEFAULT.equals(teilnummerderhausnummerBis);
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
		result.append(" (hausnummerBis: ");
		result.append(hausnummerBis);
		result.append(", hausnummerbuchstabezusatzzifferBis: ");
		result.append(hausnummerbuchstabezusatzzifferBis);
		result.append(", teilnummerderhausnummerBis: ");
		result.append(teilnummerderhausnummerBis);
		result.append(')');
		return result.toString();
	}

} //HausnummernBisTypeImpl
