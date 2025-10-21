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
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenPflegeType;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeGeschlechtType;
import de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allgemeine Angaben Pflege Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenPflegeTypeImpl#getWochenstunden <em>Wochenstunden</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenPflegeTypeImpl#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenPflegeTypeImpl#getGeschlecht <em>Geschlecht</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllgemeineAngabenPflegeTypeImpl extends PflegepersonBasisTypeImpl implements AllgemeineAngabenPflegeType {
	/**
	 * The default value of the '{@link #getWochenstunden() <em>Wochenstunden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWochenstunden()
	 * @generated
	 * @ordered
	 */
	protected static final String WOCHENSTUNDEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWochenstunden() <em>Wochenstunden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWochenstunden()
	 * @generated
	 * @ordered
	 */
	protected String wochenstunden = WOCHENSTUNDEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnschrift() <em>Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschrift()
	 * @generated
	 * @ordered
	 */
	protected MeldeanschriftType anschrift;

	/**
	 * The cached value of the '{@link #getGeschlecht() <em>Geschlecht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeschlecht()
	 * @generated
	 * @ordered
	 */
	protected CodeGeschlechtType geschlecht;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllgemeineAngabenPflegeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.ALLGEMEINE_ANGABEN_PFLEGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWochenstunden() {
		return wochenstunden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWochenstunden(String newWochenstunden) {
		String oldWochenstunden = wochenstunden;
		wochenstunden = newWochenstunden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE__WOCHENSTUNDEN, oldWochenstunden, wochenstunden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeldeanschriftType getAnschrift() {
		return anschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschrift(MeldeanschriftType newAnschrift, NotificationChain msgs) {
		MeldeanschriftType oldAnschrift = anschrift;
		anschrift = newAnschrift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE__ANSCHRIFT, oldAnschrift, newAnschrift);
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
	public void setAnschrift(MeldeanschriftType newAnschrift) {
		if (newAnschrift != anschrift) {
			NotificationChain msgs = null;
			if (anschrift != null)
				msgs = ((InternalEObject)anschrift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE__ANSCHRIFT, null, msgs);
			if (newAnschrift != null)
				msgs = ((InternalEObject)newAnschrift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE__ANSCHRIFT, null, msgs);
			msgs = basicSetAnschrift(newAnschrift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE__ANSCHRIFT, newAnschrift, newAnschrift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeGeschlechtType getGeschlecht() {
		return geschlecht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeschlecht(CodeGeschlechtType newGeschlecht, NotificationChain msgs) {
		CodeGeschlechtType oldGeschlecht = geschlecht;
		geschlecht = newGeschlecht;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE__GESCHLECHT, oldGeschlecht, newGeschlecht);
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
	public void setGeschlecht(CodeGeschlechtType newGeschlecht) {
		if (newGeschlecht != geschlecht) {
			NotificationChain msgs = null;
			if (geschlecht != null)
				msgs = ((InternalEObject)geschlecht).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE__GESCHLECHT, null, msgs);
			if (newGeschlecht != null)
				msgs = ((InternalEObject)newGeschlecht).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE__GESCHLECHT, null, msgs);
			msgs = basicSetGeschlecht(newGeschlecht, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE__GESCHLECHT, newGeschlecht, newGeschlecht));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE__ANSCHRIFT:
				return basicSetAnschrift(null, msgs);
			case AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE__GESCHLECHT:
				return basicSetGeschlecht(null, msgs);
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
			case AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE__WOCHENSTUNDEN:
				return getWochenstunden();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE__ANSCHRIFT:
				return getAnschrift();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE__GESCHLECHT:
				return getGeschlecht();
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
			case AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE__WOCHENSTUNDEN:
				setWochenstunden((String)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE__ANSCHRIFT:
				setAnschrift((MeldeanschriftType)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE__GESCHLECHT:
				setGeschlecht((CodeGeschlechtType)newValue);
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
			case AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE__WOCHENSTUNDEN:
				setWochenstunden(WOCHENSTUNDEN_EDEFAULT);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE__ANSCHRIFT:
				setAnschrift((MeldeanschriftType)null);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE__GESCHLECHT:
				setGeschlecht((CodeGeschlechtType)null);
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
			case AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE__WOCHENSTUNDEN:
				return WOCHENSTUNDEN_EDEFAULT == null ? wochenstunden != null : !WOCHENSTUNDEN_EDEFAULT.equals(wochenstunden);
			case AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE__ANSCHRIFT:
				return anschrift != null;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_PFLEGE_TYPE__GESCHLECHT:
				return geschlecht != null;
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
		result.append(" (wochenstunden: ");
		result.append(wochenstunden);
		result.append(')');
		return result.toString();
	}

} //AllgemeineAngabenPflegeTypeImpl
