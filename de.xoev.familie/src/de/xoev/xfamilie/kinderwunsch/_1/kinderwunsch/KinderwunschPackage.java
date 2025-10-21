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
package de.xoev.xfamilie.kinderwunsch._1.kinderwunsch;


import de.xoev.schemata.code.code.Code10Package;

import de.xoev.xfamilie.baukasten._1.baukasten.BaukastenPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Diese Schema-Datei enthält die technische Repräsentation der in der Norm DIN 91379 definierten Datentypen.
 * <!-- end-model-doc -->
 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = KinderwunschPackage.eNS_URI, genModel = "/model/xfamilie.genmodel", genModelSourceLocations = {"model/xfamilie.genmodel","de.xoev.familie/model/xfamilie.genmodel"}, ecore="/model/kinderwunsch.ecore", ecoreSourceLocations="/model/kinderwunsch.ecore")
public interface KinderwunschPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kinderwunsch";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.xoev.de/xfamilie/kinderwunsch/1.3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kinderwunsch";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KinderwunschPackage eINSTANCE = de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AltersgrenzeTypeImpl <em>Altersgrenze Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AltersgrenzeTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getAltersgrenzeType()
	 * @generated
	 */
	int ALTERSGRENZE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Geburtsdatum Austragenden Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERSGRENZE_TYPE__GEBURTSDATUM_AUSTRAGENDEN_PERSON = 0;

	/**
	 * The feature id for the '<em><b>Geburtsdatum Nichtaustragenden Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERSGRENZE_TYPE__GEBURTSDATUM_NICHTAUSTRAGENDEN_PERSON = 1;

	/**
	 * The feature id for the '<em><b>Keiner Kann Austragen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERSGRENZE_TYPE__KEINER_KANN_AUSTRAGEN = 2;

	/**
	 * The number of structural features of the '<em>Altersgrenze Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERSGRENZE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Altersgrenze Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERSGRENZE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AngabenZurBehandlungTypeImpl <em>Angaben Zur Behandlung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AngabenZurBehandlungTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getAngabenZurBehandlungType()
	 * @generated
	 */
	int ANGABEN_ZUR_BEHANDLUNG_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Erstantrag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUR_BEHANDLUNG_TYPE__ERSTANTRAG = 0;

	/**
	 * The feature id for the '<em><b>Aktenzeichen Vorheriger Antrag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUR_BEHANDLUNG_TYPE__AKTENZEICHEN_VORHERIGER_ANTRAG = 1;

	/**
	 * The feature id for the '<em><b>Vorherige Behandlungen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUR_BEHANDLUNG_TYPE__VORHERIGE_BEHANDLUNGEN = 2;

	/**
	 * The number of structural features of the '<em>Angaben Zur Behandlung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUR_BEHANDLUNG_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Angaben Zur Behandlung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGABEN_ZUR_BEHANDLUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ArtDerBehandlungTypeImpl <em>Art Der Behandlung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ArtDerBehandlungTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getArtDerBehandlungType()
	 * @generated
	 */
	int ART_DER_BEHANDLUNG_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Art Der Behandlung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ART_DER_BEHANDLUNG_TYPE__ART_DER_BEHANDLUNG = 0;

	/**
	 * The feature id for the '<em><b>Nummer Des Behandlungszyklus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ART_DER_BEHANDLUNG_TYPE__NUMMER_DES_BEHANDLUNGSZYKLUS = 1;

	/**
	 * The feature id for the '<em><b>Vollstaendige Durchfuehrung Behandlung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ART_DER_BEHANDLUNG_TYPE__VOLLSTAENDIGE_DURCHFUEHRUNG_BEHANDLUNG = 2;

	/**
	 * The feature id for the '<em><b>Schwangerschaft Eingetreten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ART_DER_BEHANDLUNG_TYPE__SCHWANGERSCHAFT_EINGETRETEN = 3;

	/**
	 * The feature id for the '<em><b>Nummer Behandlungszyklus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ART_DER_BEHANDLUNG_TYPE__NUMMER_BEHANDLUNGSZYKLUS = 4;

	/**
	 * The feature id for the '<em><b>Bestaetigung Behandlung Nnicht Begonnen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ART_DER_BEHANDLUNG_TYPE__BESTAETIGUNG_BEHANDLUNG_NNICHT_BEGONNEN = 5;

	/**
	 * The feature id for the '<em><b>Voraussichtlicher Behandlungsbeginn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ART_DER_BEHANDLUNG_TYPE__VORAUSSICHTLICHER_BEHANDLUNGSBEGINN = 6;

	/**
	 * The number of structural features of the '<em>Art Der Behandlung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ART_DER_BEHANDLUNG_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Art Der Behandlung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ART_DER_BEHANDLUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ArtNachreichungTypeImpl <em>Art Nachreichung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ArtNachreichungTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getArtNachreichungType()
	 * @generated
	 */
	int ART_NACHREICHUNG_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ART_NACHREICHUNG_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ART_NACHREICHUNG_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ART_NACHREICHUNG_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ART_NACHREICHUNG_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Art Nachreichung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ART_NACHREICHUNG_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Art Nachreichung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ART_NACHREICHUNG_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AuszahlungsantragTypeImpl <em>Auszahlungsantrag Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AuszahlungsantragTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getAuszahlungsantragType()
	 * @generated
	 */
	int AUSZAHLUNGSANTRAG_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Abfrage Bewilligungsbescheid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSZAHLUNGSANTRAG_TYPE__ABFRAGE_BEWILLIGUNGSBESCHEID = 0;

	/**
	 * The feature id for the '<em><b>Bundesland Foerderstelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSZAHLUNGSANTRAG_TYPE__BUNDESLAND_FOERDERSTELLE = 1;

	/**
	 * The feature id for the '<em><b>Aktenzeichen Bewilligungsantrag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSZAHLUNGSANTRAG_TYPE__AKTENZEICHEN_BEWILLIGUNGSANTRAG = 2;

	/**
	 * The feature id for the '<em><b>Datenschutzerklaerung Schwangerschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSZAHLUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT = 3;

	/**
	 * The feature id for the '<em><b>Zustimmung Datenschutzerklaerung Herbeifuehrung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSZAHLUNGSANTRAG_TYPE__ZUSTIMMUNG_DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG = 4;

	/**
	 * The feature id for the '<em><b>Konfigurationsfragen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSZAHLUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN = 5;

	/**
	 * The feature id for the '<em><b>Antragstellende Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSZAHLUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON = 6;

	/**
	 * The feature id for the '<em><b>Nichtaustragende Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSZAHLUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON = 7;

	/**
	 * The feature id for the '<em><b>Angaben Bankverbindung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSZAHLUNGSANTRAG_TYPE__ANGABEN_BANKVERBINDUNG = 8;

	/**
	 * The feature id for the '<em><b>Nachweise Berechnung Zuwendung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSZAHLUNGSANTRAG_TYPE__NACHWEISE_BERECHNUNG_ZUWENDUNG = 9;

	/**
	 * The feature id for the '<em><b>Einwilligungen Auszahlungsantrag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSZAHLUNGSANTRAG_TYPE__EINWILLIGUNGEN_AUSZAHLUNGSANTRAG = 10;

	/**
	 * The feature id for the '<em><b>Bestaetigung Richtigkeit Angaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSZAHLUNGSANTRAG_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN = 11;

	/**
	 * The number of structural features of the '<em>Auszahlungsantrag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSZAHLUNGSANTRAG_TYPE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Auszahlungsantrag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSZAHLUNGSANTRAG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BefruchtungsbehandlungenTypeImpl <em>Befruchtungsbehandlungen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BefruchtungsbehandlungenTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getBefruchtungsbehandlungenType()
	 * @generated
	 */
	int BEFRUCHTUNGSBEHANDLUNGEN_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Versuch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFRUCHTUNGSBEHANDLUNGEN_TYPE__VERSUCH = 0;

	/**
	 * The number of structural features of the '<em>Befruchtungsbehandlungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFRUCHTUNGSBEHANDLUNGEN_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Befruchtungsbehandlungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFRUCHTUNGSBEHANDLUNGEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BewilligungsantragTypeImpl <em>Bewilligungsantrag Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BewilligungsantragTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getBewilligungsantragType()
	 * @generated
	 */
	int BEWILLIGUNGSANTRAG_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Standort Reproduktionsklinik</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWILLIGUNGSANTRAG_TYPE__STANDORT_REPRODUKTIONSKLINIK = 0;

	/**
	 * The feature id for the '<em><b>Bundesland</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWILLIGUNGSANTRAG_TYPE__BUNDESLAND = 1;

	/**
	 * The feature id for the '<em><b>Datenschutzerklaerung Schwangerschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWILLIGUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT = 2;

	/**
	 * The feature id for the '<em><b>Datenschutzerklaerungherbeifuehrung Schwangerschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWILLIGUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNGHERBEIFUEHRUNG_SCHWANGERSCHAFT = 3;

	/**
	 * The feature id for the '<em><b>Konfigurationsfragen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWILLIGUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN = 4;

	/**
	 * The feature id for the '<em><b>Familienstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWILLIGUNGSANTRAG_TYPE__FAMILIENSTAND = 5;

	/**
	 * The feature id for the '<em><b>Gleicher Haushalt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWILLIGUNGSANTRAG_TYPE__GLEICHER_HAUSHALT = 6;

	/**
	 * The feature id for the '<em><b>Gruendegetrennter Wohnsitz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWILLIGUNGSANTRAG_TYPE__GRUENDEGETRENNTER_WOHNSITZ = 7;

	/**
	 * The feature id for the '<em><b>Altersgrenze</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWILLIGUNGSANTRAG_TYPE__ALTERSGRENZE = 8;

	/**
	 * The feature id for the '<em><b>Art Behandlung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWILLIGUNGSANTRAG_TYPE__ART_BEHANDLUNG = 9;

	/**
	 * The feature id for the '<em><b>Antragstellende Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWILLIGUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON = 10;

	/**
	 * The feature id for the '<em><b>Nichtaustragende Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWILLIGUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON = 11;

	/**
	 * The feature id for the '<em><b>Angaben Behandlung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWILLIGUNGSANTRAG_TYPE__ANGABEN_BEHANDLUNG = 12;

	/**
	 * The feature id for the '<em><b>Finanzierungsplan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWILLIGUNGSANTRAG_TYPE__FINANZIERUNGSPLAN = 13;

	/**
	 * The feature id for the '<em><b>Nachweise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWILLIGUNGSANTRAG_TYPE__NACHWEISE = 14;

	/**
	 * The feature id for the '<em><b>Einwilligungen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWILLIGUNGSANTRAG_TYPE__EINWILLIGUNGEN = 15;

	/**
	 * The feature id for the '<em><b>Bestaetigung Richtigkeit Angaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWILLIGUNGSANTRAG_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN = 16;

	/**
	 * The number of structural features of the '<em>Bewilligungsantrag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWILLIGUNGSANTRAG_TYPE_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Bewilligungsantrag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWILLIGUNGSANTRAG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.DocumentRootImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Kinderwunsch Bewilligungsantrag1001</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KINDERWUNSCH_BEWILLIGUNGSANTRAG1001 = 3;

	/**
	 * The feature id for the '<em><b>Kinderwunsch Nachreichung1003</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KINDERWUNSCH_NACHREICHUNG1003 = 4;

	/**
	 * The feature id for the '<em><b>Kinderwunsch Verwendungsnachweispruefung1002</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002 = 5;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.EinwilligungenAuszahlungsantragTypeImpl <em>Einwilligungen Auszahlungsantrag Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.EinwilligungenAuszahlungsantragTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getEinwilligungenAuszahlungsantragType()
	 * @generated
	 */
	int EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Zustimmung Datenschutz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE__ZUSTIMMUNG_DATENSCHUTZ = 0;

	/**
	 * The feature id for the '<em><b>Elektronische Bescheidzustellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE__ELEKTRONISCHE_BESCHEIDZUSTELLUNG = 1;

	/**
	 * The number of structural features of the '<em>Einwilligungen Auszahlungsantrag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Einwilligungen Auszahlungsantrag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.EinwilligungenTypeImpl <em>Einwilligungen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.EinwilligungenTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getEinwilligungenType()
	 * @generated
	 */
	int EINWILLIGUNGEN_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Einwilligung Zur Auskunftseinholung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINWILLIGUNGEN_TYPE__EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG = 0;

	/**
	 * The feature id for the '<em><b>Einwilligung Zur Auskunftseinholung Einschraenkungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINWILLIGUNGEN_TYPE__EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG_EINSCHRAENKUNGEN = 1;

	/**
	 * The feature id for the '<em><b>Entbindung Schweigepflicht Der Aerzte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINWILLIGUNGEN_TYPE__ENTBINDUNG_SCHWEIGEPFLICHT_DER_AERZTE = 2;

	/**
	 * The feature id for the '<em><b>Einwilligung Kostenuebernahmeregelung Behandlungsabbruch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINWILLIGUNGEN_TYPE__EINWILLIGUNG_KOSTENUEBERNAHMEREGELUNG_BEHANDLUNGSABBRUCH = 3;

	/**
	 * The feature id for the '<em><b>Datenschutzerklaerung Herbeifuehrung Schwangerschaft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINWILLIGUNGEN_TYPE__DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG_SCHWANGERSCHAFT = 4;

	/**
	 * The number of structural features of the '<em>Einwilligungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINWILLIGUNGEN_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Einwilligungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EINWILLIGUNGEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.FinanzierungsplanTypeImpl <em>Finanzierungsplan Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.FinanzierungsplanTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getFinanzierungsplanType()
	 * @generated
	 */
	int FINANZIERUNGSPLAN_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Gesamtkosten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANZIERUNGSPLAN_TYPE__GESAMTKOSTEN = 0;

	/**
	 * The feature id for the '<em><b>Voraussichtliche Erstattung Gesetzliche Krankenkasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_GESETZLICHE_KRANKENKASSE = 1;

	/**
	 * The feature id for the '<em><b>Voraussichtliche Erstattung Private Krankenkasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_PRIVATE_KRANKENKASSE = 2;

	/**
	 * The feature id for the '<em><b>Voraussichtliche Erstattung Beihilfe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_BEIHILFE = 3;

	/**
	 * The feature id for the '<em><b>Voraussichtliche Erstattung Heilfuersorge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_HEILFUERSORGE = 4;

	/**
	 * The feature id for the '<em><b>Verbleibender Eigenanteil Selbstkostenanteil</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANZIERUNGSPLAN_TYPE__VERBLEIBENDER_EIGENANTEIL_SELBSTKOSTENANTEIL = 5;

	/**
	 * The feature id for the '<em><b>Zuwendungen Gesamt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANZIERUNGSPLAN_TYPE__ZUWENDUNGEN_GESAMT = 6;

	/**
	 * The number of structural features of the '<em>Finanzierungsplan Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANZIERUNGSPLAN_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Finanzierungsplan Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINANZIERUNGSPLAN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschBewilligungsantrag1001TypeImpl <em>Bewilligungsantrag1001 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschBewilligungsantrag1001TypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getKinderwunschBewilligungsantrag1001Type()
	 * @generated
	 */
	int KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE__NACHRICHTENKOPF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE__PRODUKT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE__PRODUKTHERSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE__PRODUKTVERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE__STANDARD = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE__TEST = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE__VERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE__TRANSAKTIONSID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID;

	/**
	 * The feature id for the '<em><b>Bewilligungsantrag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE__BEWILLIGUNGSANTRAG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bewilligungsantrag1001 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE_FEATURE_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bewilligungsantrag1001 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE_OPERATION_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschNachreichung1003TypeImpl <em>Nachreichung1003 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschNachreichung1003TypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getKinderwunschNachreichung1003Type()
	 * @generated
	 */
	int KINDERWUNSCH_NACHREICHUNG1003_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_NACHREICHUNG1003_TYPE__NACHRICHTENKOPF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_NACHREICHUNG1003_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_NACHREICHUNG1003_TYPE__PRODUKT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_NACHREICHUNG1003_TYPE__PRODUKTHERSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_NACHREICHUNG1003_TYPE__PRODUKTVERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_NACHREICHUNG1003_TYPE__STANDARD = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_NACHREICHUNG1003_TYPE__TEST = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_NACHREICHUNG1003_TYPE__VERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_NACHREICHUNG1003_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_NACHREICHUNG1003_TYPE__TRANSAKTIONSID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID;

	/**
	 * The feature id for the '<em><b>Bundesland</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_NACHREICHUNG1003_TYPE__BUNDESLAND = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bearbeitungsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_NACHREICHUNG1003_TYPE__BEARBEITUNGSNUMMER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nichtaustragende Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_NACHREICHUNG1003_TYPE__NICHTAUSTRAGENDE_PERSON = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Antragstellende Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_NACHREICHUNG1003_TYPE__ANTRAGSTELLENDE_PERSON = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Nachreichung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_NACHREICHUNG1003_TYPE__NACHREICHUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Datenschutzerklaerung Der Foerderstelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_NACHREICHUNG1003_TYPE__DATENSCHUTZERKLAERUNG_DER_FOERDERSTELLE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bestaetigung Richtigkeit Angaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_NACHREICHUNG1003_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Nachreichung1003 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_NACHREICHUNG1003_TYPE_FEATURE_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Nachreichung1003 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_NACHREICHUNG1003_TYPE_OPERATION_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschVerwendungsnachweispruefung1002TypeImpl <em>Verwendungsnachweispruefung1002 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschVerwendungsnachweispruefung1002TypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getKinderwunschVerwendungsnachweispruefung1002Type()
	 * @generated
	 */
	int KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE__NACHRICHTENKOPF = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE__ZUSATZPARAMETERGRUPPE = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE__PRODUKT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE__PRODUKTHERSTELLER = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE__PRODUKTVERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE__STANDARD = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE__TEST = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE__VERSION = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE__TRANSAKTIONSID = BaukastenPackage.ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID;

	/**
	 * The feature id for the '<em><b>Auszahlungsantrag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE__AUSZAHLUNGSANTRAG = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Verwendungsnachweispruefung1002 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE_FEATURE_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Verwendungsnachweispruefung1002 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE_OPERATION_COUNT = BaukastenPackage.ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KonfigurationsfragenBewilligungTypeImpl <em>Konfigurationsfragen Bewilligung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KonfigurationsfragenBewilligungTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getKonfigurationsfragenBewilligungType()
	 * @generated
	 */
	int KONFIGURATIONSFRAGEN_BEWILLIGUNG_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Gleicher Haushalt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONFIGURATIONSFRAGEN_BEWILLIGUNG_TYPE__GLEICHER_HAUSHALT = 0;

	/**
	 * The number of structural features of the '<em>Konfigurationsfragen Bewilligung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONFIGURATIONSFRAGEN_BEWILLIGUNG_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Konfigurationsfragen Bewilligung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONFIGURATIONSFRAGEN_BEWILLIGUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KonfigurationsfragenTypeImpl <em>Konfigurationsfragen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KonfigurationsfragenTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getKonfigurationsfragenType()
	 * @generated
	 */
	int KONFIGURATIONSFRAGEN_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Gleicher Haushalt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONFIGURATIONSFRAGEN_TYPE__GLEICHER_HAUSHALT = 0;

	/**
	 * The feature id for the '<em><b>Angaben Zur Behandlung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONFIGURATIONSFRAGEN_TYPE__ANGABEN_ZUR_BEHANDLUNG = 1;

	/**
	 * The number of structural features of the '<em>Konfigurationsfragen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONFIGURATIONSFRAGEN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Konfigurationsfragen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONFIGURATIONSFRAGEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KrankenkasseTypeImpl <em>Krankenkasse Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KrankenkasseTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getKrankenkasseType()
	 * @generated
	 */
	int KRANKENKASSE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Art Krankenkasse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENKASSE_TYPE__ART_KRANKENKASSE = 0;

	/**
	 * The feature id for the '<em><b>Name Krankenkasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENKASSE_TYPE__NAME_KRANKENKASSE = 1;

	/**
	 * The feature id for the '<em><b>Name Beihilfestelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENKASSE_TYPE__NAME_BEIHILFESTELLE = 2;

	/**
	 * The feature id for the '<em><b>Name Heilfuersorge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENKASSE_TYPE__NAME_HEILFUERSORGE = 3;

	/**
	 * The number of structural features of the '<em>Krankenkasse Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENKASSE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Krankenkasse Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRANKENKASSE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachreichungTypeImpl <em>Nachreichung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachreichungTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getNachreichungType()
	 * @generated
	 */
	int NACHREICHUNG_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Art Nachreichung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHREICHUNG_TYPE__ART_NACHREICHUNG = 0;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHREICHUNG_TYPE__NACHWEIS = 1;

	/**
	 * The feature id for the '<em><b>Einwilligung Datenverarbeitung Durch Foerderstelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHREICHUNG_TYPE__EINWILLIGUNG_DATENVERARBEITUNG_DURCH_FOERDERSTELLE = 2;

	/**
	 * The number of structural features of the '<em>Nachreichung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHREICHUNG_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Nachreichung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHREICHUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseBerechnungZuwendungTypeImpl <em>Nachweise Berechnung Zuwendung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseBerechnungZuwendungTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getNachweiseBerechnungZuwendungType()
	 * @generated
	 */
	int NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Negativbescheinigung Versicherung Kostentraeger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER = 0;

	/**
	 * The feature id for the '<em><b>Zuschuesse Krankenversicherung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__ZUSCHUESSE_KRANKENVERSICHERUNG = 1;

	/**
	 * The number of structural features of the '<em>Nachweise Berechnung Zuwendung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Nachweise Berechnung Zuwendung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseKinderwunschTypeImpl <em>Nachweise Kinderwunsch Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseKinderwunschTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getNachweiseKinderwunschType()
	 * @generated
	 */
	int NACHWEISE_KINDERWUNSCH_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Nachweis Aktueller Wohnsitz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_AKTUELLER_WOHNSITZ = 0;

	/**
	 * The feature id for the '<em><b>Nachweis Eheurkunde</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_EHEURKUNDE = 1;

	/**
	 * The feature id for the '<em><b>Dauer Angelegte Partnerschaft</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_KINDERWUNSCH_TYPE__DAUER_ANGELEGTE_PARTNERSCHAFT = 2;

	/**
	 * The feature id for the '<em><b>Kostenuebernahmeerklaerung Negativbescheid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_KINDERWUNSCH_TYPE__KOSTENUEBERNAHMEERKLAERUNG_NEGATIVBESCHEID = 3;

	/**
	 * The feature id for the '<em><b>Notwendigkeitsbescheinigung Des Arztes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_KINDERWUNSCH_TYPE__NOTWENDIGKEITSBESCHEINIGUNG_DES_ARZTES = 4;

	/**
	 * The feature id for the '<em><b>Behandlungsplan Kostenvoranschlag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_KINDERWUNSCH_TYPE__BEHANDLUNGSPLAN_KOSTENVORANSCHLAG = 5;

	/**
	 * The feature id for the '<em><b>Erklaerung Reproduktionseinrichtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_KINDERWUNSCH_TYPE__ERKLAERUNG_REPRODUKTIONSEINRICHTUNG = 6;

	/**
	 * The number of structural features of the '<em>Nachweise Kinderwunsch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_KINDERWUNSCH_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Nachweise Kinderwunsch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_KINDERWUNSCH_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseRechnungenTypeImpl <em>Nachweise Rechnungen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseRechnungenTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getNachweiseRechnungenType()
	 * @generated
	 */
	int NACHWEISE_RECHNUNGEN_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Rechnungsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_RECHNUNGEN_TYPE__RECHNUNGSDATUM = 0;

	/**
	 * The feature id for the '<em><b>Rechnungssteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_RECHNUNGEN_TYPE__RECHNUNGSSTELLER = 1;

	/**
	 * The feature id for the '<em><b>Betrag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_RECHNUNGEN_TYPE__BETRAG = 2;

	/**
	 * The feature id for the '<em><b>Summe Gesamtkosten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_RECHNUNGEN_TYPE__SUMME_GESAMTKOSTEN = 3;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_RECHNUNGEN_TYPE__NACHWEIS = 4;

	/**
	 * The number of structural features of the '<em>Nachweise Rechnungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_RECHNUNGEN_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Nachweise Rechnungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISE_RECHNUNGEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweisTypeImpl <em>Nachweis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweisTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getNachweisType()
	 * @generated
	 */
	int NACHWEIS_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Nachweis Vorhanden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEIS_TYPE__NACHWEIS_VORHANDEN = 0;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEIS_TYPE__NACHWEIS = 1;

	/**
	 * The number of structural features of the '<em>Nachweis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEIS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Nachweis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.PersonendatenTypeImpl <em>Personendaten Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.PersonendatenTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getPersonendatenType()
	 * @generated
	 */
	int PERSONENDATEN_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONENDATEN_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Wohnsitz</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONENDATEN_TYPE__WOHNSITZ = 1;

	/**
	 * The feature id for the '<em><b>Krankenkasse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONENDATEN_TYPE__KRANKENKASSE = 2;

	/**
	 * The number of structural features of the '<em>Personendaten Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONENDATEN_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Personendaten Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONENDATEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.VersuchTypeImpl <em>Versuch Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.VersuchTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getVersuchType()
	 * @generated
	 */
	int VERSUCH_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Nummer Des Versuchs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSUCH_TYPE__NUMMER_DES_VERSUCHS = 0;

	/**
	 * The feature id for the '<em><b>Datum Des Versuchs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSUCH_TYPE__DATUM_DES_VERSUCHS = 1;

	/**
	 * The feature id for the '<em><b>Nachweis Vierter Versuch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSUCH_TYPE__NACHWEIS_VIERTER_VERSUCH = 2;

	/**
	 * The number of structural features of the '<em>Versuch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSUCH_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Versuch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSUCH_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.VorherigeBehandlungenTypeImpl <em>Vorherige Behandlungen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.VorherigeBehandlungenTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getVorherigeBehandlungenType()
	 * @generated
	 */
	int VORHERIGE_BEHANDLUNGEN_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Bisher Gefoerderte Behandlungen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORHERIGE_BEHANDLUNGEN_TYPE__BISHER_GEFOERDERTE_BEHANDLUNGEN = 0;

	/**
	 * The feature id for the '<em><b>Befruchtungsbehandlungen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORHERIGE_BEHANDLUNGEN_TYPE__BEFRUCHTUNGSBEHANDLUNGEN = 1;

	/**
	 * The feature id for the '<em><b>Wiederholungsversuch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORHERIGE_BEHANDLUNGEN_TYPE__WIEDERHOLUNGSVERSUCH = 2;

	/**
	 * The feature id for the '<em><b>Name Reproduktionseinrichtung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORHERIGE_BEHANDLUNGEN_TYPE__NAME_REPRODUKTIONSEINRICHTUNG = 3;

	/**
	 * The feature id for the '<em><b>Postleitzahl Reproduktionseinrichtung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORHERIGE_BEHANDLUNGEN_TYPE__POSTLEITZAHL_REPRODUKTIONSEINRICHTUNG = 4;

	/**
	 * The feature id for the '<em><b>Beratung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORHERIGE_BEHANDLUNGEN_TYPE__BERATUNG = 5;

	/**
	 * The feature id for the '<em><b>Nachweis Vierter Versuch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORHERIGE_BEHANDLUNGEN_TYPE__NACHWEIS_VIERTER_VERSUCH = 6;

	/**
	 * The number of structural features of the '<em>Vorherige Behandlungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORHERIGE_BEHANDLUNGEN_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Vorherige Behandlungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORHERIGE_BEHANDLUNGEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.WohnsitzTypeImpl <em>Wohnsitz Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.WohnsitzTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getWohnsitzType()
	 * @generated
	 */
	int WOHNSITZ_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Anschrift Inland Strassenanschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOHNSITZ_TYPE__ANSCHRIFT_INLAND_STRASSENANSCHRIFT = 0;

	/**
	 * The feature id for the '<em><b>Abweichende Adresse NPA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOHNSITZ_TYPE__ABWEICHENDE_ADRESSE_NPA = 1;

	/**
	 * The feature id for the '<em><b>Erreichbarkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOHNSITZ_TYPE__ERREICHBARKEIT = 2;

	/**
	 * The number of structural features of the '<em>Wohnsitz Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOHNSITZ_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Wohnsitz Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WOHNSITZ_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ZusaetzlicheBeteiligungTypeImpl <em>Zusaetzliche Beteiligung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ZusaetzlicheBeteiligungTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getZusaetzlicheBeteiligungType()
	 * @generated
	 */
	int ZUSAETZLICHE_BETEILIGUNG_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Zusaetzliche Beteiligung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSAETZLICHE_BETEILIGUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG = 0;

	/**
	 * The feature id for the '<em><b>Vorliegen Nachweis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSAETZLICHE_BETEILIGUNG_TYPE__VORLIEGEN_NACHWEIS = 1;

	/**
	 * The feature id for the '<em><b>Betrag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSAETZLICHE_BETEILIGUNG_TYPE__BETRAG = 2;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSAETZLICHE_BETEILIGUNG_TYPE__NACHWEIS = 3;

	/**
	 * The number of structural features of the '<em>Zusaetzliche Beteiligung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSAETZLICHE_BETEILIGUNG_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Zusaetzliche Beteiligung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSAETZLICHE_BETEILIGUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ZuschuesseKrankenversicherungTypeImpl <em>Zuschuesse Krankenversicherung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ZuschuesseKrankenversicherungTypeImpl
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getZuschuesseKrankenversicherungType()
	 * @generated
	 */
	int ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Beteiligte Krankenkassen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__BETEILIGTE_KRANKENKASSEN = 0;

	/**
	 * The feature id for the '<em><b>Negativbescheinigung Versicherung Kostentraeger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER = 1;

	/**
	 * The feature id for the '<em><b>Zusaetzliche Beteiligung GKV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_GKV = 2;

	/**
	 * The feature id for the '<em><b>Zusaetzliche Beteiligung PKV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_PKV = 3;

	/**
	 * The feature id for the '<em><b>Beteiligung Beihilfe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__BETEILIGUNG_BEIHILFE = 4;

	/**
	 * The feature id for the '<em><b>Nachweise Rechnungen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__NACHWEISE_RECHNUNGEN = 5;

	/**
	 * The number of structural features of the '<em>Zuschuesse Krankenversicherung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Zuschuesse Krankenversicherung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AltersgrenzeType <em>Altersgrenze Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Altersgrenze Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AltersgrenzeType
	 * @generated
	 */
	EClass getAltersgrenzeType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AltersgrenzeType#getGeburtsdatumAustragendenPerson <em>Geburtsdatum Austragenden Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsdatum Austragenden Person</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AltersgrenzeType#getGeburtsdatumAustragendenPerson()
	 * @see #getAltersgrenzeType()
	 * @generated
	 */
	EAttribute getAltersgrenzeType_GeburtsdatumAustragendenPerson();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AltersgrenzeType#getGeburtsdatumNichtaustragendenPerson <em>Geburtsdatum Nichtaustragenden Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsdatum Nichtaustragenden Person</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AltersgrenzeType#getGeburtsdatumNichtaustragendenPerson()
	 * @see #getAltersgrenzeType()
	 * @generated
	 */
	EAttribute getAltersgrenzeType_GeburtsdatumNichtaustragendenPerson();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AltersgrenzeType#isKeinerKannAustragen <em>Keiner Kann Austragen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keiner Kann Austragen</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AltersgrenzeType#isKeinerKannAustragen()
	 * @see #getAltersgrenzeType()
	 * @generated
	 */
	EAttribute getAltersgrenzeType_KeinerKannAustragen();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AngabenZurBehandlungType <em>Angaben Zur Behandlung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angaben Zur Behandlung Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AngabenZurBehandlungType
	 * @generated
	 */
	EClass getAngabenZurBehandlungType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AngabenZurBehandlungType#isErstantrag <em>Erstantrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Erstantrag</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AngabenZurBehandlungType#isErstantrag()
	 * @see #getAngabenZurBehandlungType()
	 * @generated
	 */
	EAttribute getAngabenZurBehandlungType_Erstantrag();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AngabenZurBehandlungType#getAktenzeichenVorherigerAntrag <em>Aktenzeichen Vorheriger Antrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aktenzeichen Vorheriger Antrag</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AngabenZurBehandlungType#getAktenzeichenVorherigerAntrag()
	 * @see #getAngabenZurBehandlungType()
	 * @generated
	 */
	EAttribute getAngabenZurBehandlungType_AktenzeichenVorherigerAntrag();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AngabenZurBehandlungType#getVorherigeBehandlungen <em>Vorherige Behandlungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vorherige Behandlungen</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AngabenZurBehandlungType#getVorherigeBehandlungen()
	 * @see #getAngabenZurBehandlungType()
	 * @generated
	 */
	EReference getAngabenZurBehandlungType_VorherigeBehandlungen();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType <em>Art Der Behandlung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Art Der Behandlung Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType
	 * @generated
	 */
	EClass getArtDerBehandlungType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#getArtDerBehandlung <em>Art Der Behandlung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Art Der Behandlung</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#getArtDerBehandlung()
	 * @see #getArtDerBehandlungType()
	 * @generated
	 */
	EAttribute getArtDerBehandlungType_ArtDerBehandlung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#getNummerDesBehandlungszyklus <em>Nummer Des Behandlungszyklus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nummer Des Behandlungszyklus</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#getNummerDesBehandlungszyklus()
	 * @see #getArtDerBehandlungType()
	 * @generated
	 */
	EAttribute getArtDerBehandlungType_NummerDesBehandlungszyklus();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#isVollstaendigeDurchfuehrungBehandlung <em>Vollstaendige Durchfuehrung Behandlung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vollstaendige Durchfuehrung Behandlung</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#isVollstaendigeDurchfuehrungBehandlung()
	 * @see #getArtDerBehandlungType()
	 * @generated
	 */
	EAttribute getArtDerBehandlungType_VollstaendigeDurchfuehrungBehandlung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#isSchwangerschaftEingetreten <em>Schwangerschaft Eingetreten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schwangerschaft Eingetreten</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#isSchwangerschaftEingetreten()
	 * @see #getArtDerBehandlungType()
	 * @generated
	 */
	EAttribute getArtDerBehandlungType_SchwangerschaftEingetreten();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#getNummerBehandlungszyklus <em>Nummer Behandlungszyklus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nummer Behandlungszyklus</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#getNummerBehandlungszyklus()
	 * @see #getArtDerBehandlungType()
	 * @generated
	 */
	EAttribute getArtDerBehandlungType_NummerBehandlungszyklus();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#isBestaetigungBehandlungNnichtBegonnen <em>Bestaetigung Behandlung Nnicht Begonnen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bestaetigung Behandlung Nnicht Begonnen</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#isBestaetigungBehandlungNnichtBegonnen()
	 * @see #getArtDerBehandlungType()
	 * @generated
	 */
	EAttribute getArtDerBehandlungType_BestaetigungBehandlungNnichtBegonnen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#getVoraussichtlicherBehandlungsbeginn <em>Voraussichtlicher Behandlungsbeginn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voraussichtlicher Behandlungsbeginn</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtDerBehandlungType#getVoraussichtlicherBehandlungsbeginn()
	 * @see #getArtDerBehandlungType()
	 * @generated
	 */
	EAttribute getArtDerBehandlungType_VoraussichtlicherBehandlungsbeginn();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtNachreichungType <em>Art Nachreichung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Art Nachreichung Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ArtNachreichungType
	 * @generated
	 */
	EClass getArtNachreichungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType <em>Auszahlungsantrag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auszahlungsantrag Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType
	 * @generated
	 */
	EClass getAuszahlungsantragType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#isAbfrageBewilligungsbescheid <em>Abfrage Bewilligungsbescheid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abfrage Bewilligungsbescheid</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#isAbfrageBewilligungsbescheid()
	 * @see #getAuszahlungsantragType()
	 * @generated
	 */
	EAttribute getAuszahlungsantragType_AbfrageBewilligungsbescheid();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getBundeslandFoerderstelle <em>Bundesland Foerderstelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bundesland Foerderstelle</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getBundeslandFoerderstelle()
	 * @see #getAuszahlungsantragType()
	 * @generated
	 */
	EAttribute getAuszahlungsantragType_BundeslandFoerderstelle();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getAktenzeichenBewilligungsantrag <em>Aktenzeichen Bewilligungsantrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aktenzeichen Bewilligungsantrag</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getAktenzeichenBewilligungsantrag()
	 * @see #getAuszahlungsantragType()
	 * @generated
	 */
	EAttribute getAuszahlungsantragType_AktenzeichenBewilligungsantrag();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getDatenschutzerklaerungSchwangerschaft <em>Datenschutzerklaerung Schwangerschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datenschutzerklaerung Schwangerschaft</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getDatenschutzerklaerungSchwangerschaft()
	 * @see #getAuszahlungsantragType()
	 * @generated
	 */
	EAttribute getAuszahlungsantragType_DatenschutzerklaerungSchwangerschaft();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#isZustimmungDatenschutzerklaerungHerbeifuehrung <em>Zustimmung Datenschutzerklaerung Herbeifuehrung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zustimmung Datenschutzerklaerung Herbeifuehrung</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#isZustimmungDatenschutzerklaerungHerbeifuehrung()
	 * @see #getAuszahlungsantragType()
	 * @generated
	 */
	EAttribute getAuszahlungsantragType_ZustimmungDatenschutzerklaerungHerbeifuehrung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getKonfigurationsfragen <em>Konfigurationsfragen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Konfigurationsfragen</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getKonfigurationsfragen()
	 * @see #getAuszahlungsantragType()
	 * @generated
	 */
	EReference getAuszahlungsantragType_Konfigurationsfragen();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getAntragstellendePerson <em>Antragstellende Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antragstellende Person</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getAntragstellendePerson()
	 * @see #getAuszahlungsantragType()
	 * @generated
	 */
	EReference getAuszahlungsantragType_AntragstellendePerson();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getNichtaustragendePerson <em>Nichtaustragende Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nichtaustragende Person</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getNichtaustragendePerson()
	 * @see #getAuszahlungsantragType()
	 * @generated
	 */
	EReference getAuszahlungsantragType_NichtaustragendePerson();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getAngabenBankverbindung <em>Angaben Bankverbindung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Bankverbindung</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getAngabenBankverbindung()
	 * @see #getAuszahlungsantragType()
	 * @generated
	 */
	EReference getAuszahlungsantragType_AngabenBankverbindung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getNachweiseBerechnungZuwendung <em>Nachweise Berechnung Zuwendung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachweise Berechnung Zuwendung</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getNachweiseBerechnungZuwendung()
	 * @see #getAuszahlungsantragType()
	 * @generated
	 */
	EReference getAuszahlungsantragType_NachweiseBerechnungZuwendung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getEinwilligungenAuszahlungsantrag <em>Einwilligungen Auszahlungsantrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Einwilligungen Auszahlungsantrag</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#getEinwilligungenAuszahlungsantrag()
	 * @see #getAuszahlungsantragType()
	 * @generated
	 */
	EReference getAuszahlungsantragType_EinwilligungenAuszahlungsantrag();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#isBestaetigungRichtigkeitAngaben <em>Bestaetigung Richtigkeit Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bestaetigung Richtigkeit Angaben</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.AuszahlungsantragType#isBestaetigungRichtigkeitAngaben()
	 * @see #getAuszahlungsantragType()
	 * @generated
	 */
	EAttribute getAuszahlungsantragType_BestaetigungRichtigkeitAngaben();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BefruchtungsbehandlungenType <em>Befruchtungsbehandlungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Befruchtungsbehandlungen Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BefruchtungsbehandlungenType
	 * @generated
	 */
	EClass getBefruchtungsbehandlungenType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BefruchtungsbehandlungenType#getVersuch <em>Versuch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versuch</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BefruchtungsbehandlungenType#getVersuch()
	 * @see #getBefruchtungsbehandlungenType()
	 * @generated
	 */
	EReference getBefruchtungsbehandlungenType_Versuch();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType <em>Bewilligungsantrag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bewilligungsantrag Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType
	 * @generated
	 */
	EClass getBewilligungsantragType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getStandortReproduktionsklinik <em>Standort Reproduktionsklinik</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standort Reproduktionsklinik</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getStandortReproduktionsklinik()
	 * @see #getBewilligungsantragType()
	 * @generated
	 */
	EAttribute getBewilligungsantragType_StandortReproduktionsklinik();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getBundesland <em>Bundesland</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bundesland</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getBundesland()
	 * @see #getBewilligungsantragType()
	 * @generated
	 */
	EReference getBewilligungsantragType_Bundesland();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getDatenschutzerklaerungSchwangerschaft <em>Datenschutzerklaerung Schwangerschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datenschutzerklaerung Schwangerschaft</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getDatenschutzerklaerungSchwangerschaft()
	 * @see #getBewilligungsantragType()
	 * @generated
	 */
	EAttribute getBewilligungsantragType_DatenschutzerklaerungSchwangerschaft();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getDatenschutzerklaerungherbeifuehrungSchwangerschaft <em>Datenschutzerklaerungherbeifuehrung Schwangerschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datenschutzerklaerungherbeifuehrung Schwangerschaft</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getDatenschutzerklaerungherbeifuehrungSchwangerschaft()
	 * @see #getBewilligungsantragType()
	 * @generated
	 */
	EAttribute getBewilligungsantragType_DatenschutzerklaerungherbeifuehrungSchwangerschaft();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getKonfigurationsfragen <em>Konfigurationsfragen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Konfigurationsfragen</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getKonfigurationsfragen()
	 * @see #getBewilligungsantragType()
	 * @generated
	 */
	EReference getBewilligungsantragType_Konfigurationsfragen();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getFamilienstand <em>Familienstand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Familienstand</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getFamilienstand()
	 * @see #getBewilligungsantragType()
	 * @generated
	 */
	EReference getBewilligungsantragType_Familienstand();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#isGleicherHaushalt <em>Gleicher Haushalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gleicher Haushalt</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#isGleicherHaushalt()
	 * @see #getBewilligungsantragType()
	 * @generated
	 */
	EAttribute getBewilligungsantragType_GleicherHaushalt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getGruendegetrennterWohnsitz <em>Gruendegetrennter Wohnsitz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gruendegetrennter Wohnsitz</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getGruendegetrennterWohnsitz()
	 * @see #getBewilligungsantragType()
	 * @generated
	 */
	EAttribute getBewilligungsantragType_GruendegetrennterWohnsitz();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getAltersgrenze <em>Altersgrenze</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Altersgrenze</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getAltersgrenze()
	 * @see #getBewilligungsantragType()
	 * @generated
	 */
	EReference getBewilligungsantragType_Altersgrenze();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getArtBehandlung <em>Art Behandlung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Art Behandlung</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getArtBehandlung()
	 * @see #getBewilligungsantragType()
	 * @generated
	 */
	EReference getBewilligungsantragType_ArtBehandlung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getAntragstellendePerson <em>Antragstellende Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antragstellende Person</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getAntragstellendePerson()
	 * @see #getBewilligungsantragType()
	 * @generated
	 */
	EReference getBewilligungsantragType_AntragstellendePerson();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getNichtaustragendePerson <em>Nichtaustragende Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nichtaustragende Person</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getNichtaustragendePerson()
	 * @see #getBewilligungsantragType()
	 * @generated
	 */
	EReference getBewilligungsantragType_NichtaustragendePerson();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getAngabenBehandlung <em>Angaben Behandlung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Behandlung</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getAngabenBehandlung()
	 * @see #getBewilligungsantragType()
	 * @generated
	 */
	EReference getBewilligungsantragType_AngabenBehandlung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getFinanzierungsplan <em>Finanzierungsplan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Finanzierungsplan</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getFinanzierungsplan()
	 * @see #getBewilligungsantragType()
	 * @generated
	 */
	EReference getBewilligungsantragType_Finanzierungsplan();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getNachweise <em>Nachweise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachweise</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getNachweise()
	 * @see #getBewilligungsantragType()
	 * @generated
	 */
	EReference getBewilligungsantragType_Nachweise();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getEinwilligungen <em>Einwilligungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Einwilligungen</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#getEinwilligungen()
	 * @see #getBewilligungsantragType()
	 * @generated
	 */
	EReference getBewilligungsantragType_Einwilligungen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#isBestaetigungRichtigkeitAngaben <em>Bestaetigung Richtigkeit Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bestaetigung Richtigkeit Angaben</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.BewilligungsantragType#isBestaetigungRichtigkeitAngaben()
	 * @see #getBewilligungsantragType()
	 * @generated
	 */
	EAttribute getBewilligungsantragType_BestaetigungRichtigkeitAngaben();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot#getKinderwunschBewilligungsantrag1001 <em>Kinderwunsch Bewilligungsantrag1001</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kinderwunsch Bewilligungsantrag1001</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot#getKinderwunschBewilligungsantrag1001()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_KinderwunschBewilligungsantrag1001();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot#getKinderwunschNachreichung1003 <em>Kinderwunsch Nachreichung1003</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kinderwunsch Nachreichung1003</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot#getKinderwunschNachreichung1003()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_KinderwunschNachreichung1003();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot#getKinderwunschVerwendungsnachweispruefung1002 <em>Kinderwunsch Verwendungsnachweispruefung1002</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kinderwunsch Verwendungsnachweispruefung1002</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.DocumentRoot#getKinderwunschVerwendungsnachweispruefung1002()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_KinderwunschVerwendungsnachweispruefung1002();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenAuszahlungsantragType <em>Einwilligungen Auszahlungsantrag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Einwilligungen Auszahlungsantrag Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenAuszahlungsantragType
	 * @generated
	 */
	EClass getEinwilligungenAuszahlungsantragType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenAuszahlungsantragType#isZustimmungDatenschutz <em>Zustimmung Datenschutz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zustimmung Datenschutz</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenAuszahlungsantragType#isZustimmungDatenschutz()
	 * @see #getEinwilligungenAuszahlungsantragType()
	 * @generated
	 */
	EAttribute getEinwilligungenAuszahlungsantragType_ZustimmungDatenschutz();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenAuszahlungsantragType#isElektronischeBescheidzustellung <em>Elektronische Bescheidzustellung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elektronische Bescheidzustellung</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenAuszahlungsantragType#isElektronischeBescheidzustellung()
	 * @see #getEinwilligungenAuszahlungsantragType()
	 * @generated
	 */
	EAttribute getEinwilligungenAuszahlungsantragType_ElektronischeBescheidzustellung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType <em>Einwilligungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Einwilligungen Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType
	 * @generated
	 */
	EClass getEinwilligungenType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEinwilligungZurAuskunftseinholung <em>Einwilligung Zur Auskunftseinholung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einwilligung Zur Auskunftseinholung</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEinwilligungZurAuskunftseinholung()
	 * @see #getEinwilligungenType()
	 * @generated
	 */
	EAttribute getEinwilligungenType_EinwilligungZurAuskunftseinholung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEinwilligungZurAuskunftseinholungEinschraenkungen <em>Einwilligung Zur Auskunftseinholung Einschraenkungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einwilligung Zur Auskunftseinholung Einschraenkungen</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEinwilligungZurAuskunftseinholungEinschraenkungen()
	 * @see #getEinwilligungenType()
	 * @generated
	 */
	EAttribute getEinwilligungenType_EinwilligungZurAuskunftseinholungEinschraenkungen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEntbindungSchweigepflichtDerAerzte <em>Entbindung Schweigepflicht Der Aerzte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entbindung Schweigepflicht Der Aerzte</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEntbindungSchweigepflichtDerAerzte()
	 * @see #getEinwilligungenType()
	 * @generated
	 */
	EAttribute getEinwilligungenType_EntbindungSchweigepflichtDerAerzte();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEinwilligungKostenuebernahmeregelungBehandlungsabbruch <em>Einwilligung Kostenuebernahmeregelung Behandlungsabbruch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einwilligung Kostenuebernahmeregelung Behandlungsabbruch</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isEinwilligungKostenuebernahmeregelungBehandlungsabbruch()
	 * @see #getEinwilligungenType()
	 * @generated
	 */
	EAttribute getEinwilligungenType_EinwilligungKostenuebernahmeregelungBehandlungsabbruch();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isDatenschutzerklaerungHerbeifuehrungSchwangerschaft <em>Datenschutzerklaerung Herbeifuehrung Schwangerschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datenschutzerklaerung Herbeifuehrung Schwangerschaft</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.EinwilligungenType#isDatenschutzerklaerungHerbeifuehrungSchwangerschaft()
	 * @see #getEinwilligungenType()
	 * @generated
	 */
	EAttribute getEinwilligungenType_DatenschutzerklaerungHerbeifuehrungSchwangerschaft();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType <em>Finanzierungsplan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finanzierungsplan Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType
	 * @generated
	 */
	EClass getFinanzierungsplanType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getGesamtkosten <em>Gesamtkosten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gesamtkosten</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getGesamtkosten()
	 * @see #getFinanzierungsplanType()
	 * @generated
	 */
	EAttribute getFinanzierungsplanType_Gesamtkosten();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getVoraussichtlicheErstattungGesetzlicheKrankenkasse <em>Voraussichtliche Erstattung Gesetzliche Krankenkasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voraussichtliche Erstattung Gesetzliche Krankenkasse</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getVoraussichtlicheErstattungGesetzlicheKrankenkasse()
	 * @see #getFinanzierungsplanType()
	 * @generated
	 */
	EAttribute getFinanzierungsplanType_VoraussichtlicheErstattungGesetzlicheKrankenkasse();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getVoraussichtlicheErstattungPrivateKrankenkasse <em>Voraussichtliche Erstattung Private Krankenkasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voraussichtliche Erstattung Private Krankenkasse</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getVoraussichtlicheErstattungPrivateKrankenkasse()
	 * @see #getFinanzierungsplanType()
	 * @generated
	 */
	EAttribute getFinanzierungsplanType_VoraussichtlicheErstattungPrivateKrankenkasse();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getVoraussichtlicheErstattungBeihilfe <em>Voraussichtliche Erstattung Beihilfe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voraussichtliche Erstattung Beihilfe</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getVoraussichtlicheErstattungBeihilfe()
	 * @see #getFinanzierungsplanType()
	 * @generated
	 */
	EAttribute getFinanzierungsplanType_VoraussichtlicheErstattungBeihilfe();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getVoraussichtlicheErstattungHeilfuersorge <em>Voraussichtliche Erstattung Heilfuersorge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Voraussichtliche Erstattung Heilfuersorge</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getVoraussichtlicheErstattungHeilfuersorge()
	 * @see #getFinanzierungsplanType()
	 * @generated
	 */
	EAttribute getFinanzierungsplanType_VoraussichtlicheErstattungHeilfuersorge();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getVerbleibenderEigenanteilSelbstkostenanteil <em>Verbleibender Eigenanteil Selbstkostenanteil</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verbleibender Eigenanteil Selbstkostenanteil</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getVerbleibenderEigenanteilSelbstkostenanteil()
	 * @see #getFinanzierungsplanType()
	 * @generated
	 */
	EAttribute getFinanzierungsplanType_VerbleibenderEigenanteilSelbstkostenanteil();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getZuwendungenGesamt <em>Zuwendungen Gesamt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zuwendungen Gesamt</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.FinanzierungsplanType#getZuwendungenGesamt()
	 * @see #getFinanzierungsplanType()
	 * @generated
	 */
	EAttribute getFinanzierungsplanType_ZuwendungenGesamt();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschBewilligungsantrag1001Type <em>Bewilligungsantrag1001 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bewilligungsantrag1001 Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschBewilligungsantrag1001Type
	 * @generated
	 */
	EClass getKinderwunschBewilligungsantrag1001Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschBewilligungsantrag1001Type#getBewilligungsantrag <em>Bewilligungsantrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bewilligungsantrag</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschBewilligungsantrag1001Type#getBewilligungsantrag()
	 * @see #getKinderwunschBewilligungsantrag1001Type()
	 * @generated
	 */
	EReference getKinderwunschBewilligungsantrag1001Type_Bewilligungsantrag();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type <em>Nachreichung1003 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachreichung1003 Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type
	 * @generated
	 */
	EClass getKinderwunschNachreichung1003Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#getBundesland <em>Bundesland</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bundesland</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#getBundesland()
	 * @see #getKinderwunschNachreichung1003Type()
	 * @generated
	 */
	EReference getKinderwunschNachreichung1003Type_Bundesland();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#getBearbeitungsnummer <em>Bearbeitungsnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bearbeitungsnummer</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#getBearbeitungsnummer()
	 * @see #getKinderwunschNachreichung1003Type()
	 * @generated
	 */
	EAttribute getKinderwunschNachreichung1003Type_Bearbeitungsnummer();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#getNichtaustragendePerson <em>Nichtaustragende Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nichtaustragende Person</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#getNichtaustragendePerson()
	 * @see #getKinderwunschNachreichung1003Type()
	 * @generated
	 */
	EReference getKinderwunschNachreichung1003Type_NichtaustragendePerson();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#getAntragstellendePerson <em>Antragstellende Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Antragstellende Person</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#getAntragstellendePerson()
	 * @see #getKinderwunschNachreichung1003Type()
	 * @generated
	 */
	EReference getKinderwunschNachreichung1003Type_AntragstellendePerson();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#getNachreichung <em>Nachreichung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachreichung</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#getNachreichung()
	 * @see #getKinderwunschNachreichung1003Type()
	 * @generated
	 */
	EReference getKinderwunschNachreichung1003Type_Nachreichung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#isDatenschutzerklaerungDerFoerderstelle <em>Datenschutzerklaerung Der Foerderstelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datenschutzerklaerung Der Foerderstelle</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#isDatenschutzerklaerungDerFoerderstelle()
	 * @see #getKinderwunschNachreichung1003Type()
	 * @generated
	 */
	EAttribute getKinderwunschNachreichung1003Type_DatenschutzerklaerungDerFoerderstelle();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#isBestaetigungRichtigkeitAngaben <em>Bestaetigung Richtigkeit Angaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bestaetigung Richtigkeit Angaben</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschNachreichung1003Type#isBestaetigungRichtigkeitAngaben()
	 * @see #getKinderwunschNachreichung1003Type()
	 * @generated
	 */
	EAttribute getKinderwunschNachreichung1003Type_BestaetigungRichtigkeitAngaben();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschVerwendungsnachweispruefung1002Type <em>Verwendungsnachweispruefung1002 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verwendungsnachweispruefung1002 Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschVerwendungsnachweispruefung1002Type
	 * @generated
	 */
	EClass getKinderwunschVerwendungsnachweispruefung1002Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschVerwendungsnachweispruefung1002Type#getAuszahlungsantrag <em>Auszahlungsantrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auszahlungsantrag</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KinderwunschVerwendungsnachweispruefung1002Type#getAuszahlungsantrag()
	 * @see #getKinderwunschVerwendungsnachweispruefung1002Type()
	 * @generated
	 */
	EReference getKinderwunschVerwendungsnachweispruefung1002Type_Auszahlungsantrag();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenBewilligungType <em>Konfigurationsfragen Bewilligung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Konfigurationsfragen Bewilligung Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenBewilligungType
	 * @generated
	 */
	EClass getKonfigurationsfragenBewilligungType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenBewilligungType#isGleicherHaushalt <em>Gleicher Haushalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gleicher Haushalt</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenBewilligungType#isGleicherHaushalt()
	 * @see #getKonfigurationsfragenBewilligungType()
	 * @generated
	 */
	EAttribute getKonfigurationsfragenBewilligungType_GleicherHaushalt();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenType <em>Konfigurationsfragen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Konfigurationsfragen Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenType
	 * @generated
	 */
	EClass getKonfigurationsfragenType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenType#isGleicherHaushalt <em>Gleicher Haushalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gleicher Haushalt</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenType#isGleicherHaushalt()
	 * @see #getKonfigurationsfragenType()
	 * @generated
	 */
	EAttribute getKonfigurationsfragenType_GleicherHaushalt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenType#getAngabenZurBehandlung <em>Angaben Zur Behandlung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angaben Zur Behandlung</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KonfigurationsfragenType#getAngabenZurBehandlung()
	 * @see #getKonfigurationsfragenType()
	 * @generated
	 */
	EReference getKonfigurationsfragenType_AngabenZurBehandlung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType <em>Krankenkasse Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Krankenkasse Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType
	 * @generated
	 */
	EClass getKrankenkasseType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType#getArtKrankenkasse <em>Art Krankenkasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Art Krankenkasse</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType#getArtKrankenkasse()
	 * @see #getKrankenkasseType()
	 * @generated
	 */
	EReference getKrankenkasseType_ArtKrankenkasse();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType#getNameKrankenkasse <em>Name Krankenkasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Krankenkasse</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType#getNameKrankenkasse()
	 * @see #getKrankenkasseType()
	 * @generated
	 */
	EAttribute getKrankenkasseType_NameKrankenkasse();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType#getNameBeihilfestelle <em>Name Beihilfestelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Beihilfestelle</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType#getNameBeihilfestelle()
	 * @see #getKrankenkasseType()
	 * @generated
	 */
	EAttribute getKrankenkasseType_NameBeihilfestelle();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType#getNameHeilfuersorge <em>Name Heilfuersorge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Heilfuersorge</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.KrankenkasseType#getNameHeilfuersorge()
	 * @see #getKrankenkasseType()
	 * @generated
	 */
	EAttribute getKrankenkasseType_NameHeilfuersorge();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachreichungType <em>Nachreichung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachreichung Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachreichungType
	 * @generated
	 */
	EClass getNachreichungType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachreichungType#getArtNachreichung <em>Art Nachreichung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Art Nachreichung</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachreichungType#getArtNachreichung()
	 * @see #getNachreichungType()
	 * @generated
	 */
	EReference getNachreichungType_ArtNachreichung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachreichungType#getNachweis <em>Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachweis</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachreichungType#getNachweis()
	 * @see #getNachreichungType()
	 * @generated
	 */
	EReference getNachreichungType_Nachweis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachreichungType#isEinwilligungDatenverarbeitungDurchFoerderstelle <em>Einwilligung Datenverarbeitung Durch Foerderstelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einwilligung Datenverarbeitung Durch Foerderstelle</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachreichungType#isEinwilligungDatenverarbeitungDurchFoerderstelle()
	 * @see #getNachreichungType()
	 * @generated
	 */
	EAttribute getNachreichungType_EinwilligungDatenverarbeitungDurchFoerderstelle();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseBerechnungZuwendungType <em>Nachweise Berechnung Zuwendung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachweise Berechnung Zuwendung Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseBerechnungZuwendungType
	 * @generated
	 */
	EClass getNachweiseBerechnungZuwendungType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseBerechnungZuwendungType#getNegativbescheinigungVersicherungKostentraeger <em>Negativbescheinigung Versicherung Kostentraeger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Negativbescheinigung Versicherung Kostentraeger</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseBerechnungZuwendungType#getNegativbescheinigungVersicherungKostentraeger()
	 * @see #getNachweiseBerechnungZuwendungType()
	 * @generated
	 */
	EReference getNachweiseBerechnungZuwendungType_NegativbescheinigungVersicherungKostentraeger();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseBerechnungZuwendungType#getZuschuesseKrankenversicherung <em>Zuschuesse Krankenversicherung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zuschuesse Krankenversicherung</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseBerechnungZuwendungType#getZuschuesseKrankenversicherung()
	 * @see #getNachweiseBerechnungZuwendungType()
	 * @generated
	 */
	EReference getNachweiseBerechnungZuwendungType_ZuschuesseKrankenversicherung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType <em>Nachweise Kinderwunsch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachweise Kinderwunsch Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType
	 * @generated
	 */
	EClass getNachweiseKinderwunschType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getNachweisAktuellerWohnsitz <em>Nachweis Aktueller Wohnsitz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachweis Aktueller Wohnsitz</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getNachweisAktuellerWohnsitz()
	 * @see #getNachweiseKinderwunschType()
	 * @generated
	 */
	EReference getNachweiseKinderwunschType_NachweisAktuellerWohnsitz();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getNachweisEheurkunde <em>Nachweis Eheurkunde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachweis Eheurkunde</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getNachweisEheurkunde()
	 * @see #getNachweiseKinderwunschType()
	 * @generated
	 */
	EReference getNachweiseKinderwunschType_NachweisEheurkunde();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getDauerAngelegtePartnerschaft <em>Dauer Angelegte Partnerschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dauer Angelegte Partnerschaft</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getDauerAngelegtePartnerschaft()
	 * @see #getNachweiseKinderwunschType()
	 * @generated
	 */
	EReference getNachweiseKinderwunschType_DauerAngelegtePartnerschaft();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getKostenuebernahmeerklaerungNegativbescheid <em>Kostenuebernahmeerklaerung Negativbescheid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kostenuebernahmeerklaerung Negativbescheid</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getKostenuebernahmeerklaerungNegativbescheid()
	 * @see #getNachweiseKinderwunschType()
	 * @generated
	 */
	EReference getNachweiseKinderwunschType_KostenuebernahmeerklaerungNegativbescheid();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getNotwendigkeitsbescheinigungDesArztes <em>Notwendigkeitsbescheinigung Des Arztes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Notwendigkeitsbescheinigung Des Arztes</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getNotwendigkeitsbescheinigungDesArztes()
	 * @see #getNachweiseKinderwunschType()
	 * @generated
	 */
	EReference getNachweiseKinderwunschType_NotwendigkeitsbescheinigungDesArztes();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getBehandlungsplanKostenvoranschlag <em>Behandlungsplan Kostenvoranschlag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behandlungsplan Kostenvoranschlag</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getBehandlungsplanKostenvoranschlag()
	 * @see #getNachweiseKinderwunschType()
	 * @generated
	 */
	EReference getNachweiseKinderwunschType_BehandlungsplanKostenvoranschlag();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getErklaerungReproduktionseinrichtung <em>Erklaerung Reproduktionseinrichtung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Erklaerung Reproduktionseinrichtung</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseKinderwunschType#getErklaerungReproduktionseinrichtung()
	 * @see #getNachweiseKinderwunschType()
	 * @generated
	 */
	EReference getNachweiseKinderwunschType_ErklaerungReproduktionseinrichtung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType <em>Nachweise Rechnungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachweise Rechnungen Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType
	 * @generated
	 */
	EClass getNachweiseRechnungenType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType#getRechnungsdatum <em>Rechnungsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rechnungsdatum</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType#getRechnungsdatum()
	 * @see #getNachweiseRechnungenType()
	 * @generated
	 */
	EAttribute getNachweiseRechnungenType_Rechnungsdatum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType#getRechnungssteller <em>Rechnungssteller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rechnungssteller</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType#getRechnungssteller()
	 * @see #getNachweiseRechnungenType()
	 * @generated
	 */
	EAttribute getNachweiseRechnungenType_Rechnungssteller();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType#getBetrag <em>Betrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Betrag</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType#getBetrag()
	 * @see #getNachweiseRechnungenType()
	 * @generated
	 */
	EAttribute getNachweiseRechnungenType_Betrag();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType#getSummeGesamtkosten <em>Summe Gesamtkosten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summe Gesamtkosten</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType#getSummeGesamtkosten()
	 * @see #getNachweiseRechnungenType()
	 * @generated
	 */
	EAttribute getNachweiseRechnungenType_SummeGesamtkosten();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType#getNachweis <em>Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachweis</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweiseRechnungenType#getNachweis()
	 * @see #getNachweiseRechnungenType()
	 * @generated
	 */
	EReference getNachweiseRechnungenType_Nachweis();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweisType <em>Nachweis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachweis Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweisType
	 * @generated
	 */
	EClass getNachweisType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweisType#isNachweisVorhanden <em>Nachweis Vorhanden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nachweis Vorhanden</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweisType#isNachweisVorhanden()
	 * @see #getNachweisType()
	 * @generated
	 */
	EAttribute getNachweisType_NachweisVorhanden();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweisType#getNachweis <em>Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachweis</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.NachweisType#getNachweis()
	 * @see #getNachweisType()
	 * @generated
	 */
	EReference getNachweisType_Nachweis();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.PersonendatenType <em>Personendaten Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personendaten Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.PersonendatenType
	 * @generated
	 */
	EClass getPersonendatenType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.PersonendatenType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.PersonendatenType#getName()
	 * @see #getPersonendatenType()
	 * @generated
	 */
	EReference getPersonendatenType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.PersonendatenType#getWohnsitz <em>Wohnsitz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wohnsitz</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.PersonendatenType#getWohnsitz()
	 * @see #getPersonendatenType()
	 * @generated
	 */
	EReference getPersonendatenType_Wohnsitz();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.PersonendatenType#getKrankenkasse <em>Krankenkasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Krankenkasse</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.PersonendatenType#getKrankenkasse()
	 * @see #getPersonendatenType()
	 * @generated
	 */
	EReference getPersonendatenType_Krankenkasse();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VersuchType <em>Versuch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versuch Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VersuchType
	 * @generated
	 */
	EClass getVersuchType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VersuchType#getNummerDesVersuchs <em>Nummer Des Versuchs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nummer Des Versuchs</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VersuchType#getNummerDesVersuchs()
	 * @see #getVersuchType()
	 * @generated
	 */
	EAttribute getVersuchType_NummerDesVersuchs();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VersuchType#getDatumDesVersuchs <em>Datum Des Versuchs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datum Des Versuchs</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VersuchType#getDatumDesVersuchs()
	 * @see #getVersuchType()
	 * @generated
	 */
	EAttribute getVersuchType_DatumDesVersuchs();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VersuchType#getNachweisVierterVersuch <em>Nachweis Vierter Versuch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachweis Vierter Versuch</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VersuchType#getNachweisVierterVersuch()
	 * @see #getVersuchType()
	 * @generated
	 */
	EReference getVersuchType_NachweisVierterVersuch();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType <em>Vorherige Behandlungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vorherige Behandlungen Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType
	 * @generated
	 */
	EClass getVorherigeBehandlungenType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#isBisherGefoerderteBehandlungen <em>Bisher Gefoerderte Behandlungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bisher Gefoerderte Behandlungen</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#isBisherGefoerderteBehandlungen()
	 * @see #getVorherigeBehandlungenType()
	 * @generated
	 */
	EAttribute getVorherigeBehandlungenType_BisherGefoerderteBehandlungen();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#getBefruchtungsbehandlungen <em>Befruchtungsbehandlungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Befruchtungsbehandlungen</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#getBefruchtungsbehandlungen()
	 * @see #getVorherigeBehandlungenType()
	 * @generated
	 */
	EReference getVorherigeBehandlungenType_Befruchtungsbehandlungen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#isWiederholungsversuch <em>Wiederholungsversuch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wiederholungsversuch</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#isWiederholungsversuch()
	 * @see #getVorherigeBehandlungenType()
	 * @generated
	 */
	EAttribute getVorherigeBehandlungenType_Wiederholungsversuch();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#getNameReproduktionseinrichtung <em>Name Reproduktionseinrichtung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Reproduktionseinrichtung</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#getNameReproduktionseinrichtung()
	 * @see #getVorherigeBehandlungenType()
	 * @generated
	 */
	EAttribute getVorherigeBehandlungenType_NameReproduktionseinrichtung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#getPostleitzahlReproduktionseinrichtung <em>Postleitzahl Reproduktionseinrichtung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postleitzahl Reproduktionseinrichtung</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#getPostleitzahlReproduktionseinrichtung()
	 * @see #getVorherigeBehandlungenType()
	 * @generated
	 */
	EAttribute getVorherigeBehandlungenType_PostleitzahlReproduktionseinrichtung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#isBeratung <em>Beratung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beratung</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#isBeratung()
	 * @see #getVorherigeBehandlungenType()
	 * @generated
	 */
	EAttribute getVorherigeBehandlungenType_Beratung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#getNachweisVierterVersuch <em>Nachweis Vierter Versuch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachweis Vierter Versuch</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.VorherigeBehandlungenType#getNachweisVierterVersuch()
	 * @see #getVorherigeBehandlungenType()
	 * @generated
	 */
	EReference getVorherigeBehandlungenType_NachweisVierterVersuch();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.WohnsitzType <em>Wohnsitz Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wohnsitz Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.WohnsitzType
	 * @generated
	 */
	EClass getWohnsitzType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.WohnsitzType#getAnschriftInlandStrassenanschrift <em>Anschrift Inland Strassenanschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift Inland Strassenanschrift</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.WohnsitzType#getAnschriftInlandStrassenanschrift()
	 * @see #getWohnsitzType()
	 * @generated
	 */
	EReference getWohnsitzType_AnschriftInlandStrassenanschrift();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.WohnsitzType#isAbweichendeAdresseNPA <em>Abweichende Adresse NPA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abweichende Adresse NPA</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.WohnsitzType#isAbweichendeAdresseNPA()
	 * @see #getWohnsitzType()
	 * @generated
	 */
	EAttribute getWohnsitzType_AbweichendeAdresseNPA();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.WohnsitzType#getErreichbarkeit <em>Erreichbarkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Erreichbarkeit</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.WohnsitzType#getErreichbarkeit()
	 * @see #getWohnsitzType()
	 * @generated
	 */
	EReference getWohnsitzType_Erreichbarkeit();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType <em>Zusaetzliche Beteiligung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zusaetzliche Beteiligung Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType
	 * @generated
	 */
	EClass getZusaetzlicheBeteiligungType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType#isZusaetzlicheBeteiligung <em>Zusaetzliche Beteiligung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zusaetzliche Beteiligung</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType#isZusaetzlicheBeteiligung()
	 * @see #getZusaetzlicheBeteiligungType()
	 * @generated
	 */
	EAttribute getZusaetzlicheBeteiligungType_ZusaetzlicheBeteiligung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType#isVorliegenNachweis <em>Vorliegen Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vorliegen Nachweis</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType#isVorliegenNachweis()
	 * @see #getZusaetzlicheBeteiligungType()
	 * @generated
	 */
	EAttribute getZusaetzlicheBeteiligungType_VorliegenNachweis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType#getBetrag <em>Betrag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Betrag</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType#getBetrag()
	 * @see #getZusaetzlicheBeteiligungType()
	 * @generated
	 */
	EAttribute getZusaetzlicheBeteiligungType_Betrag();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType#getNachweis <em>Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachweis</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZusaetzlicheBeteiligungType#getNachweis()
	 * @see #getZusaetzlicheBeteiligungType()
	 * @generated
	 */
	EReference getZusaetzlicheBeteiligungType_Nachweis();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType <em>Zuschuesse Krankenversicherung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zuschuesse Krankenversicherung Type</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType
	 * @generated
	 */
	EClass getZuschuesseKrankenversicherungType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType#getBeteiligteKrankenkassen <em>Beteiligte Krankenkassen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beteiligte Krankenkassen</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType#getBeteiligteKrankenkassen()
	 * @see #getZuschuesseKrankenversicherungType()
	 * @generated
	 */
	EAttribute getZuschuesseKrankenversicherungType_BeteiligteKrankenkassen();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType#getNegativbescheinigungVersicherungKostentraeger <em>Negativbescheinigung Versicherung Kostentraeger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Negativbescheinigung Versicherung Kostentraeger</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType#getNegativbescheinigungVersicherungKostentraeger()
	 * @see #getZuschuesseKrankenversicherungType()
	 * @generated
	 */
	EReference getZuschuesseKrankenversicherungType_NegativbescheinigungVersicherungKostentraeger();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType#getZusaetzlicheBeteiligungGKV <em>Zusaetzliche Beteiligung GKV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zusaetzliche Beteiligung GKV</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType#getZusaetzlicheBeteiligungGKV()
	 * @see #getZuschuesseKrankenversicherungType()
	 * @generated
	 */
	EReference getZuschuesseKrankenversicherungType_ZusaetzlicheBeteiligungGKV();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType#getZusaetzlicheBeteiligungPKV <em>Zusaetzliche Beteiligung PKV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zusaetzliche Beteiligung PKV</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType#getZusaetzlicheBeteiligungPKV()
	 * @see #getZuschuesseKrankenversicherungType()
	 * @generated
	 */
	EReference getZuschuesseKrankenversicherungType_ZusaetzlicheBeteiligungPKV();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType#getBeteiligungBeihilfe <em>Beteiligung Beihilfe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beteiligung Beihilfe</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType#getBeteiligungBeihilfe()
	 * @see #getZuschuesseKrankenversicherungType()
	 * @generated
	 */
	EReference getZuschuesseKrankenversicherungType_BeteiligungBeihilfe();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType#getNachweiseRechnungen <em>Nachweise Rechnungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweise Rechnungen</em>'.
	 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.ZuschuesseKrankenversicherungType#getNachweiseRechnungen()
	 * @see #getZuschuesseKrankenversicherungType()
	 * @generated
	 */
	EReference getZuschuesseKrankenversicherungType_NachweiseRechnungen();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KinderwunschFactory getKinderwunschFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AltersgrenzeTypeImpl <em>Altersgrenze Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AltersgrenzeTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getAltersgrenzeType()
		 * @generated
		 */
		EClass ALTERSGRENZE_TYPE = eINSTANCE.getAltersgrenzeType();

		/**
		 * The meta object literal for the '<em><b>Geburtsdatum Austragenden Person</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALTERSGRENZE_TYPE__GEBURTSDATUM_AUSTRAGENDEN_PERSON = eINSTANCE.getAltersgrenzeType_GeburtsdatumAustragendenPerson();

		/**
		 * The meta object literal for the '<em><b>Geburtsdatum Nichtaustragenden Person</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALTERSGRENZE_TYPE__GEBURTSDATUM_NICHTAUSTRAGENDEN_PERSON = eINSTANCE.getAltersgrenzeType_GeburtsdatumNichtaustragendenPerson();

		/**
		 * The meta object literal for the '<em><b>Keiner Kann Austragen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALTERSGRENZE_TYPE__KEINER_KANN_AUSTRAGEN = eINSTANCE.getAltersgrenzeType_KeinerKannAustragen();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AngabenZurBehandlungTypeImpl <em>Angaben Zur Behandlung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AngabenZurBehandlungTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getAngabenZurBehandlungType()
		 * @generated
		 */
		EClass ANGABEN_ZUR_BEHANDLUNG_TYPE = eINSTANCE.getAngabenZurBehandlungType();

		/**
		 * The meta object literal for the '<em><b>Erstantrag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUR_BEHANDLUNG_TYPE__ERSTANTRAG = eINSTANCE.getAngabenZurBehandlungType_Erstantrag();

		/**
		 * The meta object literal for the '<em><b>Aktenzeichen Vorheriger Antrag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGABEN_ZUR_BEHANDLUNG_TYPE__AKTENZEICHEN_VORHERIGER_ANTRAG = eINSTANCE.getAngabenZurBehandlungType_AktenzeichenVorherigerAntrag();

		/**
		 * The meta object literal for the '<em><b>Vorherige Behandlungen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGABEN_ZUR_BEHANDLUNG_TYPE__VORHERIGE_BEHANDLUNGEN = eINSTANCE.getAngabenZurBehandlungType_VorherigeBehandlungen();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ArtDerBehandlungTypeImpl <em>Art Der Behandlung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ArtDerBehandlungTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getArtDerBehandlungType()
		 * @generated
		 */
		EClass ART_DER_BEHANDLUNG_TYPE = eINSTANCE.getArtDerBehandlungType();

		/**
		 * The meta object literal for the '<em><b>Art Der Behandlung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ART_DER_BEHANDLUNG_TYPE__ART_DER_BEHANDLUNG = eINSTANCE.getArtDerBehandlungType_ArtDerBehandlung();

		/**
		 * The meta object literal for the '<em><b>Nummer Des Behandlungszyklus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ART_DER_BEHANDLUNG_TYPE__NUMMER_DES_BEHANDLUNGSZYKLUS = eINSTANCE.getArtDerBehandlungType_NummerDesBehandlungszyklus();

		/**
		 * The meta object literal for the '<em><b>Vollstaendige Durchfuehrung Behandlung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ART_DER_BEHANDLUNG_TYPE__VOLLSTAENDIGE_DURCHFUEHRUNG_BEHANDLUNG = eINSTANCE.getArtDerBehandlungType_VollstaendigeDurchfuehrungBehandlung();

		/**
		 * The meta object literal for the '<em><b>Schwangerschaft Eingetreten</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ART_DER_BEHANDLUNG_TYPE__SCHWANGERSCHAFT_EINGETRETEN = eINSTANCE.getArtDerBehandlungType_SchwangerschaftEingetreten();

		/**
		 * The meta object literal for the '<em><b>Nummer Behandlungszyklus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ART_DER_BEHANDLUNG_TYPE__NUMMER_BEHANDLUNGSZYKLUS = eINSTANCE.getArtDerBehandlungType_NummerBehandlungszyklus();

		/**
		 * The meta object literal for the '<em><b>Bestaetigung Behandlung Nnicht Begonnen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ART_DER_BEHANDLUNG_TYPE__BESTAETIGUNG_BEHANDLUNG_NNICHT_BEGONNEN = eINSTANCE.getArtDerBehandlungType_BestaetigungBehandlungNnichtBegonnen();

		/**
		 * The meta object literal for the '<em><b>Voraussichtlicher Behandlungsbeginn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ART_DER_BEHANDLUNG_TYPE__VORAUSSICHTLICHER_BEHANDLUNGSBEGINN = eINSTANCE.getArtDerBehandlungType_VoraussichtlicherBehandlungsbeginn();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ArtNachreichungTypeImpl <em>Art Nachreichung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ArtNachreichungTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getArtNachreichungType()
		 * @generated
		 */
		EClass ART_NACHREICHUNG_TYPE = eINSTANCE.getArtNachreichungType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AuszahlungsantragTypeImpl <em>Auszahlungsantrag Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.AuszahlungsantragTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getAuszahlungsantragType()
		 * @generated
		 */
		EClass AUSZAHLUNGSANTRAG_TYPE = eINSTANCE.getAuszahlungsantragType();

		/**
		 * The meta object literal for the '<em><b>Abfrage Bewilligungsbescheid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSZAHLUNGSANTRAG_TYPE__ABFRAGE_BEWILLIGUNGSBESCHEID = eINSTANCE.getAuszahlungsantragType_AbfrageBewilligungsbescheid();

		/**
		 * The meta object literal for the '<em><b>Bundesland Foerderstelle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSZAHLUNGSANTRAG_TYPE__BUNDESLAND_FOERDERSTELLE = eINSTANCE.getAuszahlungsantragType_BundeslandFoerderstelle();

		/**
		 * The meta object literal for the '<em><b>Aktenzeichen Bewilligungsantrag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSZAHLUNGSANTRAG_TYPE__AKTENZEICHEN_BEWILLIGUNGSANTRAG = eINSTANCE.getAuszahlungsantragType_AktenzeichenBewilligungsantrag();

		/**
		 * The meta object literal for the '<em><b>Datenschutzerklaerung Schwangerschaft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSZAHLUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT = eINSTANCE.getAuszahlungsantragType_DatenschutzerklaerungSchwangerschaft();

		/**
		 * The meta object literal for the '<em><b>Zustimmung Datenschutzerklaerung Herbeifuehrung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSZAHLUNGSANTRAG_TYPE__ZUSTIMMUNG_DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG = eINSTANCE.getAuszahlungsantragType_ZustimmungDatenschutzerklaerungHerbeifuehrung();

		/**
		 * The meta object literal for the '<em><b>Konfigurationsfragen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUSZAHLUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN = eINSTANCE.getAuszahlungsantragType_Konfigurationsfragen();

		/**
		 * The meta object literal for the '<em><b>Antragstellende Person</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUSZAHLUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON = eINSTANCE.getAuszahlungsantragType_AntragstellendePerson();

		/**
		 * The meta object literal for the '<em><b>Nichtaustragende Person</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUSZAHLUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON = eINSTANCE.getAuszahlungsantragType_NichtaustragendePerson();

		/**
		 * The meta object literal for the '<em><b>Angaben Bankverbindung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUSZAHLUNGSANTRAG_TYPE__ANGABEN_BANKVERBINDUNG = eINSTANCE.getAuszahlungsantragType_AngabenBankverbindung();

		/**
		 * The meta object literal for the '<em><b>Nachweise Berechnung Zuwendung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUSZAHLUNGSANTRAG_TYPE__NACHWEISE_BERECHNUNG_ZUWENDUNG = eINSTANCE.getAuszahlungsantragType_NachweiseBerechnungZuwendung();

		/**
		 * The meta object literal for the '<em><b>Einwilligungen Auszahlungsantrag</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUSZAHLUNGSANTRAG_TYPE__EINWILLIGUNGEN_AUSZAHLUNGSANTRAG = eINSTANCE.getAuszahlungsantragType_EinwilligungenAuszahlungsantrag();

		/**
		 * The meta object literal for the '<em><b>Bestaetigung Richtigkeit Angaben</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSZAHLUNGSANTRAG_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN = eINSTANCE.getAuszahlungsantragType_BestaetigungRichtigkeitAngaben();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BefruchtungsbehandlungenTypeImpl <em>Befruchtungsbehandlungen Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BefruchtungsbehandlungenTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getBefruchtungsbehandlungenType()
		 * @generated
		 */
		EClass BEFRUCHTUNGSBEHANDLUNGEN_TYPE = eINSTANCE.getBefruchtungsbehandlungenType();

		/**
		 * The meta object literal for the '<em><b>Versuch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEFRUCHTUNGSBEHANDLUNGEN_TYPE__VERSUCH = eINSTANCE.getBefruchtungsbehandlungenType_Versuch();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BewilligungsantragTypeImpl <em>Bewilligungsantrag Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.BewilligungsantragTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getBewilligungsantragType()
		 * @generated
		 */
		EClass BEWILLIGUNGSANTRAG_TYPE = eINSTANCE.getBewilligungsantragType();

		/**
		 * The meta object literal for the '<em><b>Standort Reproduktionsklinik</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEWILLIGUNGSANTRAG_TYPE__STANDORT_REPRODUKTIONSKLINIK = eINSTANCE.getBewilligungsantragType_StandortReproduktionsklinik();

		/**
		 * The meta object literal for the '<em><b>Bundesland</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEWILLIGUNGSANTRAG_TYPE__BUNDESLAND = eINSTANCE.getBewilligungsantragType_Bundesland();

		/**
		 * The meta object literal for the '<em><b>Datenschutzerklaerung Schwangerschaft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEWILLIGUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNG_SCHWANGERSCHAFT = eINSTANCE.getBewilligungsantragType_DatenschutzerklaerungSchwangerschaft();

		/**
		 * The meta object literal for the '<em><b>Datenschutzerklaerungherbeifuehrung Schwangerschaft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEWILLIGUNGSANTRAG_TYPE__DATENSCHUTZERKLAERUNGHERBEIFUEHRUNG_SCHWANGERSCHAFT = eINSTANCE.getBewilligungsantragType_DatenschutzerklaerungherbeifuehrungSchwangerschaft();

		/**
		 * The meta object literal for the '<em><b>Konfigurationsfragen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEWILLIGUNGSANTRAG_TYPE__KONFIGURATIONSFRAGEN = eINSTANCE.getBewilligungsantragType_Konfigurationsfragen();

		/**
		 * The meta object literal for the '<em><b>Familienstand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEWILLIGUNGSANTRAG_TYPE__FAMILIENSTAND = eINSTANCE.getBewilligungsantragType_Familienstand();

		/**
		 * The meta object literal for the '<em><b>Gleicher Haushalt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEWILLIGUNGSANTRAG_TYPE__GLEICHER_HAUSHALT = eINSTANCE.getBewilligungsantragType_GleicherHaushalt();

		/**
		 * The meta object literal for the '<em><b>Gruendegetrennter Wohnsitz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEWILLIGUNGSANTRAG_TYPE__GRUENDEGETRENNTER_WOHNSITZ = eINSTANCE.getBewilligungsantragType_GruendegetrennterWohnsitz();

		/**
		 * The meta object literal for the '<em><b>Altersgrenze</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEWILLIGUNGSANTRAG_TYPE__ALTERSGRENZE = eINSTANCE.getBewilligungsantragType_Altersgrenze();

		/**
		 * The meta object literal for the '<em><b>Art Behandlung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEWILLIGUNGSANTRAG_TYPE__ART_BEHANDLUNG = eINSTANCE.getBewilligungsantragType_ArtBehandlung();

		/**
		 * The meta object literal for the '<em><b>Antragstellende Person</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEWILLIGUNGSANTRAG_TYPE__ANTRAGSTELLENDE_PERSON = eINSTANCE.getBewilligungsantragType_AntragstellendePerson();

		/**
		 * The meta object literal for the '<em><b>Nichtaustragende Person</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEWILLIGUNGSANTRAG_TYPE__NICHTAUSTRAGENDE_PERSON = eINSTANCE.getBewilligungsantragType_NichtaustragendePerson();

		/**
		 * The meta object literal for the '<em><b>Angaben Behandlung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEWILLIGUNGSANTRAG_TYPE__ANGABEN_BEHANDLUNG = eINSTANCE.getBewilligungsantragType_AngabenBehandlung();

		/**
		 * The meta object literal for the '<em><b>Finanzierungsplan</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEWILLIGUNGSANTRAG_TYPE__FINANZIERUNGSPLAN = eINSTANCE.getBewilligungsantragType_Finanzierungsplan();

		/**
		 * The meta object literal for the '<em><b>Nachweise</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEWILLIGUNGSANTRAG_TYPE__NACHWEISE = eINSTANCE.getBewilligungsantragType_Nachweise();

		/**
		 * The meta object literal for the '<em><b>Einwilligungen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEWILLIGUNGSANTRAG_TYPE__EINWILLIGUNGEN = eINSTANCE.getBewilligungsantragType_Einwilligungen();

		/**
		 * The meta object literal for the '<em><b>Bestaetigung Richtigkeit Angaben</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEWILLIGUNGSANTRAG_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN = eINSTANCE.getBewilligungsantragType_BestaetigungRichtigkeitAngaben();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.DocumentRootImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Kinderwunsch Bewilligungsantrag1001</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KINDERWUNSCH_BEWILLIGUNGSANTRAG1001 = eINSTANCE.getDocumentRoot_KinderwunschBewilligungsantrag1001();

		/**
		 * The meta object literal for the '<em><b>Kinderwunsch Nachreichung1003</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KINDERWUNSCH_NACHREICHUNG1003 = eINSTANCE.getDocumentRoot_KinderwunschNachreichung1003();

		/**
		 * The meta object literal for the '<em><b>Kinderwunsch Verwendungsnachweispruefung1002</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002 = eINSTANCE.getDocumentRoot_KinderwunschVerwendungsnachweispruefung1002();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.EinwilligungenAuszahlungsantragTypeImpl <em>Einwilligungen Auszahlungsantrag Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.EinwilligungenAuszahlungsantragTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getEinwilligungenAuszahlungsantragType()
		 * @generated
		 */
		EClass EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE = eINSTANCE.getEinwilligungenAuszahlungsantragType();

		/**
		 * The meta object literal for the '<em><b>Zustimmung Datenschutz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE__ZUSTIMMUNG_DATENSCHUTZ = eINSTANCE.getEinwilligungenAuszahlungsantragType_ZustimmungDatenschutz();

		/**
		 * The meta object literal for the '<em><b>Elektronische Bescheidzustellung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINWILLIGUNGEN_AUSZAHLUNGSANTRAG_TYPE__ELEKTRONISCHE_BESCHEIDZUSTELLUNG = eINSTANCE.getEinwilligungenAuszahlungsantragType_ElektronischeBescheidzustellung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.EinwilligungenTypeImpl <em>Einwilligungen Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.EinwilligungenTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getEinwilligungenType()
		 * @generated
		 */
		EClass EINWILLIGUNGEN_TYPE = eINSTANCE.getEinwilligungenType();

		/**
		 * The meta object literal for the '<em><b>Einwilligung Zur Auskunftseinholung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINWILLIGUNGEN_TYPE__EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG = eINSTANCE.getEinwilligungenType_EinwilligungZurAuskunftseinholung();

		/**
		 * The meta object literal for the '<em><b>Einwilligung Zur Auskunftseinholung Einschraenkungen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINWILLIGUNGEN_TYPE__EINWILLIGUNG_ZUR_AUSKUNFTSEINHOLUNG_EINSCHRAENKUNGEN = eINSTANCE.getEinwilligungenType_EinwilligungZurAuskunftseinholungEinschraenkungen();

		/**
		 * The meta object literal for the '<em><b>Entbindung Schweigepflicht Der Aerzte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINWILLIGUNGEN_TYPE__ENTBINDUNG_SCHWEIGEPFLICHT_DER_AERZTE = eINSTANCE.getEinwilligungenType_EntbindungSchweigepflichtDerAerzte();

		/**
		 * The meta object literal for the '<em><b>Einwilligung Kostenuebernahmeregelung Behandlungsabbruch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINWILLIGUNGEN_TYPE__EINWILLIGUNG_KOSTENUEBERNAHMEREGELUNG_BEHANDLUNGSABBRUCH = eINSTANCE.getEinwilligungenType_EinwilligungKostenuebernahmeregelungBehandlungsabbruch();

		/**
		 * The meta object literal for the '<em><b>Datenschutzerklaerung Herbeifuehrung Schwangerschaft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EINWILLIGUNGEN_TYPE__DATENSCHUTZERKLAERUNG_HERBEIFUEHRUNG_SCHWANGERSCHAFT = eINSTANCE.getEinwilligungenType_DatenschutzerklaerungHerbeifuehrungSchwangerschaft();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.FinanzierungsplanTypeImpl <em>Finanzierungsplan Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.FinanzierungsplanTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getFinanzierungsplanType()
		 * @generated
		 */
		EClass FINANZIERUNGSPLAN_TYPE = eINSTANCE.getFinanzierungsplanType();

		/**
		 * The meta object literal for the '<em><b>Gesamtkosten</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINANZIERUNGSPLAN_TYPE__GESAMTKOSTEN = eINSTANCE.getFinanzierungsplanType_Gesamtkosten();

		/**
		 * The meta object literal for the '<em><b>Voraussichtliche Erstattung Gesetzliche Krankenkasse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_GESETZLICHE_KRANKENKASSE = eINSTANCE.getFinanzierungsplanType_VoraussichtlicheErstattungGesetzlicheKrankenkasse();

		/**
		 * The meta object literal for the '<em><b>Voraussichtliche Erstattung Private Krankenkasse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_PRIVATE_KRANKENKASSE = eINSTANCE.getFinanzierungsplanType_VoraussichtlicheErstattungPrivateKrankenkasse();

		/**
		 * The meta object literal for the '<em><b>Voraussichtliche Erstattung Beihilfe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_BEIHILFE = eINSTANCE.getFinanzierungsplanType_VoraussichtlicheErstattungBeihilfe();

		/**
		 * The meta object literal for the '<em><b>Voraussichtliche Erstattung Heilfuersorge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINANZIERUNGSPLAN_TYPE__VORAUSSICHTLICHE_ERSTATTUNG_HEILFUERSORGE = eINSTANCE.getFinanzierungsplanType_VoraussichtlicheErstattungHeilfuersorge();

		/**
		 * The meta object literal for the '<em><b>Verbleibender Eigenanteil Selbstkostenanteil</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINANZIERUNGSPLAN_TYPE__VERBLEIBENDER_EIGENANTEIL_SELBSTKOSTENANTEIL = eINSTANCE.getFinanzierungsplanType_VerbleibenderEigenanteilSelbstkostenanteil();

		/**
		 * The meta object literal for the '<em><b>Zuwendungen Gesamt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINANZIERUNGSPLAN_TYPE__ZUWENDUNGEN_GESAMT = eINSTANCE.getFinanzierungsplanType_ZuwendungenGesamt();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschBewilligungsantrag1001TypeImpl <em>Bewilligungsantrag1001 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschBewilligungsantrag1001TypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getKinderwunschBewilligungsantrag1001Type()
		 * @generated
		 */
		EClass KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE = eINSTANCE.getKinderwunschBewilligungsantrag1001Type();

		/**
		 * The meta object literal for the '<em><b>Bewilligungsantrag</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINDERWUNSCH_BEWILLIGUNGSANTRAG1001_TYPE__BEWILLIGUNGSANTRAG = eINSTANCE.getKinderwunschBewilligungsantrag1001Type_Bewilligungsantrag();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschNachreichung1003TypeImpl <em>Nachreichung1003 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschNachreichung1003TypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getKinderwunschNachreichung1003Type()
		 * @generated
		 */
		EClass KINDERWUNSCH_NACHREICHUNG1003_TYPE = eINSTANCE.getKinderwunschNachreichung1003Type();

		/**
		 * The meta object literal for the '<em><b>Bundesland</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINDERWUNSCH_NACHREICHUNG1003_TYPE__BUNDESLAND = eINSTANCE.getKinderwunschNachreichung1003Type_Bundesland();

		/**
		 * The meta object literal for the '<em><b>Bearbeitungsnummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KINDERWUNSCH_NACHREICHUNG1003_TYPE__BEARBEITUNGSNUMMER = eINSTANCE.getKinderwunschNachreichung1003Type_Bearbeitungsnummer();

		/**
		 * The meta object literal for the '<em><b>Nichtaustragende Person</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINDERWUNSCH_NACHREICHUNG1003_TYPE__NICHTAUSTRAGENDE_PERSON = eINSTANCE.getKinderwunschNachreichung1003Type_NichtaustragendePerson();

		/**
		 * The meta object literal for the '<em><b>Antragstellende Person</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINDERWUNSCH_NACHREICHUNG1003_TYPE__ANTRAGSTELLENDE_PERSON = eINSTANCE.getKinderwunschNachreichung1003Type_AntragstellendePerson();

		/**
		 * The meta object literal for the '<em><b>Nachreichung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINDERWUNSCH_NACHREICHUNG1003_TYPE__NACHREICHUNG = eINSTANCE.getKinderwunschNachreichung1003Type_Nachreichung();

		/**
		 * The meta object literal for the '<em><b>Datenschutzerklaerung Der Foerderstelle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KINDERWUNSCH_NACHREICHUNG1003_TYPE__DATENSCHUTZERKLAERUNG_DER_FOERDERSTELLE = eINSTANCE.getKinderwunschNachreichung1003Type_DatenschutzerklaerungDerFoerderstelle();

		/**
		 * The meta object literal for the '<em><b>Bestaetigung Richtigkeit Angaben</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KINDERWUNSCH_NACHREICHUNG1003_TYPE__BESTAETIGUNG_RICHTIGKEIT_ANGABEN = eINSTANCE.getKinderwunschNachreichung1003Type_BestaetigungRichtigkeitAngaben();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschVerwendungsnachweispruefung1002TypeImpl <em>Verwendungsnachweispruefung1002 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschVerwendungsnachweispruefung1002TypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getKinderwunschVerwendungsnachweispruefung1002Type()
		 * @generated
		 */
		EClass KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE = eINSTANCE.getKinderwunschVerwendungsnachweispruefung1002Type();

		/**
		 * The meta object literal for the '<em><b>Auszahlungsantrag</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KINDERWUNSCH_VERWENDUNGSNACHWEISPRUEFUNG1002_TYPE__AUSZAHLUNGSANTRAG = eINSTANCE.getKinderwunschVerwendungsnachweispruefung1002Type_Auszahlungsantrag();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KonfigurationsfragenBewilligungTypeImpl <em>Konfigurationsfragen Bewilligung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KonfigurationsfragenBewilligungTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getKonfigurationsfragenBewilligungType()
		 * @generated
		 */
		EClass KONFIGURATIONSFRAGEN_BEWILLIGUNG_TYPE = eINSTANCE.getKonfigurationsfragenBewilligungType();

		/**
		 * The meta object literal for the '<em><b>Gleicher Haushalt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONFIGURATIONSFRAGEN_BEWILLIGUNG_TYPE__GLEICHER_HAUSHALT = eINSTANCE.getKonfigurationsfragenBewilligungType_GleicherHaushalt();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KonfigurationsfragenTypeImpl <em>Konfigurationsfragen Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KonfigurationsfragenTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getKonfigurationsfragenType()
		 * @generated
		 */
		EClass KONFIGURATIONSFRAGEN_TYPE = eINSTANCE.getKonfigurationsfragenType();

		/**
		 * The meta object literal for the '<em><b>Gleicher Haushalt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONFIGURATIONSFRAGEN_TYPE__GLEICHER_HAUSHALT = eINSTANCE.getKonfigurationsfragenType_GleicherHaushalt();

		/**
		 * The meta object literal for the '<em><b>Angaben Zur Behandlung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONFIGURATIONSFRAGEN_TYPE__ANGABEN_ZUR_BEHANDLUNG = eINSTANCE.getKonfigurationsfragenType_AngabenZurBehandlung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KrankenkasseTypeImpl <em>Krankenkasse Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KrankenkasseTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getKrankenkasseType()
		 * @generated
		 */
		EClass KRANKENKASSE_TYPE = eINSTANCE.getKrankenkasseType();

		/**
		 * The meta object literal for the '<em><b>Art Krankenkasse</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KRANKENKASSE_TYPE__ART_KRANKENKASSE = eINSTANCE.getKrankenkasseType_ArtKrankenkasse();

		/**
		 * The meta object literal for the '<em><b>Name Krankenkasse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KRANKENKASSE_TYPE__NAME_KRANKENKASSE = eINSTANCE.getKrankenkasseType_NameKrankenkasse();

		/**
		 * The meta object literal for the '<em><b>Name Beihilfestelle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KRANKENKASSE_TYPE__NAME_BEIHILFESTELLE = eINSTANCE.getKrankenkasseType_NameBeihilfestelle();

		/**
		 * The meta object literal for the '<em><b>Name Heilfuersorge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KRANKENKASSE_TYPE__NAME_HEILFUERSORGE = eINSTANCE.getKrankenkasseType_NameHeilfuersorge();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachreichungTypeImpl <em>Nachreichung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachreichungTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getNachreichungType()
		 * @generated
		 */
		EClass NACHREICHUNG_TYPE = eINSTANCE.getNachreichungType();

		/**
		 * The meta object literal for the '<em><b>Art Nachreichung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHREICHUNG_TYPE__ART_NACHREICHUNG = eINSTANCE.getNachreichungType_ArtNachreichung();

		/**
		 * The meta object literal for the '<em><b>Nachweis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHREICHUNG_TYPE__NACHWEIS = eINSTANCE.getNachreichungType_Nachweis();

		/**
		 * The meta object literal for the '<em><b>Einwilligung Datenverarbeitung Durch Foerderstelle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHREICHUNG_TYPE__EINWILLIGUNG_DATENVERARBEITUNG_DURCH_FOERDERSTELLE = eINSTANCE.getNachreichungType_EinwilligungDatenverarbeitungDurchFoerderstelle();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseBerechnungZuwendungTypeImpl <em>Nachweise Berechnung Zuwendung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseBerechnungZuwendungTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getNachweiseBerechnungZuwendungType()
		 * @generated
		 */
		EClass NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE = eINSTANCE.getNachweiseBerechnungZuwendungType();

		/**
		 * The meta object literal for the '<em><b>Negativbescheinigung Versicherung Kostentraeger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER = eINSTANCE.getNachweiseBerechnungZuwendungType_NegativbescheinigungVersicherungKostentraeger();

		/**
		 * The meta object literal for the '<em><b>Zuschuesse Krankenversicherung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_BERECHNUNG_ZUWENDUNG_TYPE__ZUSCHUESSE_KRANKENVERSICHERUNG = eINSTANCE.getNachweiseBerechnungZuwendungType_ZuschuesseKrankenversicherung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseKinderwunschTypeImpl <em>Nachweise Kinderwunsch Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseKinderwunschTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getNachweiseKinderwunschType()
		 * @generated
		 */
		EClass NACHWEISE_KINDERWUNSCH_TYPE = eINSTANCE.getNachweiseKinderwunschType();

		/**
		 * The meta object literal for the '<em><b>Nachweis Aktueller Wohnsitz</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_AKTUELLER_WOHNSITZ = eINSTANCE.getNachweiseKinderwunschType_NachweisAktuellerWohnsitz();

		/**
		 * The meta object literal for the '<em><b>Nachweis Eheurkunde</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_KINDERWUNSCH_TYPE__NACHWEIS_EHEURKUNDE = eINSTANCE.getNachweiseKinderwunschType_NachweisEheurkunde();

		/**
		 * The meta object literal for the '<em><b>Dauer Angelegte Partnerschaft</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_KINDERWUNSCH_TYPE__DAUER_ANGELEGTE_PARTNERSCHAFT = eINSTANCE.getNachweiseKinderwunschType_DauerAngelegtePartnerschaft();

		/**
		 * The meta object literal for the '<em><b>Kostenuebernahmeerklaerung Negativbescheid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_KINDERWUNSCH_TYPE__KOSTENUEBERNAHMEERKLAERUNG_NEGATIVBESCHEID = eINSTANCE.getNachweiseKinderwunschType_KostenuebernahmeerklaerungNegativbescheid();

		/**
		 * The meta object literal for the '<em><b>Notwendigkeitsbescheinigung Des Arztes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_KINDERWUNSCH_TYPE__NOTWENDIGKEITSBESCHEINIGUNG_DES_ARZTES = eINSTANCE.getNachweiseKinderwunschType_NotwendigkeitsbescheinigungDesArztes();

		/**
		 * The meta object literal for the '<em><b>Behandlungsplan Kostenvoranschlag</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_KINDERWUNSCH_TYPE__BEHANDLUNGSPLAN_KOSTENVORANSCHLAG = eINSTANCE.getNachweiseKinderwunschType_BehandlungsplanKostenvoranschlag();

		/**
		 * The meta object literal for the '<em><b>Erklaerung Reproduktionseinrichtung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_KINDERWUNSCH_TYPE__ERKLAERUNG_REPRODUKTIONSEINRICHTUNG = eINSTANCE.getNachweiseKinderwunschType_ErklaerungReproduktionseinrichtung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseRechnungenTypeImpl <em>Nachweise Rechnungen Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweiseRechnungenTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getNachweiseRechnungenType()
		 * @generated
		 */
		EClass NACHWEISE_RECHNUNGEN_TYPE = eINSTANCE.getNachweiseRechnungenType();

		/**
		 * The meta object literal for the '<em><b>Rechnungsdatum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHWEISE_RECHNUNGEN_TYPE__RECHNUNGSDATUM = eINSTANCE.getNachweiseRechnungenType_Rechnungsdatum();

		/**
		 * The meta object literal for the '<em><b>Rechnungssteller</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHWEISE_RECHNUNGEN_TYPE__RECHNUNGSSTELLER = eINSTANCE.getNachweiseRechnungenType_Rechnungssteller();

		/**
		 * The meta object literal for the '<em><b>Betrag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHWEISE_RECHNUNGEN_TYPE__BETRAG = eINSTANCE.getNachweiseRechnungenType_Betrag();

		/**
		 * The meta object literal for the '<em><b>Summe Gesamtkosten</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHWEISE_RECHNUNGEN_TYPE__SUMME_GESAMTKOSTEN = eINSTANCE.getNachweiseRechnungenType_SummeGesamtkosten();

		/**
		 * The meta object literal for the '<em><b>Nachweis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISE_RECHNUNGEN_TYPE__NACHWEIS = eINSTANCE.getNachweiseRechnungenType_Nachweis();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweisTypeImpl <em>Nachweis Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.NachweisTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getNachweisType()
		 * @generated
		 */
		EClass NACHWEIS_TYPE = eINSTANCE.getNachweisType();

		/**
		 * The meta object literal for the '<em><b>Nachweis Vorhanden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHWEIS_TYPE__NACHWEIS_VORHANDEN = eINSTANCE.getNachweisType_NachweisVorhanden();

		/**
		 * The meta object literal for the '<em><b>Nachweis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEIS_TYPE__NACHWEIS = eINSTANCE.getNachweisType_Nachweis();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.PersonendatenTypeImpl <em>Personendaten Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.PersonendatenTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getPersonendatenType()
		 * @generated
		 */
		EClass PERSONENDATEN_TYPE = eINSTANCE.getPersonendatenType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONENDATEN_TYPE__NAME = eINSTANCE.getPersonendatenType_Name();

		/**
		 * The meta object literal for the '<em><b>Wohnsitz</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONENDATEN_TYPE__WOHNSITZ = eINSTANCE.getPersonendatenType_Wohnsitz();

		/**
		 * The meta object literal for the '<em><b>Krankenkasse</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONENDATEN_TYPE__KRANKENKASSE = eINSTANCE.getPersonendatenType_Krankenkasse();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.VersuchTypeImpl <em>Versuch Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.VersuchTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getVersuchType()
		 * @generated
		 */
		EClass VERSUCH_TYPE = eINSTANCE.getVersuchType();

		/**
		 * The meta object literal for the '<em><b>Nummer Des Versuchs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSUCH_TYPE__NUMMER_DES_VERSUCHS = eINSTANCE.getVersuchType_NummerDesVersuchs();

		/**
		 * The meta object literal for the '<em><b>Datum Des Versuchs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSUCH_TYPE__DATUM_DES_VERSUCHS = eINSTANCE.getVersuchType_DatumDesVersuchs();

		/**
		 * The meta object literal for the '<em><b>Nachweis Vierter Versuch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSUCH_TYPE__NACHWEIS_VIERTER_VERSUCH = eINSTANCE.getVersuchType_NachweisVierterVersuch();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.VorherigeBehandlungenTypeImpl <em>Vorherige Behandlungen Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.VorherigeBehandlungenTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getVorherigeBehandlungenType()
		 * @generated
		 */
		EClass VORHERIGE_BEHANDLUNGEN_TYPE = eINSTANCE.getVorherigeBehandlungenType();

		/**
		 * The meta object literal for the '<em><b>Bisher Gefoerderte Behandlungen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VORHERIGE_BEHANDLUNGEN_TYPE__BISHER_GEFOERDERTE_BEHANDLUNGEN = eINSTANCE.getVorherigeBehandlungenType_BisherGefoerderteBehandlungen();

		/**
		 * The meta object literal for the '<em><b>Befruchtungsbehandlungen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORHERIGE_BEHANDLUNGEN_TYPE__BEFRUCHTUNGSBEHANDLUNGEN = eINSTANCE.getVorherigeBehandlungenType_Befruchtungsbehandlungen();

		/**
		 * The meta object literal for the '<em><b>Wiederholungsversuch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VORHERIGE_BEHANDLUNGEN_TYPE__WIEDERHOLUNGSVERSUCH = eINSTANCE.getVorherigeBehandlungenType_Wiederholungsversuch();

		/**
		 * The meta object literal for the '<em><b>Name Reproduktionseinrichtung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VORHERIGE_BEHANDLUNGEN_TYPE__NAME_REPRODUKTIONSEINRICHTUNG = eINSTANCE.getVorherigeBehandlungenType_NameReproduktionseinrichtung();

		/**
		 * The meta object literal for the '<em><b>Postleitzahl Reproduktionseinrichtung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VORHERIGE_BEHANDLUNGEN_TYPE__POSTLEITZAHL_REPRODUKTIONSEINRICHTUNG = eINSTANCE.getVorherigeBehandlungenType_PostleitzahlReproduktionseinrichtung();

		/**
		 * The meta object literal for the '<em><b>Beratung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VORHERIGE_BEHANDLUNGEN_TYPE__BERATUNG = eINSTANCE.getVorherigeBehandlungenType_Beratung();

		/**
		 * The meta object literal for the '<em><b>Nachweis Vierter Versuch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORHERIGE_BEHANDLUNGEN_TYPE__NACHWEIS_VIERTER_VERSUCH = eINSTANCE.getVorherigeBehandlungenType_NachweisVierterVersuch();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.WohnsitzTypeImpl <em>Wohnsitz Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.WohnsitzTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getWohnsitzType()
		 * @generated
		 */
		EClass WOHNSITZ_TYPE = eINSTANCE.getWohnsitzType();

		/**
		 * The meta object literal for the '<em><b>Anschrift Inland Strassenanschrift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WOHNSITZ_TYPE__ANSCHRIFT_INLAND_STRASSENANSCHRIFT = eINSTANCE.getWohnsitzType_AnschriftInlandStrassenanschrift();

		/**
		 * The meta object literal for the '<em><b>Abweichende Adresse NPA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WOHNSITZ_TYPE__ABWEICHENDE_ADRESSE_NPA = eINSTANCE.getWohnsitzType_AbweichendeAdresseNPA();

		/**
		 * The meta object literal for the '<em><b>Erreichbarkeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WOHNSITZ_TYPE__ERREICHBARKEIT = eINSTANCE.getWohnsitzType_Erreichbarkeit();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ZusaetzlicheBeteiligungTypeImpl <em>Zusaetzliche Beteiligung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ZusaetzlicheBeteiligungTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getZusaetzlicheBeteiligungType()
		 * @generated
		 */
		EClass ZUSAETZLICHE_BETEILIGUNG_TYPE = eINSTANCE.getZusaetzlicheBeteiligungType();

		/**
		 * The meta object literal for the '<em><b>Zusaetzliche Beteiligung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZUSAETZLICHE_BETEILIGUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG = eINSTANCE.getZusaetzlicheBeteiligungType_ZusaetzlicheBeteiligung();

		/**
		 * The meta object literal for the '<em><b>Vorliegen Nachweis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZUSAETZLICHE_BETEILIGUNG_TYPE__VORLIEGEN_NACHWEIS = eINSTANCE.getZusaetzlicheBeteiligungType_VorliegenNachweis();

		/**
		 * The meta object literal for the '<em><b>Betrag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZUSAETZLICHE_BETEILIGUNG_TYPE__BETRAG = eINSTANCE.getZusaetzlicheBeteiligungType_Betrag();

		/**
		 * The meta object literal for the '<em><b>Nachweis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUSAETZLICHE_BETEILIGUNG_TYPE__NACHWEIS = eINSTANCE.getZusaetzlicheBeteiligungType_Nachweis();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ZuschuesseKrankenversicherungTypeImpl <em>Zuschuesse Krankenversicherung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.ZuschuesseKrankenversicherungTypeImpl
		 * @see de.xoev.xfamilie.kinderwunsch._1.kinderwunsch.impl.KinderwunschPackageImpl#getZuschuesseKrankenversicherungType()
		 * @generated
		 */
		EClass ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE = eINSTANCE.getZuschuesseKrankenversicherungType();

		/**
		 * The meta object literal for the '<em><b>Beteiligte Krankenkassen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__BETEILIGTE_KRANKENKASSEN = eINSTANCE.getZuschuesseKrankenversicherungType_BeteiligteKrankenkassen();

		/**
		 * The meta object literal for the '<em><b>Negativbescheinigung Versicherung Kostentraeger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__NEGATIVBESCHEINIGUNG_VERSICHERUNG_KOSTENTRAEGER = eINSTANCE.getZuschuesseKrankenversicherungType_NegativbescheinigungVersicherungKostentraeger();

		/**
		 * The meta object literal for the '<em><b>Zusaetzliche Beteiligung GKV</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_GKV = eINSTANCE.getZuschuesseKrankenversicherungType_ZusaetzlicheBeteiligungGKV();

		/**
		 * The meta object literal for the '<em><b>Zusaetzliche Beteiligung PKV</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__ZUSAETZLICHE_BETEILIGUNG_PKV = eINSTANCE.getZuschuesseKrankenversicherungType_ZusaetzlicheBeteiligungPKV();

		/**
		 * The meta object literal for the '<em><b>Beteiligung Beihilfe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__BETEILIGUNG_BEIHILFE = eINSTANCE.getZuschuesseKrankenversicherungType_BeteiligungBeihilfe();

		/**
		 * The meta object literal for the '<em><b>Nachweise Rechnungen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUSCHUESSE_KRANKENVERSICHERUNG_TYPE__NACHWEISE_RECHNUNGEN = eINSTANCE.getZuschuesseKrankenversicherungType_NachweiseRechnungen();

	}

} //KinderwunschPackage
