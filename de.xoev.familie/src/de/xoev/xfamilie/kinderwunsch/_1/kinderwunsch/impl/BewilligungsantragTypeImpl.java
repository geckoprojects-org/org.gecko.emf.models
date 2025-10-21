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
import de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandType;

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AltersgrenzeType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AngabenZurBehandlungType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschPackage;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenBewilligungType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType;
import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.PersonendatenType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bewilligungsantrag Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BewilligungsantragTypeImpl#getStandortReproduktionsklinik <em>Standort Reproduktionsklinik</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BewilligungsantragTypeImpl#getBundesland <em>Bundesland</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BewilligungsantragTypeImpl#getDatenschutzerklaerungSchwangerschaft <em>Datenschutzerklaerung Schwangerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BewilligungsantragTypeImpl#getDatenschutzerklaerungherbeifuehrungSchwangerschaft <em>Datenschutzerklaerungherbeifuehrung Schwangerschaft</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BewilligungsantragTypeImpl#getKonfigurationsfragen <em>Konfigurationsfragen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BewilligungsantragTypeImpl#getFamilienstand <em>Familienstand</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BewilligungsantragTypeImpl#isGleicherHaushalt <em>Gleicher Haushalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BewilligungsantragTypeImpl#getGruendegetrennterWohnsitz <em>Gruendegetrennter Wohnsitz</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BewilligungsantragTypeImpl#getAltersgrenze <em>Altersgrenze</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BewilligungsantragTypeImpl#getArtBehandlung <em>Art Behandlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BewilligungsantragTypeImpl#getAntragstellendePerson <em>Antragstellende Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BewilligungsantragTypeImpl#getNichtaustragendePerson <em>Nichtaustragende Person</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BewilligungsantragTypeImpl#getAngabenBehandlung <em>Angaben Behandlung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BewilligungsantragTypeImpl#getFinanzierungsplan <em>Finanzierungsplan</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BewilligungsantragTypeImpl#getNachweise <em>Nachweise</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BewilligungsantragTypeImpl#getEinwilligungen <em>Einwilligungen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BewilligungsantragTypeImpl#isBestaetigungRichtigkeitAngaben <em>Bestaetigung Richtigkeit Angaben</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BewilligungsantragTypeImpl extends MinimalEObjectImpl.Container implements BewilligungsantragType {
	/**
	 * The default value of the '{@link #getStandortReproduktionsklinik() <em>Standort Reproduktionsklinik</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandortReproduktionsklinik()
	 * @generated
	 * @ordered
	 */
	protected static final String STANDORT_REPRODUKTIONSKLINIK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandortReproduktionsklinik() <em>Standort Reproduktionsklinik</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandortReproduktionsklinik()
	 * @generated
	 * @ordered
	 */
	protected String standortReproduktionsklinik = STANDORT_REPRODUKTIONSKLINIK_EDEFAULT;

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
	 * The default value of the '{@link #getDatenschutzerklaerungherbeifuehrungSchwangerschaft() <em>Datenschutzerklaerungherbeifuehrung Schwangerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenschutzerklaerungherbeifuehrungSchwangerschaft()
	 * @generated
	 * @ordered
	 */
	protected static final String DATENSCHUTZERKLAERUNGHERBEIFUEHRUNG_SCHWANGERSCHAFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatenschutzerklaerungherbeifuehrungSchwangerschaft() <em>Datenschutzerklaerungherbeifuehrung Schwangerschaft</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatenschutzerklaerungherbeifuehrungSchwangerschaft()
	 * @generated
	 * @ordered
	 */
	protected String datenschutzerklaerungherbeifuehrungSchwangerschaft = DATENSCHUTZERKLAERUNGHERBEIFUEHRUNG_SCHWANGERSCHAFT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKonfigurationsfragen() <em>Konfigurationsfragen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKonfigurationsfragen()
	 * @generated
	 * @ordered
	 */
	protected KonfigurationsfragenBewilligungType konfigurationsfragen;

	/**
	 * The cached value of the '{@link #getFamilienstand() <em>Familienstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilienstand()
	 * @generated
	 * @ordered
	 */
	protected FamilienstandType familienstand;

	/**
	 * The default value of the '{@link #isGleicherHaushalt() <em>Gleicher Haushalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGleicherHaushalt()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GLEICHER_HAUSHALT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGleicherHaushalt() <em>Gleicher Haushalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGleicherHaushalt()
	 * @generated
	 * @ordered
	 */
	protected boolean gleicherHaushalt = GLEICHER_HAUSHALT_EDEFAULT;

	/**
	 * This is true if the Gleicher Haushalt attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gleicherHaushaltESet;

	/**
	 * The default value of the '{@link #getGruendegetrennterWohnsitz() <em>Gruendegetrennter Wohnsitz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGruendegetrennterWohnsitz()
	 * @generated
	 * @ordered
	 */
	protected static final String GRUENDEGETRENNTER_WOHNSITZ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGruendegetrennterWohnsitz() <em>Gruendegetrennter Wohnsitz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGruendegetrennterWohnsitz()
	 * @generated
	 * @ordered
	 */
	protected String gruendegetrennterWohnsitz = GRUENDEGETRENNTER_WOHNSITZ_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAltersgrenze() <em>Altersgrenze</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltersgrenze()
	 * @generated
	 * @ordered
	 */
	protected AltersgrenzeType altersgrenze;

	/**
	 * The cached value of the '{@link #getArtBehandlung() <em>Art Behandlung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtBehandlung()
	 * @generated
	 * @ordered
	 */
	protected ArtDerBehandlungType artBehandlung;

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
	 * The cached value of the '{@link #getAngabenBehandlung() <em>Angaben Behandlung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngabenBehandlung()
	 * @generated
	 * @ordered
	 */
	protected AngabenZurBehandlungType angabenBehandlung;

	/**
	 * The cached value of the '{@link #getFinanzierungsplan() <em>Finanzierungsplan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinanzierungsplan()
	 * @generated
	 * @ordered
	 */
	protected FinanzierungsplanType finanzierungsplan;

	/**
	 * The cached value of the '{@link #getNachweise() <em>Nachweise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNachweise()
	 * @generated
	 * @ordered
	 */
	protected NachweiseKinderwunschType nachweise;

	/**
	 * The cached value of the '{@link #getEinwilligungen() <em>Einwilligungen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEinwilligungen()
	 * @generated
	 * @ordered
	 */
	protected EinwilligungenType einwilligungen;

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
	protected BewilligungsantragTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KinderwunschPackage.Literals.BEWILLIGUNGSANTRAG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStandortReproduktionsklinik() {
		return standortReproduktionsklinik;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStandortReproduktionsklinik(String newStandortReproduktionsklinik) {
		String oldStandortReproduktionsklinik = standortReproduktionsklinik;
		standortReproduktionsklinik = newStandortReproduktionsklinik;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__STANDORT_REPRODUKTIONSKLINIK, oldStandortReproduktionsklinik, standortReproduktionsklinik));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__BUNDESLAND, oldBundesland, newBundesland);
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
				msgs = ((InternalEObject)bundesland).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__BUNDESLAND, null, msgs);
			if (newBundesland != null)
				msgs = ((InternalEObject)newBundesland).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__BUNDESLAND, null, msgs);
			msgs = basicSetBundesland(newBundesland, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__BUNDESLAND, newBundesland, newBundesland));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT, oldDatenschutzerklaerungSchwangerschaft, datenschutzerklaerungSchwangerschaft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDatenschutzerklaerungherbeifuehrungSchwangerschaft() {
		return datenschutzerklaerungherbeifuehrungSchwangerschaft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDatenschutzerklaerungherbeifuehrungSchwangerschaft(String newDatenschutzerklaerungherbeifuehrungSchwangerschaft) {
		String oldDatenschutzerklaerungherbeifuehrungSchwangerschaft = datenschutzerklaerungherbeifuehrungSchwangerschaft;
		datenschutzerklaerungherbeifuehrungSchwangerschaft = newDatenschutzerklaerungherbeifuehrungSchwangerschaft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNGHERBEIFUEHRUNG_SCHWANGERSCHAFT, oldDatenschutzerklaerungherbeifuehrungSchwangerschaft, datenschutzerklaerungherbeifuehrungSchwangerschaft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KonfigurationsfragenBewilligungType getKonfigurationsfragen() {
		return konfigurationsfragen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKonfigurationsfragen(KonfigurationsfragenBewilligungType newKonfigurationsfragen, NotificationChain msgs) {
		KonfigurationsfragenBewilligungType oldKonfigurationsfragen = konfigurationsfragen;
		konfigurationsfragen = newKonfigurationsfragen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN, oldKonfigurationsfragen, newKonfigurationsfragen);
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
	public void setKonfigurationsfragen(KonfigurationsfragenBewilligungType newKonfigurationsfragen) {
		if (newKonfigurationsfragen != konfigurationsfragen) {
			NotificationChain msgs = null;
			if (konfigurationsfragen != null)
				msgs = ((InternalEObject)konfigurationsfragen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN, null, msgs);
			if (newKonfigurationsfragen != null)
				msgs = ((InternalEObject)newKonfigurationsfragen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN, null, msgs);
			msgs = basicSetKonfigurationsfragen(newKonfigurationsfragen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN, newKonfigurationsfragen, newKonfigurationsfragen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FamilienstandType getFamilienstand() {
		return familienstand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFamilienstand(FamilienstandType newFamilienstand, NotificationChain msgs) {
		FamilienstandType oldFamilienstand = familienstand;
		familienstand = newFamilienstand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__FAMILIENSTAND, oldFamilienstand, newFamilienstand);
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
	public void setFamilienstand(FamilienstandType newFamilienstand) {
		if (newFamilienstand != familienstand) {
			NotificationChain msgs = null;
			if (familienstand != null)
				msgs = ((InternalEObject)familienstand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__FAMILIENSTAND, null, msgs);
			if (newFamilienstand != null)
				msgs = ((InternalEObject)newFamilienstand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__FAMILIENSTAND, null, msgs);
			msgs = basicSetFamilienstand(newFamilienstand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__FAMILIENSTAND, newFamilienstand, newFamilienstand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGleicherHaushalt() {
		return gleicherHaushalt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGleicherHaushalt(boolean newGleicherHaushalt) {
		boolean oldGleicherHaushalt = gleicherHaushalt;
		gleicherHaushalt = newGleicherHaushalt;
		boolean oldGleicherHaushaltESet = gleicherHaushaltESet;
		gleicherHaushaltESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__GLEICHER_HAUSHALT, oldGleicherHaushalt, gleicherHaushalt, !oldGleicherHaushaltESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetGleicherHaushalt() {
		boolean oldGleicherHaushalt = gleicherHaushalt;
		boolean oldGleicherHaushaltESet = gleicherHaushaltESet;
		gleicherHaushalt = GLEICHER_HAUSHALT_EDEFAULT;
		gleicherHaushaltESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__GLEICHER_HAUSHALT, oldGleicherHaushalt, GLEICHER_HAUSHALT_EDEFAULT, oldGleicherHaushaltESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetGleicherHaushalt() {
		return gleicherHaushaltESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGruendegetrennterWohnsitz() {
		return gruendegetrennterWohnsitz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGruendegetrennterWohnsitz(String newGruendegetrennterWohnsitz) {
		String oldGruendegetrennterWohnsitz = gruendegetrennterWohnsitz;
		gruendegetrennterWohnsitz = newGruendegetrennterWohnsitz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__GRUENDEGETRENNTER_WOHNSITZ, oldGruendegetrennterWohnsitz, gruendegetrennterWohnsitz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AltersgrenzeType getAltersgrenze() {
		return altersgrenze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltersgrenze(AltersgrenzeType newAltersgrenze, NotificationChain msgs) {
		AltersgrenzeType oldAltersgrenze = altersgrenze;
		altersgrenze = newAltersgrenze;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ALTERSGRENZE, oldAltersgrenze, newAltersgrenze);
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
	public void setAltersgrenze(AltersgrenzeType newAltersgrenze) {
		if (newAltersgrenze != altersgrenze) {
			NotificationChain msgs = null;
			if (altersgrenze != null)
				msgs = ((InternalEObject)altersgrenze).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ALTERSGRENZE, null, msgs);
			if (newAltersgrenze != null)
				msgs = ((InternalEObject)newAltersgrenze).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ALTERSGRENZE, null, msgs);
			msgs = basicSetAltersgrenze(newAltersgrenze, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ALTERSGRENZE, newAltersgrenze, newAltersgrenze));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtDerBehandlungType getArtBehandlung() {
		return artBehandlung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtBehandlung(ArtDerBehandlungType newArtBehandlung, NotificationChain msgs) {
		ArtDerBehandlungType oldArtBehandlung = artBehandlung;
		artBehandlung = newArtBehandlung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ART_BEHANDLUNG, oldArtBehandlung, newArtBehandlung);
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
	public void setArtBehandlung(ArtDerBehandlungType newArtBehandlung) {
		if (newArtBehandlung != artBehandlung) {
			NotificationChain msgs = null;
			if (artBehandlung != null)
				msgs = ((InternalEObject)artBehandlung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ART_BEHANDLUNG, null, msgs);
			if (newArtBehandlung != null)
				msgs = ((InternalEObject)newArtBehandlung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ART_BEHANDLUNG, null, msgs);
			msgs = basicSetArtBehandlung(newArtBehandlung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ART_BEHANDLUNG, newArtBehandlung, newArtBehandlung));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON, oldAntragstellendePerson, newAntragstellendePerson);
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
				msgs = ((InternalEObject)antragstellendePerson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON, null, msgs);
			if (newAntragstellendePerson != null)
				msgs = ((InternalEObject)newAntragstellendePerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON, null, msgs);
			msgs = basicSetAntragstellendePerson(newAntragstellendePerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON, newAntragstellendePerson, newAntragstellendePerson));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON, oldNichtaustragendePerson, newNichtaustragendePerson);
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
				msgs = ((InternalEObject)nichtaustragendePerson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON, null, msgs);
			if (newNichtaustragendePerson != null)
				msgs = ((InternalEObject)newNichtaustragendePerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON, null, msgs);
			msgs = basicSetNichtaustragendePerson(newNichtaustragendePerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON, newNichtaustragendePerson, newNichtaustragendePerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenZurBehandlungType getAngabenBehandlung() {
		return angabenBehandlung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAngabenBehandlung(AngabenZurBehandlungType newAngabenBehandlung, NotificationChain msgs) {
		AngabenZurBehandlungType oldAngabenBehandlung = angabenBehandlung;
		angabenBehandlung = newAngabenBehandlung;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ANGABEN_BEHANDLUNG, oldAngabenBehandlung, newAngabenBehandlung);
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
	public void setAngabenBehandlung(AngabenZurBehandlungType newAngabenBehandlung) {
		if (newAngabenBehandlung != angabenBehandlung) {
			NotificationChain msgs = null;
			if (angabenBehandlung != null)
				msgs = ((InternalEObject)angabenBehandlung).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ANGABEN_BEHANDLUNG, null, msgs);
			if (newAngabenBehandlung != null)
				msgs = ((InternalEObject)newAngabenBehandlung).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ANGABEN_BEHANDLUNG, null, msgs);
			msgs = basicSetAngabenBehandlung(newAngabenBehandlung, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ANGABEN_BEHANDLUNG, newAngabenBehandlung, newAngabenBehandlung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinanzierungsplanType getFinanzierungsplan() {
		return finanzierungsplan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinanzierungsplan(FinanzierungsplanType newFinanzierungsplan, NotificationChain msgs) {
		FinanzierungsplanType oldFinanzierungsplan = finanzierungsplan;
		finanzierungsplan = newFinanzierungsplan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__FINANZIERUNGSPLAN, oldFinanzierungsplan, newFinanzierungsplan);
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
	public void setFinanzierungsplan(FinanzierungsplanType newFinanzierungsplan) {
		if (newFinanzierungsplan != finanzierungsplan) {
			NotificationChain msgs = null;
			if (finanzierungsplan != null)
				msgs = ((InternalEObject)finanzierungsplan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__FINANZIERUNGSPLAN, null, msgs);
			if (newFinanzierungsplan != null)
				msgs = ((InternalEObject)newFinanzierungsplan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__FINANZIERUNGSPLAN, null, msgs);
			msgs = basicSetFinanzierungsplan(newFinanzierungsplan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__FINANZIERUNGSPLAN, newFinanzierungsplan, newFinanzierungsplan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweiseKinderwunschType getNachweise() {
		return nachweise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNachweise(NachweiseKinderwunschType newNachweise, NotificationChain msgs) {
		NachweiseKinderwunschType oldNachweise = nachweise;
		nachweise = newNachweise;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__NACHWEISE, oldNachweise, newNachweise);
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
	public void setNachweise(NachweiseKinderwunschType newNachweise) {
		if (newNachweise != nachweise) {
			NotificationChain msgs = null;
			if (nachweise != null)
				msgs = ((InternalEObject)nachweise).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__NACHWEISE, null, msgs);
			if (newNachweise != null)
				msgs = ((InternalEObject)newNachweise).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__NACHWEISE, null, msgs);
			msgs = basicSetNachweise(newNachweise, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__NACHWEISE, newNachweise, newNachweise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EinwilligungenType getEinwilligungen() {
		return einwilligungen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEinwilligungen(EinwilligungenType newEinwilligungen, NotificationChain msgs) {
		EinwilligungenType oldEinwilligungen = einwilligungen;
		einwilligungen = newEinwilligungen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__EINWILLIGUNGEN, oldEinwilligungen, newEinwilligungen);
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
	public void setEinwilligungen(EinwilligungenType newEinwilligungen) {
		if (newEinwilligungen != einwilligungen) {
			NotificationChain msgs = null;
			if (einwilligungen != null)
				msgs = ((InternalEObject)einwilligungen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__EINWILLIGUNGEN, null, msgs);
			if (newEinwilligungen != null)
				msgs = ((InternalEObject)newEinwilligungen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__EINWILLIGUNGEN, null, msgs);
			msgs = basicSetEinwilligungen(newEinwilligungen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__EINWILLIGUNGEN, newEinwilligungen, newEinwilligungen));
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
			eNotify(new ENotificationImpl(this, Notification.SET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN, oldBestaetigungRichtigkeitAngaben, bestaetigungRichtigkeitAngaben, !oldBestaetigungRichtigkeitAngabenESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN, oldBestaetigungRichtigkeitAngaben, BESTAETIGUNG_RICHTIGKEIT_ANGABEN_EDEFAULT, oldBestaetigungRichtigkeitAngabenESet));
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
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__BUNDESLAND:
				return basicSetBundesland(null, msgs);
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN:
				return basicSetKonfigurationsfragen(null, msgs);
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__FAMILIENSTAND:
				return basicSetFamilienstand(null, msgs);
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ALTERSGRENZE:
				return basicSetAltersgrenze(null, msgs);
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ART_BEHANDLUNG:
				return basicSetArtBehandlung(null, msgs);
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON:
				return basicSetAntragstellendePerson(null, msgs);
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON:
				return basicSetNichtaustragendePerson(null, msgs);
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ANGABEN_BEHANDLUNG:
				return basicSetAngabenBehandlung(null, msgs);
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__FINANZIERUNGSPLAN:
				return basicSetFinanzierungsplan(null, msgs);
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__NACHWEISE:
				return basicSetNachweise(null, msgs);
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__EINWILLIGUNGEN:
				return basicSetEinwilligungen(null, msgs);
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
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__STANDORT_REPRODUKTIONSKLINIK:
				return getStandortReproduktionsklinik();
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__BUNDESLAND:
				return getBundesland();
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT:
				return getDatenschutzerklaerungSchwangerschaft();
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNGHERBEIFUEHRUNG_SCHWANGERSCHAFT:
				return getDatenschutzerklaerungherbeifuehrungSchwangerschaft();
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN:
				return getKonfigurationsfragen();
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__FAMILIENSTAND:
				return getFamilienstand();
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__GLEICHER_HAUSHALT:
				return isGleicherHaushalt();
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__GRUENDEGETRENNTER_WOHNSITZ:
				return getGruendegetrennterWohnsitz();
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ALTERSGRENZE:
				return getAltersgrenze();
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ART_BEHANDLUNG:
				return getArtBehandlung();
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON:
				return getAntragstellendePerson();
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON:
				return getNichtaustragendePerson();
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ANGABEN_BEHANDLUNG:
				return getAngabenBehandlung();
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__FINANZIERUNGSPLAN:
				return getFinanzierungsplan();
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__NACHWEISE:
				return getNachweise();
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__EINWILLIGUNGEN:
				return getEinwilligungen();
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN:
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
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__STANDORT_REPRODUKTIONSKLINIK:
				setStandortReproduktionsklinik((String)newValue);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__BUNDESLAND:
				setBundesland((CodeBundeslandType)newValue);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT:
				setDatenschutzerklaerungSchwangerschaft((String)newValue);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNGHERBEIFUEHRUNG_SCHWANGERSCHAFT:
				setDatenschutzerklaerungherbeifuehrungSchwangerschaft((String)newValue);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN:
				setKonfigurationsfragen((KonfigurationsfragenBewilligungType)newValue);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__FAMILIENSTAND:
				setFamilienstand((FamilienstandType)newValue);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__GLEICHER_HAUSHALT:
				setGleicherHaushalt((Boolean)newValue);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__GRUENDEGETRENNTER_WOHNSITZ:
				setGruendegetrennterWohnsitz((String)newValue);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ALTERSGRENZE:
				setAltersgrenze((AltersgrenzeType)newValue);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ART_BEHANDLUNG:
				setArtBehandlung((ArtDerBehandlungType)newValue);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON:
				setAntragstellendePerson((PersonendatenType)newValue);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON:
				setNichtaustragendePerson((PersonendatenType)newValue);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ANGABEN_BEHANDLUNG:
				setAngabenBehandlung((AngabenZurBehandlungType)newValue);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__FINANZIERUNGSPLAN:
				setFinanzierungsplan((FinanzierungsplanType)newValue);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__NACHWEISE:
				setNachweise((NachweiseKinderwunschType)newValue);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__EINWILLIGUNGEN:
				setEinwilligungen((EinwilligungenType)newValue);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN:
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
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__STANDORT_REPRODUKTIONSKLINIK:
				setStandortReproduktionsklinik(STANDORT_REPRODUKTIONSKLINIK_EDEFAULT);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__BUNDESLAND:
				setBundesland((CodeBundeslandType)null);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT:
				setDatenschutzerklaerungSchwangerschaft(DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT_EDEFAULT);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNGHERBEIFUEHRUNG_SCHWANGERSCHAFT:
				setDatenschutzerklaerungherbeifuehrungSchwangerschaft(DATENSCHUTZERKLAERUNGHERBEIFUEHRUNG_SCHWANGERSCHAFT_EDEFAULT);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN:
				setKonfigurationsfragen((KonfigurationsfragenBewilligungType)null);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__FAMILIENSTAND:
				setFamilienstand((FamilienstandType)null);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__GLEICHER_HAUSHALT:
				unsetGleicherHaushalt();
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__GRUENDEGETRENNTER_WOHNSITZ:
				setGruendegetrennterWohnsitz(GRUENDEGETRENNTER_WOHNSITZ_EDEFAULT);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ALTERSGRENZE:
				setAltersgrenze((AltersgrenzeType)null);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ART_BEHANDLUNG:
				setArtBehandlung((ArtDerBehandlungType)null);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON:
				setAntragstellendePerson((PersonendatenType)null);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON:
				setNichtaustragendePerson((PersonendatenType)null);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ANGABEN_BEHANDLUNG:
				setAngabenBehandlung((AngabenZurBehandlungType)null);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__FINANZIERUNGSPLAN:
				setFinanzierungsplan((FinanzierungsplanType)null);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__NACHWEISE:
				setNachweise((NachweiseKinderwunschType)null);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__EINWILLIGUNGEN:
				setEinwilligungen((EinwilligungenType)null);
				return;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN:
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
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__STANDORT_REPRODUKTIONSKLINIK:
				return STANDORT_REPRODUKTIONSKLINIK_EDEFAULT == null ? standortReproduktionsklinik != null : !STANDORT_REPRODUKTIONSKLINIK_EDEFAULT.equals(standortReproduktionsklinik);
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__BUNDESLAND:
				return bundesland != null;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT:
				return DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT_EDEFAULT == null ? datenschutzerklaerungSchwangerschaft != null : !DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT_EDEFAULT.equals(datenschutzerklaerungSchwangerschaft);
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNGHERBEIFUEHRUNG_SCHWANGERSCHAFT:
				return DATENSCHUTZERKLAERUNGHERBEIFUEHRUNG_SCHWANGERSCHAFT_EDEFAULT == null ? datenschutzerklaerungherbeifuehrungSchwangerschaft != null : !DATENSCHUTZERKLAERUNGHERBEIFUEHRUNG_SCHWANGERSCHAFT_EDEFAULT.equals(datenschutzerklaerungherbeifuehrungSchwangerschaft);
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN:
				return konfigurationsfragen != null;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__FAMILIENSTAND:
				return familienstand != null;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__GLEICHER_HAUSHALT:
				return isSetGleicherHaushalt();
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__GRUENDEGETRENNTER_WOHNSITZ:
				return GRUENDEGETRENNTER_WOHNSITZ_EDEFAULT == null ? gruendegetrennterWohnsitz != null : !GRUENDEGETRENNTER_WOHNSITZ_EDEFAULT.equals(gruendegetrennterWohnsitz);
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ALTERSGRENZE:
				return altersgrenze != null;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ART_BEHANDLUNG:
				return artBehandlung != null;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON:
				return antragstellendePerson != null;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON:
				return nichtaustragendePerson != null;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__ANGABEN_BEHANDLUNG:
				return angabenBehandlung != null;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__FINANZIERUNGSPLAN:
				return finanzierungsplan != null;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__NACHWEISE:
				return nachweise != null;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__EINWILLIGUNGEN:
				return einwilligungen != null;
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN:
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
		result.append(" (standortReproduktionsklinik: ");
		result.append(standortReproduktionsklinik);
		result.append(", datenschutzerklaerungSchwangerschaft: ");
		result.append(datenschutzerklaerungSchwangerschaft);
		result.append(", datenschutzerklaerungherbeifuehrungSchwangerschaft: ");
		result.append(datenschutzerklaerungherbeifuehrungSchwangerschaft);
		result.append(", gleicherHaushalt: ");
		if (gleicherHaushaltESet) result.append(gleicherHaushalt); else result.append("<unset>");
		result.append(", gruendegetrennterWohnsitz: ");
		result.append(gruendegetrennterWohnsitz);
		result.append(", bestaetigungRichtigkeitAngaben: ");
		if (bestaetigungRichtigkeitAngabenESet) result.append(bestaetigungRichtigkeitAngaben); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //BewilligungsantragTypeImpl
