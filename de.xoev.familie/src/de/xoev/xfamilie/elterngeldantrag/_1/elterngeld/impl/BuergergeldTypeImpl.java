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

import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.BuergergeldType;
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Buergergeld Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BuergergeldTypeImpl#isBezugBuergergeld <em>Bezug Buergergeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BuergergeldTypeImpl#getBeginnZeitraumBuergergeld <em>Beginn Zeitraum Buergergeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.BuergergeldTypeImpl#getEndeZeitraumBuergergeld <em>Ende Zeitraum Buergergeld</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuergergeldTypeImpl extends MinimalEObjectImpl.Container implements BuergergeldType {
	/**
	 * The default value of the '{@link #isBezugBuergergeld() <em>Bezug Buergergeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugBuergergeld()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEZUG_BUERGERGELD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBezugBuergergeld() <em>Bezug Buergergeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBezugBuergergeld()
	 * @generated
	 * @ordered
	 */
	protected boolean bezugBuergergeld = BEZUG_BUERGERGELD_EDEFAULT;

	/**
	 * This is true if the Bezug Buergergeld attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bezugBuergergeldESet;

	/**
	 * The default value of the '{@link #getBeginnZeitraumBuergergeld() <em>Beginn Zeitraum Buergergeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginnZeitraumBuergergeld()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar BEGINN_ZEITRAUM_BUERGERGELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeginnZeitraumBuergergeld() <em>Beginn Zeitraum Buergergeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginnZeitraumBuergergeld()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar beginnZeitraumBuergergeld = BEGINN_ZEITRAUM_BUERGERGELD_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndeZeitraumBuergergeld() <em>Ende Zeitraum Buergergeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndeZeitraumBuergergeld()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ENDE_ZEITRAUM_BUERGERGELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndeZeitraumBuergergeld() <em>Ende Zeitraum Buergergeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndeZeitraumBuergergeld()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar endeZeitraumBuergergeld = ENDE_ZEITRAUM_BUERGERGELD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuergergeldTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getBuergergeldType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBezugBuergergeld() {
		return bezugBuergergeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBezugBuergergeld(boolean newBezugBuergergeld) {
		boolean oldBezugBuergergeld = bezugBuergergeld;
		bezugBuergergeld = newBezugBuergergeld;
		boolean oldBezugBuergergeldESet = bezugBuergergeldESet;
		bezugBuergergeldESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.BUERGERGELD_TYPE__BEZUG_BUERGERGELD, oldBezugBuergergeld, bezugBuergergeld, !oldBezugBuergergeldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBezugBuergergeld() {
		boolean oldBezugBuergergeld = bezugBuergergeld;
		boolean oldBezugBuergergeldESet = bezugBuergergeldESet;
		bezugBuergergeld = BEZUG_BUERGERGELD_EDEFAULT;
		bezugBuergergeldESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.BUERGERGELD_TYPE__BEZUG_BUERGERGELD, oldBezugBuergergeld, BEZUG_BUERGERGELD_EDEFAULT, oldBezugBuergergeldESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBezugBuergergeld() {
		return bezugBuergergeldESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getBeginnZeitraumBuergergeld() {
		return beginnZeitraumBuergergeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeginnZeitraumBuergergeld(XMLGregorianCalendar newBeginnZeitraumBuergergeld) {
		XMLGregorianCalendar oldBeginnZeitraumBuergergeld = beginnZeitraumBuergergeld;
		beginnZeitraumBuergergeld = newBeginnZeitraumBuergergeld;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.BUERGERGELD_TYPE__BEGINN_ZEITRAUM_BUERGERGELD, oldBeginnZeitraumBuergergeld, beginnZeitraumBuergergeld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getEndeZeitraumBuergergeld() {
		return endeZeitraumBuergergeld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndeZeitraumBuergergeld(XMLGregorianCalendar newEndeZeitraumBuergergeld) {
		XMLGregorianCalendar oldEndeZeitraumBuergergeld = endeZeitraumBuergergeld;
		endeZeitraumBuergergeld = newEndeZeitraumBuergergeld;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.BUERGERGELD_TYPE__ENDE_ZEITRAUM_BUERGERGELD, oldEndeZeitraumBuergergeld, endeZeitraumBuergergeld));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ElterngeldPackage.BUERGERGELD_TYPE__BEZUG_BUERGERGELD:
				return isBezugBuergergeld();
			case ElterngeldPackage.BUERGERGELD_TYPE__BEGINN_ZEITRAUM_BUERGERGELD:
				return getBeginnZeitraumBuergergeld();
			case ElterngeldPackage.BUERGERGELD_TYPE__ENDE_ZEITRAUM_BUERGERGELD:
				return getEndeZeitraumBuergergeld();
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
			case ElterngeldPackage.BUERGERGELD_TYPE__BEZUG_BUERGERGELD:
				setBezugBuergergeld((Boolean)newValue);
				return;
			case ElterngeldPackage.BUERGERGELD_TYPE__BEGINN_ZEITRAUM_BUERGERGELD:
				setBeginnZeitraumBuergergeld((XMLGregorianCalendar)newValue);
				return;
			case ElterngeldPackage.BUERGERGELD_TYPE__ENDE_ZEITRAUM_BUERGERGELD:
				setEndeZeitraumBuergergeld((XMLGregorianCalendar)newValue);
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
			case ElterngeldPackage.BUERGERGELD_TYPE__BEZUG_BUERGERGELD:
				unsetBezugBuergergeld();
				return;
			case ElterngeldPackage.BUERGERGELD_TYPE__BEGINN_ZEITRAUM_BUERGERGELD:
				setBeginnZeitraumBuergergeld(BEGINN_ZEITRAUM_BUERGERGELD_EDEFAULT);
				return;
			case ElterngeldPackage.BUERGERGELD_TYPE__ENDE_ZEITRAUM_BUERGERGELD:
				setEndeZeitraumBuergergeld(ENDE_ZEITRAUM_BUERGERGELD_EDEFAULT);
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
			case ElterngeldPackage.BUERGERGELD_TYPE__BEZUG_BUERGERGELD:
				return isSetBezugBuergergeld();
			case ElterngeldPackage.BUERGERGELD_TYPE__BEGINN_ZEITRAUM_BUERGERGELD:
				return BEGINN_ZEITRAUM_BUERGERGELD_EDEFAULT == null ? beginnZeitraumBuergergeld != null : !BEGINN_ZEITRAUM_BUERGERGELD_EDEFAULT.equals(beginnZeitraumBuergergeld);
			case ElterngeldPackage.BUERGERGELD_TYPE__ENDE_ZEITRAUM_BUERGERGELD:
				return ENDE_ZEITRAUM_BUERGERGELD_EDEFAULT == null ? endeZeitraumBuergergeld != null : !ENDE_ZEITRAUM_BUERGERGELD_EDEFAULT.equals(endeZeitraumBuergergeld);
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
		result.append(" (bezugBuergergeld: ");
		if (bezugBuergergeldESet) result.append(bezugBuergergeld); else result.append("<unset>");
		result.append(", beginnZeitraumBuergergeld: ");
		result.append(beginnZeitraumBuergergeld);
		result.append(", endeZeitraumBuergergeld: ");
		result.append(endeZeitraumBuergergeld);
		result.append(')');
		return result.toString();
	}

} //BuergergeldTypeImpl
