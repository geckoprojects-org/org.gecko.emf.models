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
package de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl;

import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsUnfallversicherungType;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeZuschuesseType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Antragdetails Unfallversicherung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragdetailsUnfallversicherungTypeImpl#getBeantragungKostenUnfallversicherung <em>Beantragung Kosten Unfallversicherung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragdetailsUnfallversicherungTypeImpl#getZuschuesse <em>Zuschuesse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AntragdetailsUnfallversicherungTypeImpl#getHoeheZuschuesse <em>Hoehe Zuschuesse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AntragdetailsUnfallversicherungTypeImpl extends MinimalEObjectImpl.Container implements AntragdetailsUnfallversicherungType {
	/**
	 * The default value of the '{@link #getBeantragungKostenUnfallversicherung() <em>Beantragung Kosten Unfallversicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeantragungKostenUnfallversicherung()
	 * @generated
	 * @ordered
	 */
	protected static final String BEANTRAGUNG_KOSTEN_UNFALLVERSICHERUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeantragungKostenUnfallversicherung() <em>Beantragung Kosten Unfallversicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeantragungKostenUnfallversicherung()
	 * @generated
	 * @ordered
	 */
	protected String beantragungKostenUnfallversicherung = BEANTRAGUNG_KOSTEN_UNFALLVERSICHERUNG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getZuschuesse() <em>Zuschuesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZuschuesse()
	 * @generated
	 * @ordered
	 */
	protected CodeZuschuesseType zuschuesse;

	/**
	 * The default value of the '{@link #getHoeheZuschuesse() <em>Hoehe Zuschuesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoeheZuschuesse()
	 * @generated
	 * @ordered
	 */
	protected static final float HOEHE_ZUSCHUESSE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHoeheZuschuesse() <em>Hoehe Zuschuesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoeheZuschuesse()
	 * @generated
	 * @ordered
	 */
	protected float hoeheZuschuesse = HOEHE_ZUSCHUESSE_EDEFAULT;

	/**
	 * This is true if the Hoehe Zuschuesse attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hoeheZuschuesseESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AntragdetailsUnfallversicherungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeantragungKostenUnfallversicherung() {
		return beantragungKostenUnfallversicherung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeantragungKostenUnfallversicherung(String newBeantragungKostenUnfallversicherung) {
		String oldBeantragungKostenUnfallversicherung = beantragungKostenUnfallversicherung;
		beantragungKostenUnfallversicherung = newBeantragungKostenUnfallversicherung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__BEANTRAGUNG_KOSTEN_UNFALLVERSICHERUNG, oldBeantragungKostenUnfallversicherung, beantragungKostenUnfallversicherung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeZuschuesseType getZuschuesse() {
		return zuschuesse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetZuschuesse(CodeZuschuesseType newZuschuesse, NotificationChain msgs) {
		CodeZuschuesseType oldZuschuesse = zuschuesse;
		zuschuesse = newZuschuesse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__ZUSCHUESSE, oldZuschuesse, newZuschuesse);
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
	public void setZuschuesse(CodeZuschuesseType newZuschuesse) {
		if (newZuschuesse != zuschuesse) {
			NotificationChain msgs = null;
			if (zuschuesse != null)
				msgs = ((InternalEObject)zuschuesse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__ZUSCHUESSE, null, msgs);
			if (newZuschuesse != null)
				msgs = ((InternalEObject)newZuschuesse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__ZUSCHUESSE, null, msgs);
			msgs = basicSetZuschuesse(newZuschuesse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__ZUSCHUESSE, newZuschuesse, newZuschuesse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getHoeheZuschuesse() {
		return hoeheZuschuesse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHoeheZuschuesse(float newHoeheZuschuesse) {
		float oldHoeheZuschuesse = hoeheZuschuesse;
		hoeheZuschuesse = newHoeheZuschuesse;
		boolean oldHoeheZuschuesseESet = hoeheZuschuesseESet;
		hoeheZuschuesseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__HOEHE_ZUSCHUESSE, oldHoeheZuschuesse, hoeheZuschuesse, !oldHoeheZuschuesseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHoeheZuschuesse() {
		float oldHoeheZuschuesse = hoeheZuschuesse;
		boolean oldHoeheZuschuesseESet = hoeheZuschuesseESet;
		hoeheZuschuesse = HOEHE_ZUSCHUESSE_EDEFAULT;
		hoeheZuschuesseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__HOEHE_ZUSCHUESSE, oldHoeheZuschuesse, HOEHE_ZUSCHUESSE_EDEFAULT, oldHoeheZuschuesseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHoeheZuschuesse() {
		return hoeheZuschuesseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__ZUSCHUESSE:
				return basicSetZuschuesse(null, msgs);
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
			case AdoptionPackage.ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__BEANTRAGUNG_KOSTEN_UNFALLVERSICHERUNG:
				return getBeantragungKostenUnfallversicherung();
			case AdoptionPackage.ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__ZUSCHUESSE:
				return getZuschuesse();
			case AdoptionPackage.ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__HOEHE_ZUSCHUESSE:
				return getHoeheZuschuesse();
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
			case AdoptionPackage.ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__BEANTRAGUNG_KOSTEN_UNFALLVERSICHERUNG:
				setBeantragungKostenUnfallversicherung((String)newValue);
				return;
			case AdoptionPackage.ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__ZUSCHUESSE:
				setZuschuesse((CodeZuschuesseType)newValue);
				return;
			case AdoptionPackage.ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__HOEHE_ZUSCHUESSE:
				setHoeheZuschuesse((Float)newValue);
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
			case AdoptionPackage.ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__BEANTRAGUNG_KOSTEN_UNFALLVERSICHERUNG:
				setBeantragungKostenUnfallversicherung(BEANTRAGUNG_KOSTEN_UNFALLVERSICHERUNG_EDEFAULT);
				return;
			case AdoptionPackage.ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__ZUSCHUESSE:
				setZuschuesse((CodeZuschuesseType)null);
				return;
			case AdoptionPackage.ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__HOEHE_ZUSCHUESSE:
				unsetHoeheZuschuesse();
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
			case AdoptionPackage.ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__BEANTRAGUNG_KOSTEN_UNFALLVERSICHERUNG:
				return BEANTRAGUNG_KOSTEN_UNFALLVERSICHERUNG_EDEFAULT == null ? beantragungKostenUnfallversicherung != null : !BEANTRAGUNG_KOSTEN_UNFALLVERSICHERUNG_EDEFAULT.equals(beantragungKostenUnfallversicherung);
			case AdoptionPackage.ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__ZUSCHUESSE:
				return zuschuesse != null;
			case AdoptionPackage.ANTRAGDETAILS_UNFALLVERSICHERUNG_TYPE__HOEHE_ZUSCHUESSE:
				return isSetHoeheZuschuesse();
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
		result.append(" (beantragungKostenUnfallversicherung: ");
		result.append(beantragungKostenUnfallversicherung);
		result.append(", hoeheZuschuesse: ");
		if (hoeheZuschuesseESet) result.append(hoeheZuschuesse); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AntragdetailsUnfallversicherungTypeImpl
