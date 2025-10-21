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
package de.xoev.domea.domea;


import basisnachricht.BasisnachrichtPackage;

import code.CodePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * Der Baukasten beinhaltet alle spezifischen Komponenten, die entweder aus XÖV-Kernkomponenten abgeleitet sind oder für xdomea erstellt wurden.
 * Datentypen enthält spezifische Datentypen, welche von Datentypen aus anderen Namensräumen (z. B. UN/CEFACT, W3C) abgeleitet wurden.
 * Diese Schema-Datei enthält die technische Repräsentation der in der Norm DIN 91379 definierten Datentypen.
 * <!-- end-model-doc -->
 * @see de.xoev.domea.domea.DomeaFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = DomeaPackage.eNS_URI, genModel = "/model/xdomea.genmodel", genModelSourceLocations = {"model/xdomea.genmodel","de.xoev.domea/model/xdomea.genmodel"}, ecore="/model/xdomea.ecore", ecoreSourceLocations="/model/xdomea.ecore")
public interface DomeaPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domea";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:xoev-de:xdomea:schema:4.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "domea";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomeaPackage eINSTANCE = de.xoev.domea.domea.impl.DomeaPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.AkteninhaltTypeImpl <em>Akteninhalt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.AkteninhaltTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAkteninhaltType()
	 * @generated
	 */
	int AKTENINHALT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Dokument Oder Dokument Mit Schriftstueck</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENINHALT_TYPE__DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK = 0;

	/**
	 * The feature id for the '<em><b>Vorgang</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENINHALT_TYPE__VORGANG = 1;

	/**
	 * The feature id for the '<em><b>Teilakte</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENINHALT_TYPE__TEILAKTE = 2;

	/**
	 * The number of structural features of the '<em>Akteninhalt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENINHALT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Akteninhalt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENINHALT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.AktenplaneinheitTypeImpl <em>Aktenplaneinheit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.AktenplaneinheitTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAktenplaneinheitType()
	 * @generated
	 */
	int AKTENPLANEINHEIT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Kennzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLANEINHEIT_TYPE__KENNZEICHEN = 0;

	/**
	 * The feature id for the '<em><b>Inhaltsangabe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLANEINHEIT_TYPE__INHALTSANGABE = 1;

	/**
	 * The feature id for the '<em><b>Betreff Kurz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLANEINHEIT_TYPE__BETREFF_KURZ = 2;

	/**
	 * The number of structural features of the '<em>Aktenplaneinheit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLANEINHEIT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Aktenplaneinheit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLANEINHEIT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.AktenplaneinheitAktenplanTypeImpl <em>Aktenplaneinheit Aktenplan Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.AktenplaneinheitAktenplanTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAktenplaneinheitAktenplanType()
	 * @generated
	 */
	int AKTENPLANEINHEIT_AKTENPLAN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Kennzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLANEINHEIT_AKTENPLAN_TYPE__KENNZEICHEN = AKTENPLANEINHEIT_TYPE__KENNZEICHEN;

	/**
	 * The feature id for the '<em><b>Inhaltsangabe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLANEINHEIT_AKTENPLAN_TYPE__INHALTSANGABE = AKTENPLANEINHEIT_TYPE__INHALTSANGABE;

	/**
	 * The feature id for the '<em><b>Betreff Kurz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLANEINHEIT_AKTENPLAN_TYPE__BETREFF_KURZ = AKTENPLANEINHEIT_TYPE__BETREFF_KURZ;

	/**
	 * The feature id for the '<em><b>Aussonderungsart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUSSONDERUNGSART = AKTENPLANEINHEIT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gueltigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLANEINHEIT_AKTENPLAN_TYPE__GUELTIGKEIT = AKTENPLANEINHEIT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Stillgelegt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLANEINHEIT_AKTENPLAN_TYPE__STILLGELEGT = AKTENPLANEINHEIT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aufbewahrungsdauer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUFBEWAHRUNGSDAUER = AKTENPLANEINHEIT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Einheit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLANEINHEIT_AKTENPLAN_TYPE__EINHEIT = AKTENPLANEINHEIT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Verweis Aktenplaneinheit</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLANEINHEIT_AKTENPLAN_TYPE__VERWEIS_AKTENPLANEINHEIT = AKTENPLANEINHEIT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Anwendungsspezifische Erweiterung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLANEINHEIT_AKTENPLAN_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG = AKTENPLANEINHEIT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Anwendungsspezifische Erweiterung XML</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLANEINHEIT_AKTENPLAN_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML = AKTENPLANEINHEIT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Aktenplaneinheit Aktenplan Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLANEINHEIT_AKTENPLAN_TYPE_FEATURE_COUNT = AKTENPLANEINHEIT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Aktenplaneinheit Aktenplan Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLANEINHEIT_AKTENPLAN_TYPE_OPERATION_COUNT = AKTENPLANEINHEIT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.AktenplanTypeImpl <em>Aktenplan Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.AktenplanTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAktenplanType()
	 * @generated
	 */
	int AKTENPLAN_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Bezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLAN_TYPE__BEZEICHNUNG = 0;

	/**
	 * The feature id for the '<em><b>Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLAN_TYPE__TYP = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLAN_TYPE__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Einheit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLAN_TYPE__EINHEIT = 3;

	/**
	 * The feature id for the '<em><b>Gueltigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLAN_TYPE__GUELTIGKEIT = 4;

	/**
	 * The feature id for the '<em><b>Aktenplandatei</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLAN_TYPE__AKTENPLANDATEI = 5;

	/**
	 * The number of structural features of the '<em>Aktenplan Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLAN_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Aktenplan Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTENPLAN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.AkteTypeImpl <em>Akte Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.AkteTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAkteType()
	 * @generated
	 */
	int AKTE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Identifikation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTE_TYPE__IDENTIFIKATION = 0;

	/**
	 * The feature id for the '<em><b>Allgemeine Metadaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTE_TYPE__ALLGEMEINE_METADATEN = 1;

	/**
	 * The feature id for the '<em><b>Aussonderungsmetadaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTE_TYPE__AUSSONDERUNGSMETADATEN = 2;

	/**
	 * The feature id for the '<em><b>Standort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTE_TYPE__STANDORT = 3;

	/**
	 * The feature id for the '<em><b>Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTE_TYPE__TYP = 4;

	/**
	 * The feature id for the '<em><b>Laufzeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTE_TYPE__LAUFZEIT = 5;

	/**
	 * The feature id for the '<em><b>Historien Protokoll Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTE_TYPE__HISTORIEN_PROTOKOLL_INFORMATION = 6;

	/**
	 * The feature id for the '<em><b>Interner Geschaeftsgang</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTE_TYPE__INTERNER_GESCHAEFTSGANG = 7;

	/**
	 * The feature id for the '<em><b>Akteninhalt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTE_TYPE__AKTENINHALT = 8;

	/**
	 * The feature id for the '<em><b>Verweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTE_TYPE__VERWEIS = 9;

	/**
	 * The feature id for the '<em><b>Kontakt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTE_TYPE__KONTAKT = 10;

	/**
	 * The feature id for the '<em><b>Zd A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTE_TYPE__ZD_A = 11;

	/**
	 * The feature id for the '<em><b>Zd ADatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTE_TYPE__ZD_ADATUM = 12;

	/**
	 * The feature id for the '<em><b>Anwendungsspezifische Erweiterung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTE_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG = 13;

	/**
	 * The feature id for the '<em><b>Anwendungsspezifische Erweiterung XML</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTE_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML = 14;

	/**
	 * The number of structural features of the '<em>Akte Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTE_TYPE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Akte Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AKTE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.AllgemeineMetadatenTypeImpl <em>Allgemeine Metadaten Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.AllgemeineMetadatenTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAllgemeineMetadatenType()
	 * @generated
	 */
	int ALLGEMEINE_METADATEN_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Betreff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_METADATEN_TYPE__BETREFF = 0;

	/**
	 * The feature id for the '<em><b>Kennzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_METADATEN_TYPE__KENNZEICHEN = 1;

	/**
	 * The feature id for the '<em><b>Federfuehrung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_METADATEN_TYPE__FEDERFUEHRUNG = 2;

	/**
	 * The feature id for the '<em><b>Aktenfuehrung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_METADATEN_TYPE__AKTENFUEHRUNG = 3;

	/**
	 * The feature id for the '<em><b>Geheimhaltung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_METADATEN_TYPE__GEHEIMHALTUNG = 4;

	/**
	 * The feature id for the '<em><b>Bemerkung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_METADATEN_TYPE__BEMERKUNG = 5;

	/**
	 * The feature id for the '<em><b>Medium</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_METADATEN_TYPE__MEDIUM = 6;

	/**
	 * The feature id for the '<em><b>Aktenplaneinheit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_METADATEN_TYPE__AKTENPLANEINHEIT = 7;

	/**
	 * The feature id for the '<em><b>Zeitpunkt Letzte Aenderung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_METADATEN_TYPE__ZEITPUNKT_LETZTE_AENDERUNG = 8;

	/**
	 * The feature id for the '<em><b>Strukturpfad</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_METADATEN_TYPE__STRUKTURPFAD = 9;

	/**
	 * The feature id for the '<em><b>Datenschutzstufe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_METADATEN_TYPE__DATENSCHUTZSTUFE = 10;

	/**
	 * The feature id for the '<em><b>Datenschutzstufe Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_METADATEN_TYPE__DATENSCHUTZSTUFE_CODE = 11;

	/**
	 * The number of structural features of the '<em>Allgemeine Metadaten Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_METADATEN_TYPE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Allgemeine Metadaten Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_METADATEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.AllgemeinerNameTypeImpl <em>Allgemeiner Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.AllgemeinerNameTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAllgemeinerNameType()
	 * @generated
	 */
	int ALLGEMEINER_NAME_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINER_NAME_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Allgemeiner Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINER_NAME_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Allgemeiner Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINER_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.AllgemeineRueckmeldungCodeTypeImpl <em>Allgemeine Rueckmeldung Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.AllgemeineRueckmeldungCodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAllgemeineRueckmeldungCodeType()
	 * @generated
	 */
	int ALLGEMEINE_RUECKMELDUNG_CODE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_RUECKMELDUNG_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_RUECKMELDUNG_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_RUECKMELDUNG_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_RUECKMELDUNG_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Allgemeine Rueckmeldung Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_RUECKMELDUNG_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Allgemeine Rueckmeldung Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINE_RUECKMELDUNG_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.DokumentOderDokumentMitSchriftstueckTypeImpl <em>Dokument Oder Dokument Mit Schriftstueck Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.DokumentOderDokumentMitSchriftstueckTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getDokumentOderDokumentMitSchriftstueckType()
	 * @generated
	 */
	int DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Dokument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT = 0;

	/**
	 * The feature id for the '<em><b>Dokument Mit Schriftstueck</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT_MIT_SCHRIFTSTUECK = 1;

	/**
	 * The number of structural features of the '<em>Dokument Oder Dokument Mit Schriftstueck Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Dokument Oder Dokument Mit Schriftstueck Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.AnlageDokumentTypeImpl <em>Anlage Dokument Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.AnlageDokumentTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAnlageDokumentType()
	 * @generated
	 */
	int ANLAGE_DOKUMENT_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Dokument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_DOKUMENT_TYPE__DOKUMENT = DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT;

	/**
	 * The feature id for the '<em><b>Dokument Mit Schriftstueck</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_DOKUMENT_TYPE__DOKUMENT_MIT_SCHRIFTSTUECK = DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT_MIT_SCHRIFTSTUECK;

	/**
	 * The feature id for the '<em><b>Nummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_DOKUMENT_TYPE__NUMMER = DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Anlage Dokument Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_DOKUMENT_TYPE_FEATURE_COUNT = DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Anlage Dokument Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANLAGE_DOKUMENT_TYPE_OPERATION_COUNT = DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.AnschriftstypCodeTypeImpl <em>Anschriftstyp Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.AnschriftstypCodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAnschriftstypCodeType()
	 * @generated
	 */
	int ANSCHRIFTSTYP_CODE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFTSTYP_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFTSTYP_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFTSTYP_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFTSTYP_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Anschriftstyp Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFTSTYP_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Anschriftstyp Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFTSTYP_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.AnschriftTypeImpl <em>Anschrift Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.AnschriftTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAnschriftType()
	 * @generated
	 */
	int ANSCHRIFT_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Staat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_TYPE__STAAT = 0;

	/**
	 * The feature id for the '<em><b>Strasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_TYPE__STRASSE = 1;

	/**
	 * The feature id for the '<em><b>Hausnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_TYPE__HAUSNUMMER = 2;

	/**
	 * The feature id for the '<em><b>Postfach</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_TYPE__POSTFACH = 3;

	/**
	 * The feature id for the '<em><b>Postleitzahl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_TYPE__POSTLEITZAHL = 4;

	/**
	 * The feature id for the '<em><b>Ort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_TYPE__ORT = 5;

	/**
	 * The feature id for the '<em><b>Zusatz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_TYPE__ZUSATZ = 6;

	/**
	 * The feature id for the '<em><b>Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_TYPE__TYP = 7;

	/**
	 * The number of structural features of the '<em>Anschrift Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Anschrift Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSCHRIFT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.AnwendungsspezifischeErweiterungTypeImpl <em>Anwendungsspezifische Erweiterung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.AnwendungsspezifischeErweiterungTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAnwendungsspezifischeErweiterungType()
	 * @generated
	 */
	int ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Kennung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__KENNUNG = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__BESCHREIBUNG = 2;

	/**
	 * The feature id for the '<em><b>Versionsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__VERSIONSNUMMER = 3;

	/**
	 * The feature id for the '<em><b>Versionsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__VERSIONSDATUM = 4;

	/**
	 * The feature id for the '<em><b>Feldgruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__FELDGRUPPE = 5;

	/**
	 * The feature id for the '<em><b>Feld</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__FELD = 6;

	/**
	 * The number of structural features of the '<em>Anwendungsspezifische Erweiterung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Anwendungsspezifische Erweiterung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.AnwendungsspezifischeErweiterungXMLTypeImpl <em>Anwendungsspezifische Erweiterung XML Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.AnwendungsspezifischeErweiterungXMLTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAnwendungsspezifischeErweiterungXMLType()
	 * @generated
	 */
	int ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML_TYPE__ANY = 0;

	/**
	 * The number of structural features of the '<em>Anwendungsspezifische Erweiterung XML Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Anwendungsspezifische Erweiterung XML Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.AufbewahrungsdauerTypeImpl <em>Aufbewahrungsdauer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.AufbewahrungsdauerTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAufbewahrungsdauerType()
	 * @generated
	 */
	int AUFBEWAHRUNGSDAUER_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Anzahl Jahre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFBEWAHRUNGSDAUER_TYPE__ANZAHL_JAHRE = 0;

	/**
	 * The feature id for the '<em><b>Unbefristet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFBEWAHRUNGSDAUER_TYPE__UNBEFRISTET = 1;

	/**
	 * The number of structural features of the '<em>Aufbewahrungsdauer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFBEWAHRUNGSDAUER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Aufbewahrungsdauer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFBEWAHRUNGSDAUER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.AussonderungsartCodeTypeImpl <em>Aussonderungsart Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.AussonderungsartCodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAussonderungsartCodeType()
	 * @generated
	 */
	int AUSSONDERUNGSART_CODE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSONDERUNGSART_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSONDERUNGSART_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSONDERUNGSART_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSONDERUNGSART_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Aussonderungsart Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSONDERUNGSART_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Aussonderungsart Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSONDERUNGSART_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.AussonderungsartTypeImpl <em>Aussonderungsart Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.AussonderungsartTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAussonderungsartType()
	 * @generated
	 */
	int AUSSONDERUNGSART_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Aussonderungsart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSONDERUNGSART_TYPE__AUSSONDERUNGSART = 0;

	/**
	 * The feature id for the '<em><b>Aussonderungsart Konfigurierbar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSONDERUNGSART_TYPE__AUSSONDERUNGSART_KONFIGURIERBAR = 1;

	/**
	 * The number of structural features of the '<em>Aussonderungsart Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSONDERUNGSART_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Aussonderungsart Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSONDERUNGSART_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.AussonderungsmetadatenTypeImpl <em>Aussonderungsmetadaten Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.AussonderungsmetadatenTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAussonderungsmetadatenType()
	 * @generated
	 */
	int AUSSONDERUNGSMETADATEN_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Aufbewahrungsdauer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSONDERUNGSMETADATEN_TYPE__AUFBEWAHRUNGSDAUER = 0;

	/**
	 * The feature id for the '<em><b>Aussonderungsart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSONDERUNGSMETADATEN_TYPE__AUSSONDERUNGSART = 1;

	/**
	 * The feature id for the '<em><b>Kennung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSONDERUNGSMETADATEN_TYPE__KENNUNG = 2;

	/**
	 * The feature id for the '<em><b>Bewertungsvorschlag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSONDERUNGSMETADATEN_TYPE__BEWERTUNGSVORSCHLAG = 3;

	/**
	 * The feature id for the '<em><b>Bewertungsvorschlag Begruendung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSONDERUNGSMETADATEN_TYPE__BEWERTUNGSVORSCHLAG_BEGRUENDUNG = 4;

	/**
	 * The feature id for the '<em><b>Aufbewahrungsende</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSONDERUNGSMETADATEN_TYPE__AUFBEWAHRUNGSENDE = 5;

	/**
	 * The feature id for the '<em><b>Transferfristende</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSONDERUNGSMETADATEN_TYPE__TRANSFERFRISTENDE = 6;

	/**
	 * The number of structural features of the '<em>Aussonderungsmetadaten Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSONDERUNGSMETADATEN_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Aussonderungsmetadaten Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSSONDERUNGSMETADATEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.BearbeitungTypeImpl <em>Bearbeitung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.BearbeitungTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getBearbeitungType()
	 * @generated
	 */
	int BEARBEITUNG_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Bearbeiter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARBEITUNG_TYPE__BEARBEITER = 0;

	/**
	 * The feature id for the '<em><b>Datum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARBEITUNG_TYPE__DATUM = 1;

	/**
	 * The feature id for the '<em><b>Uhrzeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARBEITUNG_TYPE__UHRZEIT = 2;

	/**
	 * The feature id for the '<em><b>Vermerk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARBEITUNG_TYPE__VERMERK = 3;

	/**
	 * The feature id for the '<em><b>Notiz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARBEITUNG_TYPE__NOTIZ = 4;

	/**
	 * The feature id for the '<em><b>Anlage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARBEITUNG_TYPE__ANLAGE = 5;

	/**
	 * The number of structural features of the '<em>Bearbeitung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARBEITUNG_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Bearbeitung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEARBEITUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.BehoerdeTypeImpl <em>Behoerde Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.BehoerdeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getBehoerdeType()
	 * @generated
	 */
	int BEHOERDE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Verzeichnisdienst</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHOERDE_TYPE__VERZEICHNISDIENST = 0;

	/**
	 * The feature id for the '<em><b>Kennung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHOERDE_TYPE__KENNUNG = 1;

	/**
	 * The number of structural features of the '<em>Behoerde Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHOERDE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Behoerde Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHOERDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.BeteiligungsschrittTypeImpl <em>Beteiligungsschritt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.BeteiligungsschrittTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getBeteiligungsschrittType()
	 * @generated
	 */
	int BETEILIGUNGSSCHRITT_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Nummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETEILIGUNGSSCHRITT_TYPE__NUMMER = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETEILIGUNGSSCHRITT_TYPE__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Verfuegung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETEILIGUNGSSCHRITT_TYPE__VERFUEGUNG = 2;

	/**
	 * The feature id for the '<em><b>Bearbeitung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETEILIGUNGSSCHRITT_TYPE__BEARBEITUNG = 3;

	/**
	 * The feature id for the '<em><b>Parallel Zu Beteiligungsschritt</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETEILIGUNGSSCHRITT_TYPE__PARALLEL_ZU_BETEILIGUNGSSCHRITT = 4;

	/**
	 * The feature id for the '<em><b>Version Nummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETEILIGUNGSSCHRITT_TYPE__VERSION_NUMMER = 5;

	/**
	 * The number of structural features of the '<em>Beteiligungsschritt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETEILIGUNGSSCHRITT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Beteiligungsschritt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETEILIGUNGSSCHRITT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.BeteiligungsstatusCodeTypeImpl <em>Beteiligungsstatus Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.BeteiligungsstatusCodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getBeteiligungsstatusCodeType()
	 * @generated
	 */
	int BETEILIGUNGSSTATUS_CODE_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETEILIGUNGSSTATUS_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETEILIGUNGSSTATUS_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETEILIGUNGSSTATUS_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETEILIGUNGSSTATUS_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Beteiligungsstatus Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETEILIGUNGSSTATUS_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Beteiligungsstatus Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETEILIGUNGSSTATUS_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.BewertungsvorschlagCodeTypeImpl <em>Bewertungsvorschlag Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.BewertungsvorschlagCodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getBewertungsvorschlagCodeType()
	 * @generated
	 */
	int BEWERTUNGSVORSCHLAG_CODE_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWERTUNGSVORSCHLAG_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWERTUNGSVORSCHLAG_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWERTUNGSVORSCHLAG_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWERTUNGSVORSCHLAG_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Bewertungsvorschlag Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWERTUNGSVORSCHLAG_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bewertungsvorschlag Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEWERTUNGSVORSCHLAG_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.DateiformatCodeTypeImpl <em>Dateiformat Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.DateiformatCodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getDateiformatCodeType()
	 * @generated
	 */
	int DATEIFORMAT_CODE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATEIFORMAT_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATEIFORMAT_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATEIFORMAT_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATEIFORMAT_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Dateiformat Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATEIFORMAT_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dateiformat Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATEIFORMAT_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.DatenaustauschartCodeTypeImpl <em>Datenaustauschart Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.DatenaustauschartCodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getDatenaustauschartCodeType()
	 * @generated
	 */
	int DATENAUSTAUSCHART_CODE_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENAUSTAUSCHART_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENAUSTAUSCHART_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENAUSTAUSCHART_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENAUSTAUSCHART_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Datenaustauschart Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENAUSTAUSCHART_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Datenaustauschart Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENAUSTAUSCHART_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.DatenschutzstufeCodeTypeImpl <em>Datenschutzstufe Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.DatenschutzstufeCodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getDatenschutzstufeCodeType()
	 * @generated
	 */
	int DATENSCHUTZSTUFE_CODE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENSCHUTZSTUFE_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENSCHUTZSTUFE_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENSCHUTZSTUFE_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENSCHUTZSTUFE_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Datenschutzstufe Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENSCHUTZSTUFE_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Datenschutzstufe Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENSCHUTZSTUFE_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.DatentypCodeTypeImpl <em>Datentyp Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.DatentypCodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getDatentypCodeType()
	 * @generated
	 */
	int DATENTYP_CODE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENTYP_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENTYP_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENTYP_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENTYP_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Datentyp Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENTYP_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Datentyp Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENTYP_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.DokumentSchriftstueckBasisTypeImpl <em>Dokument Schriftstueck Basis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.DokumentSchriftstueckBasisTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getDokumentSchriftstueckBasisType()
	 * @generated
	 */
	int DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Identifikation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__IDENTIFIKATION = 0;

	/**
	 * The feature id for the '<em><b>Allgemeine Metadaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ALLGEMEINE_METADATEN = 1;

	/**
	 * The feature id for the '<em><b>Fremdes Geschaeftszeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__FREMDES_GESCHAEFTSZEICHEN = 2;

	/**
	 * The feature id for the '<em><b>Posteingangsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__POSTEINGANGSDATUM = 3;

	/**
	 * The feature id for the '<em><b>Postausgangsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__POSTAUSGANGSDATUM = 4;

	/**
	 * The feature id for the '<em><b>Datum Des Schreibens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__DATUM_DES_SCHREIBENS = 5;

	/**
	 * The feature id for the '<em><b>Bezug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__BEZUG = 6;

	/**
	 * The feature id for the '<em><b>Hier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__HIER = 7;

	/**
	 * The feature id for the '<em><b>Bearbeiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__BEARBEITER = 8;

	/**
	 * The feature id for the '<em><b>Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__TYP = 9;

	/**
	 * The feature id for the '<em><b>Historien Protokoll Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__HISTORIEN_PROTOKOLL_INFORMATION = 10;

	/**
	 * The feature id for the '<em><b>Interner Geschaeftsgang</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__INTERNER_GESCHAEFTSGANG = 11;

	/**
	 * The feature id for the '<em><b>Verweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__VERWEIS = 12;

	/**
	 * The feature id for the '<em><b>Anlage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANLAGE = 13;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__AUTOR = 14;

	/**
	 * The feature id for the '<em><b>Leser</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__LESER = 15;

	/**
	 * The feature id for the '<em><b>Weiterer Kontakt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__WEITERER_KONTAKT = 16;

	/**
	 * The feature id for the '<em><b>Anwendungsspezifische Erweiterung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG = 17;

	/**
	 * The feature id for the '<em><b>Anwendungsspezifische Erweiterung XML</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML = 18;

	/**
	 * The number of structural features of the '<em>Dokument Schriftstueck Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Dokument Schriftstueck Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.DokumentMitSchriftstueckTypeImpl <em>Dokument Mit Schriftstueck Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.DokumentMitSchriftstueckTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getDokumentMitSchriftstueckType()
	 * @generated
	 */
	int DOKUMENT_MIT_SCHRIFTSTUECK_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Identifikation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__IDENTIFIKATION = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__IDENTIFIKATION;

	/**
	 * The feature id for the '<em><b>Allgemeine Metadaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__ALLGEMEINE_METADATEN = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ALLGEMEINE_METADATEN;

	/**
	 * The feature id for the '<em><b>Fremdes Geschaeftszeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__FREMDES_GESCHAEFTSZEICHEN = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__FREMDES_GESCHAEFTSZEICHEN;

	/**
	 * The feature id for the '<em><b>Posteingangsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__POSTEINGANGSDATUM = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__POSTEINGANGSDATUM;

	/**
	 * The feature id for the '<em><b>Postausgangsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__POSTAUSGANGSDATUM = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__POSTAUSGANGSDATUM;

	/**
	 * The feature id for the '<em><b>Datum Des Schreibens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DATUM_DES_SCHREIBENS = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__DATUM_DES_SCHREIBENS;

	/**
	 * The feature id for the '<em><b>Bezug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__BEZUG = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__BEZUG;

	/**
	 * The feature id for the '<em><b>Hier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__HIER = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__HIER;

	/**
	 * The feature id for the '<em><b>Bearbeiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__BEARBEITER = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__BEARBEITER;

	/**
	 * The feature id for the '<em><b>Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__TYP = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__TYP;

	/**
	 * The feature id for the '<em><b>Historien Protokoll Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__HISTORIEN_PROTOKOLL_INFORMATION = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__HISTORIEN_PROTOKOLL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Interner Geschaeftsgang</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__INTERNER_GESCHAEFTSGANG = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__INTERNER_GESCHAEFTSGANG;

	/**
	 * The feature id for the '<em><b>Verweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__VERWEIS = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__VERWEIS;

	/**
	 * The feature id for the '<em><b>Anlage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__ANLAGE = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANLAGE;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__AUTOR = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__AUTOR;

	/**
	 * The feature id for the '<em><b>Leser</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__LESER = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__LESER;

	/**
	 * The feature id for the '<em><b>Weiterer Kontakt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__WEITERER_KONTAKT = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__WEITERER_KONTAKT;

	/**
	 * The feature id for the '<em><b>Anwendungsspezifische Erweiterung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG;

	/**
	 * The feature id for the '<em><b>Anwendungsspezifische Erweiterung XML</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML;

	/**
	 * The feature id for the '<em><b>Schriftstueck</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__SCHRIFTSTUECK = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dokument Mit Schriftstueck Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_MIT_SCHRIFTSTUECK_TYPE_FEATURE_COUNT = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dokument Mit Schriftstueck Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_MIT_SCHRIFTSTUECK_TYPE_OPERATION_COUNT = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.DokumentTypeImpl <em>Dokument Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.DokumentTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getDokumentType()
	 * @generated
	 */
	int DOKUMENT_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Identifikation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_TYPE__IDENTIFIKATION = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__IDENTIFIKATION;

	/**
	 * The feature id for the '<em><b>Allgemeine Metadaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_TYPE__ALLGEMEINE_METADATEN = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ALLGEMEINE_METADATEN;

	/**
	 * The feature id for the '<em><b>Fremdes Geschaeftszeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_TYPE__FREMDES_GESCHAEFTSZEICHEN = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__FREMDES_GESCHAEFTSZEICHEN;

	/**
	 * The feature id for the '<em><b>Posteingangsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_TYPE__POSTEINGANGSDATUM = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__POSTEINGANGSDATUM;

	/**
	 * The feature id for the '<em><b>Postausgangsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_TYPE__POSTAUSGANGSDATUM = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__POSTAUSGANGSDATUM;

	/**
	 * The feature id for the '<em><b>Datum Des Schreibens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_TYPE__DATUM_DES_SCHREIBENS = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__DATUM_DES_SCHREIBENS;

	/**
	 * The feature id for the '<em><b>Bezug</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_TYPE__BEZUG = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__BEZUG;

	/**
	 * The feature id for the '<em><b>Hier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_TYPE__HIER = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__HIER;

	/**
	 * The feature id for the '<em><b>Bearbeiter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_TYPE__BEARBEITER = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__BEARBEITER;

	/**
	 * The feature id for the '<em><b>Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_TYPE__TYP = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__TYP;

	/**
	 * The feature id for the '<em><b>Historien Protokoll Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_TYPE__HISTORIEN_PROTOKOLL_INFORMATION = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__HISTORIEN_PROTOKOLL_INFORMATION;

	/**
	 * The feature id for the '<em><b>Interner Geschaeftsgang</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_TYPE__INTERNER_GESCHAEFTSGANG = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__INTERNER_GESCHAEFTSGANG;

	/**
	 * The feature id for the '<em><b>Verweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_TYPE__VERWEIS = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__VERWEIS;

	/**
	 * The feature id for the '<em><b>Anlage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_TYPE__ANLAGE = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANLAGE;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_TYPE__AUTOR = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__AUTOR;

	/**
	 * The feature id for the '<em><b>Leser</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_TYPE__LESER = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__LESER;

	/**
	 * The feature id for the '<em><b>Weiterer Kontakt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_TYPE__WEITERER_KONTAKT = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__WEITERER_KONTAKT;

	/**
	 * The feature id for the '<em><b>Anwendungsspezifische Erweiterung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG;

	/**
	 * The feature id for the '<em><b>Anwendungsspezifische Erweiterung XML</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_TYPE__VERSION = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dokument Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_TYPE_FEATURE_COUNT = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dokument Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOKUMENT_TYPE_OPERATION_COUNT = DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.ErfolgOderMisserfolgImportTypeImpl <em>Erfolg Oder Misserfolg Import Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.ErfolgOderMisserfolgImportTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getErfolgOderMisserfolgImportType()
	 * @generated
	 */
	int ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Erfolgreich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__ERFOLGREICH = 0;

	/**
	 * The feature id for the '<em><b>Fehlermeldung</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__FEHLERMELDUNG = 1;

	/**
	 * The feature id for the '<em><b>Fehlermeldung Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__FEHLERMELDUNG_CODE = 2;

	/**
	 * The number of structural features of the '<em>Erfolg Oder Misserfolg Import Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Erfolg Oder Misserfolg Import Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.FeldgruppeTypeImpl <em>Feldgruppe Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.FeldgruppeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getFeldgruppeType()
	 * @generated
	 */
	int FELDGRUPPE_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FELDGRUPPE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FELDGRUPPE_TYPE__BESCHREIBUNG = 1;

	/**
	 * The feature id for the '<em><b>Unterfeldgruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FELDGRUPPE_TYPE__UNTERFELDGRUPPE = 2;

	/**
	 * The feature id for the '<em><b>Feld</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FELDGRUPPE_TYPE__FELD = 3;

	/**
	 * The number of structural features of the '<em>Feldgruppe Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FELDGRUPPE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Feldgruppe Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FELDGRUPPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.FeldTypeImpl <em>Feld Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.FeldTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getFeldType()
	 * @generated
	 */
	int FELD_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FELD_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Beschreibung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FELD_TYPE__BESCHREIBUNG = 1;

	/**
	 * The feature id for the '<em><b>Datentyp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FELD_TYPE__DATENTYP = 2;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FELD_TYPE__WERT = 3;

	/**
	 * The number of structural features of the '<em>Feld Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FELD_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Feld Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FELD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.FormatTypeImpl <em>Format Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.FormatTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getFormatType()
	 * @generated
	 */
	int FORMAT_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Sonstiger Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_TYPE__SONSTIGER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_TYPE__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Primaerdokument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_TYPE__PRIMAERDOKUMENT = 3;

	/**
	 * The number of structural features of the '<em>Format Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Format Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.GeburtTypeImpl <em>Geburt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.GeburtTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getGeburtType()
	 * @generated
	 */
	int GEBURT_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Datum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_TYPE__DATUM = 0;

	/**
	 * The number of structural features of the '<em>Geburt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Geburt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.GeheimhaltungsgradCodeTypeImpl <em>Geheimhaltungsgrad Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.GeheimhaltungsgradCodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getGeheimhaltungsgradCodeType()
	 * @generated
	 */
	int GEHEIMHALTUNGSGRAD_CODE_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEHEIMHALTUNGSGRAD_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEHEIMHALTUNGSGRAD_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEHEIMHALTUNGSGRAD_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEHEIMHALTUNGSGRAD_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Geheimhaltungsgrad Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEHEIMHALTUNGSGRAD_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Geheimhaltungsgrad Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEHEIMHALTUNGSGRAD_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.GeheimhaltungTypeImpl <em>Geheimhaltung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.GeheimhaltungTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getGeheimhaltungType()
	 * @generated
	 */
	int GEHEIMHALTUNG_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Geheimhaltungsgrad</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEHEIMHALTUNG_TYPE__GEHEIMHALTUNGSGRAD = 0;

	/**
	 * The feature id for the '<em><b>Einstufungsfrist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEHEIMHALTUNG_TYPE__EINSTUFUNGSFRIST = 1;

	/**
	 * The feature id for the '<em><b>Eingestuft Am</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEHEIMHALTUNG_TYPE__EINGESTUFT_AM = 2;

	/**
	 * The feature id for the '<em><b>Herausgeber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEHEIMHALTUNG_TYPE__HERAUSGEBER = 3;

	/**
	 * The feature id for the '<em><b>Einstufung Endet Am</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEHEIMHALTUNG_TYPE__EINSTUFUNG_ENDET_AM = 4;

	/**
	 * The feature id for the '<em><b>Bemerkung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEHEIMHALTUNG_TYPE__BEMERKUNG = 5;

	/**
	 * The number of structural features of the '<em>Geheimhaltung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEHEIMHALTUNG_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Geheimhaltung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEHEIMHALTUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.GeschaeftsgangTypeImpl <em>Geschaeftsgang Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.GeschaeftsgangTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getGeschaeftsgangType()
	 * @generated
	 */
	int GESCHAEFTSGANG_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Identifikation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHAEFTSGANG_TYPE__IDENTIFIKATION = 0;

	/**
	 * The feature id for the '<em><b>Beteiligungsschritt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHAEFTSGANG_TYPE__BETEILIGUNGSSCHRITT = 1;

	/**
	 * The number of structural features of the '<em>Geschaeftsgang Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHAEFTSGANG_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Geschaeftsgang Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GESCHAEFTSGANG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.HashTypeImpl <em>Hash Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.HashTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getHashType()
	 * @generated
	 */
	int HASH_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_TYPE__WERT = 0;

	/**
	 * The feature id for the '<em><b>Algorithmus</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_TYPE__ALGORITHMUS = 1;

	/**
	 * The feature id for the '<em><b>Sonstiger Algorithmus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_TYPE__SONSTIGER_ALGORITHMUS = 2;

	/**
	 * The number of structural features of the '<em>Hash Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Hash Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HASH_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.HistorienProtokollInformationTypeImpl <em>Historien Protokoll Information Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.HistorienProtokollInformationTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getHistorienProtokollInformationType()
	 * @generated
	 */
	int HISTORIEN_PROTOKOLL_INFORMATION_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Metadatum Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_NAME = 0;

	/**
	 * The feature id for the '<em><b>Metadatum Alter Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_ALTER_WERT = 1;

	/**
	 * The feature id for the '<em><b>Metadatum Neuer Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_NEUER_WERT = 2;

	/**
	 * The feature id for the '<em><b>Akteur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIEN_PROTOKOLL_INFORMATION_TYPE__AKTEUR = 3;

	/**
	 * The feature id for the '<em><b>Datum Uhrzeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIEN_PROTOKOLL_INFORMATION_TYPE__DATUM_UHRZEIT = 4;

	/**
	 * The feature id for the '<em><b>Bemerkung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIEN_PROTOKOLL_INFORMATION_TYPE__BEMERKUNG = 5;

	/**
	 * The feature id for the '<em><b>Aktion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIEN_PROTOKOLL_INFORMATION_TYPE__AKTION = 6;

	/**
	 * The number of structural features of the '<em>Historien Protokoll Information Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIEN_PROTOKOLL_INFORMATION_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Historien Protokoll Information Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIEN_PROTOKOLL_INFORMATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.IdentifikationNachrichtTypeImpl <em>Identifikation Nachricht Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.IdentifikationNachrichtTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getIdentifikationNachrichtType()
	 * @generated
	 */
	int IDENTIFIKATION_NACHRICHT_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Nachrichten UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTEN_UUID = BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTEN_UUID;

	/**
	 * The feature id for the '<em><b>Nachrichtentyp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTENTYP = BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTENTYP;

	/**
	 * The feature id for the '<em><b>Erstellungszeitpunkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIKATION_NACHRICHT_TYPE__ERSTELLUNGSZEITPUNKT = BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE__ERSTELLUNGSZEITPUNKT;

	/**
	 * The number of structural features of the '<em>Identifikation Nachricht Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIKATION_NACHRICHT_TYPE_FEATURE_COUNT = BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Identifikation Nachricht Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIKATION_NACHRICHT_TYPE_OPERATION_COUNT = BasisnachrichtPackage.IDENTIFIKATION_NACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.IdentifikationObjektTypeImpl <em>Identifikation Objekt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.IdentifikationObjektTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getIdentifikationObjektType()
	 * @generated
	 */
	int IDENTIFIKATION_OBJEKT_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Xdomea UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIKATION_OBJEKT_TYPE__XDOMEA_UUID = 0;

	/**
	 * The feature id for the '<em><b>Nummer Im Uebergeordneten Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIKATION_OBJEKT_TYPE__NUMMER_IM_UEBERGEORDNETEN_CONTAINER = 1;

	/**
	 * The number of structural features of the '<em>Identifikation Objekt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIKATION_OBJEKT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Identifikation Objekt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIKATION_OBJEKT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.KommunikationTypeImpl <em>Kommunikation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.KommunikationTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getKommunikationType()
	 * @generated
	 */
	int KOMMUNIKATION_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Kanal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATION_TYPE__KANAL = BasisnachrichtPackage.KOMMUNIKATION_TYPE__KANAL;

	/**
	 * The feature id for the '<em><b>Kennung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATION_TYPE__KENNUNG = BasisnachrichtPackage.KOMMUNIKATION_TYPE__KENNUNG;

	/**
	 * The feature id for the '<em><b>Zusatz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATION_TYPE__ZUSATZ = BasisnachrichtPackage.KOMMUNIKATION_TYPE__ZUSATZ;

	/**
	 * The feature id for the '<em><b>Ist Dienstlich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATION_TYPE__IST_DIENSTLICH = BasisnachrichtPackage.KOMMUNIKATION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ist Institution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATION_TYPE__IST_INSTITUTION = BasisnachrichtPackage.KOMMUNIKATION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Kommunikation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATION_TYPE_FEATURE_COUNT = BasisnachrichtPackage.KOMMUNIKATION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Kommunikation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATION_TYPE_OPERATION_COUNT = BasisnachrichtPackage.KOMMUNIKATION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.KompressionsverfahrenCodeTypeImpl <em>Kompressionsverfahren Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.KompressionsverfahrenCodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getKompressionsverfahrenCodeType()
	 * @generated
	 */
	int KOMPRESSIONSVERFAHREN_CODE_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMPRESSIONSVERFAHREN_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMPRESSIONSVERFAHREN_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMPRESSIONSVERFAHREN_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMPRESSIONSVERFAHREN_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Kompressionsverfahren Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMPRESSIONSVERFAHREN_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Kompressionsverfahren Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMPRESSIONSVERFAHREN_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.KonfigurationsparameterCodeTypeImpl <em>Konfigurationsparameter Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.KonfigurationsparameterCodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getKonfigurationsparameterCodeType()
	 * @generated
	 */
	int KONFIGURATIONSPARAMETER_CODE_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONFIGURATIONSPARAMETER_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONFIGURATIONSPARAMETER_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONFIGURATIONSPARAMETER_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONFIGURATIONSPARAMETER_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Konfigurationsparameter Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONFIGURATIONSPARAMETER_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Konfigurationsparameter Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONFIGURATIONSPARAMETER_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.KonfigurationsparameterGruppeCodeTypeImpl <em>Konfigurationsparameter Gruppe Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.KonfigurationsparameterGruppeCodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getKonfigurationsparameterGruppeCodeType()
	 * @generated
	 */
	int KONFIGURATIONSPARAMETER_GRUPPE_CODE_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONFIGURATIONSPARAMETER_GRUPPE_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONFIGURATIONSPARAMETER_GRUPPE_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONFIGURATIONSPARAMETER_GRUPPE_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONFIGURATIONSPARAMETER_GRUPPE_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Konfigurationsparameter Gruppe Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONFIGURATIONSPARAMETER_GRUPPE_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Konfigurationsparameter Gruppe Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONFIGURATIONSPARAMETER_GRUPPE_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.KontaktTypeImpl <em>Kontakt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.KontaktTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getKontaktType()
	 * @generated
	 */
	int KONTAKT_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Behoerdenkennung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKT_TYPE__BEHOERDENKENNUNG = 0;

	/**
	 * The feature id for the '<em><b>Name Institution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKT_TYPE__NAME_INSTITUTION = 1;

	/**
	 * The feature id for the '<em><b>Name Organisationseinheit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKT_TYPE__NAME_ORGANISATIONSEINHEIT = 2;

	/**
	 * The feature id for the '<em><b>Name Ansprechpartner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKT_TYPE__NAME_ANSPRECHPARTNER = 3;

	/**
	 * The feature id for the '<em><b>Taetigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKT_TYPE__TAETIGKEIT = 4;

	/**
	 * The feature id for the '<em><b>Zustaendigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKT_TYPE__ZUSTAENDIGKEIT = 5;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKT_TYPE__ANSCHRIFT = 6;

	/**
	 * The feature id for the '<em><b>Erreichbarkeit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKT_TYPE__ERREICHBARKEIT = 7;

	/**
	 * The feature id for the '<em><b>Rolle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKT_TYPE__ROLLE = 8;

	/**
	 * The feature id for the '<em><b>Rolle Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKT_TYPE__ROLLE_CODE = 9;

	/**
	 * The feature id for the '<em><b>Unstrukturierte Anschrift</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKT_TYPE__UNSTRUKTURIERTE_ANSCHRIFT = 10;

	/**
	 * The feature id for the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKT_TYPE__GEBURT = 11;

	/**
	 * The feature id for the '<em><b>Anwendungsspezifische Erweiterung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKT_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG = 12;

	/**
	 * The feature id for the '<em><b>Anwendungsspezifische Erweiterung XML</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKT_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML = 13;

	/**
	 * The number of structural features of the '<em>Kontakt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKT_TYPE_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Kontakt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KONTAKT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.KryptographischeAlgorithmenCodeTypeImpl <em>Kryptographische Algorithmen Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.KryptographischeAlgorithmenCodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getKryptographischeAlgorithmenCodeType()
	 * @generated
	 */
	int KRYPTOGRAPHISCHE_ALGORITHMEN_CODE_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRYPTOGRAPHISCHE_ALGORITHMEN_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRYPTOGRAPHISCHE_ALGORITHMEN_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRYPTOGRAPHISCHE_ALGORITHMEN_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRYPTOGRAPHISCHE_ALGORITHMEN_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Kryptographische Algorithmen Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRYPTOGRAPHISCHE_ALGORITHMEN_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Kryptographische Algorithmen Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KRYPTOGRAPHISCHE_ALGORITHMEN_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.MediumCodeTypeImpl <em>Medium Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.MediumCodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getMediumCodeType()
	 * @generated
	 */
	int MEDIUM_CODE_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Medium Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Medium Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIUM_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.NachrichtenkopfTypeImpl <em>Nachrichtenkopf Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.NachrichtenkopfTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getNachrichtenkopfType()
	 * @generated
	 */
	int NACHRICHTENKOPF_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Identifikation Nachricht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENKOPF_TYPE__IDENTIFIKATION_NACHRICHT = 0;

	/**
	 * The feature id for the '<em><b>Leser</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENKOPF_TYPE__LESER = 1;

	/**
	 * The feature id for the '<em><b>Autor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENKOPF_TYPE__AUTOR = 2;

	/**
	 * The feature id for the '<em><b>Prozess ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENKOPF_TYPE__PROZESS_ID = 3;

	/**
	 * The feature id for the '<em><b>Instanz ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENKOPF_TYPE__INSTANZ_ID = 4;

	/**
	 * The feature id for the '<em><b>Hinweis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENKOPF_TYPE__HINWEIS = 5;

	/**
	 * The feature id for the '<em><b>Anwendungsspezifische Erweiterung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENKOPF_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG = 6;

	/**
	 * The feature id for the '<em><b>Anwendungsspezifische Erweiterung XML</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENKOPF_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML = 7;

	/**
	 * The number of structural features of the '<em>Nachrichtenkopf Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENKOPF_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Nachrichtenkopf Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENKOPF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.NachrichtentypCodeTypeImpl <em>Nachrichtentyp Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.NachrichtentypCodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getNachrichtentypCodeType()
	 * @generated
	 */
	int NACHRICHTENTYP_CODE_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENTYP_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENTYP_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENTYP_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENTYP_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Nachrichtentyp Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENTYP_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Nachrichtentyp Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENTYP_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.NachrichtTypeImpl <em>Nachricht Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.NachrichtTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getNachrichtType()
	 * @generated
	 */
	int NACHRICHT_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_TYPE__NACHRICHTENKOPF = 0;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_TYPE__PRODUKT = 1;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_TYPE__PRODUKTHERSTELLER = 2;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_TYPE__PRODUKTVERSION = 3;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_TYPE__STANDARD = 4;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_TYPE__TEST = 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_TYPE__VERSION = 6;

	/**
	 * The number of structural features of the '<em>Nachricht Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Nachricht Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.NameNatuerlichePersonTypeImpl <em>Name Natuerliche Person Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.NameNatuerlichePersonTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getNameNatuerlichePersonType()
	 * @generated
	 */
	int NAME_NATUERLICHE_PERSON_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Anrede</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_TYPE__ANREDE = 0;

	/**
	 * The feature id for the '<em><b>Titel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_TYPE__TITEL = 1;

	/**
	 * The feature id for the '<em><b>Familienname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_TYPE__FAMILIENNAME = 2;

	/**
	 * The feature id for the '<em><b>Vorname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_TYPE__VORNAME = 3;

	/**
	 * The number of structural features of the '<em>Name Natuerliche Person Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Name Natuerliche Person Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.NameOrganisationTypeImpl <em>Name Organisation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.NameOrganisationTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getNameOrganisationType()
	 * @generated
	 */
	int NAME_ORGANISATION_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ORGANISATION_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Kurzbezeichnung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ORGANISATION_TYPE__KURZBEZEICHNUNG = 1;

	/**
	 * The number of structural features of the '<em>Name Organisation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ORGANISATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Name Organisation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_ORGANISATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.NkFVDatenTypeImpl <em>Nk FV Daten Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.NkFVDatenTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getNkFVDatenType()
	 * @generated
	 */
	int NK_FV_DATEN_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_FV_DATEN_TYPE__NACHRICHTENKOPF = NACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_FV_DATEN_TYPE__PRODUKT = NACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_FV_DATEN_TYPE__PRODUKTHERSTELLER = NACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_FV_DATEN_TYPE__PRODUKTVERSION = NACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_FV_DATEN_TYPE__STANDARD = NACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_FV_DATEN_TYPE__TEST = NACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_FV_DATEN_TYPE__VERSION = NACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Empfangendes System</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_FV_DATEN_TYPE__EMPFANGENDES_SYSTEM = NACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nk FV Daten Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_FV_DATEN_TYPE_FEATURE_COUNT = NACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Nk FV Daten Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_FV_DATEN_TYPE_OPERATION_COUNT = NACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.NkNichtFVDatenEinLeserMitEmpfangsbestaetigungTypeImpl <em>Nk Nicht FV Daten Ein Leser Mit Empfangsbestaetigung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.NkNichtFVDatenEinLeserMitEmpfangsbestaetigungTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getNkNichtFVDatenEinLeserMitEmpfangsbestaetigungType()
	 * @generated
	 */
	int NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__NACHRICHTENKOPF = NACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__PRODUKT = NACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__PRODUKTHERSTELLER = NACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__PRODUKTVERSION = NACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__STANDARD = NACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__TEST = NACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__VERSION = NACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Empfangsbestaetigung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__EMPFANGSBESTAETIGUNG = NACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nk Nicht FV Daten Ein Leser Mit Empfangsbestaetigung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE_FEATURE_COUNT = NACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Nk Nicht FV Daten Ein Leser Mit Empfangsbestaetigung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE_OPERATION_COUNT = NACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.NkNichtFVDatenWeitereLeserTypeImpl <em>Nk Nicht FV Daten Weitere Leser Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.NkNichtFVDatenWeitereLeserTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getNkNichtFVDatenWeitereLeserType()
	 * @generated
	 */
	int NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__NACHRICHTENKOPF = NACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__PRODUKT = NACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__PRODUKTHERSTELLER = NACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__PRODUKTVERSION = NACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__STANDARD = NACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__TEST = NACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__VERSION = NACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Weiterer Leser</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__WEITERER_LESER = NACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nk Nicht FV Daten Weitere Leser Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE_FEATURE_COUNT = NACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Nk Nicht FV Daten Weitere Leser Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE_OPERATION_COUNT = NACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungTypeImpl <em>Nk Nicht FV Daten Weitere Leser Mit Empfangsbestaetigung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getNkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType()
	 * @generated
	 */
	int NK_NICHT_FV_DATEN_WEITERE_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_WEITERE_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__NACHRICHTENKOPF = NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_WEITERE_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__PRODUKT = NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_WEITERE_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__PRODUKTHERSTELLER = NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_WEITERE_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__PRODUKTVERSION = NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_WEITERE_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__STANDARD = NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_WEITERE_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__TEST = NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_WEITERE_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__VERSION = NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Weiterer Leser</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_WEITERE_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__WEITERER_LESER = NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__WEITERER_LESER;

	/**
	 * The feature id for the '<em><b>Empfangsbestaetigung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_WEITERE_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__EMPFANGSBESTAETIGUNG = NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nk Nicht FV Daten Weitere Leser Mit Empfangsbestaetigung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_WEITERE_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE_FEATURE_COUNT = NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Nk Nicht FV Daten Weitere Leser Mit Empfangsbestaetigung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NK_NICHT_FV_DATEN_WEITERE_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE_OPERATION_COUNT = NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.OrganisationseinheitTypeImpl <em>Organisationseinheit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.OrganisationseinheitTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getOrganisationseinheitType()
	 * @generated
	 */
	int ORGANISATIONSEINHEIT_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATIONSEINHEIT_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Organisationseinheit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATIONSEINHEIT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Organisationseinheit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORGANISATIONSEINHEIT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.PfadelementTypeImpl <em>Pfadelement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.PfadelementTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getPfadelementType()
	 * @generated
	 */
	int PFADELEMENT_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFADELEMENT_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFADELEMENT_TYPE__TYP = 1;

	/**
	 * The feature id for the '<em><b>Pfadelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFADELEMENT_TYPE__PFADELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Pfadelement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFADELEMENT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Pfadelement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PFADELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.PrimaerdokumentTypeImpl <em>Primaerdokument Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.PrimaerdokumentTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getPrimaerdokumentType()
	 * @generated
	 */
	int PRIMAERDOKUMENT_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Dateiname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMAERDOKUMENT_TYPE__DATEINAME = 0;

	/**
	 * The feature id for the '<em><b>Dateiname Original</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMAERDOKUMENT_TYPE__DATEINAME_ORIGINAL = 1;

	/**
	 * The feature id for the '<em><b>Ersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMAERDOKUMENT_TYPE__ERSTELLER = 2;

	/**
	 * The feature id for the '<em><b>Datum Uhrzeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMAERDOKUMENT_TYPE__DATUM_UHRZEIT = 3;

	/**
	 * The feature id for the '<em><b>Signatur Siegel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMAERDOKUMENT_TYPE__SIGNATUR_SIEGEL = 4;

	/**
	 * The feature id for the '<em><b>Zeitpunkt Letzte Aenderung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMAERDOKUMENT_TYPE__ZEITPUNKT_LETZTE_AENDERUNG = 5;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMAERDOKUMENT_TYPE__HASH = 6;

	/**
	 * The number of structural features of the '<em>Primaerdokument Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMAERDOKUMENT_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Primaerdokument Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMAERDOKUMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.RolleCodeTypeImpl <em>Rolle Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.RolleCodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getRolleCodeType()
	 * @generated
	 */
	int ROLLE_CODE_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLE_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLE_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLE_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLE_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Rolle Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLE_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rolle Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLLE_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SchriftgutobjekttypCodeTypeImpl <em>Schriftgutobjekttyp Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SchriftgutobjekttypCodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSchriftgutobjekttypCodeType()
	 * @generated
	 */
	int SCHRIFTGUTOBJEKTTYP_CODE_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRIFTGUTOBJEKTTYP_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRIFTGUTOBJEKTTYP_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRIFTGUTOBJEKTTYP_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRIFTGUTOBJEKTTYP_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Schriftgutobjekttyp Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRIFTGUTOBJEKTTYP_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Schriftgutobjekttyp Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHRIFTGUTOBJEKTTYP_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SignaturSiegelTypeImpl <em>Signatur Siegel Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SignaturSiegelTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSignaturSiegelType()
	 * @generated
	 */
	int SIGNATUR_SIEGEL_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Signatur Siegel Eingebettet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATUR_SIEGEL_TYPE__SIGNATUR_SIEGEL_EINGEBETTET = 0;

	/**
	 * The feature id for the '<em><b>Signatur Siegel Datei</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATUR_SIEGEL_TYPE__SIGNATUR_SIEGEL_DATEI = 1;

	/**
	 * The number of structural features of the '<em>Signatur Siegel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATUR_SIEGEL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Signatur Siegel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATUR_SIEGEL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SonstigeFehlermeldungCodeTypeImpl <em>Sonstige Fehlermeldung Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SonstigeFehlermeldungCodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSonstigeFehlermeldungCodeType()
	 * @generated
	 */
	int SONSTIGE_FEHLERMELDUNG_CODE_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_FEHLERMELDUNG_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_FEHLERMELDUNG_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_FEHLERMELDUNG_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_FEHLERMELDUNG_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Sonstige Fehlermeldung Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_FEHLERMELDUNG_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sonstige Fehlermeldung Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SONSTIGE_FEHLERMELDUNG_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0601CodeTypeImpl <em>Spezifische Fehlermeldung0601 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0601CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0601CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0601_CODE_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0601_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0601_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0601_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0601_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0601 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0601_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0601 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0601_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0602CodeTypeImpl <em>Spezifische Fehlermeldung0602 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0602CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0602CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0602_CODE_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0602_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0602_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0602_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0602_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0602 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0602_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0602 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0602_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0603CodeTypeImpl <em>Spezifische Fehlermeldung0603 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0603CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0603CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0603_CODE_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0603_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0603_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0603_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0603_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0603 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0603_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0603 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0603_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0604CodeTypeImpl <em>Spezifische Fehlermeldung0604 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0604CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0604CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0604_CODE_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0604_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0604_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0604_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0604_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0604 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0604_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0604 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0604_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0605CodeTypeImpl <em>Spezifische Fehlermeldung0605 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0605CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0605CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0605_CODE_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0605_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0605_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0605_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0605_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0605 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0605_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0605 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0605_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0606CodeTypeImpl <em>Spezifische Fehlermeldung0606 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0606CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0606CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0606_CODE_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0606_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0606_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0606_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0606_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0606 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0606_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0606 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0606_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0607CodeTypeImpl <em>Spezifische Fehlermeldung0607 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0607CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0607CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0607_CODE_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0607_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0607_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0607_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0607_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0607 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0607_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0607 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0607_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0608CodeTypeImpl <em>Spezifische Fehlermeldung0608 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0608CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0608CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0608_CODE_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0608_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0608_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0608_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0608_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0608 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0608_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0608 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0608_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0609CodeTypeImpl <em>Spezifische Fehlermeldung0609 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0609CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0609CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0609_CODE_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0609_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0609_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0609_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0609_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0609 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0609_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0609 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0609_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0610CodeTypeImpl <em>Spezifische Fehlermeldung0610 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0610CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0610CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0610_CODE_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0610_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0610_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0610_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0610_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0610 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0610_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0610 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0610_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0611CodeTypeImpl <em>Spezifische Fehlermeldung0611 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0611CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0611CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0611_CODE_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0611_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0611_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0611_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0611_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0611 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0611_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0611 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0611_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0612CodeTypeImpl <em>Spezifische Fehlermeldung0612 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0612CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0612CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0612_CODE_TYPE = 76;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0612_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0612_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0612_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0612_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0612 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0612_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0612 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0612_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0613CodeTypeImpl <em>Spezifische Fehlermeldung0613 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0613CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0613CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0613_CODE_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0613_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0613_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0613_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0613_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0613 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0613_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0613 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0613_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0614CodeTypeImpl <em>Spezifische Fehlermeldung0614 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0614CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0614CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0614_CODE_TYPE = 78;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0614_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0614_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0614_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0614_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0614 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0614_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0614 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0614_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0615CodeTypeImpl <em>Spezifische Fehlermeldung0615 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0615CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0615CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0615_CODE_TYPE = 79;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0615_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0615_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0615_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0615_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0615 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0615_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0615 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0615_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0616CodeTypeImpl <em>Spezifische Fehlermeldung0616 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0616CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0616CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0616_CODE_TYPE = 80;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0616_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0616_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0616_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0616_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0616 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0616_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0616 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0616_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0617CodeTypeImpl <em>Spezifische Fehlermeldung0617 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0617CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0617CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0617_CODE_TYPE = 81;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0617_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0617_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0617_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0617_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0617 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0617_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0617 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0617_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0618CodeTypeImpl <em>Spezifische Fehlermeldung0618 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0618CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0618CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0618_CODE_TYPE = 82;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0618_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0618_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0618_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0618_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0618 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0618_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0618 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0618_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0619CodeTypeImpl <em>Spezifische Fehlermeldung0619 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0619CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0619CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0619_CODE_TYPE = 83;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0619_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0619_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0619_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0619_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0619 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0619_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0619 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0619_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0620CodeTypeImpl <em>Spezifische Fehlermeldung0620 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0620CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0620CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0620_CODE_TYPE = 84;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0620_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0620_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0620_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0620_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0620 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0620_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0620 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0620_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0621CodeTypeImpl <em>Spezifische Fehlermeldung0621 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0621CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0621CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0621_CODE_TYPE = 85;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0621_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0621_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0621_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0621_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0621 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0621_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0621 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0621_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0622CodeTypeImpl <em>Spezifische Fehlermeldung0622 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0622CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0622CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0622_CODE_TYPE = 86;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0622_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0622_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0622_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0622_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0622 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0622_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0622 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0622_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0623CodeTypeImpl <em>Spezifische Fehlermeldung0623 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0623CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0623CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0623_CODE_TYPE = 87;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0623_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0623_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0623_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0623_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0623 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0623_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0623 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0623_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0624CodeTypeImpl <em>Spezifische Fehlermeldung0624 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0624CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0624CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0624_CODE_TYPE = 88;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0624_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0624_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0624_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0624_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0624 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0624_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0624 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0624_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0625CodeTypeImpl <em>Spezifische Fehlermeldung0625 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0625CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0625CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0625_CODE_TYPE = 89;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0625_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0625_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0625_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0625_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0625 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0625_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0625 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0625_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0626CodeTypeImpl <em>Spezifische Fehlermeldung0626 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0626CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0626CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0626_CODE_TYPE = 90;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0626_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0626_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0626_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0626_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0626 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0626_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0626 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0626_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0627CodeTypeImpl <em>Spezifische Fehlermeldung0627 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0627CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0627CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0627_CODE_TYPE = 91;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0627_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0627_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0627_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0627_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0627 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0627_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0627 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0627_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0628CodeTypeImpl <em>Spezifische Fehlermeldung0628 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0628CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0628CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0628_CODE_TYPE = 92;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0628_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0628_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0628_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0628_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0628 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0628_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0628 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0628_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0631CodeTypeImpl <em>Spezifische Fehlermeldung0631 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0631CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0631CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0631_CODE_TYPE = 93;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0631_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0631_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0631_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0631_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0631 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0631_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0631 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0631_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0632CodeTypeImpl <em>Spezifische Fehlermeldung0632 Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0632CodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0632CodeType()
	 * @generated
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0632_CODE_TYPE = 94;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0632_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0632_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0632_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0632_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Spezifische Fehlermeldung0632 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0632_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spezifische Fehlermeldung0632 Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEZIFISCHE_FEHLERMELDUNG0632_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.StaatCodeTypeImpl <em>Staat Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.StaatCodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getStaatCodeType()
	 * @generated
	 */
	int STAAT_CODE_TYPE = 95;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAAT_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAAT_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAAT_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAAT_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Staat Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAAT_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Staat Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAAT_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.StaatTypeImpl <em>Staat Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.StaatTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getStaatType()
	 * @generated
	 */
	int STAAT_TYPE = 96;

	/**
	 * The feature id for the '<em><b>Staat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAAT_TYPE__STAAT = 0;

	/**
	 * The number of structural features of the '<em>Staat Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAAT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Staat Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAAT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.StrukturelementTypCodeTypeImpl <em>Strukturelement Typ Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.StrukturelementTypCodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getStrukturelementTypCodeType()
	 * @generated
	 */
	int STRUKTURELEMENT_TYP_CODE_TYPE = 97;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUKTURELEMENT_TYP_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUKTURELEMENT_TYP_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUKTURELEMENT_TYP_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUKTURELEMENT_TYP_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Strukturelement Typ Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUKTURELEMENT_TYP_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Strukturelement Typ Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUKTURELEMENT_TYP_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.StrukturpfadTypeImpl <em>Strukturpfad Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.StrukturpfadTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getStrukturpfadType()
	 * @generated
	 */
	int STRUKTURPFAD_TYPE = 98;

	/**
	 * The feature id for the '<em><b>Pfadelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUKTURPFAD_TYPE__PFADELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Strukturpfad Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUKTURPFAD_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Strukturpfad Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUKTURPFAD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.SystemTypeImpl <em>System Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.SystemTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSystemType()
	 * @generated
	 */
	int SYSTEM_TYPE = 99;

	/**
	 * The feature id for the '<em><b>Instanz ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__INSTANZ_ID = 0;

	/**
	 * The feature id for the '<em><b>Produktname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__PRODUKTNAME = 1;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__PRODUKTVERSION = 2;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE__PRODUKTHERSTELLER = 3;

	/**
	 * The number of structural features of the '<em>System Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>System Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.TransportwegCodeTypeImpl <em>Transportweg Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.TransportwegCodeTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getTransportwegCodeType()
	 * @generated
	 */
	int TRANSPORTWEG_CODE_TYPE = 100;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTWEG_CODE_TYPE__CODE = CodePackage.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTWEG_CODE_TYPE__NAME = CodePackage.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTWEG_CODE_TYPE__LIST_URI = CodePackage.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTWEG_CODE_TYPE__LIST_VERSION_ID = CodePackage.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Transportweg Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTWEG_CODE_TYPE_FEATURE_COUNT = CodePackage.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transportweg Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSPORTWEG_CODE_TYPE_OPERATION_COUNT = CodePackage.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.UnstrukturierteAnschriftTypeImpl <em>Unstrukturierte Anschrift Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.UnstrukturierteAnschriftTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getUnstrukturierteAnschriftType()
	 * @generated
	 */
	int UNSTRUKTURIERTE_ANSCHRIFT_TYPE = 101;

	/**
	 * The feature id for the '<em><b>Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUKTURIERTE_ANSCHRIFT_TYPE__TYP = 0;

	/**
	 * The feature id for the '<em><b>Zeile1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE1 = 1;

	/**
	 * The feature id for the '<em><b>Zeile2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE2 = 2;

	/**
	 * The feature id for the '<em><b>Zeile3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE3 = 3;

	/**
	 * The feature id for the '<em><b>Zeile4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE4 = 4;

	/**
	 * The feature id for the '<em><b>Zeile5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE5 = 5;

	/**
	 * The feature id for the '<em><b>Zeile6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE6 = 6;

	/**
	 * The feature id for the '<em><b>Zusatz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZUSATZ = 7;

	/**
	 * The number of structural features of the '<em>Unstrukturierte Anschrift Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUKTURIERTE_ANSCHRIFT_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Unstrukturierte Anschrift Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUKTURIERTE_ANSCHRIFT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.VerfuegungTypeImpl <em>Verfuegung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.VerfuegungTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getVerfuegungType()
	 * @generated
	 */
	int VERFUEGUNG_TYPE = 102;

	/**
	 * The feature id for the '<em><b>Ersteller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERFUEGUNG_TYPE__ERSTELLER = 0;

	/**
	 * The feature id for the '<em><b>Adressat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERFUEGUNG_TYPE__ADRESSAT = 1;

	/**
	 * The feature id for the '<em><b>Erstellungsdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERFUEGUNG_TYPE__ERSTELLUNGSDATUM = 2;

	/**
	 * The feature id for the '<em><b>Erstellungsuhrzeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERFUEGUNG_TYPE__ERSTELLUNGSUHRZEIT = 3;

	/**
	 * The feature id for the '<em><b>Verfuegung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERFUEGUNG_TYPE__VERFUEGUNG = 4;

	/**
	 * The feature id for the '<em><b>Termin Datum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERFUEGUNG_TYPE__TERMIN_DATUM = 5;

	/**
	 * The feature id for the '<em><b>Termin Uhrzeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERFUEGUNG_TYPE__TERMIN_UHRZEIT = 6;

	/**
	 * The feature id for the '<em><b>Notiz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERFUEGUNG_TYPE__NOTIZ = 7;

	/**
	 * The number of structural features of the '<em>Verfuegung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERFUEGUNG_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Verfuegung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERFUEGUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.VersionTypeImpl <em>Version Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.VersionTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getVersionType()
	 * @generated
	 */
	int VERSION_TYPE = 103;

	/**
	 * The feature id for the '<em><b>Nummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TYPE__NUMMER = 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TYPE__FORMAT = 1;

	/**
	 * The number of structural features of the '<em>Version Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Version Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.VerweisTypeImpl <em>Verweis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.VerweisTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getVerweisType()
	 * @generated
	 */
	int VERWEIS_TYPE = 104;

	/**
	 * The feature id for the '<em><b>Xdomea UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWEIS_TYPE__XDOMEA_UUID = 0;

	/**
	 * The feature id for the '<em><b>SGO Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWEIS_TYPE__SGO_TYP = 1;

	/**
	 * The feature id for the '<em><b>SGO Kennzeichen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWEIS_TYPE__SGO_KENNZEICHEN = 2;

	/**
	 * The feature id for the '<em><b>Bemerkung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWEIS_TYPE__BEMERKUNG = 3;

	/**
	 * The number of structural features of the '<em>Verweis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWEIS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Verweis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERWEIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.VorgangTypeImpl <em>Vorgang Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.VorgangTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getVorgangType()
	 * @generated
	 */
	int VORGANG_TYPE = 105;

	/**
	 * The feature id for the '<em><b>Identifikation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORGANG_TYPE__IDENTIFIKATION = 0;

	/**
	 * The feature id for the '<em><b>Allgemeine Metadaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORGANG_TYPE__ALLGEMEINE_METADATEN = 1;

	/**
	 * The feature id for the '<em><b>Aussonderungsmetadaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORGANG_TYPE__AUSSONDERUNGSMETADATEN = 2;

	/**
	 * The feature id for the '<em><b>Aktenbetreff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORGANG_TYPE__AKTENBETREFF = 3;

	/**
	 * The feature id for the '<em><b>Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORGANG_TYPE__TYP = 4;

	/**
	 * The feature id for the '<em><b>Zd A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORGANG_TYPE__ZD_A = 5;

	/**
	 * The feature id for the '<em><b>Zd ADatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORGANG_TYPE__ZD_ADATUM = 6;

	/**
	 * The feature id for the '<em><b>Laufzeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORGANG_TYPE__LAUFZEIT = 7;

	/**
	 * The feature id for the '<em><b>Historien Protokoll Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORGANG_TYPE__HISTORIEN_PROTOKOLL_INFORMATION = 8;

	/**
	 * The feature id for the '<em><b>Interner Geschaeftsgang</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORGANG_TYPE__INTERNER_GESCHAEFTSGANG = 9;

	/**
	 * The feature id for the '<em><b>Dokument Oder Dokument Mit Schriftstueck</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORGANG_TYPE__DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK = 10;

	/**
	 * The feature id for the '<em><b>Verweis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORGANG_TYPE__VERWEIS = 11;

	/**
	 * The feature id for the '<em><b>Kontakt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORGANG_TYPE__KONTAKT = 12;

	/**
	 * The feature id for the '<em><b>Teilvorgang</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORGANG_TYPE__TEILVORGANG = 13;

	/**
	 * The feature id for the '<em><b>Anwendungsspezifische Erweiterung</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORGANG_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG = 14;

	/**
	 * The feature id for the '<em><b>Anwendungsspezifische Erweiterung XML</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORGANG_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML = 15;

	/**
	 * The number of structural features of the '<em>Vorgang Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORGANG_TYPE_FEATURE_COUNT = 16;

	/**
	 * The number of operations of the '<em>Vorgang Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VORGANG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.domea.domea.impl.ZeitraumTypeImpl <em>Zeitraum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.domea.domea.impl.ZeitraumTypeImpl
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getZeitraumType()
	 * @generated
	 */
	int ZEITRAUM_TYPE = 106;

	/**
	 * The feature id for the '<em><b>Beginn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZEITRAUM_TYPE__BEGINN = 0;

	/**
	 * The feature id for the '<em><b>Ende</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZEITRAUM_TYPE__ENDE = 1;

	/**
	 * The number of structural features of the '<em>Zeitraum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZEITRAUM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Zeitraum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZEITRAUM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>String Dateiname Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getStringDateinameType()
	 * @generated
	 */
	int STRING_DATEINAME_TYPE = 107;


	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.AkteninhaltType <em>Akteninhalt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Akteninhalt Type</em>'.
	 * @see de.xoev.domea.domea.AkteninhaltType
	 * @generated
	 */
	EClass getAkteninhaltType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.AkteninhaltType#getDokumentOderDokumentMitSchriftstueck <em>Dokument Oder Dokument Mit Schriftstueck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dokument Oder Dokument Mit Schriftstueck</em>'.
	 * @see de.xoev.domea.domea.AkteninhaltType#getDokumentOderDokumentMitSchriftstueck()
	 * @see #getAkteninhaltType()
	 * @generated
	 */
	EReference getAkteninhaltType_DokumentOderDokumentMitSchriftstueck();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.AkteninhaltType#getVorgang <em>Vorgang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vorgang</em>'.
	 * @see de.xoev.domea.domea.AkteninhaltType#getVorgang()
	 * @see #getAkteninhaltType()
	 * @generated
	 */
	EReference getAkteninhaltType_Vorgang();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.AkteninhaltType#getTeilakte <em>Teilakte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teilakte</em>'.
	 * @see de.xoev.domea.domea.AkteninhaltType#getTeilakte()
	 * @see #getAkteninhaltType()
	 * @generated
	 */
	EReference getAkteninhaltType_Teilakte();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType <em>Aktenplaneinheit Aktenplan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aktenplaneinheit Aktenplan Type</em>'.
	 * @see de.xoev.domea.domea.AktenplaneinheitAktenplanType
	 * @generated
	 */
	EClass getAktenplaneinheitAktenplanType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType#getAussonderungsart <em>Aussonderungsart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aussonderungsart</em>'.
	 * @see de.xoev.domea.domea.AktenplaneinheitAktenplanType#getAussonderungsart()
	 * @see #getAktenplaneinheitAktenplanType()
	 * @generated
	 */
	EReference getAktenplaneinheitAktenplanType_Aussonderungsart();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType#getGueltigkeit <em>Gueltigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gueltigkeit</em>'.
	 * @see de.xoev.domea.domea.AktenplaneinheitAktenplanType#getGueltigkeit()
	 * @see #getAktenplaneinheitAktenplanType()
	 * @generated
	 */
	EReference getAktenplaneinheitAktenplanType_Gueltigkeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType#isStillgelegt <em>Stillgelegt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stillgelegt</em>'.
	 * @see de.xoev.domea.domea.AktenplaneinheitAktenplanType#isStillgelegt()
	 * @see #getAktenplaneinheitAktenplanType()
	 * @generated
	 */
	EAttribute getAktenplaneinheitAktenplanType_Stillgelegt();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType#getAufbewahrungsdauer <em>Aufbewahrungsdauer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aufbewahrungsdauer</em>'.
	 * @see de.xoev.domea.domea.AktenplaneinheitAktenplanType#getAufbewahrungsdauer()
	 * @see #getAktenplaneinheitAktenplanType()
	 * @generated
	 */
	EReference getAktenplaneinheitAktenplanType_Aufbewahrungsdauer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType#getEinheit <em>Einheit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Einheit</em>'.
	 * @see de.xoev.domea.domea.AktenplaneinheitAktenplanType#getEinheit()
	 * @see #getAktenplaneinheitAktenplanType()
	 * @generated
	 */
	EReference getAktenplaneinheitAktenplanType_Einheit();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType#getVerweisAktenplaneinheit <em>Verweis Aktenplaneinheit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Verweis Aktenplaneinheit</em>'.
	 * @see de.xoev.domea.domea.AktenplaneinheitAktenplanType#getVerweisAktenplaneinheit()
	 * @see #getAktenplaneinheitAktenplanType()
	 * @generated
	 */
	EAttribute getAktenplaneinheitAktenplanType_VerweisAktenplaneinheit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType#getAnwendungsspezifischeErweiterung <em>Anwendungsspezifische Erweiterung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anwendungsspezifische Erweiterung</em>'.
	 * @see de.xoev.domea.domea.AktenplaneinheitAktenplanType#getAnwendungsspezifischeErweiterung()
	 * @see #getAktenplaneinheitAktenplanType()
	 * @generated
	 */
	EReference getAktenplaneinheitAktenplanType_AnwendungsspezifischeErweiterung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.AktenplaneinheitAktenplanType#getAnwendungsspezifischeErweiterungXML <em>Anwendungsspezifische Erweiterung XML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anwendungsspezifische Erweiterung XML</em>'.
	 * @see de.xoev.domea.domea.AktenplaneinheitAktenplanType#getAnwendungsspezifischeErweiterungXML()
	 * @see #getAktenplaneinheitAktenplanType()
	 * @generated
	 */
	EReference getAktenplaneinheitAktenplanType_AnwendungsspezifischeErweiterungXML();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.AktenplaneinheitType <em>Aktenplaneinheit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aktenplaneinheit Type</em>'.
	 * @see de.xoev.domea.domea.AktenplaneinheitType
	 * @generated
	 */
	EClass getAktenplaneinheitType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AktenplaneinheitType#getKennzeichen <em>Kennzeichen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kennzeichen</em>'.
	 * @see de.xoev.domea.domea.AktenplaneinheitType#getKennzeichen()
	 * @see #getAktenplaneinheitType()
	 * @generated
	 */
	EAttribute getAktenplaneinheitType_Kennzeichen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AktenplaneinheitType#getInhaltsangabe <em>Inhaltsangabe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inhaltsangabe</em>'.
	 * @see de.xoev.domea.domea.AktenplaneinheitType#getInhaltsangabe()
	 * @see #getAktenplaneinheitType()
	 * @generated
	 */
	EAttribute getAktenplaneinheitType_Inhaltsangabe();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AktenplaneinheitType#getBetreffKurz <em>Betreff Kurz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Betreff Kurz</em>'.
	 * @see de.xoev.domea.domea.AktenplaneinheitType#getBetreffKurz()
	 * @see #getAktenplaneinheitType()
	 * @generated
	 */
	EAttribute getAktenplaneinheitType_BetreffKurz();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.AktenplanType <em>Aktenplan Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aktenplan Type</em>'.
	 * @see de.xoev.domea.domea.AktenplanType
	 * @generated
	 */
	EClass getAktenplanType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AktenplanType#getBezeichnung <em>Bezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezeichnung</em>'.
	 * @see de.xoev.domea.domea.AktenplanType#getBezeichnung()
	 * @see #getAktenplanType()
	 * @generated
	 */
	EAttribute getAktenplanType_Bezeichnung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AktenplanType#getTyp <em>Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typ</em>'.
	 * @see de.xoev.domea.domea.AktenplanType#getTyp()
	 * @see #getAktenplanType()
	 * @generated
	 */
	EAttribute getAktenplanType_Typ();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AktenplanType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.xoev.domea.domea.AktenplanType#getVersion()
	 * @see #getAktenplanType()
	 * @generated
	 */
	EAttribute getAktenplanType_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.AktenplanType#getEinheit <em>Einheit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Einheit</em>'.
	 * @see de.xoev.domea.domea.AktenplanType#getEinheit()
	 * @see #getAktenplanType()
	 * @generated
	 */
	EReference getAktenplanType_Einheit();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.AktenplanType#getGueltigkeit <em>Gueltigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gueltigkeit</em>'.
	 * @see de.xoev.domea.domea.AktenplanType#getGueltigkeit()
	 * @see #getAktenplanType()
	 * @generated
	 */
	EReference getAktenplanType_Gueltigkeit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.AktenplanType#getAktenplandatei <em>Aktenplandatei</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aktenplandatei</em>'.
	 * @see de.xoev.domea.domea.AktenplanType#getAktenplandatei()
	 * @see #getAktenplanType()
	 * @generated
	 */
	EReference getAktenplanType_Aktenplandatei();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.AkteType <em>Akte Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Akte Type</em>'.
	 * @see de.xoev.domea.domea.AkteType
	 * @generated
	 */
	EClass getAkteType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.AkteType#getIdentifikation <em>Identifikation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifikation</em>'.
	 * @see de.xoev.domea.domea.AkteType#getIdentifikation()
	 * @see #getAkteType()
	 * @generated
	 */
	EReference getAkteType_Identifikation();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.AkteType#getAllgemeineMetadaten <em>Allgemeine Metadaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allgemeine Metadaten</em>'.
	 * @see de.xoev.domea.domea.AkteType#getAllgemeineMetadaten()
	 * @see #getAkteType()
	 * @generated
	 */
	EReference getAkteType_AllgemeineMetadaten();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.AkteType#getAussonderungsmetadaten <em>Aussonderungsmetadaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aussonderungsmetadaten</em>'.
	 * @see de.xoev.domea.domea.AkteType#getAussonderungsmetadaten()
	 * @see #getAkteType()
	 * @generated
	 */
	EReference getAkteType_Aussonderungsmetadaten();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AkteType#getStandort <em>Standort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standort</em>'.
	 * @see de.xoev.domea.domea.AkteType#getStandort()
	 * @see #getAkteType()
	 * @generated
	 */
	EAttribute getAkteType_Standort();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AkteType#getTyp <em>Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typ</em>'.
	 * @see de.xoev.domea.domea.AkteType#getTyp()
	 * @see #getAkteType()
	 * @generated
	 */
	EAttribute getAkteType_Typ();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.AkteType#getLaufzeit <em>Laufzeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Laufzeit</em>'.
	 * @see de.xoev.domea.domea.AkteType#getLaufzeit()
	 * @see #getAkteType()
	 * @generated
	 */
	EReference getAkteType_Laufzeit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.AkteType#getHistorienProtokollInformation <em>Historien Protokoll Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Historien Protokoll Information</em>'.
	 * @see de.xoev.domea.domea.AkteType#getHistorienProtokollInformation()
	 * @see #getAkteType()
	 * @generated
	 */
	EReference getAkteType_HistorienProtokollInformation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.AkteType#getInternerGeschaeftsgang <em>Interner Geschaeftsgang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interner Geschaeftsgang</em>'.
	 * @see de.xoev.domea.domea.AkteType#getInternerGeschaeftsgang()
	 * @see #getAkteType()
	 * @generated
	 */
	EReference getAkteType_InternerGeschaeftsgang();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.AkteType#getAkteninhalt <em>Akteninhalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Akteninhalt</em>'.
	 * @see de.xoev.domea.domea.AkteType#getAkteninhalt()
	 * @see #getAkteType()
	 * @generated
	 */
	EReference getAkteType_Akteninhalt();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.AkteType#getVerweis <em>Verweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verweis</em>'.
	 * @see de.xoev.domea.domea.AkteType#getVerweis()
	 * @see #getAkteType()
	 * @generated
	 */
	EReference getAkteType_Verweis();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.AkteType#getKontakt <em>Kontakt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kontakt</em>'.
	 * @see de.xoev.domea.domea.AkteType#getKontakt()
	 * @see #getAkteType()
	 * @generated
	 */
	EReference getAkteType_Kontakt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AkteType#isZdA <em>Zd A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zd A</em>'.
	 * @see de.xoev.domea.domea.AkteType#isZdA()
	 * @see #getAkteType()
	 * @generated
	 */
	EAttribute getAkteType_ZdA();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AkteType#getZdADatum <em>Zd ADatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zd ADatum</em>'.
	 * @see de.xoev.domea.domea.AkteType#getZdADatum()
	 * @see #getAkteType()
	 * @generated
	 */
	EAttribute getAkteType_ZdADatum();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.AkteType#getAnwendungsspezifischeErweiterung <em>Anwendungsspezifische Erweiterung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anwendungsspezifische Erweiterung</em>'.
	 * @see de.xoev.domea.domea.AkteType#getAnwendungsspezifischeErweiterung()
	 * @see #getAkteType()
	 * @generated
	 */
	EReference getAkteType_AnwendungsspezifischeErweiterung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.AkteType#getAnwendungsspezifischeErweiterungXML <em>Anwendungsspezifische Erweiterung XML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anwendungsspezifische Erweiterung XML</em>'.
	 * @see de.xoev.domea.domea.AkteType#getAnwendungsspezifischeErweiterungXML()
	 * @see #getAkteType()
	 * @generated
	 */
	EReference getAkteType_AnwendungsspezifischeErweiterungXML();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.AllgemeineMetadatenType <em>Allgemeine Metadaten Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allgemeine Metadaten Type</em>'.
	 * @see de.xoev.domea.domea.AllgemeineMetadatenType
	 * @generated
	 */
	EClass getAllgemeineMetadatenType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getBetreff <em>Betreff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Betreff</em>'.
	 * @see de.xoev.domea.domea.AllgemeineMetadatenType#getBetreff()
	 * @see #getAllgemeineMetadatenType()
	 * @generated
	 */
	EAttribute getAllgemeineMetadatenType_Betreff();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getKennzeichen <em>Kennzeichen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kennzeichen</em>'.
	 * @see de.xoev.domea.domea.AllgemeineMetadatenType#getKennzeichen()
	 * @see #getAllgemeineMetadatenType()
	 * @generated
	 */
	EAttribute getAllgemeineMetadatenType_Kennzeichen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getFederfuehrung <em>Federfuehrung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Federfuehrung</em>'.
	 * @see de.xoev.domea.domea.AllgemeineMetadatenType#getFederfuehrung()
	 * @see #getAllgemeineMetadatenType()
	 * @generated
	 */
	EAttribute getAllgemeineMetadatenType_Federfuehrung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getAktenfuehrung <em>Aktenfuehrung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aktenfuehrung</em>'.
	 * @see de.xoev.domea.domea.AllgemeineMetadatenType#getAktenfuehrung()
	 * @see #getAllgemeineMetadatenType()
	 * @generated
	 */
	EAttribute getAllgemeineMetadatenType_Aktenfuehrung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getGeheimhaltung <em>Geheimhaltung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geheimhaltung</em>'.
	 * @see de.xoev.domea.domea.AllgemeineMetadatenType#getGeheimhaltung()
	 * @see #getAllgemeineMetadatenType()
	 * @generated
	 */
	EReference getAllgemeineMetadatenType_Geheimhaltung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getBemerkung <em>Bemerkung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bemerkung</em>'.
	 * @see de.xoev.domea.domea.AllgemeineMetadatenType#getBemerkung()
	 * @see #getAllgemeineMetadatenType()
	 * @generated
	 */
	EAttribute getAllgemeineMetadatenType_Bemerkung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getMedium <em>Medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Medium</em>'.
	 * @see de.xoev.domea.domea.AllgemeineMetadatenType#getMedium()
	 * @see #getAllgemeineMetadatenType()
	 * @generated
	 */
	EReference getAllgemeineMetadatenType_Medium();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getAktenplaneinheit <em>Aktenplaneinheit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aktenplaneinheit</em>'.
	 * @see de.xoev.domea.domea.AllgemeineMetadatenType#getAktenplaneinheit()
	 * @see #getAllgemeineMetadatenType()
	 * @generated
	 */
	EReference getAllgemeineMetadatenType_Aktenplaneinheit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getZeitpunktLetzteAenderung <em>Zeitpunkt Letzte Aenderung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zeitpunkt Letzte Aenderung</em>'.
	 * @see de.xoev.domea.domea.AllgemeineMetadatenType#getZeitpunktLetzteAenderung()
	 * @see #getAllgemeineMetadatenType()
	 * @generated
	 */
	EAttribute getAllgemeineMetadatenType_ZeitpunktLetzteAenderung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getStrukturpfad <em>Strukturpfad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strukturpfad</em>'.
	 * @see de.xoev.domea.domea.AllgemeineMetadatenType#getStrukturpfad()
	 * @see #getAllgemeineMetadatenType()
	 * @generated
	 */
	EReference getAllgemeineMetadatenType_Strukturpfad();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getDatenschutzstufe <em>Datenschutzstufe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datenschutzstufe</em>'.
	 * @see de.xoev.domea.domea.AllgemeineMetadatenType#getDatenschutzstufe()
	 * @see #getAllgemeineMetadatenType()
	 * @generated
	 */
	EAttribute getAllgemeineMetadatenType_Datenschutzstufe();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.AllgemeineMetadatenType#getDatenschutzstufeCode <em>Datenschutzstufe Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datenschutzstufe Code</em>'.
	 * @see de.xoev.domea.domea.AllgemeineMetadatenType#getDatenschutzstufeCode()
	 * @see #getAllgemeineMetadatenType()
	 * @generated
	 */
	EReference getAllgemeineMetadatenType_DatenschutzstufeCode();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.AllgemeinerNameType <em>Allgemeiner Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allgemeiner Name Type</em>'.
	 * @see de.xoev.domea.domea.AllgemeinerNameType
	 * @generated
	 */
	EClass getAllgemeinerNameType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AllgemeinerNameType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.xoev.domea.domea.AllgemeinerNameType#getName()
	 * @see #getAllgemeinerNameType()
	 * @generated
	 */
	EAttribute getAllgemeinerNameType_Name();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.AllgemeineRueckmeldungCodeType <em>Allgemeine Rueckmeldung Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allgemeine Rueckmeldung Code Type</em>'.
	 * @see de.xoev.domea.domea.AllgemeineRueckmeldungCodeType
	 * @generated
	 */
	EClass getAllgemeineRueckmeldungCodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.AnlageDokumentType <em>Anlage Dokument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anlage Dokument Type</em>'.
	 * @see de.xoev.domea.domea.AnlageDokumentType
	 * @generated
	 */
	EClass getAnlageDokumentType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AnlageDokumentType#getNummer <em>Nummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nummer</em>'.
	 * @see de.xoev.domea.domea.AnlageDokumentType#getNummer()
	 * @see #getAnlageDokumentType()
	 * @generated
	 */
	EAttribute getAnlageDokumentType_Nummer();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.AnschriftstypCodeType <em>Anschriftstyp Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anschriftstyp Code Type</em>'.
	 * @see de.xoev.domea.domea.AnschriftstypCodeType
	 * @generated
	 */
	EClass getAnschriftstypCodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.AnschriftType <em>Anschrift Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anschrift Type</em>'.
	 * @see de.xoev.domea.domea.AnschriftType
	 * @generated
	 */
	EClass getAnschriftType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.AnschriftType#getStaat <em>Staat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Staat</em>'.
	 * @see de.xoev.domea.domea.AnschriftType#getStaat()
	 * @see #getAnschriftType()
	 * @generated
	 */
	EReference getAnschriftType_Staat();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AnschriftType#getStrasse <em>Strasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strasse</em>'.
	 * @see de.xoev.domea.domea.AnschriftType#getStrasse()
	 * @see #getAnschriftType()
	 * @generated
	 */
	EAttribute getAnschriftType_Strasse();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AnschriftType#getHausnummer <em>Hausnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hausnummer</em>'.
	 * @see de.xoev.domea.domea.AnschriftType#getHausnummer()
	 * @see #getAnschriftType()
	 * @generated
	 */
	EAttribute getAnschriftType_Hausnummer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AnschriftType#getPostfach <em>Postfach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postfach</em>'.
	 * @see de.xoev.domea.domea.AnschriftType#getPostfach()
	 * @see #getAnschriftType()
	 * @generated
	 */
	EAttribute getAnschriftType_Postfach();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AnschriftType#getPostleitzahl <em>Postleitzahl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postleitzahl</em>'.
	 * @see de.xoev.domea.domea.AnschriftType#getPostleitzahl()
	 * @see #getAnschriftType()
	 * @generated
	 */
	EAttribute getAnschriftType_Postleitzahl();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AnschriftType#getOrt <em>Ort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ort</em>'.
	 * @see de.xoev.domea.domea.AnschriftType#getOrt()
	 * @see #getAnschriftType()
	 * @generated
	 */
	EAttribute getAnschriftType_Ort();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AnschriftType#getZusatz <em>Zusatz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zusatz</em>'.
	 * @see de.xoev.domea.domea.AnschriftType#getZusatz()
	 * @see #getAnschriftType()
	 * @generated
	 */
	EAttribute getAnschriftType_Zusatz();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.AnschriftType#getTyp <em>Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Typ</em>'.
	 * @see de.xoev.domea.domea.AnschriftType#getTyp()
	 * @see #getAnschriftType()
	 * @generated
	 */
	EReference getAnschriftType_Typ();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType <em>Anwendungsspezifische Erweiterung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anwendungsspezifische Erweiterung Type</em>'.
	 * @see de.xoev.domea.domea.AnwendungsspezifischeErweiterungType
	 * @generated
	 */
	EClass getAnwendungsspezifischeErweiterungType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getKennung <em>Kennung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kennung</em>'.
	 * @see de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getKennung()
	 * @see #getAnwendungsspezifischeErweiterungType()
	 * @generated
	 */
	EAttribute getAnwendungsspezifischeErweiterungType_Kennung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getName()
	 * @see #getAnwendungsspezifischeErweiterungType()
	 * @generated
	 */
	EAttribute getAnwendungsspezifischeErweiterungType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getBeschreibung <em>Beschreibung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beschreibung</em>'.
	 * @see de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getBeschreibung()
	 * @see #getAnwendungsspezifischeErweiterungType()
	 * @generated
	 */
	EAttribute getAnwendungsspezifischeErweiterungType_Beschreibung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getVersionsnummer <em>Versionsnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Versionsnummer</em>'.
	 * @see de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getVersionsnummer()
	 * @see #getAnwendungsspezifischeErweiterungType()
	 * @generated
	 */
	EAttribute getAnwendungsspezifischeErweiterungType_Versionsnummer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getVersionsdatum <em>Versionsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Versionsdatum</em>'.
	 * @see de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getVersionsdatum()
	 * @see #getAnwendungsspezifischeErweiterungType()
	 * @generated
	 */
	EAttribute getAnwendungsspezifischeErweiterungType_Versionsdatum();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getFeldgruppe <em>Feldgruppe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feldgruppe</em>'.
	 * @see de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getFeldgruppe()
	 * @see #getAnwendungsspezifischeErweiterungType()
	 * @generated
	 */
	EReference getAnwendungsspezifischeErweiterungType_Feldgruppe();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getFeld <em>Feld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feld</em>'.
	 * @see de.xoev.domea.domea.AnwendungsspezifischeErweiterungType#getFeld()
	 * @see #getAnwendungsspezifischeErweiterungType()
	 * @generated
	 */
	EReference getAnwendungsspezifischeErweiterungType_Feld();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungXMLType <em>Anwendungsspezifische Erweiterung XML Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anwendungsspezifische Erweiterung XML Type</em>'.
	 * @see de.xoev.domea.domea.AnwendungsspezifischeErweiterungXMLType
	 * @generated
	 */
	EClass getAnwendungsspezifischeErweiterungXMLType();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.domea.domea.AnwendungsspezifischeErweiterungXMLType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see de.xoev.domea.domea.AnwendungsspezifischeErweiterungXMLType#getAny()
	 * @see #getAnwendungsspezifischeErweiterungXMLType()
	 * @generated
	 */
	EAttribute getAnwendungsspezifischeErweiterungXMLType_Any();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.AufbewahrungsdauerType <em>Aufbewahrungsdauer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aufbewahrungsdauer Type</em>'.
	 * @see de.xoev.domea.domea.AufbewahrungsdauerType
	 * @generated
	 */
	EClass getAufbewahrungsdauerType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AufbewahrungsdauerType#getAnzahlJahre <em>Anzahl Jahre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anzahl Jahre</em>'.
	 * @see de.xoev.domea.domea.AufbewahrungsdauerType#getAnzahlJahre()
	 * @see #getAufbewahrungsdauerType()
	 * @generated
	 */
	EAttribute getAufbewahrungsdauerType_AnzahlJahre();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AufbewahrungsdauerType#isUnbefristet <em>Unbefristet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unbefristet</em>'.
	 * @see de.xoev.domea.domea.AufbewahrungsdauerType#isUnbefristet()
	 * @see #getAufbewahrungsdauerType()
	 * @generated
	 */
	EAttribute getAufbewahrungsdauerType_Unbefristet();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.AussonderungsartCodeType <em>Aussonderungsart Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aussonderungsart Code Type</em>'.
	 * @see de.xoev.domea.domea.AussonderungsartCodeType
	 * @generated
	 */
	EClass getAussonderungsartCodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.AussonderungsartType <em>Aussonderungsart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aussonderungsart Type</em>'.
	 * @see de.xoev.domea.domea.AussonderungsartType
	 * @generated
	 */
	EClass getAussonderungsartType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.AussonderungsartType#getAussonderungsart <em>Aussonderungsart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aussonderungsart</em>'.
	 * @see de.xoev.domea.domea.AussonderungsartType#getAussonderungsart()
	 * @see #getAussonderungsartType()
	 * @generated
	 */
	EReference getAussonderungsartType_Aussonderungsart();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AussonderungsartType#getAussonderungsartKonfigurierbar <em>Aussonderungsart Konfigurierbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aussonderungsart Konfigurierbar</em>'.
	 * @see de.xoev.domea.domea.AussonderungsartType#getAussonderungsartKonfigurierbar()
	 * @see #getAussonderungsartType()
	 * @generated
	 */
	EAttribute getAussonderungsartType_AussonderungsartKonfigurierbar();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.AussonderungsmetadatenType <em>Aussonderungsmetadaten Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aussonderungsmetadaten Type</em>'.
	 * @see de.xoev.domea.domea.AussonderungsmetadatenType
	 * @generated
	 */
	EClass getAussonderungsmetadatenType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.AussonderungsmetadatenType#getAufbewahrungsdauer <em>Aufbewahrungsdauer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aufbewahrungsdauer</em>'.
	 * @see de.xoev.domea.domea.AussonderungsmetadatenType#getAufbewahrungsdauer()
	 * @see #getAussonderungsmetadatenType()
	 * @generated
	 */
	EReference getAussonderungsmetadatenType_Aufbewahrungsdauer();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.AussonderungsmetadatenType#getAussonderungsart <em>Aussonderungsart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aussonderungsart</em>'.
	 * @see de.xoev.domea.domea.AussonderungsmetadatenType#getAussonderungsart()
	 * @see #getAussonderungsmetadatenType()
	 * @generated
	 */
	EReference getAussonderungsmetadatenType_Aussonderungsart();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AussonderungsmetadatenType#getKennung <em>Kennung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kennung</em>'.
	 * @see de.xoev.domea.domea.AussonderungsmetadatenType#getKennung()
	 * @see #getAussonderungsmetadatenType()
	 * @generated
	 */
	EAttribute getAussonderungsmetadatenType_Kennung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.AussonderungsmetadatenType#getBewertungsvorschlag <em>Bewertungsvorschlag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bewertungsvorschlag</em>'.
	 * @see de.xoev.domea.domea.AussonderungsmetadatenType#getBewertungsvorschlag()
	 * @see #getAussonderungsmetadatenType()
	 * @generated
	 */
	EReference getAussonderungsmetadatenType_Bewertungsvorschlag();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AussonderungsmetadatenType#getBewertungsvorschlagBegruendung <em>Bewertungsvorschlag Begruendung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bewertungsvorschlag Begruendung</em>'.
	 * @see de.xoev.domea.domea.AussonderungsmetadatenType#getBewertungsvorschlagBegruendung()
	 * @see #getAussonderungsmetadatenType()
	 * @generated
	 */
	EAttribute getAussonderungsmetadatenType_BewertungsvorschlagBegruendung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AussonderungsmetadatenType#getAufbewahrungsende <em>Aufbewahrungsende</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aufbewahrungsende</em>'.
	 * @see de.xoev.domea.domea.AussonderungsmetadatenType#getAufbewahrungsende()
	 * @see #getAussonderungsmetadatenType()
	 * @generated
	 */
	EAttribute getAussonderungsmetadatenType_Aufbewahrungsende();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.AussonderungsmetadatenType#getTransferfristende <em>Transferfristende</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transferfristende</em>'.
	 * @see de.xoev.domea.domea.AussonderungsmetadatenType#getTransferfristende()
	 * @see #getAussonderungsmetadatenType()
	 * @generated
	 */
	EAttribute getAussonderungsmetadatenType_Transferfristende();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.BearbeitungType <em>Bearbeitung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bearbeitung Type</em>'.
	 * @see de.xoev.domea.domea.BearbeitungType
	 * @generated
	 */
	EClass getBearbeitungType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.BearbeitungType#getBearbeiter <em>Bearbeiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bearbeiter</em>'.
	 * @see de.xoev.domea.domea.BearbeitungType#getBearbeiter()
	 * @see #getBearbeitungType()
	 * @generated
	 */
	EReference getBearbeitungType_Bearbeiter();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.BearbeitungType#getDatum <em>Datum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datum</em>'.
	 * @see de.xoev.domea.domea.BearbeitungType#getDatum()
	 * @see #getBearbeitungType()
	 * @generated
	 */
	EAttribute getBearbeitungType_Datum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.BearbeitungType#getUhrzeit <em>Uhrzeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uhrzeit</em>'.
	 * @see de.xoev.domea.domea.BearbeitungType#getUhrzeit()
	 * @see #getBearbeitungType()
	 * @generated
	 */
	EAttribute getBearbeitungType_Uhrzeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.BearbeitungType#getVermerk <em>Vermerk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vermerk</em>'.
	 * @see de.xoev.domea.domea.BearbeitungType#getVermerk()
	 * @see #getBearbeitungType()
	 * @generated
	 */
	EAttribute getBearbeitungType_Vermerk();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.BearbeitungType#getNotiz <em>Notiz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notiz</em>'.
	 * @see de.xoev.domea.domea.BearbeitungType#getNotiz()
	 * @see #getBearbeitungType()
	 * @generated
	 */
	EAttribute getBearbeitungType_Notiz();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.BearbeitungType#getAnlage <em>Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anlage</em>'.
	 * @see de.xoev.domea.domea.BearbeitungType#getAnlage()
	 * @see #getBearbeitungType()
	 * @generated
	 */
	EReference getBearbeitungType_Anlage();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.BehoerdeType <em>Behoerde Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behoerde Type</em>'.
	 * @see de.xoev.domea.domea.BehoerdeType
	 * @generated
	 */
	EClass getBehoerdeType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.BehoerdeType#getVerzeichnisdienst <em>Verzeichnisdienst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verzeichnisdienst</em>'.
	 * @see de.xoev.domea.domea.BehoerdeType#getVerzeichnisdienst()
	 * @see #getBehoerdeType()
	 * @generated
	 */
	EReference getBehoerdeType_Verzeichnisdienst();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.BehoerdeType#getKennung <em>Kennung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kennung</em>'.
	 * @see de.xoev.domea.domea.BehoerdeType#getKennung()
	 * @see #getBehoerdeType()
	 * @generated
	 */
	EAttribute getBehoerdeType_Kennung();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.BeteiligungsschrittType <em>Beteiligungsschritt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beteiligungsschritt Type</em>'.
	 * @see de.xoev.domea.domea.BeteiligungsschrittType
	 * @generated
	 */
	EClass getBeteiligungsschrittType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.BeteiligungsschrittType#getNummer <em>Nummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nummer</em>'.
	 * @see de.xoev.domea.domea.BeteiligungsschrittType#getNummer()
	 * @see #getBeteiligungsschrittType()
	 * @generated
	 */
	EAttribute getBeteiligungsschrittType_Nummer();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.BeteiligungsschrittType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see de.xoev.domea.domea.BeteiligungsschrittType#getStatus()
	 * @see #getBeteiligungsschrittType()
	 * @generated
	 */
	EReference getBeteiligungsschrittType_Status();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.BeteiligungsschrittType#getVerfuegung <em>Verfuegung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verfuegung</em>'.
	 * @see de.xoev.domea.domea.BeteiligungsschrittType#getVerfuegung()
	 * @see #getBeteiligungsschrittType()
	 * @generated
	 */
	EReference getBeteiligungsschrittType_Verfuegung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.BeteiligungsschrittType#getBearbeitung <em>Bearbeitung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bearbeitung</em>'.
	 * @see de.xoev.domea.domea.BeteiligungsschrittType#getBearbeitung()
	 * @see #getBeteiligungsschrittType()
	 * @generated
	 */
	EReference getBeteiligungsschrittType_Bearbeitung();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.domea.domea.BeteiligungsschrittType#getParallelZuBeteiligungsschritt <em>Parallel Zu Beteiligungsschritt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parallel Zu Beteiligungsschritt</em>'.
	 * @see de.xoev.domea.domea.BeteiligungsschrittType#getParallelZuBeteiligungsschritt()
	 * @see #getBeteiligungsschrittType()
	 * @generated
	 */
	EAttribute getBeteiligungsschrittType_ParallelZuBeteiligungsschritt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.BeteiligungsschrittType#getVersionNummer <em>Version Nummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Nummer</em>'.
	 * @see de.xoev.domea.domea.BeteiligungsschrittType#getVersionNummer()
	 * @see #getBeteiligungsschrittType()
	 * @generated
	 */
	EAttribute getBeteiligungsschrittType_VersionNummer();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.BeteiligungsstatusCodeType <em>Beteiligungsstatus Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Beteiligungsstatus Code Type</em>'.
	 * @see de.xoev.domea.domea.BeteiligungsstatusCodeType
	 * @generated
	 */
	EClass getBeteiligungsstatusCodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.BewertungsvorschlagCodeType <em>Bewertungsvorschlag Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bewertungsvorschlag Code Type</em>'.
	 * @see de.xoev.domea.domea.BewertungsvorschlagCodeType
	 * @generated
	 */
	EClass getBewertungsvorschlagCodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.DateiformatCodeType <em>Dateiformat Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dateiformat Code Type</em>'.
	 * @see de.xoev.domea.domea.DateiformatCodeType
	 * @generated
	 */
	EClass getDateiformatCodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.DatenaustauschartCodeType <em>Datenaustauschart Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datenaustauschart Code Type</em>'.
	 * @see de.xoev.domea.domea.DatenaustauschartCodeType
	 * @generated
	 */
	EClass getDatenaustauschartCodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.DatenschutzstufeCodeType <em>Datenschutzstufe Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datenschutzstufe Code Type</em>'.
	 * @see de.xoev.domea.domea.DatenschutzstufeCodeType
	 * @generated
	 */
	EClass getDatenschutzstufeCodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.DatentypCodeType <em>Datentyp Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datentyp Code Type</em>'.
	 * @see de.xoev.domea.domea.DatentypCodeType
	 * @generated
	 */
	EClass getDatentypCodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.DokumentMitSchriftstueckType <em>Dokument Mit Schriftstueck Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dokument Mit Schriftstueck Type</em>'.
	 * @see de.xoev.domea.domea.DokumentMitSchriftstueckType
	 * @generated
	 */
	EClass getDokumentMitSchriftstueckType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.DokumentMitSchriftstueckType#getSchriftstueck <em>Schriftstueck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schriftstueck</em>'.
	 * @see de.xoev.domea.domea.DokumentMitSchriftstueckType#getSchriftstueck()
	 * @see #getDokumentMitSchriftstueckType()
	 * @generated
	 */
	EReference getDokumentMitSchriftstueckType_Schriftstueck();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.DokumentOderDokumentMitSchriftstueckType <em>Dokument Oder Dokument Mit Schriftstueck Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dokument Oder Dokument Mit Schriftstueck Type</em>'.
	 * @see de.xoev.domea.domea.DokumentOderDokumentMitSchriftstueckType
	 * @generated
	 */
	EClass getDokumentOderDokumentMitSchriftstueckType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.DokumentOderDokumentMitSchriftstueckType#getDokument <em>Dokument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dokument</em>'.
	 * @see de.xoev.domea.domea.DokumentOderDokumentMitSchriftstueckType#getDokument()
	 * @see #getDokumentOderDokumentMitSchriftstueckType()
	 * @generated
	 */
	EReference getDokumentOderDokumentMitSchriftstueckType_Dokument();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.DokumentOderDokumentMitSchriftstueckType#getDokumentMitSchriftstueck <em>Dokument Mit Schriftstueck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dokument Mit Schriftstueck</em>'.
	 * @see de.xoev.domea.domea.DokumentOderDokumentMitSchriftstueckType#getDokumentMitSchriftstueck()
	 * @see #getDokumentOderDokumentMitSchriftstueckType()
	 * @generated
	 */
	EReference getDokumentOderDokumentMitSchriftstueckType_DokumentMitSchriftstueck();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType <em>Dokument Schriftstueck Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dokument Schriftstueck Basis Type</em>'.
	 * @see de.xoev.domea.domea.DokumentSchriftstueckBasisType
	 * @generated
	 */
	EClass getDokumentSchriftstueckBasisType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getIdentifikation <em>Identifikation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifikation</em>'.
	 * @see de.xoev.domea.domea.DokumentSchriftstueckBasisType#getIdentifikation()
	 * @see #getDokumentSchriftstueckBasisType()
	 * @generated
	 */
	EReference getDokumentSchriftstueckBasisType_Identifikation();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getAllgemeineMetadaten <em>Allgemeine Metadaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allgemeine Metadaten</em>'.
	 * @see de.xoev.domea.domea.DokumentSchriftstueckBasisType#getAllgemeineMetadaten()
	 * @see #getDokumentSchriftstueckBasisType()
	 * @generated
	 */
	EReference getDokumentSchriftstueckBasisType_AllgemeineMetadaten();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getFremdesGeschaeftszeichen <em>Fremdes Geschaeftszeichen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fremdes Geschaeftszeichen</em>'.
	 * @see de.xoev.domea.domea.DokumentSchriftstueckBasisType#getFremdesGeschaeftszeichen()
	 * @see #getDokumentSchriftstueckBasisType()
	 * @generated
	 */
	EAttribute getDokumentSchriftstueckBasisType_FremdesGeschaeftszeichen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getPosteingangsdatum <em>Posteingangsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Posteingangsdatum</em>'.
	 * @see de.xoev.domea.domea.DokumentSchriftstueckBasisType#getPosteingangsdatum()
	 * @see #getDokumentSchriftstueckBasisType()
	 * @generated
	 */
	EAttribute getDokumentSchriftstueckBasisType_Posteingangsdatum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getPostausgangsdatum <em>Postausgangsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postausgangsdatum</em>'.
	 * @see de.xoev.domea.domea.DokumentSchriftstueckBasisType#getPostausgangsdatum()
	 * @see #getDokumentSchriftstueckBasisType()
	 * @generated
	 */
	EAttribute getDokumentSchriftstueckBasisType_Postausgangsdatum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getDatumDesSchreibens <em>Datum Des Schreibens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datum Des Schreibens</em>'.
	 * @see de.xoev.domea.domea.DokumentSchriftstueckBasisType#getDatumDesSchreibens()
	 * @see #getDokumentSchriftstueckBasisType()
	 * @generated
	 */
	EAttribute getDokumentSchriftstueckBasisType_DatumDesSchreibens();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getBezug <em>Bezug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bezug</em>'.
	 * @see de.xoev.domea.domea.DokumentSchriftstueckBasisType#getBezug()
	 * @see #getDokumentSchriftstueckBasisType()
	 * @generated
	 */
	EAttribute getDokumentSchriftstueckBasisType_Bezug();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getHier <em>Hier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hier</em>'.
	 * @see de.xoev.domea.domea.DokumentSchriftstueckBasisType#getHier()
	 * @see #getDokumentSchriftstueckBasisType()
	 * @generated
	 */
	EAttribute getDokumentSchriftstueckBasisType_Hier();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getBearbeiter <em>Bearbeiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bearbeiter</em>'.
	 * @see de.xoev.domea.domea.DokumentSchriftstueckBasisType#getBearbeiter()
	 * @see #getDokumentSchriftstueckBasisType()
	 * @generated
	 */
	EAttribute getDokumentSchriftstueckBasisType_Bearbeiter();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getTyp <em>Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typ</em>'.
	 * @see de.xoev.domea.domea.DokumentSchriftstueckBasisType#getTyp()
	 * @see #getDokumentSchriftstueckBasisType()
	 * @generated
	 */
	EAttribute getDokumentSchriftstueckBasisType_Typ();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getHistorienProtokollInformation <em>Historien Protokoll Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Historien Protokoll Information</em>'.
	 * @see de.xoev.domea.domea.DokumentSchriftstueckBasisType#getHistorienProtokollInformation()
	 * @see #getDokumentSchriftstueckBasisType()
	 * @generated
	 */
	EReference getDokumentSchriftstueckBasisType_HistorienProtokollInformation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getInternerGeschaeftsgang <em>Interner Geschaeftsgang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interner Geschaeftsgang</em>'.
	 * @see de.xoev.domea.domea.DokumentSchriftstueckBasisType#getInternerGeschaeftsgang()
	 * @see #getDokumentSchriftstueckBasisType()
	 * @generated
	 */
	EReference getDokumentSchriftstueckBasisType_InternerGeschaeftsgang();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getVerweis <em>Verweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verweis</em>'.
	 * @see de.xoev.domea.domea.DokumentSchriftstueckBasisType#getVerweis()
	 * @see #getDokumentSchriftstueckBasisType()
	 * @generated
	 */
	EReference getDokumentSchriftstueckBasisType_Verweis();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getAnlage <em>Anlage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anlage</em>'.
	 * @see de.xoev.domea.domea.DokumentSchriftstueckBasisType#getAnlage()
	 * @see #getDokumentSchriftstueckBasisType()
	 * @generated
	 */
	EReference getDokumentSchriftstueckBasisType_Anlage();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getAutor <em>Autor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Autor</em>'.
	 * @see de.xoev.domea.domea.DokumentSchriftstueckBasisType#getAutor()
	 * @see #getDokumentSchriftstueckBasisType()
	 * @generated
	 */
	EReference getDokumentSchriftstueckBasisType_Autor();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getLeser <em>Leser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Leser</em>'.
	 * @see de.xoev.domea.domea.DokumentSchriftstueckBasisType#getLeser()
	 * @see #getDokumentSchriftstueckBasisType()
	 * @generated
	 */
	EReference getDokumentSchriftstueckBasisType_Leser();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getWeitererKontakt <em>Weiterer Kontakt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weiterer Kontakt</em>'.
	 * @see de.xoev.domea.domea.DokumentSchriftstueckBasisType#getWeitererKontakt()
	 * @see #getDokumentSchriftstueckBasisType()
	 * @generated
	 */
	EReference getDokumentSchriftstueckBasisType_WeitererKontakt();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getAnwendungsspezifischeErweiterung <em>Anwendungsspezifische Erweiterung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anwendungsspezifische Erweiterung</em>'.
	 * @see de.xoev.domea.domea.DokumentSchriftstueckBasisType#getAnwendungsspezifischeErweiterung()
	 * @see #getDokumentSchriftstueckBasisType()
	 * @generated
	 */
	EReference getDokumentSchriftstueckBasisType_AnwendungsspezifischeErweiterung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.DokumentSchriftstueckBasisType#getAnwendungsspezifischeErweiterungXML <em>Anwendungsspezifische Erweiterung XML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anwendungsspezifische Erweiterung XML</em>'.
	 * @see de.xoev.domea.domea.DokumentSchriftstueckBasisType#getAnwendungsspezifischeErweiterungXML()
	 * @see #getDokumentSchriftstueckBasisType()
	 * @generated
	 */
	EReference getDokumentSchriftstueckBasisType_AnwendungsspezifischeErweiterungXML();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.DokumentType <em>Dokument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dokument Type</em>'.
	 * @see de.xoev.domea.domea.DokumentType
	 * @generated
	 */
	EClass getDokumentType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.DokumentType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Version</em>'.
	 * @see de.xoev.domea.domea.DokumentType#getVersion()
	 * @see #getDokumentType()
	 * @generated
	 */
	EReference getDokumentType_Version();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.ErfolgOderMisserfolgImportType <em>Erfolg Oder Misserfolg Import Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erfolg Oder Misserfolg Import Type</em>'.
	 * @see de.xoev.domea.domea.ErfolgOderMisserfolgImportType
	 * @generated
	 */
	EClass getErfolgOderMisserfolgImportType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.ErfolgOderMisserfolgImportType#isErfolgreich <em>Erfolgreich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Erfolgreich</em>'.
	 * @see de.xoev.domea.domea.ErfolgOderMisserfolgImportType#isErfolgreich()
	 * @see #getErfolgOderMisserfolgImportType()
	 * @generated
	 */
	EAttribute getErfolgOderMisserfolgImportType_Erfolgreich();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.domea.domea.ErfolgOderMisserfolgImportType#getFehlermeldung <em>Fehlermeldung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Fehlermeldung</em>'.
	 * @see de.xoev.domea.domea.ErfolgOderMisserfolgImportType#getFehlermeldung()
	 * @see #getErfolgOderMisserfolgImportType()
	 * @generated
	 */
	EAttribute getErfolgOderMisserfolgImportType_Fehlermeldung();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.ErfolgOderMisserfolgImportType#getFehlermeldungCode <em>Fehlermeldung Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fehlermeldung Code</em>'.
	 * @see de.xoev.domea.domea.ErfolgOderMisserfolgImportType#getFehlermeldungCode()
	 * @see #getErfolgOderMisserfolgImportType()
	 * @generated
	 */
	EReference getErfolgOderMisserfolgImportType_FehlermeldungCode();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.FeldgruppeType <em>Feldgruppe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feldgruppe Type</em>'.
	 * @see de.xoev.domea.domea.FeldgruppeType
	 * @generated
	 */
	EClass getFeldgruppeType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.FeldgruppeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.xoev.domea.domea.FeldgruppeType#getName()
	 * @see #getFeldgruppeType()
	 * @generated
	 */
	EAttribute getFeldgruppeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.FeldgruppeType#getBeschreibung <em>Beschreibung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beschreibung</em>'.
	 * @see de.xoev.domea.domea.FeldgruppeType#getBeschreibung()
	 * @see #getFeldgruppeType()
	 * @generated
	 */
	EAttribute getFeldgruppeType_Beschreibung();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.FeldgruppeType#getUnterfeldgruppe <em>Unterfeldgruppe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unterfeldgruppe</em>'.
	 * @see de.xoev.domea.domea.FeldgruppeType#getUnterfeldgruppe()
	 * @see #getFeldgruppeType()
	 * @generated
	 */
	EReference getFeldgruppeType_Unterfeldgruppe();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.FeldgruppeType#getFeld <em>Feld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feld</em>'.
	 * @see de.xoev.domea.domea.FeldgruppeType#getFeld()
	 * @see #getFeldgruppeType()
	 * @generated
	 */
	EReference getFeldgruppeType_Feld();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.FeldType <em>Feld Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feld Type</em>'.
	 * @see de.xoev.domea.domea.FeldType
	 * @generated
	 */
	EClass getFeldType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.FeldType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.xoev.domea.domea.FeldType#getName()
	 * @see #getFeldType()
	 * @generated
	 */
	EAttribute getFeldType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.FeldType#getBeschreibung <em>Beschreibung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beschreibung</em>'.
	 * @see de.xoev.domea.domea.FeldType#getBeschreibung()
	 * @see #getFeldType()
	 * @generated
	 */
	EAttribute getFeldType_Beschreibung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.FeldType#getDatentyp <em>Datentyp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datentyp</em>'.
	 * @see de.xoev.domea.domea.FeldType#getDatentyp()
	 * @see #getFeldType()
	 * @generated
	 */
	EReference getFeldType_Datentyp();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.FeldType#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see de.xoev.domea.domea.FeldType#getWert()
	 * @see #getFeldType()
	 * @generated
	 */
	EAttribute getFeldType_Wert();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.FormatType <em>Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Format Type</em>'.
	 * @see de.xoev.domea.domea.FormatType
	 * @generated
	 */
	EClass getFormatType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.FormatType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.xoev.domea.domea.FormatType#getName()
	 * @see #getFormatType()
	 * @generated
	 */
	EReference getFormatType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.FormatType#getSonstigerName <em>Sonstiger Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sonstiger Name</em>'.
	 * @see de.xoev.domea.domea.FormatType#getSonstigerName()
	 * @see #getFormatType()
	 * @generated
	 */
	EAttribute getFormatType_SonstigerName();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.FormatType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.xoev.domea.domea.FormatType#getVersion()
	 * @see #getFormatType()
	 * @generated
	 */
	EAttribute getFormatType_Version();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.FormatType#getPrimaerdokument <em>Primaerdokument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primaerdokument</em>'.
	 * @see de.xoev.domea.domea.FormatType#getPrimaerdokument()
	 * @see #getFormatType()
	 * @generated
	 */
	EReference getFormatType_Primaerdokument();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.GeburtType <em>Geburt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geburt Type</em>'.
	 * @see de.xoev.domea.domea.GeburtType
	 * @generated
	 */
	EClass getGeburtType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.GeburtType#getDatum <em>Datum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datum</em>'.
	 * @see de.xoev.domea.domea.GeburtType#getDatum()
	 * @see #getGeburtType()
	 * @generated
	 */
	EAttribute getGeburtType_Datum();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.GeheimhaltungsgradCodeType <em>Geheimhaltungsgrad Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geheimhaltungsgrad Code Type</em>'.
	 * @see de.xoev.domea.domea.GeheimhaltungsgradCodeType
	 * @generated
	 */
	EClass getGeheimhaltungsgradCodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.GeheimhaltungType <em>Geheimhaltung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geheimhaltung Type</em>'.
	 * @see de.xoev.domea.domea.GeheimhaltungType
	 * @generated
	 */
	EClass getGeheimhaltungType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.GeheimhaltungType#getGeheimhaltungsgrad <em>Geheimhaltungsgrad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geheimhaltungsgrad</em>'.
	 * @see de.xoev.domea.domea.GeheimhaltungType#getGeheimhaltungsgrad()
	 * @see #getGeheimhaltungType()
	 * @generated
	 */
	EReference getGeheimhaltungType_Geheimhaltungsgrad();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.GeheimhaltungType#getEinstufungsfrist <em>Einstufungsfrist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einstufungsfrist</em>'.
	 * @see de.xoev.domea.domea.GeheimhaltungType#getEinstufungsfrist()
	 * @see #getGeheimhaltungType()
	 * @generated
	 */
	EAttribute getGeheimhaltungType_Einstufungsfrist();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.GeheimhaltungType#getEingestuftAm <em>Eingestuft Am</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eingestuft Am</em>'.
	 * @see de.xoev.domea.domea.GeheimhaltungType#getEingestuftAm()
	 * @see #getGeheimhaltungType()
	 * @generated
	 */
	EAttribute getGeheimhaltungType_EingestuftAm();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.GeheimhaltungType#getHerausgeber <em>Herausgeber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Herausgeber</em>'.
	 * @see de.xoev.domea.domea.GeheimhaltungType#getHerausgeber()
	 * @see #getGeheimhaltungType()
	 * @generated
	 */
	EAttribute getGeheimhaltungType_Herausgeber();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.GeheimhaltungType#getEinstufungEndetAm <em>Einstufung Endet Am</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Einstufung Endet Am</em>'.
	 * @see de.xoev.domea.domea.GeheimhaltungType#getEinstufungEndetAm()
	 * @see #getGeheimhaltungType()
	 * @generated
	 */
	EAttribute getGeheimhaltungType_EinstufungEndetAm();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.GeheimhaltungType#getBemerkung <em>Bemerkung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bemerkung</em>'.
	 * @see de.xoev.domea.domea.GeheimhaltungType#getBemerkung()
	 * @see #getGeheimhaltungType()
	 * @generated
	 */
	EAttribute getGeheimhaltungType_Bemerkung();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.GeschaeftsgangType <em>Geschaeftsgang Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geschaeftsgang Type</em>'.
	 * @see de.xoev.domea.domea.GeschaeftsgangType
	 * @generated
	 */
	EClass getGeschaeftsgangType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.GeschaeftsgangType#getIdentifikation <em>Identifikation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifikation</em>'.
	 * @see de.xoev.domea.domea.GeschaeftsgangType#getIdentifikation()
	 * @see #getGeschaeftsgangType()
	 * @generated
	 */
	EReference getGeschaeftsgangType_Identifikation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.GeschaeftsgangType#getBeteiligungsschritt <em>Beteiligungsschritt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Beteiligungsschritt</em>'.
	 * @see de.xoev.domea.domea.GeschaeftsgangType#getBeteiligungsschritt()
	 * @see #getGeschaeftsgangType()
	 * @generated
	 */
	EReference getGeschaeftsgangType_Beteiligungsschritt();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.HashType <em>Hash Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hash Type</em>'.
	 * @see de.xoev.domea.domea.HashType
	 * @generated
	 */
	EClass getHashType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.HashType#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see de.xoev.domea.domea.HashType#getWert()
	 * @see #getHashType()
	 * @generated
	 */
	EAttribute getHashType_Wert();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.HashType#getAlgorithmus <em>Algorithmus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Algorithmus</em>'.
	 * @see de.xoev.domea.domea.HashType#getAlgorithmus()
	 * @see #getHashType()
	 * @generated
	 */
	EReference getHashType_Algorithmus();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.HashType#getSonstigerAlgorithmus <em>Sonstiger Algorithmus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sonstiger Algorithmus</em>'.
	 * @see de.xoev.domea.domea.HashType#getSonstigerAlgorithmus()
	 * @see #getHashType()
	 * @generated
	 */
	EAttribute getHashType_SonstigerAlgorithmus();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.HistorienProtokollInformationType <em>Historien Protokoll Information Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historien Protokoll Information Type</em>'.
	 * @see de.xoev.domea.domea.HistorienProtokollInformationType
	 * @generated
	 */
	EClass getHistorienProtokollInformationType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.HistorienProtokollInformationType#getMetadatumName <em>Metadatum Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadatum Name</em>'.
	 * @see de.xoev.domea.domea.HistorienProtokollInformationType#getMetadatumName()
	 * @see #getHistorienProtokollInformationType()
	 * @generated
	 */
	EAttribute getHistorienProtokollInformationType_MetadatumName();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.HistorienProtokollInformationType#getMetadatumAlterWert <em>Metadatum Alter Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadatum Alter Wert</em>'.
	 * @see de.xoev.domea.domea.HistorienProtokollInformationType#getMetadatumAlterWert()
	 * @see #getHistorienProtokollInformationType()
	 * @generated
	 */
	EAttribute getHistorienProtokollInformationType_MetadatumAlterWert();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.HistorienProtokollInformationType#getMetadatumNeuerWert <em>Metadatum Neuer Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadatum Neuer Wert</em>'.
	 * @see de.xoev.domea.domea.HistorienProtokollInformationType#getMetadatumNeuerWert()
	 * @see #getHistorienProtokollInformationType()
	 * @generated
	 */
	EAttribute getHistorienProtokollInformationType_MetadatumNeuerWert();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.HistorienProtokollInformationType#getAkteur <em>Akteur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Akteur</em>'.
	 * @see de.xoev.domea.domea.HistorienProtokollInformationType#getAkteur()
	 * @see #getHistorienProtokollInformationType()
	 * @generated
	 */
	EAttribute getHistorienProtokollInformationType_Akteur();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.HistorienProtokollInformationType#getDatumUhrzeit <em>Datum Uhrzeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datum Uhrzeit</em>'.
	 * @see de.xoev.domea.domea.HistorienProtokollInformationType#getDatumUhrzeit()
	 * @see #getHistorienProtokollInformationType()
	 * @generated
	 */
	EAttribute getHistorienProtokollInformationType_DatumUhrzeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.HistorienProtokollInformationType#getBemerkung <em>Bemerkung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bemerkung</em>'.
	 * @see de.xoev.domea.domea.HistorienProtokollInformationType#getBemerkung()
	 * @see #getHistorienProtokollInformationType()
	 * @generated
	 */
	EAttribute getHistorienProtokollInformationType_Bemerkung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.HistorienProtokollInformationType#getAktion <em>Aktion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aktion</em>'.
	 * @see de.xoev.domea.domea.HistorienProtokollInformationType#getAktion()
	 * @see #getHistorienProtokollInformationType()
	 * @generated
	 */
	EAttribute getHistorienProtokollInformationType_Aktion();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.IdentifikationNachrichtType <em>Identifikation Nachricht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifikation Nachricht Type</em>'.
	 * @see de.xoev.domea.domea.IdentifikationNachrichtType
	 * @generated
	 */
	EClass getIdentifikationNachrichtType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.IdentifikationObjektType <em>Identifikation Objekt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifikation Objekt Type</em>'.
	 * @see de.xoev.domea.domea.IdentifikationObjektType
	 * @generated
	 */
	EClass getIdentifikationObjektType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.IdentifikationObjektType#getXdomeaUUID <em>Xdomea UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xdomea UUID</em>'.
	 * @see de.xoev.domea.domea.IdentifikationObjektType#getXdomeaUUID()
	 * @see #getIdentifikationObjektType()
	 * @generated
	 */
	EAttribute getIdentifikationObjektType_XdomeaUUID();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.IdentifikationObjektType#getNummerImUebergeordnetenContainer <em>Nummer Im Uebergeordneten Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nummer Im Uebergeordneten Container</em>'.
	 * @see de.xoev.domea.domea.IdentifikationObjektType#getNummerImUebergeordnetenContainer()
	 * @see #getIdentifikationObjektType()
	 * @generated
	 */
	EAttribute getIdentifikationObjektType_NummerImUebergeordnetenContainer();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.KommunikationType <em>Kommunikation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kommunikation Type</em>'.
	 * @see de.xoev.domea.domea.KommunikationType
	 * @generated
	 */
	EClass getKommunikationType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.KommunikationType#isIstDienstlich <em>Ist Dienstlich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ist Dienstlich</em>'.
	 * @see de.xoev.domea.domea.KommunikationType#isIstDienstlich()
	 * @see #getKommunikationType()
	 * @generated
	 */
	EAttribute getKommunikationType_IstDienstlich();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.KommunikationType#isIstInstitution <em>Ist Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ist Institution</em>'.
	 * @see de.xoev.domea.domea.KommunikationType#isIstInstitution()
	 * @see #getKommunikationType()
	 * @generated
	 */
	EAttribute getKommunikationType_IstInstitution();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.KompressionsverfahrenCodeType <em>Kompressionsverfahren Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kompressionsverfahren Code Type</em>'.
	 * @see de.xoev.domea.domea.KompressionsverfahrenCodeType
	 * @generated
	 */
	EClass getKompressionsverfahrenCodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.KonfigurationsparameterCodeType <em>Konfigurationsparameter Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Konfigurationsparameter Code Type</em>'.
	 * @see de.xoev.domea.domea.KonfigurationsparameterCodeType
	 * @generated
	 */
	EClass getKonfigurationsparameterCodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.KonfigurationsparameterGruppeCodeType <em>Konfigurationsparameter Gruppe Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Konfigurationsparameter Gruppe Code Type</em>'.
	 * @see de.xoev.domea.domea.KonfigurationsparameterGruppeCodeType
	 * @generated
	 */
	EClass getKonfigurationsparameterGruppeCodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.KontaktType <em>Kontakt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kontakt Type</em>'.
	 * @see de.xoev.domea.domea.KontaktType
	 * @generated
	 */
	EClass getKontaktType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.KontaktType#getBehoerdenkennung <em>Behoerdenkennung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behoerdenkennung</em>'.
	 * @see de.xoev.domea.domea.KontaktType#getBehoerdenkennung()
	 * @see #getKontaktType()
	 * @generated
	 */
	EReference getKontaktType_Behoerdenkennung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.KontaktType#getNameInstitution <em>Name Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Institution</em>'.
	 * @see de.xoev.domea.domea.KontaktType#getNameInstitution()
	 * @see #getKontaktType()
	 * @generated
	 */
	EReference getKontaktType_NameInstitution();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.KontaktType#getNameOrganisationseinheit <em>Name Organisationseinheit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Organisationseinheit</em>'.
	 * @see de.xoev.domea.domea.KontaktType#getNameOrganisationseinheit()
	 * @see #getKontaktType()
	 * @generated
	 */
	EReference getKontaktType_NameOrganisationseinheit();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.KontaktType#getNameAnsprechpartner <em>Name Ansprechpartner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name Ansprechpartner</em>'.
	 * @see de.xoev.domea.domea.KontaktType#getNameAnsprechpartner()
	 * @see #getKontaktType()
	 * @generated
	 */
	EReference getKontaktType_NameAnsprechpartner();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.KontaktType#getTaetigkeit <em>Taetigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taetigkeit</em>'.
	 * @see de.xoev.domea.domea.KontaktType#getTaetigkeit()
	 * @see #getKontaktType()
	 * @generated
	 */
	EAttribute getKontaktType_Taetigkeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.KontaktType#getZustaendigkeit <em>Zustaendigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zustaendigkeit</em>'.
	 * @see de.xoev.domea.domea.KontaktType#getZustaendigkeit()
	 * @see #getKontaktType()
	 * @generated
	 */
	EAttribute getKontaktType_Zustaendigkeit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.KontaktType#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anschrift</em>'.
	 * @see de.xoev.domea.domea.KontaktType#getAnschrift()
	 * @see #getKontaktType()
	 * @generated
	 */
	EReference getKontaktType_Anschrift();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.KontaktType#getErreichbarkeit <em>Erreichbarkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Erreichbarkeit</em>'.
	 * @see de.xoev.domea.domea.KontaktType#getErreichbarkeit()
	 * @see #getKontaktType()
	 * @generated
	 */
	EReference getKontaktType_Erreichbarkeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.KontaktType#getRolle <em>Rolle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rolle</em>'.
	 * @see de.xoev.domea.domea.KontaktType#getRolle()
	 * @see #getKontaktType()
	 * @generated
	 */
	EAttribute getKontaktType_Rolle();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.KontaktType#getRolleCode <em>Rolle Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rolle Code</em>'.
	 * @see de.xoev.domea.domea.KontaktType#getRolleCode()
	 * @see #getKontaktType()
	 * @generated
	 */
	EReference getKontaktType_RolleCode();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.KontaktType#getUnstrukturierteAnschrift <em>Unstrukturierte Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unstrukturierte Anschrift</em>'.
	 * @see de.xoev.domea.domea.KontaktType#getUnstrukturierteAnschrift()
	 * @see #getKontaktType()
	 * @generated
	 */
	EReference getKontaktType_UnstrukturierteAnschrift();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.KontaktType#getGeburt <em>Geburt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburt</em>'.
	 * @see de.xoev.domea.domea.KontaktType#getGeburt()
	 * @see #getKontaktType()
	 * @generated
	 */
	EReference getKontaktType_Geburt();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.KontaktType#getAnwendungsspezifischeErweiterung <em>Anwendungsspezifische Erweiterung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anwendungsspezifische Erweiterung</em>'.
	 * @see de.xoev.domea.domea.KontaktType#getAnwendungsspezifischeErweiterung()
	 * @see #getKontaktType()
	 * @generated
	 */
	EReference getKontaktType_AnwendungsspezifischeErweiterung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.KontaktType#getAnwendungsspezifischeErweiterungXML <em>Anwendungsspezifische Erweiterung XML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anwendungsspezifische Erweiterung XML</em>'.
	 * @see de.xoev.domea.domea.KontaktType#getAnwendungsspezifischeErweiterungXML()
	 * @see #getKontaktType()
	 * @generated
	 */
	EReference getKontaktType_AnwendungsspezifischeErweiterungXML();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.KryptographischeAlgorithmenCodeType <em>Kryptographische Algorithmen Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kryptographische Algorithmen Code Type</em>'.
	 * @see de.xoev.domea.domea.KryptographischeAlgorithmenCodeType
	 * @generated
	 */
	EClass getKryptographischeAlgorithmenCodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.MediumCodeType <em>Medium Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medium Code Type</em>'.
	 * @see de.xoev.domea.domea.MediumCodeType
	 * @generated
	 */
	EClass getMediumCodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.NachrichtenkopfType <em>Nachrichtenkopf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachrichtenkopf Type</em>'.
	 * @see de.xoev.domea.domea.NachrichtenkopfType
	 * @generated
	 */
	EClass getNachrichtenkopfType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.NachrichtenkopfType#getIdentifikationNachricht <em>Identifikation Nachricht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifikation Nachricht</em>'.
	 * @see de.xoev.domea.domea.NachrichtenkopfType#getIdentifikationNachricht()
	 * @see #getNachrichtenkopfType()
	 * @generated
	 */
	EReference getNachrichtenkopfType_IdentifikationNachricht();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.NachrichtenkopfType#getLeser <em>Leser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Leser</em>'.
	 * @see de.xoev.domea.domea.NachrichtenkopfType#getLeser()
	 * @see #getNachrichtenkopfType()
	 * @generated
	 */
	EReference getNachrichtenkopfType_Leser();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.NachrichtenkopfType#getAutor <em>Autor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Autor</em>'.
	 * @see de.xoev.domea.domea.NachrichtenkopfType#getAutor()
	 * @see #getNachrichtenkopfType()
	 * @generated
	 */
	EReference getNachrichtenkopfType_Autor();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.NachrichtenkopfType#getProzessID <em>Prozess ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prozess ID</em>'.
	 * @see de.xoev.domea.domea.NachrichtenkopfType#getProzessID()
	 * @see #getNachrichtenkopfType()
	 * @generated
	 */
	EAttribute getNachrichtenkopfType_ProzessID();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.NachrichtenkopfType#getInstanzID <em>Instanz ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instanz ID</em>'.
	 * @see de.xoev.domea.domea.NachrichtenkopfType#getInstanzID()
	 * @see #getNachrichtenkopfType()
	 * @generated
	 */
	EAttribute getNachrichtenkopfType_InstanzID();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.NachrichtenkopfType#getHinweis <em>Hinweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hinweis</em>'.
	 * @see de.xoev.domea.domea.NachrichtenkopfType#getHinweis()
	 * @see #getNachrichtenkopfType()
	 * @generated
	 */
	EAttribute getNachrichtenkopfType_Hinweis();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.NachrichtenkopfType#getAnwendungsspezifischeErweiterung <em>Anwendungsspezifische Erweiterung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anwendungsspezifische Erweiterung</em>'.
	 * @see de.xoev.domea.domea.NachrichtenkopfType#getAnwendungsspezifischeErweiterung()
	 * @see #getNachrichtenkopfType()
	 * @generated
	 */
	EReference getNachrichtenkopfType_AnwendungsspezifischeErweiterung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.NachrichtenkopfType#getAnwendungsspezifischeErweiterungXML <em>Anwendungsspezifische Erweiterung XML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anwendungsspezifische Erweiterung XML</em>'.
	 * @see de.xoev.domea.domea.NachrichtenkopfType#getAnwendungsspezifischeErweiterungXML()
	 * @see #getNachrichtenkopfType()
	 * @generated
	 */
	EReference getNachrichtenkopfType_AnwendungsspezifischeErweiterungXML();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.NachrichtentypCodeType <em>Nachrichtentyp Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachrichtentyp Code Type</em>'.
	 * @see de.xoev.domea.domea.NachrichtentypCodeType
	 * @generated
	 */
	EClass getNachrichtentypCodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.NachrichtType <em>Nachricht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachricht Type</em>'.
	 * @see de.xoev.domea.domea.NachrichtType
	 * @generated
	 */
	EClass getNachrichtType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.NachrichtType#getNachrichtenkopf <em>Nachrichtenkopf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachrichtenkopf</em>'.
	 * @see de.xoev.domea.domea.NachrichtType#getNachrichtenkopf()
	 * @see #getNachrichtType()
	 * @generated
	 */
	EReference getNachrichtType_Nachrichtenkopf();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.NachrichtType#getProdukt <em>Produkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produkt</em>'.
	 * @see de.xoev.domea.domea.NachrichtType#getProdukt()
	 * @see #getNachrichtType()
	 * @generated
	 */
	EAttribute getNachrichtType_Produkt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.NachrichtType#getProdukthersteller <em>Produkthersteller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produkthersteller</em>'.
	 * @see de.xoev.domea.domea.NachrichtType#getProdukthersteller()
	 * @see #getNachrichtType()
	 * @generated
	 */
	EAttribute getNachrichtType_Produkthersteller();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.NachrichtType#getProduktversion <em>Produktversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produktversion</em>'.
	 * @see de.xoev.domea.domea.NachrichtType#getProduktversion()
	 * @see #getNachrichtType()
	 * @generated
	 */
	EAttribute getNachrichtType_Produktversion();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.NachrichtType#getStandard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard</em>'.
	 * @see de.xoev.domea.domea.NachrichtType#getStandard()
	 * @see #getNachrichtType()
	 * @generated
	 */
	EAttribute getNachrichtType_Standard();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.NachrichtType#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test</em>'.
	 * @see de.xoev.domea.domea.NachrichtType#getTest()
	 * @see #getNachrichtType()
	 * @generated
	 */
	EAttribute getNachrichtType_Test();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.NachrichtType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.xoev.domea.domea.NachrichtType#getVersion()
	 * @see #getNachrichtType()
	 * @generated
	 */
	EAttribute getNachrichtType_Version();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.NameNatuerlichePersonType <em>Name Natuerliche Person Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Natuerliche Person Type</em>'.
	 * @see de.xoev.domea.domea.NameNatuerlichePersonType
	 * @generated
	 */
	EClass getNameNatuerlichePersonType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.NameNatuerlichePersonType#getAnrede <em>Anrede</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Anrede</em>'.
	 * @see de.xoev.domea.domea.NameNatuerlichePersonType#getAnrede()
	 * @see #getNameNatuerlichePersonType()
	 * @generated
	 */
	EAttribute getNameNatuerlichePersonType_Anrede();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.NameNatuerlichePersonType#getTitel <em>Titel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titel</em>'.
	 * @see de.xoev.domea.domea.NameNatuerlichePersonType#getTitel()
	 * @see #getNameNatuerlichePersonType()
	 * @generated
	 */
	EAttribute getNameNatuerlichePersonType_Titel();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.NameNatuerlichePersonType#getFamilienname <em>Familienname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Familienname</em>'.
	 * @see de.xoev.domea.domea.NameNatuerlichePersonType#getFamilienname()
	 * @see #getNameNatuerlichePersonType()
	 * @generated
	 */
	EReference getNameNatuerlichePersonType_Familienname();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.NameNatuerlichePersonType#getVorname <em>Vorname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vorname</em>'.
	 * @see de.xoev.domea.domea.NameNatuerlichePersonType#getVorname()
	 * @see #getNameNatuerlichePersonType()
	 * @generated
	 */
	EReference getNameNatuerlichePersonType_Vorname();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.NameOrganisationType <em>Name Organisation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Organisation Type</em>'.
	 * @see de.xoev.domea.domea.NameOrganisationType
	 * @generated
	 */
	EClass getNameOrganisationType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.NameOrganisationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.xoev.domea.domea.NameOrganisationType#getName()
	 * @see #getNameOrganisationType()
	 * @generated
	 */
	EAttribute getNameOrganisationType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.NameOrganisationType#getKurzbezeichnung <em>Kurzbezeichnung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kurzbezeichnung</em>'.
	 * @see de.xoev.domea.domea.NameOrganisationType#getKurzbezeichnung()
	 * @see #getNameOrganisationType()
	 * @generated
	 */
	EAttribute getNameOrganisationType_Kurzbezeichnung();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.NkFVDatenType <em>Nk FV Daten Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nk FV Daten Type</em>'.
	 * @see de.xoev.domea.domea.NkFVDatenType
	 * @generated
	 */
	EClass getNkFVDatenType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.NkFVDatenType#getEmpfangendesSystem <em>Empfangendes System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Empfangendes System</em>'.
	 * @see de.xoev.domea.domea.NkFVDatenType#getEmpfangendesSystem()
	 * @see #getNkFVDatenType()
	 * @generated
	 */
	EReference getNkFVDatenType_EmpfangendesSystem();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.NkNichtFVDatenEinLeserMitEmpfangsbestaetigungType <em>Nk Nicht FV Daten Ein Leser Mit Empfangsbestaetigung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nk Nicht FV Daten Ein Leser Mit Empfangsbestaetigung Type</em>'.
	 * @see de.xoev.domea.domea.NkNichtFVDatenEinLeserMitEmpfangsbestaetigungType
	 * @generated
	 */
	EClass getNkNichtFVDatenEinLeserMitEmpfangsbestaetigungType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.NkNichtFVDatenEinLeserMitEmpfangsbestaetigungType#isEmpfangsbestaetigung <em>Empfangsbestaetigung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empfangsbestaetigung</em>'.
	 * @see de.xoev.domea.domea.NkNichtFVDatenEinLeserMitEmpfangsbestaetigungType#isEmpfangsbestaetigung()
	 * @see #getNkNichtFVDatenEinLeserMitEmpfangsbestaetigungType()
	 * @generated
	 */
	EAttribute getNkNichtFVDatenEinLeserMitEmpfangsbestaetigungType_Empfangsbestaetigung();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType <em>Nk Nicht FV Daten Weitere Leser Mit Empfangsbestaetigung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nk Nicht FV Daten Weitere Leser Mit Empfangsbestaetigung Type</em>'.
	 * @see de.xoev.domea.domea.NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType
	 * @generated
	 */
	EClass getNkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType#isEmpfangsbestaetigung <em>Empfangsbestaetigung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empfangsbestaetigung</em>'.
	 * @see de.xoev.domea.domea.NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType#isEmpfangsbestaetigung()
	 * @see #getNkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType()
	 * @generated
	 */
	EAttribute getNkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType_Empfangsbestaetigung();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.NkNichtFVDatenWeitereLeserType <em>Nk Nicht FV Daten Weitere Leser Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nk Nicht FV Daten Weitere Leser Type</em>'.
	 * @see de.xoev.domea.domea.NkNichtFVDatenWeitereLeserType
	 * @generated
	 */
	EClass getNkNichtFVDatenWeitereLeserType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.NkNichtFVDatenWeitereLeserType#getWeitererLeser <em>Weiterer Leser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weiterer Leser</em>'.
	 * @see de.xoev.domea.domea.NkNichtFVDatenWeitereLeserType#getWeitererLeser()
	 * @see #getNkNichtFVDatenWeitereLeserType()
	 * @generated
	 */
	EReference getNkNichtFVDatenWeitereLeserType_WeitererLeser();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.OrganisationseinheitType <em>Organisationseinheit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Organisationseinheit Type</em>'.
	 * @see de.xoev.domea.domea.OrganisationseinheitType
	 * @generated
	 */
	EClass getOrganisationseinheitType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.OrganisationseinheitType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.xoev.domea.domea.OrganisationseinheitType#getName()
	 * @see #getOrganisationseinheitType()
	 * @generated
	 */
	EAttribute getOrganisationseinheitType_Name();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.PfadelementType <em>Pfadelement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pfadelement Type</em>'.
	 * @see de.xoev.domea.domea.PfadelementType
	 * @generated
	 */
	EClass getPfadelementType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.PfadelementType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.xoev.domea.domea.PfadelementType#getName()
	 * @see #getPfadelementType()
	 * @generated
	 */
	EAttribute getPfadelementType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.PfadelementType#getTyp <em>Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Typ</em>'.
	 * @see de.xoev.domea.domea.PfadelementType#getTyp()
	 * @see #getPfadelementType()
	 * @generated
	 */
	EReference getPfadelementType_Typ();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.PfadelementType#getPfadelement <em>Pfadelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pfadelement</em>'.
	 * @see de.xoev.domea.domea.PfadelementType#getPfadelement()
	 * @see #getPfadelementType()
	 * @generated
	 */
	EReference getPfadelementType_Pfadelement();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.PrimaerdokumentType <em>Primaerdokument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primaerdokument Type</em>'.
	 * @see de.xoev.domea.domea.PrimaerdokumentType
	 * @generated
	 */
	EClass getPrimaerdokumentType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.PrimaerdokumentType#getDateiname <em>Dateiname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dateiname</em>'.
	 * @see de.xoev.domea.domea.PrimaerdokumentType#getDateiname()
	 * @see #getPrimaerdokumentType()
	 * @generated
	 */
	EAttribute getPrimaerdokumentType_Dateiname();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.PrimaerdokumentType#getDateinameOriginal <em>Dateiname Original</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dateiname Original</em>'.
	 * @see de.xoev.domea.domea.PrimaerdokumentType#getDateinameOriginal()
	 * @see #getPrimaerdokumentType()
	 * @generated
	 */
	EAttribute getPrimaerdokumentType_DateinameOriginal();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.PrimaerdokumentType#getErsteller <em>Ersteller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ersteller</em>'.
	 * @see de.xoev.domea.domea.PrimaerdokumentType#getErsteller()
	 * @see #getPrimaerdokumentType()
	 * @generated
	 */
	EAttribute getPrimaerdokumentType_Ersteller();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.PrimaerdokumentType#getDatumUhrzeit <em>Datum Uhrzeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datum Uhrzeit</em>'.
	 * @see de.xoev.domea.domea.PrimaerdokumentType#getDatumUhrzeit()
	 * @see #getPrimaerdokumentType()
	 * @generated
	 */
	EAttribute getPrimaerdokumentType_DatumUhrzeit();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.PrimaerdokumentType#getSignaturSiegel <em>Signatur Siegel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signatur Siegel</em>'.
	 * @see de.xoev.domea.domea.PrimaerdokumentType#getSignaturSiegel()
	 * @see #getPrimaerdokumentType()
	 * @generated
	 */
	EReference getPrimaerdokumentType_SignaturSiegel();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.PrimaerdokumentType#getZeitpunktLetzteAenderung <em>Zeitpunkt Letzte Aenderung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zeitpunkt Letzte Aenderung</em>'.
	 * @see de.xoev.domea.domea.PrimaerdokumentType#getZeitpunktLetzteAenderung()
	 * @see #getPrimaerdokumentType()
	 * @generated
	 */
	EAttribute getPrimaerdokumentType_ZeitpunktLetzteAenderung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.PrimaerdokumentType#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hash</em>'.
	 * @see de.xoev.domea.domea.PrimaerdokumentType#getHash()
	 * @see #getPrimaerdokumentType()
	 * @generated
	 */
	EReference getPrimaerdokumentType_Hash();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.RolleCodeType <em>Rolle Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rolle Code Type</em>'.
	 * @see de.xoev.domea.domea.RolleCodeType
	 * @generated
	 */
	EClass getRolleCodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SchriftgutobjekttypCodeType <em>Schriftgutobjekttyp Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schriftgutobjekttyp Code Type</em>'.
	 * @see de.xoev.domea.domea.SchriftgutobjekttypCodeType
	 * @generated
	 */
	EClass getSchriftgutobjekttypCodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SignaturSiegelType <em>Signatur Siegel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signatur Siegel Type</em>'.
	 * @see de.xoev.domea.domea.SignaturSiegelType
	 * @generated
	 */
	EClass getSignaturSiegelType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.SignaturSiegelType#isSignaturSiegelEingebettet <em>Signatur Siegel Eingebettet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signatur Siegel Eingebettet</em>'.
	 * @see de.xoev.domea.domea.SignaturSiegelType#isSignaturSiegelEingebettet()
	 * @see #getSignaturSiegelType()
	 * @generated
	 */
	EAttribute getSignaturSiegelType_SignaturSiegelEingebettet();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.domea.domea.SignaturSiegelType#getSignaturSiegelDatei <em>Signatur Siegel Datei</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Signatur Siegel Datei</em>'.
	 * @see de.xoev.domea.domea.SignaturSiegelType#getSignaturSiegelDatei()
	 * @see #getSignaturSiegelType()
	 * @generated
	 */
	EAttribute getSignaturSiegelType_SignaturSiegelDatei();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SonstigeFehlermeldungCodeType <em>Sonstige Fehlermeldung Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sonstige Fehlermeldung Code Type</em>'.
	 * @see de.xoev.domea.domea.SonstigeFehlermeldungCodeType
	 * @generated
	 */
	EClass getSonstigeFehlermeldungCodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0601CodeType <em>Spezifische Fehlermeldung0601 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0601 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0601CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0601CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0602CodeType <em>Spezifische Fehlermeldung0602 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0602 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0602CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0602CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0603CodeType <em>Spezifische Fehlermeldung0603 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0603 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0603CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0603CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0604CodeType <em>Spezifische Fehlermeldung0604 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0604 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0604CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0604CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0605CodeType <em>Spezifische Fehlermeldung0605 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0605 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0605CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0605CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0606CodeType <em>Spezifische Fehlermeldung0606 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0606 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0606CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0606CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0607CodeType <em>Spezifische Fehlermeldung0607 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0607 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0607CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0607CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0608CodeType <em>Spezifische Fehlermeldung0608 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0608 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0608CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0608CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0609CodeType <em>Spezifische Fehlermeldung0609 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0609 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0609CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0609CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0610CodeType <em>Spezifische Fehlermeldung0610 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0610 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0610CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0610CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0611CodeType <em>Spezifische Fehlermeldung0611 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0611 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0611CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0611CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0612CodeType <em>Spezifische Fehlermeldung0612 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0612 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0612CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0612CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0613CodeType <em>Spezifische Fehlermeldung0613 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0613 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0613CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0613CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0614CodeType <em>Spezifische Fehlermeldung0614 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0614 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0614CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0614CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0615CodeType <em>Spezifische Fehlermeldung0615 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0615 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0615CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0615CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0616CodeType <em>Spezifische Fehlermeldung0616 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0616 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0616CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0616CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0617CodeType <em>Spezifische Fehlermeldung0617 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0617 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0617CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0617CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0618CodeType <em>Spezifische Fehlermeldung0618 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0618 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0618CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0618CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0619CodeType <em>Spezifische Fehlermeldung0619 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0619 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0619CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0619CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0620CodeType <em>Spezifische Fehlermeldung0620 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0620 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0620CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0620CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0621CodeType <em>Spezifische Fehlermeldung0621 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0621 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0621CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0621CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0622CodeType <em>Spezifische Fehlermeldung0622 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0622 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0622CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0622CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0623CodeType <em>Spezifische Fehlermeldung0623 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0623 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0623CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0623CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0624CodeType <em>Spezifische Fehlermeldung0624 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0624 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0624CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0624CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0625CodeType <em>Spezifische Fehlermeldung0625 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0625 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0625CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0625CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0626CodeType <em>Spezifische Fehlermeldung0626 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0626 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0626CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0626CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0627CodeType <em>Spezifische Fehlermeldung0627 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0627 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0627CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0627CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0628CodeType <em>Spezifische Fehlermeldung0628 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0628 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0628CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0628CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0631CodeType <em>Spezifische Fehlermeldung0631 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0631 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0631CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0631CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SpezifischeFehlermeldung0632CodeType <em>Spezifische Fehlermeldung0632 Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spezifische Fehlermeldung0632 Code Type</em>'.
	 * @see de.xoev.domea.domea.SpezifischeFehlermeldung0632CodeType
	 * @generated
	 */
	EClass getSpezifischeFehlermeldung0632CodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.StaatCodeType <em>Staat Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staat Code Type</em>'.
	 * @see de.xoev.domea.domea.StaatCodeType
	 * @generated
	 */
	EClass getStaatCodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.StaatType <em>Staat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staat Type</em>'.
	 * @see de.xoev.domea.domea.StaatType
	 * @generated
	 */
	EClass getStaatType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.StaatType#getStaat <em>Staat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Staat</em>'.
	 * @see de.xoev.domea.domea.StaatType#getStaat()
	 * @see #getStaatType()
	 * @generated
	 */
	EReference getStaatType_Staat();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.StrukturelementTypCodeType <em>Strukturelement Typ Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strukturelement Typ Code Type</em>'.
	 * @see de.xoev.domea.domea.StrukturelementTypCodeType
	 * @generated
	 */
	EClass getStrukturelementTypCodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.StrukturpfadType <em>Strukturpfad Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strukturpfad Type</em>'.
	 * @see de.xoev.domea.domea.StrukturpfadType
	 * @generated
	 */
	EClass getStrukturpfadType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.StrukturpfadType#getPfadelement <em>Pfadelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pfadelement</em>'.
	 * @see de.xoev.domea.domea.StrukturpfadType#getPfadelement()
	 * @see #getStrukturpfadType()
	 * @generated
	 */
	EReference getStrukturpfadType_Pfadelement();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.SystemType <em>System Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Type</em>'.
	 * @see de.xoev.domea.domea.SystemType
	 * @generated
	 */
	EClass getSystemType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.SystemType#getInstanzID <em>Instanz ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instanz ID</em>'.
	 * @see de.xoev.domea.domea.SystemType#getInstanzID()
	 * @see #getSystemType()
	 * @generated
	 */
	EAttribute getSystemType_InstanzID();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.SystemType#getProduktname <em>Produktname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produktname</em>'.
	 * @see de.xoev.domea.domea.SystemType#getProduktname()
	 * @see #getSystemType()
	 * @generated
	 */
	EAttribute getSystemType_Produktname();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.SystemType#getProduktversion <em>Produktversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produktversion</em>'.
	 * @see de.xoev.domea.domea.SystemType#getProduktversion()
	 * @see #getSystemType()
	 * @generated
	 */
	EAttribute getSystemType_Produktversion();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.SystemType#getProdukthersteller <em>Produkthersteller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produkthersteller</em>'.
	 * @see de.xoev.domea.domea.SystemType#getProdukthersteller()
	 * @see #getSystemType()
	 * @generated
	 */
	EAttribute getSystemType_Produkthersteller();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.TransportwegCodeType <em>Transportweg Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transportweg Code Type</em>'.
	 * @see de.xoev.domea.domea.TransportwegCodeType
	 * @generated
	 */
	EClass getTransportwegCodeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.UnstrukturierteAnschriftType <em>Unstrukturierte Anschrift Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unstrukturierte Anschrift Type</em>'.
	 * @see de.xoev.domea.domea.UnstrukturierteAnschriftType
	 * @generated
	 */
	EClass getUnstrukturierteAnschriftType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getTyp <em>Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Typ</em>'.
	 * @see de.xoev.domea.domea.UnstrukturierteAnschriftType#getTyp()
	 * @see #getUnstrukturierteAnschriftType()
	 * @generated
	 */
	EReference getUnstrukturierteAnschriftType_Typ();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile1 <em>Zeile1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zeile1</em>'.
	 * @see de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile1()
	 * @see #getUnstrukturierteAnschriftType()
	 * @generated
	 */
	EAttribute getUnstrukturierteAnschriftType_Zeile1();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile2 <em>Zeile2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zeile2</em>'.
	 * @see de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile2()
	 * @see #getUnstrukturierteAnschriftType()
	 * @generated
	 */
	EAttribute getUnstrukturierteAnschriftType_Zeile2();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile3 <em>Zeile3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zeile3</em>'.
	 * @see de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile3()
	 * @see #getUnstrukturierteAnschriftType()
	 * @generated
	 */
	EAttribute getUnstrukturierteAnschriftType_Zeile3();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile4 <em>Zeile4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zeile4</em>'.
	 * @see de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile4()
	 * @see #getUnstrukturierteAnschriftType()
	 * @generated
	 */
	EAttribute getUnstrukturierteAnschriftType_Zeile4();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile5 <em>Zeile5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zeile5</em>'.
	 * @see de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile5()
	 * @see #getUnstrukturierteAnschriftType()
	 * @generated
	 */
	EAttribute getUnstrukturierteAnschriftType_Zeile5();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile6 <em>Zeile6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zeile6</em>'.
	 * @see de.xoev.domea.domea.UnstrukturierteAnschriftType#getZeile6()
	 * @see #getUnstrukturierteAnschriftType()
	 * @generated
	 */
	EAttribute getUnstrukturierteAnschriftType_Zeile6();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.UnstrukturierteAnschriftType#getZusatz <em>Zusatz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zusatz</em>'.
	 * @see de.xoev.domea.domea.UnstrukturierteAnschriftType#getZusatz()
	 * @see #getUnstrukturierteAnschriftType()
	 * @generated
	 */
	EAttribute getUnstrukturierteAnschriftType_Zusatz();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.VerfuegungType <em>Verfuegung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verfuegung Type</em>'.
	 * @see de.xoev.domea.domea.VerfuegungType
	 * @generated
	 */
	EClass getVerfuegungType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.VerfuegungType#getErsteller <em>Ersteller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ersteller</em>'.
	 * @see de.xoev.domea.domea.VerfuegungType#getErsteller()
	 * @see #getVerfuegungType()
	 * @generated
	 */
	EReference getVerfuegungType_Ersteller();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.VerfuegungType#getAdressat <em>Adressat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adressat</em>'.
	 * @see de.xoev.domea.domea.VerfuegungType#getAdressat()
	 * @see #getVerfuegungType()
	 * @generated
	 */
	EReference getVerfuegungType_Adressat();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.VerfuegungType#getErstellungsdatum <em>Erstellungsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Erstellungsdatum</em>'.
	 * @see de.xoev.domea.domea.VerfuegungType#getErstellungsdatum()
	 * @see #getVerfuegungType()
	 * @generated
	 */
	EAttribute getVerfuegungType_Erstellungsdatum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.VerfuegungType#getErstellungsuhrzeit <em>Erstellungsuhrzeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Erstellungsuhrzeit</em>'.
	 * @see de.xoev.domea.domea.VerfuegungType#getErstellungsuhrzeit()
	 * @see #getVerfuegungType()
	 * @generated
	 */
	EAttribute getVerfuegungType_Erstellungsuhrzeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.VerfuegungType#getVerfuegung <em>Verfuegung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verfuegung</em>'.
	 * @see de.xoev.domea.domea.VerfuegungType#getVerfuegung()
	 * @see #getVerfuegungType()
	 * @generated
	 */
	EAttribute getVerfuegungType_Verfuegung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.VerfuegungType#getTerminDatum <em>Termin Datum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termin Datum</em>'.
	 * @see de.xoev.domea.domea.VerfuegungType#getTerminDatum()
	 * @see #getVerfuegungType()
	 * @generated
	 */
	EAttribute getVerfuegungType_TerminDatum();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.VerfuegungType#getTerminUhrzeit <em>Termin Uhrzeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termin Uhrzeit</em>'.
	 * @see de.xoev.domea.domea.VerfuegungType#getTerminUhrzeit()
	 * @see #getVerfuegungType()
	 * @generated
	 */
	EAttribute getVerfuegungType_TerminUhrzeit();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.VerfuegungType#getNotiz <em>Notiz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notiz</em>'.
	 * @see de.xoev.domea.domea.VerfuegungType#getNotiz()
	 * @see #getVerfuegungType()
	 * @generated
	 */
	EAttribute getVerfuegungType_Notiz();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.VersionType <em>Version Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version Type</em>'.
	 * @see de.xoev.domea.domea.VersionType
	 * @generated
	 */
	EClass getVersionType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.VersionType#getNummer <em>Nummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nummer</em>'.
	 * @see de.xoev.domea.domea.VersionType#getNummer()
	 * @see #getVersionType()
	 * @generated
	 */
	EAttribute getVersionType_Nummer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.VersionType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Format</em>'.
	 * @see de.xoev.domea.domea.VersionType#getFormat()
	 * @see #getVersionType()
	 * @generated
	 */
	EReference getVersionType_Format();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.VerweisType <em>Verweis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verweis Type</em>'.
	 * @see de.xoev.domea.domea.VerweisType
	 * @generated
	 */
	EClass getVerweisType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.VerweisType#getXdomeaUUID <em>Xdomea UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xdomea UUID</em>'.
	 * @see de.xoev.domea.domea.VerweisType#getXdomeaUUID()
	 * @see #getVerweisType()
	 * @generated
	 */
	EAttribute getVerweisType_XdomeaUUID();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.VerweisType#getSGOTyp <em>SGO Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SGO Typ</em>'.
	 * @see de.xoev.domea.domea.VerweisType#getSGOTyp()
	 * @see #getVerweisType()
	 * @generated
	 */
	EReference getVerweisType_SGOTyp();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.VerweisType#getSGOKennzeichen <em>SGO Kennzeichen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SGO Kennzeichen</em>'.
	 * @see de.xoev.domea.domea.VerweisType#getSGOKennzeichen()
	 * @see #getVerweisType()
	 * @generated
	 */
	EAttribute getVerweisType_SGOKennzeichen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.VerweisType#getBemerkung <em>Bemerkung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bemerkung</em>'.
	 * @see de.xoev.domea.domea.VerweisType#getBemerkung()
	 * @see #getVerweisType()
	 * @generated
	 */
	EAttribute getVerweisType_Bemerkung();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.VorgangType <em>Vorgang Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vorgang Type</em>'.
	 * @see de.xoev.domea.domea.VorgangType
	 * @generated
	 */
	EClass getVorgangType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.VorgangType#getIdentifikation <em>Identifikation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifikation</em>'.
	 * @see de.xoev.domea.domea.VorgangType#getIdentifikation()
	 * @see #getVorgangType()
	 * @generated
	 */
	EReference getVorgangType_Identifikation();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.VorgangType#getAllgemeineMetadaten <em>Allgemeine Metadaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allgemeine Metadaten</em>'.
	 * @see de.xoev.domea.domea.VorgangType#getAllgemeineMetadaten()
	 * @see #getVorgangType()
	 * @generated
	 */
	EReference getVorgangType_AllgemeineMetadaten();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.VorgangType#getAussonderungsmetadaten <em>Aussonderungsmetadaten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aussonderungsmetadaten</em>'.
	 * @see de.xoev.domea.domea.VorgangType#getAussonderungsmetadaten()
	 * @see #getVorgangType()
	 * @generated
	 */
	EReference getVorgangType_Aussonderungsmetadaten();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.VorgangType#getAktenbetreff <em>Aktenbetreff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aktenbetreff</em>'.
	 * @see de.xoev.domea.domea.VorgangType#getAktenbetreff()
	 * @see #getVorgangType()
	 * @generated
	 */
	EAttribute getVorgangType_Aktenbetreff();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.VorgangType#getTyp <em>Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typ</em>'.
	 * @see de.xoev.domea.domea.VorgangType#getTyp()
	 * @see #getVorgangType()
	 * @generated
	 */
	EAttribute getVorgangType_Typ();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.VorgangType#isZdA <em>Zd A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zd A</em>'.
	 * @see de.xoev.domea.domea.VorgangType#isZdA()
	 * @see #getVorgangType()
	 * @generated
	 */
	EAttribute getVorgangType_ZdA();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.VorgangType#getZdADatum <em>Zd ADatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zd ADatum</em>'.
	 * @see de.xoev.domea.domea.VorgangType#getZdADatum()
	 * @see #getVorgangType()
	 * @generated
	 */
	EAttribute getVorgangType_ZdADatum();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.VorgangType#getLaufzeit <em>Laufzeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Laufzeit</em>'.
	 * @see de.xoev.domea.domea.VorgangType#getLaufzeit()
	 * @see #getVorgangType()
	 * @generated
	 */
	EReference getVorgangType_Laufzeit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.VorgangType#getHistorienProtokollInformation <em>Historien Protokoll Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Historien Protokoll Information</em>'.
	 * @see de.xoev.domea.domea.VorgangType#getHistorienProtokollInformation()
	 * @see #getVorgangType()
	 * @generated
	 */
	EReference getVorgangType_HistorienProtokollInformation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.VorgangType#getInternerGeschaeftsgang <em>Interner Geschaeftsgang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interner Geschaeftsgang</em>'.
	 * @see de.xoev.domea.domea.VorgangType#getInternerGeschaeftsgang()
	 * @see #getVorgangType()
	 * @generated
	 */
	EReference getVorgangType_InternerGeschaeftsgang();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.VorgangType#getDokumentOderDokumentMitSchriftstueck <em>Dokument Oder Dokument Mit Schriftstueck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dokument Oder Dokument Mit Schriftstueck</em>'.
	 * @see de.xoev.domea.domea.VorgangType#getDokumentOderDokumentMitSchriftstueck()
	 * @see #getVorgangType()
	 * @generated
	 */
	EReference getVorgangType_DokumentOderDokumentMitSchriftstueck();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.VorgangType#getVerweis <em>Verweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verweis</em>'.
	 * @see de.xoev.domea.domea.VorgangType#getVerweis()
	 * @see #getVorgangType()
	 * @generated
	 */
	EReference getVorgangType_Verweis();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.VorgangType#getKontakt <em>Kontakt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kontakt</em>'.
	 * @see de.xoev.domea.domea.VorgangType#getKontakt()
	 * @see #getVorgangType()
	 * @generated
	 */
	EReference getVorgangType_Kontakt();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.VorgangType#getTeilvorgang <em>Teilvorgang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teilvorgang</em>'.
	 * @see de.xoev.domea.domea.VorgangType#getTeilvorgang()
	 * @see #getVorgangType()
	 * @generated
	 */
	EReference getVorgangType_Teilvorgang();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.domea.domea.VorgangType#getAnwendungsspezifischeErweiterung <em>Anwendungsspezifische Erweiterung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anwendungsspezifische Erweiterung</em>'.
	 * @see de.xoev.domea.domea.VorgangType#getAnwendungsspezifischeErweiterung()
	 * @see #getVorgangType()
	 * @generated
	 */
	EReference getVorgangType_AnwendungsspezifischeErweiterung();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.domea.domea.VorgangType#getAnwendungsspezifischeErweiterungXML <em>Anwendungsspezifische Erweiterung XML</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anwendungsspezifische Erweiterung XML</em>'.
	 * @see de.xoev.domea.domea.VorgangType#getAnwendungsspezifischeErweiterungXML()
	 * @see #getVorgangType()
	 * @generated
	 */
	EReference getVorgangType_AnwendungsspezifischeErweiterungXML();

	/**
	 * Returns the meta object for class '{@link de.xoev.domea.domea.ZeitraumType <em>Zeitraum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zeitraum Type</em>'.
	 * @see de.xoev.domea.domea.ZeitraumType
	 * @generated
	 */
	EClass getZeitraumType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.ZeitraumType#getBeginn <em>Beginn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginn</em>'.
	 * @see de.xoev.domea.domea.ZeitraumType#getBeginn()
	 * @see #getZeitraumType()
	 * @generated
	 */
	EAttribute getZeitraumType_Beginn();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.domea.domea.ZeitraumType#getEnde <em>Ende</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ende</em>'.
	 * @see de.xoev.domea.domea.ZeitraumType#getEnde()
	 * @see #getZeitraumType()
	 * @generated
	 */
	EAttribute getZeitraumType_Ende();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>String Dateiname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Der Datentyp zur Angabe eines Dateinamens nach dem Muster "xdomeaUUID", "xdomeaUUID.Dateiformat" oder "xdomeaUUID_Dokumentname.Dateiformat". Bei den ersten 32 Zeichen handelt es sich um eine generierte UUID gemäß XÖV-Basisnachricht-UUID nach RFC 4122.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>String Dateiname Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='stringDateinameType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[0-9|A-F|a-f]{8}-[0-9|A-F|a-f]{4}-[0-9|A-F|a-f]{4}-[0-9|A-F|a-f]{4}-[0-9|A-F|a-f]{12}[_]?.*[\\.]?.*'"
	 * @generated
	 */
	EDataType getStringDateinameType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomeaFactory getDomeaFactory();

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
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.AkteninhaltTypeImpl <em>Akteninhalt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.AkteninhaltTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAkteninhaltType()
		 * @generated
		 */
		EClass AKTENINHALT_TYPE = eINSTANCE.getAkteninhaltType();

		/**
		 * The meta object literal for the '<em><b>Dokument Oder Dokument Mit Schriftstueck</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AKTENINHALT_TYPE__DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK = eINSTANCE.getAkteninhaltType_DokumentOderDokumentMitSchriftstueck();

		/**
		 * The meta object literal for the '<em><b>Vorgang</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AKTENINHALT_TYPE__VORGANG = eINSTANCE.getAkteninhaltType_Vorgang();

		/**
		 * The meta object literal for the '<em><b>Teilakte</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AKTENINHALT_TYPE__TEILAKTE = eINSTANCE.getAkteninhaltType_Teilakte();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.AktenplaneinheitAktenplanTypeImpl <em>Aktenplaneinheit Aktenplan Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.AktenplaneinheitAktenplanTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAktenplaneinheitAktenplanType()
		 * @generated
		 */
		EClass AKTENPLANEINHEIT_AKTENPLAN_TYPE = eINSTANCE.getAktenplaneinheitAktenplanType();

		/**
		 * The meta object literal for the '<em><b>Aussonderungsart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUSSONDERUNGSART = eINSTANCE.getAktenplaneinheitAktenplanType_Aussonderungsart();

		/**
		 * The meta object literal for the '<em><b>Gueltigkeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AKTENPLANEINHEIT_AKTENPLAN_TYPE__GUELTIGKEIT = eINSTANCE.getAktenplaneinheitAktenplanType_Gueltigkeit();

		/**
		 * The meta object literal for the '<em><b>Stillgelegt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AKTENPLANEINHEIT_AKTENPLAN_TYPE__STILLGELEGT = eINSTANCE.getAktenplaneinheitAktenplanType_Stillgelegt();

		/**
		 * The meta object literal for the '<em><b>Aufbewahrungsdauer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AKTENPLANEINHEIT_AKTENPLAN_TYPE__AUFBEWAHRUNGSDAUER = eINSTANCE.getAktenplaneinheitAktenplanType_Aufbewahrungsdauer();

		/**
		 * The meta object literal for the '<em><b>Einheit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AKTENPLANEINHEIT_AKTENPLAN_TYPE__EINHEIT = eINSTANCE.getAktenplaneinheitAktenplanType_Einheit();

		/**
		 * The meta object literal for the '<em><b>Verweis Aktenplaneinheit</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AKTENPLANEINHEIT_AKTENPLAN_TYPE__VERWEIS_AKTENPLANEINHEIT = eINSTANCE.getAktenplaneinheitAktenplanType_VerweisAktenplaneinheit();

		/**
		 * The meta object literal for the '<em><b>Anwendungsspezifische Erweiterung</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AKTENPLANEINHEIT_AKTENPLAN_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG = eINSTANCE.getAktenplaneinheitAktenplanType_AnwendungsspezifischeErweiterung();

		/**
		 * The meta object literal for the '<em><b>Anwendungsspezifische Erweiterung XML</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AKTENPLANEINHEIT_AKTENPLAN_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML = eINSTANCE.getAktenplaneinheitAktenplanType_AnwendungsspezifischeErweiterungXML();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.AktenplaneinheitTypeImpl <em>Aktenplaneinheit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.AktenplaneinheitTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAktenplaneinheitType()
		 * @generated
		 */
		EClass AKTENPLANEINHEIT_TYPE = eINSTANCE.getAktenplaneinheitType();

		/**
		 * The meta object literal for the '<em><b>Kennzeichen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AKTENPLANEINHEIT_TYPE__KENNZEICHEN = eINSTANCE.getAktenplaneinheitType_Kennzeichen();

		/**
		 * The meta object literal for the '<em><b>Inhaltsangabe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AKTENPLANEINHEIT_TYPE__INHALTSANGABE = eINSTANCE.getAktenplaneinheitType_Inhaltsangabe();

		/**
		 * The meta object literal for the '<em><b>Betreff Kurz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AKTENPLANEINHEIT_TYPE__BETREFF_KURZ = eINSTANCE.getAktenplaneinheitType_BetreffKurz();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.AktenplanTypeImpl <em>Aktenplan Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.AktenplanTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAktenplanType()
		 * @generated
		 */
		EClass AKTENPLAN_TYPE = eINSTANCE.getAktenplanType();

		/**
		 * The meta object literal for the '<em><b>Bezeichnung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AKTENPLAN_TYPE__BEZEICHNUNG = eINSTANCE.getAktenplanType_Bezeichnung();

		/**
		 * The meta object literal for the '<em><b>Typ</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AKTENPLAN_TYPE__TYP = eINSTANCE.getAktenplanType_Typ();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AKTENPLAN_TYPE__VERSION = eINSTANCE.getAktenplanType_Version();

		/**
		 * The meta object literal for the '<em><b>Einheit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AKTENPLAN_TYPE__EINHEIT = eINSTANCE.getAktenplanType_Einheit();

		/**
		 * The meta object literal for the '<em><b>Gueltigkeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AKTENPLAN_TYPE__GUELTIGKEIT = eINSTANCE.getAktenplanType_Gueltigkeit();

		/**
		 * The meta object literal for the '<em><b>Aktenplandatei</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AKTENPLAN_TYPE__AKTENPLANDATEI = eINSTANCE.getAktenplanType_Aktenplandatei();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.AkteTypeImpl <em>Akte Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.AkteTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAkteType()
		 * @generated
		 */
		EClass AKTE_TYPE = eINSTANCE.getAkteType();

		/**
		 * The meta object literal for the '<em><b>Identifikation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AKTE_TYPE__IDENTIFIKATION = eINSTANCE.getAkteType_Identifikation();

		/**
		 * The meta object literal for the '<em><b>Allgemeine Metadaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AKTE_TYPE__ALLGEMEINE_METADATEN = eINSTANCE.getAkteType_AllgemeineMetadaten();

		/**
		 * The meta object literal for the '<em><b>Aussonderungsmetadaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AKTE_TYPE__AUSSONDERUNGSMETADATEN = eINSTANCE.getAkteType_Aussonderungsmetadaten();

		/**
		 * The meta object literal for the '<em><b>Standort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AKTE_TYPE__STANDORT = eINSTANCE.getAkteType_Standort();

		/**
		 * The meta object literal for the '<em><b>Typ</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AKTE_TYPE__TYP = eINSTANCE.getAkteType_Typ();

		/**
		 * The meta object literal for the '<em><b>Laufzeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AKTE_TYPE__LAUFZEIT = eINSTANCE.getAkteType_Laufzeit();

		/**
		 * The meta object literal for the '<em><b>Historien Protokoll Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AKTE_TYPE__HISTORIEN_PROTOKOLL_INFORMATION = eINSTANCE.getAkteType_HistorienProtokollInformation();

		/**
		 * The meta object literal for the '<em><b>Interner Geschaeftsgang</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AKTE_TYPE__INTERNER_GESCHAEFTSGANG = eINSTANCE.getAkteType_InternerGeschaeftsgang();

		/**
		 * The meta object literal for the '<em><b>Akteninhalt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AKTE_TYPE__AKTENINHALT = eINSTANCE.getAkteType_Akteninhalt();

		/**
		 * The meta object literal for the '<em><b>Verweis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AKTE_TYPE__VERWEIS = eINSTANCE.getAkteType_Verweis();

		/**
		 * The meta object literal for the '<em><b>Kontakt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AKTE_TYPE__KONTAKT = eINSTANCE.getAkteType_Kontakt();

		/**
		 * The meta object literal for the '<em><b>Zd A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AKTE_TYPE__ZD_A = eINSTANCE.getAkteType_ZdA();

		/**
		 * The meta object literal for the '<em><b>Zd ADatum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AKTE_TYPE__ZD_ADATUM = eINSTANCE.getAkteType_ZdADatum();

		/**
		 * The meta object literal for the '<em><b>Anwendungsspezifische Erweiterung</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AKTE_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG = eINSTANCE.getAkteType_AnwendungsspezifischeErweiterung();

		/**
		 * The meta object literal for the '<em><b>Anwendungsspezifische Erweiterung XML</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AKTE_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML = eINSTANCE.getAkteType_AnwendungsspezifischeErweiterungXML();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.AllgemeineMetadatenTypeImpl <em>Allgemeine Metadaten Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.AllgemeineMetadatenTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAllgemeineMetadatenType()
		 * @generated
		 */
		EClass ALLGEMEINE_METADATEN_TYPE = eINSTANCE.getAllgemeineMetadatenType();

		/**
		 * The meta object literal for the '<em><b>Betreff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_METADATEN_TYPE__BETREFF = eINSTANCE.getAllgemeineMetadatenType_Betreff();

		/**
		 * The meta object literal for the '<em><b>Kennzeichen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_METADATEN_TYPE__KENNZEICHEN = eINSTANCE.getAllgemeineMetadatenType_Kennzeichen();

		/**
		 * The meta object literal for the '<em><b>Federfuehrung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_METADATEN_TYPE__FEDERFUEHRUNG = eINSTANCE.getAllgemeineMetadatenType_Federfuehrung();

		/**
		 * The meta object literal for the '<em><b>Aktenfuehrung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_METADATEN_TYPE__AKTENFUEHRUNG = eINSTANCE.getAllgemeineMetadatenType_Aktenfuehrung();

		/**
		 * The meta object literal for the '<em><b>Geheimhaltung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLGEMEINE_METADATEN_TYPE__GEHEIMHALTUNG = eINSTANCE.getAllgemeineMetadatenType_Geheimhaltung();

		/**
		 * The meta object literal for the '<em><b>Bemerkung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_METADATEN_TYPE__BEMERKUNG = eINSTANCE.getAllgemeineMetadatenType_Bemerkung();

		/**
		 * The meta object literal for the '<em><b>Medium</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLGEMEINE_METADATEN_TYPE__MEDIUM = eINSTANCE.getAllgemeineMetadatenType_Medium();

		/**
		 * The meta object literal for the '<em><b>Aktenplaneinheit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLGEMEINE_METADATEN_TYPE__AKTENPLANEINHEIT = eINSTANCE.getAllgemeineMetadatenType_Aktenplaneinheit();

		/**
		 * The meta object literal for the '<em><b>Zeitpunkt Letzte Aenderung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_METADATEN_TYPE__ZEITPUNKT_LETZTE_AENDERUNG = eINSTANCE.getAllgemeineMetadatenType_ZeitpunktLetzteAenderung();

		/**
		 * The meta object literal for the '<em><b>Strukturpfad</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLGEMEINE_METADATEN_TYPE__STRUKTURPFAD = eINSTANCE.getAllgemeineMetadatenType_Strukturpfad();

		/**
		 * The meta object literal for the '<em><b>Datenschutzstufe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINE_METADATEN_TYPE__DATENSCHUTZSTUFE = eINSTANCE.getAllgemeineMetadatenType_Datenschutzstufe();

		/**
		 * The meta object literal for the '<em><b>Datenschutzstufe Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLGEMEINE_METADATEN_TYPE__DATENSCHUTZSTUFE_CODE = eINSTANCE.getAllgemeineMetadatenType_DatenschutzstufeCode();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.AllgemeinerNameTypeImpl <em>Allgemeiner Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.AllgemeinerNameTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAllgemeinerNameType()
		 * @generated
		 */
		EClass ALLGEMEINER_NAME_TYPE = eINSTANCE.getAllgemeinerNameType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINER_NAME_TYPE__NAME = eINSTANCE.getAllgemeinerNameType_Name();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.AllgemeineRueckmeldungCodeTypeImpl <em>Allgemeine Rueckmeldung Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.AllgemeineRueckmeldungCodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAllgemeineRueckmeldungCodeType()
		 * @generated
		 */
		EClass ALLGEMEINE_RUECKMELDUNG_CODE_TYPE = eINSTANCE.getAllgemeineRueckmeldungCodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.AnlageDokumentTypeImpl <em>Anlage Dokument Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.AnlageDokumentTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAnlageDokumentType()
		 * @generated
		 */
		EClass ANLAGE_DOKUMENT_TYPE = eINSTANCE.getAnlageDokumentType();

		/**
		 * The meta object literal for the '<em><b>Nummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANLAGE_DOKUMENT_TYPE__NUMMER = eINSTANCE.getAnlageDokumentType_Nummer();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.AnschriftstypCodeTypeImpl <em>Anschriftstyp Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.AnschriftstypCodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAnschriftstypCodeType()
		 * @generated
		 */
		EClass ANSCHRIFTSTYP_CODE_TYPE = eINSTANCE.getAnschriftstypCodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.AnschriftTypeImpl <em>Anschrift Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.AnschriftTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAnschriftType()
		 * @generated
		 */
		EClass ANSCHRIFT_TYPE = eINSTANCE.getAnschriftType();

		/**
		 * The meta object literal for the '<em><b>Staat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSCHRIFT_TYPE__STAAT = eINSTANCE.getAnschriftType_Staat();

		/**
		 * The meta object literal for the '<em><b>Strasse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSCHRIFT_TYPE__STRASSE = eINSTANCE.getAnschriftType_Strasse();

		/**
		 * The meta object literal for the '<em><b>Hausnummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSCHRIFT_TYPE__HAUSNUMMER = eINSTANCE.getAnschriftType_Hausnummer();

		/**
		 * The meta object literal for the '<em><b>Postfach</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSCHRIFT_TYPE__POSTFACH = eINSTANCE.getAnschriftType_Postfach();

		/**
		 * The meta object literal for the '<em><b>Postleitzahl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSCHRIFT_TYPE__POSTLEITZAHL = eINSTANCE.getAnschriftType_Postleitzahl();

		/**
		 * The meta object literal for the '<em><b>Ort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSCHRIFT_TYPE__ORT = eINSTANCE.getAnschriftType_Ort();

		/**
		 * The meta object literal for the '<em><b>Zusatz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSCHRIFT_TYPE__ZUSATZ = eINSTANCE.getAnschriftType_Zusatz();

		/**
		 * The meta object literal for the '<em><b>Typ</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSCHRIFT_TYPE__TYP = eINSTANCE.getAnschriftType_Typ();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.AnwendungsspezifischeErweiterungTypeImpl <em>Anwendungsspezifische Erweiterung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.AnwendungsspezifischeErweiterungTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAnwendungsspezifischeErweiterungType()
		 * @generated
		 */
		EClass ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE = eINSTANCE.getAnwendungsspezifischeErweiterungType();

		/**
		 * The meta object literal for the '<em><b>Kennung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__KENNUNG = eINSTANCE.getAnwendungsspezifischeErweiterungType_Kennung();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__NAME = eINSTANCE.getAnwendungsspezifischeErweiterungType_Name();

		/**
		 * The meta object literal for the '<em><b>Beschreibung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__BESCHREIBUNG = eINSTANCE.getAnwendungsspezifischeErweiterungType_Beschreibung();

		/**
		 * The meta object literal for the '<em><b>Versionsnummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__VERSIONSNUMMER = eINSTANCE.getAnwendungsspezifischeErweiterungType_Versionsnummer();

		/**
		 * The meta object literal for the '<em><b>Versionsdatum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__VERSIONSDATUM = eINSTANCE.getAnwendungsspezifischeErweiterungType_Versionsdatum();

		/**
		 * The meta object literal for the '<em><b>Feldgruppe</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__FELDGRUPPE = eINSTANCE.getAnwendungsspezifischeErweiterungType_Feldgruppe();

		/**
		 * The meta object literal for the '<em><b>Feld</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_TYPE__FELD = eINSTANCE.getAnwendungsspezifischeErweiterungType_Feld();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.AnwendungsspezifischeErweiterungXMLTypeImpl <em>Anwendungsspezifische Erweiterung XML Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.AnwendungsspezifischeErweiterungXMLTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAnwendungsspezifischeErweiterungXMLType()
		 * @generated
		 */
		EClass ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML_TYPE = eINSTANCE.getAnwendungsspezifischeErweiterungXMLType();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML_TYPE__ANY = eINSTANCE.getAnwendungsspezifischeErweiterungXMLType_Any();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.AufbewahrungsdauerTypeImpl <em>Aufbewahrungsdauer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.AufbewahrungsdauerTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAufbewahrungsdauerType()
		 * @generated
		 */
		EClass AUFBEWAHRUNGSDAUER_TYPE = eINSTANCE.getAufbewahrungsdauerType();

		/**
		 * The meta object literal for the '<em><b>Anzahl Jahre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUFBEWAHRUNGSDAUER_TYPE__ANZAHL_JAHRE = eINSTANCE.getAufbewahrungsdauerType_AnzahlJahre();

		/**
		 * The meta object literal for the '<em><b>Unbefristet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUFBEWAHRUNGSDAUER_TYPE__UNBEFRISTET = eINSTANCE.getAufbewahrungsdauerType_Unbefristet();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.AussonderungsartCodeTypeImpl <em>Aussonderungsart Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.AussonderungsartCodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAussonderungsartCodeType()
		 * @generated
		 */
		EClass AUSSONDERUNGSART_CODE_TYPE = eINSTANCE.getAussonderungsartCodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.AussonderungsartTypeImpl <em>Aussonderungsart Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.AussonderungsartTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAussonderungsartType()
		 * @generated
		 */
		EClass AUSSONDERUNGSART_TYPE = eINSTANCE.getAussonderungsartType();

		/**
		 * The meta object literal for the '<em><b>Aussonderungsart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUSSONDERUNGSART_TYPE__AUSSONDERUNGSART = eINSTANCE.getAussonderungsartType_Aussonderungsart();

		/**
		 * The meta object literal for the '<em><b>Aussonderungsart Konfigurierbar</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSSONDERUNGSART_TYPE__AUSSONDERUNGSART_KONFIGURIERBAR = eINSTANCE.getAussonderungsartType_AussonderungsartKonfigurierbar();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.AussonderungsmetadatenTypeImpl <em>Aussonderungsmetadaten Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.AussonderungsmetadatenTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getAussonderungsmetadatenType()
		 * @generated
		 */
		EClass AUSSONDERUNGSMETADATEN_TYPE = eINSTANCE.getAussonderungsmetadatenType();

		/**
		 * The meta object literal for the '<em><b>Aufbewahrungsdauer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUSSONDERUNGSMETADATEN_TYPE__AUFBEWAHRUNGSDAUER = eINSTANCE.getAussonderungsmetadatenType_Aufbewahrungsdauer();

		/**
		 * The meta object literal for the '<em><b>Aussonderungsart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUSSONDERUNGSMETADATEN_TYPE__AUSSONDERUNGSART = eINSTANCE.getAussonderungsmetadatenType_Aussonderungsart();

		/**
		 * The meta object literal for the '<em><b>Kennung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSSONDERUNGSMETADATEN_TYPE__KENNUNG = eINSTANCE.getAussonderungsmetadatenType_Kennung();

		/**
		 * The meta object literal for the '<em><b>Bewertungsvorschlag</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUSSONDERUNGSMETADATEN_TYPE__BEWERTUNGSVORSCHLAG = eINSTANCE.getAussonderungsmetadatenType_Bewertungsvorschlag();

		/**
		 * The meta object literal for the '<em><b>Bewertungsvorschlag Begruendung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSSONDERUNGSMETADATEN_TYPE__BEWERTUNGSVORSCHLAG_BEGRUENDUNG = eINSTANCE.getAussonderungsmetadatenType_BewertungsvorschlagBegruendung();

		/**
		 * The meta object literal for the '<em><b>Aufbewahrungsende</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSSONDERUNGSMETADATEN_TYPE__AUFBEWAHRUNGSENDE = eINSTANCE.getAussonderungsmetadatenType_Aufbewahrungsende();

		/**
		 * The meta object literal for the '<em><b>Transferfristende</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSSONDERUNGSMETADATEN_TYPE__TRANSFERFRISTENDE = eINSTANCE.getAussonderungsmetadatenType_Transferfristende();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.BearbeitungTypeImpl <em>Bearbeitung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.BearbeitungTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getBearbeitungType()
		 * @generated
		 */
		EClass BEARBEITUNG_TYPE = eINSTANCE.getBearbeitungType();

		/**
		 * The meta object literal for the '<em><b>Bearbeiter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEARBEITUNG_TYPE__BEARBEITER = eINSTANCE.getBearbeitungType_Bearbeiter();

		/**
		 * The meta object literal for the '<em><b>Datum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEARBEITUNG_TYPE__DATUM = eINSTANCE.getBearbeitungType_Datum();

		/**
		 * The meta object literal for the '<em><b>Uhrzeit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEARBEITUNG_TYPE__UHRZEIT = eINSTANCE.getBearbeitungType_Uhrzeit();

		/**
		 * The meta object literal for the '<em><b>Vermerk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEARBEITUNG_TYPE__VERMERK = eINSTANCE.getBearbeitungType_Vermerk();

		/**
		 * The meta object literal for the '<em><b>Notiz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEARBEITUNG_TYPE__NOTIZ = eINSTANCE.getBearbeitungType_Notiz();

		/**
		 * The meta object literal for the '<em><b>Anlage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEARBEITUNG_TYPE__ANLAGE = eINSTANCE.getBearbeitungType_Anlage();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.BehoerdeTypeImpl <em>Behoerde Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.BehoerdeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getBehoerdeType()
		 * @generated
		 */
		EClass BEHOERDE_TYPE = eINSTANCE.getBehoerdeType();

		/**
		 * The meta object literal for the '<em><b>Verzeichnisdienst</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHOERDE_TYPE__VERZEICHNISDIENST = eINSTANCE.getBehoerdeType_Verzeichnisdienst();

		/**
		 * The meta object literal for the '<em><b>Kennung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHOERDE_TYPE__KENNUNG = eINSTANCE.getBehoerdeType_Kennung();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.BeteiligungsschrittTypeImpl <em>Beteiligungsschritt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.BeteiligungsschrittTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getBeteiligungsschrittType()
		 * @generated
		 */
		EClass BETEILIGUNGSSCHRITT_TYPE = eINSTANCE.getBeteiligungsschrittType();

		/**
		 * The meta object literal for the '<em><b>Nummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BETEILIGUNGSSCHRITT_TYPE__NUMMER = eINSTANCE.getBeteiligungsschrittType_Nummer();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BETEILIGUNGSSCHRITT_TYPE__STATUS = eINSTANCE.getBeteiligungsschrittType_Status();

		/**
		 * The meta object literal for the '<em><b>Verfuegung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BETEILIGUNGSSCHRITT_TYPE__VERFUEGUNG = eINSTANCE.getBeteiligungsschrittType_Verfuegung();

		/**
		 * The meta object literal for the '<em><b>Bearbeitung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BETEILIGUNGSSCHRITT_TYPE__BEARBEITUNG = eINSTANCE.getBeteiligungsschrittType_Bearbeitung();

		/**
		 * The meta object literal for the '<em><b>Parallel Zu Beteiligungsschritt</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BETEILIGUNGSSCHRITT_TYPE__PARALLEL_ZU_BETEILIGUNGSSCHRITT = eINSTANCE.getBeteiligungsschrittType_ParallelZuBeteiligungsschritt();

		/**
		 * The meta object literal for the '<em><b>Version Nummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BETEILIGUNGSSCHRITT_TYPE__VERSION_NUMMER = eINSTANCE.getBeteiligungsschrittType_VersionNummer();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.BeteiligungsstatusCodeTypeImpl <em>Beteiligungsstatus Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.BeteiligungsstatusCodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getBeteiligungsstatusCodeType()
		 * @generated
		 */
		EClass BETEILIGUNGSSTATUS_CODE_TYPE = eINSTANCE.getBeteiligungsstatusCodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.BewertungsvorschlagCodeTypeImpl <em>Bewertungsvorschlag Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.BewertungsvorschlagCodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getBewertungsvorschlagCodeType()
		 * @generated
		 */
		EClass BEWERTUNGSVORSCHLAG_CODE_TYPE = eINSTANCE.getBewertungsvorschlagCodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.DateiformatCodeTypeImpl <em>Dateiformat Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.DateiformatCodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getDateiformatCodeType()
		 * @generated
		 */
		EClass DATEIFORMAT_CODE_TYPE = eINSTANCE.getDateiformatCodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.DatenaustauschartCodeTypeImpl <em>Datenaustauschart Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.DatenaustauschartCodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getDatenaustauschartCodeType()
		 * @generated
		 */
		EClass DATENAUSTAUSCHART_CODE_TYPE = eINSTANCE.getDatenaustauschartCodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.DatenschutzstufeCodeTypeImpl <em>Datenschutzstufe Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.DatenschutzstufeCodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getDatenschutzstufeCodeType()
		 * @generated
		 */
		EClass DATENSCHUTZSTUFE_CODE_TYPE = eINSTANCE.getDatenschutzstufeCodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.DatentypCodeTypeImpl <em>Datentyp Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.DatentypCodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getDatentypCodeType()
		 * @generated
		 */
		EClass DATENTYP_CODE_TYPE = eINSTANCE.getDatentypCodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.DokumentMitSchriftstueckTypeImpl <em>Dokument Mit Schriftstueck Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.DokumentMitSchriftstueckTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getDokumentMitSchriftstueckType()
		 * @generated
		 */
		EClass DOKUMENT_MIT_SCHRIFTSTUECK_TYPE = eINSTANCE.getDokumentMitSchriftstueckType();

		/**
		 * The meta object literal for the '<em><b>Schriftstueck</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__SCHRIFTSTUECK = eINSTANCE.getDokumentMitSchriftstueckType_Schriftstueck();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.DokumentOderDokumentMitSchriftstueckTypeImpl <em>Dokument Oder Dokument Mit Schriftstueck Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.DokumentOderDokumentMitSchriftstueckTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getDokumentOderDokumentMitSchriftstueckType()
		 * @generated
		 */
		EClass DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE = eINSTANCE.getDokumentOderDokumentMitSchriftstueckType();

		/**
		 * The meta object literal for the '<em><b>Dokument</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT = eINSTANCE.getDokumentOderDokumentMitSchriftstueckType_Dokument();

		/**
		 * The meta object literal for the '<em><b>Dokument Mit Schriftstueck</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK_TYPE__DOKUMENT_MIT_SCHRIFTSTUECK = eINSTANCE.getDokumentOderDokumentMitSchriftstueckType_DokumentMitSchriftstueck();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.DokumentSchriftstueckBasisTypeImpl <em>Dokument Schriftstueck Basis Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.DokumentSchriftstueckBasisTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getDokumentSchriftstueckBasisType()
		 * @generated
		 */
		EClass DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE = eINSTANCE.getDokumentSchriftstueckBasisType();

		/**
		 * The meta object literal for the '<em><b>Identifikation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__IDENTIFIKATION = eINSTANCE.getDokumentSchriftstueckBasisType_Identifikation();

		/**
		 * The meta object literal for the '<em><b>Allgemeine Metadaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ALLGEMEINE_METADATEN = eINSTANCE.getDokumentSchriftstueckBasisType_AllgemeineMetadaten();

		/**
		 * The meta object literal for the '<em><b>Fremdes Geschaeftszeichen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__FREMDES_GESCHAEFTSZEICHEN = eINSTANCE.getDokumentSchriftstueckBasisType_FremdesGeschaeftszeichen();

		/**
		 * The meta object literal for the '<em><b>Posteingangsdatum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__POSTEINGANGSDATUM = eINSTANCE.getDokumentSchriftstueckBasisType_Posteingangsdatum();

		/**
		 * The meta object literal for the '<em><b>Postausgangsdatum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__POSTAUSGANGSDATUM = eINSTANCE.getDokumentSchriftstueckBasisType_Postausgangsdatum();

		/**
		 * The meta object literal for the '<em><b>Datum Des Schreibens</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__DATUM_DES_SCHREIBENS = eINSTANCE.getDokumentSchriftstueckBasisType_DatumDesSchreibens();

		/**
		 * The meta object literal for the '<em><b>Bezug</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__BEZUG = eINSTANCE.getDokumentSchriftstueckBasisType_Bezug();

		/**
		 * The meta object literal for the '<em><b>Hier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__HIER = eINSTANCE.getDokumentSchriftstueckBasisType_Hier();

		/**
		 * The meta object literal for the '<em><b>Bearbeiter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__BEARBEITER = eINSTANCE.getDokumentSchriftstueckBasisType_Bearbeiter();

		/**
		 * The meta object literal for the '<em><b>Typ</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__TYP = eINSTANCE.getDokumentSchriftstueckBasisType_Typ();

		/**
		 * The meta object literal for the '<em><b>Historien Protokoll Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__HISTORIEN_PROTOKOLL_INFORMATION = eINSTANCE.getDokumentSchriftstueckBasisType_HistorienProtokollInformation();

		/**
		 * The meta object literal for the '<em><b>Interner Geschaeftsgang</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__INTERNER_GESCHAEFTSGANG = eINSTANCE.getDokumentSchriftstueckBasisType_InternerGeschaeftsgang();

		/**
		 * The meta object literal for the '<em><b>Verweis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__VERWEIS = eINSTANCE.getDokumentSchriftstueckBasisType_Verweis();

		/**
		 * The meta object literal for the '<em><b>Anlage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANLAGE = eINSTANCE.getDokumentSchriftstueckBasisType_Anlage();

		/**
		 * The meta object literal for the '<em><b>Autor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__AUTOR = eINSTANCE.getDokumentSchriftstueckBasisType_Autor();

		/**
		 * The meta object literal for the '<em><b>Leser</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__LESER = eINSTANCE.getDokumentSchriftstueckBasisType_Leser();

		/**
		 * The meta object literal for the '<em><b>Weiterer Kontakt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__WEITERER_KONTAKT = eINSTANCE.getDokumentSchriftstueckBasisType_WeitererKontakt();

		/**
		 * The meta object literal for the '<em><b>Anwendungsspezifische Erweiterung</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG = eINSTANCE.getDokumentSchriftstueckBasisType_AnwendungsspezifischeErweiterung();

		/**
		 * The meta object literal for the '<em><b>Anwendungsspezifische Erweiterung XML</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOKUMENT_SCHRIFTSTUECK_BASIS_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML = eINSTANCE.getDokumentSchriftstueckBasisType_AnwendungsspezifischeErweiterungXML();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.DokumentTypeImpl <em>Dokument Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.DokumentTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getDokumentType()
		 * @generated
		 */
		EClass DOKUMENT_TYPE = eINSTANCE.getDokumentType();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOKUMENT_TYPE__VERSION = eINSTANCE.getDokumentType_Version();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.ErfolgOderMisserfolgImportTypeImpl <em>Erfolg Oder Misserfolg Import Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.ErfolgOderMisserfolgImportTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getErfolgOderMisserfolgImportType()
		 * @generated
		 */
		EClass ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE = eINSTANCE.getErfolgOderMisserfolgImportType();

		/**
		 * The meta object literal for the '<em><b>Erfolgreich</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__ERFOLGREICH = eINSTANCE.getErfolgOderMisserfolgImportType_Erfolgreich();

		/**
		 * The meta object literal for the '<em><b>Fehlermeldung</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__FEHLERMELDUNG = eINSTANCE.getErfolgOderMisserfolgImportType_Fehlermeldung();

		/**
		 * The meta object literal for the '<em><b>Fehlermeldung Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__FEHLERMELDUNG_CODE = eINSTANCE.getErfolgOderMisserfolgImportType_FehlermeldungCode();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.FeldgruppeTypeImpl <em>Feldgruppe Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.FeldgruppeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getFeldgruppeType()
		 * @generated
		 */
		EClass FELDGRUPPE_TYPE = eINSTANCE.getFeldgruppeType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FELDGRUPPE_TYPE__NAME = eINSTANCE.getFeldgruppeType_Name();

		/**
		 * The meta object literal for the '<em><b>Beschreibung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FELDGRUPPE_TYPE__BESCHREIBUNG = eINSTANCE.getFeldgruppeType_Beschreibung();

		/**
		 * The meta object literal for the '<em><b>Unterfeldgruppe</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FELDGRUPPE_TYPE__UNTERFELDGRUPPE = eINSTANCE.getFeldgruppeType_Unterfeldgruppe();

		/**
		 * The meta object literal for the '<em><b>Feld</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FELDGRUPPE_TYPE__FELD = eINSTANCE.getFeldgruppeType_Feld();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.FeldTypeImpl <em>Feld Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.FeldTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getFeldType()
		 * @generated
		 */
		EClass FELD_TYPE = eINSTANCE.getFeldType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FELD_TYPE__NAME = eINSTANCE.getFeldType_Name();

		/**
		 * The meta object literal for the '<em><b>Beschreibung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FELD_TYPE__BESCHREIBUNG = eINSTANCE.getFeldType_Beschreibung();

		/**
		 * The meta object literal for the '<em><b>Datentyp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FELD_TYPE__DATENTYP = eINSTANCE.getFeldType_Datentyp();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FELD_TYPE__WERT = eINSTANCE.getFeldType_Wert();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.FormatTypeImpl <em>Format Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.FormatTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getFormatType()
		 * @generated
		 */
		EClass FORMAT_TYPE = eINSTANCE.getFormatType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAT_TYPE__NAME = eINSTANCE.getFormatType_Name();

		/**
		 * The meta object literal for the '<em><b>Sonstiger Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAT_TYPE__SONSTIGER_NAME = eINSTANCE.getFormatType_SonstigerName();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAT_TYPE__VERSION = eINSTANCE.getFormatType_Version();

		/**
		 * The meta object literal for the '<em><b>Primaerdokument</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAT_TYPE__PRIMAERDOKUMENT = eINSTANCE.getFormatType_Primaerdokument();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.GeburtTypeImpl <em>Geburt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.GeburtTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getGeburtType()
		 * @generated
		 */
		EClass GEBURT_TYPE = eINSTANCE.getGeburtType();

		/**
		 * The meta object literal for the '<em><b>Datum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEBURT_TYPE__DATUM = eINSTANCE.getGeburtType_Datum();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.GeheimhaltungsgradCodeTypeImpl <em>Geheimhaltungsgrad Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.GeheimhaltungsgradCodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getGeheimhaltungsgradCodeType()
		 * @generated
		 */
		EClass GEHEIMHALTUNGSGRAD_CODE_TYPE = eINSTANCE.getGeheimhaltungsgradCodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.GeheimhaltungTypeImpl <em>Geheimhaltung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.GeheimhaltungTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getGeheimhaltungType()
		 * @generated
		 */
		EClass GEHEIMHALTUNG_TYPE = eINSTANCE.getGeheimhaltungType();

		/**
		 * The meta object literal for the '<em><b>Geheimhaltungsgrad</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEHEIMHALTUNG_TYPE__GEHEIMHALTUNGSGRAD = eINSTANCE.getGeheimhaltungType_Geheimhaltungsgrad();

		/**
		 * The meta object literal for the '<em><b>Einstufungsfrist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEHEIMHALTUNG_TYPE__EINSTUFUNGSFRIST = eINSTANCE.getGeheimhaltungType_Einstufungsfrist();

		/**
		 * The meta object literal for the '<em><b>Eingestuft Am</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEHEIMHALTUNG_TYPE__EINGESTUFT_AM = eINSTANCE.getGeheimhaltungType_EingestuftAm();

		/**
		 * The meta object literal for the '<em><b>Herausgeber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEHEIMHALTUNG_TYPE__HERAUSGEBER = eINSTANCE.getGeheimhaltungType_Herausgeber();

		/**
		 * The meta object literal for the '<em><b>Einstufung Endet Am</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEHEIMHALTUNG_TYPE__EINSTUFUNG_ENDET_AM = eINSTANCE.getGeheimhaltungType_EinstufungEndetAm();

		/**
		 * The meta object literal for the '<em><b>Bemerkung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEHEIMHALTUNG_TYPE__BEMERKUNG = eINSTANCE.getGeheimhaltungType_Bemerkung();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.GeschaeftsgangTypeImpl <em>Geschaeftsgang Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.GeschaeftsgangTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getGeschaeftsgangType()
		 * @generated
		 */
		EClass GESCHAEFTSGANG_TYPE = eINSTANCE.getGeschaeftsgangType();

		/**
		 * The meta object literal for the '<em><b>Identifikation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GESCHAEFTSGANG_TYPE__IDENTIFIKATION = eINSTANCE.getGeschaeftsgangType_Identifikation();

		/**
		 * The meta object literal for the '<em><b>Beteiligungsschritt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GESCHAEFTSGANG_TYPE__BETEILIGUNGSSCHRITT = eINSTANCE.getGeschaeftsgangType_Beteiligungsschritt();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.HashTypeImpl <em>Hash Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.HashTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getHashType()
		 * @generated
		 */
		EClass HASH_TYPE = eINSTANCE.getHashType();

		/**
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASH_TYPE__WERT = eINSTANCE.getHashType_Wert();

		/**
		 * The meta object literal for the '<em><b>Algorithmus</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HASH_TYPE__ALGORITHMUS = eINSTANCE.getHashType_Algorithmus();

		/**
		 * The meta object literal for the '<em><b>Sonstiger Algorithmus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HASH_TYPE__SONSTIGER_ALGORITHMUS = eINSTANCE.getHashType_SonstigerAlgorithmus();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.HistorienProtokollInformationTypeImpl <em>Historien Protokoll Information Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.HistorienProtokollInformationTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getHistorienProtokollInformationType()
		 * @generated
		 */
		EClass HISTORIEN_PROTOKOLL_INFORMATION_TYPE = eINSTANCE.getHistorienProtokollInformationType();

		/**
		 * The meta object literal for the '<em><b>Metadatum Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_NAME = eINSTANCE.getHistorienProtokollInformationType_MetadatumName();

		/**
		 * The meta object literal for the '<em><b>Metadatum Alter Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_ALTER_WERT = eINSTANCE.getHistorienProtokollInformationType_MetadatumAlterWert();

		/**
		 * The meta object literal for the '<em><b>Metadatum Neuer Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORIEN_PROTOKOLL_INFORMATION_TYPE__METADATUM_NEUER_WERT = eINSTANCE.getHistorienProtokollInformationType_MetadatumNeuerWert();

		/**
		 * The meta object literal for the '<em><b>Akteur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORIEN_PROTOKOLL_INFORMATION_TYPE__AKTEUR = eINSTANCE.getHistorienProtokollInformationType_Akteur();

		/**
		 * The meta object literal for the '<em><b>Datum Uhrzeit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORIEN_PROTOKOLL_INFORMATION_TYPE__DATUM_UHRZEIT = eINSTANCE.getHistorienProtokollInformationType_DatumUhrzeit();

		/**
		 * The meta object literal for the '<em><b>Bemerkung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORIEN_PROTOKOLL_INFORMATION_TYPE__BEMERKUNG = eINSTANCE.getHistorienProtokollInformationType_Bemerkung();

		/**
		 * The meta object literal for the '<em><b>Aktion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORIEN_PROTOKOLL_INFORMATION_TYPE__AKTION = eINSTANCE.getHistorienProtokollInformationType_Aktion();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.IdentifikationNachrichtTypeImpl <em>Identifikation Nachricht Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.IdentifikationNachrichtTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getIdentifikationNachrichtType()
		 * @generated
		 */
		EClass IDENTIFIKATION_NACHRICHT_TYPE = eINSTANCE.getIdentifikationNachrichtType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.IdentifikationObjektTypeImpl <em>Identifikation Objekt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.IdentifikationObjektTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getIdentifikationObjektType()
		 * @generated
		 */
		EClass IDENTIFIKATION_OBJEKT_TYPE = eINSTANCE.getIdentifikationObjektType();

		/**
		 * The meta object literal for the '<em><b>Xdomea UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIKATION_OBJEKT_TYPE__XDOMEA_UUID = eINSTANCE.getIdentifikationObjektType_XdomeaUUID();

		/**
		 * The meta object literal for the '<em><b>Nummer Im Uebergeordneten Container</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIKATION_OBJEKT_TYPE__NUMMER_IM_UEBERGEORDNETEN_CONTAINER = eINSTANCE.getIdentifikationObjektType_NummerImUebergeordnetenContainer();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.KommunikationTypeImpl <em>Kommunikation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.KommunikationTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getKommunikationType()
		 * @generated
		 */
		EClass KOMMUNIKATION_TYPE = eINSTANCE.getKommunikationType();

		/**
		 * The meta object literal for the '<em><b>Ist Dienstlich</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KOMMUNIKATION_TYPE__IST_DIENSTLICH = eINSTANCE.getKommunikationType_IstDienstlich();

		/**
		 * The meta object literal for the '<em><b>Ist Institution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KOMMUNIKATION_TYPE__IST_INSTITUTION = eINSTANCE.getKommunikationType_IstInstitution();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.KompressionsverfahrenCodeTypeImpl <em>Kompressionsverfahren Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.KompressionsverfahrenCodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getKompressionsverfahrenCodeType()
		 * @generated
		 */
		EClass KOMPRESSIONSVERFAHREN_CODE_TYPE = eINSTANCE.getKompressionsverfahrenCodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.KonfigurationsparameterCodeTypeImpl <em>Konfigurationsparameter Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.KonfigurationsparameterCodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getKonfigurationsparameterCodeType()
		 * @generated
		 */
		EClass KONFIGURATIONSPARAMETER_CODE_TYPE = eINSTANCE.getKonfigurationsparameterCodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.KonfigurationsparameterGruppeCodeTypeImpl <em>Konfigurationsparameter Gruppe Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.KonfigurationsparameterGruppeCodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getKonfigurationsparameterGruppeCodeType()
		 * @generated
		 */
		EClass KONFIGURATIONSPARAMETER_GRUPPE_CODE_TYPE = eINSTANCE.getKonfigurationsparameterGruppeCodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.KontaktTypeImpl <em>Kontakt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.KontaktTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getKontaktType()
		 * @generated
		 */
		EClass KONTAKT_TYPE = eINSTANCE.getKontaktType();

		/**
		 * The meta object literal for the '<em><b>Behoerdenkennung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTAKT_TYPE__BEHOERDENKENNUNG = eINSTANCE.getKontaktType_Behoerdenkennung();

		/**
		 * The meta object literal for the '<em><b>Name Institution</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTAKT_TYPE__NAME_INSTITUTION = eINSTANCE.getKontaktType_NameInstitution();

		/**
		 * The meta object literal for the '<em><b>Name Organisationseinheit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTAKT_TYPE__NAME_ORGANISATIONSEINHEIT = eINSTANCE.getKontaktType_NameOrganisationseinheit();

		/**
		 * The meta object literal for the '<em><b>Name Ansprechpartner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTAKT_TYPE__NAME_ANSPRECHPARTNER = eINSTANCE.getKontaktType_NameAnsprechpartner();

		/**
		 * The meta object literal for the '<em><b>Taetigkeit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONTAKT_TYPE__TAETIGKEIT = eINSTANCE.getKontaktType_Taetigkeit();

		/**
		 * The meta object literal for the '<em><b>Zustaendigkeit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONTAKT_TYPE__ZUSTAENDIGKEIT = eINSTANCE.getKontaktType_Zustaendigkeit();

		/**
		 * The meta object literal for the '<em><b>Anschrift</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTAKT_TYPE__ANSCHRIFT = eINSTANCE.getKontaktType_Anschrift();

		/**
		 * The meta object literal for the '<em><b>Erreichbarkeit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTAKT_TYPE__ERREICHBARKEIT = eINSTANCE.getKontaktType_Erreichbarkeit();

		/**
		 * The meta object literal for the '<em><b>Rolle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KONTAKT_TYPE__ROLLE = eINSTANCE.getKontaktType_Rolle();

		/**
		 * The meta object literal for the '<em><b>Rolle Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTAKT_TYPE__ROLLE_CODE = eINSTANCE.getKontaktType_RolleCode();

		/**
		 * The meta object literal for the '<em><b>Unstrukturierte Anschrift</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTAKT_TYPE__UNSTRUKTURIERTE_ANSCHRIFT = eINSTANCE.getKontaktType_UnstrukturierteAnschrift();

		/**
		 * The meta object literal for the '<em><b>Geburt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTAKT_TYPE__GEBURT = eINSTANCE.getKontaktType_Geburt();

		/**
		 * The meta object literal for the '<em><b>Anwendungsspezifische Erweiterung</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTAKT_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG = eINSTANCE.getKontaktType_AnwendungsspezifischeErweiterung();

		/**
		 * The meta object literal for the '<em><b>Anwendungsspezifische Erweiterung XML</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KONTAKT_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML = eINSTANCE.getKontaktType_AnwendungsspezifischeErweiterungXML();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.KryptographischeAlgorithmenCodeTypeImpl <em>Kryptographische Algorithmen Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.KryptographischeAlgorithmenCodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getKryptographischeAlgorithmenCodeType()
		 * @generated
		 */
		EClass KRYPTOGRAPHISCHE_ALGORITHMEN_CODE_TYPE = eINSTANCE.getKryptographischeAlgorithmenCodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.MediumCodeTypeImpl <em>Medium Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.MediumCodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getMediumCodeType()
		 * @generated
		 */
		EClass MEDIUM_CODE_TYPE = eINSTANCE.getMediumCodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.NachrichtenkopfTypeImpl <em>Nachrichtenkopf Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.NachrichtenkopfTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getNachrichtenkopfType()
		 * @generated
		 */
		EClass NACHRICHTENKOPF_TYPE = eINSTANCE.getNachrichtenkopfType();

		/**
		 * The meta object literal for the '<em><b>Identifikation Nachricht</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHRICHTENKOPF_TYPE__IDENTIFIKATION_NACHRICHT = eINSTANCE.getNachrichtenkopfType_IdentifikationNachricht();

		/**
		 * The meta object literal for the '<em><b>Leser</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHRICHTENKOPF_TYPE__LESER = eINSTANCE.getNachrichtenkopfType_Leser();

		/**
		 * The meta object literal for the '<em><b>Autor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHRICHTENKOPF_TYPE__AUTOR = eINSTANCE.getNachrichtenkopfType_Autor();

		/**
		 * The meta object literal for the '<em><b>Prozess ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHRICHTENKOPF_TYPE__PROZESS_ID = eINSTANCE.getNachrichtenkopfType_ProzessID();

		/**
		 * The meta object literal for the '<em><b>Instanz ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHRICHTENKOPF_TYPE__INSTANZ_ID = eINSTANCE.getNachrichtenkopfType_InstanzID();

		/**
		 * The meta object literal for the '<em><b>Hinweis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHRICHTENKOPF_TYPE__HINWEIS = eINSTANCE.getNachrichtenkopfType_Hinweis();

		/**
		 * The meta object literal for the '<em><b>Anwendungsspezifische Erweiterung</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHRICHTENKOPF_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG = eINSTANCE.getNachrichtenkopfType_AnwendungsspezifischeErweiterung();

		/**
		 * The meta object literal for the '<em><b>Anwendungsspezifische Erweiterung XML</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHRICHTENKOPF_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML = eINSTANCE.getNachrichtenkopfType_AnwendungsspezifischeErweiterungXML();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.NachrichtentypCodeTypeImpl <em>Nachrichtentyp Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.NachrichtentypCodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getNachrichtentypCodeType()
		 * @generated
		 */
		EClass NACHRICHTENTYP_CODE_TYPE = eINSTANCE.getNachrichtentypCodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.NachrichtTypeImpl <em>Nachricht Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.NachrichtTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getNachrichtType()
		 * @generated
		 */
		EClass NACHRICHT_TYPE = eINSTANCE.getNachrichtType();

		/**
		 * The meta object literal for the '<em><b>Nachrichtenkopf</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHRICHT_TYPE__NACHRICHTENKOPF = eINSTANCE.getNachrichtType_Nachrichtenkopf();

		/**
		 * The meta object literal for the '<em><b>Produkt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHRICHT_TYPE__PRODUKT = eINSTANCE.getNachrichtType_Produkt();

		/**
		 * The meta object literal for the '<em><b>Produkthersteller</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHRICHT_TYPE__PRODUKTHERSTELLER = eINSTANCE.getNachrichtType_Produkthersteller();

		/**
		 * The meta object literal for the '<em><b>Produktversion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHRICHT_TYPE__PRODUKTVERSION = eINSTANCE.getNachrichtType_Produktversion();

		/**
		 * The meta object literal for the '<em><b>Standard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHRICHT_TYPE__STANDARD = eINSTANCE.getNachrichtType_Standard();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHRICHT_TYPE__TEST = eINSTANCE.getNachrichtType_Test();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHRICHT_TYPE__VERSION = eINSTANCE.getNachrichtType_Version();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.NameNatuerlichePersonTypeImpl <em>Name Natuerliche Person Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.NameNatuerlichePersonTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getNameNatuerlichePersonType()
		 * @generated
		 */
		EClass NAME_NATUERLICHE_PERSON_TYPE = eINSTANCE.getNameNatuerlichePersonType();

		/**
		 * The meta object literal for the '<em><b>Anrede</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_NATUERLICHE_PERSON_TYPE__ANREDE = eINSTANCE.getNameNatuerlichePersonType_Anrede();

		/**
		 * The meta object literal for the '<em><b>Titel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_NATUERLICHE_PERSON_TYPE__TITEL = eINSTANCE.getNameNatuerlichePersonType_Titel();

		/**
		 * The meta object literal for the '<em><b>Familienname</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_NATUERLICHE_PERSON_TYPE__FAMILIENNAME = eINSTANCE.getNameNatuerlichePersonType_Familienname();

		/**
		 * The meta object literal for the '<em><b>Vorname</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_NATUERLICHE_PERSON_TYPE__VORNAME = eINSTANCE.getNameNatuerlichePersonType_Vorname();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.NameOrganisationTypeImpl <em>Name Organisation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.NameOrganisationTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getNameOrganisationType()
		 * @generated
		 */
		EClass NAME_ORGANISATION_TYPE = eINSTANCE.getNameOrganisationType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_ORGANISATION_TYPE__NAME = eINSTANCE.getNameOrganisationType_Name();

		/**
		 * The meta object literal for the '<em><b>Kurzbezeichnung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_ORGANISATION_TYPE__KURZBEZEICHNUNG = eINSTANCE.getNameOrganisationType_Kurzbezeichnung();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.NkFVDatenTypeImpl <em>Nk FV Daten Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.NkFVDatenTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getNkFVDatenType()
		 * @generated
		 */
		EClass NK_FV_DATEN_TYPE = eINSTANCE.getNkFVDatenType();

		/**
		 * The meta object literal for the '<em><b>Empfangendes System</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NK_FV_DATEN_TYPE__EMPFANGENDES_SYSTEM = eINSTANCE.getNkFVDatenType_EmpfangendesSystem();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.NkNichtFVDatenEinLeserMitEmpfangsbestaetigungTypeImpl <em>Nk Nicht FV Daten Ein Leser Mit Empfangsbestaetigung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.NkNichtFVDatenEinLeserMitEmpfangsbestaetigungTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getNkNichtFVDatenEinLeserMitEmpfangsbestaetigungType()
		 * @generated
		 */
		EClass NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE = eINSTANCE.getNkNichtFVDatenEinLeserMitEmpfangsbestaetigungType();

		/**
		 * The meta object literal for the '<em><b>Empfangsbestaetigung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NK_NICHT_FV_DATEN_EIN_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__EMPFANGSBESTAETIGUNG = eINSTANCE.getNkNichtFVDatenEinLeserMitEmpfangsbestaetigungType_Empfangsbestaetigung();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungTypeImpl <em>Nk Nicht FV Daten Weitere Leser Mit Empfangsbestaetigung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.NkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getNkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType()
		 * @generated
		 */
		EClass NK_NICHT_FV_DATEN_WEITERE_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE = eINSTANCE.getNkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType();

		/**
		 * The meta object literal for the '<em><b>Empfangsbestaetigung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NK_NICHT_FV_DATEN_WEITERE_LESER_MIT_EMPFANGSBESTAETIGUNG_TYPE__EMPFANGSBESTAETIGUNG = eINSTANCE.getNkNichtFVDatenWeitereLeserMitEmpfangsbestaetigungType_Empfangsbestaetigung();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.NkNichtFVDatenWeitereLeserTypeImpl <em>Nk Nicht FV Daten Weitere Leser Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.NkNichtFVDatenWeitereLeserTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getNkNichtFVDatenWeitereLeserType()
		 * @generated
		 */
		EClass NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE = eINSTANCE.getNkNichtFVDatenWeitereLeserType();

		/**
		 * The meta object literal for the '<em><b>Weiterer Leser</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NK_NICHT_FV_DATEN_WEITERE_LESER_TYPE__WEITERER_LESER = eINSTANCE.getNkNichtFVDatenWeitereLeserType_WeitererLeser();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.OrganisationseinheitTypeImpl <em>Organisationseinheit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.OrganisationseinheitTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getOrganisationseinheitType()
		 * @generated
		 */
		EClass ORGANISATIONSEINHEIT_TYPE = eINSTANCE.getOrganisationseinheitType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORGANISATIONSEINHEIT_TYPE__NAME = eINSTANCE.getOrganisationseinheitType_Name();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.PfadelementTypeImpl <em>Pfadelement Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.PfadelementTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getPfadelementType()
		 * @generated
		 */
		EClass PFADELEMENT_TYPE = eINSTANCE.getPfadelementType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PFADELEMENT_TYPE__NAME = eINSTANCE.getPfadelementType_Name();

		/**
		 * The meta object literal for the '<em><b>Typ</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFADELEMENT_TYPE__TYP = eINSTANCE.getPfadelementType_Typ();

		/**
		 * The meta object literal for the '<em><b>Pfadelement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PFADELEMENT_TYPE__PFADELEMENT = eINSTANCE.getPfadelementType_Pfadelement();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.PrimaerdokumentTypeImpl <em>Primaerdokument Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.PrimaerdokumentTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getPrimaerdokumentType()
		 * @generated
		 */
		EClass PRIMAERDOKUMENT_TYPE = eINSTANCE.getPrimaerdokumentType();

		/**
		 * The meta object literal for the '<em><b>Dateiname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMAERDOKUMENT_TYPE__DATEINAME = eINSTANCE.getPrimaerdokumentType_Dateiname();

		/**
		 * The meta object literal for the '<em><b>Dateiname Original</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMAERDOKUMENT_TYPE__DATEINAME_ORIGINAL = eINSTANCE.getPrimaerdokumentType_DateinameOriginal();

		/**
		 * The meta object literal for the '<em><b>Ersteller</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMAERDOKUMENT_TYPE__ERSTELLER = eINSTANCE.getPrimaerdokumentType_Ersteller();

		/**
		 * The meta object literal for the '<em><b>Datum Uhrzeit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMAERDOKUMENT_TYPE__DATUM_UHRZEIT = eINSTANCE.getPrimaerdokumentType_DatumUhrzeit();

		/**
		 * The meta object literal for the '<em><b>Signatur Siegel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMAERDOKUMENT_TYPE__SIGNATUR_SIEGEL = eINSTANCE.getPrimaerdokumentType_SignaturSiegel();

		/**
		 * The meta object literal for the '<em><b>Zeitpunkt Letzte Aenderung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMAERDOKUMENT_TYPE__ZEITPUNKT_LETZTE_AENDERUNG = eINSTANCE.getPrimaerdokumentType_ZeitpunktLetzteAenderung();

		/**
		 * The meta object literal for the '<em><b>Hash</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMAERDOKUMENT_TYPE__HASH = eINSTANCE.getPrimaerdokumentType_Hash();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.RolleCodeTypeImpl <em>Rolle Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.RolleCodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getRolleCodeType()
		 * @generated
		 */
		EClass ROLLE_CODE_TYPE = eINSTANCE.getRolleCodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SchriftgutobjekttypCodeTypeImpl <em>Schriftgutobjekttyp Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SchriftgutobjekttypCodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSchriftgutobjekttypCodeType()
		 * @generated
		 */
		EClass SCHRIFTGUTOBJEKTTYP_CODE_TYPE = eINSTANCE.getSchriftgutobjekttypCodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SignaturSiegelTypeImpl <em>Signatur Siegel Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SignaturSiegelTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSignaturSiegelType()
		 * @generated
		 */
		EClass SIGNATUR_SIEGEL_TYPE = eINSTANCE.getSignaturSiegelType();

		/**
		 * The meta object literal for the '<em><b>Signatur Siegel Eingebettet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATUR_SIEGEL_TYPE__SIGNATUR_SIEGEL_EINGEBETTET = eINSTANCE.getSignaturSiegelType_SignaturSiegelEingebettet();

		/**
		 * The meta object literal for the '<em><b>Signatur Siegel Datei</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATUR_SIEGEL_TYPE__SIGNATUR_SIEGEL_DATEI = eINSTANCE.getSignaturSiegelType_SignaturSiegelDatei();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SonstigeFehlermeldungCodeTypeImpl <em>Sonstige Fehlermeldung Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SonstigeFehlermeldungCodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSonstigeFehlermeldungCodeType()
		 * @generated
		 */
		EClass SONSTIGE_FEHLERMELDUNG_CODE_TYPE = eINSTANCE.getSonstigeFehlermeldungCodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0601CodeTypeImpl <em>Spezifische Fehlermeldung0601 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0601CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0601CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0601_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0601CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0602CodeTypeImpl <em>Spezifische Fehlermeldung0602 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0602CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0602CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0602_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0602CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0603CodeTypeImpl <em>Spezifische Fehlermeldung0603 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0603CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0603CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0603_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0603CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0604CodeTypeImpl <em>Spezifische Fehlermeldung0604 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0604CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0604CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0604_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0604CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0605CodeTypeImpl <em>Spezifische Fehlermeldung0605 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0605CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0605CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0605_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0605CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0606CodeTypeImpl <em>Spezifische Fehlermeldung0606 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0606CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0606CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0606_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0606CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0607CodeTypeImpl <em>Spezifische Fehlermeldung0607 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0607CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0607CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0607_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0607CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0608CodeTypeImpl <em>Spezifische Fehlermeldung0608 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0608CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0608CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0608_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0608CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0609CodeTypeImpl <em>Spezifische Fehlermeldung0609 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0609CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0609CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0609_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0609CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0610CodeTypeImpl <em>Spezifische Fehlermeldung0610 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0610CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0610CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0610_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0610CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0611CodeTypeImpl <em>Spezifische Fehlermeldung0611 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0611CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0611CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0611_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0611CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0612CodeTypeImpl <em>Spezifische Fehlermeldung0612 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0612CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0612CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0612_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0612CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0613CodeTypeImpl <em>Spezifische Fehlermeldung0613 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0613CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0613CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0613_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0613CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0614CodeTypeImpl <em>Spezifische Fehlermeldung0614 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0614CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0614CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0614_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0614CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0615CodeTypeImpl <em>Spezifische Fehlermeldung0615 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0615CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0615CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0615_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0615CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0616CodeTypeImpl <em>Spezifische Fehlermeldung0616 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0616CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0616CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0616_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0616CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0617CodeTypeImpl <em>Spezifische Fehlermeldung0617 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0617CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0617CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0617_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0617CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0618CodeTypeImpl <em>Spezifische Fehlermeldung0618 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0618CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0618CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0618_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0618CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0619CodeTypeImpl <em>Spezifische Fehlermeldung0619 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0619CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0619CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0619_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0619CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0620CodeTypeImpl <em>Spezifische Fehlermeldung0620 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0620CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0620CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0620_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0620CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0621CodeTypeImpl <em>Spezifische Fehlermeldung0621 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0621CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0621CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0621_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0621CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0622CodeTypeImpl <em>Spezifische Fehlermeldung0622 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0622CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0622CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0622_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0622CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0623CodeTypeImpl <em>Spezifische Fehlermeldung0623 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0623CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0623CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0623_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0623CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0624CodeTypeImpl <em>Spezifische Fehlermeldung0624 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0624CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0624CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0624_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0624CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0625CodeTypeImpl <em>Spezifische Fehlermeldung0625 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0625CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0625CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0625_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0625CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0626CodeTypeImpl <em>Spezifische Fehlermeldung0626 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0626CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0626CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0626_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0626CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0627CodeTypeImpl <em>Spezifische Fehlermeldung0627 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0627CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0627CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0627_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0627CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0628CodeTypeImpl <em>Spezifische Fehlermeldung0628 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0628CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0628CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0628_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0628CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0631CodeTypeImpl <em>Spezifische Fehlermeldung0631 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0631CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0631CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0631_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0631CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SpezifischeFehlermeldung0632CodeTypeImpl <em>Spezifische Fehlermeldung0632 Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SpezifischeFehlermeldung0632CodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSpezifischeFehlermeldung0632CodeType()
		 * @generated
		 */
		EClass SPEZIFISCHE_FEHLERMELDUNG0632_CODE_TYPE = eINSTANCE.getSpezifischeFehlermeldung0632CodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.StaatCodeTypeImpl <em>Staat Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.StaatCodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getStaatCodeType()
		 * @generated
		 */
		EClass STAAT_CODE_TYPE = eINSTANCE.getStaatCodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.StaatTypeImpl <em>Staat Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.StaatTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getStaatType()
		 * @generated
		 */
		EClass STAAT_TYPE = eINSTANCE.getStaatType();

		/**
		 * The meta object literal for the '<em><b>Staat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAAT_TYPE__STAAT = eINSTANCE.getStaatType_Staat();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.StrukturelementTypCodeTypeImpl <em>Strukturelement Typ Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.StrukturelementTypCodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getStrukturelementTypCodeType()
		 * @generated
		 */
		EClass STRUKTURELEMENT_TYP_CODE_TYPE = eINSTANCE.getStrukturelementTypCodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.StrukturpfadTypeImpl <em>Strukturpfad Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.StrukturpfadTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getStrukturpfadType()
		 * @generated
		 */
		EClass STRUKTURPFAD_TYPE = eINSTANCE.getStrukturpfadType();

		/**
		 * The meta object literal for the '<em><b>Pfadelement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUKTURPFAD_TYPE__PFADELEMENT = eINSTANCE.getStrukturpfadType_Pfadelement();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.SystemTypeImpl <em>System Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.SystemTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getSystemType()
		 * @generated
		 */
		EClass SYSTEM_TYPE = eINSTANCE.getSystemType();

		/**
		 * The meta object literal for the '<em><b>Instanz ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_TYPE__INSTANZ_ID = eINSTANCE.getSystemType_InstanzID();

		/**
		 * The meta object literal for the '<em><b>Produktname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_TYPE__PRODUKTNAME = eINSTANCE.getSystemType_Produktname();

		/**
		 * The meta object literal for the '<em><b>Produktversion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_TYPE__PRODUKTVERSION = eINSTANCE.getSystemType_Produktversion();

		/**
		 * The meta object literal for the '<em><b>Produkthersteller</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_TYPE__PRODUKTHERSTELLER = eINSTANCE.getSystemType_Produkthersteller();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.TransportwegCodeTypeImpl <em>Transportweg Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.TransportwegCodeTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getTransportwegCodeType()
		 * @generated
		 */
		EClass TRANSPORTWEG_CODE_TYPE = eINSTANCE.getTransportwegCodeType();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.UnstrukturierteAnschriftTypeImpl <em>Unstrukturierte Anschrift Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.UnstrukturierteAnschriftTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getUnstrukturierteAnschriftType()
		 * @generated
		 */
		EClass UNSTRUKTURIERTE_ANSCHRIFT_TYPE = eINSTANCE.getUnstrukturierteAnschriftType();

		/**
		 * The meta object literal for the '<em><b>Typ</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSTRUKTURIERTE_ANSCHRIFT_TYPE__TYP = eINSTANCE.getUnstrukturierteAnschriftType_Typ();

		/**
		 * The meta object literal for the '<em><b>Zeile1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE1 = eINSTANCE.getUnstrukturierteAnschriftType_Zeile1();

		/**
		 * The meta object literal for the '<em><b>Zeile2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE2 = eINSTANCE.getUnstrukturierteAnschriftType_Zeile2();

		/**
		 * The meta object literal for the '<em><b>Zeile3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE3 = eINSTANCE.getUnstrukturierteAnschriftType_Zeile3();

		/**
		 * The meta object literal for the '<em><b>Zeile4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE4 = eINSTANCE.getUnstrukturierteAnschriftType_Zeile4();

		/**
		 * The meta object literal for the '<em><b>Zeile5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE5 = eINSTANCE.getUnstrukturierteAnschriftType_Zeile5();

		/**
		 * The meta object literal for the '<em><b>Zeile6</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZEILE6 = eINSTANCE.getUnstrukturierteAnschriftType_Zeile6();

		/**
		 * The meta object literal for the '<em><b>Zusatz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNSTRUKTURIERTE_ANSCHRIFT_TYPE__ZUSATZ = eINSTANCE.getUnstrukturierteAnschriftType_Zusatz();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.VerfuegungTypeImpl <em>Verfuegung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.VerfuegungTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getVerfuegungType()
		 * @generated
		 */
		EClass VERFUEGUNG_TYPE = eINSTANCE.getVerfuegungType();

		/**
		 * The meta object literal for the '<em><b>Ersteller</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERFUEGUNG_TYPE__ERSTELLER = eINSTANCE.getVerfuegungType_Ersteller();

		/**
		 * The meta object literal for the '<em><b>Adressat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERFUEGUNG_TYPE__ADRESSAT = eINSTANCE.getVerfuegungType_Adressat();

		/**
		 * The meta object literal for the '<em><b>Erstellungsdatum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERFUEGUNG_TYPE__ERSTELLUNGSDATUM = eINSTANCE.getVerfuegungType_Erstellungsdatum();

		/**
		 * The meta object literal for the '<em><b>Erstellungsuhrzeit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERFUEGUNG_TYPE__ERSTELLUNGSUHRZEIT = eINSTANCE.getVerfuegungType_Erstellungsuhrzeit();

		/**
		 * The meta object literal for the '<em><b>Verfuegung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERFUEGUNG_TYPE__VERFUEGUNG = eINSTANCE.getVerfuegungType_Verfuegung();

		/**
		 * The meta object literal for the '<em><b>Termin Datum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERFUEGUNG_TYPE__TERMIN_DATUM = eINSTANCE.getVerfuegungType_TerminDatum();

		/**
		 * The meta object literal for the '<em><b>Termin Uhrzeit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERFUEGUNG_TYPE__TERMIN_UHRZEIT = eINSTANCE.getVerfuegungType_TerminUhrzeit();

		/**
		 * The meta object literal for the '<em><b>Notiz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERFUEGUNG_TYPE__NOTIZ = eINSTANCE.getVerfuegungType_Notiz();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.VersionTypeImpl <em>Version Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.VersionTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getVersionType()
		 * @generated
		 */
		EClass VERSION_TYPE = eINSTANCE.getVersionType();

		/**
		 * The meta object literal for the '<em><b>Nummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_TYPE__NUMMER = eINSTANCE.getVersionType_Nummer();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERSION_TYPE__FORMAT = eINSTANCE.getVersionType_Format();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.VerweisTypeImpl <em>Verweis Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.VerweisTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getVerweisType()
		 * @generated
		 */
		EClass VERWEIS_TYPE = eINSTANCE.getVerweisType();

		/**
		 * The meta object literal for the '<em><b>Xdomea UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERWEIS_TYPE__XDOMEA_UUID = eINSTANCE.getVerweisType_XdomeaUUID();

		/**
		 * The meta object literal for the '<em><b>SGO Typ</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERWEIS_TYPE__SGO_TYP = eINSTANCE.getVerweisType_SGOTyp();

		/**
		 * The meta object literal for the '<em><b>SGO Kennzeichen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERWEIS_TYPE__SGO_KENNZEICHEN = eINSTANCE.getVerweisType_SGOKennzeichen();

		/**
		 * The meta object literal for the '<em><b>Bemerkung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERWEIS_TYPE__BEMERKUNG = eINSTANCE.getVerweisType_Bemerkung();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.VorgangTypeImpl <em>Vorgang Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.VorgangTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getVorgangType()
		 * @generated
		 */
		EClass VORGANG_TYPE = eINSTANCE.getVorgangType();

		/**
		 * The meta object literal for the '<em><b>Identifikation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORGANG_TYPE__IDENTIFIKATION = eINSTANCE.getVorgangType_Identifikation();

		/**
		 * The meta object literal for the '<em><b>Allgemeine Metadaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORGANG_TYPE__ALLGEMEINE_METADATEN = eINSTANCE.getVorgangType_AllgemeineMetadaten();

		/**
		 * The meta object literal for the '<em><b>Aussonderungsmetadaten</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORGANG_TYPE__AUSSONDERUNGSMETADATEN = eINSTANCE.getVorgangType_Aussonderungsmetadaten();

		/**
		 * The meta object literal for the '<em><b>Aktenbetreff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VORGANG_TYPE__AKTENBETREFF = eINSTANCE.getVorgangType_Aktenbetreff();

		/**
		 * The meta object literal for the '<em><b>Typ</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VORGANG_TYPE__TYP = eINSTANCE.getVorgangType_Typ();

		/**
		 * The meta object literal for the '<em><b>Zd A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VORGANG_TYPE__ZD_A = eINSTANCE.getVorgangType_ZdA();

		/**
		 * The meta object literal for the '<em><b>Zd ADatum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VORGANG_TYPE__ZD_ADATUM = eINSTANCE.getVorgangType_ZdADatum();

		/**
		 * The meta object literal for the '<em><b>Laufzeit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORGANG_TYPE__LAUFZEIT = eINSTANCE.getVorgangType_Laufzeit();

		/**
		 * The meta object literal for the '<em><b>Historien Protokoll Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORGANG_TYPE__HISTORIEN_PROTOKOLL_INFORMATION = eINSTANCE.getVorgangType_HistorienProtokollInformation();

		/**
		 * The meta object literal for the '<em><b>Interner Geschaeftsgang</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORGANG_TYPE__INTERNER_GESCHAEFTSGANG = eINSTANCE.getVorgangType_InternerGeschaeftsgang();

		/**
		 * The meta object literal for the '<em><b>Dokument Oder Dokument Mit Schriftstueck</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORGANG_TYPE__DOKUMENT_ODER_DOKUMENT_MIT_SCHRIFTSTUECK = eINSTANCE.getVorgangType_DokumentOderDokumentMitSchriftstueck();

		/**
		 * The meta object literal for the '<em><b>Verweis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORGANG_TYPE__VERWEIS = eINSTANCE.getVorgangType_Verweis();

		/**
		 * The meta object literal for the '<em><b>Kontakt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORGANG_TYPE__KONTAKT = eINSTANCE.getVorgangType_Kontakt();

		/**
		 * The meta object literal for the '<em><b>Teilvorgang</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORGANG_TYPE__TEILVORGANG = eINSTANCE.getVorgangType_Teilvorgang();

		/**
		 * The meta object literal for the '<em><b>Anwendungsspezifische Erweiterung</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORGANG_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG = eINSTANCE.getVorgangType_AnwendungsspezifischeErweiterung();

		/**
		 * The meta object literal for the '<em><b>Anwendungsspezifische Erweiterung XML</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VORGANG_TYPE__ANWENDUNGSSPEZIFISCHE_ERWEITERUNG_XML = eINSTANCE.getVorgangType_AnwendungsspezifischeErweiterungXML();

		/**
		 * The meta object literal for the '{@link de.xoev.domea.domea.impl.ZeitraumTypeImpl <em>Zeitraum Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.domea.domea.impl.ZeitraumTypeImpl
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getZeitraumType()
		 * @generated
		 */
		EClass ZEITRAUM_TYPE = eINSTANCE.getZeitraumType();

		/**
		 * The meta object literal for the '<em><b>Beginn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZEITRAUM_TYPE__BEGINN = eINSTANCE.getZeitraumType_Beginn();

		/**
		 * The meta object literal for the '<em><b>Ende</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZEITRAUM_TYPE__ENDE = eINSTANCE.getZeitraumType_Ende();

		/**
		 * The meta object literal for the '<em>String Dateiname Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.xoev.domea.domea.impl.DomeaPackageImpl#getStringDateinameType()
		 * @generated
		 */
		EDataType STRING_DATEINAME_TYPE = eINSTANCE.getStringDateinameType();

	}

} //DomeaPackage
