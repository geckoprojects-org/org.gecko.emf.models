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

import de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bankverbindung Inhaber Optional Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.BankverbindungInhaberOptionalTypeImpl#getInhaber <em>Inhaber</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.BankverbindungInhaberOptionalTypeImpl#getIban <em>Iban</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.BankverbindungInhaberOptionalTypeImpl#getBic <em>Bic</em>}</li>
 *   <li>{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.BankverbindungInhaberOptionalTypeImpl#getInstitut <em>Institut</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BankverbindungInhaberOptionalTypeImpl extends MinimalEObjectImpl.Container implements BankverbindungInhaberOptionalType {
	/**
	 * The cached value of the '{@link #getInhaber() <em>Inhaber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhaber()
	 * @generated
	 * @ordered
	 */
	protected NameNatuerlichePersonType inhaber;

	/**
	 * The default value of the '{@link #getIban() <em>Iban</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIban()
	 * @generated
	 * @ordered
	 */
	protected static final String IBAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIban() <em>Iban</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIban()
	 * @generated
	 * @ordered
	 */
	protected String iban = IBAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBic() <em>Bic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBic()
	 * @generated
	 * @ordered
	 */
	protected static final String BIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBic() <em>Bic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBic()
	 * @generated
	 * @ordered
	 */
	protected String bic = BIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstitut() <em>Institut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitut()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTITUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstitut() <em>Institut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitut()
	 * @generated
	 * @ordered
	 */
	protected String institut = INSTITUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankverbindungInhaberOptionalTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BaukastenPackage.Literals.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonType getInhaber() {
		return inhaber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInhaber(NameNatuerlichePersonType newInhaber, NotificationChain msgs) {
		NameNatuerlichePersonType oldInhaber = inhaber;
		inhaber = newInhaber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__INHABER, oldInhaber, newInhaber);
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
	public void setInhaber(NameNatuerlichePersonType newInhaber) {
		if (newInhaber != inhaber) {
			NotificationChain msgs = null;
			if (inhaber != null)
				msgs = ((InternalEObject)inhaber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__INHABER, null, msgs);
			if (newInhaber != null)
				msgs = ((InternalEObject)newInhaber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__INHABER, null, msgs);
			msgs = basicSetInhaber(newInhaber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__INHABER, newInhaber, newInhaber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIban() {
		return iban;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIban(String newIban) {
		String oldIban = iban;
		iban = newIban;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__IBAN, oldIban, iban));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBic() {
		return bic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBic(String newBic) {
		String oldBic = bic;
		bic = newBic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__BIC, oldBic, bic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstitut() {
		return institut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstitut(String newInstitut) {
		String oldInstitut = institut;
		institut = newInstitut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__INSTITUT, oldInstitut, institut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__INHABER:
				return basicSetInhaber(null, msgs);
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
			case BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__INHABER:
				return getInhaber();
			case BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__IBAN:
				return getIban();
			case BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__BIC:
				return getBic();
			case BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__INSTITUT:
				return getInstitut();
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
			case BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__INHABER:
				setInhaber((NameNatuerlichePersonType)newValue);
				return;
			case BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__IBAN:
				setIban((String)newValue);
				return;
			case BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__BIC:
				setBic((String)newValue);
				return;
			case BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__INSTITUT:
				setInstitut((String)newValue);
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
			case BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__INHABER:
				setInhaber((NameNatuerlichePersonType)null);
				return;
			case BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__IBAN:
				setIban(IBAN_EDEFAULT);
				return;
			case BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__BIC:
				setBic(BIC_EDEFAULT);
				return;
			case BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__INSTITUT:
				setInstitut(INSTITUT_EDEFAULT);
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
			case BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__INHABER:
				return inhaber != null;
			case BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__IBAN:
				return IBAN_EDEFAULT == null ? iban != null : !IBAN_EDEFAULT.equals(iban);
			case BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__BIC:
				return BIC_EDEFAULT == null ? bic != null : !BIC_EDEFAULT.equals(bic);
			case BaukastenPackage.BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__INSTITUT:
				return INSTITUT_EDEFAULT == null ? institut != null : !INSTITUT_EDEFAULT.equals(institut);
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
		result.append(" (iban: ");
		result.append(iban);
		result.append(", bic: ");
		result.append(bic);
		result.append(", institut: ");
		result.append(institut);
		result.append(')');
		return result.toString();
	}

} //BankverbindungInhaberOptionalTypeImpl
