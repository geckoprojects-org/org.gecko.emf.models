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
import de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zeitraum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.ZeitraumTypeImpl#getBeginn <em>Beginn</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.ZeitraumTypeImpl#getEnde <em>Ende</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZeitraumTypeImpl extends MinimalEObjectImpl.Container implements ZeitraumType {
	/**
	 * The default value of the '{@link #getBeginn() <em>Beginn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginn()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar BEGINN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeginn() <em>Beginn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginn()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar beginn = BEGINN_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnde() <em>Ende</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnde()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ENDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnde() <em>Ende</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnde()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar ende = ENDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZeitraumTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.ZEITRAUM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getBeginn() {
		return beginn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeginn(XMLGregorianCalendar newBeginn) {
		XMLGregorianCalendar oldBeginn = beginn;
		beginn = newBeginn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.ZEITRAUM_TYPE__BEGINN, oldBeginn, beginn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getEnde() {
		return ende;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnde(XMLGregorianCalendar newEnde) {
		XMLGregorianCalendar oldEnde = ende;
		ende = newEnde;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.ZEITRAUM_TYPE__ENDE, oldEnde, ende));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BaukastenPackage.ZEITRAUM_TYPE__BEGINN:
				return getBeginn();
			case BaukastenPackage.ZEITRAUM_TYPE__ENDE:
				return getEnde();
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
			case BaukastenPackage.ZEITRAUM_TYPE__BEGINN:
				setBeginn((XMLGregorianCalendar)newValue);
				return;
			case BaukastenPackage.ZEITRAUM_TYPE__ENDE:
				setEnde((XMLGregorianCalendar)newValue);
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
			case BaukastenPackage.ZEITRAUM_TYPE__BEGINN:
				setBeginn(BEGINN_EDEFAULT);
				return;
			case BaukastenPackage.ZEITRAUM_TYPE__ENDE:
				setEnde(ENDE_EDEFAULT);
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
			case BaukastenPackage.ZEITRAUM_TYPE__BEGINN:
				return BEGINN_EDEFAULT == null ? beginn != null : !BEGINN_EDEFAULT.equals(beginn);
			case BaukastenPackage.ZEITRAUM_TYPE__ENDE:
				return ENDE_EDEFAULT == null ? ende != null : !ENDE_EDEFAULT.equals(ende);
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
		result.append(" (beginn: ");
		result.append(beginn);
		result.append(", ende: ");
		result.append(ende);
		result.append(')');
		return result.toString();
	}

} //ZeitraumTypeImpl
