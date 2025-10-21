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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.VormundType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vormund Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VormundTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VormundTypeImpl#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VormundTypeImpl#getEMailAdresse <em>EMail Adresse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VormundTypeImpl#getAktenzeichen <em>Aktenzeichen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.VormundTypeImpl#getTelefonnummer <em>Telefonnummer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VormundTypeImpl extends MinimalEObjectImpl.Container implements VormundType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NameNatuerlichePersonType name;

	/**
	 * The cached value of the '{@link #getAnschrift() <em>Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschrift()
	 * @generated
	 * @ordered
	 */
	protected PostalischeInlandsanschriftBasisType anschrift;

	/**
	 * The default value of the '{@link #getEMailAdresse() <em>EMail Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMailAdresse()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_ADRESSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEMailAdresse() <em>EMail Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMailAdresse()
	 * @generated
	 * @ordered
	 */
	protected String eMailAdresse = EMAIL_ADRESSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAktenzeichen() <em>Aktenzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktenzeichen()
	 * @generated
	 * @ordered
	 */
	protected static final String AKTENZEICHEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAktenzeichen() <em>Aktenzeichen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktenzeichen()
	 * @generated
	 * @ordered
	 */
	protected String aktenzeichen = AKTENZEICHEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTelefonnummer() <em>Telefonnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefonnummer()
	 * @generated
	 * @ordered
	 */
	protected static final String TELEFONNUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTelefonnummer() <em>Telefonnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTelefonnummer()
	 * @generated
	 * @ordered
	 */
	protected String telefonnummer = TELEFONNUMMER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VormundTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getVormundType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NameNatuerlichePersonType newName, NotificationChain msgs) {
		NameNatuerlichePersonType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VORMUND_TYPE__NAME, oldName, newName);
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
	public void setName(NameNatuerlichePersonType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VORMUND_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VORMUND_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VORMUND_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftBasisType getAnschrift() {
		return anschrift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschrift(PostalischeInlandsanschriftBasisType newAnschrift, NotificationChain msgs) {
		PostalischeInlandsanschriftBasisType oldAnschrift = anschrift;
		anschrift = newAnschrift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VORMUND_TYPE__ANSCHRIFT, oldAnschrift, newAnschrift);
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
	public void setAnschrift(PostalischeInlandsanschriftBasisType newAnschrift) {
		if (newAnschrift != anschrift) {
			NotificationChain msgs = null;
			if (anschrift != null)
				msgs = ((InternalEObject)anschrift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VORMUND_TYPE__ANSCHRIFT, null, msgs);
			if (newAnschrift != null)
				msgs = ((InternalEObject)newAnschrift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.VORMUND_TYPE__ANSCHRIFT, null, msgs);
			msgs = basicSetAnschrift(newAnschrift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VORMUND_TYPE__ANSCHRIFT, newAnschrift, newAnschrift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEMailAdresse() {
		return eMailAdresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEMailAdresse(String newEMailAdresse) {
		String oldEMailAdresse = eMailAdresse;
		eMailAdresse = newEMailAdresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VORMUND_TYPE__EMAIL_ADRESSE, oldEMailAdresse, eMailAdresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAktenzeichen() {
		return aktenzeichen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAktenzeichen(String newAktenzeichen) {
		String oldAktenzeichen = aktenzeichen;
		aktenzeichen = newAktenzeichen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VORMUND_TYPE__AKTENZEICHEN, oldAktenzeichen, aktenzeichen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTelefonnummer() {
		return telefonnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTelefonnummer(String newTelefonnummer) {
		String oldTelefonnummer = telefonnummer;
		telefonnummer = newTelefonnummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.VORMUND_TYPE__TELEFONNUMMER, oldTelefonnummer, telefonnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.VORMUND_TYPE__NAME:
				return basicSetName(null, msgs);
			case UnterhaltsvorschussPackage.VORMUND_TYPE__ANSCHRIFT:
				return basicSetAnschrift(null, msgs);
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
			case UnterhaltsvorschussPackage.VORMUND_TYPE__NAME:
				return getName();
			case UnterhaltsvorschussPackage.VORMUND_TYPE__ANSCHRIFT:
				return getAnschrift();
			case UnterhaltsvorschussPackage.VORMUND_TYPE__EMAIL_ADRESSE:
				return getEMailAdresse();
			case UnterhaltsvorschussPackage.VORMUND_TYPE__AKTENZEICHEN:
				return getAktenzeichen();
			case UnterhaltsvorschussPackage.VORMUND_TYPE__TELEFONNUMMER:
				return getTelefonnummer();
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
			case UnterhaltsvorschussPackage.VORMUND_TYPE__NAME:
				setName((NameNatuerlichePersonType)newValue);
				return;
			case UnterhaltsvorschussPackage.VORMUND_TYPE__ANSCHRIFT:
				setAnschrift((PostalischeInlandsanschriftBasisType)newValue);
				return;
			case UnterhaltsvorschussPackage.VORMUND_TYPE__EMAIL_ADRESSE:
				setEMailAdresse((String)newValue);
				return;
			case UnterhaltsvorschussPackage.VORMUND_TYPE__AKTENZEICHEN:
				setAktenzeichen((String)newValue);
				return;
			case UnterhaltsvorschussPackage.VORMUND_TYPE__TELEFONNUMMER:
				setTelefonnummer((String)newValue);
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
			case UnterhaltsvorschussPackage.VORMUND_TYPE__NAME:
				setName((NameNatuerlichePersonType)null);
				return;
			case UnterhaltsvorschussPackage.VORMUND_TYPE__ANSCHRIFT:
				setAnschrift((PostalischeInlandsanschriftBasisType)null);
				return;
			case UnterhaltsvorschussPackage.VORMUND_TYPE__EMAIL_ADRESSE:
				setEMailAdresse(EMAIL_ADRESSE_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.VORMUND_TYPE__AKTENZEICHEN:
				setAktenzeichen(AKTENZEICHEN_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.VORMUND_TYPE__TELEFONNUMMER:
				setTelefonnummer(TELEFONNUMMER_EDEFAULT);
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
			case UnterhaltsvorschussPackage.VORMUND_TYPE__NAME:
				return name != null;
			case UnterhaltsvorschussPackage.VORMUND_TYPE__ANSCHRIFT:
				return anschrift != null;
			case UnterhaltsvorschussPackage.VORMUND_TYPE__EMAIL_ADRESSE:
				return EMAIL_ADRESSE_EDEFAULT == null ? eMailAdresse != null : !EMAIL_ADRESSE_EDEFAULT.equals(eMailAdresse);
			case UnterhaltsvorschussPackage.VORMUND_TYPE__AKTENZEICHEN:
				return AKTENZEICHEN_EDEFAULT == null ? aktenzeichen != null : !AKTENZEICHEN_EDEFAULT.equals(aktenzeichen);
			case UnterhaltsvorschussPackage.VORMUND_TYPE__TELEFONNUMMER:
				return TELEFONNUMMER_EDEFAULT == null ? telefonnummer != null : !TELEFONNUMMER_EDEFAULT.equals(telefonnummer);
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
		result.append(" (eMailAdresse: ");
		result.append(eMailAdresse);
		result.append(", aktenzeichen: ");
		result.append(aktenzeichen);
		result.append(", telefonnummer: ");
		result.append(telefonnummer);
		result.append(')');
		return result.toString();
	}

} //VormundTypeImpl
