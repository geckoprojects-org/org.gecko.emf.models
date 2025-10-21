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
package de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.GeburtType;
import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType;

import de.xoev.xfamilie.beistandschaft._1.beistandschaft.AngabenZumKindBeendigungType;
import de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angaben Zum Kind Beendigung Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumKindBeendigungTypeImpl#getNameDesKindes <em>Name Des Kindes</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumKindBeendigungTypeImpl#getGeburtsdaten <em>Geburtsdaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumKindBeendigungTypeImpl#isAnschriftStimmtMitAntragstellendemElternteilUeberein <em>Anschrift Stimmt Mit Antragstellendem Elternteil Ueberein</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumKindBeendigungTypeImpl#getKindAdresse <em>Kind Adresse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.impl.AngabenZumKindBeendigungTypeImpl#getAktenzeichenVorgangsnummer <em>Aktenzeichen Vorgangsnummer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngabenZumKindBeendigungTypeImpl extends MinimalEObjectImpl.Container implements AngabenZumKindBeendigungType {
	/**
	 * The cached value of the '{@link #getNameDesKindes() <em>Name Des Kindes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameDesKindes()
	 * @generated
	 * @ordered
	 */
	protected NameNatuerlichePersonType nameDesKindes;

	/**
	 * The cached value of the '{@link #getGeburtsdaten() <em>Geburtsdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburtsdaten()
	 * @generated
	 * @ordered
	 */
	protected GeburtType geburtsdaten;

	/**
	 * The default value of the '{@link #isAnschriftStimmtMitAntragstellendemElternteilUeberein() <em>Anschrift Stimmt Mit Antragstellendem Elternteil Ueberein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnschriftStimmtMitAntragstellendemElternteilUeberein()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ANSCHRIFT_STIMMT_MIT_ANTRAGSTELLENDEM_ELTERNTEIL_UEBEREIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAnschriftStimmtMitAntragstellendemElternteilUeberein() <em>Anschrift Stimmt Mit Antragstellendem Elternteil Ueberein</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAnschriftStimmtMitAntragstellendemElternteilUeberein()
	 * @generated
	 * @ordered
	 */
	protected boolean anschriftStimmtMitAntragstellendemElternteilUeberein = ANSCHRIFT_STIMMT_MIT_ANTRAGSTELLENDEM_ELTERNTEIL_UEBEREIN_EDEFAULT;

	/**
	 * This is true if the Anschrift Stimmt Mit Antragstellendem Elternteil Ueberein attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean anschriftStimmtMitAntragstellendemElternteilUebereinESet;

	/**
	 * The cached value of the '{@link #getKindAdresse() <em>Kind Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindAdresse()
	 * @generated
	 * @ordered
	 */
	protected PostalischeInlandsanschriftBasisType kindAdresse;

	/**
	 * The default value of the '{@link #getAktenzeichenVorgangsnummer() <em>Aktenzeichen Vorgangsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktenzeichenVorgangsnummer()
	 * @generated
	 * @ordered
	 */
	protected static final String AKTENZEICHEN_VORGANGSNUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAktenzeichenVorgangsnummer() <em>Aktenzeichen Vorgangsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktenzeichenVorgangsnummer()
	 * @generated
	 * @ordered
	 */
	protected String aktenzeichenVorgangsnummer = AKTENZEICHEN_VORGANGSNUMMER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngabenZumKindBeendigungTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BeistandschaftPackage.Literals.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameNatuerlichePersonType getNameDesKindes() {
		return nameDesKindes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameDesKindes(NameNatuerlichePersonType newNameDesKindes, NotificationChain msgs) {
		NameNatuerlichePersonType oldNameDesKindes = nameDesKindes;
		nameDesKindes = newNameDesKindes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__NAME_DES_KINDES, oldNameDesKindes, newNameDesKindes);
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
	public void setNameDesKindes(NameNatuerlichePersonType newNameDesKindes) {
		if (newNameDesKindes != nameDesKindes) {
			NotificationChain msgs = null;
			if (nameDesKindes != null)
				msgs = ((InternalEObject)nameDesKindes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__NAME_DES_KINDES, null, msgs);
			if (newNameDesKindes != null)
				msgs = ((InternalEObject)newNameDesKindes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__NAME_DES_KINDES, null, msgs);
			msgs = basicSetNameDesKindes(newNameDesKindes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__NAME_DES_KINDES, newNameDesKindes, newNameDesKindes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeburtType getGeburtsdaten() {
		return geburtsdaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeburtsdaten(GeburtType newGeburtsdaten, NotificationChain msgs) {
		GeburtType oldGeburtsdaten = geburtsdaten;
		geburtsdaten = newGeburtsdaten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__GEBURTSDATEN, oldGeburtsdaten, newGeburtsdaten);
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
	public void setGeburtsdaten(GeburtType newGeburtsdaten) {
		if (newGeburtsdaten != geburtsdaten) {
			NotificationChain msgs = null;
			if (geburtsdaten != null)
				msgs = ((InternalEObject)geburtsdaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__GEBURTSDATEN, null, msgs);
			if (newGeburtsdaten != null)
				msgs = ((InternalEObject)newGeburtsdaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__GEBURTSDATEN, null, msgs);
			msgs = basicSetGeburtsdaten(newGeburtsdaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__GEBURTSDATEN, newGeburtsdaten, newGeburtsdaten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAnschriftStimmtMitAntragstellendemElternteilUeberein() {
		return anschriftStimmtMitAntragstellendemElternteilUeberein;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnschriftStimmtMitAntragstellendemElternteilUeberein(boolean newAnschriftStimmtMitAntragstellendemElternteilUeberein) {
		boolean oldAnschriftStimmtMitAntragstellendemElternteilUeberein = anschriftStimmtMitAntragstellendemElternteilUeberein;
		anschriftStimmtMitAntragstellendemElternteilUeberein = newAnschriftStimmtMitAntragstellendemElternteilUeberein;
		boolean oldAnschriftStimmtMitAntragstellendemElternteilUebereinESet = anschriftStimmtMitAntragstellendemElternteilUebereinESet;
		anschriftStimmtMitAntragstellendemElternteilUebereinESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__ANSCHRIFT_STIMMT_MIT_ANTRAGSTELLENDEM_ELTERNTEIL_UEBEREIN, oldAnschriftStimmtMitAntragstellendemElternteilUeberein, anschriftStimmtMitAntragstellendemElternteilUeberein, !oldAnschriftStimmtMitAntragstellendemElternteilUebereinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAnschriftStimmtMitAntragstellendemElternteilUeberein() {
		boolean oldAnschriftStimmtMitAntragstellendemElternteilUeberein = anschriftStimmtMitAntragstellendemElternteilUeberein;
		boolean oldAnschriftStimmtMitAntragstellendemElternteilUebereinESet = anschriftStimmtMitAntragstellendemElternteilUebereinESet;
		anschriftStimmtMitAntragstellendemElternteilUeberein = ANSCHRIFT_STIMMT_MIT_ANTRAGSTELLENDEM_ELTERNTEIL_UEBEREIN_EDEFAULT;
		anschriftStimmtMitAntragstellendemElternteilUebereinESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__ANSCHRIFT_STIMMT_MIT_ANTRAGSTELLENDEM_ELTERNTEIL_UEBEREIN, oldAnschriftStimmtMitAntragstellendemElternteilUeberein, ANSCHRIFT_STIMMT_MIT_ANTRAGSTELLENDEM_ELTERNTEIL_UEBEREIN_EDEFAULT, oldAnschriftStimmtMitAntragstellendemElternteilUebereinESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAnschriftStimmtMitAntragstellendemElternteilUeberein() {
		return anschriftStimmtMitAntragstellendemElternteilUebereinESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalischeInlandsanschriftBasisType getKindAdresse() {
		return kindAdresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKindAdresse(PostalischeInlandsanschriftBasisType newKindAdresse, NotificationChain msgs) {
		PostalischeInlandsanschriftBasisType oldKindAdresse = kindAdresse;
		kindAdresse = newKindAdresse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__KIND_ADRESSE, oldKindAdresse, newKindAdresse);
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
	public void setKindAdresse(PostalischeInlandsanschriftBasisType newKindAdresse) {
		if (newKindAdresse != kindAdresse) {
			NotificationChain msgs = null;
			if (kindAdresse != null)
				msgs = ((InternalEObject)kindAdresse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__KIND_ADRESSE, null, msgs);
			if (newKindAdresse != null)
				msgs = ((InternalEObject)newKindAdresse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__KIND_ADRESSE, null, msgs);
			msgs = basicSetKindAdresse(newKindAdresse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__KIND_ADRESSE, newKindAdresse, newKindAdresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAktenzeichenVorgangsnummer() {
		return aktenzeichenVorgangsnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAktenzeichenVorgangsnummer(String newAktenzeichenVorgangsnummer) {
		String oldAktenzeichenVorgangsnummer = aktenzeichenVorgangsnummer;
		aktenzeichenVorgangsnummer = newAktenzeichenVorgangsnummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__AKTENZEICHEN_VORGANGSNUMMER, oldAktenzeichenVorgangsnummer, aktenzeichenVorgangsnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__NAME_DES_KINDES:
				return basicSetNameDesKindes(null, msgs);
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__GEBURTSDATEN:
				return basicSetGeburtsdaten(null, msgs);
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__KIND_ADRESSE:
				return basicSetKindAdresse(null, msgs);
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
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__NAME_DES_KINDES:
				return getNameDesKindes();
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__GEBURTSDATEN:
				return getGeburtsdaten();
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__ANSCHRIFT_STIMMT_MIT_ANTRAGSTELLENDEM_ELTERNTEIL_UEBEREIN:
				return isAnschriftStimmtMitAntragstellendemElternteilUeberein();
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__KIND_ADRESSE:
				return getKindAdresse();
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__AKTENZEICHEN_VORGANGSNUMMER:
				return getAktenzeichenVorgangsnummer();
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
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__NAME_DES_KINDES:
				setNameDesKindes((NameNatuerlichePersonType)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__GEBURTSDATEN:
				setGeburtsdaten((GeburtType)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__ANSCHRIFT_STIMMT_MIT_ANTRAGSTELLENDEM_ELTERNTEIL_UEBEREIN:
				setAnschriftStimmtMitAntragstellendemElternteilUeberein((Boolean)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__KIND_ADRESSE:
				setKindAdresse((PostalischeInlandsanschriftBasisType)newValue);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__AKTENZEICHEN_VORGANGSNUMMER:
				setAktenzeichenVorgangsnummer((String)newValue);
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
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__NAME_DES_KINDES:
				setNameDesKindes((NameNatuerlichePersonType)null);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__GEBURTSDATEN:
				setGeburtsdaten((GeburtType)null);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__ANSCHRIFT_STIMMT_MIT_ANTRAGSTELLENDEM_ELTERNTEIL_UEBEREIN:
				unsetAnschriftStimmtMitAntragstellendemElternteilUeberein();
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__KIND_ADRESSE:
				setKindAdresse((PostalischeInlandsanschriftBasisType)null);
				return;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__AKTENZEICHEN_VORGANGSNUMMER:
				setAktenzeichenVorgangsnummer(AKTENZEICHEN_VORGANGSNUMMER_EDEFAULT);
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
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__NAME_DES_KINDES:
				return nameDesKindes != null;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__GEBURTSDATEN:
				return geburtsdaten != null;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__ANSCHRIFT_STIMMT_MIT_ANTRAGSTELLENDEM_ELTERNTEIL_UEBEREIN:
				return isSetAnschriftStimmtMitAntragstellendemElternteilUeberein();
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__KIND_ADRESSE:
				return kindAdresse != null;
			case BeistandschaftPackage.ANGABEN_ZUM_KIND_BEENDIGUNG_TYPE__AKTENZEICHEN_VORGANGSNUMMER:
				return AKTENZEICHEN_VORGANGSNUMMER_EDEFAULT == null ? aktenzeichenVorgangsnummer != null : !AKTENZEICHEN_VORGANGSNUMMER_EDEFAULT.equals(aktenzeichenVorgangsnummer);
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
		result.append(" (anschriftStimmtMitAntragstellendemElternteilUeberein: ");
		if (anschriftStimmtMitAntragstellendemElternteilUebereinESet) result.append(anschriftStimmtMitAntragstellendemElternteilUeberein); else result.append("<unset>");
		result.append(", aktenzeichenVorgangsnummer: ");
		result.append(aktenzeichenVorgangsnummer);
		result.append(')');
		return result.toString();
	}

} //AngabenZumKindBeendigungTypeImpl
