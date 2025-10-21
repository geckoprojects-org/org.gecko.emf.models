/**
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

import de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KinderwunschFactoryImpl extends EFactoryImpl implements KinderwunschFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KinderwunschFactory init() {
		try {
			KinderwunschFactory theKinderwunschFactory = (KinderwunschFactory)EPackage.Registry.INSTANCE.getEFactory(KinderwunschPackage.eNS_URI);
			if (theKinderwunschFactory != null) {
				return theKinderwunschFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KinderwunschFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KinderwunschFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case KinderwunschPackage.ALTERSGRENZE_TYPE: return createAltersgrenzeType();
			case KinderwunschPackage.ANGABEN_ZUR_BEHANDLUNG_TYPE: return createAngabenZurBehandlungType();
			case KinderwunschPackage.ART_DER_BEHANDLUNG_TYPE: return createArtDerBehandlungType();
			case KinderwunschPackage.ART_NACHREICHUNG_TYPE: return createArtNachreichungType();
			case KinderwunschPackage.AUSZAHLUNGSANTRAG_TYPE: return createAuszahlungsantragType();
			case KinderwunschPackage.BEFRUCHTUNGSBEHANDLUNGEN_TYPE: return createBefruchtungsbehandlungenType();
			case KinderwunschPackage.BEWILLIGUNGSANTRAG_TYPE: return createBewilligungsantragType();
			case KinderwunschPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case KinderwunschPackage.EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE: return createEinwilligungenAuszahlungsantragType();
			case KinderwunschPackage.EINWILLIGUNGEN_TYPE: return createEinwilligungenType();
			case KinderwunschPackage.FINANZIERUNGSPLAN_TYPE: return createFinanzierungsplanType();
			case KinderwunschPackage.KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE: return createKinderwunschBewilligungsantrag1001Type();
			case KinderwunschPackage.KINDERWUNSCH_NACHREICHUNG1003_TYPE: return createKinderwunschNachreichung1003Type();
			case KinderwunschPackage.KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE: return createKinderwunschVerwendungsnachweispruefung1002Type();
			case KinderwunschPackage.KONFIGURATIONSFRAGEN_BEWILLIGUNG_TYPE: return createKonfigurationsfragenBewilligungType();
			case KinderwunschPackage.KONFIGURATIONSFRAGEN_TYPE: return createKonfigurationsfragenType();
			case KinderwunschPackage.KRANKENKASSE_TYPE: return createKrankenkasseType();
			case KinderwunschPackage.NACHREICHUNG_TYPE: return createNachreichungType();
			case KinderwunschPackage.NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE: return createNachweiseBerechnungZuwendungType();
			case KinderwunschPackage.NACHWEISE_KINDERWUNSCH_TYPE: return createNachweiseKinderwunschType();
			case KinderwunschPackage.NACHWEISE_RECHNUNGEN_TYPE: return createNachweiseRechnungenType();
			case KinderwunschPackage.NACHWEIS_TYPE: return createNachweisType();
			case KinderwunschPackage.PERSONENDATEN_TYPE: return createPersonendatenType();
			case KinderwunschPackage.VERSUCH_TYPE: return createVersuchType();
			case KinderwunschPackage.VORHERIGE_BEHANDLUNGEN_TYPE: return createVorherigeBehandlungenType();
			case KinderwunschPackage.WOHNSITZ_TYPE: return createWohnsitzType();
			case KinderwunschPackage.ZUSAETZLICHE_BETEILIGUNG_TYPE: return createZusaetzlicheBeteiligungType();
			case KinderwunschPackage.ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE: return createZuschuesseKrankenversicherungType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AltersgrenzeType createAltersgrenzeType() {
		AltersgrenzeTypeImpl altersgrenzeType = new AltersgrenzeTypeImpl();
		return altersgrenzeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AngabenZurBehandlungType createAngabenZurBehandlungType() {
		AngabenZurBehandlungTypeImpl angabenZurBehandlungType = new AngabenZurBehandlungTypeImpl();
		return angabenZurBehandlungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtDerBehandlungType createArtDerBehandlungType() {
		ArtDerBehandlungTypeImpl artDerBehandlungType = new ArtDerBehandlungTypeImpl();
		return artDerBehandlungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtNachreichungType createArtNachreichungType() {
		ArtNachreichungTypeImpl artNachreichungType = new ArtNachreichungTypeImpl();
		return artNachreichungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuszahlungsantragType createAuszahlungsantragType() {
		AuszahlungsantragTypeImpl auszahlungsantragType = new AuszahlungsantragTypeImpl();
		return auszahlungsantragType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BefruchtungsbehandlungenType createBefruchtungsbehandlungenType() {
		BefruchtungsbehandlungenTypeImpl befruchtungsbehandlungenType = new BefruchtungsbehandlungenTypeImpl();
		return befruchtungsbehandlungenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BewilligungsantragType createBewilligungsantragType() {
		BewilligungsantragTypeImpl bewilligungsantragType = new BewilligungsantragTypeImpl();
		return bewilligungsantragType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EinwilligungenAuszahlungsantragType createEinwilligungenAuszahlungsantragType() {
		EinwilligungenAuszahlungsantragTypeImpl einwilligungenAuszahlungsantragType = new EinwilligungenAuszahlungsantragTypeImpl();
		return einwilligungenAuszahlungsantragType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EinwilligungenType createEinwilligungenType() {
		EinwilligungenTypeImpl einwilligungenType = new EinwilligungenTypeImpl();
		return einwilligungenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinanzierungsplanType createFinanzierungsplanType() {
		FinanzierungsplanTypeImpl finanzierungsplanType = new FinanzierungsplanTypeImpl();
		return finanzierungsplanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KinderwunschBewilligungsantrag1001Type createKinderwunschBewilligungsantrag1001Type() {
		KinderwunschBewilligungsantrag1001TypeImpl kinderwunschBewilligungsantrag1001Type = new KinderwunschBewilligungsantrag1001TypeImpl();
		return kinderwunschBewilligungsantrag1001Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KinderwunschNachreichung1003Type createKinderwunschNachreichung1003Type() {
		KinderwunschNachreichung1003TypeImpl kinderwunschNachreichung1003Type = new KinderwunschNachreichung1003TypeImpl();
		return kinderwunschNachreichung1003Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KinderwunschVerwendungsnachweispruefung1002Type createKinderwunschVerwendungsnachweispruefung1002Type() {
		KinderwunschVerwendungsnachweispruefung1002TypeImpl kinderwunschVerwendungsnachweispruefung1002Type = new KinderwunschVerwendungsnachweispruefung1002TypeImpl();
		return kinderwunschVerwendungsnachweispruefung1002Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KonfigurationsfragenBewilligungType createKonfigurationsfragenBewilligungType() {
		KonfigurationsfragenBewilligungTypeImpl konfigurationsfragenBewilligungType = new KonfigurationsfragenBewilligungTypeImpl();
		return konfigurationsfragenBewilligungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KonfigurationsfragenType createKonfigurationsfragenType() {
		KonfigurationsfragenTypeImpl konfigurationsfragenType = new KonfigurationsfragenTypeImpl();
		return konfigurationsfragenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KrankenkasseType createKrankenkasseType() {
		KrankenkasseTypeImpl krankenkasseType = new KrankenkasseTypeImpl();
		return krankenkasseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachreichungType createNachreichungType() {
		NachreichungTypeImpl nachreichungType = new NachreichungTypeImpl();
		return nachreichungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweiseBerechnungZuwendungType createNachweiseBerechnungZuwendungType() {
		NachweiseBerechnungZuwendungTypeImpl nachweiseBerechnungZuwendungType = new NachweiseBerechnungZuwendungTypeImpl();
		return nachweiseBerechnungZuwendungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweiseKinderwunschType createNachweiseKinderwunschType() {
		NachweiseKinderwunschTypeImpl nachweiseKinderwunschType = new NachweiseKinderwunschTypeImpl();
		return nachweiseKinderwunschType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweiseRechnungenType createNachweiseRechnungenType() {
		NachweiseRechnungenTypeImpl nachweiseRechnungenType = new NachweiseRechnungenTypeImpl();
		return nachweiseRechnungenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NachweisType createNachweisType() {
		NachweisTypeImpl nachweisType = new NachweisTypeImpl();
		return nachweisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PersonendatenType createPersonendatenType() {
		PersonendatenTypeImpl personendatenType = new PersonendatenTypeImpl();
		return personendatenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VersuchType createVersuchType() {
		VersuchTypeImpl versuchType = new VersuchTypeImpl();
		return versuchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VorherigeBehandlungenType createVorherigeBehandlungenType() {
		VorherigeBehandlungenTypeImpl vorherigeBehandlungenType = new VorherigeBehandlungenTypeImpl();
		return vorherigeBehandlungenType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WohnsitzType createWohnsitzType() {
		WohnsitzTypeImpl wohnsitzType = new WohnsitzTypeImpl();
		return wohnsitzType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZusaetzlicheBeteiligungType createZusaetzlicheBeteiligungType() {
		ZusaetzlicheBeteiligungTypeImpl zusaetzlicheBeteiligungType = new ZusaetzlicheBeteiligungTypeImpl();
		return zusaetzlicheBeteiligungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZuschuesseKrankenversicherungType createZuschuesseKrankenversicherungType() {
		ZuschuesseKrankenversicherungTypeImpl zuschuesseKrankenversicherungType = new ZuschuesseKrankenversicherungTypeImpl();
		return zuschuesseKrankenversicherungType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KinderwunschPackage getKinderwunschPackage() {
		return (KinderwunschPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KinderwunschPackage getPackage() {
		return KinderwunschPackage.eINSTANCE;
	}

} //KinderwunschFactoryImpl
