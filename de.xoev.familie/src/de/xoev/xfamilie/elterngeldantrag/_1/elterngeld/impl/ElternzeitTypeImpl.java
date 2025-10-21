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

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElternzeitType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elternzeit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternzeitTypeImpl#getZeitraumVon <em>Zeitraum Von</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.ElternzeitTypeImpl#getZeitraumBis <em>Zeitraum Bis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElternzeitTypeImpl extends MinimalEObjectImpl.Container implements ElternzeitType {
	/**
	 * The default value of the '{@link #getZeitraumVon() <em>Zeitraum Von</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraumVon()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ZEITRAUM_VON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZeitraumVon() <em>Zeitraum Von</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraumVon()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar zeitraumVon = ZEITRAUM_VON_EDEFAULT;

	/**
	 * The default value of the '{@link #getZeitraumBis() <em>Zeitraum Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraumBis()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ZEITRAUM_BIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZeitraumBis() <em>Zeitraum Bis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraumBis()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar zeitraumBis = ZEITRAUM_BIS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElternzeitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getElternzeitType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getZeitraumVon() {
		return zeitraumVon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZeitraumVon(XMLGregorianCalendar newZeitraumVon) {
		XMLGregorianCalendar oldZeitraumVon = zeitraumVon;
		zeitraumVon = newZeitraumVon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNZEIT_TYPE__ZEITRAUM_VON, oldZeitraumVon, zeitraumVon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getZeitraumBis() {
		return zeitraumBis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZeitraumBis(XMLGregorianCalendar newZeitraumBis) {
		XMLGregorianCalendar oldZeitraumBis = zeitraumBis;
		zeitraumBis = newZeitraumBis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.ELTERNZEIT_TYPE__ZEITRAUM_BIS, oldZeitraumBis, zeitraumBis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ElterngeldPackage.ELTERNZEIT_TYPE__ZEITRAUM_VON:
				return getZeitraumVon();
			case ElterngeldPackage.ELTERNZEIT_TYPE__ZEITRAUM_BIS:
				return getZeitraumBis();
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
			case ElterngeldPackage.ELTERNZEIT_TYPE__ZEITRAUM_VON:
				setZeitraumVon((XMLGregorianCalendar)newValue);
				return;
			case ElterngeldPackage.ELTERNZEIT_TYPE__ZEITRAUM_BIS:
				setZeitraumBis((XMLGregorianCalendar)newValue);
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
			case ElterngeldPackage.ELTERNZEIT_TYPE__ZEITRAUM_VON:
				setZeitraumVon(ZEITRAUM_VON_EDEFAULT);
				return;
			case ElterngeldPackage.ELTERNZEIT_TYPE__ZEITRAUM_BIS:
				setZeitraumBis(ZEITRAUM_BIS_EDEFAULT);
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
			case ElterngeldPackage.ELTERNZEIT_TYPE__ZEITRAUM_VON:
				return ZEITRAUM_VON_EDEFAULT == null ? zeitraumVon != null : !ZEITRAUM_VON_EDEFAULT.equals(zeitraumVon);
			case ElterngeldPackage.ELTERNZEIT_TYPE__ZEITRAUM_BIS:
				return ZEITRAUM_BIS_EDEFAULT == null ? zeitraumBis != null : !ZEITRAUM_BIS_EDEFAULT.equals(zeitraumBis);
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
		result.append(" (zeitraumVon: ");
		result.append(zeitraumVon);
		result.append(", zeitraumBis: ");
		result.append(zeitraumBis);
		result.append(')');
		return result.toString();
	}

} //ElternzeitTypeImpl
