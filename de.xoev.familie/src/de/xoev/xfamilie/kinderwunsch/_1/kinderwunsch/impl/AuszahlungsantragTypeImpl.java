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

import de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungType;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenAuszahlungsantragType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseBerechnungZuwendungType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.PersonendatenType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auszahlungsantrag Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AuszahlungsantragTypeImpl#isAbfrageBewilligungsbescheid <em>Abfrage Bewilligungsbescheid</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AuszahlungsantragTypeImpl#getBundeslandFoerderstelle <em>Bundesland Foerderstelle</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AuszahlungsantragTypeImpl#getAktenzeichenBewilligungsantrag <em>Aktenzeichen Bewilligungsantrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AuszahlungsantragTypeImpl#getDatenschutzerklaerungSchwangerschaft <em>Datenschutzerklaerung Schwangerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AuszahlungsantragTypeImpl#isZustimmungDatenschutzerklaerungHerbeifuehrung <em>Zustimmung Datenschutzerklaerung Herbeifuehrung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AuszahlungsantragTypeImpl#getKonfigurationsfragen <em>Konfigurationsfragen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AuszahlungsantragTypeImpl#getAntragstellendePerson <em>Antragstellende Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AuszahlungsantragTypeImpl#getNichtaustragendePerson <em>Nichtaustragende Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AuszahlungsantragTypeImpl#getAngabenBankverbindung <em>Angaben Bankverbindung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AuszahlungsantragTypeImpl#getNachweiseBerechnungZuwendung <em>Nachweise Berechnung Zuwendung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AuszahlungsantragTypeImpl#getEinwilligungenAuszahlungsantrag <em>Einwilligungen Auszahlungsantrag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AuszahlungsantragTypeImpl#isBestaetigungRichtigkeitAngaben <em>Bestaetigung Richtigkeit Angaben</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AuszahlungsantragTypeImpl extends MinimalEObjectImpl.Container implements AuszahlungsantragType {
	/**
	 * The default value of the '{@link #isAbfrageBewilligungsbescheid() <em>Abfrage Bewilligungsbescheid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbfrageBewilligungsbescheid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABFRAGE_BEWILLIGUNGSBESCHEID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbfrageBewilligungsbescheid() <em>Abfrage Bewilligungsbescheid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbfrageBewilligungsbescheid()
	 * @generated
	 * @ordered
	 */
	protected boolean abfrageBewilligungsbescheid = ABFRAGE_BEWILLIGUNGSBESCHEID_EDEFAULT;

	/**
	 * This is true if the Abfrage Bewilligungsbescheid attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean abfrageBewilligungsbescheidESet;

	/**
	 * The default value of the '{@link #getBundeslandFoerderstelle() <em>Bundesland Foerderstelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundeslandFoerderstelle()
	 * @generated
	 * @ordered
	 */
	protected static final String BUNDESLAND_FOERDERSTELLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBundeslandFoerderstelle() <em>Bundesland Foerderstelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundeslandFoerderstelle()
	 * @generated
	 * @ordered
	 */
	protected String bundeslandFoerderstelle = BUNDESLAND_FOERDERSTELLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAktenzeichenBewilligungsantrag() <em>Aktenzeichen Bewilligungsantrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktenzeichenBewilligungsantrag()
	 * @generated
	 * @ordered
	 */
	protected static final String AKTENZEICHEN_BEWILLIGUNGSANTRAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAktenzeichenBewilligungsantrag() <em>Aktenzeichen Bewilligungsantrag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAktenzeichenBewilligungsantrag()
	 * @generated
	 * @ordered
	 */
	protected String aktenzeichenBewilligungsantrag = AKTENZEICHEN_BEWILLIGUNGSANTRAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getDatenschutzerklaerungSchwangerschaft() <em>Datenschutzerklaerung Schwangerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenschutzerklaerungSchwangerschaft()
	 * @generated
	 * @ordered
	 */
	protected static final String DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatenschutzerklaerungSchwangerschaft() <em>Datenschutzerklaerung Schwangerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenschutzerklaerungSchwangerschaft()
	 * @generated
	 * @ordered
	 */
	protected String datenschutzerklaerungSchwangerschaft = DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT_EDEFAULT;

	/**
	 * The default value of the '{@link #isZustimmungDatenschutzerklaerungHerbeifuehrung() <em>Zustimmung Datenschutzerklaerung Herbeifuehrung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZustimmungDatenschutzerklaerungHerbeifuehrung()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ZUSTIMMUNG_DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isZustimmungDatenschutzerklaerungHerbeifuehrung() <em>Zustimmung Datenschutzerklaerung Herbeifuehrung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isZustimmungDatenschutzerklaerungHerbeifuehrung()
	 * @generated
	 * @ordered
	 */
	protected boolean zustimmungDatenschutzerklaerungHerbeifuehrung = ZUSTIMMUNG_DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG_EDEFAULT;

	/**
	 * This is true if the Zustimmung Datenschutzerklaerung Herbeifuehrung attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean zustimmungDatenschutzerklaerungHerbeifuehrungESet;

	/**
	 * The cached value of the '{@link #getKonfigurationsfragen() <em>Konfigurationsfragen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKonfigurationsfragen()
	 * @generated
	 * @ordered
	 */
	protected KonfigurationsfragenType konfigurationsfragen;

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
	 * The cached value of the '{@link #getNichtaustragendePerson() <em>Nichtaustragende Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNichtaustragendePerson()
	 * @generated
	 * @ordered
	 */
	protected PersonendatenType nichtaustragendePerson;

	/**
	 * The cached value of the '{@link #getAngabenBankverbindung() <em>Angaben Bankverbindung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenBankverbindung()
	 * @generated
	 * @ordered
	 */
	protected BankverbindungType angabenBankverbindung;

	/**
	 * The cached value of the '{@link #getNachweiseBerechnungZuwendung() <em>Nachweise Berechnung Zuwendung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweiseBerechnungZuwendung()
	 * @generated
	 * @ordered
	 */
	protected NachweiseBerechnungZuwendungType nachweiseBerechnungZuwendung;

	/**
	 * The cached value of the '{@link #getEinwilligungenAuszahlungsantrag() <em>Einwilligungen Auszahlungsantrag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinwilligungenAuszahlungsantrag()
	 * @generated
	 * @ordered
	 */
	protected EinwilligungenAuszahlungsantragType einwilligungenAuszahlungsantrag;

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
	protected AuszahlungsantragTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.AUSZAHLUNGSANTRAG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbfrageBewilligungsbescheid() {
		return abfrageBewilligungsbescheid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbfrageBewilligungsbescheid(boolean newAbfrageBewilligungsbescheid) {
		boolean oldAbfrageBewilligungsbescheid = abfrageBewilligungsbescheid;
		abfrageBewilligungsbescheid = newAbfrageBewilligungsbescheid;
		boolean oldAbfrageBewilligungsbescheidESet = abfrageBewilligungsbescheidESet;
		abfrageBewilligungsbescheidESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ABFRAGE_BEWILLIGUNGSBESCHEID, oldAbfrageBewilligungsbescheid, abfrageBewilligungsbescheid, !oldAbfrageBewilligungsbescheidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAbfrageBewilligungsbescheid() {
		boolean oldAbfrageBewilligungsbescheid = abfrageBewilligungsbescheid;
		boolean oldAbfrageBewilligungsbescheidESet = abfrageBewilligungsbescheidESet;
		abfrageBewilligungsbescheid = ABFRAGE_BEWILLIGUNGSBESCHEID_EDEFAULT;
		abfrageBewilligungsbescheidESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ABFRAGE_BEWILLIGUNGSBESCHEID, oldAbfrageBewilligungsbescheid, ABFRAGE_BEWILLIGUNGSBESCHEID_EDEFAULT, oldAbfrageBewilligungsbescheidESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAbfrageBewilligungsbescheid() {
		return abfrageBewilligungsbescheidESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBundeslandFoerderstelle() {
		return bundeslandFoerderstelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBundeslandFoerderstelle(String newBundeslandFoerderstelle) {
		String oldBundeslandFoerderstelle = bundeslandFoerderstelle;
		bundeslandFoerderstelle = newBundeslandFoerderstelle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__BUNDESLAND_FOERDERSTELLE, oldBundeslandFoerderstelle, bundeslandFoerderstelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAktenzeichenBewilligungsantrag() {
		return aktenzeichenBewilligungsantrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAktenzeichenBewilligungsantrag(String newAktenzeichenBewilligungsantrag) {
		String oldAktenzeichenBewilligungsantrag = aktenzeichenBewilligungsantrag;
		aktenzeichenBewilligungsantrag = newAktenzeichenBewilligungsantrag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__AKTENZEICHEN_BEWILLIGUNGSANTRAG, oldAktenzeichenBewilligungsantrag, aktenzeichenBewilligungsantrag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatenschutzerklaerungSchwangerschaft() {
		return datenschutzerklaerungSchwangerschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatenschutzerklaerungSchwangerschaft(String newDatenschutzerklaerungSchwangerschaft) {
		String oldDatenschutzerklaerungSchwangerschaft = datenschutzerklaerungSchwangerschaft;
		datenschutzerklaerungSchwangerschaft = newDatenschutzerklaerungSchwangerschaft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT, oldDatenschutzerklaerungSchwangerschaft, datenschutzerklaerungSchwangerschaft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isZustimmungDatenschutzerklaerungHerbeifuehrung() {
		return zustimmungDatenschutzerklaerungHerbeifuehrung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZustimmungDatenschutzerklaerungHerbeifuehrung(boolean newZustimmungDatenschutzerklaerungHerbeifuehrung) {
		boolean oldZustimmungDatenschutzerklaerungHerbeifuehrung = zustimmungDatenschutzerklaerungHerbeifuehrung;
		zustimmungDatenschutzerklaerungHerbeifuehrung = newZustimmungDatenschutzerklaerungHerbeifuehrung;
		boolean oldZustimmungDatenschutzerklaerungHerbeifuehrungESet = zustimmungDatenschutzerklaerungHerbeifuehrungESet;
		zustimmungDatenschutzerklaerungHerbeifuehrungESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ZUSTIMMUNG_DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG, oldZustimmungDatenschutzerklaerungHerbeifuehrung, zustimmungDatenschutzerklaerungHerbeifuehrung, !oldZustimmungDatenschutzerklaerungHerbeifuehrungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetZustimmungDatenschutzerklaerungHerbeifuehrung() {
		boolean oldZustimmungDatenschutzerklaerungHerbeifuehrung = zustimmungDatenschutzerklaerungHerbeifuehrung;
		boolean oldZustimmungDatenschutzerklaerungHerbeifuehrungESet = zustimmungDatenschutzerklaerungHerbeifuehrungESet;
		zustimmungDatenschutzerklaerungHerbeifuehrung = ZUSTIMMUNG_DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG_EDEFAULT;
		zustimmungDatenschutzerklaerungHerbeifuehrungESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ZUSTIMMUNG_DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG, oldZustimmungDatenschutzerklaerungHerbeifuehrung, ZUSTIMMUNG_DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG_EDEFAULT, oldZustimmungDatenschutzerklaerungHerbeifuehrungESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetZustimmungDatenschutzerklaerungHerbeifuehrung() {
		return zustimmungDatenschutzerklaerungHerbeifuehrungESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KonfigurationsfragenType getKonfigurationsfragen() {
		return konfigurationsfragen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKonfigurationsfragen(KonfigurationsfragenType newKonfigurationsfragen, NotificationChain msgs) {
		KonfigurationsfragenType oldKonfigurationsfragen = konfigurationsfragen;
		konfigurationsfragen = newKonfigurationsfragen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN, oldKonfigurationsfragen, newKonfigurationsfragen);
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
	public void setKonfigurationsfragen(KonfigurationsfragenType newKonfigurationsfragen) {
		if (newKonfigurationsfragen != konfigurationsfragen) {
			NotificationChain msgs = null;
			if (konfigurationsfragen != null)
				msgs = ((InternalEObject)konfigurationsfragen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN, null, msgs);
			if (newKonfigurationsfragen != null)
				msgs = ((InternalEObject)newKonfigurationsfragen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN, null, msgs);
			msgs = basicSetKonfigurationsfragen(newKonfigurationsfragen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN, newKonfigurationsfragen, newKonfigurationsfragen));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON, oldAntragstellendePerson, newAntragstellendePerson);
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
				msgs = ((InternalEObject)antragstellendePerson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON, null, msgs);
			if (newAntragstellendePerson != null)
				msgs = ((InternalEObject)newAntragstellendePerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON, null, msgs);
			msgs = basicSetAntragstellendePerson(newAntragstellendePerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON, newAntragstellendePerson, newAntragstellendePerson));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON, oldNichtaustragendePerson, newNichtaustragendePerson);
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
				msgs = ((InternalEObject)nichtaustragendePerson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON, null, msgs);
			if (newNichtaustragendePerson != null)
				msgs = ((InternalEObject)newNichtaustragendePerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON, null, msgs);
			msgs = basicSetNichtaustragendePerson(newNichtaustragendePerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON, newNichtaustragendePerson, newNichtaustragendePerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BankverbindungType getAngabenBankverbindung() {
		return angabenBankverbindung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenBankverbindung(BankverbindungType newAngabenBankverbindung, NotificationChain msgs) {
		BankverbindungType oldAngabenBankverbindung = angabenBankverbindung;
		angabenBankverbindung = newAngabenBankverbindung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ANGABEN_BANKVERBINDUNG, oldAngabenBankverbindung, newAngabenBankverbindung);
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
	public void setAngabenBankverbindung(BankverbindungType newAngabenBankverbindung) {
		if (newAngabenBankverbindung != angabenBankverbindung) {
			NotificationChain msgs = null;
			if (angabenBankverbindung != null)
				msgs = ((InternalEObject)angabenBankverbindung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ANGABEN_BANKVERBINDUNG, null, msgs);
			if (newAngabenBankverbindung != null)
				msgs = ((InternalEObject)newAngabenBankverbindung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ANGABEN_BANKVERBINDUNG, null, msgs);
			msgs = basicSetAngabenBankverbindung(newAngabenBankverbindung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ANGABEN_BANKVERBINDUNG, newAngabenBankverbindung, newAngabenBankverbindung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweiseBerechnungZuwendungType getNachweiseBerechnungZuwendung() {
		return nachweiseBerechnungZuwendung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachweiseBerechnungZuwendung(NachweiseBerechnungZuwendungType newNachweiseBerechnungZuwendung, NotificationChain msgs) {
		NachweiseBerechnungZuwendungType oldNachweiseBerechnungZuwendung = nachweiseBerechnungZuwendung;
		nachweiseBerechnungZuwendung = newNachweiseBerechnungZuwendung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__NACHWEISE_BERECHNUNG_ZUWENDUNG, oldNachweiseBerechnungZuwendung, newNachweiseBerechnungZuwendung);
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
	public void setNachweiseBerechnungZuwendung(NachweiseBerechnungZuwendungType newNachweiseBerechnungZuwendung) {
		if (newNachweiseBerechnungZuwendung != nachweiseBerechnungZuwendung) {
			NotificationChain msgs = null;
			if (nachweiseBerechnungZuwendung != null)
				msgs = ((InternalEObject)nachweiseBerechnungZuwendung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__NACHWEISE_BERECHNUNG_ZUWENDUNG, null, msgs);
			if (newNachweiseBerechnungZuwendung != null)
				msgs = ((InternalEObject)newNachweiseBerechnungZuwendung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__NACHWEISE_BERECHNUNG_ZUWENDUNG, null, msgs);
			msgs = basicSetNachweiseBerechnungZuwendung(newNachweiseBerechnungZuwendung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__NACHWEISE_BERECHNUNG_ZUWENDUNG, newNachweiseBerechnungZuwendung, newNachweiseBerechnungZuwendung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EinwilligungenAuszahlungsantragType getEinwilligungenAuszahlungsantrag() {
		return einwilligungenAuszahlungsantrag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEinwilligungenAuszahlungsantrag(EinwilligungenAuszahlungsantragType newEinwilligungenAuszahlungsantrag, NotificationChain msgs) {
		EinwilligungenAuszahlungsantragType oldEinwilligungenAuszahlungsantrag = einwilligungenAuszahlungsantrag;
		einwilligungenAuszahlungsantrag = newEinwilligungenAuszahlungsantrag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__EINWILLIGUNGEN_AUSZAHLUNGSANTRAG, oldEinwilligungenAuszahlungsantrag, newEinwilligungenAuszahlungsantrag);
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
	public void setEinwilligungenAuszahlungsantrag(EinwilligungenAuszahlungsantragType newEinwilligungenAuszahlungsantrag) {
		if (newEinwilligungenAuszahlungsantrag != einwilligungenAuszahlungsantrag) {
			NotificationChain msgs = null;
			if (einwilligungenAuszahlungsantrag != null)
				msgs = ((InternalEObject)einwilligungenAuszahlungsantrag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__EINWILLIGUNGEN_AUSZAHLUNGSANTRAG, null, msgs);
			if (newEinwilligungenAuszahlungsantrag != null)
				msgs = ((InternalEObject)newEinwilligungenAuszahlungsantrag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__EINWILLIGUNGEN_AUSZAHLUNGSANTRAG, null, msgs);
			msgs = basicSetEinwilligungenAuszahlungsantrag(newEinwilligungenAuszahlungsantrag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__EINWILLIGUNGEN_AUSZAHLUNGSANTRAG, newEinwilligungenAuszahlungsantrag, newEinwilligungenAuszahlungsantrag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN, oldBestaetigungRichtigkeitAngaben, bestaetigungRichtigkeitAngaben, !oldBestaetigungRichtigkeitAngabenESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN, oldBestaetigungRichtigkeitAngaben, BESTAETIGUNG_RICHTIGKEIT_ANGABEN_EDEFAULT, oldBestaetigungRichtigkeitAngabenESet));
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
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN:
				return basicSetKonfigurationsfragen(null, msgs);
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON:
				return basicSetAntragstellendePerson(null, msgs);
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON:
				return basicSetNichtaustragendePerson(null, msgs);
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ANGABEN_BANKVERBINDUNG:
				return basicSetAngabenBankverbindung(null, msgs);
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__NACHWEISE_BERECHNUNG_ZUWENDUNG:
				return basicSetNachweiseBerechnungZuwendung(null, msgs);
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__EINWILLIGUNGEN_AUSZAHLUNGSANTRAG:
				return basicSetEinwilligungenAuszahlungsantrag(null, msgs);
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
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ABFRAGE_BEWILLIGUNGSBESCHEID:
				return isAbfrageBewilligungsbescheid();
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__BUNDESLAND_FOERDERSTELLE:
				return getBundeslandFoerderstelle();
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__AKTENZEICHEN_BEWILLIGUNGSANTRAG:
				return getAktenzeichenBewilligungsantrag();
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT:
				return getDatenschutzerklaerungSchwangerschaft();
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ZUSTIMMUNG_DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG:
				return isZustimmungDatenschutzerklaerungHerbeifuehrung();
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN:
				return getKonfigurationsfragen();
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON:
				return getAntragstellendePerson();
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON:
				return getNichtaustragendePerson();
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ANGABEN_BANKVERBINDUNG:
				return getAngabenBankverbindung();
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__NACHWEISE_BERECHNUNG_ZUWENDUNG:
				return getNachweiseBerechnungZuwendung();
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__EINWILLIGUNGEN_AUSZAHLUNGSANTRAG:
				return getEinwilligungenAuszahlungsantrag();
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN:
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
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ABFRAGE_BEWILLIGUNGSBESCHEID:
				setAbfrageBewilligungsbescheid((Boolean)newValue);
				return;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__BUNDESLAND_FOERDERSTELLE:
				setBundeslandFoerderstelle((String)newValue);
				return;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__AKTENZEICHEN_BEWILLIGUNGSANTRAG:
				setAktenzeichenBewilligungsantrag((String)newValue);
				return;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT:
				setDatenschutzerklaerungSchwangerschaft((String)newValue);
				return;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ZUSTIMMUNG_DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG:
				setZustimmungDatenschutzerklaerungHerbeifuehrung((Boolean)newValue);
				return;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN:
				setKonfigurationsfragen((KonfigurationsfragenType)newValue);
				return;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON:
				setAntragstellendePerson((PersonendatenType)newValue);
				return;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON:
				setNichtaustragendePerson((PersonendatenType)newValue);
				return;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ANGABEN_BANKVERBINDUNG:
				setAngabenBankverbindung((BankverbindungType)newValue);
				return;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__NACHWEISE_BERECHNUNG_ZUWENDUNG:
				setNachweiseBerechnungZuwendung((NachweiseBerechnungZuwendungType)newValue);
				return;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__EINWILLIGUNGEN_AUSZAHLUNGSANTRAG:
				setEinwilligungenAuszahlungsantrag((EinwilligungenAuszahlungsantragType)newValue);
				return;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN:
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
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ABFRAGE_BEWILLIGUNGSBESCHEID:
				unsetAbfrageBewilligungsbescheid();
				return;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__BUNDESLAND_FOERDERSTELLE:
				setBundeslandFoerderstelle(BUNDESLAND_FOERDERSTELLE_EDEFAULT);
				return;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__AKTENZEICHEN_BEWILLIGUNGSANTRAG:
				setAktenzeichenBewilligungsantrag(AKTENZEICHEN_BEWILLIGUNGSANTRAG_EDEFAULT);
				return;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT:
				setDatenschutzerklaerungSchwangerschaft(DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT_EDEFAULT);
				return;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ZUSTIMMUNG_DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG:
				unsetZustimmungDatenschutzerklaerungHerbeifuehrung();
				return;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN:
				setKonfigurationsfragen((KonfigurationsfragenType)null);
				return;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON:
				setAntragstellendePerson((PersonendatenType)null);
				return;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON:
				setNichtaustragendePerson((PersonendatenType)null);
				return;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ANGABEN_BANKVERBINDUNG:
				setAngabenBankverbindung((BankverbindungType)null);
				return;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__NACHWEISE_BERECHNUNG_ZUWENDUNG:
				setNachweiseBerechnungZuwendung((NachweiseBerechnungZuwendungType)null);
				return;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__EINWILLIGUNGEN_AUSZAHLUNGSANTRAG:
				setEinwilligungenAuszahlungsantrag((EinwilligungenAuszahlungsantragType)null);
				return;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN:
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
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ABFRAGE_BEWILLIGUNGSBESCHEID:
				return isSetAbfrageBewilligungsbescheid();
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__BUNDESLAND_FOERDERSTELLE:
				return BUNDESLAND_FOERDERSTELLE_EDEFAULT == null ? bundeslandFoerderstelle != null : !BUNDESLAND_FOERDERSTELLE_EDEFAULT.equals(bundeslandFoerderstelle);
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__AKTENZEICHEN_BEWILLIGUNGSANTRAG:
				return AKTENZEICHEN_BEWILLIGUNGSANTRAG_EDEFAULT == null ? aktenzeichenBewilligungsantrag != null : !AKTENZEICHEN_BEWILLIGUNGSANTRAG_EDEFAULT.equals(aktenzeichenBewilligungsantrag);
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT:
				return DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT_EDEFAULT == null ? datenschutzerklaerungSchwangerschaft != null : !DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT_EDEFAULT.equals(datenschutzerklaerungSchwangerschaft);
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ZUSTIMMUNG_DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG:
				return isSetZustimmungDatenschutzerklaerungHerbeifuehrung();
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN:
				return konfigurationsfragen != null;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON:
				return antragstellendePerson != null;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON:
				return nichtaustragendePerson != null;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__ANGABEN_BANKVERBINDUNG:
				return angabenBankverbindung != null;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__NACHWEISE_BERECHNUNG_ZUWENDUNG:
				return nachweiseBerechnungZuwendung != null;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__EINWILLIGUNGEN_AUSZAHLUNGSANTRAG:
				return einwilligungenAuszahlungsantrag != null;
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN:
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
		result.append(" (abfrageBewilligungsbescheid: ");
		if (abfrageBewilligungsbescheidESet) result.append(abfrageBewilligungsbescheid); else result.append("<unset>");
		result.append(", bundeslandFoerderstelle: ");
		result.append(bundeslandFoerderstelle);
		result.append(", aktenzeichenBewilligungsantrag: ");
		result.append(aktenzeichenBewilligungsantrag);
		result.append(", datenschutzerklaerungSchwangerschaft: ");
		result.append(datenschutzerklaerungSchwangerschaft);
		result.append(", zustimmungDatenschutzerklaerungHerbeifuehrung: ");
		if (zustimmungDatenschutzerklaerungHerbeifuehrungESet) result.append(zustimmungDatenschutzerklaerungHerbeifuehrung); else result.append("<unset>");
		result.append(", bestaetigungRichtigkeitAngaben: ");
		if (bestaetigungRichtigkeitAngabenESet) result.append(bestaetigungRichtigkeitAngaben); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AuszahlungsantragTypeImpl
