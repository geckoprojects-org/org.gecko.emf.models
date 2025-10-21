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

import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.AuswahlBescheidartType;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.ErziehungshilfePackage;
import de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.HilfenZurErziehungWiderspruch0704Type;
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
 * An implementation of the model object '<em><b>Hilfen Zur Erziehung Widerspruch0704 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungWiderspruch0704TypeImpl#getPersoenlicheAngabenZuIhrerPerson <em>Persoenliche Angaben Zu Ihrer Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungWiderspruch0704TypeImpl#getAktenzeichen <em>Aktenzeichen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungWiderspruch0704TypeImpl#getBescheiddatum <em>Bescheiddatum</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungWiderspruch0704TypeImpl#getBegruendungWiderspruch <em>Begruendung Widerspruch</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungWiderspruch0704TypeImpl#isBestaetigungWiderspruch <em>Bestaetigung Widerspruch</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungWiderspruch0704TypeImpl#getNachweis <em>Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.hilfen.zur.erziehung._1.erziehungshilfen.impl.HilfenZurErziehungWiderspruch0704TypeImpl#getAuswahlBescheidart <em>Auswahl Bescheidart</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HilfenZurErziehungWiderspruch0704TypeImpl extends NachrichtTypeImpl implements HilfenZurErziehungWiderspruch0704Type {
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
	 * The default value of the '{@link #getBescheiddatum() <em>Bescheiddatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBescheiddatum()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar BESCHEIDDATUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBescheiddatum() <em>Bescheiddatum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBescheiddatum()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar bescheiddatum = BESCHEIDDATUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getBegruendungWiderspruch() <em>Begruendung Widerspruch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegruendungWiderspruch()
	 * @generated
	 * @ordered
	 */
	protected static final String BEGRUENDUNG_WIDERSPRUCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBegruendungWiderspruch() <em>Begruendung Widerspruch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegruendungWiderspruch()
	 * @generated
	 * @ordered
	 */
	protected String begruendungWiderspruch = BEGRUENDUNG_WIDERSPRUCH_EDEFAULT;

	/**
	 * The default value of the '{@link #isBestaetigungWiderspruch() <em>Bestaetigung Widerspruch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBestaetigungWiderspruch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BESTAETIGUNG_WIDERSPRUCH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBestaetigungWiderspruch() <em>Bestaetigung Widerspruch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBestaetigungWiderspruch()
	 * @generated
	 * @ordered
	 */
	protected boolean bestaetigungWiderspruch = BESTAETIGUNG_WIDERSPRUCH_EDEFAULT;

	/**
	 * This is true if the Bestaetigung Widerspruch attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bestaetigungWiderspruchESet;

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
	 * The cached value of the '{@link #getAuswahlBescheidart() <em>Auswahl Bescheidart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuswahlBescheidart()
	 * @generated
	 * @ordered
	 */
	protected AuswahlBescheidartType auswahlBescheidart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HilfenZurErziehungWiderspruch0704TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErziehungshilfePackage.Literals.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON, oldPersoenlicheAngabenZuIhrerPerson, newPersoenlicheAngabenZuIhrerPerson);
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
				msgs = ((InternalEObject)persoenlicheAngabenZuIhrerPerson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON, null, msgs);
			if (newPersoenlicheAngabenZuIhrerPerson != null)
				msgs = ((InternalEObject)newPersoenlicheAngabenZuIhrerPerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON, null, msgs);
			msgs = basicSetPersoenlicheAngabenZuIhrerPerson(newPersoenlicheAngabenZuIhrerPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON, newPersoenlicheAngabenZuIhrerPerson, newPersoenlicheAngabenZuIhrerPerson));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__AKTENZEICHEN, oldAktenzeichen, aktenzeichen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getBescheiddatum() {
		return bescheiddatum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBescheiddatum(XMLGregorianCalendar newBescheiddatum) {
		XMLGregorianCalendar oldBescheiddatum = bescheiddatum;
		bescheiddatum = newBescheiddatum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BESCHEIDDATUM, oldBescheiddatum, bescheiddatum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBegruendungWiderspruch() {
		return begruendungWiderspruch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBegruendungWiderspruch(String newBegruendungWiderspruch) {
		String oldBegruendungWiderspruch = begruendungWiderspruch;
		begruendungWiderspruch = newBegruendungWiderspruch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BEGRUENDUNG_WIDERSPRUCH, oldBegruendungWiderspruch, begruendungWiderspruch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBestaetigungWiderspruch() {
		return bestaetigungWiderspruch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBestaetigungWiderspruch(boolean newBestaetigungWiderspruch) {
		boolean oldBestaetigungWiderspruch = bestaetigungWiderspruch;
		bestaetigungWiderspruch = newBestaetigungWiderspruch;
		boolean oldBestaetigungWiderspruchESet = bestaetigungWiderspruchESet;
		bestaetigungWiderspruchESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BESTAETIGUNG_WIDERSPRUCH, oldBestaetigungWiderspruch, bestaetigungWiderspruch, !oldBestaetigungWiderspruchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBestaetigungWiderspruch() {
		boolean oldBestaetigungWiderspruch = bestaetigungWiderspruch;
		boolean oldBestaetigungWiderspruchESet = bestaetigungWiderspruchESet;
		bestaetigungWiderspruch = BESTAETIGUNG_WIDERSPRUCH_EDEFAULT;
		bestaetigungWiderspruchESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BESTAETIGUNG_WIDERSPRUCH, oldBestaetigungWiderspruch, BESTAETIGUNG_WIDERSPRUCH_EDEFAULT, oldBestaetigungWiderspruchESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBestaetigungWiderspruch() {
		return bestaetigungWiderspruchESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NachweiseHZEType> getNachweis() {
		if (nachweis == null) {
			nachweis = new EObjectContainmentEList<NachweiseHZEType>(NachweiseHZEType.class, this, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__NACHWEIS);
		}
		return nachweis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuswahlBescheidartType getAuswahlBescheidart() {
		return auswahlBescheidart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuswahlBescheidart(AuswahlBescheidartType newAuswahlBescheidart, NotificationChain msgs) {
		AuswahlBescheidartType oldAuswahlBescheidart = auswahlBescheidart;
		auswahlBescheidart = newAuswahlBescheidart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__AUSWAHL_BESCHEIDART, oldAuswahlBescheidart, newAuswahlBescheidart);
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
	public void setAuswahlBescheidart(AuswahlBescheidartType newAuswahlBescheidart) {
		if (newAuswahlBescheidart != auswahlBescheidart) {
			NotificationChain msgs = null;
			if (auswahlBescheidart != null)
				msgs = ((InternalEObject)auswahlBescheidart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__AUSWAHL_BESCHEIDART, null, msgs);
			if (newAuswahlBescheidart != null)
				msgs = ((InternalEObject)newAuswahlBescheidart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__AUSWAHL_BESCHEIDART, null, msgs);
			msgs = basicSetAuswahlBescheidart(newAuswahlBescheidart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__AUSWAHL_BESCHEIDART, newAuswahlBescheidart, newAuswahlBescheidart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON:
				return basicSetPersoenlicheAngabenZuIhrerPerson(null, msgs);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__NACHWEIS:
				return ((InternalEList<?>)getNachweis()).basicRemove(otherEnd, msgs);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__AUSWAHL_BESCHEIDART:
				return basicSetAuswahlBescheidart(null, msgs);
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
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON:
				return getPersoenlicheAngabenZuIhrerPerson();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__AKTENZEICHEN:
				return getAktenzeichen();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BESCHEIDDATUM:
				return getBescheiddatum();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BEGRUENDUNG_WIDERSPRUCH:
				return getBegruendungWiderspruch();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BESTAETIGUNG_WIDERSPRUCH:
				return isBestaetigungWiderspruch();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__NACHWEIS:
				return getNachweis();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__AUSWAHL_BESCHEIDART:
				return getAuswahlBescheidart();
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
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON:
				setPersoenlicheAngabenZuIhrerPerson((PersoenlicheAngabenHZEType)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__AKTENZEICHEN:
				setAktenzeichen((String)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BESCHEIDDATUM:
				setBescheiddatum((XMLGregorianCalendar)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BEGRUENDUNG_WIDERSPRUCH:
				setBegruendungWiderspruch((String)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BESTAETIGUNG_WIDERSPRUCH:
				setBestaetigungWiderspruch((Boolean)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__NACHWEIS:
				getNachweis().clear();
				getNachweis().addAll((Collection<? extends NachweiseHZEType>)newValue);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__AUSWAHL_BESCHEIDART:
				setAuswahlBescheidart((AuswahlBescheidartType)newValue);
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
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON:
				setPersoenlicheAngabenZuIhrerPerson((PersoenlicheAngabenHZEType)null);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__AKTENZEICHEN:
				setAktenzeichen(AKTENZEICHEN_EDEFAULT);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BESCHEIDDATUM:
				setBescheiddatum(BESCHEIDDATUM_EDEFAULT);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BEGRUENDUNG_WIDERSPRUCH:
				setBegruendungWiderspruch(BEGRUENDUNG_WIDERSPRUCH_EDEFAULT);
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BESTAETIGUNG_WIDERSPRUCH:
				unsetBestaetigungWiderspruch();
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__NACHWEIS:
				getNachweis().clear();
				return;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__AUSWAHL_BESCHEIDART:
				setAuswahlBescheidart((AuswahlBescheidartType)null);
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
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__PERSOENLICHE_ANGABEN_ZU_IHRER_PERSON:
				return persoenlicheAngabenZuIhrerPerson != null;
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__AKTENZEICHEN:
				return AKTENZEICHEN_EDEFAULT == null ? aktenzeichen != null : !AKTENZEICHEN_EDEFAULT.equals(aktenzeichen);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BESCHEIDDATUM:
				return BESCHEIDDATUM_EDEFAULT == null ? bescheiddatum != null : !BESCHEIDDATUM_EDEFAULT.equals(bescheiddatum);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BEGRUENDUNG_WIDERSPRUCH:
				return BEGRUENDUNG_WIDERSPRUCH_EDEFAULT == null ? begruendungWiderspruch != null : !BEGRUENDUNG_WIDERSPRUCH_EDEFAULT.equals(begruendungWiderspruch);
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__BESTAETIGUNG_WIDERSPRUCH:
				return isSetBestaetigungWiderspruch();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__NACHWEIS:
				return nachweis != null && !nachweis.isEmpty();
			case ErziehungshilfePackage.HILFEN_ZUR_ERZIEHUNG_WIDERSPRUCH0704_TYPE__AUSWAHL_BESCHEIDART:
				return auswahlBescheidart != null;
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
		result.append(" (aktenzeichen: ");
		result.append(aktenzeichen);
		result.append(", bescheiddatum: ");
		result.append(bescheiddatum);
		result.append(", begruendungWiderspruch: ");
		result.append(begruendungWiderspruch);
		result.append(", bestaetigungWiderspruch: ");
		if (bestaetigungWiderspruchESet) result.append(bestaetigungWiderspruch); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //HilfenZurErziehungWiderspruch0704TypeImpl
