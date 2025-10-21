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

import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.AmtspflegendeType;
import de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Amtspflegende Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AmtspflegendeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AmtspflegendeTypeImpl#getAnschriftJugendamt <em>Anschrift Jugendamt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AmtspflegendeTypeImpl#getJugendamtEMail <em>Jugendamt EMail</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AmtspflegendeTypeImpl#getAktenzeichen <em>Aktenzeichen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AmtspflegendeTypeImpl#isBeauftragtGeltungsmachungUVanspruch <em>Beauftragt Geltungsmachung UVanspruch</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.impl.AmtspflegendeTypeImpl#getTelefonnummer <em>Telefonnummer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AmtspflegendeTypeImpl extends MinimalEObjectImpl.Container implements AmtspflegendeType {
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
	 * The cached value of the '{@link #getAnschriftJugendamt() <em>Anschrift Jugendamt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschriftJugendamt()
	 * @generated
	 * @ordered
	 */
	protected PostalischeInlandsanschriftBasisType anschriftJugendamt;

	/**
	 * The default value of the '{@link #getJugendamtEMail() <em>Jugendamt EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJugendamtEMail()
	 * @generated
	 * @ordered
	 */
	protected static final String JUGENDAMT_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJugendamtEMail() <em>Jugendamt EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJugendamtEMail()
	 * @generated
	 * @ordered
	 */
	protected String jugendamtEMail = JUGENDAMT_EMAIL_EDEFAULT;

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
	 * The default value of the '{@link #isBeauftragtGeltungsmachungUVanspruch() <em>Beauftragt Geltungsmachung UVanspruch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBeauftragtGeltungsmachungUVanspruch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEAUFTRAGT_GELTUNGSMACHUNG_UVANSPRUCH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBeauftragtGeltungsmachungUVanspruch() <em>Beauftragt Geltungsmachung UVanspruch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBeauftragtGeltungsmachungUVanspruch()
	 * @generated
	 * @ordered
	 */
	protected boolean beauftragtGeltungsmachungUVanspruch = BEAUFTRAGT_GELTUNGSMACHUNG_UVANSPRUCH_EDEFAULT;

	/**
	 * This is true if the Beauftragt Geltungsmachung UVanspruch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean beauftragtGeltungsmachungUVanspruchESet;

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
	protected AmtspflegendeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnterhaltsvorschussPackage.eINSTANCE.getAmtspflegendeType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftBasisType getAnschriftJugendamt() {
		return anschriftJugendamt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnschriftJugendamt(PostalischeInlandsanschriftBasisType newAnschriftJugendamt, NotificationChain msgs) {
		PostalischeInlandsanschriftBasisType oldAnschriftJugendamt = anschriftJugendamt;
		anschriftJugendamt = newAnschriftJugendamt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__ANSCHRIFT_JUGENDAMT, oldAnschriftJugendamt, newAnschriftJugendamt);
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
	public void setAnschriftJugendamt(PostalischeInlandsanschriftBasisType newAnschriftJugendamt) {
		if (newAnschriftJugendamt != anschriftJugendamt) {
			NotificationChain msgs = null;
			if (anschriftJugendamt != null)
				msgs = ((InternalEObject)anschriftJugendamt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__ANSCHRIFT_JUGENDAMT, null, msgs);
			if (newAnschriftJugendamt != null)
				msgs = ((InternalEObject)newAnschriftJugendamt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__ANSCHRIFT_JUGENDAMT, null, msgs);
			msgs = basicSetAnschriftJugendamt(newAnschriftJugendamt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__ANSCHRIFT_JUGENDAMT, newAnschriftJugendamt, newAnschriftJugendamt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJugendamtEMail() {
		return jugendamtEMail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJugendamtEMail(String newJugendamtEMail) {
		String oldJugendamtEMail = jugendamtEMail;
		jugendamtEMail = newJugendamtEMail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__JUGENDAMT_EMAIL, oldJugendamtEMail, jugendamtEMail));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__AKTENZEICHEN, oldAktenzeichen, aktenzeichen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBeauftragtGeltungsmachungUVanspruch() {
		return beauftragtGeltungsmachungUVanspruch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeauftragtGeltungsmachungUVanspruch(boolean newBeauftragtGeltungsmachungUVanspruch) {
		boolean oldBeauftragtGeltungsmachungUVanspruch = beauftragtGeltungsmachungUVanspruch;
		beauftragtGeltungsmachungUVanspruch = newBeauftragtGeltungsmachungUVanspruch;
		boolean oldBeauftragtGeltungsmachungUVanspruchESet = beauftragtGeltungsmachungUVanspruchESet;
		beauftragtGeltungsmachungUVanspruchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__BEAUFTRAGT_GELTUNGSMACHUNG_UVANSPRUCH, oldBeauftragtGeltungsmachungUVanspruch, beauftragtGeltungsmachungUVanspruch, !oldBeauftragtGeltungsmachungUVanspruchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBeauftragtGeltungsmachungUVanspruch() {
		boolean oldBeauftragtGeltungsmachungUVanspruch = beauftragtGeltungsmachungUVanspruch;
		boolean oldBeauftragtGeltungsmachungUVanspruchESet = beauftragtGeltungsmachungUVanspruchESet;
		beauftragtGeltungsmachungUVanspruch = BEAUFTRAGT_GELTUNGSMACHUNG_UVANSPRUCH_EDEFAULT;
		beauftragtGeltungsmachungUVanspruchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__BEAUFTRAGT_GELTUNGSMACHUNG_UVANSPRUCH, oldBeauftragtGeltungsmachungUVanspruch, BEAUFTRAGT_GELTUNGSMACHUNG_UVANSPRUCH_EDEFAULT, oldBeauftragtGeltungsmachungUVanspruchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBeauftragtGeltungsmachungUVanspruch() {
		return beauftragtGeltungsmachungUVanspruchESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__TELEFONNUMMER, oldTelefonnummer, telefonnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__NAME:
				return basicSetName(null, msgs);
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__ANSCHRIFT_JUGENDAMT:
				return basicSetAnschriftJugendamt(null, msgs);
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
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__NAME:
				return getName();
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__ANSCHRIFT_JUGENDAMT:
				return getAnschriftJugendamt();
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__JUGENDAMT_EMAIL:
				return getJugendamtEMail();
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__AKTENZEICHEN:
				return getAktenzeichen();
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__BEAUFTRAGT_GELTUNGSMACHUNG_UVANSPRUCH:
				return isBeauftragtGeltungsmachungUVanspruch();
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__TELEFONNUMMER:
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
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__NAME:
				setName((NameNatuerlichePersonType)newValue);
				return;
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__ANSCHRIFT_JUGENDAMT:
				setAnschriftJugendamt((PostalischeInlandsanschriftBasisType)newValue);
				return;
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__JUGENDAMT_EMAIL:
				setJugendamtEMail((String)newValue);
				return;
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__AKTENZEICHEN:
				setAktenzeichen((String)newValue);
				return;
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__BEAUFTRAGT_GELTUNGSMACHUNG_UVANSPRUCH:
				setBeauftragtGeltungsmachungUVanspruch((Boolean)newValue);
				return;
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__TELEFONNUMMER:
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
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__NAME:
				setName((NameNatuerlichePersonType)null);
				return;
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__ANSCHRIFT_JUGENDAMT:
				setAnschriftJugendamt((PostalischeInlandsanschriftBasisType)null);
				return;
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__JUGENDAMT_EMAIL:
				setJugendamtEMail(JUGENDAMT_EMAIL_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__AKTENZEICHEN:
				setAktenzeichen(AKTENZEICHEN_EDEFAULT);
				return;
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__BEAUFTRAGT_GELTUNGSMACHUNG_UVANSPRUCH:
				unsetBeauftragtGeltungsmachungUVanspruch();
				return;
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__TELEFONNUMMER:
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
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__NAME:
				return name != null;
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__ANSCHRIFT_JUGENDAMT:
				return anschriftJugendamt != null;
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__JUGENDAMT_EMAIL:
				return JUGENDAMT_EMAIL_EDEFAULT == null ? jugendamtEMail != null : !JUGENDAMT_EMAIL_EDEFAULT.equals(jugendamtEMail);
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__AKTENZEICHEN:
				return AKTENZEICHEN_EDEFAULT == null ? aktenzeichen != null : !AKTENZEICHEN_EDEFAULT.equals(aktenzeichen);
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__BEAUFTRAGT_GELTUNGSMACHUNG_UVANSPRUCH:
				return isSetBeauftragtGeltungsmachungUVanspruch();
			case UnterhaltsvorschussPackage.AMTSPFLEGENDE_TYPE__TELEFONNUMMER:
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
		result.append(" (jugendamtEMail: ");
		result.append(jugendamtEMail);
		result.append(", aktenzeichen: ");
		result.append(aktenzeichen);
		result.append(", beauftragtGeltungsmachungUVanspruch: ");
		if (beauftragtGeltungsmachungUVanspruchESet) result.append(beauftragtGeltungsmachungUVanspruch); else result.append("<unset>");
		result.append(", telefonnummer: ");
		result.append(telefonnummer);
		result.append(')');
		return result.toString();
	}

} //AmtspflegendeTypeImpl
