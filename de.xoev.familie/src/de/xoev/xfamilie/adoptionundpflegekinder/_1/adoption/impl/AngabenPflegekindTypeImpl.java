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
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AngabenPflegekindType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType;
import de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.PersonendatenType;

import de.xoev.xfamilie.baukasten._1.baukasten.GeburtOptionalType;
import de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Angaben Pflegekind Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenPflegekindTypeImpl#getPersonendaten <em>Personendaten</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenPflegekindTypeImpl#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenPflegekindTypeImpl#getAnschrift <em>Anschrift</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenPflegekindTypeImpl#getBeginnPflegeverhaeltnis <em>Beginn Pflegeverhaeltnis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenPflegekindTypeImpl#getKrankenversichert <em>Krankenversichert</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenPflegekindTypeImpl#getKrankenversichertUeberPflegeperson <em>Krankenversichert Ueber Pflegeperson</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenPflegekindTypeImpl#getSchuleAusbildungsstaette <em>Schule Ausbildungsstaette</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenPflegekindTypeImpl#getKlassenstufeAusbildungsjahr <em>Klassenstufe Ausbildungsjahr</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.impl.AngabenPflegekindTypeImpl#getEinkommenPflegekind <em>Einkommen Pflegekind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AngabenPflegekindTypeImpl extends MinimalEObjectImpl.Container implements AngabenPflegekindType {
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
	 * The cached value of the '{@link #getAnschrift() <em>Anschrift</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnschrift()
	 * @generated
	 * @ordered
	 */
	protected MeldeanschriftType anschrift;

	/**
	 * The default value of the '{@link #getBeginnPflegeverhaeltnis() <em>Beginn Pflegeverhaeltnis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginnPflegeverhaeltnis()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar BEGINN_PFLEGEVERHAELTNIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBeginnPflegeverhaeltnis() <em>Beginn Pflegeverhaeltnis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeginnPflegeverhaeltnis()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar beginnPflegeverhaeltnis = BEGINN_PFLEGEVERHAELTNIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getKrankenversichert() <em>Krankenversichert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKrankenversichert()
	 * @generated
	 * @ordered
	 */
	protected static final String KRANKENVERSICHERT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKrankenversichert() <em>Krankenversichert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKrankenversichert()
	 * @generated
	 * @ordered
	 */
	protected String krankenversichert = KRANKENVERSICHERT_EDEFAULT;

	/**
	 * The default value of the '{@link #getKrankenversichertUeberPflegeperson() <em>Krankenversichert Ueber Pflegeperson</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKrankenversichertUeberPflegeperson()
	 * @generated
	 * @ordered
	 */
	protected static final String KRANKENVERSICHERT_UEBER_PFLEGEPERSON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKrankenversichertUeberPflegeperson() <em>Krankenversichert Ueber Pflegeperson</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKrankenversichertUeberPflegeperson()
	 * @generated
	 * @ordered
	 */
	protected String krankenversichertUeberPflegeperson = KRANKENVERSICHERT_UEBER_PFLEGEPERSON_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchuleAusbildungsstaette() <em>Schule Ausbildungsstaette</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchuleAusbildungsstaette()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHULE_AUSBILDUNGSSTAETTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchuleAusbildungsstaette() <em>Schule Ausbildungsstaette</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchuleAusbildungsstaette()
	 * @generated
	 * @ordered
	 */
	protected String schuleAusbildungsstaette = SCHULE_AUSBILDUNGSSTAETTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKlassenstufeAusbildungsjahr() <em>Klassenstufe Ausbildungsjahr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKlassenstufeAusbildungsjahr()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger KLASSENSTUFE_AUSBILDUNGSJAHR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKlassenstufeAusbildungsjahr() <em>Klassenstufe Ausbildungsjahr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKlassenstufeAusbildungsjahr()
	 * @generated
	 * @ordered
	 */
	protected BigInteger klassenstufeAusbildungsjahr = KLASSENSTUFE_AUSBILDUNGSJAHR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEinkommenPflegekind() <em>Einkommen Pflegekind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinkommenPflegekind()
	 * @generated
	 * @ordered
	 */
	protected EinkommenPflegekindType einkommenPflegekind;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AngabenPflegekindTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AdoptionPackage.Literals.ANGABEN_PFLEGEKIND_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__PERSONENDATEN, oldPersonendaten, newPersonendaten);
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
				msgs = ((InternalEObject)personendaten).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__PERSONENDATEN, null, msgs);
			if (newPersonendaten != null)
				msgs = ((InternalEObject)newPersonendaten).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__PERSONENDATEN, null, msgs);
			msgs = basicSetPersonendaten(newPersonendaten, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__PERSONENDATEN, newPersonendaten, newPersonendaten));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__GEBURT, oldGeburt, newGeburt);
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
				msgs = ((InternalEObject)geburt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__GEBURT, null, msgs);
			if (newGeburt != null)
				msgs = ((InternalEObject)newGeburt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__GEBURT, null, msgs);
			msgs = basicSetGeburt(newGeburt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__GEBURT, newGeburt, newGeburt));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__ANSCHRIFT, oldAnschrift, newAnschrift);
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
				msgs = ((InternalEObject)anschrift).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__ANSCHRIFT, null, msgs);
			if (newAnschrift != null)
				msgs = ((InternalEObject)newAnschrift).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__ANSCHRIFT, null, msgs);
			msgs = basicSetAnschrift(newAnschrift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__ANSCHRIFT, newAnschrift, newAnschrift));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getBeginnPflegeverhaeltnis() {
		return beginnPflegeverhaeltnis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeginnPflegeverhaeltnis(XMLGregorianCalendar newBeginnPflegeverhaeltnis) {
		XMLGregorianCalendar oldBeginnPflegeverhaeltnis = beginnPflegeverhaeltnis;
		beginnPflegeverhaeltnis = newBeginnPflegeverhaeltnis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__BEGINN_PFLEGEVERHAELTNIS, oldBeginnPflegeverhaeltnis, beginnPflegeverhaeltnis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKrankenversichert() {
		return krankenversichert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKrankenversichert(String newKrankenversichert) {
		String oldKrankenversichert = krankenversichert;
		krankenversichert = newKrankenversichert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__KRANKENVERSICHERT, oldKrankenversichert, krankenversichert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKrankenversichertUeberPflegeperson() {
		return krankenversichertUeberPflegeperson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKrankenversichertUeberPflegeperson(String newKrankenversichertUeberPflegeperson) {
		String oldKrankenversichertUeberPflegeperson = krankenversichertUeberPflegeperson;
		krankenversichertUeberPflegeperson = newKrankenversichertUeberPflegeperson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__KRANKENVERSICHERT_UEBER_PFLEGEPERSON, oldKrankenversichertUeberPflegeperson, krankenversichertUeberPflegeperson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSchuleAusbildungsstaette() {
		return schuleAusbildungsstaette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchuleAusbildungsstaette(String newSchuleAusbildungsstaette) {
		String oldSchuleAusbildungsstaette = schuleAusbildungsstaette;
		schuleAusbildungsstaette = newSchuleAusbildungsstaette;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__SCHULE_AUSBILDUNGSSTAETTE, oldSchuleAusbildungsstaette, schuleAusbildungsstaette));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getKlassenstufeAusbildungsjahr() {
		return klassenstufeAusbildungsjahr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKlassenstufeAusbildungsjahr(BigInteger newKlassenstufeAusbildungsjahr) {
		BigInteger oldKlassenstufeAusbildungsjahr = klassenstufeAusbildungsjahr;
		klassenstufeAusbildungsjahr = newKlassenstufeAusbildungsjahr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__KLASSENSTUFE_AUSBILDUNGSJAHR, oldKlassenstufeAusbildungsjahr, klassenstufeAusbildungsjahr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EinkommenPflegekindType getEinkommenPflegekind() {
		return einkommenPflegekind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEinkommenPflegekind(EinkommenPflegekindType newEinkommenPflegekind, NotificationChain msgs) {
		EinkommenPflegekindType oldEinkommenPflegekind = einkommenPflegekind;
		einkommenPflegekind = newEinkommenPflegekind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__EINKOMMEN_PFLEGEKIND, oldEinkommenPflegekind, newEinkommenPflegekind);
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
	public void setEinkommenPflegekind(EinkommenPflegekindType newEinkommenPflegekind) {
		if (newEinkommenPflegekind != einkommenPflegekind) {
			NotificationChain msgs = null;
			if (einkommenPflegekind != null)
				msgs = ((InternalEObject)einkommenPflegekind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__EINKOMMEN_PFLEGEKIND, null, msgs);
			if (newEinkommenPflegekind != null)
				msgs = ((InternalEObject)newEinkommenPflegekind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__EINKOMMEN_PFLEGEKIND, null, msgs);
			msgs = basicSetEinkommenPflegekind(newEinkommenPflegekind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__EINKOMMEN_PFLEGEKIND, newEinkommenPflegekind, newEinkommenPflegekind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__PERSONENDATEN:
				return basicSetPersonendaten(null, msgs);
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__GEBURT:
				return basicSetGeburt(null, msgs);
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__ANSCHRIFT:
				return basicSetAnschrift(null, msgs);
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__EINKOMMEN_PFLEGEKIND:
				return basicSetEinkommenPflegekind(null, msgs);
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
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__PERSONENDATEN:
				return getPersonendaten();
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__GEBURT:
				return getGeburt();
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__ANSCHRIFT:
				return getAnschrift();
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__BEGINN_PFLEGEVERHAELTNIS:
				return getBeginnPflegeverhaeltnis();
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__KRANKENVERSICHERT:
				return getKrankenversichert();
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__KRANKENVERSICHERT_UEBER_PFLEGEPERSON:
				return getKrankenversichertUeberPflegeperson();
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__SCHULE_AUSBILDUNGSSTAETTE:
				return getSchuleAusbildungsstaette();
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__KLASSENSTUFE_AUSBILDUNGSJAHR:
				return getKlassenstufeAusbildungsjahr();
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__EINKOMMEN_PFLEGEKIND:
				return getEinkommenPflegekind();
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
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__PERSONENDATEN:
				setPersonendaten((PersonendatenType)newValue);
				return;
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__GEBURT:
				setGeburt((GeburtOptionalType)newValue);
				return;
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__ANSCHRIFT:
				setAnschrift((MeldeanschriftType)newValue);
				return;
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__BEGINN_PFLEGEVERHAELTNIS:
				setBeginnPflegeverhaeltnis((XMLGregorianCalendar)newValue);
				return;
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__KRANKENVERSICHERT:
				setKrankenversichert((String)newValue);
				return;
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__KRANKENVERSICHERT_UEBER_PFLEGEPERSON:
				setKrankenversichertUeberPflegeperson((String)newValue);
				return;
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__SCHULE_AUSBILDUNGSSTAETTE:
				setSchuleAusbildungsstaette((String)newValue);
				return;
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__KLASSENSTUFE_AUSBILDUNGSJAHR:
				setKlassenstufeAusbildungsjahr((BigInteger)newValue);
				return;
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__EINKOMMEN_PFLEGEKIND:
				setEinkommenPflegekind((EinkommenPflegekindType)newValue);
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
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__PERSONENDATEN:
				setPersonendaten((PersonendatenType)null);
				return;
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__GEBURT:
				setGeburt((GeburtOptionalType)null);
				return;
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__ANSCHRIFT:
				setAnschrift((MeldeanschriftType)null);
				return;
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__BEGINN_PFLEGEVERHAELTNIS:
				setBeginnPflegeverhaeltnis(BEGINN_PFLEGEVERHAELTNIS_EDEFAULT);
				return;
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__KRANKENVERSICHERT:
				setKrankenversichert(KRANKENVERSICHERT_EDEFAULT);
				return;
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__KRANKENVERSICHERT_UEBER_PFLEGEPERSON:
				setKrankenversichertUeberPflegeperson(KRANKENVERSICHERT_UEBER_PFLEGEPERSON_EDEFAULT);
				return;
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__SCHULE_AUSBILDUNGSSTAETTE:
				setSchuleAusbildungsstaette(SCHULE_AUSBILDUNGSSTAETTE_EDEFAULT);
				return;
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__KLASSENSTUFE_AUSBILDUNGSJAHR:
				setKlassenstufeAusbildungsjahr(KLASSENSTUFE_AUSBILDUNGSJAHR_EDEFAULT);
				return;
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__EINKOMMEN_PFLEGEKIND:
				setEinkommenPflegekind((EinkommenPflegekindType)null);
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
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__PERSONENDATEN:
				return personendaten != null;
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__GEBURT:
				return geburt != null;
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__ANSCHRIFT:
				return anschrift != null;
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__BEGINN_PFLEGEVERHAELTNIS:
				return BEGINN_PFLEGEVERHAELTNIS_EDEFAULT == null ? beginnPflegeverhaeltnis != null : !BEGINN_PFLEGEVERHAELTNIS_EDEFAULT.equals(beginnPflegeverhaeltnis);
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__KRANKENVERSICHERT:
				return KRANKENVERSICHERT_EDEFAULT == null ? krankenversichert != null : !KRANKENVERSICHERT_EDEFAULT.equals(krankenversichert);
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__KRANKENVERSICHERT_UEBER_PFLEGEPERSON:
				return KRANKENVERSICHERT_UEBER_PFLEGEPERSON_EDEFAULT == null ? krankenversichertUeberPflegeperson != null : !KRANKENVERSICHERT_UEBER_PFLEGEPERSON_EDEFAULT.equals(krankenversichertUeberPflegeperson);
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__SCHULE_AUSBILDUNGSSTAETTE:
				return SCHULE_AUSBILDUNGSSTAETTE_EDEFAULT == null ? schuleAusbildungsstaette != null : !SCHULE_AUSBILDUNGSSTAETTE_EDEFAULT.equals(schuleAusbildungsstaette);
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__KLASSENSTUFE_AUSBILDUNGSJAHR:
				return KLASSENSTUFE_AUSBILDUNGSJAHR_EDEFAULT == null ? klassenstufeAusbildungsjahr != null : !KLASSENSTUFE_AUSBILDUNGSJAHR_EDEFAULT.equals(klassenstufeAusbildungsjahr);
			case AdoptionPackage.ANGABEN_PFLEGEKIND_TYPE__EINKOMMEN_PFLEGEKIND:
				return einkommenPflegekind != null;
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
		result.append(" (beginnPflegeverhaeltnis: ");
		result.append(beginnPflegeverhaeltnis);
		result.append(", krankenversichert: ");
		result.append(krankenversichert);
		result.append(", krankenversichertUeberPflegeperson: ");
		result.append(krankenversichertUeberPflegeperson);
		result.append(", schuleAusbildungsstaette: ");
		result.append(schuleAusbildungsstaette);
		result.append(", klassenstufeAusbildungsjahr: ");
		result.append(klassenstufeAusbildungsjahr);
		result.append(')');
		return result.toString();
	}

} //AngabenPflegekindTypeImpl
