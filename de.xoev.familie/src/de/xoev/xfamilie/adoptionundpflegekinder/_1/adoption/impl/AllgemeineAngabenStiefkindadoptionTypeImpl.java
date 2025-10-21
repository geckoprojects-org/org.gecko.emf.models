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
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenStiefkindadoptionType;

import de.xoev.xfamilie.baukasten._1.baukasten.CodePersonensorgerechtType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allgemeine Angaben Stiefkindadoption Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenStiefkindadoptionTypeImpl#isKontaktZuLeiblicherFamilie <em>Kontakt Zu Leiblicher Familie</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenStiefkindadoptionTypeImpl#getErlaeuterungKontaktZuLeiblicherFamilie <em>Erlaeuterung Kontakt Zu Leiblicher Familie</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenStiefkindadoptionTypeImpl#getPersonensorgerecht <em>Personensorgerecht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenStiefkindadoptionTypeImpl#getPersonensorgerechtBeiSonstige <em>Personensorgerecht Bei Sonstige</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenStiefkindadoptionTypeImpl#isGeschpraechUeberAdoption <em>Geschpraech Ueber Adoption</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenStiefkindadoptionTypeImpl#getReaktionKindGespraech <em>Reaktion Kind Gespraech</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenStiefkindadoptionTypeImpl#isKontaktJugendamt <em>Kontakt Jugendamt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenStiefkindadoptionTypeImpl#getArtKontaktJugendamt <em>Art Kontakt Jugendamt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenStiefkindadoptionTypeImpl#isGerichtlicheRegelung <em>Gerichtliche Regelung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllgemeineAngabenStiefkindadoptionTypeImpl extends MinimalEObjectImpl.Container implements AllgemeineAngabenStiefkindadoptionType {
	/**
	 * The default value of the '{@link #isKontaktZuLeiblicherFamilie() <em>Kontakt Zu Leiblicher Familie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKontaktZuLeiblicherFamilie()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KONTAKT_ZU_LEIBLICHER_FAMILIE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKontaktZuLeiblicherFamilie() <em>Kontakt Zu Leiblicher Familie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKontaktZuLeiblicherFamilie()
	 * @generated
	 * @ordered
	 */
	protected boolean kontaktZuLeiblicherFamilie = KONTAKT_ZU_LEIBLICHER_FAMILIE_EDEFAULT;

	/**
	 * This is true if the Kontakt Zu Leiblicher Familie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kontaktZuLeiblicherFamilieESet;

	/**
	 * The default value of the '{@link #getErlaeuterungKontaktZuLeiblicherFamilie() <em>Erlaeuterung Kontakt Zu Leiblicher Familie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErlaeuterungKontaktZuLeiblicherFamilie()
	 * @generated
	 * @ordered
	 */
	protected static final String ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErlaeuterungKontaktZuLeiblicherFamilie() <em>Erlaeuterung Kontakt Zu Leiblicher Familie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErlaeuterungKontaktZuLeiblicherFamilie()
	 * @generated
	 * @ordered
	 */
	protected String erlaeuterungKontaktZuLeiblicherFamilie = ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPersonensorgerecht() <em>Personensorgerecht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonensorgerecht()
	 * @generated
	 * @ordered
	 */
	protected CodePersonensorgerechtType personensorgerecht;

	/**
	 * The default value of the '{@link #getPersonensorgerechtBeiSonstige() <em>Personensorgerecht Bei Sonstige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonensorgerechtBeiSonstige()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSONENSORGERECHT_BEI_SONSTIGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonensorgerechtBeiSonstige() <em>Personensorgerecht Bei Sonstige</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonensorgerechtBeiSonstige()
	 * @generated
	 * @ordered
	 */
	protected String personensorgerechtBeiSonstige = PERSONENSORGERECHT_BEI_SONSTIGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isGeschpraechUeberAdoption() <em>Geschpraech Ueber Adoption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeschpraechUeberAdoption()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GESCHPRAECH_UEBER_ADOPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGeschpraechUeberAdoption() <em>Geschpraech Ueber Adoption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGeschpraechUeberAdoption()
	 * @generated
	 * @ordered
	 */
	protected boolean geschpraechUeberAdoption = GESCHPRAECH_UEBER_ADOPTION_EDEFAULT;

	/**
	 * This is true if the Geschpraech Ueber Adoption attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean geschpraechUeberAdoptionESet;

	/**
	 * The default value of the '{@link #getReaktionKindGespraech() <em>Reaktion Kind Gespraech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaktionKindGespraech()
	 * @generated
	 * @ordered
	 */
	protected static final String REAKTION_KIND_GESPRAECH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReaktionKindGespraech() <em>Reaktion Kind Gespraech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReaktionKindGespraech()
	 * @generated
	 * @ordered
	 */
	protected String reaktionKindGespraech = REAKTION_KIND_GESPRAECH_EDEFAULT;

	/**
	 * The default value of the '{@link #isKontaktJugendamt() <em>Kontakt Jugendamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKontaktJugendamt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean KONTAKT_JUGENDAMT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isKontaktJugendamt() <em>Kontakt Jugendamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isKontaktJugendamt()
	 * @generated
	 * @ordered
	 */
	protected boolean kontaktJugendamt = KONTAKT_JUGENDAMT_EDEFAULT;

	/**
	 * This is true if the Kontakt Jugendamt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean kontaktJugendamtESet;

	/**
	 * The default value of the '{@link #getArtKontaktJugendamt() <em>Art Kontakt Jugendamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtKontaktJugendamt()
	 * @generated
	 * @ordered
	 */
	protected static final String ART_KONTAKT_JUGENDAMT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtKontaktJugendamt() <em>Art Kontakt Jugendamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtKontaktJugendamt()
	 * @generated
	 * @ordered
	 */
	protected String artKontaktJugendamt = ART_KONTAKT_JUGENDAMT_EDEFAULT;

	/**
	 * The default value of the '{@link #isGerichtlicheRegelung() <em>Gerichtliche Regelung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGerichtlicheRegelung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GERICHTLICHE_REGELUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGerichtlicheRegelung() <em>Gerichtliche Regelung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGerichtlicheRegelung()
	 * @generated
	 * @ordered
	 */
	protected boolean gerichtlicheRegelung = GERICHTLICHE_REGELUNG_EDEFAULT;

	/**
	 * This is true if the Gerichtliche Regelung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gerichtlicheRegelungESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllgemeineAngabenStiefkindadoptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isKontaktZuLeiblicherFamilie() {
		return kontaktZuLeiblicherFamilie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKontaktZuLeiblicherFamilie(boolean newKontaktZuLeiblicherFamilie) {
		boolean oldKontaktZuLeiblicherFamilie = kontaktZuLeiblicherFamilie;
		kontaktZuLeiblicherFamilie = newKontaktZuLeiblicherFamilie;
		boolean oldKontaktZuLeiblicherFamilieESet = kontaktZuLeiblicherFamilieESet;
		kontaktZuLeiblicherFamilieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__KONTAKT_ZU_LEIBLICHER_FAMILIE, oldKontaktZuLeiblicherFamilie, kontaktZuLeiblicherFamilie, !oldKontaktZuLeiblicherFamilieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetKontaktZuLeiblicherFamilie() {
		boolean oldKontaktZuLeiblicherFamilie = kontaktZuLeiblicherFamilie;
		boolean oldKontaktZuLeiblicherFamilieESet = kontaktZuLeiblicherFamilieESet;
		kontaktZuLeiblicherFamilie = KONTAKT_ZU_LEIBLICHER_FAMILIE_EDEFAULT;
		kontaktZuLeiblicherFamilieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__KONTAKT_ZU_LEIBLICHER_FAMILIE, oldKontaktZuLeiblicherFamilie, KONTAKT_ZU_LEIBLICHER_FAMILIE_EDEFAULT, oldKontaktZuLeiblicherFamilieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetKontaktZuLeiblicherFamilie() {
		return kontaktZuLeiblicherFamilieESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getErlaeuterungKontaktZuLeiblicherFamilie() {
		return erlaeuterungKontaktZuLeiblicherFamilie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErlaeuterungKontaktZuLeiblicherFamilie(String newErlaeuterungKontaktZuLeiblicherFamilie) {
		String oldErlaeuterungKontaktZuLeiblicherFamilie = erlaeuterungKontaktZuLeiblicherFamilie;
		erlaeuterungKontaktZuLeiblicherFamilie = newErlaeuterungKontaktZuLeiblicherFamilie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE, oldErlaeuterungKontaktZuLeiblicherFamilie, erlaeuterungKontaktZuLeiblicherFamilie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodePersonensorgerechtType getPersonensorgerecht() {
		return personensorgerecht;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonensorgerecht(CodePersonensorgerechtType newPersonensorgerecht, NotificationChain msgs) {
		CodePersonensorgerechtType oldPersonensorgerecht = personensorgerecht;
		personensorgerecht = newPersonensorgerecht;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__PERSONENSORGERECHT, oldPersonensorgerecht, newPersonensorgerecht);
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
	public void setPersonensorgerecht(CodePersonensorgerechtType newPersonensorgerecht) {
		if (newPersonensorgerecht != personensorgerecht) {
			NotificationChain msgs = null;
			if (personensorgerecht != null)
				msgs = ((InternalEObject)personensorgerecht).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__PERSONENSORGERECHT, null, msgs);
			if (newPersonensorgerecht != null)
				msgs = ((InternalEObject)newPersonensorgerecht).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__PERSONENSORGERECHT, null, msgs);
			msgs = basicSetPersonensorgerecht(newPersonensorgerecht, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__PERSONENSORGERECHT, newPersonensorgerecht, newPersonensorgerecht));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPersonensorgerechtBeiSonstige() {
		return personensorgerechtBeiSonstige;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPersonensorgerechtBeiSonstige(String newPersonensorgerechtBeiSonstige) {
		String oldPersonensorgerechtBeiSonstige = personensorgerechtBeiSonstige;
		personensorgerechtBeiSonstige = newPersonensorgerechtBeiSonstige;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__PERSONENSORGERECHT_BEI_SONSTIGE, oldPersonensorgerechtBeiSonstige, personensorgerechtBeiSonstige));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGeschpraechUeberAdoption() {
		return geschpraechUeberAdoption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeschpraechUeberAdoption(boolean newGeschpraechUeberAdoption) {
		boolean oldGeschpraechUeberAdoption = geschpraechUeberAdoption;
		geschpraechUeberAdoption = newGeschpraechUeberAdoption;
		boolean oldGeschpraechUeberAdoptionESet = geschpraechUeberAdoptionESet;
		geschpraechUeberAdoptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__GESCHPRAECH_UEBER_ADOPTION, oldGeschpraechUeberAdoption, geschpraechUeberAdoption, !oldGeschpraechUeberAdoptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGeschpraechUeberAdoption() {
		boolean oldGeschpraechUeberAdoption = geschpraechUeberAdoption;
		boolean oldGeschpraechUeberAdoptionESet = geschpraechUeberAdoptionESet;
		geschpraechUeberAdoption = GESCHPRAECH_UEBER_ADOPTION_EDEFAULT;
		geschpraechUeberAdoptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__GESCHPRAECH_UEBER_ADOPTION, oldGeschpraechUeberAdoption, GESCHPRAECH_UEBER_ADOPTION_EDEFAULT, oldGeschpraechUeberAdoptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGeschpraechUeberAdoption() {
		return geschpraechUeberAdoptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReaktionKindGespraech() {
		return reaktionKindGespraech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReaktionKindGespraech(String newReaktionKindGespraech) {
		String oldReaktionKindGespraech = reaktionKindGespraech;
		reaktionKindGespraech = newReaktionKindGespraech;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__REAKTION_KIND_GESPRAECH, oldReaktionKindGespraech, reaktionKindGespraech));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isKontaktJugendamt() {
		return kontaktJugendamt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKontaktJugendamt(boolean newKontaktJugendamt) {
		boolean oldKontaktJugendamt = kontaktJugendamt;
		kontaktJugendamt = newKontaktJugendamt;
		boolean oldKontaktJugendamtESet = kontaktJugendamtESet;
		kontaktJugendamtESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__KONTAKT_JUGENDAMT, oldKontaktJugendamt, kontaktJugendamt, !oldKontaktJugendamtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetKontaktJugendamt() {
		boolean oldKontaktJugendamt = kontaktJugendamt;
		boolean oldKontaktJugendamtESet = kontaktJugendamtESet;
		kontaktJugendamt = KONTAKT_JUGENDAMT_EDEFAULT;
		kontaktJugendamtESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__KONTAKT_JUGENDAMT, oldKontaktJugendamt, KONTAKT_JUGENDAMT_EDEFAULT, oldKontaktJugendamtESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetKontaktJugendamt() {
		return kontaktJugendamtESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getArtKontaktJugendamt() {
		return artKontaktJugendamt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtKontaktJugendamt(String newArtKontaktJugendamt) {
		String oldArtKontaktJugendamt = artKontaktJugendamt;
		artKontaktJugendamt = newArtKontaktJugendamt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__ART_KONTAKT_JUGENDAMT, oldArtKontaktJugendamt, artKontaktJugendamt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGerichtlicheRegelung() {
		return gerichtlicheRegelung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGerichtlicheRegelung(boolean newGerichtlicheRegelung) {
		boolean oldGerichtlicheRegelung = gerichtlicheRegelung;
		gerichtlicheRegelung = newGerichtlicheRegelung;
		boolean oldGerichtlicheRegelungESet = gerichtlicheRegelungESet;
		gerichtlicheRegelungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__GERICHTLICHE_REGELUNG, oldGerichtlicheRegelung, gerichtlicheRegelung, !oldGerichtlicheRegelungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGerichtlicheRegelung() {
		boolean oldGerichtlicheRegelung = gerichtlicheRegelung;
		boolean oldGerichtlicheRegelungESet = gerichtlicheRegelungESet;
		gerichtlicheRegelung = GERICHTLICHE_REGELUNG_EDEFAULT;
		gerichtlicheRegelungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__GERICHTLICHE_REGELUNG, oldGerichtlicheRegelung, GERICHTLICHE_REGELUNG_EDEFAULT, oldGerichtlicheRegelungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGerichtlicheRegelung() {
		return gerichtlicheRegelungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__PERSONENSORGERECHT:
				return basicSetPersonensorgerecht(null, msgs);
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
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__KONTAKT_ZU_LEIBLICHER_FAMILIE:
				return isKontaktZuLeiblicherFamilie();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE:
				return getErlaeuterungKontaktZuLeiblicherFamilie();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__PERSONENSORGERECHT:
				return getPersonensorgerecht();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__PERSONENSORGERECHT_BEI_SONSTIGE:
				return getPersonensorgerechtBeiSonstige();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__GESCHPRAECH_UEBER_ADOPTION:
				return isGeschpraechUeberAdoption();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__REAKTION_KIND_GESPRAECH:
				return getReaktionKindGespraech();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__KONTAKT_JUGENDAMT:
				return isKontaktJugendamt();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__ART_KONTAKT_JUGENDAMT:
				return getArtKontaktJugendamt();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__GERICHTLICHE_REGELUNG:
				return isGerichtlicheRegelung();
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
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__KONTAKT_ZU_LEIBLICHER_FAMILIE:
				setKontaktZuLeiblicherFamilie((Boolean)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE:
				setErlaeuterungKontaktZuLeiblicherFamilie((String)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__PERSONENSORGERECHT:
				setPersonensorgerecht((CodePersonensorgerechtType)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__PERSONENSORGERECHT_BEI_SONSTIGE:
				setPersonensorgerechtBeiSonstige((String)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__GESCHPRAECH_UEBER_ADOPTION:
				setGeschpraechUeberAdoption((Boolean)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__REAKTION_KIND_GESPRAECH:
				setReaktionKindGespraech((String)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__KONTAKT_JUGENDAMT:
				setKontaktJugendamt((Boolean)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__ART_KONTAKT_JUGENDAMT:
				setArtKontaktJugendamt((String)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__GERICHTLICHE_REGELUNG:
				setGerichtlicheRegelung((Boolean)newValue);
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
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__KONTAKT_ZU_LEIBLICHER_FAMILIE:
				unsetKontaktZuLeiblicherFamilie();
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE:
				setErlaeuterungKontaktZuLeiblicherFamilie(ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE_EDEFAULT);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__PERSONENSORGERECHT:
				setPersonensorgerecht((CodePersonensorgerechtType)null);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__PERSONENSORGERECHT_BEI_SONSTIGE:
				setPersonensorgerechtBeiSonstige(PERSONENSORGERECHT_BEI_SONSTIGE_EDEFAULT);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__GESCHPRAECH_UEBER_ADOPTION:
				unsetGeschpraechUeberAdoption();
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__REAKTION_KIND_GESPRAECH:
				setReaktionKindGespraech(REAKTION_KIND_GESPRAECH_EDEFAULT);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__KONTAKT_JUGENDAMT:
				unsetKontaktJugendamt();
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__ART_KONTAKT_JUGENDAMT:
				setArtKontaktJugendamt(ART_KONTAKT_JUGENDAMT_EDEFAULT);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__GERICHTLICHE_REGELUNG:
				unsetGerichtlicheRegelung();
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
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__KONTAKT_ZU_LEIBLICHER_FAMILIE:
				return isSetKontaktZuLeiblicherFamilie();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE:
				return ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE_EDEFAULT == null ? erlaeuterungKontaktZuLeiblicherFamilie != null : !ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE_EDEFAULT.equals(erlaeuterungKontaktZuLeiblicherFamilie);
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__PERSONENSORGERECHT:
				return personensorgerecht != null;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__PERSONENSORGERECHT_BEI_SONSTIGE:
				return PERSONENSORGERECHT_BEI_SONSTIGE_EDEFAULT == null ? personensorgerechtBeiSonstige != null : !PERSONENSORGERECHT_BEI_SONSTIGE_EDEFAULT.equals(personensorgerechtBeiSonstige);
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__GESCHPRAECH_UEBER_ADOPTION:
				return isSetGeschpraechUeberAdoption();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__REAKTION_KIND_GESPRAECH:
				return REAKTION_KIND_GESPRAECH_EDEFAULT == null ? reaktionKindGespraech != null : !REAKTION_KIND_GESPRAECH_EDEFAULT.equals(reaktionKindGespraech);
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__KONTAKT_JUGENDAMT:
				return isSetKontaktJugendamt();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__ART_KONTAKT_JUGENDAMT:
				return ART_KONTAKT_JUGENDAMT_EDEFAULT == null ? artKontaktJugendamt != null : !ART_KONTAKT_JUGENDAMT_EDEFAULT.equals(artKontaktJugendamt);
			case AdoptionPackage.ALLGEMEINE_ANGABEN_STIEFKINDADOPTION_TYPE__GERICHTLICHE_REGELUNG:
				return isSetGerichtlicheRegelung();
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
		result.append(" (kontaktZuLeiblicherFamilie: ");
		if (kontaktZuLeiblicherFamilieESet) result.append(kontaktZuLeiblicherFamilie); else result.append("<unset>");
		result.append(", erlaeuterungKontaktZuLeiblicherFamilie: ");
		result.append(erlaeuterungKontaktZuLeiblicherFamilie);
		result.append(", personensorgerechtBeiSonstige: ");
		result.append(personensorgerechtBeiSonstige);
		result.append(", geschpraechUeberAdoption: ");
		if (geschpraechUeberAdoptionESet) result.append(geschpraechUeberAdoption); else result.append("<unset>");
		result.append(", reaktionKindGespraech: ");
		result.append(reaktionKindGespraech);
		result.append(", kontaktJugendamt: ");
		if (kontaktJugendamtESet) result.append(kontaktJugendamt); else result.append("<unset>");
		result.append(", artKontaktJugendamt: ");
		result.append(artKontaktJugendamt);
		result.append(", gerichtlicheRegelung: ");
		if (gerichtlicheRegelungESet) result.append(gerichtlicheRegelung); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AllgemeineAngabenStiefkindadoptionTypeImpl
