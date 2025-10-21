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
import de.xoev.xfamilie.elterngeldantrag._1.elterngeld.FreiwilligendienstType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Freiwilligendienst Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.FreiwilligendienstTypeImpl#isFreiwilligendienst <em>Freiwilligendienst</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.FreiwilligendienstTypeImpl#getZeitraum <em>Zeitraum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.impl.FreiwilligendienstTypeImpl#getWochenstundenJeTaetigkeit <em>Wochenstunden Je Taetigkeit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FreiwilligendienstTypeImpl extends MinimalEObjectImpl.Container implements FreiwilligendienstType {
	/**
	 * The default value of the '{@link #isFreiwilligendienst() <em>Freiwilligendienst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFreiwilligendienst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FREIWILLIGENDIENST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFreiwilligendienst() <em>Freiwilligendienst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFreiwilligendienst()
	 * @generated
	 * @ordered
	 */
	protected boolean freiwilligendienst = FREIWILLIGENDIENST_EDEFAULT;

	/**
	 * This is true if the Freiwilligendienst attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean freiwilligendienstESet;

	/**
	 * The default value of the '{@link #getZeitraum() <em>Zeitraum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraum()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ZEITRAUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZeitraum() <em>Zeitraum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZeitraum()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar zeitraum = ZEITRAUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getWochenstundenJeTaetigkeit() <em>Wochenstunden Je Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWochenstundenJeTaetigkeit()
	 * @generated
	 * @ordered
	 */
	protected static final String WOCHENSTUNDEN_JE_TAETIGKEIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWochenstundenJeTaetigkeit() <em>Wochenstunden Je Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWochenstundenJeTaetigkeit()
	 * @generated
	 * @ordered
	 */
	protected String wochenstundenJeTaetigkeit = WOCHENSTUNDEN_JE_TAETIGKEIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreiwilligendienstTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElterngeldPackage.eINSTANCE.getFreiwilligendienstType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFreiwilligendienst() {
		return freiwilligendienst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFreiwilligendienst(boolean newFreiwilligendienst) {
		boolean oldFreiwilligendienst = freiwilligendienst;
		freiwilligendienst = newFreiwilligendienst;
		boolean oldFreiwilligendienstESet = freiwilligendienstESet;
		freiwilligendienstESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.FREIWILLIGENDIENST_TYPE__FREIWILLIGENDIENST, oldFreiwilligendienst, freiwilligendienst, !oldFreiwilligendienstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFreiwilligendienst() {
		boolean oldFreiwilligendienst = freiwilligendienst;
		boolean oldFreiwilligendienstESet = freiwilligendienstESet;
		freiwilligendienst = FREIWILLIGENDIENST_EDEFAULT;
		freiwilligendienstESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ElterngeldPackage.FREIWILLIGENDIENST_TYPE__FREIWILLIGENDIENST, oldFreiwilligendienst, FREIWILLIGENDIENST_EDEFAULT, oldFreiwilligendienstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFreiwilligendienst() {
		return freiwilligendienstESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getZeitraum() {
		return zeitraum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZeitraum(XMLGregorianCalendar newZeitraum) {
		XMLGregorianCalendar oldZeitraum = zeitraum;
		zeitraum = newZeitraum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.FREIWILLIGENDIENST_TYPE__ZEITRAUM, oldZeitraum, zeitraum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWochenstundenJeTaetigkeit() {
		return wochenstundenJeTaetigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWochenstundenJeTaetigkeit(String newWochenstundenJeTaetigkeit) {
		String oldWochenstundenJeTaetigkeit = wochenstundenJeTaetigkeit;
		wochenstundenJeTaetigkeit = newWochenstundenJeTaetigkeit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElterngeldPackage.FREIWILLIGENDIENST_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT, oldWochenstundenJeTaetigkeit, wochenstundenJeTaetigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ElterngeldPackage.FREIWILLIGENDIENST_TYPE__FREIWILLIGENDIENST:
				return isFreiwilligendienst();
			case ElterngeldPackage.FREIWILLIGENDIENST_TYPE__ZEITRAUM:
				return getZeitraum();
			case ElterngeldPackage.FREIWILLIGENDIENST_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT:
				return getWochenstundenJeTaetigkeit();
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
			case ElterngeldPackage.FREIWILLIGENDIENST_TYPE__FREIWILLIGENDIENST:
				setFreiwilligendienst((Boolean)newValue);
				return;
			case ElterngeldPackage.FREIWILLIGENDIENST_TYPE__ZEITRAUM:
				setZeitraum((XMLGregorianCalendar)newValue);
				return;
			case ElterngeldPackage.FREIWILLIGENDIENST_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT:
				setWochenstundenJeTaetigkeit((String)newValue);
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
			case ElterngeldPackage.FREIWILLIGENDIENST_TYPE__FREIWILLIGENDIENST:
				unsetFreiwilligendienst();
				return;
			case ElterngeldPackage.FREIWILLIGENDIENST_TYPE__ZEITRAUM:
				setZeitraum(ZEITRAUM_EDEFAULT);
				return;
			case ElterngeldPackage.FREIWILLIGENDIENST_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT:
				setWochenstundenJeTaetigkeit(WOCHENSTUNDEN_JE_TAETIGKEIT_EDEFAULT);
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
			case ElterngeldPackage.FREIWILLIGENDIENST_TYPE__FREIWILLIGENDIENST:
				return isSetFreiwilligendienst();
			case ElterngeldPackage.FREIWILLIGENDIENST_TYPE__ZEITRAUM:
				return ZEITRAUM_EDEFAULT == null ? zeitraum != null : !ZEITRAUM_EDEFAULT.equals(zeitraum);
			case ElterngeldPackage.FREIWILLIGENDIENST_TYPE__WOCHENSTUNDEN_JE_TAETIGKEIT:
				return WOCHENSTUNDEN_JE_TAETIGKEIT_EDEFAULT == null ? wochenstundenJeTaetigkeit != null : !WOCHENSTUNDEN_JE_TAETIGKEIT_EDEFAULT.equals(wochenstundenJeTaetigkeit);
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
		result.append(" (freiwilligendienst: ");
		if (freiwilligendienstESet) result.append(freiwilligendienst); else result.append("<unset>");
		result.append(", zeitraum: ");
		result.append(zeitraum);
		result.append(", wochenstundenJeTaetigkeit: ");
		result.append(wochenstundenJeTaetigkeit);
		result.append(')');
		return result.toString();
	}

} //FreiwilligendienstTypeImpl
