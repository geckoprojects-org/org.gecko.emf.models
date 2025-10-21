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
package de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtTypeImpl;

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AngabenKindHZEType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungNachweisnachricht0711Type;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.NachweiseHZEType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.PersoenlicheAngabenHZEType;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hilfen Zur Erziehung Nachweisnachricht0711 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungNachweisnachricht0711TypeImpl#getPersoenlicheAngabenZuIhrerPerson <em>Persoenliche Angaben Zu Ihrer Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungNachweisnachricht0711TypeImpl#getAngabenKind <em>Angaben Kind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungNachweisnachricht0711TypeImpl#getJugendamt <em>Jugendamt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungNachweisnachricht0711TypeImpl#getBearbeitungsnummer <em>Bearbeitungsnummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungNachweisnachricht0711TypeImpl#getAntragsdatum <em>Antragsdatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungNachweisnachricht0711TypeImpl#getNachweis <em>Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungNachweisnachricht0711TypeImpl#getZusatznachrichtHZE <em>Zusatznachricht HZE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HilfenZurErziehungNachweisnachricht0711TypeImpl extends NachrichtTypeImpl implements HilfenZurErziehungNachweisnachricht0711Type {
	/**
	 * The cached value of the '{@link #getPersoenlicheAngabenZuIhrerPerson() <em>Persoenliche Angaben Zu Ihrer Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersoenlicheAngabenZuIhrerPerson()
	 * @generated
	 * @ordered
	 */
	protected PersoenlicheAngabenHZEType persoenlicheAngabenZuIhrerPerson;

	/**
	 * The cached value of the '{@link #getAngabenKind() <em>Angaben Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenKind()
	 * @generated
	 * @ordered
	 */
	protected AngabenKindHZEType angabenKind;

	/**
	 * The default value of the '{@link #getJugendamt() <em>Jugendamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJugendamt()
	 * @generated
	 * @ordered
	 */
	protected static final String JUGENDAMT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJugendamt() <em>Jugendamt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJugendamt()
	 * @generated
	 * @ordered
	 */
	protected String jugendamt = JUGENDAMT_EDEFAULT;

	/**
	 * The default value of the '{@link #getBearbeitungsnummer() <em>Bearbeitungsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBearbeitungsnummer()
	 * @generated
	 * @ordered
	 */
	protected static final String BEARBEITUNGSNUMMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBearbeitungsnummer() <em>Bearbeitungsnummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBearbeitungsnummer()
	 * @generated
	 * @ordered
	 */
	protected String bearbeitungsnummer = BEARBEITUNGSNUMMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAntragsdatum() <em>Antragsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntragsdatum()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ANTRAGSDATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAntragsdatum() <em>Antragsdatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntragsdatum()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar antragsdatum = ANTRAGSDATUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNachweis() <em>Nachweis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweis()
	 * @generated
	 * @ordered
	 */
	protected EList<NachweiseHZEType> nachweis;

	/**
	 * The default value of the '{@link #getZusatznachrichtHZE() <em>Zusatznachricht HZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusatznachrichtHZE()
	 * @generated
	 * @ordered
	 */
	protected static final String ZUSATZNACHRICHT_HZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZusatznachrichtHZE() <em>Zusatznachricht HZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZusatznachrichtHZE()
	 * @generated
	 * @ordered
	 */
	protected String zusatznachrichtHZE = ZUSATZNACHRICHT_HZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HilfenZurErziehungNachweisnachricht0711TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErziehungshilfePackage.Literals.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersoenlicheAngabenHZEType getPersoenlicheAngabenZuIhrerPerson() {
		return persoenlicheAngabenZuIhrerPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersoenlicheAngabenZuIhrerPerson(PersoenlicheAngabenHZEType newPersoenlicheAngabenZuIhrerPerson, NotificationChain msgs) {
		PersoenlicheAngabenHZEType oldPersoenlicheAngabenZuIhrerPerson = persoenlicheAngabenZuIhrerPerson;
		persoenlicheAngabenZuIhrerPerson = newPersoenlicheAngabenZuIhrerPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON, oldPersoenlicheAngabenZuIhrerPerson, newPersoenlicheAngabenZuIhrerPerson);
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
	public void setPersoenlicheAngabenZuIhrerPerson(PersoenlicheAngabenHZEType newPersoenlicheAngabenZuIhrerPerson) {
		if (newPersoenlicheAngabenZuIhrerPerson != persoenlicheAngabenZuIhrerPerson) {
			NotificationChain msgs = null;
			if (persoenlicheAngabenZuIhrerPerson != null)
				msgs = ((InternalEObject)persoenlicheAngabenZuIhrerPerson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON, null, msgs);
			if (newPersoenlicheAngabenZuIhrerPerson != null)
				msgs = ((InternalEObject)newPersoenlicheAngabenZuIhrerPerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON, null, msgs);
			msgs = basicSetPersoenlicheAngabenZuIhrerPerson(newPersoenlicheAngabenZuIhrerPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON, newPersoenlicheAngabenZuIhrerPerson, newPersoenlicheAngabenZuIhrerPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenKindHZEType getAngabenKind() {
		return angabenKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenKind(AngabenKindHZEType newAngabenKind, NotificationChain msgs) {
		AngabenKindHZEType oldAngabenKind = angabenKind;
		angabenKind = newAngabenKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ANGABEN_KIND, oldAngabenKind, newAngabenKind);
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
	public void setAngabenKind(AngabenKindHZEType newAngabenKind) {
		if (newAngabenKind != angabenKind) {
			NotificationChain msgs = null;
			if (angabenKind != null)
				msgs = ((InternalEObject)angabenKind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ANGABEN_KIND, null, msgs);
			if (newAngabenKind != null)
				msgs = ((InternalEObject)newAngabenKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ANGABEN_KIND, null, msgs);
			msgs = basicSetAngabenKind(newAngabenKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ANGABEN_KIND, newAngabenKind, newAngabenKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJugendamt() {
		return jugendamt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJugendamt(String newJugendamt) {
		String oldJugendamt = jugendamt;
		jugendamt = newJugendamt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__JUGENDAMT, oldJugendamt, jugendamt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBearbeitungsnummer() {
		return bearbeitungsnummer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBearbeitungsnummer(String newBearbeitungsnummer) {
		String oldBearbeitungsnummer = bearbeitungsnummer;
		bearbeitungsnummer = newBearbeitungsnummer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__BEARBEITUNGSNUMMER, oldBearbeitungsnummer, bearbeitungsnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getAntragsdatum() {
		return antragsdatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAntragsdatum(XMLGregorianCalendar newAntragsdatum) {
		XMLGregorianCalendar oldAntragsdatum = antragsdatum;
		antragsdatum = newAntragsdatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ANTRAGSDATUM, oldAntragsdatum, antragsdatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweiseHZEType> getNachweis() {
		if (nachweis == null) {
			nachweis = new EObjectContainmentEList<NachweiseHZEType>(NachweiseHZEType.class, this, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__NACHWEIS);
		}
		return nachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZusatznachrichtHZE() {
		return zusatznachrichtHZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZusatznachrichtHZE(String newZusatznachrichtHZE) {
		String oldZusatznachrichtHZE = zusatznachrichtHZE;
		zusatznachrichtHZE = newZusatznachrichtHZE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ZUSATZNACHRICHT_HZE, oldZusatznachrichtHZE, zusatznachrichtHZE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON:
				return basicSetPersoenlicheAngabenZuIhrerPerson(null, msgs);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ANGABEN_KIND:
				return basicSetAngabenKind(null, msgs);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__NACHWEIS:
				return ((InternalEList<?>)getNachweis()).basicRemove(otherEnd, msgs);
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
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON:
				return getPersoenlicheAngabenZuIhrerPerson();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ANGABEN_KIND:
				return getAngabenKind();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__JUGENDAMT:
				return getJugendamt();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__BEARBEITUNGSNUMMER:
				return getBearbeitungsnummer();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ANTRAGSDATUM:
				return getAntragsdatum();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__NACHWEIS:
				return getNachweis();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ZUSATZNACHRICHT_HZE:
				return getZusatznachrichtHZE();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON:
				setPersoenlicheAngabenZuIhrerPerson((PersoenlicheAngabenHZEType)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ANGABEN_KIND:
				setAngabenKind((AngabenKindHZEType)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__JUGENDAMT:
				setJugendamt((String)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__BEARBEITUNGSNUMMER:
				setBearbeitungsnummer((String)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ANTRAGSDATUM:
				setAntragsdatum((XMLGregorianCalendar)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__NACHWEIS:
				getNachweis().clear();
				getNachweis().addAll((Collection<? extends NachweiseHZEType>)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ZUSATZNACHRICHT_HZE:
				setZusatznachrichtHZE((String)newValue);
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
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON:
				setPersoenlicheAngabenZuIhrerPerson((PersoenlicheAngabenHZEType)null);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ANGABEN_KIND:
				setAngabenKind((AngabenKindHZEType)null);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__JUGENDAMT:
				setJugendamt(JUGENDAMT_EDEFAULT);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__BEARBEITUNGSNUMMER:
				setBearbeitungsnummer(BEARBEITUNGSNUMMER_EDEFAULT);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ANTRAGSDATUM:
				setAntragsdatum(ANTRAGSDATUM_EDEFAULT);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__NACHWEIS:
				getNachweis().clear();
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ZUSATZNACHRICHT_HZE:
				setZusatznachrichtHZE(ZUSATZNACHRICHT_HZE_EDEFAULT);
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
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON:
				return persoenlicheAngabenZuIhrerPerson != null;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ANGABEN_KIND:
				return angabenKind != null;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__JUGENDAMT:
				return JUGENDAMT_EDEFAULT == null ? jugendamt != null : !JUGENDAMT_EDEFAULT.equals(jugendamt);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__BEARBEITUNGSNUMMER:
				return BEARBEITUNGSNUMMER_EDEFAULT == null ? bearbeitungsnummer != null : !BEARBEITUNGSNUMMER_EDEFAULT.equals(bearbeitungsnummer);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ANTRAGSDATUM:
				return ANTRAGSDATUM_EDEFAULT == null ? antragsdatum != null : !ANTRAGSDATUM_EDEFAULT.equals(antragsdatum);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__NACHWEIS:
				return nachweis != null && !nachweis.isEmpty();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_NACHWEISNACHRICHT0711_TYPE__ZUSATZNACHRICHT_HZE:
				return ZUSATZNACHRICHT_HZE_EDEFAULT == null ? zusatznachrichtHZE != null : !ZUSATZNACHRICHT_HZE_EDEFAULT.equals(zusatznachrichtHZE);
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
		result.append(" (jugendamt: ");
		result.append(jugendamt);
		result.append(", bearbeitungsnummer: ");
		result.append(bearbeitungsnummer);
		result.append(", antragsdatum: ");
		result.append(antragsdatum);
		result.append(", zusatznachrichtHZE: ");
		result.append(zusatznachrichtHZE);
		result.append(')');
		return result.toString();
	}

} //HilfenZurErziehungNachweisnachricht0711TypeImpl
