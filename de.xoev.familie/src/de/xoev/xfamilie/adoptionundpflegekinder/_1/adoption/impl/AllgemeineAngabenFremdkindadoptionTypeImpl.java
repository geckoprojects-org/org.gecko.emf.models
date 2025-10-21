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
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AllgemeineAngabenFremdkindadoptionType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PersonendatenType;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeAufenthaltsstatusType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeGeschlechtType;
import de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatsangehoerigkeitType;
import de.xoev.xfamilie.baukasten._1.baukasten.GeburtOptionalType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allgemeine Angaben Fremdkindadoption Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenFremdkindadoptionTypeImpl#getPersonendaten <em>Personendaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenFremdkindadoptionTypeImpl#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenFremdkindadoptionTypeImpl#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenFremdkindadoptionTypeImpl#getReligionszugehoerigkeit <em>Religionszugehoerigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenFremdkindadoptionTypeImpl#getAktuelleBeruflicheTaetigkeit <em>Aktuelle Berufliche Taetigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenFremdkindadoptionTypeImpl#getEinkuenfteAusTaetigkeit <em>Einkuenfte Aus Taetigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenFremdkindadoptionTypeImpl#getAndereEinkuenfte <em>Andere Einkuenfte</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenFremdkindadoptionTypeImpl#getSchuldverpflichtungen <em>Schuldverpflichtungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenFremdkindadoptionTypeImpl#getUnterhaltsverpflichtungen <em>Unterhaltsverpflichtungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenFremdkindadoptionTypeImpl#getMonatlicheFixkostenUnterkunft <em>Monatliche Fixkosten Unterkunft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenFremdkindadoptionTypeImpl#getAufenthaltsstatus <em>Aufenthaltsstatus</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenFremdkindadoptionTypeImpl#getAktuellerFamilienstand <em>Aktueller Familienstand</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenFremdkindadoptionTypeImpl#getGeschlecht <em>Geschlecht</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenFremdkindadoptionTypeImpl#isBereitsVerheiratet <em>Bereits Verheiratet</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AllgemeineAngabenFremdkindadoptionTypeImpl#getUmfangVerheiratet <em>Umfang Verheiratet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllgemeineAngabenFremdkindadoptionTypeImpl extends MinimalEObjectImpl.Container implements AllgemeineAngabenFremdkindadoptionType {
	/**
	 * The cached value of the '{@link #getPersonendaten() <em>Personendaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonendaten()
	 * @generated
	 * @ordered
	 */
	protected PersonendatenType personendaten;

	/**
	 * The cached value of the '{@link #getGeburt() <em>Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeburt()
	 * @generated
	 * @ordered
	 */
	protected GeburtOptionalType geburt;

	/**
	 * The cached value of the '{@link #getStaatsangehoerigkeit() <em>Staatsangehoerigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaatsangehoerigkeit()
	 * @generated
	 * @ordered
	 */
	protected CodeStaatsangehoerigkeitType staatsangehoerigkeit;

	/**
	 * The default value of the '{@link #getReligionszugehoerigkeit() <em>Religionszugehoerigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReligionszugehoerigkeit()
	 * @generated
	 * @ordered
	 */
	protected static final String RELIGIONSZUGEHOERIGKEIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReligionszugehoerigkeit() <em>Religionszugehoerigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReligionszugehoerigkeit()
	 * @generated
	 * @ordered
	 */
	protected String religionszugehoerigkeit = RELIGIONSZUGEHOERIGKEIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAktuelleBeruflicheTaetigkeit() <em>Aktuelle Berufliche Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktuelleBeruflicheTaetigkeit()
	 * @generated
	 * @ordered
	 */
	protected static final String AKTUELLE_BERUFLICHE_TAETIGKEIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAktuelleBeruflicheTaetigkeit() <em>Aktuelle Berufliche Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktuelleBeruflicheTaetigkeit()
	 * @generated
	 * @ordered
	 */
	protected String aktuelleBeruflicheTaetigkeit = AKTUELLE_BERUFLICHE_TAETIGKEIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEinkuenfteAusTaetigkeit() <em>Einkuenfte Aus Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkuenfteAusTaetigkeit()
	 * @generated
	 * @ordered
	 */
	protected static final float EINKUENFTE_AUS_TAETIGKEIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getEinkuenfteAusTaetigkeit() <em>Einkuenfte Aus Taetigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkuenfteAusTaetigkeit()
	 * @generated
	 * @ordered
	 */
	protected float einkuenfteAusTaetigkeit = EINKUENFTE_AUS_TAETIGKEIT_EDEFAULT;

	/**
	 * This is true if the Einkuenfte Aus Taetigkeit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean einkuenfteAusTaetigkeitESet;

	/**
	 * The default value of the '{@link #getAndereEinkuenfte() <em>Andere Einkuenfte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAndereEinkuenfte()
	 * @generated
	 * @ordered
	 */
	protected static final float ANDERE_EINKUENFTE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAndereEinkuenfte() <em>Andere Einkuenfte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAndereEinkuenfte()
	 * @generated
	 * @ordered
	 */
	protected float andereEinkuenfte = ANDERE_EINKUENFTE_EDEFAULT;

	/**
	 * This is true if the Andere Einkuenfte attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean andereEinkuenfteESet;

	/**
	 * The default value of the '{@link #getSchuldverpflichtungen() <em>Schuldverpflichtungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchuldverpflichtungen()
	 * @generated
	 * @ordered
	 */
	protected static final float SCHULDVERPFLICHTUNGEN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSchuldverpflichtungen() <em>Schuldverpflichtungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchuldverpflichtungen()
	 * @generated
	 * @ordered
	 */
	protected float schuldverpflichtungen = SCHULDVERPFLICHTUNGEN_EDEFAULT;

	/**
	 * This is true if the Schuldverpflichtungen attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean schuldverpflichtungenESet;

	/**
	 * The default value of the '{@link #getUnterhaltsverpflichtungen() <em>Unterhaltsverpflichtungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnterhaltsverpflichtungen()
	 * @generated
	 * @ordered
	 */
	protected static final float UNTERHALTSVERPFLICHTUNGEN_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getUnterhaltsverpflichtungen() <em>Unterhaltsverpflichtungen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnterhaltsverpflichtungen()
	 * @generated
	 * @ordered
	 */
	protected float unterhaltsverpflichtungen = UNTERHALTSVERPFLICHTUNGEN_EDEFAULT;

	/**
	 * This is true if the Unterhaltsverpflichtungen attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unterhaltsverpflichtungenESet;

	/**
	 * The default value of the '{@link #getMonatlicheFixkostenUnterkunft() <em>Monatliche Fixkosten Unterkunft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonatlicheFixkostenUnterkunft()
	 * @generated
	 * @ordered
	 */
	protected static final float MONATLICHE_FIXKOSTEN_UNTERKUNFT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMonatlicheFixkostenUnterkunft() <em>Monatliche Fixkosten Unterkunft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonatlicheFixkostenUnterkunft()
	 * @generated
	 * @ordered
	 */
	protected float monatlicheFixkostenUnterkunft = MONATLICHE_FIXKOSTEN_UNTERKUNFT_EDEFAULT;

	/**
	 * This is true if the Monatliche Fixkosten Unterkunft attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean monatlicheFixkostenUnterkunftESet;

	/**
	 * The cached value of the '{@link #getAufenthaltsstatus() <em>Aufenthaltsstatus</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAufenthaltsstatus()
	 * @generated
	 * @ordered
	 */
	protected CodeAufenthaltsstatusType aufenthaltsstatus;

	/**
	 * The default value of the '{@link #getAktuellerFamilienstand() <em>Aktueller Familienstand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktuellerFamilienstand()
	 * @generated
	 * @ordered
	 */
	protected static final String AKTUELLER_FAMILIENSTAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAktuellerFamilienstand() <em>Aktueller Familienstand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktuellerFamilienstand()
	 * @generated
	 * @ordered
	 */
	protected String aktuellerFamilienstand = AKTUELLER_FAMILIENSTAND_EDEFAULT;

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
	 * The default value of the '{@link #isBereitsVerheiratet() <em>Bereits Verheiratet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBereitsVerheiratet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BEREITS_VERHEIRATET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBereitsVerheiratet() <em>Bereits Verheiratet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBereitsVerheiratet()
	 * @generated
	 * @ordered
	 */
	protected boolean bereitsVerheiratet = BEREITS_VERHEIRATET_EDEFAULT;

	/**
	 * This is true if the Bereits Verheiratet attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bereitsVerheiratetESet;

	/**
	 * The default value of the '{@link #getUmfangVerheiratet() <em>Umfang Verheiratet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmfangVerheiratet()
	 * @generated
	 * @ordered
	 */
	protected static final String UMFANG_VERHEIRATET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUmfangVerheiratet() <em>Umfang Verheiratet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmfangVerheiratet()
	 * @generated
	 * @ordered
	 */
	protected String umfangVerheiratet = UMFANG_VERHEIRATET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllgemeineAngabenFremdkindadoptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonendatenType getPersonendaten() {
		return personendaten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonendaten(PersonendatenType newPersonendaten, NotificationChain msgs) {
		PersonendatenType oldPersonendaten = personendaten;
		personendaten = newPersonendaten;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__PERSONENDATEN, oldPersonendaten, newPersonendaten);
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
	public void setPersonendaten(PersonendatenType newPersonendaten) {
		if (newPersonendaten != personendaten) {
			NotificationChain msgs = null;
			if (personendaten != null)
				msgs = ((InternalEObject)personendaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__PERSONENDATEN, null, msgs);
			if (newPersonendaten != null)
				msgs = ((InternalEObject)newPersonendaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__PERSONENDATEN, null, msgs);
			msgs = basicSetPersonendaten(newPersonendaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__PERSONENDATEN, newPersonendaten, newPersonendaten));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeburtOptionalType getGeburt() {
		return geburt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeburt(GeburtOptionalType newGeburt, NotificationChain msgs) {
		GeburtOptionalType oldGeburt = geburt;
		geburt = newGeburt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GEBURT, oldGeburt, newGeburt);
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
	public void setGeburt(GeburtOptionalType newGeburt) {
		if (newGeburt != geburt) {
			NotificationChain msgs = null;
			if (geburt != null)
				msgs = ((InternalEObject)geburt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GEBURT, null, msgs);
			if (newGeburt != null)
				msgs = ((InternalEObject)newGeburt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GEBURT, null, msgs);
			msgs = basicSetGeburt(newGeburt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GEBURT, newGeburt, newGeburt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeStaatsangehoerigkeitType getStaatsangehoerigkeit() {
		return staatsangehoerigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaatsangehoerigkeit(CodeStaatsangehoerigkeitType newStaatsangehoerigkeit, NotificationChain msgs) {
		CodeStaatsangehoerigkeitType oldStaatsangehoerigkeit = staatsangehoerigkeit;
		staatsangehoerigkeit = newStaatsangehoerigkeit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__STAATSANGEHOERIGKEIT, oldStaatsangehoerigkeit, newStaatsangehoerigkeit);
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
	public void setStaatsangehoerigkeit(CodeStaatsangehoerigkeitType newStaatsangehoerigkeit) {
		if (newStaatsangehoerigkeit != staatsangehoerigkeit) {
			NotificationChain msgs = null;
			if (staatsangehoerigkeit != null)
				msgs = ((InternalEObject)staatsangehoerigkeit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__STAATSANGEHOERIGKEIT, null, msgs);
			if (newStaatsangehoerigkeit != null)
				msgs = ((InternalEObject)newStaatsangehoerigkeit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__STAATSANGEHOERIGKEIT, null, msgs);
			msgs = basicSetStaatsangehoerigkeit(newStaatsangehoerigkeit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__STAATSANGEHOERIGKEIT, newStaatsangehoerigkeit, newStaatsangehoerigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReligionszugehoerigkeit() {
		return religionszugehoerigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReligionszugehoerigkeit(String newReligionszugehoerigkeit) {
		String oldReligionszugehoerigkeit = religionszugehoerigkeit;
		religionszugehoerigkeit = newReligionszugehoerigkeit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__RELIGIONSZUGEHOERIGKEIT, oldReligionszugehoerigkeit, religionszugehoerigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAktuelleBeruflicheTaetigkeit() {
		return aktuelleBeruflicheTaetigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAktuelleBeruflicheTaetigkeit(String newAktuelleBeruflicheTaetigkeit) {
		String oldAktuelleBeruflicheTaetigkeit = aktuelleBeruflicheTaetigkeit;
		aktuelleBeruflicheTaetigkeit = newAktuelleBeruflicheTaetigkeit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AKTUELLE_BERUFLICHE_TAETIGKEIT, oldAktuelleBeruflicheTaetigkeit, aktuelleBeruflicheTaetigkeit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getEinkuenfteAusTaetigkeit() {
		return einkuenfteAusTaetigkeit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEinkuenfteAusTaetigkeit(float newEinkuenfteAusTaetigkeit) {
		float oldEinkuenfteAusTaetigkeit = einkuenfteAusTaetigkeit;
		einkuenfteAusTaetigkeit = newEinkuenfteAusTaetigkeit;
		boolean oldEinkuenfteAusTaetigkeitESet = einkuenfteAusTaetigkeitESet;
		einkuenfteAusTaetigkeitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__EINKUENFTE_AUS_TAETIGKEIT, oldEinkuenfteAusTaetigkeit, einkuenfteAusTaetigkeit, !oldEinkuenfteAusTaetigkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetEinkuenfteAusTaetigkeit() {
		float oldEinkuenfteAusTaetigkeit = einkuenfteAusTaetigkeit;
		boolean oldEinkuenfteAusTaetigkeitESet = einkuenfteAusTaetigkeitESet;
		einkuenfteAusTaetigkeit = EINKUENFTE_AUS_TAETIGKEIT_EDEFAULT;
		einkuenfteAusTaetigkeitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__EINKUENFTE_AUS_TAETIGKEIT, oldEinkuenfteAusTaetigkeit, EINKUENFTE_AUS_TAETIGKEIT_EDEFAULT, oldEinkuenfteAusTaetigkeitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetEinkuenfteAusTaetigkeit() {
		return einkuenfteAusTaetigkeitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAndereEinkuenfte() {
		return andereEinkuenfte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAndereEinkuenfte(float newAndereEinkuenfte) {
		float oldAndereEinkuenfte = andereEinkuenfte;
		andereEinkuenfte = newAndereEinkuenfte;
		boolean oldAndereEinkuenfteESet = andereEinkuenfteESet;
		andereEinkuenfteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__ANDERE_EINKUENFTE, oldAndereEinkuenfte, andereEinkuenfte, !oldAndereEinkuenfteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAndereEinkuenfte() {
		float oldAndereEinkuenfte = andereEinkuenfte;
		boolean oldAndereEinkuenfteESet = andereEinkuenfteESet;
		andereEinkuenfte = ANDERE_EINKUENFTE_EDEFAULT;
		andereEinkuenfteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__ANDERE_EINKUENFTE, oldAndereEinkuenfte, ANDERE_EINKUENFTE_EDEFAULT, oldAndereEinkuenfteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAndereEinkuenfte() {
		return andereEinkuenfteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getSchuldverpflichtungen() {
		return schuldverpflichtungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchuldverpflichtungen(float newSchuldverpflichtungen) {
		float oldSchuldverpflichtungen = schuldverpflichtungen;
		schuldverpflichtungen = newSchuldverpflichtungen;
		boolean oldSchuldverpflichtungenESet = schuldverpflichtungenESet;
		schuldverpflichtungenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__SCHULDVERPFLICHTUNGEN, oldSchuldverpflichtungen, schuldverpflichtungen, !oldSchuldverpflichtungenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSchuldverpflichtungen() {
		float oldSchuldverpflichtungen = schuldverpflichtungen;
		boolean oldSchuldverpflichtungenESet = schuldverpflichtungenESet;
		schuldverpflichtungen = SCHULDVERPFLICHTUNGEN_EDEFAULT;
		schuldverpflichtungenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__SCHULDVERPFLICHTUNGEN, oldSchuldverpflichtungen, SCHULDVERPFLICHTUNGEN_EDEFAULT, oldSchuldverpflichtungenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSchuldverpflichtungen() {
		return schuldverpflichtungenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getUnterhaltsverpflichtungen() {
		return unterhaltsverpflichtungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnterhaltsverpflichtungen(float newUnterhaltsverpflichtungen) {
		float oldUnterhaltsverpflichtungen = unterhaltsverpflichtungen;
		unterhaltsverpflichtungen = newUnterhaltsverpflichtungen;
		boolean oldUnterhaltsverpflichtungenESet = unterhaltsverpflichtungenESet;
		unterhaltsverpflichtungenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__UNTERHALTSVERPFLICHTUNGEN, oldUnterhaltsverpflichtungen, unterhaltsverpflichtungen, !oldUnterhaltsverpflichtungenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUnterhaltsverpflichtungen() {
		float oldUnterhaltsverpflichtungen = unterhaltsverpflichtungen;
		boolean oldUnterhaltsverpflichtungenESet = unterhaltsverpflichtungenESet;
		unterhaltsverpflichtungen = UNTERHALTSVERPFLICHTUNGEN_EDEFAULT;
		unterhaltsverpflichtungenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__UNTERHALTSVERPFLICHTUNGEN, oldUnterhaltsverpflichtungen, UNTERHALTSVERPFLICHTUNGEN_EDEFAULT, oldUnterhaltsverpflichtungenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUnterhaltsverpflichtungen() {
		return unterhaltsverpflichtungenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getMonatlicheFixkostenUnterkunft() {
		return monatlicheFixkostenUnterkunft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonatlicheFixkostenUnterkunft(float newMonatlicheFixkostenUnterkunft) {
		float oldMonatlicheFixkostenUnterkunft = monatlicheFixkostenUnterkunft;
		monatlicheFixkostenUnterkunft = newMonatlicheFixkostenUnterkunft;
		boolean oldMonatlicheFixkostenUnterkunftESet = monatlicheFixkostenUnterkunftESet;
		monatlicheFixkostenUnterkunftESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT, oldMonatlicheFixkostenUnterkunft, monatlicheFixkostenUnterkunft, !oldMonatlicheFixkostenUnterkunftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMonatlicheFixkostenUnterkunft() {
		float oldMonatlicheFixkostenUnterkunft = monatlicheFixkostenUnterkunft;
		boolean oldMonatlicheFixkostenUnterkunftESet = monatlicheFixkostenUnterkunftESet;
		monatlicheFixkostenUnterkunft = MONATLICHE_FIXKOSTEN_UNTERKUNFT_EDEFAULT;
		monatlicheFixkostenUnterkunftESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT, oldMonatlicheFixkostenUnterkunft, MONATLICHE_FIXKOSTEN_UNTERKUNFT_EDEFAULT, oldMonatlicheFixkostenUnterkunftESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMonatlicheFixkostenUnterkunft() {
		return monatlicheFixkostenUnterkunftESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeAufenthaltsstatusType getAufenthaltsstatus() {
		return aufenthaltsstatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAufenthaltsstatus(CodeAufenthaltsstatusType newAufenthaltsstatus, NotificationChain msgs) {
		CodeAufenthaltsstatusType oldAufenthaltsstatus = aufenthaltsstatus;
		aufenthaltsstatus = newAufenthaltsstatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AUFENTHALTSSTATUS, oldAufenthaltsstatus, newAufenthaltsstatus);
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
	public void setAufenthaltsstatus(CodeAufenthaltsstatusType newAufenthaltsstatus) {
		if (newAufenthaltsstatus != aufenthaltsstatus) {
			NotificationChain msgs = null;
			if (aufenthaltsstatus != null)
				msgs = ((InternalEObject)aufenthaltsstatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AUFENTHALTSSTATUS, null, msgs);
			if (newAufenthaltsstatus != null)
				msgs = ((InternalEObject)newAufenthaltsstatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AUFENTHALTSSTATUS, null, msgs);
			msgs = basicSetAufenthaltsstatus(newAufenthaltsstatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AUFENTHALTSSTATUS, newAufenthaltsstatus, newAufenthaltsstatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAktuellerFamilienstand() {
		return aktuellerFamilienstand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAktuellerFamilienstand(String newAktuellerFamilienstand) {
		String oldAktuellerFamilienstand = aktuellerFamilienstand;
		aktuellerFamilienstand = newAktuellerFamilienstand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AKTUELLER_FAMILIENSTAND, oldAktuellerFamilienstand, aktuellerFamilienstand));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GESCHLECHT, oldGeschlecht, newGeschlecht);
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
				msgs = ((InternalEObject)geschlecht).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GESCHLECHT, null, msgs);
			if (newGeschlecht != null)
				msgs = ((InternalEObject)newGeschlecht).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GESCHLECHT, null, msgs);
			msgs = basicSetGeschlecht(newGeschlecht, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GESCHLECHT, newGeschlecht, newGeschlecht));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBereitsVerheiratet() {
		return bereitsVerheiratet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBereitsVerheiratet(boolean newBereitsVerheiratet) {
		boolean oldBereitsVerheiratet = bereitsVerheiratet;
		bereitsVerheiratet = newBereitsVerheiratet;
		boolean oldBereitsVerheiratetESet = bereitsVerheiratetESet;
		bereitsVerheiratetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__BEREITS_VERHEIRATET, oldBereitsVerheiratet, bereitsVerheiratet, !oldBereitsVerheiratetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBereitsVerheiratet() {
		boolean oldBereitsVerheiratet = bereitsVerheiratet;
		boolean oldBereitsVerheiratetESet = bereitsVerheiratetESet;
		bereitsVerheiratet = BEREITS_VERHEIRATET_EDEFAULT;
		bereitsVerheiratetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__BEREITS_VERHEIRATET, oldBereitsVerheiratet, BEREITS_VERHEIRATET_EDEFAULT, oldBereitsVerheiratetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBereitsVerheiratet() {
		return bereitsVerheiratetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUmfangVerheiratet() {
		return umfangVerheiratet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUmfangVerheiratet(String newUmfangVerheiratet) {
		String oldUmfangVerheiratet = umfangVerheiratet;
		umfangVerheiratet = newUmfangVerheiratet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__UMFANG_VERHEIRATET, oldUmfangVerheiratet, umfangVerheiratet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__PERSONENDATEN:
				return basicSetPersonendaten(null, msgs);
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GEBURT:
				return basicSetGeburt(null, msgs);
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__STAATSANGEHOERIGKEIT:
				return basicSetStaatsangehoerigkeit(null, msgs);
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AUFENTHALTSSTATUS:
				return basicSetAufenthaltsstatus(null, msgs);
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GESCHLECHT:
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
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__PERSONENDATEN:
				return getPersonendaten();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GEBURT:
				return getGeburt();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__STAATSANGEHOERIGKEIT:
				return getStaatsangehoerigkeit();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__RELIGIONSZUGEHOERIGKEIT:
				return getReligionszugehoerigkeit();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AKTUELLE_BERUFLICHE_TAETIGKEIT:
				return getAktuelleBeruflicheTaetigkeit();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__EINKUENFTE_AUS_TAETIGKEIT:
				return getEinkuenfteAusTaetigkeit();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__ANDERE_EINKUENFTE:
				return getAndereEinkuenfte();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__SCHULDVERPFLICHTUNGEN:
				return getSchuldverpflichtungen();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__UNTERHALTSVERPFLICHTUNGEN:
				return getUnterhaltsverpflichtungen();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT:
				return getMonatlicheFixkostenUnterkunft();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AUFENTHALTSSTATUS:
				return getAufenthaltsstatus();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AKTUELLER_FAMILIENSTAND:
				return getAktuellerFamilienstand();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GESCHLECHT:
				return getGeschlecht();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__BEREITS_VERHEIRATET:
				return isBereitsVerheiratet();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__UMFANG_VERHEIRATET:
				return getUmfangVerheiratet();
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
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__PERSONENDATEN:
				setPersonendaten((PersonendatenType)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GEBURT:
				setGeburt((GeburtOptionalType)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__STAATSANGEHOERIGKEIT:
				setStaatsangehoerigkeit((CodeStaatsangehoerigkeitType)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__RELIGIONSZUGEHOERIGKEIT:
				setReligionszugehoerigkeit((String)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AKTUELLE_BERUFLICHE_TAETIGKEIT:
				setAktuelleBeruflicheTaetigkeit((String)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__EINKUENFTE_AUS_TAETIGKEIT:
				setEinkuenfteAusTaetigkeit((Float)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__ANDERE_EINKUENFTE:
				setAndereEinkuenfte((Float)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__SCHULDVERPFLICHTUNGEN:
				setSchuldverpflichtungen((Float)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__UNTERHALTSVERPFLICHTUNGEN:
				setUnterhaltsverpflichtungen((Float)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT:
				setMonatlicheFixkostenUnterkunft((Float)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AUFENTHALTSSTATUS:
				setAufenthaltsstatus((CodeAufenthaltsstatusType)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AKTUELLER_FAMILIENSTAND:
				setAktuellerFamilienstand((String)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GESCHLECHT:
				setGeschlecht((CodeGeschlechtType)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__BEREITS_VERHEIRATET:
				setBereitsVerheiratet((Boolean)newValue);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__UMFANG_VERHEIRATET:
				setUmfangVerheiratet((String)newValue);
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
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__PERSONENDATEN:
				setPersonendaten((PersonendatenType)null);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GEBURT:
				setGeburt((GeburtOptionalType)null);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__STAATSANGEHOERIGKEIT:
				setStaatsangehoerigkeit((CodeStaatsangehoerigkeitType)null);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__RELIGIONSZUGEHOERIGKEIT:
				setReligionszugehoerigkeit(RELIGIONSZUGEHOERIGKEIT_EDEFAULT);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AKTUELLE_BERUFLICHE_TAETIGKEIT:
				setAktuelleBeruflicheTaetigkeit(AKTUELLE_BERUFLICHE_TAETIGKEIT_EDEFAULT);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__EINKUENFTE_AUS_TAETIGKEIT:
				unsetEinkuenfteAusTaetigkeit();
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__ANDERE_EINKUENFTE:
				unsetAndereEinkuenfte();
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__SCHULDVERPFLICHTUNGEN:
				unsetSchuldverpflichtungen();
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__UNTERHALTSVERPFLICHTUNGEN:
				unsetUnterhaltsverpflichtungen();
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT:
				unsetMonatlicheFixkostenUnterkunft();
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AUFENTHALTSSTATUS:
				setAufenthaltsstatus((CodeAufenthaltsstatusType)null);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AKTUELLER_FAMILIENSTAND:
				setAktuellerFamilienstand(AKTUELLER_FAMILIENSTAND_EDEFAULT);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GESCHLECHT:
				setGeschlecht((CodeGeschlechtType)null);
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__BEREITS_VERHEIRATET:
				unsetBereitsVerheiratet();
				return;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__UMFANG_VERHEIRATET:
				setUmfangVerheiratet(UMFANG_VERHEIRATET_EDEFAULT);
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
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__PERSONENDATEN:
				return personendaten != null;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GEBURT:
				return geburt != null;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__STAATSANGEHOERIGKEIT:
				return staatsangehoerigkeit != null;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__RELIGIONSZUGEHOERIGKEIT:
				return RELIGIONSZUGEHOERIGKEIT_EDEFAULT == null ? religionszugehoerigkeit != null : !RELIGIONSZUGEHOERIGKEIT_EDEFAULT.equals(religionszugehoerigkeit);
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AKTUELLE_BERUFLICHE_TAETIGKEIT:
				return AKTUELLE_BERUFLICHE_TAETIGKEIT_EDEFAULT == null ? aktuelleBeruflicheTaetigkeit != null : !AKTUELLE_BERUFLICHE_TAETIGKEIT_EDEFAULT.equals(aktuelleBeruflicheTaetigkeit);
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__EINKUENFTE_AUS_TAETIGKEIT:
				return isSetEinkuenfteAusTaetigkeit();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__ANDERE_EINKUENFTE:
				return isSetAndereEinkuenfte();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__SCHULDVERPFLICHTUNGEN:
				return isSetSchuldverpflichtungen();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__UNTERHALTSVERPFLICHTUNGEN:
				return isSetUnterhaltsverpflichtungen();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__MONATLICHE_FIXKOSTEN_UNTERKUNFT:
				return isSetMonatlicheFixkostenUnterkunft();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AUFENTHALTSSTATUS:
				return aufenthaltsstatus != null;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__AKTUELLER_FAMILIENSTAND:
				return AKTUELLER_FAMILIENSTAND_EDEFAULT == null ? aktuellerFamilienstand != null : !AKTUELLER_FAMILIENSTAND_EDEFAULT.equals(aktuellerFamilienstand);
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__GESCHLECHT:
				return geschlecht != null;
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__BEREITS_VERHEIRATET:
				return isSetBereitsVerheiratet();
			case AdoptionPackage.ALLGEMEINE_ANGABEN_FREMDKINDADOPTION_TYPE__UMFANG_VERHEIRATET:
				return UMFANG_VERHEIRATET_EDEFAULT == null ? umfangVerheiratet != null : !UMFANG_VERHEIRATET_EDEFAULT.equals(umfangVerheiratet);
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
		result.append(" (religionszugehoerigkeit: ");
		result.append(religionszugehoerigkeit);
		result.append(", aktuelleBeruflicheTaetigkeit: ");
		result.append(aktuelleBeruflicheTaetigkeit);
		result.append(", einkuenfteAusTaetigkeit: ");
		if (einkuenfteAusTaetigkeitESet) result.append(einkuenfteAusTaetigkeit); else result.append("<unset>");
		result.append(", andereEinkuenfte: ");
		if (andereEinkuenfteESet) result.append(andereEinkuenfte); else result.append("<unset>");
		result.append(", schuldverpflichtungen: ");
		if (schuldverpflichtungenESet) result.append(schuldverpflichtungen); else result.append("<unset>");
		result.append(", unterhaltsverpflichtungen: ");
		if (unterhaltsverpflichtungenESet) result.append(unterhaltsverpflichtungen); else result.append("<unset>");
		result.append(", monatlicheFixkostenUnterkunft: ");
		if (monatlicheFixkostenUnterkunftESet) result.append(monatlicheFixkostenUnterkunft); else result.append("<unset>");
		result.append(", aktuellerFamilienstand: ");
		result.append(aktuellerFamilienstand);
		result.append(", bereitsVerheiratet: ");
		if (bereitsVerheiratetESet) result.append(bereitsVerheiratet); else result.append("<unset>");
		result.append(", umfangVerheiratet: ");
		result.append(umfangVerheiratet);
		result.append(')');
		return result.toString();
	}

} //AllgemeineAngabenFremdkindadoptionTypeImpl
