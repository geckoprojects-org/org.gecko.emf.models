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
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenVerwandtenadoptionType;

import de.xoev.xfamilie.baukasten._1.baukasten.CodePersonensorgerechtType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allgemeine Angaben Verwandtenadoption Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenVerwandtenadoptionTypeImpl#isHerkunftBekannt <em>Herkunft Bekannt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenVerwandtenadoptionTypeImpl#isKontaktZuLeiblicherFamilie <em>Kontakt Zu Leiblicher Familie</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenVerwandtenadoptionTypeImpl#getErlaeuterungKontaktZuLeiblicherFamilie <em>Erlaeuterung Kontakt Zu Leiblicher Familie</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenVerwandtenadoptionTypeImpl#getPersonensorgerecht <em>Personensorgerecht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenVerwandtenadoptionTypeImpl#getPersonensorgerechtBeiSonstige <em>Personensorgerecht Bei Sonstige</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenVerwandtenadoptionTypeImpl#isGeschpraechUeberAdoption <em>Geschpraech Ueber Adoption</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenVerwandtenadoptionTypeImpl#getReaktionKindGespraech <em>Reaktion Kind Gespraech</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllgemeineAngabenVerwandtenadoptionTypeImpl extends MinimalEObjectImpl.Container implements AllgemeineAngabenVerwandtenadoptionType {
	/**
	 * The default value of the '{@link #isHerkunftBekannt() <em>Herkunft Bekannt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHerkunftBekannt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HERKUNFT_BEKANNT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHerkunftBekannt() <em>Herkunft Bekannt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHerkunftBekannt()
	 * @generated
	 * @ordered
	 */
	protected boolean herkunftBekannt = HERKUNFT_BEKANNT_EDEFAULT;

	/**
	 * This is true if the Herkunft Bekannt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean herkunftBekanntESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllgemeineAngabenVerwandtenadoptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHerkunftBekannt() {
		return herkunftBekannt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHerkunftBekannt(boolean newHerkunftBekannt) {
		boolean oldHerkunftBekannt = herkunftBekannt;
		herkunftBekannt = newHerkunftBekannt;
		boolean oldHerkunftBekanntESet = herkunftBekanntESet;
		herkunftBekanntESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__HERKUNFT_BEKANNT, oldHerkunftBekannt, herkunftBekannt, !oldHerkunftBekanntESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetHerkunftBekannt() {
		boolean oldHerkunftBekannt = herkunftBekannt;
		boolean oldHerkunftBekanntESet = herkunftBekanntESet;
		herkunftBekannt = HERKUNFT_BEKANNT_EDEFAULT;
		herkunftBekanntESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__HERKUNFT_BEKANNT, oldHerkunftBekannt, HERKUNFT_BEKANNT_EDEFAULT, oldHerkunftBekanntESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetHerkunftBekannt() {
		return herkunftBekanntESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__KONTAKT_ZU_LEIBLICHER_FAMILIE, oldKontaktZuLeiblicherFamilie, kontaktZuLeiblicherFamilie, !oldKontaktZuLeiblicherFamilieESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__KONTAKT_ZU_LEIBLICHER_FAMILIE, oldKontaktZuLeiblicherFamilie, KONTAKT_ZU_LEIBLICHER_FAMILIE_EDEFAULT, oldKontaktZuLeiblicherFamilieESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE, oldErlaeuterungKontaktZuLeiblicherFamilie, erlaeuterungKontaktZuLeiblicherFamilie));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__PERSONENSORGERECHT, oldPersonensorgerecht, newPersonensorgerecht);
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
				msgs = ((InternalEObject)personensorgerecht).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__PERSONENSORGERECHT, null, msgs);
			if (newPersonensorgerecht != null)
				msgs = ((InternalEObject)newPersonensorgerecht).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__PERSONENSORGERECHT, null, msgs);
			msgs = basicSetPersonensorgerecht(newPersonensorgerecht, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__PERSONENSORGERECHT, newPersonensorgerecht, newPersonensorgerecht));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__PERSONENSORGERECHT_BEI_SONSTIGE, oldPersonensorgerechtBeiSonstige, personensorgerechtBeiSonstige));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__GESCHPRAECH_UEBER_ADOPTION, oldGeschpraechUeberAdoption, geschpraechUeberAdoption, !oldGeschpraechUeberAdoptionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__GESCHPRAECH_UEBER_ADOPTION, oldGeschpraechUeberAdoption, GESCHPRAECH_UEBER_ADOPTION_EDEFAULT, oldGeschpraechUeberAdoptionESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__REAKTION_KIND_GESPRAECH, oldReaktionKindGespraech, reaktionKindGespraech));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__PERSONENSORGERECHT:
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
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__HERKUNFT_BEKANNT:
				return isHerkunftBekannt();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__KONTAKT_ZU_LEIBLICHER_FAMILIE:
				return isKontaktZuLeiblicherFamilie();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE:
				return getErlaeuterungKontaktZuLeiblicherFamilie();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__PERSONENSORGERECHT:
				return getPersonensorgerecht();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__PERSONENSORGERECHT_BEI_SONSTIGE:
				return getPersonensorgerechtBeiSonstige();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__GESCHPRAECH_UEBER_ADOPTION:
				return isGeschpraechUeberAdoption();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__REAKTION_KIND_GESPRAECH:
				return getReaktionKindGespraech();
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
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__HERKUNFT_BEKANNT:
				setHerkunftBekannt((Boolean)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__KONTAKT_ZU_LEIBLICHER_FAMILIE:
				setKontaktZuLeiblicherFamilie((Boolean)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE:
				setErlaeuterungKontaktZuLeiblicherFamilie((String)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__PERSONENSORGERECHT:
				setPersonensorgerecht((CodePersonensorgerechtType)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__PERSONENSORGERECHT_BEI_SONSTIGE:
				setPersonensorgerechtBeiSonstige((String)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__GESCHPRAECH_UEBER_ADOPTION:
				setGeschpraechUeberAdoption((Boolean)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__REAKTION_KIND_GESPRAECH:
				setReaktionKindGespraech((String)newValue);
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
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__HERKUNFT_BEKANNT:
				unsetHerkunftBekannt();
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__KONTAKT_ZU_LEIBLICHER_FAMILIE:
				unsetKontaktZuLeiblicherFamilie();
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE:
				setErlaeuterungKontaktZuLeiblicherFamilie(ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE_EDEFAULT);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__PERSONENSORGERECHT:
				setPersonensorgerecht((CodePersonensorgerechtType)null);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__PERSONENSORGERECHT_BEI_SONSTIGE:
				setPersonensorgerechtBeiSonstige(PERSONENSORGERECHT_BEI_SONSTIGE_EDEFAULT);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__GESCHPRAECH_UEBER_ADOPTION:
				unsetGeschpraechUeberAdoption();
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__REAKTION_KIND_GESPRAECH:
				setReaktionKindGespraech(REAKTION_KIND_GESPRAECH_EDEFAULT);
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
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__HERKUNFT_BEKANNT:
				return isSetHerkunftBekannt();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__KONTAKT_ZU_LEIBLICHER_FAMILIE:
				return isSetKontaktZuLeiblicherFamilie();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE:
				return ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE_EDEFAULT == null ? erlaeuterungKontaktZuLeiblicherFamilie != null : !ERLAEUTERUNG_KONTAKT_ZU_LEIBLICHER_FAMILIE_EDEFAULT.equals(erlaeuterungKontaktZuLeiblicherFamilie);
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__PERSONENSORGERECHT:
				return personensorgerecht != null;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__PERSONENSORGERECHT_BEI_SONSTIGE:
				return PERSONENSORGERECHT_BEI_SONSTIGE_EDEFAULT == null ? personensorgerechtBeiSonstige != null : !PERSONENSORGERECHT_BEI_SONSTIGE_EDEFAULT.equals(personensorgerechtBeiSonstige);
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__GESCHPRAECH_UEBER_ADOPTION:
				return isSetGeschpraechUeberAdoption();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_VERWANDTENADOPTION_TYPE__REAKTION_KIND_GESPRAECH:
				return REAKTION_KIND_GESPRAECH_EDEFAULT == null ? reaktionKindGespraech != null : !REAKTION_KIND_GESPRAECH_EDEFAULT.equals(reaktionKindGespraech);
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
		result.append(" (herkunftBekannt: ");
		if (herkunftBekanntESet) result.append(herkunftBekannt); else result.append("<unset>");
		result.append(", kontaktZuLeiblicherFamilie: ");
		if (kontaktZuLeiblicherFamilieESet) result.append(kontaktZuLeiblicherFamilie); else result.append("<unset>");
		result.append(", erlaeuterungKontaktZuLeiblicherFamilie: ");
		result.append(erlaeuterungKontaktZuLeiblicherFamilie);
		result.append(", personensorgerechtBeiSonstige: ");
		result.append(personensorgerechtBeiSonstige);
		result.append(", geschpraechUeberAdoption: ");
		if (geschpraechUeberAdoptionESet) result.append(geschpraechUeberAdoption); else result.append("<unset>");
		result.append(", reaktionKindGespraech: ");
		result.append(reaktionKindGespraech);
		result.append(')');
		return result.toString();
	}

} //AllgemeineAngabenVerwandtenadoptionTypeImpl
