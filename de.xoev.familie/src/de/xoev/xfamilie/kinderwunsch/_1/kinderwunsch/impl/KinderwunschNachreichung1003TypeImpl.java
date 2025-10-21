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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeBundeslandType;

import de.xoev.xfamilie.baukasten._1.baukasten.impl.AntragsnachrichtTypeImpl;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachreichungType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.PersonendatenType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nachreichung1003 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschNachreichung1003TypeImpl#getBundesland <em>Bundesland</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschNachreichung1003TypeImpl#getBearbeitungsnummer <em>Bearbeitungsnummer</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschNachreichung1003TypeImpl#getNichtaustragendePerson <em>Nichtaustragende Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschNachreichung1003TypeImpl#getAntragstellendePerson <em>Antragstellende Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschNachreichung1003TypeImpl#getNachreichung <em>Nachreichung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschNachreichung1003TypeImpl#isDatenschutzerklaerungDerFoerderstelle <em>Datenschutzerklaerung Der Foerderstelle</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschNachreichung1003TypeImpl#isBestaetigungRichtigkeitAngaben <em>Bestaetigung Richtigkeit Angaben</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KinderwunschNachreichung1003TypeImpl extends AntragsnachrichtTypeImpl implements KinderwunschNachreichung1003Type {
	/**
	 * The cached value of the '{@link #getBundesland() <em>Bundesland</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundesland()
	 * @generated
	 * @ordered
	 */
	protected CodeBundeslandType bundesland;

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
	 * The cached value of the '{@link #getNichtaustragendePerson() <em>Nichtaustragende Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNichtaustragendePerson()
	 * @generated
	 * @ordered
	 */
	protected PersonendatenType nichtaustragendePerson;

	/**
	 * The cached value of the '{@link #getAntragstellendePerson() <em>Antragstellende Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAntragstellendePerson()
	 * @generated
	 * @ordered
	 */
	protected PersonendatenType antragstellendePerson;

	/**
	 * The cached value of the '{@link #getNachreichung() <em>Nachreichung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachreichung()
	 * @generated
	 * @ordered
	 */
	protected NachreichungType nachreichung;

	/**
	 * The default value of the '{@link #isDatenschutzerklaerungDerFoerderstelle() <em>Datenschutzerklaerung Der Foerderstelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDatenschutzerklaerungDerFoerderstelle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DATENSCHUTZERKLAERUNG_DER_FOERDERSTELLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDatenschutzerklaerungDerFoerderstelle() <em>Datenschutzerklaerung Der Foerderstelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDatenschutzerklaerungDerFoerderstelle()
	 * @generated
	 * @ordered
	 */
	protected boolean datenschutzerklaerungDerFoerderstelle = DATENSCHUTZERKLAERUNG_DER_FOERDERSTELLE_EDEFAULT;

	/**
	 * This is true if the Datenschutzerklaerung Der Foerderstelle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean datenschutzerklaerungDerFoerderstelleESet;

	/**
	 * The default value of the '{@link #isBestaetigungRichtigkeitAngaben() <em>Bestaetigung Richtigkeit Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBestaetigungRichtigkeitAngaben()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BESTAETIGUNG_RICHTIGKEIT_ANGABEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBestaetigungRichtigkeitAngaben() <em>Bestaetigung Richtigkeit Angaben</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBestaetigungRichtigkeitAngaben()
	 * @generated
	 * @ordered
	 */
	protected boolean bestaetigungRichtigkeitAngaben = BESTAETIGUNG_RICHTIGKEIT_ANGABEN_EDEFAULT;

	/**
	 * This is true if the Bestaetigung Richtigkeit Angaben attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bestaetigungRichtigkeitAngabenESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KinderwunschNachreichung1003TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.KINDERWUNSCH_NACHREICHUNG1003_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeBundeslandType getBundesland() {
		return bundesland;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBundesland(CodeBundeslandType newBundesland, NotificationChain msgs) {
		CodeBundeslandType oldBundesland = bundesland;
		bundesland = newBundesland;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__BUNDESLAND, oldBundesland, newBundesland);
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
	public void setBundesland(CodeBundeslandType newBundesland) {
		if (newBundesland != bundesland) {
			NotificationChain msgs = null;
			if (bundesland != null)
				msgs = ((InternalEObject)bundesland).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__BUNDESLAND, null, msgs);
			if (newBundesland != null)
				msgs = ((InternalEObject)newBundesland).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__BUNDESLAND, null, msgs);
			msgs = basicSetBundesland(newBundesland, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__BUNDESLAND, newBundesland, newBundesland));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__BEARBEITUNGSNUMMER, oldBearbeitungsnummer, bearbeitungsnummer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonendatenType getNichtaustragendePerson() {
		return nichtaustragendePerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNichtaustragendePerson(PersonendatenType newNichtaustragendePerson, NotificationChain msgs) {
		PersonendatenType oldNichtaustragendePerson = nichtaustragendePerson;
		nichtaustragendePerson = newNichtaustragendePerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__NICHTAUSTRAGENDE_PERSON, oldNichtaustragendePerson, newNichtaustragendePerson);
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
	public void setNichtaustragendePerson(PersonendatenType newNichtaustragendePerson) {
		if (newNichtaustragendePerson != nichtaustragendePerson) {
			NotificationChain msgs = null;
			if (nichtaustragendePerson != null)
				msgs = ((InternalEObject)nichtaustragendePerson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__NICHTAUSTRAGENDE_PERSON, null, msgs);
			if (newNichtaustragendePerson != null)
				msgs = ((InternalEObject)newNichtaustragendePerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__NICHTAUSTRAGENDE_PERSON, null, msgs);
			msgs = basicSetNichtaustragendePerson(newNichtaustragendePerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__NICHTAUSTRAGENDE_PERSON, newNichtaustragendePerson, newNichtaustragendePerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonendatenType getAntragstellendePerson() {
		return antragstellendePerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAntragstellendePerson(PersonendatenType newAntragstellendePerson, NotificationChain msgs) {
		PersonendatenType oldAntragstellendePerson = antragstellendePerson;
		antragstellendePerson = newAntragstellendePerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__ANTRAGSTELLENDE_PERSON, oldAntragstellendePerson, newAntragstellendePerson);
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
	public void setAntragstellendePerson(PersonendatenType newAntragstellendePerson) {
		if (newAntragstellendePerson != antragstellendePerson) {
			NotificationChain msgs = null;
			if (antragstellendePerson != null)
				msgs = ((InternalEObject)antragstellendePerson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__ANTRAGSTELLENDE_PERSON, null, msgs);
			if (newAntragstellendePerson != null)
				msgs = ((InternalEObject)newAntragstellendePerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__ANTRAGSTELLENDE_PERSON, null, msgs);
			msgs = basicSetAntragstellendePerson(newAntragstellendePerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__ANTRAGSTELLENDE_PERSON, newAntragstellendePerson, newAntragstellendePerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachreichungType getNachreichung() {
		return nachreichung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachreichung(NachreichungType newNachreichung, NotificationChain msgs) {
		NachreichungType oldNachreichung = nachreichung;
		nachreichung = newNachreichung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__NACHREICHUNG, oldNachreichung, newNachreichung);
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
	public void setNachreichung(NachreichungType newNachreichung) {
		if (newNachreichung != nachreichung) {
			NotificationChain msgs = null;
			if (nachreichung != null)
				msgs = ((InternalEObject)nachreichung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__NACHREICHUNG, null, msgs);
			if (newNachreichung != null)
				msgs = ((InternalEObject)newNachreichung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__NACHREICHUNG, null, msgs);
			msgs = basicSetNachreichung(newNachreichung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__NACHREICHUNG, newNachreichung, newNachreichung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDatenschutzerklaerungDerFoerderstelle() {
		return datenschutzerklaerungDerFoerderstelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatenschutzerklaerungDerFoerderstelle(boolean newDatenschutzerklaerungDerFoerderstelle) {
		boolean oldDatenschutzerklaerungDerFoerderstelle = datenschutzerklaerungDerFoerderstelle;
		datenschutzerklaerungDerFoerderstelle = newDatenschutzerklaerungDerFoerderstelle;
		boolean oldDatenschutzerklaerungDerFoerderstelleESet = datenschutzerklaerungDerFoerderstelleESet;
		datenschutzerklaerungDerFoerderstelleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__DATENSCHUTZERKLAERUNG_DER_FOERDERSTELLE, oldDatenschutzerklaerungDerFoerderstelle, datenschutzerklaerungDerFoerderstelle, !oldDatenschutzerklaerungDerFoerderstelleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetDatenschutzerklaerungDerFoerderstelle() {
		boolean oldDatenschutzerklaerungDerFoerderstelle = datenschutzerklaerungDerFoerderstelle;
		boolean oldDatenschutzerklaerungDerFoerderstelleESet = datenschutzerklaerungDerFoerderstelleESet;
		datenschutzerklaerungDerFoerderstelle = DATENSCHUTZERKLAERUNG_DER_FOERDERSTELLE_EDEFAULT;
		datenschutzerklaerungDerFoerderstelleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__DATENSCHUTZERKLAERUNG_DER_FOERDERSTELLE, oldDatenschutzerklaerungDerFoerderstelle, DATENSCHUTZERKLAERUNG_DER_FOERDERSTELLE_EDEFAULT, oldDatenschutzerklaerungDerFoerderstelleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetDatenschutzerklaerungDerFoerderstelle() {
		return datenschutzerklaerungDerFoerderstelleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBestaetigungRichtigkeitAngaben() {
		return bestaetigungRichtigkeitAngaben;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBestaetigungRichtigkeitAngaben(boolean newBestaetigungRichtigkeitAngaben) {
		boolean oldBestaetigungRichtigkeitAngaben = bestaetigungRichtigkeitAngaben;
		bestaetigungRichtigkeitAngaben = newBestaetigungRichtigkeitAngaben;
		boolean oldBestaetigungRichtigkeitAngabenESet = bestaetigungRichtigkeitAngabenESet;
		bestaetigungRichtigkeitAngabenESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN, oldBestaetigungRichtigkeitAngaben, bestaetigungRichtigkeitAngaben, !oldBestaetigungRichtigkeitAngabenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetBestaetigungRichtigkeitAngaben() {
		boolean oldBestaetigungRichtigkeitAngaben = bestaetigungRichtigkeitAngaben;
		boolean oldBestaetigungRichtigkeitAngabenESet = bestaetigungRichtigkeitAngabenESet;
		bestaetigungRichtigkeitAngaben = BESTAETIGUNG_RICHTIGKEIT_ANGABEN_EDEFAULT;
		bestaetigungRichtigkeitAngabenESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN, oldBestaetigungRichtigkeitAngaben, BESTAETIGUNG_RICHTIGKEIT_ANGABEN_EDEFAULT, oldBestaetigungRichtigkeitAngabenESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetBestaetigungRichtigkeitAngaben() {
		return bestaetigungRichtigkeitAngabenESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__BUNDESLAND:
				return basicSetBundesland(null, msgs);
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__NICHTAUSTRAGENDE_PERSON:
				return basicSetNichtaustragendePerson(null, msgs);
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__ANTRAGSTELLENDE_PERSON:
				return basicSetAntragstellendePerson(null, msgs);
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__NACHREICHUNG:
				return basicSetNachreichung(null, msgs);
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
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__BUNDESLAND:
				return getBundesland();
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__BEARBEITUNGSNUMMER:
				return getBearbeitungsnummer();
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__NICHTAUSTRAGENDE_PERSON:
				return getNichtaustragendePerson();
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__ANTRAGSTELLENDE_PERSON:
				return getAntragstellendePerson();
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__NACHREICHUNG:
				return getNachreichung();
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__DATENSCHUTZERKLAERUNG_DER_FOERDERSTELLE:
				return isDatenschutzerklaerungDerFoerderstelle();
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN:
				return isBestaetigungRichtigkeitAngaben();
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
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__BUNDESLAND:
				setBundesland((CodeBundeslandType)newValue);
				return;
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__BEARBEITUNGSNUMMER:
				setBearbeitungsnummer((String)newValue);
				return;
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__NICHTAUSTRAGENDE_PERSON:
				setNichtaustragendePerson((PersonendatenType)newValue);
				return;
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__ANTRAGSTELLENDE_PERSON:
				setAntragstellendePerson((PersonendatenType)newValue);
				return;
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__NACHREICHUNG:
				setNachreichung((NachreichungType)newValue);
				return;
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__DATENSCHUTZERKLAERUNG_DER_FOERDERSTELLE:
				setDatenschutzerklaerungDerFoerderstelle((Boolean)newValue);
				return;
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN:
				setBestaetigungRichtigkeitAngaben((Boolean)newValue);
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
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__BUNDESLAND:
				setBundesland((CodeBundeslandType)null);
				return;
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__BEARBEITUNGSNUMMER:
				setBearbeitungsnummer(BEARBEITUNGSNUMMER_EDEFAULT);
				return;
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__NICHTAUSTRAGENDE_PERSON:
				setNichtaustragendePerson((PersonendatenType)null);
				return;
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__ANTRAGSTELLENDE_PERSON:
				setAntragstellendePerson((PersonendatenType)null);
				return;
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__NACHREICHUNG:
				setNachreichung((NachreichungType)null);
				return;
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__DATENSCHUTZERKLAERUNG_DER_FOERDERSTELLE:
				unsetDatenschutzerklaerungDerFoerderstelle();
				return;
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN:
				unsetBestaetigungRichtigkeitAngaben();
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
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__BUNDESLAND:
				return bundesland != null;
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__BEARBEITUNGSNUMMER:
				return BEARBEITUNGSNUMMER_EDEFAULT == null ? bearbeitungsnummer != null : !BEARBEITUNGSNUMMER_EDEFAULT.equals(bearbeitungsnummer);
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__NICHTAUSTRAGENDE_PERSON:
				return nichtaustragendePerson != null;
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__ANTRAGSTELLENDE_PERSON:
				return antragstellendePerson != null;
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__NACHREICHUNG:
				return nachreichung != null;
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__DATENSCHUTZERKLAERUNG_DER_FOERDERSTELLE:
				return isSetDatenschutzerklaerungDerFoerderstelle();
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN:
				return isSetBestaetigungRichtigkeitAngaben();
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
		result.append(" (bearbeitungsnummer: ");
		result.append(bearbeitungsnummer);
		result.append(", datenschutzerklaerungDerFoerderstelle: ");
		if (datenschutzerklaerungDerFoerderstelleESet) result.append(datenschutzerklaerungDerFoerderstelle); else result.append("<unset>");
		result.append(", bestaetigungRichtigkeitAngaben: ");
		if (bestaetigungRichtigkeitAngabenESet) result.append(bestaetigungRichtigkeitAngaben); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //KinderwunschNachreichung1003TypeImpl
