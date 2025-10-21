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
package de.xoev.xfamilie.baukasten._1.baukasten;


import de.xoev.schemata.code.code.Code10Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.xoev.xfamilie.baukasten._1.baukasten.BaukastenFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = BaukastenPackage.eNS_URI, genModel = "/model/xfamilie.genmodel", genModelSourceLocations = {"model/xfamilie.genmodel","de.xoev.familie/model/xfamilie.genmodel"}, ecore="/model/baukasten.ecore", ecoreSourceLocations="/model/baukasten.ecore")
public interface BaukastenPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "baukasten";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.xoev.de/xfamilie/baukasten/1.3.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "baukasten";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BaukastenPackage eINSTANCE = de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.AllgemeinerNameTypeImpl <em>Allgemeiner Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.AllgemeinerNameTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getAllgemeinerNameType()
	 * @generated
	 */
	int ALLGEMEINER_NAME_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINER_NAME_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Nicht Vorhanden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINER_NAME_TYPE__NICHT_VORHANDEN = 1;

	/**
	 * The number of structural features of the '<em>Allgemeiner Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINER_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Allgemeiner Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLGEMEINER_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtTypeImpl <em>Nachricht Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNachrichtType()
	 * @generated
	 */
	int NACHRICHT_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_TYPE__NACHRICHTENKOPF = 0;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE = 1;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_TYPE__PRODUKT = 2;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_TYPE__PRODUKTHERSTELLER = 3;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_TYPE__PRODUKTVERSION = 4;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_TYPE__STANDARD = 5;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_TYPE__TEST = 6;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_TYPE__VERSION = 7;

	/**
	 * The number of structural features of the '<em>Nachricht Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Nachricht Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.AntragsnachrichtTypeImpl <em>Antragsnachricht Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.AntragsnachrichtTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getAntragsnachrichtType()
	 * @generated
	 */
	int ANTRAGSNACHRICHT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Nachrichtenkopf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSNACHRICHT_TYPE__NACHRICHTENKOPF = NACHRICHT_TYPE__NACHRICHTENKOPF;

	/**
	 * The feature id for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSNACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE = NACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE;

	/**
	 * The feature id for the '<em><b>Produkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSNACHRICHT_TYPE__PRODUKT = NACHRICHT_TYPE__PRODUKT;

	/**
	 * The feature id for the '<em><b>Produkthersteller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSNACHRICHT_TYPE__PRODUKTHERSTELLER = NACHRICHT_TYPE__PRODUKTHERSTELLER;

	/**
	 * The feature id for the '<em><b>Produktversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSNACHRICHT_TYPE__PRODUKTVERSION = NACHRICHT_TYPE__PRODUKTVERSION;

	/**
	 * The feature id for the '<em><b>Standard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSNACHRICHT_TYPE__STANDARD = NACHRICHT_TYPE__STANDARD;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSNACHRICHT_TYPE__TEST = NACHRICHT_TYPE__TEST;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSNACHRICHT_TYPE__VERSION = NACHRICHT_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = NACHRICHT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transaktionsid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID = NACHRICHT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Antragsnachricht Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSNACHRICHT_TYPE_FEATURE_COUNT = NACHRICHT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Antragsnachricht Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANTRAGSNACHRICHT_TYPE_OPERATION_COUNT = NACHRICHT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.AufenthaltstitelNachweisbezugTypeImpl <em>Aufenthaltstitel Nachweisbezug Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.AufenthaltstitelNachweisbezugTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getAufenthaltstitelNachweisbezugType()
	 * @generated
	 */
	int AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Dokumenttyp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__DOKUMENTTYP = 0;

	/**
	 * The feature id for the '<em><b>Nebenbestimmungen</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__NEBENBESTIMMUNGEN = 1;

	/**
	 * The feature id for the '<em><b>Ablaufdatum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__ABLAUFDATUM = 2;

	/**
	 * The feature id for the '<em><b>Nachweisbezug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__NACHWEISBEZUG = 3;

	/**
	 * The number of structural features of the '<em>Aufenthaltstitel Nachweisbezug Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Aufenthaltstitel Nachweisbezug Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.AuslandsanschriftTypeImpl <em>Auslandsanschrift Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.AuslandsanschriftTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getAuslandsanschriftType()
	 * @generated
	 */
	int AUSLANDSANSCHRIFT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Staat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSLANDSANSCHRIFT_TYPE__STAAT = 0;

	/**
	 * The feature id for the '<em><b>Anschriftszeile</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSLANDSANSCHRIFT_TYPE__ANSCHRIFTSZEILE = 1;

	/**
	 * The number of structural features of the '<em>Auslandsanschrift Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSLANDSANSCHRIFT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Auslandsanschrift Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUSLANDSANSCHRIFT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.BankverbindungIBANOptionalTypeImpl <em>Bankverbindung IBAN Optional Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BankverbindungIBANOptionalTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getBankverbindungIBANOptionalType()
	 * @generated
	 */
	int BANKVERBINDUNG_IBAN_OPTIONAL_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Inhaber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKVERBINDUNG_IBAN_OPTIONAL_TYPE__INHABER = 0;

	/**
	 * The feature id for the '<em><b>Iban</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKVERBINDUNG_IBAN_OPTIONAL_TYPE__IBAN = 1;

	/**
	 * The feature id for the '<em><b>Bic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKVERBINDUNG_IBAN_OPTIONAL_TYPE__BIC = 2;

	/**
	 * The feature id for the '<em><b>Institut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKVERBINDUNG_IBAN_OPTIONAL_TYPE__INSTITUT = 3;

	/**
	 * The number of structural features of the '<em>Bankverbindung IBAN Optional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKVERBINDUNG_IBAN_OPTIONAL_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bankverbindung IBAN Optional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKVERBINDUNG_IBAN_OPTIONAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.BankverbindungInhaberOptionalTypeImpl <em>Bankverbindung Inhaber Optional Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BankverbindungInhaberOptionalTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getBankverbindungInhaberOptionalType()
	 * @generated
	 */
	int BANKVERBINDUNG_INHABER_OPTIONAL_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Inhaber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__INHABER = 0;

	/**
	 * The feature id for the '<em><b>Iban</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__IBAN = 1;

	/**
	 * The feature id for the '<em><b>Bic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__BIC = 2;

	/**
	 * The feature id for the '<em><b>Institut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__INSTITUT = 3;

	/**
	 * The number of structural features of the '<em>Bankverbindung Inhaber Optional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKVERBINDUNG_INHABER_OPTIONAL_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bankverbindung Inhaber Optional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKVERBINDUNG_INHABER_OPTIONAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.BankverbindungTypeImpl <em>Bankverbindung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BankverbindungTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getBankverbindungType()
	 * @generated
	 */
	int BANKVERBINDUNG_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Inhaber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKVERBINDUNG_TYPE__INHABER = 0;

	/**
	 * The feature id for the '<em><b>Iban</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKVERBINDUNG_TYPE__IBAN = 1;

	/**
	 * The feature id for the '<em><b>Bic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKVERBINDUNG_TYPE__BIC = 2;

	/**
	 * The feature id for the '<em><b>Institut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKVERBINDUNG_TYPE__INSTITUT = 3;

	/**
	 * The number of structural features of the '<em>Bankverbindung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKVERBINDUNG_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bankverbindung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKVERBINDUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.BehoerdenkennungTypeImpl <em>Behoerdenkennung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BehoerdenkennungTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getBehoerdenkennungType()
	 * @generated
	 */
	int BEHOERDENKENNUNG_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Praefix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHOERDENKENNUNG_TYPE__PRAEFIX = 0;

	/**
	 * The feature id for the '<em><b>Kennung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHOERDENKENNUNG_TYPE__KENNUNG = 1;

	/**
	 * The number of structural features of the '<em>Behoerdenkennung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHOERDENKENNUNG_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Behoerdenkennung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHOERDENKENNUNG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeAnredeTypeImpl <em>Code Anrede Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeAnredeTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeAnredeType()
	 * @generated
	 */
	int CODE_ANREDE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ANREDE_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ANREDE_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ANREDE_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ANREDE_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Anrede Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ANREDE_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Anrede Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ANREDE_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeArtAbrufTypeImpl <em>Code Art Abruf Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeArtAbrufTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeArtAbrufType()
	 * @generated
	 */
	int CODE_ART_ABRUF_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ART_ABRUF_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ART_ABRUF_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ART_ABRUF_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ART_ABRUF_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Art Abruf Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ART_ABRUF_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Art Abruf Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ART_ABRUF_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeAufenthaltsstatusTypeImpl <em>Code Aufenthaltsstatus Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeAufenthaltsstatusTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeAufenthaltsstatusType()
	 * @generated
	 */
	int CODE_AUFENTHALTSSTATUS_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUFENTHALTSSTATUS_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUFENTHALTSSTATUS_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUFENTHALTSSTATUS_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUFENTHALTSSTATUS_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Aufenthaltsstatus Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUFENTHALTSSTATUS_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Aufenthaltsstatus Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AUFENTHALTSSTATUS_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeBundeslandTypeImpl <em>Code Bundesland Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeBundeslandTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeBundeslandType()
	 * @generated
	 */
	int CODE_BUNDESLAND_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BUNDESLAND_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BUNDESLAND_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BUNDESLAND_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BUNDESLAND_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Bundesland Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BUNDESLAND_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Bundesland Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BUNDESLAND_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeEigenschaftTypeImpl <em>Code Eigenschaft Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeEigenschaftTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeEigenschaftType()
	 * @generated
	 */
	int CODE_EIGENSCHAFT_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EIGENSCHAFT_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EIGENSCHAFT_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EIGENSCHAFT_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EIGENSCHAFT_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Eigenschaft Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EIGENSCHAFT_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Eigenschaft Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EIGENSCHAFT_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeEinkommensartenTypeImpl <em>Code Einkommensarten Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeEinkommensartenTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeEinkommensartenType()
	 * @generated
	 */
	int CODE_EINKOMMENSARTEN_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKOMMENSARTEN_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKOMMENSARTEN_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKOMMENSARTEN_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKOMMENSARTEN_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Einkommensarten Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKOMMENSARTEN_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Einkommensarten Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_EINKOMMENSARTEN_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeErreichbarkeitTypeImpl <em>Code Erreichbarkeit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeErreichbarkeitTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeErreichbarkeitType()
	 * @generated
	 */
	int CODE_ERREICHBARKEIT_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ERREICHBARKEIT_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ERREICHBARKEIT_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ERREICHBARKEIT_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ERREICHBARKEIT_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Erreichbarkeit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ERREICHBARKEIT_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Erreichbarkeit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ERREICHBARKEIT_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeFamilienstandTypeImpl <em>Code Familienstand Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeFamilienstandTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeFamilienstandType()
	 * @generated
	 */
	int CODE_FAMILIENSTAND_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FAMILIENSTAND_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FAMILIENSTAND_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FAMILIENSTAND_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FAMILIENSTAND_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Familienstand Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FAMILIENSTAND_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Familienstand Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FAMILIENSTAND_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeGemeindeVZAmtlicherGemeindeschluesselTypeImpl <em>Code Gemeinde VZ Amtlicher Gemeindeschluessel Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeGemeindeVZAmtlicherGemeindeschluesselTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeGemeindeVZAmtlicherGemeindeschluesselType()
	 * @generated
	 */
	int CODE_GEMEINDE_VZ_AMTLICHER_GEMEINDESCHLUESSEL_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEMEINDE_VZ_AMTLICHER_GEMEINDESCHLUESSEL_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEMEINDE_VZ_AMTLICHER_GEMEINDESCHLUESSEL_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEMEINDE_VZ_AMTLICHER_GEMEINDESCHLUESSEL_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEMEINDE_VZ_AMTLICHER_GEMEINDESCHLUESSEL_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Gemeinde VZ Amtlicher Gemeindeschluessel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEMEINDE_VZ_AMTLICHER_GEMEINDESCHLUESSEL_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Gemeinde VZ Amtlicher Gemeindeschluessel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEMEINDE_VZ_AMTLICHER_GEMEINDESCHLUESSEL_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeGemeindeVZRegionalschluesselTypeImpl <em>Code Gemeinde VZ Regionalschluessel Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeGemeindeVZRegionalschluesselTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeGemeindeVZRegionalschluesselType()
	 * @generated
	 */
	int CODE_GEMEINDE_VZ_REGIONALSCHLUESSEL_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEMEINDE_VZ_REGIONALSCHLUESSEL_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEMEINDE_VZ_REGIONALSCHLUESSEL_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEMEINDE_VZ_REGIONALSCHLUESSEL_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEMEINDE_VZ_REGIONALSCHLUESSEL_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Gemeinde VZ Regionalschluessel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEMEINDE_VZ_REGIONALSCHLUESSEL_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Gemeinde VZ Regionalschluessel Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GEMEINDE_VZ_REGIONALSCHLUESSEL_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeGeschlechtTypeImpl <em>Code Geschlecht Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeGeschlechtTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeGeschlechtType()
	 * @generated
	 */
	int CODE_GESCHLECHT_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GESCHLECHT_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GESCHLECHT_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GESCHLECHT_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GESCHLECHT_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Geschlecht Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GESCHLECHT_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Geschlecht Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_GESCHLECHT_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeKindschaftsbeziehungTypeImpl <em>Code Kindschaftsbeziehung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeKindschaftsbeziehungTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeKindschaftsbeziehungType()
	 * @generated
	 */
	int CODE_KINDSCHAFTSBEZIEHUNG_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KINDSCHAFTSBEZIEHUNG_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KINDSCHAFTSBEZIEHUNG_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KINDSCHAFTSBEZIEHUNG_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KINDSCHAFTSBEZIEHUNG_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Kindschaftsbeziehung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KINDSCHAFTSBEZIEHUNG_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Kindschaftsbeziehung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KINDSCHAFTSBEZIEHUNG_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeKindWohnhaftBeiTypeImpl <em>Code Kind Wohnhaft Bei Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeKindWohnhaftBeiTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeKindWohnhaftBeiType()
	 * @generated
	 */
	int CODE_KIND_WOHNHAFT_BEI_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KIND_WOHNHAFT_BEI_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KIND_WOHNHAFT_BEI_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KIND_WOHNHAFT_BEI_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KIND_WOHNHAFT_BEI_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Kind Wohnhaft Bei Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KIND_WOHNHAFT_BEI_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Kind Wohnhaft Bei Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_KIND_WOHNHAFT_BEI_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeLeistungserhaltTypeImpl <em>Code Leistungserhalt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeLeistungserhaltTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeLeistungserhaltType()
	 * @generated
	 */
	int CODE_LEISTUNGSERHALT_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LEISTUNGSERHALT_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LEISTUNGSERHALT_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LEISTUNGSERHALT_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LEISTUNGSERHALT_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Leistungserhalt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LEISTUNGSERHALT_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Leistungserhalt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LEISTUNGSERHALT_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeLeistungsgewaehrungTypeImpl <em>Code Leistungsgewaehrung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeLeistungsgewaehrungTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeLeistungsgewaehrungType()
	 * @generated
	 */
	int CODE_LEISTUNGSGEWAEHRUNG_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LEISTUNGSGEWAEHRUNG_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LEISTUNGSGEWAEHRUNG_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LEISTUNGSGEWAEHRUNG_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LEISTUNGSGEWAEHRUNG_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Leistungsgewaehrung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LEISTUNGSGEWAEHRUNG_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Leistungsgewaehrung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LEISTUNGSGEWAEHRUNG_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeNachrichtentypTypeImpl <em>Code Nachrichtentyp Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeNachrichtentypTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeNachrichtentypType()
	 * @generated
	 */
	int CODE_NACHRICHTENTYP_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_NACHRICHTENTYP_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_NACHRICHTENTYP_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_NACHRICHTENTYP_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_NACHRICHTENTYP_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Nachrichtentyp Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_NACHRICHTENTYP_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Nachrichtentyp Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_NACHRICHTENTYP_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeNachweisbezugTypeImpl <em>Code Nachweisbezug Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeNachweisbezugTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeNachweisbezugType()
	 * @generated
	 */
	int CODE_NACHWEISBEZUG_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_NACHWEISBEZUG_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_NACHWEISBEZUG_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_NACHWEISBEZUG_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_NACHWEISBEZUG_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Nachweisbezug Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_NACHWEISBEZUG_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Nachweisbezug Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_NACHWEISBEZUG_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodePersonensorgerechtTypeImpl <em>Code Personensorgerecht Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodePersonensorgerechtTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodePersonensorgerechtType()
	 * @generated
	 */
	int CODE_PERSONENSORGERECHT_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_PERSONENSORGERECHT_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_PERSONENSORGERECHT_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_PERSONENSORGERECHT_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_PERSONENSORGERECHT_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Personensorgerecht Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_PERSONENSORGERECHT_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Personensorgerecht Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_PERSONENSORGERECHT_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodePraefixTypeImpl <em>Code Praefix Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodePraefixTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodePraefixType()
	 * @generated
	 */
	int CODE_PRAEFIX_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_PRAEFIX_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_PRAEFIX_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_PRAEFIX_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_PRAEFIX_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Praefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_PRAEFIX_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Praefix Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_PRAEFIX_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeSonderstatusTypeImpl <em>Code Sonderstatus Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeSonderstatusTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeSonderstatusType()
	 * @generated
	 */
	int CODE_SONDERSTATUS_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SONDERSTATUS_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SONDERSTATUS_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SONDERSTATUS_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SONDERSTATUS_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Sonderstatus Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SONDERSTATUS_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Sonderstatus Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SONDERSTATUS_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeSonstigeLeistungenTypeImpl <em>Code Sonstige Leistungen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeSonstigeLeistungenTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeSonstigeLeistungenType()
	 * @generated
	 */
	int CODE_SONSTIGE_LEISTUNGEN_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SONSTIGE_LEISTUNGEN_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SONSTIGE_LEISTUNGEN_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SONSTIGE_LEISTUNGEN_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SONSTIGE_LEISTUNGEN_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Sonstige Leistungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SONSTIGE_LEISTUNGEN_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Sonstige Leistungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SONSTIGE_LEISTUNGEN_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeStaatsangehoerigkeitTypeImpl <em>Code Staatsangehoerigkeit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeStaatsangehoerigkeitTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeStaatsangehoerigkeitType()
	 * @generated
	 */
	int CODE_STAATSANGEHOERIGKEIT_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STAATSANGEHOERIGKEIT_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STAATSANGEHOERIGKEIT_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STAATSANGEHOERIGKEIT_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STAATSANGEHOERIGKEIT_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Staatsangehoerigkeit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STAATSANGEHOERIGKEIT_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Staatsangehoerigkeit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STAATSANGEHOERIGKEIT_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeStaatTypeImpl <em>Code Staat Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeStaatTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeStaatType()
	 * @generated
	 */
	int CODE_STAAT_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STAAT_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STAAT_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STAAT_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STAAT_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Staat Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STAAT_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Staat Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STAAT_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeStandesamtnummernTypeImpl <em>Code Standesamtnummern Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeStandesamtnummernTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeStandesamtnummernType()
	 * @generated
	 */
	int CODE_STANDESAMTNUMMERN_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STANDESAMTNUMMERN_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STANDESAMTNUMMERN_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STANDESAMTNUMMERN_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STANDESAMTNUMMERN_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Standesamtnummern Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STANDESAMTNUMMERN_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Standesamtnummern Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STANDESAMTNUMMERN_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeStatusDatenabrufTypeImpl <em>Code Status Datenabruf Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeStatusDatenabrufTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeStatusDatenabrufType()
	 * @generated
	 */
	int CODE_STATUS_DATENABRUF_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STATUS_DATENABRUF_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STATUS_DATENABRUF_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STATUS_DATENABRUF_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STATUS_DATENABRUF_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Status Datenabruf Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STATUS_DATENABRUF_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Status Datenabruf Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_STATUS_DATENABRUF_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeTatsachenbehauptungTypeImpl <em>Code Tatsachenbehauptung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeTatsachenbehauptungTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeTatsachenbehauptungType()
	 * @generated
	 */
	int CODE_TATSACHENBEHAUPTUNG_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TATSACHENBEHAUPTUNG_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TATSACHENBEHAUPTUNG_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TATSACHENBEHAUPTUNG_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TATSACHENBEHAUPTUNG_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Tatsachenbehauptung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TATSACHENBEHAUPTUNG_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Tatsachenbehauptung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TATSACHENBEHAUPTUNG_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeVermoegensartTypeImpl <em>Code Vermoegensart Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeVermoegensartTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeVermoegensartType()
	 * @generated
	 */
	int CODE_VERMOEGENSART_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERMOEGENSART_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERMOEGENSART_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERMOEGENSART_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERMOEGENSART_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Vermoegensart Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERMOEGENSART_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Vermoegensart Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERMOEGENSART_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeVertrauensniveauTypeImpl <em>Code Vertrauensniveau Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeVertrauensniveauTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeVertrauensniveauType()
	 * @generated
	 */
	int CODE_VERTRAUENSNIVEAU_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERTRAUENSNIVEAU_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERTRAUENSNIVEAU_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERTRAUENSNIVEAU_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERTRAUENSNIVEAU_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Vertrauensniveau Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERTRAUENSNIVEAU_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Vertrauensniveau Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERTRAUENSNIVEAU_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeVertretungTypeImpl <em>Code Vertretung Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeVertretungTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeVertretungType()
	 * @generated
	 */
	int CODE_VERTRETUNG_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERTRETUNG_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERTRETUNG_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERTRETUNG_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERTRETUNG_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Vertretung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERTRETUNG_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Vertretung Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_VERTRETUNG_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeWohnsitzTypeImpl <em>Code Wohnsitz Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeWohnsitzTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeWohnsitzType()
	 * @generated
	 */
	int CODE_WOHNSITZ_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_WOHNSITZ_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_WOHNSITZ_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_WOHNSITZ_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_WOHNSITZ_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Wohnsitz Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_WOHNSITZ_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Wohnsitz Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_WOHNSITZ_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeZuschuesseTypeImpl <em>Code Zuschuesse Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeZuschuesseTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeZuschuesseType()
	 * @generated
	 */
	int CODE_ZUSCHUESSE_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ZUSCHUESSE_TYPE__CODE = Code10Package.CODE__CODE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ZUSCHUESSE_TYPE__NAME = Code10Package.CODE__NAME;

	/**
	 * The feature id for the '<em><b>List URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ZUSCHUESSE_TYPE__LIST_URI = Code10Package.CODE__LIST_URI;

	/**
	 * The feature id for the '<em><b>List Version ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ZUSCHUESSE_TYPE__LIST_VERSION_ID = Code10Package.CODE__LIST_VERSION_ID;

	/**
	 * The number of structural features of the '<em>Code Zuschuesse Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ZUSCHUESSE_TYPE_FEATURE_COUNT = Code10Package.CODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code Zuschuesse Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_ZUSCHUESSE_TYPE_OPERATION_COUNT = Code10Package.CODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.DatenabrufTypeImpl <em>Datenabruf Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.DatenabrufTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getDatenabrufType()
	 * @generated
	 */
	int DATENABRUF_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENABRUF_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Zeitstempel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENABRUF_TYPE__ZEITSTEMPEL = 1;

	/**
	 * The feature id for the '<em><b>Quelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENABRUF_TYPE__QUELLE = 2;

	/**
	 * The feature id for the '<em><b>Art Des Abrufs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENABRUF_TYPE__ART_DES_ABRUFS = 3;

	/**
	 * The feature id for the '<em><b>Abgerufen Fuer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENABRUF_TYPE__ABGERUFEN_FUER = 4;

	/**
	 * The feature id for the '<em><b>Status Datenabruf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENABRUF_TYPE__STATUS_DATENABRUF = 5;

	/**
	 * The number of structural features of the '<em>Datenabruf Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENABRUF_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Datenabruf Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENABRUF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.DatenschutzerklaerungenTypeImpl <em>Datenschutzerklaerungen Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.DatenschutzerklaerungenTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getDatenschutzerklaerungenType()
	 * @generated
	 */
	int DATENSCHUTZERKLAERUNGEN_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Dsgvo Betreiber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENSCHUTZERKLAERUNGEN_TYPE__DSGVO_BETREIBER = 0;

	/**
	 * The feature id for the '<em><b>Dsgvo Nachnutzer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENSCHUTZERKLAERUNGEN_TYPE__DSGVO_NACHNUTZER = 1;

	/**
	 * The number of structural features of the '<em>Datenschutzerklaerungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENSCHUTZERKLAERUNGEN_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Datenschutzerklaerungen Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATENSCHUTZERKLAERUNGEN_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.EntgeltdatenArbeitgeberDsrvTypeImpl <em>Entgeltdaten Arbeitgeber Dsrv Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.EntgeltdatenArbeitgeberDsrvTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getEntgeltdatenArbeitgeberDsrvType()
	 * @generated
	 */
	int ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Abfrage ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__ABFRAGE_ID = 0;

	/**
	 * The feature id for the '<em><b>Ifd Nr Arbeitgeber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__IFD_NR_ARBEITGEBER = 1;

	/**
	 * The feature id for the '<em><b>Abrufergebnis Drv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__ABRUFERGEBNIS_DRV = 2;

	/**
	 * The number of structural features of the '<em>Entgeltdaten Arbeitgeber Dsrv Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Entgeltdaten Arbeitgeber Dsrv Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.EntgeltdatenDsrvNachweisbezugTypeImpl <em>Entgeltdaten Dsrv Nachweisbezug Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.EntgeltdatenDsrvNachweisbezugTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getEntgeltdatenDsrvNachweisbezugType()
	 * @generated
	 */
	int ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Nachweisbezug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__NACHWEISBEZUG = 0;

	/**
	 * The feature id for the '<em><b>Zeitraum Von</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ZEITRAUM_VON = 1;

	/**
	 * The feature id for the '<em><b>Zeitraum Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ZEITRAUM_BIS = 2;

	/**
	 * The feature id for the '<em><b>Entgeltdaten Arbeitgeber</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ENTGELTDATEN_ARBEITGEBER = 3;

	/**
	 * The number of structural features of the '<em>Entgeltdaten Dsrv Nachweisbezug Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Entgeltdaten Dsrv Nachweisbezug Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.ErreichbarkeitTypeImpl <em>Erreichbarkeit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.ErreichbarkeitTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getErreichbarkeitType()
	 * @generated
	 */
	int ERREICHBARKEIT_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Kanal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERREICHBARKEIT_TYPE__KANAL = 0;

	/**
	 * The feature id for the '<em><b>Kennung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERREICHBARKEIT_TYPE__KENNUNG = 1;

	/**
	 * The feature id for the '<em><b>Zusatz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERREICHBARKEIT_TYPE__ZUSATZ = 2;

	/**
	 * The number of structural features of the '<em>Erreichbarkeit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERREICHBARKEIT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Erreichbarkeit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERREICHBARKEIT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.FamiliennameUnstrukturiertTypeImpl <em>Familienname Unstrukturiert Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.FamiliennameUnstrukturiertTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getFamiliennameUnstrukturiertType()
	 * @generated
	 */
	int FAMILIENNAME_UNSTRUKTURIERT_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Nachname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAME = 0;

	/**
	 * The feature id for the '<em><b>Nachnamepass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAMEPASS = 1;

	/**
	 * The number of structural features of the '<em>Familienname Unstrukturiert Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENNAME_UNSTRUKTURIERT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Familienname Unstrukturiert Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENNAME_UNSTRUKTURIERT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.FamilienstandTypeImpl <em>Familienstand Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.FamilienstandTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getFamilienstandType()
	 * @generated
	 */
	int FAMILIENSTAND_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Seit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENSTAND_TYPE__SEIT = 0;

	/**
	 * The feature id for the '<em><b>Familienstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENSTAND_TYPE__FAMILIENSTAND = 1;

	/**
	 * The number of structural features of the '<em>Familienstand Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENSTAND_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Familienstand Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENSTAND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.FamilienstandNachweisbezugTypeImpl <em>Familienstand Nachweisbezug Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.FamilienstandNachweisbezugTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getFamilienstandNachweisbezugType()
	 * @generated
	 */
	int FAMILIENSTAND_NACHWEISBEZUG_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Seit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENSTAND_NACHWEISBEZUG_TYPE__SEIT = FAMILIENSTAND_TYPE__SEIT;

	/**
	 * The feature id for the '<em><b>Familienstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENSTAND_NACHWEISBEZUG_TYPE__FAMILIENSTAND = FAMILIENSTAND_TYPE__FAMILIENSTAND;

	/**
	 * The feature id for the '<em><b>Nachweisbezug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENSTAND_NACHWEISBEZUG_TYPE__NACHWEISBEZUG = FAMILIENSTAND_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Familienstand Nachweisbezug Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENSTAND_NACHWEISBEZUG_TYPE_FEATURE_COUNT = FAMILIENSTAND_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Familienstand Nachweisbezug Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAMILIENSTAND_NACHWEISBEZUG_TYPE_OPERATION_COUNT = FAMILIENSTAND_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.FeldgruppeTypeImpl <em>Feldgruppe Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.FeldgruppeTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getFeldgruppeType()
	 * @generated
	 */
	int FELDGRUPPE_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FELDGRUPPE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Feld</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FELDGRUPPE_TYPE__FELD = 1;

	/**
	 * The feature id for the '<em><b>Feldgruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FELDGRUPPE_TYPE__FELDGRUPPE = 2;

	/**
	 * The feature id for the '<em><b>Laufende Nummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FELDGRUPPE_TYPE__LAUFENDE_NUMMER = 3;

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
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.FeldTypeImpl <em>Feld Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.FeldTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getFeldType()
	 * @generated
	 */
	int FELD_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FELD_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FELD_TYPE__WERT = 1;

	/**
	 * The feature id for the '<em><b>Laufende Nummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FELD_TYPE__LAUFENDE_NUMMER = 2;

	/**
	 * The number of structural features of the '<em>Feld Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FELD_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Feld Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FELD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.GeburtGeburtsortOptionalTypeImpl <em>Geburt Geburtsort Optional Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.GeburtGeburtsortOptionalTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getGeburtGeburtsortOptionalType()
	 * @generated
	 */
	int GEBURT_GEBURTSORT_OPTIONAL_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Geburtsort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_GEBURTSORT_OPTIONAL_TYPE__GEBURTSORT = 0;

	/**
	 * The feature id for the '<em><b>Geburtsort Staat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_GEBURTSORT_OPTIONAL_TYPE__GEBURTSORT_STAAT = 1;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_GEBURTSORT_OPTIONAL_TYPE__GEBURTSDATUM = 2;

	/**
	 * The number of structural features of the '<em>Geburt Geburtsort Optional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_GEBURTSORT_OPTIONAL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Geburt Geburtsort Optional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_GEBURTSORT_OPTIONAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.GeburtTypeImpl <em>Geburt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.GeburtTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getGeburtType()
	 * @generated
	 */
	int GEBURT_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Geburtsort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_TYPE__GEBURTSORT = 0;

	/**
	 * The feature id for the '<em><b>Geburtsort Staat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_TYPE__GEBURTSORT_STAAT = 1;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_TYPE__GEBURTSDATUM = 2;

	/**
	 * The number of structural features of the '<em>Geburt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Geburt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.GeburtNachweisbezugTypeImpl <em>Geburt Nachweisbezug Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.GeburtNachweisbezugTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getGeburtNachweisbezugType()
	 * @generated
	 */
	int GEBURT_NACHWEISBEZUG_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Geburtsort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_NACHWEISBEZUG_TYPE__GEBURTSORT = GEBURT_TYPE__GEBURTSORT;

	/**
	 * The feature id for the '<em><b>Geburtsort Staat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_NACHWEISBEZUG_TYPE__GEBURTSORT_STAAT = GEBURT_TYPE__GEBURTSORT_STAAT;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_NACHWEISBEZUG_TYPE__GEBURTSDATUM = GEBURT_TYPE__GEBURTSDATUM;

	/**
	 * The feature id for the '<em><b>Nachweisbezug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_NACHWEISBEZUG_TYPE__NACHWEISBEZUG = GEBURT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Geburt Nachweisbezug Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_NACHWEISBEZUG_TYPE_FEATURE_COUNT = GEBURT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Geburt Nachweisbezug Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_NACHWEISBEZUG_TYPE_OPERATION_COUNT = GEBURT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.GeburtOptionalTypeImpl <em>Geburt Optional Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.GeburtOptionalTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getGeburtOptionalType()
	 * @generated
	 */
	int GEBURT_OPTIONAL_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Geburtsort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_OPTIONAL_TYPE__GEBURTSORT = 0;

	/**
	 * The feature id for the '<em><b>Geburtsort Staat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_OPTIONAL_TYPE__GEBURTSORT_STAAT = 1;

	/**
	 * The feature id for the '<em><b>Geburtsdatum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_OPTIONAL_TYPE__GEBURTSDATUM = 2;

	/**
	 * The number of structural features of the '<em>Geburt Optional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_OPTIONAL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Geburt Optional Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEBURT_OPTIONAL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.HausnummernBisTypeImpl <em>Hausnummern Bis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.HausnummernBisTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getHausnummernBisType()
	 * @generated
	 */
	int HAUSNUMMERN_BIS_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Hausnummer Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAUSNUMMERN_BIS_TYPE__HAUSNUMMER_BIS = 0;

	/**
	 * The feature id for the '<em><b>Hausnummerbuchstabezusatzziffer Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAUSNUMMERN_BIS_TYPE__HAUSNUMMERBUCHSTABEZUSATZZIFFER_BIS = 1;

	/**
	 * The feature id for the '<em><b>Teilnummerderhausnummer Bis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAUSNUMMERN_BIS_TYPE__TEILNUMMERDERHAUSNUMMER_BIS = 2;

	/**
	 * The number of structural features of the '<em>Hausnummern Bis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAUSNUMMERN_BIS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Hausnummern Bis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAUSNUMMERN_BIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.IdentifikationNachrichtTypeImpl <em>Identifikation Nachricht Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.IdentifikationNachrichtTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getIdentifikationNachrichtType()
	 * @generated
	 */
	int IDENTIFIKATION_NACHRICHT_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Nachrichten UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTEN_UUID = 0;

	/**
	 * The feature id for the '<em><b>Nachrichtentyp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTENTYP = 1;

	/**
	 * The feature id for the '<em><b>Erstellungszeitpunkt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIKATION_NACHRICHT_TYPE__ERSTELLUNGSZEITPUNKT = 2;

	/**
	 * The number of structural features of the '<em>Identifikation Nachricht Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIKATION_NACHRICHT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Identifikation Nachricht Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIKATION_NACHRICHT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.KommunikationspartnerTypeImpl <em>Kommunikationspartner Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.KommunikationspartnerTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getKommunikationspartnerType()
	 * @generated
	 */
	int KOMMUNIKATIONSPARTNER_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Behoerdenkennung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATIONSPARTNER_TYPE__BEHOERDENKENNUNG = 0;

	/**
	 * The feature id for the '<em><b>Erreichbarkeit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATIONSPARTNER_TYPE__ERREICHBARKEIT = 1;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATIONSPARTNER_TYPE__ANSCHRIFT = 2;

	/**
	 * The feature id for the '<em><b>Behoerdenname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATIONSPARTNER_TYPE__BEHOERDENNAME = 3;

	/**
	 * The number of structural features of the '<em>Kommunikationspartner Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATIONSPARTNER_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Kommunikationspartner Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATIONSPARTNER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.KommunikationspartnerErreichbarTypeImpl <em>Kommunikationspartner Erreichbar Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.KommunikationspartnerErreichbarTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getKommunikationspartnerErreichbarType()
	 * @generated
	 */
	int KOMMUNIKATIONSPARTNER_ERREICHBAR_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Behoerdenkennung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATIONSPARTNER_ERREICHBAR_TYPE__BEHOERDENKENNUNG = KOMMUNIKATIONSPARTNER_TYPE__BEHOERDENKENNUNG;

	/**
	 * The feature id for the '<em><b>Erreichbarkeit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATIONSPARTNER_ERREICHBAR_TYPE__ERREICHBARKEIT = KOMMUNIKATIONSPARTNER_TYPE__ERREICHBARKEIT;

	/**
	 * The feature id for the '<em><b>Anschrift</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATIONSPARTNER_ERREICHBAR_TYPE__ANSCHRIFT = KOMMUNIKATIONSPARTNER_TYPE__ANSCHRIFT;

	/**
	 * The feature id for the '<em><b>Behoerdenname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATIONSPARTNER_ERREICHBAR_TYPE__BEHOERDENNAME = KOMMUNIKATIONSPARTNER_TYPE__BEHOERDENNAME;

	/**
	 * The number of structural features of the '<em>Kommunikationspartner Erreichbar Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATIONSPARTNER_ERREICHBAR_TYPE_FEATURE_COUNT = KOMMUNIKATIONSPARTNER_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Kommunikationspartner Erreichbar Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KOMMUNIKATIONSPARTNER_ERREICHBAR_TYPE_OPERATION_COUNT = KOMMUNIKATIONSPARTNER_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.MeldeanschriftTypeImpl <em>Meldeanschrift Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.MeldeanschriftTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getMeldeanschriftType()
	 * @generated
	 */
	int MELDEANSCHRIFT_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Gemeindeschluessel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELDEANSCHRIFT_TYPE__GEMEINDESCHLUESSEL = 0;

	/**
	 * The feature id for the '<em><b>Hausnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELDEANSCHRIFT_TYPE__HAUSNUMMER = 1;

	/**
	 * The feature id for the '<em><b>Hausnummer Buchstabe Zusatzziffer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELDEANSCHRIFT_TYPE__HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER = 2;

	/**
	 * The feature id for the '<em><b>Postleitzahl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELDEANSCHRIFT_TYPE__POSTLEITZAHL = 3;

	/**
	 * The feature id for the '<em><b>Stockwerkswohnungsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELDEANSCHRIFT_TYPE__STOCKWERKSWOHNUNGSNUMMER = 4;

	/**
	 * The feature id for the '<em><b>Strasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELDEANSCHRIFT_TYPE__STRASSE = 5;

	/**
	 * The feature id for the '<em><b>Teilnummer Der Hausnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELDEANSCHRIFT_TYPE__TEILNUMMER_DER_HAUSNUMMER = 6;

	/**
	 * The feature id for the '<em><b>Wohnort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELDEANSCHRIFT_TYPE__WOHNORT = 7;

	/**
	 * The feature id for the '<em><b>Wohnort Frueherer Gemeindename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELDEANSCHRIFT_TYPE__WOHNORT_FRUEHERER_GEMEINDENAME = 8;

	/**
	 * The feature id for the '<em><b>Wohnungsinhaber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELDEANSCHRIFT_TYPE__WOHNUNGSINHABER = 9;

	/**
	 * The feature id for the '<em><b>Zusatzangaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELDEANSCHRIFT_TYPE__ZUSATZANGABEN = 10;

	/**
	 * The feature id for the '<em><b>Regionalschluessel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELDEANSCHRIFT_TYPE__REGIONALSCHLUESSEL = 11;

	/**
	 * The number of structural features of the '<em>Meldeanschrift Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELDEANSCHRIFT_TYPE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Meldeanschrift Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MELDEANSCHRIFT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtenkopfTypeImpl <em>Nachrichtenkopf Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtenkopfTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNachrichtenkopfType()
	 * @generated
	 */
	int NACHRICHTENKOPF_TYPE = 58;

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
	 * The feature id for the '<em><b>Postkorb Handle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENKOPF_TYPE__POSTKORB_HANDLE = 3;

	/**
	 * The number of structural features of the '<em>Nachrichtenkopf Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENKOPF_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Nachrichtenkopf Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHRICHTENKOPF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachweisbezugTypeImpl <em>Nachweisbezug Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.NachweisbezugTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNachweisbezugType()
	 * @generated
	 */
	int NACHWEISBEZUG_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Datenabruf Bezug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISBEZUG_TYPE__DATENABRUF_BEZUG = 0;

	/**
	 * The feature id for the '<em><b>Datenabruf Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISBEZUG_TYPE__DATENABRUF_ID = 1;

	/**
	 * The number of structural features of the '<em>Nachweisbezug Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISBEZUG_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Nachweisbezug Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISBEZUG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachweisdokumentTypeImpl <em>Nachweisdokument Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.NachweisdokumentTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNachweisdokumentType()
	 * @generated
	 */
	int NACHWEISDOKUMENT_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Dokumentid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISDOKUMENT_TYPE__DOKUMENTID = 0;

	/**
	 * The feature id for the '<em><b>Dateiname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISDOKUMENT_TYPE__DATEINAME = 1;

	/**
	 * The feature id for the '<em><b>Mimetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISDOKUMENT_TYPE__MIMETYPE = 2;

	/**
	 * The feature id for the '<em><b>Kategorie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISDOKUMENT_TYPE__KATEGORIE = 3;

	/**
	 * The number of structural features of the '<em>Nachweisdokument Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISDOKUMENT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Nachweisdokument Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NACHWEISDOKUMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NameNatuerlichePersonTypeImpl <em>Name Natuerliche Person Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.NameNatuerlichePersonTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNameNatuerlichePersonType()
	 * @generated
	 */
	int NAME_NATUERLICHE_PERSON_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Familienname Unstrukturiert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_TYPE__FAMILIENNAME_UNSTRUKTURIERT = 0;

	/**
	 * The feature id for the '<em><b>Geburtsname Unstrukturiert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_TYPE__GEBURTSNAME_UNSTRUKTURIERT = 1;

	/**
	 * The feature id for the '<em><b>Vornamen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_TYPE__VORNAMEN = 2;

	/**
	 * The number of structural features of the '<em>Name Natuerliche Person Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Name Natuerliche Person Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NameNatuerlichePersonNachweisbezugTypeImpl <em>Name Natuerliche Person Nachweisbezug Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.NameNatuerlichePersonNachweisbezugTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNameNatuerlichePersonNachweisbezugType()
	 * @generated
	 */
	int NAME_NATUERLICHE_PERSON_NACHWEISBEZUG_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Familienname Unstrukturiert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_NACHWEISBEZUG_TYPE__FAMILIENNAME_UNSTRUKTURIERT = NAME_NATUERLICHE_PERSON_TYPE__FAMILIENNAME_UNSTRUKTURIERT;

	/**
	 * The feature id for the '<em><b>Geburtsname Unstrukturiert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_NACHWEISBEZUG_TYPE__GEBURTSNAME_UNSTRUKTURIERT = NAME_NATUERLICHE_PERSON_TYPE__GEBURTSNAME_UNSTRUKTURIERT;

	/**
	 * The feature id for the '<em><b>Vornamen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_NACHWEISBEZUG_TYPE__VORNAMEN = NAME_NATUERLICHE_PERSON_TYPE__VORNAMEN;

	/**
	 * The feature id for the '<em><b>Nachweisbezug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_NACHWEISBEZUG_TYPE__NACHWEISBEZUG = NAME_NATUERLICHE_PERSON_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Name Natuerliche Person Nachweisbezug Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_NACHWEISBEZUG_TYPE_FEATURE_COUNT = NAME_NATUERLICHE_PERSON_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Name Natuerliche Person Nachweisbezug Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_NACHWEISBEZUG_TYPE_OPERATION_COUNT = NAME_NATUERLICHE_PERSON_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NameNatuerlichePersonOhneGeburtsnameTypeImpl <em>Name Natuerliche Person Ohne Geburtsname Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.NameNatuerlichePersonOhneGeburtsnameTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNameNatuerlichePersonOhneGeburtsnameType()
	 * @generated
	 */
	int NAME_NATUERLICHE_PERSON_OHNE_GEBURTSNAME_TYPE = 63;

	/**
	 * The feature id for the '<em><b>Familienname Unstrukturiert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_OHNE_GEBURTSNAME_TYPE__FAMILIENNAME_UNSTRUKTURIERT = 0;

	/**
	 * The feature id for the '<em><b>Vornamen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_OHNE_GEBURTSNAME_TYPE__VORNAMEN = 1;

	/**
	 * The number of structural features of the '<em>Name Natuerliche Person Ohne Geburtsname Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_OHNE_GEBURTSNAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Name Natuerliche Person Ohne Geburtsname Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_OHNE_GEBURTSNAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NameNatuerlichePersonVornameVerpflichtendTypeImpl <em>Name Natuerliche Person Vorname Verpflichtend Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.NameNatuerlichePersonVornameVerpflichtendTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNameNatuerlichePersonVornameVerpflichtendType()
	 * @generated
	 */
	int NAME_NATUERLICHE_PERSON_VORNAME_VERPFLICHTEND_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Familienname Unstrukturiert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_VORNAME_VERPFLICHTEND_TYPE__FAMILIENNAME_UNSTRUKTURIERT = 0;

	/**
	 * The feature id for the '<em><b>Geburtsname Unstrukturiert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_VORNAME_VERPFLICHTEND_TYPE__GEBURTSNAME_UNSTRUKTURIERT = 1;

	/**
	 * The feature id for the '<em><b>Vornamen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_VORNAME_VERPFLICHTEND_TYPE__VORNAMEN = 2;

	/**
	 * The number of structural features of the '<em>Name Natuerliche Person Vorname Verpflichtend Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_VORNAME_VERPFLICHTEND_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Name Natuerliche Person Vorname Verpflichtend Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_NATUERLICHE_PERSON_VORNAME_VERPFLICHTEND_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NutzerkontoTypeImpl <em>Nutzerkonto Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.NutzerkontoTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNutzerkontoType()
	 * @generated
	 */
	int NUTZERKONTO_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTZERKONTO_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Vertrauensniveau</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTZERKONTO_TYPE__VERTRAUENSNIVEAU = 1;

	/**
	 * The feature id for the '<em><b>Nachweis Nutzerkonto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTZERKONTO_TYPE__NACHWEIS_NUTZERKONTO = 2;

	/**
	 * The number of structural features of the '<em>Nutzerkonto Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTZERKONTO_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Nutzerkonto Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUTZERKONTO_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftBasisTypeImpl <em>Postalische Inlandsanschrift Basis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftBasisTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getPostalischeInlandsanschriftBasisType()
	 * @generated
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE = 67;

	/**
	 * The feature id for the '<em><b>Hausnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__HAUSNUMMER = 0;

	/**
	 * The feature id for the '<em><b>Hausnummer Buchstabe Zusatzziffer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER = 1;

	/**
	 * The feature id for the '<em><b>Postleitzahl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__POSTLEITZAHL = 2;

	/**
	 * The feature id for the '<em><b>Stockwerkswohnungsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__STOCKWERKSWOHNUNGSNUMMER = 3;

	/**
	 * The feature id for the '<em><b>Strasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__STRASSE = 4;

	/**
	 * The feature id for the '<em><b>Teilnummer Der Hausnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__TEILNUMMER_DER_HAUSNUMMER = 5;

	/**
	 * The feature id for the '<em><b>Wohnort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNORT = 6;

	/**
	 * The feature id for the '<em><b>Wohnort Frueherer Gemeindename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNORT_FRUEHERER_GEMEINDENAME = 7;

	/**
	 * The feature id for the '<em><b>Wohnungsinhaber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNUNGSINHABER = 8;

	/**
	 * The feature id for the '<em><b>Zusatzangaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__ZUSATZANGABEN = 9;

	/**
	 * The number of structural features of the '<em>Postalische Inlandsanschrift Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Postalische Inlandsanschrift Basis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftGebaeudeanschriftTypeImpl <em>Postalische Inlandsanschrift Gebaeudeanschrift Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftGebaeudeanschriftTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getPostalischeInlandsanschriftGebaeudeanschriftType()
	 * @generated
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE = 69;

	/**
	 * The feature id for the '<em><b>Hausnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__HAUSNUMMER = POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__HAUSNUMMER;

	/**
	 * The feature id for the '<em><b>Hausnummer Buchstabe Zusatzziffer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER = POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER;

	/**
	 * The feature id for the '<em><b>Postleitzahl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__POSTLEITZAHL = POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__POSTLEITZAHL;

	/**
	 * The feature id for the '<em><b>Stockwerkswohnungsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__STOCKWERKSWOHNUNGSNUMMER = POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__STOCKWERKSWOHNUNGSNUMMER;

	/**
	 * The feature id for the '<em><b>Strasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__STRASSE = POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__STRASSE;

	/**
	 * The feature id for the '<em><b>Teilnummer Der Hausnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__TEILNUMMER_DER_HAUSNUMMER = POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__TEILNUMMER_DER_HAUSNUMMER;

	/**
	 * The feature id for the '<em><b>Wohnort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__WOHNORT = POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNORT;

	/**
	 * The feature id for the '<em><b>Wohnort Frueherer Gemeindename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__WOHNORT_FRUEHERER_GEMEINDENAME = POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNORT_FRUEHERER_GEMEINDENAME;

	/**
	 * The feature id for the '<em><b>Wohnungsinhaber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__WOHNUNGSINHABER = POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNUNGSINHABER;

	/**
	 * The feature id for the '<em><b>Zusatzangaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__ZUSATZANGABEN = POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__ZUSATZANGABEN;

	/**
	 * The feature id for the '<em><b>Hausnummern Bis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__HAUSNUMMERN_BIS = POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postalische Inlandsanschrift Gebaeudeanschrift Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE_FEATURE_COUNT = POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Postalische Inlandsanschrift Gebaeudeanschrift Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE_OPERATION_COUNT = POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugTypeImpl <em>Postalische Inlandsanschrift Gebaeudeanschrift Nachweisbezug Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getPostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType()
	 * @generated
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_NACHWEISBEZUG_TYPE = 68;

	/**
	 * The feature id for the '<em><b>Hausnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_NACHWEISBEZUG_TYPE__HAUSNUMMER = POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__HAUSNUMMER;

	/**
	 * The feature id for the '<em><b>Hausnummer Buchstabe Zusatzziffer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_NACHWEISBEZUG_TYPE__HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER = POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER;

	/**
	 * The feature id for the '<em><b>Postleitzahl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_NACHWEISBEZUG_TYPE__POSTLEITZAHL = POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__POSTLEITZAHL;

	/**
	 * The feature id for the '<em><b>Stockwerkswohnungsnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_NACHWEISBEZUG_TYPE__STOCKWERKSWOHNUNGSNUMMER = POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__STOCKWERKSWOHNUNGSNUMMER;

	/**
	 * The feature id for the '<em><b>Strasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_NACHWEISBEZUG_TYPE__STRASSE = POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__STRASSE;

	/**
	 * The feature id for the '<em><b>Teilnummer Der Hausnummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_NACHWEISBEZUG_TYPE__TEILNUMMER_DER_HAUSNUMMER = POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__TEILNUMMER_DER_HAUSNUMMER;

	/**
	 * The feature id for the '<em><b>Wohnort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_NACHWEISBEZUG_TYPE__WOHNORT = POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__WOHNORT;

	/**
	 * The feature id for the '<em><b>Wohnort Frueherer Gemeindename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_NACHWEISBEZUG_TYPE__WOHNORT_FRUEHERER_GEMEINDENAME = POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__WOHNORT_FRUEHERER_GEMEINDENAME;

	/**
	 * The feature id for the '<em><b>Wohnungsinhaber</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_NACHWEISBEZUG_TYPE__WOHNUNGSINHABER = POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__WOHNUNGSINHABER;

	/**
	 * The feature id for the '<em><b>Zusatzangaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_NACHWEISBEZUG_TYPE__ZUSATZANGABEN = POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__ZUSATZANGABEN;

	/**
	 * The feature id for the '<em><b>Hausnummern Bis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_NACHWEISBEZUG_TYPE__HAUSNUMMERN_BIS = POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__HAUSNUMMERN_BIS;

	/**
	 * The feature id for the '<em><b>Nachweisbezug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_NACHWEISBEZUG_TYPE__NACHWEISBEZUG = POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Postalische Inlandsanschrift Gebaeudeanschrift Nachweisbezug Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_NACHWEISBEZUG_TYPE_FEATURE_COUNT = POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Postalische Inlandsanschrift Gebaeudeanschrift Nachweisbezug Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_NACHWEISBEZUG_TYPE_OPERATION_COUNT = POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftPostfachanschriftTypeImpl <em>Postalische Inlandsanschrift Postfachanschrift Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftPostfachanschriftTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getPostalischeInlandsanschriftPostfachanschriftType()
	 * @generated
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Postfach</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__POSTFACH = 0;

	/**
	 * The feature id for the '<em><b>Wohnort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__WOHNORT = 1;

	/**
	 * The feature id for the '<em><b>Postleitzahl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__POSTLEITZAHL = 2;

	/**
	 * The feature id for the '<em><b>Zusatzangaben</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__ZUSATZANGABEN = 3;

	/**
	 * The number of structural features of the '<em>Postalische Inlandsanschrift Postfachanschrift Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Postalische Inlandsanschrift Postfachanschrift Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftTypeImpl <em>Postalische Inlandsanschrift Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getPostalischeInlandsanschriftType()
	 * @generated
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_TYPE = 71;

	/**
	 * The feature id for the '<em><b>Postfach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_TYPE__POSTFACH = 0;

	/**
	 * The feature id for the '<em><b>Gebaeude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_TYPE__GEBAEUDE = 1;

	/**
	 * The number of structural features of the '<em>Postalische Inlandsanschrift Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Postalische Inlandsanschrift Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTALISCHE_INLANDSANSCHRIFT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostkorbHandleTypeImpl <em>Postkorb Handle Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.PostkorbHandleTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getPostkorbHandleType()
	 * @generated
	 */
	int POSTKORB_HANDLE_TYPE = 72;

	/**
	 * The feature id for the '<em><b>Postkorb Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTKORB_HANDLE_TYPE__POSTKORB_HANDLE = 0;

	/**
	 * The feature id for the '<em><b>Zustimmung Elektronischer Bescheid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTKORB_HANDLE_TYPE__ZUSTIMMUNG_ELEKTRONISCHER_BESCHEID = 1;

	/**
	 * The number of structural features of the '<em>Postkorb Handle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTKORB_HANDLE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Postkorb Handle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSTKORB_HANDLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.StaatsangehoerigkeitenNachweisbezugTypeImpl <em>Staatsangehoerigkeiten Nachweisbezug Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.StaatsangehoerigkeitenNachweisbezugTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getStaatsangehoerigkeitenNachweisbezugType()
	 * @generated
	 */
	int STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE = 73;

	/**
	 * The feature id for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE__STAATSANGEHOERIGKEIT = 0;

	/**
	 * The feature id for the '<em><b>Nachweisbezug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE__NACHWEISBEZUG = 1;

	/**
	 * The number of structural features of the '<em>Staatsangehoerigkeiten Nachweisbezug Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Staatsangehoerigkeiten Nachweisbezug Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.StatusDatenabrufTypeImpl <em>Status Datenabruf Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.StatusDatenabrufTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getStatusDatenabrufType()
	 * @generated
	 */
	int STATUS_DATENABRUF_TYPE = 74;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_DATENABRUF_TYPE__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Hinweis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_DATENABRUF_TYPE__HINWEIS = 1;

	/**
	 * The number of structural features of the '<em>Status Datenabruf Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_DATENABRUF_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Status Datenabruf Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_DATENABRUF_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.TatsacheMitFreitextTypeImpl <em>Tatsache Mit Freitext Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.TatsacheMitFreitextTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getTatsacheMitFreitextType()
	 * @generated
	 */
	int TATSACHE_MIT_FREITEXT_TYPE = 75;

	/**
	 * The feature id for the '<em><b>Liegt Vor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATSACHE_MIT_FREITEXT_TYPE__LIEGT_VOR = 0;

	/**
	 * The feature id for the '<em><b>Freitext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATSACHE_MIT_FREITEXT_TYPE__FREITEXT = 1;

	/**
	 * The number of structural features of the '<em>Tatsache Mit Freitext Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATSACHE_MIT_FREITEXT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tatsache Mit Freitext Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATSACHE_MIT_FREITEXT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.TatsacheMitNachweisTypeImpl <em>Tatsache Mit Nachweis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.TatsacheMitNachweisTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getTatsacheMitNachweisType()
	 * @generated
	 */
	int TATSACHE_MIT_NACHWEIS_TYPE = 76;

	/**
	 * The feature id for the '<em><b>Liegt Vor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATSACHE_MIT_NACHWEIS_TYPE__LIEGT_VOR = 0;

	/**
	 * The feature id for the '<em><b>Nachweis</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATSACHE_MIT_NACHWEIS_TYPE__NACHWEIS = 1;

	/**
	 * The number of structural features of the '<em>Tatsache Mit Nachweis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATSACHE_MIT_NACHWEIS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tatsache Mit Nachweis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATSACHE_MIT_NACHWEIS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.TatsacheMitZeitraumTypeImpl <em>Tatsache Mit Zeitraum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.TatsacheMitZeitraumTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getTatsacheMitZeitraumType()
	 * @generated
	 */
	int TATSACHE_MIT_ZEITRAUM_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Liegt Vor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATSACHE_MIT_ZEITRAUM_TYPE__LIEGT_VOR = 0;

	/**
	 * The feature id for the '<em><b>Zeitraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATSACHE_MIT_ZEITRAUM_TYPE__ZEITRAUM = 1;

	/**
	 * The number of structural features of the '<em>Tatsache Mit Zeitraum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATSACHE_MIT_ZEITRAUM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tatsache Mit Zeitraum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TATSACHE_MIT_ZEITRAUM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.TeilbekanntesDatumTypeImpl <em>Teilbekanntes Datum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.TeilbekanntesDatumTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getTeilbekanntesDatumType()
	 * @generated
	 */
	int TEILBEKANNTES_DATUM_TYPE = 78;

	/**
	 * The feature id for the '<em><b>Jahr Monat Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEILBEKANNTES_DATUM_TYPE__JAHR_MONAT_TAG = 0;

	/**
	 * The feature id for the '<em><b>Jahr Monat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEILBEKANNTES_DATUM_TYPE__JAHR_MONAT = 1;

	/**
	 * The feature id for the '<em><b>Jahr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEILBEKANNTES_DATUM_TYPE__JAHR = 2;

	/**
	 * The number of structural features of the '<em>Teilbekanntes Datum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEILBEKANNTES_DATUM_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Teilbekanntes Datum Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEILBEKANNTES_DATUM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.TerminwunschTypeImpl <em>Terminwunsch Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.TerminwunschTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getTerminwunschType()
	 * @generated
	 */
	int TERMINWUNSCH_TYPE = 79;

	/**
	 * The feature id for the '<em><b>Wochentag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINWUNSCH_TYPE__WOCHENTAG = 0;

	/**
	 * The feature id for the '<em><b>Uhrzeit</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINWUNSCH_TYPE__UHRZEIT = 1;

	/**
	 * The number of structural features of the '<em>Terminwunsch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINWUNSCH_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Terminwunsch Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINWUNSCH_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.ZeitraumTypeImpl <em>Zeitraum Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.ZeitraumTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getZeitraumType()
	 * @generated
	 */
	int ZEITRAUM_TYPE = 80;

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
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.ZusatzparametergruppeTypeImpl <em>Zusatzparametergruppe Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.ZusatzparametergruppeTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getZusatzparametergruppeType()
	 * @generated
	 */
	int ZUSATZPARAMETERGRUPPE_TYPE = 81;

	/**
	 * The feature id for the '<em><b>Feld</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSATZPARAMETERGRUPPE_TYPE__FELD = 0;

	/**
	 * The feature id for the '<em><b>Feldgruppe</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSATZPARAMETERGRUPPE_TYPE__FELDGRUPPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSATZPARAMETERGRUPPE_TYPE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Fassung Handlungsanweisung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSATZPARAMETERGRUPPE_TYPE__FASSUNG_HANDLUNGSANWEISUNG = 3;

	/**
	 * The number of structural features of the '<em>Zusatzparametergruppe Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSATZPARAMETERGRUPPE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Zusatzparametergruppe Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSATZPARAMETERGRUPPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.ZustimmungAbrufOderWeitergabeTypeImpl <em>Zustimmung Abruf Oder Weitergabe Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.ZustimmungAbrufOderWeitergabeTypeImpl
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getZustimmungAbrufOderWeitergabeType()
	 * @generated
	 */
	int ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE = 82;

	/**
	 * The feature id for the '<em><b>Art Des Abrufs Oder Weitergabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__ART_DES_ABRUFS_ODER_WEITERGABE = 0;

	/**
	 * The feature id for the '<em><b>Zustimmung Abruf Oder Weitergabe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__ZUSTIMMUNG_ABRUF_ODER_WEITERGABE = 1;

	/**
	 * The feature id for the '<em><b>Inhalte Des Abrufs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__INHALTE_DES_ABRUFS = 2;

	/**
	 * The number of structural features of the '<em>Zustimmung Abruf Oder Weitergabe Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Zustimmung Abruf Oder Weitergabe Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Anrede <em>Anrede</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Anrede
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getAnrede()
	 * @generated
	 */
	int ANREDE = 83;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Artabruf <em>Artabruf</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Artabruf
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getArtabruf()
	 * @generated
	 */
	int ARTABRUF = 84;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Artnachweis <em>Artnachweis</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Artnachweis
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getArtnachweis()
	 * @generated
	 */
	int ARTNACHWEIS = 85;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Aufenthaltsstatus <em>Aufenthaltsstatus</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Aufenthaltsstatus
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getAufenthaltsstatus()
	 * @generated
	 */
	int AUFENTHALTSSTATUS = 86;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Eigenschaft <em>Eigenschaft</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Eigenschaft
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getEigenschaft()
	 * @generated
	 */
	int EIGENSCHAFT = 87;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Einkommensarten <em>Einkommensarten</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Einkommensarten
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getEinkommensarten()
	 * @generated
	 */
	int EINKOMMENSARTEN = 88;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Familienstand <em>Familienstand</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Familienstand
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getFamilienstand()
	 * @generated
	 */
	int FAMILIENSTAND = 89;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Geschlecht <em>Geschlecht</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Geschlecht
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getGeschlecht()
	 * @generated
	 */
	int GESCHLECHT = 90;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Kindschaftsbeziehung <em>Kindschaftsbeziehung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Kindschaftsbeziehung
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getKindschaftsbeziehung()
	 * @generated
	 */
	int KINDSCHAFTSBEZIEHUNG = 91;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Kindwohnhaftbei <em>Kindwohnhaftbei</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Kindwohnhaftbei
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getKindwohnhaftbei()
	 * @generated
	 */
	int KINDWOHNHAFTBEI = 92;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Leistungserhalt <em>Leistungserhalt</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Leistungserhalt
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getLeistungserhalt()
	 * @generated
	 */
	int LEISTUNGSERHALT = 93;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Leistungsgewaehrung <em>Leistungsgewaehrung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Leistungsgewaehrung
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getLeistungsgewaehrung()
	 * @generated
	 */
	int LEISTUNGSGEWAEHRUNG = 94;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Nachrichtentyp <em>Nachrichtentyp</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Nachrichtentyp
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNachrichtentyp()
	 * @generated
	 */
	int NACHRICHTENTYP = 95;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Nachweisbezug <em>Nachweisbezug</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Nachweisbezug
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNachweisbezug()
	 * @generated
	 */
	int NACHWEISBEZUG = 96;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Personensorgerecht <em>Personensorgerecht</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Personensorgerecht
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getPersonensorgerecht()
	 * @generated
	 */
	int PERSONENSORGERECHT = 97;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Sonderstatus <em>Sonderstatus</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Sonderstatus
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getSonderstatus()
	 * @generated
	 */
	int SONDERSTATUS = 98;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Sonstigeleistungen <em>Sonstigeleistungen</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Sonstigeleistungen
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getSonstigeleistungen()
	 * @generated
	 */
	int SONSTIGELEISTUNGEN = 99;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Statusdatenabruf <em>Statusdatenabruf</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Statusdatenabruf
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getStatusdatenabruf()
	 * @generated
	 */
	int STATUSDATENABRUF = 100;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Tatsachenbehauptung <em>Tatsachenbehauptung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Tatsachenbehauptung
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getTatsachenbehauptung()
	 * @generated
	 */
	int TATSACHENBEHAUPTUNG = 101;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Vertrauensniveau <em>Vertrauensniveau</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Vertrauensniveau
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getVertrauensniveau()
	 * @generated
	 */
	int VERTRAUENSNIVEAU = 102;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Vertretung <em>Vertretung</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Vertretung
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getVertretung()
	 * @generated
	 */
	int VERTRETUNG = 103;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Wohnsitz <em>Wohnsitz</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Wohnsitz
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getWohnsitz()
	 * @generated
	 */
	int WOHNSITZ = 104;

	/**
	 * The meta object id for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Zuschuesse <em>Zuschuesse</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Zuschuesse
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getZuschuesse()
	 * @generated
	 */
	int ZUSCHUESSE = 105;

	/**
	 * The meta object id for the '<em>Anrede Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Anrede
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getAnredeObject()
	 * @generated
	 */
	int ANREDE_OBJECT = 106;

	/**
	 * The meta object id for the '<em>Artabruf Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Artabruf
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getArtabrufObject()
	 * @generated
	 */
	int ARTABRUF_OBJECT = 107;

	/**
	 * The meta object id for the '<em>Artnachweis Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Artnachweis
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getArtnachweisObject()
	 * @generated
	 */
	int ARTNACHWEIS_OBJECT = 108;

	/**
	 * The meta object id for the '<em>Aufenthaltsstatus Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Aufenthaltsstatus
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getAufenthaltsstatusObject()
	 * @generated
	 */
	int AUFENTHALTSSTATUS_OBJECT = 109;

	/**
	 * The meta object id for the '<em>Eigenschaft Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Eigenschaft
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getEigenschaftObject()
	 * @generated
	 */
	int EIGENSCHAFT_OBJECT = 110;

	/**
	 * The meta object id for the '<em>Einkommensarten Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Einkommensarten
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getEinkommensartenObject()
	 * @generated
	 */
	int EINKOMMENSARTEN_OBJECT = 111;

	/**
	 * The meta object id for the '<em>Familienstand Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Familienstand
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getFamilienstandObject()
	 * @generated
	 */
	int FAMILIENSTAND_OBJECT = 112;

	/**
	 * The meta object id for the '<em>Geschlecht Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Geschlecht
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getGeschlechtObject()
	 * @generated
	 */
	int GESCHLECHT_OBJECT = 113;

	/**
	 * The meta object id for the '<em>Jahr Monat Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getJahrMonatType()
	 * @generated
	 */
	int JAHR_MONAT_TYPE = 114;

	/**
	 * The meta object id for the '<em>Jahr Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getJahrType()
	 * @generated
	 */
	int JAHR_TYPE = 115;

	/**
	 * The meta object id for the '<em>Kindschaftsbeziehung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Kindschaftsbeziehung
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getKindschaftsbeziehungObject()
	 * @generated
	 */
	int KINDSCHAFTSBEZIEHUNG_OBJECT = 116;

	/**
	 * The meta object id for the '<em>Kindwohnhaftbei Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Kindwohnhaftbei
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getKindwohnhaftbeiObject()
	 * @generated
	 */
	int KINDWOHNHAFTBEI_OBJECT = 117;

	/**
	 * The meta object id for the '<em>Krankenversichertennummer Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getKrankenversichertennummerType()
	 * @generated
	 */
	int KRANKENVERSICHERTENNUMMER_TYPE = 118;

	/**
	 * The meta object id for the '<em>Leistungserhalt Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Leistungserhalt
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getLeistungserhaltObject()
	 * @generated
	 */
	int LEISTUNGSERHALT_OBJECT = 119;

	/**
	 * The meta object id for the '<em>Leistungsgewaehrung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Leistungsgewaehrung
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getLeistungsgewaehrungObject()
	 * @generated
	 */
	int LEISTUNGSGEWAEHRUNG_OBJECT = 120;

	/**
	 * The meta object id for the '<em>Meldeanschrift Hausnummer Buchstabe Zusatzziffer Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getMeldeanschriftHausnummerBuchstabeZusatzzifferType()
	 * @generated
	 */
	int MELDEANSCHRIFT_HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER_TYPE = 121;

	/**
	 * The meta object id for the '<em>Meldeanschrift Hausnummer Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getMeldeanschriftHausnummerType()
	 * @generated
	 */
	int MELDEANSCHRIFT_HAUSNUMMER_TYPE = 122;

	/**
	 * The meta object id for the '<em>Meldeanschrift Postleitzahl Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getMeldeanschriftPostleitzahlType()
	 * @generated
	 */
	int MELDEANSCHRIFT_POSTLEITZAHL_TYPE = 123;

	/**
	 * The meta object id for the '<em>Meldeanschrift Stockwerkswohnungsnummer Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getMeldeanschriftStockwerkswohnungsnummerType()
	 * @generated
	 */
	int MELDEANSCHRIFT_STOCKWERKSWOHNUNGSNUMMER_TYPE = 124;

	/**
	 * The meta object id for the '<em>Meldeanschrift Strasse Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getMeldeanschriftStrasseType()
	 * @generated
	 */
	int MELDEANSCHRIFT_STRASSE_TYPE = 125;

	/**
	 * The meta object id for the '<em>Meldeanschrift Teilnummer Der Hausnummer Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getMeldeanschriftTeilnummerDerHausnummerType()
	 * @generated
	 */
	int MELDEANSCHRIFT_TEILNUMMER_DER_HAUSNUMMER_TYPE = 126;

	/**
	 * The meta object id for the '<em>Meldeanschrift Wohnort Frueherer Gemeindename Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getMeldeanschriftWohnortFruehererGemeindenameType()
	 * @generated
	 */
	int MELDEANSCHRIFT_WOHNORT_FRUEHERER_GEMEINDENAME_TYPE = 127;

	/**
	 * The meta object id for the '<em>Meldeanschrift Wohnort Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getMeldeanschriftWohnortType()
	 * @generated
	 */
	int MELDEANSCHRIFT_WOHNORT_TYPE = 128;

	/**
	 * The meta object id for the '<em>Meldeanschrift Wohnungsinhaber Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getMeldeanschriftWohnungsinhaberType()
	 * @generated
	 */
	int MELDEANSCHRIFT_WOHNUNGSINHABER_TYPE = 129;

	/**
	 * The meta object id for the '<em>Meldeanschrift Zusatzangaben Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getMeldeanschriftZusatzangabenType()
	 * @generated
	 */
	int MELDEANSCHRIFT_ZUSATZANGABEN_TYPE = 130;

	/**
	 * The meta object id for the '<em>Nachrichtentyp Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Nachrichtentyp
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNachrichtentypObject()
	 * @generated
	 */
	int NACHRICHTENTYP_OBJECT = 131;

	/**
	 * The meta object id for the '<em>Nachweisbezug Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Nachweisbezug
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNachweisbezugObject()
	 * @generated
	 */
	int NACHWEISBEZUG_OBJECT = 132;

	/**
	 * The meta object id for the '<em>Personensorgerecht Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Personensorgerecht
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getPersonensorgerechtObject()
	 * @generated
	 */
	int PERSONENSORGERECHT_OBJECT = 133;

	/**
	 * The meta object id for the '<em>Sonderstatus Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Sonderstatus
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getSonderstatusObject()
	 * @generated
	 */
	int SONDERSTATUS_OBJECT = 134;

	/**
	 * The meta object id for the '<em>Sonstigeleistungen Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Sonstigeleistungen
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getSonstigeleistungenObject()
	 * @generated
	 */
	int SONSTIGELEISTUNGEN_OBJECT = 135;

	/**
	 * The meta object id for the '<em>Statusdatenabruf Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Statusdatenabruf
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getStatusdatenabrufObject()
	 * @generated
	 */
	int STATUSDATENABRUF_OBJECT = 136;

	/**
	 * The meta object id for the '<em>Steuerliche Identifikationsnummer Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getSteuerlicheIdentifikationsnummerType()
	 * @generated
	 */
	int STEUERLICHE_IDENTIFIKATIONSNUMMER_TYPE = 137;

	/**
	 * The meta object id for the '<em>Tagesdatum Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getTagesdatumType()
	 * @generated
	 */
	int TAGESDATUM_TYPE = 138;

	/**
	 * The meta object id for the '<em>Tatsachenbehauptung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Tatsachenbehauptung
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getTatsachenbehauptungObject()
	 * @generated
	 */
	int TATSACHENBEHAUPTUNG_OBJECT = 139;

	/**
	 * The meta object id for the '<em>UUID Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getUUIDType()
	 * @generated
	 */
	int UUID_TYPE = 140;

	/**
	 * The meta object id for the '<em>Vertrauensniveau Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Vertrauensniveau
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getVertrauensniveauObject()
	 * @generated
	 */
	int VERTRAUENSNIVEAU_OBJECT = 141;

	/**
	 * The meta object id for the '<em>Vertretung Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Vertretung
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getVertretungObject()
	 * @generated
	 */
	int VERTRETUNG_OBJECT = 142;

	/**
	 * The meta object id for the '<em>Wohnsitz Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Wohnsitz
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getWohnsitzObject()
	 * @generated
	 */
	int WOHNSITZ_OBJECT = 143;

	/**
	 * The meta object id for the '<em>Zuschuesse Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Zuschuesse
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getZuschuesseObject()
	 * @generated
	 */
	int ZUSCHUESSE_OBJECT = 144;


	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.AllgemeinerNameType <em>Allgemeiner Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allgemeiner Name Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.AllgemeinerNameType
	 * @generated
	 */
	EClass getAllgemeinerNameType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.AllgemeinerNameType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.AllgemeinerNameType#getName()
	 * @see #getAllgemeinerNameType()
	 * @generated
	 */
	EAttribute getAllgemeinerNameType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.AllgemeinerNameType#isNichtVorhanden <em>Nicht Vorhanden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nicht Vorhanden</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.AllgemeinerNameType#isNichtVorhanden()
	 * @see #getAllgemeinerNameType()
	 * @generated
	 */
	EAttribute getAllgemeinerNameType_NichtVorhanden();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType <em>Antragsnachricht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Antragsnachricht Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType
	 * @generated
	 */
	EClass getAntragsnachrichtType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType#getZeitstempelAntragsstellung <em>Zeitstempel Antragsstellung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zeitstempel Antragsstellung</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType#getZeitstempelAntragsstellung()
	 * @see #getAntragsnachrichtType()
	 * @generated
	 */
	EAttribute getAntragsnachrichtType_ZeitstempelAntragsstellung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType#getTransaktionsid <em>Transaktionsid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaktionsid</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.AntragsnachrichtType#getTransaktionsid()
	 * @see #getAntragsnachrichtType()
	 * @generated
	 */
	EAttribute getAntragsnachrichtType_Transaktionsid();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType <em>Aufenthaltstitel Nachweisbezug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aufenthaltstitel Nachweisbezug Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType
	 * @generated
	 */
	EClass getAufenthaltstitelNachweisbezugType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType#getDokumenttyp <em>Dokumenttyp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dokumenttyp</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType#getDokumenttyp()
	 * @see #getAufenthaltstitelNachweisbezugType()
	 * @generated
	 */
	EAttribute getAufenthaltstitelNachweisbezugType_Dokumenttyp();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType#getNebenbestimmungen <em>Nebenbestimmungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Nebenbestimmungen</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType#getNebenbestimmungen()
	 * @see #getAufenthaltstitelNachweisbezugType()
	 * @generated
	 */
	EAttribute getAufenthaltstitelNachweisbezugType_Nebenbestimmungen();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType#getAblaufdatum <em>Ablaufdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ablaufdatum</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType#getAblaufdatum()
	 * @see #getAufenthaltstitelNachweisbezugType()
	 * @generated
	 */
	EAttribute getAufenthaltstitelNachweisbezugType_Ablaufdatum();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType#getNachweisbezug <em>Nachweisbezug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachweisbezug</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.AufenthaltstitelNachweisbezugType#getNachweisbezug()
	 * @see #getAufenthaltstitelNachweisbezugType()
	 * @generated
	 */
	EReference getAufenthaltstitelNachweisbezugType_Nachweisbezug();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.AuslandsanschriftType <em>Auslandsanschrift Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auslandsanschrift Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.AuslandsanschriftType
	 * @generated
	 */
	EClass getAuslandsanschriftType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.AuslandsanschriftType#getStaat <em>Staat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Staat</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.AuslandsanschriftType#getStaat()
	 * @see #getAuslandsanschriftType()
	 * @generated
	 */
	EReference getAuslandsanschriftType_Staat();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.baukasten._1.baukasten.AuslandsanschriftType#getAnschriftszeile <em>Anschriftszeile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Anschriftszeile</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.AuslandsanschriftType#getAnschriftszeile()
	 * @see #getAuslandsanschriftType()
	 * @generated
	 */
	EAttribute getAuslandsanschriftType_Anschriftszeile();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungIBANOptionalType <em>Bankverbindung IBAN Optional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bankverbindung IBAN Optional Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungIBANOptionalType
	 * @generated
	 */
	EClass getBankverbindungIBANOptionalType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungIBANOptionalType#getInhaber <em>Inhaber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inhaber</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungIBANOptionalType#getInhaber()
	 * @see #getBankverbindungIBANOptionalType()
	 * @generated
	 */
	EReference getBankverbindungIBANOptionalType_Inhaber();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungIBANOptionalType#getIban <em>Iban</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iban</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungIBANOptionalType#getIban()
	 * @see #getBankverbindungIBANOptionalType()
	 * @generated
	 */
	EAttribute getBankverbindungIBANOptionalType_Iban();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungIBANOptionalType#getBic <em>Bic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bic</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungIBANOptionalType#getBic()
	 * @see #getBankverbindungIBANOptionalType()
	 * @generated
	 */
	EAttribute getBankverbindungIBANOptionalType_Bic();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungIBANOptionalType#getInstitut <em>Institut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Institut</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungIBANOptionalType#getInstitut()
	 * @see #getBankverbindungIBANOptionalType()
	 * @generated
	 */
	EAttribute getBankverbindungIBANOptionalType_Institut();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType <em>Bankverbindung Inhaber Optional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bankverbindung Inhaber Optional Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType
	 * @generated
	 */
	EClass getBankverbindungInhaberOptionalType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType#getInhaber <em>Inhaber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inhaber</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType#getInhaber()
	 * @see #getBankverbindungInhaberOptionalType()
	 * @generated
	 */
	EReference getBankverbindungInhaberOptionalType_Inhaber();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType#getIban <em>Iban</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iban</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType#getIban()
	 * @see #getBankverbindungInhaberOptionalType()
	 * @generated
	 */
	EAttribute getBankverbindungInhaberOptionalType_Iban();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType#getBic <em>Bic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bic</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType#getBic()
	 * @see #getBankverbindungInhaberOptionalType()
	 * @generated
	 */
	EAttribute getBankverbindungInhaberOptionalType_Bic();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType#getInstitut <em>Institut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Institut</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungInhaberOptionalType#getInstitut()
	 * @see #getBankverbindungInhaberOptionalType()
	 * @generated
	 */
	EAttribute getBankverbindungInhaberOptionalType_Institut();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungType <em>Bankverbindung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bankverbindung Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungType
	 * @generated
	 */
	EClass getBankverbindungType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungType#getInhaber <em>Inhaber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inhaber</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungType#getInhaber()
	 * @see #getBankverbindungType()
	 * @generated
	 */
	EReference getBankverbindungType_Inhaber();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungType#getIban <em>Iban</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iban</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungType#getIban()
	 * @see #getBankverbindungType()
	 * @generated
	 */
	EAttribute getBankverbindungType_Iban();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungType#getBic <em>Bic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bic</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungType#getBic()
	 * @see #getBankverbindungType()
	 * @generated
	 */
	EAttribute getBankverbindungType_Bic();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungType#getInstitut <em>Institut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Institut</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BankverbindungType#getInstitut()
	 * @see #getBankverbindungType()
	 * @generated
	 */
	EAttribute getBankverbindungType_Institut();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.BehoerdenkennungType <em>Behoerdenkennung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behoerdenkennung Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BehoerdenkennungType
	 * @generated
	 */
	EClass getBehoerdenkennungType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.BehoerdenkennungType#getPraefix <em>Praefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Praefix</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BehoerdenkennungType#getPraefix()
	 * @see #getBehoerdenkennungType()
	 * @generated
	 */
	EReference getBehoerdenkennungType_Praefix();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.BehoerdenkennungType#getKennung <em>Kennung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kennung</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.BehoerdenkennungType#getKennung()
	 * @see #getBehoerdenkennungType()
	 * @generated
	 */
	EReference getBehoerdenkennungType_Kennung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeAnredeType <em>Code Anrede Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Anrede Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeAnredeType
	 * @generated
	 */
	EClass getCodeAnredeType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeArtAbrufType <em>Code Art Abruf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Art Abruf Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeArtAbrufType
	 * @generated
	 */
	EClass getCodeArtAbrufType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeAufenthaltsstatusType <em>Code Aufenthaltsstatus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Aufenthaltsstatus Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeAufenthaltsstatusType
	 * @generated
	 */
	EClass getCodeAufenthaltsstatusType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeBundeslandType <em>Code Bundesland Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Bundesland Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeBundeslandType
	 * @generated
	 */
	EClass getCodeBundeslandType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeEigenschaftType <em>Code Eigenschaft Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Eigenschaft Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeEigenschaftType
	 * @generated
	 */
	EClass getCodeEigenschaftType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeEinkommensartenType <em>Code Einkommensarten Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Einkommensarten Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeEinkommensartenType
	 * @generated
	 */
	EClass getCodeEinkommensartenType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeErreichbarkeitType <em>Code Erreichbarkeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Erreichbarkeit Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeErreichbarkeitType
	 * @generated
	 */
	EClass getCodeErreichbarkeitType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeFamilienstandType <em>Code Familienstand Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Familienstand Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeFamilienstandType
	 * @generated
	 */
	EClass getCodeFamilienstandType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeGemeindeVZAmtlicherGemeindeschluesselType <em>Code Gemeinde VZ Amtlicher Gemeindeschluessel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Gemeinde VZ Amtlicher Gemeindeschluessel Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeGemeindeVZAmtlicherGemeindeschluesselType
	 * @generated
	 */
	EClass getCodeGemeindeVZAmtlicherGemeindeschluesselType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeGemeindeVZRegionalschluesselType <em>Code Gemeinde VZ Regionalschluessel Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Gemeinde VZ Regionalschluessel Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeGemeindeVZRegionalschluesselType
	 * @generated
	 */
	EClass getCodeGemeindeVZRegionalschluesselType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeGeschlechtType <em>Code Geschlecht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Geschlecht Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeGeschlechtType
	 * @generated
	 */
	EClass getCodeGeschlechtType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeKindschaftsbeziehungType <em>Code Kindschaftsbeziehung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Kindschaftsbeziehung Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeKindschaftsbeziehungType
	 * @generated
	 */
	EClass getCodeKindschaftsbeziehungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeKindWohnhaftBeiType <em>Code Kind Wohnhaft Bei Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Kind Wohnhaft Bei Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeKindWohnhaftBeiType
	 * @generated
	 */
	EClass getCodeKindWohnhaftBeiType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeLeistungserhaltType <em>Code Leistungserhalt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Leistungserhalt Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeLeistungserhaltType
	 * @generated
	 */
	EClass getCodeLeistungserhaltType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeLeistungsgewaehrungType <em>Code Leistungsgewaehrung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Leistungsgewaehrung Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeLeistungsgewaehrungType
	 * @generated
	 */
	EClass getCodeLeistungsgewaehrungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeNachrichtentypType <em>Code Nachrichtentyp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Nachrichtentyp Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeNachrichtentypType
	 * @generated
	 */
	EClass getCodeNachrichtentypType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeNachweisbezugType <em>Code Nachweisbezug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Nachweisbezug Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeNachweisbezugType
	 * @generated
	 */
	EClass getCodeNachweisbezugType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodePersonensorgerechtType <em>Code Personensorgerecht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Personensorgerecht Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodePersonensorgerechtType
	 * @generated
	 */
	EClass getCodePersonensorgerechtType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodePraefixType <em>Code Praefix Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Praefix Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodePraefixType
	 * @generated
	 */
	EClass getCodePraefixType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeSonderstatusType <em>Code Sonderstatus Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Sonderstatus Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeSonderstatusType
	 * @generated
	 */
	EClass getCodeSonderstatusType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeSonstigeLeistungenType <em>Code Sonstige Leistungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Sonstige Leistungen Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeSonstigeLeistungenType
	 * @generated
	 */
	EClass getCodeSonstigeLeistungenType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatsangehoerigkeitType <em>Code Staatsangehoerigkeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Staatsangehoerigkeit Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatsangehoerigkeitType
	 * @generated
	 */
	EClass getCodeStaatsangehoerigkeitType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatType <em>Code Staat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Staat Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeStaatType
	 * @generated
	 */
	EClass getCodeStaatType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeStandesamtnummernType <em>Code Standesamtnummern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Standesamtnummern Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeStandesamtnummernType
	 * @generated
	 */
	EClass getCodeStandesamtnummernType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeStatusDatenabrufType <em>Code Status Datenabruf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Status Datenabruf Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeStatusDatenabrufType
	 * @generated
	 */
	EClass getCodeStatusDatenabrufType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeTatsachenbehauptungType <em>Code Tatsachenbehauptung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Tatsachenbehauptung Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeTatsachenbehauptungType
	 * @generated
	 */
	EClass getCodeTatsachenbehauptungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeVermoegensartType <em>Code Vermoegensart Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Vermoegensart Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeVermoegensartType
	 * @generated
	 */
	EClass getCodeVermoegensartType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeVertrauensniveauType <em>Code Vertrauensniveau Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Vertrauensniveau Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeVertrauensniveauType
	 * @generated
	 */
	EClass getCodeVertrauensniveauType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeVertretungType <em>Code Vertretung Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Vertretung Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeVertretungType
	 * @generated
	 */
	EClass getCodeVertretungType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeWohnsitzType <em>Code Wohnsitz Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Wohnsitz Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeWohnsitzType
	 * @generated
	 */
	EClass getCodeWohnsitzType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.CodeZuschuesseType <em>Code Zuschuesse Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Zuschuesse Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.CodeZuschuesseType
	 * @generated
	 */
	EClass getCodeZuschuesseType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType <em>Datenabruf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datenabruf Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType
	 * @generated
	 */
	EClass getDatenabrufType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getId()
	 * @see #getDatenabrufType()
	 * @generated
	 */
	EAttribute getDatenabrufType_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getZeitstempel <em>Zeitstempel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zeitstempel</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getZeitstempel()
	 * @see #getDatenabrufType()
	 * @generated
	 */
	EAttribute getDatenabrufType_Zeitstempel();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getQuelle <em>Quelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quelle</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getQuelle()
	 * @see #getDatenabrufType()
	 * @generated
	 */
	EAttribute getDatenabrufType_Quelle();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getArtDesAbrufs <em>Art Des Abrufs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Art Des Abrufs</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getArtDesAbrufs()
	 * @see #getDatenabrufType()
	 * @generated
	 */
	EAttribute getDatenabrufType_ArtDesAbrufs();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getAbgerufenFuer <em>Abgerufen Fuer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abgerufen Fuer</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getAbgerufenFuer()
	 * @see #getDatenabrufType()
	 * @generated
	 */
	EAttribute getDatenabrufType_AbgerufenFuer();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getStatusDatenabruf <em>Status Datenabruf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status Datenabruf</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.DatenabrufType#getStatusDatenabruf()
	 * @see #getDatenabrufType()
	 * @generated
	 */
	EReference getDatenabrufType_StatusDatenabruf();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType <em>Datenschutzerklaerungen Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datenschutzerklaerungen Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType
	 * @generated
	 */
	EClass getDatenschutzerklaerungenType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType#isDsgvoBetreiber <em>Dsgvo Betreiber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dsgvo Betreiber</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType#isDsgvoBetreiber()
	 * @see #getDatenschutzerklaerungenType()
	 * @generated
	 */
	EAttribute getDatenschutzerklaerungenType_DsgvoBetreiber();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType#isDsgvoNachnutzer <em>Dsgvo Nachnutzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dsgvo Nachnutzer</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.DatenschutzerklaerungenType#isDsgvoNachnutzer()
	 * @see #getDatenschutzerklaerungenType()
	 * @generated
	 */
	EAttribute getDatenschutzerklaerungenType_DsgvoNachnutzer();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenArbeitgeberDsrvType <em>Entgeltdaten Arbeitgeber Dsrv Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entgeltdaten Arbeitgeber Dsrv Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenArbeitgeberDsrvType
	 * @generated
	 */
	EClass getEntgeltdatenArbeitgeberDsrvType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenArbeitgeberDsrvType#getAbfrageID <em>Abfrage ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abfrage ID</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenArbeitgeberDsrvType#getAbfrageID()
	 * @see #getEntgeltdatenArbeitgeberDsrvType()
	 * @generated
	 */
	EAttribute getEntgeltdatenArbeitgeberDsrvType_AbfrageID();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenArbeitgeberDsrvType#getIfdNrArbeitgeber <em>Ifd Nr Arbeitgeber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ifd Nr Arbeitgeber</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenArbeitgeberDsrvType#getIfdNrArbeitgeber()
	 * @see #getEntgeltdatenArbeitgeberDsrvType()
	 * @generated
	 */
	EAttribute getEntgeltdatenArbeitgeberDsrvType_IfdNrArbeitgeber();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenArbeitgeberDsrvType#getAbrufergebnisDrv <em>Abrufergebnis Drv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abrufergebnis Drv</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenArbeitgeberDsrvType#getAbrufergebnisDrv()
	 * @see #getEntgeltdatenArbeitgeberDsrvType()
	 * @generated
	 */
	EReference getEntgeltdatenArbeitgeberDsrvType_AbrufergebnisDrv();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenDsrvNachweisbezugType <em>Entgeltdaten Dsrv Nachweisbezug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entgeltdaten Dsrv Nachweisbezug Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenDsrvNachweisbezugType
	 * @generated
	 */
	EClass getEntgeltdatenDsrvNachweisbezugType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenDsrvNachweisbezugType#getNachweisbezug <em>Nachweisbezug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachweisbezug</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenDsrvNachweisbezugType#getNachweisbezug()
	 * @see #getEntgeltdatenDsrvNachweisbezugType()
	 * @generated
	 */
	EReference getEntgeltdatenDsrvNachweisbezugType_Nachweisbezug();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenDsrvNachweisbezugType#getZeitraumVon <em>Zeitraum Von</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zeitraum Von</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenDsrvNachweisbezugType#getZeitraumVon()
	 * @see #getEntgeltdatenDsrvNachweisbezugType()
	 * @generated
	 */
	EAttribute getEntgeltdatenDsrvNachweisbezugType_ZeitraumVon();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenDsrvNachweisbezugType#getZeitraumBis <em>Zeitraum Bis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zeitraum Bis</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenDsrvNachweisbezugType#getZeitraumBis()
	 * @see #getEntgeltdatenDsrvNachweisbezugType()
	 * @generated
	 */
	EAttribute getEntgeltdatenDsrvNachweisbezugType_ZeitraumBis();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenDsrvNachweisbezugType#getEntgeltdatenArbeitgeber <em>Entgeltdaten Arbeitgeber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entgeltdaten Arbeitgeber</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.EntgeltdatenDsrvNachweisbezugType#getEntgeltdatenArbeitgeber()
	 * @see #getEntgeltdatenDsrvNachweisbezugType()
	 * @generated
	 */
	EReference getEntgeltdatenDsrvNachweisbezugType_EntgeltdatenArbeitgeber();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType <em>Erreichbarkeit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Erreichbarkeit Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType
	 * @generated
	 */
	EClass getErreichbarkeitType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType#getKanal <em>Kanal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kanal</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType#getKanal()
	 * @see #getErreichbarkeitType()
	 * @generated
	 */
	EReference getErreichbarkeitType_Kanal();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType#getKennung <em>Kennung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kennung</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType#getKennung()
	 * @see #getErreichbarkeitType()
	 * @generated
	 */
	EAttribute getErreichbarkeitType_Kennung();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType#getZusatz <em>Zusatz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zusatz</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.ErreichbarkeitType#getZusatz()
	 * @see #getErreichbarkeitType()
	 * @generated
	 */
	EAttribute getErreichbarkeitType_Zusatz();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.FamiliennameUnstrukturiertType <em>Familienname Unstrukturiert Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Familienname Unstrukturiert Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.FamiliennameUnstrukturiertType
	 * @generated
	 */
	EClass getFamiliennameUnstrukturiertType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.FamiliennameUnstrukturiertType#getNachname <em>Nachname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachname</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.FamiliennameUnstrukturiertType#getNachname()
	 * @see #getFamiliennameUnstrukturiertType()
	 * @generated
	 */
	EReference getFamiliennameUnstrukturiertType_Nachname();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.FamiliennameUnstrukturiertType#getNachnamepass <em>Nachnamepass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachnamepass</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.FamiliennameUnstrukturiertType#getNachnamepass()
	 * @see #getFamiliennameUnstrukturiertType()
	 * @generated
	 */
	EReference getFamiliennameUnstrukturiertType_Nachnamepass();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandNachweisbezugType <em>Familienstand Nachweisbezug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Familienstand Nachweisbezug Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandNachweisbezugType
	 * @generated
	 */
	EClass getFamilienstandNachweisbezugType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandNachweisbezugType#getNachweisbezug <em>Nachweisbezug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachweisbezug</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandNachweisbezugType#getNachweisbezug()
	 * @see #getFamilienstandNachweisbezugType()
	 * @generated
	 */
	EReference getFamilienstandNachweisbezugType_Nachweisbezug();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandType <em>Familienstand Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Familienstand Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandType
	 * @generated
	 */
	EClass getFamilienstandType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandType#getSeit <em>Seit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seit</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandType#getSeit()
	 * @see #getFamilienstandType()
	 * @generated
	 */
	EAttribute getFamilienstandType_Seit();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandType#getFamilienstand <em>Familienstand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Familienstand</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.FamilienstandType#getFamilienstand()
	 * @see #getFamilienstandType()
	 * @generated
	 */
	EReference getFamilienstandType_Familienstand();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.FeldgruppeType <em>Feldgruppe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feldgruppe Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.FeldgruppeType
	 * @generated
	 */
	EClass getFeldgruppeType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.FeldgruppeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.FeldgruppeType#getName()
	 * @see #getFeldgruppeType()
	 * @generated
	 */
	EAttribute getFeldgruppeType_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.baukasten._1.baukasten.FeldgruppeType#getFeld <em>Feld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feld</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.FeldgruppeType#getFeld()
	 * @see #getFeldgruppeType()
	 * @generated
	 */
	EReference getFeldgruppeType_Feld();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.baukasten._1.baukasten.FeldgruppeType#getFeldgruppe <em>Feldgruppe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feldgruppe</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.FeldgruppeType#getFeldgruppe()
	 * @see #getFeldgruppeType()
	 * @generated
	 */
	EReference getFeldgruppeType_Feldgruppe();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.FeldgruppeType#getLaufendeNummer <em>Laufende Nummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Laufende Nummer</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.FeldgruppeType#getLaufendeNummer()
	 * @see #getFeldgruppeType()
	 * @generated
	 */
	EAttribute getFeldgruppeType_LaufendeNummer();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.FeldType <em>Feld Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feld Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.FeldType
	 * @generated
	 */
	EClass getFeldType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.FeldType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.FeldType#getName()
	 * @see #getFeldType()
	 * @generated
	 */
	EAttribute getFeldType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.FeldType#getWert <em>Wert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wert</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.FeldType#getWert()
	 * @see #getFeldType()
	 * @generated
	 */
	EAttribute getFeldType_Wert();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.FeldType#getLaufendeNummer <em>Laufende Nummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Laufende Nummer</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.FeldType#getLaufendeNummer()
	 * @see #getFeldType()
	 * @generated
	 */
	EAttribute getFeldType_LaufendeNummer();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.GeburtGeburtsortOptionalType <em>Geburt Geburtsort Optional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geburt Geburtsort Optional Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.GeburtGeburtsortOptionalType
	 * @generated
	 */
	EClass getGeburtGeburtsortOptionalType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.GeburtGeburtsortOptionalType#getGeburtsort <em>Geburtsort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsort</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.GeburtGeburtsortOptionalType#getGeburtsort()
	 * @see #getGeburtGeburtsortOptionalType()
	 * @generated
	 */
	EAttribute getGeburtGeburtsortOptionalType_Geburtsort();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.GeburtGeburtsortOptionalType#getGeburtsortStaat <em>Geburtsort Staat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsort Staat</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.GeburtGeburtsortOptionalType#getGeburtsortStaat()
	 * @see #getGeburtGeburtsortOptionalType()
	 * @generated
	 */
	EReference getGeburtGeburtsortOptionalType_GeburtsortStaat();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.GeburtGeburtsortOptionalType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.GeburtGeburtsortOptionalType#getGeburtsdatum()
	 * @see #getGeburtGeburtsortOptionalType()
	 * @generated
	 */
	EReference getGeburtGeburtsortOptionalType_Geburtsdatum();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.GeburtNachweisbezugType <em>Geburt Nachweisbezug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geburt Nachweisbezug Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.GeburtNachweisbezugType
	 * @generated
	 */
	EClass getGeburtNachweisbezugType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.GeburtNachweisbezugType#getNachweisbezug <em>Nachweisbezug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachweisbezug</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.GeburtNachweisbezugType#getNachweisbezug()
	 * @see #getGeburtNachweisbezugType()
	 * @generated
	 */
	EReference getGeburtNachweisbezugType_Nachweisbezug();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.GeburtOptionalType <em>Geburt Optional Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geburt Optional Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.GeburtOptionalType
	 * @generated
	 */
	EClass getGeburtOptionalType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.GeburtOptionalType#getGeburtsort <em>Geburtsort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsort</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.GeburtOptionalType#getGeburtsort()
	 * @see #getGeburtOptionalType()
	 * @generated
	 */
	EAttribute getGeburtOptionalType_Geburtsort();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.GeburtOptionalType#getGeburtsortStaat <em>Geburtsort Staat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsort Staat</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.GeburtOptionalType#getGeburtsortStaat()
	 * @see #getGeburtOptionalType()
	 * @generated
	 */
	EReference getGeburtOptionalType_GeburtsortStaat();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.GeburtOptionalType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.GeburtOptionalType#getGeburtsdatum()
	 * @see #getGeburtOptionalType()
	 * @generated
	 */
	EReference getGeburtOptionalType_Geburtsdatum();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.GeburtType <em>Geburt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geburt Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.GeburtType
	 * @generated
	 */
	EClass getGeburtType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.GeburtType#getGeburtsort <em>Geburtsort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Geburtsort</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.GeburtType#getGeburtsort()
	 * @see #getGeburtType()
	 * @generated
	 */
	EAttribute getGeburtType_Geburtsort();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.GeburtType#getGeburtsortStaat <em>Geburtsort Staat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsort Staat</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.GeburtType#getGeburtsortStaat()
	 * @see #getGeburtType()
	 * @generated
	 */
	EReference getGeburtType_GeburtsortStaat();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.GeburtType#getGeburtsdatum <em>Geburtsdatum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsdatum</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.GeburtType#getGeburtsdatum()
	 * @see #getGeburtType()
	 * @generated
	 */
	EReference getGeburtType_Geburtsdatum();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.HausnummernBisType <em>Hausnummern Bis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hausnummern Bis Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.HausnummernBisType
	 * @generated
	 */
	EClass getHausnummernBisType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.HausnummernBisType#getHausnummerBis <em>Hausnummer Bis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hausnummer Bis</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.HausnummernBisType#getHausnummerBis()
	 * @see #getHausnummernBisType()
	 * @generated
	 */
	EAttribute getHausnummernBisType_HausnummerBis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.HausnummernBisType#getHausnummerbuchstabezusatzzifferBis <em>Hausnummerbuchstabezusatzziffer Bis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hausnummerbuchstabezusatzziffer Bis</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.HausnummernBisType#getHausnummerbuchstabezusatzzifferBis()
	 * @see #getHausnummernBisType()
	 * @generated
	 */
	EAttribute getHausnummernBisType_HausnummerbuchstabezusatzzifferBis();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.HausnummernBisType#getTeilnummerderhausnummerBis <em>Teilnummerderhausnummer Bis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Teilnummerderhausnummer Bis</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.HausnummernBisType#getTeilnummerderhausnummerBis()
	 * @see #getHausnummernBisType()
	 * @generated
	 */
	EAttribute getHausnummernBisType_TeilnummerderhausnummerBis();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.IdentifikationNachrichtType <em>Identifikation Nachricht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifikation Nachricht Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.IdentifikationNachrichtType
	 * @generated
	 */
	EClass getIdentifikationNachrichtType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.IdentifikationNachrichtType#getNachrichtenUUID <em>Nachrichten UUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nachrichten UUID</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.IdentifikationNachrichtType#getNachrichtenUUID()
	 * @see #getIdentifikationNachrichtType()
	 * @generated
	 */
	EAttribute getIdentifikationNachrichtType_NachrichtenUUID();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.IdentifikationNachrichtType#getNachrichtentyp <em>Nachrichtentyp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachrichtentyp</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.IdentifikationNachrichtType#getNachrichtentyp()
	 * @see #getIdentifikationNachrichtType()
	 * @generated
	 */
	EReference getIdentifikationNachrichtType_Nachrichtentyp();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.IdentifikationNachrichtType#getErstellungszeitpunkt <em>Erstellungszeitpunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Erstellungszeitpunkt</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.IdentifikationNachrichtType#getErstellungszeitpunkt()
	 * @see #getIdentifikationNachrichtType()
	 * @generated
	 */
	EAttribute getIdentifikationNachrichtType_Erstellungszeitpunkt();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerErreichbarType <em>Kommunikationspartner Erreichbar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kommunikationspartner Erreichbar Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerErreichbarType
	 * @generated
	 */
	EClass getKommunikationspartnerErreichbarType();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerType <em>Kommunikationspartner Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kommunikationspartner Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerType
	 * @generated
	 */
	EClass getKommunikationspartnerType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerType#getBehoerdenkennung <em>Behoerdenkennung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behoerdenkennung</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerType#getBehoerdenkennung()
	 * @see #getKommunikationspartnerType()
	 * @generated
	 */
	EReference getKommunikationspartnerType_Behoerdenkennung();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerType#getErreichbarkeit <em>Erreichbarkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Erreichbarkeit</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerType#getErreichbarkeit()
	 * @see #getKommunikationspartnerType()
	 * @generated
	 */
	EReference getKommunikationspartnerType_Erreichbarkeit();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerType#getAnschrift <em>Anschrift</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Anschrift</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerType#getAnschrift()
	 * @see #getKommunikationspartnerType()
	 * @generated
	 */
	EReference getKommunikationspartnerType_Anschrift();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerType#getBehoerdenname <em>Behoerdenname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behoerdenname</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.KommunikationspartnerType#getBehoerdenname()
	 * @see #getKommunikationspartnerType()
	 * @generated
	 */
	EAttribute getKommunikationspartnerType_Behoerdenname();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType <em>Meldeanschrift Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meldeanschrift Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType
	 * @generated
	 */
	EClass getMeldeanschriftType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getGemeindeschluessel <em>Gemeindeschluessel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gemeindeschluessel</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getGemeindeschluessel()
	 * @see #getMeldeanschriftType()
	 * @generated
	 */
	EReference getMeldeanschriftType_Gemeindeschluessel();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getHausnummer <em>Hausnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hausnummer</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getHausnummer()
	 * @see #getMeldeanschriftType()
	 * @generated
	 */
	EAttribute getMeldeanschriftType_Hausnummer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getHausnummerBuchstabeZusatzziffer <em>Hausnummer Buchstabe Zusatzziffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hausnummer Buchstabe Zusatzziffer</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getHausnummerBuchstabeZusatzziffer()
	 * @see #getMeldeanschriftType()
	 * @generated
	 */
	EAttribute getMeldeanschriftType_HausnummerBuchstabeZusatzziffer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getPostleitzahl <em>Postleitzahl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postleitzahl</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getPostleitzahl()
	 * @see #getMeldeanschriftType()
	 * @generated
	 */
	EAttribute getMeldeanschriftType_Postleitzahl();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getStockwerkswohnungsnummer <em>Stockwerkswohnungsnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stockwerkswohnungsnummer</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getStockwerkswohnungsnummer()
	 * @see #getMeldeanschriftType()
	 * @generated
	 */
	EAttribute getMeldeanschriftType_Stockwerkswohnungsnummer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getStrasse <em>Strasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strasse</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getStrasse()
	 * @see #getMeldeanschriftType()
	 * @generated
	 */
	EAttribute getMeldeanschriftType_Strasse();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getTeilnummerDerHausnummer <em>Teilnummer Der Hausnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Teilnummer Der Hausnummer</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getTeilnummerDerHausnummer()
	 * @see #getMeldeanschriftType()
	 * @generated
	 */
	EAttribute getMeldeanschriftType_TeilnummerDerHausnummer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getWohnort <em>Wohnort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wohnort</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getWohnort()
	 * @see #getMeldeanschriftType()
	 * @generated
	 */
	EAttribute getMeldeanschriftType_Wohnort();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getWohnortFruehererGemeindename <em>Wohnort Frueherer Gemeindename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wohnort Frueherer Gemeindename</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getWohnortFruehererGemeindename()
	 * @see #getMeldeanschriftType()
	 * @generated
	 */
	EAttribute getMeldeanschriftType_WohnortFruehererGemeindename();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getWohnungsinhaber <em>Wohnungsinhaber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wohnungsinhaber</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getWohnungsinhaber()
	 * @see #getMeldeanschriftType()
	 * @generated
	 */
	EAttribute getMeldeanschriftType_Wohnungsinhaber();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getZusatzangaben <em>Zusatzangaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zusatzangaben</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getZusatzangaben()
	 * @see #getMeldeanschriftType()
	 * @generated
	 */
	EAttribute getMeldeanschriftType_Zusatzangaben();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getRegionalschluessel <em>Regionalschluessel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Regionalschluessel</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.MeldeanschriftType#getRegionalschluessel()
	 * @see #getMeldeanschriftType()
	 * @generated
	 */
	EReference getMeldeanschriftType_Regionalschluessel();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtenkopfType <em>Nachrichtenkopf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachrichtenkopf Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachrichtenkopfType
	 * @generated
	 */
	EClass getNachrichtenkopfType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtenkopfType#getIdentifikationNachricht <em>Identifikation Nachricht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Identifikation Nachricht</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachrichtenkopfType#getIdentifikationNachricht()
	 * @see #getNachrichtenkopfType()
	 * @generated
	 */
	EReference getNachrichtenkopfType_IdentifikationNachricht();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtenkopfType#getLeser <em>Leser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Leser</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachrichtenkopfType#getLeser()
	 * @see #getNachrichtenkopfType()
	 * @generated
	 */
	EReference getNachrichtenkopfType_Leser();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtenkopfType#getAutor <em>Autor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Autor</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachrichtenkopfType#getAutor()
	 * @see #getNachrichtenkopfType()
	 * @generated
	 */
	EReference getNachrichtenkopfType_Autor();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtenkopfType#getPostkorbHandle <em>Postkorb Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postkorb Handle</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachrichtenkopfType#getPostkorbHandle()
	 * @see #getNachrichtenkopfType()
	 * @generated
	 */
	EReference getNachrichtenkopfType_PostkorbHandle();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType <em>Nachricht Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachricht Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType
	 * @generated
	 */
	EClass getNachrichtType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getNachrichtenkopf <em>Nachrichtenkopf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachrichtenkopf</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getNachrichtenkopf()
	 * @see #getNachrichtType()
	 * @generated
	 */
	EReference getNachrichtType_Nachrichtenkopf();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getZusatzparametergruppe <em>Zusatzparametergruppe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zusatzparametergruppe</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getZusatzparametergruppe()
	 * @see #getNachrichtType()
	 * @generated
	 */
	EReference getNachrichtType_Zusatzparametergruppe();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getProdukt <em>Produkt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produkt</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getProdukt()
	 * @see #getNachrichtType()
	 * @generated
	 */
	EAttribute getNachrichtType_Produkt();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getProdukthersteller <em>Produkthersteller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produkthersteller</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getProdukthersteller()
	 * @see #getNachrichtType()
	 * @generated
	 */
	EAttribute getNachrichtType_Produkthersteller();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getProduktversion <em>Produktversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Produktversion</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getProduktversion()
	 * @see #getNachrichtType()
	 * @generated
	 */
	EAttribute getNachrichtType_Produktversion();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getStandard <em>Standard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standard</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getStandard()
	 * @see #getNachrichtType()
	 * @generated
	 */
	EAttribute getNachrichtType_Standard();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getTest()
	 * @see #getNachrichtType()
	 * @generated
	 */
	EAttribute getNachrichtType_Test();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType#getVersion()
	 * @see #getNachrichtType()
	 * @generated
	 */
	EAttribute getNachrichtType_Version();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisbezugType <em>Nachweisbezug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachweisbezug Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachweisbezugType
	 * @generated
	 */
	EClass getNachweisbezugType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisbezugType#getDatenabrufBezug <em>Datenabruf Bezug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Datenabruf Bezug</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachweisbezugType#getDatenabrufBezug()
	 * @see #getNachweisbezugType()
	 * @generated
	 */
	EReference getNachweisbezugType_DatenabrufBezug();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisbezugType#getDatenabrufId <em>Datenabruf Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datenabruf Id</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachweisbezugType#getDatenabrufId()
	 * @see #getNachweisbezugType()
	 * @generated
	 */
	EAttribute getNachweisbezugType_DatenabrufId();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType <em>Nachweisdokument Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nachweisdokument Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType
	 * @generated
	 */
	EClass getNachweisdokumentType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType#getDokumentid <em>Dokumentid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dokumentid</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType#getDokumentid()
	 * @see #getNachweisdokumentType()
	 * @generated
	 */
	EAttribute getNachweisdokumentType_Dokumentid();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType#getDateiname <em>Dateiname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dateiname</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType#getDateiname()
	 * @see #getNachweisdokumentType()
	 * @generated
	 */
	EAttribute getNachweisdokumentType_Dateiname();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType#getMimetype <em>Mimetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mimetype</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType#getMimetype()
	 * @see #getNachweisdokumentType()
	 * @generated
	 */
	EAttribute getNachweisdokumentType_Mimetype();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType#getKategorie <em>Kategorie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kategorie</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NachweisdokumentType#getKategorie()
	 * @see #getNachweisdokumentType()
	 * @generated
	 */
	EAttribute getNachweisdokumentType_Kategorie();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonNachweisbezugType <em>Name Natuerliche Person Nachweisbezug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Natuerliche Person Nachweisbezug Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonNachweisbezugType
	 * @generated
	 */
	EClass getNameNatuerlichePersonNachweisbezugType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonNachweisbezugType#getNachweisbezug <em>Nachweisbezug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachweisbezug</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonNachweisbezugType#getNachweisbezug()
	 * @see #getNameNatuerlichePersonNachweisbezugType()
	 * @generated
	 */
	EReference getNameNatuerlichePersonNachweisbezugType_Nachweisbezug();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonOhneGeburtsnameType <em>Name Natuerliche Person Ohne Geburtsname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Natuerliche Person Ohne Geburtsname Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonOhneGeburtsnameType
	 * @generated
	 */
	EClass getNameNatuerlichePersonOhneGeburtsnameType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonOhneGeburtsnameType#getFamiliennameUnstrukturiert <em>Familienname Unstrukturiert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Familienname Unstrukturiert</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonOhneGeburtsnameType#getFamiliennameUnstrukturiert()
	 * @see #getNameNatuerlichePersonOhneGeburtsnameType()
	 * @generated
	 */
	EReference getNameNatuerlichePersonOhneGeburtsnameType_FamiliennameUnstrukturiert();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonOhneGeburtsnameType#getVornamen <em>Vornamen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vornamen</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonOhneGeburtsnameType#getVornamen()
	 * @see #getNameNatuerlichePersonOhneGeburtsnameType()
	 * @generated
	 */
	EReference getNameNatuerlichePersonOhneGeburtsnameType_Vornamen();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType <em>Name Natuerliche Person Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Natuerliche Person Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType
	 * @generated
	 */
	EClass getNameNatuerlichePersonType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType#getFamiliennameUnstrukturiert <em>Familienname Unstrukturiert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Familienname Unstrukturiert</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType#getFamiliennameUnstrukturiert()
	 * @see #getNameNatuerlichePersonType()
	 * @generated
	 */
	EReference getNameNatuerlichePersonType_FamiliennameUnstrukturiert();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType#getGeburtsnameUnstrukturiert <em>Geburtsname Unstrukturiert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsname Unstrukturiert</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType#getGeburtsnameUnstrukturiert()
	 * @see #getNameNatuerlichePersonType()
	 * @generated
	 */
	EReference getNameNatuerlichePersonType_GeburtsnameUnstrukturiert();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType#getVornamen <em>Vornamen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vornamen</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType#getVornamen()
	 * @see #getNameNatuerlichePersonType()
	 * @generated
	 */
	EReference getNameNatuerlichePersonType_Vornamen();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonVornameVerpflichtendType <em>Name Natuerliche Person Vorname Verpflichtend Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Natuerliche Person Vorname Verpflichtend Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonVornameVerpflichtendType
	 * @generated
	 */
	EClass getNameNatuerlichePersonVornameVerpflichtendType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonVornameVerpflichtendType#getFamiliennameUnstrukturiert <em>Familienname Unstrukturiert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Familienname Unstrukturiert</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonVornameVerpflichtendType#getFamiliennameUnstrukturiert()
	 * @see #getNameNatuerlichePersonVornameVerpflichtendType()
	 * @generated
	 */
	EReference getNameNatuerlichePersonVornameVerpflichtendType_FamiliennameUnstrukturiert();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonVornameVerpflichtendType#getGeburtsnameUnstrukturiert <em>Geburtsname Unstrukturiert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geburtsname Unstrukturiert</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonVornameVerpflichtendType#getGeburtsnameUnstrukturiert()
	 * @see #getNameNatuerlichePersonVornameVerpflichtendType()
	 * @generated
	 */
	EReference getNameNatuerlichePersonVornameVerpflichtendType_GeburtsnameUnstrukturiert();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonVornameVerpflichtendType#getVornamen <em>Vornamen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vornamen</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonVornameVerpflichtendType#getVornamen()
	 * @see #getNameNatuerlichePersonVornameVerpflichtendType()
	 * @generated
	 */
	EReference getNameNatuerlichePersonVornameVerpflichtendType_Vornamen();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.NutzerkontoType <em>Nutzerkonto Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nutzerkonto Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NutzerkontoType
	 * @generated
	 */
	EClass getNutzerkontoType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.NutzerkontoType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NutzerkontoType#getName()
	 * @see #getNutzerkontoType()
	 * @generated
	 */
	EReference getNutzerkontoType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.NutzerkontoType#getVertrauensniveau <em>Vertrauensniveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vertrauensniveau</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NutzerkontoType#getVertrauensniveau()
	 * @see #getNutzerkontoType()
	 * @generated
	 */
	EReference getNutzerkontoType_Vertrauensniveau();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.baukasten._1.baukasten.NutzerkontoType#getNachweisNutzerkonto <em>Nachweis Nutzerkonto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nachweis Nutzerkonto</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.NutzerkontoType#getNachweisNutzerkonto()
	 * @see #getNutzerkontoType()
	 * @generated
	 */
	EReference getNutzerkontoType_NachweisNutzerkonto();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType <em>Postalische Inlandsanschrift Basis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postalische Inlandsanschrift Basis Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType
	 * @generated
	 */
	EClass getPostalischeInlandsanschriftBasisType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType#getHausnummer <em>Hausnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hausnummer</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType#getHausnummer()
	 * @see #getPostalischeInlandsanschriftBasisType()
	 * @generated
	 */
	EAttribute getPostalischeInlandsanschriftBasisType_Hausnummer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType#getHausnummerBuchstabeZusatzziffer <em>Hausnummer Buchstabe Zusatzziffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hausnummer Buchstabe Zusatzziffer</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType#getHausnummerBuchstabeZusatzziffer()
	 * @see #getPostalischeInlandsanschriftBasisType()
	 * @generated
	 */
	EAttribute getPostalischeInlandsanschriftBasisType_HausnummerBuchstabeZusatzziffer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType#getPostleitzahl <em>Postleitzahl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postleitzahl</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType#getPostleitzahl()
	 * @see #getPostalischeInlandsanschriftBasisType()
	 * @generated
	 */
	EAttribute getPostalischeInlandsanschriftBasisType_Postleitzahl();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType#getStockwerkswohnungsnummer <em>Stockwerkswohnungsnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stockwerkswohnungsnummer</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType#getStockwerkswohnungsnummer()
	 * @see #getPostalischeInlandsanschriftBasisType()
	 * @generated
	 */
	EAttribute getPostalischeInlandsanschriftBasisType_Stockwerkswohnungsnummer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType#getStrasse <em>Strasse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strasse</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType#getStrasse()
	 * @see #getPostalischeInlandsanschriftBasisType()
	 * @generated
	 */
	EAttribute getPostalischeInlandsanschriftBasisType_Strasse();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType#getTeilnummerDerHausnummer <em>Teilnummer Der Hausnummer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Teilnummer Der Hausnummer</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType#getTeilnummerDerHausnummer()
	 * @see #getPostalischeInlandsanschriftBasisType()
	 * @generated
	 */
	EAttribute getPostalischeInlandsanschriftBasisType_TeilnummerDerHausnummer();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType#getWohnort <em>Wohnort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wohnort</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType#getWohnort()
	 * @see #getPostalischeInlandsanschriftBasisType()
	 * @generated
	 */
	EAttribute getPostalischeInlandsanschriftBasisType_Wohnort();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType#getWohnortFruehererGemeindename <em>Wohnort Frueherer Gemeindename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wohnort Frueherer Gemeindename</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType#getWohnortFruehererGemeindename()
	 * @see #getPostalischeInlandsanschriftBasisType()
	 * @generated
	 */
	EAttribute getPostalischeInlandsanschriftBasisType_WohnortFruehererGemeindename();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType#getWohnungsinhaber <em>Wohnungsinhaber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wohnungsinhaber</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType#getWohnungsinhaber()
	 * @see #getPostalischeInlandsanschriftBasisType()
	 * @generated
	 */
	EAttribute getPostalischeInlandsanschriftBasisType_Wohnungsinhaber();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType#getZusatzangaben <em>Zusatzangaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zusatzangaben</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftBasisType#getZusatzangaben()
	 * @see #getPostalischeInlandsanschriftBasisType()
	 * @generated
	 */
	EAttribute getPostalischeInlandsanschriftBasisType_Zusatzangaben();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType <em>Postalische Inlandsanschrift Gebaeudeanschrift Nachweisbezug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postalische Inlandsanschrift Gebaeudeanschrift Nachweisbezug Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType
	 * @generated
	 */
	EClass getPostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType#getNachweisbezug <em>Nachweisbezug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachweisbezug</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType#getNachweisbezug()
	 * @see #getPostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType()
	 * @generated
	 */
	EReference getPostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType_Nachweisbezug();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftType <em>Postalische Inlandsanschrift Gebaeudeanschrift Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postalische Inlandsanschrift Gebaeudeanschrift Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftType
	 * @generated
	 */
	EClass getPostalischeInlandsanschriftGebaeudeanschriftType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftType#getHausnummernBis <em>Hausnummern Bis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hausnummern Bis</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftGebaeudeanschriftType#getHausnummernBis()
	 * @see #getPostalischeInlandsanschriftGebaeudeanschriftType()
	 * @generated
	 */
	EReference getPostalischeInlandsanschriftGebaeudeanschriftType_HausnummernBis();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType <em>Postalische Inlandsanschrift Postfachanschrift Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postalische Inlandsanschrift Postfachanschrift Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType
	 * @generated
	 */
	EClass getPostalischeInlandsanschriftPostfachanschriftType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType#getPostfach <em>Postfach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postfach</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType#getPostfach()
	 * @see #getPostalischeInlandsanschriftPostfachanschriftType()
	 * @generated
	 */
	EAttribute getPostalischeInlandsanschriftPostfachanschriftType_Postfach();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType#getWohnort <em>Wohnort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wohnort</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType#getWohnort()
	 * @see #getPostalischeInlandsanschriftPostfachanschriftType()
	 * @generated
	 */
	EAttribute getPostalischeInlandsanschriftPostfachanschriftType_Wohnort();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType#getPostleitzahl <em>Postleitzahl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postleitzahl</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType#getPostleitzahl()
	 * @see #getPostalischeInlandsanschriftPostfachanschriftType()
	 * @generated
	 */
	EAttribute getPostalischeInlandsanschriftPostfachanschriftType_Postleitzahl();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType#getZusatzangaben <em>Zusatzangaben</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zusatzangaben</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftPostfachanschriftType#getZusatzangaben()
	 * @see #getPostalischeInlandsanschriftPostfachanschriftType()
	 * @generated
	 */
	EAttribute getPostalischeInlandsanschriftPostfachanschriftType_Zusatzangaben();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftType <em>Postalische Inlandsanschrift Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postalische Inlandsanschrift Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftType
	 * @generated
	 */
	EClass getPostalischeInlandsanschriftType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftType#getPostfach <em>Postfach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postfach</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftType#getPostfach()
	 * @see #getPostalischeInlandsanschriftType()
	 * @generated
	 */
	EReference getPostalischeInlandsanschriftType_Postfach();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftType#getGebaeude <em>Gebaeude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gebaeude</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostalischeInlandsanschriftType#getGebaeude()
	 * @see #getPostalischeInlandsanschriftType()
	 * @generated
	 */
	EReference getPostalischeInlandsanschriftType_Gebaeude();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostkorbHandleType <em>Postkorb Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Postkorb Handle Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostkorbHandleType
	 * @generated
	 */
	EClass getPostkorbHandleType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostkorbHandleType#getPostkorbHandle <em>Postkorb Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postkorb Handle</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostkorbHandleType#getPostkorbHandle()
	 * @see #getPostkorbHandleType()
	 * @generated
	 */
	EAttribute getPostkorbHandleType_PostkorbHandle();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.PostkorbHandleType#isZustimmungElektronischerBescheid <em>Zustimmung Elektronischer Bescheid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zustimmung Elektronischer Bescheid</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.PostkorbHandleType#isZustimmungElektronischerBescheid()
	 * @see #getPostkorbHandleType()
	 * @generated
	 */
	EAttribute getPostkorbHandleType_ZustimmungElektronischerBescheid();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.StaatsangehoerigkeitenNachweisbezugType <em>Staatsangehoerigkeiten Nachweisbezug Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staatsangehoerigkeiten Nachweisbezug Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.StaatsangehoerigkeitenNachweisbezugType
	 * @generated
	 */
	EClass getStaatsangehoerigkeitenNachweisbezugType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.baukasten._1.baukasten.StaatsangehoerigkeitenNachweisbezugType#getStaatsangehoerigkeit <em>Staatsangehoerigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Staatsangehoerigkeit</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.StaatsangehoerigkeitenNachweisbezugType#getStaatsangehoerigkeit()
	 * @see #getStaatsangehoerigkeitenNachweisbezugType()
	 * @generated
	 */
	EReference getStaatsangehoerigkeitenNachweisbezugType_Staatsangehoerigkeit();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.StaatsangehoerigkeitenNachweisbezugType#getNachweisbezug <em>Nachweisbezug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nachweisbezug</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.StaatsangehoerigkeitenNachweisbezugType#getNachweisbezug()
	 * @see #getStaatsangehoerigkeitenNachweisbezugType()
	 * @generated
	 */
	EReference getStaatsangehoerigkeitenNachweisbezugType_Nachweisbezug();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.StatusDatenabrufType <em>Status Datenabruf Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status Datenabruf Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.StatusDatenabrufType
	 * @generated
	 */
	EClass getStatusDatenabrufType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.StatusDatenabrufType#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.StatusDatenabrufType#getStatus()
	 * @see #getStatusDatenabrufType()
	 * @generated
	 */
	EReference getStatusDatenabrufType_Status();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.StatusDatenabrufType#getHinweis <em>Hinweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hinweis</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.StatusDatenabrufType#getHinweis()
	 * @see #getStatusDatenabrufType()
	 * @generated
	 */
	EAttribute getStatusDatenabrufType_Hinweis();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitFreitextType <em>Tatsache Mit Freitext Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tatsache Mit Freitext Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitFreitextType
	 * @generated
	 */
	EClass getTatsacheMitFreitextType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitFreitextType#isLiegtVor <em>Liegt Vor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Liegt Vor</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitFreitextType#isLiegtVor()
	 * @see #getTatsacheMitFreitextType()
	 * @generated
	 */
	EAttribute getTatsacheMitFreitextType_LiegtVor();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitFreitextType#getFreitext <em>Freitext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Freitext</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitFreitextType#getFreitext()
	 * @see #getTatsacheMitFreitextType()
	 * @generated
	 */
	EAttribute getTatsacheMitFreitextType_Freitext();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType <em>Tatsache Mit Nachweis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tatsache Mit Nachweis Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType
	 * @generated
	 */
	EClass getTatsacheMitNachweisType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType#isLiegtVor <em>Liegt Vor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Liegt Vor</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType#isLiegtVor()
	 * @see #getTatsacheMitNachweisType()
	 * @generated
	 */
	EAttribute getTatsacheMitNachweisType_LiegtVor();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType#getNachweis <em>Nachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Nachweis</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType#getNachweis()
	 * @see #getTatsacheMitNachweisType()
	 * @generated
	 */
	EAttribute getTatsacheMitNachweisType_Nachweis();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitZeitraumType <em>Tatsache Mit Zeitraum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tatsache Mit Zeitraum Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitZeitraumType
	 * @generated
	 */
	EClass getTatsacheMitZeitraumType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitZeitraumType#isLiegtVor <em>Liegt Vor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Liegt Vor</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitZeitraumType#isLiegtVor()
	 * @see #getTatsacheMitZeitraumType()
	 * @generated
	 */
	EAttribute getTatsacheMitZeitraumType_LiegtVor();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitZeitraumType#getZeitraum <em>Zeitraum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zeitraum</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitZeitraumType#getZeitraum()
	 * @see #getTatsacheMitZeitraumType()
	 * @generated
	 */
	EReference getTatsacheMitZeitraumType_Zeitraum();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType <em>Teilbekanntes Datum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Teilbekanntes Datum Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType
	 * @generated
	 */
	EClass getTeilbekanntesDatumType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType#getJahrMonatTag <em>Jahr Monat Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jahr Monat Tag</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType#getJahrMonatTag()
	 * @see #getTeilbekanntesDatumType()
	 * @generated
	 */
	EAttribute getTeilbekanntesDatumType_JahrMonatTag();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType#getJahrMonat <em>Jahr Monat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jahr Monat</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType#getJahrMonat()
	 * @see #getTeilbekanntesDatumType()
	 * @generated
	 */
	EAttribute getTeilbekanntesDatumType_JahrMonat();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType#getJahr <em>Jahr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jahr</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType#getJahr()
	 * @see #getTeilbekanntesDatumType()
	 * @generated
	 */
	EAttribute getTeilbekanntesDatumType_Jahr();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.TerminwunschType <em>Terminwunsch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminwunsch Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.TerminwunschType
	 * @generated
	 */
	EClass getTerminwunschType();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.baukasten._1.baukasten.TerminwunschType#getWochentag <em>Wochentag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Wochentag</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.TerminwunschType#getWochentag()
	 * @see #getTerminwunschType()
	 * @generated
	 */
	EAttribute getTerminwunschType_Wochentag();

	/**
	 * Returns the meta object for the attribute list '{@link de.xoev.xfamilie.baukasten._1.baukasten.TerminwunschType#getUhrzeit <em>Uhrzeit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Uhrzeit</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.TerminwunschType#getUhrzeit()
	 * @see #getTerminwunschType()
	 * @generated
	 */
	EAttribute getTerminwunschType_Uhrzeit();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType <em>Zeitraum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zeitraum Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType
	 * @generated
	 */
	EClass getZeitraumType();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType#getBeginn <em>Beginn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beginn</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType#getBeginn()
	 * @see #getZeitraumType()
	 * @generated
	 */
	EAttribute getZeitraumType_Beginn();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType#getEnde <em>Ende</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ende</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.ZeitraumType#getEnde()
	 * @see #getZeitraumType()
	 * @generated
	 */
	EAttribute getZeitraumType_Ende();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZusatzparametergruppeType <em>Zusatzparametergruppe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zusatzparametergruppe Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.ZusatzparametergruppeType
	 * @generated
	 */
	EClass getZusatzparametergruppeType();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZusatzparametergruppeType#getFeld <em>Feld</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feld</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.ZusatzparametergruppeType#getFeld()
	 * @see #getZusatzparametergruppeType()
	 * @generated
	 */
	EReference getZusatzparametergruppeType_Feld();

	/**
	 * Returns the meta object for the containment reference list '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZusatzparametergruppeType#getFeldgruppe <em>Feldgruppe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feldgruppe</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.ZusatzparametergruppeType#getFeldgruppe()
	 * @see #getZusatzparametergruppeType()
	 * @generated
	 */
	EReference getZusatzparametergruppeType_Feldgruppe();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZusatzparametergruppeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.ZusatzparametergruppeType#getName()
	 * @see #getZusatzparametergruppeType()
	 * @generated
	 */
	EAttribute getZusatzparametergruppeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZusatzparametergruppeType#getFassungHandlungsanweisung <em>Fassung Handlungsanweisung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fassung Handlungsanweisung</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.ZusatzparametergruppeType#getFassungHandlungsanweisung()
	 * @see #getZusatzparametergruppeType()
	 * @generated
	 */
	EAttribute getZusatzparametergruppeType_FassungHandlungsanweisung();

	/**
	 * Returns the meta object for class '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZustimmungAbrufOderWeitergabeType <em>Zustimmung Abruf Oder Weitergabe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zustimmung Abruf Oder Weitergabe Type</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.ZustimmungAbrufOderWeitergabeType
	 * @generated
	 */
	EClass getZustimmungAbrufOderWeitergabeType();

	/**
	 * Returns the meta object for the containment reference '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZustimmungAbrufOderWeitergabeType#getArtDesAbrufsOderWeitergabe <em>Art Des Abrufs Oder Weitergabe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Art Des Abrufs Oder Weitergabe</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.ZustimmungAbrufOderWeitergabeType#getArtDesAbrufsOderWeitergabe()
	 * @see #getZustimmungAbrufOderWeitergabeType()
	 * @generated
	 */
	EReference getZustimmungAbrufOderWeitergabeType_ArtDesAbrufsOderWeitergabe();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZustimmungAbrufOderWeitergabeType#isZustimmungAbrufOderWeitergabe <em>Zustimmung Abruf Oder Weitergabe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zustimmung Abruf Oder Weitergabe</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.ZustimmungAbrufOderWeitergabeType#isZustimmungAbrufOderWeitergabe()
	 * @see #getZustimmungAbrufOderWeitergabeType()
	 * @generated
	 */
	EAttribute getZustimmungAbrufOderWeitergabeType_ZustimmungAbrufOderWeitergabe();

	/**
	 * Returns the meta object for the attribute '{@link de.xoev.xfamilie.baukasten._1.baukasten.ZustimmungAbrufOderWeitergabeType#getInhalteDesAbrufs <em>Inhalte Des Abrufs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inhalte Des Abrufs</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.ZustimmungAbrufOderWeitergabeType#getInhalteDesAbrufs()
	 * @see #getZustimmungAbrufOderWeitergabeType()
	 * @generated
	 */
	EAttribute getZustimmungAbrufOderWeitergabeType_InhalteDesAbrufs();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.baukasten._1.baukasten.Anrede <em>Anrede</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Anrede</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Anrede
	 * @generated
	 */
	EEnum getAnrede();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.baukasten._1.baukasten.Artabruf <em>Artabruf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Artabruf</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Artabruf
	 * @generated
	 */
	EEnum getArtabruf();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.baukasten._1.baukasten.Artnachweis <em>Artnachweis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Artnachweis</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Artnachweis
	 * @generated
	 */
	EEnum getArtnachweis();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.baukasten._1.baukasten.Aufenthaltsstatus <em>Aufenthaltsstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aufenthaltsstatus</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Aufenthaltsstatus
	 * @generated
	 */
	EEnum getAufenthaltsstatus();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.baukasten._1.baukasten.Eigenschaft <em>Eigenschaft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Eigenschaft</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Eigenschaft
	 * @generated
	 */
	EEnum getEigenschaft();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.baukasten._1.baukasten.Einkommensarten <em>Einkommensarten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Einkommensarten</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Einkommensarten
	 * @generated
	 */
	EEnum getEinkommensarten();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.baukasten._1.baukasten.Familienstand <em>Familienstand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Familienstand</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Familienstand
	 * @generated
	 */
	EEnum getFamilienstand();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.baukasten._1.baukasten.Geschlecht <em>Geschlecht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Geschlecht</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Geschlecht
	 * @generated
	 */
	EEnum getGeschlecht();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.baukasten._1.baukasten.Kindschaftsbeziehung <em>Kindschaftsbeziehung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kindschaftsbeziehung</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Kindschaftsbeziehung
	 * @generated
	 */
	EEnum getKindschaftsbeziehung();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.baukasten._1.baukasten.Kindwohnhaftbei <em>Kindwohnhaftbei</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kindwohnhaftbei</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Kindwohnhaftbei
	 * @generated
	 */
	EEnum getKindwohnhaftbei();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.baukasten._1.baukasten.Leistungserhalt <em>Leistungserhalt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Leistungserhalt</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Leistungserhalt
	 * @generated
	 */
	EEnum getLeistungserhalt();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.baukasten._1.baukasten.Leistungsgewaehrung <em>Leistungsgewaehrung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Leistungsgewaehrung</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Leistungsgewaehrung
	 * @generated
	 */
	EEnum getLeistungsgewaehrung();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.baukasten._1.baukasten.Nachrichtentyp <em>Nachrichtentyp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nachrichtentyp</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Nachrichtentyp
	 * @generated
	 */
	EEnum getNachrichtentyp();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.baukasten._1.baukasten.Nachweisbezug <em>Nachweisbezug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nachweisbezug</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Nachweisbezug
	 * @generated
	 */
	EEnum getNachweisbezug();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.baukasten._1.baukasten.Personensorgerecht <em>Personensorgerecht</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Personensorgerecht</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Personensorgerecht
	 * @generated
	 */
	EEnum getPersonensorgerecht();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.baukasten._1.baukasten.Sonderstatus <em>Sonderstatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sonderstatus</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Sonderstatus
	 * @generated
	 */
	EEnum getSonderstatus();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.baukasten._1.baukasten.Sonstigeleistungen <em>Sonstigeleistungen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sonstigeleistungen</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Sonstigeleistungen
	 * @generated
	 */
	EEnum getSonstigeleistungen();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.baukasten._1.baukasten.Statusdatenabruf <em>Statusdatenabruf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Statusdatenabruf</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Statusdatenabruf
	 * @generated
	 */
	EEnum getStatusdatenabruf();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.baukasten._1.baukasten.Tatsachenbehauptung <em>Tatsachenbehauptung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tatsachenbehauptung</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Tatsachenbehauptung
	 * @generated
	 */
	EEnum getTatsachenbehauptung();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.baukasten._1.baukasten.Vertrauensniveau <em>Vertrauensniveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vertrauensniveau</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Vertrauensniveau
	 * @generated
	 */
	EEnum getVertrauensniveau();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.baukasten._1.baukasten.Vertretung <em>Vertretung</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vertretung</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Vertretung
	 * @generated
	 */
	EEnum getVertretung();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.baukasten._1.baukasten.Wohnsitz <em>Wohnsitz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wohnsitz</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Wohnsitz
	 * @generated
	 */
	EEnum getWohnsitz();

	/**
	 * Returns the meta object for enum '{@link de.xoev.xfamilie.baukasten._1.baukasten.Zuschuesse <em>Zuschuesse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Zuschuesse</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Zuschuesse
	 * @generated
	 */
	EEnum getZuschuesse();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.baukasten._1.baukasten.Anrede <em>Anrede Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Anrede Object</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Anrede
	 * @model instanceClass="de.xoev.xfamilie.baukasten._1.baukasten.Anrede"
	 *        extendedMetaData="name='anrede:Object' baseType='anrede'"
	 * @generated
	 */
	EDataType getAnredeObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.baukasten._1.baukasten.Artabruf <em>Artabruf Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Artabruf Object</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Artabruf
	 * @model instanceClass="de.xoev.xfamilie.baukasten._1.baukasten.Artabruf"
	 *        extendedMetaData="name='artabruf:Object' baseType='artabruf'"
	 * @generated
	 */
	EDataType getArtabrufObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.baukasten._1.baukasten.Artnachweis <em>Artnachweis Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Artnachweis Object</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Artnachweis
	 * @model instanceClass="de.xoev.xfamilie.baukasten._1.baukasten.Artnachweis"
	 *        extendedMetaData="name='artnachweis:Object' baseType='artnachweis'"
	 * @generated
	 */
	EDataType getArtnachweisObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.baukasten._1.baukasten.Aufenthaltsstatus <em>Aufenthaltsstatus Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Aufenthaltsstatus Object</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Aufenthaltsstatus
	 * @model instanceClass="de.xoev.xfamilie.baukasten._1.baukasten.Aufenthaltsstatus"
	 *        extendedMetaData="name='aufenthaltsstatus:Object' baseType='aufenthaltsstatus'"
	 * @generated
	 */
	EDataType getAufenthaltsstatusObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.baukasten._1.baukasten.Eigenschaft <em>Eigenschaft Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Eigenschaft Object</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Eigenschaft
	 * @model instanceClass="de.xoev.xfamilie.baukasten._1.baukasten.Eigenschaft"
	 *        extendedMetaData="name='eigenschaft:Object' baseType='eigenschaft'"
	 * @generated
	 */
	EDataType getEigenschaftObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.baukasten._1.baukasten.Einkommensarten <em>Einkommensarten Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Einkommensarten Object</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Einkommensarten
	 * @model instanceClass="de.xoev.xfamilie.baukasten._1.baukasten.Einkommensarten"
	 *        extendedMetaData="name='einkommensarten:Object' baseType='einkommensarten'"
	 * @generated
	 */
	EDataType getEinkommensartenObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.baukasten._1.baukasten.Familienstand <em>Familienstand Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Familienstand Object</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Familienstand
	 * @model instanceClass="de.xoev.xfamilie.baukasten._1.baukasten.Familienstand"
	 *        extendedMetaData="name='familienstand:Object' baseType='familienstand'"
	 * @generated
	 */
	EDataType getFamilienstandObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.baukasten._1.baukasten.Geschlecht <em>Geschlecht Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Geschlecht Object</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Geschlecht
	 * @model instanceClass="de.xoev.xfamilie.baukasten._1.baukasten.Geschlecht"
	 *        extendedMetaData="name='geschlecht:Object' baseType='geschlecht'"
	 * @generated
	 */
	EDataType getGeschlechtObject();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Jahr Monat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mit diesem Datentyp wird ein teilweise bekanntes Datum übermittelt. Vom Datum sind nur Jahr und Monat bekannt.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Jahr Monat Type</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='JahrMonatType' baseType='http://www.eclipse.org/emf/2003/XMLType#gYearMonth' pattern='[0-9]{4}-[0-9]{2}'"
	 * @generated
	 */
	EDataType getJahrMonatType();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Jahr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mit diesem Datentyp wird ein teilweise bekanntes Datum übermittelt. Vom Datum ist nur das Jahr bekannt.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Jahr Type</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='JahrType' baseType='http://www.eclipse.org/emf/2003/XMLType#gYear' pattern='[0-9]{4}'"
	 * @generated
	 */
	EDataType getJahrType();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.baukasten._1.baukasten.Kindschaftsbeziehung <em>Kindschaftsbeziehung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kindschaftsbeziehung Object</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Kindschaftsbeziehung
	 * @model instanceClass="de.xoev.xfamilie.baukasten._1.baukasten.Kindschaftsbeziehung"
	 *        extendedMetaData="name='kindschaftsbeziehung:Object' baseType='kindschaftsbeziehung'"
	 * @generated
	 */
	EDataType getKindschaftsbeziehungObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.baukasten._1.baukasten.Kindwohnhaftbei <em>Kindwohnhaftbei Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Kindwohnhaftbei Object</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Kindwohnhaftbei
	 * @model instanceClass="de.xoev.xfamilie.baukasten._1.baukasten.Kindwohnhaftbei"
	 *        extendedMetaData="name='kindwohnhaftbei:Object' baseType='kindwohnhaftbei'"
	 * @generated
	 */
	EDataType getKindwohnhaftbeiObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Krankenversichertennummer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mit diesem Datentyp wird die Krankenversicherungsnummer abgebildet.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Krankenversichertennummer Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='KrankenversichertennummerType' baseType='urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC'"
	 * @generated
	 */
	EDataType getKrankenversichertennummerType();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.baukasten._1.baukasten.Leistungserhalt <em>Leistungserhalt Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Leistungserhalt Object</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Leistungserhalt
	 * @model instanceClass="de.xoev.xfamilie.baukasten._1.baukasten.Leistungserhalt"
	 *        extendedMetaData="name='leistungserhalt:Object' baseType='leistungserhalt'"
	 * @generated
	 */
	EDataType getLeistungserhaltObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.baukasten._1.baukasten.Leistungsgewaehrung <em>Leistungsgewaehrung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Leistungsgewaehrung Object</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Leistungsgewaehrung
	 * @model instanceClass="de.xoev.xfamilie.baukasten._1.baukasten.Leistungsgewaehrung"
	 *        extendedMetaData="name='leistungsgewaehrung:Object' baseType='leistungsgewaehrung'"
	 * @generated
	 */
	EDataType getLeistungsgewaehrungObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Meldeanschrift Hausnummer Buchstabe Zusatzziffer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Dies ist der Typ für das Element 'buchstabeZusatzziffer' im Typ Meldeanschrift.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Meldeanschrift Hausnummer Buchstabe Zusatzziffer Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Meldeanschrift.HausnummerBuchstabeZusatzzifferType' baseType='urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC'"
	 * @generated
	 */
	EDataType getMeldeanschriftHausnummerBuchstabeZusatzzifferType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Meldeanschrift Hausnummer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Dies ist der Typ für das Element 'hausnummer' im Typ Meldeanschrift.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Meldeanschrift Hausnummer Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Meldeanschrift.HausnummerType' baseType='urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC'"
	 * @generated
	 */
	EDataType getMeldeanschriftHausnummerType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Meldeanschrift Postleitzahl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Dies ist der Typ für das Element 'postleitzahl' im Typ Meldeanschrift.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Meldeanschrift Postleitzahl Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Meldeanschrift.PostleitzahlType' baseType='urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC'"
	 * @generated
	 */
	EDataType getMeldeanschriftPostleitzahlType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Meldeanschrift Stockwerkswohnungsnummer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Dies ist der Typ für das Element stockwerkswohnungsnummer' im Typ Meldeanschrift.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Meldeanschrift Stockwerkswohnungsnummer Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Meldeanschrift.StockwerkswohnungsnummerType' baseType='urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC'"
	 * @generated
	 */
	EDataType getMeldeanschriftStockwerkswohnungsnummerType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Meldeanschrift Strasse Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Dies ist der Typ für das Element 'strasse' im Typ Meldeanschrift.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Meldeanschrift Strasse Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Meldeanschrift.StrasseType' baseType='urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC'"
	 * @generated
	 */
	EDataType getMeldeanschriftStrasseType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Meldeanschrift Teilnummer Der Hausnummer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Dies ist der Typ für das Element 'teilnummerDerHausnummer' im Typ Meldeanschrift.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Meldeanschrift Teilnummer Der Hausnummer Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Meldeanschrift.TeilnummerDerHausnummerType' baseType='urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC'"
	 * @generated
	 */
	EDataType getMeldeanschriftTeilnummerDerHausnummerType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Meldeanschrift Wohnort Frueherer Gemeindename Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Dies ist der Typ für das Element 'fruehererGemeindename' im Typ Meldeanschrift.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Meldeanschrift Wohnort Frueherer Gemeindename Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Meldeanschrift.WohnortFruehererGemeindenameType' baseType='urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC'"
	 * @generated
	 */
	EDataType getMeldeanschriftWohnortFruehererGemeindenameType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Meldeanschrift Wohnort Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Dies ist der Typ für das Element 'wohnort' im Typ Meldeanschrift.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Meldeanschrift Wohnort Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Meldeanschrift.WohnortType' baseType='urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC'"
	 * @generated
	 */
	EDataType getMeldeanschriftWohnortType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Meldeanschrift Wohnungsinhaber Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Meldeanschrift Wohnungsinhaber Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Meldeanschrift.WohnungsinhaberType' baseType='urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC'"
	 * @generated
	 */
	EDataType getMeldeanschriftWohnungsinhaberType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Meldeanschrift Zusatzangaben Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Dies ist der Typ für das Element 'zusatzangaben' im Typ Meldeanschrift.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Meldeanschrift Zusatzangaben Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Meldeanschrift.ZusatzangabenType' baseType='urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC'"
	 * @generated
	 */
	EDataType getMeldeanschriftZusatzangabenType();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.baukasten._1.baukasten.Nachrichtentyp <em>Nachrichtentyp Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Nachrichtentyp Object</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Nachrichtentyp
	 * @model instanceClass="de.xoev.xfamilie.baukasten._1.baukasten.Nachrichtentyp"
	 *        extendedMetaData="name='nachrichtentyp:Object' baseType='nachrichtentyp'"
	 * @generated
	 */
	EDataType getNachrichtentypObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.baukasten._1.baukasten.Nachweisbezug <em>Nachweisbezug Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Nachweisbezug Object</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Nachweisbezug
	 * @model instanceClass="de.xoev.xfamilie.baukasten._1.baukasten.Nachweisbezug"
	 *        extendedMetaData="name='nachweisbezug:Object' baseType='nachweisbezug'"
	 * @generated
	 */
	EDataType getNachweisbezugObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.baukasten._1.baukasten.Personensorgerecht <em>Personensorgerecht Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Personensorgerecht Object</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Personensorgerecht
	 * @model instanceClass="de.xoev.xfamilie.baukasten._1.baukasten.Personensorgerecht"
	 *        extendedMetaData="name='personensorgerecht:Object' baseType='personensorgerecht'"
	 * @generated
	 */
	EDataType getPersonensorgerechtObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.baukasten._1.baukasten.Sonderstatus <em>Sonderstatus Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sonderstatus Object</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Sonderstatus
	 * @model instanceClass="de.xoev.xfamilie.baukasten._1.baukasten.Sonderstatus"
	 *        extendedMetaData="name='sonderstatus:Object' baseType='sonderstatus'"
	 * @generated
	 */
	EDataType getSonderstatusObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.baukasten._1.baukasten.Sonstigeleistungen <em>Sonstigeleistungen Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sonstigeleistungen Object</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Sonstigeleistungen
	 * @model instanceClass="de.xoev.xfamilie.baukasten._1.baukasten.Sonstigeleistungen"
	 *        extendedMetaData="name='sonstigeleistungen:Object' baseType='sonstigeleistungen'"
	 * @generated
	 */
	EDataType getSonstigeleistungenObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.baukasten._1.baukasten.Statusdatenabruf <em>Statusdatenabruf Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Statusdatenabruf Object</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Statusdatenabruf
	 * @model instanceClass="de.xoev.xfamilie.baukasten._1.baukasten.Statusdatenabruf"
	 *        extendedMetaData="name='statusdatenabruf:Object' baseType='statusdatenabruf'"
	 * @generated
	 */
	EDataType getStatusdatenabrufObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Steuerliche Identifikationsnummer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mit diesem Datentyp wird die steuerliche Identifikationsnummer abgebildet.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Steuerliche Identifikationsnummer Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='SteuerlicheIdentifikationsnummerType' baseType='urn:xoev-de:kosit:xoev:datentyp:din-91379_2022-08#datatypeC'"
	 * @generated
	 */
	EDataType getSteuerlicheIdentifikationsnummerType();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Tagesdatum Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mit diesem Datentyp wird ein vollständig bekanntes Datum übermittelt. Anders als in xs:date ist hier die Angabe einer Zeitzone jedoch nicht möglich.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Tagesdatum Type</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='TagesdatumType' baseType='http://www.eclipse.org/emf/2003/XMLType#date' pattern='[0-9]{4}-[0-9]{2}-[0-9]{2}'"
	 * @generated
	 */
	EDataType getTagesdatumType();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.baukasten._1.baukasten.Tatsachenbehauptung <em>Tatsachenbehauptung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tatsachenbehauptung Object</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Tatsachenbehauptung
	 * @model instanceClass="de.xoev.xfamilie.baukasten._1.baukasten.Tatsachenbehauptung"
	 *        extendedMetaData="name='tatsachenbehauptung:Object' baseType='tatsachenbehauptung'"
	 * @generated
	 */
	EDataType getTatsachenbehauptungObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>UUID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Dies ist der Typ für die Übemittlung eines Universally Unique Identifiers (UUID) gemäß RFC 4122. In dem Typ sind die formalen Vorgaben zum Aufbau eines UUID über ein Pattern auf Schemaeben berücksichtigt. Die Verwendung des Prafix urn:uuid: ist nicht zuläassig.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>UUID Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='UUIDType' baseType='http://www.eclipse.org/emf/2003/XMLType#normalizedString'"
	 * @generated
	 */
	EDataType getUUIDType();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.baukasten._1.baukasten.Vertrauensniveau <em>Vertrauensniveau Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vertrauensniveau Object</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Vertrauensniveau
	 * @model instanceClass="de.xoev.xfamilie.baukasten._1.baukasten.Vertrauensniveau"
	 *        extendedMetaData="name='vertrauensniveau:Object' baseType='vertrauensniveau'"
	 * @generated
	 */
	EDataType getVertrauensniveauObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.baukasten._1.baukasten.Vertretung <em>Vertretung Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vertretung Object</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Vertretung
	 * @model instanceClass="de.xoev.xfamilie.baukasten._1.baukasten.Vertretung"
	 *        extendedMetaData="name='vertretung:Object' baseType='vertretung'"
	 * @generated
	 */
	EDataType getVertretungObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.baukasten._1.baukasten.Wohnsitz <em>Wohnsitz Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Wohnsitz Object</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Wohnsitz
	 * @model instanceClass="de.xoev.xfamilie.baukasten._1.baukasten.Wohnsitz"
	 *        extendedMetaData="name='wohnsitz:Object' baseType='wohnsitz'"
	 * @generated
	 */
	EDataType getWohnsitzObject();

	/**
	 * Returns the meta object for data type '{@link de.xoev.xfamilie.baukasten._1.baukasten.Zuschuesse <em>Zuschuesse Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Zuschuesse Object</em>'.
	 * @see de.xoev.xfamilie.baukasten._1.baukasten.Zuschuesse
	 * @model instanceClass="de.xoev.xfamilie.baukasten._1.baukasten.Zuschuesse"
	 *        extendedMetaData="name='zuschuesse:Object' baseType='zuschuesse'"
	 * @generated
	 */
	EDataType getZuschuesseObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BaukastenFactory getBaukastenFactory();

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
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.AllgemeinerNameTypeImpl <em>Allgemeiner Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.AllgemeinerNameTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getAllgemeinerNameType()
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
		 * The meta object literal for the '<em><b>Nicht Vorhanden</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLGEMEINER_NAME_TYPE__NICHT_VORHANDEN = eINSTANCE.getAllgemeinerNameType_NichtVorhanden();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.AntragsnachrichtTypeImpl <em>Antragsnachricht Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.AntragsnachrichtTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getAntragsnachrichtType()
		 * @generated
		 */
		EClass ANTRAGSNACHRICHT_TYPE = eINSTANCE.getAntragsnachrichtType();

		/**
		 * The meta object literal for the '<em><b>Zeitstempel Antragsstellung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTRAGSNACHRICHT_TYPE__ZEITSTEMPEL_ANTRAGSSTELLUNG = eINSTANCE.getAntragsnachrichtType_ZeitstempelAntragsstellung();

		/**
		 * The meta object literal for the '<em><b>Transaktionsid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANTRAGSNACHRICHT_TYPE__TRANSAKTIONSID = eINSTANCE.getAntragsnachrichtType_Transaktionsid();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.AufenthaltstitelNachweisbezugTypeImpl <em>Aufenthaltstitel Nachweisbezug Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.AufenthaltstitelNachweisbezugTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getAufenthaltstitelNachweisbezugType()
		 * @generated
		 */
		EClass AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE = eINSTANCE.getAufenthaltstitelNachweisbezugType();

		/**
		 * The meta object literal for the '<em><b>Dokumenttyp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__DOKUMENTTYP = eINSTANCE.getAufenthaltstitelNachweisbezugType_Dokumenttyp();

		/**
		 * The meta object literal for the '<em><b>Nebenbestimmungen</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__NEBENBESTIMMUNGEN = eINSTANCE.getAufenthaltstitelNachweisbezugType_Nebenbestimmungen();

		/**
		 * The meta object literal for the '<em><b>Ablaufdatum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__ABLAUFDATUM = eINSTANCE.getAufenthaltstitelNachweisbezugType_Ablaufdatum();

		/**
		 * The meta object literal for the '<em><b>Nachweisbezug</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUFENTHALTSTITEL_NACHWEISBEZUG_TYPE__NACHWEISBEZUG = eINSTANCE.getAufenthaltstitelNachweisbezugType_Nachweisbezug();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.AuslandsanschriftTypeImpl <em>Auslandsanschrift Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.AuslandsanschriftTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getAuslandsanschriftType()
		 * @generated
		 */
		EClass AUSLANDSANSCHRIFT_TYPE = eINSTANCE.getAuslandsanschriftType();

		/**
		 * The meta object literal for the '<em><b>Staat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUSLANDSANSCHRIFT_TYPE__STAAT = eINSTANCE.getAuslandsanschriftType_Staat();

		/**
		 * The meta object literal for the '<em><b>Anschriftszeile</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUSLANDSANSCHRIFT_TYPE__ANSCHRIFTSZEILE = eINSTANCE.getAuslandsanschriftType_Anschriftszeile();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.BankverbindungIBANOptionalTypeImpl <em>Bankverbindung IBAN Optional Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BankverbindungIBANOptionalTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getBankverbindungIBANOptionalType()
		 * @generated
		 */
		EClass BANKVERBINDUNG_IBAN_OPTIONAL_TYPE = eINSTANCE.getBankverbindungIBANOptionalType();

		/**
		 * The meta object literal for the '<em><b>Inhaber</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANKVERBINDUNG_IBAN_OPTIONAL_TYPE__INHABER = eINSTANCE.getBankverbindungIBANOptionalType_Inhaber();

		/**
		 * The meta object literal for the '<em><b>Iban</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANKVERBINDUNG_IBAN_OPTIONAL_TYPE__IBAN = eINSTANCE.getBankverbindungIBANOptionalType_Iban();

		/**
		 * The meta object literal for the '<em><b>Bic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANKVERBINDUNG_IBAN_OPTIONAL_TYPE__BIC = eINSTANCE.getBankverbindungIBANOptionalType_Bic();

		/**
		 * The meta object literal for the '<em><b>Institut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANKVERBINDUNG_IBAN_OPTIONAL_TYPE__INSTITUT = eINSTANCE.getBankverbindungIBANOptionalType_Institut();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.BankverbindungInhaberOptionalTypeImpl <em>Bankverbindung Inhaber Optional Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BankverbindungInhaberOptionalTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getBankverbindungInhaberOptionalType()
		 * @generated
		 */
		EClass BANKVERBINDUNG_INHABER_OPTIONAL_TYPE = eINSTANCE.getBankverbindungInhaberOptionalType();

		/**
		 * The meta object literal for the '<em><b>Inhaber</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__INHABER = eINSTANCE.getBankverbindungInhaberOptionalType_Inhaber();

		/**
		 * The meta object literal for the '<em><b>Iban</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__IBAN = eINSTANCE.getBankverbindungInhaberOptionalType_Iban();

		/**
		 * The meta object literal for the '<em><b>Bic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__BIC = eINSTANCE.getBankverbindungInhaberOptionalType_Bic();

		/**
		 * The meta object literal for the '<em><b>Institut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANKVERBINDUNG_INHABER_OPTIONAL_TYPE__INSTITUT = eINSTANCE.getBankverbindungInhaberOptionalType_Institut();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.BankverbindungTypeImpl <em>Bankverbindung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BankverbindungTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getBankverbindungType()
		 * @generated
		 */
		EClass BANKVERBINDUNG_TYPE = eINSTANCE.getBankverbindungType();

		/**
		 * The meta object literal for the '<em><b>Inhaber</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANKVERBINDUNG_TYPE__INHABER = eINSTANCE.getBankverbindungType_Inhaber();

		/**
		 * The meta object literal for the '<em><b>Iban</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANKVERBINDUNG_TYPE__IBAN = eINSTANCE.getBankverbindungType_Iban();

		/**
		 * The meta object literal for the '<em><b>Bic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANKVERBINDUNG_TYPE__BIC = eINSTANCE.getBankverbindungType_Bic();

		/**
		 * The meta object literal for the '<em><b>Institut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANKVERBINDUNG_TYPE__INSTITUT = eINSTANCE.getBankverbindungType_Institut();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.BehoerdenkennungTypeImpl <em>Behoerdenkennung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BehoerdenkennungTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getBehoerdenkennungType()
		 * @generated
		 */
		EClass BEHOERDENKENNUNG_TYPE = eINSTANCE.getBehoerdenkennungType();

		/**
		 * The meta object literal for the '<em><b>Praefix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHOERDENKENNUNG_TYPE__PRAEFIX = eINSTANCE.getBehoerdenkennungType_Praefix();

		/**
		 * The meta object literal for the '<em><b>Kennung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHOERDENKENNUNG_TYPE__KENNUNG = eINSTANCE.getBehoerdenkennungType_Kennung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeAnredeTypeImpl <em>Code Anrede Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeAnredeTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeAnredeType()
		 * @generated
		 */
		EClass CODE_ANREDE_TYPE = eINSTANCE.getCodeAnredeType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeArtAbrufTypeImpl <em>Code Art Abruf Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeArtAbrufTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeArtAbrufType()
		 * @generated
		 */
		EClass CODE_ART_ABRUF_TYPE = eINSTANCE.getCodeArtAbrufType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeAufenthaltsstatusTypeImpl <em>Code Aufenthaltsstatus Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeAufenthaltsstatusTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeAufenthaltsstatusType()
		 * @generated
		 */
		EClass CODE_AUFENTHALTSSTATUS_TYPE = eINSTANCE.getCodeAufenthaltsstatusType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeBundeslandTypeImpl <em>Code Bundesland Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeBundeslandTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeBundeslandType()
		 * @generated
		 */
		EClass CODE_BUNDESLAND_TYPE = eINSTANCE.getCodeBundeslandType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeEigenschaftTypeImpl <em>Code Eigenschaft Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeEigenschaftTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeEigenschaftType()
		 * @generated
		 */
		EClass CODE_EIGENSCHAFT_TYPE = eINSTANCE.getCodeEigenschaftType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeEinkommensartenTypeImpl <em>Code Einkommensarten Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeEinkommensartenTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeEinkommensartenType()
		 * @generated
		 */
		EClass CODE_EINKOMMENSARTEN_TYPE = eINSTANCE.getCodeEinkommensartenType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeErreichbarkeitTypeImpl <em>Code Erreichbarkeit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeErreichbarkeitTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeErreichbarkeitType()
		 * @generated
		 */
		EClass CODE_ERREICHBARKEIT_TYPE = eINSTANCE.getCodeErreichbarkeitType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeFamilienstandTypeImpl <em>Code Familienstand Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeFamilienstandTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeFamilienstandType()
		 * @generated
		 */
		EClass CODE_FAMILIENSTAND_TYPE = eINSTANCE.getCodeFamilienstandType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeGemeindeVZAmtlicherGemeindeschluesselTypeImpl <em>Code Gemeinde VZ Amtlicher Gemeindeschluessel Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeGemeindeVZAmtlicherGemeindeschluesselTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeGemeindeVZAmtlicherGemeindeschluesselType()
		 * @generated
		 */
		EClass CODE_GEMEINDE_VZ_AMTLICHER_GEMEINDESCHLUESSEL_TYPE = eINSTANCE.getCodeGemeindeVZAmtlicherGemeindeschluesselType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeGemeindeVZRegionalschluesselTypeImpl <em>Code Gemeinde VZ Regionalschluessel Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeGemeindeVZRegionalschluesselTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeGemeindeVZRegionalschluesselType()
		 * @generated
		 */
		EClass CODE_GEMEINDE_VZ_REGIONALSCHLUESSEL_TYPE = eINSTANCE.getCodeGemeindeVZRegionalschluesselType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeGeschlechtTypeImpl <em>Code Geschlecht Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeGeschlechtTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeGeschlechtType()
		 * @generated
		 */
		EClass CODE_GESCHLECHT_TYPE = eINSTANCE.getCodeGeschlechtType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeKindschaftsbeziehungTypeImpl <em>Code Kindschaftsbeziehung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeKindschaftsbeziehungTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeKindschaftsbeziehungType()
		 * @generated
		 */
		EClass CODE_KINDSCHAFTSBEZIEHUNG_TYPE = eINSTANCE.getCodeKindschaftsbeziehungType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeKindWohnhaftBeiTypeImpl <em>Code Kind Wohnhaft Bei Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeKindWohnhaftBeiTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeKindWohnhaftBeiType()
		 * @generated
		 */
		EClass CODE_KIND_WOHNHAFT_BEI_TYPE = eINSTANCE.getCodeKindWohnhaftBeiType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeLeistungserhaltTypeImpl <em>Code Leistungserhalt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeLeistungserhaltTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeLeistungserhaltType()
		 * @generated
		 */
		EClass CODE_LEISTUNGSERHALT_TYPE = eINSTANCE.getCodeLeistungserhaltType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeLeistungsgewaehrungTypeImpl <em>Code Leistungsgewaehrung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeLeistungsgewaehrungTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeLeistungsgewaehrungType()
		 * @generated
		 */
		EClass CODE_LEISTUNGSGEWAEHRUNG_TYPE = eINSTANCE.getCodeLeistungsgewaehrungType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeNachrichtentypTypeImpl <em>Code Nachrichtentyp Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeNachrichtentypTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeNachrichtentypType()
		 * @generated
		 */
		EClass CODE_NACHRICHTENTYP_TYPE = eINSTANCE.getCodeNachrichtentypType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeNachweisbezugTypeImpl <em>Code Nachweisbezug Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeNachweisbezugTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeNachweisbezugType()
		 * @generated
		 */
		EClass CODE_NACHWEISBEZUG_TYPE = eINSTANCE.getCodeNachweisbezugType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodePersonensorgerechtTypeImpl <em>Code Personensorgerecht Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodePersonensorgerechtTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodePersonensorgerechtType()
		 * @generated
		 */
		EClass CODE_PERSONENSORGERECHT_TYPE = eINSTANCE.getCodePersonensorgerechtType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodePraefixTypeImpl <em>Code Praefix Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodePraefixTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodePraefixType()
		 * @generated
		 */
		EClass CODE_PRAEFIX_TYPE = eINSTANCE.getCodePraefixType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeSonderstatusTypeImpl <em>Code Sonderstatus Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeSonderstatusTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeSonderstatusType()
		 * @generated
		 */
		EClass CODE_SONDERSTATUS_TYPE = eINSTANCE.getCodeSonderstatusType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeSonstigeLeistungenTypeImpl <em>Code Sonstige Leistungen Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeSonstigeLeistungenTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeSonstigeLeistungenType()
		 * @generated
		 */
		EClass CODE_SONSTIGE_LEISTUNGEN_TYPE = eINSTANCE.getCodeSonstigeLeistungenType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeStaatsangehoerigkeitTypeImpl <em>Code Staatsangehoerigkeit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeStaatsangehoerigkeitTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeStaatsangehoerigkeitType()
		 * @generated
		 */
		EClass CODE_STAATSANGEHOERIGKEIT_TYPE = eINSTANCE.getCodeStaatsangehoerigkeitType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeStaatTypeImpl <em>Code Staat Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeStaatTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeStaatType()
		 * @generated
		 */
		EClass CODE_STAAT_TYPE = eINSTANCE.getCodeStaatType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeStandesamtnummernTypeImpl <em>Code Standesamtnummern Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeStandesamtnummernTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeStandesamtnummernType()
		 * @generated
		 */
		EClass CODE_STANDESAMTNUMMERN_TYPE = eINSTANCE.getCodeStandesamtnummernType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeStatusDatenabrufTypeImpl <em>Code Status Datenabruf Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeStatusDatenabrufTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeStatusDatenabrufType()
		 * @generated
		 */
		EClass CODE_STATUS_DATENABRUF_TYPE = eINSTANCE.getCodeStatusDatenabrufType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeTatsachenbehauptungTypeImpl <em>Code Tatsachenbehauptung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeTatsachenbehauptungTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeTatsachenbehauptungType()
		 * @generated
		 */
		EClass CODE_TATSACHENBEHAUPTUNG_TYPE = eINSTANCE.getCodeTatsachenbehauptungType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeVermoegensartTypeImpl <em>Code Vermoegensart Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeVermoegensartTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeVermoegensartType()
		 * @generated
		 */
		EClass CODE_VERMOEGENSART_TYPE = eINSTANCE.getCodeVermoegensartType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeVertrauensniveauTypeImpl <em>Code Vertrauensniveau Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeVertrauensniveauTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeVertrauensniveauType()
		 * @generated
		 */
		EClass CODE_VERTRAUENSNIVEAU_TYPE = eINSTANCE.getCodeVertrauensniveauType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeVertretungTypeImpl <em>Code Vertretung Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeVertretungTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeVertretungType()
		 * @generated
		 */
		EClass CODE_VERTRETUNG_TYPE = eINSTANCE.getCodeVertretungType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeWohnsitzTypeImpl <em>Code Wohnsitz Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeWohnsitzTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeWohnsitzType()
		 * @generated
		 */
		EClass CODE_WOHNSITZ_TYPE = eINSTANCE.getCodeWohnsitzType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeZuschuesseTypeImpl <em>Code Zuschuesse Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.CodeZuschuesseTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getCodeZuschuesseType()
		 * @generated
		 */
		EClass CODE_ZUSCHUESSE_TYPE = eINSTANCE.getCodeZuschuesseType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.DatenabrufTypeImpl <em>Datenabruf Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.DatenabrufTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getDatenabrufType()
		 * @generated
		 */
		EClass DATENABRUF_TYPE = eINSTANCE.getDatenabrufType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATENABRUF_TYPE__ID = eINSTANCE.getDatenabrufType_Id();

		/**
		 * The meta object literal for the '<em><b>Zeitstempel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATENABRUF_TYPE__ZEITSTEMPEL = eINSTANCE.getDatenabrufType_Zeitstempel();

		/**
		 * The meta object literal for the '<em><b>Quelle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATENABRUF_TYPE__QUELLE = eINSTANCE.getDatenabrufType_Quelle();

		/**
		 * The meta object literal for the '<em><b>Art Des Abrufs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATENABRUF_TYPE__ART_DES_ABRUFS = eINSTANCE.getDatenabrufType_ArtDesAbrufs();

		/**
		 * The meta object literal for the '<em><b>Abgerufen Fuer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATENABRUF_TYPE__ABGERUFEN_FUER = eINSTANCE.getDatenabrufType_AbgerufenFuer();

		/**
		 * The meta object literal for the '<em><b>Status Datenabruf</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATENABRUF_TYPE__STATUS_DATENABRUF = eINSTANCE.getDatenabrufType_StatusDatenabruf();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.DatenschutzerklaerungenTypeImpl <em>Datenschutzerklaerungen Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.DatenschutzerklaerungenTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getDatenschutzerklaerungenType()
		 * @generated
		 */
		EClass DATENSCHUTZERKLAERUNGEN_TYPE = eINSTANCE.getDatenschutzerklaerungenType();

		/**
		 * The meta object literal for the '<em><b>Dsgvo Betreiber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATENSCHUTZERKLAERUNGEN_TYPE__DSGVO_BETREIBER = eINSTANCE.getDatenschutzerklaerungenType_DsgvoBetreiber();

		/**
		 * The meta object literal for the '<em><b>Dsgvo Nachnutzer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATENSCHUTZERKLAERUNGEN_TYPE__DSGVO_NACHNUTZER = eINSTANCE.getDatenschutzerklaerungenType_DsgvoNachnutzer();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.EntgeltdatenArbeitgeberDsrvTypeImpl <em>Entgeltdaten Arbeitgeber Dsrv Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.EntgeltdatenArbeitgeberDsrvTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getEntgeltdatenArbeitgeberDsrvType()
		 * @generated
		 */
		EClass ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE = eINSTANCE.getEntgeltdatenArbeitgeberDsrvType();

		/**
		 * The meta object literal for the '<em><b>Abfrage ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__ABFRAGE_ID = eINSTANCE.getEntgeltdatenArbeitgeberDsrvType_AbfrageID();

		/**
		 * The meta object literal for the '<em><b>Ifd Nr Arbeitgeber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__IFD_NR_ARBEITGEBER = eINSTANCE.getEntgeltdatenArbeitgeberDsrvType_IfdNrArbeitgeber();

		/**
		 * The meta object literal for the '<em><b>Abrufergebnis Drv</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTGELTDATEN_ARBEITGEBER_DSRV_TYPE__ABRUFERGEBNIS_DRV = eINSTANCE.getEntgeltdatenArbeitgeberDsrvType_AbrufergebnisDrv();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.EntgeltdatenDsrvNachweisbezugTypeImpl <em>Entgeltdaten Dsrv Nachweisbezug Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.EntgeltdatenDsrvNachweisbezugTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getEntgeltdatenDsrvNachweisbezugType()
		 * @generated
		 */
		EClass ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE = eINSTANCE.getEntgeltdatenDsrvNachweisbezugType();

		/**
		 * The meta object literal for the '<em><b>Nachweisbezug</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__NACHWEISBEZUG = eINSTANCE.getEntgeltdatenDsrvNachweisbezugType_Nachweisbezug();

		/**
		 * The meta object literal for the '<em><b>Zeitraum Von</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ZEITRAUM_VON = eINSTANCE.getEntgeltdatenDsrvNachweisbezugType_ZeitraumVon();

		/**
		 * The meta object literal for the '<em><b>Zeitraum Bis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ZEITRAUM_BIS = eINSTANCE.getEntgeltdatenDsrvNachweisbezugType_ZeitraumBis();

		/**
		 * The meta object literal for the '<em><b>Entgeltdaten Arbeitgeber</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTGELTDATEN_DSRV_NACHWEISBEZUG_TYPE__ENTGELTDATEN_ARBEITGEBER = eINSTANCE.getEntgeltdatenDsrvNachweisbezugType_EntgeltdatenArbeitgeber();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.ErreichbarkeitTypeImpl <em>Erreichbarkeit Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.ErreichbarkeitTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getErreichbarkeitType()
		 * @generated
		 */
		EClass ERREICHBARKEIT_TYPE = eINSTANCE.getErreichbarkeitType();

		/**
		 * The meta object literal for the '<em><b>Kanal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERREICHBARKEIT_TYPE__KANAL = eINSTANCE.getErreichbarkeitType_Kanal();

		/**
		 * The meta object literal for the '<em><b>Kennung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERREICHBARKEIT_TYPE__KENNUNG = eINSTANCE.getErreichbarkeitType_Kennung();

		/**
		 * The meta object literal for the '<em><b>Zusatz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERREICHBARKEIT_TYPE__ZUSATZ = eINSTANCE.getErreichbarkeitType_Zusatz();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.FamiliennameUnstrukturiertTypeImpl <em>Familienname Unstrukturiert Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.FamiliennameUnstrukturiertTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getFamiliennameUnstrukturiertType()
		 * @generated
		 */
		EClass FAMILIENNAME_UNSTRUKTURIERT_TYPE = eINSTANCE.getFamiliennameUnstrukturiertType();

		/**
		 * The meta object literal for the '<em><b>Nachname</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAME = eINSTANCE.getFamiliennameUnstrukturiertType_Nachname();

		/**
		 * The meta object literal for the '<em><b>Nachnamepass</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILIENNAME_UNSTRUKTURIERT_TYPE__NACHNAMEPASS = eINSTANCE.getFamiliennameUnstrukturiertType_Nachnamepass();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.FamilienstandNachweisbezugTypeImpl <em>Familienstand Nachweisbezug Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.FamilienstandNachweisbezugTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getFamilienstandNachweisbezugType()
		 * @generated
		 */
		EClass FAMILIENSTAND_NACHWEISBEZUG_TYPE = eINSTANCE.getFamilienstandNachweisbezugType();

		/**
		 * The meta object literal for the '<em><b>Nachweisbezug</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILIENSTAND_NACHWEISBEZUG_TYPE__NACHWEISBEZUG = eINSTANCE.getFamilienstandNachweisbezugType_Nachweisbezug();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.FamilienstandTypeImpl <em>Familienstand Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.FamilienstandTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getFamilienstandType()
		 * @generated
		 */
		EClass FAMILIENSTAND_TYPE = eINSTANCE.getFamilienstandType();

		/**
		 * The meta object literal for the '<em><b>Seit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAMILIENSTAND_TYPE__SEIT = eINSTANCE.getFamilienstandType_Seit();

		/**
		 * The meta object literal for the '<em><b>Familienstand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAMILIENSTAND_TYPE__FAMILIENSTAND = eINSTANCE.getFamilienstandType_Familienstand();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.FeldgruppeTypeImpl <em>Feldgruppe Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.FeldgruppeTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getFeldgruppeType()
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
		 * The meta object literal for the '<em><b>Feld</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FELDGRUPPE_TYPE__FELD = eINSTANCE.getFeldgruppeType_Feld();

		/**
		 * The meta object literal for the '<em><b>Feldgruppe</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FELDGRUPPE_TYPE__FELDGRUPPE = eINSTANCE.getFeldgruppeType_Feldgruppe();

		/**
		 * The meta object literal for the '<em><b>Laufende Nummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FELDGRUPPE_TYPE__LAUFENDE_NUMMER = eINSTANCE.getFeldgruppeType_LaufendeNummer();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.FeldTypeImpl <em>Feld Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.FeldTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getFeldType()
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
		 * The meta object literal for the '<em><b>Wert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FELD_TYPE__WERT = eINSTANCE.getFeldType_Wert();

		/**
		 * The meta object literal for the '<em><b>Laufende Nummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FELD_TYPE__LAUFENDE_NUMMER = eINSTANCE.getFeldType_LaufendeNummer();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.GeburtGeburtsortOptionalTypeImpl <em>Geburt Geburtsort Optional Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.GeburtGeburtsortOptionalTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getGeburtGeburtsortOptionalType()
		 * @generated
		 */
		EClass GEBURT_GEBURTSORT_OPTIONAL_TYPE = eINSTANCE.getGeburtGeburtsortOptionalType();

		/**
		 * The meta object literal for the '<em><b>Geburtsort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEBURT_GEBURTSORT_OPTIONAL_TYPE__GEBURTSORT = eINSTANCE.getGeburtGeburtsortOptionalType_Geburtsort();

		/**
		 * The meta object literal for the '<em><b>Geburtsort Staat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEBURT_GEBURTSORT_OPTIONAL_TYPE__GEBURTSORT_STAAT = eINSTANCE.getGeburtGeburtsortOptionalType_GeburtsortStaat();

		/**
		 * The meta object literal for the '<em><b>Geburtsdatum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEBURT_GEBURTSORT_OPTIONAL_TYPE__GEBURTSDATUM = eINSTANCE.getGeburtGeburtsortOptionalType_Geburtsdatum();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.GeburtNachweisbezugTypeImpl <em>Geburt Nachweisbezug Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.GeburtNachweisbezugTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getGeburtNachweisbezugType()
		 * @generated
		 */
		EClass GEBURT_NACHWEISBEZUG_TYPE = eINSTANCE.getGeburtNachweisbezugType();

		/**
		 * The meta object literal for the '<em><b>Nachweisbezug</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEBURT_NACHWEISBEZUG_TYPE__NACHWEISBEZUG = eINSTANCE.getGeburtNachweisbezugType_Nachweisbezug();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.GeburtOptionalTypeImpl <em>Geburt Optional Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.GeburtOptionalTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getGeburtOptionalType()
		 * @generated
		 */
		EClass GEBURT_OPTIONAL_TYPE = eINSTANCE.getGeburtOptionalType();

		/**
		 * The meta object literal for the '<em><b>Geburtsort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEBURT_OPTIONAL_TYPE__GEBURTSORT = eINSTANCE.getGeburtOptionalType_Geburtsort();

		/**
		 * The meta object literal for the '<em><b>Geburtsort Staat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEBURT_OPTIONAL_TYPE__GEBURTSORT_STAAT = eINSTANCE.getGeburtOptionalType_GeburtsortStaat();

		/**
		 * The meta object literal for the '<em><b>Geburtsdatum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEBURT_OPTIONAL_TYPE__GEBURTSDATUM = eINSTANCE.getGeburtOptionalType_Geburtsdatum();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.GeburtTypeImpl <em>Geburt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.GeburtTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getGeburtType()
		 * @generated
		 */
		EClass GEBURT_TYPE = eINSTANCE.getGeburtType();

		/**
		 * The meta object literal for the '<em><b>Geburtsort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEBURT_TYPE__GEBURTSORT = eINSTANCE.getGeburtType_Geburtsort();

		/**
		 * The meta object literal for the '<em><b>Geburtsort Staat</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEBURT_TYPE__GEBURTSORT_STAAT = eINSTANCE.getGeburtType_GeburtsortStaat();

		/**
		 * The meta object literal for the '<em><b>Geburtsdatum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEBURT_TYPE__GEBURTSDATUM = eINSTANCE.getGeburtType_Geburtsdatum();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.HausnummernBisTypeImpl <em>Hausnummern Bis Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.HausnummernBisTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getHausnummernBisType()
		 * @generated
		 */
		EClass HAUSNUMMERN_BIS_TYPE = eINSTANCE.getHausnummernBisType();

		/**
		 * The meta object literal for the '<em><b>Hausnummer Bis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAUSNUMMERN_BIS_TYPE__HAUSNUMMER_BIS = eINSTANCE.getHausnummernBisType_HausnummerBis();

		/**
		 * The meta object literal for the '<em><b>Hausnummerbuchstabezusatzziffer Bis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAUSNUMMERN_BIS_TYPE__HAUSNUMMERBUCHSTABEZUSATZZIFFER_BIS = eINSTANCE.getHausnummernBisType_HausnummerbuchstabezusatzzifferBis();

		/**
		 * The meta object literal for the '<em><b>Teilnummerderhausnummer Bis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAUSNUMMERN_BIS_TYPE__TEILNUMMERDERHAUSNUMMER_BIS = eINSTANCE.getHausnummernBisType_TeilnummerderhausnummerBis();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.IdentifikationNachrichtTypeImpl <em>Identifikation Nachricht Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.IdentifikationNachrichtTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getIdentifikationNachrichtType()
		 * @generated
		 */
		EClass IDENTIFIKATION_NACHRICHT_TYPE = eINSTANCE.getIdentifikationNachrichtType();

		/**
		 * The meta object literal for the '<em><b>Nachrichten UUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTEN_UUID = eINSTANCE.getIdentifikationNachrichtType_NachrichtenUUID();

		/**
		 * The meta object literal for the '<em><b>Nachrichtentyp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIKATION_NACHRICHT_TYPE__NACHRICHTENTYP = eINSTANCE.getIdentifikationNachrichtType_Nachrichtentyp();

		/**
		 * The meta object literal for the '<em><b>Erstellungszeitpunkt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIKATION_NACHRICHT_TYPE__ERSTELLUNGSZEITPUNKT = eINSTANCE.getIdentifikationNachrichtType_Erstellungszeitpunkt();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.KommunikationspartnerErreichbarTypeImpl <em>Kommunikationspartner Erreichbar Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.KommunikationspartnerErreichbarTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getKommunikationspartnerErreichbarType()
		 * @generated
		 */
		EClass KOMMUNIKATIONSPARTNER_ERREICHBAR_TYPE = eINSTANCE.getKommunikationspartnerErreichbarType();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.KommunikationspartnerTypeImpl <em>Kommunikationspartner Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.KommunikationspartnerTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getKommunikationspartnerType()
		 * @generated
		 */
		EClass KOMMUNIKATIONSPARTNER_TYPE = eINSTANCE.getKommunikationspartnerType();

		/**
		 * The meta object literal for the '<em><b>Behoerdenkennung</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KOMMUNIKATIONSPARTNER_TYPE__BEHOERDENKENNUNG = eINSTANCE.getKommunikationspartnerType_Behoerdenkennung();

		/**
		 * The meta object literal for the '<em><b>Erreichbarkeit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KOMMUNIKATIONSPARTNER_TYPE__ERREICHBARKEIT = eINSTANCE.getKommunikationspartnerType_Erreichbarkeit();

		/**
		 * The meta object literal for the '<em><b>Anschrift</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KOMMUNIKATIONSPARTNER_TYPE__ANSCHRIFT = eINSTANCE.getKommunikationspartnerType_Anschrift();

		/**
		 * The meta object literal for the '<em><b>Behoerdenname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KOMMUNIKATIONSPARTNER_TYPE__BEHOERDENNAME = eINSTANCE.getKommunikationspartnerType_Behoerdenname();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.MeldeanschriftTypeImpl <em>Meldeanschrift Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.MeldeanschriftTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getMeldeanschriftType()
		 * @generated
		 */
		EClass MELDEANSCHRIFT_TYPE = eINSTANCE.getMeldeanschriftType();

		/**
		 * The meta object literal for the '<em><b>Gemeindeschluessel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MELDEANSCHRIFT_TYPE__GEMEINDESCHLUESSEL = eINSTANCE.getMeldeanschriftType_Gemeindeschluessel();

		/**
		 * The meta object literal for the '<em><b>Hausnummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MELDEANSCHRIFT_TYPE__HAUSNUMMER = eINSTANCE.getMeldeanschriftType_Hausnummer();

		/**
		 * The meta object literal for the '<em><b>Hausnummer Buchstabe Zusatzziffer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MELDEANSCHRIFT_TYPE__HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER = eINSTANCE.getMeldeanschriftType_HausnummerBuchstabeZusatzziffer();

		/**
		 * The meta object literal for the '<em><b>Postleitzahl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MELDEANSCHRIFT_TYPE__POSTLEITZAHL = eINSTANCE.getMeldeanschriftType_Postleitzahl();

		/**
		 * The meta object literal for the '<em><b>Stockwerkswohnungsnummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MELDEANSCHRIFT_TYPE__STOCKWERKSWOHNUNGSNUMMER = eINSTANCE.getMeldeanschriftType_Stockwerkswohnungsnummer();

		/**
		 * The meta object literal for the '<em><b>Strasse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MELDEANSCHRIFT_TYPE__STRASSE = eINSTANCE.getMeldeanschriftType_Strasse();

		/**
		 * The meta object literal for the '<em><b>Teilnummer Der Hausnummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MELDEANSCHRIFT_TYPE__TEILNUMMER_DER_HAUSNUMMER = eINSTANCE.getMeldeanschriftType_TeilnummerDerHausnummer();

		/**
		 * The meta object literal for the '<em><b>Wohnort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MELDEANSCHRIFT_TYPE__WOHNORT = eINSTANCE.getMeldeanschriftType_Wohnort();

		/**
		 * The meta object literal for the '<em><b>Wohnort Frueherer Gemeindename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MELDEANSCHRIFT_TYPE__WOHNORT_FRUEHERER_GEMEINDENAME = eINSTANCE.getMeldeanschriftType_WohnortFruehererGemeindename();

		/**
		 * The meta object literal for the '<em><b>Wohnungsinhaber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MELDEANSCHRIFT_TYPE__WOHNUNGSINHABER = eINSTANCE.getMeldeanschriftType_Wohnungsinhaber();

		/**
		 * The meta object literal for the '<em><b>Zusatzangaben</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MELDEANSCHRIFT_TYPE__ZUSATZANGABEN = eINSTANCE.getMeldeanschriftType_Zusatzangaben();

		/**
		 * The meta object literal for the '<em><b>Regionalschluessel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MELDEANSCHRIFT_TYPE__REGIONALSCHLUESSEL = eINSTANCE.getMeldeanschriftType_Regionalschluessel();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtenkopfTypeImpl <em>Nachrichtenkopf Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtenkopfTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNachrichtenkopfType()
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
		 * The meta object literal for the '<em><b>Postkorb Handle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHRICHTENKOPF_TYPE__POSTKORB_HANDLE = eINSTANCE.getNachrichtenkopfType_PostkorbHandle();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtTypeImpl <em>Nachricht Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.NachrichtTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNachrichtType()
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
		 * The meta object literal for the '<em><b>Zusatzparametergruppe</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHRICHT_TYPE__ZUSATZPARAMETERGRUPPE = eINSTANCE.getNachrichtType_Zusatzparametergruppe();

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
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachweisbezugTypeImpl <em>Nachweisbezug Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.NachweisbezugTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNachweisbezugType()
		 * @generated
		 */
		EClass NACHWEISBEZUG_TYPE = eINSTANCE.getNachweisbezugType();

		/**
		 * The meta object literal for the '<em><b>Datenabruf Bezug</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NACHWEISBEZUG_TYPE__DATENABRUF_BEZUG = eINSTANCE.getNachweisbezugType_DatenabrufBezug();

		/**
		 * The meta object literal for the '<em><b>Datenabruf Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHWEISBEZUG_TYPE__DATENABRUF_ID = eINSTANCE.getNachweisbezugType_DatenabrufId();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NachweisdokumentTypeImpl <em>Nachweisdokument Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.NachweisdokumentTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNachweisdokumentType()
		 * @generated
		 */
		EClass NACHWEISDOKUMENT_TYPE = eINSTANCE.getNachweisdokumentType();

		/**
		 * The meta object literal for the '<em><b>Dokumentid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHWEISDOKUMENT_TYPE__DOKUMENTID = eINSTANCE.getNachweisdokumentType_Dokumentid();

		/**
		 * The meta object literal for the '<em><b>Dateiname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHWEISDOKUMENT_TYPE__DATEINAME = eINSTANCE.getNachweisdokumentType_Dateiname();

		/**
		 * The meta object literal for the '<em><b>Mimetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHWEISDOKUMENT_TYPE__MIMETYPE = eINSTANCE.getNachweisdokumentType_Mimetype();

		/**
		 * The meta object literal for the '<em><b>Kategorie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NACHWEISDOKUMENT_TYPE__KATEGORIE = eINSTANCE.getNachweisdokumentType_Kategorie();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NameNatuerlichePersonNachweisbezugTypeImpl <em>Name Natuerliche Person Nachweisbezug Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.NameNatuerlichePersonNachweisbezugTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNameNatuerlichePersonNachweisbezugType()
		 * @generated
		 */
		EClass NAME_NATUERLICHE_PERSON_NACHWEISBEZUG_TYPE = eINSTANCE.getNameNatuerlichePersonNachweisbezugType();

		/**
		 * The meta object literal for the '<em><b>Nachweisbezug</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_NATUERLICHE_PERSON_NACHWEISBEZUG_TYPE__NACHWEISBEZUG = eINSTANCE.getNameNatuerlichePersonNachweisbezugType_Nachweisbezug();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NameNatuerlichePersonOhneGeburtsnameTypeImpl <em>Name Natuerliche Person Ohne Geburtsname Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.NameNatuerlichePersonOhneGeburtsnameTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNameNatuerlichePersonOhneGeburtsnameType()
		 * @generated
		 */
		EClass NAME_NATUERLICHE_PERSON_OHNE_GEBURTSNAME_TYPE = eINSTANCE.getNameNatuerlichePersonOhneGeburtsnameType();

		/**
		 * The meta object literal for the '<em><b>Familienname Unstrukturiert</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_NATUERLICHE_PERSON_OHNE_GEBURTSNAME_TYPE__FAMILIENNAME_UNSTRUKTURIERT = eINSTANCE.getNameNatuerlichePersonOhneGeburtsnameType_FamiliennameUnstrukturiert();

		/**
		 * The meta object literal for the '<em><b>Vornamen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_NATUERLICHE_PERSON_OHNE_GEBURTSNAME_TYPE__VORNAMEN = eINSTANCE.getNameNatuerlichePersonOhneGeburtsnameType_Vornamen();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NameNatuerlichePersonTypeImpl <em>Name Natuerliche Person Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.NameNatuerlichePersonTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNameNatuerlichePersonType()
		 * @generated
		 */
		EClass NAME_NATUERLICHE_PERSON_TYPE = eINSTANCE.getNameNatuerlichePersonType();

		/**
		 * The meta object literal for the '<em><b>Familienname Unstrukturiert</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_NATUERLICHE_PERSON_TYPE__FAMILIENNAME_UNSTRUKTURIERT = eINSTANCE.getNameNatuerlichePersonType_FamiliennameUnstrukturiert();

		/**
		 * The meta object literal for the '<em><b>Geburtsname Unstrukturiert</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_NATUERLICHE_PERSON_TYPE__GEBURTSNAME_UNSTRUKTURIERT = eINSTANCE.getNameNatuerlichePersonType_GeburtsnameUnstrukturiert();

		/**
		 * The meta object literal for the '<em><b>Vornamen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_NATUERLICHE_PERSON_TYPE__VORNAMEN = eINSTANCE.getNameNatuerlichePersonType_Vornamen();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NameNatuerlichePersonVornameVerpflichtendTypeImpl <em>Name Natuerliche Person Vorname Verpflichtend Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.NameNatuerlichePersonVornameVerpflichtendTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNameNatuerlichePersonVornameVerpflichtendType()
		 * @generated
		 */
		EClass NAME_NATUERLICHE_PERSON_VORNAME_VERPFLICHTEND_TYPE = eINSTANCE.getNameNatuerlichePersonVornameVerpflichtendType();

		/**
		 * The meta object literal for the '<em><b>Familienname Unstrukturiert</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_NATUERLICHE_PERSON_VORNAME_VERPFLICHTEND_TYPE__FAMILIENNAME_UNSTRUKTURIERT = eINSTANCE.getNameNatuerlichePersonVornameVerpflichtendType_FamiliennameUnstrukturiert();

		/**
		 * The meta object literal for the '<em><b>Geburtsname Unstrukturiert</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_NATUERLICHE_PERSON_VORNAME_VERPFLICHTEND_TYPE__GEBURTSNAME_UNSTRUKTURIERT = eINSTANCE.getNameNatuerlichePersonVornameVerpflichtendType_GeburtsnameUnstrukturiert();

		/**
		 * The meta object literal for the '<em><b>Vornamen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_NATUERLICHE_PERSON_VORNAME_VERPFLICHTEND_TYPE__VORNAMEN = eINSTANCE.getNameNatuerlichePersonVornameVerpflichtendType_Vornamen();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.NutzerkontoTypeImpl <em>Nutzerkonto Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.NutzerkontoTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNutzerkontoType()
		 * @generated
		 */
		EClass NUTZERKONTO_TYPE = eINSTANCE.getNutzerkontoType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUTZERKONTO_TYPE__NAME = eINSTANCE.getNutzerkontoType_Name();

		/**
		 * The meta object literal for the '<em><b>Vertrauensniveau</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUTZERKONTO_TYPE__VERTRAUENSNIVEAU = eINSTANCE.getNutzerkontoType_Vertrauensniveau();

		/**
		 * The meta object literal for the '<em><b>Nachweis Nutzerkonto</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUTZERKONTO_TYPE__NACHWEIS_NUTZERKONTO = eINSTANCE.getNutzerkontoType_NachweisNutzerkonto();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftBasisTypeImpl <em>Postalische Inlandsanschrift Basis Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftBasisTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getPostalischeInlandsanschriftBasisType()
		 * @generated
		 */
		EClass POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE = eINSTANCE.getPostalischeInlandsanschriftBasisType();

		/**
		 * The meta object literal for the '<em><b>Hausnummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__HAUSNUMMER = eINSTANCE.getPostalischeInlandsanschriftBasisType_Hausnummer();

		/**
		 * The meta object literal for the '<em><b>Hausnummer Buchstabe Zusatzziffer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER = eINSTANCE.getPostalischeInlandsanschriftBasisType_HausnummerBuchstabeZusatzziffer();

		/**
		 * The meta object literal for the '<em><b>Postleitzahl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__POSTLEITZAHL = eINSTANCE.getPostalischeInlandsanschriftBasisType_Postleitzahl();

		/**
		 * The meta object literal for the '<em><b>Stockwerkswohnungsnummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__STOCKWERKSWOHNUNGSNUMMER = eINSTANCE.getPostalischeInlandsanschriftBasisType_Stockwerkswohnungsnummer();

		/**
		 * The meta object literal for the '<em><b>Strasse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__STRASSE = eINSTANCE.getPostalischeInlandsanschriftBasisType_Strasse();

		/**
		 * The meta object literal for the '<em><b>Teilnummer Der Hausnummer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__TEILNUMMER_DER_HAUSNUMMER = eINSTANCE.getPostalischeInlandsanschriftBasisType_TeilnummerDerHausnummer();

		/**
		 * The meta object literal for the '<em><b>Wohnort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNORT = eINSTANCE.getPostalischeInlandsanschriftBasisType_Wohnort();

		/**
		 * The meta object literal for the '<em><b>Wohnort Frueherer Gemeindename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNORT_FRUEHERER_GEMEINDENAME = eINSTANCE.getPostalischeInlandsanschriftBasisType_WohnortFruehererGemeindename();

		/**
		 * The meta object literal for the '<em><b>Wohnungsinhaber</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__WOHNUNGSINHABER = eINSTANCE.getPostalischeInlandsanschriftBasisType_Wohnungsinhaber();

		/**
		 * The meta object literal for the '<em><b>Zusatzangaben</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTALISCHE_INLANDSANSCHRIFT_BASIS_TYPE__ZUSATZANGABEN = eINSTANCE.getPostalischeInlandsanschriftBasisType_Zusatzangaben();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugTypeImpl <em>Postalische Inlandsanschrift Gebaeudeanschrift Nachweisbezug Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftGebaeudeanschriftNachweisbezugTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getPostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType()
		 * @generated
		 */
		EClass POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_NACHWEISBEZUG_TYPE = eINSTANCE.getPostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType();

		/**
		 * The meta object literal for the '<em><b>Nachweisbezug</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_NACHWEISBEZUG_TYPE__NACHWEISBEZUG = eINSTANCE.getPostalischeInlandsanschriftGebaeudeanschriftNachweisbezugType_Nachweisbezug();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftGebaeudeanschriftTypeImpl <em>Postalische Inlandsanschrift Gebaeudeanschrift Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftGebaeudeanschriftTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getPostalischeInlandsanschriftGebaeudeanschriftType()
		 * @generated
		 */
		EClass POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE = eINSTANCE.getPostalischeInlandsanschriftGebaeudeanschriftType();

		/**
		 * The meta object literal for the '<em><b>Hausnummern Bis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTALISCHE_INLANDSANSCHRIFT_GEBAEUDEANSCHRIFT_TYPE__HAUSNUMMERN_BIS = eINSTANCE.getPostalischeInlandsanschriftGebaeudeanschriftType_HausnummernBis();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftPostfachanschriftTypeImpl <em>Postalische Inlandsanschrift Postfachanschrift Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftPostfachanschriftTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getPostalischeInlandsanschriftPostfachanschriftType()
		 * @generated
		 */
		EClass POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE = eINSTANCE.getPostalischeInlandsanschriftPostfachanschriftType();

		/**
		 * The meta object literal for the '<em><b>Postfach</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__POSTFACH = eINSTANCE.getPostalischeInlandsanschriftPostfachanschriftType_Postfach();

		/**
		 * The meta object literal for the '<em><b>Wohnort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__WOHNORT = eINSTANCE.getPostalischeInlandsanschriftPostfachanschriftType_Wohnort();

		/**
		 * The meta object literal for the '<em><b>Postleitzahl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__POSTLEITZAHL = eINSTANCE.getPostalischeInlandsanschriftPostfachanschriftType_Postleitzahl();

		/**
		 * The meta object literal for the '<em><b>Zusatzangaben</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTALISCHE_INLANDSANSCHRIFT_POSTFACHANSCHRIFT_TYPE__ZUSATZANGABEN = eINSTANCE.getPostalischeInlandsanschriftPostfachanschriftType_Zusatzangaben();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftTypeImpl <em>Postalische Inlandsanschrift Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.PostalischeInlandsanschriftTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getPostalischeInlandsanschriftType()
		 * @generated
		 */
		EClass POSTALISCHE_INLANDSANSCHRIFT_TYPE = eINSTANCE.getPostalischeInlandsanschriftType();

		/**
		 * The meta object literal for the '<em><b>Postfach</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTALISCHE_INLANDSANSCHRIFT_TYPE__POSTFACH = eINSTANCE.getPostalischeInlandsanschriftType_Postfach();

		/**
		 * The meta object literal for the '<em><b>Gebaeude</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSTALISCHE_INLANDSANSCHRIFT_TYPE__GEBAEUDE = eINSTANCE.getPostalischeInlandsanschriftType_Gebaeude();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.PostkorbHandleTypeImpl <em>Postkorb Handle Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.PostkorbHandleTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getPostkorbHandleType()
		 * @generated
		 */
		EClass POSTKORB_HANDLE_TYPE = eINSTANCE.getPostkorbHandleType();

		/**
		 * The meta object literal for the '<em><b>Postkorb Handle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTKORB_HANDLE_TYPE__POSTKORB_HANDLE = eINSTANCE.getPostkorbHandleType_PostkorbHandle();

		/**
		 * The meta object literal for the '<em><b>Zustimmung Elektronischer Bescheid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSTKORB_HANDLE_TYPE__ZUSTIMMUNG_ELEKTRONISCHER_BESCHEID = eINSTANCE.getPostkorbHandleType_ZustimmungElektronischerBescheid();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.StaatsangehoerigkeitenNachweisbezugTypeImpl <em>Staatsangehoerigkeiten Nachweisbezug Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.StaatsangehoerigkeitenNachweisbezugTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getStaatsangehoerigkeitenNachweisbezugType()
		 * @generated
		 */
		EClass STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE = eINSTANCE.getStaatsangehoerigkeitenNachweisbezugType();

		/**
		 * The meta object literal for the '<em><b>Staatsangehoerigkeit</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE__STAATSANGEHOERIGKEIT = eINSTANCE.getStaatsangehoerigkeitenNachweisbezugType_Staatsangehoerigkeit();

		/**
		 * The meta object literal for the '<em><b>Nachweisbezug</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAATSANGEHOERIGKEITEN_NACHWEISBEZUG_TYPE__NACHWEISBEZUG = eINSTANCE.getStaatsangehoerigkeitenNachweisbezugType_Nachweisbezug();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.StatusDatenabrufTypeImpl <em>Status Datenabruf Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.StatusDatenabrufTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getStatusDatenabrufType()
		 * @generated
		 */
		EClass STATUS_DATENABRUF_TYPE = eINSTANCE.getStatusDatenabrufType();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATUS_DATENABRUF_TYPE__STATUS = eINSTANCE.getStatusDatenabrufType_Status();

		/**
		 * The meta object literal for the '<em><b>Hinweis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS_DATENABRUF_TYPE__HINWEIS = eINSTANCE.getStatusDatenabrufType_Hinweis();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.TatsacheMitFreitextTypeImpl <em>Tatsache Mit Freitext Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.TatsacheMitFreitextTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getTatsacheMitFreitextType()
		 * @generated
		 */
		EClass TATSACHE_MIT_FREITEXT_TYPE = eINSTANCE.getTatsacheMitFreitextType();

		/**
		 * The meta object literal for the '<em><b>Liegt Vor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TATSACHE_MIT_FREITEXT_TYPE__LIEGT_VOR = eINSTANCE.getTatsacheMitFreitextType_LiegtVor();

		/**
		 * The meta object literal for the '<em><b>Freitext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TATSACHE_MIT_FREITEXT_TYPE__FREITEXT = eINSTANCE.getTatsacheMitFreitextType_Freitext();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.TatsacheMitNachweisTypeImpl <em>Tatsache Mit Nachweis Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.TatsacheMitNachweisTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getTatsacheMitNachweisType()
		 * @generated
		 */
		EClass TATSACHE_MIT_NACHWEIS_TYPE = eINSTANCE.getTatsacheMitNachweisType();

		/**
		 * The meta object literal for the '<em><b>Liegt Vor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TATSACHE_MIT_NACHWEIS_TYPE__LIEGT_VOR = eINSTANCE.getTatsacheMitNachweisType_LiegtVor();

		/**
		 * The meta object literal for the '<em><b>Nachweis</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TATSACHE_MIT_NACHWEIS_TYPE__NACHWEIS = eINSTANCE.getTatsacheMitNachweisType_Nachweis();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.TatsacheMitZeitraumTypeImpl <em>Tatsache Mit Zeitraum Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.TatsacheMitZeitraumTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getTatsacheMitZeitraumType()
		 * @generated
		 */
		EClass TATSACHE_MIT_ZEITRAUM_TYPE = eINSTANCE.getTatsacheMitZeitraumType();

		/**
		 * The meta object literal for the '<em><b>Liegt Vor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TATSACHE_MIT_ZEITRAUM_TYPE__LIEGT_VOR = eINSTANCE.getTatsacheMitZeitraumType_LiegtVor();

		/**
		 * The meta object literal for the '<em><b>Zeitraum</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TATSACHE_MIT_ZEITRAUM_TYPE__ZEITRAUM = eINSTANCE.getTatsacheMitZeitraumType_Zeitraum();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.TeilbekanntesDatumTypeImpl <em>Teilbekanntes Datum Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.TeilbekanntesDatumTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getTeilbekanntesDatumType()
		 * @generated
		 */
		EClass TEILBEKANNTES_DATUM_TYPE = eINSTANCE.getTeilbekanntesDatumType();

		/**
		 * The meta object literal for the '<em><b>Jahr Monat Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEILBEKANNTES_DATUM_TYPE__JAHR_MONAT_TAG = eINSTANCE.getTeilbekanntesDatumType_JahrMonatTag();

		/**
		 * The meta object literal for the '<em><b>Jahr Monat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEILBEKANNTES_DATUM_TYPE__JAHR_MONAT = eINSTANCE.getTeilbekanntesDatumType_JahrMonat();

		/**
		 * The meta object literal for the '<em><b>Jahr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEILBEKANNTES_DATUM_TYPE__JAHR = eINSTANCE.getTeilbekanntesDatumType_Jahr();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.TerminwunschTypeImpl <em>Terminwunsch Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.TerminwunschTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getTerminwunschType()
		 * @generated
		 */
		EClass TERMINWUNSCH_TYPE = eINSTANCE.getTerminwunschType();

		/**
		 * The meta object literal for the '<em><b>Wochentag</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINWUNSCH_TYPE__WOCHENTAG = eINSTANCE.getTerminwunschType_Wochentag();

		/**
		 * The meta object literal for the '<em><b>Uhrzeit</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINWUNSCH_TYPE__UHRZEIT = eINSTANCE.getTerminwunschType_Uhrzeit();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.ZeitraumTypeImpl <em>Zeitraum Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.ZeitraumTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getZeitraumType()
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
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.ZusatzparametergruppeTypeImpl <em>Zusatzparametergruppe Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.ZusatzparametergruppeTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getZusatzparametergruppeType()
		 * @generated
		 */
		EClass ZUSATZPARAMETERGRUPPE_TYPE = eINSTANCE.getZusatzparametergruppeType();

		/**
		 * The meta object literal for the '<em><b>Feld</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUSATZPARAMETERGRUPPE_TYPE__FELD = eINSTANCE.getZusatzparametergruppeType_Feld();

		/**
		 * The meta object literal for the '<em><b>Feldgruppe</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUSATZPARAMETERGRUPPE_TYPE__FELDGRUPPE = eINSTANCE.getZusatzparametergruppeType_Feldgruppe();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZUSATZPARAMETERGRUPPE_TYPE__NAME = eINSTANCE.getZusatzparametergruppeType_Name();

		/**
		 * The meta object literal for the '<em><b>Fassung Handlungsanweisung</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZUSATZPARAMETERGRUPPE_TYPE__FASSUNG_HANDLUNGSANWEISUNG = eINSTANCE.getZusatzparametergruppeType_FassungHandlungsanweisung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.impl.ZustimmungAbrufOderWeitergabeTypeImpl <em>Zustimmung Abruf Oder Weitergabe Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.ZustimmungAbrufOderWeitergabeTypeImpl
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getZustimmungAbrufOderWeitergabeType()
		 * @generated
		 */
		EClass ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE = eINSTANCE.getZustimmungAbrufOderWeitergabeType();

		/**
		 * The meta object literal for the '<em><b>Art Des Abrufs Oder Weitergabe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__ART_DES_ABRUFS_ODER_WEITERGABE = eINSTANCE.getZustimmungAbrufOderWeitergabeType_ArtDesAbrufsOderWeitergabe();

		/**
		 * The meta object literal for the '<em><b>Zustimmung Abruf Oder Weitergabe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__ZUSTIMMUNG_ABRUF_ODER_WEITERGABE = eINSTANCE.getZustimmungAbrufOderWeitergabeType_ZustimmungAbrufOderWeitergabe();

		/**
		 * The meta object literal for the '<em><b>Inhalte Des Abrufs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZUSTIMMUNG_ABRUF_ODER_WEITERGABE_TYPE__INHALTE_DES_ABRUFS = eINSTANCE.getZustimmungAbrufOderWeitergabeType_InhalteDesAbrufs();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Anrede <em>Anrede</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Anrede
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getAnrede()
		 * @generated
		 */
		EEnum ANREDE = eINSTANCE.getAnrede();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Artabruf <em>Artabruf</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Artabruf
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getArtabruf()
		 * @generated
		 */
		EEnum ARTABRUF = eINSTANCE.getArtabruf();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Artnachweis <em>Artnachweis</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Artnachweis
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getArtnachweis()
		 * @generated
		 */
		EEnum ARTNACHWEIS = eINSTANCE.getArtnachweis();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Aufenthaltsstatus <em>Aufenthaltsstatus</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Aufenthaltsstatus
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getAufenthaltsstatus()
		 * @generated
		 */
		EEnum AUFENTHALTSSTATUS = eINSTANCE.getAufenthaltsstatus();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Eigenschaft <em>Eigenschaft</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Eigenschaft
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getEigenschaft()
		 * @generated
		 */
		EEnum EIGENSCHAFT = eINSTANCE.getEigenschaft();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Einkommensarten <em>Einkommensarten</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Einkommensarten
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getEinkommensarten()
		 * @generated
		 */
		EEnum EINKOMMENSARTEN = eINSTANCE.getEinkommensarten();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Familienstand <em>Familienstand</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Familienstand
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getFamilienstand()
		 * @generated
		 */
		EEnum FAMILIENSTAND = eINSTANCE.getFamilienstand();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Geschlecht <em>Geschlecht</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Geschlecht
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getGeschlecht()
		 * @generated
		 */
		EEnum GESCHLECHT = eINSTANCE.getGeschlecht();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Kindschaftsbeziehung <em>Kindschaftsbeziehung</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Kindschaftsbeziehung
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getKindschaftsbeziehung()
		 * @generated
		 */
		EEnum KINDSCHAFTSBEZIEHUNG = eINSTANCE.getKindschaftsbeziehung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Kindwohnhaftbei <em>Kindwohnhaftbei</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Kindwohnhaftbei
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getKindwohnhaftbei()
		 * @generated
		 */
		EEnum KINDWOHNHAFTBEI = eINSTANCE.getKindwohnhaftbei();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Leistungserhalt <em>Leistungserhalt</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Leistungserhalt
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getLeistungserhalt()
		 * @generated
		 */
		EEnum LEISTUNGSERHALT = eINSTANCE.getLeistungserhalt();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Leistungsgewaehrung <em>Leistungsgewaehrung</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Leistungsgewaehrung
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getLeistungsgewaehrung()
		 * @generated
		 */
		EEnum LEISTUNGSGEWAEHRUNG = eINSTANCE.getLeistungsgewaehrung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Nachrichtentyp <em>Nachrichtentyp</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Nachrichtentyp
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNachrichtentyp()
		 * @generated
		 */
		EEnum NACHRICHTENTYP = eINSTANCE.getNachrichtentyp();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Nachweisbezug <em>Nachweisbezug</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Nachweisbezug
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNachweisbezug()
		 * @generated
		 */
		EEnum NACHWEISBEZUG = eINSTANCE.getNachweisbezug();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Personensorgerecht <em>Personensorgerecht</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Personensorgerecht
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getPersonensorgerecht()
		 * @generated
		 */
		EEnum PERSONENSORGERECHT = eINSTANCE.getPersonensorgerecht();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Sonderstatus <em>Sonderstatus</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Sonderstatus
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getSonderstatus()
		 * @generated
		 */
		EEnum SONDERSTATUS = eINSTANCE.getSonderstatus();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Sonstigeleistungen <em>Sonstigeleistungen</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Sonstigeleistungen
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getSonstigeleistungen()
		 * @generated
		 */
		EEnum SONSTIGELEISTUNGEN = eINSTANCE.getSonstigeleistungen();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Statusdatenabruf <em>Statusdatenabruf</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Statusdatenabruf
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getStatusdatenabruf()
		 * @generated
		 */
		EEnum STATUSDATENABRUF = eINSTANCE.getStatusdatenabruf();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Tatsachenbehauptung <em>Tatsachenbehauptung</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Tatsachenbehauptung
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getTatsachenbehauptung()
		 * @generated
		 */
		EEnum TATSACHENBEHAUPTUNG = eINSTANCE.getTatsachenbehauptung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Vertrauensniveau <em>Vertrauensniveau</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Vertrauensniveau
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getVertrauensniveau()
		 * @generated
		 */
		EEnum VERTRAUENSNIVEAU = eINSTANCE.getVertrauensniveau();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Vertretung <em>Vertretung</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Vertretung
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getVertretung()
		 * @generated
		 */
		EEnum VERTRETUNG = eINSTANCE.getVertretung();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Wohnsitz <em>Wohnsitz</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Wohnsitz
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getWohnsitz()
		 * @generated
		 */
		EEnum WOHNSITZ = eINSTANCE.getWohnsitz();

		/**
		 * The meta object literal for the '{@link de.xoev.xfamilie.baukasten._1.baukasten.Zuschuesse <em>Zuschuesse</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Zuschuesse
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getZuschuesse()
		 * @generated
		 */
		EEnum ZUSCHUESSE = eINSTANCE.getZuschuesse();

		/**
		 * The meta object literal for the '<em>Anrede Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Anrede
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getAnredeObject()
		 * @generated
		 */
		EDataType ANREDE_OBJECT = eINSTANCE.getAnredeObject();

		/**
		 * The meta object literal for the '<em>Artabruf Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Artabruf
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getArtabrufObject()
		 * @generated
		 */
		EDataType ARTABRUF_OBJECT = eINSTANCE.getArtabrufObject();

		/**
		 * The meta object literal for the '<em>Artnachweis Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Artnachweis
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getArtnachweisObject()
		 * @generated
		 */
		EDataType ARTNACHWEIS_OBJECT = eINSTANCE.getArtnachweisObject();

		/**
		 * The meta object literal for the '<em>Aufenthaltsstatus Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Aufenthaltsstatus
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getAufenthaltsstatusObject()
		 * @generated
		 */
		EDataType AUFENTHALTSSTATUS_OBJECT = eINSTANCE.getAufenthaltsstatusObject();

		/**
		 * The meta object literal for the '<em>Eigenschaft Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Eigenschaft
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getEigenschaftObject()
		 * @generated
		 */
		EDataType EIGENSCHAFT_OBJECT = eINSTANCE.getEigenschaftObject();

		/**
		 * The meta object literal for the '<em>Einkommensarten Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Einkommensarten
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getEinkommensartenObject()
		 * @generated
		 */
		EDataType EINKOMMENSARTEN_OBJECT = eINSTANCE.getEinkommensartenObject();

		/**
		 * The meta object literal for the '<em>Familienstand Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Familienstand
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getFamilienstandObject()
		 * @generated
		 */
		EDataType FAMILIENSTAND_OBJECT = eINSTANCE.getFamilienstandObject();

		/**
		 * The meta object literal for the '<em>Geschlecht Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Geschlecht
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getGeschlechtObject()
		 * @generated
		 */
		EDataType GESCHLECHT_OBJECT = eINSTANCE.getGeschlechtObject();

		/**
		 * The meta object literal for the '<em>Jahr Monat Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getJahrMonatType()
		 * @generated
		 */
		EDataType JAHR_MONAT_TYPE = eINSTANCE.getJahrMonatType();

		/**
		 * The meta object literal for the '<em>Jahr Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getJahrType()
		 * @generated
		 */
		EDataType JAHR_TYPE = eINSTANCE.getJahrType();

		/**
		 * The meta object literal for the '<em>Kindschaftsbeziehung Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Kindschaftsbeziehung
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getKindschaftsbeziehungObject()
		 * @generated
		 */
		EDataType KINDSCHAFTSBEZIEHUNG_OBJECT = eINSTANCE.getKindschaftsbeziehungObject();

		/**
		 * The meta object literal for the '<em>Kindwohnhaftbei Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Kindwohnhaftbei
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getKindwohnhaftbeiObject()
		 * @generated
		 */
		EDataType KINDWOHNHAFTBEI_OBJECT = eINSTANCE.getKindwohnhaftbeiObject();

		/**
		 * The meta object literal for the '<em>Krankenversichertennummer Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getKrankenversichertennummerType()
		 * @generated
		 */
		EDataType KRANKENVERSICHERTENNUMMER_TYPE = eINSTANCE.getKrankenversichertennummerType();

		/**
		 * The meta object literal for the '<em>Leistungserhalt Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Leistungserhalt
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getLeistungserhaltObject()
		 * @generated
		 */
		EDataType LEISTUNGSERHALT_OBJECT = eINSTANCE.getLeistungserhaltObject();

		/**
		 * The meta object literal for the '<em>Leistungsgewaehrung Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Leistungsgewaehrung
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getLeistungsgewaehrungObject()
		 * @generated
		 */
		EDataType LEISTUNGSGEWAEHRUNG_OBJECT = eINSTANCE.getLeistungsgewaehrungObject();

		/**
		 * The meta object literal for the '<em>Meldeanschrift Hausnummer Buchstabe Zusatzziffer Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getMeldeanschriftHausnummerBuchstabeZusatzzifferType()
		 * @generated
		 */
		EDataType MELDEANSCHRIFT_HAUSNUMMER_BUCHSTABE_ZUSATZZIFFER_TYPE = eINSTANCE.getMeldeanschriftHausnummerBuchstabeZusatzzifferType();

		/**
		 * The meta object literal for the '<em>Meldeanschrift Hausnummer Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getMeldeanschriftHausnummerType()
		 * @generated
		 */
		EDataType MELDEANSCHRIFT_HAUSNUMMER_TYPE = eINSTANCE.getMeldeanschriftHausnummerType();

		/**
		 * The meta object literal for the '<em>Meldeanschrift Postleitzahl Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getMeldeanschriftPostleitzahlType()
		 * @generated
		 */
		EDataType MELDEANSCHRIFT_POSTLEITZAHL_TYPE = eINSTANCE.getMeldeanschriftPostleitzahlType();

		/**
		 * The meta object literal for the '<em>Meldeanschrift Stockwerkswohnungsnummer Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getMeldeanschriftStockwerkswohnungsnummerType()
		 * @generated
		 */
		EDataType MELDEANSCHRIFT_STOCKWERKSWOHNUNGSNUMMER_TYPE = eINSTANCE.getMeldeanschriftStockwerkswohnungsnummerType();

		/**
		 * The meta object literal for the '<em>Meldeanschrift Strasse Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getMeldeanschriftStrasseType()
		 * @generated
		 */
		EDataType MELDEANSCHRIFT_STRASSE_TYPE = eINSTANCE.getMeldeanschriftStrasseType();

		/**
		 * The meta object literal for the '<em>Meldeanschrift Teilnummer Der Hausnummer Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getMeldeanschriftTeilnummerDerHausnummerType()
		 * @generated
		 */
		EDataType MELDEANSCHRIFT_TEILNUMMER_DER_HAUSNUMMER_TYPE = eINSTANCE.getMeldeanschriftTeilnummerDerHausnummerType();

		/**
		 * The meta object literal for the '<em>Meldeanschrift Wohnort Frueherer Gemeindename Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getMeldeanschriftWohnortFruehererGemeindenameType()
		 * @generated
		 */
		EDataType MELDEANSCHRIFT_WOHNORT_FRUEHERER_GEMEINDENAME_TYPE = eINSTANCE.getMeldeanschriftWohnortFruehererGemeindenameType();

		/**
		 * The meta object literal for the '<em>Meldeanschrift Wohnort Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getMeldeanschriftWohnortType()
		 * @generated
		 */
		EDataType MELDEANSCHRIFT_WOHNORT_TYPE = eINSTANCE.getMeldeanschriftWohnortType();

		/**
		 * The meta object literal for the '<em>Meldeanschrift Wohnungsinhaber Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getMeldeanschriftWohnungsinhaberType()
		 * @generated
		 */
		EDataType MELDEANSCHRIFT_WOHNUNGSINHABER_TYPE = eINSTANCE.getMeldeanschriftWohnungsinhaberType();

		/**
		 * The meta object literal for the '<em>Meldeanschrift Zusatzangaben Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getMeldeanschriftZusatzangabenType()
		 * @generated
		 */
		EDataType MELDEANSCHRIFT_ZUSATZANGABEN_TYPE = eINSTANCE.getMeldeanschriftZusatzangabenType();

		/**
		 * The meta object literal for the '<em>Nachrichtentyp Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Nachrichtentyp
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNachrichtentypObject()
		 * @generated
		 */
		EDataType NACHRICHTENTYP_OBJECT = eINSTANCE.getNachrichtentypObject();

		/**
		 * The meta object literal for the '<em>Nachweisbezug Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Nachweisbezug
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getNachweisbezugObject()
		 * @generated
		 */
		EDataType NACHWEISBEZUG_OBJECT = eINSTANCE.getNachweisbezugObject();

		/**
		 * The meta object literal for the '<em>Personensorgerecht Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Personensorgerecht
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getPersonensorgerechtObject()
		 * @generated
		 */
		EDataType PERSONENSORGERECHT_OBJECT = eINSTANCE.getPersonensorgerechtObject();

		/**
		 * The meta object literal for the '<em>Sonderstatus Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Sonderstatus
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getSonderstatusObject()
		 * @generated
		 */
		EDataType SONDERSTATUS_OBJECT = eINSTANCE.getSonderstatusObject();

		/**
		 * The meta object literal for the '<em>Sonstigeleistungen Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Sonstigeleistungen
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getSonstigeleistungenObject()
		 * @generated
		 */
		EDataType SONSTIGELEISTUNGEN_OBJECT = eINSTANCE.getSonstigeleistungenObject();

		/**
		 * The meta object literal for the '<em>Statusdatenabruf Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Statusdatenabruf
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getStatusdatenabrufObject()
		 * @generated
		 */
		EDataType STATUSDATENABRUF_OBJECT = eINSTANCE.getStatusdatenabrufObject();

		/**
		 * The meta object literal for the '<em>Steuerliche Identifikationsnummer Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getSteuerlicheIdentifikationsnummerType()
		 * @generated
		 */
		EDataType STEUERLICHE_IDENTIFIKATIONSNUMMER_TYPE = eINSTANCE.getSteuerlicheIdentifikationsnummerType();

		/**
		 * The meta object literal for the '<em>Tagesdatum Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getTagesdatumType()
		 * @generated
		 */
		EDataType TAGESDATUM_TYPE = eINSTANCE.getTagesdatumType();

		/**
		 * The meta object literal for the '<em>Tatsachenbehauptung Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Tatsachenbehauptung
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getTatsachenbehauptungObject()
		 * @generated
		 */
		EDataType TATSACHENBEHAUPTUNG_OBJECT = eINSTANCE.getTatsachenbehauptungObject();

		/**
		 * The meta object literal for the '<em>UUID Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getUUIDType()
		 * @generated
		 */
		EDataType UUID_TYPE = eINSTANCE.getUUIDType();

		/**
		 * The meta object literal for the '<em>Vertrauensniveau Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Vertrauensniveau
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getVertrauensniveauObject()
		 * @generated
		 */
		EDataType VERTRAUENSNIVEAU_OBJECT = eINSTANCE.getVertrauensniveauObject();

		/**
		 * The meta object literal for the '<em>Vertretung Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Vertretung
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getVertretungObject()
		 * @generated
		 */
		EDataType VERTRETUNG_OBJECT = eINSTANCE.getVertretungObject();

		/**
		 * The meta object literal for the '<em>Wohnsitz Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Wohnsitz
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getWohnsitzObject()
		 * @generated
		 */
		EDataType WOHNSITZ_OBJECT = eINSTANCE.getWohnsitzObject();

		/**
		 * The meta object literal for the '<em>Zuschuesse Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.Zuschuesse
		 * @see de.xoev.xfamilie.baukasten._1.baukasten.impl.BaukastenPackageImpl#getZuschuesseObject()
		 * @generated
		 */
		EDataType ZUSCHUESSE_OBJECT = eINSTANCE.getZuschuesseObject();

	}

} //BaukastenPackage
