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
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AnliegenType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anliegen Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AnliegenTypeImpl#getWunschBeratung <em>Wunsch Beratung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AnliegenTypeImpl#getKommentar <em>Kommentar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnliegenTypeImpl extends MinimalEObjectImpl.Container implements AnliegenType {
	/**
	 * The cached value of the '{@link #getWunschBeratung() <em>Wunsch Beratung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWunschBeratung()
	 * @generated
	 * @ordered
	 */
	protected EObject wunschBeratung;

	/**
	 * The default value of the '{@link #getKommentar() <em>Kommentar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKommentar()
	 * @generated
	 * @ordered
	 */
	protected static final String KOMMENTAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKommentar() <em>Kommentar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKommentar()
	 * @generated
	 * @ordered
	 */
	protected String kommentar = KOMMENTAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnliegenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.ANLIEGEN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getWunschBeratung() {
		return wunschBeratung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWunschBeratung(EObject newWunschBeratung, NotificationChain msgs) {
		EObject oldWunschBeratung = wunschBeratung;
		wunschBeratung = newWunschBeratung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANLIEGEN_TYPE__WUNSCH_BERATUNG, oldWunschBeratung, newWunschBeratung);
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
	public void setWunschBeratung(EObject newWunschBeratung) {
		if (newWunschBeratung != wunschBeratung) {
			NotificationChain msgs = null;
			if (wunschBeratung != null)
				msgs = ((InternalEObject)wunschBeratung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANLIEGEN_TYPE__WUNSCH_BERATUNG, null, msgs);
			if (newWunschBeratung != null)
				msgs = ((InternalEObject)newWunschBeratung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANLIEGEN_TYPE__WUNSCH_BERATUNG, null, msgs);
			msgs = basicSetWunschBeratung(newWunschBeratung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANLIEGEN_TYPE__WUNSCH_BERATUNG, newWunschBeratung, newWunschBeratung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKommentar() {
		return kommentar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKommentar(String newKommentar) {
		String oldKommentar = kommentar;
		kommentar = newKommentar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANLIEGEN_TYPE__KOMMENTAR, oldKommentar, kommentar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.ANLIEGEN_TYPE__WUNSCH_BERATUNG:
				return basicSetWunschBeratung(null, msgs);
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
			case AdoptionPackage.ANLIEGEN_TYPE__WUNSCH_BERATUNG:
				return getWunschBeratung();
			case AdoptionPackage.ANLIEGEN_TYPE__KOMMENTAR:
				return getKommentar();
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
			case AdoptionPackage.ANLIEGEN_TYPE__WUNSCH_BERATUNG:
				setWunschBeratung((EObject)newValue);
				return;
			case AdoptionPackage.ANLIEGEN_TYPE__KOMMENTAR:
				setKommentar((String)newValue);
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
			case AdoptionPackage.ANLIEGEN_TYPE__WUNSCH_BERATUNG:
				setWunschBeratung((EObject)null);
				return;
			case AdoptionPackage.ANLIEGEN_TYPE__KOMMENTAR:
				setKommentar(KOMMENTAR_EDEFAULT);
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
			case AdoptionPackage.ANLIEGEN_TYPE__WUNSCH_BERATUNG:
				return wunschBeratung != null;
			case AdoptionPackage.ANLIEGEN_TYPE__KOMMENTAR:
				return KOMMENTAR_EDEFAULT == null ? kommentar != null : !KOMMENTAR_EDEFAULT.equals(kommentar);
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
		result.append(" (kommentar: ");
		result.append(kommentar);
		result.append(')');
		return result.toString();
	}

} //AnliegenTypeImpl
