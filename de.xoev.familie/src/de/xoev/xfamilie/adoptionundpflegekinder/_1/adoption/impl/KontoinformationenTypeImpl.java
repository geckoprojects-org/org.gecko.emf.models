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
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.KontoinformationenType;

import de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungIBANOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeEigenschaftType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kontoinformationen Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.KontoinformationenTypeImpl#getBeantragungJugendhilfe <em>Beantragung Jugendhilfe</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.KontoinformationenTypeImpl#getBankverbindung <em>Bankverbindung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KontoinformationenTypeImpl extends MinimalEObjectImpl.Container implements KontoinformationenType {
	/**
	 * The cached value of the '{@link #getBeantragungJugendhilfe() <em>Beantragung Jugendhilfe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeantragungJugendhilfe()
	 * @generated
	 * @ordered
	 */
	protected CodeEigenschaftType beantragungJugendhilfe;

	/**
	 * The cached value of the '{@link #getBankverbindung() <em>Bankverbindung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankverbindung()
	 * @generated
	 * @ordered
	 */
	protected BankverbindungIBANOptionalType bankverbindung;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KontoinformationenTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.KONTOINFORMATIONEN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeEigenschaftType getBeantragungJugendhilfe() {
		return beantragungJugendhilfe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeantragungJugendhilfe(CodeEigenschaftType newBeantragungJugendhilfe, NotificationChain msgs) {
		CodeEigenschaftType oldBeantragungJugendhilfe = beantragungJugendhilfe;
		beantragungJugendhilfe = newBeantragungJugendhilfe;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.KONTOINFORMATIONEN_TYPE__BEANTRAGUNG_JUGENDHILFE, oldBeantragungJugendhilfe, newBeantragungJugendhilfe);
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
	public void setBeantragungJugendhilfe(CodeEigenschaftType newBeantragungJugendhilfe) {
		if (newBeantragungJugendhilfe != beantragungJugendhilfe) {
			NotificationChain msgs = null;
			if (beantragungJugendhilfe != null)
				msgs = ((InternalEObject)beantragungJugendhilfe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.KONTOINFORMATIONEN_TYPE__BEANTRAGUNG_JUGENDHILFE, null, msgs);
			if (newBeantragungJugendhilfe != null)
				msgs = ((InternalEObject)newBeantragungJugendhilfe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.KONTOINFORMATIONEN_TYPE__BEANTRAGUNG_JUGENDHILFE, null, msgs);
			msgs = basicSetBeantragungJugendhilfe(newBeantragungJugendhilfe, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.KONTOINFORMATIONEN_TYPE__BEANTRAGUNG_JUGENDHILFE, newBeantragungJugendhilfe, newBeantragungJugendhilfe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BankverbindungIBANOptionalType getBankverbindung() {
		return bankverbindung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBankverbindung(BankverbindungIBANOptionalType newBankverbindung, NotificationChain msgs) {
		BankverbindungIBANOptionalType oldBankverbindung = bankverbindung;
		bankverbindung = newBankverbindung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.KONTOINFORMATIONEN_TYPE__BANKVERBINDUNG, oldBankverbindung, newBankverbindung);
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
	public void setBankverbindung(BankverbindungIBANOptionalType newBankverbindung) {
		if (newBankverbindung != bankverbindung) {
			NotificationChain msgs = null;
			if (bankverbindung != null)
				msgs = ((InternalEObject)bankverbindung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.KONTOINFORMATIONEN_TYPE__BANKVERBINDUNG, null, msgs);
			if (newBankverbindung != null)
				msgs = ((InternalEObject)newBankverbindung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.KONTOINFORMATIONEN_TYPE__BANKVERBINDUNG, null, msgs);
			msgs = basicSetBankverbindung(newBankverbindung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.KONTOINFORMATIONEN_TYPE__BANKVERBINDUNG, newBankverbindung, newBankverbindung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.KONTOINFORMATIONEN_TYPE__BEANTRAGUNG_JUGENDHILFE:
				return basicSetBeantragungJugendhilfe(null, msgs);
			case AdoptionPackage.KONTOINFORMATIONEN_TYPE__BANKVERBINDUNG:
				return basicSetBankverbindung(null, msgs);
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
			case AdoptionPackage.KONTOINFORMATIONEN_TYPE__BEANTRAGUNG_JUGENDHILFE:
				return getBeantragungJugendhilfe();
			case AdoptionPackage.KONTOINFORMATIONEN_TYPE__BANKVERBINDUNG:
				return getBankverbindung();
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
			case AdoptionPackage.KONTOINFORMATIONEN_TYPE__BEANTRAGUNG_JUGENDHILFE:
				setBeantragungJugendhilfe((CodeEigenschaftType)newValue);
				return;
			case AdoptionPackage.KONTOINFORMATIONEN_TYPE__BANKVERBINDUNG:
				setBankverbindung((BankverbindungIBANOptionalType)newValue);
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
			case AdoptionPackage.KONTOINFORMATIONEN_TYPE__BEANTRAGUNG_JUGENDHILFE:
				setBeantragungJugendhilfe((CodeEigenschaftType)null);
				return;
			case AdoptionPackage.KONTOINFORMATIONEN_TYPE__BANKVERBINDUNG:
				setBankverbindung((BankverbindungIBANOptionalType)null);
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
			case AdoptionPackage.KONTOINFORMATIONEN_TYPE__BEANTRAGUNG_JUGENDHILFE:
				return beantragungJugendhilfe != null;
			case AdoptionPackage.KONTOINFORMATIONEN_TYPE__BANKVERBINDUNG:
				return bankverbindung != null;
		}
		return super.eIsSet(featureID);
	}

} //KontoinformationenTypeImpl
