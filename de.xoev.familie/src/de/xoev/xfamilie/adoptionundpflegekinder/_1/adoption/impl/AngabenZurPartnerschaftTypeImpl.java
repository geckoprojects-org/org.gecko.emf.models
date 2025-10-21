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
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenZurPartnerschaftType;

import de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angaben Zur Partnerschaft Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZurPartnerschaftTypeImpl#getDauerPartnerschaft <em>Dauer Partnerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZurPartnerschaftTypeImpl#getDauerGemeinsamerHaushalt <em>Dauer Gemeinsamer Haushalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZurPartnerschaftTypeImpl#isVerheiratetOderLebenspartnerschaft <em>Verheiratet Oder Lebenspartnerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZurPartnerschaftTypeImpl#getDauerVerheiratetOderLebenspartnerschaft <em>Dauer Verheiratet Oder Lebenspartnerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZurPartnerschaftTypeImpl#isGespraechUeberAdoption <em>Gespraech Ueber Adoption</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZurPartnerschaftTypeImpl#getMeinungFamilieUndFreunde <em>Meinung Familie Und Freunde</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZurPartnerschaftTypeImpl#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZurPartnerschaftTypeImpl#getWohnverhaeltnisseAnzahlZimmer <em>Wohnverhaeltnisse Anzahl Zimmer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZurPartnerschaftTypeImpl#getWohnverhaeltnisseWohnflaeche <em>Wohnverhaeltnisse Wohnflaeche</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZurPartnerschaftTypeImpl#isMieteOderEigentum <em>Miete Oder Eigentum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZurPartnerschaftTypeImpl#isGarten <em>Garten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZurPartnerschaftTypeImpl#isKinderzimmer <em>Kinderzimmer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenZurPartnerschaftTypeImpl#isHaustiere <em>Haustiere</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngabenZurPartnerschaftTypeImpl extends MinimalEObjectImpl.Container implements AngabenZurPartnerschaftType {
	/**
	 * The default value of the '{@link #getDauerPartnerschaft() <em>Dauer Partnerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDauerPartnerschaft()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DAUER_PARTNERSCHAFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDauerPartnerschaft() <em>Dauer Partnerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDauerPartnerschaft()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dauerPartnerschaft = DAUER_PARTNERSCHAFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDauerGemeinsamerHaushalt() <em>Dauer Gemeinsamer Haushalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDauerGemeinsamerHaushalt()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DAUER_GEMEINSAMER_HAUSHALT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDauerGemeinsamerHaushalt() <em>Dauer Gemeinsamer Haushalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDauerGemeinsamerHaushalt()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dauerGemeinsamerHaushalt = DAUER_GEMEINSAMER_HAUSHALT_EDEFAULT;

	/**
	 * The default value of the '{@link #isVerheiratetOderLebenspartnerschaft() <em>Verheiratet Oder Lebenspartnerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerheiratetOderLebenspartnerschaft()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERHEIRATET_ODER_LEBENSPARTNERSCHAFT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVerheiratetOderLebenspartnerschaft() <em>Verheiratet Oder Lebenspartnerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerheiratetOderLebenspartnerschaft()
	 * @generated
	 * @ordered
	 */
	protected boolean verheiratetOderLebenspartnerschaft = VERHEIRATET_ODER_LEBENSPARTNERSCHAFT_EDEFAULT;

	/**
	 * This is true if the Verheiratet Oder Lebenspartnerschaft attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean verheiratetOderLebenspartnerschaftESet;

	/**
	 * The default value of the '{@link #getDauerVerheiratetOderLebenspartnerschaft() <em>Dauer Verheiratet Oder Lebenspartnerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDauerVerheiratetOderLebenspartnerschaft()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger DAUER_VERHEIRATET_ODER_LEBENSPARTNERSCHAFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDauerVerheiratetOderLebenspartnerschaft() <em>Dauer Verheiratet Oder Lebenspartnerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDauerVerheiratetOderLebenspartnerschaft()
	 * @generated
	 * @ordered
	 */
	protected BigInteger dauerVerheiratetOderLebenspartnerschaft = DAUER_VERHEIRATET_ODER_LEBENSPARTNERSCHAFT_EDEFAULT;

	/**
	 * The default value of the '{@link #isGespraechUeberAdoption() <em>Gespraech Ueber Adoption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGespraechUeberAdoption()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GESPRAECH_UEBER_ADOPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGespraechUeberAdoption() <em>Gespraech Ueber Adoption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGespraechUeberAdoption()
	 * @generated
	 * @ordered
	 */
	protected boolean gespraechUeberAdoption = GESPRAECH_UEBER_ADOPTION_EDEFAULT;

	/**
	 * This is true if the Gespraech Ueber Adoption attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gespraechUeberAdoptionESet;

	/**
	 * The default value of the '{@link #getMeinungFamilieUndFreunde() <em>Meinung Familie Und Freunde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeinungFamilieUndFreunde()
	 * @generated
	 * @ordered
	 */
	protected static final String MEINUNG_FAMILIE_UND_FREUNDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeinungFamilieUndFreunde() <em>Meinung Familie Und Freunde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeinungFamilieUndFreunde()
	 * @generated
	 * @ordered
	 */
	protected String meinungFamilieUndFreunde = MEINUNG_FAMILIE_UND_FREUNDE_EDEFAULT;

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
	 * The default value of the '{@link #getWohnverhaeltnisseAnzahlZimmer() <em>Wohnverhaeltnisse Anzahl Zimmer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnverhaeltnisseAnzahlZimmer()
	 * @generated
	 * @ordered
	 */
	protected static final float WOHNVERHAELTNISSE_ANZAHL_ZIMMER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWohnverhaeltnisseAnzahlZimmer() <em>Wohnverhaeltnisse Anzahl Zimmer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnverhaeltnisseAnzahlZimmer()
	 * @generated
	 * @ordered
	 */
	protected float wohnverhaeltnisseAnzahlZimmer = WOHNVERHAELTNISSE_ANZAHL_ZIMMER_EDEFAULT;

	/**
	 * This is true if the Wohnverhaeltnisse Anzahl Zimmer attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wohnverhaeltnisseAnzahlZimmerESet;

	/**
	 * The default value of the '{@link #getWohnverhaeltnisseWohnflaeche() <em>Wohnverhaeltnisse Wohnflaeche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnverhaeltnisseWohnflaeche()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger WOHNVERHAELTNISSE_WOHNFLAECHE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWohnverhaeltnisseWohnflaeche() <em>Wohnverhaeltnisse Wohnflaeche</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWohnverhaeltnisseWohnflaeche()
	 * @generated
	 * @ordered
	 */
	protected BigInteger wohnverhaeltnisseWohnflaeche = WOHNVERHAELTNISSE_WOHNFLAECHE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMieteOderEigentum() <em>Miete Oder Eigentum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMieteOderEigentum()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MIETE_ODER_EIGENTUM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMieteOderEigentum() <em>Miete Oder Eigentum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMieteOderEigentum()
	 * @generated
	 * @ordered
	 */
	protected boolean mieteOderEigentum = MIETE_ODER_EIGENTUM_EDEFAULT;

	/**
	 * This is true if the Miete Oder Eigentum attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mieteOderEigentumESet;

	/**
	 * The default value of the '{@link #isGarten() <em>Garten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGarten()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GARTEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGarten() <em>Garten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGarten()
	 * @generated
	 * @ordered
	 */
	protected boolean garten = GARTEN_EDEFAULT;

	/**
	 * This is true if the Garten attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gartenESet;

	/**
	 * The default value of the '{@link #isKinderzimmer() <em>Kinderzimmer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKinderzimmer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KINDERZIMMER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKinderzimmer() <em>Kinderzimmer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKinderzimmer()
	 * @generated
	 * @ordered
	 */
	protected boolean kinderzimmer = KINDERZIMMER_EDEFAULT;

	/**
	 * This is true if the Kinderzimmer attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kinderzimmerESet;

	/**
	 * The default value of the '{@link #isHaustiere() <em>Haustiere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHaustiere()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAUSTIERE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHaustiere() <em>Haustiere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHaustiere()
	 * @generated
	 * @ordered
	 */
	protected boolean haustiere = HAUSTIERE_EDEFAULT;

	/**
	 * This is true if the Haustiere attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean haustiereESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngabenZurPartnerschaftTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.ANGABEN_ZUR_PARTNERSCHAFT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getDauerPartnerschaft() {
		return dauerPartnerschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDauerPartnerschaft(BigInteger newDauerPartnerschaft) {
		BigInteger oldDauerPartnerschaft = dauerPartnerschaft;
		dauerPartnerschaft = newDauerPartnerschaft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_PARTNERSCHAFT, oldDauerPartnerschaft, dauerPartnerschaft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getDauerGemeinsamerHaushalt() {
		return dauerGemeinsamerHaushalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDauerGemeinsamerHaushalt(BigInteger newDauerGemeinsamerHaushalt) {
		BigInteger oldDauerGemeinsamerHaushalt = dauerGemeinsamerHaushalt;
		dauerGemeinsamerHaushalt = newDauerGemeinsamerHaushalt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_GEMEINSAMER_HAUSHALT, oldDauerGemeinsamerHaushalt, dauerGemeinsamerHaushalt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVerheiratetOderLebenspartnerschaft() {
		return verheiratetOderLebenspartnerschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerheiratetOderLebenspartnerschaft(boolean newVerheiratetOderLebenspartnerschaft) {
		boolean oldVerheiratetOderLebenspartnerschaft = verheiratetOderLebenspartnerschaft;
		verheiratetOderLebenspartnerschaft = newVerheiratetOderLebenspartnerschaft;
		boolean oldVerheiratetOderLebenspartnerschaftESet = verheiratetOderLebenspartnerschaftESet;
		verheiratetOderLebenspartnerschaftESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__VERHEIRATET_ODER_LEBENSPARTNERSCHAFT, oldVerheiratetOderLebenspartnerschaft, verheiratetOderLebenspartnerschaft, !oldVerheiratetOderLebenspartnerschaftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetVerheiratetOderLebenspartnerschaft() {
		boolean oldVerheiratetOderLebenspartnerschaft = verheiratetOderLebenspartnerschaft;
		boolean oldVerheiratetOderLebenspartnerschaftESet = verheiratetOderLebenspartnerschaftESet;
		verheiratetOderLebenspartnerschaft = VERHEIRATET_ODER_LEBENSPARTNERSCHAFT_EDEFAULT;
		verheiratetOderLebenspartnerschaftESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__VERHEIRATET_ODER_LEBENSPARTNERSCHAFT, oldVerheiratetOderLebenspartnerschaft, VERHEIRATET_ODER_LEBENSPARTNERSCHAFT_EDEFAULT, oldVerheiratetOderLebenspartnerschaftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetVerheiratetOderLebenspartnerschaft() {
		return verheiratetOderLebenspartnerschaftESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getDauerVerheiratetOderLebenspartnerschaft() {
		return dauerVerheiratetOderLebenspartnerschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDauerVerheiratetOderLebenspartnerschaft(BigInteger newDauerVerheiratetOderLebenspartnerschaft) {
		BigInteger oldDauerVerheiratetOderLebenspartnerschaft = dauerVerheiratetOderLebenspartnerschaft;
		dauerVerheiratetOderLebenspartnerschaft = newDauerVerheiratetOderLebenspartnerschaft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_VERHEIRATET_ODER_LEBENSPARTNERSCHAFT, oldDauerVerheiratetOderLebenspartnerschaft, dauerVerheiratetOderLebenspartnerschaft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGespraechUeberAdoption() {
		return gespraechUeberAdoption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGespraechUeberAdoption(boolean newGespraechUeberAdoption) {
		boolean oldGespraechUeberAdoption = gespraechUeberAdoption;
		gespraechUeberAdoption = newGespraechUeberAdoption;
		boolean oldGespraechUeberAdoptionESet = gespraechUeberAdoptionESet;
		gespraechUeberAdoptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__GESPRAECH_UEBER_ADOPTION, oldGespraechUeberAdoption, gespraechUeberAdoption, !oldGespraechUeberAdoptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGespraechUeberAdoption() {
		boolean oldGespraechUeberAdoption = gespraechUeberAdoption;
		boolean oldGespraechUeberAdoptionESet = gespraechUeberAdoptionESet;
		gespraechUeberAdoption = GESPRAECH_UEBER_ADOPTION_EDEFAULT;
		gespraechUeberAdoptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__GESPRAECH_UEBER_ADOPTION, oldGespraechUeberAdoption, GESPRAECH_UEBER_ADOPTION_EDEFAULT, oldGespraechUeberAdoptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGespraechUeberAdoption() {
		return gespraechUeberAdoptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMeinungFamilieUndFreunde() {
		return meinungFamilieUndFreunde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMeinungFamilieUndFreunde(String newMeinungFamilieUndFreunde) {
		String oldMeinungFamilieUndFreunde = meinungFamilieUndFreunde;
		meinungFamilieUndFreunde = newMeinungFamilieUndFreunde;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__MEINUNG_FAMILIE_UND_FREUNDE, oldMeinungFamilieUndFreunde, meinungFamilieUndFreunde));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__ANSCHRIFT, oldAnschrift, newAnschrift);
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
				msgs = ((InternalEObject)anschrift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__ANSCHRIFT, null, msgs);
			if (newAnschrift != null)
				msgs = ((InternalEObject)newAnschrift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__ANSCHRIFT, null, msgs);
			msgs = basicSetAnschrift(newAnschrift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__ANSCHRIFT, newAnschrift, newAnschrift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getWohnverhaeltnisseAnzahlZimmer() {
		return wohnverhaeltnisseAnzahlZimmer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWohnverhaeltnisseAnzahlZimmer(float newWohnverhaeltnisseAnzahlZimmer) {
		float oldWohnverhaeltnisseAnzahlZimmer = wohnverhaeltnisseAnzahlZimmer;
		wohnverhaeltnisseAnzahlZimmer = newWohnverhaeltnisseAnzahlZimmer;
		boolean oldWohnverhaeltnisseAnzahlZimmerESet = wohnverhaeltnisseAnzahlZimmerESet;
		wohnverhaeltnisseAnzahlZimmerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__WOHNVERHAELTNISSE_ANZAHL_ZIMMER, oldWohnverhaeltnisseAnzahlZimmer, wohnverhaeltnisseAnzahlZimmer, !oldWohnverhaeltnisseAnzahlZimmerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetWohnverhaeltnisseAnzahlZimmer() {
		float oldWohnverhaeltnisseAnzahlZimmer = wohnverhaeltnisseAnzahlZimmer;
		boolean oldWohnverhaeltnisseAnzahlZimmerESet = wohnverhaeltnisseAnzahlZimmerESet;
		wohnverhaeltnisseAnzahlZimmer = WOHNVERHAELTNISSE_ANZAHL_ZIMMER_EDEFAULT;
		wohnverhaeltnisseAnzahlZimmerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__WOHNVERHAELTNISSE_ANZAHL_ZIMMER, oldWohnverhaeltnisseAnzahlZimmer, WOHNVERHAELTNISSE_ANZAHL_ZIMMER_EDEFAULT, oldWohnverhaeltnisseAnzahlZimmerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetWohnverhaeltnisseAnzahlZimmer() {
		return wohnverhaeltnisseAnzahlZimmerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getWohnverhaeltnisseWohnflaeche() {
		return wohnverhaeltnisseWohnflaeche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWohnverhaeltnisseWohnflaeche(BigInteger newWohnverhaeltnisseWohnflaeche) {
		BigInteger oldWohnverhaeltnisseWohnflaeche = wohnverhaeltnisseWohnflaeche;
		wohnverhaeltnisseWohnflaeche = newWohnverhaeltnisseWohnflaeche;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__WOHNVERHAELTNISSE_WOHNFLAECHE, oldWohnverhaeltnisseWohnflaeche, wohnverhaeltnisseWohnflaeche));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMieteOderEigentum() {
		return mieteOderEigentum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMieteOderEigentum(boolean newMieteOderEigentum) {
		boolean oldMieteOderEigentum = mieteOderEigentum;
		mieteOderEigentum = newMieteOderEigentum;
		boolean oldMieteOderEigentumESet = mieteOderEigentumESet;
		mieteOderEigentumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__MIETE_ODER_EIGENTUM, oldMieteOderEigentum, mieteOderEigentum, !oldMieteOderEigentumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMieteOderEigentum() {
		boolean oldMieteOderEigentum = mieteOderEigentum;
		boolean oldMieteOderEigentumESet = mieteOderEigentumESet;
		mieteOderEigentum = MIETE_ODER_EIGENTUM_EDEFAULT;
		mieteOderEigentumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__MIETE_ODER_EIGENTUM, oldMieteOderEigentum, MIETE_ODER_EIGENTUM_EDEFAULT, oldMieteOderEigentumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMieteOderEigentum() {
		return mieteOderEigentumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGarten() {
		return garten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGarten(boolean newGarten) {
		boolean oldGarten = garten;
		garten = newGarten;
		boolean oldGartenESet = gartenESet;
		gartenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__GARTEN, oldGarten, garten, !oldGartenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGarten() {
		boolean oldGarten = garten;
		boolean oldGartenESet = gartenESet;
		garten = GARTEN_EDEFAULT;
		gartenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__GARTEN, oldGarten, GARTEN_EDEFAULT, oldGartenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGarten() {
		return gartenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isKinderzimmer() {
		return kinderzimmer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKinderzimmer(boolean newKinderzimmer) {
		boolean oldKinderzimmer = kinderzimmer;
		kinderzimmer = newKinderzimmer;
		boolean oldKinderzimmerESet = kinderzimmerESet;
		kinderzimmerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__KINDERZIMMER, oldKinderzimmer, kinderzimmer, !oldKinderzimmerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetKinderzimmer() {
		boolean oldKinderzimmer = kinderzimmer;
		boolean oldKinderzimmerESet = kinderzimmerESet;
		kinderzimmer = KINDERZIMMER_EDEFAULT;
		kinderzimmerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__KINDERZIMMER, oldKinderzimmer, KINDERZIMMER_EDEFAULT, oldKinderzimmerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetKinderzimmer() {
		return kinderzimmerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHaustiere() {
		return haustiere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHaustiere(boolean newHaustiere) {
		boolean oldHaustiere = haustiere;
		haustiere = newHaustiere;
		boolean oldHaustiereESet = haustiereESet;
		haustiereESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__HAUSTIERE, oldHaustiere, haustiere, !oldHaustiereESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHaustiere() {
		boolean oldHaustiere = haustiere;
		boolean oldHaustiereESet = haustiereESet;
		haustiere = HAUSTIERE_EDEFAULT;
		haustiereESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__HAUSTIERE, oldHaustiere, HAUSTIERE_EDEFAULT, oldHaustiereESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHaustiere() {
		return haustiereESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__ANSCHRIFT:
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
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_PARTNERSCHAFT:
				return getDauerPartnerschaft();
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_GEMEINSAMER_HAUSHALT:
				return getDauerGemeinsamerHaushalt();
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__VERHEIRATET_ODER_LEBENSPARTNERSCHAFT:
				return isVerheiratetOderLebenspartnerschaft();
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_VERHEIRATET_ODER_LEBENSPARTNERSCHAFT:
				return getDauerVerheiratetOderLebenspartnerschaft();
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__GESPRAECH_UEBER_ADOPTION:
				return isGespraechUeberAdoption();
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__MEINUNG_FAMILIE_UND_FREUNDE:
				return getMeinungFamilieUndFreunde();
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__ANSCHRIFT:
				return getAnschrift();
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__WOHNVERHAELTNISSE_ANZAHL_ZIMMER:
				return getWohnverhaeltnisseAnzahlZimmer();
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__WOHNVERHAELTNISSE_WOHNFLAECHE:
				return getWohnverhaeltnisseWohnflaeche();
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__MIETE_ODER_EIGENTUM:
				return isMieteOderEigentum();
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__GARTEN:
				return isGarten();
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__KINDERZIMMER:
				return isKinderzimmer();
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__HAUSTIERE:
				return isHaustiere();
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
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_PARTNERSCHAFT:
				setDauerPartnerschaft((BigInteger)newValue);
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_GEMEINSAMER_HAUSHALT:
				setDauerGemeinsamerHaushalt((BigInteger)newValue);
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__VERHEIRATET_ODER_LEBENSPARTNERSCHAFT:
				setVerheiratetOderLebenspartnerschaft((Boolean)newValue);
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_VERHEIRATET_ODER_LEBENSPARTNERSCHAFT:
				setDauerVerheiratetOderLebenspartnerschaft((BigInteger)newValue);
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__GESPRAECH_UEBER_ADOPTION:
				setGespraechUeberAdoption((Boolean)newValue);
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__MEINUNG_FAMILIE_UND_FREUNDE:
				setMeinungFamilieUndFreunde((String)newValue);
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__ANSCHRIFT:
				setAnschrift((MeldeanschriftType)newValue);
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__WOHNVERHAELTNISSE_ANZAHL_ZIMMER:
				setWohnverhaeltnisseAnzahlZimmer((Float)newValue);
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__WOHNVERHAELTNISSE_WOHNFLAECHE:
				setWohnverhaeltnisseWohnflaeche((BigInteger)newValue);
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__MIETE_ODER_EIGENTUM:
				setMieteOderEigentum((Boolean)newValue);
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__GARTEN:
				setGarten((Boolean)newValue);
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__KINDERZIMMER:
				setKinderzimmer((Boolean)newValue);
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__HAUSTIERE:
				setHaustiere((Boolean)newValue);
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
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_PARTNERSCHAFT:
				setDauerPartnerschaft(DAUER_PARTNERSCHAFT_EDEFAULT);
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_GEMEINSAMER_HAUSHALT:
				setDauerGemeinsamerHaushalt(DAUER_GEMEINSAMER_HAUSHALT_EDEFAULT);
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__VERHEIRATET_ODER_LEBENSPARTNERSCHAFT:
				unsetVerheiratetOderLebenspartnerschaft();
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_VERHEIRATET_ODER_LEBENSPARTNERSCHAFT:
				setDauerVerheiratetOderLebenspartnerschaft(DAUER_VERHEIRATET_ODER_LEBENSPARTNERSCHAFT_EDEFAULT);
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__GESPRAECH_UEBER_ADOPTION:
				unsetGespraechUeberAdoption();
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__MEINUNG_FAMILIE_UND_FREUNDE:
				setMeinungFamilieUndFreunde(MEINUNG_FAMILIE_UND_FREUNDE_EDEFAULT);
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__ANSCHRIFT:
				setAnschrift((MeldeanschriftType)null);
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__WOHNVERHAELTNISSE_ANZAHL_ZIMMER:
				unsetWohnverhaeltnisseAnzahlZimmer();
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__WOHNVERHAELTNISSE_WOHNFLAECHE:
				setWohnverhaeltnisseWohnflaeche(WOHNVERHAELTNISSE_WOHNFLAECHE_EDEFAULT);
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__MIETE_ODER_EIGENTUM:
				unsetMieteOderEigentum();
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__GARTEN:
				unsetGarten();
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__KINDERZIMMER:
				unsetKinderzimmer();
				return;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__HAUSTIERE:
				unsetHaustiere();
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
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_PARTNERSCHAFT:
				return DAUER_PARTNERSCHAFT_EDEFAULT == null ? dauerPartnerschaft != null : !DAUER_PARTNERSCHAFT_EDEFAULT.equals(dauerPartnerschaft);
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_GEMEINSAMER_HAUSHALT:
				return DAUER_GEMEINSAMER_HAUSHALT_EDEFAULT == null ? dauerGemeinsamerHaushalt != null : !DAUER_GEMEINSAMER_HAUSHALT_EDEFAULT.equals(dauerGemeinsamerHaushalt);
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__VERHEIRATET_ODER_LEBENSPARTNERSCHAFT:
				return isSetVerheiratetOderLebenspartnerschaft();
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__DAUER_VERHEIRATET_ODER_LEBENSPARTNERSCHAFT:
				return DAUER_VERHEIRATET_ODER_LEBENSPARTNERSCHAFT_EDEFAULT == null ? dauerVerheiratetOderLebenspartnerschaft != null : !DAUER_VERHEIRATET_ODER_LEBENSPARTNERSCHAFT_EDEFAULT.equals(dauerVerheiratetOderLebenspartnerschaft);
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__GESPRAECH_UEBER_ADOPTION:
				return isSetGespraechUeberAdoption();
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__MEINUNG_FAMILIE_UND_FREUNDE:
				return MEINUNG_FAMILIE_UND_FREUNDE_EDEFAULT == null ? meinungFamilieUndFreunde != null : !MEINUNG_FAMILIE_UND_FREUNDE_EDEFAULT.equals(meinungFamilieUndFreunde);
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__ANSCHRIFT:
				return anschrift != null;
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__WOHNVERHAELTNISSE_ANZAHL_ZIMMER:
				return isSetWohnverhaeltnisseAnzahlZimmer();
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__WOHNVERHAELTNISSE_WOHNFLAECHE:
				return WOHNVERHAELTNISSE_WOHNFLAECHE_EDEFAULT == null ? wohnverhaeltnisseWohnflaeche != null : !WOHNVERHAELTNISSE_WOHNFLAECHE_EDEFAULT.equals(wohnverhaeltnisseWohnflaeche);
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__MIETE_ODER_EIGENTUM:
				return isSetMieteOderEigentum();
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__GARTEN:
				return isSetGarten();
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__KINDERZIMMER:
				return isSetKinderzimmer();
			case AdoptionPackage.ANGABEN_ZUR_PARTNERSCHAFT_TYPE__HAUSTIERE:
				return isSetHaustiere();
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
		result.append(" (dauerPartnerschaft: ");
		result.append(dauerPartnerschaft);
		result.append(", dauerGemeinsamerHaushalt: ");
		result.append(dauerGemeinsamerHaushalt);
		result.append(", verheiratetOderLebenspartnerschaft: ");
		if (verheiratetOderLebenspartnerschaftESet) result.append(verheiratetOderLebenspartnerschaft); else result.append("<unset>");
		result.append(", dauerVerheiratetOderLebenspartnerschaft: ");
		result.append(dauerVerheiratetOderLebenspartnerschaft);
		result.append(", gespraechUeberAdoption: ");
		if (gespraechUeberAdoptionESet) result.append(gespraechUeberAdoption); else result.append("<unset>");
		result.append(", meinungFamilieUndFreunde: ");
		result.append(meinungFamilieUndFreunde);
		result.append(", wohnverhaeltnisseAnzahlZimmer: ");
		if (wohnverhaeltnisseAnzahlZimmerESet) result.append(wohnverhaeltnisseAnzahlZimmer); else result.append("<unset>");
		result.append(", wohnverhaeltnisseWohnflaeche: ");
		result.append(wohnverhaeltnisseWohnflaeche);
		result.append(", mieteOderEigentum: ");
		if (mieteOderEigentumESet) result.append(mieteOderEigentum); else result.append("<unset>");
		result.append(", garten: ");
		if (gartenESet) result.append(garten); else result.append("<unset>");
		result.append(", kinderzimmer: ");
		if (kinderzimmerESet) result.append(kinderzimmer); else result.append("<unset>");
		result.append(", haustiere: ");
		if (haustiereESet) result.append(haustiere); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AngabenZurPartnerschaftTypeImpl
